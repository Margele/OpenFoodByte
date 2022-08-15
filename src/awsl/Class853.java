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

final class Class853
extends Class831 {
    final Class730 Field3748;

    Class853(Class730 a) {
        this.Field3748 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        String a3 = a2.getValue("owner");
        String a4 = a2.getValue("name");
        String a5 = a2.getValue("desc");
        this.Field3748.Field3202.Method1453(a3, a4, a5);
    }
}