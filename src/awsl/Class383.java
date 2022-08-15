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
import awsl.Class394;
import trash.foodbyte.module.GlobalModule;

public class Class383
extends Class394 {
    public int Field1886;

    public Class383(Class381 a, int a2, int a3, String a4, String a5, int a6) {
        super(a, a2, a3, a4, a5);
        this.Field1886 = a6;
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a.Method1414());
        this.Field1910 = 15;
        this.Field1920 = "WindowButton";
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
    }

    @Override
    protected void Method425() {
        this.Field1919.Method1407(!this.Field1919.Method1406());
        if (this.Field1919.Method1406()) {
            GlobalModule.INSTANCE.Field3190.Method1818(this.Field1919);
        }
    }

    @Override
    public void Method414() {
        super.Method414();
    }

    public int Method431() {
        return this.Field1886;
    }
}