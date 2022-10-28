package AST;

import Util.position;

public class IntexprNode extends ExprNode {
    public int value;

    public IntexprNode(position _pos, int _value) {
        super(_pos);
        value = _value;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
