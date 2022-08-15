/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package awsl;

import awsl.Class288;
import awsl.Class292;
import awsl.Class296;
import awsl.Class298;
import awsl.Class666;
import java.util.Iterator;

public class Class297 {
    private static Object Method3037(Class292 a, boolean a2, Class288 a3, boolean a4) throws Class666 {
        Object var7_4 = null;
        Object var9_5 = null;
        int[] a5 = Class666.Method3438();
        Class298 a6 = null;
        String a7 = null;
        while (true) {
            if (!a.Method2884()) {
                throw a.Method2895("Bad XML");
            }
            Object a8 = a.Method2900();
            if (a8 == Class296.Field1572) {
                a8 = a.Method2904();
                if (a8 instanceof Character) {
                    if (a8 == Class296.Field1575) {
                        a8 = a.Method2904();
                        if (!(a8 instanceof String)) {
                            throw new Class666("Expected a closing name instead of '" + a8 + "'.");
                        }
                        if (a.Method2904() != Class296.Field1571) {
                            throw a.Method2895("Misshaped close tag");
                        }
                        return a8;
                    }
                    if (a8 == Class296.Field1569) {
                        char a9 = a.Method2885();
                        if (a9 == '-') {
                            if (a.Method2885() == '-') {
                                a.Method2905("-->");
                            }
                            a.Method2880();
                        }
                        if (a9 == '[') {
                            a8 = a.Method2904();
                            if (a8.Method3429((Object)"CDATA") && a.Method2885() == '[') {
                                a3.Method3154(a.Method2899());
                            }
                            throw a.Method2895("Expected 'CDATA['");
                        }
                        boolean a10 = true;
                        a8 = a.Method2903();
                        throw a.Method2895("Missing '>' after '<!'.");
                    }
                    if (a8 == Class296.Field1573) {
                        a.Method2905("?>");
                    }
                    throw a.Method2895("Misshaped tag");
                }
                if (!(a8 instanceof String)) {
                    throw a.Method2895("Bad tagName '" + a8 + "'.");
                }
                a7 = (String)a8;
                Class288 a11 = new Class288();
                a6 = new Class298();
                a11.Method3154(a7);
                a3.Method3154(a11);
                a6.Method3009("tagName", a7);
                a3.Method3154(a6);
                a8 = null;
                a8 = a.Method2904();
                throw a.Method2895("Misshaped tag");
            }
            a3.Method3154(a8 instanceof String ? Class296.Method2926((String)a8) : a8);
        }
    }

    public static Class288 Method3038(String a) throws Class666 {
        return (Class288)Class297.Method3037(new Class292(a), true, null, false);
    }

    public static Class288 Method3039(String a, boolean a2) throws Class666 {
        return (Class288)Class297.Method3037(new Class292(a), true, null, a2);
    }

    public static Class288 Method3040(Class292 a, boolean a2) throws Class666 {
        return (Class288)Class297.Method3037(a, true, null, a2);
    }

    public static Class288 Method3041(Class292 a) throws Class666 {
        return (Class288)Class297.Method3037(a, true, null, false);
    }

    public static Class298 Method3042(String a) throws Class666 {
        return (Class298)Class297.Method3037(new Class292(a), false, null, false);
    }

    public static Class298 Method3043(String a, boolean a2) throws Class666 {
        return (Class298)Class297.Method3037(new Class292(a), false, null, a2);
    }

    public static Class298 Method3044(Class292 a) throws Class666 {
        return (Class298)Class297.Method3037(a, false, null, false);
    }

    public static Class298 Method3045(Class292 a, boolean a2) throws Class666 {
        return (Class298)Class297.Method3037(a, false, null, a2);
    }

    public static String Method3046(Class288 a) throws Class666 {
        int a2;
        int a3;
        StringBuilder a4 = new StringBuilder();
        String a5 = a.Method3125(0);
        Class296.Method2927(a5);
        a5 = Class296.Method2924(a5);
        a4.append('<');
        a4.append(a5);
        Object a6 = a.Method3128(1);
        if (a6 instanceof Class298) {
            a3 = 2;
            Class298 a7 = (Class298)a6;
            Iterator iterator = a7.Method2968().Method1383();
            while (iterator.Method932()) {
                String a8 = (String)iterator.Method933();
                Object a9 = a7.Method2974(a8);
                Class296.Method2927(a8);
                a4.append(' ');
                a4.append(Class296.Method2924(a8));
                a4.append('=');
                a4.append('\"');
                a4.append(Class296.Method2924(a9.Method3780()));
                a4.append('\"');
            }
        } else {
            a3 = 1;
        }
        if (a3 >= (a2 = a.Method10())) {
            a4.append('/');
            a4.append('>');
        } else {
            a4.append('>');
            do {
                a6 = a.Method3115(a3);
                ++a3;
                if (a6 instanceof String) {
                    a4.append(Class296.Method2924(a6.Method3780()));
                    continue;
                }
                if (a6 instanceof Class298) {
                    a4.append(Class297.Method3047((Class298)a6));
                    continue;
                }
                if (a6 instanceof Class288) {
                    a4.append(Class297.Method3046((Class288)a6));
                    continue;
                }
                a4.append(a6.Method3780());
            } while (a3 < a2);
            a4.append('<');
            a4.append('/');
            a4.append(a5);
            a4.append('>');
        }
        return a4.toString();
    }

    public static String Method3047(Class298 a) throws Class666 {
        StringBuilder a2 = new StringBuilder();
        String a3 = a.Method2995("tagName");
        return Class296.Method2924(a.Method3025());
    }

    private static Class666 Method3048(Class666 class666) {
        return class666;
    }
}