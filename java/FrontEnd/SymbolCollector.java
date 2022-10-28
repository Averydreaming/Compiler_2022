package FrontEnd;

import AST.*;
import Util.*;
//处理出 global(scope),每一个class进行预处理,处理同一层之间的变量重复

public class SymbolCollector implements ASTvisitor{
    Scope global, now;//是symbolCollector 公用的，只有一个
    public SymbolCollector(Scope _global) {//java是引用传参，可以通过改变global传到外面去
        global = _global;
        global.type_map.put("int", new Literaltype("int"));
        global.type_map.put("bool", new Literaltype("bool"));
        global.type_map.put("string", new Literaltype("string"));
        global.type_map.put("null", new Literaltype("null"));
        global.type_map.put("void", new Literaltype("void"));
        {
            Funcsymbol x = new Funcsymbol("print");
            x.type = new Literaltype("void");
            x.id2="__std_print";
            x.para_list.add(new Varsymbol("str", new Literaltype("string")));
            global.func_map.put("print", x);
        }
        {
            Funcsymbol x = new Funcsymbol("println");
            x.type = new Literaltype("void");
            x.id2="__std_println";
            x.para_list.add(new Varsymbol("str", new Literaltype("string")));
            global.func_map.put("println", x);
        }
        {
            Funcsymbol x = new Funcsymbol("printInt");
            x.type = new Literaltype("void");
            x.id2="__std_printInt";
            x.para_list.add(new Varsymbol("n", new Literaltype("int")));
            global.func_map.put("printInt", x);
        }
        {
            Funcsymbol x = new Funcsymbol("printlnInt");
            x.type = new Literaltype("void");
            x.id2="__std_printlnInt";
            x.para_list.add(new Varsymbol("n", new Literaltype("int")));
            global.func_map.put("printlnInt", x);
        }
        {
            Funcsymbol x = new Funcsymbol("getInt");
            x.type = new Literaltype("int");
            x.id2="__std_getInt";
            global.func_map.put("getInt", x);
        }
        {
            Funcsymbol x = new Funcsymbol("getString");
            x.type = new Literaltype("string");
            x.id2="__std_getString";
            global.func_map.put("getString", x);
        }
        {
            Funcsymbol x = new Funcsymbol("toString");
            x.type = new Literaltype("string");
            x.id2="__std_toString";
            x.para_list.add(new Varsymbol("i", new Literaltype("int")));
            global.func_map.put("toString", x);
        }
    }
    @Override public void visit(RootNode it){
        now= global;
        it.body.forEach(x -> x.accept(this));
    };
    @Override public void visit(TypeNode it){};
    //
    @Override public void visit(ClassdefNode it){
        now = new Scope(now);
        Classtype res = new Classtype(it.id);
        it.varlist.forEach(x -> x.accept(this));
        it.funclist.forEach(x -> x.accept(this));
        if (it.constructor != null) {
            res.constructor = new Funcsymbol(it.constructor.id);
            it.constructor.funcsymbol = res.constructor;
        }
        res.varmap = now.var_map;
        res.funcmap = now.func_map;
        now = now.parent_scope;
        now.insert_type(it.id, res, it.pos);
    };
    @Override public void visit(FunctiondefNode it){
        it.funcsymbol = new Funcsymbol(it.id);
        now.insert_function(it.id, it.funcsymbol, it.pos);
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
        it.varsymbol = new Varsymbol(it.id);
        now.insert_variable(it.id, it.varsymbol, it.pos);

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