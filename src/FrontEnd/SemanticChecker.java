package FrontEnd;

import AST.*;
import Util.*;
import Util.error.semanticError;

public class SemanticChecker implements ASTvisitor {
    public Scope scope, now;
    public Type res_type;
    public Classtype now_class;
    public boolean fl; //whether this part has returned
    public int dep;

    public SemanticChecker(Scope _scope) {
        scope = _scope;
        dep = 0;
    }

    @Override
    public void visit(RootNode it) {
        Funcsymbol func_main = scope.get_function("main", false, it.pos);
        now = scope;
        if (!func_main.type.is_int()) throw new semanticError("Invalid main", it.pos);
        if (func_main.para_list.size() > 0) throw new semanticError("Invalid main", it.pos);
        it.body.forEach(x -> x.accept(this));
    }

    @Override public void visit(TypeNode it) {}

    @Override
    public void visit(ClassdefNode it) {
        now = new Scope(now);
        now_class = (Classtype) scope.type_map.get(it.id);
        now_class.varmap.forEach((key, value) -> now.insert_variable(key, value, it.pos));
        now_class.funcmap.forEach((key, value) -> now.insert_function(key, value, it.pos));
        for (int i = 0; i < it.varlist.size(); i++) {
           // it.varlist.get(i).varsymbol.vreg_id = new Immediate(i);
            it.varlist.get(i).varsymbol.flag_class = true;
        }
        it.funclist.forEach(x -> x.accept(this));
        if (it.constructor != null) {
            if (!it.constructor.id.equals(it.id)) throw new semanticError("Invalid constructor!", it.pos);
            it.constructor.accept(this);
        }
        now = now.parent_scope;
        now_class = null;
    }

    @Override
    public void visit(FunctiondefNode it) {
        now = new Scope(now);
        if (it.paralist != null)
            it.paralist.forEach(x ->
            {
                x.varsymbol = new Varsymbol(x.id, scope.get_type(x.type));
                now.insert_variable(x.id, x.varsymbol, x.pos);
            });
        if (now_class != null) {
            it.funcsymbol.id2 = now_class.id + "_function_in_class_" + it.funcsymbol.id;
            it.funcsymbol.flag_class = true;
        } else it.funcsymbol.id2=it.funcsymbol.id;
        fl = false;
        if (it.type == null) res_type = new Literaltype("void");
        else res_type = scope.get_type(it.type);
        it.part.accept(this);
        it.flag_return = fl;
        if (it.id.equals("main")) fl = true;
        if (!fl && it.type != null && !it.type.type.equals("void")) throw new semanticError("Invalid return!", it.pos);
        now = now.parent_scope;
    }

    @Override
    public void visit(PartstmtNode  it) {
        it.stmtlist.forEach(x ->
        {
            if (x instanceof PartstmtNode ) {
                now = new Scope(now);
                x.accept(this);
                now = now.parent_scope;
            } else x.accept(this);
        });
    }

    @Override public void visit(BreakstmtNode it) {
        if (dep == 0) throw new semanticError("Invalid Break!", it.pos);
    }
    @Override public void visit(ContinuestmtNode it) { if (dep == 0) throw new semanticError("Invalid Continue!", it.pos);}
    @Override public void visit(EmptystmtNode it) {}

    @Override
    public void visit(ForstmtNode it) {
        if (it.init != null) it.init.accept(this);
        if (it.condition != null) it.condition.accept(this);
        if (it.inc != null) it.inc.accept(this);
        if (it.condition != null && !it.condition.type.is_boolean())
            throw new semanticError("Condition is not boolean!", it.pos);
        now = new Scope(now);
        ++dep;
        it.body.accept(this);
        now = now.parent_scope;
        --dep;
    }

    @Override
    public void visit(IfstmtNode it) {
        it.condition.accept(this);
        if (!it.condition.type.is_boolean()) throw new semanticError("Invalid If!", it.pos);
        now = new Scope(now);
        it.truestate.accept(this);
        now = now.parent_scope;
        if (it.falsestate != null) {
            now = new Scope(now);
            it.falsestate.accept(this);
            now = now.parent_scope;
        }
    }

    @Override
    public void visit(ExprstmtNode it) {
        it.expr .accept(this);
    }

    @Override
    public void visit(ReturnstmtNode it) {
        fl = true;
        if (it.res == null) {
            if (!res_type.is_void()) throw new semanticError("Invalid return!", it.pos);
        } else {
            it.res.accept(this);
            if (!res_type.equal(it.res.type)) throw new semanticError("Invalid return!", it.pos);
        }
    }

    @Override
    public void visit(WhilestmtNode it) {
        it.condition.accept(this);
        if (!it.condition.type.is_boolean()) throw new semanticError("Condition is not boolean!", it.pos);
        now = new Scope(now);
        ++dep;
        it.body.accept(this);
        now = now.parent_scope;
        --dep;
    }

    @Override
    public void visit(VardefstmtNode it) {
        it.varlist.forEach(x -> x.accept(this));
    }

    @Override
    public void visit(VardefsubstmtNode it) {
        Type tmp = scope.get_type(it.type);
        if (tmp.is_void()) throw new semanticError("Invalid Vardefsubstmt!", it.pos);
        if (it.expr  != null) {
            it.expr .accept(this);
            if (!tmp.equal(it.expr .type)) throw new semanticError("Invalid Vardefsubstmt!", it.pos);
        }
        it.varsymbol = new Varsymbol(it.id, tmp);
        if (now == scope) it.varsymbol.is_global = true;
        now.insert_variable(it.id, it.varsymbol, it.pos);
    }

    @Override
    public void visit(BinaryexprNode  it) {
        it.src1.accept(this);
        it.src2.accept(this);
        if (it.op.equals("*") || it.op.equals("/") || it.op.equals("%") || it.op.equals("-") || it.op.equals("<<") || it.op.equals(">>") || it.op.equals("&") || it.op.equals("|") || it.op.equals("^")) {
            if (it.src1.type.is_int() && it.src2.type.is_int()) it.type = new Literaltype("int");
            else throw new semanticError("Invalid operation type!", it.pos);
        } else if (it.op.equals("+")) {
            if (it.src1.type.is_int() && it.src2.type.is_int()) it.type = new Literaltype("int");
            else if (it.src1.type.is_string() && it.src2.type.is_string()) it.type = new Literaltype("string");
            else throw new semanticError("Invalid operation type!", it.pos);
        } else if (it.op.equals("<") || it.op.equals(">") || it.op.equals("<=") || it.op.equals(">=")) {
            if (it.src1.type.is_int() && it.src2.type.is_int()) it.type = new Literaltype("bool");
            else if (it.src1.type.is_string() && it.src2.type.is_string()) it.type = new Literaltype("bool");
            else throw new semanticError("Invalid operation type!", it.pos);
        } /*else if (it.op.equals("&&") || it.op.equals("||")) {
            if (it.src1.type.is_boolean() && it.src2.type.is_boolean()) it.type = new Literaltype("bool");
            else throw new semanticError("Invalid operation type!", it.pos);
        } else if (it.op.equals("==") || it.op.equals("!=")) {
            if (it.src1.type.equal(it.src2.type)) it.type = new Literaltype("bool");
            else throw new semanticError("Invalid operation type!", it.pos);
        } */else if (it.op.equals("=")) {
            if (!it.src1.type.equal(it.src2.type)) throw new semanticError("Invalid operation type!", it.pos);
            if (!it.src1.assign) throw new semanticError("Invalid assign!", it.pos);
            it.type = it.src1.type;
            it.assign = true;
        } else throw new semanticError("Undefined operation!", it.pos);
    }

    @Override
    public void visit(BoolexprNode  it) {
        it.type = new Literaltype("bool");
    }

    @Override
    public void visit(FuncexprNode  it) {
        if (it.name instanceof VarexprNode ) it.name.type = now.get_function(((VarexprNode ) it.name).id, true, it.pos);
        else it.name.accept(this); //The function belongs to a class.
        if (!(it.name.type instanceof Funcsymbol)) throw new semanticError("Undefined function!", it.pos);
        Funcsymbol tmp = (Funcsymbol) it.name.type;
        it.exprlist.exprlist.forEach(x -> x.accept(this));
        if (it.exprlist.exprlist.size() != tmp.para_list.size()) throw new semanticError("Invalid parameters!", it.pos);
        for (int i = 0; i < tmp.para_list.size(); i++)
            if (!tmp.para_list.get(i).type.equal(it.exprlist.exprlist.get(i).type))
                throw new semanticError("Invalid parameter type!", it.pos);
        it.type = tmp.type;
    }

    @Override
    public void visit(IntexprNode  it) {
        it.type = new Literaltype("int");
    }

    @Override
    public void visit(ClassexprNode  it) {
        it.name.accept(this);
        if (it.name.type instanceof Arraytype && it.flag_func && it.id.equals("size")) {
            Funcsymbol tmp = new Funcsymbol("size");
            tmp.type = new Literaltype("int");
            it.type = tmp;
            return;
        }
        if (it.name.type.is_string() && it.flag_func && it.id.equals("length")) {
            Funcsymbol tmp = new Funcsymbol("length");
            tmp.type = new Literaltype("int");
            tmp.id2="__std_str_length";
            it.type = tmp;
            return;
        }
        if (it.name.type.is_string() && it.flag_func && it.id.equals("substring")) {
            Funcsymbol tmp = new Funcsymbol("substring");
            tmp.type = new Literaltype("string");
            tmp.id2="__std_str_substring";
            tmp.para_list.add(new Varsymbol("left", new Literaltype("int")));
            tmp.para_list.add(new Varsymbol("right", new Literaltype("int")));
            it.type = tmp;
            return;
        }
        if (it.name.type.is_string() && it.flag_func && it.id.equals("parseInt")) {
            Funcsymbol tmp = new Funcsymbol("parseInt");
            tmp.type = new Literaltype("int");
            tmp.id2="__std_str_parseInt";
            it.type = tmp;
            return;
        }
        if (it.name.type.is_string() && it.flag_func && it.id.equals("ord")) {
            Funcsymbol tmp = new Funcsymbol("ord");
            tmp.type = new Literaltype("int");
            tmp.id2="__std_str_ord";
            tmp.para_list.add(new Varsymbol("pos", new Literaltype("int")));
            it.type = tmp;
            return;
        }
        if (!(it.name.type instanceof Classtype)) throw new semanticError("Undefined class!", it.pos);
        Classtype tmp = (Classtype) it.name.type;
        if (it.flag_func) {
            if (tmp.funcmap.containsKey(it.id)) it.type = tmp.funcmap.get(it.id);
            else throw new semanticError("Function not found!", it.pos);
        } else {
            if (tmp.varmap.containsKey(it.id)) {
                it.varsymbol = tmp.varmap.get(it.id);
                it.type = it.varsymbol.type;
            } else throw new semanticError("Variable not found!", it.pos);
        }
    }

    @Override
    public void visit(NewexprNode  it) {
        if (it.exprlist != null) {
            it.exprlist.forEach(x ->
            {
                x.accept(this);
                if (!x.type.is_int()) throw new semanticError("Paramater must be int!", it.pos);
            });
        }
        it.type = scope.get_type(it.typenode);
    }

    @Override
    public void visit(NullexprNode  it) {
        it.type = new Literaltype("null");
    }

    @Override
    public void visit(StringexprNode  it) {
        it.type = new Literaltype("string");
    }

    @Override
    public void visit(ThisexprNode  it) {
        if (now_class == null) throw new semanticError("Not in class!", it.pos);
        it.type = now_class;
    }

    @Override
    public void visit(VarexprNode  it) {
        it.type = now.get_variable(it.id, true, it.pos).type;
        it.varsymbol = now.get_variable(it.id, true, it.pos);
    }

    @Override
    public void visit(ArrexprNode  it) {
        it.base.accept(this);
        it.offset.accept(this);
        if (!(it.base.type instanceof Arraytype)) throw new semanticError("Undefined array!", it.pos);
        if (!(it.offset.type.is_int())) throw new semanticError("The parameter must be int!", it.pos);
        Arraytype tmp = (Arraytype) it.base.type;
        if (tmp.dim == 1) it.type = tmp.type;
        else it.type = new Arraytype(tmp.type, tmp.dim - 1);
    }

    @Override
    public void visit(SuffixexprNode  it) {
        it.src.accept(this);
        if (!it.src.type.is_int()) throw new semanticError("Variable is not int!", it.pos);
        if (!it.src.assign) throw new semanticError("Variable is not assignable!", it.pos);
        it.type = it.src.type;
    }

    @Override
    public void visit(PrefixexprNode  it) {
        it.src.accept(this);
        if (it.op.equals("++") || it.op.equals("--")) {
            if (!it.src.type.is_int()) throw new semanticError("Variable is not int!", it.pos);
            if (!it.src.assign) throw new semanticError("Variable is not assignable!", it.pos);
            it.assign = true;
            it.type = new Literaltype("int");
        } else if (it.op.equals("+") || it.op.equals("-") || it.op.equals("~")) {
            if (!it.src.type.is_int()) throw new semanticError("Variable is not int!", it.pos);
            it.type = new Literaltype("int");
        } else if (it.op.equals("!")) {
            if (!it.src.type.is_boolean()) throw new semanticError("Variable is not bool!", it.pos);
            it.type = new Literaltype("bool");
        } else throw new semanticError("Undefined operation!", it.pos);
    }

    @Override
    public void visit(ExprlistexprNode  it) {

    }
}
