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
import awsl.Class598;
import awsl.Class776;
import awsl.Class877;
import java.awt.Rectangle;

public class Class886
extends Class877 {
    public static final int Field3875 = 0;
    public static final int Field3876 = 1;
    public static final int Field3877 = 2;
    public static final int Field3878 = 3;
    private float Field3879 = 5.0f;
    private float Field3880 = 0.0f;
    private float Field3881 = 16.0f;
    private float Field3882 = 16.0f;
    private int Field3883;

    public void Method56(float a) {
        this.Field3879 = a;
    }

    public float Method57() {
        return this.Field3879;
    }

    public void Method58(float a) {
        this.Field3881 = a;
    }

    public float Method59() {
        return this.Field3881;
    }

    public void Method60(float a) {
        this.Field3880 = a;
    }

    public float Method61() {
        return this.Field3880;
    }

    public void Method164(float a) {
        this.Field3882 = a;
    }

    public float Method165() {
        return this.Field3882;
    }

    public void Method13(int a) {
        this.Field3883 = a;
    }

    public int Method14() {
        return this.Field3883;
    }

    @Override
    protected void Method834(Rectangle a) {
        if (this.Field3818 == 0) {
            a.x -= (int)this.Field3879;
            a.width += (int)(2.0f * this.Field3879);
            a.y -= (int)this.Field3880;
            a.height += (int)(2.0f * this.Field3880);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float a4;
        float a5;
        void a6;
        float f = (float)a2 / this.Field3881;
        boolean a7 = Class193.Method1270();
        float a8 = (float)a / this.Field3882;
        switch (this.Field3883) {
            default: {
                a5 = (float)Math.sin((double)((double)a6));
                a4 = (float)Math.sin((double)a8);
            }
            case 1: {
                a5 = Class776.Method1714((float)a6, 1.0f);
                a4 = Class776.Method1714(a8, 1.0f);
            }
            case 2: {
                a5 = Class776.Method1716((float)a6);
                a4 = Class776.Method1716(a8);
            }
            case 3: 
        }
        a5 = Class598.Method156((float)a6);
        a4 = Class598.Method156(a8);
        a3[0] = (float)a + this.Field3879 * a5;
        a3[1] = (float)a2 + this.Field3880 * a4;
    }

    public String toString() {
        return "Distort/Ripple...";
    }
}