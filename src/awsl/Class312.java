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

import awsl.Class314;
import awsl.Class321;
import awsl.Class661;
import obfuscate.a;

public class Class312
extends Class321 {
    float Field1599;
    float Field1600;
    boolean Field1601;

    public Class312(int a, double a2, float a3, float a4, boolean a5) {
        super(a, a2);
        this.Field1599 = a3;
        this.Field1600 = a4;
        this.Field1601 = a5;
    }

    public Class312(int a, double a2, float a3, float a4, boolean a5, Class661 a6) {
        super(a, a2, a6);
        this.Field1599 = a3;
        this.Field1600 = a4;
        this.Field1601 = a5;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected double Method797(double a2) {
        void a3;
        double a4 = Math.pow((double)(a2 / (double)this.Field1605), (double)this.Field1600);
        double d = this.Field1599 * 0.1f;
        String[] a5 = Class314.Method833();
        double d2 = Math.pow((double)2.0, (double)(-10.0 * (this.Field1601 ? Math.sqrt((double)a4) : a4))) * Math.sin((double)((a4 - a3 / 4.0) * (Math.PI * 2 / a3))) + 1.0;
        a.trash(new String[2]);
        return d2;
    }
}