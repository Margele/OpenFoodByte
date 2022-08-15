/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class381;
import awsl.Class390;
import awsl.Class565;
import awsl.Class707;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class377
extends Class390 {
    public Class377(Class381 a, int a2, int a3, String a4) {
        super(a, a2, a3, a4, null);
        this.Field1909 = 80;
        this.Field1910 = (int)(Class565.Field2636.Method1227(this.Field1913) + 3.0f);
        this.Field1920 = "Label";
    }

    public Class377(ModeValue a, Class381 a2, int a3, int a4) {
        super(a2, a3, a4, a.Method2754(), null);
        this.Field1909 = 80;
        this.Field1910 = (int)(Class565.Field2636.Method1227(this.Field1913) + 3.0f);
        this.Field1920 = "Label";
    }

    @Override
    public void Method412(int a, int a2) {
        int a3 = this.Field1909 - (this.Field1919.Method1418() ? 2 : 0);
        RenderUtils.Method1103(this.Field1907, this.Field1908, a3, this.Field1910, Class707.Method1829());
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 5, (float)this.Field1908 + ((float)(this.Field1910 / 2) - Class565.Field2636.Method1227(this.Field1913) / 2.0f) + 0.0f, 0xFFFFFF);
        float a4 = (float)this.Field1909 - Class565.Field2636.Method1225(this.Field1913) - 8.0f;
        if (a4 > 2.0f) {
            float f = 0.5f;
        }
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
    }
}