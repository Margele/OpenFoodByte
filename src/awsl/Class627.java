/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class627
extends Enum {
    public static final Class627 WAIT = new Class627("WAIT", 0);
    public static final Class627 RECONNECT = new Class627("RECONNECT", 1);
    public static final Class627 TP = new Class627("TP", 2);
    private static final Class627[] Field2879 = new Class627[]{WAIT, RECONNECT, TP};

    public static Class627[] Method3496() {
        return (Class627[])Field2879.clone();
    }

    public static Class627 Method3497(String a) {
        return (Class627)Enum.valueOf(Class627.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class627() {
        void var2_-1;
        void var1_-1;
    }
}