/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ListIterator
 */
package awsl;

import awsl.Class104;
import awsl.Class15;
import awsl.Class267;
import awsl.Class788;
import java.util.ListIterator;
import obfuscate.a;

public class Class116 {
    private int Field912;
    private a Field913;
    private a Field914;
    a[] Field915;
    private static String[] Field916;

    public int Method183() {
        return this.Field912;
    }

    public a Method184() {
        return this.Field913;
    }

    public a Method185() {
        return this.Field914;
    }

    public a Method186(int a2) {
        block1: {
            if (a2 >= this.Field912) {
                throw new IndexOutOfBoundsException();
            }
            if (this.Field915 != null) break block1;
            this.Field915 = this.Method192();
        }
        return this.Field915[a2];
    }

    public boolean Method187(a a2) {
        a a3 = this.Field913;
        while (true) {
            if (a3 == a2) break;
            a3 = a3.Field800;
        }
        return true;
    }

    public int Method188(a a2) {
        block0: {
            if (this.Field915 != null) break block0;
            this.Field915 = this.Method192();
        }
        return a2.Field801;
    }

    public void Method189(Class267 a2) {
        a a3 = this.Field913;
        while (true) {
            a3.Method1(a2);
            a3 = a3.Field800;
        }
    }

    public ListIterator Method190() {
        return this.Method191(0);
    }

    public ListIterator Method191(int a2) {
        return new Class788(this, a2);
    }

    public a[] Method192() {
        int a2 = 0;
        a a3 = this.Field913;
        a[] a4 = new a[this.Field912];
        while (true) {
            a4[a2] = a3;
            a3.Field801 = a2++;
            a3 = a3.Field800;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method193(a a2, a a3) {
        a a4;
        void a5;
        a a6 = a2.Field800;
        int a7 = Class15.Method3445();
        a3.Field800 = a5;
        a5.Field799 = a3;
        this.Field914 = a3;
        a3.Field799 = a4 = a2.Field799;
        a4.Field800 = a3;
        this.Field913 = a3;
        if (this.Field915 != null) {
            int a8 = a2.Field801;
            this.Field915[a8] = a3;
            a3.Field801 = a8;
        }
        a3.Field801 = 0;
        a2.Field801 = -1;
        a2.Field799 = null;
        a2.Field800 = null;
    }

    public void Method194(a a2) {
        ++this.Field912;
        if (this.Field914 == null) {
            this.Field913 = a2;
            this.Field914 = a2;
        } else {
            this.Field914.Field800 = a2;
            a2.Field799 = this.Field914;
        }
        this.Field914 = a2;
        this.Field915 = null;
        a2.Field801 = 0;
    }

    public void Method195(Class116 a2) {
        if (a2.Field912 == 0) {
            return;
        }
        this.Field912 += a2.Field912;
        if (this.Field914 == null) {
            this.Field913 = a2.Field913;
            this.Field914 = a2.Field914;
        } else {
            a a3;
            this.Field914.Field800 = a3 = a2.Field913;
            a3.Field799 = this.Field914;
            this.Field914 = a2.Field914;
        }
        this.Field915 = null;
        a2.Method203(false);
    }

    public void Method196(a a2) {
        ++this.Field912;
        if (this.Field913 == null) {
            this.Field913 = a2;
            this.Field914 = a2;
        } else {
            this.Field913.Field799 = a2;
            a2.Field800 = this.Field913;
        }
        this.Field913 = a2;
        this.Field915 = null;
        a2.Field801 = 0;
    }

    public void Method197(Class116 a2) {
        if (a2.Field912 == 0) {
            return;
        }
        this.Field912 += a2.Field912;
        if (this.Field913 == null) {
            this.Field913 = a2.Field913;
            this.Field914 = a2.Field914;
        } else {
            a a3;
            this.Field913.Field799 = a3 = a2.Field914;
            a3.Field800 = this.Field913;
            this.Field913 = a2.Field913;
        }
        this.Field915 = null;
        a2.Method203(false);
    }

    public void Method198(a a2, a a3) {
        ++this.Field912;
        a a4 = a2.Field800;
        this.Field914 = a3;
        a2.Field800 = a3;
        a3.Field800 = a4;
        a3.Field799 = a2;
        this.Field915 = null;
        a3.Field801 = 0;
    }

    public void Method199(a a2, Class116 a3) {
        if (a3.Field912 == 0) {
            return;
        }
        this.Field912 += a3.Field912;
        a a4 = a3.Field913;
        a a5 = a3.Field914;
        a a6 = a2.Field800;
        this.Field914 = a5;
        a2.Field800 = a4;
        a5.Field800 = a6;
        a4.Field799 = a2;
        this.Field915 = null;
        a3.Method203(false);
    }

    public void Method200(a a2, a a3) {
        ++this.Field912;
        a a4 = a2.Field799;
        this.Field913 = a3;
        a2.Field799 = a3;
        a3.Field800 = a2;
        a3.Field799 = a4;
        this.Field915 = null;
        a3.Field801 = 0;
    }

    public void Method201(a a2, Class116 a3) {
        if (a3.Field912 == 0) {
            return;
        }
        this.Field912 += a3.Field912;
        a a4 = a3.Field913;
        a a5 = a3.Field914;
        a a6 = a2.Field799;
        this.Field913 = a4;
        a2.Field799 = a5;
        a5.Field800 = a2;
        a4.Field799 = a6;
        this.Field915 = null;
        a3.Method203(false);
    }

    public void Method202(a a2) {
        --this.Field912;
        a a3 = a2.Field800;
        a a4 = a2.Field799;
        this.Field913 = null;
        this.Field914 = null;
        this.Field915 = null;
        a2.Field801 = -1;
        a2.Field799 = null;
        a2.Field800 = null;
    }

    void Method203(boolean a2) {
        a a3 = this.Field913;
        while (true) {
            a a4 = a3.Field800;
            a3.Field801 = -1;
            a3.Field799 = null;
            a3.Field800 = null;
            a3 = a4;
        }
    }

    public void Method204() {
        this.Method203(false);
    }

    public void Method205() {
        a a2 = this.Field913;
        while (true) {
            if (a2 instanceof Class104) {
                ((Class104)a2).Method304();
            }
            a2 = a2.Field800;
        }
    }

    public static void Method206(String[] stringArray) {
        Field916 = stringArray;
    }

    public static String[] Method207() {
        return Field916;
    }

    private static IndexOutOfBoundsException Method208(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    static {
        if (Class116.Method207() == null) {
            Class116.Method206(new String[5]);
        }
    }
}