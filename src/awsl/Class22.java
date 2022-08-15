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

public class Class22
extends Class119 {
    private int Field233;
    private int Field234;

    public Class22() {
        this(136);
    }

    public Class22(int a) {
        this.Method9(a);
    }

    public void Method9(int a) {
        this.Field233 = a;
        this.Field234 = a << 24;
    }

    public int Method10() {
        return this.Field233;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        if ((a3 & 0xFF000000) != 0) {
            return a3 & 0xFFFFFF | this.Field234;
        }
        return a3;
    }

    public String toString() {
        return "Colors/Transparency...";
    }
}