package AST;

import Util.position;

import java.util.ArrayList;

public class PartstmtNode extends StmtNode {
    public ArrayList<StmtNode> stmtlist = new ArrayList<>();

    public PartstmtNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
