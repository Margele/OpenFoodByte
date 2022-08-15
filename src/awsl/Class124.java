/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package awsl;

import awsl.Class148;
import awsl.Class15;
import java.util.ArrayList;
import java.util.List;

public class Class124
extends Class148 {
    public String Field973;
    public List Field974;

    public Class124(String a) {
        this(327680, a);
        if (this.getClass() != Class124.class) {
            throw new IllegalStateException();
        }
    }

    public Class124(int a, String a2) {
        super(a);
        this.Field973 = a2;
    }

    Class124(List a) {
        super(327680);
        this.Field974 = a;
    }

    @Override
    public void Method397(String a, Object a2) {
        if (this.Field974 == null) {
            this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
        }
        if (this.Field973 != null) {
            this.Field974.Method2530((Object)a);
        }
        this.Field974.Method2530(a2);
    }

    @Override
    public void Method398(String a, String a2, String a3) {
        if (this.Field974 == null) {
            this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
        }
        if (this.Field973 != null) {
            this.Field974.Method2530((Object)a);
        }
        this.Field974.Method2530((Object)new String[]{a2, a3});
    }

    @Override
    public Class148 Method399(String a, String a2) {
        if (this.Field974 == null) {
            this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
        }
        if (this.Field973 != null) {
            this.Field974.Method2530((Object)a);
        }
        Class124 a3 = new Class124(a2);
        this.Field974.Method2530((Object)a3);
        return a3;
    }

    @Override
    public Class148 Method400(String a) {
        if (this.Field974 == null) {
            this.Field974 = new ArrayList(this.Field973 != null ? 2 : 1);
        }
        if (this.Field973 != null) {
            this.Field974.Method2530((Object)a);
        }
        ArrayList a2 = new ArrayList();
        this.Field974.Method2530((Object)a2);
        return new Class124((List)a2);
    }

    @Override
    public void Method401() {
    }

    public void Method645(int a) {
    }

    public void Method646(Class148 a) {
        if (this.Field974 != null) {
            for (int a2 = 0; a2 < this.Field974.Method1799(); a2 += 2) {
                String a3 = (String)this.Field974.get(a2);
                Object a4 = this.Field974.get(a2 + 1);
                Class124.Method647(a, a3, a4);
            }
        }
        a.Method401();
    }

    static void Method647(Class148 a, String a2, Object a3) {
        Object a4;
        int a5 = Class15.Method3445();
        if (a3 instanceof String[]) {
            a4 = (String[])a3;
            a.Method398(a2, a4[0], a4[1]);
        }
        if (a3 instanceof Class124) {
            a4 = (Class124)a3;
            ((Class124)a4).Method646(a.Method399(a2, ((Class124)a4).Field973));
        }
        if (a3 instanceof List) {
            a4 = a.Method400(a2);
            int a6 = 0;
            List a7 = (List)a3;
            if (a6 < a7.Method1799()) {
                Class124.Method647((Class148)a4, null, a7.get(a6));
                ++a6;
            }
            ((Class148)a4).Method401();
        }
        a.Method397(a2, a3);
    }

    private static IllegalStateException Method648(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}