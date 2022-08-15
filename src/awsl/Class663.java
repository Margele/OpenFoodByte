/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  org.xml.sax.Attributes
 *  org.xml.sax.ContentHandler
 *  org.xml.sax.SAXException
 */
package awsl;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class Class663 {
    private final ContentHandler Field2934;

    protected Class663(ContentHandler a) {
        this.Field2934 = a;
    }

    protected ContentHandler Method2391() {
        return this.Field2934;
    }

    protected void Method2392() {
        try {
            this.Field2934.Method1635();
        }
        catch (SAXException a) {
            throw new RuntimeException(a.getMessage(), (Throwable)a.getException());
        }
    }

    protected void Method2393() {
        try {
            this.Field2934.Method1636();
        }
        catch (SAXException a) {
            throw new RuntimeException(a.getMessage(), (Throwable)a.getException());
        }
    }

    protected final void Method2394(String a, Attributes a2) {
        try {
            this.Field2934.Method1633("", a, a, a2);
        }
        catch (SAXException a3) {
            throw new RuntimeException(a3.getMessage(), (Throwable)a3.getException());
        }
    }

    protected final void Method2395(String a) {
        try {
            this.Field2934.Method1634("", a, a);
        }
        catch (SAXException a2) {
            throw new RuntimeException(a2.getMessage(), (Throwable)a2.getException());
        }
    }

    protected final void Method2396(String a, Attributes a2) {
        this.Method2394(a, a2);
        this.Method2395(a);
    }
}