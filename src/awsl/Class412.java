/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class413;
import awsl.Class416;
import awsl.Class417;
import awsl.Class565;
import java.awt.Color;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Class412
extends Class413 {
    BooleanValue Field1989;

    public Class412(Class417 a, BooleanValue a2) {
        this.Field1991 = a;
        this.Field1992 = a2;
        this.Field1989 = (BooleanValue)this.Field1992;
    }

    @Override
    public void Method2369(int a, int a2, float a3) {
        Color a4 = Class416.Method2352();
        int a5 = new Color(a4.getRed(), a4.getGreen(), a4.getBlue(), 200).getRGB();
        RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, new Color(0, 0, 0, 150).getRGB());
        Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 + 0.0), -1);
        Class565.Field2640.Method1217("j", (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2640.Method1225("j") - 3.0), (float)(this.Field1995 + 3.0), this.Field1989.Method2509() != false ? a5 : new Color(150, 150, 150, 255).getRGB());
        if (this.Method2372(a, a2)) {
            RenderUtils.Method1105(this.Field1994 + this.Field1996 - 2.0, this.Field1995 + 2.0, this.Field1994 + this.Field1996 - 13.0, this.Field1995 + 13.0, 0x55111111);
        }
    }

    @Override
    public boolean Method2370(int a, int a2, int a3) {
        if (this.Method2372(a, a2)) {
            this.Field1989.Method2510(this.Field1989.Method2509() == false);
            return true;
        }
        return super.Method2370(a, a2, a3);
    }

    @Override
    public void Method2371(int a, int a2, int a3) {
        GlobalModule.INSTANCE.fileManager.saveValues();
    }

    public boolean Method2372(int a, int a2) {
        return (double)a >= this.Field1994 + this.Field1996 - 13.0 && (double)a <= this.Field1994 + this.Field1996 - 2.0 && (double)a2 >= this.Field1995 + 2.0 && (double)a2 <= this.Field1995 + 13.0;
    }
}