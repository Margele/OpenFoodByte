/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class342 {
    public static float Field1649 = 0.0f;
    public static boolean Field1650 = false;

    /*
     * WARNING - void declaration
     */
    public static float Method280(float a, float a2, float a3) {
        void a4;
        float f = GlobalModule.Field3185 * (a3 / 1000.0f);
        int[] a5 = RenderUtils.Method1148();
        if (a < a2) {
            if (a + a4 < a2) {
                a += a4;
            }
            a = a2;
        }
        if (a - a4 > a2) {
            a -= a4;
        }
        a = a2;
        return a;
    }

    public static float Method281(float a, float a2, float a3, float a4) {
        return Class342.Method280(a, a2, Math.max((float)10.0f, (float)(Math.abs((float)(a - a2)) * a3)) * a4);
    }

    public static float Method282() {
        if ((Field1649 += GlobalModule.Field3185) > 360.0f) {
            Field1649 = 0.0f;
        }
        return Field1649;
    }
}