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
		T__3=1, T__2=2, T__1=3, T__0=4, INTEGER=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'d'", "'{'", "','", "'}'", "INTEGER"
	};
	public static final int
		RULE_expr = 0, RULE_set = 1, RULE_setcontents = 2, RULE_empty = 3;
	public static final String[] ruleNames = {
		"expr", "set", "setcontents", "empty"
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
	public static class ExprContext extends ParserRuleContext {
		public Die d;
		public Token i1;
		public Token i2;
		public SetContext s1;
		public List<TerminalNode> INTEGER() { return getTokens(diceGrammarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(diceGrammarParser.INTEGER, i);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
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
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(17);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8); ((ExprContext)_localctx).i1 = match(INTEGER);
				setState(9); match(1);
				setState(10); ((ExprContext)_localctx).i2 = match(INTEGER);

				                           int n = Integer.parseInt((((ExprContext)_localctx).i1!=null?((ExprContext)_localctx).i1.getText():null));
				                           int k = Integer.parseInt((((ExprContext)_localctx).i2!=null?((ExprContext)_localctx).i2.getText():null));
				                           ((ExprContext)_localctx).d =  new IntDie(n,k);
				                           
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(12); ((ExprContext)_localctx).i1 = match(INTEGER);
				setState(13); match(1);
				setState(14); ((ExprContext)_localctx).s1 = set();

				                           int n = Integer.parseInt((((ExprContext)_localctx).i1!=null?((ExprContext)_localctx).i1.getText():null));
				                           List<Object> options = ((ExprContext)_localctx).s1.l;
				                           ((ExprContext)_localctx).d =  new SetDie(n,options);
				                           
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
		enterRule(_localctx, 2, RULE_set);

		      ((SetContext)_localctx).l = new ArrayList<Object>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(2);
			setState(20); ((SetContext)_localctx).sc1 = setcontents();
			 _localctx.l.add(((SetContext)_localctx).sc1.o); 
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(22); match(3);
				setState(23); ((SetContext)_localctx).sc = setcontents();
				_localctx.l.add(((SetContext)_localctx).sc.o);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); match(4);
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
		enterRule(_localctx, 4, RULE_setcontents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); ((SetcontentsContext)_localctx).INTEGER = match(INTEGER);
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
		enterRule(_localctx, 6, RULE_empty);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\7)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\2\6\2\4\6\b\2\2&\2\23\3\2\2\2\4\25\3\2\2\2\6#\3\2\2\2\b&"+
		"\3\2\2\2\n\13\7\7\2\2\13\f\7\3\2\2\f\r\7\7\2\2\r\24\b\2\1\2\16\17\7\7"+
		"\2\2\17\20\7\3\2\2\20\21\5\4\3\2\21\22\b\2\1\2\22\24\3\2\2\2\23\n\3\2"+
		"\2\2\23\16\3\2\2\2\24\3\3\2\2\2\25\26\7\4\2\2\26\27\5\6\4\2\27\36\b\3"+
		"\1\2\30\31\7\5\2\2\31\32\5\6\4\2\32\33\b\3\1\2\33\35\3\2\2\2\34\30\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!"+
		"\"\7\6\2\2\"\5\3\2\2\2#$\7\7\2\2$%\b\4\1\2%\7\3\2\2\2&\'\3\2\2\2\'\t\3"+
		"\2\2\2\4\23\36";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}