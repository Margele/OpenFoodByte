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

public class Class542
implements Class609 {
    private String Field2483;
    private String Field2484;
    private String Field2485;

    public Class542() {
    }

    public Class542(String a, String a2, String a3) {
        this.Field2483 = a;
        this.Field2484 = a2;
        this.Field2485 = a3;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2483 = a.Method497();
        this.Field2484 = a.Method497();
        this.Field2485 = a.Method497();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method496(this.Field2483);
        a.Method496(this.Field2484);
        a.Method496(this.Field2485);
    }

    public String Method692() {
        return this.Field2483;
    }

    public String Method860() {
        return this.Field2484;
    }

    public String Method883() {
        return this.Field2485;
    }

    public void Method689(Class612 a) {
        a.Method3769(this);
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }
}