package Util;

public class Arraytype extends Type {
    public Type type;
    public int dim;

    public Arraytype(Type _type, int _dim) {
        type = _type;
        dim = _dim;
    }

    @Override
    public boolean equal(Type t) {
        if (t.is_null()) return true;
        if ((t instanceof Arraytype) && (type.equal(((Arraytype) t).type)) && (dim == ((Arraytype) t).dim)) return true;
        return false;
    }
}
