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
package obfuscate;

import awsl.Class104;
import awsl.Class126;
import awsl.Class15;
import awsl.Class267;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class a {
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
    a Field799;
    a Field800;
    int Field801;
    private static String[] trash;

    protected a(int a2) {
        this.Field796 = a2;
        this.Field801 = -1;
    }

    public int Method3640() {
        return this.Field796;
    }

    public abstract int Method0();

    public a Method3641() {
        return this.Field799;
    }

    public a Method3642() {
        return this.Field800;
    }

    public abstract void Method1(Class267 var1);

    protected final void Method3643(Class267 a2) {
        Class126 a3;
        int a4 = Class15.Method1984();
        int a5 = 0;
        int a6 = this.Field797 == null ? 0 : this.Field797.Method1799();
        if (a5 < a6) {
            a3 = (Class126)this.Field797.get(a5);
            a3.Method646(a2.Method1973(a3.Field975, a3.Field976, a3.Field973, true));
            ++a5;
        }
        if ((a5 = 0) < (a6 = this.Field798 == null ? 0 : this.Field798.Method1799())) {
            a3 = (Class126)this.Field798.get(a5);
            a3.Method646(a2.Method1973(a3.Field975, a3.Field976, a3.Field973, false));
            ++a5;
        }
    }

    public abstract a Method2(Map var1);

    static Class104 Method3644(Class104 a2, Map a3) {
        return (Class104)a3.Method2665((Object)a2);
    }

    static Class104[] Method3645(List a2, Map a3) {
        Class104[] a4 = new Class104[a2.Method1799()];
        for (int a5 = 0; a5 < a4.length; ++a5) {
            a4[a5] = (Class104)a3.Method2665(a2.get(a5));
        }
        return a4;
    }

    protected final a Method3646(a a2) {
        Class126 a3;
        Class126 a4;
        int a5;
        int a6 = Class15.Method3445();
        if (a2.Field797 != null) {
            this.Field797 = new ArrayList();
            a5 = 0;
            if (a5 < a2.Field797.Method1799()) {
                a4 = (Class126)a2.Field797.get(a5);
                a3 = new Class126(a4.Field975, a4.Field976, a4.Field973);
                a4.Method646(a3);
                this.Field797.Method2530((Object)a3);
                ++a5;
            }
        }
        if (a2.Field798 != null) {
            this.Field798 = new ArrayList();
            a5 = 0;
            if (a5 < a2.Field798.Method1799()) {
                a4 = (Class126)a2.Field798.get(a5);
                a3 = new Class126(a4.Field975, a4.Field976, a4.Field973);
                a4.Method646(a3);
                this.Field798.Method2530((Object)a3);
                ++a5;
            }
        }
        return this;
    }

    public static void trash(String[] stringArray) {
        trash = stringArray;
    }

    public static String[] trash() {
        return trash;
    }

    static {
        if (a.trash() == null) {
            a.trash(new String[3]);
        }
    }
}