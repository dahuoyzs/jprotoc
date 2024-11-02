package io.github.dahuoyzs.runtime;


public class Bytes {

    /**
     * 给我一个字节数组,如果这个字节数组中有protobuf数据,就返回这个数据在数组中的起始位置,如果没有,就返回-1
     *
     * @param bytes proto字节数组
     * @return int 起始位置
     */
    public static int findProtobufStartIndex(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            byte[] before = new byte[i];
            byte[] after = new byte[bytes.length - i];
            System.arraycopy(bytes, 0, before, 0, i);
            System.arraycopy(bytes, i, after, 0, bytes.length - i);
            if (DataBuffer.isProtobuf(after)) {
                return i;
            }
        }
        return -1;
    }

}
