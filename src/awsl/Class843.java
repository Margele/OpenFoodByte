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
import awsl.Class745;
import awsl.Class798;
import java.awt.Rectangle;

public class Class843
extends Class798 {
    private int[][] Field3731;

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
            this.Field3731 = new int[3][256];
            a5 = 0;
            if (a5 < 3) {
                this.Field3731[a5][0] = a6.Method1547(a5, 0);
                int a9 = 1;
                if (a9 < 256) {
                    this.Field3731[a5][a9] = this.Field3731[a5][a9 - 1] + a6.Method1547(a5, a9);
                    ++a9;
                }
                if ((a9 = 0) < 256) {
                    this.Field3731[a5][a9] = Math.round((float)((float)this.Field3731[a5][a9] * a8));
                    ++a9;
                }
                ++a5;
            }
        }
        this.Field3731 = null;
        a5 = 0;
        int a10 = 0;
        if (a10 < a2) {
            int a11 = 0;
            if (a11 < a) {
                a3[a5] = this.Method3(a11, a10, a3[a5]);
                ++a5;
                ++a11;
            }
            ++a10;
        }
        this.Field3731 = null;
        return a3;
    }

    private int Method3(int a, int a2, int a3) {
        if (this.Field3731 != null) {
            int a4 = a3 & 0xFF000000;
            int a5 = this.Field3731[0][a3 >> 16 & 0xFF];
            int a6 = this.Field3731[1][a3 >> 8 & 0xFF];
            int a7 = this.Field3731[2][a3 & 0xFF];
            return a4 | a5 << 16 | a6 << 8 | a7;
        }
        return a3;
    }

    public String toString() {
        return "Colors/Equalize";
    }
}