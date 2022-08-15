/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.xml.sax.Attributes
 */
package awsl;

import awsl.Class264;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class865
extends Class831 {
    final Class730 Field3777;

    Class865(Class730 a) {
        this.Field3777 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        String a3 = a2.getValue("name");
        String a4 = a2.getValue("desc");
        String a5 = a2.getValue("signature");
        Class264 a6 = this.Method3654(a2.getValue("start"));
        Class264 a7 = this.Method3654(a2.getValue("end"));
        int a8 = Integer.parseInt((String)a2.getValue("var"));
        this.Method3655().Method1843(a3, a4, a5, a6, a7, a8);
    }
}