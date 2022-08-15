/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  org.xml.sax.Attributes
 */
package awsl;

import awsl.Class730;
import awsl.Class831;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class856
extends Class831 {
    final Class730 Field3750;

    Class856(Class730 a) {
        this.Field3750 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        ((ArrayList)((HashMap)this.Field3750.Method1963()).Method2665((Object)"interfaces")).Method2530((Object)a2.getValue("name"));
    }
}