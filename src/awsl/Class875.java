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

import awsl.Class264;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class875
extends Class831 {
    final Class730 Field3810;

    Class875(Class730 a) {
        this.Field3810 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        Class264 a3 = this.Method3654(a2.getValue("start"));
        Class264 a4 = this.Method3654(a2.getValue("end"));
        Class264 a5 = this.Method3654(a2.getValue("handler"));
        String a6 = a2.getValue("type");
        this.Method3655().Method1960(a3, a4, a5, a6);
    }
}