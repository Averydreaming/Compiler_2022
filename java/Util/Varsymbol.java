package Util;

//import ASM.operand.Operand;

public class Varsymbol {
    public String id;
    public Type type;
    public boolean is_global = false;
    public boolean flag_class = false; // if this var is in class or in main()
    /// Operand vreg_id;

    public Varsymbol(String _id) {
        id = _id;
    }

    public Varsymbol(String _id, Type _type) {
        id = _id;
        type = _type;
    }
}
