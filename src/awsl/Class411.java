/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class413;
import awsl.Class416;
import awsl.Class417;
import awsl.Class418;
import awsl.Class565;
import awsl.Class91;
import java.awt.Color;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class411
extends Class413 {
    ModeValue Field1988;

    public Class411(Class417 a, ModeValue a2) {
        this.Field1991 = a;
        this.Field1992 = a2;
        this.Field1988 = (ModeValue)this.Field1992;
    }

    @Override
    public void Method2369(int a, int a2, float a3) {
        Color a4 = Class416.Method2352();
        RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 - 1.0), -1);
        boolean bl = Class418.Method2375();
        RenderUtils.Method1105(this.Field1994 + 2.0, this.Field1995 + 12.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + this.Field1997 - 2.0, new Color(150, 150, 150, 77).getRGB());
        boolean a5 = bl;
        Class565.Field2637.Method1222(this.Field1988.getMode(), (float)(this.Field1994 + this.Field1996 / 2.0), (float)(this.Field1995 + 11.0), -1);
        Class565.Field2639.Method1217(this.Field1999 ? "h" : "i", (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2639.Method1225(this.Field1999 ? "h" : "i") - 3.0), (float)(this.Field1995 + 13.0), -1);
        if (this.Field1999) {
            RenderUtils.Method1106(this.Field1994 + 2.0, this.Field1995 + 23.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + 25.0, new Color(0, 0, 0, 76).getRGB(), 0);
            double a6 = this.Field1995 + 24.0;
            int a7 = 0;
            if (a7 < this.Field1988.Method2728().length) {
                String a8 = this.Field1988.Method2728()[a7];
                String a9 = a8.substring(0, 1).toUpperCase() + a8.substring(1, a8.length());
                int a10 = new Color(163, 162, 162, 255).getRGB();
                if (this.Field1988.isCurrentMode(a8)) {
                }
                if ((double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a2 >= a6 && (double)a2 < a6 + (double)Class565.Field2637.Field2625 - 5.0) {
                    a10 = new Color(a4.getRed(), a4.getGreen(), a4.getBlue(), 150).getRGB();
                }
                Class565.Field2637.Method1222(a9, (float)(this.Field1994 + this.Field1996 / 2.0), (float)(a6 - 1.0), a10);
                a6 += (double)(Class565.Field2637.Field2625 - 5.0f);
                ++a7;
            }
        }
        if (Class91.Method3648() == null) {
            Class418.Method2373(false);
        }
    }

    @Override
    public boolean Method2370(int a, int a2, int a3) {
        boolean a4 = Class418.Method2374();
        if (this.Method2372(a, a2)) {
            this.Field1999 = !this.Field1999;
            return true;
        }
        if (!this.Field1999) {
            return false;
        }
        double a5 = this.Field1995 + 24.0;
        int a6 = 0;
        if (a6 < this.Field1988.Method2728().length) {
            String a7 = this.Field1988.Method2728()[a6];
            if (this.Field1988.isCurrentMode(a7)) {
            }
            if ((double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a2 >= a5 && (double)a2 <= a5 + (double)Class565.Field2637.Field2625 - 5.0) {
                if (this.Field1990 != null) {
                    this.Field1988.Method2720(a7);
                    this.Field1999 = false;
                }
                return true;
            }
            a5 += (double)(Class565.Field2637.Field2625 - 5.0f);
            ++a6;
        }
        return super.Method2370(a, a2, a3);
    }

    @Override
    public void Method2371(int a, int a2, int a3) {
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2372(int a, int a2) {
        return (double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a2 >= this.Field1995 + 11.0 && (double)a2 <= this.Field1995 + 23.0;
    }
}