/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class588;

public class Class589
extends Class588 {
    public Class589() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Class589(float[] a) {
        this.Field2775 = a[0];
        this.Field2776 = a[1];
        this.Field2777 = a[2];
    }

    public Class589(float a, float a2, float a3) {
        this.Field2775 = a;
        this.Field2776 = a2;
        this.Field2777 = a3;
    }

    public Class589(Class589 a) {
        this.Field2775 = a.Field2775;
        this.Field2776 = a.Field2776;
        this.Field2777 = a.Field2777;
    }

    public Class589(Class588 a) {
        this.Field2775 = a.Field2775;
        this.Field2776 = a.Field2776;
        this.Field2777 = a.Field2777;
    }

    public float Method377(Class589 a) {
        return Math.abs((float)(this.Field2775 - a.Field2775)) + Math.abs((float)(this.Field2776 - a.Field2776)) + Math.abs((float)(this.Field2777 - a.Field2777));
    }

    public float Method378(Class589 a) {
        float a2 = this.Field2775 - a.Field2775;
        float a3 = this.Field2776 - a.Field2776;
        float a4 = this.Field2777 - a.Field2777;
        return a2 * a2 + a3 * a3 + a4 * a4;
    }

    public float Method379(Class589 a) {
        float a2 = this.Field2775 - a.Field2775;
        float a3 = this.Field2776 - a.Field2776;
        float a4 = this.Field2777 - a.Field2777;
        return (float)Math.sqrt((double)(a2 * a2 + a3 * a3 + a4 * a4));
    }
}