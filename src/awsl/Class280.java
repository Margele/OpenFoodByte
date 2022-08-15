/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class91;

public final class Class280 {
    public long Field1523 = 0L;
    private static int Field1524;

    public int Method3074(int a) {
        return 1000 / a;
    }

    public long Method3075() {
        return System.nanoTime() / 1000000L;
    }

    public long Method3076() {
        return System.currentTimeMillis() - this.Field1523;
    }

    public boolean Method3077(long a) {
        int n = Class280.Method3083();
        boolean bl = this.Method3075() - this.Field1523 >= a;
        Class91.Method3647(new String[5]);
        return bl;
    }

    public long Method3078() {
        return System.currentTimeMillis() - this.Field1523;
    }

    public void Method3079() {
        this.Field1523 = this.Method3075();
    }

    public void Method3080() {
        this.Field1523 = System.currentTimeMillis();
    }

    public void Method3081(long a) {
        this.Field1523 = a;
    }

    public static void Method3082(int n) {
        Field1524 = n;
    }

    public static int Method3083() {
        return Field1524;
    }

    public static int Method3084() {
        int n = Class280.Method3083();
        return 103;
    }

    static {
        if (Class280.Method3084() != 0) {
            Class280.Method3082(104);
        }
    }
}