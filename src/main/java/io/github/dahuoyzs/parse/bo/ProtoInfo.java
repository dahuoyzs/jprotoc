package io.github.dahuoyzs.parse.bo;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProtoInfo {

    String pbName = "xxx";
    //syntax
    String syntax = "proto3";//默认proto3
    //package
    String packageName = "";//pb缺省时 默认空包名

    //option
//    String optimize_for = "SPEED";//pb缺省时 默认速度模式
//    String java_outer_classname = "";//pb缺省时 默认文件名首字母大写
//    Boolean java_multiple_files = false;//pb缺省时 默认单文件
    Map<String, String> optionMap = new HashMap<>();
    Map<String, List<FieldInfo>> messageMap = new HashMap<>();
    Map<String, List<FieldInfo>> enumMap = new HashMap<>();

    public String getPbName() {
        return pbName;
    }

    public void setPbName(String pbName) {
        this.pbName = pbName;
    }

    public String getSyntax() {
        return syntax;
    }

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Map<String, String> getOptionMap() {
        return optionMap;
    }

    public void setOptionMap(Map<String, String> optionMap) {
        this.optionMap = optionMap;
    }

    public Map<String, List<FieldInfo>> getMessageMap() {
        return messageMap;
    }

    public void setMessageMap(Map<String, List<FieldInfo>> messageMap) {
        this.messageMap = messageMap;
    }

    public Map<String, List<FieldInfo>> getEnumMap() {
        return enumMap;
    }

    public void setEnumMap(Map<String, List<FieldInfo>> enumMap) {
        this.enumMap = enumMap;
    }
}
