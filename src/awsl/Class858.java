/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class767;
import awsl.Class798;
import java.awt.Rectangle;

public class Class858
extends Class798 {
    private float Field3752 = 5.0f;
    private float Field3753 = 1.0f;
    private float Field3754 = 0.0f;
    private int Field3755 = -16777216;

    public void Method56(float a) {
        this.Field3752 = a;
    }

    public float Method57() {
        return this.Field3752;
    }

    public void Method58(float a) {
        this.Field3753 = a;
    }

    public float Method59() {
        return this.Field3753;
    }

    public void Method60(float a) {
        this.Field3754 = a;
    }

    public float Method61() {
        return this.Field3754;
    }

    public void Method9(int a) {
        this.Field3755 = a;
    }

    public int Method10() {
        return this.Field3755;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5;
        int a6 = 0;
        short[][] sArray = new short[3][a];
        boolean a7 = Class193.Method1270();
        int[] a8 = new int[a * a2];
        short[] a9 = new short[256];
        int a10 = (int)(this.Field3754 * 256.0f / this.Field3752);
        int a11 = 0;
        if (a11 < 256) {
            a9[a11] = (short)Class767.Method1687((int)(255.0 * Math.floor((double)(this.Field3752 * (float)(a11 + a10) / 256.0f)) / (double)(this.Field3752 - 1.0f) - (double)a10));
            ++a11;
        }
        if ((a11 = 0) < a) {
            a5 = a3[a11];
            a12[1][a11] = (short)Class767.Method1689(a5);
            ++a11;
        }
        if ((a11 = 0) < a2) {
            void a12;
            int a13;
            int a14;
            a5 = a11 < a2 - 1 ? 1 : 0;
            int a15 = a6 + a;
            if (a11 < a2 - 1 && (a14 = 0) < a) {
                a13 = a3[a15++];
                a12[2][a14] = (short)Class767.Method1689(a13);
                ++a14;
            }
            if ((a14 = 0) < a) {
                a13 = a14 < a - 1 ? 1 : 0;
                int a16 = a14 - 1;
                int a17 = a14 + 1;
                int a18 = 0;
                void a19 = a12[0][a16];
                void a20 = a12[0][a14];
                void a21 = a12[1][a16];
                void a22 = a12[1][a14];
                short a23 = a9[a19];
                short a24 = a9[a20];
                short a25 = a9[a21];
                short a26 = a9[a22];
                if ((a23 != a24 || a23 != a25 || a24 != a26 || a25 != a26) && (a18 = (int)(this.Field3753 * (float)(Math.abs((int)(a19 - a20)) + Math.abs((int)(a19 - a21)) + Math.abs((int)(a20 - a22)) + Math.abs((int)(a21 - a22))))) > 255) {
                    a18 = 255;
                }
                a8[a6] = Class767.Method1693(a3[a6], this.Field3755, 1, a18);
                a8[a6] = a3[a6];
                ++a6;
                ++a14;
            }
            void a22 = a12[0];
            a12[0] = a12[1];
            a12[1] = a12[2];
            a12[2] = a22;
            ++a11;
        }
        return a8;
    }

    public String toString() {
        return "Stylize/Contour...";
    }
}