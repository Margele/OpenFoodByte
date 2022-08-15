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
import awsl.Class622;

public class Class621
extends Class619 {
    public Class621() {
        super(new Class622(new Class598(), 6.0f));
    }

    public Class621(Class594 a) {
        super(a);
    }

    @Override
    public float Method20(float a, float a2) {
        return (float)Math.pow((double)(0.5 * (Math.sin((double)(8.0 * (double)this.Field2874.Method20(a, a2))) + 1.0)), (double)0.77);
    }
}