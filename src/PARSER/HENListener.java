// Generated from HEN.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link HENParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(HENParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(HENParser.Loop_statementContext ctx);
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
	 * Enter a parse tree produced by {@link HENParser#gets}.
	 * @param ctx the parse tree
	 */
	void enterGets(HENParser.GetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#gets}.
	 * @param ctx the parse tree
	 */
	void exitGets(HENParser.GetsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link HENParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(HENParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(HENParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(HENParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(HENParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#subtract}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(HENParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#subtract}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(HENParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(HENParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(HENParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(HENParser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(HENParser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HENParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(HENParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HENParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(HENParser.While_loopContext ctx);
}