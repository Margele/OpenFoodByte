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
import awsl.Class767;
import awsl.Class798;
import java.awt.Rectangle;

public class Class839
extends Class798 {
    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        void a5;
        int a6 = 0;
        int[] a7 = new int[a * a2];
        boolean bl = false;
        boolean a8 = Class193.Method1270();
        if (a5 < a2) {
            int a9 = 0;
            if (a9 < a) {
                int a10 = -16777216;
                int a11 = -1;
                if (a11 <= 1) {
                    void a12 = a5 + a11;
                    if (false <= a12 && a12 < a2) {
                        void a13 = a12 * a;
                        int a14 = -1;
                        if (a14 <= 1) {
                            int a15 = a9 + a14;
                            if (0 <= a15 && a15 < a) {
                                a10 = Class767.Method1691(a10, a3[a13 + a15], 3);
                            }
                            ++a14;
                        }
                    }
                    ++a11;
                }
                a7[a6++] = a10;
                ++a9;
            }
            ++a5;
        }
        return a7;
    }

    public String toString() {
        return "Blur/Maximum";
    }
}