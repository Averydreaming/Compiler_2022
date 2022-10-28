package AST;

import Util.position;

public class EmptystmtNode extends StmtNode {
    public EmptystmtNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
