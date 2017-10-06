// Generated from HEN.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HENLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMBERS=12, CHAR=13, STRING=14, INTEGER=15, FLOAT=16, 
		ARRAY=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "NUMBERS", "CHAR", "STRING", "INTEGER", "FLOAT", "ARRAY", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function {'", "'}'", "'print'", "'gets'", "'add'", "'div'", "'mult'", 
		"'sub'", "'DAMN'", "'FUCK'", "'SHITE'", null, null, null, null, null, 
		"'SHIT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NUMBERS", "CHAR", "STRING", "INTEGER", "FLOAT", "ARRAY", "WS"
	};
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


	public HENLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HEN.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rb\n\r\r\r\16\rc\3\16\6"+
		"\16g\n\16\r\16\16\16h\3\17\6\17l\n\17\r\17\16\17m\3\20\6\20q\n\20\r\20"+
		"\16\20r\3\21\6\21v\n\21\r\21\16\21w\3\22\3\22\3\22\3\22\3\22\3\23\6\23"+
		"\u0080\n\23\r\23\16\23\u0081\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\3"+
		"\2\62;\5\2\62;C\\c|\7\2\13\f\"\"\62;C\\c|\4\2\13\f\"\"\2\u008a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\3\'\3\2\2\2\5\62\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13?\3\2\2\2\r"+
		"C\3\2\2\2\17G\3\2\2\2\21L\3\2\2\2\23P\3\2\2\2\25U\3\2\2\2\27Z\3\2\2\2"+
		"\31a\3\2\2\2\33f\3\2\2\2\35k\3\2\2\2\37p\3\2\2\2!u\3\2\2\2#y\3\2\2\2%"+
		"\177\3\2\2\2\'(\7h\2\2()\7w\2\2)*\7p\2\2*+\7e\2\2+,\7v\2\2,-\7k\2\2-."+
		"\7q\2\2./\7p\2\2/\60\7\"\2\2\60\61\7}\2\2\61\4\3\2\2\2\62\63\7\177\2\2"+
		"\63\6\3\2\2\2\64\65\7r\2\2\65\66\7t\2\2\66\67\7k\2\2\678\7p\2\289\7v\2"+
		"\29\b\3\2\2\2:;\7i\2\2;<\7g\2\2<=\7v\2\2=>\7u\2\2>\n\3\2\2\2?@\7c\2\2"+
		"@A\7f\2\2AB\7f\2\2B\f\3\2\2\2CD\7f\2\2DE\7k\2\2EF\7x\2\2F\16\3\2\2\2G"+
		"H\7o\2\2HI\7w\2\2IJ\7n\2\2JK\7v\2\2K\20\3\2\2\2LM\7u\2\2MN\7w\2\2NO\7"+
		"d\2\2O\22\3\2\2\2PQ\7F\2\2QR\7C\2\2RS\7O\2\2ST\7P\2\2T\24\3\2\2\2UV\7"+
		"H\2\2VW\7W\2\2WX\7E\2\2XY\7M\2\2Y\26\3\2\2\2Z[\7U\2\2[\\\7J\2\2\\]\7K"+
		"\2\2]^\7V\2\2^_\7G\2\2_\30\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2d\32\3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2i\34\3\2\2\2jl\t\4\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		"\36\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s \3\2\2"+
		"\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\"\3\2\2\2yz\7U\2"+
		"\2z{\7J\2\2{|\7K\2\2|}\7V\2\2}$\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\b\23\2\2\u0084&\3\2\2\2\t\2chmrw\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}