package AST;

import Util.position;

public class StringexprNode extends ExprNode {
    public String value;

    public StringexprNode(position _pos, String _value) {
        super(_pos);
        value = _value;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
