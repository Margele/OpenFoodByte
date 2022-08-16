/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Optional
 *  java.util.function.BiFunction
 *  java.util.function.BiPredicate
 *  java.util.function.Predicate
 *  java.util.stream.Collectors
 *  java.util.stream.Stream
 */
package awsl;

import awsl.Class104;
import awsl.Class106;
import awsl.Class110;
import awsl.Class116;
import awsl.Class15;
import awsl.Class165;
import awsl.Class169;
import awsl.Class224;
import awsl.Class241;
import awsl.Class790;
import awsl.Class83;
import awsl.Class93;
import awsl.Class98;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import obfuscate.a;

public final class Class308 {
    private static String[] Field1592;

    public static a Method715(a a2, int[] a3, char[] a4) {
        if (a3.length != a4.length) {
            throw new IllegalArgumentException("Mask must be same length as pattern");
        }
        return (a)Class308.Method716(a2, a3.length, Class308::Method740, (arg_0, arg_1) -> Class308.Method739(a4, a3, arg_0, arg_1), Class308::Method738);
    }

    public static Object Method716(a a2, int a3, Predicate a4, BiPredicate a5, BiFunction a6) {
        int a7;
        String[] a8 = Class308.Method742();
        int a9 = 0;
        a a10 = a2;
        boolean a11 = a4.test((Object)a10);
        if (a5.test((Object)a9, (Object)a10)) {
            ++a9;
        }
        if ((a7 = 1) <= a9 - 1) {
            a10 = a10.Method3641();
            ++a7;
        }
        if ((a9 = 0) >= a3) {
            a a12 = a10;
            int a13 = 1;
            if (a13 <= a9 - 1) {
                a10 = a10.Method3641();
                ++a13;
            }
            return a6.apply((Object)a10, (Object)a12);
        }
        a10 = a10.Method3642();
        return null;
    }

    public static a Method717(a a2, int[] a3, String a4) {
        return Class308.Method715(a2, a3, a4.toCharArray());
    }

    public static a Method718(a a2, int[] a3) {
        StringBuilder a4 = new StringBuilder();
        for (int a5 : a3) {
            a4.append(a5 == -666 ? (char)'?' : 'x');
        }
        return Class308.Method717(a2, a3, a4.toString());
    }

    public static a Method719(Class116 a2, int[] a3) {
        return Class308.Method718(a2.Method184(), a3);
    }

    public static a Method720(Class15 a2, int[] a3) {
        return Class308.Method719(a2.Field208, a3);
    }

    public static a Method721(a a2, int a3) {
        a a4 = a2;
        int a5 = 0;
        while (a5 < Math.abs((int)a3)) {
            ++a5;
            a4 = a4.Method3642();
        }
        return a4;
    }

    /*
     * WARNING - void declaration
     */
    public static String Method722(Class224 a2) {
        void a3;
        Object a4;
        StringBuilder stringBuilder = new StringBuilder("METHODS:\n");
        Iterator iterator = a2.Field1260.Method1383();
        String[] a5 = Class308.Method742();
        if (iterator.Method932()) {
            a4 = (Class15)iterator.Method933();
            a3.append("\t");
            a3.append(((Class15)a4).Field195);
            a3.append(((Class15)a4).Field196);
            a3.append("\n");
            a.trash(new String[3]);
        }
        a3.append("\nFIELDS:\n");
        iterator = a2.Field1259.Method1383();
        if (iterator.Method932()) {
            a4 = (Class241)iterator.Method933();
            a3.append("\t");
            a3.append(((Class241)a4).Field1343);
            a3.append(" ");
            a3.append(((Class241)a4).Field1342);
            a3.append("\n");
        }
        return a3.toString();
    }

    public static int Method723(Class15 a2, String a3, String a4, Class104 a5, Class104 a6) {
        Optional a7 = a2.Field212.stream().max(Comparator.comparingInt(Class308::Method737));
        int a8 = (Integer)a7.map(Class308::Method736).orElse((Object)0);
        Class790 a9 = new Class790(a3, a4, null, a5, a6, a8);
        a2.Field212.Method2530((Object)a9);
        return a8;
    }

    public static Class116 Method724(String a2, String[] a3, Class116 a4) {
        String a5 = (String)Stream.of((Object[])a3).collect(Collectors.joining((CharSequence)"", (CharSequence)"(", (CharSequence)")V"));
        return Class308.Method725(a2, a5, a4);
    }

    public static Class116 Method725(String a2, String a3, Class116 a4) {
        Class116 a5 = new Class116();
        a5.Method194(new Class110(187, a2));
        a5.Method194(new Class83(89));
        a5.Method195(a4);
        a5.Method194(new Class98(183, a2, "<init>", a3, false));
        return a5;
    }

    public static Class15 Method726(Class224 a2, String a3, String a4) {
        Iterator iterator = a2.Field1260.Method1383();
        while (iterator.Method932()) {
            Class15 a5 = (Class15)iterator.Method933();
            if (!a5.Field195.equals((Object)a3) || !a5.Field196.equals((Object)a4)) continue;
            return a5;
        }
        return null;
    }

    public static a Method727(Class15 a2, int a3, String a4, String a5, String a6) {
        for (a a7 : a2.Field208.Method192()) {
            Class98 a8;
            if (!(a7 instanceof Class98) || (a8 = (Class98)a7).Method3640() != a3 || !a8.Field824.equals((Object)a4) || !a8.Field825.equals((Object)a5) || !a8.Field826.equals((Object)a6)) continue;
            return a7;
        }
        return null;
    }

    public static a Method728(Class15 a2, int a3, String a4, String a5, String a6) {
        for (a a7 : a2.Field208.Method192()) {
            Class93 a8;
            if (!(a7 instanceof Class93) || (a8 = (Class93)a7).Method3640() != a3 || !a8.Field807.equals((Object)a4) || !a8.Field808.equals((Object)a5) || !a8.Field809.equals((Object)a6)) continue;
            return a7;
        }
        return null;
    }

    public static List Method729(Class15 a2, int a3, String a4, String a5, String a6) {
        ArrayList a7 = new ArrayList();
        for (a a8 : a2.Field208.Method192()) {
            Class93 a9;
            if (!(a8 instanceof Class93) || (a9 = (Class93)a8).Method3640() != a3 || !a9.Field807.equals((Object)a4) || !a9.Field808.equals((Object)a5) || !a9.Field809.equals((Object)a6)) continue;
            a7.Method2530((Object)a9);
        }
        return a7;
    }

    public static a Method730(Class15 a2, int[] a3) {
        for (a a4 : a2.Field208.Method192()) {
            for (int a5 : a3) {
                if (a5 != a4.Method3640()) continue;
                return a4;
            }
        }
        return null;
    }

    public static a Method731(Class15 a2, String a3) {
        for (a a4 : a2.Field208.Method192()) {
            String a5;
            if (!(a4 instanceof Class106)) continue;
            Class106 a6 = (Class106)a4;
            if (!(a6.Field850 instanceof String) || !(a5 = (String)a6.Field850).equals((Object)a3)) continue;
            return a4;
        }
        return null;
    }

    public static a Method732(Class15 a2) {
        return a2.Field208.Method184().Method3642();
    }

    public static a Method733(Class15 a2) {
        return a2.Field208.Method186(a2.Field208.Method183() - 2);
    }

    public static Class224 Method734(byte[] a2) {
        Class224 a3 = new Class224();
        Class165 a4 = new Class165(a2);
        a4.Method1470(a3, 0);
        return a3;
    }

    public static byte[] Method735(Class224 a2) {
        Class169 a3 = new Class169(3);
        a2.Method2213(a3);
        return a3.Method1503();
    }

    private static Integer Method736(Class790 a2) {
        return a2.Field3550.matches("[JD]") ? a2.Field3554 + 2 : a2.Field3554 + 1;
    }

    private static int Method737(Class790 a2) {
        return a2.Field3554;
    }

    private static a Method738(a a2, a a3) {
        return a2;
    }

    private static boolean Method739(char[] a2, int[] a3, Integer a4, a a5) {
        return a2[a4] != 'x' || a5.Method3640() == a3[a4];
    }

    private static boolean Method740(a a2) {
        return true;
    }

    public static void Method741(String[] stringArray) {
        Field1592 = stringArray;
    }

    public static String[] Method742() {
        return Field1592;
    }

    private static IllegalArgumentException Method743(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        Class308.Method741(new String[4]);
    }
}