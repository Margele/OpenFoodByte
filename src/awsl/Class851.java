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

import awsl.Class730;
import awsl.Class807;
import awsl.Class831;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class851
extends Class831 {
    final Class730 Field3747;

    Class851(Class730 a) {
        this.Field3747 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) throws SAXException {
        Class807 class807 = (Class807)Class730.Field3206.Method2665((Object)a);
        int[] a3 = Class831.Method3658();
        throw new SAXException("Invalid element: " + a + " at " + this.Field3747.Field3201);
    }

    private static SAXException Method3677(SAXException sAXException) {
        return sAXException;
    }
}