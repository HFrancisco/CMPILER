// Generated from HEN.g4 by ANTLR 4.7
package PARSER;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HENParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HENVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HENParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HENParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HENParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(HENParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(HENParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HENParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#gets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGets(HENParser.GetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(HENParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(HENParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(HENParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#subtract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(HENParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(HENParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(HENParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(HENParser.While_loopContext ctx);
}