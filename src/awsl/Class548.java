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
import obfuscate.a;

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
    public void Method687(Class234 a2) {
        this.Field2536 = a2.Method497();
        this.Field2538 = a2.readLong();
        this.Field2539 = a2.readDouble();
        int[] nArray = Class550.Method758();
        this.Field2537 = a2.readLong();
        if (a.trash() == null) {
            Class550.Method757(new int[2]);
        }
    }

    @Override
    public void Method688(Class234 a2) {
        int[] nArray = Class550.Method758();
        a2.Method496(this.Field2536);
        a2.writeLong(this.Field2538);
        a2.writeDouble(this.Field2539);
        int[] nArray2 = nArray;
        a2.writeLong(this.Field2537);
        a.trash(new String[4]);
    }

    public void Method689(Class612 a2) {
        a2.Method3763(this);
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