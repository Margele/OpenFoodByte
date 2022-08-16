/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuffer
 *  org.xml.sax.Attributes
 *  org.xml.sax.helpers.AttributesImpl
 */
package awsl;

import awsl.Class148;
import awsl.Class228;
import awsl.Class31;
import awsl.Class663;
import awsl.Class831;
import obfuscate.b;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

public final class Class134
extends Class148 {
    Class663 Field983;
    private final String Field984;

    public Class134(Class663 a, String a2, int a3, String a4, String a5) {
        this(327680, a, a2, a3, a5, a4, -1, -1, null, null, null, null);
    }

    public Class134(Class663 a, String a2, int a3, int a4, String a5) {
        this(327680, a, a2, a3, a5, null, a4, -1, null, null, null, null);
    }

    public Class134(Class663 a, String a2, int a3, String a4, String a5, int a6, Class31 a7) {
        this(327680, a, a2, a3, a5, a4, -1, a6, a7, null, null, null);
    }

    public Class134(Class663 a, String a2, int a3, String a4, String a5, int a6, Class31 a7, String[] a8, String[] a9, int[] a10) {
        this(327680, a, a2, a3, a5, a4, -1, a6, a7, a8, a9, a10);
    }

    protected Class134(int a, Class663 a2, String a3, int a4, String a5, String a6, int a7) {
        this(a, a2, a3, a4, a5, a6, a7, -1, null, null, null, null);
    }

    protected Class134(int a, Class663 a2, String a3, int a4, String a5, String a6, int a7, int a8, Class31 a9, String[] a10, String[] a11, int[] a12) {
        super(a);
        int a13;
        this.Field983 = a2;
        this.Field984 = a3;
        AttributesImpl a14 = new AttributesImpl();
        a14.addAttribute("", "name", "name", "", a6);
        a14.addAttribute("", "visible", "visible", "", "true");
        if (a7 != -1) {
            a14.addAttribute("", "parameter", "parameter", "", Integer.toString((int)a7));
        }
        a14.addAttribute("", "desc", "desc", "", a5);
        if (a8 != -1) {
            a14.addAttribute("", "typeRef", "typeRef", "", Integer.toString((int)a8));
        }
        a14.addAttribute("", "typePath", "typePath", "", a9.Method3436());
        StringBuffer a15 = new StringBuffer(a10[0]);
        for (a13 = 1; a13 < a10.length; ++a13) {
            a15.append(" ").append(a10[a13]);
        }
        a14.addAttribute("", "start", "start", "", a15.toString());
        a15 = new StringBuffer(a11[0]);
        for (a13 = 1; a13 < a11.length; ++a13) {
            a15.append(" ").append(a11[a13]);
        }
        a14.addAttribute("", "end", "end", "", a15.toString());
        a15 = new StringBuffer();
        a15.append(a12[0]);
        for (a13 = 1; a13 < a12.length; ++a13) {
            a15.append(" ").append(a12[a13]);
        }
        a14.addAttribute("", "index", "index", "", a15.toString());
        a2.Method2394(a3, (Attributes)a14);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method397(String a2, Object a3) {
        void a4;
        Class clazz = a3.getClass();
        int[] a5 = Class831.Method3658();
        if (a4.isArray()) {
            Object[] a6;
            int a7;
            Class148 a8 = this.Method400(a2);
            if (a3 instanceof byte[]) {
                a7 = 0;
                a6 = (byte[])a3;
                if (a7 < a6.length) {
                    a8.Method397(null, new Byte(a6[a7]));
                    ++a7;
                }
            }
            if (a3 instanceof char[]) {
                a7 = 0;
                a6 = (char[])a3;
                if (a7 < a6.length) {
                    a8.Method397(null, new Character((char)a6[a7]));
                    ++a7;
                }
            }
            if (a3 instanceof short[]) {
                a7 = 0;
                a6 = (short[])a3;
                if (a7 < a6.length) {
                    a8.Method397(null, new Short((short)a6[a7]));
                    ++a7;
                }
            }
            if (a3 instanceof boolean[]) {
                a7 = 0;
                a6 = (boolean[])a3;
                if (a7 < a6.length) {
                    a8.Method397(null, a6[a7]);
                    ++a7;
                }
            }
            if (a3 instanceof int[]) {
                a7 = 0;
                a6 = (int[])a3;
                if (a7 < a6.length) {
                    a8.Method397(null, new Integer((int)a6[a7]));
                    ++a7;
                }
            }
            if (a3 instanceof long[]) {
                a7 = 0;
                a6 = (long[])a3;
                if (a7 < a6.length) {
                    a8.Method397(null, new Long((long)a6[a7]));
                    ++a7;
                }
            }
            if (a3 instanceof float[]) {
                a7 = 0;
                a6 = (float[])a3;
                if (a7 < a6.length) {
                    a8.Method397(null, new Float((float)a6[a7]));
                    ++a7;
                }
            }
            if (a3 instanceof double[] && (a7 = 0) < (a6 = (Object[])((double[])a3)).length) {
                a8.Method397(null, new Double((double)a6[a7]));
                ++a7;
            }
            a8.Method401();
        }
        this.Method449("annotationValue", a2, b.Method3229((Class)a4), a3.Method3780());
    }

    @Override
    public void Method398(String a2, String a3, String a4) {
        this.Method449("annotationValueEnum", a2, a3, a4);
    }

    @Override
    public Class148 Method399(String a2, String a3) {
        return new Class134(this.Field983, "annotationValueAnnotation", 0, a2, a3);
    }

    @Override
    public Class148 Method400(String a2) {
        return new Class134(this.Field983, "annotationValueArray", 0, a2, null);
    }

    @Override
    public void Method401() {
        this.Field983.Method2395(this.Field984);
    }

    private void Method449(String a2, String a3, String a4, String a5) {
        AttributesImpl a6 = new AttributesImpl();
        a6.addAttribute("", "name", "name", "", a3);
        a6.addAttribute("", "desc", "desc", "", a4);
        a6.addAttribute("", "value", "value", "", Class228.Method2071(a5));
        this.Field983.Method2396(a2, (Attributes)a6);
    }
}