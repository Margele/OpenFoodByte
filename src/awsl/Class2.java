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
import awsl.Class46;
import awsl.Class48;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class2
extends Class0 {
    private static final String Field18 = "Ljava/lang/Class;";
    private static final Class46 Field19 = Class46.Method3205("java/lang/Byte");
    private static final Class46 Field20 = Class46.Method3205("java/lang/Boolean");
    private static final Class46 Field21 = Class46.Method3205("java/lang/Short");
    private static final Class46 Field22 = Class46.Method3205("java/lang/Character");
    private static final Class46 Field23 = Class46.Method3205("java/lang/Integer");
    private static final Class46 Field24 = Class46.Method3205("java/lang/Float");
    private static final Class46 Field25 = Class46.Method3205("java/lang/Long");
    private static final Class46 Field26 = Class46.Method3205("java/lang/Double");
    private static final Class46 Field27 = Class46.Method3205("java/lang/Number");
    private static final Class46 Field28 = Class46.Method3205("java/lang/Object");
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
    private final Class46 Field54;
    private final Class46[] Field55;
    private final List Field56 = new ArrayList();

    public Class2(Class267 a, int a2, String a3, String a4) {
        this(327680, a, a2, a3, a4);
        if (this.getClass() != Class2.class) {
            throw new IllegalStateException();
        }
    }

    protected Class2(int a, Class267 a2, int a3, String a4, String a5) {
        super(a, a3, a5, a2);
        this.Field53 = a3;
        this.Field54 = Class46.Method3213(a5);
        this.Field55 = Class46.Method3211(a5);
    }

    public Class2(int a, Class36 a2, Class267 a3) {
        this(a3, a, null, a2.Method3425());
    }

    public Class2(int a, Class36 a2, String a3, Class46[] a4, Class167 a5) {
        this(a, a2, a5.Method1451(a, a2.Method3424(), a2.Method3425(), a3, Class2.Method1867(a4)));
    }

    private static String[] Method1867(Class46[] a) {
        return null;
    }

    public void Method1868(boolean a) {
        this.Method1869(1);
    }

    public void Method1869(int a) {
        if (a >= -1 && a <= 5) {
            this.Field1460.Method1948(3 + a);
        } else if (a >= -128 && a <= 127) {
            this.Field1460.Method854(16, a);
        } else if (a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) {
            this.Field1460.Method854(17, a);
        } else {
            this.Field1460.Method1950(new Integer(a));
        }
    }

    public void Method1870(long a) {
        if (a == 0L || a == 1L) {
            this.Field1460.Method1948(9 + (int)a);
        } else {
            this.Field1460.Method1950(new Long(a));
        }
    }

    public void Method1871(float a) {
        int a2 = Float.floatToIntBits((float)a);
        if ((long)a2 == 0L || a2 == 1065353216 || a2 == 0x40000000) {
            this.Field1460.Method1948(11 + (int)a);
        } else {
            this.Field1460.Method1950(new Float(a));
        }
    }

    public void Method1872(double a) {
        long a2 = Double.doubleToLongBits((double)a);
        if (a2 == 0L || a2 == 0x3FF0000000000000L) {
            this.Field1460.Method1948(14 + (int)a);
        } else {
            this.Field1460.Method1950(new Double(a));
        }
    }

    public void Method1873(String a) {
        this.Field1460.Method1948(1);
    }

    public void Method1874(Class46 a) {
        this.Field1460.Method1948(1);
    }

    public void Method1875(Class279 a) {
        this.Field1460.Method1950(a);
    }

    private int Method1876(int a) {
        int a2 = (this.Field53 & 8) == 0 ? 1 : 0;
        for (int a3 = 0; a3 < a; ++a3) {
            a2 += this.Field55[a3].Method3233();
        }
        return a2;
    }

    private void Method1877(Class46 a, int a2) {
        this.Field1460.Method1840(a.Method3234(21), a2);
    }

    private void Method1878(Class46 a, int a2) {
        this.Field1460.Method1840(a.Method3234(54), a2);
    }

    public void Method1879() {
        if ((this.Field53 & 8) != 0) {
            throw new IllegalStateException("no 'this' pointer within static method");
        }
        this.Field1460.Method1840(25, 0);
    }

    public void Method1880(int a) {
        this.Method1877(this.Field55[a], this.Method1876(a));
    }

    public void Method1881(int a, int a2) {
        int a3 = this.Method1876(a);
        for (int a4 = 0; a4 < a2; ++a4) {
            Class46 a5 = this.Field55[a + a4];
            this.Method1877(a5, a3);
            a3 += a5.Method3233();
        }
    }

    public void Method1882() {
        this.Method1881(0, this.Field55.length);
    }

    public void Method1883() {
        this.Method1869(this.Field55.length);
        this.Method1936(Field28);
        for (int a = 0; a < this.Field55.length; ++a) {
            this.Method1894();
            this.Method1869(a);
            this.Method1880(a);
            this.Method1907(this.Field55[a]);
            this.Method1891(Field28);
        }
    }

    public void Method1884(int a) {
        this.Method1878(this.Field55[a], this.Method1876(a));
    }

    public Class46 Method1885(int a) {
        return (Class46)this.Field56.get(a - this.Field3);
    }

    @Override
    protected void Method1848(int a, Class46 a2) {
        int a3 = a - this.Field3;
        while (this.Field56.Method1799() < a3 + 1) {
            this.Field56.Method2530(null);
        }
        this.Field56.set(a3, (Object)a2);
    }

    public void Method1886(int a) {
        this.Method1877(this.Method1885(a), a);
    }

    public void Method1887(int a, Class46 a2) {
        this.Method1848(a, a2);
        this.Method1877(a2, a);
    }

    public void Method1888(int a) {
        this.Method1878(this.Method1885(a), a);
    }

    public void Method1889(int a, Class46 a2) {
        this.Method1848(a, a2);
        this.Method1878(a2, a);
    }

    public void Method1890(Class46 a) {
        this.Field1460.Method1948(a.Method3234(46));
    }

    public void Method1891(Class46 a) {
        this.Field1460.Method1948(a.Method3234(79));
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

    public void Method1901(Class46 a, Class46 a2) {
        if (a2.Method3233() == 1) {
            if (a.Method3233() == 1) {
                this.Method1900();
            } else {
                this.Method1897();
                this.Method1892();
            }
        } else if (a.Method3233() == 1) {
            this.Method1898();
            this.Method1893();
        } else {
            this.Method1899();
            this.Method1893();
        }
    }

    public void Method1902(int a, Class46 a2) {
        this.Field1460.Method1948(a2.Method3234(a));
    }

    public void Method1903() {
        this.Field1460.Method1948(4);
        this.Field1460.Method1948(130);
    }

    public void Method1904(int a, int a2) {
        this.Field1460.Method1841(a, a2);
    }

    public void Method1905(Class46 a, Class46 a2) {
        block15: {
            boolean bl = Class37.Method3382();
            if (a == a2) break block15;
            if (a == Class46.Field580) {
                if (a2 == Class46.Field578) {
                    this.Field1460.Method1948(144);
                }
                if (a2 == Class46.Field579) {
                    this.Field1460.Method1948(143);
                }
                this.Field1460.Method1948(142);
                this.Method1905(Class46.Field577, a2);
            }
            if (a == Class46.Field578) {
                if (a2 == Class46.Field580) {
                    this.Field1460.Method1948(141);
                }
                if (a2 == Class46.Field579) {
                    this.Field1460.Method1948(140);
                }
                this.Field1460.Method1948(139);
                this.Method1905(Class46.Field577, a2);
            }
            if (a == Class46.Field579) {
                if (a2 == Class46.Field580) {
                    this.Field1460.Method1948(138);
                }
                if (a2 == Class46.Field578) {
                    this.Field1460.Method1948(137);
                }
                this.Field1460.Method1948(136);
                this.Method1905(Class46.Field577, a2);
            }
            if (a2 == Class46.Field575) {
                this.Field1460.Method1948(145);
            }
            if (a2 == Class46.Field574) {
                this.Field1460.Method1948(146);
            }
            if (a2 == Class46.Field580) {
                this.Field1460.Method1948(135);
            }
            if (a2 == Class46.Field578) {
                this.Field1460.Method1948(134);
            }
            if (a2 == Class46.Field579) {
                this.Field1460.Method1948(133);
            }
            if (a2 == Class46.Field576) {
                this.Field1460.Method1948(147);
            }
        }
    }

    private static Class46 Method1906(Class46 a) {
        switch (a.Method3217()) {
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
        return a;
    }

    public void Method1907(Class46 a) {
        if (a.Method3217() == 10 || a.Method3217() == 9) {
            return;
        }
        if (a == Class46.Field572) {
            this.Method1873(null);
        } else {
            Class46 a2 = Class2.Method1906(a);
            this.Method1935(a2);
            if (a.Method3233() == 2) {
                this.Method1897();
                this.Method1897();
                this.Method1892();
            } else {
                this.Method1896();
                this.Method1900();
            }
            this.Method1930(a2, new Class36("<init>", Class46.Field572, new Class46[]{a}));
        }
    }

    public void Method1908(Class46 a) {
        if (a.Method3217() == 10 || a.Method3217() == 9) {
            return;
        }
        if (a == Class46.Field572) {
            this.Method1873(null);
        } else {
            Class46 a2 = Class2.Method1906(a);
            this.Method1931(a2, new Class36("valueOf", a2, new Class46[]{a}));
        }
    }

    public void Method1909(Class46 a) {
        Class46 a2 = Field27;
        Class36 a3 = null;
        switch (a.Method3217()) {
            case 0: {
                return;
            }
            case 2: {
                a2 = Field22;
                a3 = Field30;
                break;
            }
            case 1: {
                a2 = Field20;
                a3 = Field29;
                break;
            }
            case 8: {
                a3 = Field34;
                break;
            }
            case 6: {
                a3 = Field32;
                break;
            }
            case 7: {
                a3 = Field33;
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                a3 = Field31;
            }
        }
        this.Method1940(a);
    }

    public Class264 Method1910() {
        return new Class264();
    }

    public void Method1911(Class264 a) {
        this.Field1460.Method1947(a);
    }

    public Class264 Method1912() {
        Class264 a = new Class264();
        this.Field1460.Method1947(a);
        return a;
    }

    public void Method1913(Class46 a, int a2, Class264 a3) {
        switch (a.Method3217()) {
            case 7: {
                this.Field1460.Method1948(148);
                break;
            }
            case 8: {
                this.Field1460.Method1948(a2 == 156 || a2 == 157 ? 151 : 152);
                break;
            }
            case 6: {
                this.Field1460.Method1948(a2 == 156 || a2 == 157 ? 149 : 150);
                break;
            }
            case 9: 
            case 10: {
                switch (a2) {
                    case 153: {
                        this.Field1460.Method1957(165, a3);
                        return;
                    }
                    case 154: {
                        this.Field1460.Method1957(166, a3);
                        return;
                    }
                }
                throw new IllegalArgumentException("Bad comparison for type " + a);
            }
            default: {
                int a4 = -1;
                switch (a2) {
                    case 153: {
                        a4 = 159;
                        break;
                    }
                    case 154: {
                        a4 = 160;
                        break;
                    }
                    case 156: {
                        a4 = 162;
                        break;
                    }
                    case 155: {
                        a4 = 161;
                        break;
                    }
                    case 158: {
                        a4 = 164;
                        break;
                    }
                    case 157: {
                        a4 = 163;
                    }
                }
                this.Field1460.Method1957(a4, a3);
                return;
            }
        }
        this.Field1460.Method1957(a2, a3);
    }

    public void Method1914(int a, Class264 a2) {
        this.Method1913(Class46.Field577, a, a2);
    }

    public void Method1915(int a, Class264 a2) {
        this.Field1460.Method1957(a, a2);
    }

    public void Method1916(Class264 a) {
        this.Field1460.Method1957(198, a);
    }

    public void Method1917(Class264 a) {
        this.Field1460.Method1957(199, a);
    }

    public void Method1918(Class264 a) {
        this.Field1460.Method1957(167, a);
    }

    public void Method1919(int a) {
        this.Field1460.Method1840(169, a);
    }

    public void Method1920(int[] a, Class48 a2) {
        float a3 = a.length == 0 ? 0.0f : (float)a.length / (float)(a[a.length - 1] - a[0] + 1);
        this.Method1921(a, a2, a3 >= 0.5f);
    }

    public void Method1921(int[] a, Class48 a2, boolean a3) {
        for (int a4 = 1; a4 < a.length; ++a4) {
            if (a[a4] >= a[a4 - 1]) continue;
            throw new IllegalArgumentException("keys must be sorted ascending");
        }
        Class264 a5 = this.Method1910();
        Class264 a6 = this.Method1910();
        if (a.length > 0) {
            int a7;
            int a8 = a.length;
            int a9 = a[0];
            int a10 = a[a8 - 1];
            int a11 = a10 - a9 + 1;
            Object[] a12 = new Class264[a11];
            Arrays.fill((Object[])a12, (Object)a5);
            for (a7 = 0; a7 < a8; ++a7) {
                a12[a[a7] - a9] = this.Method1910();
            }
            this.Field1460.Method1959(a9, a10, a5, (Class264[])a12);
            for (a7 = 0; a7 < a11; ++a7) {
                Object a13 = a12[a7];
                if (a13 == a5) continue;
                this.Method1911((Class264)a13);
                a2.Method3199(a7 + a9, a6);
            }
        }
        this.Method1911(a5);
        a2.Method3200();
        this.Method1911(a6);
    }

    public void Method1922() {
        this.Field1460.Method1948(this.Field54.Method3234(172));
    }

    private void Method1923(int a, Class46 a2, String a3, Class46 a4) {
        this.Field1460.Method1949(a, a2.Method3221(), a3, a4.Method3225());
    }

    public void Method1924(Class46 a, String a2, Class46 a3) {
        this.Method1923(178, a, a2, a3);
    }

    public void Method1925(Class46 a, String a2, Class46 a3) {
        this.Method1923(179, a, a2, a3);
    }

    public void Method1926(Class46 a, String a2, Class46 a3) {
        this.Method1923(180, a, a2, a3);
    }

    public void Method1927(Class46 a, String a2, Class46 a3) {
        this.Method1923(181, a, a2, a3);
    }

    private void Method1928(int a, Class46 a2, Class36 a3, boolean a4) {
        String a5 = a2.Method3217() == 9 ? a2.Method3225() : a2.Method3221();
        this.Field1460.Method1954(a, a5, a3.Method3424(), a3.Method3425(), a4);
    }

    public void Method1929(Class46 a, Class36 a2) {
        this.Method1928(182, a, a2, false);
    }

    public void Method1930(Class46 a, Class36 a2) {
        this.Method1928(183, a, a2, false);
    }

    public void Method1931(Class46 a, Class36 a2) {
        this.Method1928(184, a, a2, false);
    }

    public void Method1932(Class46 a, Class36 a2) {
        this.Method1928(185, a, a2, true);
    }

    public void Method1933(String a, String a2, Class279 a3, Object[] a4) {
        this.Field1460.Method1956(a, a2, a3, a4);
    }

    private void Method1934(int a, Class46 a2) {
        this.Field1460.Method1952(a, a2.Method3221());
    }

    public void Method1935(Class46 a) {
        this.Method1934(187, a);
    }

    public void Method1936(Class46 a) {
        int a2;
        switch (a.Method3217()) {
            case 1: {
                a2 = 4;
                break;
            }
            case 2: {
                a2 = 5;
                break;
            }
            case 3: {
                a2 = 8;
                break;
            }
            case 4: {
                a2 = 9;
                break;
            }
            case 5: {
                a2 = 10;
                break;
            }
            case 6: {
                a2 = 6;
                break;
            }
            case 7: {
                a2 = 11;
                break;
            }
            case 8: {
                a2 = 7;
                break;
            }
            default: {
                this.Method1934(189, a);
                return;
            }
        }
        this.Field1460.Method854(188, a2);
    }

    public void Method1937() {
        this.Field1460.Method1948(190);
    }

    public void Method1938() {
        this.Field1460.Method1948(191);
    }

    public void Method1939(Class46 a, String a2) {
        this.Method1935(a);
        this.Method1894();
        this.Method1873(a2);
        this.Method1930(a, Class36.Method3421("void <init> (String)"));
        this.Method1938();
    }

    public void Method1940(Class46 a) {
        block0: {
            if (a.Method3235(Field28)) break block0;
            this.Method1934(192, a);
        }
    }

    public void Method1941(Class46 a) {
        this.Method1934(193, a);
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

    public void Method1945(Class264 a, Class264 a2, Class46 a3) {
        this.Field1460.Method1960(a, a2, this.Method1912(), null);
    }

    private static IllegalStateException Method1946(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}