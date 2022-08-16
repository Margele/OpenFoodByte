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
import java.util.Set;
import obfuscate.a;

public class Class816
implements Class797 {
    public final int Field3652;
    public final Set Field3653;

    public Class816(int a2) {
        this(a2, Class701.Method1798());
    }

    public Class816(int a2, a a3) {
        this.Field3652 = a2;
        this.Field3653 = new Class701(a3, null);
    }

    public Class816(int a2, Set a3) {
        this.Field3652 = a2;
        this.Field3653 = a3;
    }

    @Override
    public int Method806() {
        return this.Field3652;
    }

    public boolean Method863(Object a2) {
        if (!(a2 instanceof Class816)) {
            return false;
        }
        Class816 a3 = (Class816)a2;
        return this.Field3652 == a3.Field3652 && this.Field3653.equals((Object)a3.Field3653);
    }

    public int Method864() {
        return this.Field3653.hashCode();
    }
}