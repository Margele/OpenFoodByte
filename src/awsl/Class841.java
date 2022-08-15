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

import awsl.Class148;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class841
extends Class831 {
    final Class730 Field3729;

    Class841(Class730 a) {
        this.Field3729 = a;
        super(a);
    }

    @Override
    public void Method3501(String a, Attributes a2) {
        Class148 a3 = (Class148)this.Field3729.Method1963();
        a3.Method398(a2.getValue("name"), a2.getValue("desc"), a2.getValue("value"));
    }
}