/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.xml.sax.Attributes
 *  org.xml.sax.SAXException
 */
package awsl;

import awsl.Class253;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class823
extends Class831 {
    final Class730 Field3660;

    Class823(Class730 a) {
        this.Field3660 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) throws SAXException {
        int a3 = this.Method3656(a2.getValue("access"));
        String a4 = a2.getValue("name");
        String a5 = a2.getValue("signature");
        String a6 = a2.getValue("desc");
        Object a7 = this.Method3651(a6, a2.getValue("value"));
        this.Field3660.Method1950(this.Field3660.Field3202.Method1450(a3, a4, a6, a5, a7));
    }

    @Override
    public void Method3514(String a) {
        ((Class253)this.Field3660.Method1964()).Method2121();
    }
}