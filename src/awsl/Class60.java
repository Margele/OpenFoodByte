/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class62;
import awsl.Class830;

class Class60
extends Class62 {
    final Class830 Field626;

    Class60(Class830 a) {
        this.Field626 = a;
    }

    @Override
    protected float Method29(float a) {
        a += Class830.Method3649(this.Field626) * (float)Math.sin((double)((double)(a * 2.0f) * Math.PI));
        return 1.0f - (float)Math.exp((double)(-a * Class830.Method3650(this.Field626)));
    }
}