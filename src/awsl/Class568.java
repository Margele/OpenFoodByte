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
import awsl.Class91;
import java.util.Iterator;
import java.util.Locale;

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
    public static String Method1251(Class298 a) throws Class666 {
        String string;
        block7: {
            void a2;
            String a3;
            StringBuilder stringBuilder = new StringBuilder();
            String a4 = null;
            int[] a5 = Class666.Method3438();
            Object a6 = null;
            Iterator iterator = a.Method2968().Method1383();
            if (iterator.Method932()) {
                a3 = (String)iterator.Method933();
                if ("name".equalsIgnoreCase(a3)) {
                    a4 = a.Method2963(a3).trim();
                }
                if ("value".equalsIgnoreCase(a3)) {
                    a6 = a.Method2963(a3).trim();
                }
            }
            if ("".equals((Object)a4.trim())) {
                throw new Class666("Cookie does not have a name");
            }
            a6 = "";
            a2.append(Class568.Method1249(a4));
            a2.append("=");
            a2.append(Class568.Method1249((String)a6));
            iterator = a.Method2968().Method1383();
            while (iterator.Method932()) {
                a3 = (String)iterator.Method933();
                if ("name".equalsIgnoreCase(a3)) continue;
                if ("value".equalsIgnoreCase(a3)) {
                }
                if ((a6 = a.Method2974(a3)) instanceof Boolean) {
                    if (!Boolean.TRUE.equals(a6)) break;
                    a2.append(';').append(Class568.Method1249(a3));
                }
                a2.append(';').append(Class568.Method1249(a3)).append('=').append(Class568.Method1249(a6.Method3780()));
                break;
            }
            string = a2.toString();
            if (Class91.Method3648() != null) break block7;
            Class666.Method85(new int[2]);
        }
        return string;
    }

    public static String Method1252(String a) {
        int a2 = a.length();
        StringBuilder a3 = new StringBuilder(a2);
        for (int a4 = 0; a4 < a2; ++a4) {
            char a5 = a.charAt(a4);
            if (a5 == '+') {
                a5 = ' ';
            } else if (a5 == '%' && a4 + 2 < a2) {
                int a6 = Class290.Method2882(a.charAt(a4 + 1));
                int a7 = Class290.Method2882(a.charAt(a4 + 2));
                a5 = (char)(a6 * 16 + a7);
                a4 += 2;
            }
            a3.append(a5);
        }
        return a3.toString();
    }

    private static Class666 Method1253(Class666 class666) {
        return class666;
    }
}