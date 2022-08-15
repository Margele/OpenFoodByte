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

import awsl.Class267;
import awsl.Class730;
import awsl.Class831;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class850
extends Class831 {
    final Class730 Field3746;

    Class850(Class730 a) {
        this.Field3746 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        this.Field3746.Field3203 = new HashMap();
        HashMap a3 = new HashMap();
        a3.put((Object)"access", (Object)a2.getValue("access"));
        a3.put((Object)"name", (Object)a2.getValue("name"));
        a3.put((Object)"desc", (Object)a2.getValue("desc"));
        a3.put((Object)"signature", (Object)a2.getValue("signature"));
        a3.put((Object)"exceptions", (Object)new ArrayList());
        this.Field3746.Method1950(a3);
    }

    @Override
    public final void Method3514(String a) {
        ((Class267)this.Field3746.Method1964()).Method1653();
        this.Field3746.Field3203 = null;
    }
}