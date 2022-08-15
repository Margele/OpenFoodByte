/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintWriter
 *  java.lang.Character
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package awsl;

import awsl.Class130;
import awsl.Class136;
import awsl.Class148;
import awsl.Class15;
import awsl.Class165;
import awsl.Class167;
import awsl.Class224;
import awsl.Class244;
import awsl.Class253;
import awsl.Class267;
import awsl.Class31;
import awsl.Class39;
import awsl.Class41;
import awsl.Class46;
import awsl.Class780;
import awsl.Class784;
import awsl.Class794;
import awsl.Class801;
import awsl.Class804;
import awsl.Class813;
import awsl.Class91;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class225
extends Class167 {
    private int Field1261;
    private boolean Field1262;
    private boolean Field1263;
    private boolean Field1264;
    private boolean Field1265;
    private Map Field1266 = new HashMap();
    private boolean Field1267;

    public static void main(String[] a) throws Exception {
        if (a.length != 1) {
            System.err.println("Verifies the given class.");
            System.err.println("Usage: CheckClassAdapter <fully qualified class name or class file name>");
            return;
        }
        Class165 a2 = a[0].endsWith(".class") ? new Class165((InputStream)new FileInputStream(a[0])) : new Class165(a[0]);
        Class225.Method2193(a2, false, new PrintWriter((OutputStream)System.err));
    }

    public static void Method2192(Class165 a, ClassLoader a2, boolean a3, PrintWriter a4) {
        Class224 a5 = new Class224();
        a.Method1470(new Class225(a5, false), 2);
        Class46 a6 = a5.Field1246 == null ? null : Class46.Method3205(a5.Field1246);
        List a7 = a5.Field1260;
        ArrayList a8 = new ArrayList();
        Iterator a9 = a5.Field1247.Method1383();
        while (a9.Method932()) {
            a8.Method2530((Object)Class46.Method3205((String)a9.Method933()));
        }
        for (int a10 = 0; a10 < a7.Method1799(); ++a10) {
            Class15 a11 = (Class15)a7.get(a10);
            Class813 a12 = new Class813(Class46.Method3205(a5.Field1244), a6, (List)a8, (a5.Field1243 & 0x200) != 0);
            Class780 a13 = new Class780(a12);
            a12.Method3672(a2);
            try {
                a13.Method847(a5.Field1244, a11);
                continue;
            }
            catch (Exception a14) {
                a14.printStackTrace(a4);
                Class225.Method2194(a11, a13, a4);
            }
        }
        a4.flush();
    }

    public static void Method2193(Class165 a, boolean a2, PrintWriter a3) {
        Class225.Method2192(a, null, a2, a3);
    }

    static void Method2194(Class15 a, Class780 a2, PrintWriter a3) {
        int a4;
        Class784[] a5 = a2.Method849();
        Class804 a6 = new Class804();
        Class41 a7 = new Class41(a6);
        a3.println(a.Field195 + a.Field196);
        for (a4 = 0; a4 < a.Field208.Method183(); ++a4) {
            a.Field208.Method186(a4).Method1(a7);
            StringBuilder a8 = new StringBuilder();
            Class784 a9 = a5[a4];
            a8.append('?');
            while (a8.length() < a.Field210 + a.Field211 + 1) {
                a8.append(' ');
            }
            a3.print(Integer.toString((int)(a4 + 100000)).substring(1));
            a3.print(" " + a8 + " : " + a6.Field3580.get(a6.Field3580.Method1799() - 1));
        }
        for (a4 = 0; a4 < a.Field209.Method1799(); ++a4) {
            ((Class794)a.Field209.get(a4)).Method796(a7);
            a3.print(" " + a6.Field3580.get(a6.Field3580.Method1799() - 1));
        }
        a3.println();
    }

    private static String Method2071(String a) {
        int a2 = a.lastIndexOf(47);
        int a3 = a.length();
        if (a.charAt(a3 - 1) == ';') {
            --a3;
        }
        return a2 == -1 ? a : a.substring(a2 + 1, a3);
    }

    public Class225(Class167 a) {
        this(a, true);
    }

    public Class225(Class167 a, boolean a2) {
        this(327680, a, a2);
        if (this.getClass() != Class225.class) {
            throw new IllegalStateException();
        }
    }

    protected Class225(int a, Class167 a2, boolean a3) {
        super(a, a2);
        this.Field1267 = a3;
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        if (this.Field1262) {
            throw new IllegalStateException("visit must be called only once");
        }
        this.Field1262 = true;
        this.Method2195();
        Class225.Method2196(a2, 423473);
        if (!a3.endsWith("package-info")) {
            Class39.Method3393(a3, "class name");
        }
        if ("java/lang/Object".equals((Object)a3)) {
            throw new IllegalArgumentException("The super class name of the Object class must be 'null'");
        }
        Class39.Method3393(a5, "super class name");
        Class225.Method2197(a4);
        if ((a2 & 0x200) != 0 && !"java/lang/Object".equals((Object)a5)) {
            throw new IllegalArgumentException("The super class name of interfaces must be 'java/lang/Object'");
        }
        for (int a7 = 0; a7 < a6.length; ++a7) {
            Class39.Method3393(a6[a7], "interface name at index " + a7);
        }
        this.Field1261 = a;
        super.Method1447(a, a2, a3, a4, a5, a6);
    }

    @Override
    public void Method1458(String a, String a2) {
        this.Method2195();
        if (this.Field1263) {
            throw new IllegalStateException("visitSource can be called only once.");
        }
        this.Field1263 = true;
        super.Method1458(a, a2);
    }

    @Override
    public void Method1453(String a, String a2, String a3) {
        this.Method2195();
        if (this.Field1264) {
            throw new IllegalStateException("visitOuterClass can be called only once.");
        }
        this.Field1264 = true;
        throw new IllegalArgumentException("Illegal outer class owner");
    }

    @Override
    public void Method1452(String a, String a2, String a3, int a4) {
        int a5;
        this.Method2195();
        Class39.Method3393(a, "class name");
        Class39.Method3393(a2, "outer class name");
        for (a5 = 0; a5 < a3.length() && Character.isDigit((char)a3.charAt(a5)); ++a5) {
        }
        if (a5 < a3.length()) {
            Class39.Method3391(a3, a5, -1, "inner class name");
        }
        Class225.Method2196(a4, 30239);
        super.Method1452(a, a2, a3, a4);
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        this.Method2195();
        Class225.Method2196(a, 413919);
        Class39.Method3389(this.Field1261, a2, "field name");
        Class39.Method3395(a3, false);
        Class225.Method2199(a4);
        Class39.Method3387(a5);
        Class253 a6 = super.Method1450(a, a2, a3, a4, a5);
        return new Class244(a6);
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        this.Method2195();
        Class225.Method2196(a, 400895);
        if (!"<init>".equals((Object)a2) && !"<clinit>".equals((Object)a2)) {
            Class39.Method3392(this.Field1261, a2, "method name");
        }
        Class39.Method1873(a3);
        Class225.Method2198(a4);
        for (int a6 = 0; a6 < a5.length; ++a6) {
            Class39.Method3393(a5[a6], "exception name at index " + a6);
        }
        Class39 a7 = this.Field1267 ? new Class39(a, a2, a3, super.Method1451(a, a2, a3, a4, a5), this.Field1266) : new Class39(super.Method1451(a, a2, a3, a4, a5), this.Field1266);
        a7.Field314 = this.Field1261;
        return a7;
    }

    @Override
    public Class148 Method1448(String a, boolean a2) {
        this.Method2195();
        Class39.Method3395(a, false);
        return new Class130(super.Method1448(a, a2));
    }

    @Override
    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        this.Method2195();
        int a5 = a >>> 24;
        if (a5 != 17 && a5 != 16) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString((int)a5));
        }
        Class225.Method2200(a, a2);
        Class39.Method3395(a3, false);
        return new Class130(super.Method1449(a, a2, a3, a4));
    }

    @Override
    public void Method1459(Class136 a) {
        this.Method2195();
        throw new IllegalArgumentException("Invalid attribute (must not be null)");
    }

    @Override
    public void Method1460() {
        this.Method2195();
        this.Field1265 = true;
        super.Method1460();
    }

    private void Method2195() {
        if (!this.Field1262) {
            throw new IllegalStateException("Cannot visit member before visit has been called.");
        }
        if (this.Field1265) {
            throw new IllegalStateException("Cannot visit member after visitEnd has been called.");
        }
    }

    static void Method2196(int a, int a2) {
        int a3;
        int a4;
        if ((a & ~a2) != 0) {
            throw new IllegalArgumentException("Invalid access flags: " + a);
        }
        int a5 = (a & 1) == 0 ? 0 : 1;
        int a6 = (a & 2) == 0 ? 0 : 1;
        int n = a4 = (a & 4) == 0 ? 0 : 1;
        if (a5 + a6 + a4 > 1) {
            throw new IllegalArgumentException("public private and protected are mutually exclusive: " + a);
        }
        int a7 = (a & 0x10) == 0 ? 0 : 1;
        int n2 = a3 = (a & 0x400) == 0 ? 0 : 1;
        if (a7 + a3 > 1) {
            throw new IllegalArgumentException("final and abstract are mutually exclusive: " + a);
        }
    }

    public static void Method2197(String a) {
        int a2 = 0;
        if (Class225.Method2210(a, 0) == '<') {
            a2 = Class225.Method1527(a, a2);
        }
        a2 = Class225.Method2203(a, a2);
        while (Class225.Method2210(a, a2) == 'L') {
            a2 = Class225.Method2203(a, a2);
        }
        if (a2 != a.length()) {
            throw new IllegalArgumentException(a + ": error at index " + a2);
        }
    }

    public static void Method2198(String a) {
        int a2 = 0;
        if (Class225.Method2210(a, 0) == '<') {
            a2 = Class225.Method1527(a, a2);
        }
        a2 = Class225.Method2209('(', a, a2);
        while ("ZCBSIFJDL[T".indexOf((int)Class225.Method2210(a, a2)) != -1) {
            a2 = Class225.Method2207(a, a2);
        }
        a2 = Class225.Method2210(a, a2 = Class225.Method2209(')', a, a2)) == 'V' ? ++a2 : Class225.Method2207(a, a2);
        while (Class225.Method2210(a, a2) == '^') {
            if (Class225.Method2210(a, ++a2) == 'L') {
                a2 = Class225.Method2203(a, a2);
                continue;
            }
            a2 = Class225.Method2206(a, a2);
        }
        if (a2 != a.length()) {
            throw new IllegalArgumentException(a + ": error at index " + a2);
        }
    }

    public static void Method2199(String a) {
        int a2 = Class225.Method2202(a, 0);
        if (a2 != a.length()) {
            throw new IllegalArgumentException(a + ": error at index " + a2);
        }
    }

    static void Method2200(int a, Class31 a2) {
        int a3 = 0;
        Class91[] a4 = Class801.Method3300();
        switch (a >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                a3 = -65536;
            }
            case 19: 
            case 20: 
            case 21: 
            case 64: 
            case 65: 
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                a3 = -16777216;
            }
            case 16: 
            case 17: 
            case 18: 
            case 23: 
            case 66: {
                a3 = -256;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                a3 = -16776961;
            }
        }
        throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString((int)(a >>> 24)));
    }

    private static int Method1527(String a, int a2) {
        a2 = Class225.Method2209('<', a, a2);
        a2 = Class225.Method2201(a, a2);
        while (Class225.Method2210(a, a2) != '>') {
            a2 = Class225.Method2201(a, a2);
        }
        return a2 + 1;
    }

    private static int Method2201(String a, int a2) {
        a2 = Class225.Method2208(a, a2);
        if ("L[T".indexOf((int)Class225.Method2210(a, a2 = Class225.Method2209(':', a, a2))) != -1) {
            a2 = Class225.Method2202(a, a2);
        }
        while (Class225.Method2210(a, a2) == ':') {
            a2 = Class225.Method2202(a, a2 + 1);
        }
        return a2;
    }

    private static int Method2202(String a, int a2) {
        switch (Class225.Method2210(a, a2)) {
            case 'L': {
                return Class225.Method2203(a, a2);
            }
            case '[': {
                return Class225.Method2207(a, a2 + 1);
            }
        }
        return Class225.Method2206(a, a2);
    }

    private static int Method2203(String a, int a2) {
        a2 = Class225.Method2209('L', a, a2);
        a2 = Class225.Method2208(a, a2);
        while (Class225.Method2210(a, a2) == '/') {
            a2 = Class225.Method2208(a, a2 + 1);
        }
        if (Class225.Method2210(a, a2) == '<') {
            a2 = Class225.Method2204(a, a2);
        }
        while (Class225.Method2210(a, a2) == '.') {
            if (Class225.Method2210(a, a2 = Class225.Method2208(a, a2 + 1)) != '<') continue;
            a2 = Class225.Method2204(a, a2);
        }
        return Class225.Method2209(';', a, a2);
    }

    private static int Method2204(String a, int a2) {
        a2 = Class225.Method2209('<', a, a2);
        a2 = Class225.Method2205(a, a2);
        while (Class225.Method2210(a, a2) != '>') {
            a2 = Class225.Method2205(a, a2);
        }
        return a2 + 1;
    }

    private static int Method2205(String a, int a2) {
        block1: {
            char a3 = Class225.Method2210(a, a2);
            if (a3 == '*') {
                return a2 + 1;
            }
            if (a3 != '+' && a3 != '-') break block1;
            ++a2;
        }
        return Class225.Method2202(a, a2);
    }

    private static int Method2206(String a, int a2) {
        a2 = Class225.Method2209('T', a, a2);
        a2 = Class225.Method2208(a, a2);
        return Class225.Method2209(';', a, a2);
    }

    private static int Method2207(String a, int a2) {
        switch (Class225.Method2210(a, a2)) {
            case 'B': 
            case 'C': 
            case 'D': 
            case 'F': 
            case 'I': 
            case 'J': 
            case 'S': 
            case 'Z': {
                return a2 + 1;
            }
        }
        return Class225.Method2202(a, a2);
    }

    private static int Method2208(String a, int a2) {
        if (!Character.isJavaIdentifierStart((char)Class225.Method2210(a, a2))) {
            throw new IllegalArgumentException(a + ": identifier expected at index " + a2);
        }
        ++a2;
        while (Character.isJavaIdentifierPart((char)Class225.Method2210(a, a2))) {
            ++a2;
        }
        return a2;
    }

    private static int Method2209(char a, String a2, int a3) {
        if (Class225.Method2210(a2, a3) == a) {
            return a3 + 1;
        }
        throw new IllegalArgumentException(a2 + ": '" + a + "' expected at index " + a3);
    }

    private static char Method2210(String a, int a2) {
        return a2 < a.length() ? a.charAt(a2) : (char)'\u0000';
    }

    private static Exception Method1535(Exception exception) {
        return exception;
    }
}