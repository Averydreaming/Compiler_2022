package AST;

public interface ASTvisitor {
    void visit(RootNode it);
    void visit(TypeNode it);
    //
    void visit(ClassdefNode it);
    void visit(FunctiondefNode it);
    //
    void visit(PartstmtNode it);
    void visit(BreakstmtNode it);
    void visit(ContinuestmtNode it);
    void visit(EmptystmtNode it);
    void visit(ForstmtNode it);
    void visit(IfstmtNode it);
    void visit(ExprstmtNode it);
    void visit(ReturnstmtNode it);
    void visit(WhilestmtNode it);
    void visit(VardefstmtNode it);
    void visit(VardefsubstmtNode it);
    //
    void visit(BinaryexprNode it);
    void visit(BoolexprNode it);
    void visit(FuncexprNode it);
    void visit(IntexprNode it);
    void visit(ClassexprNode it);
    void visit(NewexprNode it);
    void visit(NullexprNode it);
    void visit(StringexprNode it);
    void visit(ThisexprNode it);
    void visit(VarexprNode it);
    void visit(ArrexprNode it);
    void visit(SuffixexprNode it);
    void visit(PrefixexprNode it);
    void visit(ExprlistexprNode it);
}
