package io.github.dahuoyzs.jprotoc.parse;

import io.github.dahuoyzs.jprotoc.protobuf3.Protobuf3BaseListener;
import io.github.dahuoyzs.jprotoc.protobuf3.Protobuf3Parser;
import io.github.dahuoyzs.jprotoc.parse.bo.FieldInfo;
import io.github.dahuoyzs.jprotoc.parse.bo.ProtoInfo;
import io.github.dahuoyzs.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class Proto3Listener extends Protobuf3BaseListener {

    private ProtoInfo protoInfo = new ProtoInfo();
    private List<FieldInfo> currFields = new ArrayList<>();

    public ProtoInfo getProtoInfo() {
        return protoInfo;
    }

    public void setProtoInfo(ProtoInfo protoInfo) {
        this.protoInfo = protoInfo;
    }

    public List<FieldInfo> getCurrFields() {
        return currFields;
    }

    public void setCurrFields(List<FieldInfo> currFields) {
        this.currFields = currFields;
    }

    @Override
    public void enterProto(Protobuf3Parser.ProtoContext ctx) {
        protoInfo = new ProtoInfo();//每次进入保证是新的对象，防止老数据影响新数据
    }


    @Override
    public void enterPackageStatement(Protobuf3Parser.PackageStatementContext ctx) {
//        System.out.println(ctx.fullIdent().getText());
        String pbPackageName = ctx.fullIdent().getText();
        protoInfo.setPackageName(pbPackageName);
    }

    @Override
    public void enterOptionStatement(Protobuf3Parser.OptionStatementContext ctx) {
//        System.out.println(ctx.OPTION().getText() + " " + ctx.optionName().getText() + " = " + ctx.constant().getText());
        String text = ctx.constant().getText();
        if (text != null && text.startsWith("\"") && text.endsWith("\"")) {
            text = text.substring(1, text.length() - 1);
        }
        protoInfo.getOptionMap().put(ctx.optionName().getText(), text);
    }

    @Override
    public void enterMessageDef(Protobuf3Parser.MessageDefContext ctx) {
        currFields = protoInfo.getMessageMap().getOrDefault(ctx.messageName().getText(), new ArrayList<>());
    }

    @Override
    public void exitMessageDef(Protobuf3Parser.MessageDefContext ctx) {
        protoInfo.getMessageMap().put(ctx.messageName().getText(), currFields);
    }

    //基本类型，数字类型和字符串类型字段
    @Override
    public void enterField(Protobuf3Parser.FieldContext ctx) {
        if (ctx.type_() != null && ctx.fieldName() != null && ctx.fieldNumber() != null) {
            //收集字段
            FieldInfo fieldInfo = new FieldInfo();
            //pb字段
            fieldInfo.setPbType(ctx.type_().getText());
            fieldInfo.setPbName(ctx.fieldName().getText());
            fieldInfo.setPbNumber(ctx.fieldNumber().getText());
            //bean字段
            String beanType = Utils.pb2JavaMap.getOrDefault(fieldInfo.getPbType(), fieldInfo.getPbType());
            if (ctx.fieldLabel() != null && "repeated".equals(ctx.fieldLabel().getText())) {
                fieldInfo.setPbLabel(ctx.fieldLabel().getText());
                String listType = String.format("List<%s>", beanType);
                fieldInfo.setBeanType(listType);
            } else {
                fieldInfo.setBeanType(beanType);
            }
            fieldInfo.setBeanName(Utils.toCamelCase(fieldInfo.getPbName()));
            currFields.add(fieldInfo);
        }
    }

    //map类型
    @Override
    public void enterMapField(Protobuf3Parser.MapFieldContext ctx) {
        if (ctx.MAP() != null && ctx.keyType() != null && ctx.type_() != null && ctx.mapName() != null && ctx.fieldNumber() != null) {
            //收集字段
            FieldInfo fieldInfo = new FieldInfo();
            //pbMap字段
            fieldInfo.setPbMapKeyType(ctx.keyType().getText());
            fieldInfo.setPbMapValType(ctx.type_().getText());
            String pbMapType = String.format("map<%s,%s>", fieldInfo.getPbMapKeyType(), fieldInfo.getPbMapValType());
            fieldInfo.setPbType(pbMapType);
            fieldInfo.setPbName(ctx.mapName().getText());
            fieldInfo.setPbNumber(ctx.fieldNumber().getText());
            //beanMap字段
            String keyType = Utils.pb2JavaMap.getOrDefault(fieldInfo.getPbMapKeyType(), fieldInfo.getPbMapKeyType());
            String valType = Utils.pb2JavaMap.getOrDefault(fieldInfo.getPbMapValType(), fieldInfo.getPbMapValType());
            String beanMapType = String.format("Map<%s,%s>", keyType, valType);
            fieldInfo.setBeanType(beanMapType);
            fieldInfo.setBeanName(Utils.toCamelCase(fieldInfo.getPbName()));
            currFields.add(fieldInfo);
        }
    }

    @Override
    public void enterEnumDef(Protobuf3Parser.EnumDefContext ctx) {
        currFields = protoInfo.getEnumMap().getOrDefault(ctx.enumName().getText(), new ArrayList<>());
    }


    @Override
    public void exitEnumDef(Protobuf3Parser.EnumDefContext ctx) {
        protoInfo.getEnumMap().put(ctx.enumName().getText(), currFields);
    }

    //枚举类型
    @Override
    public void enterEnumField(Protobuf3Parser.EnumFieldContext ctx) {
        if (ctx.ident() != null && ctx.intLit() != null) {
            //收集字段
            FieldInfo fieldInfo = new FieldInfo();
            //pbMap字段
            fieldInfo.setPbType("enumField");
            fieldInfo.setPbName(ctx.ident().getText());
            fieldInfo.setPbNumber(ctx.intLit().getText());
            //beanMap字段
            fieldInfo.setBeanType("enumField");
            fieldInfo.setBeanName(fieldInfo.getPbName());
            currFields.add(fieldInfo);
        }
    }

}
