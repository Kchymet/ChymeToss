// Generated from C:\Programming\boilermake\chymetoss\app\src\main\java\com\chymet\toss\parse\diceGrammar.g4 by ANTLR 4.1
package com.chymet.toss.parse;

import com.chymet.toss.dice.*;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link diceGrammarParser}.
 */
public interface diceGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#intdie}.
	 * @param ctx the parse tree
	 */
	void enterIntdie(@NotNull diceGrammarParser.IntdieContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#intdie}.
	 * @param ctx the parse tree
	 */
	void exitIntdie(@NotNull diceGrammarParser.IntdieContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull diceGrammarParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull diceGrammarParser.SetContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull diceGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull diceGrammarParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#setcontents}.
	 * @param ctx the parse tree
	 */
	void enterSetcontents(@NotNull diceGrammarParser.SetcontentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#setcontents}.
	 * @param ctx the parse tree
	 */
	void exitSetcontents(@NotNull diceGrammarParser.SetcontentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#prgm}.
	 * @param ctx the parse tree
	 */
	void enterPrgm(@NotNull diceGrammarParser.PrgmContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#prgm}.
	 * @param ctx the parse tree
	 */
	void exitPrgm(@NotNull diceGrammarParser.PrgmContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull diceGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull diceGrammarParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#setdie}.
	 * @param ctx the parse tree
	 */
	void enterSetdie(@NotNull diceGrammarParser.SetdieContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#setdie}.
	 * @param ctx the parse tree
	 */
	void exitSetdie(@NotNull diceGrammarParser.SetdieContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull diceGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull diceGrammarParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link diceGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(@NotNull diceGrammarParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link diceGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(@NotNull diceGrammarParser.EmptyContext ctx);
}