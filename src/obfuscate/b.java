/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 */
package obfuscate;

import awsl.Class267;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import obfuscate.a;

public class b {
    public static final int Field560 = 0;
    public static final int Field561 = 1;
    public static final int Field562 = 2;
    public static final int Field563 = 3;
    public static final int Field564 = 4;
    public static final int Field565 = 5;
    public static final int Field566 = 6;
    public static final int Field567 = 7;
    public static final int Field568 = 8;
    public static final int Field569 = 9;
    public static final int Field570 = 10;
    public static final int Field571 = 11;
    public static final b Field572;
    public static final b Field573;
    public static final b Field574;
    public static final b Field575;
    public static final b Field576;
    public static final b Field577;
    public static final b Field578;
    public static final b Field579;
    public static final b Field580;
    private final int Field581;
    private final char[] Field582;
    private final int Field583;
    private final int Field584;
    private static a[] Field585;

    private b(int a2, char[] a3, int a4, int a5) {
        this.Field581 = a2;
        this.Field582 = a3;
        this.Field583 = a4;
        this.Field584 = a5;
    }

    public static b Method3204(String a2) {
        return b.Method3216(a2.toCharArray(), 0);
    }

    public static b Method3205(String a2) {
        char[] a3 = a2.toCharArray();
        return new b(a3[0] == '[' ? 9 : 10, a3, 0, a3.length);
    }

    public static b Method3206(String a2) {
        return b.Method3216(a2.toCharArray(), 0);
    }

    public static b Method3207(b a2, b[] a3) {
        return b.Method3204(b.Method3226(a2, a3));
    }

    public static b Method3208(Class a2) {
        if (a2.isPrimitive()) {
            if (a2 == Integer.TYPE) {
                return Field577;
            }
            if (a2 == Void.TYPE) {
                return Field572;
            }
            if (a2 == Boolean.TYPE) {
                return Field573;
            }
            if (a2 == Byte.TYPE) {
                return Field575;
            }
            if (a2 == Character.TYPE) {
                return Field574;
            }
            if (a2 == Short.TYPE) {
                return Field576;
            }
            if (a2 == Double.TYPE) {
                return Field580;
            }
            if (a2 == Float.TYPE) {
                return Field578;
            }
            return Field579;
        }
        return b.Method3204(b.Method3229(a2));
    }

    public static b Method3209(Constructor a2) {
        return b.Method3204(b.Method3230(a2));
    }

    public static b Method3210(Method a2) {
        return b.Method3204(b.Method3231(a2));
    }

    public static b[] Method3211(String a2) {
        char a3;
        char[] a4 = a2.toCharArray();
        int a5 = 1;
        int a6 = 0;
        while ((a3 = a4[a5++]) != ')') {
            if (a3 == 'L') {
                while (a4[a5++] != ';') {
                }
                ++a6;
                continue;
            }
            if (a3 == '[') continue;
            ++a6;
        }
        b[] a22 = new b[a6];
        a5 = 1;
        a6 = 0;
        while (a4[a5] != ')') {
            a22[a6] = b.Method3216(a4, a5);
            a5 += a22[a6].Field584 + (a22[a6].Field581 == 10 ? 2 : 0);
            ++a6;
        }
        return a22;
    }

    public static b[] Method3212(Method a2) {
        Class[] a3 = a2.getParameterTypes();
        b[] a4 = new b[a3.length];
        int a5 = a3.length - 1;
        while (true) {
            a4[a5] = b.Method3208(a3[a5]);
            --a5;
        }
    }

    public static b Method3213(String a2) {
        char[] a3 = a2.toCharArray();
        return b.Method3216(a3, a2.indexOf(41) + 1);
    }

    public static b Method3214(Method a2) {
        return b.Method3208(a2.getReturnType());
    }

    public static int Method3215(String a2) {
        int a3 = 1;
        int a4 = 1;
        while (true) {
            char a5;
            if ((a5 = a2.charAt(a4++)) == ')') {
                a5 = a2.charAt(a4);
                return a3 << 2 | (a5 == 'V' ? 0 : (a5 == 'D' || a5 == 'J' ? 2 : 1));
            }
            if (a5 == 'L') {
                while (a2.charAt(a4++) != ';') {
                }
                ++a3;
                continue;
            }
            if (a5 == '[') {
                while ((a5 = a2.charAt(a4)) == '[') {
                    ++a4;
                }
                if (a5 != 'D' && a5 != 'J') continue;
                --a3;
                continue;
            }
            if (a5 == 'D' || a5 == 'J') {
                a3 += 2;
                continue;
            }
            ++a3;
        }
    }

    private static b Method3216(char[] a2, int a3) {
        switch (a2[a3]) {
            case 'V': {
                return Field572;
            }
            case 'Z': {
                return Field573;
            }
            case 'C': {
                return Field574;
            }
            case 'B': {
                return Field575;
            }
            case 'S': {
                return Field576;
            }
            case 'I': {
                return Field577;
            }
            case 'F': {
                return Field578;
            }
            case 'J': {
                return Field579;
            }
            case 'D': {
                return Field580;
            }
            case '[': {
                int a4 = 1;
                while (a2[a3 + a4] == '[') {
                    ++a4;
                }
                if (a2[a3 + a4] == 'L') {
                    ++a4;
                    while (a2[a3 + a4] != ';') {
                        ++a4;
                    }
                }
                return new b(9, a2, a3, a4 + 1);
            }
            case 'L': {
                int a5 = 1;
                while (a2[a3 + a5] != ';') {
                    ++a5;
                }
                return new b(10, a2, a3 + 1, a5 - 1);
            }
        }
        return new b(11, a2, a3, a2.length - a3);
    }

    public int Method3217() {
        return this.Field581;
    }

    public int Method3218() {
        int a2 = 1;
        while (this.Field582[this.Field583 + a2] == '[') {
            ++a2;
        }
        return a2;
    }

    public b Method3219() {
        return b.Method3216(this.Field582, this.Field583 + this.Method3218());
    }

    public String Method3220() {
        switch (this.Field581) {
            case 0: {
                return "void";
            }
            case 1: {
                return "boolean";
            }
            case 2: {
                return "char";
            }
            case 3: {
                return "byte";
            }
            case 4: {
                return "short";
            }
            case 5: {
                return "int";
            }
            case 6: {
                return "float";
            }
            case 7: {
                return "long";
            }
            case 8: {
                return "double";
            }
            case 9: {
                StringBuilder a2 = new StringBuilder(this.Method3219().Method3220());
                int a3 = this.Method3218();
                while (true) {
                    a2.append("[]");
                    --a3;
                }
            }
            case 10: {
                return new String(this.Field582, this.Field583, this.Field584).replace('/', '.');
            }
        }
        return null;
    }

    public String Method3221() {
        return new String(this.Field582, this.Field583, this.Field584);
    }

    public b[] Method3222() {
        return b.Method3211(this.Method3225());
    }

    public b Method3223() {
        return b.Method3213(this.Method3225());
    }

    public int Method3224() {
        return b.Method3215(this.Method3225());
    }

    public String Method3225() {
        StringBuffer a2 = new StringBuffer();
        this.Method3227(a2);
        return a2.toString();
    }

    public static String Method3226(b a2, b[] a3) {
        StringBuffer a4 = new StringBuffer();
        a4.append('(');
        for (int a5 = 0; a5 < a3.length; ++a5) {
            a3[a5].Method3227(a4);
        }
        a4.append(')');
        a2.Method3227(a4);
        return a4.toString();
    }

    private void Method3227(StringBuffer a2) {
        if (this.Field582 == null) {
            a2.append((char)((this.Field583 & 0xFF000000) >>> 24));
        } else if (this.Field581 == 10) {
            a2.append('L');
            a2.append(this.Field582, this.Field583, this.Field584);
            a2.append(';');
        } else {
            a2.append(this.Field582, this.Field583, this.Field584);
        }
    }

    public static String Method3228(Class a2) {
        return a2.getName().replace('.', '/');
    }

    public static String Method3229(Class a2) {
        StringBuffer a3 = new StringBuffer();
        b.Method3232(a3, a2);
        return a3.toString();
    }

    public static String Method3230(Constructor a2) {
        Class[] a3 = a2.getParameterTypes();
        StringBuffer a4 = new StringBuffer();
        a4.append('(');
        for (int a5 = 0; a5 < a3.length; ++a5) {
            b.Method3232(a4, a3[a5]);
        }
        return a4.append(")V").toString();
    }

    public static String Method3231(Method a2) {
        Class[] a3 = a2.getParameterTypes();
        StringBuffer a4 = new StringBuffer();
        a4.append('(');
        for (int a5 = 0; a5 < a3.length; ++a5) {
            b.Method3232(a4, a3[a5]);
        }
        a4.append(')');
        b.Method3232(a4, a2.getReturnType());
        return a4.toString();
    }

    private static void Method3232(StringBuffer a2, Class a3) {
        Class a4 = a3;
        String[] a5 = Class267.Method2862();
        if (a4.isPrimitive()) {
            char a6;
            if (a4 == Integer.TYPE) {
                a6 = 'I';
            }
            if (a4 == Void.TYPE) {
                a6 = 'V';
            }
            if (a4 == Boolean.TYPE) {
                a6 = 'Z';
            }
            if (a4 == Byte.TYPE) {
                a6 = 'B';
            }
            if (a4 == Character.TYPE) {
                a6 = 'C';
            }
            if (a4 == Short.TYPE) {
                a6 = 'S';
            }
            if (a4 == Double.TYPE) {
                a6 = 'D';
            }
            if (a4 == Float.TYPE) {
                a6 = 'F';
            }
            a6 = 'J';
            a2.append(a6);
            return;
        }
        if (a4.isArray()) {
            a2.append('[');
            a4 = a4.getComponentType();
        }
        a2.append('L');
        String a7 = a4.getName();
        int a8 = a7.length();
        int a9 = 0;
        if (a9 < a8) {
            char a10 = a7.charAt(a9);
            a2.append(a10 == '.' ? (char)'/' : (char)a10);
            ++a9;
        }
        a2.append(';');
    }

    public int Method3233() {
        return this.Field582 == null ? this.Field583 & 0xFF : 1;
    }

    public int Method3234(int a2) {
        if (a2 == 46 || a2 == 79) {
            return a2 + (this.Field582 == null ? (this.Field583 & 0xFF00) >> 8 : 4);
        }
        return a2 + (this.Field582 == null ? (this.Field583 & 0xFF0000) >> 16 : 4);
    }

    public boolean Method3235(Object a2) {
        if (this == a2) {
            return true;
        }
        if (!(a2 instanceof b)) {
            return false;
        }
        b a3 = (b)a2;
        if (this.Field581 != a3.Field581) {
            return false;
        }
        if (this.Field581 >= 9) {
            if (this.Field584 != a3.Field584) {
                return false;
            }
            int a4 = this.Field583;
            int a5 = a3.Field583;
            int a6 = a4 + this.Field584;
            while (a4 < a6) {
                if (this.Field582[a4] != a3.Field582[a5]) {
                    return false;
                }
                ++a4;
                ++a5;
            }
        }
        return true;
    }

    public int Method3236() {
        int a2 = 13 * this.Field581;
        if (this.Field581 >= 9) {
            int a3;
            int a4 = a3 + this.Field584;
            for (a3 = this.Field583; a3 < a4; ++a3) {
                a2 = 17 * (a2 + this.Field582[a3]);
            }
        }
        return a2;
    }

    public String Method3237() {
        return this.Method3225();
    }

    static {
        b.trash(null);
        Field572 = new b(0, null, 0x56050000, 1);
        Field573 = new b(1, null, 1509950721, 1);
        Field574 = new b(2, null, 1124075009, 1);
        Field575 = new b(3, null, 1107297537, 1);
        Field576 = new b(4, null, 1392510721, 1);
        Field577 = new b(5, null, 1224736769, 1);
        Field578 = new b(6, null, 1174536705, 1);
        Field579 = new b(7, null, 1241579778, 1);
        Field580 = new b(8, null, 1141048066, 1);
    }

    public static void trash(a[] aArray) {
        Field585 = aArray;
    }

    public static a[] trash() {
        return Field585;
    }
}