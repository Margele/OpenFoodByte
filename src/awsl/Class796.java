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
import awsl.Class91;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Class796 {
    Class104 Field3565;
    boolean[] Field3566;
    List Field3567;

    private Class796() {
    }

    Class796(Class104 a, int a2, Class102 a3) {
        this.Field3565 = a;
        this.Field3566 = new boolean[a2];
        this.Field3567 = new ArrayList();
        this.Field3567.Method2530((Object)a3);
    }

    public Class796 Method807() {
        Class796 a = new Class796();
        int[] a2 = Class786.Method917();
        a.Field3565 = this.Field3565;
        a.Field3566 = new boolean[this.Field3566.length];
        System.arraycopy((Object)this.Field3566, (int)0, (Object)a.Field3566, (int)0, (int)this.Field3566.length);
        a.Field3567 = new ArrayList((Collection)this.Field3567);
        Class91.Method3647(new String[4]);
        return a;
    }

    public boolean Method808(Class796 a) throws Class731 {
        boolean a2;
        int a3;
        boolean bl = false;
        boolean bl2 = false;
        int[] a4 = Class786.Method917();
        if (a3 < this.Field3566.length) {
            if (a.Field3566[a3] && !this.Field3566[a3]) {
                this.Field3566[a3] = true;
                a2 = true;
            }
            ++a3;
        }
        if (a.Field3565 == this.Field3565 && (a3 = 0) < a.Field3567.Method1799()) {
            Class102 a5 = (Class102)a.Field3567.get(a3);
            if (!this.Field3567.contains((Object)a5)) {
                this.Field3567.Method2530((Object)a5);
                a2 = true;
            }
            ++a3;
        }
        return a2;
    }

    private static Class731 Method809(Class731 class731) {
        return class731;
    }
}