/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Locale
 */
package awsl;

import awsl.Class290;
import awsl.Class298;
import awsl.Class666;
import java.util.Iterator;
import java.util.Locale;
import obfuscate.a;

public class Class568 {
    public static String Method1249(String a) {
        String a2 = a.trim();
        int a3 = a2.length();
        StringBuilder a4 = new StringBuilder(a3);
        for (int a5 = 0; a5 < a3; ++a5) {
            char a6 = a2.charAt(a5);
            if (a6 < ' ' || a6 == '+' || a6 == '%' || a6 == '=' || a6 == ';') {
                a4.append('%');
                a4.append(Character.forDigit((int)((char)(a6 >>> 4 & 0xF)), (int)16));
                a4.append(Character.forDigit((int)((char)(a6 & 0xF)), (int)16));
                continue;
            }
            a4.append(a6);
        }
        return a4.toString();
    }

    public static Class298 Method1250(String a) {
        Class298 a2 = new Class298();
        Class290 a3 = new Class290(a);
        String a4 = Class568.Method1252(a3.Method2891('=').trim());
        if ("".equals((Object)a4)) {
            throw new Class666("Cookies must have a 'name'");
        }
        a2.Method3009("name", a4);
        a3.Method2887('=');
        a2.Method3009("value", Class568.Method1252(a3.Method2891(';')).trim());
        a3.Method2885();
        while (a3.Method2884()) {
            Object a5;
            a4 = Class568.Method1252(a3.Method2892("=;")).trim().toLowerCase(Locale.ROOT);
            if ("name".equalsIgnoreCase(a4)) {
                throw new Class666("Illegal attribute name: 'name'");
            }
            if ("value".equalsIgnoreCase(a4)) {
                throw new Class666("Illegal attribute name: 'value'");
            }
            if (a3.Method2885() != '=') {
                a5 = Boolean.TRUE;
            } else {
                a5 = Class568.Method1252(a3.Method2891(';')).trim();
                a3.Method2885();
            }
            if ("".equals((Object)a4) || "".equals(a5)) continue;
            a2.Method3009(a4, a5);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static String Method1251(Class298 a2) throws Class666 {
        String string;
        block7: {
            void a3;
            String a4;
            StringBuilder stringBuilder = new StringBuilder();
            String a5 = null;
            int[] a6 = Class666.Method3438();
            Object a7 = null;
            Iterator iterator = a2.Method2968().Method1383();
            if (iterator.Method932()) {
                a4 = (String)iterator.Method933();
                if ("name".equalsIgnoreCase(a4)) {
                    a5 = a2.Method2963(a4).trim();
                }
                if ("value".equalsIgnoreCase(a4)) {
                    a7 = a2.Method2963(a4).trim();
                }
            }
            if ("".equals((Object)a5.trim())) {
                throw new Class666("Cookie does not have a name");
            }
            a7 = "";
            a3.append(Class568.Method1249(a5));
            a3.append("=");
            a3.append(Class568.Method1249((String)a7));
            iterator = a2.Method2968().Method1383();
            while (iterator.Method932()) {
                a4 = (String)iterator.Method933();
                if ("name".equalsIgnoreCase(a4)) continue;
                if ("value".equalsIgnoreCase(a4)) {
                }
                if ((a7 = a2.Method2974(a4)) instanceof Boolean) {
                    if (!Boolean.TRUE.equals(a7)) break;
                    a3.append(';').append(Class568.Method1249(a4));
                }
                a3.append(';').append(Class568.Method1249(a4)).append('=').append(Class568.Method1249(a7.Method3780()));
                break;
            }
            string = a3.toString();
            if (a.trash() != null) break block7;
            Class666.Method85(new int[2]);
        }
        return string;
    }

    public static String Method1252(String a2) {
        int a3 = a2.length();
        StringBuilder a4 = new StringBuilder(a3);
        for (int a5 = 0; a5 < a3; ++a5) {
            char a6 = a2.charAt(a5);
            if (a6 == '+') {
                a6 = ' ';
            } else if (a6 == '%' && a5 + 2 < a3) {
                int a7 = Class290.Method2882(a2.charAt(a5 + 1));
                int a8 = Class290.Method2882(a2.charAt(a5 + 2));
                a6 = (char)(a7 * 16 + a8);
                a5 += 2;
            }
            a4.append(a6);
        }
        return a4.toString();
    }

    private static Class666 Method1253(Class666 class666) {
        return class666;
    }
}