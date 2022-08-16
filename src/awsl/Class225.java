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
import awsl.Class780;
import awsl.Class784;
import awsl.Class794;
import awsl.Class801;
import awsl.Class804;
import awsl.Class813;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import obfuscate.a;
import obfuscate.b;

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

    public static void Method2192(Class165 a2, ClassLoader a3, boolean a4, PrintWriter a5) {
        Class224 a6 = new Class224();
        a2.Method1470(new Class225(a6, false), 2);
        b a7 = a6.Field1246 == null ? null : b.Method3205(a6.Field1246);
        List a8 = a6.Field1260;
        ArrayList a9 = new ArrayList();
        Iterator a10 = a6.Field1247.Method1383();
        while (a10.Method932()) {
            a9.Method2530((Object)b.Method3205((String)a10.Method933()));
        }
        for (int a11 = 0; a11 < a8.Method1799(); ++a11) {
            Class15 a12 = (Class15)a8.get(a11);
            Class813 a13 = new Class813(b.Method3205(a6.Field1244), a7, (List)a9, (a6.Field1243 & 0x200) != 0);
            Class780 a14 = new Class780(a13);
            a13.Method3672(a3);
            try {
                a14.Method847(a6.Field1244, a12);
                continue;
            }
            catch (Exception a15) {
                a15.printStackTrace(a5);
                Class225.Method2194(a12, a14, a5);
            }
        }
        a5.flush();
    }

    public static void Method2193(Class165 a2, boolean a3, PrintWriter a4) {
        Class225.Method2192(a2, null, a3, a4);
    }

    static void Method2194(Class15 a2, Class780 a3, PrintWriter a4) {
        int a5;
        Class784[] a6 = a3.Method849();
        Class804 a7 = new Class804();
        Class41 a8 = new Class41(a7);
        a4.println(a2.Field195 + a2.Field196);
        for (a5 = 0; a5 < a2.Field208.Method183(); ++a5) {
            a2.Field208.Method186(a5).Method1(a8);
            StringBuilder a9 = new StringBuilder();
            Class784 a10 = a6[a5];
            a9.append('?');
            while (a9.length() < a2.Field210 + a2.Field211 + 1) {
                a9.append(' ');
            }
            a4.print(Integer.toString((int)(a5 + 100000)).substring(1));
            a4.print(" " + a9 + " : " + a7.Field3580.get(a7.Field3580.Method1799() - 1));
        }
        for (a5 = 0; a5 < a2.Field209.Method1799(); ++a5) {
            ((Class794)a2.Field209.get(a5)).Method796(a8);
            a4.print(" " + a7.Field3580.get(a7.Field3580.Method1799() - 1));
        }
        a4.println();
    }

    private static String Method2071(String a2) {
        int a3 = a2.lastIndexOf(47);
        int a4 = a2.length();
        if (a2.charAt(a4 - 1) == ';') {
            --a4;
        }
        return a3 == -1 ? a2 : a2.substring(a3 + 1, a4);
    }

    public Class225(Class167 a2) {
        this(a2, true);
    }

    public Class225(Class167 a2, boolean a3) {
        this(327680, a2, a3);
        if (this.getClass() != Class225.class) {
            throw new IllegalStateException();
        }
    }

    protected Class225(int a2, Class167 a3, boolean a4) {
        super(a2, a3);
        this.Field1267 = a4;
    }

    @Override
    public void Method1447(int a2, int a3, String a4, String a5, String a6, String[] a7) {
        if (this.Field1262) {
            throw new IllegalStateException("visit must be called only once");
        }
        this.Field1262 = true;
        this.Method2195();
        Class225.Method2196(a3, 423473);
        if (!a4.endsWith("package-info")) {
            Class39.Method3393(a4, "class name");
        }
        if ("java/lang/Object".equals((Object)a4)) {
            throw new IllegalArgumentException("The super class name of the Object class must be 'null'");
        }
        Class39.Method3393(a6, "super class name");
        Class225.Method2197(a5);
        if ((a3 & 0x200) != 0 && !"java/lang/Object".equals((Object)a6)) {
            throw new IllegalArgumentException("The super class name of interfaces must be 'java/lang/Object'");
        }
        for (int a8 = 0; a8 < a7.length; ++a8) {
            Class39.Method3393(a7[a8], "interface name at index " + a8);
        }
        this.Field1261 = a2;
        super.Method1447(a2, a3, a4, a5, a6, a7);
    }

    @Override
    public void Method1458(String a2, String a3) {
        this.Method2195();
        if (this.Field1263) {
            throw new IllegalStateException("visitSource can be called only once.");
        }
        this.Field1263 = true;
        super.Method1458(a2, a3);
    }

    @Override
    public void Method1453(String a2, String a3, String a4) {
        this.Method2195();
        if (this.Field1264) {
            throw new IllegalStateException("visitOuterClass can be called only once.");
        }
        this.Field1264 = true;
        throw new IllegalArgumentException("Illegal outer class owner");
    }

    @Override
    public void Method1452(String a2, String a3, String a4, int a5) {
        int a6;
        this.Method2195();
        Class39.Method3393(a2, "class name");
        Class39.Method3393(a3, "outer class name");
        for (a6 = 0; a6 < a4.length() && Character.isDigit((char)a4.charAt(a6)); ++a6) {
        }
        if (a6 < a4.length()) {
            Class39.Method3391(a4, a6, -1, "inner class name");
        }
        Class225.Method2196(a5, 30239);
        super.Method1452(a2, a3, a4, a5);
    }

    @Override
    public Class253 Method1450(int a2, String a3, String a4, String a5, Object a6) {
        this.Method2195();
        Class225.Method2196(a2, 413919);
        Class39.Method3389(this.Field1261, a3, "field name");
        Class39.Method3395(a4, false);
        Class225.Method2199(a5);
        Class39.Method3387(a6);
        Class253 a7 = super.Method1450(a2, a3, a4, a5, a6);
        return new Class244(a7);
    }

    @Override
    public Class267 Method1451(int a2, String a3, String a4, String a5, String[] a6) {
        this.Method2195();
        Class225.Method2196(a2, 400895);
        if (!"<init>".equals((Object)a3) && !"<clinit>".equals((Object)a3)) {
            Class39.Method3392(this.Field1261, a3, "method name");
        }
        Class39.Method1873(a4);
        Class225.Method2198(a5);
        for (int a7 = 0; a7 < a6.length; ++a7) {
            Class39.Method3393(a6[a7], "exception name at index " + a7);
        }
        Class39 a8 = this.Field1267 ? new Class39(a2, a3, a4, super.Method1451(a2, a3, a4, a5, a6), this.Field1266) : new Class39(super.Method1451(a2, a3, a4, a5, a6), this.Field1266);
        a8.Field314 = this.Field1261;
        return a8;
    }

    @Override
    public Class148 Method1448(String a2, boolean a3) {
        this.Method2195();
        Class39.Method3395(a2, false);
        return new Class130(super.Method1448(a2, a3));
    }

    @Override
    public Class148 Method1449(int a2, Class31 a3, String a4, boolean a5) {
        this.Method2195();
        int a6 = a2 >>> 24;
        if (a6 != 17 && a6 != 16) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString((int)a6));
        }
        Class225.Method2200(a2, a3);
        Class39.Method3395(a4, false);
        return new Class130(super.Method1449(a2, a3, a4, a5));
    }

    @Override
    public void Method1459(Class136 a2) {
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

    static void Method2196(int a2, int a3) {
        int a4;
        int a5;
        if ((a2 & ~a3) != 0) {
            throw new IllegalArgumentException("Invalid access flags: " + a2);
        }
        int a6 = (a2 & 1) == 0 ? 0 : 1;
        int a7 = (a2 & 2) == 0 ? 0 : 1;
        int n = a5 = (a2 & 4) == 0 ? 0 : 1;
        if (a6 + a7 + a5 > 1) {
            throw new IllegalArgumentException("public private and protected are mutually exclusive: " + a2);
        }
        int a8 = (a2 & 0x10) == 0 ? 0 : 1;
        int n2 = a4 = (a2 & 0x400) == 0 ? 0 : 1;
        if (a8 + a4 > 1) {
            throw new IllegalArgumentException("final and abstract are mutually exclusive: " + a2);
        }
    }

    public static void Method2197(String a2) {
        int a3 = 0;
        if (Class225.Method2210(a2, 0) == '<') {
            a3 = Class225.Method1527(a2, a3);
        }
        a3 = Class225.Method2203(a2, a3);
        while (Class225.Method2210(a2, a3) == 'L') {
            a3 = Class225.Method2203(a2, a3);
        }
        if (a3 != a2.length()) {
            throw new IllegalArgumentException(a2 + ": error at index " + a3);
        }
    }

    public static void Method2198(String a2) {
        int a3 = 0;
        if (Class225.Method2210(a2, 0) == '<') {
            a3 = Class225.Method1527(a2, a3);
        }
        a3 = Class225.Method2209('(', a2, a3);
        while ("ZCBSIFJDL[T".indexOf((int)Class225.Method2210(a2, a3)) != -1) {
            a3 = Class225.Method2207(a2, a3);
        }
        a3 = Class225.Method2210(a2, a3 = Class225.Method2209(')', a2, a3)) == 'V' ? ++a3 : Class225.Method2207(a2, a3);
        while (Class225.Method2210(a2, a3) == '^') {
            if (Class225.Method2210(a2, ++a3) == 'L') {
                a3 = Class225.Method2203(a2, a3);
                continue;
            }
            a3 = Class225.Method2206(a2, a3);
        }
        if (a3 != a2.length()) {
            throw new IllegalArgumentException(a2 + ": error at index " + a3);
        }
    }

    public static void Method2199(String a2) {
        int a3 = Class225.Method2202(a2, 0);
        if (a3 != a2.length()) {
            throw new IllegalArgumentException(a2 + ": error at index " + a3);
        }
    }

    static void Method2200(int a2, Class31 a3) {
        int a4 = 0;
        a[] a5 = Class801.Method3300();
        switch (a2 >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                a4 = -65536;
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
                a4 = -16777216;
            }
            case 16: 
            case 17: 
            case 18: 
            case 23: 
            case 66: {
                a4 = -256;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                a4 = -16776961;
            }
        }
        throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString((int)(a2 >>> 24)));
    }

    private static int Method1527(String a2, int a3) {
        a3 = Class225.Method2209('<', a2, a3);
        a3 = Class225.Method2201(a2, a3);
        while (Class225.Method2210(a2, a3) != '>') {
            a3 = Class225.Method2201(a2, a3);
        }
        return a3 + 1;
    }

    private static int Method2201(String a2, int a3) {
        a3 = Class225.Method2208(a2, a3);
        if ("L[T".indexOf((int)Class225.Method2210(a2, a3 = Class225.Method2209(':', a2, a3))) != -1) {
            a3 = Class225.Method2202(a2, a3);
        }
        while (Class225.Method2210(a2, a3) == ':') {
            a3 = Class225.Method2202(a2, a3 + 1);
        }
        return a3;
    }

    private static int Method2202(String a2, int a3) {
        switch (Class225.Method2210(a2, a3)) {
            case 'L': {
                return Class225.Method2203(a2, a3);
            }
            case '[': {
                return Class225.Method2207(a2, a3 + 1);
            }
        }
        return Class225.Method2206(a2, a3);
    }

    private static int Method2203(String a2, int a3) {
        a3 = Class225.Method2209('L', a2, a3);
        a3 = Class225.Method2208(a2, a3);
        while (Class225.Method2210(a2, a3) == '/') {
            a3 = Class225.Method2208(a2, a3 + 1);
        }
        if (Class225.Method2210(a2, a3) == '<') {
            a3 = Class225.Method2204(a2, a3);
        }
        while (Class225.Method2210(a2, a3) == '.') {
            if (Class225.Method2210(a2, a3 = Class225.Method2208(a2, a3 + 1)) != '<') continue;
            a3 = Class225.Method2204(a2, a3);
        }
        return Class225.Method2209(';', a2, a3);
    }

    private static int Method2204(String a2, int a3) {
        a3 = Class225.Method2209('<', a2, a3);
        a3 = Class225.Method2205(a2, a3);
        while (Class225.Method2210(a2, a3) != '>') {
            a3 = Class225.Method2205(a2, a3);
        }
        return a3 + 1;
    }

    private static int Method2205(String a2, int a3) {
        block1: {
            char a4 = Class225.Method2210(a2, a3);
            if (a4 == '*') {
                return a3 + 1;
            }
            if (a4 != '+' && a4 != '-') break block1;
            ++a3;
        }
        return Class225.Method2202(a2, a3);
    }

    private static int Method2206(String a2, int a3) {
        a3 = Class225.Method2209('T', a2, a3);
        a3 = Class225.Method2208(a2, a3);
        return Class225.Method2209(';', a2, a3);
    }

    private static int Method2207(String a2, int a3) {
        switch (Class225.Method2210(a2, a3)) {
            case 'B': 
            case 'C': 
            case 'D': 
            case 'F': 
            case 'I': 
            case 'J': 
            case 'S': 
            case 'Z': {
                return a3 + 1;
            }
        }
        return Class225.Method2202(a2, a3);
    }

    private static int Method2208(String a2, int a3) {
        if (!Character.isJavaIdentifierStart((char)Class225.Method2210(a2, a3))) {
            throw new IllegalArgumentException(a2 + ": identifier expected at index " + a3);
        }
        ++a3;
        while (Character.isJavaIdentifierPart((char)Class225.Method2210(a2, a3))) {
            ++a3;
        }
        return a3;
    }

    private static int Method2209(char a2, String a3, int a4) {
        if (Class225.Method2210(a3, a4) == a2) {
            return a4 + 1;
        }
        throw new IllegalArgumentException(a3 + ": '" + a2 + "' expected at index " + a4);
    }

    private static char Method2210(String a2, int a3) {
        return a3 < a2.length() ? a2.charAt(a3) : (char)'\u0000';
    }

    private static Exception Method1535(Exception exception) {
        return exception;
    }
}