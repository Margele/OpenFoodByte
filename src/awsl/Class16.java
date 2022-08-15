/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import awsl.Class767;
import java.util.Random;

public class Class16
extends Class119 {
    public static final int Field217 = 0;
    public static final int Field218 = 1;
    private int Field219 = 25;
    private int Field220 = 1;
    private boolean Field221 = false;
    private float Field222 = 1.0f;
    private Random Field223 = new Random();

    public void Method9(int a) {
        this.Field219 = a;
    }

    public int Method10() {
        return this.Field219;
    }

    public void Method11(int a) {
        this.Field220 = a;
    }

    public int Method12() {
        return this.Field220;
    }

    public void Method87(boolean a) {
        this.Field221 = a;
    }

    public boolean Method88() {
        return this.Field221;
    }

    public void Method56(float a) {
        this.Field222 = a;
    }

    public float Method57() {
        return this.Field222;
    }

    private int Method1612(int a) {
        boolean bl = Class193.Method1270();
        a += (int)((this.Field220 == 0 ? this.Field223.nextGaussian() : (double)(2.0f * this.Field223.nextFloat() - 1.0f)) * (double)this.Field219);
        a = 0;
        if (a > 255) {
            a = 255;
        }
        return a;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        boolean a4 = Class193.Method1270();
        if (this.Field223.nextFloat() <= this.Field222) {
            int a5 = a3 & 0xFF000000;
            int a6 = a3 >> 16 & 0xFF;
            int a7 = a3 >> 8 & 0xFF;
            int a8 = a3 & 0xFF;
            if (this.Field221) {
                int a9 = (int)((this.Field220 == 0 ? this.Field223.nextGaussian() : (double)(2.0f * this.Field223.nextFloat() - 1.0f)) * (double)this.Field219);
                a6 = Class767.Method1687(a6 + a9);
                a7 = Class767.Method1687(a7 + a9);
                a8 = Class767.Method1687(a8 + a9);
            }
            a6 = this.Method1612(a6);
            a7 = this.Method1612(a7);
            a8 = this.Method1612(a8);
            return a5 | a6 << 16 | a7 << 8 | a8;
        }
        return a3;
    }

    public String toString() {
        return "Stylize/Add Noise...";
    }
}