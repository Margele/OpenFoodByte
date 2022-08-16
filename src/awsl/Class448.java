/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import obfuscate.a;
import trash.foodbyte.module.impl.world.XRay;

public final class Class448 {
    private long Field2123;
    final XRay Field2124;
    private static a[] Field2125;

    public Class448(XRay a2) {
        this.Field2124 = a2;
        this.Field2123 = System.nanoTime() / 1000000L;
    }

    public boolean Method2455(long a2) {
        return this.Method2459() >= a2;
    }

    public void Method2456() {
        this.Field2123 = System.nanoTime() / 1000000L;
    }

    public void Method2457(long a2) {
        this.Field2123 = System.nanoTime() / 1000000L - a2;
    }

    public boolean Method2458(long a2) {
        if (this.Method2459() >= a2) {
            this.Method2456();
            return true;
        }
        return false;
    }

    public long Method2459() {
        return System.nanoTime() / 1000000L - this.Field2123;
    }

    public static void Method2460(a[] aArray) {
        Field2125 = aArray;
    }

    public static a[] Method2461() {
        return Field2125;
    }

    static {
        if (Class448.Method2461() == null) {
            Class448.Method2460(new a[5]);
        }
    }
}