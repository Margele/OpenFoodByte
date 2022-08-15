/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.xml.sax.Attributes
 */
package awsl;

import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class828
extends Class831 {
    final Class730 Field3675;

    Class828(Class730 a) {
        this.Field3675 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        int a3 = this.Method3656(a2.getValue("access"));
        String a4 = a2.getValue("name");
        String a5 = a2.getValue("outerName");
        String a6 = a2.getValue("innerName");
        this.Field3675.Field3202.Method1452(a4, a5, a6, a3);
    }
}