package AST;

import Util.position;

import java.util.ArrayList;

public class ExprlistexprNode extends ExprNode {
    public ArrayList<ExprNode> exprlist = new ArrayList<>();

    public ExprlistexprNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
