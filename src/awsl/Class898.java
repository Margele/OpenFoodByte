/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class594;
import awsl.Class877;

public class Class898
extends Class877 {
    private Class594 Field3982;
    private Class594 Field3983;

    public void Method18(Class594 a) {
        this.Field3982 = a;
    }

    public Class594 Method19() {
        return this.Field3982;
    }

    public void Method3574(Class594 a) {
        this.Field3983 = a;
    }

    public Class594 Method3575() {
        return this.Field3983;
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        float a4 = this.Field3982.Method20(a, a2);
        float a5 = this.Field3983.Method20(a, a2);
        a3[0] = a4 * (float)this.Field3820.width;
        a3[1] = a5 * (float)this.Field3820.height;
    }

    public String toString() {
        return "Distort/Map Coordinates...";
    }
}