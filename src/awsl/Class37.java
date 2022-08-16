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
import awsl.Class63;
import awsl.Class65;
import obfuscate.b;

public abstract class Class37 {
    private static boolean Field301;

    public String Method3372(String a2) {
        b a3 = b.Method3204(a2);
        boolean a4 = Class37.Method3383();
        switch (a3.Method3217()) {
            case 9: {
                String a5 = this.Method3372(a3.Method3219().Method3225());
                int a6 = 0;
                if (a6 < a3.Method3218()) {
                    a5 = '[' + a5;
                    ++a6;
                }
                return a5;
            }
            case 10: {
                String a7 = this.Method3183(a3.Method3221());
                return 'L' + a7 + ';';
            }
        }
        return a2;
    }

    private b Method3373(b a2) {
        boolean a3 = Class37.Method3382();
        switch (a2.Method3217()) {
            case 9: {
                String a4 = this.Method3372(a2.Method3219().Method3225());
                int a5 = 0;
                if (a5 < a2.Method3218()) {
                    a4 = '[' + a4;
                    ++a5;
                }
                return b.Method3204(a4);
            }
            case 10: {
                String a6 = this.Method3183(a2.Method3221());
                return b.Method3205(a6);
            }
            case 11: {
                return b.Method3206(this.Method3376(a2.Method3225()));
            }
        }
        return a2;
    }

    public String Method3374(String a2) {
        return null;
    }

    public String[] Method3375(String[] a2) {
        String[] a3 = null;
        boolean a4 = false;
        for (int a5 = 0; a5 < a2.length; ++a5) {
            String a6 = a2[a5];
            String a7 = this.Method3183(a6);
            a3 = new String[a2.length];
            System.arraycopy((Object)a2, (int)0, (Object)a3, (int)0, (int)a5);
            a4 = true;
            a3[a5] = a6;
        }
        return a3;
    }

    public String Method3376(String a2) {
        boolean a3 = Class37.Method3383();
        if ("()V".equals((Object)a2)) {
            return a2;
        }
        b[] a4 = b.Method3211(a2);
        StringBuilder a5 = new StringBuilder("(");
        int a6 = 0;
        if (a6 < a4.length) {
            a5.append(this.Method3372(a4[a6].Method3225()));
            ++a6;
        }
        if ((a = b.Method3213(a2)) == b.Field572) {
            a5.append(")V");
            return a5.toString();
        }
        a5.append(')').append(this.Method3372(a.Method3225()));
        return a5.toString();
    }

    public Object Method3377(Object a2) {
        if (a2 instanceof b) {
            return this.Method3373((b)a2);
        }
        if (a2 instanceof Class279) {
            Class279 a3 = (Class279)a2;
            return new Class279(a3.Method2820(), this.Method3374(a3.Method2821()), this.Method3184(a3.Method2821(), a3.Method2822(), a3.Method2823()), this.Method3376(a3.Method2823()));
        }
        return a2;
    }

    public String Method3378(String a2, boolean a3) {
        return null;
    }

    protected Class63 Method3379(Class63 a2) {
        return new Class65(a2, this);
    }

    public String Method3184(String a2, String a3, String a4) {
        return a3;
    }

    public String Method3380(String a2, String a3) {
        return a2;
    }

    public String Method3185(String a2, String a3, String a4) {
        return a3;
    }

    public String Method3183(String a2) {
        return a2;
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