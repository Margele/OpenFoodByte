/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class588;

public class Class590
extends Class588 {
    public Class590() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Class590(float[] a) {
        this.Field2775 = a[0];
        this.Field2776 = a[1];
        this.Field2777 = a[2];
    }

    public Class590(float a, float a2, float a3) {
        this.Field2775 = a;
        this.Field2776 = a2;
        this.Field2777 = a3;
    }

    public Class590(Class590 a) {
        this.Field2775 = a.Field2775;
        this.Field2776 = a.Field2776;
        this.Field2777 = a.Field2777;
    }

    public Class590(Class588 a) {
        this.Field2775 = a.Field2775;
        this.Field2776 = a.Field2776;
        this.Field2777 = a.Field2777;
    }

    public float Method21(Class590 a) {
        return (float)Math.acos((double)(this.Method22(a) / (this.Method24() * a.Method24())));
    }

    public float Method22(Class590 a) {
        return a.Field2775 * this.Field2775 + a.Field2776 * this.Field2776 + a.Field2777 * this.Field2777;
    }

    public void Method23(Class590 a, Class590 a2) {
        this.Field2775 = a.Field2776 * a2.Field2777 - a.Field2777 * a2.Field2776;
        this.Field2776 = a.Field2777 * a2.Field2775 - a.Field2775 * a2.Field2777;
        this.Field2777 = a.Field2775 * a2.Field2776 - a.Field2776 * a2.Field2775;
    }

    public float Method24() {
        return (float)Math.sqrt((double)(this.Field2775 * this.Field2775 + this.Field2776 * this.Field2776 + this.Field2777 * this.Field2777));
    }

    public void Method25() {
        float a = 1.0f / (float)Math.sqrt((double)(this.Field2775 * this.Field2775 + this.Field2776 * this.Field2776 + this.Field2777 * this.Field2777));
        this.Field2775 *= a;
        this.Field2776 *= a;
        this.Field2777 *= a;
    }
}