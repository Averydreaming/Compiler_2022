package AST;

import Util.Varsymbol;
import Util.position;

public class ClassexprNode extends ExprNode {
    public ExprNode name;
    public String id;
    public boolean flag_func = false; //to check if it is a function or a variable
    public Varsymbol varsymbol;

    public ClassexprNode(position _pos, ExprNode _name, String _id) {
        super(_pos, true);
        name = _name;
        id = _id;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
