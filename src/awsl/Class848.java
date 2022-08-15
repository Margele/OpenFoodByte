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

final class Class848
extends Class831 {
    final Class730 Field3740;

    Class848(Class730 a) {
        this.Field3740 = a;
        super(a);
    }

    @Override
    public void Method3501(String a, Attributes a2) {
        String a3 = a2.getValue("name");
        int a4 = this.Method3656(a2.getValue("access"));
        this.Method3655().Method1979(a3, a4);
    }
}