/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class659
extends Enum {
    public static final Class659 NORMAL = new Class659("NORMAL", 0);
    public static final Class659 LEGIT = new Class659("LEGIT", 1);
    private static final /* synthetic */ Class659[] Field2929;

    public static Class659[] Method2379() {
        return (Class659[])Field2929.clone();
    }

    public static Class659 Method2380(String a) {
        return (Class659)Enum.valueOf(Class659.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class659() {
        void var2_-1;
        void var1_-1;
    }

    static {
        Field2929 = new Class659[]{NORMAL, LEGIT};
    }
}