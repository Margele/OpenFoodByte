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
import awsl.Class798;
import java.awt.Rectangle;

public class Class855
extends Class798 {
    private short Method3529(short a, short a2, short a3) {
        if (a < a2) {
            a = (short)(a + 1);
        }
        if (a < a3) {
            a = (short)(a + 1);
        }
        if (a > a2) {
            a = (short)(a - 1);
        }
        if (a > a3) {
            a = (short)(a - 1);
        }
        return a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int a5;
        int a6 = 0;
        short[][] a7 = new short[3][a];
        short[][] a8 = new short[3][a];
        short[][] sArray = new short[3][a];
        boolean a9 = Class193.Method1269();
        int[] a10 = new int[a * a2];
        int a11 = 0;
        if (a11 < a) {
            a5 = a3[a11];
            a7[1][a11] = (short)(a5 >> 16 & 0xFF);
            a8[1][a11] = (short)(a5 >> 8 & 0xFF);
            a12[1][a11] = (short)(a5 & 0xFF);
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
                a7[2][a14] = (short)(a13 >> 16 & 0xFF);
                a8[2][a14] = (short)(a13 >> 8 & 0xFF);
                a12[2][a14] = (short)(a13 & 0xFF);
                ++a14;
            }
            if ((a14 = 0) < a) {
                a13 = a14 < a - 1 ? 1 : 0;
                short a16 = a7[1][a14];
                short a17 = a8[1][a14];
                short a18 = a12[1][a14];
                int a19 = a14 - 1;
                int a20 = a14 + 1;
                a16 = this.Method3529(a16, a7[0][a14], a7[2][a14]);
                a17 = this.Method3529(a17, a8[0][a14], a8[2][a14]);
                a18 = this.Method3529(a18, (short)a12[0][a14], (short)a12[2][a14]);
                a16 = this.Method3529(a16, a7[1][a19], a7[1][a20]);
                a17 = this.Method3529(a17, a8[1][a19], a8[1][a20]);
                a18 = this.Method3529(a18, (short)a12[1][a19], (short)a12[1][a20]);
                a16 = this.Method3529(a16, a7[0][a19], a7[2][a20]);
                a17 = this.Method3529(a17, a8[0][a19], a8[2][a20]);
                a18 = this.Method3529(a18, (short)a12[0][a19], (short)a12[2][a20]);
                a16 = this.Method3529(a16, a7[2][a19], a7[0][a20]);
                a17 = this.Method3529(a17, a8[2][a19], a8[0][a20]);
                a18 = this.Method3529(a18, (short)a12[2][a19], (short)a12[0][a20]);
                a10[a6] = a3[a6] & 0xFF000000 | a16 << 16 | a17 << 8 | a18;
                ++a6;
                ++a14;
            }
            short[] a22 = a7[0];
            a7[0] = a7[1];
            a7[1] = a7[2];
            a7[2] = a22;
            a22 = a8[0];
            a8[0] = a8[1];
            a8[1] = a8[2];
            a8[2] = a22;
            a22 = a12[0];
            a12[0] = a12[1];
            a12[1] = a12[2];
            a12[2] = a22;
            ++a11;
        }
        return a10;
    }

    public String toString() {
        return "Blur/Despeckle...";
    }
}