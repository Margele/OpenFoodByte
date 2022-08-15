/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import awsl.Class776;
import java.util.Random;

public class Class1
extends Class119 {
    private int Field6 = 50;
    private int Field7 = 25;
    private int Field8 = 50;
    private int Field9 = -1;
    private int Field10 = 25;
    private int Field11;
    private int Field12;
    private int Field13;
    private int Field14;
    private long Field15 = 371L;
    private float[] Field16;
    private Random Field17 = new Random();

    public void Method9(int a) {
        this.Field9 = a;
    }

    public int Method10() {
        return this.Field9;
    }

    public void Method11(int a) {
        this.Field10 = a;
    }

    public int Method12() {
        return this.Field10;
    }

    public void Method13(int a) {
        this.Field8 = a;
    }

    public int Method14() {
        return this.Field8;
    }

    public void Method15(int a) {
        this.Field6 = a;
    }

    public int Method16() {
        return this.Field6;
    }

    public void Method498(int a) {
        this.Field7 = a;
    }

    public int Method499() {
        return this.Field7;
    }

    @Override
    public void Method17(int a, int a2) {
        this.Field11 = a;
        this.Field12 = a2;
        this.Field13 = a / 2;
        boolean a3 = Class193.Method1270();
        this.Field14 = a2 / 2;
        super.Method17(a, a2);
        this.Field17.setSeed(this.Field15);
        this.Field16 = new float[this.Field6];
        int a4 = 0;
        if (a4 < this.Field6) {
            this.Field16[a4] = (float)this.Field7 + (float)this.Field10 / 100.0f * (float)this.Field7 * (float)this.Field17.nextGaussian();
            ++a4;
        }
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        float a4 = a - this.Field13;
        float a5 = a2 - this.Field14;
        float a6 = a4 * a4 + a5 * a5;
        float a7 = (float)Math.atan2((double)a5, (double)a4);
        float a8 = (a7 + (float)Math.PI) / ((float)Math.PI * 2) * (float)this.Field6;
        int a9 = (int)a8;
        float a10 = a8 - (float)a9;
        if (this.Field7 != 0) {
            float a11 = Class776.Method1717(a10, this.Field16[a9 % this.Field6], this.Field16[(a9 + 1) % this.Field6]);
            float a12 = a11 * a11 / (a6 + 1.0E-4f);
            a12 = (float)Math.pow((double)a12, (double)((double)(100 - this.Field8) / 50.0));
            a10 -= 0.5f;
            a10 = 1.0f - a10 * a10;
            a10 *= a12;
        }
        a10 = Class776.Method1711(a10, 0.0f, 1.0f);
        return Class776.Method1719(a10, a3, this.Field9);
    }

    public String toString() {
        return "Stylize/Sparkle...";
    }
}