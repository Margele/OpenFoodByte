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
import awsl.Class776;

public class Class123
extends Class119 {
    private int Field963 = 8;
    private int Field964 = 8;
    private int Field965 = -1;
    private int Field966 = -16777216;
    private int Field967 = 0;
    private float Field968 = 0.0f;
    private float Field969 = 1.0f;
    private float Field970 = 0.0f;
    private float Field971 = 0.0f;
    private float Field972 = 1.0f;

    public void Method9(int a) {
        this.Field965 = a;
    }

    public int Method10() {
        return this.Field965;
    }

    public void Method11(int a) {
        this.Field966 = a;
    }

    public int Method12() {
        return this.Field966;
    }

    public void Method13(int a) {
        this.Field963 = a;
    }

    public int Method14() {
        return this.Field963;
    }

    public void Method15(int a) {
        this.Field964 = a;
    }

    public int Method16() {
        return this.Field964;
    }

    public void Method498(int a) {
        this.Field967 = a;
    }

    public int Method499() {
        return this.Field967;
    }

    public void Method56(float a) {
        this.Field968 = a;
        float a2 = (float)Math.cos((double)a);
        float a3 = (float)Math.sin((double)a);
        this.Field969 = a2;
        this.Field970 = a3;
        this.Field971 = -a3;
        this.Field972 = a2;
    }

    public float Method57() {
        return this.Field968;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        float a4;
        float a5 = (this.Field969 * (float)a + this.Field970 * (float)a2) / (float)this.Field963;
        float a6 = (this.Field971 * (float)a + this.Field972 * (float)a2) / (float)this.Field964;
        float f = a4 = (int)(a5 + 100000.0f) % 2 != (int)(a6 + 100000.0f) % 2 ? 1.0f : 0.0f;
        if (this.Field967 != 0) {
            float a7 = (float)this.Field967 / 100.0f;
            float a8 = Class776.Method1707(0.0f, a7, 1.0f - a7, 1.0f, Class776.Method1714(a5, 1.0f));
            float a9 = Class776.Method1707(0.0f, a7, 1.0f - a7, 1.0f, Class776.Method1714(a6, 1.0f));
            a4 *= a8 * a9;
        }
        return Class776.Method1719(a4, this.Field965, this.Field966);
    }

    public String toString() {
        return "Texture/Checkerboard...";
    }
}