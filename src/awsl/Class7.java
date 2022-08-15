/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class0;
import awsl.Class148;
import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class31;
import awsl.Class37;

public class Class7
extends Class0 {
    protected final Class37 Field110;

    public Class7(int a, String a2, Class267 a3, Class37 a4) {
        this(327680, a, a2, a3, a4);
    }

    protected Class7(int a, int a2, String a3, Class267 a4, Class37 a5) {
        super(a, a2, a3, a4);
        this.Field110 = a5;
    }

    @Override
    public Class148 Method1968() {
        Class148 a = super.Method1968();
        return a;
    }

    @Override
    public Class148 Method1969(String a, boolean a2) {
        Class148 a3 = super.Method1969(this.Field110.Method3372(a), a2);
        return a3;
    }

    @Override
    public Class148 Method1970(int a, Class31 a2, String a3, boolean a4) {
        Class148 a5 = super.Method1970(a, a2, this.Field110.Method3372(a3), a4);
        return a5;
    }

    @Override
    public Class148 Method1971(int a, String a2, boolean a3) {
        Class148 a4 = super.Method1971(a, this.Field110.Method3372(a2), a3);
        return a4;
    }

    @Override
    public void Method1845(int a, int a2, Object[] a3, int a4, Object[] a5) {
        super.Method1845(a, a2, this.Method1972(a2, a3), a4, this.Method1972(a4, a5));
    }

    /*
     * WARNING - void declaration
     */
    private Object[] Method1972(int a, Object[] a2) {
        void a3;
        boolean bl = false;
        boolean a4 = Class37.Method3382();
        if (a3 < a) {
            if (a2[a3] instanceof String) {
                Object[] a5 = new Object[a];
                System.arraycopy((Object)a2, (int)0, (Object)a5, (int)0, (int)a3);
                do {
                    Object a6 = a2[a3];
                    Object object = a5[++a3] = a6 instanceof String ? this.Field110.Method3374((String)a6) : a6;
                } while (a3 < a);
                return a5;
            }
            ++a3;
        }
        return a2;
    }

    @Override
    public void Method1949(int a, String a2, String a3, String a4) {
        super.Method1949(a, this.Field110.Method3374(a2), this.Field110.Method3185(a2, a3, a4), this.Field110.Method3372(a4));
    }

    @Override
    @Deprecated
    public void Method1953(int a, String a2, String a3, String a4) {
        if (this.Field1459 >= 327680) {
            super.Method1953(a, a2, a3, a4);
            return;
        }
        this.Method1955(a, a2, a3, a4, a == 185);
    }

    @Override
    public void Method1954(int a, String a2, String a3, String a4, boolean a5) {
        if (this.Field1459 < 327680) {
            super.Method1954(a, a2, a3, a4, a5);
            return;
        }
        this.Method1955(a, a2, a3, a4, a5);
    }

    private void Method1955(int a, String a2, String a3, String a4, boolean a5) {
        if (this.Field1460 != null) {
            this.Field1460.Method1954(a, this.Field110.Method3374(a2), this.Field110.Method3184(a2, a3, a4), this.Field110.Method3376(a4), a5);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method1956(String a, String a2, Class279 a3, Object[] a4) {
        void a5;
        boolean bl = false;
        boolean a6 = Class37.Method3383();
        if (a5 < a4.length) {
            a4[a5] = this.Field110.Method3377(a4[a5]);
            ++a5;
        }
        super.Method1956(this.Field110.Method3380(a, a2), this.Field110.Method3376(a2), (Class279)this.Field110.Method3377(a3), a4);
    }

    @Override
    public void Method1952(int a, String a2) {
        super.Method1952(a, this.Field110.Method3374(a2));
    }

    @Override
    public void Method1950(Object a) {
        super.Method1950(this.Field110.Method3377(a));
    }

    @Override
    public void Method1951(String a, int a2) {
        super.Method1951(this.Field110.Method3372(a), a2);
    }

    @Override
    public Class148 Method1973(int a, Class31 a2, String a3, boolean a4) {
        Class148 a5 = super.Method1973(a, a2, this.Field110.Method3372(a3), a4);
        return a5;
    }

    @Override
    public void Method1960(Class264 a, Class264 a2, Class264 a3, String a4) {
        super.Method1960(a, a2, a3, null);
    }

    @Override
    public Class148 Method1974(int a, Class31 a2, String a3, boolean a4) {
        Class148 a5 = super.Method1974(a, a2, this.Field110.Method3372(a3), a4);
        return a5;
    }

    @Override
    public void Method1843(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        super.Method1843(a, this.Field110.Method3372(a2), this.Field110.Method3378(a3, true), a4, a5, a6);
    }

    @Override
    public Class148 Method1844(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        Class148 a8 = super.Method1844(a, a2, a3, a4, a5, this.Field110.Method3372(a6), a7);
        return a8;
    }
}