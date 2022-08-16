/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class341;
import awsl.Class661;
import obfuscate.a;

public abstract class Class321 {
    public Class341 Field1604;
    protected int Field1605;
    protected double Field1606;
    protected Class661 Field1607;
    private static String[] Field1608;

    public Class321(int a, double a2) {
        this.Field1604 = new Class341(this);
        this.Field1605 = a;
        this.Field1606 = a2;
        this.Field1607 = Class661.FORWARDS;
    }

    public Class321(int a2, double a3, Class661 a4) {
        String[] stringArray = Class321.Method1215();
        String[] stringArray2 = stringArray;
        this.Field1604 = new Class341(this);
        this.Field1605 = a2;
        this.Field1606 = a3;
        this.Field1607 = a4;
        a.trash(new String[3]);
    }

    public boolean Method1203(Class661 a2) {
        return this.Method1208() && this.Field1607.equals((Object)a2);
    }

    public double Method1204() {
        String[] stringArray = Class321.Method1215();
        double d = 1.0 - (double)this.Field1604.Method288() / (double)this.Field1605 * this.Field1606;
        if (a.trash() == null) {
            Class321.Method1214(new String[1]);
        }
        return d;
    }

    public double Method1205() {
        return this.Field1606;
    }

    public void Method1206(double a2) {
        this.Field1606 = a2;
    }

    public void Method1207() {
        this.Field1604.Method285();
    }

    public boolean Method1208() {
        return this.Field1604.Method287(this.Field1605);
    }

    public void Method1209() {
        this.Method1211(this.Field1607.Method2384());
    }

    public Class661 Method1210() {
        return this.Field1607;
    }

    public void Method1211(Class661 a2) {
        if (this.Field1607 != a2) {
            this.Field1607 = a2;
            this.Field1604.Method289(System.currentTimeMillis() - ((long)this.Field1605 - Math.min((long)this.Field1605, (long)this.Field1604.Method288())));
        }
    }

    public void Method1212(int a2) {
        this.Field1605 = a2;
    }

    protected boolean Method831() {
        return false;
    }

    public double Method1213() {
        if (this.Field1607 == Class661.FORWARDS) {
            if (this.Method1208()) {
                return this.Field1606;
            }
            return this.Method797(this.Field1604.Method288()) * this.Field1606;
        }
        if (this.Method1208()) {
            return 0.0;
        }
        if (this.Method831()) {
            double a2 = Math.min((long)this.Field1605, (long)Math.max((long)0L, (long)((long)this.Field1605 - this.Field1604.Method288())));
            return this.Method797(a2) * this.Field1606;
        }
        return (1.0 - this.Method797(this.Field1604.Method288())) * this.Field1606;
    }

    protected abstract double Method797(double var1);

    public static void Method1214(String[] stringArray) {
        Field1608 = stringArray;
    }

    public static String[] Method1215() {
        return Field1608;
    }

    static {
        if (Class321.Method1215() != null) {
            Class321.Method1214(new String[3]);
        }
    }
}