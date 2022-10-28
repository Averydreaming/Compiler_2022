package AST;

import Util.position;

public class ContinuestmtNode extends StmtNode {
    public ContinuestmtNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
