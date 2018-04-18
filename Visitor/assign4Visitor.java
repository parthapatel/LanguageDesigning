// Generated from assign4.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link assign4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface assign4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link assign4Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(assign4Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(assign4Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#statList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatList(assign4Parser.StatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(assign4Parser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(assign4Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#functiondeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclare(assign4Parser.FunctiondeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(assign4Parser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varInt}
	 * labeled alternative in {@link assign4Parser#variableinteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInt(assign4Parser.VarIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varReal}
	 * labeled alternative in {@link assign4Parser#variablereal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReal(assign4Parser.VarRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intident2}
	 * labeled alternative in {@link assign4Parser#varint2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntident2(assign4Parser.Intident2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Realident2}
	 * labeled alternative in {@link assign4Parser#varreal2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealident2(assign4Parser.Realident2Context ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(assign4Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#variableDec2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDec2(assign4Parser.VariableDec2Context ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#argumentList2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList2(assign4Parser.ArgumentList2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code adescriptor}
	 * labeled alternative in {@link assign4Parser#descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdescriptor(assign4Parser.AdescriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(assign4Parser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#nestedBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedBlock(assign4Parser.NestedBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(assign4Parser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#inputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclaration(assign4Parser.InputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link assign4Parser#inputVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputVar(assign4Parser.InputVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#inputVariable2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputVariable2(assign4Parser.InputVariable2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code printfact}
	 * labeled alternative in {@link assign4Parser#printDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfact(assign4Parser.PrintfactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printexprstring}
	 * labeled alternative in {@link assign4Parser#printDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintexprstring(assign4Parser.PrintexprstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(assign4Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignreal}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignreal(assign4Parser.AssignrealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigninteger}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigninteger(assign4Parser.AssignintegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomexpressionstring}
	 * labeled alternative in {@link assign4Parser#expressionString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomexpressionstring(assign4Parser.AtomexpressionstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link assign4Parser#expressionString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(assign4Parser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aterm}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAterm(assign4Parser.AtermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(assign4Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(assign4Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorSub}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorSub(assign4Parser.OperatorSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorAdd}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAdd(assign4Parser.OperatorAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorMul}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMul(assign4Parser.OperatorMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorDiv}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDiv(assign4Parser.OperatorDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code afactor}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfactor(assign4Parser.AfactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aident}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAident(assign4Parser.AidentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(assign4Parser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(assign4Parser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(assign4Parser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#conditionblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionblock(assign4Parser.ConditionblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#paratype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParatype(assign4Parser.ParatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(assign4Parser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign4Parser#datavalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatavalue(assign4Parser.DatavalueContext ctx);
}