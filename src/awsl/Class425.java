/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class414;
import awsl.Class416;
import awsl.Class426;
import awsl.Class565;
import java.awt.Color;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Class425
extends Class426 {
    BooleanValue Field2045;

    public Class425(Class414 a, BooleanValue a2) {
        this.Field2047 = a;
        this.Field2048 = a2;
        this.Field2045 = (BooleanValue)this.Field2048;
    }

    @Override
    public void Method2310(int a, int a2, float a3) {
        Color a4 = Class416.Method2352();
        int a5 = new Color(a4.getRed(), a4.getGreen(), a4.getBlue(), 200).getRGB();
        RenderUtils.Method1105(this.Field2050, this.Field2051, this.Field2050 + this.Field2052, this.Field2051 + this.Field2053, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field2054, (float)(this.Field2050 + 2.0), (float)(this.Field2051 + 0.0), -1);
        Class565.Field2640.Method1217("j", (float)(this.Field2050 + this.Field2052 - (double)Class565.Field2640.Method1225("j") - 3.0), (float)(this.Field2051 + 3.0), this.Field2045.Method2509() != false ? a5 : new Color(150, 150, 150, 255).getRGB());
        if (this.Method2407(a, a2)) {
            RenderUtils.Method1105(this.Field2050 + this.Field2052 - 2.0, this.Field2051 + 2.0, this.Field2050 + this.Field2052 - 13.0, this.Field2051 + 13.0, 0x55111111);
        }
    }

    @Override
    public boolean Method2311(int a, int a2, int a3) {
        if (this.Method2407(a, a2)) {
            this.Field2045.Method2510(this.Field2045.Method2509() == false);
            return true;
        }
        return super.Method2311(a, a2, a3);
    }

    @Override
    public void Method2312(int a, int a2, int a3) {
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2407(int a, int a2) {
        return (double)a >= this.Field2050 + this.Field2052 - 13.0 && (double)a <= this.Field2050 + this.Field2052 - 2.0 && (double)a2 >= this.Field2051 + 2.0 && (double)a2 <= this.Field2051 + 13.0;
    }
}