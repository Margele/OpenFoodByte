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
import awsl.Class46;
import awsl.Class663;
import awsl.Class801;
import awsl.Class831;
import java.util.HashMap;
import java.util.Map;
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
    public final void Method1948(int a) {
        this.Field336.Method2396(Class801.Field3575[a], (Attributes)new AttributesImpl());
    }

    @Override
    public final void Method854(int a, int a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "value", "value", "", Integer.toString((int)a2));
        this.Field336.Method2396(Class801.Field3575[a], (Attributes)a3);
    }

    @Override
    public final void Method1840(int a, int a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "var", "var", "", Integer.toString((int)a2));
        this.Field336.Method2396(Class801.Field3575[a], (Attributes)a3);
    }

    @Override
    public final void Method1952(int a, String a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "desc", "desc", "", a2);
        this.Field336.Method2396(Class801.Field3575[a], (Attributes)a3);
    }

    @Override
    public final void Method1949(int a, String a2, String a3, String a4) {
        AttributesImpl a5 = new AttributesImpl();
        a5.addAttribute("", "owner", "owner", "", a2);
        a5.addAttribute("", "name", "name", "", a3);
        a5.addAttribute("", "desc", "desc", "", a4);
        this.Field336.Method2396(Class801.Field3575[a], (Attributes)a5);
    }

    @Override
    public final void Method1954(int a, String a2, String a3, String a4, boolean a5) {
        AttributesImpl a6 = new AttributesImpl();
        a6.addAttribute("", "owner", "owner", "", a2);
        a6.addAttribute("", "name", "name", "", a3);
        a6.addAttribute("", "desc", "desc", "", a4);
        a6.addAttribute("", "itf", "itf", "", "true");
        this.Field336.Method2396(Class801.Field3575[a], (Attributes)a6);
    }

    @Override
    public void Method1956(String a, String a2, Class279 a3, Object[] a4) {
        AttributesImpl a5 = new AttributesImpl();
        a5.addAttribute("", "name", "name", "", a);
        a5.addAttribute("", "desc", "desc", "", a2);
        a5.addAttribute("", "bsm", "bsm", "", Class228.Method2071(a3.Method2826()));
        this.Field336.Method2394("INVOKEDYNAMIC", (Attributes)a5);
        for (int a6 = 0; a6 < a4.length; ++a6) {
            this.Field336.Method2396("bsmArg", (Attributes)Class43.Method3243(a4[a6]));
        }
        this.Field336.Method2395("INVOKEDYNAMIC");
    }

    @Override
    public final void Method1957(int a, Class264 a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "label", "label", "", this.Method3244(a2));
        this.Field336.Method2396(Class801.Field3575[a], (Attributes)a3);
    }

    @Override
    public final void Method1947(Class264 a) {
        AttributesImpl a2 = new AttributesImpl();
        a2.addAttribute("", "name", "name", "", this.Method3244(a));
        this.Field336.Method2396("Label", (Attributes)a2);
    }

    @Override
    public final void Method1950(Object a) {
        this.Field336.Method2396(Class801.Field3575[18], (Attributes)Class43.Method3243(a));
    }

    private static AttributesImpl Method3243(Object a) {
        AttributesImpl a2 = new AttributesImpl();
        a2.addAttribute("", "cst", "cst", "", Class228.Method2071(a.Method3780()));
        a2.addAttribute("", "desc", "desc", "", Class46.Method3229(a.getClass()));
        return a2;
    }

    @Override
    public final void Method1841(int a, int a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "var", "var", "", Integer.toString((int)a));
        a3.addAttribute("", "inc", "inc", "", Integer.toString((int)a2));
        this.Field336.Method2396(Class801.Field3575[132], (Attributes)a3);
    }

    @Override
    public final void Method1959(int a, int a2, Class264 a3, Class264[] a4) {
        AttributesImpl a5 = new AttributesImpl();
        a5.addAttribute("", "min", "min", "", Integer.toString((int)a));
        a5.addAttribute("", "max", "max", "", Integer.toString((int)a2));
        a5.addAttribute("", "dflt", "dflt", "", this.Method3244(a3));
        String a6 = Class801.Field3575[170];
        this.Field336.Method2394(a6, (Attributes)a5);
        for (int a7 = 0; a7 < a4.length; ++a7) {
            AttributesImpl a8 = new AttributesImpl();
            a8.addAttribute("", "name", "name", "", this.Method3244(a4[a7]));
            this.Field336.Method2396("label", (Attributes)a8);
        }
        this.Field336.Method2395(a6);
    }

    @Override
    public final void Method1958(Class264 a, int[] a2, Class264[] a3) {
        AttributesImpl a4 = new AttributesImpl();
        a4.addAttribute("", "dflt", "dflt", "", this.Method3244(a));
        String a5 = Class801.Field3575[171];
        this.Field336.Method2394(a5, (Attributes)a4);
        for (int a6 = 0; a6 < a3.length; ++a6) {
            AttributesImpl a7 = new AttributesImpl();
            a7.addAttribute("", "name", "name", "", this.Method3244(a3[a6]));
            a7.addAttribute("", "key", "key", "", Integer.toString((int)a2[a6]));
            this.Field336.Method2396("label", (Attributes)a7);
        }
        this.Field336.Method2395(a5);
    }

    @Override
    public final void Method1951(String a, int a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "desc", "desc", "", a);
        a3.addAttribute("", "dims", "dims", "", Integer.toString((int)a2));
        this.Field336.Method2396(Class801.Field3575[197], (Attributes)a3);
    }

    @Override
    public final void Method1960(Class264 a, Class264 a2, Class264 a3, String a4) {
        AttributesImpl a5 = new AttributesImpl();
        a5.addAttribute("", "start", "start", "", this.Method3244(a));
        a5.addAttribute("", "end", "end", "", this.Method3244(a2));
        a5.addAttribute("", "handler", "handler", "", this.Method3244(a3));
        a5.addAttribute("", "type", "type", "", a4);
        this.Field336.Method2396("TryCatch", (Attributes)a5);
    }

    @Override
    public final void Method1842(int a, int a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "maxStack", "maxStack", "", Integer.toString((int)a));
        a3.addAttribute("", "maxLocals", "maxLocals", "", Integer.toString((int)a2));
        this.Field336.Method2396("Max", (Attributes)a3);
        this.Field336.Method2395("code");
    }

    @Override
    public void Method1843(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        AttributesImpl a7 = new AttributesImpl();
        a7.addAttribute("", "name", "name", "", a);
        a7.addAttribute("", "desc", "desc", "", a2);
        a7.addAttribute("", "signature", "signature", "", Class228.Method2071(a3));
        a7.addAttribute("", "start", "start", "", this.Method3244(a4));
        a7.addAttribute("", "end", "end", "", this.Method3244(a5));
        a7.addAttribute("", "var", "var", "", Integer.toString((int)a6));
        this.Field336.Method2396("LocalVar", (Attributes)a7);
    }

    @Override
    public final void Method1981(int a, Class264 a2) {
        AttributesImpl a3 = new AttributesImpl();
        a3.addAttribute("", "line", "line", "", Integer.toString((int)a));
        a3.addAttribute("", "start", "start", "", this.Method3244(a2));
        this.Field336.Method2396("LineNumber", (Attributes)a3);
    }

    @Override
    public Class148 Method1968() {
        return new Class134(this.Field336, "annotationDefault", 0, null, null);
    }

    @Override
    public Class148 Method1969(String a, boolean a2) {
        return new Class134(this.Field336, "annotation", 1, null, a);
    }

    @Override
    public Class148 Method1970(int a, Class31 a2, String a3, boolean a4) {
        return new Class134(this.Field336, "typeAnnotation", 1, null, a3, a, a2);
    }

    @Override
    public Class148 Method1971(int a, String a2, boolean a3) {
        return new Class134(this.Field336, "parameterAnnotation", 1, a, a2);
    }

    @Override
    public Class148 Method1973(int a, Class31 a2, String a3, boolean a4) {
        return new Class134(this.Field336, "insnAnnotation", 1, null, a3, a, a2);
    }

    @Override
    public Class148 Method1974(int a, Class31 a2, String a3, boolean a4) {
        return new Class134(this.Field336, "tryCatchAnnotation", 1, null, a3, a, a2);
    }

    @Override
    public Class148 Method1844(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        int a8;
        String[] a9 = new String[a3.length];
        String[] a10 = new String[a4.length];
        for (a8 = 0; a8 < a9.length; ++a8) {
            a9[a8] = this.Method3244(a3[a8]);
        }
        for (a8 = 0; a8 < a10.length; ++a8) {
            a10[a8] = this.Method3244(a4[a8]);
        }
        return new Class134(this.Field336, "localVariableAnnotation", 1, null, a6, a, a2, a9, a10, a5);
    }

    @Override
    public void Method1653() {
        this.Field336.Method2395("method");
    }

    private final String Method3244(Class264 a) {
        String a2 = (String)this.Field338.Method2665((Object)a);
        a2 = Integer.toString((int)this.Field338.Method1799());
        this.Field338.put((Object)a, (Object)a2);
        return a2;
    }
}