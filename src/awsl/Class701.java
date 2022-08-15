/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.AbstractSet
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package awsl;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class Class701
extends AbstractSet
implements Iterator {
    Object Field3026;
    Object Field3027;

    static final Set Method1798() {
        return new Class701(null, null);
    }

    Class701(Object a, Object a2) {
        this.Field3026 = a;
        this.Field3027 = a2;
    }

    public Iterator Method1383() {
        return new Class701(this.Field3026, this.Field3027);
    }

    public int Method1799() {
        return this.Field3026 == null ? 0 : (this.Field3027 == null ? 1 : 2);
    }

    public boolean Method932() {
        return this.Field3026 != null;
    }

    public Object Method933() {
        if (this.Field3026 == null) {
            throw new NoSuchElementException();
        }
        Object a = this.Field3026;
        this.Field3026 = this.Field3027;
        this.Field3027 = null;
        return a;
    }

    public void Method934() {
    }

    Set Method1800(Class701 a) {
        HashSet a2;
        block8: {
            if (a.Field3026 == this.Field3026 && a.Field3027 == this.Field3027 || a.Field3026 == this.Field3027 && a.Field3027 == this.Field3026) {
                return this;
            }
            if (a.Field3026 == null) {
                return this;
            }
            if (this.Field3026 == null) {
                return a;
            }
            if (a.Field3027 == null) {
                if (this.Field3027 == null) {
                    return new Class701(this.Field3026, a.Field3026);
                }
                if (a.Field3026 == this.Field3026 || a.Field3026 == this.Field3027) {
                    return this;
                }
            }
            if (this.Field3027 == null && (this.Field3026 == a.Field3026 || this.Field3026 == a.Field3027)) {
                return a;
            }
            a2 = new HashSet(4);
            a2.add(this.Field3026);
            if (this.Field3027 != null) {
                a2.add(this.Field3027);
            }
            a2.add(a.Field3026);
            if (a.Field3027 == null) break block8;
            a2.add(a.Field3027);
        }
        return a2;
    }

    private static NoSuchElementException Method941(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}