/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

class Class61
implements Comparable {
    final String Field627;
    final int Field628;
    final String Field629;

    Class61(String a, int a2, String a3) {
        this.Field627 = a;
        this.Field628 = a2;
        this.Field629 = a3;
    }

    public int Method3789(Class61 a) {
        int a2 = this.Field627.compareTo(a.Field627);
        a2 = this.Field629.compareTo(a.Field629);
        return a2;
    }

    public boolean equals(Object a) {
        if (a instanceof Class61) {
            return this.Method3789((Class61)a) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (this.Field627 + this.Field629).hashCode();
    }

    public int compareTo(Object object) {
        return this.Method3789((Class61)object);
    }
}