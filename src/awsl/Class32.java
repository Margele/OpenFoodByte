/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import awsl.Class776;

public class Class32
extends Class119 {
    private float Field258 = 16.0f;
    private float Field259 = 16.0f;
    private float Field260 = 6.0f;
    private float Field261 = 6.0f;
    private int Field262 = 4;
    private int Field263 = 4;
    private int Field264 = -32640;
    private int Field265 = -8355585;
    private boolean Field266 = true;
    private boolean Field267 = false;
    private boolean Field268 = true;
    public int[][] Field269 = new int[][]{{0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}};

    public void Method56(float a) {
        this.Field260 = a;
    }

    public void Method58(float a) {
        this.Field258 = a;
    }

    public float Method57() {
        return this.Field258;
    }

    public void Method60(float a) {
        this.Field259 = a;
    }

    public float Method59() {
        return this.Field259;
    }

    public float Method61() {
        return this.Field260;
    }

    public void Method164(float a) {
        this.Field261 = a;
    }

    public float Method165() {
        return this.Field261;
    }

    public void Method3437(int[][] a) {
        this.Field269 = a;
    }

    public int[][] Method3438() {
        return this.Field269;
    }

    public void Method87(boolean a) {
        this.Field266 = a;
    }

    public boolean Method88() {
        return this.Field266;
    }

    public void Method1282(boolean a) {
        this.Field267 = a;
    }

    public boolean Method1283() {
        return this.Field267;
    }

    public void Method1770(boolean a) {
        this.Field268 = a;
    }

    public boolean Method1771() {
        return this.Field268;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4;
        int a5;
        float a6;
        float a7;
        float a8;
        float a9;
        boolean a10;
        a = (int)((float)a + (this.Field258 + this.Field260 / 2.0f));
        a2 = (int)((float)a2 + (this.Field259 + this.Field261 / 2.0f));
        boolean a11 = Class193.Method1269();
        float a12 = Class776.Method1714(a, this.Field258 + this.Field260);
        float a13 = Class776.Method1714(a2, this.Field259 + this.Field261);
        int a14 = (int)((float)a / (this.Field258 + this.Field260));
        int a15 = (int)((float)a2 / (this.Field259 + this.Field261));
        boolean a16 = a12 < this.Field258;
        boolean bl = a10 = a13 < this.Field259;
        if (this.Field267) {
            a9 = Math.abs((float)(this.Field258 / 2.0f - a12)) / this.Field258 / 2.0f;
            a8 = Math.abs((float)(this.Field259 / 2.0f - a13)) / this.Field259 / 2.0f;
        }
        a8 = 0.0f;
        a9 = 0.0f;
        if (this.Field268) {
            a7 = Class776.Method1708(this.Field258 / 2.0f, this.Field258 / 2.0f + this.Field260, Math.abs((float)(this.Field258 / 2.0f - a12)));
            a6 = Class776.Method1708(this.Field259 / 2.0f, this.Field259 / 2.0f + this.Field261, Math.abs((float)(this.Field259 / 2.0f - a13)));
        }
        a6 = 0.0f;
        a7 = 0.0f;
        if (this.Field266) {
            a4 = a5 = a3;
        }
        a4 = this.Field264;
        a5 = this.Field265;
        int a17 = a14 % this.Field263;
        int a18 = a15 % this.Field262;
        int a19 = this.Field269[a18][a17];
        int a20 = a19 == 1 ? a4 : a5;
        a20 = Class776.Method1719(2.0f * (a19 == 1 ? a9 : a8), a20, -16777216);
        if (this.Field268) {
            if (a19 != this.Field269[(a15 + 1) % this.Field262][a17]) {
                a6 = 1.0f - a6;
                a4 = Class776.Method1719(a6 *= 0.5f, a4, -16777216);
            }
            a4 = Class776.Method1719(0.5f, a4, -16777216);
        }
        a20 = Class776.Method1719(2.0f * a9, a4, -16777216);
        if (this.Field268) {
            if (a19 != this.Field269[a18][(a14 + 1) % this.Field263]) {
                if (a19 == 1) {
                    a7 = 1.0f - a7;
                }
                a5 = Class776.Method1719(a7 *= 0.5f, a5, -16777216);
            }
            if (a19 == 1) {
                a5 = Class776.Method1719(0.5f, a5, -16777216);
            }
        }
        a20 = Class776.Method1719(2.0f * a8, a5, -16777216);
        a20 = 0;
        return a20;
    }

    public String toString() {
        return "Texture/Weave...";
    }
}