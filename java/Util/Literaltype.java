package Util;

public class Literaltype extends Type {
    public String id;
    public Literaltype(String _id) {
        id = _id;
    }
    @Override
    public boolean equal(Type t) {
        if (this.is_null()) return (t.is_null() || (t instanceof Arraytype) || (t instanceof Classtype));
        else return ((t instanceof Literaltype) && (id.equals(((Literaltype) t).id)));
    }
    @Override public boolean is_boolean() {
        return id.equals("bool");
    }
    @Override public boolean is_int() {
        return id.equals("int");
    }
    @Override public boolean is_string() {
        return id.equals("string");
    }
    @Override public boolean is_void() {
        return id.equals("void");
    }
    @Override public boolean is_null() {
        return id.equals("null");
    }
}
