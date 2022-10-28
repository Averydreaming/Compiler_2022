package AST;

import Util.position;

public class IfstmtNode extends StmtNode {
    public ExprNode condition;
    public StmtNode truestate, falsestate;

    public IfstmtNode(position _pos, ExprNode _condition, StmtNode _truestate, StmtNode _falsestate) {
        super(_pos);
        condition = _condition;
        truestate = _truestate;
        falsestate = _falsestate;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
