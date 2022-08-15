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

public class Class529
implements Class609 {
    private String Field2456;
    private String Field2457;
    private String Field2458;
    private long Field2459;

    public Class529() {
    }

    public Class529(String a, String a2, String a3, long a4) {
        this.Field2457 = a;
        this.Field2458 = a2;
        this.Field2459 = a4;
        this.Field2456 = a3;
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2457 = a.Method497();
        this.Field2458 = a.Method497();
        this.Field2456 = a.Method497();
        this.Field2459 = a.readLong();
    }

    @Override
    public void Method688(Class234 a) {
        a.Method496(this.Field2457);
        a.Method496(this.Field2458);
        a.Method496(this.Field2456);
        a.writeLong(this.Field2459);
    }

    public void Method794(Class611 a) {
        a.Method3722(this);
    }

    public String Method692() {
        return this.Field2457;
    }

    public String Method860() {
        return this.Field2458;
    }

    public String Method883() {
        return this.Field2456;
    }

    public long Method691() {
        return this.Field2459;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method794((Class611)class608);
    }
}