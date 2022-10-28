package AST;

import Util.Funcsymbol;
import Util.position;

import java.util.ArrayList;

public class FunctiondefNode extends DefNode {
    public TypeNode type;
    public String id;
    public ArrayList<VardefsubstmtNode> paralist = new ArrayList<>();
    public PartstmtNode part;
    public Funcsymbol funcsymbol;
    public boolean flag_return = false;

    public FunctiondefNode(position _pos, TypeNode _type, String _id, ArrayList<VardefsubstmtNode> _paralist, PartstmtNode _part) {
        super(_pos);
        type = _type;
        id = _id;
        paralist = _paralist;
        part = _part;
    }

    @Override
    public void accept(ASTvisitor visitor) {
        visitor.visit(this);
    }
}
