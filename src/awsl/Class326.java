/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

public class Class326 {
    private static boolean Field1611;

    public static void Method1246(boolean bl) {
        Field1611 = bl;
    }

    public static boolean Method1247() {
        return Field1611;
    }

    public static boolean Method1248() {
        boolean bl = Class326.Method1247();
        return true;
    }

    static {
        if (Class326.Method1247()) {
            Class326.Method1246(true);
        }
    }
}