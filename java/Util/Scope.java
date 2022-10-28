package Util;

import AST.TypeNode;
import Util.error.semanticError;
import java.util.HashMap;

public class Scope {
    public HashMap<String, Varsymbol> var_map = new HashMap<>();
    public HashMap<String, Funcsymbol> func_map = new HashMap<>();
    public HashMap<String, Type> type_map = new HashMap<>();//语言自带的定义 int bool//class自定义的type//数组自定义
    public Scope parent_scope;//往树上走

    public Scope(Scope _parent_scope) {
        parent_scope = _parent_scope;
    }

    public void insert_variable(String name, Varsymbol type, position pos) {
        if (this.exist_type(name, true, pos)) throw new semanticError("The variable coincides with a type name!", pos);
        if (var_map.containsKey(name)) throw new semanticError("Redefine variables!", pos);
        var_map.put(name, type);
    }

    public void insert_function(String name, Funcsymbol type, position pos) {
        if (this.exist_type(name, true, pos)) throw new semanticError("The function coincides with a type name!", pos);
        if (func_map.containsKey(name)) throw new semanticError("Redefine functions!", pos);
        func_map.put(name, type);
    }

    public void insert_type(String name, Type type, position pos) {
        if (type_map.containsKey(name)) throw new semanticError("Redefine types!", pos);
        type_map.put(name, type);
    }

    public boolean exist_type(String name, boolean upon, position pos) {
        if (type_map.containsKey(name)) return true;
        else if (upon && parent_scope != null) return parent_scope.exist_type(name, true, pos);
        else return false;
    }

    public Varsymbol get_variable(String name, boolean upon, position pos) {
        if (var_map.containsKey(name)) return var_map.get(name);
        else if (upon && parent_scope != null) return parent_scope.get_variable(name, true, pos);
        else throw new semanticError("Missing variables!", pos);
    }

    public Funcsymbol get_function(String name, boolean upon, position pos) {
        if (func_map.containsKey(name)) return func_map.get(name);
        else if (upon && parent_scope != null) return parent_scope.get_function(name, true, pos);
        else throw new semanticError("Missing functions!", pos);
    }

    public Type get_type(String name, boolean upon, position pos) {
        if (type_map.containsKey(name)) return type_map.get(name);
        else if (upon && parent_scope != null) return parent_scope.get_type(name, true, pos);
        else throw new semanticError("Missing types!", pos);
    }

    public Type get_type(TypeNode type) {
        if (type.dim == 0) return type_map.get(type.type);
        else return new Arraytype(type_map.get(type.type), type.dim);
    }
}
