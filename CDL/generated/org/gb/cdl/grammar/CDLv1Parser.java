// Generated from CDLv1.g4 by ANTLR 4.0
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
public class CDLv1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, IntegerLiteral=35, BooleanLiteral=36, Identifier=37, 
		DecimalLiteral=38, DigitList=39, CharacterLiteral=40, StringLiteral=41, 
		WS=42, COMMENT=43, LINE_COMMENT=44, LINE_TERMINATOR=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'long'", "']'", "'short'", "'default'", "','", "'-'", "'*'", 
		"'['", "'('", "'<'", "'int'", "'!='", "'{'", "'double'", "'extends'", 
		"'}'", "'boolean'", "'float'", "'char'", "'%'", "'byte'", "')'", "'.'", 
		"'+'", "'@'", "'='", "'String'", "'>'", "'null'", "'model'", "'=='", "'/'", 
		"'~'", "'!'", "IntegerLiteral", "BooleanLiteral", "Identifier", "DecimalLiteral", 
		"DigitList", "CharacterLiteral", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT", 
		"';'"
	};
	public static final int
		RULE_model = 0, RULE_annotation = 1, RULE_annotationName = 2, RULE_modelDeclaration = 3, 
		RULE_modelType = 4, RULE_modelBody = 5, RULE_fieldDeclarationList = 6, 
		RULE_fieldDeclaration = 7, RULE_elementValuePairs = 8, RULE_elementValuePair = 9, 
		RULE_elementValue = 10, RULE_elementValueArrayInitializer = 11, RULE_fileLocation = 12, 
		RULE_defaultValue = 13, RULE_expression = 14, RULE_expressionList = 15, 
		RULE_literal = 16, RULE_primitiveType = 17;
	public static final String[] ruleNames = {
		"model", "annotation", "annotationName", "modelDeclaration", "modelType", 
		"modelBody", "fieldDeclarationList", "fieldDeclaration", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "fileLocation", 
		"defaultValue", "expression", "expressionList", "literal", "primitiveType"
	};

	@Override
	public String getGrammarFileName() { return "CDLv1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CDLv1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ModelDeclarationContext modelDeclaration(int i) {
			return getRuleContext(ModelDeclarationContext.class,i);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CDLv1Parser.EOF, 0); }
		public List<ModelDeclarationContext> modelDeclaration() {
			return getRuleContexts(ModelDeclarationContext.class);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==25) {
				{
				{
				setState(36); annotation();
				setState(37); modelDeclaration();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); match(EOF);
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
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(25);
			setState(47); annotationName();
			setState(54);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(48); match(9);
				setState(51);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(49); elementValuePairs();
					}
					break;
				case 9:
				case 13:
				case 29:
				case 32:
				case 33:
				case 34:
				case IntegerLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
					{
					setState(50); elementValue();
					}
					break;
				case 22:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); match(22);
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
			return getToken(CDLv1Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CDLv1Parser.Identifier); }
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(Identifier);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==23) {
				{
				{
				setState(57); match(23);
				setState(58); match(Identifier);
				}
				}
				setState(63);
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

	public static class ModelDeclarationContext extends ParserRuleContext {
		public ModelTypeContext modelType() {
			return getRuleContext(ModelTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLv1Parser.Identifier, 0); }
		public ModelBodyContext modelBody() {
			return getRuleContext(ModelBodyContext.class,0);
		}
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitModelDeclaration(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modelDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(30);
			setState(65); match(Identifier);
			setState(68);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(66); match(15);
				setState(67); modelType();
				}
			}

			setState(70); modelBody();
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

	public static class ModelTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CDLv1Parser.Identifier, 0); }
		public ModelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterModelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitModelType(this);
		}
	}

	public final ModelTypeContext modelType() throws RecognitionException {
		ModelTypeContext _localctx = new ModelTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(Identifier);
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

	public static class ModelBodyContext extends ParserRuleContext {
		public FieldDeclarationListContext fieldDeclarationList() {
			return getRuleContext(FieldDeclarationListContext.class,0);
		}
		public ModelBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterModelBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitModelBody(this);
		}
	}

	public final ModelBodyContext modelBody() throws RecognitionException {
		ModelBodyContext _localctx = new ModelBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modelBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(13);
			setState(76);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 27))) != 0)) {
				{
				setState(75); fieldDeclarationList();
				}
			}

			setState(78); match(16);
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

	public static class FieldDeclarationListContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public FieldDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterFieldDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitFieldDeclarationList(this);
		}
	}

	public final FieldDeclarationListContext fieldDeclarationList() throws RecognitionException {
		FieldDeclarationListContext _localctx = new FieldDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); fieldDeclaration();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 27))) != 0)) {
				{
				{
				setState(81); fieldDeclaration();
				}
				}
				setState(86);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLv1Parser.Identifier, 0); }
		public TerminalNode LINE_TERMINATOR() { return getToken(CDLv1Parser.LINE_TERMINATOR, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(87); annotation();
				}
			}

			setState(90); primitiveType();
			setState(91); match(Identifier);
			setState(92); match(LINE_TERMINATOR);
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
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); elementValuePair();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(95); match(5);
				setState(96); elementValuePair();
				}
				}
				setState(101);
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
		public TerminalNode Identifier() { return getToken(CDLv1Parser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(Identifier);
			setState(103); match(26);
			setState(104); elementValue();
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
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementValue);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case 9:
			case 33:
			case 34:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); expression(0);
				}
				break;
			case 29:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); literal();
				}
				break;
			case 13:
			case 32:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); elementValueArrayInitializer();
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
		public FileLocationContext fileLocation() {
			return getRuleContext(FileLocationContext.class,0);
		}
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
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			setState(127);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); match(13);
				setState(120);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 13) | (1L << 29) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(112); elementValue();
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(113); match(5);
							setState(114); elementValue();
							}
							} 
						}
						setState(119);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					}
				}

				setState(123);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(122); match(5);
					}
				}

				setState(125); match(16);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); fileLocation();
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

	public static class FileLocationContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public FileLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterFileLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitFileLocation(this);
		}
	}

	public final FileLocationContext fileLocation() throws RecognitionException {
		FileLocationContext _localctx = new FileLocationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fileLocation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129); match(32);
			setState(130); elementValue();
			}
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(132); match(32);
					setState(133); elementValue();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(4);
			setState(140); elementValue();
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CDLv1Parser.Identifier, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			switch (_input.LA(1)) {
			case 33:
			case 34:
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==33 || _la==34) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(144); expression(5);
				}
				break;
			case 9:
				{
				setState(145); match(9);
				setState(146); expression(0);
				setState(147); match(22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(152);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 20) | (1L << 32))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(153); expression(5);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(155);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==24) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(156); expression(4);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(164);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(158); match(10);
							setState(159); match(26);
							}
							break;

						case 2:
							{
							setState(160); match(28);
							setState(161); match(26);
							}
							break;

						case 3:
							{
							setState(162); match(28);
							}
							break;

						case 4:
							{
							setState(163); match(10);
							}
							break;
						}
						setState(166); expression(3);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(168);
						_la = _input.LA(1);
						if ( !(_la==12 || _la==31) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(169); expression(2);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(171); match(23);
						setState(172); match(Identifier);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(174); match(8);
						setState(175); expression(0);
						setState(176); match(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(179); match(9);
						setState(181);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 33) | (1L << 34))) != 0)) {
							{
							setState(180); expressionList();
							}
						}

						setState(183); match(22);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); expression(0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(190); match(5);
				setState(191); expression(0);
				}
				}
				setState(196);
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
		public TerminalNode StringLiteral() { return getToken(CDLv1Parser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(CDLv1Parser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(CDLv1Parser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(CDLv1Parser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 29) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) ) {
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
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDLv1Listener ) ((CDLv1Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 27))) != 0)) ) {
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
		case 14: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;

		case 1: return 3 >= _localctx._p;

		case 2: return 2 >= _localctx._p;

		case 3: return 1 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3/\u00cc\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3\66\n\3\3\3\5\39\n\3\3\4\3\4\3\4\7\4>\n\4"+
		"\f\4\16\4A\13\4\3\5\3\5\3\5\3\5\5\5G\n\5\3\5\3\5\3\6\3\6\3\7\3\7\5\7O"+
		"\n\7\3\7\3\7\3\b\3\b\7\bU\n\b\f\b\16\bX\13\b\3\t\5\t[\n\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\nd\n\n\f\n\16\ng\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\5\fp\n\f\3\r\3\r\3\r\3\r\7\rv\n\r\f\r\16\ry\13\r\5\r{\n\r\3\r\5\r~"+
		"\n\r\3\r\3\r\5\r\u0082\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u0089\n\16\f"+
		"\16\16\16\u008c\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0098\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00a7\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b8\n\20\3\20\7\20\u00bb\n\20\f"+
		"\20\16\20\u00be\13\20\3\21\3\21\3\21\7\21\u00c3\n\21\f\21\16\21\u00c6"+
		"\13\21\3\22\3\22\3\23\3\23\3\23\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\b\3#$\5\t\t\26\26\"\"\4\b\b\32\32\4\16\16!!\5\37\37%&*+\t"+
		"\3\3\5\5\r\r\20\20\23\25\27\27\35\35\u00d7\2+\3\2\2\2\4\60\3\2\2\2\6:"+
		"\3\2\2\2\bB\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16R\3\2\2\2\20Z\3\2\2\2\22`"+
		"\3\2\2\2\24h\3\2\2\2\26o\3\2\2\2\30\u0081\3\2\2\2\32\u0083\3\2\2\2\34"+
		"\u008d\3\2\2\2\36\u0097\3\2\2\2 \u00bf\3\2\2\2\"\u00c7\3\2\2\2$\u00c9"+
		"\3\2\2\2&\'\5\4\3\2\'(\5\b\5\2(*\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\1\2\2/\3\3\2\2\2\60\61\7\33\2\2\61"+
		"8\5\6\4\2\62\65\7\13\2\2\63\66\5\22\n\2\64\66\5\26\f\2\65\63\3\2\2\2\65"+
		"\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\7\30\2\28\62\3\2\2\289\3\2"+
		"\2\29\5\3\2\2\2:?\7\'\2\2;<\7\31\2\2<>\7\'\2\2=;\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BC\7 \2\2CF\7\'\2\2DE\7\21\2\2EG"+
		"\5\n\6\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\5\f\7\2I\t\3\2\2\2JK\7\'\2\2"+
		"K\13\3\2\2\2LN\7\17\2\2MO\5\16\b\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\22"+
		"\2\2Q\r\3\2\2\2RV\5\20\t\2SU\5\20\t\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW"+
		"\3\2\2\2W\17\3\2\2\2XV\3\2\2\2Y[\5\4\3\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2"+
		"\2\\]\5$\23\2]^\7\'\2\2^_\7/\2\2_\21\3\2\2\2`e\5\24\13\2ab\7\7\2\2bd\5"+
		"\24\13\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\23\3\2\2\2ge\3\2\2\2"+
		"hi\7\'\2\2ij\7\34\2\2jk\5\26\f\2k\25\3\2\2\2lp\5\36\20\2mp\5\"\22\2np"+
		"\5\30\r\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\27\3\2\2\2qz\7\17\2\2rw\5\26"+
		"\f\2st\7\7\2\2tv\5\26\f\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3"+
		"\2\2\2yw\3\2\2\2zr\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\7\7\2\2}|\3\2\2\2}~\3"+
		"\2\2\2~\177\3\2\2\2\177\u0082\7\22\2\2\u0080\u0082\5\32\16\2\u0081q\3"+
		"\2\2\2\u0081\u0080\3\2\2\2\u0082\31\3\2\2\2\u0083\u0084\7\"\2\2\u0084"+
		"\u0085\5\26\f\2\u0085\u008a\3\2\2\2\u0086\u0087\7\"\2\2\u0087\u0089\5"+
		"\26\f\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\33\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\6\2"+
		"\2\u008e\u008f\5\26\f\2\u008f\35\3\2\2\2\u0090\u0091\b\20\1\2\u0091\u0092"+
		"\t\2\2\2\u0092\u0098\5\36\20\2\u0093\u0094\7\13\2\2\u0094\u0095\5\36\20"+
		"\2\u0095\u0096\7\30\2\2\u0096\u0098\3\2\2\2\u0097\u0090\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098\u00bc\3\2\2\2\u0099\u009a\6\20\2\3\u009a\u009b\t"+
		"\3\2\2\u009b\u00bb\5\36\20\2\u009c\u009d\6\20\3\3\u009d\u009e\t\4\2\2"+
		"\u009e\u00bb\5\36\20\2\u009f\u00a6\6\20\4\3\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a7\7\34\2\2\u00a2\u00a3\7\36\2\2\u00a3\u00a7\7\34\2\2\u00a4\u00a7"+
		"\7\36\2\2\u00a5\u00a7\7\f\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a2\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00bb"+
		"\5\36\20\2\u00a9\u00aa\6\20\5\3\u00aa\u00ab\t\5\2\2\u00ab\u00bb\5\36\20"+
		"\2\u00ac\u00ad\6\20\6\3\u00ad\u00ae\7\31\2\2\u00ae\u00bb\7\'\2\2\u00af"+
		"\u00b0\6\20\7\3\u00b0\u00b1\7\n\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3"+
		"\7\4\2\2\u00b3\u00bb\3\2\2\2\u00b4\u00b5\6\20\b\3\u00b5\u00b7\7\13\2\2"+
		"\u00b6\u00b8\5 \21\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\7\30\2\2\u00ba\u0099\3\2\2\2\u00ba\u009c\3\2\2\2"+
		"\u00ba\u009f\3\2\2\2\u00ba\u00a9\3\2\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00af"+
		"\3\2\2\2\u00ba\u00b4\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\37\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c4\5\36\20"+
		"\2\u00c0\u00c1\7\7\2\2\u00c1\u00c3\5\36\20\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5!\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c7\u00c8\t\6\2\2\u00c8#\3\2\2\2\u00c9\u00ca\t"+
		"\7\2\2\u00ca%\3\2\2\2\27+\658?FNVZeowz}\u0081\u008a\u0097\u00a6\u00b7"+
		"\u00ba\u00bc\u00c4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}