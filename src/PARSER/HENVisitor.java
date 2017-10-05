// Generated from C:\Users\Harry\HEN.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link HENParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HENParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HENParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HENParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(HENParser.AddContext ctx);
}