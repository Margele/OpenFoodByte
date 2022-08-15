/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 */
package awsl;

import awsl.Class104;
import awsl.Class126;
import awsl.Class15;
import awsl.Class267;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Class91 {
    public static final int Field780 = 0;
    public static final int Field781 = 1;
    public static final int Field782 = 2;
    public static final int Field783 = 3;
    public static final int Field784 = 4;
    public static final int Field785 = 5;
    public static final int Field786 = 6;
    public static final int Field787 = 7;
    public static final int Field788 = 8;
    public static final int Field789 = 9;
    public static final int Field790 = 10;
    public static final int Field791 = 11;
    public static final int Field792 = 12;
    public static final int Field793 = 13;
    public static final int Field794 = 14;
    public static final int Field795 = 15;
    protected int Field796;
    public List Field797;
    public List Field798;
    Class91 Field799;
    Class91 Field800;
    int Field801;
    private static String[] Field802;

    protected Class91(int a) {
        this.Field796 = a;
        this.Field801 = -1;
    }

    public int Method3640() {
        return this.Field796;
    }

    public abstract int Method0();

    public Class91 Method3641() {
        return this.Field799;
    }

    public Class91 Method3642() {
        return this.Field800;
    }

    public abstract void Method1(Class267 var1);

    protected final void Method3643(Class267 a) {
        Class126 a2;
        int a3 = Class15.Method1984();
        int a4 = 0;
        int a5 = this.Field797 == null ? 0 : this.Field797.Method1799();
        if (a4 < a5) {
            a2 = (Class126)this.Field797.get(a4);
            a2.Method646(a.Method1973(a2.Field975, a2.Field976, a2.Field973, true));
            ++a4;
        }
        if ((a4 = 0) < (a5 = this.Field798 == null ? 0 : this.Field798.Method1799())) {
            a2 = (Class126)this.Field798.get(a4);
            a2.Method646(a.Method1973(a2.Field975, a2.Field976, a2.Field973, false));
            ++a4;
        }
    }

    public abstract Class91 Method2(Map var1);

    static Class104 Method3644(Class104 a, Map a2) {
        return (Class104)a2.Method2665((Object)a);
    }

    static Class104[] Method3645(List a, Map a2) {
        Class104[] a3 = new Class104[a.Method1799()];
        for (int a4 = 0; a4 < a3.length; ++a4) {
            a3[a4] = (Class104)a2.Method2665(a.get(a4));
        }
        return a3;
    }

    protected final Class91 Method3646(Class91 a) {
        Class126 a2;
        Class126 a3;
        int a4;
        int a5 = Class15.Method3445();
        if (a.Field797 != null) {
            this.Field797 = new ArrayList();
            a4 = 0;
            if (a4 < a.Field797.Method1799()) {
                a3 = (Class126)a.Field797.get(a4);
                a2 = new Class126(a3.Field975, a3.Field976, a3.Field973);
                a3.Method646(a2);
                this.Field797.Method2530((Object)a2);
                ++a4;
            }
        }
        if (a.Field798 != null) {
            this.Field798 = new ArrayList();
            a4 = 0;
            if (a4 < a.Field798.Method1799()) {
                a3 = (Class126)a.Field798.get(a4);
                a2 = new Class126(a3.Field975, a3.Field976, a3.Field973);
                a3.Method646(a2);
                this.Field798.Method2530((Object)a2);
                ++a4;
            }
        }
        return this;
    }

    public static void Method3647(String[] stringArray) {
        Field802 = stringArray;
    }

    public static String[] Method3648() {
        return Field802;
    }

    static {
        if (Class91.Method3648() == null) {
            Class91.Method3647(new String[3]);
        }
    }
}