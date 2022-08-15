/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class91;

public class Class322 {
    double Field1609;
    private static boolean Field1610;

    public Class322() {
        boolean bl = Class322.Method1196();
        boolean bl2 = bl;
        this.Field1609 = 0.0;
        if (Class91.Method3648() == null) {
            Class322.Method1194(false);
        }
    }

    public Class322(double a) {
        boolean bl = Class322.Method1196();
        boolean bl2 = bl;
        this.Field1609 = a;
        Class91.Method3647(new String[3]);
    }

    public final double Method1191() {
        return this.Field1609;
    }

    public final void Method1192(double a) {
        this.Field1609 = a;
    }

    public final void Method1193() {
        this.Field1609 = 0.0;
    }

    public static void Method1194(boolean bl) {
        Field1610 = bl;
    }

    public static boolean Method1195() {
        return Field1610;
    }

    public static boolean Method1196() {
        boolean bl = Class322.Method1195();
        return true;
    }

    static {
        if (!Class322.Method1196()) {
            Class322.Method1194(true);
        }
    }
}