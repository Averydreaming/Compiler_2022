package AST;

import Util.position;

public class SuffixexprNode extends ExprNode {
    public ExprNode src;
    public String op;

    public SuffixexprNode(position _pos, ExprNode _src, String _op) {
        super(_pos);
        src = _src;
        op = _op;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
