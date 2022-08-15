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
import awsl.Class267;
import awsl.Class31;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class854
extends Class831 {
    final Class730 Field3749;

    Class854(Class730 a) {
        this.Field3749 = a;
        super(a);
    }

    @Override
    public void Method3501(String a, Attributes a2) {
        String a3 = a2.getValue("desc");
        boolean a4 = Boolean.valueOf((String)a2.getValue("visible"));
        int a5 = Integer.parseInt((String)a2.getValue("typeRef"));
        Class31 a6 = Class31.Method3435(a2.getValue("typePath"));
        this.Field3749.Method1950(((Class267)this.Field3749.Method1963()).Method1973(a5, a6, a3, a4));
    }

    @Override
    public void Method3514(String a) {
        Class148 a2 = (Class148)this.Field3749.Method1964();
        a2.Method401();
    }
}