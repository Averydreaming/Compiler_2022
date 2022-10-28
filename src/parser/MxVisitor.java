// Generated from D:/A/src/main/java\Mx.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxParser#programs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograms(MxParser.ProgramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#programsimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramsimple(MxParser.ProgramsimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(MxParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#varDefsimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefsimple(MxParser.VarDefsimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#paraList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaList(MxParser.ParaListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(MxParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#classDefstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefstruct(MxParser.ClassDefstructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstmt(MxParser.PartstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDefstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefstmt(MxParser.VarDefstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(MxParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(MxParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(MxParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(MxParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continuestmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuestmt(MxParser.ContinuestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakstmt(MxParser.BreakstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprstmt(MxParser.ExprstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullstmt}
	 * labeled alternative in {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullstmt(MxParser.NullstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(MxParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncexpr(MxParser.FuncexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisexpr(MxParser.ThisexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexpr(MxParser.PrefixexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewexpr(MxParser.NewexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suffixexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixexpr(MxParser.SuffixexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryexpr(MxParser.BinaryexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpr(MxParser.SubexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdexpr(MxParser.IdexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrexpr(MxParser.ArrexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstexpr(MxParser.ConstexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classexpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassexpr(MxParser.ClassexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(MxParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errornewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrornewformat(MxParser.ErrornewformatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraynewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraynewformat(MxParser.ArraynewformatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classnewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassnewformat(MxParser.ClassnewformatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicnewformat}
	 * labeled alternative in {@link MxParser#newformat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicnewformat(MxParser.BasicnewformatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MxParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#basictype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasictype(MxParser.BasictypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturntype(MxParser.ReturntypeContext ctx);
}