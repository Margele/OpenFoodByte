/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  org.xml.sax.Attributes
 *  org.xml.sax.ContentHandler
 *  org.xml.sax.SAXException
 *  org.xml.sax.helpers.DefaultHandler
 */
package awsl;

import awsl.Class672;
import awsl.Class674;
import awsl.Class831;
import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class Class736
extends DefaultHandler {
    private final String Field3222;
    private Class672 Field3223;
    private final Class674 Field3224;
    private boolean Field3225;
    private boolean Field3226 = false;
    private ContentHandler Field3227;

    Class736(Class672 a, Class674 a2, boolean a3) {
        this.Field3222 = "class";
        this.Field3223 = a;
        this.Field3224 = a2;
        this.Field3225 = a3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Method1633(String a, String a2, String a3, Attributes a4) throws SAXException {
        int[] a5 = Class831.Method3658();
        if (this.Field3226) {
            this.Field3227.Method1633(a, a2, a3, a4);
        }
        if (a2.equals((Object)this.Field3222)) {
            String string;
            Class674 class674;
            String a6 = a4.getValue("name");
            if (a6.length() == 0) {
                throw new SAXException("Class element without name attribute.");
            }
            try {
                class674 = this.Field3224;
                string = this.Field3225 ? a6 + ".class.xml" : a6 + ".class";
            }
            catch (IOException a7) {
                throw new SAXException(a7.toString(), (Exception)a7);
            }
            {
                class674.Method2334(string);
            }
            this.Field3227 = this.Field3223.Method2326();
            this.Field3227.Method1635();
            this.Field3227.Method1633(a, a2, a3, a4);
            this.Field3226 = true;
        }
    }

    public final void Method1634(String a, String a2, String a3) throws SAXException {
        if (this.Field3226) {
            this.Field3227.Method1634(a, a2, a3);
            if (a2.equals((Object)this.Field3222)) {
                this.Field3227.Method1636();
                this.Field3226 = false;
                try {
                    this.Field3224.Method2335();
                }
                catch (IOException a4) {
                    throw new SAXException(a4.toString(), (Exception)a4);
                }
            }
        }
    }

    public final void Method1635() throws SAXException {
    }

    public final void Method1636() throws SAXException {
    }

    public final void Method1637(char[] a, int a2, int a3) throws SAXException {
        block0: {
            if (!this.Field3226) break block0;
            this.Field3227.Method1637(a, a2, a3);
        }
    }

    private static Exception Method1642(Exception exception) {
        return exception;
    }
}