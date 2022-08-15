/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class594;
import awsl.Class598;
import awsl.Class619;

public class Class622
extends Class619 {
    private float Field2876;

    public Class622(Class594 a, float a2) {
        super(a);
        this.Field2876 = a2;
    }

    public void Method56(float a) {
        this.Field2876 = a;
    }

    public float Method57() {
        return this.Field2876;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public float Method20(float a, float a2) {
        void a3;
        float f = 0.0f;
        int[] a4 = Class598.Method86();
        float a5 = 1.0f;
        if (a5 <= this.Field2876) {
            a3 += Math.abs((float)this.Field2874.Method20(a5 * a, a5 * a2)) / a5;
            a5 *= 2.0f;
        }
        return (float)a3;
    }
}