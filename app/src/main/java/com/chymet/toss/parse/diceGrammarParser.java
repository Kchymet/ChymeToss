// Generated from C:\Programming\boilermake\chymetoss\app\src\main\java\com\chymet\toss\parse\diceGrammar.g4 by ANTLR 4.1
package com.chymet.toss.parse;

import com.chymet.toss.dice.*;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class diceGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, ADDOP=7, INTEGER=8;
	public static final String[] tokenNames = {
		"<INVALID>", "'d'", "'('", "')'", "'{'", "','", "'}'", "'+'", "INTEGER"
	};
	public static final int
		RULE_prgm = 0, RULE_expr = 1, RULE_factor = 2, RULE_primary = 3, RULE_intdie = 4, 
		RULE_setdie = 5, RULE_set = 6, RULE_setcontents = 7, RULE_empty = 8;
	public static final String[] ruleNames = {
		"prgm", "expr", "factor", "primary", "intdie", "setdie", "set", "setcontents", 
		"empty"
	};

	@Override
	public String getGrammarFileName() { return "diceGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public diceGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrgmContext extends ParserRuleContext {
		public Die d;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(diceGrammarParser.EOF, 0); }
		public PrgmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prgm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterPrgm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitPrgm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitPrgm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgmContext prgm() throws RecognitionException {
		PrgmContext _localctx = new PrgmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prgm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); ((PrgmContext)_localctx).expr = expr();
			setState(19); match(EOF);
			 ((PrgmContext)_localctx).d = ((PrgmContext)_localctx).expr.d; 
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
		public Die d;
		public FactorContext factor;
		public ExprContext e1;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);

		          Die d2 = null;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); ((ExprContext)_localctx).factor = factor();
			setState(27);
			_la = _input.LA(1);
			if (_la==ADDOP) {
				{
				setState(23); match(ADDOP);
				setState(24); ((ExprContext)_localctx).e1 = expr();
				d2=((ExprContext)_localctx).e1.d;
				}
			}

			if(null==d2){((ExprContext)_localctx).d = ((ExprContext)_localctx).factor.d;} else{ ((ExprContext)_localctx).d = new BinaryDie(((ExprContext)_localctx).factor.d,d2);}
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
		public Die d;
		public PrimaryContext primary;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); ((FactorContext)_localctx).primary = primary();
			((FactorContext)_localctx).d = ((FactorContext)_localctx).primary.d;
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

	public static class PrimaryContext extends ParserRuleContext {
		public Die d;
		public ExprContext expr;
		public IntdieContext intdie;
		public SetdieContext setdie;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetdieContext setdie() {
			return getRuleContext(SetdieContext.class,0);
		}
		public IntdieContext intdie() {
			return getRuleContext(IntdieContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primary);
		try {
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); match(2);
				setState(35); ((PrimaryContext)_localctx).expr = expr();
				setState(36); match(3);
				((PrimaryContext)_localctx).d = ((PrimaryContext)_localctx).expr.d;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); ((PrimaryContext)_localctx).intdie = intdie();
				((PrimaryContext)_localctx).d = ((PrimaryContext)_localctx).intdie.d;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42); ((PrimaryContext)_localctx).setdie = setdie();
				((PrimaryContext)_localctx).d = ((PrimaryContext)_localctx).setdie.d;
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

	public static class IntdieContext extends ParserRuleContext {
		public IntDie d;
		public Token i1;
		public Token i2;
		public List<TerminalNode> INTEGER() { return getTokens(diceGrammarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(diceGrammarParser.INTEGER, i);
		}
		public IntdieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intdie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterIntdie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitIntdie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitIntdie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntdieContext intdie() throws RecognitionException {
		IntdieContext _localctx = new IntdieContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intdie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); ((IntdieContext)_localctx).i1 = match(INTEGER);
			setState(48); match(1);
			setState(49); ((IntdieContext)_localctx).i2 = match(INTEGER);

			                           int n = Integer.parseInt((((IntdieContext)_localctx).i1!=null?((IntdieContext)_localctx).i1.getText():null));
			                           int k = Integer.parseInt((((IntdieContext)_localctx).i2!=null?((IntdieContext)_localctx).i2.getText():null));
			                           ((IntdieContext)_localctx).d =  new IntDie(n,k);
			                           
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

	public static class SetdieContext extends ParserRuleContext {
		public SetDie d;
		public Token i1;
		public SetContext s1;
		public TerminalNode INTEGER() { return getToken(diceGrammarParser.INTEGER, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public SetdieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterSetdie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitSetdie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitSetdie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetdieContext setdie() throws RecognitionException {
		SetdieContext _localctx = new SetdieContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setdie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); ((SetdieContext)_localctx).i1 = match(INTEGER);
			setState(53); match(1);
			setState(54); ((SetdieContext)_localctx).s1 = set();

			                           int n = Integer.parseInt((((SetdieContext)_localctx).i1!=null?((SetdieContext)_localctx).i1.getText():null));
			                           List<Object> options = ((SetdieContext)_localctx).s1.l;
			                           ((SetdieContext)_localctx).d =  new SetDie(n,options);
			                           
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

	public static class SetContext extends ParserRuleContext {
		public List<Object> l;
		public SetcontentsContext sc1;
		public SetcontentsContext sc;
		public SetcontentsContext setcontents(int i) {
			return getRuleContext(SetcontentsContext.class,i);
		}
		public List<SetcontentsContext> setcontents() {
			return getRuleContexts(SetcontentsContext.class);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_set);

		      ((SetContext)_localctx).l = new ArrayList<Object>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(4);
			setState(58); ((SetContext)_localctx).sc1 = setcontents();
			 _localctx.l.add(((SetContext)_localctx).sc1.o); 
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(60); match(5);
				setState(61); ((SetContext)_localctx).sc = setcontents();
				_localctx.l.add(((SetContext)_localctx).sc.o);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); match(6);
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

	public static class SetcontentsContext extends ParserRuleContext {
		public Object o;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(diceGrammarParser.INTEGER, 0); }
		public SetcontentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcontents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterSetcontents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitSetcontents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitSetcontents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetcontentsContext setcontents() throws RecognitionException {
		SetcontentsContext _localctx = new SetcontentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setcontents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); ((SetcontentsContext)_localctx).INTEGER = match(INTEGER);
			 ((SetcontentsContext)_localctx).o = Integer.valueOf((((SetcontentsContext)_localctx).INTEGER!=null?((SetcontentsContext)_localctx).INTEGER.getText():null)); 
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diceGrammarListener ) ((diceGrammarListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diceGrammarVisitor ) return ((diceGrammarVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\nO\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bC\n\b\f\b\16\bF\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\2\13\2\4\6\b\n\f\16\20\22\2\2I\2\24\3\2\2\2"+
		"\4\30\3\2\2\2\6!\3\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f\66\3\2\2\2\16;\3\2"+
		"\2\2\20I\3\2\2\2\22L\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\27\b\2\1\2"+
		"\27\3\3\2\2\2\30\35\5\6\4\2\31\32\7\t\2\2\32\33\5\4\3\2\33\34\b\3\1\2"+
		"\34\36\3\2\2\2\35\31\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \b\3\1\2 "+
		"\5\3\2\2\2!\"\5\b\5\2\"#\b\4\1\2#\7\3\2\2\2$%\7\4\2\2%&\5\4\3\2&\'\7\5"+
		"\2\2\'(\b\5\1\2(\60\3\2\2\2)*\5\n\6\2*+\b\5\1\2+\60\3\2\2\2,-\5\f\7\2"+
		"-.\b\5\1\2.\60\3\2\2\2/$\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\t\3\2\2\2\61\62"+
		"\7\n\2\2\62\63\7\3\2\2\63\64\7\n\2\2\64\65\b\6\1\2\65\13\3\2\2\2\66\67"+
		"\7\n\2\2\678\7\3\2\289\5\16\b\29:\b\7\1\2:\r\3\2\2\2;<\7\6\2\2<=\5\20"+
		"\t\2=D\b\b\1\2>?\7\7\2\2?@\5\20\t\2@A\b\b\1\2AC\3\2\2\2B>\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\b\2\2H\17\3\2\2\2I"+
		"J\7\n\2\2JK\b\t\1\2K\21\3\2\2\2LM\3\2\2\2M\23\3\2\2\2\5\35/D";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}