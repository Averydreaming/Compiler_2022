package AST;

import Util.position;

public class FuncexprNode extends ExprNode {
    public ExprNode name;
    public ExprlistexprNode exprlist;

    public FuncexprNode(position _pos, ExprNode _name, ExprlistexprNode _exprlist) {
        super(_pos);
        name = _name;
        exprlist = _exprlist;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
