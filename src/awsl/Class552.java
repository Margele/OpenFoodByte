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
import awsl.Class608;
import awsl.Class609;
import awsl.Class611;

public class Class552
implements Class609 {
    private String Field2548;

    public Class552() {
    }

    public Class552(String a) {
        this.Field2548 = a;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2548 = a.Method497();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method496(this.Field2548);
    }

    public String Method692() {
        return this.Field2548;
    }

    public void Method794(Class611 a) {
        a.Method3714(this);
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method794((Class611)class608);
    }
}