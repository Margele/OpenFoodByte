/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public final class Class279 {
    final int Field1519;
    final String Field1520;
    final String Field1521;
    final String Field1522;

    public Class279(int a, String a2, String a3, String a4) {
        this.Field1519 = a;
        this.Field1520 = a2;
        this.Field1521 = a3;
        this.Field1522 = a4;
    }

    public int Method2820() {
        return this.Field1519;
    }

    public String Method2821() {
        return this.Field1520;
    }

    public String Method2822() {
        return this.Field1521;
    }

    public String Method2823() {
        return this.Field1522;
    }

    public boolean Method2824(Object a) {
        if (a == this) {
            return true;
        }
        if (!(a instanceof Class279)) {
            return false;
        }
        Class279 a2 = (Class279)a;
        return this.Field1519 == a2.Field1519 && this.Field1520.equals((Object)a2.Field1520) && this.Field1521.equals((Object)a2.Field1521) && this.Field1522.equals((Object)a2.Field1522);
    }

    public int Method2825() {
        return this.Field1519 + this.Field1520.hashCode() * this.Field1521.hashCode() * this.Field1522.hashCode();
    }

    public String Method2826() {
        return this.Field1520 + '.' + this.Field1521 + this.Field1522 + " (" + this.Field1519 + ')';
    }
}