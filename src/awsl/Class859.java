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

import awsl.Class730;
import awsl.Class831;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class Class859
extends Class831 {
    final Class730 Field3756;

    Class859(Class730 a) {
        this.Field3756 = a;
        super(a);
    }

    @Override
    public final void Method3501(String a, Attributes a2) throws SAXException {
        ArrayList a3 = (ArrayList)this.Field3756.Method1963();
        a3.Method2530(this.Method3651(a2.getValue("desc"), a2.getValue("cst")));
    }
}