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
import awsl.Class755;
import awsl.Class758;

public class Class24
extends Class119 {
    private Class755 Field236 = new Class758();

    public Class24() {
        this.Field950 = true;
    }

    public Class24(Class755 a) {
        this.Field950 = true;
        this.Field236 = a;
    }

    public void Method176(Class755 a) {
        this.Field236 = a;
    }

    public Class755 Method177() {
        return this.Field236;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 >> 16 & 0xFF;
        int a5 = a3 >> 8 & 0xFF;
        int a6 = a3 & 0xFF;
        a3 = (a4 + a5 + a6) / 3;
        return this.Field236.Method283((float)a3 / 255.0f);
    }

    public String toString() {
        return "Colors/Lookup...";
    }
}