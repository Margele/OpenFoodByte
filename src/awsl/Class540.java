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

public class Class540
implements Class609 {
    private String Field2478;
    private String Field2479;

    public Class540() {
    }

    public Class540(String a, String a2) {
        this.Field2478 = a;
        this.Field2479 = a2;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2478 = a.Method497();
        this.Field2479 = a.Method497();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method496(this.Field2478);
        a.Method496(this.Field2479);
    }

    public void Method689(Class612 a) {
        a.Method3770(this);
    }

    public String Method692() {
        return this.Field2478;
    }

    public String Method860() {
        return this.Field2479;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }
}