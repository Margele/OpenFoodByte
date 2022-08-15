/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
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

final class Class819
extends Class831 {
    final Class730 Field3657;

    Class819(Class730 a) {
        this.Field3657 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) {
        int a3 = Integer.parseInt((String)a2.getValue("major"));
        int a4 = Integer.parseInt((String)a2.getValue("minor"));
        HashMap a5 = new HashMap();
        a5.put((Object)"version", (Object)new Integer(a4 << 16 | a3));
        a5.put((Object)"access", (Object)a2.getValue("access"));
        a5.put((Object)"name", (Object)a2.getValue("name"));
        a5.put((Object)"parent", (Object)a2.getValue("parent"));
        a5.put((Object)"source", (Object)a2.getValue("source"));
        a5.put((Object)"signature", (Object)a2.getValue("signature"));
        a5.put((Object)"interfaces", (Object)new ArrayList());
        this.Field3657.Method1950(a5);
    }
}