/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
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
import awsl.Class681;
import awsl.Class707;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Class382
extends Class390 {
    private boolean Field1883;
    public BooleanValue Field1884;
    private Class344 Field1885 = new Class344(20);

    public Class382(BooleanValue a, Class381 a2, int a3, int a4, String a5, String a6) {
        super(a2, a3, a4, a5, a6);
        this.Field1884 = a;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a2.Method1414());
        this.Field1910 = 12;
        this.Field1920 = "Checkbox";
    }

    @Override
    public void Method419(int a, int a2) {
        this.Field1916 = !this.Field1884.Method2756();
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
        this.Field1883 = this.Field1884 != null && Boolean.valueOf((boolean)this.Field1884.getValue()) != false;
        this.Field1885.Method290(this.Field1883);
        if (this.Field1915) {
            GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
        }
    }

    @Override
    public void Method412(int a, int a2) {
        int a3 = this.Field1909 - (this.Field1919.Method1418() ? 2 : 0);
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 18, (float)this.Field1908 + 2.0f, 0xFFFFFF);
        RenderUtils.Method1103(this.Field1907 + 5, this.Field1908 + 2, 8.0f, 8.0f, this.Field1915 ? Class681.Method2699(Class707.Method1832(), 30) : Class707.Method1832());
        if (this.Field1885.Method292() > 0.0) {
            RenderUtils.Method1085(this.Field1907 + 6, this.Field1908 + 6, this.Field1907 + 7, (double)(this.Field1908 + 7) + (double)(this.Field1910 - 10) * Math.min((double)0.5, (double)this.Field1885.Method292()) * 2.0, 1.5f, 0xFFFFFF);
        }
        if (this.Field1885.Method292() > 0.5) {
            RenderUtils.Method1085(this.Field1907 + 7, this.Field1908 + this.Field1910 - 3, (double)(this.Field1907 + 7) + (double)(this.Field1910 - 7) * (this.Field1885.Method292() - 0.5) * 2.0, (double)(this.Field1908 + this.Field1910 - 4) - (double)(this.Field1910 - 8) * (this.Field1885.Method292() - 0.5) * 2.0, 1.5f, 0xFFFFFF);
        }
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        this.Field1915 = this.Method1313(a, a2) && this.Field1919.Method1392(a, a2);
        if (!this.Field1918 && this.Field1915 && this.Field1884 != null && Mouse.isButtonDown((int)0)) {
            this.Field1883 = !this.Field1883;
            this.Field1884.Method2510(this.Field1883);
            GlobalModule.INSTANCE.fileManager.saveValues();
        }
        this.Field1918 = a3;
    }

    @Override
    public void Method414() {
        super.Method414();
    }
}