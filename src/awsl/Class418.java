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

import awsl.Class413;
import awsl.Class416;
import awsl.Class417;
import awsl.Class565;
import awsl.Class91;
import java.awt.Color;
import net.minecraft.util.MathHelper;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.FloatValue;

public class Class418
extends Class413 {
    public boolean Field2021;
    FloatValue Field2022;
    private static boolean Field2023;

    public Class418(Class417 a, FloatValue a2) {
        this.Field1991 = a;
        this.Field1992 = a2;
        this.Field2022 = (FloatValue)this.Field1992;
        this.Field2021 = false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method2369(int a, int a2, float a3) {
        void a4;
        String string = "" + (double)Math.round((double)((double)this.Field2022.Method2744().floatValue() * 100.0)) / 100.0;
        boolean bl = Class418.Method2374();
        RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 + 0.0), -1);
        boolean a5 = bl;
        Class565.Field2637.Method1217((String)a4, (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2637.Method1225((String)a4) - 1.0), (float)(this.Field1995 + 0.0), -1);
        this.Field1994 += 2.0;
        this.Field1996 -= 4.0;
        boolean a6 = this.Method2372(a, a2) || this.Field2021;
        Color a7 = Class416.Method2352();
        int a8 = new Color(a7.getRed(), a7.getGreen(), a7.getBlue(), 250).getRGB();
        int a9 = new Color(a7.getRed(), a7.getGreen(), a7.getBlue(), 255).getRGB();
        double a10 = ((double)this.Field2022.Method2744().floatValue() - (double)this.Field2022.Method2750()) / ((double)this.Field2022.Method2751() - (double)this.Field2022.Method2750());
        RenderUtils.Method1105(this.Field1994, this.Field1995 + 12.0, this.Field1994 + this.Field1996, this.Field1995 + 13.5, new Color(0, 0, 0, 80).getRGB());
        RenderUtils.Method1105(this.Field1994, this.Field1995 + 12.0, this.Field1994 + a10 * this.Field1996, this.Field1995 + 13.5, a8);
        if (a10 > 0.0 && a10 < 1.0) {
            RenderUtils.Method1105(this.Field1994 + a10 * this.Field1996 - 1.0, this.Field1995 + 12.0, this.Field1994 + Math.min((double)(a10 * this.Field1996), (double)this.Field1996), this.Field1995 + 13.5, a9);
        }
        if (this.Field2021) {
            double a11 = (double)this.Field2022.Method2751() - (double)this.Field2022.Method2750();
            double a12 = (double)this.Field2022.Method2750() + MathHelper.clamp_double((double)(((double)a - this.Field1994) / this.Field1996), (double)0.0, (double)1.0) * a11;
            a12 = (double)Math.round((double)(a12 * (1.0 / (double)this.Field2022.Method2752()))) / (1.0 / (double)this.Field2022.Method2752());
            a12 = (float)Math.round((double)(a12 * 100.0)) / 100.0f;
            this.Field2022.Method2745((float)a12);
        }
        Class91.Method3647(new String[5]);
    }

    @Override
    public boolean Method2370(int a, int a2, int a3) {
        if (this.Method2372(a, a2)) {
            this.Field2021 = true;
            return true;
        }
        return super.Method2370(a, a2, a3);
    }

    @Override
    public void Method2371(int a, int a2, int a3) {
        this.Field2021 = false;
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2372(int a, int a2) {
        return (double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a2 >= this.Field1995 + 11.0 && (double)a2 <= this.Field1995 + 14.0;
    }

    public static void Method2373(boolean bl) {
        Field2023 = bl;
    }

    public static boolean Method2374() {
        return Field2023;
    }

    public static boolean Method2375() {
        boolean bl = Class418.Method2374();
        return true;
    }

    static {
        if (!Class418.Method2374()) {
            Class418.Method2373(true);
        }
    }
}