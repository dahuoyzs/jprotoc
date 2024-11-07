package io.github.dahuoyzs.util;


import io.github.dahuoyzs.jprotoc.parse.bo.FieldInfo;
import io.github.dahuoyzs.jprotoc.parse.bo.ProtoInfo;

import java.io.File;

public class GenStuffBeanLomBok {

    //enum模板
    public static String enumStartTlp = "public enum %s  {\n";
    public static String enumFieldTlp = "    %s(%s),\n";
    public static String enumMethodTlp = "    ;\n" +
            "    private int value;\n" +
            "\n" +
            "    private %s(int value) {\n" +
            "      this.value = value;\n" +
            "    }\n" +
            "\n" +
            "    public int getValue() {\n" +
            "      return value;\n" +
            "    }\n";
    //class模板
    public static String beanStartTlp = "@Data\n@NoArgsConstructor\n@ProtobufClass\npublic static class %s  {\n";
    public static String tagAnnotationTlp = "    @Tag(%s)\n";
    public static String beanFieldTlp = "    %s %s;\n";

    //end
    public static String END = "}\n";

    //生成代码
    public static void gen(ProtoInfo protoInfo, File dir) {
        try {
            if (!dir.exists()) {
                dir.mkdirs();
            }
            String java_multiple_files = protoInfo.getOptionMap().getOrDefault("java_multiple_files", "false");
            if ("true".equals(java_multiple_files)) {//多文件
                genMultiple(protoInfo,dir);
            } else {//单文件
                genSingle(protoInfo, dir);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //生成多文件代码
    public static void genMultiple(ProtoInfo protoInfo, File dir){

        String packStr = getPackStr(protoInfo);
        String importStr = "import java.util.*;\n" +
                "import java.lang.*;\n" +
                "import io.protostuff.Tag;\n"+
                "import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;\n"+
                "import lombok.*;\n";

        //多文件
        protoInfo.getEnumMap().forEach((enumName,fieldInfos)->{
            //构建字符串
            String enumStart = String.format(enumStartTlp, enumName);
            StringBuilder fieldSb = new StringBuilder();
            for (FieldInfo fieldInfo : fieldInfos) {
                String pbName = fieldInfo.getPbName();
                String pbNumber = fieldInfo.getPbNumber();
                fieldSb.append(String.format(enumFieldTlp, pbName, pbNumber));
            }
            String enumMethod = String.format(enumMethodTlp, enumName);
            String enumCode = enumStart + fieldSb + enumMethod + END;
            //代码生成
            String code = "package " + packStr + ";\n"
                    + enumCode;
            String targetFileName = dir.getAbsolutePath() + File.separator
                    + Utils.upperFirst(enumName) + ".java";
            Utils.writeFileStr(new File(targetFileName), code);
        });

        protoInfo.getMessageMap().forEach((objName,fieldInfos)->{
            //构建字符串
            String beanStart = String.format(beanStartTlp, objName);

            StringBuilder fieldSb = new StringBuilder();
            for (FieldInfo fieldInfo : fieldInfos) {
                String fieldName = fieldInfo.getBeanName();
                if (fieldInfo.getBeanType().contains("java.util.List") || fieldInfo.getBeanType().startsWith("List")) {
                    fieldName += " = new java.util.ArrayList<>()";
                } else if (fieldInfo.getBeanType().contains("java.util.Map") || fieldInfo.getBeanType().startsWith("Map")) {
                    fieldName += " = new java.util.HashMap<>()";
                }

                fieldSb.append(String.format(tagAnnotationTlp, fieldInfo.getPbNumber()));//@Tag
                fieldSb.append(String.format(beanFieldTlp, fieldInfo.getBeanType(), fieldName));
            }

            String beanCode = beanStart + fieldSb  + END;

            //代码生成
            String code = "package " + packStr + ";\n" +
                    importStr + beanCode;
            String targetFileName = dir.getAbsolutePath() + File.separator
                    + Utils.upperFirst(objName) + ".java";
            Utils.writeFileStr(new File(targetFileName), code);
        });
    }

    //生成单文件代码
    public static void genSingle(ProtoInfo protoInfo, File dir){
        String name = Utils.upperFirst(protoInfo.getPbName()).replace(".proto", "");
        String targetFileName = dir.getAbsolutePath() + File.separator
                + name + ".java";
        String packStr = getPackStr(protoInfo);
        String packAndImportStr = "package " + packStr + ";\n" +
                "import java.util.*;\n" +
                "import java.lang.*;\n" +
                "import io.protostuff.Tag;\n"+
                "import lombok.*;\n";
        StringBuilder singleSb = new StringBuilder(packAndImportStr);
        singleSb.append("public class ").append(name).append(" {\n\n");

        protoInfo.getEnumMap().forEach((enumName,fieldInfos)->{
            //构建字符串
            String enumStart = String.format(enumStartTlp, enumName);
            StringBuilder fieldSb = new StringBuilder();
            for (FieldInfo fieldInfo : fieldInfos) {
                String pbName = fieldInfo.getPbName();
                String pbNumber = fieldInfo.getPbNumber();
                fieldSb.append(String.format(enumFieldTlp, pbName, pbNumber));
            }
            String enumMethod = String.format(enumMethodTlp, enumName);
            String enumCode = enumStart + fieldSb + enumMethod + END;

            singleSb.append(enumCode).append("\n");
        });

        protoInfo.getMessageMap().forEach((objName,fieldInfos)->{
            //构建字符串
            String beanStart = String.format(beanStartTlp, objName);

            StringBuilder fieldSb = new StringBuilder();
            for (FieldInfo fieldInfo : fieldInfos) {
                String fieldName = fieldInfo.getBeanName();
                if (fieldInfo.getBeanType().contains("java.util.List") || fieldInfo.getBeanType().startsWith("List")) {
                    fieldName += " = new java.util.ArrayList<>()";
                } else if (fieldInfo.getBeanType().contains("java.util.Map") || fieldInfo.getBeanType().startsWith("Map")) {
                    fieldName += " = new java.util.HashMap<>()";
                }

                fieldSb.append(String.format(tagAnnotationTlp, fieldInfo.getPbNumber()));//@Tag
                fieldSb.append(String.format(beanFieldTlp, fieldInfo.getBeanType(), fieldName));
            }

            String beanCode = beanStart + fieldSb + END;
            singleSb.append(beanCode).append("\n");
        });
        String code = singleSb + END;
        Utils.writeFileStr(new File(targetFileName), code);
    }


    public static String getPackStr(ProtoInfo protoInfo) {
        String packStr = protoInfo.getPackageName();
        String java_package = protoInfo.getOptionMap().get("java_package");
        if (java_package != null) {
            if (java_package.startsWith("\"") && java_package.endsWith("\"")) {
                packStr = java_package.substring(1, java_package.length() - 1);
            } else {
                packStr = java_package;
            }
        }
        return packStr;
    }
}
