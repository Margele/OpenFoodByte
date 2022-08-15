/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public abstract class Class148 {
    protected final int Field1005;
    protected Class148 Field1006;
    private static int Field1007;

    public Class148(int a) {
        this(a, null);
    }

    public Class148(int a, Class148 a2) {
        if (a != 262144 && a != 327680) {
            throw new IllegalArgumentException();
        }
        this.Field1005 = a;
        this.Field1006 = a2;
    }

    public void Method397(String a, Object a2) {
        block0: {
            if (this.Field1006 == null) break block0;
            this.Field1006.Method397(a, a2);
        }
    }

    public void Method398(String a, String a2, String a3) {
        block0: {
            if (this.Field1006 == null) break block0;
            this.Field1006.Method398(a, a2, a3);
        }
    }

    public Class148 Method399(String a, String a2) {
        if (this.Field1006 != null) {
            return this.Field1006.Method399(a, a2);
        }
        return null;
    }

    public Class148 Method400(String a) {
        if (this.Field1006 != null) {
            return this.Field1006.Method400(a);
        }
        return null;
    }

    public void Method401() {
        block0: {
            if (this.Field1006 == null) break block0;
            this.Field1006.Method401();
        }
    }

    public static void Method1443(int n) {
        Field1007 = n;
    }

    public static int Method1444() {
        return Field1007;
    }

    public static int Method1445() {
        int n = Class148.Method1444();
        return 49;
    }

    private static IllegalArgumentException Method1446(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        if (Class148.Method1445() != 0) {
            Class148.Method1443(28);
        }
    }
}