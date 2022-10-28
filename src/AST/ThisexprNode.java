package AST;

import Util.position;

public class ThisexprNode extends ExprNode {
    public ThisexprNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
