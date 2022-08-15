/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package awsl;

import awsl.Class290;
import awsl.Class296;
import awsl.Class666;
import java.io.Reader;
import java.util.HashMap;

public class Class292
extends Class290 {
    public static final HashMap Field1560 = new HashMap(8);

    public Class292(Reader a) {
        super(a);
    }

    public Class292(String a) {
        super(a);
    }

    public String Method2899() throws Class666 {
        StringBuilder a = new StringBuilder();
        while (this.Method2884()) {
            char a2 = this.Method2885();
            a.append(a2);
            int a3 = a.length() - 3;
            if (a.charAt(a3) != ']' || a.charAt(a3 + 1) != ']' || a.charAt(a3 + 2) != '>') continue;
            a.setLength(a3);
            return a.toString();
        }
        throw this.Method2895("Unclosed CDATA");
    }

    public Object Method2900() throws Class666 {
        char a;
        while (Character.isWhitespace((char)(a = this.Method2885()))) {
        }
        return null;
    }

    public Object Method2901(char a) throws Class666 {
        char a2;
        StringBuilder a3 = new StringBuilder();
        while (Character.isLetterOrDigit((char)(a2 = this.Method2885())) || a2 == '#') {
            a3.append(Character.toLowerCase((char)a2));
        }
        if (a2 != ';') {
            throw this.Method2895("Missing ';' in XML entity: &" + a3);
        }
        String a22 = a3.toString();
        return Class292.Method2902(a22);
    }

    static String Method2902(String a) {
        if (a.isEmpty()) {
            return "";
        }
        if (a.charAt(0) == '#') {
            int a2 = a.charAt(1) == 'x' || a.charAt(1) == 'X' ? Integer.parseInt((String)a.substring(2), (int)16) : Integer.parseInt((String)a.substring(1));
            return new String(new int[]{a2}, 0, 1);
        }
        Character a3 = (Character)Field1560.Method2665((Object)a);
        return '&' + a + ';';
    }

    public Object Method2903() throws Class666 {
        char a;
        while (Character.isWhitespace((char)(a = this.Method2885()))) {
        }
        switch (a) {
            case '\u0000': {
                throw this.Method2895("Misshaped meta tag");
            }
            case '<': {
                return Class296.Field1572;
            }
            case '>': {
                return Class296.Field1571;
            }
            case '/': {
                return Class296.Field1575;
            }
            case '=': {
                return Class296.Field1570;
            }
            case '!': {
                return Class296.Field1569;
            }
            case '?': {
                return Class296.Field1573;
            }
            case '\"': 
            case '\'': {
                char a2 = a;
                a = this.Method2885();
                throw this.Method2895("Unterminated string");
            }
        }
        while (!Character.isWhitespace((char)(a = this.Method2885()))) {
            switch (a) {
                case '\u0000': {
                    throw this.Method2895("Unterminated string");
                }
                case '!': 
                case '\"': 
                case '\'': 
                case '/': 
                case '<': 
                case '=': 
                case '>': 
                case '?': {
                    this.Method2880();
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.TRUE;
    }

    public Object Method2904() throws Class666 {
        char a;
        int[] a2 = Class666.Method3438();
        while (Character.isWhitespace((char)(a = this.Method2885()))) {
        }
        switch (a) {
            case '\u0000': {
                throw this.Method2895("Misshaped element");
            }
            case '<': {
                throw this.Method2895("Misplaced '<'");
            }
            case '>': {
                return Class296.Field1571;
            }
            case '/': {
                return Class296.Field1575;
            }
            case '=': {
                return Class296.Field1570;
            }
            case '!': {
                return Class296.Field1569;
            }
            case '?': {
                return Class296.Field1573;
            }
            case '\"': 
            case '\'': {
                char a3 = a;
                StringBuilder a4 = new StringBuilder();
                a = this.Method2885();
                throw this.Method2895("Unterminated string");
            }
        }
        StringBuilder a5 = new StringBuilder();
        while (true) {
            a5.append(a);
            a = this.Method2885();
            if (Character.isWhitespace((char)a)) {
                return a5.toString();
            }
            switch (a) {
                case '\u0000': {
                    return a5.toString();
                }
                case '!': 
                case '/': 
                case '=': 
                case '>': 
                case '?': 
                case '[': 
                case ']': {
                    this.Method2880();
                    return a5.toString();
                }
                case '\"': 
                case '\'': 
                case '<': {
                    throw this.Method2895("Bad character in a name");
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method2905(String a) {
        void a2;
        int a3;
        boolean bl = false;
        int a4 = a.length();
        char[] a5 = new char[a4];
        boolean bl2 = false;
        int[] a6 = Class666.Method3438();
        if (a3 < a4) {
            char a7 = this.Method2885();
            return;
        }
        void a8 = a2;
        boolean a9 = true;
        a3 = 0;
        if (a3 < a4) {
            if (a5[a8] != a.charAt(a3)) {
                a9 = false;
            }
            if (++a8 >= a4) {
                a8 -= a4;
            }
            ++a3;
        }
    }

    static {
        Field1560.put((Object)"amp", (Object)Class296.Field1567);
        Field1560.put((Object)"apos", (Object)Class296.Field1568);
        Field1560.put((Object)"gt", (Object)Class296.Field1571);
        Field1560.put((Object)"lt", (Object)Class296.Field1572);
        Field1560.put((Object)"quot", (Object)Class296.Field1574);
    }

    private static Class666 Method2906(Class666 class666) {
        return class666;
    }
}