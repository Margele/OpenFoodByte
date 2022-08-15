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
import awsl.Class91;
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

public final class Class308 {
    private static String[] Field1592;

    public static Class91 Method715(Class91 a, int[] a2, char[] a3) {
        if (a2.length != a3.length) {
            throw new IllegalArgumentException("Mask must be same length as pattern");
        }
        return (Class91)Class308.Method716(a, a2.length, Class308::Method740, (arg_0, arg_1) -> Class308.Method739(a3, a2, arg_0, arg_1), Class308::Method738);
    }

    public static Object Method716(Class91 a, int a2, Predicate a3, BiPredicate a4, BiFunction a5) {
        int a6;
        String[] a7 = Class308.Method742();
        int a8 = 0;
        Class91 a9 = a;
        boolean a10 = a3.test((Object)a9);
        if (a4.test((Object)a8, (Object)a9)) {
            ++a8;
        }
        if ((a6 = 1) <= a8 - 1) {
            a9 = a9.Method3641();
            ++a6;
        }
        if ((a8 = 0) >= a2) {
            Class91 a11 = a9;
            int a12 = 1;
            if (a12 <= a8 - 1) {
                a9 = a9.Method3641();
                ++a12;
            }
            return a5.apply((Object)a9, (Object)a11);
        }
        a9 = a9.Method3642();
        return null;
    }

    public static Class91 Method717(Class91 a, int[] a2, String a3) {
        return Class308.Method715(a, a2, a3.toCharArray());
    }

    public static Class91 Method718(Class91 a, int[] a2) {
        StringBuilder a3 = new StringBuilder();
        for (int a4 : a2) {
            a3.append(a4 == -666 ? (char)'?' : 'x');
        }
        return Class308.Method717(a, a2, a3.toString());
    }

    public static Class91 Method719(Class116 a, int[] a2) {
        return Class308.Method718(a.Method184(), a2);
    }

    public static Class91 Method720(Class15 a, int[] a2) {
        return Class308.Method719(a.Field208, a2);
    }

    public static Class91 Method721(Class91 a, int a2) {
        Class91 a3 = a;
        int a4 = 0;
        while (a4 < Math.abs((int)a2)) {
            ++a4;
            a3 = a3.Method3642();
        }
        return a3;
    }

    /*
     * WARNING - void declaration
     */
    public static String Method722(Class224 a) {
        void a2;
        Object a3;
        StringBuilder stringBuilder = new StringBuilder("METHODS:\n");
        Iterator iterator = a.Field1260.Method1383();
        String[] a4 = Class308.Method742();
        if (iterator.Method932()) {
            a3 = (Class15)iterator.Method933();
            a2.append("\t");
            a2.append(((Class15)a3).Field195);
            a2.append(((Class15)a3).Field196);
            a2.append("\n");
            Class91.Method3647(new String[3]);
        }
        a2.append("\nFIELDS:\n");
        iterator = a.Field1259.Method1383();
        if (iterator.Method932()) {
            a3 = (Class241)iterator.Method933();
            a2.append("\t");
            a2.append(((Class241)a3).Field1343);
            a2.append(" ");
            a2.append(((Class241)a3).Field1342);
            a2.append("\n");
        }
        return a2.toString();
    }

    public static int Method723(Class15 a, String a2, String a3, Class104 a4, Class104 a5) {
        Optional a6 = a.Field212.stream().max(Comparator.comparingInt(Class308::Method737));
        int a7 = (Integer)a6.map(Class308::Method736).orElse((Object)0);
        Class790 a8 = new Class790(a2, a3, null, a4, a5, a7);
        a.Field212.Method2530((Object)a8);
        return a7;
    }

    public static Class116 Method724(String a, String[] a2, Class116 a3) {
        String a4 = (String)Stream.of((Object[])a2).collect(Collectors.joining((CharSequence)"", (CharSequence)"(", (CharSequence)")V"));
        return Class308.Method725(a, a4, a3);
    }

    public static Class116 Method725(String a, String a2, Class116 a3) {
        Class116 a4 = new Class116();
        a4.Method194(new Class110(187, a));
        a4.Method194(new Class83(89));
        a4.Method195(a3);
        a4.Method194(new Class98(183, a, "<init>", a2, false));
        return a4;
    }

    public static Class15 Method726(Class224 a, String a2, String a3) {
        Iterator iterator = a.Field1260.Method1383();
        while (iterator.Method932()) {
            Class15 a4 = (Class15)iterator.Method933();
            if (!a4.Field195.equals((Object)a2) || !a4.Field196.equals((Object)a3)) continue;
            return a4;
        }
        return null;
    }

    public static Class91 Method727(Class15 a, int a2, String a3, String a4, String a5) {
        for (Class91 a6 : a.Field208.Method192()) {
            Class98 a7;
            if (!(a6 instanceof Class98) || (a7 = (Class98)a6).Method3640() != a2 || !a7.Field824.equals((Object)a3) || !a7.Field825.equals((Object)a4) || !a7.Field826.equals((Object)a5)) continue;
            return a6;
        }
        return null;
    }

    public static Class91 Method728(Class15 a, int a2, String a3, String a4, String a5) {
        for (Class91 a6 : a.Field208.Method192()) {
            Class93 a7;
            if (!(a6 instanceof Class93) || (a7 = (Class93)a6).Method3640() != a2 || !a7.Field807.equals((Object)a3) || !a7.Field808.equals((Object)a4) || !a7.Field809.equals((Object)a5)) continue;
            return a6;
        }
        return null;
    }

    public static List Method729(Class15 a, int a2, String a3, String a4, String a5) {
        ArrayList a6 = new ArrayList();
        for (Class91 a7 : a.Field208.Method192()) {
            Class93 a8;
            if (!(a7 instanceof Class93) || (a8 = (Class93)a7).Method3640() != a2 || !a8.Field807.equals((Object)a3) || !a8.Field808.equals((Object)a4) || !a8.Field809.equals((Object)a5)) continue;
            a6.Method2530((Object)a8);
        }
        return a6;
    }

    public static Class91 Method730(Class15 a, int[] a2) {
        for (Class91 a3 : a.Field208.Method192()) {
            for (int a4 : a2) {
                if (a4 != a3.Method3640()) continue;
                return a3;
            }
        }
        return null;
    }

    public static Class91 Method731(Class15 a, String a2) {
        for (Class91 a3 : a.Field208.Method192()) {
            String a4;
            if (!(a3 instanceof Class106)) continue;
            Class106 a5 = (Class106)a3;
            if (!(a5.Field850 instanceof String) || !(a4 = (String)a5.Field850).equals((Object)a2)) continue;
            return a3;
        }
        return null;
    }

    public static Class91 Method732(Class15 a) {
        return a.Field208.Method184().Method3642();
    }

    public static Class91 Method733(Class15 a) {
        return a.Field208.Method186(a.Field208.Method183() - 2);
    }

    public static Class224 Method734(byte[] a) {
        Class224 a2 = new Class224();
        Class165 a3 = new Class165(a);
        a3.Method1470(a2, 0);
        return a2;
    }

    public static byte[] Method735(Class224 a) {
        Class169 a2 = new Class169(3);
        a.Method2213(a2);
        return a2.Method1503();
    }

    private static Integer Method736(Class790 a) {
        return a.Field3550.matches("[JD]") ? a.Field3554 + 2 : a.Field3554 + 1;
    }

    private static int Method737(Class790 a) {
        return a.Field3554;
    }

    private static Class91 Method738(Class91 a, Class91 a2) {
        return a;
    }

    private static boolean Method739(char[] a, int[] a2, Integer a3, Class91 a4) {
        return a[a3] != 'x' || a4.Method3640() == a2[a3];
    }

    private static boolean Method740(Class91 a) {
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