/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package trash.foodbyte.event;

public final class Type
extends Enum {
    public static final Type PRE;
    public static final Type ON;
    public static final Type POST;
    public static final Type SEND;
    public static final Type RECIEVE;
    private static final /* synthetic */ Type[] TYPES;
    private static int Field2938;

    public static Type[] getTypes() {
        return (Type[])TYPES.clone();
    }

    public static Type getTypeByString(String type) {
        return (Type)Enum.valueOf(Type.class, (String)type);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Type() {
        void var2_-1;
        void var1_-1;
    }

    static {
        Type.Method9(95);
        PRE = new Type("PRE", 0);
        ON = new Type("ON", 1);
        POST = new Type("POST", 2);
        SEND = new Type("SEND", 3);
        RECIEVE = new Type("RECIEVE", 4);
        TYPES = new Type[]{PRE, ON, POST, SEND, RECIEVE};
    }

    public static void Method9(int n) {
        Field2938 = n;
    }

    public static int Method10() {
        return Field2938;
    }

    public static int Method12() {
        int n = Type.Method10();
        return 21;
    }
}