/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class234;
import awsl.Class606;
import awsl.Class608;
import awsl.Class609;
import awsl.Class612;

public class Class546
implements Class609 {
    private Class606 Field2533;

    public Class546() {
    }

    public Class546(Class606 a) {
        this.Field2533 = a;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2533 = a.Method2092();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method2093(this.Field2533);
    }

    public Class606 Method846() {
        return this.Field2533;
    }

    public void Method689(Class612 a) {
        a.Method3764(this);
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }
}