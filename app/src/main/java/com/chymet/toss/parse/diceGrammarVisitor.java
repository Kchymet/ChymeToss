// Generated from C:\Programming\boilermake\chymetoss\app\src\main\java\com\chymet\toss\parse\diceGrammar.g4 by ANTLR 4.1
package com.chymet.toss.parse;

import com.chymet.toss.dice.*;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link diceGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface diceGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link diceGrammarParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(@NotNull diceGrammarParser.SetContext ctx);

	/**
	 * Visit a parse tree produced by {@link diceGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull diceGrammarParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link diceGrammarParser#setcontents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetcontents(@NotNull diceGrammarParser.SetcontentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link diceGrammarParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(@NotNull diceGrammarParser.EmptyContext ctx);
}