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
import awsl.Class612;

public class Class538
implements Class609 {
    Class606 Field2475;
    String Field2476;

    public Class538() {
    }

    public Class538(Class606 a, String a2) {
        this.Field2475 = a;
        this.Field2476 = a2;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2475 = a.Method2092();
        this.Field2476 = a.Method497();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method2093(this.Field2475);
        a.Method496(this.Field2476);
    }

    public void Method689(Class612 a) {
        a.Method3765(this);
    }

    public Class606 Method846() {
        return this.Field2475;
    }

    public String Method692() {
        return this.Field2476;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }
}