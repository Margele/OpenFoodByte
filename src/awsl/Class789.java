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
import awsl.Class808;
import java.awt.Rectangle;

public class Class789
extends Class808 {
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        boolean bl = false;
        boolean a5 = Class193.Method1270();
        int[] a6 = new int[a * a2];
        int a7 = 0;
        if (a7 < a2) {
            int a8 = 0;
            if (a8 < a) {
                boolean a9 = false;
                boolean a10 = false;
                boolean a11 = false;
                int a12 = a3[a7 * a + a8];
                int a13 = a12 & 0xFF000000;
                int a14 = 0;
                int a15 = -1;
                if (a15 <= 1) {
                    int a16 = a7 + a15;
                    if (0 <= a16 && a16 < a2) {
                        int a17 = a16 * a;
                        int a18 = -1;
                        if (a18 <= 1) {
                            int a19;
                            int a20 = a8 + a18;
                            if (0 <= a20 && a20 < a && this.Field3618.Method3494(a19 = a3[a17 + a20])) {
                                ++a14;
                            }
                            ++a18;
                        }
                    }
                    ++a15;
                }
                if (this.Field3618.Method3494(a12)) {
                    a6[a++] = a14 == 2 || a14 == 3 ? a12 : -1;
                }
                a6[a++] = a14 == 3 ? -16777216 : a12;
                ++a8;
            }
            ++a7;
        }
        return a6;
    }

    public String toString() {
        return "Binary/Life";
    }
}