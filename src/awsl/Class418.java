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
import java.awt.Color;
import net.minecraft.util.MathHelper;
import obfuscate.a;
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
    public void Method2369(int a2, int a3, float a4) {
        void a5;
        String string = "" + (double)Math.round((double)((double)this.Field2022.getFloatValue().floatValue() * 100.0)) / 100.0;
        boolean bl = Class418.Method2374();
        RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 + 0.0), -1);
        boolean a6 = bl;
        Class565.Field2637.Method1217((String)a5, (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2637.Method1225((String)a5) - 1.0), (float)(this.Field1995 + 0.0), -1);
        this.Field1994 += 2.0;
        this.Field1996 -= 4.0;
        boolean a7 = this.Method2372(a2, a3) || this.Field2021;
        Color a8 = Class416.Method2352();
        int a9 = new Color(a8.getRed(), a8.getGreen(), a8.getBlue(), 250).getRGB();
        int a10 = new Color(a8.getRed(), a8.getGreen(), a8.getBlue(), 255).getRGB();
        double a11 = ((double)this.Field2022.getFloatValue().floatValue() - (double)this.Field2022.Method2750()) / ((double)this.Field2022.Method2751() - (double)this.Field2022.Method2750());
        RenderUtils.Method1105(this.Field1994, this.Field1995 + 12.0, this.Field1994 + this.Field1996, this.Field1995 + 13.5, new Color(0, 0, 0, 80).getRGB());
        RenderUtils.Method1105(this.Field1994, this.Field1995 + 12.0, this.Field1994 + a11 * this.Field1996, this.Field1995 + 13.5, a9);
        if (a11 > 0.0 && a11 < 1.0) {
            RenderUtils.Method1105(this.Field1994 + a11 * this.Field1996 - 1.0, this.Field1995 + 12.0, this.Field1994 + Math.min((double)(a11 * this.Field1996), (double)this.Field1996), this.Field1995 + 13.5, a10);
        }
        if (this.Field2021) {
            double a12 = (double)this.Field2022.Method2751() - (double)this.Field2022.Method2750();
            double a13 = (double)this.Field2022.Method2750() + MathHelper.clamp_double((double)(((double)a2 - this.Field1994) / this.Field1996), (double)0.0, (double)1.0) * a12;
            a13 = (double)Math.round((double)(a13 * (1.0 / (double)this.Field2022.Method2752()))) / (1.0 / (double)this.Field2022.Method2752());
            a13 = (float)Math.round((double)(a13 * 100.0)) / 100.0f;
            this.Field2022.Method2745((float)a13);
        }
        a.trash(new String[5]);
    }

    @Override
    public boolean Method2370(int a2, int a3, int a4) {
        if (this.Method2372(a2, a3)) {
            this.Field2021 = true;
            return true;
        }
        return super.Method2370(a2, a3, a4);
    }

    @Override
    public void Method2371(int a2, int a3, int a4) {
        this.Field2021 = false;
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2372(int a2, int a3) {
        return (double)a2 >= this.Field1994 && (double)a2 <= this.Field1994 + this.Field1996 && (double)a3 >= this.Field1995 + 11.0 && (double)a3 <= this.Field1995 + 14.0;
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