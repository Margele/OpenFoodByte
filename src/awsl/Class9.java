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
import awsl.Class46;

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

    Class9(Class169 a, int a2, String a3, String a4, String a5, String[] a6, boolean a7, boolean a8) {
        super(327680);
        int a9;
        if (a.Field1113 == null) {
            a.Field1113 = this;
        } else {
            a.Field1114.Field1460 = this;
        }
        a.Field1114 = this;
        this.Field130 = a;
        this.Field131 = a2;
        if ("<init>".equals((Object)a3)) {
            this.Field131 |= 0x80000;
        }
        this.Field132 = a.Method1506(a3);
        this.Field133 = a.Method1506(a4);
        this.Field134 = a4;
        this.Field135 = a5;
        if (a6.length > 0) {
            this.Field138 = a6.length;
            this.Field139 = new int[this.Field138];
            for (a9 = 0; a9 < this.Field138; ++a9) {
                this.Field139[a9] = a.Method1508(a6[a9]);
            }
        }
        this.Field175 = 0;
        a9 = Class46.Method3215(this.Field134) >> 2;
        if ((a2 & 8) != 0) {
            --a9;
        }
        this.Field151 = a9;
        this.Field152 = a9;
        this.Field176 = new Class264();
        this.Field176.Field1448 |= 8;
        this.Method1947(this.Field176);
    }

    @Override
    public void Method1979(String a, int a2) {
        if (this.Field162 == null) {
            this.Field162 = new Class138();
        }
        ++this.Field161;
        this.Field162.Method487(0).Method487(a2);
    }

    @Override
    public Class148 Method1968() {
        this.Field140 = new Class138();
        return new Class150(this.Field130, false, this.Field140, null, 0);
    }

    @Override
    public Class148 Method1969(String a, boolean a2) {
        Class138 a3 = new Class138();
        a3.Method487(this.Field130.Method1506(a)).Method487(0);
        Class150 a4 = new Class150(this.Field130, true, a3, a3, 2);
        a4.Field1016 = this.Field141;
        this.Field141 = a4;
        return a4;
    }

    @Override
    public Class148 Method1970(int a, Class31 a2, String a3, boolean a4) {
        Class138 a5 = new Class138();
        Class150.Method1324(a, a2, a5);
        a5.Method487(this.Field130.Method1506(a3)).Method487(0);
        Class150 a6 = new Class150(this.Field130, true, a5, a5, a5.Field991 - 2);
        a6.Field1016 = this.Field143;
        this.Field143 = a6;
        return a6;
    }

    @Override
    public Class148 Method1971(int a, String a2, boolean a3) {
        Class138 a4 = new Class138();
        if ("Ljava/lang/Synthetic;".equals((Object)a2)) {
            this.Field147 = Math.max((int)this.Field147, (int)(a + 1));
            return new Class150(this.Field130, false, a4, null, 0);
        }
        a4.Method487(this.Field130.Method1506(a2)).Method487(0);
        Class150 a5 = new Class150(this.Field130, true, a4, a4, 2);
        if (this.Field145 == null) {
            this.Field145 = new Class150[Class46.Method3211(this.Field134).length];
        }
        a5.Field1016 = this.Field145[a];
        this.Field145[a] = a5;
        return a5;
    }

    @Override
    public void Method1980(Class136 a) {
        if (a.Method469()) {
            a.Field989 = this.Field172;
            this.Field172 = a;
        } else {
            a.Field989 = this.Field148;
            this.Field148 = a;
        }
    }

    @Override
    public void Method1652() {
    }

    @Override
    public void Method1845(int a, int a2, Object[] a3, int a4, Object[] a5) {
        if (this.Field175 == 0) {
            return;
        }
        if (a == -1) {
            int a6;
            if (this.Field156 == null) {
                this.Method1882();
            }
            this.Field152 = a2;
            int a7 = this.Method1983(this.Field149.Field991, a2, a4);
            for (a6 = 0; a6 < a2; ++a6) {
                this.Field157[a7++] = a3[a6] instanceof String ? 0x1700000 | this.Field130.Method1526((String)a3[a6]) : (a3[a6] instanceof Integer ? (Integer)a3[a6] : 0x1800000 | this.Field130.Method1527("", ((Class264)a3[a6]).Field1450));
            }
            for (a6 = 0; a6 < a4; ++a6) {
                this.Field157[a7++] = a5[a6] instanceof String ? 0x1700000 | this.Field130.Method1526((String)a5[a6]) : (a5[a6] instanceof Integer ? (Integer)a5[a6] : 0x1800000 | this.Field130.Method1527("", ((Class264)a5[a6]).Field1450));
            }
            this.Method1883();
        } else {
            if (this.Field154 != null) {
                int a8 = this.Field149.Field991 - this.Field155 - 1;
                if (a == 3) {
                    return;
                }
                throw new IllegalStateException();
            }
            this.Field154 = new Class138();
            int a9 = this.Field149.Field991;
            switch (a) {
                case 0: {
                    int a10;
                    this.Field152 = a2;
                    this.Field154.Method485(255).Method487(a9).Method487(a2);
                    for (a10 = 0; a10 < a2; ++a10) {
                        this.Method1965(a3[a10]);
                    }
                    this.Field154.Method487(a4);
                    for (a10 = 0; a10 < a4; ++a10) {
                        this.Method1965(a5[a10]);
                    }
                    break;
                }
                case 1: {
                    this.Field152 += a2;
                    this.Field154.Method485(251 + a2).Method487(a9);
                    for (int a11 = 0; a11 < a2; ++a11) {
                        this.Method1965(a3[a11]);
                    }
                    break;
                }
                case 2: {
                    this.Field152 -= a2;
                    this.Field154.Method485(251 - a2).Method487(a9);
                    break;
                }
                case 3: {
                    if (a9 < 64) {
                        this.Field154.Method485(a9);
                        break;
                    }
                    this.Field154.Method485(251).Method487(a9);
                    break;
                }
                case 4: {
                    if (a9 < 64) {
                        this.Field154.Method485(64 + a9);
                    } else {
                        this.Field154.Method485(247).Method487(a9);
                    }
                    this.Method1965(a5[0]);
                }
            }
            this.Field155 = this.Field149.Field991;
            ++this.Field153;
        }
        this.Field150 = Math.max((int)this.Field150, (int)a4);
        this.Field151 = Math.max((int)this.Field151, (int)this.Field152);
    }

    @Override
    public void Method1948(int a) {
        block4: {
            this.Field169 = this.Field149.Field991;
            this.Field149.Method485(a);
            if (this.Field178 == null) break block4;
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a, 0, null, null);
            } else {
                int a2 = this.Field179 + Class276.Field1503[a];
                if (a2 > this.Field180) {
                    this.Field180 = a2;
                }
                this.Field179 = a2;
            }
            if (a >= 172 && a <= 177 || a == 191) {
                this.Method1879();
            }
        }
    }

    @Override
    public void Method854(int a, int a2) {
        this.Field169 = this.Field149.Field991;
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a, a2, null, null);
            } else if (a != 188) {
                int a3 = this.Field179 + 1;
                if (a3 > this.Field180) {
                    this.Field180 = a3;
                }
                this.Field179 = a3;
            }
        }
        if (a == 17) {
            this.Field149.Method488(a, a2);
        } else {
            this.Field149.Method486(a, a2);
        }
    }

    @Override
    public void Method1840(int a, int a2) {
        block11: {
            int a3;
            this.Field169 = this.Field149.Field991;
            if (this.Field178 != null) {
                if (this.Field175 == 0) {
                    this.Field178.Field1455.Method2801(a, a2, null, null);
                } else if (a == 169) {
                    this.Field178.Field1448 |= 0x100;
                    this.Field178.Field1453 = this.Field179;
                    this.Method1879();
                } else {
                    a3 = this.Field179 + Class276.Field1503[a];
                    if (a3 > this.Field180) {
                        this.Field180 = a3;
                    }
                    this.Field179 = a3;
                }
            }
            if (this.Field175 != 2 && (a3 = a == 22 || a == 24 || a == 55 || a == 57 ? a2 + 2 : a2 + 1) > this.Field151) {
                this.Field151 = a3;
            }
            if (a2 < 4 && a != 169) {
                a3 = a < 54 ? 26 + (a - 21 << 2) + a2 : 59 + (a - 54 << 2) + a2;
                this.Field149.Method485(a3);
            } else if (a2 >= 256) {
                this.Field149.Method485(196).Method488(a, a2);
            } else {
                this.Field149.Method486(a, a2);
            }
            if (a < 54 || this.Field175 != 0 || this.Field158 <= 0) break block11;
            this.Method1947(new Class264());
        }
    }

    @Override
    public void Method1952(int a, String a2) {
        this.Field169 = this.Field149.Field991;
        Class261 a3 = this.Field130.Method1507(a2);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a, this.Field149.Field991, this.Field130, a3);
            } else if (a == 187) {
                int a4 = this.Field179 + 1;
                if (a4 > this.Field180) {
                    this.Field180 = a4;
                }
                this.Field179 = a4;
            }
        }
        this.Field149.Method488(a, a3.Field1426);
    }

    @Override
    public void Method1949(int a, String a2, String a3, String a4) {
        this.Field169 = this.Field149.Field991;
        Class261 a5 = this.Field130.Method1515(a2, a3, a4);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a, 0, this.Field130, a5);
            } else {
                int a6;
                char a7 = a4.charAt(0);
                switch (a) {
                    case 178: {
                        a6 = this.Field179 + (a7 == 'D' || a7 == 'J' ? 2 : 1);
                        break;
                    }
                    case 179: {
                        a6 = this.Field179 + (a7 == 'D' || a7 == 'J' ? -2 : -1);
                        break;
                    }
                    case 180: {
                        a6 = this.Field179 + (a7 == 'D' || a7 == 'J' ? 1 : 0);
                        break;
                    }
                    default: {
                        a6 = this.Field179 + (a7 == 'D' || a7 == 'J' ? -3 : -2);
                    }
                }
                if (a6 > this.Field180) {
                    this.Field180 = a6;
                }
                this.Field179 = a6;
            }
        }
        this.Field149.Method488(a, a5.Field1426);
    }

    @Override
    public void Method1954(int a, String a2, String a3, String a4, boolean a5) {
        this.Field169 = this.Field149.Field991;
        Class261 a6 = this.Field130.Method1517(a2, a3, a4, a5);
        int a7 = a6.Field1428;
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(a, 0, this.Field130, a6);
            } else {
                a6.Field1428 = a7 = Class46.Method3215(a4);
                int a8 = a == 184 ? this.Field179 - (a7 >> 2) + (a7 & 3) + 1 : this.Field179 - (a7 >> 2) + (a7 & 3);
                if (a8 > this.Field180) {
                    this.Field180 = a8;
                }
                this.Field179 = a8;
            }
        }
        if (a == 185) {
            a6.Field1428 = a7 = Class46.Method3215(a4);
            this.Field149.Method488(185, a6.Field1426).Method486(a7 >> 2, 0);
        } else {
            this.Field149.Method488(a, a6.Field1426);
        }
    }

    @Override
    public void Method1956(String a, String a2, Class279 a3, Object[] a4) {
        this.Field169 = this.Field149.Field991;
        Class261 a5 = this.Field130.Method1513(a, a2, a3, a4);
        int a6 = a5.Field1428;
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(186, 0, this.Field130, a5);
            } else {
                a5.Field1428 = a6 = Class46.Method3215(a2);
                int a7 = this.Field179 - (a6 >> 2) + (a6 & 3) + 1;
                if (a7 > this.Field180) {
                    this.Field180 = a7;
                }
                this.Field179 = a7;
            }
        }
        this.Field149.Method488(186, a5.Field1426);
        this.Field149.Method487(0);
    }

    @Override
    public void Method1957(int a, Class264 a2) {
        block14: {
            this.Field169 = this.Field149.Field991;
            Class264 a3 = null;
            if (this.Field178 != null) {
                if (this.Field175 == 0) {
                    this.Field178.Field1455.Method2801(a, 0, null, null);
                    a2.Method2854().Field1448 |= 0x10;
                    this.Method1914(0, a2);
                    if (a != 167) {
                        a3 = new Class264();
                    }
                } else if (a == 168) {
                    if ((a2.Field1448 & 0x200) == 0) {
                        a2.Field1448 |= 0x200;
                        ++this.Field174;
                    }
                    this.Field178.Field1448 |= 0x80;
                    this.Method1914(this.Field179 + 1, a2);
                    a3 = new Class264();
                } else {
                    this.Field179 += Class276.Field1503[a];
                    this.Method1914(this.Field179, a2);
                }
            }
            if ((a2.Field1448 & 2) != 0 && a2.Field1450 - this.Field149.Field991 < Short.MIN_VALUE) {
                if (a == 167) {
                    this.Field149.Method485(200);
                } else if (a == 168) {
                    this.Field149.Method485(201);
                } else {
                    a3.Field1448 |= 0x10;
                    this.Field149.Method485(a <= 166 ? (a + 1 ^ 1) - 1 : a ^ 1);
                    this.Field149.Method487(8);
                    this.Field149.Method485(200);
                }
                a2.Method2851(this, this.Field149, this.Field149.Field991 - 1, true);
            } else {
                this.Field149.Method485(a);
                a2.Method2851(this, this.Field149, this.Field149.Field991 - 1, false);
            }
            if (this.Field178 == null) break block14;
            this.Method1947(a3);
            if (a == 167) {
                this.Method1879();
            }
        }
    }

    @Override
    public void Method1947(Class264 a) {
        this.Field173 |= a.Method2853(this, this.Field149.Field991, this.Field149.Field990);
        if ((a.Field1448 & 1) != 0) {
            return;
        }
        if (this.Field175 == 0) {
            if (this.Field178 != null) {
                if (a.Field1450 == this.Field178.Field1450) {
                    this.Field178.Field1448 |= a.Field1448 & 0x10;
                    a.Field1455 = this.Field178.Field1455;
                    return;
                }
                this.Method1914(0, a);
            }
            this.Field178 = a;
            if (a.Field1455 == null) {
                a.Field1455 = new Class276();
                a.Field1455.Field1504 = a;
            }
            if (this.Field177 != null) {
                if (a.Field1450 == this.Field177.Field1450) {
                    this.Field177.Field1448 |= a.Field1448 & 0x10;
                    a.Field1455 = this.Field177.Field1455;
                    this.Field178 = this.Field177;
                    return;
                }
                this.Field177.Field1456 = a;
            }
            this.Field177 = a;
        } else if (this.Field175 == 1) {
            if (this.Field178 != null) {
                this.Field178.Field1454 = this.Field180;
                this.Method1914(this.Field179, a);
            }
            this.Field178 = a;
            this.Field179 = 0;
            this.Field180 = 0;
            if (this.Field177 != null) {
                this.Field177.Field1456 = a;
            }
            this.Field177 = a;
        }
    }

    @Override
    public void Method1950(Object a) {
        int a2;
        this.Field169 = this.Field149.Field991;
        Class261 a3 = this.Field130.Method1504(a);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(18, 0, this.Field130, a3);
            } else {
                a2 = a3.Field1427 == 5 || a3.Field1427 == 6 ? this.Field179 + 2 : this.Field179 + 1;
                if (a2 > this.Field180) {
                    this.Field180 = a2;
                }
                this.Field179 = a2;
            }
        }
        a2 = a3.Field1426;
        if (a3.Field1427 == 5 || a3.Field1427 == 6) {
            this.Field149.Method488(20, a2);
        } else if (a2 >= 256) {
            this.Field149.Method488(19, a2);
        } else {
            this.Field149.Method486(18, a2);
        }
    }

    @Override
    public void Method1841(int a, int a2) {
        int a3;
        this.Field169 = this.Field149.Field991;
        if (this.Field178 != null && this.Field175 == 0) {
            this.Field178.Field1455.Method2801(132, a, null, null);
        }
        if (this.Field175 != 2 && (a3 = a + 1) > this.Field151) {
            this.Field151 = a3;
        }
        if (a > 255 || a2 > 127 || a2 < -128) {
            this.Field149.Method485(196).Method488(132, a).Method487(a2);
        } else {
            this.Field149.Method485(132).Method486(a, a2);
        }
    }

    @Override
    public void Method1959(int a, int a2, Class264 a3, Class264[] a4) {
        this.Field169 = this.Field149.Field991;
        int a5 = this.Field149.Field991;
        this.Field149.Method485(170);
        this.Field149.Method493(null, 0, (4 - this.Field149.Field991 % 4) % 4);
        a3.Method2851(this, this.Field149, a5, true);
        this.Field149.Method489(a).Method489(a2);
        for (int a6 = 0; a6 < a4.length; ++a6) {
            a4[a6].Method2851(this, this.Field149, a5, true);
        }
        this.Method1961(a3, a4);
    }

    @Override
    public void Method1958(Class264 a, int[] a2, Class264[] a3) {
        this.Field169 = this.Field149.Field991;
        int a4 = this.Field149.Field991;
        this.Field149.Method485(171);
        this.Field149.Method493(null, 0, (4 - this.Field149.Field991 % 4) % 4);
        a.Method2851(this, this.Field149, a4, true);
        this.Field149.Method489(a3.length);
        for (int a5 = 0; a5 < a3.length; ++a5) {
            this.Field149.Method489(a2[a5]);
            a3[a5].Method2851(this, this.Field149, a4, true);
        }
        this.Method1961(a, a3);
    }

    private void Method1961(Class264 a, Class264[] a2) {
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(171, 0, null, null);
                this.Method1914(0, a);
                a.Method2854().Field1448 |= 0x10;
                for (int a3 = 0; a3 < a2.length; ++a3) {
                    this.Method1914(0, a2[a3]);
                    a2[a3].Method2854().Field1448 |= 0x10;
                }
            } else {
                --this.Field179;
                this.Method1914(this.Field179, a);
                for (int a4 = 0; a4 < a2.length; ++a4) {
                    this.Method1914(this.Field179, a2[a4]);
                }
            }
            this.Method1879();
        }
    }

    @Override
    public void Method1951(String a, int a2) {
        this.Field169 = this.Field149.Field991;
        Class261 a3 = this.Field130.Method1507(a);
        if (this.Field178 != null) {
            if (this.Field175 == 0) {
                this.Field178.Field1455.Method2801(197, a2, this.Field130, a3);
            } else {
                this.Field179 += 1 - a2;
            }
        }
        this.Field149.Method488(197, a3.Field1426).Method485(a2);
    }

    @Override
    public Class148 Method1973(int a, Class31 a2, String a3, boolean a4) {
        Class138 a5 = new Class138();
        a = a & 0xFF0000FF | this.Field169 << 8;
        Class150.Method1324(a, a2, a5);
        a5.Method487(this.Field130.Method1506(a3)).Method487(0);
        Class150 a6 = new Class150(this.Field130, true, a5, a5, a5.Field991 - 2);
        a6.Field1016 = this.Field170;
        this.Field170 = a6;
        return a6;
    }

    @Override
    public void Method1960(Class264 a, Class264 a2, Class264 a3, String a4) {
        ++this.Field158;
        Class258 a5 = new Class258();
        a5.Field1410 = a;
        a5.Field1411 = a2;
        a5.Field1412 = a3;
        a5.Field1413 = a4;
        a5.Field1414 = this.Field130.Method1508(a4);
        if (this.Field160 == null) {
            this.Field159 = a5;
        } else {
            this.Field160.Field1415 = a5;
        }
        this.Field160 = a5;
    }

    @Override
    public Class148 Method1974(int a, Class31 a2, String a3, boolean a4) {
        Class138 a5 = new Class138();
        Class150.Method1324(a, a2, a5);
        a5.Method487(this.Field130.Method1506(a3)).Method487(0);
        Class150 a6 = new Class150(this.Field130, true, a5, a5, a5.Field991 - 2);
        a6.Field1016 = this.Field170;
        this.Field170 = a6;
        return a6;
    }

    @Override
    public void Method1843(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        block2: {
            char a7;
            int a8;
            if (this.Field166 == null) {
                this.Field166 = new Class138();
            }
            ++this.Field165;
            this.Field166.Method487(a4.Field1450).Method487(a5.Field1450 - a4.Field1450).Method487(this.Field130.Method1506(a)).Method487(this.Field130.Method1506(a3)).Method487(a6);
            if (this.Field164 == null) {
                this.Field164 = new Class138();
            }
            ++this.Field163;
            this.Field164.Method487(a4.Field1450).Method487(a5.Field1450 - a4.Field1450).Method487(this.Field130.Method1506(a)).Method487(this.Field130.Method1506(a2)).Method487(a6);
            if (this.Field175 == 2 || (a8 = a6 + ((a7 = a2.charAt(0)) == 'J' || a7 == 'D' ? 2 : 1)) <= this.Field151) break block2;
            this.Field151 = a8;
        }
    }

    @Override
    public Class148 Method1844(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        Class138 a8 = new Class138();
        a8.Method485(a >>> 24).Method487(a3.length);
        for (int a9 = 0; a9 < a3.length; ++a9) {
            a8.Method487(a3[a9].Field1450).Method487(a4[a9].Field1450 - a3[a9].Field1450).Method487(a5[a9]);
        }
        a8.Method485(0);
        a8.Method487(this.Field130.Method1506(a6)).Method487(0);
        Class150 a10 = new Class150(this.Field130, true, a8, a8, a8.Field991 - 2);
        a10.Field1016 = this.Field170;
        this.Field170 = a10;
        return a10;
    }

    @Override
    public void Method1981(int a, Class264 a2) {
        if (this.Field168 == null) {
            this.Field168 = new Class138();
        }
        ++this.Field167;
        this.Field168.Method487(a2.Field1450);
        this.Field168.Method487(a);
    }

    @Override
    public void Method1842(int a, int a2) {
        if (this.Field173) {
            this.Method1893();
        }
        if (this.Field175 == 0) {
            Class258 a3 = this.Field159;
            while (true) {
                Class264 a4 = a3.Field1410.Method2854();
                Class264 a5 = a3.Field1412.Method2854();
                Class264 a6 = a3.Field1411.Method2854();
                String a7 = a3.Field1413 == null ? "java/lang/Throwable" : a3.Field1413;
                int a8 = 0x1700000 | this.Field130.Method1526(a7);
                a5.Field1448 |= 0x10;
                while (a4 != a6) {
                    Class250 a9 = new Class250();
                    a9.Field1384 = a8;
                    a9.Field1385 = a5;
                    a9.Field1386 = a4.Field1457;
                    a4.Field1457 = a9;
                    a4 = a4.Field1456;
                }
                a3 = a3.Field1415;
            }
        }
        if (this.Field175 == 1) {
            Class258 a10 = this.Field159;
            while (true) {
                Class264 a11 = a10.Field1410;
                Class264 a12 = a10.Field1412;
                Class264 a13 = a10.Field1411;
                while (a11 != a13) {
                    Class250 a14 = new Class250();
                    a14.Field1384 = Integer.MAX_VALUE;
                    a14.Field1385 = a12;
                    if ((a11.Field1448 & 0x80) == 0) {
                        a14.Field1386 = a11.Field1457;
                        a11.Field1457 = a14;
                    } else {
                        a14.Field1386 = a11.Field1457.Field1386.Field1386;
                        a11.Field1457.Field1386.Field1386 = a14;
                    }
                    a11 = a11.Field1456;
                }
                a10 = a10.Field1415;
            }
        }
        this.Field150 = a;
        this.Field151 = a2;
    }

    @Override
    public void Method1653() {
    }

    private void Method1914(int a, Class264 a2) {
        Class250 a3 = new Class250();
        a3.Field1384 = a;
        a3.Field1385 = a2;
        a3.Field1386 = this.Field178.Field1457;
        this.Field178.Field1457 = a3;
    }

    private void Method1879() {
        if (this.Field175 == 0) {
            Class264 a = new Class264();
            a.Field1455 = new Class276();
            a.Field1455.Field1504 = a;
            a.Method2853(this, this.Field149.Field991, this.Field149.Field990);
            this.Field177.Field1456 = a;
            this.Field177 = a;
        } else {
            this.Field178.Field1454 = this.Field180;
        }
        this.Field178 = null;
    }

    private void Method1982(Class276 a) {
        int a2;
        int a3;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        int[] a7 = a.Field1505;
        int[] a8 = a.Field1506;
        for (a3 = 0; a3 < a7.length; ++a3) {
            a2 = a7[a3];
            if (a2 == 0x1000000) {
                ++a4;
            } else {
                a5 += a4 + 1;
                a4 = 0;
            }
            if (a2 != 0x1000004 && a2 != 0x1000003) continue;
            ++a3;
        }
        for (a3 = 0; a3 < a8.length; ++a3) {
            a2 = a8[a3];
            ++a6;
            if (a2 != 0x1000004 && a2 != 0x1000003) continue;
            ++a3;
        }
        int a9 = this.Method1983(a.Field1504.Field1450, a5, a6);
        a3 = 0;
        while (true) {
            a2 = a7[a3];
            this.Field157[a9++] = a2;
            if (a2 == 0x1000004 || a2 == 0x1000003) {
                ++a3;
            }
            ++a3;
            --a5;
        }
    }

    private void Method1882() {
        int a = this.Method1983(0, this.Field134.length() + 1, 0);
        if ((this.Field131 & 8) == 0) {
            this.Field157[a++] = (this.Field131 & 0x80000) == 0 ? 0x1700000 | this.Field130.Method1526(this.Field130.Field1093) : 6;
        }
        int a2 = 1;
        block8: while (true) {
            int a3 = a2;
            switch (this.Field134.charAt(a2++)) {
                case 'B': 
                case 'C': 
                case 'I': 
                case 'S': 
                case 'Z': {
                    this.Field157[a++] = 1;
                    continue block8;
                }
                case 'F': {
                    this.Field157[a++] = 2;
                    continue block8;
                }
                case 'J': {
                    this.Field157[a++] = 4;
                    continue block8;
                }
                case 'D': {
                    this.Field157[a++] = 3;
                    continue block8;
                }
                case '[': {
                    while (this.Field134.charAt(a2) == '[') {
                        ++a2;
                    }
                    if (this.Field134.charAt(a2) == 'L') {
                        ++a2;
                        while (this.Field134.charAt(a2) != ';') {
                            ++a2;
                        }
                    }
                    this.Field157[a++] = 0x1700000 | this.Field130.Method1526(this.Field134.substring(a3, ++a2));
                    continue block8;
                }
                case 'L': {
                    while (this.Field134.charAt(a2) != ';') {
                        ++a2;
                    }
                    this.Field157[a++] = 0x1700000 | this.Field130.Method1526(this.Field134.substring(a3 + 1, a2++));
                    continue block8;
                }
            }
            break;
        }
        this.Field157[1] = a - 3;
        this.Method1883();
    }

    private int Method1983(int a, int a2, int a3) {
        int a4 = 3 + a2 + a3;
        if (this.Field157 == null || this.Field157.length < a4) {
            this.Field157 = new int[a4];
        }
        this.Field157[0] = a;
        this.Field157[1] = a2;
        this.Field157[2] = a3;
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
        int a = this.Field157[1];
        int a2 = this.Field157[2];
        if ((this.Field130.Field1080 & 0xFFFF) < 50) {
            this.Field154.Method487(this.Field157[0]).Method487(a);
            this.Method1881(3, 3 + a);
            this.Field154.Method487(a2);
            this.Method1881(3 + a, 3 + a + a2);
            return;
        }
        int a3 = this.Field156[1];
        int a4 = 255;
        int a5 = 0;
        int a6 = this.Field153 == 0 ? this.Field157[0] : this.Field157[0] - this.Field156[0] - 1;
        a5 = a - a3;
        switch (a5) {
            case -3: 
            case -2: 
            case -1: {
                a4 = 248;
                a3 = a;
                break;
            }
            case 0: {
                a4 = a6 < 64 ? 0 : 251;
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                a4 = 252;
            }
        }
        if (a4 != 255) {
            int a7 = 3;
            for (int a8 = 0; a8 < a3; ++a8) {
                if (this.Field157[a7] != this.Field156[a7]) {
                    a4 = 255;
                    break;
                }
                ++a7;
            }
        }
        switch (a4) {
            case 0: {
                this.Field154.Method485(a6);
                break;
            }
            case 64: {
                this.Field154.Method485(64 + a6);
                this.Method1881(3 + a, 4 + a);
                break;
            }
            case 247: {
                this.Field154.Method485(247).Method487(a6);
                this.Method1881(3 + a, 4 + a);
                break;
            }
            case 251: {
                this.Field154.Method485(251).Method487(a6);
                break;
            }
            case 248: {
                this.Field154.Method485(251 + a5).Method487(a6);
                break;
            }
            case 252: {
                this.Field154.Method485(251 + a5).Method487(a6);
                this.Method1881(3 + a3, 3 + a);
                break;
            }
            default: {
                this.Field154.Method485(255).Method487(a6).Method487(a);
                this.Method1881(3, 3 + a);
                this.Field154.Method487(a2);
                this.Method1881(3 + a, 3 + a + a2);
            }
        }
    }

    private void Method1881(int a, int a2) {
        block4: for (int a3 = a; a3 < a2; ++a3) {
            int a4 = this.Field157[a3];
            int a5 = a4 & 0xF0000000;
            int a6 = a4 & 0xFFFFF;
            switch (a4 & 0xFF00000) {
                case 0x1700000: {
                    this.Field154.Method485(7).Method487(this.Field130.Method1508(this.Field130.Field1089[a6].Field1430));
                    continue block4;
                }
                case 0x1800000: {
                    this.Field154.Method485(8).Method487(this.Field130.Field1089[a6].Field1428);
                    continue block4;
                }
                default: {
                    this.Field154.Method485(a6);
                    continue block4;
                }
            }
        }
    }

    private void Method1965(Object a) {
        if (a instanceof String) {
            this.Field154.Method485(7).Method487(this.Field130.Method1508((String)a));
        } else if (a instanceof Integer) {
            this.Field154.Method485((Integer)a);
        } else {
            this.Field154.Method485(8).Method487(((Class264)a).Field1450);
        }
    }

    final int Method1984() {
        int a;
        if (this.Field136 != 0) {
            return 6 + this.Field137;
        }
        int a2 = 8;
        if (this.Field149.Field991 > 0) {
            if (this.Field149.Field991 > 65536) {
                throw new RuntimeException("Method code too large!");
            }
            this.Field130.Method1506("Code");
            a2 += 18 + this.Field149.Field991 + 8 * this.Field158;
            if (this.Field164 != null) {
                this.Field130.Method1506("LocalVariableTable");
                a2 += 8 + this.Field164.Field991;
            }
            if (this.Field166 != null) {
                this.Field130.Method1506("LocalVariableTypeTable");
                a2 += 8 + this.Field166.Field991;
            }
            if (this.Field168 != null) {
                this.Field130.Method1506("LineNumberTable");
                a2 += 8 + this.Field168.Field991;
            }
            if (this.Field154 != null) {
                a = (this.Field130.Field1080 & 0xFFFF) >= 50 ? 1 : 0;
                this.Field130.Method1506("StackMapTable");
                a2 += 8 + this.Field154.Field991;
            }
            if (this.Field170 != null) {
                this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
                a2 += 8 + this.Field170.Method1321();
            }
            if (this.Field171 != null) {
                this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
                a2 += 8 + this.Field171.Method1321();
            }
            if (this.Field172 != null) {
                a2 += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
            }
        }
        if (this.Field138 > 0) {
            this.Field130.Method1506("Exceptions");
            a2 += 8 + 2 * this.Field138;
        }
        if ((this.Field131 & 0x1000) != 0 && ((this.Field130.Field1080 & 0xFFFF) < 49 || (this.Field131 & 0x40000) != 0)) {
            this.Field130.Method1506("Synthetic");
            a2 += 6;
        }
        if ((this.Field131 & 0x20000) != 0) {
            this.Field130.Method1506("Deprecated");
            a2 += 6;
        }
        if (this.Field135 != null) {
            this.Field130.Method1506("Signature");
            this.Field130.Method1506(this.Field135);
            a2 += 8;
        }
        if (this.Field162 != null) {
            this.Field130.Method1506("MethodParameters");
            a2 += 7 + this.Field162.Field991;
        }
        if (this.Field140 != null) {
            this.Field130.Method1506("AnnotationDefault");
            a2 += 6 + this.Field140.Field991;
        }
        if (this.Field141 != null) {
            this.Field130.Method1506("RuntimeVisibleAnnotations");
            a2 += 8 + this.Field141.Method1321();
        }
        if (this.Field142 != null) {
            this.Field130.Method1506("RuntimeInvisibleAnnotations");
            a2 += 8 + this.Field142.Method1321();
        }
        if (this.Field143 != null) {
            this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
            a2 += 8 + this.Field143.Method1321();
        }
        if (this.Field144 != null) {
            this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
            a2 += 8 + this.Field144.Method1321();
        }
        if (this.Field145 != null) {
            this.Field130.Method1506("RuntimeVisibleParameterAnnotations");
            a2 += 7 + 2 * (this.Field145.length - this.Field147);
            for (a = this.Field145.length - 1; a >= this.Field147; --a) {
                a2 += this.Field145[a] == null ? 0 : this.Field145[a].Method1321();
            }
        }
        if (this.Field146 != null) {
            this.Field130.Method1506("RuntimeInvisibleParameterAnnotations");
            a2 += 7 + 2 * (this.Field146.length - this.Field147);
            for (a = this.Field146.length - 1; a >= this.Field147; --a) {
                a2 += this.Field146[a] == null ? 0 : this.Field146[a].Method1321();
            }
        }
        if (this.Field148 != null) {
            a2 += this.Field148.Method474(this.Field130, null, 0, -1, -1);
        }
        return a2;
    }

    final void Method1985(Class138 a) {
        block52: {
            int a2;
            int a3 = 64;
            int a4 = 0xE0000 | (this.Field131 & 0x40000) / 64;
            a.Method487(this.Field131 & ~a4).Method487(this.Field132).Method487(this.Field133);
            if (this.Field136 != 0) {
                a.Method493(this.Field130.Field1079.Field1029, this.Field136, this.Field137);
                return;
            }
            int a5 = 0;
            if (this.Field149.Field991 > 0) {
                ++a5;
            }
            if (this.Field138 > 0) {
                ++a5;
            }
            if ((this.Field131 & 0x1000) != 0 && ((this.Field130.Field1080 & 0xFFFF) < 49 || (this.Field131 & 0x40000) != 0)) {
                ++a5;
            }
            if ((this.Field131 & 0x20000) != 0) {
                ++a5;
            }
            if (this.Field135 != null) {
                ++a5;
            }
            if (this.Field162 != null) {
                ++a5;
            }
            if (this.Field140 != null) {
                ++a5;
            }
            if (this.Field141 != null) {
                ++a5;
            }
            if (this.Field142 != null) {
                ++a5;
            }
            if (this.Field143 != null) {
                ++a5;
            }
            if (this.Field144 != null) {
                ++a5;
            }
            if (this.Field145 != null) {
                ++a5;
            }
            if (this.Field146 != null) {
                ++a5;
            }
            if (this.Field148 != null) {
                a5 += this.Field148.Method473();
            }
            a.Method487(a5);
            if (this.Field149.Field991 > 0) {
                a2 = 12 + this.Field149.Field991 + 8 * this.Field158;
                if (this.Field164 != null) {
                    a2 += 8 + this.Field164.Field991;
                }
                if (this.Field166 != null) {
                    a2 += 8 + this.Field166.Field991;
                }
                if (this.Field168 != null) {
                    a2 += 8 + this.Field168.Field991;
                }
                if (this.Field154 != null) {
                    a2 += 8 + this.Field154.Field991;
                }
                if (this.Field170 != null) {
                    a2 += 8 + this.Field170.Method1321();
                }
                if (this.Field171 != null) {
                    a2 += 8 + this.Field171.Method1321();
                }
                if (this.Field172 != null) {
                    a2 += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
                }
                a.Method487(this.Field130.Method1506("Code")).Method489(a2);
                a.Method487(this.Field150).Method487(this.Field151);
                a.Method489(this.Field149.Field991).Method493(this.Field149.Field990, 0, this.Field149.Field991);
                a.Method487(this.Field158);
                if (this.Field158 > 0) {
                    Class258 a6 = this.Field159;
                    while (true) {
                        a.Method487(a6.Field1410.Field1450).Method487(a6.Field1411.Field1450).Method487(a6.Field1412.Field1450).Method487(a6.Field1414);
                        a6 = a6.Field1415;
                    }
                }
                a5 = 0;
                if (this.Field164 != null) {
                    ++a5;
                }
                if (this.Field166 != null) {
                    ++a5;
                }
                if (this.Field168 != null) {
                    ++a5;
                }
                if (this.Field154 != null) {
                    ++a5;
                }
                if (this.Field170 != null) {
                    ++a5;
                }
                if (this.Field171 != null) {
                    ++a5;
                }
                if (this.Field172 != null) {
                    a5 += this.Field172.Method473();
                }
                a.Method487(a5);
                if (this.Field164 != null) {
                    a.Method487(this.Field130.Method1506("LocalVariableTable"));
                    a.Method489(this.Field164.Field991 + 2).Method487(this.Field163);
                    a.Method493(this.Field164.Field990, 0, this.Field164.Field991);
                }
                if (this.Field166 != null) {
                    a.Method487(this.Field130.Method1506("LocalVariableTypeTable"));
                    a.Method489(this.Field166.Field991 + 2).Method487(this.Field165);
                    a.Method493(this.Field166.Field990, 0, this.Field166.Field991);
                }
                if (this.Field168 != null) {
                    a.Method487(this.Field130.Method1506("LineNumberTable"));
                    a.Method489(this.Field168.Field991 + 2).Method487(this.Field167);
                    a.Method493(this.Field168.Field990, 0, this.Field168.Field991);
                }
                if (this.Field154 != null) {
                    boolean a7 = (this.Field130.Field1080 & 0xFFFF) >= 50;
                    a.Method487(this.Field130.Method1506("StackMapTable"));
                    a.Method489(this.Field154.Field991 + 2).Method487(this.Field153);
                    a.Method493(this.Field154.Field990, 0, this.Field154.Field991);
                }
                if (this.Field170 != null) {
                    a.Method487(this.Field130.Method1506("RuntimeVisibleTypeAnnotations"));
                    this.Field170.Method1322(a);
                }
                if (this.Field171 != null) {
                    a.Method487(this.Field130.Method1506("RuntimeInvisibleTypeAnnotations"));
                    this.Field171.Method1322(a);
                }
                if (this.Field172 != null) {
                    this.Field172.Method475(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field151, this.Field150, a);
                }
            }
            if (this.Field138 > 0) {
                a.Method487(this.Field130.Method1506("Exceptions")).Method489(2 * this.Field138 + 2);
                a.Method487(this.Field138);
                for (a2 = 0; a2 < this.Field138; ++a2) {
                    a.Method487(this.Field139[a2]);
                }
            }
            if ((this.Field131 & 0x1000) != 0 && ((this.Field130.Field1080 & 0xFFFF) < 49 || (this.Field131 & 0x40000) != 0)) {
                a.Method487(this.Field130.Method1506("Synthetic")).Method489(0);
            }
            if ((this.Field131 & 0x20000) != 0) {
                a.Method487(this.Field130.Method1506("Deprecated")).Method489(0);
            }
            if (this.Field135 != null) {
                a.Method487(this.Field130.Method1506("Signature")).Method489(2).Method487(this.Field130.Method1506(this.Field135));
            }
            if (this.Field162 != null) {
                a.Method487(this.Field130.Method1506("MethodParameters"));
                a.Method489(this.Field162.Field991 + 1).Method485(this.Field161);
                a.Method493(this.Field162.Field990, 0, this.Field162.Field991);
            }
            if (this.Field140 != null) {
                a.Method487(this.Field130.Method1506("AnnotationDefault"));
                a.Method489(this.Field140.Field991);
                a.Method493(this.Field140.Field990, 0, this.Field140.Field991);
            }
            if (this.Field141 != null) {
                a.Method487(this.Field130.Method1506("RuntimeVisibleAnnotations"));
                this.Field141.Method1322(a);
            }
            if (this.Field142 != null) {
                a.Method487(this.Field130.Method1506("RuntimeInvisibleAnnotations"));
                this.Field142.Method1322(a);
            }
            if (this.Field143 != null) {
                a.Method487(this.Field130.Method1506("RuntimeVisibleTypeAnnotations"));
                this.Field143.Method1322(a);
            }
            if (this.Field144 != null) {
                a.Method487(this.Field130.Method1506("RuntimeInvisibleTypeAnnotations"));
                this.Field144.Method1322(a);
            }
            if (this.Field145 != null) {
                a.Method487(this.Field130.Method1506("RuntimeVisibleParameterAnnotations"));
                Class150.Method1323(this.Field145, this.Field147, a);
            }
            if (this.Field146 != null) {
                a.Method487(this.Field130.Method1506("RuntimeInvisibleParameterAnnotations"));
                Class150.Method1323(this.Field146, this.Field147, a);
            }
            if (this.Field148 == null) break block52;
            this.Field148.Method475(this.Field130, null, 0, -1, -1, a);
        }
    }

    private void Method1893() {
        int a;
        Object[] a2;
        Object a3;
        int[] a4;
        int a5;
        int a6;
        int a7;
        byte[] a8;
        int a9;
        byte[] byArray = this.Field149.Field990;
        int[] a10 = new int[]{};
        int[] nArray = new int[]{};
        String[] a11 = Class267.Method2862();
        boolean[] a12 = new boolean[this.Field149.Field991];
        int a13 = 3;
        if (a13 == 3) {
            a13 = 2;
        }
        if ((a9 = 0) < a8.length) {
            int a14 = a8[a9] & 0xFF;
            a7 = 0;
            switch (Class169.Field1059[a14]) {
                case 0: 
                case 4: {
                    ++a9;
                }
                case 9: {
                    if (a14 > 201) {
                        a14 = a14 < 218 ? a14 - 49 : a14 - 20;
                        a6 = a9 + Class9.Method1986(a8, a9 + 1);
                    }
                    if (!((a5 = Class9.Method1990(a10, a4, a9, a6 = a9 + Class9.Method1987(a8, a9 + 1))) >= Short.MIN_VALUE && a5 <= Short.MAX_VALUE || a12[a9])) {
                        if (a14 == 167 || a14 == 168) {
                            a7 = 2;
                        }
                        a7 = 5;
                        a12[a9] = true;
                    }
                    a9 += 3;
                }
                case 10: {
                    a9 += 5;
                }
                case 14: {
                    if (a13 == 1) {
                        a5 = Class9.Method1990(a10, a4, 0, a9);
                        a7 = -(a5 & 3);
                    }
                    if (!a12[a9]) {
                        a7 = a9 & 3;
                        a12[a9] = true;
                    }
                    a9 = a9 + 4 - (a9 & 3);
                    a9 += 4 * (Class9.Method1988(a8, a9 + 8) - Class9.Method1988(a8, a9 + 4) + 1) + 12;
                }
                case 15: {
                    if (a13 == 1) {
                        a5 = Class9.Method1990(a10, a4, 0, a9);
                        a7 = -(a5 & 3);
                    }
                    if (!a12[a9]) {
                        a7 = a9 & 3;
                        a12[a9] = true;
                    }
                    a9 = a9 + 4 - (a9 & 3);
                    a9 += 8 * Class9.Method1988(a8, a9 + 4) + 8;
                }
                case 17: {
                    a14 = a8[a9 + 1] & 0xFF;
                    if (a14 == 132) {
                        a9 += 6;
                    }
                    a9 += 4;
                }
                case 1: 
                case 3: 
                case 11: {
                    a9 += 2;
                }
                case 2: 
                case 5: 
                case 6: 
                case 12: 
                case 13: {
                    a9 += 3;
                }
                case 7: 
                case 8: {
                    a9 += 5;
                    break;
                }
            }
            a9 += 4;
            a3 = new int[a10.length + 1];
            a2 = new int[a4.length + 1];
            System.arraycopy((Object)a10, (int)0, (Object)a3, (int)0, (int)a10.length);
            System.arraycopy((Object)a4, (int)0, (Object)a2, (int)0, (int)a4.length);
            a3[a10.length] = a9;
            a2[a4.length] = a7;
            a10 = a3;
            a4 = a2;
            a13 = 3;
        }
        if (a13 < 3) {
            --a13;
        }
        Class138 a15 = new Class138(this.Field149.Field991);
        a9 = 0;
        if (a9 < this.Field149.Field991) {
            a7 = a8[a9] & 0xFF;
            switch (Class169.Field1059[a7]) {
                case 0: 
                case 4: {
                    a15.Method485(a7);
                    ++a9;
                }
                case 9: {
                    if (a7 > 201) {
                        a7 = a7 < 218 ? a7 - 49 : a7 - 20;
                        a6 = a9 + Class9.Method1986(a8, a9 + 1);
                    }
                    a6 = a9 + Class9.Method1987(a8, a9 + 1);
                    a5 = Class9.Method1990(a10, a4, a9, a6);
                    if (a12[a9]) {
                        if (a7 == 167) {
                            a15.Method485(200);
                        }
                        if (a7 == 168) {
                            a15.Method485(201);
                        }
                        a15.Method485(a7 <= 166 ? (a7 + 1 ^ 1) - 1 : a7 ^ 1);
                        a15.Method487(8);
                        a15.Method485(200);
                        a15.Method489(a5 -= 3);
                    }
                    a15.Method485(a7);
                    a15.Method487(a5);
                    a9 += 3;
                }
                case 10: {
                    a6 = a9 + Class9.Method1988(a8, a9 + 1);
                    a5 = Class9.Method1990(a10, a4, a9, a6);
                    a15.Method485(a7);
                    a15.Method489(a5);
                    a9 += 5;
                }
                case 14: {
                    int a16 = a9;
                    a9 = a9 + 4 - (a16 & 3);
                    a15.Method485(170);
                    a15.Method493(null, 0, (4 - a15.Field991 % 4) % 4);
                    a6 = a16 + Class9.Method1988(a8, a9);
                    a5 = Class9.Method1990(a10, a4, a16, a6);
                    a15.Method489(a5);
                    int a17 = Class9.Method1988(a8, a9 += 4);
                    a15.Method489(a17);
                    a17 = Class9.Method1988(a8, a9 += 4) - a17 + 1;
                    a15.Method489(Class9.Method1988(a8, (a9 += 4) - 4));
                    a6 = a16 + Class9.Method1988(a8, a9);
                    a9 += 4;
                    a5 = Class9.Method1990(a10, a4, a16, a6);
                    a15.Method489(a5);
                    --a17;
                }
                case 15: {
                    int a16 = a9;
                    a9 = a9 + 4 - (a16 & 3);
                    a15.Method485(171);
                    a15.Method493(null, 0, (4 - a15.Field991 % 4) % 4);
                    a6 = a16 + Class9.Method1988(a8, a9);
                    a5 = Class9.Method1990(a10, a4, a16, a6);
                    a15.Method489(a5);
                    int a17 = Class9.Method1988(a8, a9 += 4);
                    a15.Method489(a17);
                    a15.Method489(Class9.Method1988(a8, a9 += 4));
                    a6 = a16 + Class9.Method1988(a8, a9 += 4);
                    a9 += 4;
                    a5 = Class9.Method1990(a10, a4, a16, a6);
                    a15.Method489(a5);
                    --a17;
                }
                case 17: {
                    a7 = a8[a9 + 1] & 0xFF;
                    if (a7 == 132) {
                        a15.Method493(a8, a9, 6);
                        a9 += 6;
                    }
                    a15.Method493(a8, a9, 4);
                    a9 += 4;
                }
                case 1: 
                case 3: 
                case 11: {
                    a15.Method493(a8, a9, 2);
                    a9 += 2;
                }
                case 2: 
                case 5: 
                case 6: 
                case 12: 
                case 13: {
                    a15.Method493(a8, a9, 3);
                    a9 += 3;
                }
                case 7: 
                case 8: {
                    a15.Method493(a8, a9, 5);
                    a9 += 5;
                    break;
                }
            }
            a15.Method493(a8, a9, 4);
            a9 += 4;
        }
        if (this.Field175 == 0) {
            Class264 a18 = this.Field176;
            a9 = a18.Field1450 - 3;
            if (a12[a9]) {
                a18.Field1448 |= 0x10;
            }
            Class9.Method1991(a10, a4, a18);
            a18 = a18.Field1456;
            a = 0;
            if (a < this.Field130.Field1089.length) {
                a3 = this.Field130.Field1089[a];
                if (((Class261)a3).Field1427 == 31) {
                    ((Class261)a3).Field1428 = Class9.Method1990(a10, a4, 0, ((Class261)a3).Field1428);
                }
                ++a;
            }
        }
        if (this.Field153 > 0) {
            this.Field130.Field1117 = true;
        }
        Class258 a19 = this.Field159;
        Class9.Method1991(a10, a4, a19.Field1410);
        Class9.Method1991(a10, a4, a19.Field1411);
        Class9.Method1991(a10, a4, a19.Field1412);
        a19 = a19.Field1415;
        a = 0;
        if (a < 2) {
            a3 = this.Field164;
            a8 = ((Class138)a3).Field990;
            a9 = 0;
            if (a9 < ((Class138)a3).Field991) {
                a6 = Class9.Method1986(a8, a9);
                a5 = Class9.Method1990(a10, a4, 0, a6);
                Class9.Method1989(a8, a9, a5);
                a5 = Class9.Method1990(a10, a4, 0, a6 += Class9.Method1986(a8, a9 + 2)) - a5;
                Class9.Method1989(a8, a9 + 2, a5);
                a9 += 10;
            }
            ++a;
        }
        if (this.Field168 != null) {
            a8 = this.Field168.Field990;
            a9 = 0;
            if (a9 < this.Field168.Field991) {
                Class9.Method1989(a8, a9, Class9.Method1990(a10, a4, 0, Class9.Method1986(a8, a9)));
                a9 += 4;
            }
        }
        a3 = this.Field172;
        a2 = ((Class136)a3).Method470();
        a = a2.length - 1;
        Class9.Method1991(a10, a4, (Class264)a2[a]);
        --a;
        a3 = ((Class136)a3).Field989;
        this.Field149 = a15;
    }

    static int Method1986(byte[] a, int a2) {
        return (a[a2] & 0xFF) << 8 | a[a2 + 1] & 0xFF;
    }

    static short Method1987(byte[] a, int a2) {
        return (short)((a[a2] & 0xFF) << 8 | a[a2 + 1] & 0xFF);
    }

    static int Method1988(byte[] a, int a2) {
        return (a[a2] & 0xFF) << 24 | (a[a2 + 1] & 0xFF) << 16 | (a[a2 + 2] & 0xFF) << 8 | a[a2 + 3] & 0xFF;
    }

    static void Method1989(byte[] a, int a2, int a3) {
        a[a2] = (byte)(a3 >>> 8);
        a[a2 + 1] = (byte)a3;
    }

    static int Method1990(int[] a, int[] a2, int a3, int a4) {
        int a5 = a4 - a3;
        for (int a6 = 0; a6 < a.length; ++a6) {
            if (a3 < a[a6] && a[a6] <= a4) {
                a5 += a2[a6];
                continue;
            }
            if (a4 >= a[a6] || a[a6] > a3) continue;
            a5 -= a2[a6];
        }
        return a5;
    }

    static void Method1991(int[] a, int[] a2, Class264 a3) {
        block0: {
            if ((a3.Field1448 & 4) != 0) break block0;
            a3.Field1450 = Class9.Method1990(a, a2, 0, a3.Field1450);
            a3.Field1448 |= 4;
        }
    }

    private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}