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

final class Class870
extends Class831 {
    final Class730 Field3802;

    Class870(Class730 a) {
        this.Field3802 = a;
        super(a);
    }

    @Override
    public void Method3501(String a, Attributes a2) {
        String a3 = a2.getValue("file");
        String a4 = a2.getValue("debug");
        this.Field3802.Field3202.Method1458(a3, a4);
    }
}