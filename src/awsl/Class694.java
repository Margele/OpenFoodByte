/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.LinkedList
 */
package awsl;

import awsl.Class91;
import java.util.Collection;
import java.util.LinkedList;

public class Class694
extends LinkedList {
    private int Field2989;
    private static boolean Field2990;

    public Class694(int a) {
        this.Field2989 = a;
    }

    public Class694(Collection a, int a2) {
        super(a);
        this.Field2989 = a2;
    }

    public boolean Method2530(Object a) {
        boolean bl = Class694.Method1270();
        if (this.Method1799() >= this.Method10()) {
            this.removeFirst();
        }
        boolean bl2 = super.Method2530(a);
        Class91.Method3647(new String[2]);
        return bl2;
    }

    public boolean Method1269() {
        boolean bl = Class694.Method1270();
        boolean bl2 = this.Method1799() >= this.Method10();
        if (Class91.Method3648() == null) {
            Class694.Method1268(false);
        }
        return bl2;
    }

    public int Method10() {
        return this.Field2989;
    }

    public static void Method1268(boolean bl) {
        Field2990 = bl;
    }

    public static boolean Method1270() {
        return Field2990;
    }

    public static boolean Method88() {
        boolean bl = Class694.Method1270();
        return true;
    }

    static {
        if (Class694.Method1270()) {
            Class694.Method1268(true);
        }
    }
}