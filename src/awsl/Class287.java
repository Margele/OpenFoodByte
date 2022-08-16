/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package awsl;

import awsl.Class291;
import awsl.Class298;
import awsl.Class666;
import java.util.Locale;
import obfuscate.a;

public class Class287 {
    public static final String Field1550 = "\r\n";

    public static Class298 Method3106(String a) throws Class666 {
        Class298 a2 = new Class298();
        Class291 a3 = new Class291(a);
        String a4 = a3.Method2899();
        if (a4.toUpperCase(Locale.ROOT).startsWith("HTTP")) {
            a2.Method3009("HTTP-Version", a4);
            a2.Method3009("Status-Code", a3.Method2899());
            a2.Method3009("Reason-Phrase", a3.Method2891('\u0000'));
            a3.Method2885();
        } else {
            a2.Method3009("Method", a4);
            a2.Method3009("Request-URI", a3.Method2899());
            a2.Method3009("HTTP-Version", a3.Method2899());
        }
        while (a3.Method2884()) {
            String a5 = a3.Method2891(':');
            a3.Method2887(':');
            a2.Method3009(a5, a3.Method2891('\u0000'));
            a3.Method2885();
        }
        return a2;
    }

    public static String Method3107(Class298 a2) throws Class666 {
        StringBuilder a3 = new StringBuilder();
        int[] a4 = Class666.Method3438();
        if (a2.Method2964("Status-Code") && a2.Method2964("Reason-Phrase")) {
            a3.append(a2.Method2963("HTTP-Version"));
            a3.append(' ');
            a3.append(a2.Method2963("Status-Code"));
            a3.append(' ');
            a3.append(a2.Method2963("Reason-Phrase"));
            a.trash(new String[2]);
        }
        if (a2.Method2964("Method") && a2.Method2964("Request-URI")) {
            a3.append(a2.Method2963("Method"));
            a3.append(' ');
            a3.append('\"');
            a3.append(a2.Method2963("Request-URI"));
            a3.append('\"');
            a3.append(' ');
            a3.append(a2.Method2963("HTTP-Version"));
        }
        throw new Class666("Not enough material for an HTTP header.");
    }

    private static Class666 Method3108(Class666 class666) {
        return class666;
    }
}