/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.util.ListIterator
 *  java.util.NoSuchElementException
 */
package awsl;

import awsl.Class116;
import awsl.Class15;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import obfuscate.a;

final class Class788
implements ListIterator {
    a Field3545;
    a Field3546;
    a Field3547;
    final Class116 Field3548;

    Class788(Class116 class116, int a2) {
        this.Field3548 = class116;
        int n = Class15.Method1984();
        if (a2 == class116.Method183()) {
            this.Field3545 = null;
            this.Field3546 = class116.Method185();
        }
        this.Field3545 = class116.Method186(a2);
        this.Field3546 = this.Field3545.Field799;
    }

    public boolean Method932() {
        return this.Field3545 != null;
    }

    public Object Method933() {
        a a2;
        if (this.Field3545 == null) {
            throw new NoSuchElementException();
        }
        this.Field3546 = a2 = this.Field3545;
        this.Field3545 = a2.Field800;
        this.Field3547 = a2;
        return a2;
    }

    public void Method934() {
        int n = Class15.Method3445();
        if (this.Field3547 != null) {
            if (this.Field3547 == this.Field3545) {
                this.Field3545 = this.Field3545.Field800;
            }
            this.Field3546 = this.Field3546.Field799;
            this.Field3548.Method202(this.Field3547);
            this.Field3547 = null;
        }
        throw new IllegalStateException();
    }

    public boolean Method935() {
        return this.Field3546 != null;
    }

    public Object Method936() {
        a a2;
        this.Field3545 = a2 = this.Field3546;
        this.Field3546 = a2.Field799;
        this.Field3547 = a2;
        return a2;
    }

    public int Method937() {
        block1: {
            if (this.Field3545 == null) {
                return this.Field3548.Method183();
            }
            if (this.Field3548.Field915 != null) break block1;
            this.Field3548.Field915 = this.Field3548.Method192();
        }
        return this.Field3545.Field801;
    }

    public int Method938() {
        block1: {
            if (this.Field3546 == null) {
                return -1;
            }
            if (this.Field3548.Field915 != null) break block1;
            this.Field3548.Field915 = this.Field3548.Method192();
        }
        return this.Field3546.Field801;
    }

    public void Method939(Object a2) {
        this.Field3548.Method200(this.Field3545, (a)a2);
        this.Field3546 = (a)a2;
        this.Field3547 = null;
    }

    public void Method940(Object a2) {
        this.Field3548.Method193(this.Field3545.Field799, (a)a2);
        this.Field3546 = (a)a2;
    }

    private static NoSuchElementException Method941(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}