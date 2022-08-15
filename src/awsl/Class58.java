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
import awsl.Class594;
import awsl.Class598;
import awsl.Class755;
import awsl.Class758;
import awsl.Class767;
import awsl.Class776;

public class Class58
extends Class119 {
    private float Field611 = 32.0f;
    private float Field612 = 1.0f;
    private float Field613 = 0.0f;
    public float Field614 = 1.0f;
    public float Field615 = 1.0f;
    public float Field616 = 0.5f;
    public float Field617 = 0.5f;
    public int Field618;
    private float Field619 = 1.0f;
    private float Field620 = 0.0f;
    private float Field621 = 0.0f;
    private float Field622 = 1.0f;
    private Class755 Field623 = new Class758();
    private Class594 Field624 = new Class598();

    public void Method56(float a) {
        this.Field614 = a;
    }

    public float Method57() {
        return this.Field614;
    }

    public void Method18(Class594 a) {
        this.Field624 = a;
    }

    public Class594 Method19() {
        return this.Field624;
    }

    public void Method9(int a) {
        this.Field618 = a;
    }

    public int Method10() {
        return this.Field618;
    }

    public void Method58(float a) {
        this.Field611 = a;
    }

    public float Method59() {
        return this.Field611;
    }

    public void Method60(float a) {
        this.Field612 = a;
    }

    public float Method61() {
        return this.Field612;
    }

    public void Method164(float a) {
        this.Field613 = a;
        float a2 = (float)Math.cos((double)a);
        float a3 = (float)Math.sin((double)a);
        this.Field619 = a2;
        this.Field620 = a3;
        this.Field621 = -a3;
        this.Field622 = a2;
    }

    public float Method165() {
        return this.Field613;
    }

    public void Method166(float a) {
        this.Field615 = a;
    }

    public float Method167() {
        return this.Field615;
    }

    public void Method176(Class755 a) {
        this.Field623 = a;
    }

    public Class755 Method177() {
        return this.Field623;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int Method3(int a, int a2, int a3) {
        int a4;
        void a5;
        float a6 = this.Field619 * (float)a + this.Field620 * (float)a2;
        float f = this.Field621 * (float)a + this.Field622 * (float)a2;
        boolean a7 = Class193.Method1270();
        float a8 = (double)this.Field615 == 1.0 ? Class598.Method157(a6, (float)a5) : Class598.Method153(a6 /= this.Field611, (float)(a5 /= this.Field611 * this.Field612), this.Field615);
        a8 = a8 * 0.5f + 0.5f;
        a8 = Class776.Method1704(a8, this.Field616);
        a8 = Class776.Method1703(a8, this.Field617);
        a8 *= this.Field614;
        int a9 = a3 & 0xFF000000;
        if (this.Field623 != null) {
            a4 = this.Field623.Method283(a8);
        }
        a4 = Class767.Method1687((int)(a8 * 255.0f));
        int a10 = a4 << 16;
        int a11 = a4 << 8;
        int a12 = a4;
        a4 = a9 | a10 | a11 | a12;
        if (this.Field618 != 0) {
            a4 = Class767.Method1691(a3, a4, this.Field618);
        }
        return a4;
    }

    public String toString() {
        return "Texture/Noise...";
    }
}