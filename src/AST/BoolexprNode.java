package AST;

import Util.position;

public class BoolexprNode extends ExprNode {
    public boolean value;

    public BoolexprNode(position _pos, boolean _value) {
        super(_pos);
        value = _value;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
