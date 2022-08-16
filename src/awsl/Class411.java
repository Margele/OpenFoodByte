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
import java.awt.Color;
import obfuscate.a;
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
    public void Method2369(int a2, int a3, float a4) {
        Color a5 = Class416.Method2352();
        RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 - 1.0), -1);
        boolean bl = Class418.Method2375();
        RenderUtils.Method1105(this.Field1994 + 2.0, this.Field1995 + 12.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + this.Field1997 - 2.0, new Color(150, 150, 150, 77).getRGB());
        boolean a6 = bl;
        Class565.Field2637.Method1222(this.Field1988.getMode(), (float)(this.Field1994 + this.Field1996 / 2.0), (float)(this.Field1995 + 11.0), -1);
        Class565.Field2639.Method1217(this.Field1999 ? "h" : "i", (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2639.Method1225(this.Field1999 ? "h" : "i") - 3.0), (float)(this.Field1995 + 13.0), -1);
        if (this.Field1999) {
            RenderUtils.Method1106(this.Field1994 + 2.0, this.Field1995 + 23.0, this.Field1994 + this.Field1996 - 2.0, this.Field1995 + 25.0, new Color(0, 0, 0, 76).getRGB(), 0);
            double a7 = this.Field1995 + 24.0;
            int a8 = 0;
            if (a8 < this.Field1988.Method2728().length) {
                String a9 = this.Field1988.Method2728()[a8];
                String a10 = a9.substring(0, 1).toUpperCase() + a9.substring(1, a9.length());
                int a11 = new Color(163, 162, 162, 255).getRGB();
                if (this.Field1988.isCurrentMode(a9)) {
                }
                if ((double)a2 >= this.Field1994 && (double)a2 <= this.Field1994 + this.Field1996 && (double)a3 >= a7 && (double)a3 < a7 + (double)Class565.Field2637.Field2625 - 5.0) {
                    a11 = new Color(a5.getRed(), a5.getGreen(), a5.getBlue(), 150).getRGB();
                }
                Class565.Field2637.Method1222(a10, (float)(this.Field1994 + this.Field1996 / 2.0), (float)(a7 - 1.0), a11);
                a7 += (double)(Class565.Field2637.Field2625 - 5.0f);
                ++a8;
            }
        }
        if (a.trash() == null) {
            Class418.Method2373(false);
        }
    }

    @Override
    public boolean Method2370(int a2, int a3, int a4) {
        boolean a5 = Class418.Method2374();
        if (this.Method2372(a2, a3)) {
            this.Field1999 = !this.Field1999;
            return true;
        }
        if (!this.Field1999) {
            return false;
        }
        double a6 = this.Field1995 + 24.0;
        int a7 = 0;
        if (a7 < this.Field1988.Method2728().length) {
            String a8 = this.Field1988.Method2728()[a7];
            if (this.Field1988.isCurrentMode(a8)) {
            }
            if ((double)a2 >= this.Field1994 && (double)a2 <= this.Field1994 + this.Field1996 && (double)a3 >= a6 && (double)a3 <= a6 + (double)Class565.Field2637.Field2625 - 5.0) {
                if (this.Field1990 != null) {
                    this.Field1988.Method2720(a8);
                    this.Field1999 = false;
                }
                return true;
            }
            a6 += (double)(Class565.Field2637.Field2625 - 5.0f);
            ++a7;
        }
        return super.Method2370(a2, a3, a4);
    }

    @Override
    public void Method2371(int a2, int a3, int a4) {
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2372(int a2, int a3) {
        return (double)a2 >= this.Field1994 && (double)a2 <= this.Field1994 + this.Field1996 && (double)a3 >= this.Field1995 + 11.0 && (double)a3 <= this.Field1995 + 23.0;
    }
}