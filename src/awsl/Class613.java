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
import awsl.Class612;

public class Class613
implements Class609 {
    private String Field2857;

    public Class613(String a) {
        this.Field2857 = a;
    }

    public Class613() {
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2857 = a.Method497();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method496(this.Field2857);
    }

    public void Method689(Class612 a) {
        a.Method3767(this);
    }

    public String Method692() {
        return this.Field2857;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }
}