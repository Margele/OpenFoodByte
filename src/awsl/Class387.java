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

import awsl.Class344;
import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import java.awt.Color;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class387
extends Class390 {
    private boolean Field1893 = false;
    public String Field1894;
    public ModeValue Field1895;
    public int Field1896;
    private Class344 Field1897 = new Class344(15);

    public Class387(ModeValue a, Class381 a2, int a3, int a4, String a5) {
        super(a2, a3, a4, a.Method2754(), a5);
        this.Field1895 = a;
        this.Field1896 = 16;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a2.Method1414());
        this.Field1910 = 21;
        this.Field1920 = "ComboBox";
    }

    @Override
    public void Method419(int a, int a2) {
        this.Field1916 = !this.Field1895.Method2756();
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a);
        this.Field1897.Method290(this.Field1893);
        this.Field1919.Method1384();
        if (this.Field1915) {
            GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
        }
    }

    @Override
    public void Method412(int a, int a2) {
        int n = Class390.Method1318();
        RenderUtils.Method1103(this.Field1907 + 5, this.Field1908 + 9, this.Method1310() - 10, 10.0f, new Color(150, 150, 150, 77).getRGB());
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 5, (float)this.Field1908 + 1.0f, 0xFFFFFF);
        int a3 = n;
        Class565.Field2636.Method1222(this.Field1895.getMode(), this.Field1907 + this.Method1310() / 2, this.Field1908 + 10, 0xFFFFFF);
        float a4 = (float)this.Field1897.Method292() * 2.0f - 1.0f;
        float a5 = (float)(this.Field1908 + 14) + a4 * 1.0f;
        float a6 = (float)(this.Field1908 + 14) - a4 * 1.0f;
        float a7 = (float)(this.Field1908 + 14) + a4 * 1.0f;
        RenderUtils.Method1085(this.Field1907 + this.Method1310() - 12, a5, (float)(this.Field1907 + this.Method1310()) - 10.0f, a6, 1.0f, 0xFFFFFF);
        RenderUtils.Method1085((float)(this.Field1907 + this.Method1310()) - 10.0f, a6, this.Field1907 + this.Method1310() - 8, a7, 1.0f, 0xFFFFFF);
        if (!this.Field1893) {
            return;
        }
        RenderUtils.Method1103(this.Field1907 + 5, this.Field1908 + 19, this.Method1310() - 10, this.Field1910 - 21, new Color(150, 150, 150, 77).getRGB());
        if (this.Field1895.Method2728().length > 1) {
            RenderUtils.Method1106(this.Field1907 + 5, this.Field1908 + 19, this.Field1907 + this.Method1310() - 5, this.Field1908 + 25, new Color(0, 0, 0, 30).getRGB(), 0);
        }
        double a8 = (double)this.Field1908 + 21.0;
        int a9 = 0;
        if (a9 < this.Field1895.Method2728().length) {
            String a10 = this.Field1895.Method2728()[a9];
            int a11 = new Color(163, 162, 162, 255).getRGB();
            if (this.Field1895.isCurrentMode(a10)) {
            }
            if (a >= this.Field1907 + 5 && a <= this.Field1907 + this.Method1310() - 5 && (double)a2 >= a8 && (double)a2 < a8 + (double)Class565.Field2636.Field2625 - 1.0) {
                a11 = new Color(0, 153, 255, 150).getRGB();
            }
            Class565.Field2636.Method1222(a10, this.Field1907 + this.Method1310() / 2, (float)(a8 - 1.0), a11);
            a8 += (double)Class565.Field2636.Field2625;
            ++a9;
        }
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        int a4 = Class390.Method1318();
        this.Field1915 = this.Method1314(a, a2) && this.Field1919.Method1392(a, a2);
        if (!this.Field1918 && this.Field1915 && !Mouse.isButtonDown((int)2)) {
            boolean bl = this.Field1893 = !this.Field1893;
            if (this.Field1893) {
                this.Field1910 = (int)(21.0f + Class565.Field2636.Field2625 * (float)(this.Field1895.Method2728().length - 1));
            }
            this.Field1910 = 21;
        }
        if (this.Field1893) {
            if (!this.Field1918 && !Mouse.isButtonDown((int)2)) {
                double a5 = (double)this.Field1908 + 21.0;
                int a6 = 0;
                if (a6 < this.Field1895.Method2728().length) {
                    String a7 = this.Field1895.Method2728()[a6];
                    int a8 = new Color(163, 162, 162, 255).getRGB();
                    if (this.Field1895.isCurrentMode(a7)) {
                    }
                    if (a >= this.Field1907 + 5 && a <= this.Field1907 + this.Method1310() - 5 && (double)a2 >= a5 && (double)a2 < a5 + (double)Class565.Field2636.Field2625 - 1.0) {
                        this.Field1895.Method2725(this.Field1895.Method2728()[a6]);
                        GlobalModule.INSTANCE.fileManager.saveValues();
                        this.Field1893 = false;
                        this.Field1910 = 21;
                    }
                    a5 += (double)Class565.Field2636.Field2625;
                    ++a6;
                }
            }
        }
        this.Field1918 = a3;
    }

    @Override
    public void Method414() {
        super.Method414();
    }
}