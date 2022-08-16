/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.ClassLoader
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class136;
import awsl.Class148;
import awsl.Class167;
import awsl.Class169;
import awsl.Class247;
import awsl.Class261;
import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class31;
import awsl.Class45;
import java.io.IOException;
import java.io.InputStream;
import obfuscate.b;

public class Class165 {
    static final boolean Field1020 = true;
    static final boolean Field1021 = true;
    static final boolean Field1022 = true;
    static final boolean Field1023 = true;
    static final boolean Field1024 = true;
    public static final int Field1025 = 1;
    public static final int Field1026 = 2;
    public static final int Field1027 = 4;
    public static final int Field1028 = 8;
    public final byte[] Field1029;
    private final int[] Field1030;
    private final String[] Field1031;
    private final int Field1032;
    public final int Field1033;

    public Class165(byte[] a) {
        this(a, 0, a.length);
    }

    public Class165(byte[] a, int a2, int a3) {
        this.Field1029 = a;
        if (this.Method1491(a2 + 6) > 52) {
            throw new IllegalArgumentException();
        }
        this.Field1030 = new int[this.Method1490(a2 + 8)];
        int a4 = this.Field1030.length;
        this.Field1031 = new String[a4];
        int a5 = 0;
        int a6 = a2 + 10;
        for (int a7 = 1; a7 < a4; ++a7) {
            int a8;
            this.Field1030[a7] = a6 + 1;
            switch (a[a6]) {
                case 3: 
                case 4: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 18: {
                    a8 = 5;
                    break;
                }
                case 5: 
                case 6: {
                    a8 = 9;
                    ++a7;
                    break;
                }
                case 1: {
                    a8 = 3 + this.Method1490(a6 + 1);
                    if (a8 <= a5) break;
                    a5 = a8;
                    break;
                }
                case 15: {
                    a8 = 4;
                    break;
                }
                default: {
                    a8 = 3;
                }
            }
            a6 += a8;
        }
        this.Field1032 = a5;
        this.Field1033 = a6;
    }

    public int Method1463() {
        return this.Method1490(this.Field1033);
    }

    public String Method1464() {
        return this.Method1496(this.Field1033 + 2, new char[this.Field1032]);
    }

    public String Method1465() {
        return this.Method1496(this.Field1033 + 4, new char[this.Field1032]);
    }

    public String[] Method1466() {
        int a = this.Field1033 + 6;
        int a2 = this.Method1490(a);
        String[] a3 = new String[a2];
        char[] a4 = new char[this.Field1032];
        for (int a5 = 0; a5 < a2; ++a5) {
            a3[a5] = this.Method1496(a += 2, a4);
        }
        return a3;
    }

    void Method1467(Class169 a) {
        int a2;
        char[] a3 = new char[this.Field1032];
        int a4 = this.Field1030.length;
        Class261[] a5 = new Class261[a4];
        for (a2 = 1; a2 < a4; ++a2) {
            int a6;
            int a7 = this.Field1030[a2];
            byte a8 = this.Field1029[a7 - 1];
            Class261 a9 = new Class261(a2);
            switch (a8) {
                case 9: 
                case 10: 
                case 11: {
                    int a10 = this.Field1030[this.Method1490(a7 + 2)];
                    a9.Method2831(a8, this.Method1496(a7, a3), this.Method1494(a10, a3), this.Method1494(a10 + 2, a3));
                    break;
                }
                case 3: {
                    a9.Method2827(this.Method1492(a7));
                    break;
                }
                case 4: {
                    a9.Method2829(Float.intBitsToFloat((int)this.Method1492(a7)));
                    break;
                }
                case 12: {
                    a9.Method2831(a8, this.Method1494(a7, a3), this.Method1494(a7 + 2, a3), null);
                    break;
                }
                case 5: {
                    a9.Method2828(this.Method1493(a7));
                    ++a2;
                    break;
                }
                case 6: {
                    a9.Method2830(Double.longBitsToDouble((long)this.Method1493(a7)));
                    ++a2;
                    break;
                }
                case 1: {
                    String a11 = this.Field1031[a2];
                    a7 = this.Field1030[a2];
                    a11 = this.Field1031[a2] = this.Method1495(a7 + 2, this.Method1490(a7), a3);
                    a9.Method2831(a8, a11, null, null);
                    break;
                }
                case 15: {
                    a6 = this.Field1030[this.Method1490(a7 + 1)];
                    int a10 = this.Field1030[this.Method1490(a6 + 2)];
                    a9.Method2831(20 + this.Method1489(a7), this.Method1496(a6, a3), this.Method1494(a10, a3), this.Method1494(a10 + 2, a3));
                    break;
                }
                case 18: {
                    if (a.Field1110 == null) {
                        this.Method1468(a, a5, a3);
                    }
                    int a10 = this.Field1030[this.Method1490(a7 + 2)];
                    a9.Method2832(this.Method1494(a10, a3), this.Method1494(a10 + 2, a3), this.Method1490(a7));
                    break;
                }
                default: {
                    a9.Method2831(a8, this.Method1494(a7, a3), null, null);
                }
            }
            a6 = a9.Field1433 % a5.length;
            a9.Field1434 = a5[a6];
            a5[a6] = a9;
        }
        a2 = this.Field1030[1] - 1;
        a.Field1082.Method493(this.Field1029, a2, this.Field1033 - a2);
        a.Field1083 = a5;
        a.Field1084 = (int)(0.75 * (double)a4);
        a.Field1081 = a4;
    }

    private void Method1468(Class169 a, Class261[] a2, char[] a3) {
        int a4 = this.Method1484();
        boolean a5 = false;
        int a6 = this.Method1490(a4);
        while (true) {
            String a7 = this.Method1494(a4 + 2, a3);
            if ("BootstrapMethods".equals((Object)a7)) break;
            a4 += 6 + this.Method1492(a4 + 4);
            --a6;
        }
        a5 = true;
    }

    public Class165(InputStream a) throws IOException {
        this(Class165.Method1469(a, false));
    }

    public Class165(String a) throws IOException {
        this(Class165.Method1469(ClassLoader.getSystemResourceAsStream((String)(a.replace('.', '/') + ".class")), true));
    }

    private static byte[] Method1469(InputStream a, boolean a2) throws IOException {
        throw new IOException("Class not found");
    }

    public void Method1470(Class167 a, int a2) {
        this.Method1471(a, new Class136[0], a2);
    }

    public void Method1471(Class167 a, Class136[] a2, int a3) {
        int a4 = this.Field1033;
        char[] a5 = new char[this.Field1032];
        Class247 a6 = new Class247();
        a6.Field1352 = a2;
        a6.Field1353 = a3;
        a6.Field1354 = a5;
        int a7 = this.Method1490(a4);
        String a8 = this.Method1496(a4 + 2, a5);
        String a9 = this.Method1496(a4 + 4, a5);
        String[] a10 = new String[this.Method1490(a4 + 6)];
        a4 += 8;
        for (int a11 = 0; a11 < a10.length; ++a11) {
            a10[a11] = this.Method1496(a4, a5);
            a4 += 2;
        }
        String a12 = null;
        String a13 = null;
        String a14 = null;
        String a15 = null;
        String a16 = null;
        String a17 = null;
        int a18 = 0;
        int a19 = 0;
        int a20 = 0;
        int a21 = 0;
        int a22 = 0;
        Class136 a23 = null;
        a4 = this.Method1484();
        int a24 = this.Method1490(a4);
        while (true) {
            String a25 = this.Method1494(a4 + 2, a5);
            if ("SourceFile".equals((Object)a25)) {
                a13 = this.Method1494(a4 + 8, a5);
            } else if ("InnerClasses".equals((Object)a25)) {
                a22 = a4 + 8;
            } else if ("EnclosingMethod".equals((Object)a25)) {
                a15 = this.Method1496(a4 + 8, a5);
                int a26 = this.Method1490(a4 + 10);
                a16 = this.Method1494(this.Field1030[a26], a5);
                a17 = this.Method1494(this.Field1030[a26] + 2, a5);
            } else if ("Signature".equals((Object)a25)) {
                a12 = this.Method1494(a4 + 8, a5);
            } else if ("RuntimeVisibleAnnotations".equals((Object)a25)) {
                a18 = a4 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals((Object)a25)) {
                a20 = a4 + 8;
            } else if ("Deprecated".equals((Object)a25)) {
                a7 |= 0x20000;
            } else if ("Synthetic".equals((Object)a25)) {
                a7 |= 0x41000;
            } else if ("SourceDebugExtension".equals((Object)a25)) {
                int a27 = this.Method1492(a4 + 4);
                a14 = this.Method1495(a4 + 8, a27, new char[a27]);
            } else if ("RuntimeInvisibleAnnotations".equals((Object)a25)) {
                a19 = a4 + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals((Object)a25)) {
                a21 = a4 + 8;
            } else if ("BootstrapMethods".equals((Object)a25)) {
                int[] a28 = new int[this.Method1490(a4 + 8)];
                int a29 = a4 + 10;
                for (int a30 = 0; a30 < a28.length; ++a30) {
                    a28[a30] = a29;
                    a29 += 2 + this.Method1490(a29 + 2) << 1;
                }
                a6.Field1355 = a28;
            } else {
                Class136 a31 = this.Method1485(a2, a25, a4 + 8, this.Method1492(a4 + 4), a5, -1, null);
                a31.Field989 = a23;
                a23 = a31;
            }
            a4 += 6 + this.Method1492(a4 + 4);
            --a24;
        }
    }

    private int Method1472(Class167 a, Class247 a2, int a3) {
        char[] a4 = a2.Field1354;
        int a5 = this.Method1490(a3);
        String a6 = this.Method1494(a3 + 2, a4);
        String a7 = this.Method1494(a3 + 4, a4);
        a3 += 6;
        String a8 = null;
        int a9 = 0;
        int a10 = 0;
        int a11 = 0;
        int a12 = 0;
        Object a13 = null;
        Class136 a14 = null;
        int a15 = this.Method1490(a3);
        while (true) {
            String a16 = this.Method1494(a3 + 2, a4);
            if ("ConstantValue".equals((Object)a16)) {
                int a17 = this.Method1490(a3 + 8);
                a13 = null;
            } else if ("Signature".equals((Object)a16)) {
                a8 = this.Method1494(a3 + 8, a4);
            } else if ("Deprecated".equals((Object)a16)) {
                a5 |= 0x20000;
            } else if ("Synthetic".equals((Object)a16)) {
                a5 |= 0x41000;
            } else if ("RuntimeVisibleAnnotations".equals((Object)a16)) {
                a9 = a3 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals((Object)a16)) {
                a11 = a3 + 8;
            } else if ("RuntimeInvisibleAnnotations".equals((Object)a16)) {
                a10 = a3 + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals((Object)a16)) {
                a12 = a3 + 8;
            } else {
                Class136 a18 = this.Method1485(a2.Field1352, a16, a3 + 8, this.Method1492(a3 + 4), a4, -1, null);
                a18.Field989 = a14;
                a14 = a18;
            }
            a3 += 6 + this.Method1492(a3 + 4);
            --a15;
        }
    }

    private int Method1473(Class167 a, Class247 a2, int a3) {
        char[] a4 = a2.Field1354;
        a2.Field1356 = this.Method1490(a3);
        a2.Field1357 = this.Method1494(a3 + 2, a4);
        a2.Field1358 = this.Method1494(a3 + 4, a4);
        a3 += 6;
        int a5 = 0;
        int a6 = 0;
        String[] a7 = null;
        String a8 = null;
        int a9 = 0;
        int a10 = 0;
        int a11 = 0;
        int a12 = 0;
        int a13 = 0;
        int a14 = 0;
        int a15 = 0;
        int a16 = 0;
        int a17 = a3;
        Class136 a18 = null;
        int a19 = this.Method1490(a3);
        while (true) {
            String a20 = this.Method1494(a3 + 2, a4);
            if ("Code".equals((Object)a20)) {
                if ((a2.Field1353 & 1) == 0) {
                    a5 = a3 + 8;
                }
            } else if ("Exceptions".equals((Object)a20)) {
                a7 = new String[this.Method1490(a3 + 8)];
                a6 = a3 + 10;
                for (int a21 = 0; a21 < a7.length; ++a21) {
                    a7[a21] = this.Method1496(a6, a4);
                    a6 += 2;
                }
            } else if ("Signature".equals((Object)a20)) {
                a8 = this.Method1494(a3 + 8, a4);
            } else if ("Deprecated".equals((Object)a20)) {
                a2.Field1356 |= 0x20000;
            } else if ("RuntimeVisibleAnnotations".equals((Object)a20)) {
                a10 = a3 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals((Object)a20)) {
                a12 = a3 + 8;
            } else if ("AnnotationDefault".equals((Object)a20)) {
                a14 = a3 + 8;
            } else if ("Synthetic".equals((Object)a20)) {
                a2.Field1356 |= 0x41000;
            } else if ("RuntimeInvisibleAnnotations".equals((Object)a20)) {
                a11 = a3 + 8;
            } else if ("RuntimeInvisibleTypeAnnotations".equals((Object)a20)) {
                a13 = a3 + 8;
            } else if ("RuntimeVisibleParameterAnnotations".equals((Object)a20)) {
                a15 = a3 + 8;
            } else if ("RuntimeInvisibleParameterAnnotations".equals((Object)a20)) {
                a16 = a3 + 8;
            } else if ("MethodParameters".equals((Object)a20)) {
                a9 = a3 + 8;
            } else {
                Class136 a22 = this.Method1485(a2.Field1352, a20, a3 + 8, this.Method1492(a3 + 4), a4, -1, null);
                a22.Field989 = a18;
                a18 = a22;
            }
            a3 += 6 + this.Method1492(a3 + 4);
            --a19;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void Method1474(Class267 a, Class247 a2, int a3) {
        int a4;
        int a5;
        Object a6;
        void a7;
        int a8;
        int a9;
        Object a10;
        int a11;
        Class136 a12;
        Class247 a13;
        int a14;
        int a15;
        int a16;
        boolean a17;
        boolean a18;
        int a19;
        int a20;
        int a21;
        int a52;
        int a42;
        int a32;
        int[] a22;
        void a23;
        Object a24;
        Class264[] a25;
        int a26;
        int a27;
        int a28;
        int a29;
        byte[] a30;
        block68: {
            block71: {
                block70: {
                    block69: {
                        int a31;
                        block67: {
                            int a33;
                            a30 = this.Field1029;
                            char[] cArray = a2.Field1354;
                            int n = this.Method1490(a3);
                            String[] a34 = Class267.Method2862();
                            a29 = this.Method1490(a3 + 2);
                            a28 = this.Method1492(a3 + 4);
                            a27 = a3 += 8;
                            a26 = a3 + a28;
                            a2.Field1359 = new Class264[a28 + 2];
                            a25 = a2.Field1359;
                            this.Method1483(a28 + 1, a25);
                            if (a3 < a26) {
                                a33 = a3 - a27;
                                int a35 = a30[a3] & 0xFF;
                                switch (Class169.Field1059[a35]) {
                                    case 0: 
                                    case 4: {
                                        ++a3;
                                    }
                                    case 9: {
                                        this.Method1483(a33 + this.Method1491(a3 + 1), a25);
                                        a3 += 3;
                                    }
                                    case 10: {
                                        this.Method1483(a33 + this.Method1492(a3 + 1), a25);
                                        a3 += 5;
                                    }
                                    case 17: {
                                        a35 = a30[a3 + 1] & 0xFF;
                                        if (a35 == 132) {
                                            a3 += 6;
                                        }
                                        a3 += 4;
                                    }
                                    case 14: {
                                        a3 = a3 + 4 - (a33 & 3);
                                        this.Method1483(a33 + this.Method1492(a3), a25);
                                        int a36 = this.Method1492(a3 + 8) - this.Method1492(a3 + 4) + 1;
                                        this.Method1483(a33 + this.Method1492(a3 + 12), a25);
                                        a3 += 4;
                                        --a36;
                                        a3 += 12;
                                    }
                                    case 15: {
                                        a3 = a3 + 4 - (a33 & 3);
                                        this.Method1483(a33 + this.Method1492(a3), a25);
                                        int a36 = this.Method1492(a3 + 4);
                                        this.Method1483(a33 + this.Method1492(a3 + 12), a25);
                                        a3 += 8;
                                        --a36;
                                        a3 += 8;
                                    }
                                    case 1: 
                                    case 3: 
                                    case 11: {
                                        a3 += 2;
                                    }
                                    case 2: 
                                    case 5: 
                                    case 6: 
                                    case 12: 
                                    case 13: {
                                        a3 += 3;
                                    }
                                    case 7: 
                                    case 8: {
                                        a3 += 5;
                                        break;
                                    }
                                }
                                a3 += 4;
                            }
                            a33 = this.Method1490(a3);
                            a24 = this.Method1483(this.Method1490(a3 + 2), a25);
                            Class264 a37 = this.Method1483(this.Method1490(a3 + 4), a25);
                            Class264 a38 = this.Method1483(this.Method1490(a3 + 6), a25);
                            String a39 = this.Method1494(this.Field1030[this.Method1490(a3 + 8)], (char[])a23);
                            a.Method1960((Class264)a24, a37, a38, a39);
                            a3 += 8;
                            --a33;
                            a3 += 2;
                            a22 = null;
                            a24 = null;
                            a32 = 0;
                            a42 = 0;
                            a52 = -1;
                            a21 = -1;
                            a20 = 0;
                            a19 = 0;
                            a18 = true;
                            a17 = (a2.Field1353 & 8) != 0;
                            a16 = 0;
                            a15 = 0;
                            a14 = 0;
                            a13 = null;
                            a12 = null;
                            a11 = this.Method1490(a3);
                            a10 = this.Method1494(a3 + 2, (char[])a23);
                            if (!"LocalVariableTable".equals(a10)) break block67;
                            if ((a2.Field1353 & 2) != 0) break block68;
                            a20 = a3 + 8;
                            a9 = this.Method1490(a3 + 8);
                            a31 = a3;
                            a8 = this.Method1490(a31 + 10);
                            if (a25[a8] == null) {
                                this.Method1483((int)a8, (Class264[])a25).Field1448 |= 1;
                            }
                            if (a25[a8 += this.Method1490(a31 + 12)] == null) {
                                this.Method1483((int)a8, (Class264[])a25).Field1448 |= 1;
                            }
                            a31 += 10;
                            --a9;
                        }
                        if ("LocalVariableTypeTable".equals(a10)) {
                            a19 = a3 + 8;
                        }
                        if (!"LineNumberTable".equals(a10)) break block69;
                        if ((a2.Field1353 & 2) != 0) break block68;
                        a9 = this.Method1490(a3 + 8);
                        a31 = a3;
                        a8 = this.Method1490(a31 + 10);
                        if (a25[a8] == null) {
                            this.Method1483((int)a8, (Class264[])a25).Field1448 |= 1;
                        }
                        a25[a8].Field1449 = this.Method1490(a31 + 12);
                        a31 += 4;
                        --a9;
                    }
                    if ("RuntimeVisibleTypeAnnotations".equals(a10)) {
                        a22 = this.Method1475(a, a2, a3 + 8, true);
                        a52 = a22.length == 0 || this.Method1489(a22[0]) < 67 ? -1 : this.Method1490(a22[0] + 1);
                    }
                    if ("RuntimeInvisibleTypeAnnotations".equals(a10)) {
                        a24 = this.Method1475(a, a2, a3 + 8, false);
                        a21 = ((Object)a24).length == 0 || this.Method1489((int)a24[0]) < 67 ? -1 : this.Method1490((int)(a24[0] + true));
                    }
                    if (!"StackMapTable".equals(a10)) break block70;
                    if ((a2.Field1353 & 4) != 0) break block68;
                    a16 = a3 + 10;
                    a15 = this.Method1492(a3 + 4);
                    a14 = this.Method1490(a3 + 8);
                }
                if (!"StackMap".equals(a10)) break block71;
                if ((a2.Field1353 & 4) != 0) break block68;
                a18 = false;
                a16 = a3 + 10;
                a15 = this.Method1492(a3 + 4);
                a14 = this.Method1490(a3 + 8);
            }
            if ((a9 = 0) < a2.Field1352.length) {
                if (a2.Field1352[a9].Field987.equals(a10)) {
                    Class136 a40 = a2.Field1352[a9].Method471(this, a3 + 8, this.Method1492(a3 + 4), (char[])a23, a27 - 8, a25);
                    a40.Field989 = a12;
                    a12 = a40;
                }
                ++a9;
            }
        }
        a3 += 6 + this.Method1492(a3 + 4);
        --a11;
        a3 += 2;
        a13 = a2;
        a13.Field1362 = -1;
        a13.Field1366 = 0;
        a13.Field1367 = 0;
        a13.Field1368 = 0;
        a13.Field1370 = 0;
        a13.Field1369 = new Object[a29];
        a13.Field1371 = new Object[a7];
        this.Method1480(a2);
        a11 = a16;
        if (a11 < a16 + a15 - 2) {
            if (a30[a11] == 8) {
                int a41 = this.Method1490(a11 + 1);
                if (a41 < a28 && (a30[a27 + a41] & 0xFF) == 187) {
                    this.Method1483(a41, a25);
                }
            }
            ++a11;
        }
        if ((a3 = a27) < a26) {
            a11 = a3 - a27;
            a10 = a25[a11];
            a.Method1947((Class264)a10);
            if ((a2.Field1353 & 2) == 0 && ((Class264)a10).Field1449 > 0) {
                a.Method1981(((Class264)a10).Field1449, (Class264)a10);
            }
            while (true) {
                if (a13.Field1362 != a11 && a13.Field1362 != -1) break;
                if (a13.Field1362 != -1) {
                    a.Method1845(-1, a13.Field1367, a13.Field1369, a13.Field1370, a13.Field1371);
                    a.Method1845(a13.Field1366, a13.Field1368, a13.Field1369, a13.Field1370, a13.Field1371);
                }
                a16 = this.Method1481(a16, a18, a17, a13);
                --a14;
                a13 = null;
            }
            a9 = a30[a3] & 0xFF;
            switch (Class169.Field1059[a9]) {
                case 0: {
                    a.Method1948(a9);
                    ++a3;
                }
                case 4: {
                    if (a9 > 54) {
                        a.Method1840(54 + ((a9 -= 59) >> 2), a9 & 3);
                    }
                    a.Method1840(21 + ((a9 -= 26) >> 2), a9 & 3);
                    ++a3;
                }
                case 9: {
                    a.Method1957(a9, a25[a11 + this.Method1491(a3 + 1)]);
                    a3 += 3;
                }
                case 10: {
                    a.Method1957(a9 - 33, a25[a11 + this.Method1492(a3 + 1)]);
                    a3 += 5;
                }
                case 17: {
                    a9 = a30[a3 + 1] & 0xFF;
                    if (a9 == 132) {
                        a.Method1841(this.Method1490(a3 + 2), this.Method1491(a3 + 4));
                        a3 += 6;
                    }
                    a.Method1840(a9, this.Method1490(a3 + 2));
                    a3 += 4;
                }
                case 14: {
                    a3 = a3 + 4 - (a11 & 3);
                    int a43 = a11 + this.Method1492(a3);
                    a8 = this.Method1492(a3 + 4);
                    int a44 = this.Method1492(a3 + 8);
                    Class264[] a45 = new Class264[a44 - a8 + 1];
                    a3 += 12;
                    int a46 = 0;
                    if (a46 < a45.length) {
                        a45[a46] = a25[a11 + this.Method1492(a3)];
                        a3 += 4;
                        ++a46;
                    }
                    a.Method1959(a8, a44, a25[a43], a45);
                }
                case 15: {
                    a3 = a3 + 4 - (a11 & 3);
                    int a47 = a11 + this.Method1492(a3);
                    a8 = this.Method1492(a3 + 4);
                    a6 = new int[a8];
                    Class264[] a45 = new Class264[a8];
                    a3 += 8;
                    int a46 = 0;
                    if (a46 < a8) {
                        a6[a46] = this.Method1492(a3);
                        a45[a46] = a25[a11 + this.Method1492(a3 + 4)];
                        a3 += 8;
                        ++a46;
                    }
                    a.Method1958(a25[a47], (int[])a6, a45);
                }
                case 3: {
                    a.Method1840(a9, a30[a3 + 1] & 0xFF);
                    a3 += 2;
                }
                case 1: {
                    a.Method854(a9, a30[a3 + 1]);
                    a3 += 2;
                }
                case 2: {
                    a.Method854(a9, this.Method1491(a3 + 1));
                    a3 += 3;
                }
                case 11: {
                    a.Method1950(this.Method1497(a30[a3 + 1] & 0xFF, (char[])a23));
                    a3 += 2;
                }
                case 12: {
                    a.Method1950(this.Method1497(this.Method1490(a3 + 1), (char[])a23));
                    a3 += 3;
                }
                case 6: 
                case 7: {
                    int a48 = this.Field1030[this.Method1490(a3 + 1)];
                    a8 = a30[a48 - 1] == 11 ? 1 : 0;
                    a6 = this.Method1496(a48, (char[])a23);
                    a48 = this.Field1030[this.Method1490(a48 + 2)];
                    Class264[] a45 = this.Method1494(a48, (char[])a23);
                    Object[] a49 = this.Method1494(a48 + 2, (char[])a23);
                    if (a9 < 182) {
                        a.Method1949(a9, (String)a6, (String)a45, (String)a49);
                    }
                    a.Method1954(a9, (String)a6, (String)a45, (String)a49, a8 != 0);
                    if (a9 == 185) {
                        a3 += 5;
                    }
                    a3 += 3;
                }
                case 8: {
                    int a50 = this.Field1030[this.Method1490(a3 + 1)];
                    a8 = a2.Field1355[this.Method1490(a50)];
                    a6 = (Class279)this.Method1497(this.Method1490(a8), (char[])a23);
                    a5 = this.Method1490(a8 + 2);
                    Object[] a49 = new Object[a5];
                    a8 += 4;
                    int a51 = 0;
                    if (a51 < a5) {
                        a49[a51] = this.Method1497(this.Method1490(a8), (char[])a23);
                        a8 += 2;
                        ++a51;
                    }
                    a50 = this.Field1030[this.Method1490(a50 + 2)];
                    String a62 = this.Method1494(a50, (char[])a23);
                    String a53 = this.Method1494(a50 + 2, (char[])a23);
                    a.Method1956(a62, a53, (Class279)a6, a49);
                    a3 += 5;
                }
                case 5: {
                    a.Method1952(a9, this.Method1496(a3 + 1, (char[])a23));
                    a3 += 3;
                }
                case 13: {
                    a.Method1841(a30[a3 + 1] & 0xFF, a30[a3 + 2]);
                    a3 += 3;
                    break;
                }
            }
            a.Method1951(this.Method1496(a3 + 1, (char[])a23), a30[a3 + 3] & 0xFF);
            a3 += 4;
            if (a32 < a22.length && a52 <= a11) {
                if (a52 == a11) {
                    int a54 = this.Method1476(a2, a22[a32]);
                    this.Method1478(a54 + 2, (char[])a23, true, a.Method1973(a2.Field1360, a2.Field1361, this.Method1494(a54, (char[])a23), true));
                }
                a52 = ++a32 >= a22.length || this.Method1489(a22[a32]) < 67 ? -1 : this.Method1490(a22[a32] + 1);
            }
            if (a42 < ((Object)a24).length && a21 <= a11) {
                if (a21 == a11) {
                    int a55 = this.Method1476(a2, (int)a24[a42]);
                    this.Method1478(a55 + 2, (char[])a23, true, a.Method1973(a2.Field1360, a2.Field1361, this.Method1494(a55, (char[])a23), false));
                }
                a21 = ++a42 >= ((Object)a24).length || this.Method1489((int)a24[a42]) < 67 ? -1 : this.Method1490((int)(a24[a42] + true));
            }
        }
        if (a25[a28] != null) {
            a.Method1947(a25[a28]);
        }
        if ((a2.Field1353 & 2) == 0) {
            int[] a56 = null;
            a3 = a19 + 2;
            a56 = new int[this.Method1490(a19) * 3];
            int a57 = a56.length;
            a56[--a57] = a3 + 6;
            a56[--a57] = this.Method1490(a3 + 8);
            a56[--a57] = this.Method1490(a3);
            a3 += 10;
            a3 = a20 + 2;
            a57 = this.Method1490(a20);
            a9 = this.Method1490(a3);
            int a58 = this.Method1490(a3 + 2);
            a8 = this.Method1490(a3 + 8);
            a6 = null;
            for (a5 = 0; a5 < a56.length; a5 += 3) {
                if (a56[a5] != a9 || a56[a5 + 1] != a8) continue;
                a6 = this.Method1494(a56[a5 + 2], (char[])a23);
                break;
            }
            a.Method1843(this.Method1494(a3 + 4, (char[])a23), this.Method1494(a3 + 6, (char[])a23), (String)a6, a25[a9], a25[a9 + a58], a8);
            a3 += 10;
            --a57;
        }
        if ((a4 = 0) < a22.length) {
            if (this.Method1489(a22[a4]) >> 1 == 32) {
                int a59 = this.Method1476(a2, a22[a4]);
                a59 = this.Method1478(a59 + 2, (char[])a23, true, a.Method1844(a2.Field1360, a2.Field1361, a2.Field1363, a2.Field1364, a2.Field1365, this.Method1494(a59, (char[])a23), true));
            }
            ++a4;
        }
        if ((a4 = 0) < ((Object)a24).length) {
            if (this.Method1489((int)a24[a4]) >> 1 == 32) {
                int a60 = this.Method1476(a2, (int)a24[a4]);
                a60 = this.Method1478(a60 + 2, (char[])a23, true, a.Method1844(a2.Field1360, a2.Field1361, a2.Field1363, a2.Field1364, a2.Field1365, this.Method1494(a60, (char[])a23), false));
            }
            ++a4;
        }
        Class136 a72 = a12.Field989;
        a12.Field989 = null;
        a.Method1980(a12);
        a12 = a72;
        a.Method1842((int)a7, a29);
    }

    private int[] Method1475(Class267 a, Class247 a2, int a3, boolean a4) {
        char[] a5 = a2.Field1354;
        int[] a6 = new int[this.Method1490(a3)];
        a3 += 2;
        for (int a7 = 0; a7 < a6.length; ++a7) {
            int a8;
            a6[a7] = a3;
            int a9 = this.Method1492(a3);
            switch (a9 >>> 24) {
                case 0: 
                case 1: 
                case 22: {
                    a3 += 2;
                    break;
                }
                case 19: 
                case 20: 
                case 21: {
                    ++a3;
                    break;
                }
                case 64: 
                case 65: {
                    a8 = this.Method1490(a3 + 1);
                    while (true) {
                        int a10 = this.Method1490(a3 + 3);
                        int a11 = this.Method1490(a3 + 5);
                        this.Method1483(a10, a2.Field1359);
                        this.Method1483(a10 + a11, a2.Field1359);
                        a3 += 6;
                        --a8;
                    }
                }
                case 71: 
                case 72: 
                case 73: 
                case 74: 
                case 75: {
                    a3 += 4;
                    break;
                }
                default: {
                    a3 += 3;
                }
            }
            a8 = this.Method1489(a3);
            if (a9 >>> 24 == 66) {
                Class31 a12 = null;
                a3 += 1 + 2 * a8;
                a3 = this.Method1478(a3 + 2, a5, true, a.Method1974(a9, a12, this.Method1494(a3, a5), a4));
                continue;
            }
            a3 = this.Method1478(a3 + 3 + 2 * a8, a5, true, null);
        }
        return a6;
    }

    private int Method1476(Class247 a, int a2) {
        int a3;
        int a4 = this.Method1492(a2);
        switch (a4 >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                a4 &= 0xFFFF0000;
                a2 += 2;
                break;
            }
            case 19: 
            case 20: 
            case 21: {
                a4 &= 0xFF000000;
                ++a2;
                break;
            }
            case 64: 
            case 65: {
                a4 &= 0xFF000000;
                a3 = this.Method1490(a2 + 1);
                a.Field1363 = new Class264[a3];
                a.Field1364 = new Class264[a3];
                a.Field1365 = new int[a3];
                a2 += 3;
                for (int a5 = 0; a5 < a3; ++a5) {
                    int a6 = this.Method1490(a2);
                    int a7 = this.Method1490(a2 + 2);
                    a.Field1363[a5] = this.Method1483(a6, a.Field1359);
                    a.Field1364[a5] = this.Method1483(a6 + a7, a.Field1359);
                    a.Field1365[a5] = this.Method1490(a2 + 4);
                    a2 += 6;
                }
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                a4 &= 0xFF0000FF;
                a2 += 4;
                break;
            }
            default: {
                a4 &= a4 >>> 24 < 67 ? -256 : -16777216;
                a2 += 3;
            }
        }
        a3 = this.Method1489(a2);
        a.Field1360 = a4;
        a.Field1361 = null;
        return a2 + 1 + 2 * a3;
    }

    private void Method1477(Class267 a2, Class247 a3, int a4, boolean a5) {
        Class148 a6;
        int a7;
        int a8 = this.Field1029[a4++] & 0xFF;
        int a9 = b.Method3211(a3.Field1358).length - a8;
        for (a7 = 0; a7 < a9; ++a7) {
            a6 = a2.Method1971(a7, "Ljava/lang/Synthetic;", false);
            a6.Method401();
        }
        char[] a10 = a3.Field1354;
        if (a7 < a8 + a9) {
            int a11 = this.Method1490(a4);
            a4 += 2;
            while (true) {
                a6 = a2.Method1971(a7, this.Method1494(a4, a10), a5);
                a4 = this.Method1478(a4 + 2, a10, true, a6);
                --a11;
            }
        }
    }

    private int Method1478(int a2, char[] a3, boolean a4, Class148 a5) {
        int a6 = this.Method1490(a2);
        a2 += 2;
        while (true) {
            a2 = this.Method1479(a2 + 2, a3, this.Method1494(a2, a3), a5);
            --a6;
        }
    }

    private int Method1479(int a2, char[] a3, String a4, Class148 a5) {
        switch (this.Field1029[a2] & 0xFF) {
            case 101: {
                return a2 + 5;
            }
            case 64: {
                return this.Method1478(a2 + 3, a3, true, null);
            }
            case 91: {
                return this.Method1478(a2 + 1, a3, false, null);
            }
        }
        return a2 + 3;
    }

    private void Method1480(Class247 a2) {
        String a3 = a2.Field1358;
        Object[] a4 = a2.Field1369;
        int a5 = 0;
        if ((a2.Field1356 & 8) == 0) {
            a4[a5++] = "<init>".equals((Object)a2.Field1357) ? Class45.Field402 : this.Method1496(this.Field1033 + 2, a2.Field1354);
        }
        int a6 = 1;
        block8: while (true) {
            int a7 = a6;
            switch (a3.charAt(a6++)) {
                case 'B': 
                case 'C': 
                case 'I': 
                case 'S': 
                case 'Z': {
                    a4[a5++] = Class45.Field397;
                    continue block8;
                }
                case 'F': {
                    a4[a5++] = Class45.Field398;
                    continue block8;
                }
                case 'J': {
                    a4[a5++] = Class45.Field400;
                    continue block8;
                }
                case 'D': {
                    a4[a5++] = Class45.Field399;
                    continue block8;
                }
                case '[': {
                    while (a3.charAt(a6) == '[') {
                        ++a6;
                    }
                    if (a3.charAt(a6) == 'L') {
                        ++a6;
                        while (a3.charAt(a6) != ';') {
                            ++a6;
                        }
                    }
                    a4[a5++] = a3.substring(a7, ++a6);
                    continue block8;
                }
                case 'L': {
                    while (a3.charAt(a6) != ';') {
                        ++a6;
                    }
                    a4[a5++] = a3.substring(a7 + 1, a6++);
                    continue block8;
                }
            }
            break;
        }
        a2.Field1367 = a5;
    }

    private int Method1481(int a2, boolean a3, boolean a4, Class247 a5) {
        int a6;
        char[] a7 = a5.Field1354;
        Class264[] a8 = a5.Field1359;
        int a9 = this.Field1029[a2++] & 0xFF;
        a5.Field1368 = 0;
        if (a9 < 64) {
            a6 = a9;
            a5.Field1366 = 3;
            a5.Field1370 = 0;
        } else if (a9 < 128) {
            a6 = a9 - 64;
            a2 = this.Method1482(a5.Field1371, 0, a2, a7, a8);
            a5.Field1366 = 4;
            a5.Field1370 = 1;
        } else {
            a6 = this.Method1490(a2);
            a2 += 2;
            if (a9 == 247) {
                a2 = this.Method1482(a5.Field1371, 0, a2, a7, a8);
                a5.Field1366 = 4;
                a5.Field1370 = 1;
            } else if (a9 >= 248 && a9 < 251) {
                a5.Field1366 = 2;
                a5.Field1368 = 251 - a9;
                a5.Field1367 -= a5.Field1368;
                a5.Field1370 = 0;
            } else if (a9 == 251) {
                a5.Field1366 = 3;
                a5.Field1370 = 0;
            } else {
                if (a9 < 255) {
                    int a10 = a5.Field1367;
                    int a11 = a9 - 251;
                    while (true) {
                        a2 = this.Method1482(a5.Field1369, a10++, a2, a7, a8);
                        --a11;
                    }
                }
                a5.Field1366 = 0;
                int a12 = this.Method1490(a2);
                a2 += 2;
                a5.Field1368 = a12;
                a5.Field1367 = a12;
                int a13 = 0;
                while (true) {
                    a2 = this.Method1482(a5.Field1369, a13++, a2, a7, a8);
                    --a12;
                }
            }
        }
        a5.Field1362 += a6 + 1;
        this.Method1483(a5.Field1362, a8);
        return a2;
    }

    private int Method1482(Object[] a2, int a3, int a4, char[] a5, Class264[] a6) {
        int a7 = this.Field1029[a4++] & 0xFF;
        switch (a7) {
            case 0: {
                a2[a3] = Class45.Field396;
                break;
            }
            case 1: {
                a2[a3] = Class45.Field397;
                break;
            }
            case 2: {
                a2[a3] = Class45.Field398;
                break;
            }
            case 3: {
                a2[a3] = Class45.Field399;
                break;
            }
            case 4: {
                a2[a3] = Class45.Field400;
                break;
            }
            case 5: {
                a2[a3] = Class45.Field401;
                break;
            }
            case 6: {
                a2[a3] = Class45.Field402;
                break;
            }
            case 7: {
                a2[a3] = this.Method1496(a4, a5);
                a4 += 2;
                break;
            }
            default: {
                a2[a3] = this.Method1483(this.Method1490(a4), a6);
                a4 += 2;
            }
        }
        return a4;
    }

    protected Class264 Method1483(int a2, Class264[] a3) {
        block0: {
            if (a3[a2] != null) break block0;
            a3[a2] = new Class264();
        }
        return a3[a2];
    }

    private int Method1484() {
        int a2 = this.Field1033 + 8 + this.Method1490(this.Field1033 + 6) * 2;
        int a3 = this.Method1490(a2);
        int a4 = this.Method1490(a2 + 8);
        while (true) {
            a2 += 6 + this.Method1492(a2 + 12);
            --a4;
        }
    }

    private Class136 Method1485(Class136[] a2, String a3, int a4, int a5, char[] a6, int a7, Class264[] a8) {
        for (int a9 = 0; a9 < a2.length; ++a9) {
            if (!a2[a9].Field987.equals((Object)a3)) continue;
            return a2[a9].Method471(this, a4, a5, a6, a7, a8);
        }
        return new Class136(a3).Method471(this, a4, a5, null, -1, null);
    }

    public int Method1486() {
        return this.Field1030.length;
    }

    public int Method1487(int a2) {
        return this.Field1030[a2];
    }

    public int Method1488() {
        return this.Field1032;
    }

    public int Method1489(int a2) {
        return this.Field1029[a2] & 0xFF;
    }

    public int Method1490(int a2) {
        byte[] a3 = this.Field1029;
        return (a3[a2] & 0xFF) << 8 | a3[a2 + 1] & 0xFF;
    }

    public short Method1491(int a2) {
        byte[] a3 = this.Field1029;
        return (short)((a3[a2] & 0xFF) << 8 | a3[a2 + 1] & 0xFF);
    }

    public int Method1492(int a2) {
        byte[] a3 = this.Field1029;
        return (a3[a2] & 0xFF) << 24 | (a3[a2 + 1] & 0xFF) << 16 | (a3[a2 + 2] & 0xFF) << 8 | a3[a2 + 3] & 0xFF;
    }

    public long Method1493(int a2) {
        long a3 = this.Method1492(a2);
        long a4 = (long)this.Method1492(a2 + 4) & 0xFFFFFFFFL;
        return a3 << 32 | a4;
    }

    public String Method1494(int a2, char[] a3) {
        int a4 = this.Method1490(a2);
        return null;
    }

    private String Method1495(int a2, int a3, char[] a4) {
        int a5 = a2 + a3;
        byte[] a6 = this.Field1029;
        int a7 = 0;
        int a8 = 0;
        int a9 = 0;
        while (a2 < a5) {
            int a10 = a6[a2++];
            switch (a8) {
                case 0: {
                    if ((a10 &= 0xFF) < 128) {
                        a4[a7++] = (char)a10;
                        break;
                    }
                    if (a10 < 224 && a10 > 191) {
                        a9 = (char)(a10 & 0x1F);
                        a8 = 1;
                        break;
                    }
                    a9 = (char)(a10 & 0xF);
                    a8 = 2;
                    break;
                }
                case 1: {
                    a4[a7++] = (char)(a9 << 6 | a10 & 0x3F);
                    a8 = 0;
                    break;
                }
                case 2: {
                    a9 = (char)(a9 << 6 | a10 & 0x3F);
                    a8 = 1;
                }
            }
        }
        return new String(a4, 0, a7);
    }

    public String Method1496(int a2, char[] a3) {
        return this.Method1494(this.Field1030[this.Method1490(a2)], a3);
    }

    public Object Method1497(int a2, char[] a3) {
        int a4 = this.Field1030[a2];
        switch (this.Field1029[a4 - 1]) {
            case 3: {
                return new Integer(this.Method1492(a4));
            }
            case 4: {
                return new Float(Float.intBitsToFloat((int)this.Method1492(a4)));
            }
            case 5: {
                return new Long(this.Method1493(a4));
            }
            case 6: {
                return new Double(Double.longBitsToDouble((long)this.Method1493(a4)));
            }
            case 7: {
                return b.Method3205(this.Method1494(a4, a3));
            }
            case 8: {
                return this.Method1494(a4, a3);
            }
            case 16: {
                return b.Method3206(this.Method1494(a4, a3));
            }
        }
        int a5 = this.Method1489(a4);
        int[] a6 = this.Field1030;
        int a7 = a6[this.Method1490(a4 + 1)];
        String a8 = this.Method1496(a7, a3);
        a7 = a6[this.Method1490(a7 + 2)];
        String a9 = this.Method1494(a7, a3);
        String a10 = this.Method1494(a7 + 2, a3);
        return new Class279(a5, a8, a9, a10);
    }

    private static Exception Method1498(Exception exception) {
        return exception;
    }
}