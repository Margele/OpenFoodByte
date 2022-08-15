/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class138;
import awsl.Class165;
import awsl.Class169;
import awsl.Class264;
import awsl.Class267;

public class Class136 {
    public final String Field987;
    byte[] Field988;
    Class136 Field989;

    protected Class136(String a) {
        this.Field987 = a;
    }

    public boolean Method468() {
        return true;
    }

    public boolean Method469() {
        return false;
    }

    protected Class264[] Method470() {
        return null;
    }

    protected Class136 Method471(Class165 a, int a2, int a3, char[] a4, int a5, Class264[] a6) {
        Class136 a7 = new Class136(this.Field987);
        a7.Field988 = new byte[a3];
        System.arraycopy((Object)a.Field1029, (int)a2, (Object)a7.Field988, (int)0, (int)a3);
        return a7;
    }

    protected Class138 Method472(Class169 a, byte[] a2, int a3, int a4, int a5) {
        Class138 a6 = new Class138();
        a6.Field990 = this.Field988;
        a6.Field991 = this.Field988.length;
        return a6;
    }

    final int Method473() {
        int a = 0;
        String[] a2 = Class267.Method2862();
        Class136 a3 = this;
        a3 = a3.Field989;
        return ++a;
    }

    final int Method474(Class169 a, byte[] a2, int a3, int a4, int a5) {
        Class136 a6 = this;
        boolean bl = false;
        String[] a7 = Class267.Method2862();
        a.Method1506(a6.Field987);
        a6 = a6.Field989;
        return (int)(a += a6.Method472((Class169)a, (byte[])a2, (int)a3, (int)a4, (int)a5).Field991 + 6);
    }

    final void Method475(Class169 a, byte[] a2, int a3, int a4, int a5, Class138 a6) {
        Class136 a7;
        Class136 class136 = this;
        String[] a8 = Class267.Method2862();
        Class138 a9 = a7.Method472(a, a2, a3, a4, a5);
        a6.Method487(a.Method1506(a7.Field987)).Method489(a9.Field991);
        a6.Method493(a9.Field990, 0, a9.Field991);
        a7 = a7.Field989;
    }
}