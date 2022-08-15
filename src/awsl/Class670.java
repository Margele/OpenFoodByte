/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class670
extends Enum {
    public static final Class670 FASTEST_PATH = new Class670("FASTEST_PATH", 0);
    public static final Class670 LEAST_POINTS = new Class670("LEAST_POINTS", 1);
    private static final /* synthetic */ Class670[] Field2945;

    public static Class670[] Method2321() {
        return (Class670[])Field2945.clone();
    }

    public static Class670 Method2322(String a) {
        return (Class670)Enum.valueOf(Class670.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class670() {
        void var2_-1;
        void var1_-1;
    }

    static {
        Field2945 = new Class670[]{FASTEST_PATH, LEAST_POINTS};
    }
}