package io.github.dahuoyzs.runtime;


import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class DataBuffer {

    byte[] buffer;
    int byteLen;
    int offset;

    public DataBuffer(byte[] bytes) {
        this.buffer = bytes;
        this.byteLen = bytes.length;
        offset = 0;
        if (!isProtobuf(bytes)) {
            throw new IllegalArgumentException("not protobuf bytes");
        }
    }

    public static DataBuffer of(byte[] bytes) {
        return new DataBuffer(bytes);
    }

    /**
     * protobuf byte[]字段,
     */
    public List<PBField> toFieldList() {
        offset = 0;
        List<PBField> PBFieldList = new ArrayList<>();
        int fieldNumber = 0;
        while (this.offset < this.buffer.length) {
            int tag = this.readRawVarInt32();
            int fieldNumber_new = getFieldNumber(tag);
            if (fieldNumber_new < fieldNumber) {//乱序了，后面的序号不应该大于前面的序号
//                System.err.printf("fieldNumber:%s,fieldNumber_new:%s%n", fieldNumber, fieldNumber_new);
                throw new IllegalArgumentException("not protobuf bytes error fieldNumber sort");
            }
            int nextFieldNumber = fieldNumber + 1;
            if (nextFieldNumber != fieldNumber_new) {//警告
//                System.out.printf("fieldNumber:%s,跳过,下一个字段序号为:%s,%n", nextFieldNumber, fieldNumber_new);
            }
            fieldNumber = fieldNumber_new;
            if (fieldNumber < 1) {
//                System.err.printf("byteLen:%s,offset:%s,buffer:%s", byteLen, offset, Arrays.toString(buffer));
                throw new IllegalArgumentException("not protobuf bytes error fieldNumber:" + fieldNumber);
            }
            int wireTypeVal = getWireType(tag);
            if (wireTypeVal < 0 || wireTypeVal > 5) {
                throw new IllegalArgumentException("not protobuf bytes error wireTypeVal:" + wireTypeVal);
            }
            WireType wireType = WireType.valueOf(wireTypeVal);


            int length = 0;
            Object val = null;
            if (wireType == WireType.VINT) {
                val = readRawVarInt64();//按最大的读取
                length = val.toString().length();
            } else if (wireType == WireType.BIT64) {
                int readLen = WireType.BIT64.getLen();
                byte[] sub = sub(buffer, offset, offset + readLen);
                val = Double.longBitsToDouble(bytesToLong(sub, 0, ByteOrder.LITTLE_ENDIAN)); //从buffer中读读取固定8个字节 转为Number类型
                offset += readLen;
                length = readLen;
            } else if (wireType == WireType.OBJ_STR) {
                int readLen = readRawVarInt32();
                byte[] sub = sub(buffer, offset, offset + readLen);
                //这里不要转，里面具体是对象还是字符串，用的人自己清楚。
//                val = sub;
                //尝试转成字符串如果含有\，说明是嵌套对象，递归解析
                String tryStr = new String(sub);
                if (tryStr.contains("\b") || tryStr.contains("\0")) {
                    val = DataBuffer.of(sub).toFieldList();
                } else {
                    val = tryStr;
                }
                offset += readLen;
                length = readLen;
            } else if (wireType == WireType.START) {
                //不处理
            } else if (wireType == WireType.END) {
                //不处理
            } else if (wireType == WireType.BIT32) {
                //读取4个字节 转为整数
                int readLen = WireType.BIT32.getLen();
                byte[] sub = sub(buffer, offset, offset + readLen);
                val = Float.intBitsToFloat(bytesToInt(sub, 0, ByteOrder.LITTLE_ENDIAN));
                offset += readLen;
                length = readLen;
            }
            PBField PBField = new PBField();
            PBField.setFieldNumber(fieldNumber);
            PBField.setWireType(wireType.getType());
            PBField.setLength(length);
            PBField.setVal(val);
            PBFieldList.add(PBField);
        }
        return PBFieldList;
    }

    /**
     * 转为为map
     *
     * @return TreeMap map
     */
    public TreeMap<String, Object> toMap() {
        TreeMap<String, Object> objMap = new TreeMap<>();
        for (PBField pbField : toFieldList()) {
            handlerField(objMap, pbField);
        }
        return objMap;
    }

    /**
     * 转化为目标对象
     *
     * @param clazz 目标对象
     * @return T 目标对象
     */
    public <T> T toObject(Class<T> clazz) {
        try {
            Constructor<T> constructor = clazz.getConstructor();
            T obj = constructor.newInstance();
            for (PBField pbField : toFieldList()) {
                handlerField(obj, pbField);
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            //忽略
            return null;
        }
    }


    /**
     * 给我一个字节数组,尝试判断是否为有效的protobuf数据
     *
     * @param bytes proto字节数组
     * @return boolean 是否为protobuf数据
     */
    public static boolean isProtobuf(byte[] bytes) {
        try {
            DataBuffer dataBuffer = DataBuffer.of(bytes);
            List<PBField> fieldList = dataBuffer.toFieldList();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    //处理protobuf字段 往map中设置
    private static void handlerField(TreeMap<String, Object> objMap, PBField pbField) {
        WireType wireType = WireType.valueOf(pbField.getWireType());
        if (wireType == WireType.OBJ_STR && pbField.getVal() instanceof List) {
            List array = (List) pbField.getVal();
            TreeMap<String, Object> innerObjMap = new TreeMap<>();
            for (Object object : array) {
                if (object instanceof PBField) {
                    PBField field = (PBField) object;
                    handlerField(innerObjMap, field);
                }
            }
            String key = String.format("%02d_%s", pbField.getFieldNumber(), wireType.getName());
            objMap.put(key, innerObjMap);
        } else {
            String key = String.format("%02d_%s", pbField.getFieldNumber(), wireType.getName());
            objMap.put(key, pbField.getVal());
        }
    }

    //处理protobuf字段 往类中设置
    private static <T> void handlerField(T object, PBField pbField) {
        try {
            Field objField = object.getClass().getDeclaredFields()[(int) pbField.getFieldNumber() - 1];
            objField.setAccessible(true);
            WireType wireType = WireType.valueOf(pbField.getWireType());
            if (wireType == WireType.OBJ_STR && pbField.getVal() instanceof List && !objField.getClass().isPrimitive()) {
                List array = (List) pbField.getVal();
                Object innerObj = objField.getType().getConstructor().newInstance();
                for (Object obj : array) {
                    if (obj instanceof PBField) {
                        PBField field = (PBField) obj;
                        handlerField(innerObj, field);
                    }
                }
                objField.set(object, innerObj);
            } else {
                Class<?> type = objField.getType();
                if (boolean.class.equals(type) || Boolean.class.equals(type)) {
                    objField.set(object, "1".equals(pbField.getVal().toString()));
                } else if (byte.class.equals(type) || Byte.class.equals(type)) {
                    objField.set(object, Byte.parseByte(pbField.getVal().toString()));
                } else if (char.class.equals(type) || Character.class.equals(type)) {
                    objField.set(object, pbField.getVal().toString().charAt(0));
                } else if (short.class.equals(type) || Short.class.equals(type)) {
                    objField.set(object, Short.parseShort(pbField.getVal().toString()));
                } else if (int.class.equals(type) || Integer.class.equals(type)) {
                    objField.set(object, Integer.parseInt(pbField.getVal().toString()));
                } else if (long.class.equals(type) || Long.class.equals(type)) {
                    objField.set(object, Long.parseLong(pbField.getVal().toString()));
                } else if (float.class.equals(type) || Float.class.equals(type)) {
                    objField.set(object, Float.parseFloat(pbField.getVal().toString()));
                } else if (double.class.equals(type) || Double.class.equals(type)) {
                    objField.set(object, Double.parseDouble(pbField.getVal().toString()));
                } else if (String.class.equals(type)) {
                    objField.set(object, pbField.getVal().toString());
                } else if (type.isEnum()) {
                    objField.set(object, Enum.valueOf((Class<Enum>) type, pbField.getVal().toString()));
                } else if (type.isArray()) {
                    objField.set(object, pbField.getVal());
                } else {
                    if (List.class.isAssignableFrom(type)) {
                        List list = (List) objField.get(object);
                        Type genericType = objField.getGenericType();
                        if (genericType instanceof ParameterizedType) {// 如果是泛型参数的类型
                            ParameterizedType pt = (ParameterizedType) genericType;
                            Type actualTypeArgument = pt.getActualTypeArguments()[0];//得到泛型里的class类型对象
                            String typeName = actualTypeArgument.getTypeName().replace("$", ".");
                            Class<?> listTypeClass = Class.forName(typeName);
                            if (boolean.class.equals(listTypeClass) || Boolean.class.equals(listTypeClass)) {
                                boolean equals = "1".equals(pbField.getVal().toString());
                                list.add(equals);
                            } else if (byte.class.equals(listTypeClass) || Byte.class.equals(listTypeClass)) {
                                list.add(Byte.parseByte(pbField.getVal().toString()));
                            } else if (char.class.equals(listTypeClass) || Character.class.equals(listTypeClass)) {
                                list.add(pbField.getVal().toString().charAt(0));
                            } else if (short.class.equals(listTypeClass) || Short.class.equals(listTypeClass)) {
                                list.add(Short.parseShort(pbField.getVal().toString()));
                            } else if (int.class.equals(listTypeClass) || Integer.class.equals(listTypeClass)) {
                                list.add(Integer.parseInt(pbField.getVal().toString()));
                            } else if (long.class.equals(listTypeClass) || Long.class.equals(listTypeClass)) {
                                list.add(Long.parseLong(pbField.getVal().toString()));
                            } else if (float.class.equals(listTypeClass) || Float.class.equals(listTypeClass)) {
                                list.add(Float.parseFloat(pbField.getVal().toString()));
                            } else if (double.class.equals(listTypeClass) || Double.class.equals(listTypeClass)) {
                                list.add(Double.parseDouble(pbField.getVal().toString()));
                            } else if (String.class.equals(listTypeClass)) {
                                list.add(pbField.getVal().toString());
                            }
                        }
                        objField.set(object, list);
                    } else {
                        objField.set(object, pbField.getVal());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    private static boolean debug = false;

    private static void printArr(int fieldNumber, WireType wireType, byte[] sub) {
        if (debug) {
            String str = String.format("%s|%s|%s", fieldNumber, wireType.getName(), Arrays.toString(sub));
            System.out.println(str);
        }
    }

    private int getFieldNumber(int tag) {
        return tag >>> 3;
    }

    private int getWireType(int tag) {
        return tag & 0x07;
    }


    //VarInt读4位
    private int readRawVarInt32() {
        byte tmp = buffer[offset++];
        if (tmp >= 0) {
            return tmp;
        } else {
            int result = tmp & 127;
            if ((tmp = buffer[offset++]) >= 0) {
                result |= tmp << 7;
            } else {
                result |= (tmp & 127) << 7;
                if ((tmp = buffer[offset++]) >= 0) {
                    result |= tmp << 14;
                } else {
                    result |= (tmp & 127) << 14;
                    if ((tmp = buffer[offset++]) >= 0) {
                        result |= tmp << 21;
                    } else {
                        result |= (tmp & 127) << 21;
                        result |= (tmp = buffer[offset++]) << 28;
                        if (tmp < 0) {
                            for (int i = 0; i < 5; ++i) {
                                if (buffer[offset++] >= 0) {
                                    return result;
                                }
                            }
                            throw new RuntimeException("RuntimeException:readRawVarInt32");
                        }
                    }
                }
            }
            return result;
        }
    }


    //VarInt读8位
    private long readRawVarInt64() {
        int shift = 0;
        for (long result = 0L; shift < 64; shift += 7) {
            byte b = this.buffer[this.offset++];
            result |= (long) (b & 127) << shift;
            if ((b & 128) == 0) {
                return result;
            }
        }
        throw new RuntimeException("RuntimeException:readRawVarInt64");
    }


    private static byte[] sub(byte[] array, int start, int end) {
        int length = Array.getLength(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new byte[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new byte[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }


    public static long bytesToLong(byte[] bytes, int start, ByteOrder byteOrder) {
        long values = 0;
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            for (int i = (Long.BYTES - 1); i >= 0; i--) {
                values <<= Byte.SIZE;
                values |= (bytes[i + start] & 0xff);
            }
        } else {
            for (int i = 0; i < Long.BYTES; i++) {
                values <<= Byte.SIZE;
                values |= (bytes[i + start] & 0xff);
            }
        }

        return values;
    }


    public static int bytesToInt(byte[] bytes, int start, ByteOrder byteOrder) {
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            return bytes[start] & 0xFF | //
                    (bytes[1 + start] & 0xFF) << 8 | //
                    (bytes[2 + start] & 0xFF) << 16 | //
                    (bytes[3 + start] & 0xFF) << 24; //
        } else {
            return bytes[3 + start] & 0xFF | //
                    (bytes[2 + start] & 0xFF) << 8 | //
                    (bytes[1 + start] & 0xFF) << 16 | //
                    (bytes[start] & 0xFF) << 24; //
        }

    }
}
