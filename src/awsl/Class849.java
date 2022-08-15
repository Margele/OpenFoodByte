/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class745;
import awsl.Class767;
import awsl.Class798;
import java.awt.Rectangle;

public class Class849
extends Class798 {
    private int[][] Field3741;
    private float Field3742 = 0.0f;
    private float Field3743 = 1.0f;
    private float Field3744 = 0.0f;
    private float Field3745 = 1.0f;

    public void Method56(float a) {
        this.Field3742 = a;
    }

    public float Method57() {
        return this.Field3742;
    }

    public void Method58(float a) {
        this.Field3743 = a;
    }

    public float Method59() {
        return this.Field3743;
    }

    public void Method60(float a) {
        this.Field3744 = a;
    }

    public float Method61() {
        return this.Field3744;
    }

    public void Method164(float a) {
        this.Field3745 = a;
    }

    public float Method165() {
        return this.Field3745;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5;
        void a6;
        Class745 class745 = new Class745(a3, a, a2, 0, a);
        boolean a7 = Class193.Method1269();
        if (a6.Method1545() > 0) {
            float a8 = 255.0f / (float)a6.Method1545();
            this.Field3741 = new int[3][256];
            float a9 = this.Field3742 * 255.0f;
            float a10 = this.Field3743 * 255.0f;
            if (a9 == a10) {
                a10 += 1.0f;
            }
            if ((a5 = 0) < 3) {
                int a11 = 0;
                if (a11 < 256) {
                    this.Field3741[a5][a11] = Class767.Method1687((int)(255.0f * (this.Field3744 + (this.Field3745 - this.Field3744) * ((float)a11 - a9) / (a10 - a9))));
                    ++a11;
                }
                ++a5;
            }
        }
        this.Field3741 = null;
        a5 = 0;
        int a12 = 0;
        if (a12 < a2) {
            int a13 = 0;
            if (a13 < a) {
                a3[a5] = this.Method3(a13, a12, a3[a5]);
                ++a5;
                ++a13;
            }
            ++a12;
        }
        this.Field3741 = null;
        return a3;
    }

    public int Method3(int a, int a2, int a3) {
        if (this.Field3741 != null) {
            int a4 = a3 & 0xFF000000;
            int a5 = this.Field3741[0][a3 >> 16 & 0xFF];
            int a6 = this.Field3741[1][a3 >> 8 & 0xFF];
            int a7 = this.Field3741[2][a3 & 0xFF];
            return a4 | a5 << 16 | a6 << 8 | a7;
        }
        return a3;
    }

    public String toString() {
        return "Colors/Levels...";
    }
}