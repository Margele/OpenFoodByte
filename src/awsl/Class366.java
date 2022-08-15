/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

import awsl.Class368;

public class Class366 {
    Class368 Field1730 = new Class368(0.0, 0.0, 0.0);
    Class368 Field1731 = new Class368(0.0, 0.0, 0.0);

    Class366(double a, double a2, double a3, double a4, double a5, double a6) {
        this.Field1730.Field1733 = a;
        this.Field1730.Field1734 = a2;
        this.Field1730.Field1735 = a3;
        this.Field1731.Field1733 = a4;
        this.Field1731.Field1734 = a5;
        this.Field1731.Field1735 = a6;
    }

    Class368 Method649(Class366 a) {
        double a2 = this.Field1730.Field1733;
        double a3 = this.Field1731.Field1733;
        double a4 = a.Field1730.Field1733;
        double a5 = a.Field1731.Field1733;
        double a6 = this.Field1730.Field1734;
        double a7 = this.Field1731.Field1734;
        double a8 = a.Field1730.Field1734;
        double a9 = a.Field1731.Field1734;
        double a10 = -a2 * a9 - a4 * a9 - a5 * (a6 - a8);
        double a11 = a3 * a9 - a5 * a7;
        if (a11 == 0.0) {
            return this.Method651(a);
        }
        return this.Method650(a10, a11);
    }

    private Class368 Method650(double a, double a2) {
        double a3 = a / a2;
        Class368 a4 = new Class368(0.0, 0.0, 0.0);
        a4.Field1733 = this.Field1730.Field1733 + this.Field1731.Field1733 * a3;
        a4.Field1734 = this.Field1730.Field1734 + this.Field1731.Field1734 * a3;
        a4.Field1735 = this.Field1730.Field1735 + this.Field1731.Field1735 * a3;
        return a4;
    }

    private Class368 Method651(Class366 a) {
        double a2 = this.Field1730.Field1733;
        double a3 = this.Field1731.Field1733;
        double a4 = a.Field1730.Field1733;
        double a5 = a.Field1731.Field1733;
        double a6 = this.Field1730.Field1735;
        double a7 = this.Field1731.Field1735;
        double a8 = a.Field1730.Field1735;
        double a9 = a.Field1731.Field1735;
        double a10 = -a2 * a9 - a4 * a9 - a5 * (a6 - a8);
        double a11 = a3 * a9 - a5 * a7;
        if (a11 == 0.0) {
            return this.Method652(a);
        }
        return this.Method650(a10, a11);
    }

    private Class368 Method652(Class366 a) {
        double a2 = this.Field1730.Field1734;
        double a3 = this.Field1731.Field1734;
        double a4 = a.Field1730.Field1734;
        double a5 = a.Field1731.Field1734;
        double a6 = this.Field1730.Field1735;
        double a7 = this.Field1731.Field1735;
        double a8 = a.Field1730.Field1735;
        double a9 = a.Field1731.Field1735;
        double a10 = -a2 * a9 - a4 * a9 - a5 * (a6 - a8);
        double a11 = a3 * a9 - a5 * a7;
        if (a11 == 0.0) {
            return null;
        }
        return this.Method650(a10, a11);
    }

    public Class368 Method653(Class368 a, Class368 a2) {
        Class368 a3 = new Class368(this.Field1730.Field1733, this.Field1730.Field1734, this.Field1730.Field1735);
        double a4 = a.Method659(this.Field1730).Method662(a2) / this.Field1731.Method662(a2);
        a3.Method667(this.Field1731.Method664(a4));
        if (this.Field1731.Method662(a2) == 0.0) {
            return null;
        }
        return a3;
    }
}