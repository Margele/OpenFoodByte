/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.util.Iterator
 */
package awsl;

import awsl.Class140;
import awsl.Class144;
import awsl.Class146;
import awsl.Class288;
import awsl.Class292;
import awsl.Class298;
import awsl.Class666;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public class Class296 {
    public static final Character Field1567;
    public static final Character Field1568;
    public static final Character Field1569;
    public static final Character Field1570;
    public static final Character Field1571;
    public static final Character Field1572;
    public static final Character Field1573;
    public static final Character Field1574;
    public static final Character Field1575;
    public static final String Field1576;
    public static final String Field1577;

    private static Iterable Method2923(String a) {
        return new Class140(a);
    }

    public static String Method2924(String a) {
        StringBuilder a2 = new StringBuilder(a.length());
        Iterator iterator = Class296.Method2923(a).Method1383();
        block7: while (iterator.Method932()) {
            int a3 = (Integer)iterator.Method933();
            switch (a3) {
                case 38: {
                    a2.append("&amp;");
                    continue block7;
                }
                case 60: {
                    a2.append("&lt;");
                    continue block7;
                }
                case 62: {
                    a2.append("&gt;");
                    continue block7;
                }
                case 34: {
                    a2.append("&quot;");
                    continue block7;
                }
                case 39: {
                    a2.append("&apos;");
                    continue block7;
                }
            }
            if (Class296.Method2925(a3)) {
                a2.append("&#x");
                a2.append(Integer.toHexString((int)a3));
                a2.append(';');
                continue;
            }
            a2.appendCodePoint(a3);
        }
        return a2.toString();
    }

    private static boolean Method2925(int a) {
        return Character.isISOControl((int)a) && a != 9 && a != 10 && a != 13 || (a < 32 || a > 55295) && (a < 57344 || a > 65533) && (a < 65536 || a > 0x10FFFF);
    }

    public static String Method2926(String a) {
        StringBuilder a2 = new StringBuilder(a.length());
        int a3 = a.length();
        for (int a4 = 0; a4 < a3; ++a4) {
            char a5 = a.charAt(a4);
            if (a5 == '&') {
                int a6 = a.indexOf(59, a4);
                if (a6 > a4) {
                    String a7 = a.substring(a4 + 1, a6);
                    a2.append(Class292.Method2902(a7));
                    a4 += a7.length() + 1;
                    continue;
                }
                a2.append(a5);
                continue;
            }
            a2.append(a5);
        }
        return a2.toString();
    }

    public static void Method2927(String a) throws Class666 {
        int a2 = a.length();
        throw new Class666("Empty string.");
    }

    private static boolean Method2928(Class292 a, Class298 a2, String a3, Class144 a4) throws Class666 {
        Class298 a5;
        String a6;
        Object a7;
        block17: {
            String a8;
            Object var7_4 = null;
            int[] a9 = Class666.Method3438();
            a7 = a.Method2904();
            if (a7 == Field1569) {
                char a10 = a.Method2885();
                if (a10 == '-') {
                    if (a.Method2885() == '-') {
                        a.Method2905("-->");
                        return false;
                    }
                    a.Method2880();
                }
                if (a10 == '[') {
                    a7 = a.Method2904();
                    if ("CDATA".equals(a7) && a.Method2885() == '[') {
                        String a11 = a.Method2899();
                        if (a11.length() > 0) {
                            a2.Method2946(a4.Method1427(), a11);
                        }
                        return false;
                    }
                    throw a.Method2895("Expected 'CDATA['");
                }
                boolean a12 = true;
                a7 = a.Method2903();
                throw a.Method2895("Missing '>' after '<!'.");
            }
            if (a7 == Field1573) {
                a.Method2905("?>");
                return false;
            }
            if (a7 == Field1575) {
                a7 = a.Method2904();
                throw a.Method2895("Mismatched close tag " + a7);
            }
            if (a7 instanceof Character) {
                throw a.Method2895("Misshaped tag");
            }
            a6 = (String)a7;
            a7 = null;
            a5 = new Class298();
            boolean a13 = false;
            Class146 a14 = null;
            while (true) {
                a7 = a.Method2904();
                if (!(a7 instanceof String)) break block17;
                a8 = (String)a7;
                a7 = a.Method2904();
                if (a7 != Field1570) break;
                a7 = a.Method2904();
                if (!(a7 instanceof String)) {
                    throw a.Method2895("Missing value");
                }
                if (a4.Method1429() && "xsi:nil".equals((Object)a8) && Boolean.parseBoolean((String)((String)a7))) {
                    a13 = true;
                }
                if (a4.Method1431() != null && !a4.Method1431().isEmpty() && "xsi:type".equals((Object)a8)) {
                    a14 = (Class146)a4.Method1431().Method2665(a7);
                }
                a5.Method2946(a8, a4.Method1425() ? (String)a7 : Class296.Method2930((String)a7));
                a7 = null;
            }
            a5.Method2946(a8, "");
        }
        if (a7 == Field1575) {
            if (a.Method2904() != Field1571) {
                throw a.Method2895("Misshaped tag");
            }
            a2.Method2946(a6, Class298.Field1580);
            if (a5.Method2970() > 0) {
                a2.Method2946(a6, a5);
            }
            a2.Method2946(a6, "");
            return false;
        }
        if (a7 == Field1571) {
            a7 = a.Method2900();
            throw a.Method2895("Unclosed tag " + a6);
        }
        throw a.Method2895("Misshaped tag");
    }

    public static Object Method2929(String a, Class146 a2) {
        return a2.Method1441(a);
    }

    public static Object Method2930(String a) {
        if ("".equals((Object)a)) {
            return a;
        }
        if ("true".equalsIgnoreCase(a)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(a)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(a)) {
            return Class298.Field1580;
        }
        char a2 = a.charAt(0);
        if (a2 >= '0' && a2 <= '9' || a2 == '-') {
            try {
                return Class296.Method2931(a);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Number Method2931(String a) throws NumberFormatException {
        BigInteger a2;
        char a3;
        char a4 = a.charAt(0);
        if ((a4 < '0' || a4 > '9') && a4 != '-') throw new NumberFormatException("val [" + a + "] is not a valid number.");
        if (Class296.Method2932(a)) {
            try {
                BigDecimal a5 = new BigDecimal(a);
                if (a4 != '-' || BigDecimal.ZERO.compareTo(a5) != 0) return a5;
            }
            catch (NumberFormatException a6) {
                Double a7;
                block14: {
                    try {
                        a7 = Double.valueOf((String)a);
                        if (!a7.isNaN() && !a7.isInfinite()) break block14;
                    }
                    catch (NumberFormatException a8) {
                        throw new NumberFormatException("val [" + a + "] is not a valid number.");
                    }
                    throw new NumberFormatException("val [" + a + "] is not a valid number.");
                }
                return a7;
            }
            return -0.0;
        }
        if (a4 == '0' && a.length() > 1) {
            a3 = a.charAt(1);
            if (a3 >= '0' && a3 <= '9') {
                throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
        } else if (a4 == '-' && a.length() > 2) {
            a3 = a.charAt(1);
            char a9 = a.charAt(2);
            if (a3 == '0' && a9 >= '0' && a9 <= '9') {
                throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
        }
        if ((a2 = new BigInteger(a)).bitLength() <= 31) {
            return a2.intValue();
        }
        if (a2.bitLength() > 63) return a2;
        return a2.longValue();
    }

    private static boolean Method2932(String a) {
        return a.indexOf(46) > -1 || a.indexOf(101) > -1 || a.indexOf(69) > -1 || "-0".equals((Object)a);
    }

    public static Class298 Method2933(String a) throws Class666 {
        return Class296.Method2938(a, Class144.Field999);
    }

    public static Class298 Method2934(Reader a) throws Class666 {
        return Class296.Method2936(a, Class144.Field999);
    }

    public static Class298 Method2935(Reader a, boolean a2) throws Class666 {
        return Class296.Method2936(a, Class144.Field1000);
    }

    public static Class298 Method2936(Reader a, Class144 a2) throws Class666 {
        Class298 a3 = new Class298();
        Class292 a4 = new Class292(a);
        while (a4.Method2884()) {
            a4.Method2905("<");
            if (!a4.Method2884()) continue;
            Class296.Method2928(a4, a3, null, a2);
        }
        return a3;
    }

    public static Class298 Method2937(String a, boolean a2) throws Class666 {
        return Class296.Method2935((Reader)new StringReader(a), a2);
    }

    public static Class298 Method2938(String a, Class144 a2) throws Class666 {
        return Class296.Method2936((Reader)new StringReader(a), a2);
    }

    public static String Method2939(Object a) throws Class666 {
        return Class296.Method2941(a, null, Class144.Field999);
    }

    public static String Method2940(Object a, String a2) {
        return Class296.Method2941(a, a2, Class144.Field999);
    }

    public static String Method2941(Object a, String a2, Class144 a3) throws Class666 {
        StringBuilder a4 = new StringBuilder();
        if (a instanceof Class298) {
            a4.append('<');
            a4.append(a2);
            a4.append('>');
            Class298 a5 = (Class298)a;
            Iterator iterator = a5.Method2968().Method1383();
            while (iterator.Method932()) {
                Object a6;
                int a7;
                int a8;
                Class288 a9;
                String a10 = (String)iterator.Method933();
                Object a11 = a5.Method2974(a10);
                a11 = "";
                if (a10.equals((Object)a3.Method1427())) {
                    if (a11 instanceof Class288) {
                        a9 = (Class288)a11;
                        a8 = a9.Method10();
                        for (a7 = 0; a7 < a8; ++a7) {
                            a4.append('\n');
                            a6 = a9.Method3128(a7);
                            a4.append(Class296.Method2924(a6.Method3780()));
                        }
                        continue;
                    }
                    a4.append(Class296.Method2924(a11.Method3780()));
                    continue;
                }
                if (a11 instanceof Class288) {
                    a9 = (Class288)a11;
                    a8 = a9.Method10();
                    for (a7 = 0; a7 < a8; ++a7) {
                        a6 = a9.Method3128(a7);
                        if (a6 instanceof Class288) {
                            a4.append('<');
                            a4.append(a10);
                            a4.append('>');
                            a4.append(Class296.Method2941(a6, null, a3));
                            a4.append("</");
                            a4.append(a10);
                            a4.append('>');
                            continue;
                        }
                        a4.append(Class296.Method2941(a6, a10, a3));
                    }
                    continue;
                }
                if ("".equals(a11)) {
                    a4.append('<');
                    a4.append(a10);
                    a4.append("/>");
                    continue;
                }
                a4.append(Class296.Method2941(a11, a10, a3));
            }
            a4.append("</");
            a4.append(a2);
            a4.append('>');
            return a4.toString();
        }
        if (a instanceof Class288 || a.getClass().isArray()) {
            Class288 a12 = a.getClass().isArray() ? new Class288(a) : (Class288)a;
            int a13 = a12.Method10();
            for (int a14 = 0; a14 < a13; ++a14) {
                Object a15 = a12.Method3128(a14);
                a4.append(Class296.Method2941(a15, "array", a3));
            }
            return a4.toString();
        }
        String a16 = "null";
        return "\"" + a16 + "\"";
    }

    static {
        Field1577 = "xsi:type";
        Field1576 = "xsi:nil";
        Field1567 = Character.valueOf((char)'&');
        Field1568 = Character.valueOf((char)'\'');
        Field1569 = Character.valueOf((char)'!');
        Field1570 = Character.valueOf((char)'=');
        Field1571 = Character.valueOf((char)'>');
        Field1572 = Character.valueOf((char)'<');
        Field1573 = Character.valueOf((char)'?');
        Field1574 = Character.valueOf((char)'\"');
        Field1575 = Character.valueOf((char)'/');
    }

    private static Exception Method2942(Exception exception) {
        return exception;
    }
}