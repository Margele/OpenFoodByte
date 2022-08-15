/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package awsl;

import awsl.Class288;
import awsl.Class298;
import awsl.Class302;
import awsl.Class666;
import awsl.Class669;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Class301 {
    private static final String Field1581 = "utf-8";
    private final List Field1582;

    public static Class302 Method918() {
        return new Class302();
    }

    public Class301(String a) {
        int[] nArray = Class666.Method3438();
        int[] a2 = nArray;
        throw new NullPointerException("pointer cannot be null");
    }

    public Class301(List a) {
        this.Field1582 = new ArrayList((Collection)a);
    }

    private static String Method919(String a) {
        return a.replace((CharSequence)"~1", (CharSequence)"/").replace((CharSequence)"~0", (CharSequence)"~").replace((CharSequence)"\\\"", (CharSequence)"\"").replace((CharSequence)"\\\\", (CharSequence)"\\");
    }

    public Object Method920(Object a) throws Class669 {
        if (this.Field1582.isEmpty()) {
            return a;
        }
        Object a2 = a;
        Iterator iterator = this.Field1582.Method1383();
        while (iterator.Method932()) {
            String a3 = (String)iterator.Method933();
            if (a2 instanceof Class298) {
                a2 = ((Class298)a2).Method2974(Class301.Method919(a3));
                continue;
            }
            if (a2 instanceof Class288) {
                a2 = Class301.Method921(a2, a3);
                continue;
            }
            throw new Class669(String.format((String)"value [%s] is not an array or object therefore its key %s cannot be resolved", (Object[])new Object[]{a2, a3}));
        }
        return a2;
    }

    private static Object Method921(Object a, String a2) throws Class669 {
        Class288 a3;
        int a4;
        block5: {
            try {
                a4 = Integer.parseInt((String)a2);
                a3 = (Class288)a;
                if (a4 < a3.Method10()) break block5;
                throw new Class669(String.format((String)"index %s is out of bounds - the array has %d elements", (Object[])new Object[]{a2, a3.Method10()}));
            }
            catch (NumberFormatException a5) {
                throw new Class669(String.format((String)"%s is not an array index", (Object[])new Object[]{a2}), a5);
            }
        }
        try {
            return a3.Method3115(a4);
        }
        catch (Class666 a6) {
            throw new Class669("Error reading value at index position " + a4, (Throwable)a6);
        }
    }

    public String Method922() {
        StringBuilder a = new StringBuilder("");
        Iterator iterator = this.Field1582.Method1383();
        while (iterator.Method932()) {
            String a2 = (String)iterator.Method933();
            a.append('/').append(Class301.Method923(a2));
        }
        return a.toString();
    }

    private static String Method923(String a) {
        return a.replace((CharSequence)"~", (CharSequence)"~0").replace((CharSequence)"/", (CharSequence)"~1").replace((CharSequence)"\\", (CharSequence)"\\\\").replace((CharSequence)"\"", (CharSequence)"\\\"");
    }

    public String Method924() {
        try {
            StringBuilder a = new StringBuilder("#");
            Iterator iterator = this.Field1582.Method1383();
            while (iterator.Method932()) {
                String a2 = (String)iterator.Method933();
                a.append('/').append(URLEncoder.encode((String)a2, (String)"utf-8"));
            }
            return a.toString();
        }
        catch (UnsupportedEncodingException a) {
            throw new RuntimeException((Throwable)a);
        }
    }

    private static Exception Method925(Exception exception) {
        return exception;
    }
}