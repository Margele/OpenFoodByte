/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import awsl.Class91;
import trash.foodbyte.module.impl.world.XRay;

public final class Class448 {
    private long Field2123;
    final XRay Field2124;
    private static Class91[] Field2125;

    public Class448(XRay a) {
        this.Field2124 = a;
        this.Field2123 = System.nanoTime() / 1000000L;
    }

    public boolean Method2455(long a) {
        return this.Method2459() >= a;
    }

    public void Method2456() {
        this.Field2123 = System.nanoTime() / 1000000L;
    }

    public void Method2457(long a) {
        this.Field2123 = System.nanoTime() / 1000000L - a;
    }

    public boolean Method2458(long a) {
        if (this.Method2459() >= a) {
            this.Method2456();
            return true;
        }
        return false;
    }

    public long Method2459() {
        return System.nanoTime() / 1000000L - this.Field2123;
    }

    public static void Method2460(Class91[] class91Array) {
        Field2125 = class91Array;
    }

    public static Class91[] Method2461() {
        return Field2125;
    }

    static {
        if (Class448.Method2461() == null) {
            Class448.Method2460(new Class91[5]);
        }
    }
}