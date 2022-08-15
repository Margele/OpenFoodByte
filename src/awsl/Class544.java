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
import awsl.Class612;

public class Class544
implements Class609 {
    public int Field2492;

    public Class544() {
    }

    public Class544(int a) {
        this.Field2492 = a;
    }

    public void Method689(Class612 a) {
        a.Method3768(this);
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2492 = a.Method10();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method9(this.Field2492);
    }

    public int Method906() {
        return this.Field2492;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }
}