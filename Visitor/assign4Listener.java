// Generated from assign4.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link assign4Parser}.
 */
public interface assign4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link assign4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(assign4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(assign4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(assign4Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(assign4Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#statList}.
	 * @param ctx the parse tree
	 */
	void enterStatList(assign4Parser.StatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#statList}.
	 * @param ctx the parse tree
	 */
	void exitStatList(assign4Parser.StatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(assign4Parser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(assign4Parser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(assign4Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(assign4Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#functiondeclare}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclare(assign4Parser.FunctiondeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#functiondeclare}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclare(assign4Parser.FunctiondeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(assign4Parser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(assign4Parser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varInt}
	 * labeled alternative in {@link assign4Parser#variableinteger}.
	 * @param ctx the parse tree
	 */
	void enterVarInt(assign4Parser.VarIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varInt}
	 * labeled alternative in {@link assign4Parser#variableinteger}.
	 * @param ctx the parse tree
	 */
	void exitVarInt(assign4Parser.VarIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varReal}
	 * labeled alternative in {@link assign4Parser#variablereal}.
	 * @param ctx the parse tree
	 */
	void enterVarReal(assign4Parser.VarRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varReal}
	 * labeled alternative in {@link assign4Parser#variablereal}.
	 * @param ctx the parse tree
	 */
	void exitVarReal(assign4Parser.VarRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intident2}
	 * labeled alternative in {@link assign4Parser#varint2}.
	 * @param ctx the parse tree
	 */
	void enterIntident2(assign4Parser.Intident2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Intident2}
	 * labeled alternative in {@link assign4Parser#varint2}.
	 * @param ctx the parse tree
	 */
	void exitIntident2(assign4Parser.Intident2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Realident2}
	 * labeled alternative in {@link assign4Parser#varreal2}.
	 * @param ctx the parse tree
	 */
	void enterRealident2(assign4Parser.Realident2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Realident2}
	 * labeled alternative in {@link assign4Parser#varreal2}.
	 * @param ctx the parse tree
	 */
	void exitRealident2(assign4Parser.Realident2Context ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(assign4Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(assign4Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#variableDec2}.
	 * @param ctx the parse tree
	 */
	void enterVariableDec2(assign4Parser.VariableDec2Context ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#variableDec2}.
	 * @param ctx the parse tree
	 */
	void exitVariableDec2(assign4Parser.VariableDec2Context ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#argumentList2}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList2(assign4Parser.ArgumentList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#argumentList2}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList2(assign4Parser.ArgumentList2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code adescriptor}
	 * labeled alternative in {@link assign4Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterAdescriptor(assign4Parser.AdescriptorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adescriptor}
	 * labeled alternative in {@link assign4Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitAdescriptor(assign4Parser.AdescriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(assign4Parser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(assign4Parser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#nestedBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedBlock(assign4Parser.NestedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#nestedBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedBlock(assign4Parser.NestedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(assign4Parser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(assign4Parser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(assign4Parser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(assign4Parser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link assign4Parser#inputVariable}.
	 * @param ctx the parse tree
	 */
	void enterInputVar(assign4Parser.InputVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link assign4Parser#inputVariable}.
	 * @param ctx the parse tree
	 */
	void exitInputVar(assign4Parser.InputVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#inputVariable2}.
	 * @param ctx the parse tree
	 */
	void enterInputVariable2(assign4Parser.InputVariable2Context ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#inputVariable2}.
	 * @param ctx the parse tree
	 */
	void exitInputVariable2(assign4Parser.InputVariable2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code printfact}
	 * labeled alternative in {@link assign4Parser#printDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrintfact(assign4Parser.PrintfactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printfact}
	 * labeled alternative in {@link assign4Parser#printDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrintfact(assign4Parser.PrintfactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printexprstring}
	 * labeled alternative in {@link assign4Parser#printDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrintexprstring(assign4Parser.PrintexprstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printexprstring}
	 * labeled alternative in {@link assign4Parser#printDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrintexprstring(assign4Parser.PrintexprstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssign(assign4Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssign(assign4Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignreal}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssignreal(assign4Parser.AssignrealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignreal}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssignreal(assign4Parser.AssignrealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigninteger}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssigninteger(assign4Parser.AssignintegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigninteger}
	 * labeled alternative in {@link assign4Parser#assignmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssigninteger(assign4Parser.AssignintegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomexpressionstring}
	 * labeled alternative in {@link assign4Parser#expressionString}.
	 * @param ctx the parse tree
	 */
	void enterAtomexpressionstring(assign4Parser.AtomexpressionstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomexpressionstring}
	 * labeled alternative in {@link assign4Parser#expressionString}.
	 * @param ctx the parse tree
	 */
	void exitAtomexpressionstring(assign4Parser.AtomexpressionstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link assign4Parser#expressionString}.
	 * @param ctx the parse tree
	 */
	void enterText(assign4Parser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link assign4Parser#expressionString}.
	 * @param ctx the parse tree
	 */
	void exitText(assign4Parser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aterm}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAterm(assign4Parser.AtermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aterm}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAterm(assign4Parser.AtermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(assign4Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(assign4Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(assign4Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(assign4Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorSub}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorSub(assign4Parser.OperatorSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorSub}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorSub(assign4Parser.OperatorSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorAdd}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAdd(assign4Parser.OperatorAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorAdd}
	 * labeled alternative in {@link assign4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAdd(assign4Parser.OperatorAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorMul}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMul(assign4Parser.OperatorMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorMul}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMul(assign4Parser.OperatorMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorDiv}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDiv(assign4Parser.OperatorDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorDiv}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDiv(assign4Parser.OperatorDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code afactor}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterAfactor(assign4Parser.AfactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code afactor}
	 * labeled alternative in {@link assign4Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitAfactor(assign4Parser.AfactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aident}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterAident(assign4Parser.AidentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aident}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitAident(assign4Parser.AidentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterInt(assign4Parser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitInt(assign4Parser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterReal(assign4Parser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link assign4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitReal(assign4Parser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(assign4Parser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(assign4Parser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#conditionblock}.
	 * @param ctx the parse tree
	 */
	void enterConditionblock(assign4Parser.ConditionblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#conditionblock}.
	 * @param ctx the parse tree
	 */
	void exitConditionblock(assign4Parser.ConditionblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#paratype}.
	 * @param ctx the parse tree
	 */
	void enterParatype(assign4Parser.ParatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#paratype}.
	 * @param ctx the parse tree
	 */
	void exitParatype(assign4Parser.ParatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(assign4Parser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(assign4Parser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign4Parser#datavalue}.
	 * @param ctx the parse tree
	 */
	void enterDatavalue(assign4Parser.DatavalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign4Parser#datavalue}.
	 * @param ctx the parse tree
	 */
	void exitDatavalue(assign4Parser.DatavalueContext ctx);
}