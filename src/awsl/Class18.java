/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;

public class Class18
extends Class119 {
    private int Field228;

    public Class18() {
        this(-16711681);
    }

    public Class18(int a) {
        this.Field950 = true;
        this.Method9(a);
    }

    public void Method9(int a) {
        this.Field228 = a;
    }

    public int Method10() {
        return this.Field228;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        return a3 & this.Field228;
    }

    public String toString() {
        return "Mask";
    }
}