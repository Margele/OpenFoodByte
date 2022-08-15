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

public class Class791
extends Class808 {
    private int Field3555 = 2;

    public Class791() {
        this.Field3617 = -1;
    }

    public void Method13(int a) {
        this.Field3555 = a;
    }

    public int Method14() {
        return this.Field3555;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int[] a5;
        int[] nArray = new int[a * a2];
        boolean a6 = Class193.Method1269();
        int a7 = 0;
        if (a7 < this.Field3619) {
            int a8 = 0;
            int[] a9 = a3;
            a3 = a5;
            a5 = a9;
            int a22 = 0;
            if (a22 < a2) {
                int a10 = 0;
                if (a10 < a) {
                    int a11 = a3[a22 * a + a10];
                    if (this.Field3618.Method3494(a11)) {
                        int a12 = 0;
                        int a13 = -1;
                        if (a13 <= 1) {
                            int a14 = a22 + a13;
                            if (0 <= a14 && a14 < a2) {
                                int a15 = a14 * a;
                                int a16 = -1;
                                if (a16 <= 1) {
                                    int a17;
                                    int a18 = a10 + a16;
                                    if (0 <= a18 && a18 < a && !this.Field3618.Method3494(a17 = a3[a15 + a18])) {
                                        ++a12;
                                    }
                                    ++a16;
                                }
                            }
                            ++a13;
                        }
                        if (a12 >= this.Field3555) {
                            if (this.Field3620 != null) {
                                a11 = this.Field3620.Method283((float)a7 / (float)this.Field3619);
                            }
                            a11 = this.Field3617;
                        }
                    }
                    a5[a8++] = a11;
                    ++a10;
                }
                ++a22;
            }
            ++a7;
        }
        return a5;
    }

    public String toString() {
        return "Binary/Erode...";
    }
}