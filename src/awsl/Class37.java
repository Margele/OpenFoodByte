/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package awsl;

import awsl.Class279;
import awsl.Class46;
import awsl.Class63;
import awsl.Class65;

public abstract class Class37 {
    private static boolean Field301;

    public String Method3372(String a) {
        Class46 a2 = Class46.Method3204(a);
        boolean a3 = Class37.Method3383();
        switch (a2.Method3217()) {
            case 9: {
                String a4 = this.Method3372(a2.Method3219().Method3225());
                int a5 = 0;
                if (a5 < a2.Method3218()) {
                    a4 = '[' + a4;
                    ++a5;
                }
                return a4;
            }
            case 10: {
                String a6 = this.Method3183(a2.Method3221());
                return 'L' + a6 + ';';
            }
        }
        return a;
    }

    private Class46 Method3373(Class46 a) {
        boolean a2 = Class37.Method3382();
        switch (a.Method3217()) {
            case 9: {
                String a3 = this.Method3372(a.Method3219().Method3225());
                int a4 = 0;
                if (a4 < a.Method3218()) {
                    a3 = '[' + a3;
                    ++a4;
                }
                return Class46.Method3204(a3);
            }
            case 10: {
                String a5 = this.Method3183(a.Method3221());
                return Class46.Method3205(a5);
            }
            case 11: {
                return Class46.Method3206(this.Method3376(a.Method3225()));
            }
        }
        return a;
    }

    public String Method3374(String a) {
        return null;
    }

    public String[] Method3375(String[] a) {
        String[] a2 = null;
        boolean a3 = false;
        for (int a4 = 0; a4 < a.length; ++a4) {
            String a5 = a[a4];
            String a6 = this.Method3183(a5);
            a2 = new String[a.length];
            System.arraycopy((Object)a, (int)0, (Object)a2, (int)0, (int)a4);
            a3 = true;
            a2[a4] = a5;
        }
        return a2;
    }

    public String Method3376(String a) {
        boolean a2 = Class37.Method3383();
        if ("()V".equals((Object)a)) {
            return a;
        }
        Class46[] a3 = Class46.Method3211(a);
        StringBuilder a4 = new StringBuilder("(");
        int a5 = 0;
        if (a5 < a3.length) {
            a4.append(this.Method3372(a3[a5].Method3225()));
            ++a5;
        }
        if ((a = Class46.Method3213(a)) == Class46.Field572) {
            a4.append(")V");
            return a4.toString();
        }
        a4.append(')').append(this.Method3372(a.Method3225()));
        return a4.toString();
    }

    public Object Method3377(Object a) {
        if (a instanceof Class46) {
            return this.Method3373((Class46)a);
        }
        if (a instanceof Class279) {
            Class279 a2 = (Class279)a;
            return new Class279(a2.Method2820(), this.Method3374(a2.Method2821()), this.Method3184(a2.Method2821(), a2.Method2822(), a2.Method2823()), this.Method3376(a2.Method2823()));
        }
        return a;
    }

    public String Method3378(String a, boolean a2) {
        return null;
    }

    protected Class63 Method3379(Class63 a) {
        return new Class65(a, this);
    }

    public String Method3184(String a, String a2, String a3) {
        return a2;
    }

    public String Method3380(String a, String a2) {
        return a;
    }

    public String Method3185(String a, String a2, String a3) {
        return a2;
    }

    public String Method3183(String a) {
        return a;
    }

    public static void Method3381(boolean bl) {
        Field301 = bl;
    }

    public static boolean Method3382() {
        return Field301;
    }

    public static boolean Method3383() {
        boolean bl = Class37.Method3382();
        return true;
    }

    static {
        Class37.Method3381(false);
    }
}