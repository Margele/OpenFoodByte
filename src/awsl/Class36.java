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

import awsl.Class46;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Class36 {
    private final String Field298;
    private final String Field299;
    private static final Map Field300 = new HashMap();

    public Class36(String a, String a2) {
        this.Field298 = a;
        this.Field299 = a2;
    }

    public Class36(String a, Class46 a2, Class46[] a3) {
        this(a, Class46.Method3226(a2, a3));
    }

    public static Class36 Method3419(Method a) {
        return new Class36(a.getName(), Class46.Method3231(a));
    }

    public static Class36 Method3420(Constructor a) {
        return new Class36("<init>", Class46.Method3230(a));
    }

    public static Class36 Method3421(String a) throws IllegalArgumentException {
        return Class36.Method3422(a, false);
    }

    public static Class36 Method3422(String a, boolean a2) throws IllegalArgumentException {
        int a3;
        int a4 = a.indexOf(32);
        int a5 = a.indexOf(40, a4) + 1;
        int a6 = a.indexOf(41, a5);
        if (a4 == -1 || a5 == -1 || a6 == -1) {
            throw new IllegalArgumentException();
        }
        String a7 = a.substring(0, a4);
        String a8 = a.substring(a4 + 1, a5 - 1).trim();
        StringBuilder a9 = new StringBuilder();
        a9.append('(');
        do {
            String a10;
            if ((a3 = a.indexOf(44, a5)) == -1) {
                a10 = Class36.Method3423(a.substring(a5, a6).trim(), a2);
            } else {
                a10 = Class36.Method3423(a.substring(a5, a3).trim(), a2);
                a5 = a3 + 1;
            }
            a9.append(a10);
        } while (a3 != -1);
        a9.append(')');
        a9.append(Class36.Method3423(a7, a2));
        return new Class36(a8, a9.toString());
    }

    private static String Method3423(String a, boolean a2) {
        if ("".equals((Object)a)) {
            return a;
        }
        StringBuilder a3 = new StringBuilder();
        int a4 = 0;
        while ((a4 = a.indexOf("[]", a4) + 1) > 0) {
            a3.append('[');
        }
        String a5 = a.substring(0, a.length() - a3.length() * 2);
        String a6 = (String)Field300.Method2665((Object)a5);
        a3.append(a6);
        return a3.toString();
    }

    public String Method3424() {
        return this.Field298;
    }

    public String Method3425() {
        return this.Field299;
    }

    public Class46 Method3426() {
        return Class46.Method3213(this.Field299);
    }

    public Class46[] Method3427() {
        return Class46.Method3211(this.Field299);
    }

    public String Method3428() {
        return this.Field298 + this.Field299;
    }

    public boolean Method3429(Object a) {
        if (!(a instanceof Class36)) {
            return false;
        }
        Class36 a2 = (Class36)a;
        return this.Field298.equals((Object)a2.Field298) && this.Field299.equals((Object)a2.Field299);
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