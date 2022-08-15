/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Map
 */
package awsl;

import awsl.Class104;
import awsl.Class15;
import awsl.Class267;
import awsl.Class91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Class95
extends Class91 {
    public int Field814;
    public List Field815;
    public List Field816;

    private Class95() {
        super(-1);
    }

    public Class95(int a, int a2, Object[] a3, int a4, Object[] a5) {
        super(-1);
        this.Field814 = a;
        switch (a) {
            case -1: 
            case 0: {
                this.Field815 = Class95.Method3636(a2, a3);
                this.Field816 = Class95.Method3636(a4, a5);
                break;
            }
            case 1: {
                this.Field815 = Class95.Method3636(a2, a3);
                break;
            }
            case 2: {
                this.Field815 = Arrays.asList((Object[])new Object[a2]);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.Field816 = Class95.Method3636(1, a5);
            }
        }
    }

    @Override
    public int Method0() {
        return 14;
    }

    @Override
    public void Method1(Class267 a) {
        int n = Class15.Method1984();
        switch (this.Field814) {
            case -1: 
            case 0: {
                a.Method1845(this.Field814, this.Field815.Method1799(), Class95.Method3637(this.Field815), this.Field816.Method1799(), Class95.Method3637(this.Field816));
            }
            case 1: {
                a.Method1845(this.Field814, this.Field815.Method1799(), Class95.Method3637(this.Field815), 0, null);
            }
            case 2: {
                a.Method1845(this.Field814, this.Field815.Method1799(), null, 0, null);
            }
            case 3: {
                a.Method1845(this.Field814, 0, null, 0, null);
            }
            case 4: {
                a.Method1845(this.Field814, 0, null, 1, Class95.Method3637(this.Field816));
            }
        }
    }

    @Override
    public Class91 Method2(Map a) {
        Object a2;
        int a3;
        Class95 a4 = new Class95();
        int a5 = Class15.Method3445();
        a4.Field814 = this.Field814;
        if (this.Field815 != null) {
            a4.Field815 = new ArrayList();
            a3 = 0;
            if (a3 < this.Field815.Method1799()) {
                a2 = this.Field815.get(a3);
                if (a2 instanceof Class104) {
                    a2 = a.Method2665(a2);
                }
                a4.Field815.Method2530(a2);
                ++a3;
            }
        }
        if (this.Field816 != null) {
            a4.Field816 = new ArrayList();
            a3 = 0;
            if (a3 < this.Field816.Method1799()) {
                a2 = this.Field816.get(a3);
                if (a2 instanceof Class104) {
                    a2 = a.Method2665(a2);
                }
                a4.Field816.Method2530(a2);
                ++a3;
            }
        }
        return a4;
    }

    private static List Method3636(int a, Object[] a2) {
        return Arrays.asList((Object[])a2).subList(0, a);
    }

    private static Object[] Method3637(List a) {
        Object[] a2 = new Object[a.Method1799()];
        for (int a3 = 0; a3 < a2.length; ++a3) {
            Object a4 = a.get(a3);
            if (a4 instanceof Class104) {
                a4 = ((Class104)a4).Method303();
            }
            a2[a3] = a4;
        }
        return a2;
    }
}