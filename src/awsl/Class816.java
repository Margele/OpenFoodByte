/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Set
 */
package awsl;

import awsl.Class701;
import awsl.Class797;
import awsl.Class91;
import java.util.Set;

public class Class816
implements Class797 {
    public final int Field3652;
    public final Set Field3653;

    public Class816(int a) {
        this(a, Class701.Method1798());
    }

    public Class816(int a, Class91 a2) {
        this.Field3652 = a;
        this.Field3653 = new Class701(a2, null);
    }

    public Class816(int a, Set a2) {
        this.Field3652 = a;
        this.Field3653 = a2;
    }

    @Override
    public int Method806() {
        return this.Field3652;
    }

    public boolean Method863(Object a) {
        if (!(a instanceof Class816)) {
            return false;
        }
        Class816 a2 = (Class816)a;
        return this.Field3652 == a2.Field3652 && this.Field3653.equals((Object)a2.Field3653);
    }

    public int Method864() {
        return this.Field3653.hashCode();
    }
}