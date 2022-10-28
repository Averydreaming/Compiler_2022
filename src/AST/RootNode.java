package AST;

import Util.position;

import java.util.ArrayList;

public class RootNode extends ASTNode {
    public ArrayList<ASTNode> body = new ArrayList<>();

    public RootNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
