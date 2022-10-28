package AST;

import Util.position;

public class NullexprNode extends ExprNode {
    public NullexprNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
