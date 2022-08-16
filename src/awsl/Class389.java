/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import java.awt.Color;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ColorValue;

public class Class389
extends Class390 {
    public double Field1904;
    public ColorValue Field1905;
    protected boolean Field1906;

    public Class389(ColorValue a, Class381 a2, int a3, int a4, String a5, String a6) {
        super(a2, a3, a4, a5, a6);
        this.Field1905 = a;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a2.Method1414());
        this.Field1910 = 18;
        if (this.Field1905 != null) {
            this.Field1904 = this.Field1905.Method2442();
        }
        this.Field1920 = "ColorSlider";
    }

    @Override
    public void Method419(int a, int a2) {
        this.Field1916 = !this.Field1905.Method2756();
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
        if (this.Field1915) {
            GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
        }
    }

    @Override
    public void Method412(int a2, int a3) {
        int n = Class390.Method1317();
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 5, this.Field1908 + 1, 0xFFFFFF);
        int a4 = n;
        float a5 = 0.0f;
        if (a5 < (float)(this.Method1310() - 10)) {
            int a6 = Color.getHSBColor((float)(a5 / (float)(this.Method1310() - 10)), (float)1.0f, (float)1.0f).getRGB();
            RenderUtils.Method1103((float)(this.Field1907 + 5) + a5, this.Field1908 + this.Field1910 - 8, 0.5f, 4.0f, a6);
            if ((float)a2 == (float)(this.Field1907 + 5) + a5 && this.Field1906) {
                this.Field1905.Method2440(a6);
                GlobalModule.INSTANCE.fileManager.saveValues();
            }
            if (this.Field1905.Method2442() == a6) {
                RenderUtils.Method1103((float)(this.Field1907 + 5) + a5, this.Field1908 + this.Field1910 - 8, 0.5f, 4.0f, -1);
            }
            a5 += 0.5f;
        }
    }

    @Override
    public void Method413(int a2, int a3, boolean a4) {
        this.Field1915 = MathUtils.isHovering(a2, a3, this.Field1907, this.Field1908 + 8, this.Field1907 + this.Field1909 - (this.Field1919.Method1418() ? 2 : 0), this.Field1908 + this.Field1910) && this.Field1919.Method1392(a2, a3);
        if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown((int)0)) {
            this.Field1906 = true;
        }
        this.Field1906 = false;
        this.Field1918 = a4;
    }

    @Override
    public void Method414() {
        super.Method414();
        if (!Mouse.isButtonDown((int)0)) {
            this.Field1906 = false;
        }
    }
}