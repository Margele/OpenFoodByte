/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class119;

public class Class30
extends Class119 {
    private int Field250;
    private int Field251;

    public Class30() {
        this(-1, -16777216);
    }

    public Class30(int a, int a2) {
        this.Field950 = true;
        this.Field250 = a;
        this.Field251 = a2;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        if (a3 == this.Field250) {
            return this.Field251;
        }
        return a3;
    }
}