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

public class Class795
extends Class808 {
    public Class795() {
        this.Field3617 = -1;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        boolean bl = false;
        boolean a5 = Class193.Method1269();
        int[] a6 = new int[a * a2];
        int a7 = 0;
        if (a7 < a2) {
            int a8 = 0;
            if (a8 < a) {
                int a9 = a3[a7 * a + a8];
                if (this.Field3618.Method3494(a9)) {
                    int a10 = 0;
                    int a11 = -1;
                    if (a11 <= 1) {
                        int a12 = a7 + a11;
                        if (0 <= a12 && a12 < a2) {
                            int a13 = a12 * a;
                            int a14 = -1;
                            if (a14 <= 1) {
                                int a15 = a8 + a14;
                                if (0 <= a15 && a15 < a) {
                                    int a16 = a3[a13 + a15];
                                    if (this.Field3618.Method3494(a16)) {
                                        ++a10;
                                    }
                                }
                                ++a10;
                                ++a14;
                            }
                        }
                        ++a11;
                    }
                    if (a10 == 9) {
                        a9 = this.Field3617;
                    }
                }
                a6[a++] = a9;
                ++a8;
            }
            ++a7;
        }
        return a6;
    }

    public String toString() {
        return "Binary/Outline...";
    }
}