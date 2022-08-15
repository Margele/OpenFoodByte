/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package awsl;

import awsl.Class288;
import awsl.Class290;
import awsl.Class298;
import awsl.Class666;

public class Class566 {
    private static String Method1235(Class290 a) throws Class666 {
        char a2;
        while ((a2 = a.Method2885()) == ' ' || a2 == '\t') {
        }
        switch (a2) {
            case '\u0000': {
                return null;
            }
            case '\"': 
            case '\'': {
                char a3 = a2;
                StringBuilder a4 = new StringBuilder();
                while (true) {
                    char a5;
                    if ((a2 = a.Method2885()) == a3 && (a5 = a.Method2885()) != '\"') break;
                    if (a2 == '\n' || a2 == '\r') {
                        throw a.Method2895("Missing close quote '" + a3 + "'.");
                    }
                    a4.append(a2);
                }
                a.Method2880();
                return a4.toString();
            }
            case ',': {
                a.Method2880();
                return "";
            }
        }
        a.Method2880();
        return a.Method2891(',');
    }

    public static Class288 Method1236(Class290 a) throws Class666 {
        Class288 a2 = new Class288();
        block0: while (true) {
            String a3 = Class566.Method1235(a);
            char a4 = a.Method2885();
            if (a2.Method10() == 0 && a3.length() == 0 && a4 != ',') {
                return null;
            }
            a2.Method3154(a3);
            while (true) {
                if (a4 == ',') continue block0;
                if (a4 != ' ') {
                    if (a4 != '\n' && a4 != '\r') {
                    }
                    return a2;
                }
                a4 = a.Method2885();
            }
            break;
        }
    }

    public static Class298 Method1237(Class288 a, Class290 a2) throws Class666 {
        Class288 a3 = Class566.Method1236(a2);
        return a3.Method3173(a);
    }

    public static String Method1238(Class288 a) {
        StringBuilder a2 = new StringBuilder();
        int a3 = 0;
        int[] a4 = Class666.Method3438();
        if (a3 < a.Method10()) {
            a2.append(',');
            Object a5 = a.Method3128(a3);
            String a6 = a5.Method3780();
            if (a6.length() > 0 && (a6.indexOf(44) >= 0 || a6.indexOf(10) >= 0 || a6.indexOf(13) >= 0 || a6.indexOf(0) >= 0 || a6.charAt(0) == '\"')) {
                a2.append('\"');
                int a7 = a6.length();
                int a8 = 0;
                if (a8 < a7) {
                    char a9 = a6.charAt(a8);
                    if (a9 >= ' ' && a9 != '\"') {
                        a2.append(a9);
                    }
                    ++a8;
                }
                a2.append('\"');
            }
            a2.append(a6);
            ++a3;
        }
        a2.append('\n');
        return a2.toString();
    }

    public static Class288 Method1239(String a) throws Class666 {
        return Class566.Method1240(new Class290(a));
    }

    public static Class288 Method1240(Class290 a) throws Class666 {
        return Class566.Method1242(Class566.Method1236(a), a);
    }

    public static Class288 Method1241(Class288 a, String a2) throws Class666 {
        return Class566.Method1242(a, new Class290(a2));
    }

    public static Class288 Method1242(Class288 a, Class290 a2) throws Class666 {
        if (a.Method10() == 0) {
            return null;
        }
        Class288 a3 = new Class288();
        Class298 a4 = Class566.Method1237(a, a2);
        if (a3.Method10() == 0) {
            return null;
        }
        return a3;
    }

    public static String Method1243(Class288 a) throws Class666 {
        Class298 a2 = a.Method3140(0);
        Class288 a3 = a2.Method2972();
        return Class566.Method1238(a3) + Class566.Method1244(a3, a);
    }

    public static String Method1244(Class288 a, Class288 a2) throws Class666 {
        if (a.Method10() == 0) {
            return null;
        }
        StringBuilder a3 = new StringBuilder();
        for (int a4 = 0; a4 < a2.Method10(); ++a4) {
            Class298 a5 = a2.Method3140(a4);
            a3.append(Class566.Method1238(a5.Method3024(a)));
        }
        return a3.toString();
    }

    private static Class666 Method1245(Class666 class666) {
        return class666;
    }
}