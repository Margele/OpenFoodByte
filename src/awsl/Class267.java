/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package awsl;

import awsl.Class136;
import awsl.Class148;
import awsl.Class264;
import awsl.Class279;
import awsl.Class31;

public abstract class Class267 {
    protected final int Field1459;
    protected Class267 Field1460;
    private static String[] Field1461;

    public Class267(int a) {
        this(a, null);
    }

    public Class267(int a, Class267 a2) {
        if (a != 262144 && a != 327680) {
            throw new IllegalArgumentException();
        }
        this.Field1459 = a;
        this.Field1460 = a2;
    }

    public void Method1979(String a, int a2) {
        block1: {
            if (this.Field1459 < 327680) {
                throw new RuntimeException();
            }
            if (this.Field1460 == null) break block1;
            this.Field1460.Method1979(a, a2);
        }
    }

    public Class148 Method1968() {
        if (this.Field1460 != null) {
            return this.Field1460.Method1968();
        }
        return null;
    }

    public Class148 Method1969(String a, boolean a2) {
        if (this.Field1460 != null) {
            return this.Field1460.Method1969(a, a2);
        }
        return null;
    }

    public Class148 Method1970(int a, Class31 a2, String a3, boolean a4) {
        if (this.Field1459 < 327680) {
            throw new RuntimeException();
        }
        if (this.Field1460 != null) {
            return this.Field1460.Method1970(a, a2, a3, a4);
        }
        return null;
    }

    public Class148 Method1971(int a, String a2, boolean a3) {
        if (this.Field1460 != null) {
            return this.Field1460.Method1971(a, a2, a3);
        }
        return null;
    }

    public void Method1980(Class136 a) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1980(a);
        }
    }

    public void Method1652() {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1652();
        }
    }

    public void Method1845(int a, int a2, Object[] a3, int a4, Object[] a5) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1845(a, a2, a3, a4, a5);
        }
    }

    public void Method1948(int a) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1948(a);
        }
    }

    public void Method854(int a, int a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method854(a, a2);
        }
    }

    public void Method1840(int a, int a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1840(a, a2);
        }
    }

    public void Method1952(int a, String a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1952(a, a2);
        }
    }

    public void Method1949(int a, String a2, String a3, String a4) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1949(a, a2, a3, a4);
        }
    }

    @Deprecated
    public void Method1953(int a, String a2, String a3, String a4) {
        block1: {
            if (this.Field1459 >= 327680) {
                boolean a5 = a == 185;
                this.Method1954(a, a2, a3, a4, a5);
                return;
            }
            if (this.Field1460 == null) break block1;
            this.Field1460.Method1953(a, a2, a3, a4);
        }
    }

    public void Method1954(int a, String a2, String a3, String a4, boolean a5) {
        block2: {
            if (this.Field1459 < 327680) {
                if (a5 != (a == 185)) {
                    throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");
                }
                this.Method1953(a, a2, a3, a4);
                return;
            }
            if (this.Field1460 == null) break block2;
            this.Field1460.Method1954(a, a2, a3, a4, a5);
        }
    }

    public void Method1956(String a, String a2, Class279 a3, Object[] a4) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1956(a, a2, a3, a4);
        }
    }

    public void Method1957(int a, Class264 a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1957(a, a2);
        }
    }

    public void Method1947(Class264 a) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1947(a);
        }
    }

    public void Method1950(Object a) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1950(a);
        }
    }

    public void Method1841(int a, int a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1841(a, a2);
        }
    }

    public void Method1959(int a, int a2, Class264 a3, Class264[] a4) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1959(a, a2, a3, a4);
        }
    }

    public void Method1958(Class264 a, int[] a2, Class264[] a3) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1958(a, a2, a3);
        }
    }

    public void Method1951(String a, int a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1951(a, a2);
        }
    }

    public Class148 Method1973(int a, Class31 a2, String a3, boolean a4) {
        if (this.Field1459 < 327680) {
            throw new RuntimeException();
        }
        if (this.Field1460 != null) {
            return this.Field1460.Method1973(a, a2, a3, a4);
        }
        return null;
    }

    public void Method1960(Class264 a, Class264 a2, Class264 a3, String a4) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1960(a, a2, a3, a4);
        }
    }

    public Class148 Method1974(int a, Class31 a2, String a3, boolean a4) {
        if (this.Field1459 < 327680) {
            throw new RuntimeException();
        }
        if (this.Field1460 != null) {
            return this.Field1460.Method1974(a, a2, a3, a4);
        }
        return null;
    }

    public void Method1843(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1843(a, a2, a3, a4, a5, a6);
        }
    }

    public Class148 Method1844(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        if (this.Field1459 < 327680) {
            throw new RuntimeException();
        }
        if (this.Field1460 != null) {
            return this.Field1460.Method1844(a, a2, a3, a4, a5, a6, a7);
        }
        return null;
    }

    public void Method1981(int a, Class264 a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1981(a, a2);
        }
    }

    public void Method1842(int a, int a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1842(a, a2);
        }
    }

    public void Method1653() {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field1460.Method1653();
        }
    }

    public static void Method2861(String[] stringArray) {
        Field1461 = stringArray;
    }

    public static String[] Method2862() {
        return Field1461;
    }

    private static IllegalArgumentException Method2863(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        if (Class267.Method2862() == null) {
            Class267.Method2861(new String[5]);
        }
    }
}