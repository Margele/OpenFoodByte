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

final class Class844
extends Class831 {
    final Class730 Field3732;

    Class844(Class730 a) {
        this.Field3732 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        HashMap a3 = (HashMap)this.Field3732.Method1963();
        ((ArrayList)a3.Method2665((Object)"labels")).Method2530((Object)this.Method3654(a2.getValue("name")));
        ((ArrayList)a3.Method2665((Object)"keys")).Method2530((Object)a2.getValue("key"));
    }
}