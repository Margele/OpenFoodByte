/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import awsl.Class321;

public class Class341 {
    public long Field1647;
    final Class321 Field1648;

    public Class341(Class321 a) {
        this.Field1648 = a;
        this.Field1647 = System.currentTimeMillis();
    }

    public void Method285() {
        this.Field1647 = System.currentTimeMillis();
    }

    public boolean Method286(long a, boolean a2) {
        if (System.currentTimeMillis() - this.Field1647 > a) {
            this.Method285();
            return true;
        }
        return false;
    }

    public boolean Method287(long a) {
        return System.currentTimeMillis() - this.Field1647 > a;
    }

    public long Method288() {
        return System.currentTimeMillis() - this.Field1647;
    }

    public void Method289(long a) {
        this.Field1647 = a;
    }
}