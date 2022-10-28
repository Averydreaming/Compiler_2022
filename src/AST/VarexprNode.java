package AST;

import Util.Varsymbol;
import Util.position;

public class VarexprNode extends ExprNode {
    public String id;
    public Varsymbol varsymbol;

    public VarexprNode(position _pos, String _id) {
        super(_pos, true);
        id = _id;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
