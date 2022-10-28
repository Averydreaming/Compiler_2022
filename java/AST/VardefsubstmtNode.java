package AST;

import Util.Varsymbol;
import Util.position;

public class VardefsubstmtNode extends StmtNode {
    public TypeNode type;
    public String id;
    public ExprNode expr;
    public Varsymbol varsymbol;

    public VardefsubstmtNode(position _pos, String _id, ExprNode _expr) {
        super(_pos);
        id = _id;
        expr = _expr;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
