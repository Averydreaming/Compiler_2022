package AST;

import Util.position;

public class ArrexprNode extends ExprNode {
    public ExprNode base, offset;

    public ArrexprNode(position _pos, ExprNode _base, ExprNode _offset) {
        super(_pos, true);
        base = _base;
        offset = _offset;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
