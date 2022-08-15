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

public class Class785
extends Class781 {
    private float Field3536 = 0.4f;
    private boolean Field3537 = false;
    private int Field3538 = -16777216;
    private float Field3539 = 0.1f;

    public Class785() {
        this.Method56(16.0f);
        this.Method868(0.0f);
    }

    public void Method927(float a) {
        this.Field3536 = a;
    }

    public float Method928() {
        return this.Field3536;
    }

    public void Method87(boolean a) {
        this.Field3537 = a;
    }

    public boolean Method88() {
        return this.Field3537;
    }

    public void Method11(int a) {
        this.Field3538 = a;
    }

    public int Method12() {
        return this.Field3538;
    }

    public void Method929(float a) {
        this.Field3539 = a;
    }

    public float Method930() {
        return this.Field3539;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int Method877(int a, int a2, int[] a3, int a4, int a5) {
        void a6;
        float a7 = this.Field3497 * (float)a + this.Field3498 * (float)a2;
        float a8 = this.Field3499 * (float)a + this.Field3500 * (float)a2;
        a7 /= this.Field3484;
        a8 /= this.Field3484 * this.Field3485;
        float a9 = this.Method20(a7 += 1000.0f, a8 += 1000.0f);
        float f = this.Field3501[0].Field3278;
        boolean a10 = Class193.Method1270();
        int a11 = Class776.Method1712((int)((this.Field3501[0].Field3272 - 1000.0f) * this.Field3484), 0, a4 - 1);
        int a12 = Class776.Method1712((int)((this.Field3501[0].Field3273 - 1000.0f) * this.Field3484), 0, a5 - 1);
        int a13 = a3[a12 * a4 + a11];
        if (this.Field3537) {
            float a14 = this.Field3501[1].Field3278;
            a11 = Class776.Method1712((int)((this.Field3501[1].Field3272 - 1000.0f) * this.Field3484), 0, a4 - 1);
            a12 = Class776.Method1712((int)((this.Field3501[1].Field3273 - 1000.0f) * this.Field3484), 0, a5 - 1);
            int a15 = a3[a12 * a4 + a11];
            a13 = Class776.Method1719(0.5f * a6 / a14, a13, a15);
        }
        a9 = 1.0f - Class776.Method1708(this.Field3536, this.Field3536 + this.Field3539, (float)a6);
        a13 = Class776.Method1719(a9, this.Field3538, a13);
        return a13;
    }

    @Override
    public String toString() {
        return "Pixellate/Pointillize...";
    }
}