/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class594;
import awsl.Class598;
import awsl.Class619;

public class Class620
extends Class619 {
    private float Field2875 = 1.0f;

    public Class620(Class594 a) {
        super(a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public float Method20(float a, float a2) {
        void a3;
        void a4;
        float f = 0.0f;
        float f2 = 1.0f;
        int[] a5 = Class598.Method86();
        if (a4 <= this.Field2875) {
            a3 += this.Field2874.Method20((float)(a4 * a), (float)(a4 * a2)) / a4;
            a4 *= 2.0f;
        }
        return (float)a3;
    }
}