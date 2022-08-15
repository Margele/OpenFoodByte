/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.util.MathHelper
 */
package awsl;

import awsl.Class414;
import awsl.Class416;
import awsl.Class426;
import awsl.Class565;
import awsl.Class91;
import java.awt.Color;
import net.minecraft.util.MathHelper;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.FloatValue;

public class Class423
extends Class426 {
    public boolean Field2041;
    FloatValue Field2042;
    private static boolean Field2043;

    public Class423(Class414 a, FloatValue a2) {
        this.Field2047 = a;
        this.Field2048 = a2;
        this.Field2042 = (FloatValue)this.Field2048;
        this.Field2041 = false;
    }

    @Override
    public void Method2310(int a, int a2, float a3) {
        String a4 = "" + (double)Math.round((double)((double)this.Field2042.Method2744().floatValue() * 100.0)) / 100.0;
        RenderUtils.Method1105(this.Field2050, this.Field2051, this.Field2050 + this.Field2052, this.Field2051 + this.Field2053, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field2054, (float)(this.Field2050 + 2.0), (float)(this.Field2051 + 0.0), -1);
        boolean bl = Class423.Method2409();
        Class565.Field2637.Method1217(a4, (float)(this.Field2050 + this.Field2052 - (double)Class565.Field2637.Method1225(a4) - 1.0), (float)(this.Field2051 + 0.0), -1);
        this.Field2050 += 2.0;
        boolean a5 = bl;
        this.Field2052 -= 4.0;
        boolean a6 = this.Method2407(a, a2) || this.Field2041;
        Color a7 = Class416.Method2352();
        int a8 = new Color(a7.getRed(), a7.getGreen(), a7.getBlue(), 250).getRGB();
        int a9 = new Color(a7.getRed(), a7.getGreen(), a7.getBlue(), 255).getRGB();
        double a10 = ((double)this.Field2042.Method2744().floatValue() - (double)this.Field2042.Method2750()) / ((double)this.Field2042.Method2751() - (double)this.Field2042.Method2750());
        RenderUtils.Method1105(this.Field2050, this.Field2051 + 12.0, this.Field2050 + this.Field2052, this.Field2051 + 13.5, new Color(0, 0, 0, 80).getRGB());
        RenderUtils.Method1105(this.Field2050, this.Field2051 + 12.0, this.Field2050 + a10 * this.Field2052, this.Field2051 + 13.5, a8);
        if (a10 > 0.0 && a10 < 1.0) {
            RenderUtils.Method1105(this.Field2050 + a10 * this.Field2052 - 1.0, this.Field2051 + 12.0, this.Field2050 + Math.min((double)(a10 * this.Field2052), (double)this.Field2052), this.Field2051 + 13.5, a9);
        }
        if (this.Field2041) {
            double a11 = (double)this.Field2042.Method2751() - (double)this.Field2042.Method2750();
            double a12 = (double)this.Field2042.Method2750() + MathHelper.clamp_double((double)(((double)a - this.Field2050) / this.Field2052), (double)0.0, (double)1.0) * a11;
            a12 = (double)Math.round((double)(a12 * (1.0 / (double)this.Field2042.Method2752()))) / (1.0 / (double)this.Field2042.Method2752());
            a12 = (float)Math.round((double)(a12 * 100.0)) / 100.0f;
            this.Field2042.Method2745((float)a12);
        }
        Class91.Method3647(new String[2]);
    }

    @Override
    public boolean Method2311(int a, int a2, int a3) {
        if (this.Method2407(a, a2)) {
            this.Field2041 = true;
            return true;
        }
        return super.Method2311(a, a2, a3);
    }

    @Override
    public void Method2312(int a, int a2, int a3) {
        this.Field2041 = false;
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2407(int a, int a2) {
        return (double)a >= this.Field2050 && (double)a <= this.Field2050 + this.Field2052 && (double)a2 >= this.Field2051 + 11.0 && (double)a2 <= this.Field2051 + 14.0;
    }

    public static void Method2408(boolean bl) {
        Field2043 = bl;
    }

    public static boolean Method2409() {
        return Field2043;
    }

    public static boolean Method2410() {
        boolean bl = Class423.Method2409();
        return true;
    }

    static {
        if (!Class423.Method2409()) {
            Class423.Method2408(true);
        }
    }
}