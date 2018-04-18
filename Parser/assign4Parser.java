// Generated from assign4.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class assign4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		FOR=25, TO=26, EQ=27, NEQ=28, GT=29, LT=30, GTEQ=31, LTEQ=32, IF=33, ELSE=34, 
		WHILE=35, IDENT=36, WS=37, SPACE=38, INT=39, REAL=40, STRING=41, TEXT=42;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statList = 2, RULE_stmts = 3, RULE_variableDeclaration = 4, 
		RULE_functiondeclare = 5, RULE_functioncall = 6, RULE_variableinteger = 7, 
		RULE_variablereal = 8, RULE_varint2 = 9, RULE_varreal2 = 10, RULE_argumentList = 11, 
		RULE_variableDec2 = 12, RULE_argumentList2 = 13, RULE_descriptor = 14, 
		RULE_stat_block = 15, RULE_nestedBlock = 16, RULE_typeIdentifier = 17, 
		RULE_inputDeclaration = 18, RULE_inputVariable = 19, RULE_inputVariable2 = 20, 
		RULE_printDeclaration = 21, RULE_assignmentDeclaration = 22, RULE_expressionString = 23, 
		RULE_simpleExpression = 24, RULE_term = 25, RULE_factor = 26, RULE_ifstatement = 27, 
		RULE_conditionblock = 28, RULE_paratype = 29, RULE_datatype = 30, RULE_datavalue = 31;
	public static final String[] ruleNames = {
		"program", "block", "statList", "stmts", "variableDeclaration", "functiondeclare", 
		"functioncall", "variableinteger", "variablereal", "varint2", "varreal2", 
		"argumentList", "variableDec2", "argumentList2", "descriptor", "stat_block", 
		"nestedBlock", "typeIdentifier", "inputDeclaration", "inputVariable", 
		"inputVariable2", "printDeclaration", "assignmentDeclaration", "expressionString", 
		"simpleExpression", "term", "factor", "ifstatement", "conditionblock", 
		"paratype", "datatype", "datavalue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'integer'", "','", "'real'", "'function'", 
		"'('", "') :'", "'()'", "')'", "'descriptor'", "'input'", "'print '", 
		"'let'", "'='", "'(real)'", "'(integer)'", "'+'", "'-'", "'*'", "'/'", 
		"'in'", "'out'", "'inout'", "'for'", "'to'", "'=='", "'!='", "'>'", "'<'", 
		"'>='", "'<='", "'if'", "'else'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "FOR", "TO", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "IF", "ELSE", 
		"WHILE", "IDENT", "WS", "SPACE", "INT", "REAL", "STRING", "TEXT"
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

	@Override
	public String getGrammarFileName() { return "assign4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public assign4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			block();
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
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			statList();
			setState(68);
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

	public static class StatListContext extends ParserRuleContext {
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitStatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitStatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			stmts();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IF) | (1L << IDENT))) != 0)) {
				{
				{
				setState(71);
				stmts();
				}
				}
				setState(76);
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

	public static class StmtsContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
		public PrintDeclarationContext printDeclaration() {
			return getRuleContext(PrintDeclarationContext.class,0);
		}
		public AssignmentDeclarationContext assignmentDeclaration() {
			return getRuleContext(AssignmentDeclarationContext.class,0);
		}
		public DescriptorContext descriptor() {
			return getRuleContext(DescriptorContext.class,0);
		}
		public NestedBlockContext nestedBlock() {
			return getRuleContext(NestedBlockContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public FunctiondeclareContext functiondeclare() {
			return getRuleContext(FunctiondeclareContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmts);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				variableDeclaration();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				inputDeclaration();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				printDeclaration();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				assignmentDeclaration();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				descriptor();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				nestedBlock();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				ifstatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				functiondeclare();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				functioncall();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<VariableintegerContext> variableinteger() {
			return getRuleContexts(VariableintegerContext.class);
		}
		public VariableintegerContext variableinteger(int i) {
			return getRuleContext(VariableintegerContext.class,i);
		}
		public List<VariablerealContext> variablereal() {
			return getRuleContexts(VariablerealContext.class);
		}
		public VariablerealContext variablereal(int i) {
			return getRuleContext(VariablerealContext.class,i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		int _la;
		try {
			setState(106);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__2);
				setState(89);
				variableinteger();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(90);
					match(T__3);
					setState(91);
					variableinteger();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__4);
				setState(98);
				variablereal();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(99);
					match(T__3);
					setState(100);
					variablereal();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FunctiondeclareContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public FunctiondeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterFunctiondeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitFunctiondeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitFunctiondeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclareContext functiondeclare() throws RecognitionException {
		FunctiondeclareContext _localctx = new FunctiondeclareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functiondeclare);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__5);
				setState(109);
				match(IDENT);
				setState(110);
				match(T__6);
				setState(111);
				argumentList();
				setState(112);
				match(T__7);
				setState(113);
				datatype();
				setState(114);
				stat_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__5);
				setState(117);
				match(IDENT);
				setState(118);
				match(T__8);
				setState(119);
				stat_block();
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public ArgumentList2Context argumentList2() {
			return getRuleContext(ArgumentList2Context.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functioncall);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(IDENT);
				setState(123);
				match(T__6);
				setState(124);
				argumentList2();
				setState(125);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(IDENT);
				setState(128);
				match(T__8);
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

	public static class VariableintegerContext extends ParserRuleContext {
		public VariableintegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableinteger; }
	 
		public VariableintegerContext() { }
		public void copyFrom(VariableintegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarIntContext extends VariableintegerContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public VarIntContext(VariableintegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterVarInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitVarInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitVarInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableintegerContext variableinteger() throws RecognitionException {
		VariableintegerContext _localctx = new VariableintegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableinteger);
		try {
			_localctx = new VarIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENT);
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

	public static class VariablerealContext extends ParserRuleContext {
		public VariablerealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablereal; }
	 
		public VariablerealContext() { }
		public void copyFrom(VariablerealContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarRealContext extends VariablerealContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public VarRealContext(VariablerealContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterVarReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitVarReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitVarReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablerealContext variablereal() throws RecognitionException {
		VariablerealContext _localctx = new VariablerealContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variablereal);
		try {
			_localctx = new VarRealContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENT);
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

	public static class Varint2Context extends ParserRuleContext {
		public Varint2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varint2; }
	 
		public Varint2Context() { }
		public void copyFrom(Varint2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Intident2Context extends Varint2Context {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public Intident2Context(Varint2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterIntident2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitIntident2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitIntident2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varint2Context varint2() throws RecognitionException {
		Varint2Context _localctx = new Varint2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_varint2);
		try {
			_localctx = new Intident2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENT);
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

	public static class Varreal2Context extends ParserRuleContext {
		public Varreal2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varreal2; }
	 
		public Varreal2Context() { }
		public void copyFrom(Varreal2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Realident2Context extends Varreal2Context {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public Realident2Context(Varreal2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterRealident2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitRealident2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitRealident2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varreal2Context varreal2() throws RecognitionException {
		Varreal2Context _localctx = new Varreal2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_varreal2);
		try {
			_localctx = new Realident2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IDENT);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<VariableDec2Context> variableDec2() {
			return getRuleContexts(VariableDec2Context.class);
		}
		public VariableDec2Context variableDec2(int i) {
			return getRuleContext(VariableDec2Context.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			variableDec2();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(140);
				match(T__3);
				setState(141);
				variableDec2();
				}
				}
				setState(146);
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

	public static class VariableDec2Context extends ParserRuleContext {
		public ParatypeContext paratype() {
			return getRuleContext(ParatypeContext.class,0);
		}
		public List<Varint2Context> varint2() {
			return getRuleContexts(Varint2Context.class);
		}
		public Varint2Context varint2(int i) {
			return getRuleContext(Varint2Context.class,i);
		}
		public List<Varreal2Context> varreal2() {
			return getRuleContexts(Varreal2Context.class);
		}
		public Varreal2Context varreal2(int i) {
			return getRuleContext(Varreal2Context.class,i);
		}
		public VariableDec2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDec2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterVariableDec2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitVariableDec2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitVariableDec2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDec2Context variableDec2() throws RecognitionException {
		VariableDec2Context _localctx = new VariableDec2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDec2);
		try {
			int _alt;
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				paratype();
				setState(148);
				match(T__2);
				setState(149);
				varint2();
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						match(T__3);
						setState(151);
						varint2();
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				paratype();
				setState(158);
				match(T__4);
				setState(159);
				varreal2();
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						match(T__3);
						setState(161);
						varreal2();
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ArgumentList2Context extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<InputVariableContext> inputVariable() {
			return getRuleContexts(InputVariableContext.class);
		}
		public InputVariableContext inputVariable(int i) {
			return getRuleContext(InputVariableContext.class,i);
		}
		public ArgumentList2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterArgumentList2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitArgumentList2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitArgumentList2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentList2Context argumentList2() throws RecognitionException {
		ArgumentList2Context _localctx = new ArgumentList2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentList2);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				simpleExpression(0);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(170);
					match(T__3);
					setState(171);
					simpleExpression(0);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				inputVariable();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(178);
					match(T__3);
					setState(179);
					inputVariable();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class DescriptorContext extends ParserRuleContext {
		public DescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptor; }
	 
		public DescriptorContext() { }
		public void copyFrom(DescriptorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdescriptorContext extends DescriptorContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public AdescriptorContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAdescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAdescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAdescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptorContext descriptor() throws RecognitionException {
		DescriptorContext _localctx = new DescriptorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_descriptor);
		try {
			_localctx = new AdescriptorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__10);
			setState(188);
			match(IDENT);
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

	public static class Stat_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat_block);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				stmts();
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

	public static class NestedBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NestedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterNestedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitNestedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitNestedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedBlockContext nestedBlock() throws RecognitionException {
		NestedBlockContext _localctx = new NestedBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nestedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			block();
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public Integer i;
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitTypeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeIdentifier);
		try {
			setState(200);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__2);
				 ((TypeIdentifierContext)_localctx).i =  0;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__4);
				 ((TypeIdentifierContext)_localctx).i =  1;
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

	public static class InputDeclarationContext extends ParserRuleContext {
		public List<InputVariableContext> inputVariable() {
			return getRuleContexts(InputVariableContext.class);
		}
		public InputVariableContext inputVariable(int i) {
			return getRuleContext(InputVariableContext.class,i);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitInputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__11);
			setState(203);
			inputVariable();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(204);
				match(T__3);
				setState(205);
				inputVariable();
				}
				}
				setState(210);
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

	public static class InputVariableContext extends ParserRuleContext {
		public InputVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputVariable; }
	 
		public InputVariableContext() { }
		public void copyFrom(InputVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputVarContext extends InputVariableContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public InputVarContext(InputVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterInputVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitInputVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitInputVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputVariableContext inputVariable() throws RecognitionException {
		InputVariableContext _localctx = new InputVariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inputVariable);
		try {
			_localctx = new InputVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(IDENT);
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

	public static class InputVariable2Context extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public InputVariable2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputVariable2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterInputVariable2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitInputVariable2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitInputVariable2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputVariable2Context inputVariable2() throws RecognitionException {
		InputVariable2Context _localctx = new InputVariable2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_inputVariable2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IDENT);
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

	public static class PrintDeclarationContext extends ParserRuleContext {
		public PrintDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printDeclaration; }
	 
		public PrintDeclarationContext() { }
		public void copyFrom(PrintDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintexprstringContext extends PrintDeclarationContext {
		public ExpressionStringContext expressionString() {
			return getRuleContext(ExpressionStringContext.class,0);
		}
		public PrintexprstringContext(PrintDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterPrintexprstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitPrintexprstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitPrintexprstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintfactContext extends PrintDeclarationContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PrintfactContext(PrintDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterPrintfact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitPrintfact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitPrintfact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintDeclarationContext printDeclaration() throws RecognitionException {
		PrintDeclarationContext _localctx = new PrintDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printDeclaration);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new PrintfactContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__12);
				setState(216);
				factor();
				}
				break;
			case 2:
				_localctx = new PrintexprstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__12);
				setState(218);
				expressionString();
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

	public static class AssignmentDeclarationContext extends ParserRuleContext {
		public AssignmentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentDeclaration; }
	 
		public AssignmentDeclarationContext() { }
		public void copyFrom(AssignmentDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignrealContext extends AssignmentDeclarationContext {
		public Token first;
		public SimpleExpressionContext next;
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public AssignrealContext(AssignmentDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAssignreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAssignreal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAssignreal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignintegerContext extends AssignmentDeclarationContext {
		public Token first;
		public SimpleExpressionContext next;
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public AssignintegerContext(AssignmentDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAssigninteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAssigninteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAssigninteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends AssignmentDeclarationContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public AssignContext(AssignmentDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentDeclarationContext assignmentDeclaration() throws RecognitionException {
		AssignmentDeclarationContext _localctx = new AssignmentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentDeclaration);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__13);
				setState(222);
				match(IDENT);
				setState(223);
				match(T__14);
				setState(224);
				simpleExpression(0);
				}
				break;
			case 2:
				_localctx = new AssignrealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__13);
				setState(226);
				((AssignrealContext)_localctx).first = match(IDENT);
				setState(227);
				match(T__14);
				setState(228);
				match(T__15);
				setState(229);
				((AssignrealContext)_localctx).next = simpleExpression(0);
				}
				break;
			case 3:
				_localctx = new AssignintegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(T__13);
				setState(231);
				((AssignintegerContext)_localctx).first = match(IDENT);
				setState(232);
				match(T__14);
				setState(233);
				match(T__16);
				setState(234);
				((AssignintegerContext)_localctx).next = simpleExpression(0);
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

	public static class ExpressionStringContext extends ParserRuleContext {
		public ExpressionStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionString; }
	 
		public ExpressionStringContext() { }
		public void copyFrom(ExpressionStringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomexpressionstringContext extends ExpressionStringContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public AtomexpressionstringContext(ExpressionStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAtomexpressionstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAtomexpressionstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAtomexpressionstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends ExpressionStringContext {
		public TerminalNode TEXT() { return getToken(assign4Parser.TEXT, 0); }
		public TextContext(ExpressionStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStringContext expressionString() throws RecognitionException {
		ExpressionStringContext _localctx = new ExpressionStringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionString);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case IDENT:
			case INT:
			case REAL:
				_localctx = new AtomexpressionstringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				simpleExpression(0);
				}
				break;
			case TEXT:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(TEXT);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtermContext extends SimpleExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AtermContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAterm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends SimpleExpressionContext {
		public Token op;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(assign4Parser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(assign4Parser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(assign4Parser.LT, 0); }
		public TerminalNode GT() { return getToken(assign4Parser.GT, 0); }
		public RelationalExpressionContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends SimpleExpressionContext {
		public Token op;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(assign4Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(assign4Parser.NEQ, 0); }
		public EqualityExpressionContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorSubContext extends SimpleExpressionContext {
		public TermContext first;
		public SimpleExpressionContext next;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public OperatorSubContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterOperatorSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitOperatorSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitOperatorSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorAddContext extends SimpleExpressionContext {
		public TermContext first;
		public SimpleExpressionContext next;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public OperatorAddContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterOperatorAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitOperatorAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitOperatorAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_simpleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new OperatorAddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242);
				((OperatorAddContext)_localctx).first = term();
				setState(243);
				match(T__17);
				setState(244);
				((OperatorAddContext)_localctx).next = simpleExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new OperatorSubContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				((OperatorSubContext)_localctx).first = term();
				setState(247);
				match(T__18);
				setState(248);
				((OperatorSubContext)_localctx).next = simpleExpression(4);
				}
				break;
			case 3:
				{
				_localctx = new AtermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				term();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(253);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(254);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(255);
						simpleExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(new SimpleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(256);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(257);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(258);
						simpleExpression(3);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorMulContext extends TermContext {
		public FactorContext first;
		public TermContext next;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperatorMulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterOperatorMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitOperatorMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitOperatorMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AfactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AfactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAfactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAfactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAfactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorDivContext extends TermContext {
		public FactorContext first;
		public TermContext next;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperatorDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterOperatorDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitOperatorDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitOperatorDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new OperatorMulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				((OperatorMulContext)_localctx).first = factor();
				setState(265);
				match(T__19);
				setState(266);
				((OperatorMulContext)_localctx).next = term();
				}
				break;
			case 2:
				_localctx = new OperatorDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				((OperatorDivContext)_localctx).first = factor();
				setState(269);
				match(T__20);
				setState(270);
				((OperatorDivContext)_localctx).next = term();
				}
				break;
			case 3:
				_localctx = new AfactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AidentContext extends FactorContext {
		public TerminalNode IDENT() { return getToken(assign4Parser.IDENT, 0); }
		public AidentContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterAident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitAident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitAident(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealContext extends FactorContext {
		public TerminalNode REAL() { return getToken(assign4Parser.REAL, 0); }
		public RealContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends FactorContext {
		public TerminalNode INT() { return getToken(assign4Parser.INT, 0); }
		public IntContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new AidentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(IDENT);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(REAL);
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

	public static class IfstatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(assign4Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(assign4Parser.IF, i);
		}
		public List<ConditionblockContext> conditionblock() {
			return getRuleContexts(ConditionblockContext.class);
		}
		public ConditionblockContext conditionblock(int i) {
			return getRuleContext(ConditionblockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(assign4Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(assign4Parser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(IF);
			setState(281);
			conditionblock();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(ELSE);
					setState(283);
					match(IF);
					setState(284);
					conditionblock();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(290);
				match(ELSE);
				setState(291);
				stat_block();
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

	public static class ConditionblockContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ConditionblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterConditionblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitConditionblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitConditionblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionblockContext conditionblock() throws RecognitionException {
		ConditionblockContext _localctx = new ConditionblockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditionblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			simpleExpression(0);
			setState(295);
			stat_block();
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

	public static class ParatypeContext extends ParserRuleContext {
		public ParatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paratype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterParatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitParatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitParatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParatypeContext paratype() throws RecognitionException {
		ParatypeContext _localctx = new ParatypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_paratype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DatavalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(assign4Parser.INT, 0); }
		public TerminalNode REAL() { return getToken(assign4Parser.REAL, 0); }
		public DatavalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datavalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).enterDatavalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign4Listener ) ((assign4Listener)listener).exitDatavalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assign4Visitor ) return ((assign4Visitor<? extends T>)visitor).visitDatavalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatavalueContext datavalue() throws RecognitionException {
		DatavalueContext _localctx = new DatavalueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_datavalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6"+
		"b\13\6\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0084\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\u0091"+
		"\n\r\f\r\16\r\u0094\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u009b\n\16\f\16"+
		"\16\16\u009e\13\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a5\n\16\f\16\16\16"+
		"\u00a8\13\16\5\16\u00aa\n\16\3\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17"+
		"\u00b2\13\17\3\17\3\17\3\17\7\17\u00b7\n\17\f\17\16\17\u00ba\13\17\5\17"+
		"\u00bc\n\17\3\20\3\20\3\20\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00cb\n\23\3\24\3\24\3\24\3\24\7\24\u00d1\n\24\f\24"+
		"\16\24\u00d4\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00de"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00ee\n\30\3\31\3\31\5\31\u00f2\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u00fe\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0106\n\32\f\32\16\32\u0109\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0114\n\33\3\34\3\34\3\34\5\34\u0119\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\7\35\u0120\n\35\f\35\16\35\u0123\13\35\3\35\3"+
		"\35\5\35\u0127\n\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\3\62\"\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\3"+
		"\2\37\"\3\2\35\36\3\2\30\32\4\2\5\5\7\7\3\2)*\u0137\2B\3\2\2\2\4D\3\2"+
		"\2\2\6H\3\2\2\2\bX\3\2\2\2\nl\3\2\2\2\fz\3\2\2\2\16\u0083\3\2\2\2\20\u0085"+
		"\3\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3"+
		"\2\2\2\32\u00a9\3\2\2\2\34\u00bb\3\2\2\2\36\u00bd\3\2\2\2 \u00c2\3\2\2"+
		"\2\"\u00c4\3\2\2\2$\u00ca\3\2\2\2&\u00cc\3\2\2\2(\u00d5\3\2\2\2*\u00d7"+
		"\3\2\2\2,\u00dd\3\2\2\2.\u00ed\3\2\2\2\60\u00f1\3\2\2\2\62\u00fd\3\2\2"+
		"\2\64\u0113\3\2\2\2\66\u0118\3\2\2\28\u011a\3\2\2\2:\u0128\3\2\2\2<\u012b"+
		"\3\2\2\2>\u012d\3\2\2\2@\u012f\3\2\2\2BC\5\4\3\2C\3\3\2\2\2DE\7\3\2\2"+
		"EF\5\6\4\2FG\7\4\2\2G\5\3\2\2\2HL\5\b\5\2IK\5\b\5\2JI\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NL\3\2\2\2OY\5\n\6\2PY\5&\24\2QY\5,\27"+
		"\2RY\5.\30\2SY\5\36\20\2TY\5\"\22\2UY\58\35\2VY\5\f\7\2WY\5\16\b\2XO\3"+
		"\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3"+
		"\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z[\7\5\2\2[`\5\20\t\2\\]\7\6\2\2]_\5\20\t\2"+
		"^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2am\3\2\2\2b`\3\2\2\2cd\7\7\2"+
		"\2di\5\22\n\2ef\7\6\2\2fh\5\22\n\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2lZ\3\2\2\2lc\3\2\2\2m\13\3\2\2\2no\7\b\2\2op\7"+
		"&\2\2pq\7\t\2\2qr\5\30\r\2rs\7\n\2\2st\5> \2tu\5 \21\2u{\3\2\2\2vw\7\b"+
		"\2\2wx\7&\2\2xy\7\13\2\2y{\5 \21\2zn\3\2\2\2zv\3\2\2\2{\r\3\2\2\2|}\7"+
		"&\2\2}~\7\t\2\2~\177\5\34\17\2\177\u0080\7\f\2\2\u0080\u0084\3\2\2\2\u0081"+
		"\u0082\7&\2\2\u0082\u0084\7\13\2\2\u0083|\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\17\3\2\2\2\u0085\u0086\7&\2\2\u0086\21\3\2\2\2\u0087\u0088\7&\2"+
		"\2\u0088\23\3\2\2\2\u0089\u008a\7&\2\2\u008a\25\3\2\2\2\u008b\u008c\7"+
		"&\2\2\u008c\27\3\2\2\2\u008d\u0092\5\32\16\2\u008e\u008f\7\6\2\2\u008f"+
		"\u0091\5\32\16\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\31\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\5<\37\2\u0096\u0097\7\5\2\2\u0097\u009c\5\24\13\2\u0098\u0099\7"+
		"\6\2\2\u0099\u009b\5\24\13\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00aa\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\5<\37\2\u00a0\u00a1\7\7\2\2\u00a1\u00a6\5\26\f\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u0095\3\2\2\2\u00a9\u009f\3\2\2\2\u00aa\33\3\2\2"+
		"\2\u00ab\u00b0\5\62\32\2\u00ac\u00ad\7\6\2\2\u00ad\u00af\5\62\32\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00bc\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b8\5(\25\2\u00b4"+
		"\u00b5\7\6\2\2\u00b5\u00b7\5(\25\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bc\35\3\2\2"+
		"\2\u00bd\u00be\7\r\2\2\u00be\u00bf\7&\2\2\u00bf\37\3\2\2\2\u00c0\u00c3"+
		"\5\4\3\2\u00c1\u00c3\5\b\5\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"!\3\2\2\2\u00c4\u00c5\5\4\3\2\u00c5#\3\2\2\2\u00c6\u00c7\7\5\2\2\u00c7"+
		"\u00cb\b\23\1\2\u00c8\u00c9\7\7\2\2\u00c9\u00cb\b\23\1\2\u00ca\u00c6\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7\16\2\2\u00cd\u00d2"+
		"\5(\25\2\u00ce\u00cf\7\6\2\2\u00cf\u00d1\5(\25\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\'\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7&\2\2\u00d6)\3\2\2\2\u00d7\u00d8\7&"+
		"\2\2\u00d8+\3\2\2\2\u00d9\u00da\7\17\2\2\u00da\u00de\5\66\34\2\u00db\u00dc"+
		"\7\17\2\2\u00dc\u00de\5\60\31\2\u00dd\u00d9\3\2\2\2\u00dd\u00db\3\2\2"+
		"\2\u00de-\3\2\2\2\u00df\u00e0\7\20\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2"+
		"\7\21\2\2\u00e2\u00ee\5\62\32\2\u00e3\u00e4\7\20\2\2\u00e4\u00e5\7&\2"+
		"\2\u00e5\u00e6\7\21\2\2\u00e6\u00e7\7\22\2\2\u00e7\u00ee\5\62\32\2\u00e8"+
		"\u00e9\7\20\2\2\u00e9\u00ea\7&\2\2\u00ea\u00eb\7\21\2\2\u00eb\u00ec\7"+
		"\23\2\2\u00ec\u00ee\5\62\32\2\u00ed\u00df\3\2\2\2\u00ed\u00e3\3\2\2\2"+
		"\u00ed\u00e8\3\2\2\2\u00ee/\3\2\2\2\u00ef\u00f2\5\62\32\2\u00f0\u00f2"+
		"\7,\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\61\3\2\2\2\u00f3"+
		"\u00f4\b\32\1\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6\7\24\2\2\u00f6\u00f7"+
		"\5\62\32\7\u00f7\u00fe\3\2\2\2\u00f8\u00f9\5\64\33\2\u00f9\u00fa\7\25"+
		"\2\2\u00fa\u00fb\5\62\32\6\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\64\33\2\u00fd"+
		"\u00f3\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0107\3\2"+
		"\2\2\u00ff\u0100\f\5\2\2\u0100\u0101\t\2\2\2\u0101\u0106\5\62\32\6\u0102"+
		"\u0103\f\4\2\2\u0103\u0104\t\3\2\2\u0104\u0106\5\62\32\5\u0105\u00ff\3"+
		"\2\2\2\u0105\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\63\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\5\66\34"+
		"\2\u010b\u010c\7\26\2\2\u010c\u010d\5\64\33\2\u010d\u0114\3\2\2\2\u010e"+
		"\u010f\5\66\34\2\u010f\u0110\7\27\2\2\u0110\u0111\5\64\33\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0114\5\66\34\2\u0113\u010a\3\2\2\2\u0113\u010e\3\2\2\2"+
		"\u0113\u0112\3\2\2\2\u0114\65\3\2\2\2\u0115\u0119\7&\2\2\u0116\u0119\7"+
		")\2\2\u0117\u0119\7*\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\67\3\2\2\2\u011a\u011b\7#\2\2\u011b\u0121\5:\36\2"+
		"\u011c\u011d\7$\2\2\u011d\u011e\7#\2\2\u011e\u0120\5:\36\2\u011f\u011c"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0126\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$\2\2\u0125\u0127\5 \21"+
		"\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u01279\3\2\2\2\u0128\u0129"+
		"\5\62\32\2\u0129\u012a\5 \21\2\u012a;\3\2\2\2\u012b\u012c\t\4\2\2\u012c"+
		"=\3\2\2\2\u012d\u012e\t\5\2\2\u012e?\3\2\2\2\u012f\u0130\t\6\2\2\u0130"+
		"A\3\2\2\2\35LX`ilz\u0083\u0092\u009c\u00a6\u00a9\u00b0\u00b8\u00bb\u00c2"+
		"\u00ca\u00d2\u00dd\u00ed\u00f1\u00fd\u0105\u0107\u0113\u0118\u0121\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}