package AST;

import Util.position;

public class TypeNode extends ASTNode {
    public String type;
    public int dim;

    public TypeNode(position _pos, String _type, int _dim) {
        super(_pos);
        type = _type;
        dim = _dim;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
