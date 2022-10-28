package AST;

import Util.Type;
import Util.position;

public abstract class ExprNode extends ASTNode {
    public Type type;
    public boolean assign = false;

    public ExprNode(position _pos) {
        super(_pos);
    }

    public ExprNode(position _pos, boolean _assign) {
        super(_pos);
        assign = _assign;
    }

    public ExprNode(position _pos, Type _type, boolean _assign) {
        super(_pos);
        type = _type;
        assign = _assign;
    }
}
