/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package awsl;

import awsl.Class0;
import awsl.Class167;
import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class36;
import awsl.Class37;
import awsl.Class48;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import obfuscate.b;

public class Class2
extends Class0 {
    private static final String Field18 = "Ljava/lang/Class;";
    private static final b Field19 = b.Method3205("java/lang/Byte");
    private static final b Field20 = b.Method3205("java/lang/Boolean");
    private static final b Field21 = b.Method3205("java/lang/Short");
    private static final b Field22 = b.Method3205("java/lang/Character");
    private static final b Field23 = b.Method3205("java/lang/Integer");
    private static final b Field24 = b.Method3205("java/lang/Float");
    private static final b Field25 = b.Method3205("java/lang/Long");
    private static final b Field26 = b.Method3205("java/lang/Double");
    private static final b Field27 = b.Method3205("java/lang/Number");
    private static final b Field28 = b.Method3205("java/lang/Object");
    private static final Class36 Field29 = Class36.Method3421("boolean booleanValue()");
    private static final Class36 Field30 = Class36.Method3421("char charValue()");
    private static final Class36 Field31 = Class36.Method3421("int intValue()");
    private static final Class36 Field32 = Class36.Method3421("float floatValue()");
    private static final Class36 Field33 = Class36.Method3421("long longValue()");
    private static final Class36 Field34 = Class36.Method3421("double doubleValue()");
    public static final int Field35 = 96;
    public static final int Field36 = 100;
    public static final int Field37 = 104;
    public static final int Field38 = 108;
    public static final int Field39 = 112;
    public static final int Field40 = 116;
    public static final int Field41 = 120;
    public static final int Field42 = 122;
    public static final int Field43 = 124;
    public static final int Field44 = 126;
    public static final int Field45 = 128;
    public static final int Field46 = 130;
    public static final int Field47 = 153;
    public static final int Field48 = 154;
    public static final int Field49 = 155;
    public static final int Field50 = 156;
    public static final int Field51 = 157;
    public static final int Field52 = 158;
    private final int Field53;
    private final b Field54;
    private final b[] Field55;
    private final List Field56 = new ArrayList();

    public Class2(Class267 a, int a2, String a3, String a4) {
        this(327680, a, a2, a3, a4);
        if (this.getClass() != Class2.class) {
            throw new IllegalStateException();
        }
    }

    protected Class2(int a2, Class267 a3, int a4, String a5, String a6) {
        super(a2, a4, a6, a3);
        this.Field53 = a4;
        this.Field54 = b.Method3213(a6);
        this.Field55 = b.Method3211(a6);
    }

    public Class2(int a2, Class36 a3, Class267 a4) {
        this(a4, a2, null, a3.Method3425());
    }

    public Class2(int a2, Class36 a3, String a4, b[] a5, Class167 a6) {
        this(a2, a3, a6.Method1451(a2, a3.Method3424(), a3.Method3425(), a4, Class2.Method1867(a5)));
    }

    private static String[] Method1867(b[] a2) {
        return null;
    }

    public void Method1868(boolean a2) {
        this.Method1869(1);
    }

    public void Method1869(int a2) {
        if (a2 >= -1 && a2 <= 5) {
            this.Field1460.Method1948(3 + a2);
        } else if (a2 >= -128 && a2 <= 127) {
            this.Field1460.Method854(16, a2);
        } else if (a2 >= Short.MIN_VALUE && a2 <= Short.MAX_VALUE) {
            this.Field1460.Method854(17, a2);
        } else {
            this.Field1460.Method1950(new Integer(a2));
        }
    }

    public void Method1870(long a2) {
        if (a2 == 0L || a2 == 1L) {
            this.Field1460.Method1948(9 + (int)a2);
        } else {
            this.Field1460.Method1950(new Long(a2));
        }
    }

    public void Method1871(float a2) {
        int a3 = Float.floatToIntBits((float)a2);
        if ((long)a3 == 0L || a3 == 1065353216 || a3 == 0x40000000) {
            this.Field1460.Method1948(11 + (int)a2);
        } else {
            this.Field1460.Method1950(new Float(a2));
        }
    }

    public void Method1872(double a2) {
        long a3 = Double.doubleToLongBits((double)a2);
        if (a3 == 0L || a3 == 0x3FF0000000000000L) {
            this.Field1460.Method1948(14 + (int)a2);
        } else {
            this.Field1460.Method1950(new Double(a2));
        }
    }

    public void Method1873(String a2) {
        this.Field1460.Method1948(1);
    }

    public void Method1874(b a2) {
        this.Field1460.Method1948(1);
    }

    public void Method1875(Class279 a2) {
        this.Field1460.Method1950(a2);
    }

    private int Method1876(int a2) {
        int a3 = (this.Field53 & 8) == 0 ? 1 : 0;
        for (int a4 = 0; a4 < a2; ++a4) {
            a3 += this.Field55[a4].Method3233();
        }
        return a3;
    }

    private void Method1877(b a2, int a3) {
        this.Field1460.Method1840(a2.Method3234(21), a3);
    }

    private void Method1878(b a2, int a3) {
        this.Field1460.Method1840(a2.Method3234(54), a3);
    }

    public void Method1879() {
        if ((this.Field53 & 8) != 0) {
            throw new IllegalStateException("no 'this' pointer within static method");
        }
        this.Field1460.Method1840(25, 0);
    }

    public void Method1880(int a2) {
        this.Method1877(this.Field55[a2], this.Method1876(a2));
    }

    public void Method1881(int a2, int a3) {
        int a4 = this.Method1876(a2);
        for (int a5 = 0; a5 < a3; ++a5) {
            b a6 = this.Field55[a2 + a5];
            this.Method1877(a6, a4);
            a4 += a6.Method3233();
        }
    }

    public void Method1882() {
        this.Method1881(0, this.Field55.length);
    }

    public void Method1883() {
        this.Method1869(this.Field55.length);
        this.Method1936(Field28);
        for (int a2 = 0; a2 < this.Field55.length; ++a2) {
            this.Method1894();
            this.Method1869(a2);
            this.Method1880(a2);
            this.Method1907(this.Field55[a2]);
            this.Method1891(Field28);
        }
    }

    public void Method1884(int a2) {
        this.Method1878(this.Field55[a2], this.Method1876(a2));
    }

    public b Method1885(int a2) {
        return (b)this.Field56.get(a2 - this.Field3);
    }

    @Override
    protected void Method1848(int a2, b a3) {
        int a4 = a2 - this.Field3;
        while (this.Field56.Method1799() < a4 + 1) {
            this.Field56.Method2530(null);
        }
        this.Field56.set(a4, (Object)a3);
    }

    public void Method1886(int a2) {
        this.Method1877(this.Method1885(a2), a2);
    }

    public void Method1887(int a2, b a3) {
        this.Method1848(a2, a3);
        this.Method1877(a3, a2);
    }

    public void Method1888(int a2) {
        this.Method1878(this.Method1885(a2), a2);
    }

    public void Method1889(int a2, b a3) {
        this.Method1848(a2, a3);
        this.Method1878(a3, a2);
    }

    public void Method1890(b a2) {
        this.Field1460.Method1948(a2.Method3234(46));
    }

    public void Method1891(b a2) {
        this.Field1460.Method1948(a2.Method3234(79));
    }

    public void Method1892() {
        this.Field1460.Method1948(87);
    }

    public void Method1893() {
        this.Field1460.Method1948(88);
    }

    public void Method1894() {
        this.Field1460.Method1948(89);
    }

    public void Method1895() {
        this.Field1460.Method1948(92);
    }

    public void Method1896() {
        this.Field1460.Method1948(90);
    }

    public void Method1897() {
        this.Field1460.Method1948(91);
    }

    public void Method1898() {
        this.Field1460.Method1948(93);
    }

    public void Method1899() {
        this.Field1460.Method1948(94);
    }

    public void Method1900() {
        this.Field1460.Method1948(95);
    }

    public void Method1901(b a2, b a3) {
        if (a3.Method3233() == 1) {
            if (a2.Method3233() == 1) {
                this.Method1900();
            } else {
                this.Method1897();
                this.Method1892();
            }
        } else if (a2.Method3233() == 1) {
            this.Method1898();
            this.Method1893();
        } else {
            this.Method1899();
            this.Method1893();
        }
    }

    public void Method1902(int a2, b a3) {
        this.Field1460.Method1948(a3.Method3234(a2));
    }

    public void Method1903() {
        this.Field1460.Method1948(4);
        this.Field1460.Method1948(130);
    }

    public void Method1904(int a2, int a3) {
        this.Field1460.Method1841(a2, a3);
    }

    public void Method1905(b a2, b a3) {
        block15: {
            boolean bl = Class37.Method3382();
            if (a2 == a3) break block15;
            if (a2 == b.Field580) {
                if (a3 == b.Field578) {
                    this.Field1460.Method1948(144);
                }
                if (a3 == b.Field579) {
                    this.Field1460.Method1948(143);
                }
                this.Field1460.Method1948(142);
                this.Method1905(b.Field577, a3);
            }
            if (a2 == b.Field578) {
                if (a3 == b.Field580) {
                    this.Field1460.Method1948(141);
                }
                if (a3 == b.Field579) {
                    this.Field1460.Method1948(140);
                }
                this.Field1460.Method1948(139);
                this.Method1905(b.Field577, a3);
            }
            if (a2 == b.Field579) {
                if (a3 == b.Field580) {
                    this.Field1460.Method1948(138);
                }
                if (a3 == b.Field578) {
                    this.Field1460.Method1948(137);
                }
                this.Field1460.Method1948(136);
                this.Method1905(b.Field577, a3);
            }
            if (a3 == b.Field575) {
                this.Field1460.Method1948(145);
            }
            if (a3 == b.Field574) {
                this.Field1460.Method1948(146);
            }
            if (a3 == b.Field580) {
                this.Field1460.Method1948(135);
            }
            if (a3 == b.Field578) {
                this.Field1460.Method1948(134);
            }
            if (a3 == b.Field579) {
                this.Field1460.Method1948(133);
            }
            if (a3 == b.Field576) {
                this.Field1460.Method1948(147);
            }
        }
    }

    private static b Method1906(b a2) {
        switch (a2.Method3217()) {
            case 3: {
                return Field19;
            }
            case 1: {
                return Field20;
            }
            case 4: {
                return Field21;
            }
            case 2: {
                return Field22;
            }
            case 5: {
                return Field23;
            }
            case 6: {
                return Field24;
            }
            case 7: {
                return Field25;
            }
            case 8: {
                return Field26;
            }
        }
        return a2;
    }

    public void Method1907(b a2) {
        if (a2.Method3217() == 10 || a2.Method3217() == 9) {
            return;
        }
        if (a2 == b.Field572) {
            this.Method1873(null);
        } else {
            b a3 = Class2.Method1906(a2);
            this.Method1935(a3);
            if (a2.Method3233() == 2) {
                this.Method1897();
                this.Method1897();
                this.Method1892();
            } else {
                this.Method1896();
                this.Method1900();
            }
            this.Method1930(a3, new Class36("<init>", b.Field572, new b[]{a2}));
        }
    }

    public void Method1908(b a2) {
        if (a2.Method3217() == 10 || a2.Method3217() == 9) {
            return;
        }
        if (a2 == b.Field572) {
            this.Method1873(null);
        } else {
            b a3 = Class2.Method1906(a2);
            this.Method1931(a3, new Class36("valueOf", a3, new b[]{a2}));
        }
    }

    public void Method1909(b a2) {
        b a3 = Field27;
        Class36 a4 = null;
        switch (a2.Method3217()) {
            case 0: {
                return;
            }
            case 2: {
                a3 = Field22;
                a4 = Field30;
                break;
            }
            case 1: {
                a3 = Field20;
                a4 = Field29;
                break;
            }
            case 8: {
                a4 = Field34;
                break;
            }
            case 6: {
                a4 = Field32;
                break;
            }
            case 7: {
                a4 = Field33;
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                a4 = Field31;
            }
        }
        this.Method1940(a2);
    }

    public Class264 Method1910() {
        return new Class264();
    }

    public void Method1911(Class264 a2) {
        this.Field1460.Method1947(a2);
    }

    public Class264 Method1912() {
        Class264 a2 = new Class264();
        this.Field1460.Method1947(a2);
        return a2;
    }

    public void Method1913(b a2, int a3, Class264 a4) {
        switch (a2.Method3217()) {
            case 7: {
                this.Field1460.Method1948(148);
                break;
            }
            case 8: {
                this.Field1460.Method1948(a3 == 156 || a3 == 157 ? 151 : 152);
                break;
            }
            case 6: {
                this.Field1460.Method1948(a3 == 156 || a3 == 157 ? 149 : 150);
                break;
            }
            case 9: 
            case 10: {
                switch (a3) {
                    case 153: {
                        this.Field1460.Method1957(165, a4);
                        return;
                    }
                    case 154: {
                        this.Field1460.Method1957(166, a4);
                        return;
                    }
                }
                throw new IllegalArgumentException("Bad comparison for type " + a2);
            }
            default: {
                int a5 = -1;
                switch (a3) {
                    case 153: {
                        a5 = 159;
                        break;
                    }
                    case 154: {
                        a5 = 160;
                        break;
                    }
                    case 156: {
                        a5 = 162;
                        break;
                    }
                    case 155: {
                        a5 = 161;
                        break;
                    }
                    case 158: {
                        a5 = 164;
                        break;
                    }
                    case 157: {
                        a5 = 163;
                    }
                }
                this.Field1460.Method1957(a5, a4);
                return;
            }
        }
        this.Field1460.Method1957(a3, a4);
    }

    public void Method1914(int a2, Class264 a3) {
        this.Method1913(b.Field577, a2, a3);
    }

    public void Method1915(int a2, Class264 a3) {
        this.Field1460.Method1957(a2, a3);
    }

    public void Method1916(Class264 a2) {
        this.Field1460.Method1957(198, a2);
    }

    public void Method1917(Class264 a2) {
        this.Field1460.Method1957(199, a2);
    }

    public void Method1918(Class264 a2) {
        this.Field1460.Method1957(167, a2);
    }

    public void Method1919(int a2) {
        this.Field1460.Method1840(169, a2);
    }

    public void Method1920(int[] a2, Class48 a3) {
        float a4 = a2.length == 0 ? 0.0f : (float)a2.length / (float)(a2[a2.length - 1] - a2[0] + 1);
        this.Method1921(a2, a3, a4 >= 0.5f);
    }

    public void Method1921(int[] a2, Class48 a3, boolean a4) {
        for (int a5 = 1; a5 < a2.length; ++a5) {
            if (a2[a5] >= a2[a5 - 1]) continue;
            throw new IllegalArgumentException("keys must be sorted ascending");
        }
        Class264 a6 = this.Method1910();
        Class264 a7 = this.Method1910();
        if (a2.length > 0) {
            int a8;
            int a9 = a2.length;
            int a10 = a2[0];
            int a11 = a2[a9 - 1];
            int a12 = a11 - a10 + 1;
            Object[] a13 = new Class264[a12];
            Arrays.fill((Object[])a13, (Object)a6);
            for (a8 = 0; a8 < a9; ++a8) {
                a13[a2[a8] - a10] = this.Method1910();
            }
            this.Field1460.Method1959(a10, a11, a6, (Class264[])a13);
            for (a8 = 0; a8 < a12; ++a8) {
                Object a14 = a13[a8];
                if (a14 == a6) continue;
                this.Method1911((Class264)a14);
                a3.Method3199(a8 + a10, a7);
            }
        }
        this.Method1911(a6);
        a3.Method3200();
        this.Method1911(a7);
    }

    public void Method1922() {
        this.Field1460.Method1948(this.Field54.Method3234(172));
    }

    private void Method1923(int a2, b a3, String a4, b a5) {
        this.Field1460.Method1949(a2, a3.Method3221(), a4, a5.Method3225());
    }

    public void Method1924(b a2, String a3, b a4) {
        this.Method1923(178, a2, a3, a4);
    }

    public void Method1925(b a2, String a3, b a4) {
        this.Method1923(179, a2, a3, a4);
    }

    public void Method1926(b a2, String a3, b a4) {
        this.Method1923(180, a2, a3, a4);
    }

    public void Method1927(b a2, String a3, b a4) {
        this.Method1923(181, a2, a3, a4);
    }

    private void Method1928(int a2, b a3, Class36 a4, boolean a5) {
        String a6 = a3.Method3217() == 9 ? a3.Method3225() : a3.Method3221();
        this.Field1460.Method1954(a2, a6, a4.Method3424(), a4.Method3425(), a5);
    }

    public void Method1929(b a2, Class36 a3) {
        this.Method1928(182, a2, a3, false);
    }

    public void Method1930(b a2, Class36 a3) {
        this.Method1928(183, a2, a3, false);
    }

    public void Method1931(b a2, Class36 a3) {
        this.Method1928(184, a2, a3, false);
    }

    public void Method1932(b a2, Class36 a3) {
        this.Method1928(185, a2, a3, true);
    }

    public void Method1933(String a2, String a3, Class279 a4, Object[] a5) {
        this.Field1460.Method1956(a2, a3, a4, a5);
    }

    private void Method1934(int a2, b a3) {
        this.Field1460.Method1952(a2, a3.Method3221());
    }

    public void Method1935(b a2) {
        this.Method1934(187, a2);
    }

    public void Method1936(b a2) {
        int a3;
        switch (a2.Method3217()) {
            case 1: {
                a3 = 4;
                break;
            }
            case 2: {
                a3 = 5;
                break;
            }
            case 3: {
                a3 = 8;
                break;
            }
            case 4: {
                a3 = 9;
                break;
            }
            case 5: {
                a3 = 10;
                break;
            }
            case 6: {
                a3 = 6;
                break;
            }
            case 7: {
                a3 = 11;
                break;
            }
            case 8: {
                a3 = 7;
                break;
            }
            default: {
                this.Method1934(189, a2);
                return;
            }
        }
        this.Field1460.Method854(188, a3);
    }

    public void Method1937() {
        this.Field1460.Method1948(190);
    }

    public void Method1938() {
        this.Field1460.Method1948(191);
    }

    public void Method1939(b a2, String a3) {
        this.Method1935(a2);
        this.Method1894();
        this.Method1873(a3);
        this.Method1930(a2, Class36.Method3421("void <init> (String)"));
        this.Method1938();
    }

    public void Method1940(b a2) {
        block0: {
            if (a2.Method3235(Field28)) break block0;
            this.Method1934(192, a2);
        }
    }

    public void Method1941(b a2) {
        this.Method1934(193, a2);
    }

    public void Method1942() {
        this.Field1460.Method1948(194);
    }

    public void Method1943() {
        this.Field1460.Method1948(195);
    }

    public void Method1944() {
        if ((this.Field53 & 0x400) == 0) {
            this.Field1460.Method1842(0, 0);
        }
        this.Field1460.Method1653();
    }

    public void Method1945(Class264 a2, Class264 a3, b a4) {
        this.Field1460.Method1960(a2, a3, this.Method1912(), null);
    }

    private static IllegalStateException Method1946(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}