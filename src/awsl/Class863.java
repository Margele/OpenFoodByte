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

final class Class863
extends Class831 {
    final Class730 Field3770;

    Class863(Class730 a) {
        this.Field3770 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        int a3 = Integer.parseInt((String)a2.getValue("line"));
        Class264 a4 = this.Method3654(a2.getValue("start"));
        this.Method3655().Method1981(a3, a4);
    }
}