package AST;

import Util.position;

import java.util.ArrayList;

public class VardefstmtNode extends StmtNode {
    public ArrayList<VardefsubstmtNode> varlist = new ArrayList<>();

    public VardefstmtNode(position _pos) {
        super(_pos);
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
