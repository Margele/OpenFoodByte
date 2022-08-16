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

import awsl.Class414;
import awsl.Class416;
import awsl.Class423;
import awsl.Class426;
import awsl.Class565;
import java.awt.Color;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class424
extends Class426 {
    ModeValue Field2044;

    public Class424(Class414 a, ModeValue a2) {
        this.Field2047 = a;
        this.Field2048 = a2;
        this.Field2044 = (ModeValue)this.Field2048;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method2310(int a2, int a3, float a4) {
        Color color = Class416.Method2352();
        boolean a5 = Class423.Method2410();
        RenderUtils.Method1105(this.Field2050, this.Field2051, this.Field2050 + this.Field2052, this.Field2051 + this.Field2053, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field2054, (float)(this.Field2050 + 2.0), (float)(this.Field2051 - 1.0), -1);
        RenderUtils.Method1105(this.Field2050 + 2.0, this.Field2051 + 12.0, this.Field2050 + this.Field2052 - 2.0, this.Field2051 + this.Field2053 - 2.0, new Color(150, 150, 150, 77).getRGB());
        Class565.Field2637.Method1222(this.Field2044.getMode(), (float)(this.Field2050 + this.Field2052 / 2.0), (float)(this.Field2051 + 11.0), -1);
        Class565.Field2639.Method1217(this.Field2055 ? "h" : "i", (float)(this.Field2050 + this.Field2052 - (double)Class565.Field2639.Method1225(this.Field2055 ? "h" : "i") - 3.0), (float)(this.Field2051 + 13.0), -1);
        if (this.Field2055) {
            RenderUtils.Method1106(this.Field2050 + 2.0, this.Field2051 + 23.0, this.Field2050 + this.Field2052 - 2.0, this.Field2051 + 25.0, new Color(0, 0, 0, 76).getRGB(), 0);
            double a6 = this.Field2051 + 24.0;
            int a7 = 0;
            if (a7 < this.Field2044.Method2728().length) {
                String a8 = this.Field2044.Method2728()[a7];
                String a9 = a8.substring(0, 1).toUpperCase() + a8.substring(1, a8.length());
                int a10 = new Color(163, 162, 162, 255).getRGB();
                if (this.Field2044.isCurrentMode(a8)) {
                }
                if ((double)a2 >= this.Field2050 && (double)a2 <= this.Field2050 + this.Field2052 && (double)a3 >= a6 && (double)a3 < a6 + (double)Class565.Field2637.Field2625 - 5.0) {
                    void a11;
                    a10 = new Color(a11.getRed(), a11.getGreen(), a11.getBlue(), 150).getRGB();
                }
                Class565.Field2637.Method1222(a9, (float)(this.Field2050 + this.Field2052 / 2.0), (float)(a6 - 1.0), a10);
                a6 += (double)(Class565.Field2637.Field2625 - 5.0f);
                ++a7;
            }
        }
        if (a.trash() == null) {
            Class423.Method2408(false);
        }
    }

    @Override
    public boolean Method2311(int a2, int a3, int a4) {
        boolean a5 = Class423.Method2410();
        if (this.Method2407(a2, a3)) {
            this.Field2055 = !this.Field2055;
            return true;
        }
        if (!this.Field2055) {
            return false;
        }
        double a6 = this.Field2051 + 24.0;
        int a7 = 0;
        if (a7 < this.Field2044.Method2728().length) {
            String a8 = this.Field2044.Method2728()[a7];
            if (this.Field2044.isCurrentMode(a8)) {
            }
            if ((double)a2 >= this.Field2050 && (double)a2 <= this.Field2050 + this.Field2052 && (double)a3 >= a6 && (double)a3 <= a6 + (double)Class565.Field2637.Field2625 - 5.0) {
                if (this.Field2046 != null) {
                    this.Field2044.Method2720(a8);
                    this.Field2055 = false;
                }
                return true;
            }
            a6 += (double)(Class565.Field2637.Field2625 - 5.0f);
            ++a7;
        }
        return super.Method2311(a2, a3, a4);
    }

    @Override
    public void Method2312(int a2, int a3, int a4) {
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2407(int a2, int a3) {
        return (double)a2 >= this.Field2050 && (double)a2 <= this.Field2050 + this.Field2052 && (double)a3 >= this.Field2051 + 11.0 && (double)a3 <= this.Field2051 + 23.0;
    }
}