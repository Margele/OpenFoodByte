/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package awsl;

import awsl.Class138;
import awsl.Class267;

public class Class31 {
    public static final int Field252 = 0;
    public static final int Field253 = 1;
    public static final int Field254 = 2;
    public static final int Field255 = 3;
    byte[] Field256;
    int Field257;

    Class31(byte[] a, int a2) {
        this.Field256 = a;
        this.Field257 = a2;
    }

    public int Method3432() {
        return this.Field256[this.Field257];
    }

    public int Method3433(int a) {
        return this.Field256[this.Field257 + 2 * a + 1];
    }

    public int Method3434(int a) {
        return this.Field256[this.Field257 + 2 * a + 2];
    }

    public static Class31 Method3435(String a) {
        String[] a2 = Class267.Method2862();
        if (a.length() == 0) {
            return null;
        }
        int a3 = a.length();
        Class138 a4 = new Class138(a3);
        a4.Method485(0);
        int a5 = 0;
        if (a5 < a3) {
            char a6;
            if ((a6 = a.charAt(a5++)) == '[') {
                a4.Method486(0, 0);
            }
            if (a6 == '.') {
                a4.Method486(1, 0);
            }
            if (a6 == '*') {
                a4.Method486(2, 0);
            }
            if (a6 >= '0' && a6 <= '9') {
                int a7 = a6 - 48;
                if (a5 < a3 && (a6 = a.charAt(a5)) >= '0' && a6 <= '9') {
                    a7 = a7 * 10 + a6 - 48;
                    ++a5;
                }
                a4.Method486(3, a7);
            }
        }
        a4.Field990[0] = (byte)(a4.Field991 / 2);
        return new Class31(a4.Field990, 0);
    }

    public String Method3436() {
        int a = this.Method3432();
        StringBuilder a2 = new StringBuilder(a * 2);
        block6: for (int a3 = 0; a3 < a; ++a3) {
            switch (this.Method3433(a3)) {
                case 0: {
                    a2.append('[');
                    continue block6;
                }
                case 1: {
                    a2.append('.');
                    continue block6;
                }
                case 2: {
                    a2.append('*');
                    continue block6;
                }
                case 3: {
                    a2.append(this.Method3434(a3));
                    continue block6;
                }
                default: {
                    a2.append('_');
                }
            }
        }
        return a2.toString();
    }
}