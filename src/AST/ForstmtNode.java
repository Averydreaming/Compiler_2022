package AST;

import Util.position;

public class ForstmtNode extends StmtNode {
    public ExprNode init, condition, inc;
    public StmtNode body;

    public ForstmtNode(position _pos, ExprNode _init, ExprNode _condition, ExprNode _inc, StmtNode _body) {
        super(_pos);
        init = _init;
        condition = _condition;
        inc = _inc;
        body = _body;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }

}
