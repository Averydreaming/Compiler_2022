package FrontEnd;

import AST.*;
import Util.*;

//处理每个函数funcsymbol里的定义（均含有id和type）
//为了解决有些class/function中元素的变量是global中定义，但是前后顺序不一定的问题
public class TypeCollector implements ASTvisitor{
    Scope global;
    String class_name;
    public TypeCollector(Scope _global) {
        global=_global;
    }

    @Override public void visit(RootNode it){
        class_name=null;
        it.body.forEach(x -> x.accept(this));
    };
    @Override public void visit(TypeNode it){};
    //
    @Override public void visit(ClassdefNode it){
        class_name = it.id;
        it.varlist.forEach(x -> x.accept(this));
        it.funclist.forEach(x -> x.accept(this));
        class_name = null;
    };
    @Override public void visit(FunctiondefNode it){
        if (class_name == null) {
            Funcsymbol res=global.func_map.get(it.id);
            res.type = global.get_type(it.type);
            it.paralist.forEach(x -> res.para_list.add(new Varsymbol(x.id, global.get_type(x.type))));
        } else {
            Funcsymbol res=((Classtype) global.type_map.get(class_name)).funcmap.get(it.id);
            res.type = global.get_type(it.type);
            it.paralist.forEach(x -> res.para_list.add(new Varsymbol(x.id, global.get_type(x.type))));
        }
    };
    //
    @Override public void visit(PartstmtNode it){};
    @Override public void visit(BreakstmtNode it){};
    @Override public void visit(ContinuestmtNode it){};
    @Override public void visit(EmptystmtNode it){};
    @Override public void visit(ForstmtNode it){};
    @Override public void visit(IfstmtNode it){};
    @Override public void visit(ExprstmtNode it){};
    @Override public void visit(ReturnstmtNode it){};
    @Override public void visit(WhilestmtNode it){};
    @Override public void visit(VardefstmtNode it){};
    @Override public void visit(VardefsubstmtNode it){
        if (class_name == null) {
            global.var_map.get(it.id).type = global.get_type(it.type);
        } else {
            ((Classtype) global.type_map.get(class_name)).varmap.get(it.id).type = global.get_type(it.type);
        }
    };
    //
    @Override public void visit(BinaryexprNode it){};
    @Override public void visit(BoolexprNode it){};
    @Override public void visit(FuncexprNode it){};
    @Override public void visit(IntexprNode it){};
    @Override public void visit(ClassexprNode it){};
    @Override public void visit(NewexprNode it){};
    @Override public void visit(NullexprNode it){};
    @Override public void visit(StringexprNode it){};
    @Override public void visit(ThisexprNode it){};
    @Override public void visit(VarexprNode it){};
    @Override public void visit(ArrexprNode it){};
    @Override public void visit(SuffixexprNode it){};
    @Override public void visit(PrefixexprNode it){};
    @Override public void visit(ExprlistexprNode it){};
}