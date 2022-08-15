/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.xml.sax.Attributes
 */
package awsl;

import awsl.Class148;
import awsl.Class167;
import awsl.Class253;
import awsl.Class267;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class835
extends Class831 {
    final Class730 Field3724;

    Class835(Class730 a) {
        this.Field3724 = a;
        super(a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method3501(String a, Attributes a2) {
        void a3;
        String string = a2.getValue("desc");
        int[] a4 = Class831.Method3658();
        boolean a5 = Boolean.valueOf((String)a2.getValue("visible"));
        Object a6 = this.Field3724.Method1963();
        if (a6 instanceof Class167) {
            this.Field3724.Method1950(((Class167)a6).Method1448((String)a3, a5));
        }
        if (a6 instanceof Class253) {
            this.Field3724.Method1950(((Class253)a6).Method2114((String)a3, a5));
        }
        if (a6 instanceof Class267) {
            this.Field3724.Method1950(((Class267)a6).Method1969((String)a3, a5));
        }
    }

    @Override
    public void Method3514(String a) {
        Class148 a2 = (Class148)this.Field3724.Method1964();
        a2.Method401();
    }
}