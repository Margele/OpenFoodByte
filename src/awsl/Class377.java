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
    public Class377(Class381 a2, int a3, int a4, String a5) {
        super(a2, a3, a4, a5, null);
        this.Field1909 = 80;
        this.Field1910 = (int)(Class565.Field2636.Method1227(this.Field1913) + 3.0f);
        this.Field1920 = "Label";
    }

    public Class377(ModeValue a2, Class381 a3, int a4, int a5) {
        super(a3, a4, a5, a2.Method2754(), null);
        this.Field1909 = 80;
        this.Field1910 = (int)(Class565.Field2636.Method1227(this.Field1913) + 3.0f);
        this.Field1920 = "Label";
    }

    @Override
    public void Method412(int a2, int a3) {
        int a4 = this.Field1909 - (this.Field1919.Method1418() ? 2 : 0);
        RenderUtils.Method1103(this.Field1907, this.Field1908, a4, this.Field1910, Class707.Method1829());
        Class565.Field2636.Method1217(this.Field1913, this.Field1907 + 5, (float)this.Field1908 + ((float)(this.Field1910 / 2) - Class565.Field2636.Method1227(this.Field1913) / 2.0f) + 0.0f, 0xFFFFFF);
        float a5 = (float)this.Field1909 - Class565.Field2636.Method1225(this.Field1913) - 8.0f;
        if (a5 > 2.0f) {
            float f = 0.5f;
        }
    }

    @Override
    public void Method413(int a2, int a3, boolean a4) {
    }
}