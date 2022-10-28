package Util;

import java.util.ArrayList;

public class Funcsymbol extends Type {
    public Type type = null;
    public String id;
    public String id2;
    public ArrayList<Varsymbol> para_list = new ArrayList<>();
    public boolean flag_class = false; // if the function belongs to a class

    public Funcsymbol(String _id) {
        id = _id;
    }
}
