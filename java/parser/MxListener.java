// Generated from D:/A/src/main/java\Mx.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#programs}.
	 * @param ctx the parse tree
	 */
	void enterPrograms(MxParser.ProgramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#programs}.
	 * @param ctx the parse tree
	 */
	void exitPrograms(MxParser.ProgramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#programsimple}.
	 * @param ctx the parse tree
	 */
	void enterProgramsimple(MxParser.ProgramsimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#programsimple}.
	 * @param ctx the parse tree
	 */
	void exitProgramsimple(MxParser.ProgramsimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(MxParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(MxParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#varDefsimple}.
	 * @param ctx the parse tree
	 */
	void enterVarDefsimple(MxParser.VarDefsimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#varDefsimple}.
	 * @param ctx the parse tree
	 */
	void exitVarDefsimple(MxParser.VarDefsimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#paraList}.
	 * @param ctx the parse tree
	 */
	void enterParaList(MxParser.ParaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#paraList}.
	 * @param ctx the parse tree
	 */
	void exitParaList(MxParser.ParaListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(MxParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(MxParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classDefstruct}.
	 * @param ctx the parse tree
	 */
	void enterClassDefstruct(MxParser.ClassDefstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classDefstruct}.
	 * @param ctx the parse tree
	 */
	void exitClassDefstruct(MxParser.ClassDefstructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPartstmt(MxParser.PartstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPartstmt(MxParser.PartstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDefstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDefstmt(MxParser.VarDefstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDefstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDefstmt(MxParser.VarDefstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(MxParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(MxParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(MxParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(MxParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(MxParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(MxParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(MxParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(MxParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continuestmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinuestmt(MxParser.ContinuestmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continuestmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinuestmt(MxParser.ContinuestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakstmt(MxParser.BreakstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakstmt(MxParser.BreakstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprstmt(MxParser.ExprstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprstmt(MxParser.ExprstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNullstmt(MxParser.NullstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNullstmt(MxParser.NullstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(MxParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(MxParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncexpr(MxParser.FuncexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncexpr(MxParser.FuncexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisexpr(MxParser.ThisexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisexpr(MxParser.ThisexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexpr(MxParser.PrefixexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexpr(MxParser.PrefixexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewexpr(MxParser.NewexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewexpr(MxParser.NewexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suffixexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuffixexpr(MxParser.SuffixexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suffixexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuffixexpr(MxParser.SuffixexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryexpr(MxParser.BinaryexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryexpr(MxParser.BinaryexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(MxParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(MxParser.SubexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdexpr(MxParser.IdexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdexpr(MxParser.IdexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrexpr(MxParser.ArrexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrexpr(MxParser.ArrexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstexpr(MxParser.ConstexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstexpr(MxParser.ConstexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClassexpr(MxParser.ClassexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClassexpr(MxParser.ClassexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(MxParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(MxParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errornewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void enterErrornewformat(MxParser.ErrornewformatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errornewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void exitErrornewformat(MxParser.ErrornewformatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraynewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void enterArraynewformat(MxParser.ArraynewformatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraynewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void exitArraynewformat(MxParser.ArraynewformatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classnewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void enterClassnewformat(MxParser.ClassnewformatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classnewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void exitClassnewformat(MxParser.ClassnewformatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicnewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void enterBasicnewformat(MxParser.BasicnewformatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicnewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 */
	void exitBasicnewformat(MxParser.BasicnewformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MxParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MxParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#basictype}.
	 * @param ctx the parse tree
	 */
	void enterBasictype(MxParser.BasictypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#basictype}.
	 * @param ctx the parse tree
	 */
	void exitBasictype(MxParser.BasictypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterReturntype(MxParser.ReturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitReturntype(MxParser.ReturntypeContext ctx);
}