/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class37;
import awsl.Class45;

public class Class12
extends Class267
implements Class45 {
    private int Field188;
    private int Field189;

    public Class12(Class267 a) {
        this(327680, a);
    }

    protected Class12(int a, Class267 a2) {
        super(a, a2);
    }

    public int Method1984() {
        return this.Field188;
    }

    public int Method3445() {
        return this.Field189;
    }

    @Override
    public void Method1948(int a) {
        ++this.Field188;
        ++this.Field189;
        if (this.Field1460 != null) {
            this.Field1460.Method1948(a);
        }
    }

    @Override
    public void Method854(int a, int a2) {
        if (a == 17) {
            this.Field188 += 3;
            this.Field189 += 3;
        } else {
            this.Field188 += 2;
            this.Field189 += 2;
        }
        if (this.Field1460 != null) {
            this.Field1460.Method854(a, a2);
        }
    }

    @Override
    public void Method1840(int a, int a2) {
        boolean bl = Class37.Method3382();
        if (a2 < 4 && a != 169) {
            ++this.Field188;
            ++this.Field189;
        }
        if (a2 >= 256) {
            this.Field188 += 4;
            this.Field189 += 4;
        }
        this.Field188 += 2;
        this.Field189 += 2;
        if (this.Field1460 != null) {
            this.Field1460.Method1840(a, a2);
        }
    }

    @Override
    public void Method1952(int a, String a2) {
        this.Field188 += 3;
        this.Field189 += 3;
        if (this.Field1460 != null) {
            this.Field1460.Method1952(a, a2);
        }
    }

    @Override
    public void Method1949(int a, String a2, String a3, String a4) {
        this.Field188 += 3;
        this.Field189 += 3;
        if (this.Field1460 != null) {
            this.Field1460.Method1949(a, a2, a3, a4);
        }
    }

    @Override
    @Deprecated
    public void Method1953(int a, String a2, String a3, String a4) {
        if (this.Field1459 >= 327680) {
            super.Method1953(a, a2, a3, a4);
            return;
        }
        this.Method1955(a, a2, a3, a4, a == 185);
    }

    @Override
    public void Method1954(int a, String a2, String a3, String a4, boolean a5) {
        if (this.Field1459 < 327680) {
            super.Method1954(a, a2, a3, a4, a5);
            return;
        }
        this.Method1955(a, a2, a3, a4, a5);
    }

    private void Method1955(int a, String a2, String a3, String a4, boolean a5) {
        if (a == 185) {
            this.Field188 += 5;
            this.Field189 += 5;
        } else {
            this.Field188 += 3;
            this.Field189 += 3;
        }
        if (this.Field1460 != null) {
            this.Field1460.Method1954(a, a2, a3, a4, a5);
        }
    }

    @Override
    public void Method1956(String a, String a2, Class279 a3, Object[] a4) {
        this.Field188 += 5;
        this.Field189 += 5;
        if (this.Field1460 != null) {
            this.Field1460.Method1956(a, a2, a3, a4);
        }
    }

    @Override
    public void Method1957(int a, Class264 a2) {
        this.Field188 += 3;
        this.Field189 = a == 167 || a == 168 ? (this.Field189 += 5) : (this.Field189 += 8);
        if (this.Field1460 != null) {
            this.Field1460.Method1957(a, a2);
        }
    }

    @Override
    public void Method1950(Object a) {
        if (a instanceof Long || a instanceof Double) {
            this.Field188 += 3;
            this.Field189 += 3;
        } else {
            this.Field188 += 2;
            this.Field189 += 3;
        }
        if (this.Field1460 != null) {
            this.Field1460.Method1950(a);
        }
    }

    @Override
    public void Method1841(int a, int a2) {
        boolean bl = Class37.Method3382();
        if (a > 255 || a2 > 127 || a2 < -128) {
            this.Field188 += 6;
            this.Field189 += 6;
        }
        this.Field188 += 3;
        this.Field189 += 3;
        if (this.Field1460 != null) {
            this.Field1460.Method1841(a, a2);
        }
    }

    @Override
    public void Method1959(int a, int a2, Class264 a3, Class264[] a4) {
        this.Field188 += 13 + a4.length * 4;
        this.Field189 += 16 + a4.length * 4;
        if (this.Field1460 != null) {
            this.Field1460.Method1959(a, a2, a3, a4);
        }
    }

    @Override
    public void Method1958(Class264 a, int[] a2, Class264[] a3) {
        this.Field188 += 9 + a2.length * 8;
        this.Field189 += 12 + a2.length * 8;
        if (this.Field1460 != null) {
            this.Field1460.Method1958(a, a2, a3);
        }
    }

    @Override
    public void Method1951(String a, int a2) {
        this.Field188 += 4;
        this.Field189 += 4;
        if (this.Field1460 != null) {
            this.Field1460.Method1951(a, a2);
        }
    }
}