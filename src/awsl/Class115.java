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

import awsl.Class119;
import awsl.Class193;
import awsl.Class776;

public class Class115
extends Class119 {
    private int Field901;
    private int Field902;
    private float Field903 = 0.0f;
    private float Field904 = 1.0f;
    private float Field905 = 10.0f;
    private int Field906;
    private boolean Field907;
    private float Field908 = 1.0f;
    private float Field909 = 0.0f;
    private float Field910 = 0.0f;
    private float Field911 = 1.0f;

    public void Method56(float a) {
        this.Field903 = a;
        float a2 = (float)Math.cos((double)a);
        float a3 = (float)Math.sin((double)a);
        this.Field908 = a2;
        this.Field909 = a3;
        this.Field910 = -a3;
        this.Field911 = a2;
    }

    public float Method57() {
        return this.Field903;
    }

    public void Method9(int a) {
        this.Field906 = a;
    }

    public int Method10() {
        return this.Field906;
    }

    public void Method58(float a) {
        this.Field904 = a;
    }

    public float Method59() {
        return this.Field904;
    }

    public void Method60(float a) {
        this.Field905 = a;
    }

    public float Method61() {
        return this.Field905;
    }

    public void Method87(boolean a) {
        this.Field907 = a;
    }

    public boolean Method88() {
        return this.Field907;
    }

    @Override
    public void Method17(int a, int a2) {
        this.Field901 = a;
        this.Field902 = a2;
        super.Method17(a, a2);
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        float a4;
        float f = this.Field908 * (float)a + this.Field909 * (float)a2;
        boolean a5 = Class193.Method1270();
        float a6 = this.Field910 * (float)a + this.Field911 * (float)a2;
        if (this.Field906 == 2) {
            a4 = (float)Math.sqrt((double)((double)(a4 * a4 + a6 * a6)));
        }
        if (this.Field906 == 3) {
            a4 = Class776.Method1714(a4, 16.0f);
        }
        if (this.Field906 == 4) {
            a4 = this.Method20(a4, 16.0f);
        }
        int a7 = (int)(Class776.Method1708(this.Field904, this.Field904 + this.Field905, a4) * 255.0f);
        if (this.Field907) {
            a7 = 255 - a7;
        }
        return a7 << 24 | a3 & 0xFFFFFF;
    }

    public float Method20(float a, float a2) {
        if ((a = Class776.Method1714(a, 2.0f * a2)) > a2) {
            return 2.0f * a2 - a;
        }
        return a;
    }

    public String toString() {
        return "Fade...";
    }
}