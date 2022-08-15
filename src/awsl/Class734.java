/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.xml.sax.Attributes
 *  org.xml.sax.ContentHandler
 *  org.xml.sax.SAXException
 *  org.xml.sax.helpers.DefaultHandler
 */
package awsl;

import awsl.Class672;
import awsl.Class831;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class Class734
extends DefaultHandler {
    private String Field3217;
    private final ContentHandler Field3218;
    private Class672 Field3219;
    private boolean Field3220 = false;
    private ContentHandler Field3221;

    Class734(String a, ContentHandler a2, Class672 a3) {
        this.Field3217 = a;
        this.Field3218 = a2;
        this.Field3219 = a3;
    }

    public final void Method1633(String a, String a2, String a3, Attributes a4) throws SAXException {
        block2: {
            int[] nArray = Class831.Method3658();
            if (this.Field3220) {
                this.Field3221.Method1633(a, a2, a3, a4);
            }
            if (a2.equals((Object)this.Field3217)) {
                this.Field3221 = this.Field3219.Method2326();
                this.Field3221.Method1635();
                this.Field3221.Method1633(a, a2, a3, a4);
                this.Field3220 = true;
            }
            if (this.Field3218 == null) break block2;
            this.Field3218.Method1633(a, a2, a3, a4);
        }
    }

    public final void Method1634(String a, String a2, String a3) throws SAXException {
        block2: {
            block1: {
                int[] nArray = Class831.Method3658();
                if (!this.Field3220) break block1;
                this.Field3221.Method1634(a, a2, a3);
                if (!a2.equals((Object)this.Field3217)) break block2;
                this.Field3221.Method1636();
                this.Field3220 = false;
            }
            if (this.Field3218 != null) {
                this.Field3218.Method1634(a, a2, a3);
            }
        }
    }

    public final void Method1635() throws SAXException {
        block0: {
            if (this.Field3218 == null) break block0;
            this.Field3218.Method1635();
        }
    }

    public final void Method1636() throws SAXException {
        block0: {
            if (this.Field3218 == null) break block0;
            this.Field3218.Method1636();
        }
    }

    public final void Method1637(char[] a, int a2, int a3) throws SAXException {
        block1: {
            block0: {
                if (!this.Field3220) break block0;
                this.Field3221.Method1637(a, a2, a3);
                break block1;
            }
            if (this.Field3218 == null) break block1;
            this.Field3218.Method1637(a, a2, a3);
        }
    }

    private static SAXException Method1638(SAXException sAXException) {
        return sAXException;
    }
}