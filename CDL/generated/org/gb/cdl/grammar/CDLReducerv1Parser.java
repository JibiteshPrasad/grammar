// Generated from CDLReducerv1.g4 by ANTLR 4.0
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
public class CDLReducerv1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		IntegerLiteral=40, BooleanLiteral=41, Identifier=42, MUL=43, DIV=44, ADD=45, 
		SUB=46, DecimalLiteral=47, DigitList=48, CharacterLiteral=49, StringLiteral=50, 
		WS=51, COMMENT=52, LINE_COMMENT=53, LINE_TERMINATOR=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'long'", "']'", "'short'", "'default'", "','", "'['", "'or'", 
		"'return record'", "'('", "'if'", "'<'", "'int'", "'!='", "'void'", "'{'", 
		"'double'", "'and'", "'}'", "'boolean'", "'float'", "'char'", "'%'", "'byte'", 
		"')'", "'.'", "'function'", "'@'", "'sfunction.'", "'='", "'return'", 
		"'String'", "'Text'", "'function.'", "'>'", "'null'", "'IntWritable'", 
		"'=='", "'~'", "'!'", "IntegerLiteral", "BooleanLiteral", "Identifier", 
		"'*'", "'/'", "'+'", "'-'", "DecimalLiteral", "DigitList", "CharacterLiteral", 
		"StringLiteral", "WS", "COMMENT", "LINE_COMMENT", "';'"
	};
	public static final int
		RULE_reduce = 0, RULE_maporreduce = 1, RULE_annotation = 2, RULE_annotationName = 3, 
		RULE_elementValuePairs = 4, RULE_elementValuePair = 5, RULE_elementValue = 6, 
		RULE_elementValueArrayInitializer = 7, RULE_defaultValue = 8, RULE_functionDeclaration = 9, 
		RULE_functionParamList = 10, RULE_functionParam = 11, RULE_functionBody = 12, 
		RULE_block = 13, RULE_blockStatement = 14, RULE_statement = 15, RULE_ifStatement = 16, 
		RULE_returnThis = 17, RULE_returnStatement = 18, RULE_staticFunctionCall = 19, 
		RULE_functionCall = 20, RULE_paramlist = 21, RULE_parExpression = 22, 
		RULE_returnType = 23, RULE_expression = 24, RULE_expressionList = 25, 
		RULE_literal = 26, RULE_primitiveType = 27;
	public static final String[] ruleNames = {
		"reduce", "maporreduce", "annotation", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "defaultValue", 
		"functionDeclaration", "functionParamList", "functionParam", "functionBody", 
		"block", "blockStatement", "statement", "ifStatement", "returnThis", "returnStatement", 
		"staticFunctionCall", "functionCall", "paramlist", "parExpression", "returnType", 
		"expression", "expressionList", "literal", "primitiveType"
	};

	@Override
	public String getGrammarFileName() { return "CDLReducerv1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CDLReducerv1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReduceContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public MaporreduceContext maporreduce() {
			return getRuleContext(MaporreduceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CDLReducerv1Parser.EOF, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public ReduceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterReduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitReduce(this);
		}
	}

	public final ReduceContext reduce() throws RecognitionException {
		ReduceContext _localctx = new ReduceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reduce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(56); maporreduce();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==26) {
				{
				{
				setState(59); functionDeclaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(EOF);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterMaporreduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitMaporreduce(this);
		}
	}

	public final MaporreduceContext maporreduce() throws RecognitionException {
		MaporreduceContext _localctx = new MaporreduceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_maporreduce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67); annotation();
			setState(68); functionDeclaration();
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(27);
			setState(71); annotationName();
			setState(78);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(72); match(9);
				setState(75);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(73); elementValuePairs();
					}
					break;
				case 9:
				case 15:
				case 28:
				case 33:
				case 35:
				case 38:
				case 39:
				case IntegerLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
					{
					setState(74); elementValue();
					}
					break;
				case 24:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); match(24);
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
			return getToken(CDLReducerv1Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CDLReducerv1Parser.Identifier); }
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(Identifier);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==25) {
				{
				{
				setState(81); match(25);
				setState(82); match(Identifier);
				}
				}
				setState(87);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); elementValuePair();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(89); match(5);
				setState(90); elementValuePair();
				}
				}
				setState(95);
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
		public TerminalNode Identifier() { return getToken(CDLReducerv1Parser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(Identifier);
			setState(97); match(29);
			setState(98); elementValue();
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementValue);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case 9:
			case 28:
			case 33:
			case 38:
			case 39:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); expression(0);
				}
				break;
			case 35:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); literal();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); elementValueArrayInitializer();
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitElementValueArrayInitializer(this);
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
			setState(105); match(15);
			setState(114);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 35) | (1L << 38) | (1L << 39) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(106); elementValue();
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(107); match(5);
						setState(108); elementValue();
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
			}

			setState(117);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(116); match(5);
				}
			}

			setState(119); match(18);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(4);
			setState(122); elementValue();
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
		public TerminalNode Identifier() { return getToken(CDLReducerv1Parser.Identifier, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(26);
			setState(125); returnType();
			setState(126); match(Identifier);
			setState(127); match(9);
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 12) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 31) | (1L << 32) | (1L << 36))) != 0)) {
				{
				setState(128); functionParamList();
				}
			}

			setState(131); match(24);
			setState(132); functionBody();
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterFunctionParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitFunctionParamList(this);
		}
	}

	public final FunctionParamListContext functionParamList() throws RecognitionException {
		FunctionParamListContext _localctx = new FunctionParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); functionParam();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(135); match(5);
				setState(136); functionParam();
				}
				}
				setState(141);
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
		public TerminalNode Identifier() { return getToken(CDLReducerv1Parser.Identifier, 0); }
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitFunctionParam(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); primitiveType();
			setState(143); match(Identifier);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); block();
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(15);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 10) | (1L << 15) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 38) | (1L << 39) | (1L << LINE_TERMINATOR))) != 0)) {
				{
				{
				setState(148); blockStatement();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); match(18);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); statement();
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); ifStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160); returnStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161); match(LINE_TERMINATOR);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162); expression(0);
				setState(163); match(LINE_TERMINATOR);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165); match(30);
				setState(166); literal();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167); returnThis();
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
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(10);
			setState(171); parExpression();
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(172); block();
				}
				break;
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterReturnThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitReturnThis(this);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitReturnStatement(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 28) | (1L << 33) | (1L << 38) | (1L << 39))) != 0)) {
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

	public static class StaticFunctionCallContext extends ParserRuleContext {
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLReducerv1Parser.Identifier, 0); }
		public StaticFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterStaticFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitStaticFunctionCall(this);
		}
	}

	public final StaticFunctionCallContext staticFunctionCall() throws RecognitionException {
		StaticFunctionCallContext _localctx = new StaticFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_staticFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(28);
			setState(184); match(Identifier);
			setState(185); match(9);
			setState(186); paramlist();
			setState(187); match(24);
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
		public TerminalNode Identifier() { return getToken(CDLReducerv1Parser.Identifier, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(33);
			setState(190); match(Identifier);
			setState(191); match(9);
			setState(192); paramlist();
			setState(193); match(24);
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
			return getToken(CDLReducerv1Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CDLReducerv1Parser.Identifier); }
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitParamlist(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(195); match(Identifier);
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(198); match(5);
				setState(199); match(Identifier);
				}
				}
				setState(204);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(9);
			setState(206); expression(0);
			setState(207); match(24);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnType);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(14);
				}
				break;
			case 35:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); literal();
				}
				break;
			case 1:
			case 3:
			case 12:
			case 16:
			case 19:
			case 20:
			case 21:
			case 23:
			case 31:
			case 32:
			case 36:
				enterOuterAlt(_localctx, 3);
				{
				setState(211); primitiveType();
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
		public StaticFunctionCallContext staticFunctionCall() {
			return getRuleContext(StaticFunctionCallContext.class,0);
		}
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
		public TerminalNode Identifier() { return getToken(CDLReducerv1Parser.Identifier, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch (_input.LA(1)) {
			case 38:
			case 39:
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==38 || _la==39) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(216); expression(7);
				}
				break;
			case 9:
				{
				setState(217); match(9);
				setState(218); expression(0);
				setState(219); match(24);
				}
				break;
			case 33:
				{
				setState(221); functionCall();
				}
				break;
			case 28:
				{
				setState(222); staticFunctionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(226);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 22) | (1L << MUL) | (1L << DIV))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(227); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(230); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(238);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(232); match(11);
							setState(233); match(29);
							}
							break;

						case 2:
							{
							setState(234); match(34);
							setState(235); match(29);
							}
							break;

						case 3:
							{
							setState(236); match(34);
							}
							break;

						case 4:
							{
							setState(237); match(11);
							}
							break;
						}
						setState(240); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(242);
						_la = _input.LA(1);
						if ( !(_la==13 || _la==37) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(243); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(245); match(17);
						setState(246); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(248); match(7);
						setState(249); expression(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(251); match(25);
						setState(252); match(Identifier);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(254); match(6);
						setState(255); expression(0);
						setState(256); match(2);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(259); match(9);
						setState(261);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 28) | (1L << 33) | (1L << 38) | (1L << 39))) != 0)) {
							{
							setState(260); expressionList();
							}
						}

						setState(263); match(24);
						}
						break;
					}
					} 
				}
				setState(268);
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); expression(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(270); match(5);
				setState(271); expression(0);
				}
				}
				setState(276);
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
		public TerminalNode StringLiteral() { return getToken(CDLReducerv1Parser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(CDLReducerv1Parser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(CDLReducerv1Parser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(CDLReducerv1Parser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 35) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) ) {
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
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLReducerv1Listener ) ((CDLReducerv1Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 12) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 31) | (1L << 32) | (1L << 36))) != 0)) ) {
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
		case 24: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\2\38\u011c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<"+
		"\n\2\3\2\7\2?\n\2\f\2\16\2B\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\5\4N\n\4\3\4\5\4Q\n\4\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\6\3\6\3"+
		"\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bj\n\b\3\t\3"+
		"\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t\5\tu\n\t\3\t\5\tx\n\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0084\n\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\7\17\u0098\n\17\f\17\16\17\u009b\13\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ab\n\21\3\22\3\22\3\22"+
		"\5\22\u00b0\n\22\3\23\3\23\3\24\3\24\5\24\u00b6\n\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u00c7"+
		"\n\27\3\27\3\27\7\27\u00cb\n\27\f\27\16\27\u00ce\13\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u00d7\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u00e2\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00f1\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0108\n\32\3\32\7\32\u010b\n\32\f\32\16\32\u010e\13\32\3\33\3\33"+
		"\3\33\7\33\u0113\n\33\f\33\16\33\u0116\13\33\3\34\3\34\3\35\3\35\3\35"+
		"\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\b"+
		"\3()\4\30\30-.\3/\60\4\17\17\'\'\5%%*+\63\64\n\3\3\5\5\16\16\22\22\25"+
		"\27\31\31!\"&&\u012b\2;\3\2\2\2\4E\3\2\2\2\6H\3\2\2\2\bR\3\2\2\2\nZ\3"+
		"\2\2\2\fb\3\2\2\2\16i\3\2\2\2\20k\3\2\2\2\22{\3\2\2\2\24~\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u0090\3\2\2\2\32\u0093\3\2\2\2\34\u0095\3\2\2\2\36\u009e\3"+
		"\2\2\2 \u00aa\3\2\2\2\"\u00ac\3\2\2\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00b9"+
		"\3\2\2\2*\u00bf\3\2\2\2,\u00c6\3\2\2\2.\u00cf\3\2\2\2\60\u00d6\3\2\2\2"+
		"\62\u00e1\3\2\2\2\64\u010f\3\2\2\2\66\u0117\3\2\2\28\u0119\3\2\2\2:<\5"+
		"\4\3\2;:\3\2\2\2;<\3\2\2\2<@\3\2\2\2=?\5\24\13\2>=\3\2\2\2?B\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\1\2\2D\3\3\2\2\2EF\5\6\4\2"+
		"FG\5\24\13\2G\5\3\2\2\2HI\7\35\2\2IP\5\b\5\2JM\7\13\2\2KN\5\n\6\2LN\5"+
		"\16\b\2MK\3\2\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7\32\2\2PJ\3\2\2\2P"+
		"Q\3\2\2\2Q\7\3\2\2\2RW\7,\2\2ST\7\33\2\2TV\7,\2\2US\3\2\2\2VY\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2X\t\3\2\2\2YW\3\2\2\2Z_\5\f\7\2[\\\7\7\2\2\\^\5\f"+
		"\7\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2bc\7"+
		",\2\2cd\7\37\2\2de\5\16\b\2e\r\3\2\2\2fj\5\62\32\2gj\5\66\34\2hj\5\20"+
		"\t\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\17\3\2\2\2kt\7\21\2\2lq\5\16\b\2m"+
		"n\7\7\2\2np\5\16\b\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\7\7\2\2wv\3\2\2\2wx\3\2\2\2"+
		"xy\3\2\2\2yz\7\24\2\2z\21\3\2\2\2{|\7\6\2\2|}\5\16\b\2}\23\3\2\2\2~\177"+
		"\7\34\2\2\177\u0080\5\60\31\2\u0080\u0081\7,\2\2\u0081\u0083\7\13\2\2"+
		"\u0082\u0084\5\26\f\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\7\32\2\2\u0086\u0087\5\32\16\2\u0087\25\3\2\2\2\u0088"+
		"\u008d\5\30\r\2\u0089\u008a\7\7\2\2\u008a\u008c\5\30\r\2\u008b\u0089\3"+
		"\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\27\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\58\35\2\u0091\u0092\7,\2\2"+
		"\u0092\31\3\2\2\2\u0093\u0094\5\34\17\2\u0094\33\3\2\2\2\u0095\u0099\7"+
		"\21\2\2\u0096\u0098\5\36\20\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\7\24\2\2\u009d\35\3\2\2\2\u009e\u009f\5 \21\2\u009f"+
		"\37\3\2\2\2\u00a0\u00ab\5\34\17\2\u00a1\u00ab\5\"\22\2\u00a2\u00ab\5&"+
		"\24\2\u00a3\u00ab\78\2\2\u00a4\u00a5\5\62\32\2\u00a5\u00a6\78\2\2\u00a6"+
		"\u00ab\3\2\2\2\u00a7\u00a8\7 \2\2\u00a8\u00ab\5\66\34\2\u00a9\u00ab\5"+
		"$\23\2\u00aa\u00a0\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa"+
		"\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab!\3\2\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00af\5.\30\2\u00ae\u00b0"+
		"\5\34\17\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0#\3\2\2\2\u00b1"+
		"\u00b2\7\n\2\2\u00b2%\3\2\2\2\u00b3\u00b5\7 \2\2\u00b4\u00b6\5\62\32\2"+
		"\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\78\2\2\u00b8\'\3\2\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb\7,\2\2\u00bb"+
		"\u00bc\7\13\2\2\u00bc\u00bd\5,\27\2\u00bd\u00be\7\32\2\2\u00be)\3\2\2"+
		"\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3"+
		"\5,\27\2\u00c3\u00c4\7\32\2\2\u00c4+\3\2\2\2\u00c5\u00c7\7,\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cc\3\2\2\2\u00c8\u00c9\7\7"+
		"\2\2\u00c9\u00cb\7,\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd-\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d0\7\13\2\2\u00d0\u00d1\5\62\32\2\u00d1\u00d2\7\32\2\2\u00d2"+
		"/\3\2\2\2\u00d3\u00d7\7\20\2\2\u00d4\u00d7\5\66\34\2\u00d5\u00d7\58\35"+
		"\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\61"+
		"\3\2\2\2\u00d8\u00d9\b\32\1\2\u00d9\u00da\t\2\2\2\u00da\u00e2\5\62\32"+
		"\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\5\62\32\2\u00dd\u00de\7\32\2\2\u00de"+
		"\u00e2\3\2\2\2\u00df\u00e2\5*\26\2\u00e0\u00e2\5(\25\2\u00e1\u00d8\3\2"+
		"\2\2\u00e1\u00db\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u010c\3\2\2\2\u00e3\u00e4\6\32\2\3\u00e4\u00e5\t\3\2\2\u00e5\u010b\5"+
		"\62\32\2\u00e6\u00e7\6\32\3\3\u00e7\u00e8\t\4\2\2\u00e8\u010b\5\62\32"+
		"\2\u00e9\u00f0\6\32\4\3\u00ea\u00eb\7\r\2\2\u00eb\u00f1\7\37\2\2\u00ec"+
		"\u00ed\7$\2\2\u00ed\u00f1\7\37\2\2\u00ee\u00f1\7$\2\2\u00ef\u00f1\7\r"+
		"\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u010b\5\62\32\2\u00f3\u00f4\6"+
		"\32\5\3\u00f4\u00f5\t\5\2\2\u00f5\u010b\5\62\32\2\u00f6\u00f7\6\32\6\3"+
		"\u00f7\u00f8\7\23\2\2\u00f8\u010b\5\62\32\2\u00f9\u00fa\6\32\7\3\u00fa"+
		"\u00fb\7\t\2\2\u00fb\u010b\5\62\32\2\u00fc\u00fd\6\32\b\3\u00fd\u00fe"+
		"\7\33\2\2\u00fe\u010b\7,\2\2\u00ff\u0100\6\32\t\3\u0100\u0101\7\b\2\2"+
		"\u0101\u0102\5\62\32\2\u0102\u0103\7\4\2\2\u0103\u010b\3\2\2\2\u0104\u0105"+
		"\6\32\n\3\u0105\u0107\7\13\2\2\u0106\u0108\5\64\33\2\u0107\u0106\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\7\32\2\2\u010a"+
		"\u00e3\3\2\2\2\u010a\u00e6\3\2\2\2\u010a\u00e9\3\2\2\2\u010a\u00f3\3\2"+
		"\2\2\u010a\u00f6\3\2\2\2\u010a\u00f9\3\2\2\2\u010a\u00fc\3\2\2\2\u010a"+
		"\u00ff\3\2\2\2\u010a\u0104\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\63\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0114"+
		"\5\62\32\2\u0110\u0111\7\7\2\2\u0111\u0113\5\62\32\2\u0112\u0110\3\2\2"+
		"\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\65"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\t\6\2\2\u0118\67\3\2\2\2\u0119"+
		"\u011a\t\7\2\2\u011a9\3\2\2\2\33;@MPW_iqtw\u0083\u008d\u0099\u00aa\u00af"+
		"\u00b5\u00c6\u00cc\u00d6\u00e1\u00f0\u0107\u010a\u010c\u0114";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}