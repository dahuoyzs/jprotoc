package io.github.dahuoyzs.jprotoc.parse.bo;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProtoInfo {

    //文件名
    String pbName = "";
    //syntax
    String syntax = "proto3";//默认proto3
    //package
    String packageName = "";//pb缺省时 默认空包名

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
