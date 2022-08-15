/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
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
import awsl.Class31;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class876
extends Class831 {
    final Class730 Field3811;

    Class876(Class730 a) {
        this.Field3811 = a;
        super(a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method3501(String a, Attributes a2) {
        void a3;
        void a4;
        String a5 = a2.getValue("desc");
        boolean a6 = Boolean.valueOf((String)a2.getValue("visible"));
        int a7 = Integer.parseInt((String)a2.getValue("typeRef"));
        Class31 class31 = Class31.Method3435(a2.getValue("typePath"));
        Object object = this.Field3811.Method1963();
        int[] a8 = Class831.Method3658();
        if (a4 instanceof Class167) {
            this.Field3811.Method1950(((Class167)a4).Method1449(a7, (Class31)a3, a5, a6));
        }
        if (a4 instanceof Class253) {
            this.Field3811.Method1950(((Class253)a4).Method2115(a7, (Class31)a3, a5, a6));
        }
        if (a4 instanceof Class267) {
            this.Field3811.Method1950(((Class267)a4).Method1970(a7, (Class31)a3, a5, a6));
        }
    }

    @Override
    public void Method3514(String a) {
        Class148 a2 = (Class148)this.Field3811.Method1964();
        a2.Method401();
    }
}