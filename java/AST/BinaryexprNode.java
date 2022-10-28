package AST;

import Util.position;

public class BinaryexprNode extends ExprNode {
    public ExprNode src1, src2;
    public String op;

    public BinaryexprNode(position _pos, ExprNode _src1, ExprNode _src2, String _op) {
        super(_pos);
        src1 = _src1;
        src2 = _src2;
        op = _op;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
