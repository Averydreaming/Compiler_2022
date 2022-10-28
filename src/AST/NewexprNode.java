package AST;

import Util.position;

import java.util.ArrayList;

public class NewexprNode extends ExprNode {
    public TypeNode typenode;
    public ArrayList<ExprNode> exprlist;

    public NewexprNode (position _pos, TypeNode _typenode, int _dim, ArrayList<ExprNode> _exprlist) {
        super(_pos);
        typenode = _typenode;
        typenode.dim = _dim;
        exprlist = _exprlist;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
