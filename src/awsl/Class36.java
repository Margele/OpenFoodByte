/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.Map
 */
package awsl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import obfuscate.b;

public class Class36 {
    private final String Field298;
    private final String Field299;
    private static final Map Field300 = new HashMap();

    public Class36(String a, String a2) {
        this.Field298 = a;
        this.Field299 = a2;
    }

    public Class36(String a2, b a3, b[] a4) {
        this(a2, b.Method3226(a3, a4));
    }

    public static Class36 Method3419(Method a2) {
        return new Class36(a2.getName(), b.Method3231(a2));
    }

    public static Class36 Method3420(Constructor a2) {
        return new Class36("<init>", b.Method3230(a2));
    }

    public static Class36 Method3421(String a2) throws IllegalArgumentException {
        return Class36.Method3422(a2, false);
    }

    public static Class36 Method3422(String a2, boolean a3) throws IllegalArgumentException {
        int a4;
        int a5 = a2.indexOf(32);
        int a6 = a2.indexOf(40, a5) + 1;
        int a7 = a2.indexOf(41, a6);
        if (a5 == -1 || a6 == -1 || a7 == -1) {
            throw new IllegalArgumentException();
        }
        String a8 = a2.substring(0, a5);
        String a9 = a2.substring(a5 + 1, a6 - 1).trim();
        StringBuilder a10 = new StringBuilder();
        a10.append('(');
        do {
            String a11;
            if ((a4 = a2.indexOf(44, a6)) == -1) {
                a11 = Class36.Method3423(a2.substring(a6, a7).trim(), a3);
            } else {
                a11 = Class36.Method3423(a2.substring(a6, a4).trim(), a3);
                a6 = a4 + 1;
            }
            a10.append(a11);
        } while (a4 != -1);
        a10.append(')');
        a10.append(Class36.Method3423(a8, a3));
        return new Class36(a9, a10.toString());
    }

    private static String Method3423(String a2, boolean a3) {
        if ("".equals((Object)a2)) {
            return a2;
        }
        StringBuilder a4 = new StringBuilder();
        int a5 = 0;
        while ((a5 = a2.indexOf("[]", a5) + 1) > 0) {
            a4.append('[');
        }
        String a6 = a2.substring(0, a2.length() - a4.length() * 2);
        String a7 = (String)Field300.Method2665((Object)a6);
        a4.append(a7);
        return a4.toString();
    }

    public String Method3424() {
        return this.Field298;
    }

    public String Method3425() {
        return this.Field299;
    }

    public b Method3426() {
        return b.Method3213(this.Field299);
    }

    public b[] Method3427() {
        return b.Method3211(this.Field299);
    }

    public String Method3428() {
        return this.Field298 + this.Field299;
    }

    public boolean Method3429(Object a2) {
        if (!(a2 instanceof Class36)) {
            return false;
        }
        Class36 a3 = (Class36)a2;
        return this.Field298.equals((Object)a3.Field298) && this.Field299.equals((Object)a3.Field299);
    }

    public int Method3430() {
        return this.Field298.hashCode() ^ this.Field299.hashCode();
    }

    static {
        Field300.put((Object)"void", (Object)"V");
        Field300.put((Object)"byte", (Object)"B");
        Field300.put((Object)"char", (Object)"C");
        Field300.put((Object)"double", (Object)"D");
        Field300.put((Object)"float", (Object)"F");
        Field300.put((Object)"int", (Object)"I");
        Field300.put((Object)"long", (Object)"J");
        Field300.put((Object)"short", (Object)"S");
        Field300.put((Object)"boolean", (Object)"Z");
    }

    private static IllegalArgumentException Method3431(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}