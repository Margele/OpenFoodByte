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
import awsl.Class550;
import awsl.Class608;
import awsl.Class609;
import awsl.Class612;
import awsl.Class91;

public class Class548
implements Class609 {
    private String Field2536;
    private long Field2537;
    private long Field2538;
    private double Field2539;

    public Class548(String a, long a2, double a3, long a4) {
        this.Field2536 = a;
        this.Field2538 = a2;
        this.Field2539 = a3;
        this.Field2537 = a4;
    }

    public Class548() {
    }

    @Override
    public void Method687(Class234 a) {
        this.Field2536 = a.Method497();
        this.Field2538 = a.readLong();
        this.Field2539 = a.readDouble();
        int[] nArray = Class550.Method758();
        this.Field2537 = a.readLong();
        if (Class91.Method3648() == null) {
            Class550.Method757(new int[2]);
        }
    }

    @Override
    public void Method688(Class234 a) {
        int[] nArray = Class550.Method758();
        a.Method496(this.Field2536);
        a.writeLong(this.Field2538);
        a.writeDouble(this.Field2539);
        int[] nArray2 = nArray;
        a.writeLong(this.Field2537);
        Class91.Method3647(new String[4]);
    }

    public void Method689(Class612 a) {
        a.Method3763(this);
    }

    public double Method690() {
        return this.Field2539;
    }

    public long Method691() {
        return this.Field2538;
    }

    public String Method692() {
        return this.Field2536;
    }

    public long Method693() {
        return this.Field2537;
    }

    @Override
    public void Method694(Class608 class608) {
        this.Method689((Class612)class608);
    }
}