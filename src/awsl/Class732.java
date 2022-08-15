/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  org.xml.sax.SAXException
 */
package awsl;

import awsl.Class167;
import awsl.Class169;
import awsl.Class730;
import awsl.Class892;
import java.io.IOException;
import org.xml.sax.SAXException;

class Class732
extends Class730 {
    final Class169 Field3211;
    final Class892 Field3212;

    Class732(Class892 a, Class167 a2, Class169 class169) {
        this.Field3212 = a;
        this.Field3211 = class169;
        super(a2);
    }

    public void Method1636() throws SAXException {
        try {
            this.Field3212.Field3915.write(this.Field3211.Method1503());
        }
        catch (IOException a) {
            throw new SAXException((Exception)a);
        }
    }
}