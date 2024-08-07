// Generated from jprotoc/antlr4/Protobuf2.g4 by ANTLR 4.13.1
package io.github.dahuoyzs.jprotoc.protobuf2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Protobuf2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Protobuf2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProto(Protobuf2Parser.ProtoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(Protobuf2Parser.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Protobuf2Parser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#packageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStatement(Protobuf2Parser.PackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#optionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionStatement(Protobuf2Parser.OptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#optionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionName(Protobuf2Parser.OptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#fieldLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLabel(Protobuf2Parser.FieldLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(Protobuf2Parser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#fieldOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOptions(Protobuf2Parser.FieldOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#fieldOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOption(Protobuf2Parser.FieldOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#fieldNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldNumber(Protobuf2Parser.FieldNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(Protobuf2Parser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#oneof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneof(Protobuf2Parser.OneofContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#oneofField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneofField(Protobuf2Parser.OneofFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#mapField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapField(Protobuf2Parser.MapFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#keyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyType(Protobuf2Parser.KeyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(Protobuf2Parser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#extensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensions(Protobuf2Parser.ExtensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#reserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved(Protobuf2Parser.ReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#ranges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanges(Protobuf2Parser.RangesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#range_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_(Protobuf2Parser.Range_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#reservedFieldNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedFieldNames(Protobuf2Parser.ReservedFieldNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#topLevelDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDef(Protobuf2Parser.TopLevelDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDef(Protobuf2Parser.EnumDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Protobuf2Parser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumElement(Protobuf2Parser.EnumElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumField(Protobuf2Parser.EnumFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumValueOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueOptions(Protobuf2Parser.EnumValueOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumValueOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueOption(Protobuf2Parser.EnumValueOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#messageDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageDef(Protobuf2Parser.MessageDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#messageBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageBody(Protobuf2Parser.MessageBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#messageElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageElement(Protobuf2Parser.MessageElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#extendDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendDef(Protobuf2Parser.ExtendDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#extendElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendElement(Protobuf2Parser.ExtendElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#serviceDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDef(Protobuf2Parser.ServiceDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#serviceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceElement(Protobuf2Parser.ServiceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#rpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpc(Protobuf2Parser.RpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream(Protobuf2Parser.StreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(Protobuf2Parser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#blockLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockLit(Protobuf2Parser.BlockLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(Protobuf2Parser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(Protobuf2Parser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#fullIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullIdent(Protobuf2Parser.FullIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#messageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageName(Protobuf2Parser.MessageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(Protobuf2Parser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(Protobuf2Parser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(Protobuf2Parser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#oneofName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneofName(Protobuf2Parser.OneofNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#mapName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapName(Protobuf2Parser.MapNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#serviceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceName(Protobuf2Parser.ServiceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#rpcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpcName(Protobuf2Parser.RpcNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#streamName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamName(Protobuf2Parser.StreamNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#messageType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageType(Protobuf2Parser.MessageTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(Protobuf2Parser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#intLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(Protobuf2Parser.IntLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#strLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLit(Protobuf2Parser.StrLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#boolLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLit(Protobuf2Parser.BoolLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#floatLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLit(Protobuf2Parser.FloatLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Protobuf2Parser#keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywords(Protobuf2Parser.KeywordsContext ctx);
}