package AST;

import Util.position;

public class BreakstmtNode extends StmtNode {
    public BreakstmtNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
