package AST;

import Util.position;

public class ExprstmtNode extends StmtNode {
    public ExprNode expr;

    public ExprstmtNode(position _pos, ExprNode _expr) {
        super(_pos);
        expr = _expr;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
