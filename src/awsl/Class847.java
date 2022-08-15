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

import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class847
extends Class831 {
    final Class730 Field3739;

    Class847(Class730 a) {
        this.Field3739 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        int a3 = Integer.parseInt((String)a2.getValue("maxStack"));
        int a4 = Integer.parseInt((String)a2.getValue("maxLocals"));
        this.Method3655().Method1842(a3, a4);
    }
}