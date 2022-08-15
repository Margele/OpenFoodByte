/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class62;

public class Class42
extends Class62 {
    private float Field332;
    private float Field333;
    private float Field334;

    public Class42() {
        this(1.0f);
    }

    public Class42(float a) {
        this(a, a, a);
    }

    public Class42(float a, float a2, float a3) {
        this.Method3240(a, a2, a3);
    }

    public void Method3240(float a, float a2, float a3) {
        this.Field332 = a;
        this.Field333 = a2;
        this.Field334 = a3;
        this.Field633 = false;
    }

    public void Method56(float a) {
        this.Method3240(a, a, a);
    }

    public float Method57() {
        return this.Field332;
    }

    @Override
    protected void Method89() {
        this.Field630 = this.Method3241(this.Field332);
        boolean bl = Class193.Method1270();
        if (this.Field333 == this.Field332) {
            this.Field631 = this.Field630;
        }
        this.Field631 = this.Method3241(this.Field333);
        if (this.Field334 == this.Field332) {
            this.Field632 = this.Field630;
        }
        if (this.Field334 == this.Field333) {
            this.Field632 = this.Field631;
        }
        this.Field632 = this.Method3241(this.Field334);
    }

    private int[] Method3241(float a) {
        int[] a2 = new int[256];
        for (int a3 = 0; a3 < 256; ++a3) {
            int a4 = (int)(255.0 * Math.pow((double)((double)a3 / 255.0), (double)(1.0 / (double)a)) + 0.5);
            if (a4 > 255) {
                a4 = 255;
            }
            a2[a3] = a4;
        }
        return a2;
    }

    public String toString() {
        return "Colors/Gamma...";
    }
}