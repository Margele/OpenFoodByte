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
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class834
extends Class831 {
    final Class730 Field3723;

    Class834(Class730 a) {
        this.Field3723 = a;
        super(a);
    }

    @Override
    public void Method3501(String a, Attributes a2) {
        int a3 = Integer.parseInt((String)a2.getValue("parameter"));
        String a4 = a2.getValue("desc");
        boolean a5 = Boolean.valueOf((String)a2.getValue("visible"));
        this.Field3723.Method1950(((Class267)this.Field3723.Method1963()).Method1971(a3, a4, a5));
    }

    @Override
    public void Method3514(String a) {
        Class148 a2 = (Class148)this.Field3723.Method1964();
        a2.Method401();
    }
}