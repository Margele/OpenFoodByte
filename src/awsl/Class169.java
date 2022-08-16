/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
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
import awsl.Class165;
import awsl.Class167;
import awsl.Class253;
import awsl.Class256;
import awsl.Class261;
import awsl.Class267;
import awsl.Class279;
import awsl.Class31;
import awsl.Class9;
import obfuscate.a;
import obfuscate.b;

public class Class169
extends Class167 {
    public static final int Field1037 = 1;
    public static final int Field1038 = 2;
    static final int Field1039 = 262144;
    static final int Field1040 = 64;
    static final int Field1041 = 0;
    static final int Field1042 = 1;
    static final int Field1043 = 2;
    static final int Field1044 = 3;
    static final int Field1045 = 4;
    static final int Field1046 = 5;
    static final int Field1047 = 6;
    static final int Field1048 = 7;
    static final int Field1049 = 8;
    static final int Field1050 = 9;
    static final int Field1051 = 10;
    static final int Field1052 = 11;
    static final int Field1053 = 12;
    static final int Field1054 = 13;
    static final int Field1055 = 14;
    static final int Field1056 = 15;
    static final int Field1057 = 16;
    static final int Field1058 = 17;
    static final byte[] Field1059;
    static final int Field1060 = 7;
    static final int Field1061 = 9;
    static final int Field1062 = 10;
    static final int Field1063 = 11;
    static final int Field1064 = 8;
    static final int Field1065 = 3;
    static final int Field1066 = 4;
    static final int Field1067 = 5;
    static final int Field1068 = 6;
    static final int Field1069 = 12;
    static final int Field1070 = 1;
    static final int Field1071 = 16;
    static final int Field1072 = 15;
    static final int Field1073 = 18;
    static final int Field1074 = 20;
    static final int Field1075 = 30;
    static final int Field1076 = 31;
    static final int Field1077 = 32;
    static final int Field1078 = 33;
    Class165 Field1079;
    int Field1080;
    int Field1081 = 1;
    final Class138 Field1082 = new Class138();
    Class261[] Field1083 = new Class261[256];
    int Field1084 = (int)(0.75 * (double)this.Field1083.length);
    final Class261 Field1085 = new Class261();
    final Class261 Field1086 = new Class261();
    final Class261 Field1087 = new Class261();
    final Class261 Field1088 = new Class261();
    Class261[] Field1089;
    private short Field1090;
    private int Field1091;
    private int Field1092;
    String Field1093;
    private int Field1094;
    private int Field1095;
    private int Field1096;
    private int[] Field1097;
    private int Field1098;
    private Class138 Field1099;
    private int Field1100;
    private int Field1101;
    private Class150 Field1102;
    private Class150 Field1103;
    private Class150 Field1104;
    private Class150 Field1105;
    private Class136 Field1106;
    private int Field1107;
    private Class138 Field1108;
    int Field1109;
    Class138 Field1110;
    Class256 Field1111;
    Class256 Field1112;
    Class9 Field1113;
    Class9 Field1114;
    private boolean Field1115;
    private boolean Field1116;
    boolean Field1117;
    private static final String[] Field1118;
    private static final String[] Field1119;

    public Class169(int a) {
        super(327680);
        this.Field1115 = (a & 1) != 0;
        this.Field1116 = (a & 2) != 0;
    }

    public Class169(Class165 a, int a2) {
        this(a2);
        a.Method1467(this);
        this.Field1079 = a;
    }

    @Override
    public final void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field1080 = a;
        this.Field1091 = a2;
        this.Field1092 = this.Method1508(a3);
        this.Field1093 = a3;
        this.Field1094 = this.Method1506(a4);
        this.Field1095 = 0;
        if (a6.length > 0) {
            this.Field1096 = a6.length;
            this.Field1097 = new int[this.Field1096];
            for (int a7 = 0; a7 < this.Field1096; ++a7) {
                this.Field1097[a7] = this.Method1508(a6[a7]);
            }
        }
    }

    @Override
    public final void Method1458(String a, String a2) {
        this.Field1098 = this.Method1506(a);
        this.Field1099 = new Class138().Method492(a2, 0, Integer.MAX_VALUE);
    }

    @Override
    public final void Method1453(String a, String a2, String a3) {
        this.Field1100 = this.Method1508(a);
        this.Field1101 = this.Method1524(a2, a3);
    }

    @Override
    public final Class148 Method1448(String a, boolean a2) {
        Class138 a3 = new Class138();
        a3.Method487(this.Method1506(a)).Method487(0);
        Class150 a4 = new Class150(this, true, a3, a3, 2);
        a4.Field1016 = this.Field1102;
        this.Field1102 = a4;
        return a4;
    }

    @Override
    public final Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        Class138 a5 = new Class138();
        Class150.Method1324(a, a2, a5);
        a5.Method487(this.Method1506(a3)).Method487(0);
        Class150 a6 = new Class150(this, true, a5, a5, a5.Field991 - 2);
        a6.Field1016 = this.Field1104;
        this.Field1104 = a6;
        return a6;
    }

    @Override
    public final void Method1459(Class136 a) {
        a.Field989 = this.Field1106;
        this.Field1106 = a;
    }

    @Override
    public final void Method1452(String a, String a2, String a3, int a4) {
        if (this.Field1108 == null) {
            this.Field1108 = new Class138();
        }
        Class261 a5 = this.Method1507(a);
        if (a5.Field1428 == 0) {
            ++this.Field1107;
            this.Field1108.Method487(a5.Field1426);
            this.Field1108.Method487(0);
            this.Field1108.Method487(0);
            this.Field1108.Method487(a4);
            a5.Field1428 = this.Field1107;
        }
    }

    @Override
    public final Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        return new Class256(this, a, a2, a3, a4, a5);
    }

    @Override
    public final Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        return new Class9(this, a, a2, a3, a4, a5, this.Field1115, this.Field1116);
    }

    @Override
    public final void Method1460() {
    }

    public byte[] Method1503() {
        String[] a2 = Class267.Method2862();
        if (this.Field1081 > 65535) {
            throw new RuntimeException(Class169.Method1536(31578, -554));
        }
        int a3 = 24 + 2 * this.Field1096;
        int a4 = 0;
        Class256 a5 = this.Field1111;
        ++a4;
        a3 += a5.Method2251();
        a5 = (Class256)a5.Field1390;
        a.trash(new String[2]);
        int a6 = 0;
        Class9 a7 = this.Field1113;
        ++a6;
        a3 += a7.Method1984();
        a7 = (Class9)a7.Field1460;
        int a8 = 0;
        if (this.Field1110 != null) {
            ++a8;
            a3 += 8 + this.Field1110.Field991;
            this.Method1506(Class169.Method1536(31580, -13909));
        }
        if (this.Field1094 != 0) {
            ++a8;
            a3 += 8;
            this.Method1506(Class169.Method1536(31560, 15372));
        }
        if (this.Field1098 != 0) {
            ++a8;
            a3 += 8;
            this.Method1506(Class169.Method1536(31559, 25966));
        }
        if (this.Field1099 != null) {
            ++a8;
            a3 += this.Field1099.Field991 + 6;
            this.Method1506(Class169.Method1536(31568, -31638));
        }
        if (this.Field1100 != 0) {
            ++a8;
            a3 += 10;
            this.Method1506(Class169.Method1536(31562, -17856));
        }
        if ((this.Field1091 & 0x20000) != 0) {
            ++a8;
            a3 += 6;
            this.Method1506(Class169.Method1536(31574, -23373));
        }
        if ((this.Field1091 & 0x1000) != 0 && ((this.Field1080 & 0xFFFF) < 49 || (this.Field1091 & 0x40000) != 0)) {
            ++a8;
            a3 += 6;
            this.Method1506(Class169.Method1536(31564, 12875));
        }
        if (this.Field1108 != null) {
            ++a8;
            a3 += 8 + this.Field1108.Field991;
            this.Method1506(Class169.Method1536(31561, 10662));
        }
        if (this.Field1102 != null) {
            ++a8;
            a3 += 8 + this.Field1102.Method1321();
            this.Method1506(Class169.Method1536(31573, 14489));
        }
        if (this.Field1103 != null) {
            ++a8;
            a3 += 8 + this.Field1103.Method1321();
            this.Method1506(Class169.Method1536(31556, -12453));
        }
        if (this.Field1104 != null) {
            ++a8;
            a3 += 8 + this.Field1104.Method1321();
            this.Method1506(Class169.Method1536(31582, -24346));
        }
        if (this.Field1105 != null) {
            ++a8;
            a3 += 8 + this.Field1105.Method1321();
            this.Method1506(Class169.Method1536(31557, -21908));
        }
        if (this.Field1106 != null) {
            a8 += this.Field1106.Method473();
            a3 += this.Field1106.Method474(this, null, 0, -1, -1);
        }
        Class138 a9 = new Class138(a3 += this.Field1082.Field991);
        a9.Method489(-889275714).Method489(this.Field1080);
        a9.Method487(this.Field1081).Method493(this.Field1082.Field990, 0, this.Field1082.Field991);
        int a10 = 0x60000 | (this.Field1091 & 0x40000) / 64;
        a9.Method487(this.Field1091 & ~a10).Method487(this.Field1092).Method487(this.Field1095);
        a9.Method487(this.Field1096);
        int a11 = 0;
        if (a11 < this.Field1096) {
            a9.Method487(this.Field1097[a11]);
            ++a11;
        }
        a9.Method487(a4);
        a5 = this.Field1111;
        a5.Method2252(a9);
        a5 = (Class256)a5.Field1390;
        a9.Method487(a6);
        a7 = this.Field1113;
        a7.Method1985(a9);
        a7 = (Class9)a7.Field1460;
        a9.Method487(a8);
        if (this.Field1110 != null) {
            a9.Method487(this.Method1506(Class169.Method1536(31583, 9091)));
            a9.Method489(this.Field1110.Field991 + 2).Method487(this.Field1109);
            a9.Method493(this.Field1110.Field990, 0, this.Field1110.Field991);
        }
        if (this.Field1094 != 0) {
            a9.Method487(this.Method1506(Class169.Method1536(31558, 21563))).Method489(2).Method487(this.Field1094);
        }
        if (this.Field1098 != 0) {
            a9.Method487(this.Method1506(Class169.Method1536(31565, -13598))).Method489(2).Method487(this.Field1098);
        }
        if (this.Field1099 != null) {
            a11 = this.Field1099.Field991;
            a9.Method487(this.Method1506(Class169.Method1536(31570, -10643))).Method489(a11);
            a9.Method493(this.Field1099.Field990, 0, a11);
        }
        if (this.Field1100 != 0) {
            a9.Method487(this.Method1506(Class169.Method1536(31572, -593))).Method489(4);
            a9.Method487(this.Field1100).Method487(this.Field1101);
        }
        if ((this.Field1091 & 0x20000) != 0) {
            a9.Method487(this.Method1506(Class169.Method1536(31581, 6334))).Method489(0);
        }
        if ((this.Field1091 & 0x1000) != 0 && ((this.Field1080 & 0xFFFF) < 49 || (this.Field1091 & 0x40000) != 0)) {
            a9.Method487(this.Method1506(Class169.Method1536(31579, 19320))).Method489(0);
        }
        if (this.Field1108 != null) {
            a9.Method487(this.Method1506(Class169.Method1536(31566, -32171)));
            a9.Method489(this.Field1108.Field991 + 2).Method487(this.Field1107);
            a9.Method493(this.Field1108.Field990, 0, this.Field1108.Field991);
        }
        if (this.Field1102 != null) {
            a9.Method487(this.Method1506(Class169.Method1536(31563, 26273)));
            this.Field1102.Method1322(a9);
        }
        if (this.Field1103 != null) {
            a9.Method487(this.Method1506(Class169.Method1536(31567, -12090)));
            this.Field1103.Method1322(a9);
        }
        if (this.Field1104 != null) {
            a9.Method487(this.Method1506(Class169.Method1536(31576, 6279)));
            this.Field1104.Method1322(a9);
        }
        if (this.Field1105 != null) {
            a9.Method487(this.Method1506(Class169.Method1536(31569, -23860)));
            this.Field1105.Method1322(a9);
        }
        if (this.Field1106 != null) {
            this.Field1106.Method475(this, null, 0, -1, -1, a9);
        }
        if (this.Field1117) {
            this.Field1102 = null;
            this.Field1103 = null;
            this.Field1106 = null;
            this.Field1107 = 0;
            this.Field1108 = null;
            this.Field1109 = 0;
            this.Field1110 = null;
            this.Field1111 = null;
            this.Field1112 = null;
            this.Field1113 = null;
            this.Field1114 = null;
            this.Field1115 = false;
            this.Field1116 = true;
            this.Field1117 = false;
            new Class165(a9.Field990).Method1470(this, 4);
            return this.Method1503();
        }
        return a9.Field990;
    }

    Class261 Method1504(Object a2) {
        if (a2 instanceof Integer) {
            int a3 = (Integer)a2;
            return this.Method1519(a3);
        }
        if (a2 instanceof Byte) {
            int a4 = ((Byte)a2).intValue();
            return this.Method1519(a4);
        }
        if (a2 instanceof Character) {
            char a5 = ((Character)a2).charValue();
            return this.Method1519(a5);
        }
        if (a2 instanceof Short) {
            int a6 = ((Short)a2).intValue();
            return this.Method1519(a6);
        }
        if (a2 instanceof Boolean) {
            int a7 = (Boolean)a2 != false ? 1 : 0;
            return this.Method1519(a7);
        }
        if (a2 instanceof Float) {
            float a8 = ((Float)a2).floatValue();
            return this.Method1520(a8);
        }
        if (a2 instanceof Long) {
            long a9 = (Long)a2;
            return this.Method1521(a9);
        }
        if (a2 instanceof Double) {
            double a10 = (Double)a2;
            return this.Method1522(a10);
        }
        if (a2 instanceof String) {
            return this.Method1523((String)a2);
        }
        if (a2 instanceof b) {
            b a11 = (b)a2;
            int a12 = a11.Method3217();
            if (a12 == 10) {
                return this.Method1507(a11.Method3221());
            }
            if (a12 == 11) {
                return this.Method1509(a11.Method3225());
            }
            return this.Method1507(a11.Method3225());
        }
        if (a2 instanceof Class279) {
            Class279 a13 = (Class279)a2;
            return this.Method1511(a13.Field1519, a13.Field1520, a13.Field1521, a13.Field1522);
        }
        throw new IllegalArgumentException(Class169.Method1536(31571, -11169) + a2);
    }

    public int Method1505(Object a2) {
        return this.Method1504((Object)a2).Field1426;
    }

    public int Method1506(String a2) {
        this.Field1085.Method2831(1, a2, null, null);
        Class261 a3 = this.Method1531(this.Field1085);
        this.Field1082.Method485(1).Method491(a2);
        a3 = new Class261(this.Field1081++, this.Field1085);
        this.Method1532(a3);
        return a3.Field1426;
    }

    Class261 Method1507(String a2) {
        this.Field1086.Method2831(7, a2, null, null);
        Class261 a3 = this.Method1531(this.Field1086);
        this.Field1082.Method488(7, this.Method1506(a2));
        a3 = new Class261(this.Field1081++, this.Field1086);
        this.Method1532(a3);
        return a3;
    }

    public int Method1508(String a2) {
        return this.Method1507((String)a2).Field1426;
    }

    Class261 Method1509(String a2) {
        this.Field1086.Method2831(16, a2, null, null);
        Class261 a3 = this.Method1531(this.Field1086);
        this.Field1082.Method488(16, this.Method1506(a2));
        a3 = new Class261(this.Field1081++, this.Field1086);
        this.Method1532(a3);
        return a3;
    }

    public int Method1510(String a2) {
        return this.Method1509((String)a2).Field1426;
    }

    Class261 Method1511(int a2, String a3, String a4, String a5) {
        this.Field1088.Method2831(20 + a2, a3, a4, a5);
        Class261 a6 = this.Method1531(this.Field1088);
        if (a2 <= 4) {
            this.Method1534(15, a2, this.Method1516(a3, a4, a5));
        } else {
            this.Method1534(15, a2, this.Method1518(a3, a4, a5, a2 == 9));
        }
        a6 = new Class261(this.Field1081++, this.Field1088);
        this.Method1532(a6);
        return a6;
    }

    public int Method1512(int a2, String a3, String a4, String a5) {
        return this.Method1511((int)a2, (String)a3, (String)a4, (String)a5).Field1426;
    }

    /*
     * Enabled aggressive block sorting
     */
    Class261 Method1513(String a2, String a3, Class279 a4, Object[] a5) {
        Object a6;
        Class138 a7 = this.Field1110;
        a7 = this.Field1110 = new Class138();
        int a8 = a7.Field991;
        int a9 = a4.Method2825();
        a7.Method487(this.Method1512(a4.Field1519, a4.Field1520, a4.Field1521, a4.Field1522));
        int a10 = a5.length;
        a7.Method487(a10);
        for (int a11 = 0; a11 < a10; a9 ^= a6.Method3430(), ++a11) {
            a6 = a5[a11];
            a7.Method487(this.Method1505(a6));
        }
        byte[] a12 = a7.Field990;
        int a13 = 2 + a10 << 1;
        Class261 a14 = this.Field1083[(a9 &= Integer.MAX_VALUE) % this.Field1083.length];
        block1: while (true) {
            if (a14.Field1427 != 33 || a14.Field1433 != a9) {
                a14 = a14.Field1434;
                continue;
            }
            int a15 = a14.Field1428;
            int a16 = 0;
            while (true) {
                if (a16 >= a13) {
                    a15 = a14.Field1426;
                    a7.Field991 = a8;
                    this.Field1087.Method2832(a2, a3, a15);
                    a14 = this.Method1531(this.Field1087);
                    this.Method1533(18, a15, this.Method1524(a2, a3));
                    a14 = new Class261(this.Field1081++, this.Field1087);
                    this.Method1532(a14);
                    return a14;
                }
                if (a12[a8 + a16] != a12[a15 + a16]) {
                    a14 = a14.Field1434;
                    continue block1;
                }
                ++a16;
            }
            break;
        }
    }

    public int Method1514(String a2, String a3, Class279 a4, Object[] a5) {
        return this.Method1513((String)a2, (String)a3, (Class279)a4, (Object[])a5).Field1426;
    }

    Class261 Method1515(String a2, String a3, String a4) {
        this.Field1087.Method2831(9, a2, a3, a4);
        Class261 a5 = this.Method1531(this.Field1087);
        this.Method1533(9, this.Method1508(a2), this.Method1524(a3, a4));
        a5 = new Class261(this.Field1081++, this.Field1087);
        this.Method1532(a5);
        return a5;
    }

    public int Method1516(String a2, String a3, String a4) {
        return this.Method1515((String)a2, (String)a3, (String)a4).Field1426;
    }

    Class261 Method1517(String a2, String a3, String a4, boolean a5) {
        int a6 = 11;
        this.Field1087.Method2831(a6, a2, a3, a4);
        Class261 a7 = this.Method1531(this.Field1087);
        this.Method1533(a6, this.Method1508(a2), this.Method1524(a3, a4));
        a7 = new Class261(this.Field1081++, this.Field1087);
        this.Method1532(a7);
        return a7;
    }

    public int Method1518(String a2, String a3, String a4, boolean a5) {
        return this.Method1517((String)a2, (String)a3, (String)a4, (boolean)a5).Field1426;
    }

    Class261 Method1519(int a2) {
        this.Field1085.Method2827(a2);
        Class261 a3 = this.Method1531(this.Field1085);
        this.Field1082.Method485(3).Method489(a2);
        a3 = new Class261(this.Field1081++, this.Field1085);
        this.Method1532(a3);
        return a3;
    }

    Class261 Method1520(float a2) {
        this.Field1085.Method2829(a2);
        Class261 a3 = this.Method1531(this.Field1085);
        this.Field1082.Method485(4).Method489(this.Field1085.Field1428);
        a3 = new Class261(this.Field1081++, this.Field1085);
        this.Method1532(a3);
        return a3;
    }

    Class261 Method1521(long a2) {
        this.Field1085.Method2828(a2);
        Class261 a3 = this.Method1531(this.Field1085);
        this.Field1082.Method485(5).Method490(a2);
        a3 = new Class261(this.Field1081, this.Field1085);
        this.Field1081 += 2;
        this.Method1532(a3);
        return a3;
    }

    Class261 Method1522(double a2) {
        this.Field1085.Method2830(a2);
        Class261 a3 = this.Method1531(this.Field1085);
        this.Field1082.Method485(6).Method490(this.Field1085.Field1429);
        a3 = new Class261(this.Field1081, this.Field1085);
        this.Field1081 += 2;
        this.Method1532(a3);
        return a3;
    }

    private Class261 Method1523(String a2) {
        this.Field1086.Method2831(8, a2, null, null);
        Class261 a3 = this.Method1531(this.Field1086);
        this.Field1082.Method488(8, this.Method1506(a2));
        a3 = new Class261(this.Field1081++, this.Field1086);
        this.Method1532(a3);
        return a3;
    }

    public int Method1524(String a2, String a3) {
        return this.Method1525((String)a2, (String)a3).Field1426;
    }

    Class261 Method1525(String a2, String a3) {
        this.Field1086.Method2831(12, a2, a3, null);
        Class261 a4 = this.Method1531(this.Field1086);
        this.Method1533(12, this.Method1506(a2), this.Method1506(a3));
        a4 = new Class261(this.Field1081++, this.Field1086);
        this.Method1532(a4);
        return a4;
    }

    int Method1526(String a2) {
        this.Field1085.Method2831(30, a2, null, null);
        Class261 a3 = this.Method1531(this.Field1085);
        a3 = this.Method1528(this.Field1085);
        return a3.Field1426;
    }

    int Method1527(String a2, int a3) {
        this.Field1085.Field1427 = 31;
        this.Field1085.Field1428 = a3;
        this.Field1085.Field1430 = a2;
        this.Field1085.Field1433 = Integer.MAX_VALUE & 31 + a2.hashCode() + a3;
        Class261 a4 = this.Method1531(this.Field1085);
        a4 = this.Method1528(this.Field1085);
        return a4.Field1426;
    }

    private Class261 Method1528(Class261 a2) {
        this.Field1090 = (short)(this.Field1090 + 1);
        Class261 a3 = new Class261(this.Field1090, this.Field1085);
        this.Method1532(a3);
        if (this.Field1089 == null) {
            this.Field1089 = new Class261[16];
        }
        if (this.Field1090 == this.Field1089.length) {
            Class261[] a4 = new Class261[2 * this.Field1089.length];
            System.arraycopy((Object)this.Field1089, (int)0, (Object)a4, (int)0, (int)this.Field1089.length);
            this.Field1089 = a4;
        }
        this.Field1089[this.Field1090] = a3;
        return a3;
    }

    int Method1529(int a2, int a3) {
        this.Field1086.Field1427 = 32;
        this.Field1086.Field1429 = (long)a2 | (long)a3 << 32;
        this.Field1086.Field1433 = Integer.MAX_VALUE & 32 + a2 + a3;
        Class261 a4 = this.Method1531(this.Field1086);
        String a5 = this.Field1089[a2].Field1430;
        String a6 = this.Field1089[a3].Field1430;
        this.Field1086.Field1428 = this.Method1526(this.Method1530(a5, a6));
        a4 = new Class261(0, this.Field1086);
        this.Method1532(a4);
        return a4.Field1428;
    }

    protected String Method1530(String a2, String a3) {
        Class a4;
        Class a5;
        ClassLoader a6 = this.getClass().getClassLoader();
        try {
            a5 = Class.forName((String)a2.replace('/', '.'), (boolean)false, (ClassLoader)a6);
            a4 = Class.forName((String)a3.replace('/', '.'), (boolean)false, (ClassLoader)a6);
        }
        catch (Exception a7) {
            throw new RuntimeException(a7.toString());
        }
        if (a5.isAssignableFrom(a4)) {
            return a2;
        }
        if (a4.isAssignableFrom(a5)) {
            return a3;
        }
        if (a5.isInterface() || a4.isInterface()) {
            return Class169.Method1536(31575, -9573);
        }
        while (!(a5 = a5.getSuperclass()).isAssignableFrom(a4)) {
        }
        return a5.getName().replace('.', '/');
    }

    private Class261 Method1531(Class261 a2) {
        Class261 a3 = this.Field1083[a2.Field1433 % this.Field1083.length];
        while (true) {
            if (a3.Field1427 == a2.Field1427 && a2.Method2834(a3)) break;
            a3 = a3.Field1434;
        }
        return a3;
    }

    private void Method1532(Class261 a2) {
        if (this.Field1081 + this.Field1090 > this.Field1084) {
            int a3 = this.Field1083.length;
            int a4 = a3 * 2 + 1;
            Class261[] a5 = new Class261[a4];
            int a6 = a3 - 1;
            Class261 a7 = this.Field1083[a6];
            while (true) {
                int a8 = a7.Field1433 % a5.length;
                Class261 a9 = a7.Field1434;
                a7.Field1434 = a5[a8];
                a5[a8] = a7;
                a7 = a9;
            }
        }
        int a10 = a2.Field1433 % this.Field1083.length;
        a2.Field1434 = this.Field1083[a10];
        this.Field1083[a10] = a2;
    }

    private void Method1533(int a2, int a3, int a4) {
        this.Field1082.Method488(a2, a3).Method487(a4);
    }

    private void Method1534(int a2, int a3, int a4) {
        this.Field1082.Method486(a2, a3).Method487(a4);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                a = new String[28];
                a = 0;
                a = "\u008d7~!\u0013/\u00f1\u000e\u007fk\u00c5\u00d0\u009cs\u00e2\u0092\u001d\u001cB_\u00d6\f\u00c8\\\u00ff&\u00ba\u00d8\u0005\u00b6\u0017\u0013_f\u00e9\u00de\u001f _\u00de\u00a2d]\u009c}\u0012\n \u008c\u0012\u001bt\u00b9\u00da<~\u00b3\u0010\u00f1\u0089\u00f1\u00f6\u00e2\u00d5\u00cfQ\u00b8\u0080=\u00ad\u0083\u00dc\u0001g\t\u00c0\u0002\u00e5SZp\u00a6\u00de@\u0015\u001f>\u0003ds4\u00e9\u00bb\u00f6\u00fc.\u000f\u000b\u0088\u00b3\u00f2\u0099\u00fc4C\u00d0\u00dcu\u00c2,A\u0080\u0085\u00c4\u00e8\u00bd\u009f\u00ae\u00f6x\nWdk\u0097\u0006\u0011\u00b4\u00f2;|\u00de*\u00d70\"\u00a3F\u00edM\u0090\u00fd\u00ca\u001a[\u00da\u00eev\u0089\u0016\u0094\u00c0\u000b\u0099H\u00e7Q\u00d9\u00a8\"\u0010\u00ec\u00d3e\u00ff\u008eGu\u00c5\u00fa`\u00fa\u000e\u00c6D\u00f5\u00dcf>\u00ce^\\\u00e6\u00df\u0004^\u0086V\u00d5gn\u00b4\u00e8\u0014\u0004\u0087-$\u00fd\u00a1=-\u00a2\b\u0080Y5\u00a9\u00bf0Z\u00d2\u0013\u007f\u00e0\u00f6\u0019s\u00f76\u00dbDb\u008d\u00e1ed\u0089\u000e(\u00c4\u00a8LM\u00ac+\u008c`<\u00d7\u00df1y?*J\u0091\u0011\u0017\u00a0\u00fb\u0011\u00d2\u00f6\u0002\u00fb\u00c2f]at\u007f\u00ca\f!\u00e5\u00e8\t$eg\u00d4\u0088V\u00a4\u00f3\u00de\u0098v\u00d9P\u00efR\u00d8\u00c8\u0004\u001a\u00edW%\u000f\u00e67\u0017d<4\u00c1\u00e3&~\u008e\u00fc\u009a\u00aa\u00abU\u0010g\u0096\u00f4\u0096}\u00aa\u00cb\u0099\u00cc\n\u00dd\u00a2\u00c30\u00b4\u00b3\u00af2\u0016\u001d\u0018\u00a7\u00dfj\u001c_^\rf\u00e4\u00d0\u00ce\u00b7n3pb\f^\u00a30\u00c8\u00dcP$\u0003\u0094\u00b6\u0013\u0010\u008drJS\u00f3\u00ce)&\u0002\u00e2\u00b5\u00d9\u00ff\u008c\u00cb!\n\f\t\u0097\u00ab\u00c4\u00af\u00cc\u00fe\u00bc\u00eb\u0019\u00ad\u00deiE\u00ca\u00ba\u0084\u00b1=s\u00bb<\u00da0\u008b\u00ac\u00dchak^9S\u00a7\u00aa\u000f\u00dd\u0097\u009f\f\u00be\u0096\u00c0\u00d16~\u0019r\u0007'\u0091\u0006W\u00ea\u0094T;\u00f4\u0014\u0001\u00fd\u00c6~M\u0013\u001e\u00be`\u00c1t\u008b\u00f8\u0014}\u001b\u00bf\u0098\u00a8\u00bc\u001f\u00b2\u009c\u008a\r\u00b6\u00b3\u000b\u008f\u00cbM\u0082O\u00f8jG\u000b\u00f7\u00e0}\u00aal\u0082\u00876\u0016\b\u00c9\u00d9\u00dc\u001c\u00c0\u0014n\u000f+ \u00f0\u00d8\u00a9\u00c7\u0096\u00ee\u00aan#\u00a8\u0006\u008c\u00d0jE\u00e2\u001bDZT\u00d5m\u00a8p\u00ec\u00a4!o\u00c2E\u00db\u00f0=\u00141\u00a8o>~DA,/\u00f1\f\u0097\u00b4Va6#j^\u00d2_\u0013\u00a8\n\u00a5\u0086R\u0011\u00df\u00feN\u000f&j\t5\u0001[3\u008d|\\_\u001f\u0019\u009f\u00ca/\u00c7\u0002\u00ea\u009d\u00bb\u001e2\u00df\u0014V5\u001a\f\u00ee|'\u00e9\u0096iJ\u00ad\u0089\u000f\u0096\f\u00f6\u007f\u0093\u00f8e\u001c\u0082\u00c7\u008fE\u00d5\u00c1\u00cb\f\f\u009f%\u0004X\u008f\u00a7\u00cbk\u00ed$\u00fe\t~#;\u007f\u00a0\u00bd\u00d0O\u00a9\n=?A&\u00bd\u0018\u0002\u00d3\u00af\u00f1\t*\u00ce\u00b1\u00c2\u00f1\n\u00fa\u00b9\u00ec";
                a = "\u008d7~!\u0013/\u00f1\u000e\u007fk\u00c5\u00d0\u009cs\u00e2\u0092\u001d\u001cB_\u00d6\f\u00c8\\\u00ff&\u00ba\u00d8\u0005\u00b6\u0017\u0013_f\u00e9\u00de\u001f _\u00de\u00a2d]\u009c}\u0012\n \u008c\u0012\u001bt\u00b9\u00da<~\u00b3\u0010\u00f1\u0089\u00f1\u00f6\u00e2\u00d5\u00cfQ\u00b8\u0080=\u00ad\u0083\u00dc\u0001g\t\u00c0\u0002\u00e5SZp\u00a6\u00de@\u0015\u001f>\u0003ds4\u00e9\u00bb\u00f6\u00fc.\u000f\u000b\u0088\u00b3\u00f2\u0099\u00fc4C\u00d0\u00dcu\u00c2,A\u0080\u0085\u00c4\u00e8\u00bd\u009f\u00ae\u00f6x\nWdk\u0097\u0006\u0011\u00b4\u00f2;|\u00de*\u00d70\"\u00a3F\u00edM\u0090\u00fd\u00ca\u001a[\u00da\u00eev\u0089\u0016\u0094\u00c0\u000b\u0099H\u00e7Q\u00d9\u00a8\"\u0010\u00ec\u00d3e\u00ff\u008eGu\u00c5\u00fa`\u00fa\u000e\u00c6D\u00f5\u00dcf>\u00ce^\\\u00e6\u00df\u0004^\u0086V\u00d5gn\u00b4\u00e8\u0014\u0004\u0087-$\u00fd\u00a1=-\u00a2\b\u0080Y5\u00a9\u00bf0Z\u00d2\u0013\u007f\u00e0\u00f6\u0019s\u00f76\u00dbDb\u008d\u00e1ed\u0089\u000e(\u00c4\u00a8LM\u00ac+\u008c`<\u00d7\u00df1y?*J\u0091\u0011\u0017\u00a0\u00fb\u0011\u00d2\u00f6\u0002\u00fb\u00c2f]at\u007f\u00ca\f!\u00e5\u00e8\t$eg\u00d4\u0088V\u00a4\u00f3\u00de\u0098v\u00d9P\u00efR\u00d8\u00c8\u0004\u001a\u00edW%\u000f\u00e67\u0017d<4\u00c1\u00e3&~\u008e\u00fc\u009a\u00aa\u00abU\u0010g\u0096\u00f4\u0096}\u00aa\u00cb\u0099\u00cc\n\u00dd\u00a2\u00c30\u00b4\u00b3\u00af2\u0016\u001d\u0018\u00a7\u00dfj\u001c_^\rf\u00e4\u00d0\u00ce\u00b7n3pb\f^\u00a30\u00c8\u00dcP$\u0003\u0094\u00b6\u0013\u0010\u008drJS\u00f3\u00ce)&\u0002\u00e2\u00b5\u00d9\u00ff\u008c\u00cb!\n\f\t\u0097\u00ab\u00c4\u00af\u00cc\u00fe\u00bc\u00eb\u0019\u00ad\u00deiE\u00ca\u00ba\u0084\u00b1=s\u00bb<\u00da0\u008b\u00ac\u00dchak^9S\u00a7\u00aa\u000f\u00dd\u0097\u009f\f\u00be\u0096\u00c0\u00d16~\u0019r\u0007'\u0091\u0006W\u00ea\u0094T;\u00f4\u0014\u0001\u00fd\u00c6~M\u0013\u001e\u00be`\u00c1t\u008b\u00f8\u0014}\u001b\u00bf\u0098\u00a8\u00bc\u001f\u00b2\u009c\u008a\r\u00b6\u00b3\u000b\u008f\u00cbM\u0082O\u00f8jG\u000b\u00f7\u00e0}\u00aal\u0082\u00876\u0016\b\u00c9\u00d9\u00dc\u001c\u00c0\u0014n\u000f+ \u00f0\u00d8\u00a9\u00c7\u0096\u00ee\u00aan#\u00a8\u0006\u008c\u00d0jE\u00e2\u001bDZT\u00d5m\u00a8p\u00ec\u00a4!o\u00c2E\u00db\u00f0=\u00141\u00a8o>~DA,/\u00f1\f\u0097\u00b4Va6#j^\u00d2_\u0013\u00a8\n\u00a5\u0086R\u0011\u00df\u00feN\u000f&j\t5\u0001[3\u008d|\\_\u001f\u0019\u009f\u00ca/\u00c7\u0002\u00ea\u009d\u00bb\u001e2\u00df\u0014V5\u001a\f\u00ee|'\u00e9\u0096iJ\u00ad\u0089\u000f\u0096\f\u00f6\u007f\u0093\u00f8e\u001c\u0082\u00c7\u008fE\u00d5\u00c1\u00cb\f\f\u009f%\u0004X\u008f\u00a7\u00cbk\u00ed$\u00fe\t~#;\u007f\u00a0\u00bd\u00d0O\u00a9\n=?A&\u00bd\u0018\u0002\u00d3\u00af\u00f1\t*\u00ce\u00b1\u00c2\u00f1\n\u00fa\u00b9\u00ec".length();
                a = 16;
                a = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 4;
                    v1 = ++a;
                    v2 = a.substring(v1, v1 + a);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    a[a++] = v4.intern();
                    if ((a += a) < a) {
                        a = a.charAt(a);
                        ** continue;
                    }
                    a = "v\u00a4\u008b\u0093\u000f\u00f9\u00a5_\u0087\u00ce\u0092\u00a6c\u00ce\u00ad\u00063\u00d8|4\u00d5\u00c8)\u00e6Z\u008b\u00d90G\u00b8*\u001bz\u009e\n\u00d4?\u0011\u00a3BGm\u008a\u00d2`@\u00cd\u00d7*\u00f5\u00f6nl\u00c7\u0097\u00ef\u00cfc\u0014";
                    a = "v\u00a4\u008b\u0093\u000f\u00f9\u00a5_\u0087\u00ce\u0092\u00a6c\u00ce\u00ad\u00063\u00d8|4\u00d5\u00c8)\u00e6Z\u008b\u00d90G\u00b8*\u001bz\u009e\n\u00d4?\u0011\u00a3BGm\u008a\u00d2`@\u00cd\u00d7*\u00f5\u00f6nl\u00c7\u0097\u00ef\u00cfc\u0014".length();
                    a = 31;
                    a = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 115;
                        v5 = ++a;
                        v2 = a.substring(v5, v5 + a);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    a[a++] = v4.intern();
                    if ((a += a) < a) {
                        a = a.charAt(a);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            a = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = a;
                while (true) {
                    switch (a % 7) {
                        case 0: {
                            v15 = 17;
                            break;
                        }
                        case 1: {
                            v15 = 38;
                            break;
                        }
                        case 2: {
                            v15 = 12;
                            break;
                        }
                        case 3: {
                            v15 = 113;
                            break;
                        }
                        case 4: {
                            v15 = 40;
                            break;
                        }
                        case 5: {
                            v15 = 47;
                            break;
                        }
                        default: {
                            v15 = 125;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++a;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > a);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        Class169.Field1118 = a;
        Class169.Field1119 = new String[28];
        var8_7 = new byte[220];
        a = Class169.Method1536(31577, -11437);
        for (a = 0; a < ((void)a).length; ++a) {
            a[a] = (byte)(a.charAt(a) - 65);
        }
        Class169.Field1059 = a;
    }

    private static Exception Method1535(Exception exception) {
        return exception;
    }

    private static String Method1536(int n, int n2) {
        int n3 = (n ^ 0x7B5F) & 0xFFFF;
        if (Field1119[n3] == null) {
            int n4;
            char[] cArray = Field1118[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 230;
                    break;
                }
                case 1: {
                    n4 = 13;
                    break;
                }
                case 2: {
                    n4 = 164;
                    break;
                }
                case 3: {
                    n4 = 235;
                    break;
                }
                case 4: {
                    n4 = 16;
                    break;
                }
                case 5: {
                    n4 = 206;
                    break;
                }
                case 6: {
                    n4 = 64;
                    break;
                }
                case 7: {
                    n4 = 106;
                    break;
                }
                case 8: {
                    n4 = 56;
                    break;
                }
                case 9: {
                    n4 = 139;
                    break;
                }
                case 10: {
                    n4 = 141;
                    break;
                }
                case 11: {
                    n4 = 239;
                    break;
                }
                case 12: {
                    n4 = 194;
                    break;
                }
                case 13: {
                    n4 = 40;
                    break;
                }
                case 14: {
                    n4 = 81;
                    break;
                }
                case 15: {
                    n4 = 173;
                    break;
                }
                case 16: {
                    n4 = 178;
                    break;
                }
                case 17: {
                    n4 = 26;
                    break;
                }
                case 18: {
                    n4 = 132;
                    break;
                }
                case 19: {
                    n4 = 192;
                    break;
                }
                case 20: {
                    n4 = 38;
                    break;
                }
                case 21: {
                    n4 = 76;
                    break;
                }
                case 22: {
                    n4 = 177;
                    break;
                }
                case 23: {
                    n4 = 61;
                    break;
                }
                case 24: {
                    n4 = 17;
                    break;
                }
                case 25: {
                    n4 = 86;
                    break;
                }
                case 26: {
                    n4 = 78;
                    break;
                }
                case 27: {
                    n4 = 115;
                    break;
                }
                case 28: {
                    n4 = 109;
                    break;
                }
                case 29: {
                    n4 = 128;
                    break;
                }
                case 30: {
                    n4 = 44;
                    break;
                }
                case 31: {
                    n4 = 113;
                    break;
                }
                case 32: {
                    n4 = 216;
                    break;
                }
                case 33: {
                    n4 = 133;
                    break;
                }
                case 34: {
                    n4 = 57;
                    break;
                }
                case 35: {
                    n4 = 24;
                    break;
                }
                case 36: {
                    n4 = 3;
                    break;
                }
                case 37: {
                    n4 = 160;
                    break;
                }
                case 38: {
                    n4 = 97;
                    break;
                }
                case 39: {
                    n4 = 224;
                    break;
                }
                case 40: {
                    n4 = 243;
                    break;
                }
                case 41: {
                    n4 = 124;
                    break;
                }
                case 42: {
                    n4 = 204;
                    break;
                }
                case 43: {
                    n4 = 10;
                    break;
                }
                case 44: {
                    n4 = 63;
                    break;
                }
                case 45: {
                    n4 = 142;
                    break;
                }
                case 46: {
                    n4 = 245;
                    break;
                }
                case 47: {
                    n4 = 90;
                    break;
                }
                case 48: {
                    n4 = 167;
                    break;
                }
                case 49: {
                    n4 = 162;
                    break;
                }
                case 50: {
                    n4 = 131;
                    break;
                }
                case 51: {
                    n4 = 129;
                    break;
                }
                case 52: {
                    n4 = 208;
                    break;
                }
                case 53: {
                    n4 = 77;
                    break;
                }
                case 54: {
                    n4 = 8;
                    break;
                }
                case 55: {
                    n4 = 253;
                    break;
                }
                case 56: {
                    n4 = 174;
                    break;
                }
                case 57: {
                    n4 = 23;
                    break;
                }
                case 58: {
                    n4 = 136;
                    break;
                }
                case 59: {
                    n4 = 37;
                    break;
                }
                case 60: {
                    n4 = 73;
                    break;
                }
                case 61: {
                    n4 = 182;
                    break;
                }
                case 62: {
                    n4 = 83;
                    break;
                }
                case 63: {
                    n4 = 207;
                    break;
                }
                case 64: {
                    n4 = 88;
                    break;
                }
                case 65: {
                    n4 = 217;
                    break;
                }
                case 66: {
                    n4 = 43;
                    break;
                }
                case 67: {
                    n4 = 205;
                    break;
                }
                case 68: {
                    n4 = 33;
                    break;
                }
                case 69: {
                    n4 = 244;
                    break;
                }
                case 70: {
                    n4 = 240;
                    break;
                }
                case 71: {
                    n4 = 2;
                    break;
                }
                case 72: {
                    n4 = 228;
                    break;
                }
                case 73: {
                    n4 = 148;
                    break;
                }
                case 74: {
                    n4 = 150;
                    break;
                }
                case 75: {
                    n4 = 163;
                    break;
                }
                case 76: {
                    n4 = 254;
                    break;
                }
                case 77: {
                    n4 = 74;
                    break;
                }
                case 78: {
                    n4 = 30;
                    break;
                }
                case 79: {
                    n4 = 6;
                    break;
                }
                case 80: {
                    n4 = 252;
                    break;
                }
                case 81: {
                    n4 = 195;
                    break;
                }
                case 82: {
                    n4 = 100;
                    break;
                }
                case 83: {
                    n4 = 48;
                    break;
                }
                case 84: {
                    n4 = 91;
                    break;
                }
                case 85: {
                    n4 = 191;
                    break;
                }
                case 86: {
                    n4 = 161;
                    break;
                }
                case 87: {
                    n4 = 213;
                    break;
                }
                case 88: {
                    n4 = 125;
                    break;
                }
                case 89: {
                    n4 = 250;
                    break;
                }
                case 90: {
                    n4 = 110;
                    break;
                }
                case 91: {
                    n4 = 179;
                    break;
                }
                case 92: {
                    n4 = 79;
                    break;
                }
                case 93: {
                    n4 = 41;
                    break;
                }
                case 94: {
                    n4 = 31;
                    break;
                }
                case 95: {
                    n4 = 211;
                    break;
                }
                case 96: {
                    n4 = 50;
                    break;
                }
                case 97: {
                    n4 = 237;
                    break;
                }
                case 98: {
                    n4 = 219;
                    break;
                }
                case 99: {
                    n4 = 93;
                    break;
                }
                case 100: {
                    n4 = 9;
                    break;
                }
                case 101: {
                    n4 = 151;
                    break;
                }
                case 102: {
                    n4 = 47;
                    break;
                }
                case 103: {
                    n4 = 155;
                    break;
                }
                case 104: {
                    n4 = 183;
                    break;
                }
                case 105: {
                    n4 = 229;
                    break;
                }
                case 106: {
                    n4 = 42;
                    break;
                }
                case 107: {
                    n4 = 212;
                    break;
                }
                case 108: {
                    n4 = 96;
                    break;
                }
                case 109: {
                    n4 = 209;
                    break;
                }
                case 110: {
                    n4 = 68;
                    break;
                }
                case 111: {
                    n4 = 46;
                    break;
                }
                case 112: {
                    n4 = 171;
                    break;
                }
                case 113: {
                    n4 = 170;
                    break;
                }
                case 114: {
                    n4 = 193;
                    break;
                }
                case 115: {
                    n4 = 19;
                    break;
                }
                case 116: {
                    n4 = 98;
                    break;
                }
                case 117: {
                    n4 = 105;
                    break;
                }
                case 118: {
                    n4 = 172;
                    break;
                }
                case 119: {
                    n4 = 84;
                    break;
                }
                case 120: {
                    n4 = 184;
                    break;
                }
                case 121: {
                    n4 = 28;
                    break;
                }
                case 122: {
                    n4 = 25;
                    break;
                }
                case 123: {
                    n4 = 66;
                    break;
                }
                case 124: {
                    n4 = 87;
                    break;
                }
                case 125: {
                    n4 = 130;
                    break;
                }
                case 126: {
                    n4 = 232;
                    break;
                }
                case 127: {
                    n4 = 144;
                    break;
                }
                case 128: {
                    n4 = 127;
                    break;
                }
                case 129: {
                    n4 = 241;
                    break;
                }
                case 130: {
                    n4 = 138;
                    break;
                }
                case 131: {
                    n4 = 122;
                    break;
                }
                case 132: {
                    n4 = 65;
                    break;
                }
                case 133: {
                    n4 = 112;
                    break;
                }
                case 134: {
                    n4 = 101;
                    break;
                }
                case 135: {
                    n4 = 20;
                    break;
                }
                case 136: {
                    n4 = 140;
                    break;
                }
                case 137: {
                    n4 = 58;
                    break;
                }
                case 138: {
                    n4 = 201;
                    break;
                }
                case 139: {
                    n4 = 45;
                    break;
                }
                case 140: {
                    n4 = 156;
                    break;
                }
                case 141: {
                    n4 = 94;
                    break;
                }
                case 142: {
                    n4 = 221;
                    break;
                }
                case 143: {
                    n4 = 225;
                    break;
                }
                case 144: {
                    n4 = 218;
                    break;
                }
                case 145: {
                    n4 = 185;
                    break;
                }
                case 146: {
                    n4 = 120;
                    break;
                }
                case 147: {
                    n4 = 71;
                    break;
                }
                case 148: {
                    n4 = 123;
                    break;
                }
                case 149: {
                    n4 = 134;
                    break;
                }
                case 150: {
                    n4 = 104;
                    break;
                }
                case 151: {
                    n4 = 21;
                    break;
                }
                case 152: {
                    n4 = 169;
                    break;
                }
                case 153: {
                    n4 = 60;
                    break;
                }
                case 154: {
                    n4 = 234;
                    break;
                }
                case 155: {
                    n4 = 200;
                    break;
                }
                case 156: {
                    n4 = 147;
                    break;
                }
                case 157: {
                    n4 = 59;
                    break;
                }
                case 158: {
                    n4 = 152;
                    break;
                }
                case 159: {
                    n4 = 145;
                    break;
                }
                case 160: {
                    n4 = 118;
                    break;
                }
                case 161: {
                    n4 = 222;
                    break;
                }
                case 162: {
                    n4 = 249;
                    break;
                }
                case 163: {
                    n4 = 158;
                    break;
                }
                case 164: {
                    n4 = 75;
                    break;
                }
                case 165: {
                    n4 = 102;
                    break;
                }
                case 166: {
                    n4 = 67;
                    break;
                }
                case 167: {
                    n4 = 215;
                    break;
                }
                case 168: {
                    n4 = 168;
                    break;
                }
                case 169: {
                    n4 = 214;
                    break;
                }
                case 170: {
                    n4 = 36;
                    break;
                }
                case 171: {
                    n4 = 121;
                    break;
                }
                case 172: {
                    n4 = 198;
                    break;
                }
                case 173: {
                    n4 = 15;
                    break;
                }
                case 174: {
                    n4 = 227;
                    break;
                }
                case 175: {
                    n4 = 69;
                    break;
                }
                case 176: {
                    n4 = 255;
                    break;
                }
                case 177: {
                    n4 = 51;
                    break;
                }
                case 178: {
                    n4 = 82;
                    break;
                }
                case 179: {
                    n4 = 199;
                    break;
                }
                case 180: {
                    n4 = 0;
                    break;
                }
                case 181: {
                    n4 = 62;
                    break;
                }
                case 182: {
                    n4 = 55;
                    break;
                }
                case 183: {
                    n4 = 95;
                    break;
                }
                case 184: {
                    n4 = 175;
                    break;
                }
                case 185: {
                    n4 = 251;
                    break;
                }
                case 186: {
                    n4 = 248;
                    break;
                }
                case 187: {
                    n4 = 186;
                    break;
                }
                case 188: {
                    n4 = 52;
                    break;
                }
                case 189: {
                    n4 = 223;
                    break;
                }
                case 190: {
                    n4 = 107;
                    break;
                }
                case 191: {
                    n4 = 54;
                    break;
                }
                case 192: {
                    n4 = 149;
                    break;
                }
                case 193: {
                    n4 = 12;
                    break;
                }
                case 194: {
                    n4 = 35;
                    break;
                }
                case 195: {
                    n4 = 236;
                    break;
                }
                case 196: {
                    n4 = 70;
                    break;
                }
                case 197: {
                    n4 = 18;
                    break;
                }
                case 198: {
                    n4 = 53;
                    break;
                }
                case 199: {
                    n4 = 238;
                    break;
                }
                case 200: {
                    n4 = 34;
                    break;
                }
                case 201: {
                    n4 = 117;
                    break;
                }
                case 202: {
                    n4 = 233;
                    break;
                }
                case 203: {
                    n4 = 188;
                    break;
                }
                case 204: {
                    n4 = 14;
                    break;
                }
                case 205: {
                    n4 = 231;
                    break;
                }
                case 206: {
                    n4 = 176;
                    break;
                }
                case 207: {
                    n4 = 220;
                    break;
                }
                case 208: {
                    n4 = 80;
                    break;
                }
                case 209: {
                    n4 = 111;
                    break;
                }
                case 210: {
                    n4 = 153;
                    break;
                }
                case 211: {
                    n4 = 49;
                    break;
                }
                case 212: {
                    n4 = 247;
                    break;
                }
                case 213: {
                    n4 = 242;
                    break;
                }
                case 214: {
                    n4 = 197;
                    break;
                }
                case 215: {
                    n4 = 126;
                    break;
                }
                case 216: {
                    n4 = 89;
                    break;
                }
                case 217: {
                    n4 = 27;
                    break;
                }
                case 218: {
                    n4 = 114;
                    break;
                }
                case 219: {
                    n4 = 22;
                    break;
                }
                case 220: {
                    n4 = 154;
                    break;
                }
                case 221: {
                    n4 = 103;
                    break;
                }
                case 222: {
                    n4 = 29;
                    break;
                }
                case 223: {
                    n4 = 203;
                    break;
                }
                case 224: {
                    n4 = 202;
                    break;
                }
                case 225: {
                    n4 = 166;
                    break;
                }
                case 226: {
                    n4 = 187;
                    break;
                }
                case 227: {
                    n4 = 146;
                    break;
                }
                case 228: {
                    n4 = 5;
                    break;
                }
                case 229: {
                    n4 = 32;
                    break;
                }
                case 230: {
                    n4 = 157;
                    break;
                }
                case 231: {
                    n4 = 137;
                    break;
                }
                case 232: {
                    n4 = 4;
                    break;
                }
                case 233: {
                    n4 = 180;
                    break;
                }
                case 234: {
                    n4 = 99;
                    break;
                }
                case 235: {
                    n4 = 1;
                    break;
                }
                case 236: {
                    n4 = 108;
                    break;
                }
                case 237: {
                    n4 = 181;
                    break;
                }
                case 238: {
                    n4 = 11;
                    break;
                }
                case 239: {
                    n4 = 85;
                    break;
                }
                case 240: {
                    n4 = 92;
                    break;
                }
                case 241: {
                    n4 = 116;
                    break;
                }
                case 242: {
                    n4 = 39;
                    break;
                }
                case 243: {
                    n4 = 210;
                    break;
                }
                case 244: {
                    n4 = 246;
                    break;
                }
                case 245: {
                    n4 = 196;
                    break;
                }
                case 246: {
                    n4 = 189;
                    break;
                }
                case 247: {
                    n4 = 226;
                    break;
                }
                case 248: {
                    n4 = 190;
                    break;
                }
                case 249: {
                    n4 = 159;
                    break;
                }
                case 250: {
                    n4 = 143;
                    break;
                }
                case 251: {
                    n4 = 165;
                    break;
                }
                case 252: {
                    n4 = 72;
                    break;
                }
                case 253: {
                    n4 = 7;
                    break;
                }
                case 254: {
                    n4 = 135;
                    break;
                }
                default: {
                    n4 = 119;
                }
            }
            int n5 = n4;
            int n6 = (n2 & 0xFF) - n5;
            n6 += 256;
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            n7 += 256;
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                cArray[n10] = (char)(cArray[n10] ^ n6);
                n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                ++n8;
            }
            Class169.Field1119[n3] = new String(cArray).intern();
        }
        return Field1119[n3];
    }
}