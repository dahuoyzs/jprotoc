// Generated from jprotoc/antlr4/Protobuf2.g4 by ANTLR 4.13.1
package io.github.dahuoyzs.jprotoc.protobuf2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Protobuf2Parser}.
 */
public interface Protobuf2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#proto}.
	 * @param ctx the parse tree
	 */
	void enterProto(Protobuf2Parser.ProtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#proto}.
	 * @param ctx the parse tree
	 */
	void exitProto(Protobuf2Parser.ProtoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(Protobuf2Parser.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(Protobuf2Parser.SyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Protobuf2Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Protobuf2Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStatement(Protobuf2Parser.PackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStatement(Protobuf2Parser.PackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionStatement(Protobuf2Parser.OptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionStatement(Protobuf2Parser.OptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#optionName}.
	 * @param ctx the parse tree
	 */
	void enterOptionName(Protobuf2Parser.OptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#optionName}.
	 * @param ctx the parse tree
	 */
	void exitOptionName(Protobuf2Parser.OptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#fieldLabel}.
	 * @param ctx the parse tree
	 */
	void enterFieldLabel(Protobuf2Parser.FieldLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#fieldLabel}.
	 * @param ctx the parse tree
	 */
	void exitFieldLabel(Protobuf2Parser.FieldLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(Protobuf2Parser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(Protobuf2Parser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void enterFieldOptions(Protobuf2Parser.FieldOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void exitFieldOptions(Protobuf2Parser.FieldOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#fieldOption}.
	 * @param ctx the parse tree
	 */
	void enterFieldOption(Protobuf2Parser.FieldOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#fieldOption}.
	 * @param ctx the parse tree
	 */
	void exitFieldOption(Protobuf2Parser.FieldOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#fieldNumber}.
	 * @param ctx the parse tree
	 */
	void enterFieldNumber(Protobuf2Parser.FieldNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#fieldNumber}.
	 * @param ctx the parse tree
	 */
	void exitFieldNumber(Protobuf2Parser.FieldNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(Protobuf2Parser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(Protobuf2Parser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#oneof}.
	 * @param ctx the parse tree
	 */
	void enterOneof(Protobuf2Parser.OneofContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#oneof}.
	 * @param ctx the parse tree
	 */
	void exitOneof(Protobuf2Parser.OneofContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#oneofField}.
	 * @param ctx the parse tree
	 */
	void enterOneofField(Protobuf2Parser.OneofFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#oneofField}.
	 * @param ctx the parse tree
	 */
	void exitOneofField(Protobuf2Parser.OneofFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#mapField}.
	 * @param ctx the parse tree
	 */
	void enterMapField(Protobuf2Parser.MapFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#mapField}.
	 * @param ctx the parse tree
	 */
	void exitMapField(Protobuf2Parser.MapFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#keyType}.
	 * @param ctx the parse tree
	 */
	void enterKeyType(Protobuf2Parser.KeyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#keyType}.
	 * @param ctx the parse tree
	 */
	void exitKeyType(Protobuf2Parser.KeyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(Protobuf2Parser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(Protobuf2Parser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#extensions}.
	 * @param ctx the parse tree
	 */
	void enterExtensions(Protobuf2Parser.ExtensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#extensions}.
	 * @param ctx the parse tree
	 */
	void exitExtensions(Protobuf2Parser.ExtensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#reserved}.
	 * @param ctx the parse tree
	 */
	void enterReserved(Protobuf2Parser.ReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#reserved}.
	 * @param ctx the parse tree
	 */
	void exitReserved(Protobuf2Parser.ReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#ranges}.
	 * @param ctx the parse tree
	 */
	void enterRanges(Protobuf2Parser.RangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#ranges}.
	 * @param ctx the parse tree
	 */
	void exitRanges(Protobuf2Parser.RangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#range_}.
	 * @param ctx the parse tree
	 */
	void enterRange_(Protobuf2Parser.Range_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#range_}.
	 * @param ctx the parse tree
	 */
	void exitRange_(Protobuf2Parser.Range_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#reservedFieldNames}.
	 * @param ctx the parse tree
	 */
	void enterReservedFieldNames(Protobuf2Parser.ReservedFieldNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#reservedFieldNames}.
	 * @param ctx the parse tree
	 */
	void exitReservedFieldNames(Protobuf2Parser.ReservedFieldNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#topLevelDef}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDef(Protobuf2Parser.TopLevelDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#topLevelDef}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDef(Protobuf2Parser.TopLevelDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumDef}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(Protobuf2Parser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumDef}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(Protobuf2Parser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(Protobuf2Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(Protobuf2Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumElement}.
	 * @param ctx the parse tree
	 */
	void enterEnumElement(Protobuf2Parser.EnumElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumElement}.
	 * @param ctx the parse tree
	 */
	void exitEnumElement(Protobuf2Parser.EnumElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumField}.
	 * @param ctx the parse tree
	 */
	void enterEnumField(Protobuf2Parser.EnumFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumField}.
	 * @param ctx the parse tree
	 */
	void exitEnumField(Protobuf2Parser.EnumFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumValueOptions}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueOptions(Protobuf2Parser.EnumValueOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumValueOptions}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueOptions(Protobuf2Parser.EnumValueOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumValueOption}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueOption(Protobuf2Parser.EnumValueOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumValueOption}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueOption(Protobuf2Parser.EnumValueOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#messageDef}.
	 * @param ctx the parse tree
	 */
	void enterMessageDef(Protobuf2Parser.MessageDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#messageDef}.
	 * @param ctx the parse tree
	 */
	void exitMessageDef(Protobuf2Parser.MessageDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#messageBody}.
	 * @param ctx the parse tree
	 */
	void enterMessageBody(Protobuf2Parser.MessageBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#messageBody}.
	 * @param ctx the parse tree
	 */
	void exitMessageBody(Protobuf2Parser.MessageBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#messageElement}.
	 * @param ctx the parse tree
	 */
	void enterMessageElement(Protobuf2Parser.MessageElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#messageElement}.
	 * @param ctx the parse tree
	 */
	void exitMessageElement(Protobuf2Parser.MessageElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#extendDef}.
	 * @param ctx the parse tree
	 */
	void enterExtendDef(Protobuf2Parser.ExtendDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#extendDef}.
	 * @param ctx the parse tree
	 */
	void exitExtendDef(Protobuf2Parser.ExtendDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#extendElement}.
	 * @param ctx the parse tree
	 */
	void enterExtendElement(Protobuf2Parser.ExtendElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#extendElement}.
	 * @param ctx the parse tree
	 */
	void exitExtendElement(Protobuf2Parser.ExtendElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#serviceDef}.
	 * @param ctx the parse tree
	 */
	void enterServiceDef(Protobuf2Parser.ServiceDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#serviceDef}.
	 * @param ctx the parse tree
	 */
	void exitServiceDef(Protobuf2Parser.ServiceDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#serviceElement}.
	 * @param ctx the parse tree
	 */
	void enterServiceElement(Protobuf2Parser.ServiceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#serviceElement}.
	 * @param ctx the parse tree
	 */
	void exitServiceElement(Protobuf2Parser.ServiceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#rpc}.
	 * @param ctx the parse tree
	 */
	void enterRpc(Protobuf2Parser.RpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#rpc}.
	 * @param ctx the parse tree
	 */
	void exitRpc(Protobuf2Parser.RpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#stream}.
	 * @param ctx the parse tree
	 */
	void enterStream(Protobuf2Parser.StreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#stream}.
	 * @param ctx the parse tree
	 */
	void exitStream(Protobuf2Parser.StreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(Protobuf2Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(Protobuf2Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#blockLit}.
	 * @param ctx the parse tree
	 */
	void enterBlockLit(Protobuf2Parser.BlockLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#blockLit}.
	 * @param ctx the parse tree
	 */
	void exitBlockLit(Protobuf2Parser.BlockLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(Protobuf2Parser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(Protobuf2Parser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(Protobuf2Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(Protobuf2Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#fullIdent}.
	 * @param ctx the parse tree
	 */
	void enterFullIdent(Protobuf2Parser.FullIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#fullIdent}.
	 * @param ctx the parse tree
	 */
	void exitFullIdent(Protobuf2Parser.FullIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#messageName}.
	 * @param ctx the parse tree
	 */
	void enterMessageName(Protobuf2Parser.MessageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#messageName}.
	 * @param ctx the parse tree
	 */
	void exitMessageName(Protobuf2Parser.MessageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(Protobuf2Parser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(Protobuf2Parser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(Protobuf2Parser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(Protobuf2Parser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(Protobuf2Parser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(Protobuf2Parser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#oneofName}.
	 * @param ctx the parse tree
	 */
	void enterOneofName(Protobuf2Parser.OneofNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#oneofName}.
	 * @param ctx the parse tree
	 */
	void exitOneofName(Protobuf2Parser.OneofNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#mapName}.
	 * @param ctx the parse tree
	 */
	void enterMapName(Protobuf2Parser.MapNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#mapName}.
	 * @param ctx the parse tree
	 */
	void exitMapName(Protobuf2Parser.MapNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#serviceName}.
	 * @param ctx the parse tree
	 */
	void enterServiceName(Protobuf2Parser.ServiceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#serviceName}.
	 * @param ctx the parse tree
	 */
	void exitServiceName(Protobuf2Parser.ServiceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#rpcName}.
	 * @param ctx the parse tree
	 */
	void enterRpcName(Protobuf2Parser.RpcNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#rpcName}.
	 * @param ctx the parse tree
	 */
	void exitRpcName(Protobuf2Parser.RpcNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#streamName}.
	 * @param ctx the parse tree
	 */
	void enterStreamName(Protobuf2Parser.StreamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#streamName}.
	 * @param ctx the parse tree
	 */
	void exitStreamName(Protobuf2Parser.StreamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#messageType}.
	 * @param ctx the parse tree
	 */
	void enterMessageType(Protobuf2Parser.MessageTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#messageType}.
	 * @param ctx the parse tree
	 */
	void exitMessageType(Protobuf2Parser.MessageTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(Protobuf2Parser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(Protobuf2Parser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#intLit}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(Protobuf2Parser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#intLit}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(Protobuf2Parser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#strLit}.
	 * @param ctx the parse tree
	 */
	void enterStrLit(Protobuf2Parser.StrLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#strLit}.
	 * @param ctx the parse tree
	 */
	void exitStrLit(Protobuf2Parser.StrLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#boolLit}.
	 * @param ctx the parse tree
	 */
	void enterBoolLit(Protobuf2Parser.BoolLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#boolLit}.
	 * @param ctx the parse tree
	 */
	void exitBoolLit(Protobuf2Parser.BoolLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#floatLit}.
	 * @param ctx the parse tree
	 */
	void enterFloatLit(Protobuf2Parser.FloatLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#floatLit}.
	 * @param ctx the parse tree
	 */
	void exitFloatLit(Protobuf2Parser.FloatLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Protobuf2Parser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(Protobuf2Parser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Protobuf2Parser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(Protobuf2Parser.KeywordsContext ctx);
}