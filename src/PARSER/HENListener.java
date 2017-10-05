// Generated from C:\Users\Harry\HEN.g4 by ANTLR 4.7
package PARSER;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HENParser}.
 */
public interface HENListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HENParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HENParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HENParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HENParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HENParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HENParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HENParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(HENParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(HENParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(HENParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(HENParser.AddContext ctx);
}