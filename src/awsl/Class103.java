/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.geom.Point2D
 *  java.awt.geom.Point2D$Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import awsl.Class598;
import awsl.Class776;
import java.awt.geom.Point2D;

public class Class103
extends Class119 {
    private int Field830 = 50;
    private float Field831;
    private float Field832 = 1.0f;
    private float Field833 = 0.2f;
    private float Field834 = 0.1f;
    private int Field835 = -1;
    private int Field836;
    private int Field837;
    private float Field838 = 0.5f;
    private float Field839 = 0.5f;
    private float Field840 = 1.6f;
    private float Field841 = 0.03f;
    private float Field842 = 0.006f;
    private float Field843 = 0.5f;
    private float Field844 = 6.0f;
    private float Field845;
    private float Field846;
    private float Field847;

    public Class103() {
        this.Method166(50.0f);
    }

    public void Method9(int a) {
        this.Field835 = a;
    }

    public int Method10() {
        return this.Field835;
    }

    public void Method56(float a) {
        this.Field840 = a;
    }

    public float Method57() {
        return this.Field840;
    }

    public void Method58(float a) {
        this.Field832 = a;
    }

    public float Method59() {
        return this.Field832;
    }

    public void Method60(float a) {
        this.Field833 = a;
    }

    public float Method61() {
        return this.Field833;
    }

    public void Method164(float a) {
        this.Field834 = a;
    }

    public float Method165() {
        return this.Field834;
    }

    public void Method330(Point2D a) {
        this.Field838 = (float)a.getX();
        this.Field839 = (float)a.getY();
    }

    public Point2D Method331() {
        return new Point2D.Float(this.Field838, this.Field839);
    }

    public void Method166(float a) {
        this.Field831 = a;
        this.Field845 = a / 3.0f;
    }

    public float Method167() {
        return this.Field831;
    }

    @Override
    public void Method17(int a, int a2) {
        this.Field836 = a;
        this.Field837 = a2;
        this.Field846 = this.Field838 * (float)a;
        this.Field847 = this.Field839 * (float)a2;
        super.Method17(a, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int Method3(int a, int a2, int a3) {
        float a4;
        void a5;
        float f = (float)a - this.Field846;
        float a6 = (float)a2 - this.Field847;
        float a7 = (float)Math.sqrt((double)((double)(a5 * a5 + a6 * a6)));
        float a8 = (float)Math.exp((double)(-a7 * a7 * this.Field842)) * this.Field843 + (float)Math.exp((double)(-a7 * this.Field841)) * (1.0f - this.Field843);
        a8 *= this.Field832;
        boolean a9 = Class193.Method1270();
        if (a7 > this.Field831 + this.Field840) {
            a8 = Class776.Method1717((a7 - (this.Field831 + this.Field840)) / this.Field844, a8, 0.0f);
        }
        if (a7 < this.Field831 - this.Field840 || a7 > this.Field831 + this.Field840) {
            a4 = 0.0f;
        }
        a4 = Math.abs((float)(a7 - this.Field831)) / this.Field840;
        a4 = 1.0f - a4 * a4 * (3.0f - 2.0f * a4);
        a8 += (a4 *= this.Field833);
        float a10 = (float)Math.atan2((double)((double)a5), (double)a6) + (float)Math.PI;
        a10 = (Class776.Method1714(a10 / (float)Math.PI * 17.0f + 1.0f + Class598.Method156(a10 * 10.0f), 1.0f) - 0.5f) * 2.0f;
        a10 = Math.abs((float)a10);
        a10 = (float)Math.pow((double)a10, (double)5.0);
        float a11 = this.Field834 * a10 / (1.0f + a7 * 0.1f);
        a8 += a11;
        a8 = Class776.Method1711(a8, 0.0f, 1.0f);
        return Class776.Method1719(a8, a3, this.Field835);
    }

    public String toString() {
        return "Stylize/Flare...";
    }
}