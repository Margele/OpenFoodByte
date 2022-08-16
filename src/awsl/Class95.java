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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import obfuscate.a;

public class Class95
extends a {
    public int Field814;
    public List Field815;
    public List Field816;

    private Class95() {
        super(-1);
    }

    public Class95(int a2, int a3, Object[] a4, int a5, Object[] a6) {
        super(-1);
        this.Field814 = a2;
        switch (a2) {
            case -1: 
            case 0: {
                this.Field815 = Class95.Method3636(a3, a4);
                this.Field816 = Class95.Method3636(a5, a6);
                break;
            }
            case 1: {
                this.Field815 = Class95.Method3636(a3, a4);
                break;
            }
            case 2: {
                this.Field815 = Arrays.asList((Object[])new Object[a3]);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.Field816 = Class95.Method3636(1, a6);
            }
        }
    }

    @Override
    public int Method0() {
        return 14;
    }

    @Override
    public void Method1(Class267 a2) {
        int n = Class15.Method1984();
        switch (this.Field814) {
            case -1: 
            case 0: {
                a2.Method1845(this.Field814, this.Field815.Method1799(), Class95.Method3637(this.Field815), this.Field816.Method1799(), Class95.Method3637(this.Field816));
            }
            case 1: {
                a2.Method1845(this.Field814, this.Field815.Method1799(), Class95.Method3637(this.Field815), 0, null);
            }
            case 2: {
                a2.Method1845(this.Field814, this.Field815.Method1799(), null, 0, null);
            }
            case 3: {
                a2.Method1845(this.Field814, 0, null, 0, null);
            }
            case 4: {
                a2.Method1845(this.Field814, 0, null, 1, Class95.Method3637(this.Field816));
            }
        }
    }

    @Override
    public a Method2(Map a2) {
        Object a3;
        int a4;
        Class95 a5 = new Class95();
        int a6 = Class15.Method3445();
        a5.Field814 = this.Field814;
        if (this.Field815 != null) {
            a5.Field815 = new ArrayList();
            a4 = 0;
            if (a4 < this.Field815.Method1799()) {
                a3 = this.Field815.get(a4);
                if (a3 instanceof Class104) {
                    a3 = a2.Method2665(a3);
                }
                a5.Field815.Method2530(a3);
                ++a4;
            }
        }
        if (this.Field816 != null) {
            a5.Field816 = new ArrayList();
            a4 = 0;
            if (a4 < this.Field816.Method1799()) {
                a3 = this.Field816.get(a4);
                if (a3 instanceof Class104) {
                    a3 = a2.Method2665(a3);
                }
                a5.Field816.Method2530(a3);
                ++a4;
            }
        }
        return a5;
    }

    private static List Method3636(int a2, Object[] a3) {
        return Arrays.asList((Object[])a3).subList(0, a2);
    }

    private static Object[] Method3637(List a2) {
        Object[] a3 = new Object[a2.Method1799()];
        for (int a4 = 0; a4 < a3.length; ++a4) {
            Object a5 = a2.get(a4);
            if (a5 instanceof Class104) {
                a5 = ((Class104)a5).Method303();
            }
            a3[a4] = a5;
        }
        return a3;
    }
}