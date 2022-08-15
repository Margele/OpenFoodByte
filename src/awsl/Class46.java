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
package awsl;

import awsl.Class267;
import awsl.Class91;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Class46 {
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
    public static final Class46 Field572;
    public static final Class46 Field573;
    public static final Class46 Field574;
    public static final Class46 Field575;
    public static final Class46 Field576;
    public static final Class46 Field577;
    public static final Class46 Field578;
    public static final Class46 Field579;
    public static final Class46 Field580;
    private final int Field581;
    private final char[] Field582;
    private final int Field583;
    private final int Field584;
    private static Class91[] Field585;

    private Class46(int a, char[] a2, int a3, int a4) {
        this.Field581 = a;
        this.Field582 = a2;
        this.Field583 = a3;
        this.Field584 = a4;
    }

    public static Class46 Method3204(String a) {
        return Class46.Method3216(a.toCharArray(), 0);
    }

    public static Class46 Method3205(String a) {
        char[] a2 = a.toCharArray();
        return new Class46(a2[0] == '[' ? 9 : 10, a2, 0, a2.length);
    }

    public static Class46 Method3206(String a) {
        return Class46.Method3216(a.toCharArray(), 0);
    }

    public static Class46 Method3207(Class46 a, Class46[] a2) {
        return Class46.Method3204(Class46.Method3226(a, a2));
    }

    public static Class46 Method3208(Class a) {
        if (a.isPrimitive()) {
            if (a == Integer.TYPE) {
                return Field577;
            }
            if (a == Void.TYPE) {
                return Field572;
            }
            if (a == Boolean.TYPE) {
                return Field573;
            }
            if (a == Byte.TYPE) {
                return Field575;
            }
            if (a == Character.TYPE) {
                return Field574;
            }
            if (a == Short.TYPE) {
                return Field576;
            }
            if (a == Double.TYPE) {
                return Field580;
            }
            if (a == Float.TYPE) {
                return Field578;
            }
            return Field579;
        }
        return Class46.Method3204(Class46.Method3229(a));
    }

    public static Class46 Method3209(Constructor a) {
        return Class46.Method3204(Class46.Method3230(a));
    }

    public static Class46 Method3210(Method a) {
        return Class46.Method3204(Class46.Method3231(a));
    }

    public static Class46[] Method3211(String a) {
        char a2;
        char[] a3 = a.toCharArray();
        int a4 = 1;
        int a5 = 0;
        while ((a2 = a3[a4++]) != ')') {
            if (a2 == 'L') {
                while (a3[a4++] != ';') {
                }
                ++a5;
                continue;
            }
            if (a2 == '[') continue;
            ++a5;
        }
        Class46[] a22 = new Class46[a5];
        a4 = 1;
        a5 = 0;
        while (a3[a4] != ')') {
            a22[a5] = Class46.Method3216(a3, a4);
            a4 += a22[a5].Field584 + (a22[a5].Field581 == 10 ? 2 : 0);
            ++a5;
        }
        return a22;
    }

    public static Class46[] Method3212(Method a) {
        Class[] a2 = a.getParameterTypes();
        Class46[] a3 = new Class46[a2.length];
        int a4 = a2.length - 1;
        while (true) {
            a3[a4] = Class46.Method3208(a2[a4]);
            --a4;
        }
    }

    public static Class46 Method3213(String a) {
        char[] a2 = a.toCharArray();
        return Class46.Method3216(a2, a.indexOf(41) + 1);
    }

    public static Class46 Method3214(Method a) {
        return Class46.Method3208(a.getReturnType());
    }

    public static int Method3215(String a) {
        int a2 = 1;
        int a3 = 1;
        while (true) {
            char a4;
            if ((a4 = a.charAt(a3++)) == ')') {
                a4 = a.charAt(a3);
                return a2 << 2 | (a4 == 'V' ? 0 : (a4 == 'D' || a4 == 'J' ? 2 : 1));
            }
            if (a4 == 'L') {
                while (a.charAt(a3++) != ';') {
                }
                ++a2;
                continue;
            }
            if (a4 == '[') {
                while ((a4 = a.charAt(a3)) == '[') {
                    ++a3;
                }
                if (a4 != 'D' && a4 != 'J') continue;
                --a2;
                continue;
            }
            if (a4 == 'D' || a4 == 'J') {
                a2 += 2;
                continue;
            }
            ++a2;
        }
    }

    private static Class46 Method3216(char[] a, int a2) {
        switch (a[a2]) {
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
                int a3 = 1;
                while (a[a2 + a3] == '[') {
                    ++a3;
                }
                if (a[a2 + a3] == 'L') {
                    ++a3;
                    while (a[a2 + a3] != ';') {
                        ++a3;
                    }
                }
                return new Class46(9, a, a2, a3 + 1);
            }
            case 'L': {
                int a4 = 1;
                while (a[a2 + a4] != ';') {
                    ++a4;
                }
                return new Class46(10, a, a2 + 1, a4 - 1);
            }
        }
        return new Class46(11, a, a2, a.length - a2);
    }

    public int Method3217() {
        return this.Field581;
    }

    public int Method3218() {
        int a = 1;
        while (this.Field582[this.Field583 + a] == '[') {
            ++a;
        }
        return a;
    }

    public Class46 Method3219() {
        return Class46.Method3216(this.Field582, this.Field583 + this.Method3218());
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
                StringBuilder a = new StringBuilder(this.Method3219().Method3220());
                int a2 = this.Method3218();
                while (true) {
                    a.append("[]");
                    --a2;
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

    public Class46[] Method3222() {
        return Class46.Method3211(this.Method3225());
    }

    public Class46 Method3223() {
        return Class46.Method3213(this.Method3225());
    }

    public int Method3224() {
        return Class46.Method3215(this.Method3225());
    }

    public String Method3225() {
        StringBuffer a = new StringBuffer();
        this.Method3227(a);
        return a.toString();
    }

    public static String Method3226(Class46 a, Class46[] a2) {
        StringBuffer a3 = new StringBuffer();
        a3.append('(');
        for (int a4 = 0; a4 < a2.length; ++a4) {
            a2[a4].Method3227(a3);
        }
        a3.append(')');
        a.Method3227(a3);
        return a3.toString();
    }

    private void Method3227(StringBuffer a) {
        if (this.Field582 == null) {
            a.append((char)((this.Field583 & 0xFF000000) >>> 24));
        } else if (this.Field581 == 10) {
            a.append('L');
            a.append(this.Field582, this.Field583, this.Field584);
            a.append(';');
        } else {
            a.append(this.Field582, this.Field583, this.Field584);
        }
    }

    public static String Method3228(Class a) {
        return a.getName().replace('.', '/');
    }

    public static String Method3229(Class a) {
        StringBuffer a2 = new StringBuffer();
        Class46.Method3232(a2, a);
        return a2.toString();
    }

    public static String Method3230(Constructor a) {
        Class[] a2 = a.getParameterTypes();
        StringBuffer a3 = new StringBuffer();
        a3.append('(');
        for (int a4 = 0; a4 < a2.length; ++a4) {
            Class46.Method3232(a3, a2[a4]);
        }
        return a3.append(")V").toString();
    }

    public static String Method3231(Method a) {
        Class[] a2 = a.getParameterTypes();
        StringBuffer a3 = new StringBuffer();
        a3.append('(');
        for (int a4 = 0; a4 < a2.length; ++a4) {
            Class46.Method3232(a3, a2[a4]);
        }
        a3.append(')');
        Class46.Method3232(a3, a.getReturnType());
        return a3.toString();
    }

    private static void Method3232(StringBuffer a, Class a2) {
        Class a3 = a2;
        String[] a4 = Class267.Method2862();
        if (a3.isPrimitive()) {
            char a5;
            if (a3 == Integer.TYPE) {
                a5 = 'I';
            }
            if (a3 == Void.TYPE) {
                a5 = 'V';
            }
            if (a3 == Boolean.TYPE) {
                a5 = 'Z';
            }
            if (a3 == Byte.TYPE) {
                a5 = 'B';
            }
            if (a3 == Character.TYPE) {
                a5 = 'C';
            }
            if (a3 == Short.TYPE) {
                a5 = 'S';
            }
            if (a3 == Double.TYPE) {
                a5 = 'D';
            }
            if (a3 == Float.TYPE) {
                a5 = 'F';
            }
            a5 = 'J';
            a.append(a5);
            return;
        }
        if (a3.isArray()) {
            a.append('[');
            a3 = a3.getComponentType();
        }
        a.append('L');
        String a6 = a3.getName();
        int a7 = a6.length();
        int a8 = 0;
        if (a8 < a7) {
            char a9 = a6.charAt(a8);
            a.append(a9 == '.' ? (char)'/' : (char)a9);
            ++a8;
        }
        a.append(';');
    }

    public int Method3233() {
        return this.Field582 == null ? this.Field583 & 0xFF : 1;
    }

    public int Method3234(int a) {
        if (a == 46 || a == 79) {
            return a + (this.Field582 == null ? (this.Field583 & 0xFF00) >> 8 : 4);
        }
        return a + (this.Field582 == null ? (this.Field583 & 0xFF0000) >> 16 : 4);
    }

    public boolean Method3235(Object a) {
        if (this == a) {
            return true;
        }
        if (!(a instanceof Class46)) {
            return false;
        }
        Class46 a2 = (Class46)a;
        if (this.Field581 != a2.Field581) {
            return false;
        }
        if (this.Field581 >= 9) {
            if (this.Field584 != a2.Field584) {
                return false;
            }
            int a3 = this.Field583;
            int a4 = a2.Field583;
            int a5 = a3 + this.Field584;
            while (a3 < a5) {
                if (this.Field582[a3] != a2.Field582[a4]) {
                    return false;
                }
                ++a3;
                ++a4;
            }
        }
        return true;
    }

    public int Method3236() {
        int a = 13 * this.Field581;
        if (this.Field581 >= 9) {
            int a2;
            int a3 = a2 + this.Field584;
            for (a2 = this.Field583; a2 < a3; ++a2) {
                a = 17 * (a + this.Field582[a2]);
            }
        }
        return a;
    }

    public String Method3237() {
        return this.Method3225();
    }

    static {
        Class46.Method3238(null);
        Field572 = new Class46(0, null, 0x56050000, 1);
        Field573 = new Class46(1, null, 1509950721, 1);
        Field574 = new Class46(2, null, 1124075009, 1);
        Field575 = new Class46(3, null, 1107297537, 1);
        Field576 = new Class46(4, null, 1392510721, 1);
        Field577 = new Class46(5, null, 1224736769, 1);
        Field578 = new Class46(6, null, 1174536705, 1);
        Field579 = new Class46(7, null, 1241579778, 1);
        Field580 = new Class46(8, null, 1141048066, 1);
    }

    public static void Method3238(Class91[] class91Array) {
        Field585 = class91Array;
    }

    public static Class91[] Method3239() {
        return Field585;
    }
}