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
import awsl.Class46;
import awsl.Class663;
import awsl.Class831;
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
    public void Method397(String a, Object a2) {
        void a3;
        Class clazz = a2.getClass();
        int[] a4 = Class831.Method3658();
        if (a3.isArray()) {
            Object[] a5;
            int a6;
            Class148 a7 = this.Method400(a);
            if (a2 instanceof byte[]) {
                a6 = 0;
                a5 = (byte[])a2;
                if (a6 < a5.length) {
                    a7.Method397(null, new Byte(a5[a6]));
                    ++a6;
                }
            }
            if (a2 instanceof char[]) {
                a6 = 0;
                a5 = (char[])a2;
                if (a6 < a5.length) {
                    a7.Method397(null, new Character((char)a5[a6]));
                    ++a6;
                }
            }
            if (a2 instanceof short[]) {
                a6 = 0;
                a5 = (short[])a2;
                if (a6 < a5.length) {
                    a7.Method397(null, new Short((short)a5[a6]));
                    ++a6;
                }
            }
            if (a2 instanceof boolean[]) {
                a6 = 0;
                a5 = (boolean[])a2;
                if (a6 < a5.length) {
                    a7.Method397(null, a5[a6]);
                    ++a6;
                }
            }
            if (a2 instanceof int[]) {
                a6 = 0;
                a5 = (int[])a2;
                if (a6 < a5.length) {
                    a7.Method397(null, new Integer((int)a5[a6]));
                    ++a6;
                }
            }
            if (a2 instanceof long[]) {
                a6 = 0;
                a5 = (long[])a2;
                if (a6 < a5.length) {
                    a7.Method397(null, new Long((long)a5[a6]));
                    ++a6;
                }
            }
            if (a2 instanceof float[]) {
                a6 = 0;
                a5 = (float[])a2;
                if (a6 < a5.length) {
                    a7.Method397(null, new Float((float)a5[a6]));
                    ++a6;
                }
            }
            if (a2 instanceof double[] && (a6 = 0) < (a5 = (Object[])((double[])a2)).length) {
                a7.Method397(null, new Double((double)a5[a6]));
                ++a6;
            }
            a7.Method401();
        }
        this.Method449("annotationValue", a, Class46.Method3229((Class)a3), a2.Method3780());
    }

    @Override
    public void Method398(String a, String a2, String a3) {
        this.Method449("annotationValueEnum", a, a2, a3);
    }

    @Override
    public Class148 Method399(String a, String a2) {
        return new Class134(this.Field983, "annotationValueAnnotation", 0, a, a2);
    }

    @Override
    public Class148 Method400(String a) {
        return new Class134(this.Field983, "annotationValueArray", 0, a, null);
    }

    @Override
    public void Method401() {
        this.Field983.Method2395(this.Field984);
    }

    private void Method449(String a, String a2, String a3, String a4) {
        AttributesImpl a5 = new AttributesImpl();
        a5.addAttribute("", "name", "name", "", a2);
        a5.addAttribute("", "desc", "desc", "", a3);
        a5.addAttribute("", "value", "value", "", Class228.Method2071(a4));
        this.Field983.Method2396(a, (Attributes)a5);
    }
}