/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class234;
import awsl.Class606;
import awsl.Class608;
import awsl.Class609;
import awsl.Class611;

public class Class523
implements Class609 {
    Class606 Field2429;
    String Field2430;

    public Class523() {
    }

    public Class523(Class606 a, String a2) {
        this.Field2429 = a;
        this.Field2430 = a2;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2429 = a.Method2092();
        this.Field2430 = a.Method497();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method2093(this.Field2429);
        a.Method496(this.Field2430);
    }

    public void Method794(Class611 a) {
        a.Method3719(this);
    }

    public Class606 Method846() {
        return this.Field2429;
    }

    public String Method692() {
        return this.Field2430;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method794((Class611)class608);
    }
}