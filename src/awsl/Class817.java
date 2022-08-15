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

import awsl.Class148;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class817
extends Class831 {
    final Class730 Field3654;

    Class817(Class730 a) {
        this.Field3654 = a;
        super(a);
    }

    @Override
    public void Method3501(String a, Attributes a2) throws SAXException {
        Class148 a3 = (Class148)this.Field3654.Method1963();
        a3.Method397(a2.getValue("name"), this.Method3651(a2.getValue("desc"), a2.getValue("value")));
    }

    private static SAXException Method3677(SAXException sAXException) {
        return sAXException;
    }
}