// Generated from D:/A/src/main/java\Mx.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Void=33, Bool=34, Int=35, String=36, New=37, Class=38, Null=39, 
		True=40, False=41, This=42, If=43, Else=44, For=45, While=46, Break=47, 
		Continue=48, Return=49, Integers=50, Strings=51, Bools=52, ID=53, Whitespace=54, 
		Newline=55, BlockComment=56, LineComment=57;
	public static final int
		RULE_programs = 0, RULE_programsimple = 1, RULE_varDef = 2, RULE_varDefsimple = 3, 
		RULE_funcDef = 4, RULE_paraList = 5, RULE_para = 6, RULE_classDef = 7, 
		RULE_classDefstruct = 8, RULE_stmt = 9, RULE_part = 10, RULE_expr = 11, 
		RULE_exprList = 12, RULE_newformat = 13, RULE_constant = 14, RULE_basictype = 15, 
		RULE_type = 16, RULE_returntype = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programs", "programsimple", "varDef", "varDefsimple", "funcDef", "paraList", 
			"para", "classDef", "classDefstruct", "stmt", "part", "expr", "exprList", 
			"newformat", "constant", "basictype", "type", "returntype"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'.'", "'++'", "'--'", "'+'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'", 
			"'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'void'", "'bool'", "'int'", "'string'", 
			"'new'", "'class'", "'null'", "'true'", "'false'", "'this'", "'if'", 
			"'else'", "'for'", "'while'", "'break'", "'continue'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Void", "Bool", 
			"Int", "String", "New", "Class", "Null", "True", "False", "This", "If", 
			"Else", "For", "While", "Break", "Continue", "Return", "Integers", "Strings", 
			"Bools", "ID", "Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MxParser.EOF, 0); }
		public List<ProgramsimpleContext> programsimple() {
			return getRuleContexts(ProgramsimpleContext.class);
		}
		public ProgramsimpleContext programsimple(int i) {
			return getRuleContext(ProgramsimpleContext.class,i);
		}
		public ProgramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPrograms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPrograms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPrograms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramsContext programs() throws RecognitionException {
		ProgramsContext _localctx = new ProgramsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Class) | (1L << ID))) != 0)) {
				{
				{
				setState(36);
				programsimple();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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

	public static class ProgramsimpleContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ProgramsimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programsimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProgramsimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProgramsimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProgramsimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramsimpleContext programsimple() throws RecognitionException {
		ProgramsimpleContext _localctx = new ProgramsimpleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programsimple);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				funcDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				classDef();
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

	public static class VarDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefsimpleContext> varDefsimple() {
			return getRuleContexts(VarDefsimpleContext.class);
		}
		public VarDefsimpleContext varDefsimple(int i) {
			return getRuleContext(VarDefsimpleContext.class,i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			type();
			setState(50);
			varDefsimple();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				varDefsimple();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__1);
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

	public static class VarDefsimpleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefsimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefsimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVarDefsimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVarDefsimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarDefsimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefsimpleContext varDefsimple() throws RecognitionException {
		VarDefsimpleContext _localctx = new VarDefsimpleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefsimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(61);
				match(T__2);
				setState(62);
				expr(0);
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

	public static class FuncDefContext extends ParserRuleContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public ParaListContext paraList() {
			return getRuleContext(ParaListContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			returntype();
			setState(66);
			match(ID);
			setState(67);
			match(T__3);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << ID))) != 0)) {
				{
				setState(68);
				paraList();
				}
			}

			setState(71);
			match(T__4);
			setState(72);
			part();
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

	public static class ParaListContext extends ParserRuleContext {
		public List<ParaContext> para() {
			return getRuleContexts(ParaContext.class);
		}
		public ParaContext para(int i) {
			return getRuleContext(ParaContext.class,i);
		}
		public ParaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParaList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParaList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaListContext paraList() throws RecognitionException {
		ParaListContext _localctx = new ParaListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paraList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			para();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(75);
				match(T__0);
				setState(76);
				para();
				}
				}
				setState(81);
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

	public static class ParaContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			type();
			setState(83);
			match(ID);
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

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MxParser.Class, 0); }
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public List<ClassDefstructContext> classDefstruct() {
			return getRuleContexts(ClassDefstructContext.class);
		}
		public ClassDefstructContext classDefstruct(int i) {
			return getRuleContext(ClassDefstructContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Class);
			setState(86);
			match(ID);
			setState(87);
			match(T__5);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << ID))) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(88);
					varDef();
					}
					break;
				case 2:
					{
					setState(89);
					funcDef();
					}
					break;
				case 3:
					{
					setState(90);
					classDefstruct();
					}
					break;
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__6);
			setState(97);
			match(T__1);
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

	public static class ClassDefstructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public ClassDefstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassDefstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassDefstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassDefstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefstructContext classDefstruct() throws RecognitionException {
		ClassDefstructContext _localctx = new ClassDefstructContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDefstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(T__3);
			setState(101);
			match(T__4);
			setState(102);
			part();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprstmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhilestmtContext extends StmtContext {
		public TerminalNode While() { return getToken(MxParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhilestmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullstmtContext extends StmtContext {
		public NullstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNullstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNullstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNullstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForstmtContext extends StmtContext {
		public ExprContext expr1;
		public ExprContext expr2;
		public ExprContext expr3;
		public TerminalNode For() { return getToken(MxParser.For, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitForstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefstmtContext extends StmtContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public VarDefstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVarDefstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVarDefstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarDefstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfstmtContext extends StmtContext {
		public StmtContext st1;
		public StmtContext st2;
		public TerminalNode If() { return getToken(MxParser.If, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(MxParser.Else, 0); }
		public IfstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartstmtContext extends StmtContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public PartstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPartstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPartstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPartstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnstmtContext extends StmtContext {
		public TerminalNode Return() { return getToken(MxParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakstmtContext extends StmtContext {
		public TerminalNode Break() { return getToken(MxParser.Break, 0); }
		public BreakstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBreakstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBreakstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBreakstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinuestmtContext extends StmtContext {
		public TerminalNode Continue() { return getToken(MxParser.Continue, 0); }
		public ContinuestmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterContinuestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitContinuestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitContinuestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PartstmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				part();
				}
				break;
			case 2:
				_localctx = new VarDefstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				varDef();
				}
				break;
			case 3:
				_localctx = new IfstmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(If);
				setState(107);
				match(T__3);
				setState(108);
				expr(0);
				setState(109);
				match(T__4);
				setState(110);
				((IfstmtContext)_localctx).st1 = stmt();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(111);
					match(Else);
					setState(112);
					((IfstmtContext)_localctx).st2 = stmt();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(For);
				setState(116);
				match(T__3);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << New) | (1L << Null) | (1L << This) | (1L << Integers) | (1L << Strings) | (1L << Bools) | (1L << ID))) != 0)) {
					{
					setState(117);
					((ForstmtContext)_localctx).expr1 = expr(0);
					}
				}

				setState(120);
				match(T__1);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << New) | (1L << Null) | (1L << This) | (1L << Integers) | (1L << Strings) | (1L << Bools) | (1L << ID))) != 0)) {
					{
					setState(121);
					((ForstmtContext)_localctx).expr2 = expr(0);
					}
				}

				setState(124);
				match(T__1);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << New) | (1L << Null) | (1L << This) | (1L << Integers) | (1L << Strings) | (1L << Bools) | (1L << ID))) != 0)) {
					{
					setState(125);
					((ForstmtContext)_localctx).expr3 = expr(0);
					}
				}

				setState(128);
				match(T__4);
				setState(129);
				stmt();
				}
				break;
			case 5:
				_localctx = new WhilestmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(While);
				setState(131);
				match(T__3);
				setState(132);
				expr(0);
				setState(133);
				match(T__4);
				setState(134);
				stmt();
				}
				break;
			case 6:
				_localctx = new ReturnstmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(Return);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << New) | (1L << Null) | (1L << This) | (1L << Integers) | (1L << Strings) | (1L << Bools) | (1L << ID))) != 0)) {
					{
					setState(137);
					expr(0);
					}
				}

				setState(140);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new ContinuestmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				match(Continue);
				setState(142);
				match(T__1);
				}
				break;
			case 8:
				_localctx = new BreakstmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(Break);
				setState(144);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new ExprstmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				expr(0);
				setState(146);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new NullstmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				match(T__1);
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

	public static class PartContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__5);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << New) | (1L << Null) | (1L << This) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << Integers) | (1L << Strings) | (1L << Bools) | (1L << ID))) != 0)) {
				{
				{
				setState(152);
				stmt();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__6);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncexprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FuncexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFuncexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFuncexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFuncexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisexprContext extends ExprContext {
		public TerminalNode This() { return getToken(MxParser.This, 0); }
		public ThisexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterThisexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitThisexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitThisexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixexprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrefixexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPrefixexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPrefixexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPrefixexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewexprContext extends ExprContext {
		public TerminalNode New() { return getToken(MxParser.New, 0); }
		public NewformatContext newformat() {
			return getRuleContext(NewformatContext.class,0);
		}
		public NewexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuffixexprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SuffixexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSuffixexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSuffixexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSuffixexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryexprContext extends ExprContext {
		public ExprContext src1;
		public Token op;
		public ExprContext src2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBinaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBinaryexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBinaryexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubexprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSubexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSubexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSubexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdexprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public IdexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIdexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIdexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIdexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrexprContext extends ExprContext {
		public ExprContext expr1;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArrexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArrexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstexprContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConstexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConstexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassexprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public ClassexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new SubexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				match(T__3);
				setState(162);
				expr(0);
				setState(163);
				match(T__4);
				}
				break;
			case ID:
				{
				_localctx = new IdexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(ID);
				}
				break;
			case Null:
			case Integers:
			case Strings:
			case Bools:
				{
				_localctx = new ConstexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				constant();
				}
				break;
			case This:
				{
				_localctx = new ThisexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(This);
				}
				break;
			case T__10:
			case T__11:
				{
				_localctx = new PrefixexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				((PrefixexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((PrefixexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				expr(10);
				}
				break;
			case T__12:
			case T__13:
				{
				_localctx = new PrefixexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				((PrefixexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
					((PrefixexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				expr(9);
				}
				break;
			case T__14:
			case T__15:
				{
				_localctx = new PrefixexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				((PrefixexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((PrefixexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				expr(8);
				}
				break;
			case New:
				{
				_localctx = new NewexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(New);
				setState(175);
				newformat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryexprContext(new ExprContext(_parentctx, _parentState));
						((BinaryexprContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(179);
						((BinaryexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((BinaryexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						((BinaryexprContext)_localctx).src2 = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryexprContext(new ExprContext(_parentctx, _parentState));
						((BinaryexprContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(182);
						((BinaryexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((BinaryexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						((BinaryexprContext)_localctx).src2 = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryexprContext(new ExprContext(_parentctx, _parentState));
						((BinaryexprContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(185);
						((BinaryexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((BinaryexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						((BinaryexprContext)_localctx).src2 = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new BinaryexprContext(new ExprContext(_parentctx, _parentState));
						((BinaryexprContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						((BinaryexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((BinaryexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((BinaryexprContext)_localctx).src2 = expr(4);
						}
						break;
					case 5:
						{
						_localctx = new BinaryexprContext(new ExprContext(_parentctx, _parentState));
						((BinaryexprContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						((BinaryexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((BinaryexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((BinaryexprContext)_localctx).src2 = expr(3);
						}
						break;
					case 6:
						{
						_localctx = new BinaryexprContext(new ExprContext(_parentctx, _parentState));
						((BinaryexprContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(194);
						((BinaryexprContext)_localctx).op = match(T__2);
						setState(195);
						((BinaryexprContext)_localctx).src2 = expr(1);
						}
						break;
					case 7:
						{
						_localctx = new FuncexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(197);
						match(T__3);
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << New) | (1L << Null) | (1L << This) | (1L << Integers) | (1L << Strings) | (1L << Bools) | (1L << ID))) != 0)) {
							{
							setState(198);
							exprList();
							}
						}

						setState(201);
						match(T__4);
						}
						break;
					case 8:
						{
						_localctx = new ArrexprContext(new ExprContext(_parentctx, _parentState));
						((ArrexprContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(203);
						match(T__7);
						setState(204);
						((ArrexprContext)_localctx).expr2 = expr(0);
						setState(205);
						match(T__8);
						}
						break;
					case 9:
						{
						_localctx = new ClassexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(208);
						match(T__9);
						setState(209);
						match(ID);
						}
						break;
					case 10:
						{
						_localctx = new SuffixexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(211);
						((SuffixexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((SuffixexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			expr(0);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(218);
				match(T__0);
				setState(219);
				expr(0);
				}
				}
				setState(224);
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

	public static class NewformatContext extends ParserRuleContext {
		public NewformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newformat; }
	 
		public NewformatContext() { }
		public void copyFrom(NewformatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassnewformatContext extends NewformatContext {
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public ClassnewformatContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassnewformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassnewformat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassnewformat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicnewformatContext extends NewformatContext {
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public BasicnewformatContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBasicnewformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBasicnewformat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBasicnewformat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrornewformatContext extends NewformatContext {
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ErrornewformatContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterErrornewformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitErrornewformat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitErrornewformat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraynewformatContext extends NewformatContext {
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArraynewformatContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArraynewformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArraynewformat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArraynewformat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewformatContext newformat() throws RecognitionException {
		NewformatContext _localctx = new NewformatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_newformat);
		try {
			int _alt;
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ErrornewformatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				basictype();
				setState(230); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						match(T__7);
						setState(227);
						expr(0);
						setState(228);
						match(T__8);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(232); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(236); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(T__7);
						setState(235);
						match(T__8);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(238); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(244); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(240);
						match(T__7);
						setState(241);
						expr(0);
						setState(242);
						match(T__8);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(246); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new ArraynewformatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				basictype();
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(249);
						match(T__7);
						setState(250);
						expr(0);
						setState(251);
						match(T__8);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(257);
						match(T__7);
						setState(258);
						match(T__8);
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ClassnewformatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				basictype();
				setState(265);
				match(T__3);
				setState(266);
				match(T__4);
				}
				break;
			case 4:
				_localctx = new BasicnewformatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				basictype();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integers() { return getToken(MxParser.Integers, 0); }
		public TerminalNode Strings() { return getToken(MxParser.Strings, 0); }
		public TerminalNode Bools() { return getToken(MxParser.Bools, 0); }
		public TerminalNode Null() { return getToken(MxParser.Null, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Null) | (1L << Integers) | (1L << Strings) | (1L << Bools))) != 0)) ) {
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

	public static class BasictypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public TerminalNode Bool() { return getToken(MxParser.Bool, 0); }
		public TerminalNode Int() { return getToken(MxParser.Int, 0); }
		public TerminalNode String() { return getToken(MxParser.String, 0); }
		public BasictypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basictype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBasictype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBasictype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBasictype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasictypeContext basictype() throws RecognitionException {
		BasictypeContext _localctx = new BasictypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_basictype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << ID))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			basictype();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(276);
				match(T__7);
				setState(277);
				match(T__8);
				}
				}
				setState(282);
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

	public static class ReturntypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(MxParser.Void, 0); }
		public ReturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterReturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitReturntype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturntypeContext returntype() throws RecognitionException {
		ReturntypeContext _localctx = new ReturntypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returntype);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				type();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(Void);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0120\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u00029\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"@\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"F\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\\\b\u0007\n\u0007\f\u0007_\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tr\b\t\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001\t\u0001\t\u0003"+
		"\t{\b\t\u0001\t\u0001\t\u0003\t\u007f\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008b\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0096\b\t\u0001\n\u0001\n\u0005\n\u009a\b\n\n\n\f\n\u009d\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b1\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c8\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00d5\b\u000b\n\u000b\f\u000b\u00d8\t\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00dd\b\f\n\f\f\f\u00e0\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0004\r\u00e7\b\r\u000b\r\f\r\u00e8\u0001\r\u0001\r\u0004\r\u00ed\b\r"+
		"\u000b\r\f\r\u00ee\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00f5\b\r\u000b"+
		"\r\f\r\u00f6\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00fe\b\r"+
		"\u000b\r\f\r\u00ff\u0001\r\u0001\r\u0005\r\u0104\b\r\n\r\f\r\u0107\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u010e\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0117\b\u0010\n\u0010\f\u0010\u011a\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u011e\b\u0011\u0001\u0011\u0000\u0001\u0016\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\n\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000"+
		"\u000f\u0010\u0002\u0000\r\u000e\u0011\u0013\u0001\u0000\u0014\u0015\u0001"+
		"\u0000\u0016\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u001c \u0002\u0000"+
		"\'\'24\u0002\u0000\"$55\u0143\u0000\'\u0001\u0000\u0000\u0000\u0002/\u0001"+
		"\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000"+
		"\u0000\bA\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fR\u0001"+
		"\u0000\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000"+
		"\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000"+
		"\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00d9\u0001\u0000\u0000"+
		"\u0000\u001a\u010d\u0001\u0000\u0000\u0000\u001c\u010f\u0001\u0000\u0000"+
		"\u0000\u001e\u0111\u0001\u0000\u0000\u0000 \u0113\u0001\u0000\u0000\u0000"+
		"\"\u011d\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000\u0000\u0000,0\u0003\u0004"+
		"\u0002\u0000-0\u0003\b\u0004\u0000.0\u0003\u000e\u0007\u0000/,\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0003"+
		"\u0001\u0000\u0000\u000012\u0003 \u0010\u000027\u0003\u0006\u0003\u0000"+
		"34\u0005\u0001\u0000\u000046\u0003\u0006\u0003\u000053\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005"+
		"\u0002\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<?\u00055\u0000\u0000"+
		"=>\u0005\u0003\u0000\u0000>@\u0003\u0016\u000b\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0003"+
		"\"\u0011\u0000BC\u00055\u0000\u0000CE\u0005\u0004\u0000\u0000DF\u0003"+
		"\n\u0005\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0005\u0000\u0000HI\u0003\u0014\n\u0000I\t"+
		"\u0001\u0000\u0000\u0000JO\u0003\f\u0006\u0000KL\u0005\u0001\u0000\u0000"+
		"LN\u0003\f\u0006\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000b\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0003 \u0010\u0000ST\u00055\u0000"+
		"\u0000T\r\u0001\u0000\u0000\u0000UV\u0005&\u0000\u0000VW\u00055\u0000"+
		"\u0000W]\u0005\u0006\u0000\u0000X\\\u0003\u0004\u0002\u0000Y\\\u0003\b"+
		"\u0004\u0000Z\\\u0003\u0010\b\u0000[X\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0007\u0000\u0000ab\u0005\u0002"+
		"\u0000\u0000b\u000f\u0001\u0000\u0000\u0000cd\u00055\u0000\u0000de\u0005"+
		"\u0004\u0000\u0000ef\u0005\u0005\u0000\u0000fg\u0003\u0014\n\u0000g\u0011"+
		"\u0001\u0000\u0000\u0000h\u0096\u0003\u0014\n\u0000i\u0096\u0003\u0004"+
		"\u0002\u0000jk\u0005+\u0000\u0000kl\u0005\u0004\u0000\u0000lm\u0003\u0016"+
		"\u000b\u0000mn\u0005\u0005\u0000\u0000nq\u0003\u0012\t\u0000op\u0005,"+
		"\u0000\u0000pr\u0003\u0012\t\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000r\u0096\u0001\u0000\u0000\u0000st\u0005-\u0000\u0000tv\u0005"+
		"\u0004\u0000\u0000uw\u0003\u0016\u000b\u0000vu\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0005\u0002\u0000"+
		"\u0000y{\u0003\u0016\u000b\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0005\u0002\u0000\u0000}\u007f"+
		"\u0003\u0016\u000b\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0005"+
		"\u0000\u0000\u0081\u0096\u0003\u0012\t\u0000\u0082\u0083\u0005.\u0000"+
		"\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0003\u0016\u000b"+
		"\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u0087\u0003\u0012\t\u0000"+
		"\u0087\u0096\u0001\u0000\u0000\u0000\u0088\u008a\u00051\u0000\u0000\u0089"+
		"\u008b\u0003\u0016\u000b\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u0096\u0005\u0002\u0000\u0000\u008d\u008e\u00050\u0000\u0000\u008e\u0096"+
		"\u0005\u0002\u0000\u0000\u008f\u0090\u0005/\u0000\u0000\u0090\u0096\u0005"+
		"\u0002\u0000\u0000\u0091\u0092\u0003\u0016\u000b\u0000\u0092\u0093\u0005"+
		"\u0002\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0096\u0005"+
		"\u0002\u0000\u0000\u0095h\u0001\u0000\u0000\u0000\u0095i\u0001\u0000\u0000"+
		"\u0000\u0095j\u0001\u0000\u0000\u0000\u0095s\u0001\u0000\u0000\u0000\u0095"+
		"\u0082\u0001\u0000\u0000\u0000\u0095\u0088\u0001\u0000\u0000\u0000\u0095"+
		"\u008d\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095"+
		"\u0091\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0013\u0001\u0000\u0000\u0000\u0097\u009b\u0005\u0006\u0000\u0000\u0098"+
		"\u009a\u0003\u0012\t\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u0015"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\u000b\uffff\uffff\u0000\u00a1"+
		"\u00a2\u0005\u0004\u0000\u0000\u00a2\u00a3\u0003\u0016\u000b\u0000\u00a3"+
		"\u00a4\u0005\u0005\u0000\u0000\u00a4\u00b1\u0001\u0000\u0000\u0000\u00a5"+
		"\u00b1\u00055\u0000\u0000\u00a6\u00b1\u0003\u001c\u000e\u0000\u00a7\u00b1"+
		"\u0005*\u0000\u0000\u00a8\u00a9\u0007\u0000\u0000\u0000\u00a9\u00b1\u0003"+
		"\u0016\u000b\n\u00aa\u00ab\u0007\u0001\u0000\u0000\u00ab\u00b1\u0003\u0016"+
		"\u000b\t\u00ac\u00ad\u0007\u0002\u0000\u0000\u00ad\u00b1\u0003\u0016\u000b"+
		"\b\u00ae\u00af\u0005%\u0000\u0000\u00af\u00b1\u0003\u001a\r\u0000\u00b0"+
		"\u00a0\u0001\u0000\u0000\u0000\u00b0\u00a5\u0001\u0000\u0000\u0000\u00b0"+
		"\u00a6\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0"+
		"\u00a8\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00d6\u0001\u0000\u0000\u0000\u00b2\u00b3\n\u0006\u0000\u0000\u00b3\u00b4"+
		"\u0007\u0003\u0000\u0000\u00b4\u00d5\u0003\u0016\u000b\u0007\u00b5\u00b6"+
		"\n\u0005\u0000\u0000\u00b6\u00b7\u0007\u0004\u0000\u0000\u00b7\u00d5\u0003"+
		"\u0016\u000b\u0006\u00b8\u00b9\n\u0004\u0000\u0000\u00b9\u00ba\u0007\u0005"+
		"\u0000\u0000\u00ba\u00d5\u0003\u0016\u000b\u0005\u00bb\u00bc\n\u0003\u0000"+
		"\u0000\u00bc\u00bd\u0007\u0006\u0000\u0000\u00bd\u00d5\u0003\u0016\u000b"+
		"\u0004\u00be\u00bf\n\u0002\u0000\u0000\u00bf\u00c0\u0007\u0007\u0000\u0000"+
		"\u00c0\u00d5\u0003\u0016\u000b\u0003\u00c1\u00c2\n\u0001\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0003\u0000\u0000\u00c3\u00d5\u0003\u0016\u000b\u0001\u00c4"+
		"\u00c5\n\u000e\u0000\u0000\u00c5\u00c7\u0005\u0004\u0000\u0000\u00c6\u00c8"+
		"\u0003\u0018\f\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00d5\u0005"+
		"\u0005\u0000\u0000\u00ca\u00cb\n\r\u0000\u0000\u00cb\u00cc\u0005\b\u0000"+
		"\u0000\u00cc\u00cd\u0003\u0016\u000b\u0000\u00cd\u00ce\u0005\t\u0000\u0000"+
		"\u00ce\u00d5\u0001\u0000\u0000\u0000\u00cf\u00d0\n\f\u0000\u0000\u00d0"+
		"\u00d1\u0005\n\u0000\u0000\u00d1\u00d5\u00055\u0000\u0000\u00d2\u00d3"+
		"\n\u000b\u0000\u0000\u00d3\u00d5\u0007\u0000\u0000\u0000\u00d4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00b5\u0001\u0000\u0000\u0000\u00d4\u00b8\u0001"+
		"\u0000\u0000\u0000\u00d4\u00bb\u0001\u0000\u0000\u0000\u00d4\u00be\u0001"+
		"\u0000\u0000\u0000\u00d4\u00c1\u0001\u0000\u0000\u0000\u00d4\u00c4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000\u00d4\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u0017\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00de\u0003\u0016\u000b\u0000\u00da\u00db\u0005"+
		"\u0001\u0000\u0000\u00db\u00dd\u0003\u0016\u000b\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u0019\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e6\u0003"+
		"\u001e\u000f\u0000\u00e2\u00e3\u0005\b\u0000\u0000\u00e3\u00e4\u0003\u0016"+
		"\u000b\u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\b\u0000\u0000"+
		"\u00eb\u00ed\u0005\t\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f4\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\b\u0000\u0000\u00f1\u00f2\u0003\u0016\u000b\u0000\u00f2\u00f3"+
		"\u0005\t\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u010e\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fd\u0003\u001e\u000f\u0000\u00f9\u00fa\u0005"+
		"\b\u0000\u0000\u00fa\u00fb\u0003\u0016\u000b\u0000\u00fb\u00fc\u0005\t"+
		"\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0105\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\b\u0000\u0000\u0102\u0104\u0005\t\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u010e\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0003\u001e\u000f\u0000\u0109\u010a\u0005\u0004\u0000"+
		"\u0000\u010a\u010b\u0005\u0005\u0000\u0000\u010b\u010e\u0001\u0000\u0000"+
		"\u0000\u010c\u010e\u0003\u001e\u000f\u0000\u010d\u00e1\u0001\u0000\u0000"+
		"\u0000\u010d\u00f8\u0001\u0000\u0000\u0000\u010d\u0108\u0001\u0000\u0000"+
		"\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u001b\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0007\b\u0000\u0000\u0110\u001d\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0007\t\u0000\u0000\u0112\u001f\u0001\u0000\u0000\u0000\u0113"+
		"\u0118\u0003\u001e\u000f\u0000\u0114\u0115\u0005\b\u0000\u0000\u0115\u0117"+
		"\u0005\t\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119!\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011e\u0003 \u0010\u0000\u011c\u011e\u0005!\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000"+
		"\u011e#\u0001\u0000\u0000\u0000\u001c\'/7?EO[]qvz~\u008a\u0095\u009b\u00b0"+
		"\u00c7\u00d4\u00d6\u00de\u00e8\u00ee\u00f6\u00ff\u0105\u010d\u0118\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}