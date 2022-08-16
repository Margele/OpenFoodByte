/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class136;
import awsl.Class138;
import awsl.Class148;
import awsl.Class150;
import awsl.Class169;
import awsl.Class250;
import awsl.Class258;
import awsl.Class261;
import awsl.Class264;
import awsl.Class267;
import awsl.Class276;
import awsl.Class279;
import awsl.Class31;
import obfuscate.b;

class Class9
extends Class267 {
    static final int Field118 = 524288;
    static final int Field119 = 0;
    static final int Field120 = 64;
    static final int Field121 = 128;
    static final int Field122 = 247;
    static final int Field123 = 248;
    static final int Field124 = 251;
    static final int Field125 = 252;
    static final int Field126 = 255;
    private static final int Field127 = 0;
    private static final int Field128 = 1;
    private static final int Field129 = 2;
    final Class169 Field130;
    private int Field131;
    private final int Field132;
    private final int Field133;
    private final String Field134;
    String Field135;
    int Field136;
    int Field137;
    int Field138;
    int[] Field139;
    private Class138 Field140;
    private Class150 Field141;
    private Class150 Field142;
    private Class150 Field143;
    private Class150 Field144;
    private Class150[] Field145;
    private Class150[] Field146;
    private int Field147;
    private Class136 Field148;
    private Class138 Field149 = new Class138();
    private int Field150;
    private int Field151;
    private int Field152;
    private int Field153;
    private Class138 Field154;
    private int Field155;
    private int[] Field156;
    private int[] Field157;
    private int Field158;
    private Class258 Field159;
    private Class258 Field160;
    private int Field161;
    private Class138 Field162;
    private int Field163;
    private Class138 Field164;
    private int Field165;
    private Class138 Field166;
    private int Field167;
    private Class138 Field168;
    private int Field169;
    private Class150 Field170;
    private Class150 Field171;
    private Class136 Field172;
    private boolean Field173;
    private int Field174;
    private final int Field175;
    private Class264 Field176;
    private Class264 Field177;
    private Class264 Field178;
    private int Field179;
    private int Field180;

    Class9(Class169 a2, int a3, String a4, String a5, String a6, String[] a7, boolean a8, boolean a9) {
        super(327680);
        int a10;
        if (a2.Field1113 == null) {
            a2.Field1113 = this;
        } else {
            a2.Field1114.Field1460 = this;
        }
        a2.Field1114 = this;
        this.Field130 = a2;
        this.Field131 = a3;
        if ("<init>".equals((Object)a4)) {
            this.Field131 |= 0x80000;
        }
        this.Field132 = a2.Method1506(a4);
        this.Field133 = a2.Method1506(a5);
        this.Field134 = a5;
        this.Field135 = a6;
        if (a7.length > 0) {
            this.Field138 = a7.length;
            this.Field139 = new int[this.Field138];
            for (a10 = 0; a10 < this.Field138; ++a10) {
                this.Field139[a10] = a2.Method1508(a7[a10]);
            }
        }
        this.Field175 = 0;
        a10 = b.Method3215(this.Field134) >> 2;
        if ((a3 & 8) != 0) {
            --a10;
        }
        this.Field151 = a10;
        this.Field152 = a10;
        this.Field176 = new Class264();
        this.Field176.Field1448 |= 8;
        this.Method1947(this.Field176);
    }

    @Override
    public void Method1979(String a2, int a3) {
        if (this.Field162 == null) {
            this.Field162 = new Class138();
        }
        ++this.Field161;
        this.Field162.Method487(0).Method487(a3);
    }

    @Override
    public Class148 Method1968() {
        this.Field140 = new Class138();
        return new Class150(this.Field130, false, this.Field140, null, 0);
    }

    @Override
    public Class148 Method1969(String a2, boolean a3) {
        Class138 a4 = new Class138();
        a4.Method487(this.Field130.Method1506(a2)).Method487(0);
        Class150 a5 = new Class150(this.Field130, true, a4, a4, 2);
        a5.Field1016 = this.Field141;
        this.Field141 = a5;
        return a5;
    }

    @Override
    public Class148 Method1970(int a2, Class31 a3, String a4, boolean a5) {
        Class138 a6 = new Class138();
        Class150.Method1324(a2, a3, a6);
        a6.Method487(this.Field130.Method1506(a4)).Method487(0);
        Class150 a7 = new Class150(this.Field130, true, a6, a6, a6.Field991 - 2);
        a7.Field1016 = this.Field143;
        this.Field143 = a7;
        return a7;
    }

    @Override
    public Class148 Method1971(int a2, String a3, boolean a4) {
        Class138 a5 = new Class138();
        if ("Ljava/lang/Synthetic;".equals((Object)a3)) {
            this.Field147 = Math.max((int)this.Field147, (int)(a2 + 1));
            return new Class150(this.Field130, false, a5, null, 0);
        }
        a5.Method487(this.Field130.Method1506(a3)).Method487(0);
        Class150 a6 = new Class150(this.Field130, true, a5, a5, 2);
        if (this.Field145 == null) {
            this.Field145 = new Class150[b.Method3211(this.Field134).length];
        }
        a6.Field1016 = this.Field145[a2];
        this.Field145[a2] = a6;
        return a6;
    }

    @Override
    public void Method1980(Class136 a2) {
        if (a2.Method469()) {
            a2.Field989 = this.Field172;
            this.Field172 = a2;
        } else {
            a2.Field989 = this.Field148;
            this.Field148 = a2;
        }
    }

    @Override
    public void Method1652() {
    }

    @Override
    public void Method1845(int a2, int a3, Object[] a4, int a5, Object[] a6) {
        if (this.Field175 == 0) {
            return;
        }
        if (a2 == -1) {
            int a7;
            if (this.Field156 == null) {
                this.Method1882();
            }
            this.Field152 = a3;
            int a8 = this.Method1983(this.Field149.Field991, a3, a5);
            for (a7 = 0; a7 < a3; ++a7) {
                this.Field157[a8++] = a4[a7] instanceof String ? 0x1700000 | this.Field130.Method1526((String)a4[a7]) : (a4[a7] instanceof Integer ? (Integer)a4[a7] : 0x1800000 | this.Field130.Method1527("", ((Class264)a4[a7]).Field1450));
            }
            for (a7 = 0; a7 < a5; ++a7) {
                this.Field157[a8++] = a6[a7] instanceof String ? 0x1700000 | this.Field130.Method1526((String)a6[a7]) : (a6[a7] instanceof Integer ? (Integer)a6[a7] : 0x1800000 | this.Field130.Method1527("", ((Class264)a6[a7]).Field1450));
            }
            this.Method1883();
        } else {
            if (this.Field154 != null) {
                int a9 = this.Field149.Field991 - this.Field155 - 1;
                if (a2 == 3) {
                    return;
                }
                throw new IllegalStateException();
            }
            this.Field154 = new Class138();
            int a10 = this.Field149.Field991;
            switch (a2) {
                case 0: {
                    int a11;
                    this.Field152 = a3;
                    this.Field154.Method485(255).Method487(a10).Method487(a3);
                    for (a11 = 0; a11 < a3; ++a11) {
                        this.Method1965(a4[a11]);
                    }
                    this.Field154.Method487(a5);
                    for (a11 = 0; a11 < a5; ++a11) {
                        this.Method1965(a6[a11]);
                    }
                    break;
                }
                case 1: {
                    this.Field152 += a3;
                    this.Field154.Method485(251 + a3).Method487(a10);
                    for (int a12 = 0; a12 < a3; ++a12) {
                        this.Method1965(a4[a12]);
                    }
                    break;
                }
                case 2: {
                    this.Field152 -= a3;
                    this.Field154.Method485(251 - a3).Method487(a10);
                    break;
                }
                case 3: {
                    if (a10 < 64) {
                        this.Field154.Method485(a10);
                        break;
                    }
                    this.Field154.Method485(251).Method487(a10);
                    break;
                }
                case 4: {
                    if (a10 < 64) {
                        this.Field154.Method485(64 + a10);
                    } else {
                        this.Field154.Method485(247).Method487(a10);
                    }
                    this.Method1965(a6[0]);
                }
            }
            this.Field155 = this.Field149.Field991;
            ++this.Field153;
        }
        this.Field150 = Math.max((int)this.Field150, (int)a5);
        this.Field151 = Math.max((int)this.Field151, (int)this.Field152);
    }

    @Override
    public void Method1948(int a2) {
        block4: {
            this.Field169 = this.Field149.Field991;
            this.Field149.Method485(a2);
            if (this.Field178 == null) break block4;
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a2, 0, null, null);
            } else {
                int a3 = this.Field179 + Class276.Field1503[a2];
                if (a3 > this.Field180) {
                    this.Field180 = a3;
                }
                this.Field179 = a3;
            }
            if (a2 >= 172 && a2 <= 177 || a2 == 191) {
                this.Method1879();
            }
        }
    }

    @Override
    public void Method854(int a2, int a3) {
        this.Field169 = this.Field149.Field991;
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a2, a3, null, null);
            } else if (a2 != 188) {
                int a4 = this.Field179 + 1;
                if (a4 > this.Field180) {
                    this.Field180 = a4;
                }
                this.Field179 = a4;
            }
        }
        if (a2 == 17) {
            this.Field149.Method488(a2, a3);
        } else {
            this.Field149.Method486(a2, a3);
        }
    }

    @Override
    public void Method1840(int a2, int a3) {
        block11: {
            int a4;
            this.Field169 = this.Field149.Field991;
            if (this.Field178 != null) {
                if (this.Field175 == 0) {
                    this.Field178.Field1455.Method2801(a2, a3, null, null);
                } else if (a2 == 169) {
                    this.Field178.Field1448 |= 0x100;
                    this.Field178.Field1453 = this.Field179;
                    this.Method1879();
                } else {
                    a4 = this.Field179 + Class276.Field1503[a2];
                    if (a4 > this.Field180) {
                        this.Field180 = a4;
                    }
                    this.Field179 = a4;
                }
            }
            if (this.Field175 != 2 && (a4 = a2 == 22 || a2 == 24 || a2 == 55 || a2 == 57 ? a3 + 2 : a3 + 1) > this.Field151) {
                this.Field151 = a4;
            }
            if (a3 < 4 && a2 != 169) {
                a4 = a2 < 54 ? 26 + (a2 - 21 << 2) + a3 : 59 + (a2 - 54 << 2) + a3;
                this.Field149.Method485(a4);
            } else if (a3 >= 256) {
                this.Field149.Method485(196).Method488(a2, a3);
            } else {
                this.Field149.Method486(a2, a3);
            }
            if (a2 < 54 || this.Field175 != 0 || this.Field158 <= 0) break block11;
            this.Method1947(new Class264());
        }
    }

    @Override
    public void Method1952(int a2, String a3) {
        this.Field169 = this.Field149.Field991;
        Class261 a4 = this.Field130.Method1507(a3);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a2, this.Field149.Field991, this.Field130, a4);
            } else if (a2 == 187) {
                int a5 = this.Field179 + 1;
                if (a5 > this.Field180) {
                    this.Field180 = a5;
                }
                this.Field179 = a5;
            }
        }
        this.Field149.Method488(a2, a4.Field1426);
    }

    @Override
    public void Method1949(int a2, String a3, String a4, String a5) {
        this.Field169 = this.Field149.Field991;
        Class261 a6 = this.Field130.Method1515(a3, a4, a5);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a2, 0, this.Field130, a6);
            } else {
                int a7;
                char a8 = a5.charAt(0);
                switch (a2) {
                    case 178: {
                        a7 = this.Field179 + (a8 == 'D' || a8 == 'J' ? 2 : 1);
                        break;
                    }
                    case 179: {
                        a7 = this.Field179 + (a8 == 'D' || a8 == 'J' ? -2 : -1);
                        break;
                    }
                    case 180: {
                        a7 = this.Field179 + (a8 == 'D' || a8 == 'J' ? 1 : 0);
                        break;
                    }
                    default: {
                        a7 = this.Field179 + (a8 == 'D' || a8 == 'J' ? -3 : -2);
                    }
                }
                if (a7 > this.Field180) {
                    this.Field180 = a7;
                }
                this.Field179 = a7;
            }
        }
        this.Field149.Method488(a2, a6.Field1426);
    }

    @Override
    public void Method1954(int a2, String a3, String a4, String a5, boolean a6) {
        this.Field169 = this.Field149.Field991;
        Class261 a7 = this.Field130.Method1517(a3, a4, a5, a6);
        int a8 = a7.Field1428;
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a2, 0, this.Field130, a7);
            } else {
                a7.Field1428 = a8 = b.Method3215(a5);
                int a9 = a2 == 184 ? this.Field179 - (a8 >> 2) + (a8 & 3) + 1 : this.Field179 - (a8 >> 2) + (a8 & 3);
                if (a9 > this.Field180) {
                    this.Field180 = a9;
                }
                this.Field179 = a9;
            }
        }
        if (a2 == 185) {
            a7.Field1428 = a8 = b.Method3215(a5);
            this.Field149.Method488(185, a7.Field1426).Method486(a8 >> 2, 0);
        } else {
            this.Field149.Method488(a2, a7.Field1426);
        }
    }

    @Override
    public void Method1956(String a2, String a3, Class279 a4, Object[] a5) {
        this.Field169 = this.Field149.Field991;
        Class261 a6 = this.Field130.Method1513(a2, a3, a4, a5);
        int a7 = a6.Field1428;
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(186, 0, this.Field130, a6);
            } else {
                a6.Field1428 = a7 = b.Method3215(a3);
                int a8 = this.Field179 - (a7 >> 2) + (a7 & 3) + 1;
                if (a8 > this.Field180) {
                    this.Field180 = a8;
                }
                this.Field179 = a8;
            }
        }
        this.Field149.Method488(186, a6.Field1426);
        this.Field149.Method487(0);
    }

    @Override
    public void Method1957(int a2, Class264 a3) {
        block14: {
            this.Field169 = this.Field149.Field991;
            Class264 a4 = null;
            if (this.Field178 != null) {
                if (this.Field175 == 0) {
                    this.Field178.Field1455.Method2801(a2, 0, null, null);
                    a3.Method2854().Field1448 |= 0x10;
                    this.Method1914(0, a3);
                    if (a2 != 167) {
                        a4 = new Class264();
                    }
                } else if (a2 == 168) {
                    if ((a3.Field1448 & 0x200) == 0) {
                        a3.Field1448 |= 0x200;
                        ++this.Field174;
                    }
                    this.Field178.Field1448 |= 0x80;
                    this.Method1914(this.Field179 + 1, a3);
                    a4 = new Class264();
                } else {
                    this.Field179 += Class276.Field1503[a2];
                    this.Method1914(this.Field179, a3);
                }
            }
            if ((a3.Field1448 & 2) != 0 && a3.Field1450 - this.Field149.Field991 < Short.MIN_VALUE) {
                if (a2 == 167) {
                    this.Field149.Method485(200);
                } else if (a2 == 168) {
                    this.Field149.Method485(201);
                } else {
                    a4.Field1448 |= 0x10;
                    this.Field149.Method485(a2 <= 166 ? (a2 + 1 ^ 1) - 1 : a2 ^ 1);
                    this.Field149.Method487(8);
                    this.Field149.Method485(200);
                }
                a3.Method2851(this, this.Field149, this.Field149.Field991 - 1, true);
            } else {
                this.Field149.Method485(a2);
                a3.Method2851(this, this.Field149, this.Field149.Field991 - 1, false);
            }
            if (this.Field178 == null) break block14;
            this.Method1947(a4);
            if (a2 == 167) {
                this.Method1879();
            }
        }
    }

    @Override
    public void Method1947(Class264 a2) {
        this.Field173 |= a2.Method2853(this, this.Field149.Field991, this.Field149.Field990);
        if ((a2.Field1448 & 1) != 0) {
            return;
        }
        if (this.Field175 == 0) {
            if (this.Field178 != null) {
                if (a2.Field1450 == this.Field178.Field1450) {
                    this.Field178.Field1448 |= a2.Field1448 & 0x10;
                    a2.Field1455 = this.Field178.Field1455;
                    return;
                }
                this.Method1914(0, a2);
            }
            this.Field178 = a2;
            if (a2.Field1455 == null) {
                a2.Field1455 = new Class276();
                a2.Field1455.Field1504 = a2;
            }
            if (this.Field177 != null) {
                if (a2.Field1450 == this.Field177.Field1450) {
                    this.Field177.Field1448 |= a2.Field1448 & 0x10;
                    a2.Field1455 = this.Field177.Field1455;
                    this.Field178 = this.Field177;
                    return;
                }
                this.Field177.Field1456 = a2;
            }
            this.Field177 = a2;
        } else if (this.Field175 == 1) {
            if (this.Field178 != null) {
                this.Field178.Field1454 = this.Field180;
                this.Method1914(this.Field179, a2);
            }
            this.Field178 = a2;
            this.Field179 = 0;
            this.Field180 = 0;
            if (this.Field177 != null) {
                this.Field177.Field1456 = a2;
            }
            this.Field177 = a2;
        }
    }

    @Override
    public void Method1950(Object a2) {
        int a3;
        this.Field169 = this.Field149.Field991;
        Class261 a4 = this.Field130.Method1504(a2);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(18, 0, this.Field130, a4);
            } else {
                a3 = a4.Field1427 == 5 || a4.Field1427 == 6 ? this.Field179 + 2 : this.Field179 + 1;
                if (a3 > this.Field180) {
                    this.Field180 = a3;
                }
                this.Field179 = a3;
            }
        }
        a3 = a4.Field1426;
        if (a4.Field1427 == 5 || a4.Field1427 == 6) {
            this.Field149.Method488(20, a3);
        } else if (a3 >= 256) {
            this.Field149.Method488(19, a3);
        } else {
            this.Field149.Method486(18, a3);
        }
    }

    @Override
    public void Method1841(int a2, int a3) {
        int a4;
        this.Field169 = this.Field149.Field991;
        if (this.Field178 != null && this.Field175 == 0) {
            this.Field178.Field1455.Method2801(132, a2, null, null);
        }
        if (this.Field175 != 2 && (a4 = a2 + 1) > this.Field151) {
            this.Field151 = a4;
        }
        if (a2 > 255 || a3 > 127 || a3 < -128) {
            this.Field149.Method485(196).Method488(132, a2).Method487(a3);
        } else {
            this.Field149.Method485(132).Method486(a2, a3);
        }
    }

    @Override
    public void Method1959(int a2, int a3, Class264 a4, Class264[] a5) {
        this.Field169 = this.Field149.Field991;
        int a6 = this.Field149.Field991;
        this.Field149.Method485(170);
        this.Field149.Method493(null, 0, (4 - this.Field149.Field991 % 4) % 4);
        a4.Method2851(this, this.Field149, a6, true);
        this.Field149.Method489(a2).Method489(a3);
        for (int a7 = 0; a7 < a5.length; ++a7) {
            a5[a7].Method2851(this, this.Field149, a6, true);
        }
        this.Method1961(a4, a5);
    }

    @Override
    public void Method1958(Class264 a2, int[] a3, Class264[] a4) {
        this.Field169 = this.Field149.Field991;
        int a5 = this.Field149.Field991;
        this.Field149.Method485(171);
        this.Field149.Method493(null, 0, (4 - this.Field149.Field991 % 4) % 4);
        a2.Method2851(this, this.Field149, a5, true);
        this.Field149.Method489(a4.length);
        for (int a6 = 0; a6 < a4.length; ++a6) {
            this.Field149.Method489(a3[a6]);
            a4[a6].Method2851(this, this.Field149, a5, true);
        }
        this.Method1961(a2, a4);
    }

    private void Method1961(Class264 a2, Class264[] a3) {
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(171, 0, null, null);
                this.Method1914(0, a2);
                a2.Method2854().Field1448 |= 0x10;
                for (int a4 = 0; a4 < a3.length; ++a4) {
                    this.Method1914(0, a3[a4]);
                    a3[a4].Method2854().Field1448 |= 0x10;
                }
            } else {
                --this.Field179;
                this.Method1914(this.Field179, a2);
                for (int a5 = 0; a5 < a3.length; ++a5) {
                    this.Method1914(this.Field179, a3[a5]);
                }
            }
            this.Method1879();
        }
    }

    @Override
    public void Method1951(String a2, int a3) {
        this.Field169 = this.Field149.Field991;
        Class261 a4 = this.Field130.Method1507(a2);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(197, a3, this.Field130, a4);
            } else {
                this.Field179 += 1 - a3;
            }
        }
        this.Field149.Method488(197, a4.Field1426).Method485(a3);
    }

    @Override
    public Class148 Method1973(int a2, Class31 a3, String a4, boolean a5) {
        Class138 a6 = new Class138();
        a2 = a2 & 0xFF0000FF | this.Field169 << 8;
        Class150.Method1324(a2, a3, a6);
        a6.Method487(this.Field130.Method1506(a4)).Method487(0);
        Class150 a7 = new Class150(this.Field130, true, a6, a6, a6.Field991 - 2);
        a7.Field1016 = this.Field170;
        this.Field170 = a7;
        return a7;
    }

    @Override
    public void Method1960(Class264 a2, Class264 a3, Class264 a4, String a5) {
        ++this.Field158;
        Class258 a6 = new Class258();
        a6.Field1410 = a2;
        a6.Field1411 = a3;
        a6.Field1412 = a4;
        a6.Field1413 = a5;
        a6.Field1414 = this.Field130.Method1508(a5);
        if (this.Field160 == null) {
            this.Field159 = a6;
        } else {
            this.Field160.Field1415 = a6;
        }
        this.Field160 = a6;
    }

    @Override
    public Class148 Method1974(int a2, Class31 a3, String a4, boolean a5) {
        Class138 a6 = new Class138();
        Class150.Method1324(a2, a3, a6);
        a6.Method487(this.Field130.Method1506(a4)).Method487(0);
        Class150 a7 = new Class150(this.Field130, true, a6, a6, a6.Field991 - 2);
        a7.Field1016 = this.Field170;
        this.Field170 = a7;
        return a7;
    }

    @Override
    public void Method1843(String a2, String a3, String a4, Class264 a5, Class264 a6, int a7) {
        block2: {
            char a8;
            int a9;
            if (this.Field166 == null) {
                this.Field166 = new Class138();
            }
            ++this.Field165;
            this.Field166.Method487(a5.Field1450).Method487(a6.Field1450 - a5.Field1450).Method487(this.Field130.Method1506(a2)).Method487(this.Field130.Method1506(a4)).Method487(a7);
            if (this.Field164 == null) {
                this.Field164 = new Class138();
            }
            ++this.Field163;
            this.Field164.Method487(a5.Field1450).Method487(a6.Field1450 - a5.Field1450).Method487(this.Field130.Method1506(a2)).Method487(this.Field130.Method1506(a3)).Method487(a7);
            if (this.Field175 == 2 || (a9 = a7 + ((a8 = a3.charAt(0)) == 'J' || a8 == 'D' ? 2 : 1)) <= this.Field151) break block2;
            this.Field151 = a9;
        }
    }

    @Override
    public Class148 Method1844(int a2, Class31 a3, Class264[] a4, Class264[] a5, int[] a6, String a7, boolean a8) {
        Class138 a9 = new Class138();
        a9.Method485(a2 >>> 24).Method487(a4.length);
        for (int a10 = 0; a10 < a4.length; ++a10) {
            a9.Method487(a4[a10].Field1450).Method487(a5[a10].Field1450 - a4[a10].Field1450).Method487(a6[a10]);
        }
        a9.Method485(0);
        a9.Method487(this.Field130.Method1506(a7)).Method487(0);
        Class150 a11 = new Class150(this.Field130, true, a9, a9, a9.Field991 - 2);
        a11.Field1016 = this.Field170;
        this.Field170 = a11;
        return a11;
    }

    @Override
    public void Method1981(int a2, Class264 a3) {
        if (this.Field168 == null) {
            this.Field168 = new Class138();
        }
        ++this.Field167;
        this.Field168.Method487(a3.Field1450);
        this.Field168.Method487(a2);
    }

    @Override
    public void Method1842(int a2, int a3) {
        if (this.Field173) {
            this.Method1893();
        }
        if (this.Field175 == 0) {
            Class258 a4 = this.Field159;
            while (true) {
                Class264 a5 = a4.Field1410.Method2854();
                Class264 a6 = a4.Field1412.Method2854();
                Class264 a7 = a4.Field1411.Method2854();
                String a8 = a4.Field1413 == null ? "java/lang/Throwable" : a4.Field1413;
                int a9 = 0x1700000 | this.Field130.Method1526(a8);
                a6.Field1448 |= 0x10;
                while (a5 != a7) {
                    Class250 a10 = new Class250();
                    a10.Field1384 = a9;
                    a10.Field1385 = a6;
                    a10.Field1386 = a5.Field1457;
                    a5.Field1457 = a10;
                    a5 = a5.Field1456;
                }
                a4 = a4.Field1415;
            }
        }
        if (this.Field175 == 1) {
            Class258 a11 = this.Field159;
            while (true) {
                Class264 a12 = a11.Field1410;
                Class264 a13 = a11.Field1412;
                Class264 a14 = a11.Field1411;
                while (a12 != a14) {
                    Class250 a15 = new Class250();
                    a15.Field1384 = Integer.MAX_VALUE;
                    a15.Field1385 = a13;
                    if ((a12.Field1448 & 0x80) == 0) {
                        a15.Field1386 = a12.Field1457;
                        a12.Field1457 = a15;
                    } else {
                        a15.Field1386 = a12.Field1457.Field1386.Field1386;
                        a12.Field1457.Field1386.Field1386 = a15;
                    }
                    a12 = a12.Field1456;
                }
                a11 = a11.Field1415;
            }
        }
        this.Field150 = a2;
        this.Field151 = a3;
    }

    @Override
    public void Method1653() {
    }

    private void Method1914(int a2, Class264 a3) {
        Class250 a4 = new Class250();
        a4.Field1384 = a2;
        a4.Field1385 = a3;
        a4.Field1386 = this.Field178.Field1457;
        this.Field178.Field1457 = a4;
    }

    private void Method1879() {
        if (this.Field175 == 0) {
            Class264 a2 = new Class264();
            a2.Field1455 = new Class276();
            a2.Field1455.Field1504 = a2;
            a2.Method2853(this, this.Field149.Field991, this.Field149.Field990);
            this.Field177.Field1456 = a2;
            this.Field177 = a2;
        } else {
            this.Field178.Field1454 = this.Field180;
        }
        this.Field178 = null;
    }

    private void Method1982(Class276 a2) {
        int a3;
        int a4;
        int a5 = 0;
        int a6 = 0;
        int a7 = 0;
        int[] a8 = a2.Field1505;
        int[] a9 = a2.Field1506;
        for (a4 = 0; a4 < a8.length; ++a4) {
            a3 = a8[a4];
            if (a3 == 0x1000000) {
                ++a5;
            } else {
                a6 += a5 + 1;
                a5 = 0;
            }
            if (a3 != 0x1000004 && a3 != 0x1000003) continue;
            ++a4;
        }
        for (a4 = 0; a4 < a9.length; ++a4) {
            a3 = a9[a4];
            ++a7;
            if (a3 != 0x1000004 && a3 != 0x1000003) continue;
            ++a4;
        }
        int a10 = this.Method1983(a2.Field1504.Field1450, a6, a7);
        a4 = 0;
        while (true) {
            a3 = a8[a4];
            this.Field157[a10++] = a3;
            if (a3 == 0x1000004 || a3 == 0x1000003) {
                ++a4;
            }
            ++a4;
            --a6;
        }
    }

    private void Method1882() {
        int a2 = this.Method1983(0, this.Field134.length() + 1, 0);
        if ((this.Field131 & 8) == 0) {
            this.Field157[a2++] = (this.Field131 & 0x80000) == 0 ? 0x1700000 | this.Field130.Method1526(this.Field130.Field1093) : 6;
        }
        int a3 = 1;
        block8: while (true) {
            int a4 = a3;
            switch (this.Field134.charAt(a3++)) {
                case 'B': 
                case 'C': 
                case 'I': 
                case 'S': 
                case 'Z': {
                    this.Field157[a2++] = 1;
                    continue block8;
                }
                case 'F': {
                    this.Field157[a2++] = 2;
                    continue block8;
                }
                case 'J': {
                    this.Field157[a2++] = 4;
                    continue block8;
                }
                case 'D': {
                    this.Field157[a2++] = 3;
                    continue block8;
                }
                case '[': {
                    while (this.Field134.charAt(a3) == '[') {
                        ++a3;
                    }
                    if (this.Field134.charAt(a3) == 'L') {
                        ++a3;
                        while (this.Field134.charAt(a3) != ';') {
                            ++a3;
                        }
                    }
                    this.Field157[a2++] = 0x1700000 | this.Field130.Method1526(this.Field134.substring(a4, ++a3));
                    continue block8;
                }
                case 'L': {
                    while (this.Field134.charAt(a3) != ';') {
                        ++a3;
                    }
                    this.Field157[a2++] = 0x1700000 | this.Field130.Method1526(this.Field134.substring(a4 + 1, a3++));
                    continue block8;
                }
            }
            break;
        }
        this.Field157[1] = a2 - 3;
        this.Method1883();
    }

    private int Method1983(int a2, int a3, int a4) {
        int a5 = 3 + a3 + a4;
        if (this.Field157 == null || this.Field157.length < a5) {
            this.Field157 = new int[a5];
        }
        this.Field157[0] = a2;
        this.Field157[1] = a3;
        this.Field157[2] = a4;
        return 3;
    }

    private void Method1883() {
        if (this.Field156 != null) {
            if (this.Field154 == null) {
                this.Field154 = new Class138();
            }
            this.Method1892();
            ++this.Field153;
        }
        this.Field156 = this.Field157;
        this.Field157 = null;
    }

    private void Method1892() {
        int a2 = this.Field157[1];
        int a3 = this.Field157[2];
        if ((this.Field130.Field1080 & 0xFFFF) < 50) {
            this.Field154.Method487(this.Field157[0]).Method487(a2);
            this.Method1881(3, 3 + a2);
            this.Field154.Method487(a3);
            this.Method1881(3 + a2, 3 + a2 + a3);
            return;
        }
        int a4 = this.Field156[1];
        int a5 = 255;
        int a6 = 0;
        int a7 = this.Field153 == 0 ? this.Field157[0] : this.Field157[0] - this.Field156[0] - 1;
        a6 = a2 - a4;
        switch (a6) {
            case -3: 
            case -2: 
            case -1: {
                a5 = 248;
                a4 = a2;
                break;
            }
            case 0: {
                a5 = a7 < 64 ? 0 : 251;
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                a5 = 252;
            }
        }
        if (a5 != 255) {
            int a8 = 3;
            for (int a9 = 0; a9 < a4; ++a9) {
                if (this.Field157[a8] != this.Field156[a8]) {
                    a5 = 255;
                    break;
                }
                ++a8;
            }
        }
        switch (a5) {
            case 0: {
                this.Field154.Method485(a7);
                break;
            }
            case 64: {
                this.Field154.Method485(64 + a7);
                this.Method1881(3 + a2, 4 + a2);
                break;
            }
            case 247: {
                this.Field154.Method485(247).Method487(a7);
                this.Method1881(3 + a2, 4 + a2);
                break;
            }
            case 251: {
                this.Field154.Method485(251).Method487(a7);
                break;
            }
            case 248: {
                this.Field154.Method485(251 + a6).Method487(a7);
                break;
            }
            case 252: {
                this.Field154.Method485(251 + a6).Method487(a7);
                this.Method1881(3 + a4, 3 + a2);
                break;
            }
            default: {
                this.Field154.Method485(255).Method487(a7).Method487(a2);
                this.Method1881(3, 3 + a2);
                this.Field154.Method487(a3);
                this.Method1881(3 + a2, 3 + a2 + a3);
            }
        }
    }

    private void Method1881(int a2, int a3) {
        block4: for (int a4 = a2; a4 < a3; ++a4) {
            int a5 = this.Field157[a4];
            int a6 = a5 & 0xF0000000;
            int a7 = a5 & 0xFFFFF;
            switch (a5 & 0xFF00000) {
                case 0x1700000: {
                    this.Field154.Method485(7).Method487(this.Field130.Method1508(this.Field130.Field1089[a7].Field1430));
                    continue block4;
                }
                case 0x1800000: {
                    this.Field154.Method485(8).Method487(this.Field130.Field1089[a7].Field1428);
                    continue block4;
                }
                default: {
                    this.Field154.Method485(a7);
                    continue block4;
                }
            }
        }
    }

    private void Method1965(Object a2) {
        if (a2 instanceof String) {
            this.Field154.Method485(7).Method487(this.Field130.Method1508((String)a2));
        } else if (a2 instanceof Integer) {
            this.Field154.Method485((Integer)a2);
        } else {
            this.Field154.Method485(8).Method487(((Class264)a2).Field1450);
        }
    }

    final int Method1984() {
        int a2;
        if (this.Field136 != 0) {
            return 6 + this.Field137;
        }
        int a3 = 8;
        if (this.Field149.Field991 > 0) {
            if (this.Field149.Field991 > 65536) {
                throw new RuntimeException("Method code too large!");
            }
            this.Field130.Method1506("Code");
            a3 += 18 + this.Field149.Field991 + 8 * this.Field158;
            if (this.Field164 != null) {
                this.Field130.Method1506("LocalVariableTable");
                a3 += 8 + this.Field164.Field991;
            }
            if (this.Field166 != null) {
                this.Field130.Method1506("LocalVariableTypeTable");
                a3 += 8 + this.Field166.Field991;
            }
            if (this.Field168 != null) {
                this.Field130.Method1506("LineNumberTable");
                a3 += 8 + this.Field168.Field991;
            }
            if (this.Field154 != null) {
                a2 = (this.Field130.Field1080 & 0xFFFF) >= 50 ? 1 : 0;
                this.Field130.Method1506("StackMapTable");
                a3 += 8 + this.Field154.Field991;
            }
            if (this.Field170 != null) {
                this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
                a3 += 8 + this.Field170.Method1321();
            }
            if (this.Field171 != null) {
                this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
                a3 += 8 + this.Field171.Method1321();
            }
            if (this.Field172 != null) {
                a3 += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
            }
        }
        if (this.Field138 > 0) {
            this.Field130.Method1506("Exceptions");
            a3 += 8 + 2 * this.Field138;
        }
        if ((this.Field131 & 0x1000) != 0 && ((this.Field130.Field1080 & 0xFFFF) < 49 || (this.Field131 & 0x40000) != 0)) {
            this.Field130.Method1506("Synthetic");
            a3 += 6;
        }
        if ((this.Field131 & 0x20000) != 0) {
            this.Field130.Method1506("Deprecated");
            a3 += 6;
        }
        if (this.Field135 != null) {
            this.Field130.Method1506("Signature");
            this.Field130.Method1506(this.Field135);
            a3 += 8;
        }
        if (this.Field162 != null) {
            this.Field130.Method1506("MethodParameters");
            a3 += 7 + this.Field162.Field991;
        }
        if (this.Field140 != null) {
            this.Field130.Method1506("AnnotationDefault");
            a3 += 6 + this.Field140.Field991;
        }
        if (this.Field141 != null) {
            this.Field130.Method1506("RuntimeVisibleAnnotations");
            a3 += 8 + this.Field141.Method1321();
        }
        if (this.Field142 != null) {
            this.Field130.Method1506("RuntimeInvisibleAnnotations");
            a3 += 8 + this.Field142.Method1321();
        }
        if (this.Field143 != null) {
            this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
            a3 += 8 + this.Field143.Method1321();
        }
        if (this.Field144 != null) {
            this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
            a3 += 8 + this.Field144.Method1321();
        }
        if (this.Field145 != null) {
            this.Field130.Method1506("RuntimeVisibleParameterAnnotations");
            a3 += 7 + 2 * (this.Field145.length - this.Field147);
            for (a2 = this.Field145.length - 1; a2 >= this.Field147; --a2) {
                a3 += this.Field145[a2] == null ? 0 : this.Field145[a2].Method1321();
            }
        }
        if (this.Field146 != null) {
            this.Field130.Method1506("RuntimeInvisibleParameterAnnotations");
            a3 += 7 + 2 * (this.Field146.length - this.Field147);
            for (a2 = this.Field146.length - 1; a2 >= this.Field147; --a2) {
                a3 += this.Field146[a2] == null ? 0 : this.Field146[a2].Method1321();
            }
        }
        if (this.Field148 != null) {
            a3 += this.Field148.Method474(this.Field130, null, 0, -1, -1);
        }
        return a3;
    }

    final void Method1985(Class138 a2) {
        block52: {
            int a3;
            int a4 = 64;
            int a5 = 0xE0000 | (this.Field131 & 0x40000) / 64;
            a2.Method487(this.Field131 & ~a5).Method487(this.Field132).Method487(this.Field133);
            if (this.Field136 != 0) {
                a2.Method493(this.Field130.Field1079.Field1029, this.Field136, this.Field137);
                return;
            }
            int a6 = 0;
            if (this.Field149.Field991 > 0) {
                ++a6;
            }
            if (this.Field138 > 0) {
                ++a6;
            }
            if ((this.Field131 & 0x1000) != 0 && ((this.Field130.Field1080 & 0xFFFF) < 49 || (this.Field131 & 0x40000) != 0)) {
                ++a6;
            }
            if ((this.Field131 & 0x20000) != 0) {
                ++a6;
            }
            if (this.Field135 != null) {
                ++a6;
            }
            if (this.Field162 != null) {
                ++a6;
            }
            if (this.Field140 != null) {
                ++a6;
            }
            if (this.Field141 != null) {
                ++a6;
            }
            if (this.Field142 != null) {
                ++a6;
            }
            if (this.Field143 != null) {
                ++a6;
            }
            if (this.Field144 != null) {
                ++a6;
            }
            if (this.Field145 != null) {
                ++a6;
            }
            if (this.Field146 != null) {
                ++a6;
            }
            if (this.Field148 != null) {
                a6 += this.Field148.Method473();
            }
            a2.Method487(a6);
            if (this.Field149.Field991 > 0) {
                a3 = 12 + this.Field149.Field991 + 8 * this.Field158;
                if (this.Field164 != null) {
                    a3 += 8 + this.Field164.Field991;
                }
                if (this.Field166 != null) {
                    a3 += 8 + this.Field166.Field991;
                }
                if (this.Field168 != null) {
                    a3 += 8 + this.Field168.Field991;
                }
                if (this.Field154 != null) {
                    a3 += 8 + this.Field154.Field991;
                }
                if (this.Field170 != null) {
                    a3 += 8 + this.Field170.Method1321();
                }
                if (this.Field171 != null) {
                    a3 += 8 + this.Field171.Method1321();
                }
                if (this.Field172 != null) {
                    a3 += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
                }
                a2.Method487(this.Field130.Method1506("Code")).Method489(a3);
                a2.Method487(this.Field150).Method487(this.Field151);
                a2.Method489(this.Field149.Field991).Method493(this.Field149.Field990, 0, this.Field149.Field991);
                a2.Method487(this.Field158);
                if (this.Field158 > 0) {
                    Class258 a7 = this.Field159;
                    while (true) {
                        a2.Method487(a7.Field1410.Field1450).Method487(a7.Field1411.Field1450).Method487(a7.Field1412.Field1450).Method487(a7.Field1414);
                        a7 = a7.Field1415;
                    }
                }
                a6 = 0;
                if (this.Field164 != null) {
                    ++a6;
                }
                if (this.Field166 != null) {
                    ++a6;
                }
                if (this.Field168 != null) {
                    ++a6;
                }
                if (this.Field154 != null) {
                    ++a6;
                }
                if (this.Field170 != null) {
                    ++a6;
                }
                if (this.Field171 != null) {
                    ++a6;
                }
                if (this.Field172 != null) {
                    a6 += this.Field172.Method473();
                }
                a2.Method487(a6);
                if (this.Field164 != null) {
                    a2.Method487(this.Field130.Method1506("LocalVariableTable"));
                    a2.Method489(this.Field164.Field991 + 2).Method487(this.Field163);
                    a2.Method493(this.Field164.Field990, 0, this.Field164.Field991);
                }
                if (this.Field166 != null) {
                    a2.Method487(this.Field130.Method1506("LocalVariableTypeTable"));
                    a2.Method489(this.Field166.Field991 + 2).Method487(this.Field165);
                    a2.Method493(this.Field166.Field990, 0, this.Field166.Field991);
                }
                if (this.Field168 != null) {
                    a2.Method487(this.Field130.Method1506("LineNumberTable"));
                    a2.Method489(this.Field168.Field991 + 2).Method487(this.Field167);
                    a2.Method493(this.Field168.Field990, 0, this.Field168.Field991);
                }
                if (this.Field154 != null) {
                    boolean a8 = (this.Field130.Field1080 & 0xFFFF) >= 50;
                    a2.Method487(this.Field130.Method1506("StackMapTable"));
                    a2.Method489(this.Field154.Field991 + 2).Method487(this.Field153);
                    a2.Method493(this.Field154.Field990, 0, this.Field154.Field991);
                }
                if (this.Field170 != null) {
                    a2.Method487(this.Field130.Method1506("RuntimeVisibleTypeAnnotations"));
                    this.Field170.Method1322(a2);
                }
                if (this.Field171 != null) {
                    a2.Method487(this.Field130.Method1506("RuntimeInvisibleTypeAnnotations"));
                    this.Field171.Method1322(a2);
                }
                if (this.Field172 != null) {
                    this.Field172.Method475(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field151, this.Field150, a2);
                }
            }
            if (this.Field138 > 0) {
                a2.Method487(this.Field130.Method1506("Exceptions")).Method489(2 * this.Field138 + 2);
                a2.Method487(this.Field138);
                for (a3 = 0; a3 < this.Field138; ++a3) {
                    a2.Method487(this.Field139[a3]);
                }
            }
            if ((this.Field131 & 0x1000) != 0 && ((this.Field130.Field1080 & 0xFFFF) < 49 || (this.Field131 & 0x40000) != 0)) {
                a2.Method487(this.Field130.Method1506("Synthetic")).Method489(0);
            }
            if ((this.Field131 & 0x20000) != 0) {
                a2.Method487(this.Field130.Method1506("Deprecated")).Method489(0);
            }
            if (this.Field135 != null) {
                a2.Method487(this.Field130.Method1506("Signature")).Method489(2).Method487(this.Field130.Method1506(this.Field135));
            }
            if (this.Field162 != null) {
                a2.Method487(this.Field130.Method1506("MethodParameters"));
                a2.Method489(this.Field162.Field991 + 1).Method485(this.Field161);
                a2.Method493(this.Field162.Field990, 0, this.Field162.Field991);
            }
            if (this.Field140 != null) {
                a2.Method487(this.Field130.Method1506("AnnotationDefault"));
                a2.Method489(this.Field140.Field991);
                a2.Method493(this.Field140.Field990, 0, this.Field140.Field991);
            }
            if (this.Field141 != null) {
                a2.Method487(this.Field130.Method1506("RuntimeVisibleAnnotations"));
                this.Field141.Method1322(a2);
            }
            if (this.Field142 != null) {
                a2.Method487(this.Field130.Method1506("RuntimeInvisibleAnnotations"));
                this.Field142.Method1322(a2);
            }
            if (this.Field143 != null) {
                a2.Method487(this.Field130.Method1506("RuntimeVisibleTypeAnnotations"));
                this.Field143.Method1322(a2);
            }
            if (this.Field144 != null) {
                a2.Method487(this.Field130.Method1506("RuntimeInvisibleTypeAnnotations"));
                this.Field144.Method1322(a2);
            }
            if (this.Field145 != null) {
                a2.Method487(this.Field130.Method1506("RuntimeVisibleParameterAnnotations"));
                Class150.Method1323(this.Field145, this.Field147, a2);
            }
            if (this.Field146 != null) {
                a2.Method487(this.Field130.Method1506("RuntimeInvisibleParameterAnnotations"));
                Class150.Method1323(this.Field146, this.Field147, a2);
            }
            if (this.Field148 == null) break block52;
            this.Field148.Method475(this.Field130, null, 0, -1, -1, a2);
        }
    }

    private void Method1893() {
        int a2;
        Object[] a3;
        Object a4;
        int[] a5;
        int a6;
        int a7;
        int a8;
        byte[] a9;
        int a10;
        byte[] byArray = this.Field149.Field990;
        int[] a11 = new int[]{};
        int[] nArray = new int[]{};
        String[] a12 = Class267.Method2862();
        boolean[] a13 = new boolean[this.Field149.Field991];
        int a14 = 3;
        if (a14 == 3) {
            a14 = 2;
        }
        if ((a10 = 0) < a9.length) {
            int a15 = a9[a10] & 0xFF;
            a8 = 0;
            switch (Class169.Field1059[a15]) {
                case 0: 
                case 4: {
                    ++a10;
                }
                case 9: {
                    if (a15 > 201) {
                        a15 = a15 < 218 ? a15 - 49 : a15 - 20;
                        a7 = a10 + Class9.Method1986(a9, a10 + 1);
                    }
                    if (!((a6 = Class9.Method1990(a11, a5, a10, a7 = a10 + Class9.Method1987(a9, a10 + 1))) >= Short.MIN_VALUE && a6 <= Short.MAX_VALUE || a13[a10])) {
                        if (a15 == 167 || a15 == 168) {
                            a8 = 2;
                        }
                        a8 = 5;
                        a13[a10] = true;
                    }
                    a10 += 3;
                }
                case 10: {
                    a10 += 5;
                }
                case 14: {
                    if (a14 == 1) {
                        a6 = Class9.Method1990(a11, a5, 0, a10);
                        a8 = -(a6 & 3);
                    }
                    if (!a13[a10]) {
                        a8 = a10 & 3;
                        a13[a10] = true;
                    }
                    a10 = a10 + 4 - (a10 & 3);
                    a10 += 4 * (Class9.Method1988(a9, a10 + 8) - Class9.Method1988(a9, a10 + 4) + 1) + 12;
                }
                case 15: {
                    if (a14 == 1) {
                        a6 = Class9.Method1990(a11, a5, 0, a10);
                        a8 = -(a6 & 3);
                    }
                    if (!a13[a10]) {
                        a8 = a10 & 3;
                        a13[a10] = true;
                    }
                    a10 = a10 + 4 - (a10 & 3);
                    a10 += 8 * Class9.Method1988(a9, a10 + 4) + 8;
                }
                case 17: {
                    a15 = a9[a10 + 1] & 0xFF;
                    if (a15 == 132) {
                        a10 += 6;
                    }
                    a10 += 4;
                }
                case 1: 
                case 3: 
                case 11: {
                    a10 += 2;
                }
                case 2: 
                case 5: 
                case 6: 
                case 12: 
                case 13: {
                    a10 += 3;
                }
                case 7: 
                case 8: {
                    a10 += 5;
                    break;
                }
            }
            a10 += 4;
            a4 = new int[a11.length + 1];
            a3 = new int[a5.length + 1];
            System.arraycopy((Object)a11, (int)0, (Object)a4, (int)0, (int)a11.length);
            System.arraycopy((Object)a5, (int)0, (Object)a3, (int)0, (int)a5.length);
            a4[a11.length] = a10;
            a3[a5.length] = a8;
            a11 = a4;
            a5 = a3;
            a14 = 3;
        }
        if (a14 < 3) {
            --a14;
        }
        Class138 a16 = new Class138(this.Field149.Field991);
        a10 = 0;
        if (a10 < this.Field149.Field991) {
            a8 = a9[a10] & 0xFF;
            switch (Class169.Field1059[a8]) {
                case 0: 
                case 4: {
                    a16.Method485(a8);
                    ++a10;
                }
                case 9: {
                    if (a8 > 201) {
                        a8 = a8 < 218 ? a8 - 49 : a8 - 20;
                        a7 = a10 + Class9.Method1986(a9, a10 + 1);
                    }
                    a7 = a10 + Class9.Method1987(a9, a10 + 1);
                    a6 = Class9.Method1990(a11, a5, a10, a7);
                    if (a13[a10]) {
                        if (a8 == 167) {
                            a16.Method485(200);
                        }
                        if (a8 == 168) {
                            a16.Method485(201);
                        }
                        a16.Method485(a8 <= 166 ? (a8 + 1 ^ 1) - 1 : a8 ^ 1);
                        a16.Method487(8);
                        a16.Method485(200);
                        a16.Method489(a6 -= 3);
                    }
                    a16.Method485(a8);
                    a16.Method487(a6);
                    a10 += 3;
                }
                case 10: {
                    a7 = a10 + Class9.Method1988(a9, a10 + 1);
                    a6 = Class9.Method1990(a11, a5, a10, a7);
                    a16.Method485(a8);
                    a16.Method489(a6);
                    a10 += 5;
                }
                case 14: {
                    int a17 = a10;
                    a10 = a10 + 4 - (a17 & 3);
                    a16.Method485(170);
                    a16.Method493(null, 0, (4 - a16.Field991 % 4) % 4);
                    a7 = a17 + Class9.Method1988(a9, a10);
                    a6 = Class9.Method1990(a11, a5, a17, a7);
                    a16.Method489(a6);
                    int a18 = Class9.Method1988(a9, a10 += 4);
                    a16.Method489(a18);
                    a18 = Class9.Method1988(a9, a10 += 4) - a18 + 1;
                    a16.Method489(Class9.Method1988(a9, (a10 += 4) - 4));
                    a7 = a17 + Class9.Method1988(a9, a10);
                    a10 += 4;
                    a6 = Class9.Method1990(a11, a5, a17, a7);
                    a16.Method489(a6);
                    --a18;
                }
                case 15: {
                    int a17 = a10;
                    a10 = a10 + 4 - (a17 & 3);
                    a16.Method485(171);
                    a16.Method493(null, 0, (4 - a16.Field991 % 4) % 4);
                    a7 = a17 + Class9.Method1988(a9, a10);
                    a6 = Class9.Method1990(a11, a5, a17, a7);
                    a16.Method489(a6);
                    int a18 = Class9.Method1988(a9, a10 += 4);
                    a16.Method489(a18);
                    a16.Method489(Class9.Method1988(a9, a10 += 4));
                    a7 = a17 + Class9.Method1988(a9, a10 += 4);
                    a10 += 4;
                    a6 = Class9.Method1990(a11, a5, a17, a7);
                    a16.Method489(a6);
                    --a18;
                }
                case 17: {
                    a8 = a9[a10 + 1] & 0xFF;
                    if (a8 == 132) {
                        a16.Method493(a9, a10, 6);
                        a10 += 6;
                    }
                    a16.Method493(a9, a10, 4);
                    a10 += 4;
                }
                case 1: 
                case 3: 
                case 11: {
                    a16.Method493(a9, a10, 2);
                    a10 += 2;
                }
                case 2: 
                case 5: 
                case 6: 
                case 12: 
                case 13: {
                    a16.Method493(a9, a10, 3);
                    a10 += 3;
                }
                case 7: 
                case 8: {
                    a16.Method493(a9, a10, 5);
                    a10 += 5;
                    break;
                }
            }
            a16.Method493(a9, a10, 4);
            a10 += 4;
        }
        if (this.Field175 == 0) {
            Class264 a19 = this.Field176;
            a10 = a19.Field1450 - 3;
            if (a13[a10]) {
                a19.Field1448 |= 0x10;
            }
            Class9.Method1991(a11, a5, a19);
            a19 = a19.Field1456;
            a2 = 0;
            if (a2 < this.Field130.Field1089.length) {
                a4 = this.Field130.Field1089[a2];
                if (((Class261)a4).Field1427 == 31) {
                    ((Class261)a4).Field1428 = Class9.Method1990(a11, a5, 0, ((Class261)a4).Field1428);
                }
                ++a2;
            }
        }
        if (this.Field153 > 0) {
            this.Field130.Field1117 = true;
        }
        Class258 a20 = this.Field159;
        Class9.Method1991(a11, a5, a20.Field1410);
        Class9.Method1991(a11, a5, a20.Field1411);
        Class9.Method1991(a11, a5, a20.Field1412);
        a20 = a20.Field1415;
        a2 = 0;
        if (a2 < 2) {
            a4 = this.Field164;
            a9 = ((Class138)a4).Field990;
            a10 = 0;
            if (a10 < ((Class138)a4).Field991) {
                a7 = Class9.Method1986(a9, a10);
                a6 = Class9.Method1990(a11, a5, 0, a7);
                Class9.Method1989(a9, a10, a6);
                a6 = Class9.Method1990(a11, a5, 0, a7 += Class9.Method1986(a9, a10 + 2)) - a6;
                Class9.Method1989(a9, a10 + 2, a6);
                a10 += 10;
            }
            ++a2;
        }
        if (this.Field168 != null) {
            a9 = this.Field168.Field990;
            a10 = 0;
            if (a10 < this.Field168.Field991) {
                Class9.Method1989(a9, a10, Class9.Method1990(a11, a5, 0, Class9.Method1986(a9, a10)));
                a10 += 4;
            }
        }
        a4 = this.Field172;
        a3 = ((Class136)a4).Method470();
        a2 = a3.length - 1;
        Class9.Method1991(a11, a5, (Class264)a3[a2]);
        --a2;
        a4 = ((Class136)a4).Field989;
        this.Field149 = a16;
    }

    static int Method1986(byte[] a2, int a3) {
        return (a2[a3] & 0xFF) << 8 | a2[a3 + 1] & 0xFF;
    }

    static short Method1987(byte[] a2, int a3) {
        return (short)((a2[a3] & 0xFF) << 8 | a2[a3 + 1] & 0xFF);
    }

    static int Method1988(byte[] a2, int a3) {
        return (a2[a3] & 0xFF) << 24 | (a2[a3 + 1] & 0xFF) << 16 | (a2[a3 + 2] & 0xFF) << 8 | a2[a3 + 3] & 0xFF;
    }

    static void Method1989(byte[] a2, int a3, int a4) {
        a2[a3] = (byte)(a4 >>> 8);
        a2[a3 + 1] = (byte)a4;
    }

    static int Method1990(int[] a2, int[] a3, int a4, int a5) {
        int a6 = a5 - a4;
        for (int a7 = 0; a7 < a2.length; ++a7) {
            if (a4 < a2[a7] && a2[a7] <= a5) {
                a6 += a3[a7];
                continue;
            }
            if (a5 >= a2[a7] || a2[a7] > a4) continue;
            a6 -= a3[a7];
        }
        return a6;
    }

    static void Method1991(int[] a2, int[] a3, Class264 a4) {
        block0: {
            if ((a4.Field1448 & 4) != 0) break block0;
            a4.Field1450 = Class9.Method1990(a2, a3, 0, a4.Field1450);
            a4.Field1448 |= 4;
        }
    }

    private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}