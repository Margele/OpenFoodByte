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

public class Class585
implements Class594 {
    private float Field2754 = 10.0f;

    public void Method56(float a) {
        this.Field2754 = a;
    }

    public float Method57() {
        return this.Field2754;
    }

    @Override
    public float Method20(float a, float a2) {
        float a3 = Class598.Method157(a + 0.5f, a2) * this.Field2754;
        float a4 = Class598.Method157(a, a2 + 0.5f) * this.Field2754;
        return Class598.Method157(a + a3, a2 + a4);
    }
}