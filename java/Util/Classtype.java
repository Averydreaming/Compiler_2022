package Util;

import java.util.HashMap;

public class Classtype extends Type {
    public String id;
    public HashMap<String, Varsymbol> varmap = new HashMap<>();
    public HashMap<String, Funcsymbol> funcmap = new HashMap<>();
    public Funcsymbol constructor = null;

    public Classtype(String _id) {
        id = _id;
    }

    @Override
    public boolean equal(Type t) {
        if (t.is_null()) return true;
        if ((t instanceof Classtype) && (id.equals(((Classtype) t).id))) return true;
        return false;
    }

    public int size() {
        return 4 * varmap.size();
    }
}
