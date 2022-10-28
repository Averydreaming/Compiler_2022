package AST;

import Util.position;

public class ReturnstmtNode extends StmtNode {
    public ExprNode res;

    public ReturnstmtNode(position _pos, ExprNode _res) {
        super(_pos);
        res = _res;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
