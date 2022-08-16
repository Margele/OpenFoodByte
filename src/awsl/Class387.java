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
    public void Method412(int a2, int a3) {
        int n = Class390.Method1318();
        RenderUtils.Method1103(this.Field1907 + 5, this.Field1908 + 9, this.Method1310() - 10, 10.0f, new Color(150, 150, 150, 77).getRGB());
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 5, (float)this.Field1908 + 1.0f, 0xFFFFFF);
        int a4 = n;
        Class565.Field2636.Method1222(this.Field1895.getMode(), this.Field1907 + this.Method1310() / 2, this.Field1908 + 10, 0xFFFFFF);
        float a5 = (float)this.Field1897.Method292() * 2.0f - 1.0f;
        float a6 = (float)(this.Field1908 + 14) + a5 * 1.0f;
        float a7 = (float)(this.Field1908 + 14) - a5 * 1.0f;
        float a8 = (float)(this.Field1908 + 14) + a5 * 1.0f;
        RenderUtils.Method1085(this.Field1907 + this.Method1310() - 12, a6, (float)(this.Field1907 + this.Method1310()) - 10.0f, a7, 1.0f, 0xFFFFFF);
        RenderUtils.Method1085((float)(this.Field1907 + this.Method1310()) - 10.0f, a7, this.Field1907 + this.Method1310() - 8, a8, 1.0f, 0xFFFFFF);
        if (!this.Field1893) {
            return;
        }
        RenderUtils.Method1103(this.Field1907 + 5, this.Field1908 + 19, this.Method1310() - 10, this.Field1910 - 21, new Color(150, 150, 150, 77).getRGB());
        if (this.Field1895.Method2728().length > 1) {
            RenderUtils.Method1106(this.Field1907 + 5, this.Field1908 + 19, this.Field1907 + this.Method1310() - 5, this.Field1908 + 25, new Color(0, 0, 0, 30).getRGB(), 0);
        }
        double a9 = (double)this.Field1908 + 21.0;
        int a10 = 0;
        if (a10 < this.Field1895.Method2728().length) {
            String a11 = this.Field1895.Method2728()[a10];
            int a12 = new Color(163, 162, 162, 255).getRGB();
            if (this.Field1895.isCurrentMode(a11)) {
            }
            if (a2 >= this.Field1907 + 5 && a2 <= this.Field1907 + this.Method1310() - 5 && (double)a3 >= a9 && (double)a3 < a9 + (double)Class565.Field2636.Field2625 - 1.0) {
                a12 = new Color(0, 153, 255, 150).getRGB();
            }
            Class565.Field2636.Method1222(a11, this.Field1907 + this.Method1310() / 2, (float)(a9 - 1.0), a12);
            a9 += (double)Class565.Field2636.Field2625;
            ++a10;
        }
    }

    @Override
    public void Method413(int a2, int a3, boolean a4) {
        int a5 = Class390.Method1318();
        this.Field1915 = this.Method1314(a2, a3) && this.Field1919.Method1392(a2, a3);
        if (!this.Field1918 && this.Field1915 && !Mouse.isButtonDown((int)2)) {
            boolean bl = this.Field1893 = !this.Field1893;
            if (this.Field1893) {
                this.Field1910 = (int)(21.0f + Class565.Field2636.Field2625 * (float)(this.Field1895.Method2728().length - 1));
            }
            this.Field1910 = 21;
        }
        if (this.Field1893) {
            if (!this.Field1918 && !Mouse.isButtonDown((int)2)) {
                double a6 = (double)this.Field1908 + 21.0;
                int a7 = 0;
                if (a7 < this.Field1895.Method2728().length) {
                    String a8 = this.Field1895.Method2728()[a7];
                    int a9 = new Color(163, 162, 162, 255).getRGB();
                    if (this.Field1895.isCurrentMode(a8)) {
                    }
                    if (a2 >= this.Field1907 + 5 && a2 <= this.Field1907 + this.Method1310() - 5 && (double)a3 >= a6 && (double)a3 < a6 + (double)Class565.Field2636.Field2625 - 1.0) {
                        this.Field1895.Method2725(this.Field1895.Method2728()[a7]);
                        GlobalModule.INSTANCE.fileManager.saveValues();
                        this.Field1893 = false;
                        this.Field1910 = 21;
                    }
                    a6 += (double)Class565.Field2636.Field2625;
                    ++a7;
                }
            }
        }
        this.Field1918 = a4;
    }

    @Override
    public void Method414() {
        super.Method414();
    }
}