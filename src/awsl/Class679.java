/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class679
extends Enum {
    public static final Class679 ORTHOGONAL = new Class679("ORTHOGONAL", 0);
    public static final Class679 DIRECT = new Class679("DIRECT", 1);
    public static final Class679 NONE = new Class679("NONE", 2);
    private static final Class679[] Field2960 = new Class679[]{ORTHOGONAL, DIRECT, NONE};

    public static Class679[] Method2673() {
        return (Class679[])Field2960.clone();
    }

    public static Class679 Method2674(String a) {
        return (Class679)Enum.valueOf(Class679.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class679() {
        void var2_-1;
        void var1_-1;
    }
}