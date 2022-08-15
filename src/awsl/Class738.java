/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  org.xml.sax.Attributes
 *  org.xml.sax.SAXException
 *  org.xml.sax.ext.LexicalHandler
 *  org.xml.sax.helpers.DefaultHandler
 */
package awsl;

import awsl.Class831;
import java.io.IOException;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

final class Class738
extends DefaultHandler
implements LexicalHandler {
    private static final char[] Field3228 = "                                                                                                        ".toCharArray();
    private Writer Field3229;
    private final boolean Field3230;
    private boolean Field3231 = false;
    private int Field3232 = 0;

    Class738(Writer a, boolean a2) {
        this.Field3229 = a;
        this.Field3230 = a2;
    }

    /*
     * Unable to fully structure code
     */
    public final void Method1633(String a, String a, String a, Attributes a) throws SAXException {
        block6: {
            block5: {
                try {
                    this.Method1653();
                    this.Method1652();
                    this.Field3229.write('<' + a);
                    if (a.getLength() <= 0) break block5;
                }
                catch (IOException a) {
                    throw new SAXException((Exception)a);
                }
                this.Method1650(a);
            }
            if (!this.Field3230) break block6;
            this.Field3231 = true;
            ** GOTO lbl19
        }
        this.Field3229.write(">\n");
lbl19:
        // 2 sources

        this.Field3232 += 2;
    }

    public final void Method1634(String a, String a2, String a3) throws SAXException {
        this.Field3232 -= 2;
        try {
            if (this.Field3231) {
                this.Field3229.write("/>\n");
                this.Field3231 = false;
            } else {
                this.Method1652();
                this.Field3229.write("</" + a3 + ">\n");
            }
        }
        catch (IOException a4) {
            throw new SAXException((Exception)a4);
        }
    }

    public final void Method1636() throws SAXException {
        try {
            this.Field3229.flush();
        }
        catch (IOException a) {
            throw new SAXException((Exception)a);
        }
    }

    public final void Method1643(char[] a, int a2, int a3) throws SAXException {
        try {
            this.Method1653();
            this.Method1652();
            this.Field3229.write("<!-- ");
            this.Field3229.write(a, a2, a3);
            this.Field3229.write(" -->\n");
        }
        catch (IOException a4) {
            throw new SAXException((Exception)a4);
        }
    }

    public final void Method1644(String a, String a2, String a3) throws SAXException {
    }

    public final void Method1645() throws SAXException {
    }

    public final void Method1646(String a) throws SAXException {
    }

    public final void Method1647(String a) throws SAXException {
    }

    public final void Method1648() throws SAXException {
    }

    public final void Method1649() throws SAXException {
    }

    private final void Method1650(Attributes a) throws IOException {
        StringBuffer a2 = new StringBuffer();
        int a3 = a.getLength();
        for (int a4 = 0; a4 < a3; ++a4) {
            a2.append(' ').append(a.getLocalName(a4)).append("=\"").append(Class738.Method1651(a.getValue(a4))).append('\"');
        }
        this.Field3229.write(a2.toString());
    }

    private static final String Method1651(String a) {
        StringBuffer a2 = new StringBuffer(a.length());
        int a3 = 0;
        int[] a4 = Class831.Method3658();
        if (a3 < a.length()) {
            char a5 = a.charAt(a3);
            switch (a5) {
                case '&': {
                    a2.append("&amp;");
                }
                case '<': {
                    a2.append("&lt;");
                }
                case '>': {
                    a2.append("&gt;");
                }
                case '\"': {
                    a2.append("&quot;");
                }
            }
            if (a5 > '\u007f') {
                a2.append("&#").append(Integer.toString((int)a5)).append(';');
            }
            a2.append(a5);
            ++a3;
        }
        return a2.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void Method1652() throws IOException {
        int a = this.Field3232;
        while (true) {
            if (a > Field3228.length) {
                this.Field3229.write(Field3228);
                a -= Field3228.length;
                continue;
            }
            this.Field3229.write(Field3228, 0, a);
            a = 0;
        }
    }

    private final void Method1653() throws IOException {
        if (this.Field3231) {
            this.Field3229.write(">\n");
        }
        this.Field3231 = false;
    }

    private static IOException Method1654(IOException iOException) {
        return iOException;
    }
}