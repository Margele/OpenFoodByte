/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuffer
 *  org.xml.sax.Attributes
 *  org.xml.sax.ContentHandler
 *  org.xml.sax.helpers.AttributesImpl
 */
package awsl;

import awsl.Class134;
import awsl.Class148;
import awsl.Class167;
import awsl.Class253;
import awsl.Class267;
import awsl.Class273;
import awsl.Class31;
import awsl.Class43;
import awsl.Class663;
import awsl.Class831;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

public final class Class228
extends Class167 {
    Class663 Field1277;
    private final boolean Field1278;
    private static final int Field1279 = 262144;
    private static final int Field1280 = 524288;
    private static final int Field1281 = 0x100000;

    public Class228(ContentHandler a, boolean a2) {
        super(327680);
        this.Field1277 = new Class663(a);
        this.Field1278 = a2;
        this.Field1277.Method2392();
    }

    @Override
    public void Method1458(String a, String a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "file", "file", "", Class228.Method2071(a));
        a3.addAttribute("", "debug", "debug", "", Class228.Method2071(a2));
        this.Field1277.Method2396("source", (Attributes)a3);
    }

    @Override
    public void Method1453(String a, String a2, String a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "owner", "owner", "", a);
        a4.addAttribute("", "name", "name", "", a2);
        a4.addAttribute("", "desc", "desc", "", a3);
        this.Field1277.Method2396("outerclass", (Attributes)a4);
    }

    @Override
    public Class148 Method1448(String a, boolean a2) {
        return new Class134(this.Field1277, "annotation", 1, null, a);
    }

    @Override
    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        return new Class134(this.Field1277, "typeAnnotation", 1, null, a3, a, a2);
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        StringBuffer a7 = new StringBuffer();
        Class228.Method2072(a2 | 0x40000, a7);
        AttributesImpl a8 = new AttributesImpl();
        a8.addAttribute("", "access", "access", "", a7.toString());
        a8.addAttribute("", "name", "name", "", a3);
        a8.addAttribute("", "signature", "signature", "", Class228.Method2071(a4));
        a8.addAttribute("", "parent", "parent", "", a5);
        a8.addAttribute("", "major", "major", "", Integer.toString((int)(a & 0xFFFF)));
        a8.addAttribute("", "minor", "minor", "", Integer.toString((int)(a >>> 16)));
        this.Field1277.Method2394("class", (Attributes)a8);
        this.Field1277.Method2394("interfaces", (Attributes)new AttributesImpl());
        if (a6.length > 0) {
            for (int a9 = 0; a9 < a6.length; ++a9) {
                AttributesImpl a10 = new AttributesImpl();
                a10.addAttribute("", "name", "name", "", a6[a9]);
                this.Field1277.Method2396("interface", (Attributes)a10);
            }
        }
        this.Field1277.Method2395("interfaces");
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        StringBuffer a6 = new StringBuffer();
        Class228.Method2072(a | 0x80000, a6);
        AttributesImpl a7 = new AttributesImpl();
        a7.addAttribute("", "access", "access", "", a6.toString());
        a7.addAttribute("", "name", "name", "", a2);
        a7.addAttribute("", "desc", "desc", "", a3);
        a7.addAttribute("", "signature", "signature", "", Class228.Method2071(a4));
        a7.addAttribute("", "value", "value", "", Class228.Method2071(a5.Method3780()));
        return new Class273(this.Field1277, (Attributes)a7);
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        StringBuffer a6 = new StringBuffer();
        Class228.Method2072(a, a6);
        AttributesImpl a7 = new AttributesImpl();
        a7.addAttribute("", "access", "access", "", a6.toString());
        a7.addAttribute("", "name", "name", "", a2);
        a7.addAttribute("", "desc", "desc", "", a3);
        a7.addAttribute("", "signature", "signature", "", a4);
        this.Field1277.Method2394("method", (Attributes)a7);
        this.Field1277.Method2394("exceptions", (Attributes)new AttributesImpl());
        if (a5.length > 0) {
            for (int a8 = 0; a8 < a5.length; ++a8) {
                AttributesImpl a9 = new AttributesImpl();
                a9.addAttribute("", "name", "name", "", a5[a8]);
                this.Field1277.Method2396("exception", (Attributes)a9);
            }
        }
        this.Field1277.Method2395("exceptions");
        return new Class43(this.Field1277, a);
    }

    @Override
    public final void Method1452(String a, String a2, String a3, int a4) {
        StringBuffer a5 = new StringBuffer();
        Class228.Method2072(a4 | 0x100000, a5);
        AttributesImpl a6 = new AttributesImpl();
        a6.addAttribute("", "access", "access", "", a5.toString());
        a6.addAttribute("", "name", "name", "", a);
        a6.addAttribute("", "outerName", "outerName", "", a2);
        a6.addAttribute("", "innerName", "innerName", "", a3);
        this.Field1277.Method2396("innerclass", (Attributes)a6);
    }

    @Override
    public final void Method1460() {
        this.Field1277.Method2395("class");
        if (!this.Field1278) {
            this.Field1277.Method2393();
        }
    }

    static final String Method2071(String a) {
        StringBuffer a2 = new StringBuffer();
        for (int a3 = 0; a3 < a.length(); ++a3) {
            char a4 = a.charAt(a3);
            if (a4 == '\\') {
                a2.append("\\\\");
                continue;
            }
            if (a4 < ' ' || a4 > '\u007f') {
                a2.append("\\u");
                if (a4 < '\u0010') {
                    a2.append("000");
                } else if (a4 < '\u0100') {
                    a2.append("00");
                } else if (a4 < '\u1000') {
                    a2.append('0');
                }
                a2.append(Integer.toString((int)a4, (int)16));
                continue;
            }
            a2.append(a4);
        }
        return a2.toString();
    }

    static void Method2072(int a, StringBuffer a2) {
        int[] nArray = Class831.Method3658();
        if ((a & 1) != 0) {
            a2.append("public ");
        }
        if ((a & 2) != 0) {
            a2.append("private ");
        }
        if ((a & 4) != 0) {
            a2.append("protected ");
        }
        if ((a & 0x10) != 0) {
            a2.append("final ");
        }
        if ((a & 8) != 0) {
            a2.append("static ");
        }
        if ((a & 0x20) != 0) {
            if ((a & 0x40000) == 0) {
                a2.append("synchronized ");
            }
            a2.append("super ");
        }
        if ((a & 0x40) != 0) {
            if ((a & 0x80000) == 0) {
                a2.append("bridge ");
            }
            a2.append("volatile ");
        }
        if ((a & 0x80) != 0) {
            if ((a & 0x80000) == 0) {
                a2.append("varargs ");
            }
            a2.append("transient ");
        }
        if ((a & 0x100) != 0) {
            a2.append("native ");
        }
        if ((a & 0x800) != 0) {
            a2.append("strict ");
        }
        if ((a & 0x200) != 0) {
            a2.append("interface ");
        }
        if ((a & 0x400) != 0) {
            a2.append("abstract ");
        }
        if ((a & 0x1000) != 0) {
            a2.append("synthetic ");
        }
        if ((a & 0x2000) != 0) {
            a2.append("annotation ");
        }
        if ((a & 0x4000) != 0) {
            a2.append("enum ");
        }
        if ((a & 0x20000) != 0) {
            a2.append("deprecated ");
        }
        if ((a & 0x8000) != 0) {
            a2.append("mandated ");
        }
    }
}