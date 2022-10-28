package AST;

import Util.position;

import java.util.ArrayList;

public class ClassdefNode extends DefNode {
    public String id;
    public ArrayList<VardefsubstmtNode> varlist = new ArrayList<>();
    public ArrayList<FunctiondefNode> funclist = new ArrayList<>();
    public FunctiondefNode constructor = null;

    public ClassdefNode(position _pos, String _id) {
        super(_pos);
        id = _id;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
