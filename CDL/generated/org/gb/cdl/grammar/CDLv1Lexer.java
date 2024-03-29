// Generated from CDLv1.g4 by ANTLR 4.0
package org.gb.cdl.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CDLv1Lexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'long'", "']'", "'short'", "'default'", "','", "'-'", "'*'", "'['", "'('", 
		"'<'", "'int'", "'!='", "'{'", "'double'", "'extends'", "'}'", "'boolean'", 
		"'float'", "'char'", "'%'", "'byte'", "')'", "'.'", "'+'", "'@'", "'='", 
		"'String'", "'>'", "'null'", "'model'", "'=='", "'/'", "'~'", "'!'", "IntegerLiteral", 
		"BooleanLiteral", "Identifier", "DecimalLiteral", "DigitList", "CharacterLiteral", 
		"StringLiteral", "WS", "COMMENT", "LINE_COMMENT", "';'"
	};
	public static final String[] ruleNames = {
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "IntegerLiteral", "BooleanLiteral", "Identifier", "DecimalLiteral", 
		"DigitList", "CharacterLiteral", "StringLiteral", "Digit", "EscapeSequence", 
		"Letter", "DomainIDDigit", "WS", "COMMENT", "LINE_COMMENT", "LINE_TERMINATOR"
	};


	public CDLv1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CDLv1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45: WS_action((RuleContext)_localctx, actionIndex); break;

		case 46: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 47: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4/\u013f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00ed\n%\3&\3&\7&\u00f1"+
		"\n&\f&\16&\u00f4\13&\3\'\3\'\5\'\u00f8\n\'\3(\3(\7(\u00fc\n(\f(\16(\u00ff"+
		"\13(\3)\3)\3)\5)\u0104\n)\3)\3)\3*\3*\3*\7*\u010b\n*\f*\16*\u010e\13*"+
		"\3*\3*\3+\3+\3,\3,\3,\3-\6-\u0118\n-\r-\16-\u0119\3.\3.\3/\6/\u011f\n"+
		"/\r/\16/\u0120\3/\3/\3\60\3\60\3\60\3\60\7\60\u0129\n\60\f\60\16\60\u012c"+
		"\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0137\n\61\f"+
		"\61\16\61\u013a\13\61\3\61\3\61\3\62\3\62\3\u012a\63\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1"+
		"K\'\1M(\1O)\1Q*\1S+\1U\2\1W\2\1Y\2\1[\2\1],\2_-\3a.\4c/\1\3\2\b\4))^^"+
		"\4$$^^\n$$))^^ddhhppttvv\4C\\c|\5\13\f\16\17\"\"\4\f\f\17\17\u0145\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5j\3\2\2\2\7l\3\2\2"+
		"\2\tr\3\2\2\2\13z\3\2\2\2\r|\3\2\2\2\17~\3\2\2\2\21\u0080\3\2\2\2\23\u0082"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u008a\3\2\2\2\33\u008d\3"+
		"\2\2\2\35\u008f\3\2\2\2\37\u0096\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2"+
		"%\u00a8\3\2\2\2\'\u00ae\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00ba\3"+
		"\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2"+
		"\2\67\u00c4\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00d2\3\2\2\2?\u00d8"+
		"\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00df\3\2\2\2G\u00e1\3\2\2\2I"+
		"\u00ec\3\2\2\2K\u00ee\3\2\2\2M\u00f5\3\2\2\2O\u00f9\3\2\2\2Q\u0100\3\2"+
		"\2\2S\u0107\3\2\2\2U\u0111\3\2\2\2W\u0113\3\2\2\2Y\u0117\3\2\2\2[\u011b"+
		"\3\2\2\2]\u011e\3\2\2\2_\u0124\3\2\2\2a\u0132\3\2\2\2c\u013d\3\2\2\2e"+
		"f\7n\2\2fg\7q\2\2gh\7p\2\2hi\7i\2\2i\4\3\2\2\2jk\7_\2\2k\6\3\2\2\2lm\7"+
		"u\2\2mn\7j\2\2no\7q\2\2op\7t\2\2pq\7v\2\2q\b\3\2\2\2rs\7f\2\2st\7g\2\2"+
		"tu\7h\2\2uv\7c\2\2vw\7w\2\2wx\7n\2\2xy\7v\2\2y\n\3\2\2\2z{\7.\2\2{\f\3"+
		"\2\2\2|}\7/\2\2}\16\3\2\2\2~\177\7,\2\2\177\20\3\2\2\2\u0080\u0081\7]"+
		"\2\2\u0081\22\3\2\2\2\u0082\u0083\7*\2\2\u0083\24\3\2\2\2\u0084\u0085"+
		"\7>\2\2\u0085\26\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089"+
		"\7v\2\2\u0089\30\3\2\2\2\u008a\u008b\7#\2\2\u008b\u008c\7?\2\2\u008c\32"+
		"\3\2\2\2\u008d\u008e\7}\2\2\u008e\34\3\2\2\2\u008f\u0090\7f\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7w\2\2\u0092\u0093\7d\2\2\u0093\u0094\7n\2\2"+
		"\u0094\u0095\7g\2\2\u0095\36\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7"+
		"z\2\2\u0098\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7f\2\2\u009c\u009d\7u\2\2\u009d \3\2\2\2\u009e\u009f\7\177\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7q\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7$\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7q\2"+
		"\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad&\3\2\2\2\u00ae\u00af\7"+
		"e\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2("+
		"\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4*\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7"+
		"\7{\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9,\3\2\2\2\u00ba\u00bb"+
		"\7+\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd\60\3\2\2\2\u00be\u00bf"+
		"\7-\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7B\2\2\u00c1\64\3\2\2\2\u00c2\u00c3"+
		"\7?\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7i\2\2\u00ca"+
		"8\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf"+
		"\7w\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7n\2\2\u00d1<\3\2\2\2\u00d2\u00d3"+
		"\7o\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00da"+
		"@\3\2\2\2\u00db\u00dc\7\61\2\2\u00dcB\3\2\2\2\u00dd\u00de\7\u0080\2\2"+
		"\u00deD\3\2\2\2\u00df\u00e0\7#\2\2\u00e0F\3\2\2\2\u00e1\u00e2\5M\'\2\u00e2"+
		"H\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00ed\7g\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7n\2\2"+
		"\u00ea\u00eb\7u\2\2\u00eb\u00ed\7g\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e7"+
		"\3\2\2\2\u00edJ\3\2\2\2\u00ee\u00f2\5Y-\2\u00ef\u00f1\5Y-\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"L\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\5U+\2\u00f6\u00f8\5O(\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8N\3\2\2\2\u00f9\u00fd\5U+\2\u00fa"+
		"\u00fc\5U+\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fd\u00fe\3\2\2\2\u00feP\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103"+
		"\7)\2\2\u0101\u0104\5W,\2\u0102\u0104\n\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7)\2\2\u0106R\3\2\2\2\u0107"+
		"\u010c\7$\2\2\u0108\u010b\5W,\2\u0109\u010b\n\3\2\2\u010a\u0108\3\2\2"+
		"\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7$\2\2\u0110"+
		"T\3\2\2\2\u0111\u0112\4\62;\2\u0112V\3\2\2\2\u0113\u0114\7^\2\2\u0114"+
		"\u0115\t\4\2\2\u0115X\3\2\2\2\u0116\u0118\t\5\2\2\u0117\u0116\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011aZ\3"+
		"\2\2\2\u011b\u011c\4\62;\2\u011c\\\3\2\2\2\u011d\u011f\t\6\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\b/\2\2\u0123^\3\2\2\2\u0124\u0125\7\61\2\2"+
		"\u0125\u0126\7,\2\2\u0126\u012a\3\2\2\2\u0127\u0129\13\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7,\2\2\u012e\u012f\7\61"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\60\3\2\u0131`\3\2\2\2\u0132\u0133"+
		"\7\61\2\2\u0133\u0134\7\61\2\2\u0134\u0138\3\2\2\2\u0135\u0137\n\7\2\2"+
		"\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\b\61\4\2"+
		"\u013cb\3\2\2\2\u013d\u013e\7=\2\2\u013ed\3\2\2\2\16\2\u00ec\u00f2\u00f7"+
		"\u00fd\u0103\u010a\u010c\u0119\u0120\u012a\u0138";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}