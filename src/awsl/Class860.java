/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  org.xml.sax.Attributes
 *  org.xml.sax.SAXException
 */
package awsl;

import awsl.Class279;
import awsl.Class730;
import awsl.Class831;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class860
extends Class831 {
    final Class730 Field3757;

    Class860(Class730 a) {
        this.Field3757 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) throws SAXException {
        this.Field3757.Method1950(a2.getValue("name"));
        this.Field3757.Method1950(a2.getValue("desc"));
        this.Field3757.Method1950(this.Method3652(a2.getValue("bsm")));
        this.Field3757.Method1950(new ArrayList());
    }

    @Override
    public final void Method3514(String a) {
        ArrayList a2 = (ArrayList)this.Field3757.Method1964();
        Class279 a3 = (Class279)this.Field3757.Method1964();
        String a4 = (String)this.Field3757.Method1964();
        String a5 = (String)this.Field3757.Method1964();
        this.Method3655().Method1956(a5, a4, a3, a2.toArray());
    }
}