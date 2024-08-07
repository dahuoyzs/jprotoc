// Generated from jprotoc/antlr4/Protobuf2.g4 by ANTLR 4.13.1
package io.github.dahuoyzs.jprotoc.protobuf2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Protobuf2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SYNTAX=1, IMPORT=2, WEAK=3, PUBLIC=4, PACKAGE=5, OPTION=6, REPEATED=7, 
		OPTIONAL=8, REQUIRED=9, GROUP=10, ONEOF=11, MAP=12, INT32=13, INT64=14, 
		UINT32=15, UINT64=16, SINT32=17, SINT64=18, FIXED32=19, FIXED64=20, SFIXED32=21, 
		SFIXED64=22, BOOL=23, STRING=24, DOUBLE=25, FLOAT=26, BYTES=27, RESERVED=28, 
		EXTENSIONS=29, TO=30, MAX=31, ENUM=32, EXTEND=33, MESSAGE=34, SERVICE=35, 
		RPC=36, STREAM=37, RETURNS=38, PROTO2_LIT_SINGLE=39, PROTO2_LIT_DOBULE=40, 
		SEMI=41, EQ=42, LP=43, RP=44, LB=45, RB=46, LC=47, RC=48, LT=49, GT=50, 
		DOT=51, COMMA=52, COLON=53, PLUS=54, MINUS=55, STR_LIT=56, BOOL_LIT=57, 
		FLOAT_LIT=58, INT_LIT=59, IDENTIFIER=60, WS=61, LINE_COMMENT=62, COMMENT=63;
	public static final int
		RULE_proto = 0, RULE_syntax = 1, RULE_importStatement = 2, RULE_packageStatement = 3, 
		RULE_optionStatement = 4, RULE_optionName = 5, RULE_fieldLabel = 6, RULE_field = 7, 
		RULE_fieldOptions = 8, RULE_fieldOption = 9, RULE_fieldNumber = 10, RULE_group = 11, 
		RULE_oneof = 12, RULE_oneofField = 13, RULE_mapField = 14, RULE_keyType = 15, 
		RULE_type_ = 16, RULE_extensions = 17, RULE_reserved = 18, RULE_ranges = 19, 
		RULE_range_ = 20, RULE_reservedFieldNames = 21, RULE_topLevelDef = 22, 
		RULE_enumDef = 23, RULE_enumBody = 24, RULE_enumElement = 25, RULE_enumField = 26, 
		RULE_enumValueOptions = 27, RULE_enumValueOption = 28, RULE_messageDef = 29, 
		RULE_messageBody = 30, RULE_messageElement = 31, RULE_extendDef = 32, 
		RULE_extendElement = 33, RULE_serviceDef = 34, RULE_serviceElement = 35, 
		RULE_rpc = 36, RULE_stream = 37, RULE_constant = 38, RULE_blockLit = 39, 
		RULE_emptyStatement_ = 40, RULE_ident = 41, RULE_fullIdent = 42, RULE_messageName = 43, 
		RULE_enumName = 44, RULE_fieldName = 45, RULE_groupName = 46, RULE_oneofName = 47, 
		RULE_mapName = 48, RULE_serviceName = 49, RULE_rpcName = 50, RULE_streamName = 51, 
		RULE_messageType = 52, RULE_enumType = 53, RULE_intLit = 54, RULE_strLit = 55, 
		RULE_boolLit = 56, RULE_floatLit = 57, RULE_keywords = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"proto", "syntax", "importStatement", "packageStatement", "optionStatement", 
			"optionName", "fieldLabel", "field", "fieldOptions", "fieldOption", "fieldNumber", 
			"group", "oneof", "oneofField", "mapField", "keyType", "type_", "extensions", 
			"reserved", "ranges", "range_", "reservedFieldNames", "topLevelDef", 
			"enumDef", "enumBody", "enumElement", "enumField", "enumValueOptions", 
			"enumValueOption", "messageDef", "messageBody", "messageElement", "extendDef", 
			"extendElement", "serviceDef", "serviceElement", "rpc", "stream", "constant", 
			"blockLit", "emptyStatement_", "ident", "fullIdent", "messageName", "enumName", 
			"fieldName", "groupName", "oneofName", "mapName", "serviceName", "rpcName", 
			"streamName", "messageType", "enumType", "intLit", "strLit", "boolLit", 
			"floatLit", "keywords"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'syntax'", "'import'", "'weak'", "'public'", "'package'", "'option'", 
			"'repeated'", "'optional'", "'required'", "'group'", "'oneof'", "'map'", 
			"'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", 
			"'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'bool'", "'string'", 
			"'double'", "'float'", "'bytes'", "'reserved'", "'extensions'", "'to'", 
			"'max'", "'enum'", "'extend'", "'message'", "'service'", "'rpc'", "'stream'", 
			"'returns'", "'\"proto2\"'", "''proto2''", "';'", "'='", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'>'", "'.'", "','", "':'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SYNTAX", "IMPORT", "WEAK", "PUBLIC", "PACKAGE", "OPTION", "REPEATED", 
			"OPTIONAL", "REQUIRED", "GROUP", "ONEOF", "MAP", "INT32", "INT64", "UINT32", 
			"UINT64", "SINT32", "SINT64", "FIXED32", "FIXED64", "SFIXED32", "SFIXED64", 
			"BOOL", "STRING", "DOUBLE", "FLOAT", "BYTES", "RESERVED", "EXTENSIONS", 
			"TO", "MAX", "ENUM", "EXTEND", "MESSAGE", "SERVICE", "RPC", "STREAM", 
			"RETURNS", "PROTO2_LIT_SINGLE", "PROTO2_LIT_DOBULE", "SEMI", "EQ", "LP", 
			"RP", "LB", "RB", "LC", "RC", "LT", "GT", "DOT", "COMMA", "COLON", "PLUS", 
			"MINUS", "STR_LIT", "BOOL_LIT", "FLOAT_LIT", "INT_LIT", "IDENTIFIER", 
			"WS", "LINE_COMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Protobuf2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Protobuf2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProtoContext extends ParserRuleContext {
		public SyntaxContext syntax() {
			return getRuleContext(SyntaxContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Protobuf2Parser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<PackageStatementContext> packageStatement() {
			return getRuleContexts(PackageStatementContext.class);
		}
		public PackageStatementContext packageStatement(int i) {
			return getRuleContext(PackageStatementContext.class,i);
		}
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<TopLevelDefContext> topLevelDef() {
			return getRuleContexts(TopLevelDefContext.class);
		}
		public TopLevelDefContext topLevelDef(int i) {
			return getRuleContext(TopLevelDefContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public ProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterProto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitProto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitProto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtoContext proto() throws RecognitionException {
		ProtoContext _localctx = new ProtoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_proto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			syntax();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2263447765092L) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(119);
					importStatement();
					}
					break;
				case PACKAGE:
					{
					setState(120);
					packageStatement();
					}
					break;
				case OPTION:
					{
					setState(121);
					optionStatement();
					}
					break;
				case ENUM:
				case EXTEND:
				case MESSAGE:
				case SERVICE:
					{
					setState(122);
					topLevelDef();
					}
					break;
				case SEMI:
					{
					setState(123);
					emptyStatement_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyntaxContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(Protobuf2Parser.SYNTAX, 0); }
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public TerminalNode PROTO2_LIT_SINGLE() { return getToken(Protobuf2Parser.PROTO2_LIT_SINGLE, 0); }
		public TerminalNode PROTO2_LIT_DOBULE() { return getToken(Protobuf2Parser.PROTO2_LIT_DOBULE, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SYNTAX);
			setState(132);
			match(EQ);
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==PROTO2_LIT_SINGLE || _la==PROTO2_LIT_DOBULE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Protobuf2Parser.IMPORT, 0); }
		public StrLitContext strLit() {
			return getRuleContext(StrLitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public TerminalNode WEAK() { return getToken(Protobuf2Parser.WEAK, 0); }
		public TerminalNode PUBLIC() { return getToken(Protobuf2Parser.PUBLIC, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IMPORT);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WEAK || _la==PUBLIC) {
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==WEAK || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(140);
			strLit();
			setState(141);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageStatementContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Protobuf2Parser.PACKAGE, 0); }
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterPackageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitPackageStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitPackageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(PACKAGE);
			setState(144);
			fullIdent();
			setState(145);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionStatementContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(Protobuf2Parser.OPTION, 0); }
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public OptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterOptionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitOptionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitOptionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionStatementContext optionStatement() throws RecognitionException {
		OptionStatementContext _localctx = new OptionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(OPTION);
			setState(148);
			optionName();
			setState(149);
			match(EQ);
			setState(150);
			constant();
			setState(151);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionNameContext extends ParserRuleContext {
		public List<FullIdentContext> fullIdent() {
			return getRuleContexts(FullIdentContext.class);
		}
		public FullIdentContext fullIdent(int i) {
			return getRuleContext(FullIdentContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LP() { return getToken(Protobuf2Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Protobuf2Parser.RP, 0); }
		public TerminalNode DOT() { return getToken(Protobuf2Parser.DOT, 0); }
		public OptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterOptionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitOptionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitOptionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionNameContext optionName() throws RecognitionException {
		OptionNameContext _localctx = new OptionNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionName);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				fullIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SYNTAX:
				case IMPORT:
				case WEAK:
				case PUBLIC:
				case PACKAGE:
				case OPTION:
				case REPEATED:
				case OPTIONAL:
				case REQUIRED:
				case GROUP:
				case ONEOF:
				case MAP:
				case INT32:
				case INT64:
				case UINT32:
				case UINT64:
				case SINT32:
				case SINT64:
				case FIXED32:
				case FIXED64:
				case SFIXED32:
				case SFIXED64:
				case BOOL:
				case STRING:
				case DOUBLE:
				case FLOAT:
				case BYTES:
				case RESERVED:
				case EXTENSIONS:
				case TO:
				case MAX:
				case ENUM:
				case EXTEND:
				case MESSAGE:
				case SERVICE:
				case RPC:
				case STREAM:
				case RETURNS:
				case BOOL_LIT:
				case IDENTIFIER:
					{
					setState(154);
					ident();
					}
					break;
				case LP:
					{
					setState(155);
					match(LP);
					setState(156);
					fullIdent();
					setState(157);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(161);
					match(DOT);
					setState(162);
					fullIdent();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldLabelContext extends ParserRuleContext {
		public TerminalNode REQUIRED() { return getToken(Protobuf2Parser.REQUIRED, 0); }
		public TerminalNode OPTIONAL() { return getToken(Protobuf2Parser.OPTIONAL, 0); }
		public TerminalNode REPEATED() { return getToken(Protobuf2Parser.REPEATED, 0); }
		public FieldLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterFieldLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitFieldLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitFieldLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldLabelContext fieldLabel() throws RecognitionException {
		FieldLabelContext _localctx = new FieldLabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public FieldLabelContext fieldLabel() {
			return getRuleContext(FieldLabelContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public TerminalNode LB() { return getToken(Protobuf2Parser.LB, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(Protobuf2Parser.RB, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			fieldLabel();
			setState(170);
			type_();
			setState(171);
			fieldName();
			setState(172);
			match(EQ);
			setState(173);
			fieldNumber();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(174);
				match(LB);
				setState(175);
				fieldOptions();
				setState(176);
				match(RB);
				}
			}

			setState(180);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldOptionsContext extends ParserRuleContext {
		public List<FieldOptionContext> fieldOption() {
			return getRuleContexts(FieldOptionContext.class);
		}
		public FieldOptionContext fieldOption(int i) {
			return getRuleContext(FieldOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf2Parser.COMMA, i);
		}
		public FieldOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterFieldOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitFieldOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitFieldOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOptionsContext fieldOptions() throws RecognitionException {
		FieldOptionsContext _localctx = new FieldOptionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			fieldOption();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				fieldOption();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldOptionContext extends ParserRuleContext {
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FieldOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterFieldOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitFieldOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitFieldOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOptionContext fieldOption() throws RecognitionException {
		FieldOptionContext _localctx = new FieldOptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			optionName();
			setState(191);
			match(EQ);
			setState(192);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldNumberContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public FieldNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterFieldNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitFieldNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitFieldNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNumberContext fieldNumber() throws RecognitionException {
		FieldNumberContext _localctx = new FieldNumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			intLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ParserRuleContext {
		public FieldLabelContext fieldLabel() {
			return getRuleContext(FieldLabelContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(Protobuf2Parser.GROUP, 0); }
		public GroupNameContext groupName() {
			return getRuleContext(GroupNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public MessageBodyContext messageBody() {
			return getRuleContext(MessageBodyContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			fieldLabel();
			setState(197);
			match(GROUP);
			setState(198);
			groupName();
			setState(199);
			match(EQ);
			setState(200);
			fieldNumber();
			setState(201);
			messageBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OneofContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(Protobuf2Parser.ONEOF, 0); }
		public OneofNameContext oneofName() {
			return getRuleContext(OneofNameContext.class,0);
		}
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<OneofFieldContext> oneofField() {
			return getRuleContexts(OneofFieldContext.class);
		}
		public OneofFieldContext oneofField(int i) {
			return getRuleContext(OneofFieldContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public OneofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterOneof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitOneof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitOneof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofContext oneof() throws RecognitionException {
		OneofContext _localctx = new OneofContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_oneof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ONEOF);
			setState(204);
			oneofName();
			setState(205);
			match(LC);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1299291241275457534L) != 0)) {
				{
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(206);
					optionStatement();
					}
					break;
				case 2:
					{
					setState(207);
					oneofField();
					}
					break;
				case 3:
					{
					setState(208);
					emptyStatement_();
					}
					break;
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OneofFieldContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public TerminalNode LB() { return getToken(Protobuf2Parser.LB, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(Protobuf2Parser.RB, 0); }
		public OneofFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterOneofField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitOneofField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitOneofField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofFieldContext oneofField() throws RecognitionException {
		OneofFieldContext _localctx = new OneofFieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oneofField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			type_();
			setState(217);
			fieldName();
			setState(218);
			match(EQ);
			setState(219);
			fieldNumber();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(220);
				match(LB);
				setState(221);
				fieldOptions();
				setState(222);
				match(RB);
				}
			}

			setState(226);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapFieldContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(Protobuf2Parser.MAP, 0); }
		public TerminalNode LT() { return getToken(Protobuf2Parser.LT, 0); }
		public KeyTypeContext keyType() {
			return getRuleContext(KeyTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Protobuf2Parser.COMMA, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode GT() { return getToken(Protobuf2Parser.GT, 0); }
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public TerminalNode LB() { return getToken(Protobuf2Parser.LB, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(Protobuf2Parser.RB, 0); }
		public MapFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterMapField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitMapField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitMapField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapFieldContext mapField() throws RecognitionException {
		MapFieldContext _localctx = new MapFieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mapField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(MAP);
			setState(229);
			match(LT);
			setState(230);
			keyType();
			setState(231);
			match(COMMA);
			setState(232);
			type_();
			setState(233);
			match(GT);
			setState(234);
			mapName();
			setState(235);
			match(EQ);
			setState(236);
			fieldNumber();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(237);
				match(LB);
				setState(238);
				fieldOptions();
				setState(239);
				match(RB);
				}
			}

			setState(243);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyTypeContext extends ParserRuleContext {
		public TerminalNode INT32() { return getToken(Protobuf2Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf2Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf2Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf2Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf2Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf2Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf2Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf2Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf2Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf2Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf2Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf2Parser.STRING, 0); }
		public KeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitKeyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitKeyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyTypeContext keyType() throws RecognitionException {
		KeyTypeContext _localctx = new KeyTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33546240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(Protobuf2Parser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(Protobuf2Parser.FLOAT, 0); }
		public TerminalNode INT32() { return getToken(Protobuf2Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf2Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf2Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf2Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf2Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf2Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf2Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf2Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf2Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf2Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf2Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf2Parser.STRING, 0); }
		public TerminalNode BYTES() { return getToken(Protobuf2Parser.BYTES, 0); }
		public MessageTypeContext messageType() {
			return getRuleContext(MessageTypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_type_);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(DOUBLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(INT32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(INT64);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(UINT32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(UINT64);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(SINT32);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(SINT64);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				match(FIXED32);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				match(FIXED64);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				match(SFIXED32);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				match(SFIXED64);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(259);
				match(BOOL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(260);
				match(STRING);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(261);
				match(BYTES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(262);
				messageType();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(263);
				enumType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtensionsContext extends ParserRuleContext {
		public TerminalNode EXTENSIONS() { return getToken(Protobuf2Parser.EXTENSIONS, 0); }
		public RangesContext ranges() {
			return getRuleContext(RangesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public ExtensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterExtensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitExtensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitExtensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionsContext extensions() throws RecognitionException {
		ExtensionsContext _localctx = new ExtensionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(EXTENSIONS);
			setState(267);
			ranges();
			setState(268);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedContext extends ParserRuleContext {
		public TerminalNode RESERVED() { return getToken(Protobuf2Parser.RESERVED, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public RangesContext ranges() {
			return getRuleContext(RangesContext.class,0);
		}
		public ReservedFieldNamesContext reservedFieldNames() {
			return getRuleContext(ReservedFieldNamesContext.class,0);
		}
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reserved);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(RESERVED);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				{
				setState(271);
				ranges();
				}
				break;
			case PROTO2_LIT_SINGLE:
			case PROTO2_LIT_DOBULE:
			case STR_LIT:
				{
				setState(272);
				reservedFieldNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangesContext extends ParserRuleContext {
		public List<Range_Context> range_() {
			return getRuleContexts(Range_Context.class);
		}
		public Range_Context range_(int i) {
			return getRuleContext(Range_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf2Parser.COMMA, i);
		}
		public RangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterRanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitRanges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitRanges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangesContext ranges() throws RecognitionException {
		RangesContext _localctx = new RangesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ranges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			range_();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				range_();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_Context extends ParserRuleContext {
		public List<IntLitContext> intLit() {
			return getRuleContexts(IntLitContext.class);
		}
		public IntLitContext intLit(int i) {
			return getRuleContext(IntLitContext.class,i);
		}
		public TerminalNode TO() { return getToken(Protobuf2Parser.TO, 0); }
		public TerminalNode MAX() { return getToken(Protobuf2Parser.MAX, 0); }
		public Range_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterRange_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitRange_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitRange_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_Context range_() throws RecognitionException {
		Range_Context _localctx = new Range_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_range_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			intLit();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(286);
				match(TO);
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_LIT:
					{
					setState(287);
					intLit();
					}
					break;
				case MAX:
					{
					setState(288);
					match(MAX);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedFieldNamesContext extends ParserRuleContext {
		public List<StrLitContext> strLit() {
			return getRuleContexts(StrLitContext.class);
		}
		public StrLitContext strLit(int i) {
			return getRuleContext(StrLitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf2Parser.COMMA, i);
		}
		public ReservedFieldNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedFieldNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterReservedFieldNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitReservedFieldNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitReservedFieldNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedFieldNamesContext reservedFieldNames() throws RecognitionException {
		ReservedFieldNamesContext _localctx = new ReservedFieldNamesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_reservedFieldNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			strLit();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				strLit();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelDefContext extends ParserRuleContext {
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public ServiceDefContext serviceDef() {
			return getRuleContext(ServiceDefContext.class,0);
		}
		public ExtendDefContext extendDef() {
			return getRuleContext(ExtendDefContext.class,0);
		}
		public TopLevelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterTopLevelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitTopLevelDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitTopLevelDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDefContext topLevelDef() throws RecognitionException {
		TopLevelDefContext _localctx = new TopLevelDefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_topLevelDef);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MESSAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				messageDef();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				enumDef();
				}
				break;
			case SERVICE:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				serviceDef();
				}
				break;
			case EXTEND:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				extendDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Protobuf2Parser.ENUM, 0); }
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefContext enumDef() throws RecognitionException {
		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ENUM);
			setState(308);
			enumName();
			setState(309);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public List<EnumElementContext> enumElement() {
			return getRuleContexts(EnumElementContext.class);
		}
		public EnumElementContext enumElement(int i) {
			return getRuleContext(EnumElementContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LC);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297039441461772286L) != 0)) {
				{
				{
				setState(312);
				enumElement();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumElementContext extends ParserRuleContext {
		public OptionStatementContext optionStatement() {
			return getRuleContext(OptionStatementContext.class,0);
		}
		public EnumFieldContext enumField() {
			return getRuleContext(EnumFieldContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public EnumElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumElementContext enumElement() throws RecognitionException {
		EnumElementContext _localctx = new EnumElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumElement);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				optionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				enumField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				emptyStatement_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumFieldContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public TerminalNode MINUS() { return getToken(Protobuf2Parser.MINUS, 0); }
		public EnumValueOptionsContext enumValueOptions() {
			return getRuleContext(EnumValueOptionsContext.class,0);
		}
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			ident();
			setState(326);
			match(EQ);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(327);
				match(MINUS);
				}
			}

			setState(330);
			intLit();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(331);
				enumValueOptions();
				}
			}

			setState(334);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueOptionsContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(Protobuf2Parser.LB, 0); }
		public List<EnumValueOptionContext> enumValueOption() {
			return getRuleContexts(EnumValueOptionContext.class);
		}
		public EnumValueOptionContext enumValueOption(int i) {
			return getRuleContext(EnumValueOptionContext.class,i);
		}
		public TerminalNode RB() { return getToken(Protobuf2Parser.RB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Protobuf2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf2Parser.COMMA, i);
		}
		public EnumValueOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumValueOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumValueOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumValueOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueOptionsContext enumValueOptions() throws RecognitionException {
		EnumValueOptionsContext _localctx = new EnumValueOptionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumValueOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LB);
			setState(337);
			enumValueOption();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(338);
				match(COMMA);
				setState(339);
				enumValueOption();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueOptionContext extends ParserRuleContext {
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf2Parser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public EnumValueOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumValueOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumValueOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumValueOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueOptionContext enumValueOption() throws RecognitionException {
		EnumValueOptionContext _localctx = new EnumValueOptionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumValueOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			optionName();
			setState(348);
			match(EQ);
			setState(349);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MessageDefContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(Protobuf2Parser.MESSAGE, 0); }
		public MessageNameContext messageName() {
			return getRuleContext(MessageNameContext.class,0);
		}
		public MessageBodyContext messageBody() {
			return getRuleContext(MessageBodyContext.class,0);
		}
		public MessageDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterMessageDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitMessageDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitMessageDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageDefContext messageDef() throws RecognitionException {
		MessageDefContext _localctx = new MessageDefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_messageDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(MESSAGE);
			setState(352);
			messageName();
			setState(353);
			messageBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MessageBodyContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public List<MessageElementContext> messageElement() {
			return getRuleContexts(MessageElementContext.class);
		}
		public MessageElementContext messageElement(int i) {
			return getRuleContext(MessageElementContext.class,i);
		}
		public MessageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterMessageBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitMessageBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitMessageBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageBodyContext messageBody() throws RecognitionException {
		MessageBodyContext _localctx = new MessageBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_messageBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LC);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2229893340096L) != 0)) {
				{
				{
				setState(356);
				messageElement();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MessageElementContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public ExtendDefContext extendDef() {
			return getRuleContext(ExtendDefContext.class,0);
		}
		public OptionStatementContext optionStatement() {
			return getRuleContext(OptionStatementContext.class,0);
		}
		public OneofContext oneof() {
			return getRuleContext(OneofContext.class,0);
		}
		public MapFieldContext mapField() {
			return getRuleContext(MapFieldContext.class,0);
		}
		public ExtensionsContext extensions() {
			return getRuleContext(ExtensionsContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public MessageElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterMessageElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitMessageElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitMessageElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageElementContext messageElement() throws RecognitionException {
		MessageElementContext _localctx = new MessageElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_messageElement);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				enumDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				messageDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				extendDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				optionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				oneof();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				mapField();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				extensions();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				group();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
				reserved();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(374);
				emptyStatement_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendDefContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(Protobuf2Parser.EXTEND, 0); }
		public MessageTypeContext messageType() {
			return getRuleContext(MessageTypeContext.class,0);
		}
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public List<ExtendElementContext> extendElement() {
			return getRuleContexts(ExtendElementContext.class);
		}
		public ExtendElementContext extendElement(int i) {
			return getRuleContext(ExtendElementContext.class,i);
		}
		public ExtendDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterExtendDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitExtendDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitExtendDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendDefContext extendDef() throws RecognitionException {
		ExtendDefContext _localctx = new ExtendDefContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_extendDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(EXTEND);
			setState(378);
			messageType();
			setState(379);
			match(LC);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023256448L) != 0)) {
				{
				{
				setState(380);
				extendElement();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendElementContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ExtendElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterExtendElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitExtendElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitExtendElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendElementContext extendElement() throws RecognitionException {
		ExtendElementContext _localctx = new ExtendElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_extendElement);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				group();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				emptyStatement_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceDefContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(Protobuf2Parser.SERVICE, 0); }
		public ServiceNameContext serviceName() {
			return getRuleContext(ServiceNameContext.class,0);
		}
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public List<ServiceElementContext> serviceElement() {
			return getRuleContexts(ServiceElementContext.class);
		}
		public ServiceElementContext serviceElement(int i) {
			return getRuleContext(ServiceElementContext.class,i);
		}
		public ServiceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterServiceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitServiceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitServiceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDefContext serviceDef() throws RecognitionException {
		ServiceDefContext _localctx = new ServiceDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_serviceDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(SERVICE);
			setState(394);
			serviceName();
			setState(395);
			match(LC);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2405181685824L) != 0)) {
				{
				{
				setState(396);
				serviceElement();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceElementContext extends ParserRuleContext {
		public OptionStatementContext optionStatement() {
			return getRuleContext(OptionStatementContext.class,0);
		}
		public RpcContext rpc() {
			return getRuleContext(RpcContext.class,0);
		}
		public StreamContext stream() {
			return getRuleContext(StreamContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ServiceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterServiceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitServiceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitServiceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceElementContext serviceElement() throws RecognitionException {
		ServiceElementContext _localctx = new ServiceElementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_serviceElement);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				optionStatement();
				}
				break;
			case RPC:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				rpc();
				}
				break;
			case STREAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				stream();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				emptyStatement_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RpcContext extends ParserRuleContext {
		public TerminalNode RPC() { return getToken(Protobuf2Parser.RPC, 0); }
		public RpcNameContext rpcName() {
			return getRuleContext(RpcNameContext.class,0);
		}
		public List<TerminalNode> LP() { return getTokens(Protobuf2Parser.LP); }
		public TerminalNode LP(int i) {
			return getToken(Protobuf2Parser.LP, i);
		}
		public List<MessageTypeContext> messageType() {
			return getRuleContexts(MessageTypeContext.class);
		}
		public MessageTypeContext messageType(int i) {
			return getRuleContext(MessageTypeContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(Protobuf2Parser.RP); }
		public TerminalNode RP(int i) {
			return getToken(Protobuf2Parser.RP, i);
		}
		public TerminalNode RETURNS() { return getToken(Protobuf2Parser.RETURNS, 0); }
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public List<TerminalNode> STREAM() { return getTokens(Protobuf2Parser.STREAM); }
		public TerminalNode STREAM(int i) {
			return getToken(Protobuf2Parser.STREAM, i);
		}
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public RpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterRpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitRpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitRpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpcContext rpc() throws RecognitionException {
		RpcContext _localctx = new RpcContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(RPC);
			setState(411);
			rpcName();
			setState(412);
			match(LP);
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(413);
				match(STREAM);
				}
				break;
			}
			setState(416);
			messageType();
			setState(417);
			match(RP);
			setState(418);
			match(RETURNS);
			setState(419);
			match(LP);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(420);
				match(STREAM);
				}
				break;
			}
			setState(423);
			messageType();
			setState(424);
			match(RP);
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC:
				{
				setState(425);
				match(LC);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPTION || _la==SEMI) {
					{
					setState(428);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTION:
						{
						setState(426);
						optionStatement();
						}
						break;
					case SEMI:
						{
						setState(427);
						emptyStatement_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				match(RC);
				}
				break;
			case SEMI:
				{
				setState(434);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StreamContext extends ParserRuleContext {
		public TerminalNode STREAM() { return getToken(Protobuf2Parser.STREAM, 0); }
		public StreamNameContext streamName() {
			return getRuleContext(StreamNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(Protobuf2Parser.LP, 0); }
		public List<MessageTypeContext> messageType() {
			return getRuleContexts(MessageTypeContext.class);
		}
		public MessageTypeContext messageType(int i) {
			return getRuleContext(MessageTypeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(Protobuf2Parser.COMMA, 0); }
		public TerminalNode RP() { return getToken(Protobuf2Parser.RP, 0); }
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public StreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamContext stream() throws RecognitionException {
		StreamContext _localctx = new StreamContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(STREAM);
			setState(438);
			streamName();
			setState(439);
			match(LP);
			setState(440);
			messageType();
			setState(441);
			match(COMMA);
			setState(442);
			messageType();
			setState(443);
			match(RP);
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC:
				{
				setState(444);
				match(LC);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPTION || _la==SEMI) {
					{
					setState(447);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTION:
						{
						setState(445);
						optionStatement();
						}
						break;
					case SEMI:
						{
						setState(446);
						emptyStatement_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(452);
				match(RC);
				}
				break;
			case SEMI:
				{
				setState(453);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Protobuf2Parser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(Protobuf2Parser.PLUS, 0); }
		public FloatLitContext floatLit() {
			return getRuleContext(FloatLitContext.class,0);
		}
		public StrLitContext strLit() {
			return getRuleContext(StrLitContext.class,0);
		}
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public BlockLitContext blockLit() {
			return getRuleContext(BlockLitContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constant);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				fullIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(457);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(460);
				intLit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(461);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(464);
				floatLit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				strLit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				boolLit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(467);
				blockLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockLitContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(Protobuf2Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf2Parser.RC, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(Protobuf2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Protobuf2Parser.COLON, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public BlockLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterBlockLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitBlockLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitBlockLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockLitContext blockLit() throws RecognitionException {
		BlockLitContext _localctx = new BlockLitContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(LC);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297037242438516734L) != 0)) {
				{
				{
				setState(471);
				ident();
				setState(472);
				match(COLON);
				setState(473);
				constant();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Protobuf2Parser.SEMI, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Protobuf2Parser.IDENTIFIER, 0); }
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ident);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(IDENTIFIER);
				}
				break;
			case SYNTAX:
			case IMPORT:
			case WEAK:
			case PUBLIC:
			case PACKAGE:
			case OPTION:
			case REPEATED:
			case OPTIONAL:
			case REQUIRED:
			case GROUP:
			case ONEOF:
			case MAP:
			case INT32:
			case INT64:
			case UINT32:
			case UINT64:
			case SINT32:
			case SINT64:
			case FIXED32:
			case FIXED64:
			case SFIXED32:
			case SFIXED64:
			case BOOL:
			case STRING:
			case DOUBLE:
			case FLOAT:
			case BYTES:
			case RESERVED:
			case EXTENSIONS:
			case TO:
			case MAX:
			case ENUM:
			case EXTEND:
			case MESSAGE:
			case SERVICE:
			case RPC:
			case STREAM:
			case RETURNS:
			case BOOL_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				keywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullIdentContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf2Parser.DOT, i);
		}
		public FullIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterFullIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitFullIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitFullIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIdentContext fullIdent() throws RecognitionException {
		FullIdentContext _localctx = new FullIdentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fullIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			ident();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(489);
				match(DOT);
				setState(490);
				ident();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MessageNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MessageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterMessageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitMessageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitMessageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageNameContext messageName() throws RecognitionException {
		MessageNameContext _localctx = new MessageNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_messageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterGroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitGroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitGroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OneofNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public OneofNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterOneofName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitOneofName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitOneofName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofNameContext oneofName() throws RecognitionException {
		OneofNameContext _localctx = new OneofNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_oneofName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MapNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterMapName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitMapName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitMapName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapNameContext mapName() throws RecognitionException {
		MapNameContext _localctx = new MapNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mapName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ServiceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterServiceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitServiceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitServiceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceNameContext serviceName() throws RecognitionException {
		ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_serviceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RpcNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public RpcNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterRpcName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitRpcName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitRpcName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpcNameContext rpcName() throws RecognitionException {
		RpcNameContext _localctx = new RpcNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_rpcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StreamNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StreamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterStreamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitStreamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitStreamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamNameContext streamName() throws RecognitionException {
		StreamNameContext _localctx = new StreamNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_streamName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MessageTypeContext extends ParserRuleContext {
		public MessageNameContext messageName() {
			return getRuleContext(MessageNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf2Parser.DOT, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public MessageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterMessageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitMessageType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitMessageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageTypeContext messageType() throws RecognitionException {
		MessageTypeContext _localctx = new MessageTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_messageType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(514);
				match(DOT);
				}
			}

			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(517);
					ident();
					setState(518);
					match(DOT);
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(525);
			messageName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumTypeContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf2Parser.DOT, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_enumType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(527);
				match(DOT);
				}
			}

			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530);
					ident();
					setState(531);
					match(DOT);
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(538);
			enumName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntLitContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(Protobuf2Parser.INT_LIT, 0); }
		public IntLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitIntLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLitContext intLit() throws RecognitionException {
		IntLitContext _localctx = new IntLitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_intLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(INT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrLitContext extends ParserRuleContext {
		public TerminalNode STR_LIT() { return getToken(Protobuf2Parser.STR_LIT, 0); }
		public TerminalNode PROTO2_LIT_SINGLE() { return getToken(Protobuf2Parser.PROTO2_LIT_SINGLE, 0); }
		public TerminalNode PROTO2_LIT_DOBULE() { return getToken(Protobuf2Parser.PROTO2_LIT_DOBULE, 0); }
		public StrLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterStrLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitStrLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitStrLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrLitContext strLit() throws RecognitionException {
		StrLitContext _localctx = new StrLitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_strLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72059243305369600L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitContext extends ParserRuleContext {
		public TerminalNode BOOL_LIT() { return getToken(Protobuf2Parser.BOOL_LIT, 0); }
		public BoolLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterBoolLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitBoolLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLitContext boolLit() throws RecognitionException {
		BoolLitContext _localctx = new BoolLitContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_boolLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(BOOL_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatLitContext extends ParserRuleContext {
		public TerminalNode FLOAT_LIT() { return getToken(Protobuf2Parser.FLOAT_LIT, 0); }
		public FloatLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterFloatLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitFloatLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitFloatLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLitContext floatLit() throws RecognitionException {
		FloatLitContext _localctx = new FloatLitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_floatLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(FLOAT_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordsContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(Protobuf2Parser.SYNTAX, 0); }
		public TerminalNode IMPORT() { return getToken(Protobuf2Parser.IMPORT, 0); }
		public TerminalNode WEAK() { return getToken(Protobuf2Parser.WEAK, 0); }
		public TerminalNode PUBLIC() { return getToken(Protobuf2Parser.PUBLIC, 0); }
		public TerminalNode PACKAGE() { return getToken(Protobuf2Parser.PACKAGE, 0); }
		public TerminalNode OPTION() { return getToken(Protobuf2Parser.OPTION, 0); }
		public TerminalNode REPEATED() { return getToken(Protobuf2Parser.REPEATED, 0); }
		public TerminalNode OPTIONAL() { return getToken(Protobuf2Parser.OPTIONAL, 0); }
		public TerminalNode REQUIRED() { return getToken(Protobuf2Parser.REQUIRED, 0); }
		public TerminalNode GROUP() { return getToken(Protobuf2Parser.GROUP, 0); }
		public TerminalNode ONEOF() { return getToken(Protobuf2Parser.ONEOF, 0); }
		public TerminalNode MAP() { return getToken(Protobuf2Parser.MAP, 0); }
		public TerminalNode INT32() { return getToken(Protobuf2Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf2Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf2Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf2Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf2Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf2Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf2Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf2Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf2Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf2Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf2Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf2Parser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(Protobuf2Parser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(Protobuf2Parser.FLOAT, 0); }
		public TerminalNode BYTES() { return getToken(Protobuf2Parser.BYTES, 0); }
		public TerminalNode RESERVED() { return getToken(Protobuf2Parser.RESERVED, 0); }
		public TerminalNode EXTENSIONS() { return getToken(Protobuf2Parser.EXTENSIONS, 0); }
		public TerminalNode TO() { return getToken(Protobuf2Parser.TO, 0); }
		public TerminalNode MAX() { return getToken(Protobuf2Parser.MAX, 0); }
		public TerminalNode ENUM() { return getToken(Protobuf2Parser.ENUM, 0); }
		public TerminalNode MESSAGE() { return getToken(Protobuf2Parser.MESSAGE, 0); }
		public TerminalNode EXTEND() { return getToken(Protobuf2Parser.EXTEND, 0); }
		public TerminalNode SERVICE() { return getToken(Protobuf2Parser.SERVICE, 0); }
		public TerminalNode RPC() { return getToken(Protobuf2Parser.RPC, 0); }
		public TerminalNode STREAM() { return getToken(Protobuf2Parser.STREAM, 0); }
		public TerminalNode RETURNS() { return getToken(Protobuf2Parser.RETURNS, 0); }
		public TerminalNode BOOL_LIT() { return getToken(Protobuf2Parser.BOOL_LIT, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf2Listener ) ((Protobuf2Listener)listener).exitKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf2Visitor ) return ((Protobuf2Visitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 144115737831669758L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u0227\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000}\b\u0000"+
		"\n\u0000\f\u0000\u0080\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u008b\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a0\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a4\b\u0005\u0003\u0005\u00a6\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b3\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00ba\b\b\n\b"+
		"\f\b\u00bd\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d2\b\f\n\f"+
		"\f\f\u00d5\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00e1\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00f2\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0109\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0112\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0119\b\u0013\n\u0013"+
		"\f\u0013\u011c\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0122\b\u0014\u0003\u0014\u0124\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0129\b\u0015\n\u0015\f\u0015\u012c\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0132\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u013a\b\u0018\n\u0018\f\u0018\u013d\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0144\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0149\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u014d\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0155\b\u001b\n\u001b\f\u001b"+
		"\u0158\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u0166\b\u001e\n\u001e\f\u001e\u0169\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0178\b\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u017e"+
		"\b \n \f \u0181\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0188\b!"+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u018e\b\"\n\"\f\"\u0191\t\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u0199\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u019f\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01a6"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u01ad\b$\n$\f$\u01b0\t$"+
		"\u0001$\u0001$\u0003$\u01b4\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0005%\u01c0\b%\n%\f%\u01c3\t%\u0001%\u0001"+
		"%\u0003%\u01c7\b%\u0001&\u0001&\u0003&\u01cb\b&\u0001&\u0001&\u0003&\u01cf"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0003&\u01d5\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u01dc\b\'\n\'\f\'\u01df\t\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001)\u0001)\u0003)\u01e7\b)\u0001*\u0001*\u0001*\u0005"+
		"*\u01ec\b*\n*\f*\u01ef\t*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001"+
		".\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u00014\u00034\u0204\b4\u00014\u00014\u00014\u00054\u0209\b4\n"+
		"4\f4\u020c\t4\u00014\u00014\u00015\u00035\u0211\b5\u00015\u00015\u0001"+
		"5\u00055\u0216\b5\n5\f5\u0219\t5\u00015\u00015\u00016\u00016\u00017\u0001"+
		"7\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001:\u0000\u0000;\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0007\u0001"+
		"\u0000\'(\u0001\u0000\u0003\u0004\u0001\u0000\u0007\t\u0001\u0000\r\u0018"+
		"\u0001\u000067\u0002\u0000\'(88\u0002\u0000\u0001&99\u0241\u0000v\u0001"+
		"\u0000\u0000\u0000\u0002\u0083\u0001\u0000\u0000\u0000\u0004\u0088\u0001"+
		"\u0000\u0000\u0000\u0006\u008f\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000"+
		"\u0000\u0000\n\u00a5\u0001\u0000\u0000\u0000\f\u00a7\u0001\u0000\u0000"+
		"\u0000\u000e\u00a9\u0001\u0000\u0000\u0000\u0010\u00b6\u0001\u0000\u0000"+
		"\u0000\u0012\u00be\u0001\u0000\u0000\u0000\u0014\u00c2\u0001\u0000\u0000"+
		"\u0000\u0016\u00c4\u0001\u0000\u0000\u0000\u0018\u00cb\u0001\u0000\u0000"+
		"\u0000\u001a\u00d8\u0001\u0000\u0000\u0000\u001c\u00e4\u0001\u0000\u0000"+
		"\u0000\u001e\u00f5\u0001\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000"+
		"\"\u010a\u0001\u0000\u0000\u0000$\u010e\u0001\u0000\u0000\u0000&\u0115"+
		"\u0001\u0000\u0000\u0000(\u011d\u0001\u0000\u0000\u0000*\u0125\u0001\u0000"+
		"\u0000\u0000,\u0131\u0001\u0000\u0000\u0000.\u0133\u0001\u0000\u0000\u0000"+
		"0\u0137\u0001\u0000\u0000\u00002\u0143\u0001\u0000\u0000\u00004\u0145"+
		"\u0001\u0000\u0000\u00006\u0150\u0001\u0000\u0000\u00008\u015b\u0001\u0000"+
		"\u0000\u0000:\u015f\u0001\u0000\u0000\u0000<\u0163\u0001\u0000\u0000\u0000"+
		">\u0177\u0001\u0000\u0000\u0000@\u0179\u0001\u0000\u0000\u0000B\u0187"+
		"\u0001\u0000\u0000\u0000D\u0189\u0001\u0000\u0000\u0000F\u0198\u0001\u0000"+
		"\u0000\u0000H\u019a\u0001\u0000\u0000\u0000J\u01b5\u0001\u0000\u0000\u0000"+
		"L\u01d4\u0001\u0000\u0000\u0000N\u01d6\u0001\u0000\u0000\u0000P\u01e2"+
		"\u0001\u0000\u0000\u0000R\u01e6\u0001\u0000\u0000\u0000T\u01e8\u0001\u0000"+
		"\u0000\u0000V\u01f0\u0001\u0000\u0000\u0000X\u01f2\u0001\u0000\u0000\u0000"+
		"Z\u01f4\u0001\u0000\u0000\u0000\\\u01f6\u0001\u0000\u0000\u0000^\u01f8"+
		"\u0001\u0000\u0000\u0000`\u01fa\u0001\u0000\u0000\u0000b\u01fc\u0001\u0000"+
		"\u0000\u0000d\u01fe\u0001\u0000\u0000\u0000f\u0200\u0001\u0000\u0000\u0000"+
		"h\u0203\u0001\u0000\u0000\u0000j\u0210\u0001\u0000\u0000\u0000l\u021c"+
		"\u0001\u0000\u0000\u0000n\u021e\u0001\u0000\u0000\u0000p\u0220\u0001\u0000"+
		"\u0000\u0000r\u0222\u0001\u0000\u0000\u0000t\u0224\u0001\u0000\u0000\u0000"+
		"v~\u0003\u0002\u0001\u0000w}\u0003\u0004\u0002\u0000x}\u0003\u0006\u0003"+
		"\u0000y}\u0003\b\u0004\u0000z}\u0003,\u0016\u0000{}\u0003P(\u0000|w\u0001"+
		"\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005\u0000\u0000\u0001\u0082\u0001\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\u0001\u0000\u0000\u0084\u0085\u0005*\u0000\u0000\u0085\u0086"+
		"\u0007\u0000\u0000\u0000\u0086\u0087\u0005)\u0000\u0000\u0087\u0003\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0005\u0002\u0000\u0000\u0089\u008b\u0007"+
		"\u0001\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0003"+
		"n7\u0000\u008d\u008e\u0005)\u0000\u0000\u008e\u0005\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0005\u0000\u0000\u0090\u0091\u0003T*\u0000\u0091"+
		"\u0092\u0005)\u0000\u0000\u0092\u0007\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u0006\u0000\u0000\u0094\u0095\u0003\n\u0005\u0000\u0095\u0096\u0005"+
		"*\u0000\u0000\u0096\u0097\u0003L&\u0000\u0097\u0098\u0005)\u0000\u0000"+
		"\u0098\t\u0001\u0000\u0000\u0000\u0099\u00a6\u0003T*\u0000\u009a\u00a0"+
		"\u0003R)\u0000\u009b\u009c\u0005+\u0000\u0000\u009c\u009d\u0003T*\u0000"+
		"\u009d\u009e\u0005,\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f"+
		"\u009a\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a2\u00053\u0000\u0000\u00a2\u00a4"+
		"\u0003T*\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u0099\u0001\u0000"+
		"\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a6\u000b\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0007\u0002\u0000\u0000\u00a8\r\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0003\f\u0006\u0000\u00aa\u00ab\u0003 \u0010\u0000"+
		"\u00ab\u00ac\u0003Z-\u0000\u00ac\u00ad\u0005*\u0000\u0000\u00ad\u00b2"+
		"\u0003\u0014\n\u0000\u00ae\u00af\u0005-\u0000\u0000\u00af\u00b0\u0003"+
		"\u0010\b\u0000\u00b0\u00b1\u0005.\u0000\u0000\u00b1\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005)\u0000"+
		"\u0000\u00b5\u000f\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003\u0012\t\u0000"+
		"\u00b7\u00b8\u00054\u0000\u0000\u00b8\u00ba\u0003\u0012\t\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u0011\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0003\n\u0005\u0000\u00bf\u00c0\u0005*\u0000\u0000\u00c0\u00c1"+
		"\u0003L&\u0000\u00c1\u0013\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003l"+
		"6\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\f\u0006"+
		"\u0000\u00c5\u00c6\u0005\n\u0000\u0000\u00c6\u00c7\u0003\\.\u0000\u00c7"+
		"\u00c8\u0005*\u0000\u0000\u00c8\u00c9\u0003\u0014\n\u0000\u00c9\u00ca"+
		"\u0003<\u001e\u0000\u00ca\u0017\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"\u000b\u0000\u0000\u00cc\u00cd\u0003^/\u0000\u00cd\u00d3\u0005/\u0000"+
		"\u0000\u00ce\u00d2\u0003\b\u0004\u0000\u00cf\u00d2\u0003\u001a\r\u0000"+
		"\u00d0\u00d2\u0003P(\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u00050\u0000\u0000\u00d7\u0019\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0003 \u0010\u0000\u00d9\u00da\u0003Z-"+
		"\u0000\u00da\u00db\u0005*\u0000\u0000\u00db\u00e0\u0003\u0014\n\u0000"+
		"\u00dc\u00dd\u0005-\u0000\u0000\u00dd\u00de\u0003\u0010\b\u0000\u00de"+
		"\u00df\u0005.\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005)\u0000\u0000\u00e3\u001b\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\f\u0000\u0000\u00e5\u00e6\u00051"+
		"\u0000\u0000\u00e6\u00e7\u0003\u001e\u000f\u0000\u00e7\u00e8\u00054\u0000"+
		"\u0000\u00e8\u00e9\u0003 \u0010\u0000\u00e9\u00ea\u00052\u0000\u0000\u00ea"+
		"\u00eb\u0003`0\u0000\u00eb\u00ec\u0005*\u0000\u0000\u00ec\u00f1\u0003"+
		"\u0014\n\u0000\u00ed\u00ee\u0005-\u0000\u0000\u00ee\u00ef\u0003\u0010"+
		"\b\u0000\u00ef\u00f0\u0005.\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005)\u0000\u0000"+
		"\u00f4\u001d\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007\u0003\u0000\u0000"+
		"\u00f6\u001f\u0001\u0000\u0000\u0000\u00f7\u0109\u0005\u0019\u0000\u0000"+
		"\u00f8\u0109\u0005\u001a\u0000\u0000\u00f9\u0109\u0005\r\u0000\u0000\u00fa"+
		"\u0109\u0005\u000e\u0000\u0000\u00fb\u0109\u0005\u000f\u0000\u0000\u00fc"+
		"\u0109\u0005\u0010\u0000\u0000\u00fd\u0109\u0005\u0011\u0000\u0000\u00fe"+
		"\u0109\u0005\u0012\u0000\u0000\u00ff\u0109\u0005\u0013\u0000\u0000\u0100"+
		"\u0109\u0005\u0014\u0000\u0000\u0101\u0109\u0005\u0015\u0000\u0000\u0102"+
		"\u0109\u0005\u0016\u0000\u0000\u0103\u0109\u0005\u0017\u0000\u0000\u0104"+
		"\u0109\u0005\u0018\u0000\u0000\u0105\u0109\u0005\u001b\u0000\u0000\u0106"+
		"\u0109\u0003h4\u0000\u0107\u0109\u0003j5\u0000\u0108\u00f7\u0001\u0000"+
		"\u0000\u0000\u0108\u00f8\u0001\u0000\u0000\u0000\u0108\u00f9\u0001\u0000"+
		"\u0000\u0000\u0108\u00fa\u0001\u0000\u0000\u0000\u0108\u00fb\u0001\u0000"+
		"\u0000\u0000\u0108\u00fc\u0001\u0000\u0000\u0000\u0108\u00fd\u0001\u0000"+
		"\u0000\u0000\u0108\u00fe\u0001\u0000\u0000\u0000\u0108\u00ff\u0001\u0000"+
		"\u0000\u0000\u0108\u0100\u0001\u0000\u0000\u0000\u0108\u0101\u0001\u0000"+
		"\u0000\u0000\u0108\u0102\u0001\u0000\u0000\u0000\u0108\u0103\u0001\u0000"+
		"\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0109!\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u001d\u0000"+
		"\u0000\u010b\u010c\u0003&\u0013\u0000\u010c\u010d\u0005)\u0000\u0000\u010d"+
		"#\u0001\u0000\u0000\u0000\u010e\u0111\u0005\u001c\u0000\u0000\u010f\u0112"+
		"\u0003&\u0013\u0000\u0110\u0112\u0003*\u0015\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0005)\u0000\u0000\u0114%\u0001\u0000\u0000\u0000"+
		"\u0115\u011a\u0003(\u0014\u0000\u0116\u0117\u00054\u0000\u0000\u0117\u0119"+
		"\u0003(\u0014\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\'\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u0123\u0003l6\u0000\u011e\u0121\u0005\u001e\u0000\u0000"+
		"\u011f\u0122\u0003l6\u0000\u0120\u0122\u0005\u001f\u0000\u0000\u0121\u011f"+
		"\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0124"+
		"\u0001\u0000\u0000\u0000\u0123\u011e\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124)\u0001\u0000\u0000\u0000\u0125\u012a\u0003"+
		"n7\u0000\u0126\u0127\u00054\u0000\u0000\u0127\u0129\u0003n7\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"+\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0132"+
		"\u0003:\u001d\u0000\u012e\u0132\u0003.\u0017\u0000\u012f\u0132\u0003D"+
		"\"\u0000\u0130\u0132\u0003@ \u0000\u0131\u012d\u0001\u0000\u0000\u0000"+
		"\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000"+
		"\u0131\u0130\u0001\u0000\u0000\u0000\u0132-\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005 \u0000\u0000\u0134\u0135\u0003X,\u0000\u0135\u0136\u0003"+
		"0\u0018\u0000\u0136/\u0001\u0000\u0000\u0000\u0137\u013b\u0005/\u0000"+
		"\u0000\u0138\u013a\u00032\u0019\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u00050\u0000\u0000\u013f"+
		"1\u0001\u0000\u0000\u0000\u0140\u0144\u0003\b\u0004\u0000\u0141\u0144"+
		"\u00034\u001a\u0000\u0142\u0144\u0003P(\u0000\u0143\u0140\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u01443\u0001\u0000\u0000\u0000\u0145\u0146\u0003R)\u0000"+
		"\u0146\u0148\u0005*\u0000\u0000\u0147\u0149\u00057\u0000\u0000\u0148\u0147"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014c\u0003l6\u0000\u014b\u014d\u00036"+
		"\u001b\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0005)\u0000"+
		"\u0000\u014f5\u0001\u0000\u0000\u0000\u0150\u0151\u0005-\u0000\u0000\u0151"+
		"\u0156\u00038\u001c\u0000\u0152\u0153\u00054\u0000\u0000\u0153\u0155\u0003"+
		"8\u001c\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0005.\u0000\u0000\u015a7\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0003\n\u0005\u0000\u015c\u015d\u0005*\u0000\u0000\u015d"+
		"\u015e\u0003L&\u0000\u015e9\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\"\u0000\u0000\u0160\u0161\u0003V+\u0000\u0161\u0162\u0003<\u001e\u0000"+
		"\u0162;\u0001\u0000\u0000\u0000\u0163\u0167\u0005/\u0000\u0000\u0164\u0166"+
		"\u0003>\u001f\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0169\u0001"+
		"\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u00050\u0000\u0000\u016b=\u0001\u0000\u0000"+
		"\u0000\u016c\u0178\u0003\u000e\u0007\u0000\u016d\u0178\u0003.\u0017\u0000"+
		"\u016e\u0178\u0003:\u001d\u0000\u016f\u0178\u0003@ \u0000\u0170\u0178"+
		"\u0003\b\u0004\u0000\u0171\u0178\u0003\u0018\f\u0000\u0172\u0178\u0003"+
		"\u001c\u000e\u0000\u0173\u0178\u0003\"\u0011\u0000\u0174\u0178\u0003\u0016"+
		"\u000b\u0000\u0175\u0178\u0003$\u0012\u0000\u0176\u0178\u0003P(\u0000"+
		"\u0177\u016c\u0001\u0000\u0000\u0000\u0177\u016d\u0001\u0000\u0000\u0000"+
		"\u0177\u016e\u0001\u0000\u0000\u0000\u0177\u016f\u0001\u0000\u0000\u0000"+
		"\u0177\u0170\u0001\u0000\u0000\u0000\u0177\u0171\u0001\u0000\u0000\u0000"+
		"\u0177\u0172\u0001\u0000\u0000\u0000\u0177\u0173\u0001\u0000\u0000\u0000"+
		"\u0177\u0174\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0178?\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0005!\u0000\u0000\u017a\u017b\u0003h4\u0000\u017b\u017f\u0005"+
		"/\u0000\u0000\u017c\u017e\u0003B!\u0000\u017d\u017c\u0001\u0000\u0000"+
		"\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u00050\u0000\u0000"+
		"\u0183A\u0001\u0000\u0000\u0000\u0184\u0188\u0003\u000e\u0007\u0000\u0185"+
		"\u0188\u0003\u0016\u000b\u0000\u0186\u0188\u0003P(\u0000\u0187\u0184\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001"+
		"\u0000\u0000\u0000\u0188C\u0001\u0000\u0000\u0000\u0189\u018a\u0005#\u0000"+
		"\u0000\u018a\u018b\u0003b1\u0000\u018b\u018f\u0005/\u0000\u0000\u018c"+
		"\u018e\u0003F#\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001"+
		"\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u00050\u0000\u0000\u0193E\u0001\u0000\u0000"+
		"\u0000\u0194\u0199\u0003\b\u0004\u0000\u0195\u0199\u0003H$\u0000\u0196"+
		"\u0199\u0003J%\u0000\u0197\u0199\u0003P(\u0000\u0198\u0194\u0001\u0000"+
		"\u0000\u0000\u0198\u0195\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199G\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0005$\u0000\u0000\u019b\u019c\u0003d2\u0000\u019c"+
		"\u019e\u0005+\u0000\u0000\u019d\u019f\u0005%\u0000\u0000\u019e\u019d\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0003h4\u0000\u01a1\u01a2\u0005,\u0000"+
		"\u0000\u01a2\u01a3\u0005&\u0000\u0000\u01a3\u01a5\u0005+\u0000\u0000\u01a4"+
		"\u01a6\u0005%\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0003h4\u0000\u01a8\u01b3\u0005,\u0000\u0000\u01a9\u01ae\u0005/\u0000"+
		"\u0000\u01aa\u01ad\u0003\b\u0004\u0000\u01ab\u01ad\u0003P(\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b4\u00050\u0000\u0000\u01b2\u01b4"+
		"\u0005)\u0000\u0000\u01b3\u01a9\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b4I\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005%\u0000"+
		"\u0000\u01b6\u01b7\u0003f3\u0000\u01b7\u01b8\u0005+\u0000\u0000\u01b8"+
		"\u01b9\u0003h4\u0000\u01b9\u01ba\u00054\u0000\u0000\u01ba\u01bb\u0003"+
		"h4\u0000\u01bb\u01c6\u0005,\u0000\u0000\u01bc\u01c1\u0005/\u0000\u0000"+
		"\u01bd\u01c0\u0003\b\u0004\u0000\u01be\u01c0\u0003P(\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c7\u00050\u0000\u0000\u01c5\u01c7\u0005"+
		")\u0000\u0000\u01c6\u01bc\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c7K\u0001\u0000\u0000\u0000\u01c8\u01d5\u0003T*\u0000"+
		"\u01c9\u01cb\u0007\u0004\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01d5\u0003l6\u0000\u01cd\u01cf\u0007\u0004\u0000\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d5\u0003r9\u0000\u01d1\u01d5\u0003n"+
		"7\u0000\u01d2\u01d5\u0003p8\u0000\u01d3\u01d5\u0003N\'\u0000\u01d4\u01c8"+
		"\u0001\u0000\u0000\u0000\u01d4\u01ca\u0001\u0000\u0000\u0000\u01d4\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5M\u0001"+
		"\u0000\u0000\u0000\u01d6\u01dd\u0005/\u0000\u0000\u01d7\u01d8\u0003R)"+
		"\u0000\u01d8\u01d9\u00055\u0000\u0000\u01d9\u01da\u0003L&\u0000\u01da"+
		"\u01dc\u0001\u0000\u0000\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01dc"+
		"\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1\u00050\u0000\u0000\u01e1O\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\u0005)\u0000\u0000\u01e3Q\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e7\u0005<\u0000\u0000\u01e5\u01e7\u0003t:\u0000\u01e6"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7"+
		"S\u0001\u0000\u0000\u0000\u01e8\u01ed\u0003R)\u0000\u01e9\u01ea\u0005"+
		"3\u0000\u0000\u01ea\u01ec\u0003R)\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01eeU\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f1\u0003R)\u0000\u01f1W"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003R)\u0000\u01f3Y\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0003R)\u0000\u01f5[\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0003R)\u0000\u01f7]\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0003R)\u0000\u01f9_\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003R)\u0000"+
		"\u01fba\u0001\u0000\u0000\u0000\u01fc\u01fd\u0003R)\u0000\u01fdc\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0003R)\u0000\u01ffe\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0003R)\u0000\u0201g\u0001\u0000\u0000\u0000\u0202"+
		"\u0204\u00053\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204\u020a\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0003R)\u0000\u0206\u0207\u00053\u0000\u0000\u0207\u0209\u0001\u0000"+
		"\u0000\u0000\u0208\u0205\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000"+
		"\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0003V+\u0000\u020ei\u0001\u0000\u0000\u0000"+
		"\u020f\u0211\u00053\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0217\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0003R)\u0000\u0213\u0214\u00053\u0000\u0000\u0214\u0216\u0001"+
		"\u0000\u0000\u0000\u0215\u0212\u0001\u0000\u0000\u0000\u0216\u0219\u0001"+
		"\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u0217\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0003X,\u0000\u021bk\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005;\u0000\u0000\u021dm\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0007\u0005\u0000\u0000\u021fo\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u00059\u0000\u0000\u0221q\u0001\u0000\u0000\u0000\u0222\u0223\u0005:"+
		"\u0000\u0000\u0223s\u0001\u0000\u0000\u0000\u0224\u0225\u0007\u0006\u0000"+
		"\u0000\u0225u\u0001\u0000\u0000\u00000|~\u008a\u009f\u00a3\u00a5\u00b2"+
		"\u00bb\u00d1\u00d3\u00e0\u00f1\u0108\u0111\u011a\u0121\u0123\u012a\u0131"+
		"\u013b\u0143\u0148\u014c\u0156\u0167\u0177\u017f\u0187\u018f\u0198\u019e"+
		"\u01a5\u01ac\u01ae\u01b3\u01bf\u01c1\u01c6\u01ca\u01ce\u01d4\u01dd\u01e6"+
		"\u01ed\u0203\u020a\u0210\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}