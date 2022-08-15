/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import awsl.Class681;
import awsl.Class707;
import trash.foodbyte.utils.RenderUtils;

public abstract class Class394
extends Class390 {
    protected boolean Field1949;

    public Class394(Class381 a, int a2, int a3, String a4, String a5) {
        super(a, a2, a3, a4, a5);
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a.Method1414());
        this.Field1910 = 18;
        this.Field1920 = "Button";
    }

    @Override
    public void Method412(int a, int a2) {
        int a3 = this.Field1909 - (this.Field1919.Method1418() ? 2 : 0);
        if (this.Field1915) {
            RenderUtils.Method1103(this.Field1907, this.Field1908, this.Method1310(), this.Field1910, Class681.Method2699(Class707.Method1829(), -250));
        }
        Class565.Field2635.Method1217(this.Field1913, this.Field1907 + 12, (float)(this.Field1908 + this.Field1910 / 2) - Class565.Field2635.Method1227(this.Field1913) / 2.0f + 1.0f, this.Field1949 ? Class707.Method1832() : 0xFFFFFF);
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        this.Field1915 = this.Method1311(a, a2) && this.Field1919.Method1392(a, a2);
        if (!this.Field1918 && this.Field1915) {
            this.Method425();
        }
        this.Field1918 = a3;
    }

    protected abstract void Method425();

    @Override
    public void Method414() {
        super.Method414();
    }
}