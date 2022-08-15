/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class599;

public class Class603
extends Class599 {
    public Class603() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class603(float[] a) {
        this.Field2813 = a[0];
        this.Field2814 = a[1];
        this.Field2815 = a[2];
        this.Field2816 = a[2];
    }

    public Class603(float a, float a2, float a3, float a4) {
        this.Field2813 = a;
        this.Field2814 = a2;
        this.Field2815 = a3;
        this.Field2816 = a4;
    }

    public Class603(Class603 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public Class603(Class599 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public float Method3688(Class603 a) {
        return a.Field2813 * this.Field2813 + a.Field2814 * this.Field2814 + a.Field2815 * this.Field2815 + a.Field2816 * this.Field2816;
    }

    public float Method3689() {
        return (float)Math.sqrt((double)(this.Field2813 * this.Field2813 + this.Field2814 * this.Field2814 + this.Field2815 * this.Field2815 + this.Field2816 * this.Field2816));
    }

    public void Method3690() {
        float a = 1.0f / (this.Field2813 * this.Field2813 + this.Field2814 * this.Field2814 + this.Field2815 * this.Field2815 + this.Field2816 * this.Field2816);
        this.Field2813 *= a;
        this.Field2814 *= a;
        this.Field2815 *= a;
        this.Field2816 *= a;
    }
}