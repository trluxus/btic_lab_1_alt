// Generated from c:\Users\trluxus\source\repos\btic_lab_1_alt\Example.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExampleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, VAR=2, NL=3, WS=4, PLUS=5, MINUS=6, MULT=7, DIV=8, GT=9, LT=10, 
		EQ=11, POW=12, OP_PAREN=13, CL_PAREN=14, COMMA=15, COS=16, SIN=17, TAN=18, 
		ACOS=19, ASIN=20, ATAN=21, LN=22, LOG=23, SQRT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MANTISSA", "MANTISSA_HEX", "DECIMAL", "BINARY", "OCTAL", "HEX", "NUM", 
			"VAR", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "GT", "LT", "EQ", 
			"POW", "OP_PAREN", "CL_PAREN", "COMMA", "COS", "SIN", "TAN", "ACOS", 
			"ASIN", "ATAN", "LN", "LOG", "SQRT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'='", "'^'", "'('", "')'", "','", "'cos'", "'sin'", "'tan'", "'acos'", 
			"'asin'", "'atan'", "'ln'", "'log'", "'sqrt'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM", "VAR", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "GT", 
			"LT", "EQ", "POW", "OP_PAREN", "CL_PAREN", "COMMA", "COS", "SIN", "TAN", 
			"ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT"
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


	public ExampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Example.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u010b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\5\2B\n\2\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\5\4"+
		"P\n\4\3\4\3\4\6\4T\n\4\r\4\16\4U\5\4X\n\4\3\4\3\4\6\4\\\n\4\r\4\16\4]"+
		"\5\4`\n\4\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\5\5j\n\5\3\5\3\5\6\5n\n"+
		"\5\r\5\16\5o\5\5r\n\5\3\5\3\5\6\5v\n\5\r\5\16\5w\5\5z\n\5\3\6\3\6\3\6"+
		"\7\6\177\n\6\f\6\16\6\u0082\13\6\5\6\u0084\n\6\3\6\3\6\6\6\u0088\n\6\r"+
		"\6\16\6\u0089\5\6\u008c\n\6\3\6\3\6\6\6\u0090\n\6\r\6\16\6\u0091\5\6\u0094"+
		"\n\6\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\5\7\u009e\n\7\3\7\3"+
		"\7\6\7\u00a2\n\7\r\7\16\7\u00a3\5\7\u00a6\n\7\3\7\3\7\6\7\u00aa\n\7\r"+
		"\7\16\7\u00ab\5\7\u00ae\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00bd\n\b\3\t\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3\n"+
		"\3\n\3\13\6\13\u00c9\n\13\r\13\16\13\u00ca\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\2\2 \3\2\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35"+
		"\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31"+
		"=\32\3\2\21\4\2GGgg\4\2--//\4\2OOoo\3\2\62\62\3\2\63;\3\2\62;\3\2\63\63"+
		"\3\2\62\63\3\2\639\3\2\629\5\2\63;CHch\5\2\62;CHch\4\2C\\c|\5\2\62;C\\"+
		"c|\5\2\13\13\17\17\"\"\2\u0123\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5C\3\2\2\2\7O"+
		"\3\2\2\2\ti\3\2\2\2\13\u0083\3\2\2\2\r\u009d\3\2\2\2\17\u00bc\3\2\2\2"+
		"\21\u00be\3\2\2\2\23\u00c5\3\2\2\2\25\u00c8\3\2\2\2\27\u00ce\3\2\2\2\31"+
		"\u00d0\3\2\2\2\33\u00d2\3\2\2\2\35\u00d4\3\2\2\2\37\u00d6\3\2\2\2!\u00d8"+
		"\3\2\2\2#\u00da\3\2\2\2%\u00dc\3\2\2\2\'\u00de\3\2\2\2)\u00e0\3\2\2\2"+
		"+\u00e2\3\2\2\2-\u00e4\3\2\2\2/\u00e8\3\2\2\2\61\u00ec\3\2\2\2\63\u00f0"+
		"\3\2\2\2\65\u00f5\3\2\2\2\67\u00fa\3\2\2\29\u00ff\3\2\2\2;\u0102\3\2\2"+
		"\2=\u0106\3\2\2\2?A\t\2\2\2@B\t\3\2\2A@\3\2\2\2AB\3\2\2\2B\4\3\2\2\2C"+
		"E\t\4\2\2DF\t\3\2\2ED\3\2\2\2EF\3\2\2\2F\6\3\2\2\2GP\t\5\2\2HL\t\6\2\2"+
		"IK\t\7\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"OG\3\2\2\2OH\3\2\2\2PW\3\2\2\2QS\7\60\2\2RT\t\7\2\2SR\3\2\2\2TU\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WQ\3\2\2\2WX\3\2\2\2X_\3\2\2\2Y[\5\3\2"+
		"\2Z\\\t\7\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_Y\3\2"+
		"\2\2_`\3\2\2\2`\b\3\2\2\2aj\t\5\2\2bf\t\b\2\2ce\t\t\2\2dc\3\2\2\2eh\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2ib\3\2\2\2jq\3"+
		"\2\2\2km\7\60\2\2ln\t\t\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr"+
		"\3\2\2\2qk\3\2\2\2qr\3\2\2\2ry\3\2\2\2su\5\3\2\2tv\t\t\2\2ut\3\2\2\2v"+
		"w\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2ys\3\2\2\2yz\3\2\2\2z\n\3\2\2\2"+
		"{\u0084\t\5\2\2|\u0080\t\n\2\2}\177\t\13\2\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0084\u008b\3\2\2\2\u0085\u0087"+
		"\7\60\2\2\u0086\u0088\t\13\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0085"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008f\5\3\2\2\u008e"+
		"\u0090\t\13\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\f\3\2\2\2\u0095\u009e\t\5\2\2\u0096\u009a\t\f\2\2"+
		"\u0097\u0099\t\r\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009e\u00a5\3\2\2\2\u009f\u00a1\7\60"+
		"\2\2\u00a0\u00a2\t\r\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad\3\2\2\2\u00a7\u00a9\5\3\2\2\u00a8"+
		"\u00aa\t\r\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\16\3\2\2\2\u00af\u00bd\5\7\4\2\u00b0\u00b1\7\62\2"+
		"\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00bd\5\t\5\2\u00b4\u00b5"+
		"\7\62\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bd\5\13\6\2"+
		"\u00b8\u00b9\7\62\2\2\u00b9\u00ba\7z\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd"+
		"\5\r\7\2\u00bc\u00af\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bd\20\3\2\2\2\u00be\u00c2\t\16\2\2\u00bf\u00c1\t\17"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\22\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\f\2"+
		"\2\u00c6\24\3\2\2\2\u00c7\u00c9\t\20\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\b\13\2\2\u00cd\26\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf\30\3\2\2\2\u00d0"+
		"\u00d1\7/\2\2\u00d1\32\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\34\3\2\2\2\u00d4"+
		"\u00d5\7\61\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7 \3\2\2\2\u00d8"+
		"\u00d9\7>\2\2\u00d9\"\3\2\2\2\u00da\u00db\7?\2\2\u00db$\3\2\2\2\u00dc"+
		"\u00dd\7`\2\2\u00dd&\3\2\2\2\u00de\u00df\7*\2\2\u00df(\3\2\2\2\u00e0\u00e1"+
		"\7+\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7"+
		"e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7u\2\2\u00e7.\3\2\2\2\u00e8\u00e9"+
		"\7u\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\60\3\2\2\2\u00ec\u00ed"+
		"\7v\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7p\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7c\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7u\2\2\u00f4"+
		"\64\3\2\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7k\2\2\u00f8"+
		"\u00f9\7p\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe8\3\2\2\2\u00ff\u0100\7n\2\2\u0100"+
		"\u0101\7p\2\2\u0101:\3\2\2\2\u0102\u0103\7n\2\2\u0103\u0104\7q\2\2\u0104"+
		"\u0105\7i\2\2\u0105<\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7s\2\2\u0108"+
		"\u0109\7t\2\2\u0109\u010a\7v\2\2\u010a>\3\2\2\2 \2AELOUW]_fioqwy\u0080"+
		"\u0083\u0089\u008b\u0091\u0093\u009a\u009d\u00a3\u00a5\u00ab\u00ad\u00bc"+
		"\u00c2\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}