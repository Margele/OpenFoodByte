/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package awsl;

import awsl.Class102;
import awsl.Class104;
import awsl.Class731;
import awsl.Class786;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import obfuscate.a;

class Class796 {
    Class104 Field3565;
    boolean[] Field3566;
    List Field3567;

    private Class796() {
    }

    Class796(Class104 a2, int a3, Class102 a4) {
        this.Field3565 = a2;
        this.Field3566 = new boolean[a3];
        this.Field3567 = new ArrayList();
        this.Field3567.Method2530((Object)a4);
    }

    public Class796 Method807() {
        Class796 a2 = new Class796();
        int[] a3 = Class786.Method917();
        a2.Field3565 = this.Field3565;
        a2.Field3566 = new boolean[this.Field3566.length];
        System.arraycopy((Object)this.Field3566, (int)0, (Object)a2.Field3566, (int)0, (int)this.Field3566.length);
        a2.Field3567 = new ArrayList((Collection)this.Field3567);
        a.trash(new String[4]);
        return a2;
    }

    public boolean Method808(Class796 a2) throws Class731 {
        boolean a3;
        int a4;
        boolean bl = false;
        boolean bl2 = false;
        int[] a5 = Class786.Method917();
        if (a4 < this.Field3566.length) {
            if (a2.Field3566[a4] && !this.Field3566[a4]) {
                this.Field3566[a4] = true;
                a3 = true;
            }
            ++a4;
        }
        if (a2.Field3565 == this.Field3565 && (a4 = 0) < a2.Field3567.Method1799()) {
            Class102 a6 = (Class102)a2.Field3567.get(a4);
            if (!this.Field3567.contains((Object)a6)) {
                this.Field3567.Method2530((Object)a6);
                a3 = true;
            }
            ++a4;
        }
        return a3;
    }

    private static Class731 Method809(Class731 class731) {
        return class731;
    }
}