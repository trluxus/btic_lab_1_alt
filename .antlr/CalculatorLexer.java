// Generated from c:\Users\trluxus\source\repos\btic_lab_1_alt\Calculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECIMAL=1, BINARY=2, OCTAL=3, HEX=4, VAR=5, WS=6, PLUS=7, MINUS=8, MULT=9, 
		DIV=10, GT=11, LT=12, EQ=13, ASSIGN=14, POW=15, OP_PAREN=16, CL_PAREN=17, 
		COMMA=18, COS=19, SIN=20, TAN=21, ACOS=22, ASIN=23, ATAN=24, LOG=25, SQRT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MANTISSA", "MANTISSA_HEX", "DECIMAL", "BINARY", "OCTAL", "HEX", "VAR", 
			"VALID_ID_START", "VALID_ID_CHAR", "WS", "PLUS", "MINUS", "MULT", "DIV", 
			"GT", "LT", "EQ", "ASSIGN", "POW", "OP_PAREN", "CL_PAREN", "COMMA", "COS", 
			"SIN", "TAN", "ACOS", "ASIN", "ATAN", "LOG", "SQRT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'>'", "'<'", "'=='", "'='", "'^'", "'('", "')'", "','", "'cos'", "'sin'", 
			"'tan'", "'acos'", "'asin'", "'atan'", "'log'", "'sqrt'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECIMAL", "BINARY", "OCTAL", "HEX", "VAR", "WS", "PLUS", "MINUS", 
			"MULT", "DIV", "GT", "LT", "EQ", "ASSIGN", "POW", "OP_PAREN", "CL_PAREN", 
			"COMMA", "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LOG", "SQRT"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\5\2B\n\2\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\5\4"+
		"P\n\4\3\4\3\4\6\4T\n\4\r\4\16\4U\5\4X\n\4\3\4\3\4\3\4\7\4]\n\4\f\4\16"+
		"\4`\13\4\5\4b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\5\5"+
		"o\n\5\3\5\3\5\6\5s\n\5\r\5\16\5t\5\5w\n\5\3\5\3\5\3\5\7\5|\n\5\f\5\16"+
		"\5\177\13\5\5\5\u0081\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0089\n\6\f\6\16"+
		"\6\u008c\13\6\5\6\u008e\n\6\3\6\3\6\6\6\u0092\n\6\r\6\16\6\u0093\5\6\u0096"+
		"\n\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\5\6\u00a0\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab\13\7\5\7\u00ad\n\7\3\7"+
		"\3\7\6\7\u00b1\n\7\r\7\16\7\u00b2\5\7\u00b5\n\7\3\7\3\7\3\7\7\7\u00ba"+
		"\n\7\f\7\16\7\u00bd\13\7\5\7\u00bf\n\7\3\b\3\b\7\b\u00c3\n\b\f\b\16\b"+
		"\u00c6\13\b\3\t\5\t\u00c9\n\t\3\n\3\n\5\n\u00cd\n\n\3\13\6\13\u00d0\n"+
		"\13\r\13\16\13\u00d1\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\2\2 \3\2\5\2\7\3\t"+
		"\4\13\5\r\6\17\7\21\2\23\2\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20"+
		"\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34\3\2\20\4\2G"+
		"Ggg\4\2--//\4\2OOoo\3\2\62\62\3\2\63;\3\2\62;\3\2\63\63\3\2\62\63\3\2"+
		"\639\3\2\629\5\2\63;CHch\5\2\62;CHch\5\2C\\aac|\5\2\13\f\17\17\"\"\2\u012a"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5C\3\2\2\2\7O\3\2\2\2"+
		"\tc\3\2\2\2\13\u0082\3\2\2\2\r\u00a1\3\2\2\2\17\u00c0\3\2\2\2\21\u00c8"+
		"\3\2\2\2\23\u00cc\3\2\2\2\25\u00cf\3\2\2\2\27\u00d5\3\2\2\2\31\u00d7\3"+
		"\2\2\2\33\u00d9\3\2\2\2\35\u00db\3\2\2\2\37\u00dd\3\2\2\2!\u00df\3\2\2"+
		"\2#\u00e1\3\2\2\2%\u00e4\3\2\2\2\'\u00e6\3\2\2\2)\u00e8\3\2\2\2+\u00ea"+
		"\3\2\2\2-\u00ec\3\2\2\2/\u00ee\3\2\2\2\61\u00f2\3\2\2\2\63\u00f6\3\2\2"+
		"\2\65\u00fa\3\2\2\2\67\u00ff\3\2\2\29\u0104\3\2\2\2;\u0109\3\2\2\2=\u010d"+
		"\3\2\2\2?A\t\2\2\2@B\t\3\2\2A@\3\2\2\2AB\3\2\2\2B\4\3\2\2\2CE\t\4\2\2"+
		"DF\t\3\2\2ED\3\2\2\2EF\3\2\2\2F\6\3\2\2\2GP\t\5\2\2HL\t\6\2\2IK\t\7\2"+
		"\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OG\3\2\2"+
		"\2OH\3\2\2\2PW\3\2\2\2QS\7\60\2\2RT\t\7\2\2SR\3\2\2\2TU\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WQ\3\2\2\2WX\3\2\2\2Xa\3\2\2\2YZ\5\3\2\2Z^\t\6"+
		"\2\2[]\t\7\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3"+
		"\2\2\2aY\3\2\2\2ab\3\2\2\2b\b\3\2\2\2cd\7\62\2\2de\7d\2\2en\3\2\2\2fo"+
		"\t\5\2\2gk\t\b\2\2hj\t\t\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l"+
		"o\3\2\2\2mk\3\2\2\2nf\3\2\2\2ng\3\2\2\2ov\3\2\2\2pr\7\60\2\2qs\t\t\2\2"+
		"rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vp\3\2\2\2vw\3\2\2\2"+
		"w\u0080\3\2\2\2xy\5\3\2\2y}\t\b\2\2z|\t\t\2\2{z\3\2\2\2|\177\3\2\2\2}"+
		"{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080x\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\n\3\2\2\2\u0082\u0083\7\62\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u008d\3\2\2\2\u0085\u008e\t\5\2\2\u0086\u008a\t\n\2\2\u0087\u0089\t\13"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2"+
		"\2\2\u008d\u0086\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u0091\7\60\2\2\u0090"+
		"\u0092\t\13\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u009f\3\2\2\2\u0097\u0098\5\3\2\2\u0098\u009c\t\n"+
		"\2\2\u0099\u009b\t\13\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u0097\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\f\3\2\2\2\u00a1\u00a2"+
		"\7\62\2\2\u00a2\u00a3\7j\2\2\u00a3\u00ac\3\2\2\2\u00a4\u00ad\t\5\2\2\u00a5"+
		"\u00a9\t\f\2\2\u00a6\u00a8\t\r\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ad\u00b4\3\2"+
		"\2\2\u00ae\u00b0\7\60\2\2\u00af\u00b1\t\r\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00be\3\2\2\2\u00b6"+
		"\u00b7\5\5\3\2\u00b7\u00bb\t\f\2\2\u00b8\u00ba\t\r\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\16\3\2\2\2\u00c0\u00c4\5\21\t\2\u00c1\u00c3\5\23\n\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\20\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\16\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\22\3\2\2\2\u00ca\u00cd\5\21\t\2\u00cb\u00cd\4\62;\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\24\3\2\2\2\u00ce\u00d0\t\17\2"+
		"\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\13\2\2\u00d4\26\3\2\2\2\u00d5"+
		"\u00d6\7-\2\2\u00d6\30\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8\32\3\2\2\2\u00d9"+
		"\u00da\7,\2\2\u00da\34\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\36\3\2\2\2\u00dd"+
		"\u00de\7@\2\2\u00de \3\2\2\2\u00df\u00e0\7>\2\2\u00e0\"\3\2\2\2\u00e1"+
		"\u00e2\7?\2\2\u00e2\u00e3\7?\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5"+
		"&\3\2\2\2\u00e6\u00e7\7`\2\2\u00e7(\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9*"+
		"\3\2\2\2\u00ea\u00eb\7+\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed.\3"+
		"\2\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7u\2\2\u00f1"+
		"\60\3\2\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\62\3\2\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\64\3\2\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\u00fe\7u\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7u\2\2\u0101"+
		"\u0102\7k\2\2\u0102\u0103\7p\2\2\u01038\3\2\2\2\u0104\u0105\7c\2\2\u0105"+
		"\u0106\7v\2\2\u0106\u0107\7c\2\2\u0107\u0108\7p\2\2\u0108:\3\2\2\2\u0109"+
		"\u010a\7n\2\2\u010a\u010b\7q\2\2\u010b\u010c\7i\2\2\u010c<\3\2\2\2\u010d"+
		"\u010e\7u\2\2\u010e\u010f\7s\2\2\u010f\u0110\7t\2\2\u0110\u0111\7v\2\2"+
		"\u0111>\3\2\2\2!\2AELOUW^akntv}\u0080\u008a\u008d\u0093\u0095\u009c\u009f"+
		"\u00a9\u00ac\u00b2\u00b4\u00bb\u00be\u00c4\u00c8\u00cc\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}