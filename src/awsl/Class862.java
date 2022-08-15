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

final class Class862
extends Class831 {
    final Class730 Field3769;

    Class862(Class730 a) {
        this.Field3769 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        this.Method3655().Method1947(this.Method3654(a2.getValue("name")));
    }
}