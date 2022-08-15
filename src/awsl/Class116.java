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
import awsl.Class91;
import java.util.ListIterator;

public class Class116 {
    private int Field912;
    private Class91 Field913;
    private Class91 Field914;
    Class91[] Field915;
    private static String[] Field916;

    public int Method183() {
        return this.Field912;
    }

    public Class91 Method184() {
        return this.Field913;
    }

    public Class91 Method185() {
        return this.Field914;
    }

    public Class91 Method186(int a) {
        block1: {
            if (a >= this.Field912) {
                throw new IndexOutOfBoundsException();
            }
            if (this.Field915 != null) break block1;
            this.Field915 = this.Method192();
        }
        return this.Field915[a];
    }

    public boolean Method187(Class91 a) {
        Class91 a2 = this.Field913;
        while (true) {
            if (a2 == a) break;
            a2 = a2.Field800;
        }
        return true;
    }

    public int Method188(Class91 a) {
        block0: {
            if (this.Field915 != null) break block0;
            this.Field915 = this.Method192();
        }
        return a.Field801;
    }

    public void Method189(Class267 a) {
        Class91 a2 = this.Field913;
        while (true) {
            a2.Method1(a);
            a2 = a2.Field800;
        }
    }

    public ListIterator Method190() {
        return this.Method191(0);
    }

    public ListIterator Method191(int a) {
        return new Class788(this, a);
    }

    public Class91[] Method192() {
        int a = 0;
        Class91 a2 = this.Field913;
        Class91[] a3 = new Class91[this.Field912];
        while (true) {
            a3[a] = a2;
            a2.Field801 = a++;
            a2 = a2.Field800;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method193(Class91 a, Class91 a2) {
        Class91 a3;
        void a4;
        Class91 class91 = a.Field800;
        int a5 = Class15.Method3445();
        a2.Field800 = a4;
        a4.Field799 = a2;
        this.Field914 = a2;
        a2.Field799 = a3 = a.Field799;
        a3.Field800 = a2;
        this.Field913 = a2;
        if (this.Field915 != null) {
            int a6 = a.Field801;
            this.Field915[a6] = a2;
            a2.Field801 = a6;
        }
        a2.Field801 = 0;
        a.Field801 = -1;
        a.Field799 = null;
        a.Field800 = null;
    }

    public void Method194(Class91 a) {
        ++this.Field912;
        if (this.Field914 == null) {
            this.Field913 = a;
            this.Field914 = a;
        } else {
            this.Field914.Field800 = a;
            a.Field799 = this.Field914;
        }
        this.Field914 = a;
        this.Field915 = null;
        a.Field801 = 0;
    }

    public void Method195(Class116 a) {
        if (a.Field912 == 0) {
            return;
        }
        this.Field912 += a.Field912;
        if (this.Field914 == null) {
            this.Field913 = a.Field913;
            this.Field914 = a.Field914;
        } else {
            Class91 a2;
            this.Field914.Field800 = a2 = a.Field913;
            a2.Field799 = this.Field914;
            this.Field914 = a.Field914;
        }
        this.Field915 = null;
        a.Method203(false);
    }

    public void Method196(Class91 a) {
        ++this.Field912;
        if (this.Field913 == null) {
            this.Field913 = a;
            this.Field914 = a;
        } else {
            this.Field913.Field799 = a;
            a.Field800 = this.Field913;
        }
        this.Field913 = a;
        this.Field915 = null;
        a.Field801 = 0;
    }

    public void Method197(Class116 a) {
        if (a.Field912 == 0) {
            return;
        }
        this.Field912 += a.Field912;
        if (this.Field913 == null) {
            this.Field913 = a.Field913;
            this.Field914 = a.Field914;
        } else {
            Class91 a2;
            this.Field913.Field799 = a2 = a.Field914;
            a2.Field800 = this.Field913;
            this.Field913 = a.Field913;
        }
        this.Field915 = null;
        a.Method203(false);
    }

    public void Method198(Class91 a, Class91 a2) {
        ++this.Field912;
        Class91 a3 = a.Field800;
        this.Field914 = a2;
        a.Field800 = a2;
        a2.Field800 = a3;
        a2.Field799 = a;
        this.Field915 = null;
        a2.Field801 = 0;
    }

    public void Method199(Class91 a, Class116 a2) {
        if (a2.Field912 == 0) {
            return;
        }
        this.Field912 += a2.Field912;
        Class91 a3 = a2.Field913;
        Class91 a4 = a2.Field914;
        Class91 a5 = a.Field800;
        this.Field914 = a4;
        a.Field800 = a3;
        a4.Field800 = a5;
        a3.Field799 = a;
        this.Field915 = null;
        a2.Method203(false);
    }

    public void Method200(Class91 a, Class91 a2) {
        ++this.Field912;
        Class91 a3 = a.Field799;
        this.Field913 = a2;
        a.Field799 = a2;
        a2.Field800 = a;
        a2.Field799 = a3;
        this.Field915 = null;
        a2.Field801 = 0;
    }

    public void Method201(Class91 a, Class116 a2) {
        if (a2.Field912 == 0) {
            return;
        }
        this.Field912 += a2.Field912;
        Class91 a3 = a2.Field913;
        Class91 a4 = a2.Field914;
        Class91 a5 = a.Field799;
        this.Field913 = a3;
        a.Field799 = a4;
        a4.Field800 = a;
        a3.Field799 = a5;
        this.Field915 = null;
        a2.Method203(false);
    }

    public void Method202(Class91 a) {
        --this.Field912;
        Class91 a2 = a.Field800;
        Class91 a3 = a.Field799;
        this.Field913 = null;
        this.Field914 = null;
        this.Field915 = null;
        a.Field801 = -1;
        a.Field799 = null;
        a.Field800 = null;
    }

    void Method203(boolean a) {
        Class91 a2 = this.Field913;
        while (true) {
            Class91 a3 = a2.Field800;
            a2.Field801 = -1;
            a2.Field799 = null;
            a2.Field800 = null;
            a2 = a3;
        }
    }

    public void Method204() {
        this.Method203(false);
    }

    public void Method205() {
        Class91 a = this.Field913;
        while (true) {
            if (a instanceof Class104) {
                ((Class104)a).Method304();
            }
            a = a.Field800;
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