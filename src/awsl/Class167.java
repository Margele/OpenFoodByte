/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package awsl;

import awsl.Class136;
import awsl.Class148;
import awsl.Class253;
import awsl.Class267;
import awsl.Class31;

public abstract class Class167 {
    protected final int Field1034;
    protected Class167 Field1035;
    private static boolean Field1036;

    public Class167(int a) {
        this(a, null);
    }

    public Class167(int a, Class167 a2) {
        if (a != 262144 && a != 327680) {
            throw new IllegalArgumentException();
        }
        this.Field1034 = a;
        this.Field1035 = a2;
    }

    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        block0: {
            if (this.Field1035 == null) break block0;
            this.Field1035.Method1447(a, a2, a3, a4, a5, a6);
        }
    }

    public void Method1458(String a, String a2) {
        block0: {
            if (this.Field1035 == null) break block0;
            this.Field1035.Method1458(a, a2);
        }
    }

    public void Method1453(String a, String a2, String a3) {
        block0: {
            if (this.Field1035 == null) break block0;
            this.Field1035.Method1453(a, a2, a3);
        }
    }

    public Class148 Method1448(String a, boolean a2) {
        if (this.Field1035 != null) {
            return this.Field1035.Method1448(a, a2);
        }
        return null;
    }

    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        if (this.Field1034 < 327680) {
            throw new RuntimeException();
        }
        if (this.Field1035 != null) {
            return this.Field1035.Method1449(a, a2, a3, a4);
        }
        return null;
    }

    public void Method1459(Class136 a) {
        block0: {
            if (this.Field1035 == null) break block0;
            this.Field1035.Method1459(a);
        }
    }

    public void Method1452(String a, String a2, String a3, int a4) {
        block0: {
            if (this.Field1035 == null) break block0;
            this.Field1035.Method1452(a, a2, a3, a4);
        }
    }

    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        if (this.Field1035 != null) {
            return this.Field1035.Method1450(a, a2, a3, a4, a5);
        }
        return null;
    }

    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        if (this.Field1035 != null) {
            return this.Field1035.Method1451(a, a2, a3, a4, a5);
        }
        return null;
    }

    public void Method1460() {
        block0: {
            if (this.Field1035 == null) break block0;
            this.Field1035.Method1460();
        }
    }

    public static void Method1499(boolean bl) {
        Field1036 = bl;
    }

    public static boolean Method1500() {
        return Field1036;
    }

    public static boolean Method1501() {
        boolean bl = Class167.Method1500();
        return true;
    }

    private static IllegalArgumentException Method1502(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        if (Class167.Method1500()) {
            Class167.Method1499(true);
        }
    }
}