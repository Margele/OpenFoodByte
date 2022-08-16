/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.util.HashMap
 *  java.util.Map
 *  org.xml.sax.Attributes
 *  org.xml.sax.helpers.AttributesImpl
 */
package awsl;

import awsl.Class134;
import awsl.Class148;
import awsl.Class228;
import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class31;
import awsl.Class663;
import awsl.Class801;
import awsl.Class831;
import java.util.HashMap;
import java.util.Map;
import obfuscate.b;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

public final class Class43
extends Class267 {
    static final String[] Field335 = new String[]{"top", "int", "float", "double", "long", "null", "uninitializedThis"};
    Class663 Field336;
    int Field337;
    private final Map Field338;

    public Class43(Class663 a, int a2) {
        super(327680);
        this.Field336 = a;
        this.Field337 = a2;
        this.Field338 = new HashMap();
    }

    @Override
    public void Method1979(String a, int a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "name", "name", "", a);
        StringBuffer a4 = new StringBuffer();
        Class228.Method2072(a2, a4);
        a3.addAttribute("", "access", "access", "", a4.toString());
        this.Field336.Method2396("parameter", (Attributes)a3);
    }

    @Override
    public final void Method1652() {
        if ((this.Field337 & 0x700) == 0) {
            this.Field336.Method2394("code", (Attributes)new AttributesImpl());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method1845(int a, int a2, Object[] a3, int a4, Object[] a5) {
        AttributesImpl attributesImpl = new AttributesImpl();
        int[] a6 = Class831.Method3658();
        switch (a) {
            case -1: 
            case 0: {
                void a7;
                if (a == -1) {
                    a7.addAttribute("", "type", "type", "", "NEW");
                }
                a7.addAttribute("", "type", "type", "", "FULL");
                this.Field336.Method2394("frame", (Attributes)a7);
                this.Method3242(true, a2, a3);
                this.Method3242(false, a4, a5);
            }
            case 1: {
                void a7;
                a7.addAttribute("", "type", "type", "", "APPEND");
                this.Field336.Method2394("frame", (Attributes)a7);
                this.Method3242(true, a2, a3);
            }
            case 2: {
                void a7;
                a7.addAttribute("", "type", "type", "", "CHOP");
                a7.addAttribute("", "count", "count", "", Integer.toString((int)a2));
                this.Field336.Method2394("frame", (Attributes)a7);
            }
            case 3: {
                void a7;
                a7.addAttribute("", "type", "type", "", "SAME");
                this.Field336.Method2394("frame", (Attributes)a7);
            }
            case 4: {
                void a7;
                a7.addAttribute("", "type", "type", "", "SAME1");
                this.Field336.Method2394("frame", (Attributes)a7);
                this.Method3242(false, 1, a5);
            }
        }
        this.Field336.Method2395("frame");
    }

    private void Method3242(boolean a, int a2, Object[] a3) {
        for (int a4 = 0; a4 < a2; ++a4) {
            Object a5 = a3[a4];
            AttributesImpl a6 = new AttributesImpl();
            if (a5 instanceof String) {
                a6.addAttribute("", "type", "type", "", (String)a5);
            } else if (a5 instanceof Integer) {
                a6.addAttribute("", "type", "type", "", Field335[(Integer)a5]);
            } else {
                a6.addAttribute("", "type", "type", "", "uninitialized");
                a6.addAttribute("", "label", "label", "", this.Method3244((Class264)a5));
            }
            this.Field336.Method2396("local", (Attributes)a6);
        }
    }

    @Override
    public final void Method1948(int a2) {
        this.Field336.Method2396(Class801.Field3575[a2], (Attributes)new AttributesImpl());
    }

    @Override
    public final void Method854(int a2, int a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "value", "value", "", Integer.toString((int)a3));
        this.Field336.Method2396(Class801.Field3575[a2], (Attributes)a4);
    }

    @Override
    public final void Method1840(int a2, int a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "var", "var", "", Integer.toString((int)a3));
        this.Field336.Method2396(Class801.Field3575[a2], (Attributes)a4);
    }

    @Override
    public final void Method1952(int a2, String a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "desc", "desc", "", a3);
        this.Field336.Method2396(Class801.Field3575[a2], (Attributes)a4);
    }

    @Override
    public final void Method1949(int a2, String a3, String a4, String a5) {
        AttributesImpl a6 = new AttributesImpl();
        a6.addAttribute("", "owner", "owner", "", a3);
        a6.addAttribute("", "name", "name", "", a4);
        a6.addAttribute("", "desc", "desc", "", a5);
        this.Field336.Method2396(Class801.Field3575[a2], (Attributes)a6);
    }

    @Override
    public final void Method1954(int a2, String a3, String a4, String a5, boolean a6) {
        AttributesImpl a7 = new AttributesImpl();
        a7.addAttribute("", "owner", "owner", "", a3);
        a7.addAttribute("", "name", "name", "", a4);
        a7.addAttribute("", "desc", "desc", "", a5);
        a7.addAttribute("", "itf", "itf", "", "true");
        this.Field336.Method2396(Class801.Field3575[a2], (Attributes)a7);
    }

    @Override
    public void Method1956(String a2, String a3, Class279 a4, Object[] a5) {
        AttributesImpl a6 = new AttributesImpl();
        a6.addAttribute("", "name", "name", "", a2);
        a6.addAttribute("", "desc", "desc", "", a3);
        a6.addAttribute("", "bsm", "bsm", "", Class228.Method2071(a4.Method2826()));
        this.Field336.Method2394("INVOKEDYNAMIC", (Attributes)a6);
        for (int a7 = 0; a7 < a5.length; ++a7) {
            this.Field336.Method2396("bsmArg", (Attributes)Class43.Method3243(a5[a7]));
        }
        this.Field336.Method2395("INVOKEDYNAMIC");
    }

    @Override
    public final void Method1957(int a2, Class264 a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "label", "label", "", this.Method3244(a3));
        this.Field336.Method2396(Class801.Field3575[a2], (Attributes)a4);
    }

    @Override
    public final void Method1947(Class264 a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "name", "name", "", this.Method3244(a2));
        this.Field336.Method2396("Label", (Attributes)a3);
    }

    @Override
    public final void Method1950(Object a2) {
        this.Field336.Method2396(Class801.Field3575[18], (Attributes)Class43.Method3243(a2));
    }

    private static AttributesImpl Method3243(Object a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "cst", "cst", "", Class228.Method2071(a2.Method3780()));
        a3.addAttribute("", "desc", "desc", "", b.Method3229(a2.getClass()));
        return a3;
    }

    @Override
    public final void Method1841(int a2, int a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "var", "var", "", Integer.toString((int)a2));
        a4.addAttribute("", "inc", "inc", "", Integer.toString((int)a3));
        this.Field336.Method2396(Class801.Field3575[132], (Attributes)a4);
    }

    @Override
    public final void Method1959(int a2, int a3, Class264 a4, Class264[] a5) {
        AttributesImpl a6 = new AttributesImpl();
        a6.addAttribute("", "min", "min", "", Integer.toString((int)a2));
        a6.addAttribute("", "max", "max", "", Integer.toString((int)a3));
        a6.addAttribute("", "dflt", "dflt", "", this.Method3244(a4));
        String a7 = Class801.Field3575[170];
        this.Field336.Method2394(a7, (Attributes)a6);
        for (int a8 = 0; a8 < a5.length; ++a8) {
            AttributesImpl a9 = new AttributesImpl();
            a9.addAttribute("", "name", "name", "", this.Method3244(a5[a8]));
            this.Field336.Method2396("label", (Attributes)a9);
        }
        this.Field336.Method2395(a7);
    }

    @Override
    public final void Method1958(Class264 a2, int[] a3, Class264[] a4) {
        AttributesImpl a5 = new AttributesImpl();
        a5.addAttribute("", "dflt", "dflt", "", this.Method3244(a2));
        String a6 = Class801.Field3575[171];
        this.Field336.Method2394(a6, (Attributes)a5);
        for (int a7 = 0; a7 < a4.length; ++a7) {
            AttributesImpl a8 = new AttributesImpl();
            a8.addAttribute("", "name", "name", "", this.Method3244(a4[a7]));
            a8.addAttribute("", "key", "key", "", Integer.toString((int)a3[a7]));
            this.Field336.Method2396("label", (Attributes)a8);
        }
        this.Field336.Method2395(a6);
    }

    @Override
    public final void Method1951(String a2, int a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "desc", "desc", "", a2);
        a4.addAttribute("", "dims", "dims", "", Integer.toString((int)a3));
        this.Field336.Method2396(Class801.Field3575[197], (Attributes)a4);
    }

    @Override
    public final void Method1960(Class264 a2, Class264 a3, Class264 a4, String a5) {
        AttributesImpl a6 = new AttributesImpl();
        a6.addAttribute("", "start", "start", "", this.Method3244(a2));
        a6.addAttribute("", "end", "end", "", this.Method3244(a3));
        a6.addAttribute("", "handler", "handler", "", this.Method3244(a4));
        a6.addAttribute("", "type", "type", "", a5);
        this.Field336.Method2396("TryCatch", (Attributes)a6);
    }

    @Override
    public final void Method1842(int a2, int a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "maxStack", "maxStack", "", Integer.toString((int)a2));
        a4.addAttribute("", "maxLocals", "maxLocals", "", Integer.toString((int)a3));
        this.Field336.Method2396("Max", (Attributes)a4);
        this.Field336.Method2395("code");
    }

    @Override
    public void Method1843(String a2, String a3, String a4, Class264 a5, Class264 a6, int a7) {
        AttributesImpl a8 = new AttributesImpl();
        a8.addAttribute("", "name", "name", "", a2);
        a8.addAttribute("", "desc", "desc", "", a3);
        a8.addAttribute("", "signature", "signature", "", Class228.Method2071(a4));
        a8.addAttribute("", "start", "start", "", this.Method3244(a5));
        a8.addAttribute("", "end", "end", "", this.Method3244(a6));
        a8.addAttribute("", "var", "var", "", Integer.toString((int)a7));
        this.Field336.Method2396("LocalVar", (Attributes)a8);
    }

    @Override
    public final void Method1981(int a2, Class264 a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "line", "line", "", Integer.toString((int)a2));
        a4.addAttribute("", "start", "start", "", this.Method3244(a3));
        this.Field336.Method2396("LineNumber", (Attributes)a4);
    }

    @Override
    public Class148 Method1968() {
        return new Class134(this.Field336, "annotationDefault", 0, null, null);
    }

    @Override
    public Class148 Method1969(String a2, boolean a3) {
        return new Class134(this.Field336, "annotation", 1, null, a2);
    }

    @Override
    public Class148 Method1970(int a2, Class31 a3, String a4, boolean a5) {
        return new Class134(this.Field336, "typeAnnotation", 1, null, a4, a2, a3);
    }

    @Override
    public Class148 Method1971(int a2, String a3, boolean a4) {
        return new Class134(this.Field336, "parameterAnnotation", 1, a2, a3);
    }

    @Override
    public Class148 Method1973(int a2, Class31 a3, String a4, boolean a5) {
        return new Class134(this.Field336, "insnAnnotation", 1, null, a4, a2, a3);
    }

    @Override
    public Class148 Method1974(int a2, Class31 a3, String a4, boolean a5) {
        return new Class134(this.Field336, "tryCatchAnnotation", 1, null, a4, a2, a3);
    }

    @Override
    public Class148 Method1844(int a2, Class31 a3, Class264[] a4, Class264[] a5, int[] a6, String a7, boolean a8) {
        int a9;
        String[] a10 = new String[a4.length];
        String[] a11 = new String[a5.length];
        for (a9 = 0; a9 < a10.length; ++a9) {
            a10[a9] = this.Method3244(a4[a9]);
        }
        for (a9 = 0; a9 < a11.length; ++a9) {
            a11[a9] = this.Method3244(a5[a9]);
        }
        return new Class134(this.Field336, "localVariableAnnotation", 1, null, a7, a2, a3, a10, a11, a6);
    }

    @Override
    public void Method1653() {
        this.Field336.Method2395("method");
    }

    private final String Method3244(Class264 a2) {
        String a3 = (String)this.Field338.Method2665((Object)a2);
        a3 = Integer.toString((int)this.Field338.Method1799());
        this.Field338.put((Object)a2, (Object)a3);
        return a3;
    }
}