package io.github.dahuoyzs.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

public class Utils {

    public static HashMap<String, String> pb2JavaMap = new HashMap<>();
    static {
        pb2JavaMap.put("double", "double");
        pb2JavaMap.put("float", "float");
        pb2JavaMap.put("bool", "boolean");
        pb2JavaMap.put("string", "String");
        pb2JavaMap.put("bytes", "byte[]");
        pb2JavaMap.put("int32", "int");
        pb2JavaMap.put("int64", "long");
        pb2JavaMap.put("uint32", "int");
        pb2JavaMap.put("uint64", "long");
        pb2JavaMap.put("sint32", "int");
        pb2JavaMap.put("sint64", "long");
        pb2JavaMap.put("fixed32", "int");
        pb2JavaMap.put("fixed64", "long");
        pb2JavaMap.put("sfixed32", "int");
        pb2JavaMap.put("sfixed64", "long");
    }

    /**
     * 将字符串的首字母大写。
     * @param str 要处理的字符串
     * @return 返回首字母大写的字符串
     */
    public static String upperFirst(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /**
     * 将字符串转换为驼峰命名风格。
     * @param str 要处理的字符串
     * @return 返回驼峰命名风格的字符串
     */
    public static String toCamelCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean nextUpper = false;
        for (char c : str.toCharArray()) {
            if (c == '_' || c == '-' || c == ' ') {
                nextUpper = true;
            } else if (nextUpper) {
                result.append(Character.toUpperCase(c));
                nextUpper = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }


    /**
     * 从文件中读取字符串
     *
     * @param protoFile proto文件
     * @return String 文件内容
     */
    public static String readFileStr(File protoFile) {
        try {
            return new String(Files.readAllBytes(Paths.get(protoFile.getAbsolutePath())),"UTF-8");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "";
    }

    /**
     * 从文件中读取字符串
     *
     * @param targetFile 目标文件
     * @param content 文件内容
     */
    public static void writeFileStr(File targetFile, String content) {
        try {
            Path path = Paths.get(targetFile.getAbsolutePath());
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
