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

public class Class821
extends Class798 {
    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        void a5;
        void a6;
        int a7 = 0;
        int[] nArray = new int[a * a2];
        boolean bl = false;
        boolean a8 = Class193.Method1269();
        if (a6 < a2) {
            int a9 = 0;
            if (a9 < a) {
                int a10 = -1;
                int a11 = -1;
                if (a11 <= 1) {
                    void a12 = a6 + a11;
                    if (false <= a12 && a12 < a2) {
                        void a13 = a12 * a;
                        int a14 = -1;
                        if (a14 <= 1) {
                            int a15 = a9 + a14;
                            if (0 <= a15 && a15 < a) {
                                a10 = Class767.Method1691(a10, a3[a13 + a15], 2);
                            }
                            ++a14;
                        }
                    }
                    ++a11;
                }
                a5[a7++] = a10;
                ++a9;
            }
            ++a6;
        }
        return a5;
    }

    public String toString() {
        return "Blur/Minimum";
    }
}