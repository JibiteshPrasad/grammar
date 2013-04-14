// Generated from CDLMRv1.g4 by ANTLR 4.0
package org.gb.cdl.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CDLMRv1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, IntegerLiteral=38, 
		BooleanLiteral=39, Identifier=40, MUL=41, DIV=42, ADD=43, SUB=44, DecimalLiteral=45, 
		DigitList=46, CharacterLiteral=47, StringLiteral=48, WS=49, COMMENT=50, 
		LINE_COMMENT=51, LINE_TERMINATOR=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'long'", "']'", "'short'", "'default'", "','", "'['", "'or'", 
		"'return record'", "'('", "'if'", "'<'", "'int'", "'!='", "'void'", "'{'", 
		"'double'", "'and'", "'else'", "'}'", "'boolean'", "'float'", "'char'", 
		"'%'", "'byte'", "')'", "'.'", "'function'", "'@'", "'='", "'return'", 
		"'String'", "'function.'", "'>'", "'null'", "'=='", "'~'", "'!'", "IntegerLiteral", 
		"BooleanLiteral", "Identifier", "'*'", "'/'", "'+'", "'-'", "DecimalLiteral", 
		"DigitList", "CharacterLiteral", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT", 
		"';'"
	};
	public static final int
		RULE_mapreduce = 0, RULE_maporreduce = 1, RULE_annotation = 2, RULE_annotationName = 3, 
		RULE_elementValuePairs = 4, RULE_elementValuePair = 5, RULE_elementValue = 6, 
		RULE_elementValueArrayInitializer = 7, RULE_defaultValue = 8, RULE_functionDeclaration = 9, 
		RULE_functionParamList = 10, RULE_functionParam = 11, RULE_functionBody = 12, 
		RULE_block = 13, RULE_blockStatement = 14, RULE_statement = 15, RULE_ifStatement = 16, 
		RULE_returnThis = 17, RULE_returnStatement = 18, RULE_functionCall = 19, 
		RULE_paramlist = 20, RULE_parExpression = 21, RULE_returnType = 22, RULE_expression = 23, 
		RULE_expressionList = 24, RULE_literal = 25, RULE_primitiveType = 26;
	public static final String[] ruleNames = {
		"mapreduce", "maporreduce", "annotation", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "defaultValue", 
		"functionDeclaration", "functionParamList", "functionParam", "functionBody", 
		"block", "blockStatement", "statement", "ifStatement", "returnThis", "returnStatement", 
		"functionCall", "paramlist", "parExpression", "returnType", "expression", 
		"expressionList", "literal", "primitiveType"
	};

	@Override
	public String getGrammarFileName() { return "CDLMRv1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CDLMRv1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MapreduceContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public MaporreduceContext maporreduce() {
			return getRuleContext(MaporreduceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CDLMRv1Parser.EOF, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public MapreduceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapreduce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterMapreduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitMapreduce(this);
		}
	}

	public final MapreduceContext mapreduce() throws RecognitionException {
		MapreduceContext _localctx = new MapreduceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mapreduce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if (_la==28) {
				{
				setState(54); maporreduce();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==27) {
				{
				{
				setState(57); functionDeclaration();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(EOF);
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

	public static class MaporreduceContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public MaporreduceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maporreduce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterMaporreduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitMaporreduce(this);
		}
	}

	public final MaporreduceContext maporreduce() throws RecognitionException {
		MaporreduceContext _localctx = new MaporreduceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_maporreduce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65); annotation();
			setState(66); functionDeclaration();
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(28);
			setState(69); annotationName();
			setState(76);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(70); match(9);
				setState(73);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(71); elementValuePairs();
					}
					break;
				case 9:
				case 15:
				case 32:
				case 34:
				case 36:
				case 37:
				case IntegerLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
					{
					setState(72); elementValue();
					}
					break;
				case 25:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); match(25);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(CDLMRv1Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CDLMRv1Parser.Identifier); }
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(Identifier);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==26) {
				{
				{
				setState(79); match(26);
				setState(80); match(Identifier);
				}
				}
				setState(85);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); elementValuePair();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(87); match(5);
				setState(88); elementValuePair();
				}
				}
				setState(93);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLMRv1Parser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(Identifier);
			setState(95); match(29);
			setState(96); elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementValue);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case 9:
			case 32:
			case 36:
			case 37:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); expression(0);
				}
				break;
			case 34:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); literal();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(15);
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 15) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(104); elementValue();
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(105); match(5);
						setState(106); elementValue();
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
			}

			setState(115);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(114); match(5);
				}
			}

			setState(117); match(19);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(4);
			setState(120); elementValue();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionParamListContext functionParamList() {
			return getRuleContext(FunctionParamListContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLMRv1Parser.Identifier, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(27);
			setState(123); returnType();
			setState(124); match(Identifier);
			setState(125); match(9);
			setState(127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 12) | (1L << 16) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 24) | (1L << 31))) != 0)) {
				{
				setState(126); functionParamList();
				}
			}

			setState(129); match(25);
			setState(130); functionBody();
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

	public static class FunctionParamListContext extends ParserRuleContext {
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterFunctionParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitFunctionParamList(this);
		}
	}

	public final FunctionParamListContext functionParamList() throws RecognitionException {
		FunctionParamListContext _localctx = new FunctionParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); functionParam();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(133); match(5);
				setState(134); functionParam();
				}
				}
				setState(139);
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

	public static class FunctionParamContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLMRv1Parser.Identifier, 0); }
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitFunctionParam(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); primitiveType();
			setState(141); match(Identifier);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); block();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(15);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 10) | (1L << 15) | (1L << 30) | (1L << 32) | (1L << 36) | (1L << 37) | (1L << LINE_TERMINATOR))) != 0)) {
				{
				{
				setState(146); blockStatement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152); match(19);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); statement();
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnThisContext returnThis() {
			return getRuleContext(ReturnThisContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); ifStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158); returnStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); match(LINE_TERMINATOR);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160); expression(0);
				setState(161); match(LINE_TERMINATOR);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163); match(30);
				setState(164); literal();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165); returnThis();
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

	public static class IfStatementContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(10);
			setState(169); parExpression();
			setState(170); block();
			setState(173);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(171); match(18);
				setState(172); block();
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

	public static class ReturnThisContext extends ParserRuleContext {
		public ReturnThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnThis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterReturnThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitReturnThis(this);
		}
	}

	public final ReturnThisContext returnThis() throws RecognitionException {
		ReturnThisContext _localctx = new ReturnThisContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(8);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(30);
			setState(179);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 32) | (1L << 36) | (1L << 37))) != 0)) {
				{
				setState(178); expression(0);
				}
			}

			setState(181); match(LINE_TERMINATOR);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLMRv1Parser.Identifier, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(32);
			setState(184); match(Identifier);
			setState(185); match(9);
			setState(186); paramlist();
			setState(187); match(25);
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

	public static class ParamlistContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(CDLMRv1Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CDLMRv1Parser.Identifier); }
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitParamlist(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(189); match(Identifier);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(192); match(5);
				setState(193); match(Identifier);
				}
				}
				setState(198);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(9);
			setState(200); expression(0);
			setState(201); match(25);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnType);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(14);
				}
				break;
			case 34:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); literal();
				}
				break;
			case 1:
			case 3:
			case 12:
			case 16:
			case 20:
			case 21:
			case 22:
			case 24:
			case 31:
				enterOuterAlt(_localctx, 3);
				{
				setState(205); primitiveType();
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLMRv1Parser.Identifier, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			switch (_input.LA(1)) {
			case 36:
			case 37:
				{
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==36 || _la==37) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(210); expression(7);
				}
				break;
			case 9:
				{
				setState(211); match(9);
				setState(212); expression(0);
				setState(213); match(25);
				}
				break;
			case 32:
				{
				setState(215); functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(219);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 23) | (1L << MUL) | (1L << DIV))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(220); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(222);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(223); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(231);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(225); match(11);
							setState(226); match(29);
							}
							break;

						case 2:
							{
							setState(227); match(33);
							setState(228); match(29);
							}
							break;

						case 3:
							{
							setState(229); match(33);
							}
							break;

						case 4:
							{
							setState(230); match(11);
							}
							break;
						}
						setState(233); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(235);
						_la = _input.LA(1);
						if ( !(_la==13 || _la==35) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(236); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(238); match(17);
						setState(239); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(241); match(7);
						setState(242); expression(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(244); match(26);
						setState(245); match(Identifier);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(247); match(6);
						setState(248); expression(0);
						setState(249); match(2);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(252); match(9);
						setState(254);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 32) | (1L << 36) | (1L << 37))) != 0)) {
							{
							setState(253); expressionList();
							}
						}

						setState(256); match(25);
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); expression(0);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(263); match(5);
				setState(264); expression(0);
				}
				}
				setState(269);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CDLMRv1Parser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(CDLMRv1Parser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(CDLMRv1Parser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(CDLMRv1Parser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLMRv1Listener ) ((CDLMRv1Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 12) | (1L << 16) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 24) | (1L << 31))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;

		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;

		case 6: return 10 >= _localctx._p;

		case 7: return 9 >= _localctx._p;

		case 8: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\66\u0115\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\5\2:\n\2\3\2"+
		"\7\2=\n\2\f\2\16\2@\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4L"+
		"\n\4\3\4\5\4O\n\4\3\5\3\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\6\7\6"+
		"\\\n\6\f\6\16\6_\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bh\n\b\3\t\3\t\3\t"+
		"\3\t\7\tn\n\t\f\t\16\tq\13\t\5\ts\n\t\3\t\5\tv\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0082\n\13\3\13\3\13\3\13\3\f\3\f\3\f\7"+
		"\f\u008a\n\f\f\f\16\f\u008d\13\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\7\17"+
		"\u0096\n\17\f\17\16\17\u0099\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a9\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00b0\n\22\3\23\3\23\3\24\3\24\5\24\u00b6\n\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u00c1\n\26\3\26\3\26\7\26\u00c5"+
		"\n\26\f\26\16\26\u00c8\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00d1"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00db\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ea\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0101\n\31\3\31\7\31\u0104\n"+
		"\31\f\31\16\31\u0107\13\31\3\32\3\32\3\32\7\32\u010c\n\32\f\32\16\32\u010f"+
		"\13\32\3\33\3\33\3\34\3\34\3\34\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\b\3&\'\4\31\31+,\3-.\4\17\17%%\5$$()\61"+
		"\62\t\3\3\5\5\16\16\22\22\26\30\32\32!!\u0124\29\3\2\2\2\4C\3\2\2\2\6"+
		"F\3\2\2\2\bP\3\2\2\2\nX\3\2\2\2\f`\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22"+
		"y\3\2\2\2\24|\3\2\2\2\26\u0086\3\2\2\2\30\u008e\3\2\2\2\32\u0091\3\2\2"+
		"\2\34\u0093\3\2\2\2\36\u009c\3\2\2\2 \u00a8\3\2\2\2\"\u00aa\3\2\2\2$\u00b1"+
		"\3\2\2\2&\u00b3\3\2\2\2(\u00b9\3\2\2\2*\u00c0\3\2\2\2,\u00c9\3\2\2\2."+
		"\u00d0\3\2\2\2\60\u00da\3\2\2\2\62\u0108\3\2\2\2\64\u0110\3\2\2\2\66\u0112"+
		"\3\2\2\28:\5\4\3\298\3\2\2\29:\3\2\2\2:>\3\2\2\2;=\5\24\13\2<;\3\2\2\2"+
		"=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\1\2\2B\3\3\2\2"+
		"\2CD\5\6\4\2DE\5\24\13\2E\5\3\2\2\2FG\7\36\2\2GN\5\b\5\2HK\7\13\2\2IL"+
		"\5\n\6\2JL\5\16\b\2KI\3\2\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\7\33\2\2"+
		"NH\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PU\7*\2\2QR\7\34\2\2RT\7*\2\2SQ\3\2\2\2"+
		"TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU\3\2\2\2X]\5\f\7\2YZ\7\7\2"+
		"\2Z\\\5\f\7\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_]\3"+
		"\2\2\2`a\7*\2\2ab\7\37\2\2bc\5\16\b\2c\r\3\2\2\2dh\5\60\31\2eh\5\64\33"+
		"\2fh\5\20\t\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\17\3\2\2\2ir\7\21\2\2jo\5"+
		"\16\b\2kl\7\7\2\2ln\5\16\b\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p"+
		"s\3\2\2\2qo\3\2\2\2rj\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\7\7\2\2ut\3\2\2\2"+
		"uv\3\2\2\2vw\3\2\2\2wx\7\25\2\2x\21\3\2\2\2yz\7\6\2\2z{\5\16\b\2{\23\3"+
		"\2\2\2|}\7\35\2\2}~\5.\30\2~\177\7*\2\2\177\u0081\7\13\2\2\u0080\u0082"+
		"\5\26\f\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\7\33\2\2\u0084\u0085\5\32\16\2\u0085\25\3\2\2\2\u0086\u008b"+
		"\5\30\r\2\u0087\u0088\7\7\2\2\u0088\u008a\5\30\r\2\u0089\u0087\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\27"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\66\34\2\u008f\u0090\7*\2\2"+
		"\u0090\31\3\2\2\2\u0091\u0092\5\34\17\2\u0092\33\3\2\2\2\u0093\u0097\7"+
		"\21\2\2\u0094\u0096\5\36\20\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\7\25\2\2\u009b\35\3\2\2\2\u009c\u009d\5 \21\2\u009d"+
		"\37\3\2\2\2\u009e\u00a9\5\34\17\2\u009f\u00a9\5\"\22\2\u00a0\u00a9\5&"+
		"\24\2\u00a1\u00a9\7\66\2\2\u00a2\u00a3\5\60\31\2\u00a3\u00a4\7\66\2\2"+
		"\u00a4\u00a9\3\2\2\2\u00a5\u00a6\7 \2\2\u00a6\u00a9\5\64\33\2\u00a7\u00a9"+
		"\5$\23\2\u00a8\u009e\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8"+
		"\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9!\3\2\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\5,\27\2\u00ac\u00af"+
		"\5\34\17\2\u00ad\u00ae\7\24\2\2\u00ae\u00b0\5\34\17\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0#\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2%\3\2"+
		"\2\2\u00b3\u00b5\7 \2\2\u00b4\u00b6\5\60\31\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\66\2\2\u00b8\'\3\2\2"+
		"\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7*\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd"+
		"\5*\26\2\u00bd\u00be\7\33\2\2\u00be)\3\2\2\2\u00bf\u00c1\7*\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c6\3\2\2\2\u00c2\u00c3\7\7"+
		"\2\2\u00c3\u00c5\7*\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7+\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00ca\7\13\2\2\u00ca\u00cb\5\60\31\2\u00cb\u00cc\7\33\2\2\u00cc"+
		"-\3\2\2\2\u00cd\u00d1\7\20\2\2\u00ce\u00d1\5\64\33\2\u00cf\u00d1\5\66"+
		"\34\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"/\3\2\2\2\u00d2\u00d3\b\31\1\2\u00d3\u00d4\t\2\2\2\u00d4\u00db\5\60\31"+
		"\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\5\60\31\2\u00d7\u00d8\7\33\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00db\5(\25\2\u00da\u00d2\3\2\2\2\u00da\u00d5\3\2"+
		"\2\2\u00da\u00d9\3\2\2\2\u00db\u0105\3\2\2\2\u00dc\u00dd\6\31\2\3\u00dd"+
		"\u00de\t\3\2\2\u00de\u0104\5\60\31\2\u00df\u00e0\6\31\3\3\u00e0\u00e1"+
		"\t\4\2\2\u00e1\u0104\5\60\31\2\u00e2\u00e9\6\31\4\3\u00e3\u00e4\7\r\2"+
		"\2\u00e4\u00ea\7\37\2\2\u00e5\u00e6\7#\2\2\u00e6\u00ea\7\37\2\2\u00e7"+
		"\u00ea\7#\2\2\u00e8\u00ea\7\r\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e5\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u0104\5\60\31\2\u00ec\u00ed\6\31\5\3\u00ed\u00ee\t\5\2\2\u00ee\u0104"+
		"\5\60\31\2\u00ef\u00f0\6\31\6\3\u00f0\u00f1\7\23\2\2\u00f1\u0104\5\60"+
		"\31\2\u00f2\u00f3\6\31\7\3\u00f3\u00f4\7\t\2\2\u00f4\u0104\5\60\31\2\u00f5"+
		"\u00f6\6\31\b\3\u00f6\u00f7\7\34\2\2\u00f7\u0104\7*\2\2\u00f8\u00f9\6"+
		"\31\t\3\u00f9\u00fa\7\b\2\2\u00fa\u00fb\5\60\31\2\u00fb\u00fc\7\4\2\2"+
		"\u00fc\u0104\3\2\2\2\u00fd\u00fe\6\31\n\3\u00fe\u0100\7\13\2\2\u00ff\u0101"+
		"\5\62\32\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0104\7\33\2\2\u0103\u00dc\3\2\2\2\u0103\u00df\3\2\2\2\u0103\u00e2"+
		"\3\2\2\2\u0103\u00ec\3\2\2\2\u0103\u00ef\3\2\2\2\u0103\u00f2\3\2\2\2\u0103"+
		"\u00f5\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00fd\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\61\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010d\5\60\31\2\u0109\u010a\7\7\2\2\u010a\u010c\5\60\31"+
		"\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\63\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\t\6\2\2\u0111"+
		"\65\3\2\2\2\u0112\u0113\t\7\2\2\u0113\67\3\2\2\2\339>KNU]goru\u0081\u008b"+
		"\u0097\u00a8\u00af\u00b5\u00c0\u00c6\u00d0\u00da\u00e9\u0100\u0103\u0105"+
		"\u010d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}