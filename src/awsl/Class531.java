/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class234;
import awsl.Class608;
import awsl.Class609;
import awsl.Class611;

public class Class531
implements Class609 {
    public int Field2465;

    public Class531() {
    }

    public Class531(int a) {
        this.Field2465 = a;
    }

    public void Method794(Class611 a) {
        a.Method3717(this);
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2465 = a.Method10();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method9(this.Field2465);
    }

    public int Method906() {
        return this.Field2465;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method794((Class611)class608);
    }
}