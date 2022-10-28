package AST;

import Util.position;

public class PrefixexprNode extends ExprNode {
    public ExprNode src;
    public String op;

    public PrefixexprNode(position _pos, ExprNode _src, String _op) {
        super(_pos);
        src = _src;
        op = _op;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
