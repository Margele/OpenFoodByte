/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Date
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import awsl.Class755;
import awsl.Class771;
import awsl.Class798;
import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class761
extends Class798 {
    private Random Field3333;
    private long Field3334 = 567L;
    private int Field3335 = 25000;
    private float Field3336 = -0.59f;
    private float Field3337 = 0.2f;
    private float Field3338 = 0.1f;
    private float Field3339 = 0.0f;
    private int Field3340 = 0;
    private Class755 Field3341 = new Class771();

    public Class761() {
        this.Field3333 = new Random();
    }

    public void Method89() {
        this.Field3334 = new Date().getTime();
        this.Field3333.setSeed(this.Field3334);
        this.Field3336 = this.Field3333.nextFloat();
        this.Field3337 = this.Field3333.nextFloat();
        this.Field3338 = this.Field3333.nextFloat();
        this.Field3339 = this.Field3333.nextFloat();
        this.Field3340 = this.Field3333.nextInt() % 20 - 10;
    }

    public void Method9(int a) {
        this.Field3335 = a;
    }

    public int Method10() {
        return this.Field3335;
    }

    public void Method56(float a) {
        this.Field3336 = a;
    }

    public float Method57() {
        return this.Field3336;
    }

    public void Method58(float a) {
        this.Field3337 = a;
    }

    public float Method59() {
        return this.Field3337;
    }

    public void Method60(float a) {
        this.Field3338 = a;
    }

    public float Method61() {
        return this.Field3338;
    }

    public void Method164(float a) {
        this.Field3339 = a;
    }

    public float Method165() {
        return this.Field3339;
    }

    public void Method11(int a) {
        this.Field3340 = a;
    }

    public int Method12() {
        return this.Field3340;
    }

    public void Method176(Class755 a) {
        this.Field3341 = a;
    }

    public Class755 Method177() {
        return this.Field3341;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        float a5;
        float a6;
        float a7;
        float a8;
        float a9;
        int[] a10 = new int[a * a2];
        boolean bl = false;
        int a11 = 0;
        float a12 = 0.1f;
        float f = 0.3f;
        boolean a13 = Class193.Method1269();
        int a14 = 0;
        if (a14 < 20) {
            a9 = (float)Math.PI * a12;
            a7 = (float)Math.PI * a8;
            a6 = (float)Math.sin((double)(2.0f * a9));
            a5 = (float)Math.sin((double)(2.0f * a7));
            float a15 = (float)((double)(this.Field3336 * a6) + (double)(this.Field3337 * a6) * Math.cos((double)(2.0f * a7)) + (double)this.Field3338 * Math.sin((double)(4.0f * a9)) + (double)this.Field3339 * Math.sin((double)(6.0f * a9)) * Math.cos((double)(4.0f * a7)) + (double)((float)this.Field3340 * a12));
            a15 = a15 >= 0.0f ? a15 - (float)((int)a15) : a15 - (float)((int)a15) + 1.0f;
            float a16 = (float)((double)(this.Field3336 * a5) + (double)(this.Field3337 * a5) * Math.cos((double)(2.0f * a9)) + (double)this.Field3338 * Math.sin((double)(4.0f * a7)) + (double)this.Field3339 * Math.sin((double)(6.0f * a7)) * Math.cos((double)(4.0f * a9)) + (double)((float)this.Field3340 * a8));
            a16 = a16 >= 0.0f ? a16 - (float)((int)a16) : a16 - (float)((int)a16) + 1.0f;
            a12 = a15;
            a8 = a16;
            ++a14;
        }
        if ((a14 = 0) < this.Field3335) {
            a9 = (float)Math.PI * a12;
            a7 = (float)Math.PI * a8;
            a6 = (float)((double)this.Field3336 * Math.sin((double)(2.0f * a9)) + (double)this.Field3337 * Math.sin((double)(2.0f * a9)) * Math.cos((double)(2.0f * a7)) + (double)this.Field3338 * Math.sin((double)(4.0f * a9)) + (double)this.Field3339 * Math.sin((double)(6.0f * a9)) * Math.cos((double)(4.0f * a7)) + (double)((float)this.Field3340 * a12));
            a6 = a6 >= 0.0f ? a6 - (float)((int)a6) : a6 - (float)((int)a6) + 1.0f;
            a5 = (float)((double)this.Field3336 * Math.sin((double)(2.0f * a7)) + (double)this.Field3337 * Math.sin((double)(2.0f * a7)) * Math.cos((double)(2.0f * a9)) + (double)this.Field3338 * Math.sin((double)(4.0f * a7)) + (double)this.Field3339 * Math.sin((double)(6.0f * a7)) * Math.cos((double)(4.0f * a9)) + (double)((float)this.Field3340 * a8));
            a5 = a5 >= 0.0f ? a5 - (float)((int)a5) : a5 - (float)((int)a5) + 1.0f;
            a12 = a6;
            a8 = a5;
            int a17 = (int)((float)a * a12);
            int a18 = (int)((float)a2 * a8);
            if (a17 < a) {
                if (a18 < a2) {
                    int n = a * a18 + a17;
                    int n2 = a10[n];
                    a10[n] = n2 + 1;
                    int a19 = n2;
                    if (a19 > a11) {
                        a11 = a19;
                    }
                }
            }
            ++a14;
        }
        if (this.Field3341 != null) {
            a14 = 0;
            a8 = 0.0f;
            if (a8 < (float)a2) {
                a12 = 0.0f;
                if (a12 < (float)a) {
                    a10[a14] = this.Field3341.Method283((float)a10[a14] / (float)a11);
                    ++a14;
                    a12 += 1.0f;
                }
                a8 += 1.0f;
            }
        }
        return a10;
    }

    public String toString() {
        return "Texture/Chaotic Quilt...";
    }
}