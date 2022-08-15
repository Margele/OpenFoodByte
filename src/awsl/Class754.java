/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;
import awsl.Class776;
import awsl.Class779;
import java.awt.image.BufferedImage;

class Class754 {
    private int Field3294;
    private int Field3295;
    private int Field3296;
    private int[] Field3297;

    public Class754(BufferedImage a) {
        int a2 = a.getWidth();
        int a3 = a.getHeight();
        int a4 = a.getType();
        this.Field3297 = Class779.Method842(a, 0, 0, a2, a3, null);
    }

    /*
     * WARNING - void declaration
     */
    public int Method1630(float a, float a2) {
        void a3;
        int a4;
        int a5;
        int a6;
        int a7;
        void a8;
        int n = (int)Math.floor((double)a);
        int a9 = (int)Math.floor((double)a2);
        float f = a - (float)a8;
        boolean a10 = Class193.Method1270();
        float a11 = a2 - (float)a9;
        if (a8 < this.Field3295 - 1) {
            if (a9 < this.Field3296 - 1) {
                int a12 = this.Field3295 * a9 + a8;
                a7 = this.Field3297[a12];
                a6 = this.Field3297[a12 + 1];
                a5 = this.Field3297[a12 + this.Field3295];
                a4 = this.Field3297[a12 + this.Field3295 + 1];
            }
        }
        a7 = this.Method1631(this.Field3297, (int)a8, a9, this.Field3295, this.Field3296);
        a6 = this.Method1631(this.Field3297, (int)(a8 + true), a9, this.Field3295, this.Field3296);
        a5 = this.Method1631(this.Field3297, (int)a8, a9 + 1, this.Field3295, this.Field3296);
        a4 = this.Method1631(this.Field3297, (int)(a8 + true), a9 + 1, this.Field3295, this.Field3296);
        return Class776.Method1720((float)a3, a11, a7, a6, a5, a4);
    }

    private final int Method1631(int[] a, int a2, int a3, int a4, int a5) {
        block7: {
            block6: {
                if (a2 >= a4) break block6;
                if (a3 < a5) break block7;
            }
            switch (this.Field3294) {
                default: {
                    return 0;
                }
                case 2: {
                    return a[Class776.Method1715(a3, a5) * a4 + Class776.Method1715(a2, a4)];
                }
                case 1: 
            }
            return a[Class776.Method1712(a3, 0, a5 - 1) * a4 + Class776.Method1712(a2, 0, a4 - 1)];
        }
        return a[a3 * a4 + a2];
    }
}