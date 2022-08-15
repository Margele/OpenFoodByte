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

public class Class852
extends Class798 {
    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        void a5;
        boolean bl = false;
        int[] nArray = new int[a * a2];
        boolean a6 = Class193.Method1269();
        int a7 = 0;
        if (a7 < a2) {
            int a8 = 0;
            if (a8 < a) {
                int a9 = a3[a7 * a + a8];
                if (a9 != -16777216) {
                    int a10 = 0;
                    if (a3[a7 * a + a8 - 1] == -16777216) {
                        ++a10;
                    }
                    if (a3[(a7 - 1) * a + a8] == -16777216) {
                        ++a10;
                    }
                    if (a3[(a7 - 1) * a + a8 - 1] == -16777216) {
                        ++a10;
                    }
                    if (a10 >= 2) {
                        a9 = -1;
                    }
                }
                a5[a++] = a9;
                ++a8;
            }
            ++a7;
        }
        return a5;
    }

    public String toString() {
        return "Stylize/Flush 3D...";
    }
}