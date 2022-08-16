/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class349 {
    private double Field1677 = 0.1;
    private double Field1678;
    private double Field1679;

    public Class349() {
    }

    public Class349(double a) {
        this.Field1677 = a;
    }

    public void Method4(boolean a) {
        float a2 = (float)((double)GlobalModule.Field3185 * this.Field1677);
        this.Field1679 = this.Field1679 + (double)a2 < 1.0 ? (this.Field1679 += (double)a2) : 1.0;
        this.Field1678 = this.Field1679;
    }

    /*
     * WARNING - void declaration
     */
    public double Method5(double a) {
        void a2;
        float f = (float)((double)GlobalModule.Field3185 * this.Field1677);
        int[] a3 = RenderUtils.trash();
        if (this.Field1679 < a) {
            if (this.Field1679 + (double)a2 < a) {
                this.Field1679 += (double)a2;
            }
            this.Field1679 = a;
        }
        if (this.Field1679 - (double)a2 > a) {
            this.Field1679 -= (double)a2;
        }
        this.Field1679 = a;
        return this.Field1679;
    }

    public double Method6() {
        return this.Field1678;
    }

    public void Method7(double a) {
        this.Field1677 = a;
    }

    public void Method8(double a) {
        this.Field1679 = a;
    }
}