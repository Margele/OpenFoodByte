/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class63;

public class Class79 {
    private final String Field706;

    public Class79(String a) {
        this.Field706 = a;
    }

    public void Method3748(Class63 a) {
        int a2;
        String a3 = this.Field706;
        int a4 = a3.length();
        if (a3.charAt(0) == '<') {
            char a5;
            a2 = 2;
            do {
                int a6 = a3.indexOf(58, a2);
                a.Method3610(a3.substring(a2 - 1, a6));
                a2 = a6 + 1;
                a5 = a3.charAt(a2);
                if (a5 == 'L' || a5 == '[' || a5 == 'T') {
                    a2 = Class79.Method3750(a3, a2, a.Method3611());
                }
                while ((a5 = a3.charAt(a2++)) == ':') {
                    a2 = Class79.Method3750(a3, a2, a.Method3612());
                }
            } while (a5 != '>');
        } else {
            a2 = 0;
        }
        if (a3.charAt(a2) == '(') {
            ++a2;
            while (a3.charAt(a2) != ')') {
                a2 = Class79.Method3750(a3, a2, a.Method3615());
            }
            a2 = Class79.Method3750(a3, a2 + 1, a.Method3616());
            while (a2 < a4) {
                a2 = Class79.Method3750(a3, a2 + 1, a.Method3617());
            }
        } else {
            a2 = Class79.Method3750(a3, a2, a.Method3613());
            while (a2 < a4) {
                a2 = Class79.Method3750(a3, a2, a.Method3614());
            }
        }
    }

    public void Method3749(Class63 a) {
        Class79.Method3750(this.Field706, 0, a);
    }

    private static int Method3750(String a, int a2, Class63 a3) {
        String a4 = Class63.Method3784();
        char a5 = a.charAt(a2++);
        switch (a5) {
            case 'B': 
            case 'C': 
            case 'D': 
            case 'F': 
            case 'I': 
            case 'J': 
            case 'S': 
            case 'V': 
            case 'Z': {
                a3.Method3618(a5);
                return a2;
            }
            case '[': {
                return Class79.Method3750(a, a2, a3.Method3620());
            }
            case 'T': {
                int a6 = a.indexOf(59, a2);
                a3.Method3619(a.substring(a2, a6));
                return a6 + 1;
            }
        }
        int a7 = a2;
        boolean a8 = false;
        boolean a9 = false;
        while (true) {
            a5 = a.charAt(a2++);
            switch (a5) {
                case '.': 
                case ';': {
                    String a10 = a.substring(a7, a2 - 1);
                    a3.Method3622(a10);
                    a3.Method3621(a10);
                    if (a5 == ';') {
                        a3.Method3625();
                        return a2;
                    }
                    a7 = a2;
                    a8 = false;
                    a9 = true;
                }
                case '<': {
                    String a10 = a.substring(a7, a2 - 1);
                    a3.Method3622(a10);
                    a3.Method3621(a10);
                    a8 = true;
                    a5 = a.charAt(a2);
                    switch (a5) {
                        case '>': {
                        }
                        case '*': {
                            ++a2;
                            a3.Method3623();
                        }
                        case '+': 
                        case '-': {
                            a2 = Class79.Method3750(a, a2 + 1, a3.Method3624(a5));
                        }
                    }
                    a2 = Class79.Method3750(a, a2, a3.Method3624('='));
                }
            }
        }
    }
}