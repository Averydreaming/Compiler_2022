package AST;

import Util.position;

public class WhilestmtNode extends StmtNode {
    public ExprNode condition;
    public StmtNode body;

    public WhilestmtNode(position _pos, ExprNode _condition, StmtNode _body) {
        super(_pos);
        condition = _condition;
        body = _body;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
