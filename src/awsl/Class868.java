/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class877;
import java.awt.image.BufferedImage;

public class Class868
extends Class877 {
    private float Field3793 = 1.0f;
    private BufferedImage Field3794 = null;
    private int[] Field3795;
    private int[] Field3796;
    private int Field3797;
    private int Field3798;

    public void Method1271(BufferedImage a) {
        this.Field3794 = a;
    }

    public BufferedImage Method1272() {
        return this.Field3794;
    }

    public void Method56(float a) {
        this.Field3793 = a;
    }

    public float Method57() {
        return this.Field3793;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int n = a.getWidth();
        boolean a8 = Class193.Method1270();
        int a9 = a.getHeight();
        BufferedImage a10 = this.Field3794 != null ? this.Field3794 : a;
        this.Field3797 = a10.getWidth();
        this.Field3798 = a10.getHeight();
        int[] a11 = new int[this.Field3797 * this.Field3798];
        this.Method104(a10, 0, 0, this.Field3797, this.Field3798, a11);
        this.Field3795 = new int[this.Field3797 * this.Field3798];
        this.Field3796 = new int[this.Field3797 * this.Field3798];
        int a12 = 0;
        int a13 = 0;
        if (a13 < this.Field3798) {
            a7 = 0;
            if (a7 < this.Field3797) {
                a6 = a11[a12];
                a5 = a6 >> 16 & 0xFF;
                a4 = a6 >> 8 & 0xFF;
                a3 = a6 & 0xFF;
                a11[a12] = (a5 + a4 + a3) / 8;
                ++a12;
                ++a7;
            }
            ++a13;
        }
        a12 = 0;
        a13 = 0;
        if (a13 < this.Field3798) {
            a7 = (a13 + this.Field3798 - 1) % this.Field3798 * this.Field3797;
            a6 = a13 * this.Field3797;
            a5 = (a13 + 1) % this.Field3798 * this.Field3797;
            a4 = 0;
            if (a4 < this.Field3797) {
                a3 = (a4 + this.Field3797 - 1) % this.Field3797;
                int a14 = a4;
                int a15 = (a4 + 1) % this.Field3797;
                this.Field3795[a12] = a11[a3 + a7] + a11[a3 + a6] + a11[a3 + a5] - a11[a15 + a7] - a11[a15 + a6] - a11[a15 + a5];
                this.Field3796[a12] = a11[a3 + a5] + a11[a14 + a5] + a11[a15 + a5] - a11[a3 + a7] - a11[a14 + a7] - a11[a15 + a7];
                ++a12;
                ++a4;
            }
            ++a13;
        }
        a11 = null;
        a2 = super.Method62(a, a2);
        this.Field3796 = null;
        this.Field3795 = null;
        return a2;
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float a4 = a;
        float a5 = a2;
        int a6 = a2 % this.Field3798 * this.Field3797 + a % this.Field3797;
        a3[0] = (float)a + this.Field3793 * (float)this.Field3795[a6];
        a3[1] = (float)a2 + this.Field3793 * (float)this.Field3796[a6];
    }

    public String toString() {
        return "Distort/Displace...";
    }
}