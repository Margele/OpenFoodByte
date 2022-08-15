/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class668
extends Enum {
    public static final Class668 ARRAYLIST;
    public static final Class668 LOGO;
    public static final Class668 FLAT_COLOR;
    public static final Class668 GENERAL;
    private static final /* synthetic */ Class668[] Field2942;
    private static boolean Field2943;

    public static Class668[] Method2316() {
        return (Class668[])Field2942.clone();
    }

    public static Class668 Method2317(String a) {
        return (Class668)Enum.valueOf(Class668.class, (String)a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class668() {
        void var2_-1;
        void var1_-1;
    }

    static {
        Class668.Method1268(true);
        ARRAYLIST = new Class668("ARRAYLIST", 0);
        LOGO = new Class668("LOGO", 1);
        FLAT_COLOR = new Class668("FLAT_COLOR", 2);
        GENERAL = new Class668("GENERAL", 3);
        Field2942 = new Class668[]{ARRAYLIST, LOGO, FLAT_COLOR, GENERAL};
    }

    public static void Method1268(boolean bl) {
        Field2943 = bl;
    }

    public static boolean Method1269() {
        return Field2943;
    }

    public static boolean Method1270() {
        boolean bl = Class668.Method1269();
        return true;
    }
}