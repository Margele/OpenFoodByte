/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class776;
import awsl.Class781;

public class Class787
extends Class781 {
    private float Field3542 = 0.4f;
    private boolean Field3543 = false;
    private int Field3544 = -16777216;

    public Class787() {
        this.Method56(16.0f);
        this.Method868(0.0f);
    }

    public void Method927(float a) {
        this.Field3542 = a;
    }

    public float Method928() {
        return this.Field3542;
    }

    public void Method87(boolean a) {
        this.Field3543 = a;
    }

    public boolean Method88() {
        return this.Field3543;
    }

    public void Method11(int a) {
        this.Field3544 = a;
    }

    public int Method12() {
        return this.Field3544;
    }

    @Override
    public int Method877(int a, int a2, int[] a3, int a4, int a5) {
        float f = this.Field3497 * (float)a + this.Field3498 * (float)a2;
        float a6 = this.Field3499 * (float)a + this.Field3500 * (float)a2;
        a /= this.Field3484;
        a6 /= this.Field3484 * this.Field3485;
        float f2 = this.Method20((float)(a += 1000.0f), a6 += 1000.0f);
        boolean a7 = Class193.Method1270();
        float a8 = this.Field3501[0].Field3278;
        float a9 = this.Field3501[1].Field3278;
        int a10 = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0f) * this.Field3484), 0, a4 - 1);
        int a11 = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0f) * this.Field3484), 0, a5 - 1);
        int a12 = a3[a11 * a4 + a10];
        float a13 = (a9 - a8) / this.Field3542;
        a13 = Class776.Method1708(0.0f, this.Field3542, a13);
        if (this.Field3543) {
            a10 = Class776.Method1712((int)((this.Field3501[1].Field3272 - 1000.0f) * this.Field3484), 0, a4 - 1);
            a11 = Class776.Method1712((int)((this.Field3501[1].Field3273 - 1000.0f) * this.Field3484), 0, a5 - 1);
            int a14 = a3[a11 * a4 + a10];
            a14 = Class776.Method1719(0.5f, a14, a12);
            a12 = Class776.Method1719(a13, a14, a12);
        }
        a12 = Class776.Method1719(a13, this.Field3544, a12);
        return a12;
    }

    @Override
    public String toString() {
        return "Pixellate/Crystallize...";
    }
}