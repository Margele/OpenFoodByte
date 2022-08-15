/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class169;
import awsl.Class261;
import awsl.Class264;
import awsl.Class267;
import awsl.Class46;

final class Class276 {
    static final int Field1479 = -268435456;
    static final int Field1480 = 0x10000000;
    static final int Field1481 = -268435456;
    static final int Field1482 = 0xF000000;
    static final int Field1483 = 0x800000;
    static final int Field1484 = 0x7FFFFF;
    static final int Field1485 = 0xFF00000;
    static final int Field1486 = 1048575;
    static final int Field1487 = 0x1000000;
    static final int Field1488 = 0x1700000;
    static final int Field1489 = 0x1800000;
    private static final int Field1490 = 0x2000000;
    private static final int Field1491 = 0x3000000;
    static final int Field1492 = 0x1000000;
    static final int Field1493 = 0x1000009;
    static final int Field1494 = 0x100000A;
    static final int Field1495 = 0x100000B;
    static final int Field1496 = 0x100000C;
    static final int Field1497 = 0x1000001;
    static final int Field1498 = 0x1000002;
    static final int Field1499 = 0x1000003;
    static final int Field1500 = 0x1000004;
    static final int Field1501 = 0x1000005;
    static final int Field1502 = 0x1000006;
    static final int[] Field1503;
    Class264 Field1504;
    int[] Field1505;
    int[] Field1506;
    private int[] Field1507;
    private int[] Field1508;
    private int Field1509;
    private int Field1510;
    private int[] Field1511;
    private static final String[] Field1512;
    private static final String[] Field1513;

    Class276() {
    }

    private int Method2790(int a) {
        if (this.Field1507 == null || a >= this.Field1507.length) {
            return 0x2000000 | a;
        }
        int a2 = this.Field1507[a];
        a2 = this.Field1507[a] = 0x2000000 | a;
        return a2;
    }

    private void Method2791(int a, int a2) {
        int a3;
        if (this.Field1507 == null) {
            this.Field1507 = new int[10];
        }
        if (a >= (a3 = this.Field1507.length)) {
            int[] a4 = new int[Math.max((int)(a + 1), (int)(2 * a3))];
            System.arraycopy((Object)this.Field1507, (int)0, (Object)a4, (int)0, (int)a3);
            this.Field1507 = a4;
        }
        this.Field1507[a] = a2;
    }

    private void Method2792(int a) {
        block2: {
            int a2;
            if (this.Field1508 == null) {
                this.Field1508 = new int[10];
            }
            if (this.Field1509 >= (a2 = this.Field1508.length)) {
                int[] a3 = new int[Math.max((int)(this.Field1509 + 1), (int)(2 * a2))];
                System.arraycopy((Object)this.Field1508, (int)0, (Object)a3, (int)0, (int)a2);
                this.Field1508 = a3;
            }
            this.Field1508[this.Field1509++] = a;
            int a4 = this.Field1504.Field1453 + this.Field1509;
            if (a4 <= this.Field1504.Field1454) break block2;
            this.Field1504.Field1454 = a4;
        }
    }

    private void Method2793(Class169 a, String a2) {
        block0: {
            int a3 = Class276.Method2794(a, a2);
            this.Method2792(a3);
            if (a3 != 0x1000004 && a3 != 0x1000003) break block0;
            this.Method2792(0x1000000);
        }
    }

    private static int Method2794(Class169 a, String a2) {
        int a3;
        int a4 = a2.charAt(0) == '(' ? a2.indexOf(41) + 1 : 0;
        switch (a2.charAt(a4)) {
            case 'V': {
                return 0;
            }
            case 'B': 
            case 'C': 
            case 'I': 
            case 'S': 
            case 'Z': {
                return 0x1000001;
            }
            case 'F': {
                return 0x1000002;
            }
            case 'J': {
                return 0x1000004;
            }
            case 'D': {
                return 0x1000003;
            }
            case 'L': {
                String a5 = a2.substring(a4 + 1, a2.length() - 1);
                return 0x1700000 | a.Method1526(a5);
            }
        }
        int a6 = a4 + 1;
        while (a2.charAt(a6) == '[') {
            ++a6;
        }
        switch (a2.charAt(a6)) {
            case 'Z': {
                a3 = 0x1000009;
                break;
            }
            case 'C': {
                a3 = 0x100000B;
                break;
            }
            case 'B': {
                a3 = 0x100000A;
                break;
            }
            case 'S': {
                a3 = 0x100000C;
                break;
            }
            case 'I': {
                a3 = 0x1000001;
                break;
            }
            case 'F': {
                a3 = 0x1000002;
                break;
            }
            case 'J': {
                a3 = 0x1000004;
                break;
            }
            case 'D': {
                a3 = 0x1000003;
                break;
            }
            default: {
                String a7 = a2.substring(a6 + 1, a2.length() - 1);
                a3 = 0x1700000 | a.Method1526(a7);
            }
        }
        return a6 - a4 << 28 | a3;
    }

    private int Method2795() {
        if (this.Field1509 > 0) {
            return this.Field1508[--this.Field1509];
        }
        return 0x3000000 | -(--this.Field1504.Field1453);
    }

    private void Method2796(int a) {
        if (this.Field1509 >= a) {
            this.Field1509 -= a;
        } else {
            this.Field1504.Field1453 -= a - this.Field1509;
            this.Field1509 = 0;
        }
    }

    private void Method2797(String a) {
        char a2 = a.charAt(0);
        if (a2 == '(') {
            this.Method2796((Class46.Method3215(a) >> 2) - 1);
        } else if (a2 == 'J' || a2 == 'D') {
            this.Method2796(2);
        } else {
            this.Method2796(1);
        }
    }

    private void Method2798(int a) {
        int a2;
        if (this.Field1511 == null) {
            this.Field1511 = new int[2];
        }
        if (this.Field1510 >= (a2 = this.Field1511.length)) {
            int[] a3 = new int[Math.max((int)(this.Field1510 + 1), (int)(2 * a2))];
            System.arraycopy((Object)this.Field1511, (int)0, (Object)a3, (int)0, (int)a2);
            this.Field1511 = a3;
        }
        this.Field1511[this.Field1510++] = a;
    }

    private int Method2799(Class169 a, int a2) {
        int a3;
        if (a2 == 0x1000006) {
            a3 = 0x1700000 | a.Method1526(a.Field1093);
        } else if ((a2 & 0xFFF00000) == 0x1800000) {
            String a4 = a.Field1089[a2 & 0xFFFFF].Field1430;
            a3 = 0x1700000 | a.Method1526(a4);
        } else {
            return a2;
        }
        for (int a5 = 0; a5 < this.Field1510; ++a5) {
            int a6 = this.Field1511[a5];
            int a7 = a6 & 0xF0000000;
            int a8 = a6 & 0xF000000;
            if (a8 == 0x2000000) {
                a6 = a7 + this.Field1505[a6 & 0x7FFFFF];
            } else if (a8 == 0x3000000) {
                a6 = a7 + this.Field1506[this.Field1506.length - (a6 & 0x7FFFFF)];
            }
            if (a2 != a6) continue;
            return a3;
        }
        return a2;
    }

    void Method2800(Class169 a, int a2, Class46[] a3, int a4) {
        this.Field1505 = new int[a4];
        this.Field1506 = new int[0];
        int a5 = 0;
        if ((a2 & 8) == 0) {
            this.Field1505[a5++] = (a2 & 0x80000) == 0 ? 0x1700000 | a.Method1526(a.Field1093) : 0x1000006;
        }
        for (int a6 = 0; a6 < a3.length; ++a6) {
            int a7 = Class276.Method2794(a, a3[a6].Method3225());
            this.Field1505[a5++] = a7;
            if (a7 != 0x1000004 && a7 != 0x1000003) continue;
            this.Field1505[a5++] = 0x1000000;
        }
        while (a5 < a4) {
            this.Field1505[a5++] = 0x1000000;
        }
    }

    void Method2801(int a, int a2, Class169 a3, Class261 a4) {
        String[] a5 = Class267.Method2862();
        switch (a) {
            case 0: 
            case 116: 
            case 117: 
            case 118: 
            case 119: 
            case 145: 
            case 146: 
            case 147: 
            case 167: 
            case 177: {
            }
            case 1: {
                this.Method2792(0x1000005);
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 16: 
            case 17: 
            case 21: {
                this.Method2792(0x1000001);
            }
            case 9: 
            case 10: 
            case 22: {
                this.Method2792(0x1000004);
                this.Method2792(0x1000000);
            }
            case 11: 
            case 12: 
            case 13: 
            case 23: {
                this.Method2792(0x1000002);
            }
            case 14: 
            case 15: 
            case 24: {
                this.Method2792(0x1000003);
                this.Method2792(0x1000000);
            }
            case 18: {
                switch (a4.Field1427) {
                    case 3: {
                        this.Method2792(0x1000001);
                    }
                    case 5: {
                        this.Method2792(0x1000004);
                        this.Method2792(0x1000000);
                    }
                    case 4: {
                        this.Method2792(0x1000002);
                    }
                    case 6: {
                        this.Method2792(0x1000003);
                        this.Method2792(0x1000000);
                    }
                    case 7: {
                        this.Method2792(0x1700000 | a3.Method1526(Class276.Method2805(-20524, -8081)));
                    }
                    case 8: {
                        this.Method2792(0x1700000 | a3.Method1526(Class276.Method2805(-20522, -2904)));
                    }
                    case 16: {
                        this.Method2792(0x1700000 | a3.Method1526(Class276.Method2805(-20528, -18832)));
                        break;
                    }
                }
                this.Method2792(0x1700000 | a3.Method1526(Class276.Method2805(-20526, -1378)));
            }
            case 25: {
                this.Method2792(this.Method2790(a2));
            }
            case 46: 
            case 51: 
            case 52: 
            case 53: {
                this.Method2796(2);
                this.Method2792(0x1000001);
            }
            case 47: 
            case 143: {
                this.Method2796(2);
                this.Method2792(0x1000004);
                this.Method2792(0x1000000);
            }
            case 48: {
                this.Method2796(2);
                this.Method2792(0x1000002);
            }
            case 49: 
            case 138: {
                this.Method2796(2);
                this.Method2792(0x1000003);
                this.Method2792(0x1000000);
            }
            case 50: {
                this.Method2796(1);
                int a6 = this.Method2795();
                this.Method2792(-268435456 + a6);
            }
            case 54: 
            case 56: 
            case 58: {
                int a6 = this.Method2795();
                this.Method2791(a2, a6);
                int a7 = this.Method2790(a2 - 1);
                if (a7 == 0x1000004 || a7 == 0x1000003) {
                    this.Method2791(a2 - 1, 0x1000000);
                }
                if ((a7 & 0xF000000) == 0x1000000) break;
                this.Method2791(a2 - 1, a7 | 0x800000);
            }
            case 55: 
            case 57: {
                this.Method2796(1);
                int a6 = this.Method2795();
                this.Method2791(a2, a6);
                this.Method2791(a2 + 1, 0x1000000);
                int a7 = this.Method2790(a2 - 1);
                if (a7 == 0x1000004 || a7 == 0x1000003) {
                    this.Method2791(a2 - 1, 0x1000000);
                }
                if ((a7 & 0xF000000) == 0x1000000) break;
                this.Method2791(a2 - 1, a7 | 0x800000);
            }
            case 79: 
            case 81: 
            case 83: 
            case 84: 
            case 85: 
            case 86: {
                this.Method2796(3);
            }
            case 80: 
            case 82: {
                this.Method2796(4);
            }
            case 87: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 170: 
            case 171: 
            case 172: 
            case 174: 
            case 176: 
            case 191: 
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                this.Method2796(1);
            }
            case 88: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 173: 
            case 175: {
                this.Method2796(2);
            }
            case 89: {
                int a6 = this.Method2795();
                this.Method2792(a6);
                this.Method2792(a6);
            }
            case 90: {
                int a6 = this.Method2795();
                int a7 = this.Method2795();
                this.Method2792(a6);
                this.Method2792(a7);
                this.Method2792(a6);
            }
            case 91: {
                int a6 = this.Method2795();
                int a7 = this.Method2795();
                int a8 = this.Method2795();
                this.Method2792(a6);
                this.Method2792(a8);
                this.Method2792(a7);
                this.Method2792(a6);
            }
            case 92: {
                int a6 = this.Method2795();
                int a7 = this.Method2795();
                this.Method2792(a7);
                this.Method2792(a6);
                this.Method2792(a7);
                this.Method2792(a6);
            }
            case 93: {
                int a6 = this.Method2795();
                int a7 = this.Method2795();
                int a8 = this.Method2795();
                this.Method2792(a7);
                this.Method2792(a6);
                this.Method2792(a8);
                this.Method2792(a7);
                this.Method2792(a6);
            }
            case 94: {
                int a6 = this.Method2795();
                int a7 = this.Method2795();
                int a8 = this.Method2795();
                int a9 = this.Method2795();
                this.Method2792(a7);
                this.Method2792(a6);
                this.Method2792(a9);
                this.Method2792(a8);
                this.Method2792(a7);
                this.Method2792(a6);
            }
            case 95: {
                int a6 = this.Method2795();
                int a7 = this.Method2795();
                this.Method2792(a6);
                this.Method2792(a7);
            }
            case 96: 
            case 100: 
            case 104: 
            case 108: 
            case 112: 
            case 120: 
            case 122: 
            case 124: 
            case 126: 
            case 128: 
            case 130: 
            case 136: 
            case 142: 
            case 149: 
            case 150: {
                this.Method2796(2);
                this.Method2792(0x1000001);
            }
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 127: 
            case 129: 
            case 131: {
                this.Method2796(4);
                this.Method2792(0x1000004);
                this.Method2792(0x1000000);
            }
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: 
            case 137: 
            case 144: {
                this.Method2796(2);
                this.Method2792(0x1000002);
            }
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: {
                this.Method2796(4);
                this.Method2792(0x1000003);
                this.Method2792(0x1000000);
            }
            case 121: 
            case 123: 
            case 125: {
                this.Method2796(3);
                this.Method2792(0x1000004);
                this.Method2792(0x1000000);
            }
            case 132: {
                this.Method2791(a2, 0x1000001);
            }
            case 133: 
            case 140: {
                this.Method2796(1);
                this.Method2792(0x1000004);
                this.Method2792(0x1000000);
            }
            case 134: {
                this.Method2796(1);
                this.Method2792(0x1000002);
            }
            case 135: 
            case 141: {
                this.Method2796(1);
                this.Method2792(0x1000003);
                this.Method2792(0x1000000);
            }
            case 139: 
            case 190: 
            case 193: {
                this.Method2796(1);
                this.Method2792(0x1000001);
            }
            case 148: 
            case 151: 
            case 152: {
                this.Method2796(4);
                this.Method2792(0x1000001);
            }
            case 168: 
            case 169: {
                throw new RuntimeException(Class276.Method2805(-20523, 13035));
            }
            case 178: {
                this.Method2793(a3, a4.Field1432);
            }
            case 179: {
                this.Method2797(a4.Field1432);
            }
            case 180: {
                this.Method2796(1);
                this.Method2793(a3, a4.Field1432);
            }
            case 181: {
                this.Method2797(a4.Field1432);
                this.Method2795();
            }
            case 182: 
            case 183: 
            case 184: 
            case 185: {
                this.Method2797(a4.Field1432);
                if (a != 184) {
                    int a10 = this.Method2795();
                    if (a == 183 && a4.Field1431.charAt(0) == '<') {
                        this.Method2798(a10);
                    }
                }
                this.Method2793(a3, a4.Field1432);
            }
            case 186: {
                this.Method2797(a4.Field1431);
                this.Method2793(a3, a4.Field1431);
            }
            case 187: {
                this.Method2792(0x1800000 | a3.Method1527(a4.Field1430, a2));
            }
            case 188: {
                this.Method2795();
                switch (a2) {
                    case 4: {
                        this.Method2792(0x11000009);
                    }
                    case 5: {
                        this.Method2792(0x1100000B);
                    }
                    case 8: {
                        this.Method2792(0x1100000A);
                    }
                    case 9: {
                        this.Method2792(0x1100000C);
                    }
                    case 10: {
                        this.Method2792(0x11000001);
                    }
                    case 6: {
                        this.Method2792(0x11000002);
                    }
                    case 7: {
                        this.Method2792(0x11000003);
                        break;
                    }
                }
                this.Method2792(0x11000004);
            }
            case 189: {
                String a11 = a4.Field1430;
                this.Method2795();
                if (a11.charAt(0) == '[') {
                    this.Method2793(a3, '[' + a11);
                }
                this.Method2792(0x11700000 | a3.Method1526(a11));
            }
            case 192: {
                String a11 = a4.Field1430;
                this.Method2795();
                if (a11.charAt(0) == '[') {
                    this.Method2793(a3, a11);
                }
                this.Method2792(0x1700000 | a3.Method1526(a11));
            }
            default: {
                this.Method2796(a2);
                this.Method2793(a3, a4.Field1430);
                break;
            }
        }
    }

    boolean Method2802(Class169 a, Class276 a2, int a3) {
        int a4;
        int a5;
        boolean a6 = false;
        int a7 = this.Field1505.length;
        int a8 = this.Field1506.length;
        if (a2.Field1505 == null) {
            a2.Field1505 = new int[a7];
            a6 = true;
        }
        for (a5 = 0; a5 < a7; ++a5) {
            if (this.Field1507 != null && a5 < this.Field1507.length) {
                int a9 = this.Field1507[a5];
                a4 = this.Field1505[a5];
            } else {
                a4 = this.Field1505[a5];
            }
            if (this.Field1511 != null) {
                a4 = this.Method2799(a, a4);
            }
            a6 |= Class276.Method2803(a, a4, a2.Field1505, a5);
        }
        for (a5 = 0; a5 < a7; ++a5) {
            a4 = this.Field1505[a5];
            a6 |= Class276.Method2803(a, a4, a2.Field1505, a5);
        }
        if (a2.Field1506 == null) {
            a2.Field1506 = new int[1];
            a6 = true;
        }
        return a6 |= Class276.Method2803(a, a3, a2.Field1506, 0);
    }

    private static boolean Method2803(Class169 a, int a2, int[] a3, int a4) {
        int a5 = a3[a4];
        if (a5 == a2) {
            return false;
        }
        if ((a2 & 0xFFFFFFF) == 0x1000005) {
            if (a5 == 0x1000005) {
                return false;
            }
            a2 = 0x1000005;
        }
        a3[a4] = a2;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                a = new String[8];
                a = 0;
                a = "\u0010\u0087f\r\u00d0<\u00ea\u00b9i\u008e4\u00fcpV\u00813K\u0086\r\u0017`\u00d1\u001bF\u00c2\u00ab\u00a1\u00e2/L\u00835\u00cc&\u007f\u00d3\u00a5\u00c7\\\u0094\u00c4\u00f0\u00bb\b+3\u008a\u00b1\u0091\u00e8\u009b\u0019g\u00a8\u0081%c\u00ae\u00f5xb\u00ac\u0093\u00df>\u00df\u00f3\u0010<L\u00e3t`\u0013\u00fc\\\u00ab2|sx\u00a6\u00ec\u00e9\u0010\u0090Yv\u00d6\u00d2G\u00aa\u00d6ac9OW\u00f9\u001f\u009c\u001b@\u00a2l\u00a9\u0091\u00a8\u00c2+l\u00dc\u00be\u00b4Y\u0001I\u00d95n\u0082\u00e1\u00aa\u0018J\u00e0\t9\u00ae\u0010\u00c2\u0094<o\u009bp\u00830D\u00bf\u009d\u00d4\u00c3\u008a\u008d\u00f2";
                a = "\u0010\u0087f\r\u00d0<\u00ea\u00b9i\u008e4\u00fcpV\u00813K\u0086\r\u0017`\u00d1\u001bF\u00c2\u00ab\u00a1\u00e2/L\u00835\u00cc&\u007f\u00d3\u00a5\u00c7\\\u0094\u00c4\u00f0\u00bb\b+3\u008a\u00b1\u0091\u00e8\u009b\u0019g\u00a8\u0081%c\u00ae\u00f5xb\u00ac\u0093\u00df>\u00df\u00f3\u0010<L\u00e3t`\u0013\u00fc\\\u00ab2|sx\u00a6\u00ec\u00e9\u0010\u0090Yv\u00d6\u00d2G\u00aa\u00d6ac9OW\u00f9\u001f\u009c\u001b@\u00a2l\u00a9\u0091\u00a8\u00c2+l\u00dc\u00be\u00b4Y\u0001I\u00d95n\u0082\u00e1\u00aa\u0018J\u00e0\t9\u00ae\u0010\u00c2\u0094<o\u009bp\u00830D\u00bf\u009d\u00d4\u00c3\u008a\u008d\u00f2".length();
                a = 15;
                a = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 98;
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
                    a = "\u000b\u00c3H\u00c8X\u00c9\u00b6J\u00af\u00bd\u008b\u00d5\u00b2`y\u00b8~\u000f\u00a6\u0080cy>\u009d\u00d2Z\u0082\u0092!\u00ca.1\u0016r\u00ccwG\u00das\u00ea;r\u007f\u0090\u00da\u0088\u00cadW\u00b67\u0081\u001f\u0080\u0097\u001e\u00e9\u001ei8\u00fd3\u00d1?\u0084\u00b3k\u00a6Y\u00bar\u00e9\u001a\u00c6\u0093\u00ec\u001d\u00c4=\u00cc|H\u009bG\nq5\u0015VP\u0085S\u000e>:\u0017s\u008c7/\u00b2\u001e\u0086\u00f7\u00be\u00a7i\u00a0\u00d6\u00c3\u00ea\u00f6\u0084\u0080G\u000b\u00d8\u00b3\u0094\r\u00e9\u0095\u00a7\u0003\u0080L\n15\u001dVW\u0084s\u000e\u00fa\u001aOWG\u0093\u0096\u0006\u00e90\u00c9I\u00a6\u0097\u0080\b\u00c1\u0015v\u00dbP\u000f\u00d6\u0011.l\\\u0012\u001a\u00b9\u00f3\u0002r8\u00d1P\u00c2\u00b8\u000fY\u00b8\u00b4Cj\u00b9\u009f\u007f\u008c\u00b7#-\u0094\u00b1\u00dcH\u0002\u009d{\u00a3\u009b\u00da\u00ea#\u00cc\u009f+\u00c6+\u00a6\u00fb@\u00a4\u001e\u0081\u00adi\u000by\u009a\u00ffg\u0091\u00b6\u008c\u00e1j\u00ecy\u00f3w\u00c1\u009b\u00e2\u00a2i\u001bU";
                    a = "\u000b\u00c3H\u00c8X\u00c9\u00b6J\u00af\u00bd\u008b\u00d5\u00b2`y\u00b8~\u000f\u00a6\u0080cy>\u009d\u00d2Z\u0082\u0092!\u00ca.1\u0016r\u00ccwG\u00das\u00ea;r\u007f\u0090\u00da\u0088\u00cadW\u00b67\u0081\u001f\u0080\u0097\u001e\u00e9\u001ei8\u00fd3\u00d1?\u0084\u00b3k\u00a6Y\u00bar\u00e9\u001a\u00c6\u0093\u00ec\u001d\u00c4=\u00cc|H\u009bG\nq5\u0015VP\u0085S\u000e>:\u0017s\u008c7/\u00b2\u001e\u0086\u00f7\u00be\u00a7i\u00a0\u00d6\u00c3\u00ea\u00f6\u0084\u0080G\u000b\u00d8\u00b3\u0094\r\u00e9\u0095\u00a7\u0003\u0080L\n15\u001dVW\u0084s\u000e\u00fa\u001aOWG\u0093\u0096\u0006\u00e90\u00c9I\u00a6\u0097\u0080\b\u00c1\u0015v\u00dbP\u000f\u00d6\u0011.l\\\u0012\u001a\u00b9\u00f3\u0002r8\u00d1P\u00c2\u00b8\u000fY\u00b8\u00b4Cj\u00b9\u009f\u007f\u008c\u00b7#-\u0094\u00b1\u00dcH\u0002\u009d{\u00a3\u009b\u00da\u00ea#\u00cc\u009f+\u00c6+\u00a6\u00fb@\u00a4\u001e\u0081\u00adi\u000by\u009a\u00ffg\u0091\u00b6\u008c\u00e1j\u00ecy\u00f3w\u00c1\u009b\u00e2\u00a2i\u001bU".length();
                    a = 29;
                    a = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 3;
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
                            v15 = 57;
                            break;
                        }
                        case 1: {
                            v15 = 22;
                            break;
                        }
                        case 2: {
                            v15 = 60;
                            break;
                        }
                        case 3: {
                            v15 = 61;
                            break;
                        }
                        case 4: {
                            v15 = 34;
                            break;
                        }
                        case 5: {
                            v15 = 53;
                            break;
                        }
                        default: {
                            v15 = 49;
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
        Class276.Field1512 = a;
        Class276.Field1513 = new String[8];
        var8_7 = new int[202];
        a = Class276.Method2805(-20525, -11326);
        for (a = 0; a < ((void)a).length; ++a) {
            a[a] = a.charAt(a) - 69;
        }
        Class276.Field1503 = a;
    }

    private static RuntimeException Method2804(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static String Method2805(int n, int n2) {
        int n3 = (n ^ 0xFFFFAFD4) & 0xFFFF;
        if (Field1513[n3] == null) {
            int n4;
            char[] cArray = Field1512[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 209;
                    break;
                }
                case 1: {
                    n4 = 47;
                    break;
                }
                case 2: {
                    n4 = 75;
                    break;
                }
                case 3: {
                    n4 = 232;
                    break;
                }
                case 4: {
                    n4 = 174;
                    break;
                }
                case 5: {
                    n4 = 24;
                    break;
                }
                case 6: {
                    n4 = 171;
                    break;
                }
                case 7: {
                    n4 = 9;
                    break;
                }
                case 8: {
                    n4 = 5;
                    break;
                }
                case 9: {
                    n4 = 249;
                    break;
                }
                case 10: {
                    n4 = 31;
                    break;
                }
                case 11: {
                    n4 = 166;
                    break;
                }
                case 12: {
                    n4 = 86;
                    break;
                }
                case 13: {
                    n4 = 62;
                    break;
                }
                case 14: {
                    n4 = 237;
                    break;
                }
                case 15: {
                    n4 = 191;
                    break;
                }
                case 16: {
                    n4 = 145;
                    break;
                }
                case 17: {
                    n4 = 182;
                    break;
                }
                case 18: {
                    n4 = 119;
                    break;
                }
                case 19: {
                    n4 = 136;
                    break;
                }
                case 20: {
                    n4 = 113;
                    break;
                }
                case 21: {
                    n4 = 115;
                    break;
                }
                case 22: {
                    n4 = 77;
                    break;
                }
                case 23: {
                    n4 = 121;
                    break;
                }
                case 24: {
                    n4 = 152;
                    break;
                }
                case 25: {
                    n4 = 89;
                    break;
                }
                case 26: {
                    n4 = 110;
                    break;
                }
                case 27: {
                    n4 = 255;
                    break;
                }
                case 28: {
                    n4 = 117;
                    break;
                }
                case 29: {
                    n4 = 240;
                    break;
                }
                case 30: {
                    n4 = 192;
                    break;
                }
                case 31: {
                    n4 = 45;
                    break;
                }
                case 32: {
                    n4 = 4;
                    break;
                }
                case 33: {
                    n4 = 8;
                    break;
                }
                case 34: {
                    n4 = 176;
                    break;
                }
                case 35: {
                    n4 = 94;
                    break;
                }
                case 36: {
                    n4 = 244;
                    break;
                }
                case 37: {
                    n4 = 29;
                    break;
                }
                case 38: {
                    n4 = 59;
                    break;
                }
                case 39: {
                    n4 = 35;
                    break;
                }
                case 40: {
                    n4 = 184;
                    break;
                }
                case 41: {
                    n4 = 50;
                    break;
                }
                case 42: {
                    n4 = 83;
                    break;
                }
                case 43: {
                    n4 = 46;
                    break;
                }
                case 44: {
                    n4 = 95;
                    break;
                }
                case 45: {
                    n4 = 160;
                    break;
                }
                case 46: {
                    n4 = 194;
                    break;
                }
                case 47: {
                    n4 = 183;
                    break;
                }
                case 48: {
                    n4 = 53;
                    break;
                }
                case 49: {
                    n4 = 67;
                    break;
                }
                case 50: {
                    n4 = 137;
                    break;
                }
                case 51: {
                    n4 = 6;
                    break;
                }
                case 52: {
                    n4 = 17;
                    break;
                }
                case 53: {
                    n4 = 87;
                    break;
                }
                case 54: {
                    n4 = 55;
                    break;
                }
                case 55: {
                    n4 = 140;
                    break;
                }
                case 56: {
                    n4 = 18;
                    break;
                }
                case 57: {
                    n4 = 36;
                    break;
                }
                case 58: {
                    n4 = 231;
                    break;
                }
                case 59: {
                    n4 = 180;
                    break;
                }
                case 60: {
                    n4 = 221;
                    break;
                }
                case 61: {
                    n4 = 41;
                    break;
                }
                case 62: {
                    n4 = 172;
                    break;
                }
                case 63: {
                    n4 = 88;
                    break;
                }
                case 64: {
                    n4 = 0;
                    break;
                }
                case 65: {
                    n4 = 61;
                    break;
                }
                case 66: {
                    n4 = 138;
                    break;
                }
                case 67: {
                    n4 = 60;
                    break;
                }
                case 68: {
                    n4 = 101;
                    break;
                }
                case 69: {
                    n4 = 33;
                    break;
                }
                case 70: {
                    n4 = 82;
                    break;
                }
                case 71: {
                    n4 = 203;
                    break;
                }
                case 72: {
                    n4 = 124;
                    break;
                }
                case 73: {
                    n4 = 168;
                    break;
                }
                case 74: {
                    n4 = 37;
                    break;
                }
                case 75: {
                    n4 = 78;
                    break;
                }
                case 76: {
                    n4 = 236;
                    break;
                }
                case 77: {
                    n4 = 216;
                    break;
                }
                case 78: {
                    n4 = 71;
                    break;
                }
                case 79: {
                    n4 = 217;
                    break;
                }
                case 80: {
                    n4 = 242;
                    break;
                }
                case 81: {
                    n4 = 206;
                    break;
                }
                case 82: {
                    n4 = 116;
                    break;
                }
                case 83: {
                    n4 = 20;
                    break;
                }
                case 84: {
                    n4 = 120;
                    break;
                }
                case 85: {
                    n4 = 111;
                    break;
                }
                case 86: {
                    n4 = 169;
                    break;
                }
                case 87: {
                    n4 = 179;
                    break;
                }
                case 88: {
                    n4 = 252;
                    break;
                }
                case 89: {
                    n4 = 12;
                    break;
                }
                case 90: {
                    n4 = 54;
                    break;
                }
                case 91: {
                    n4 = 233;
                    break;
                }
                case 92: {
                    n4 = 14;
                    break;
                }
                case 93: {
                    n4 = 150;
                    break;
                }
                case 94: {
                    n4 = 13;
                    break;
                }
                case 95: {
                    n4 = 219;
                    break;
                }
                case 96: {
                    n4 = 148;
                    break;
                }
                case 97: {
                    n4 = 40;
                    break;
                }
                case 98: {
                    n4 = 156;
                    break;
                }
                case 99: {
                    n4 = 90;
                    break;
                }
                case 100: {
                    n4 = 185;
                    break;
                }
                case 101: {
                    n4 = 11;
                    break;
                }
                case 102: {
                    n4 = 114;
                    break;
                }
                case 103: {
                    n4 = 155;
                    break;
                }
                case 104: {
                    n4 = 27;
                    break;
                }
                case 105: {
                    n4 = 69;
                    break;
                }
                case 106: {
                    n4 = 122;
                    break;
                }
                case 107: {
                    n4 = 85;
                    break;
                }
                case 108: {
                    n4 = 234;
                    break;
                }
                case 109: {
                    n4 = 201;
                    break;
                }
                case 110: {
                    n4 = 1;
                    break;
                }
                case 111: {
                    n4 = 23;
                    break;
                }
                case 112: {
                    n4 = 167;
                    break;
                }
                case 113: {
                    n4 = 220;
                    break;
                }
                case 114: {
                    n4 = 230;
                    break;
                }
                case 115: {
                    n4 = 247;
                    break;
                }
                case 116: {
                    n4 = 250;
                    break;
                }
                case 117: {
                    n4 = 196;
                    break;
                }
                case 118: {
                    n4 = 142;
                    break;
                }
                case 119: {
                    n4 = 93;
                    break;
                }
                case 120: {
                    n4 = 63;
                    break;
                }
                case 121: {
                    n4 = 186;
                    break;
                }
                case 122: {
                    n4 = 51;
                    break;
                }
                case 123: {
                    n4 = 16;
                    break;
                }
                case 124: {
                    n4 = 151;
                    break;
                }
                case 125: {
                    n4 = 211;
                    break;
                }
                case 126: {
                    n4 = 100;
                    break;
                }
                case 127: {
                    n4 = 43;
                    break;
                }
                case 128: {
                    n4 = 215;
                    break;
                }
                case 129: {
                    n4 = 208;
                    break;
                }
                case 130: {
                    n4 = 68;
                    break;
                }
                case 131: {
                    n4 = 39;
                    break;
                }
                case 132: {
                    n4 = 228;
                    break;
                }
                case 133: {
                    n4 = 235;
                    break;
                }
                case 134: {
                    n4 = 251;
                    break;
                }
                case 135: {
                    n4 = 135;
                    break;
                }
                case 136: {
                    n4 = 26;
                    break;
                }
                case 137: {
                    n4 = 224;
                    break;
                }
                case 138: {
                    n4 = 109;
                    break;
                }
                case 139: {
                    n4 = 144;
                    break;
                }
                case 140: {
                    n4 = 200;
                    break;
                }
                case 141: {
                    n4 = 210;
                    break;
                }
                case 142: {
                    n4 = 162;
                    break;
                }
                case 143: {
                    n4 = 154;
                    break;
                }
                case 144: {
                    n4 = 132;
                    break;
                }
                case 145: {
                    n4 = 207;
                    break;
                }
                case 146: {
                    n4 = 153;
                    break;
                }
                case 147: {
                    n4 = 30;
                    break;
                }
                case 148: {
                    n4 = 79;
                    break;
                }
                case 149: {
                    n4 = 52;
                    break;
                }
                case 150: {
                    n4 = 72;
                    break;
                }
                case 151: {
                    n4 = 19;
                    break;
                }
                case 152: {
                    n4 = 239;
                    break;
                }
                case 153: {
                    n4 = 178;
                    break;
                }
                case 154: {
                    n4 = 131;
                    break;
                }
                case 155: {
                    n4 = 134;
                    break;
                }
                case 156: {
                    n4 = 80;
                    break;
                }
                case 157: {
                    n4 = 164;
                    break;
                }
                case 158: {
                    n4 = 254;
                    break;
                }
                case 159: {
                    n4 = 10;
                    break;
                }
                case 160: {
                    n4 = 245;
                    break;
                }
                case 161: {
                    n4 = 2;
                    break;
                }
                case 162: {
                    n4 = 22;
                    break;
                }
                case 163: {
                    n4 = 32;
                    break;
                }
                case 164: {
                    n4 = 130;
                    break;
                }
                case 165: {
                    n4 = 139;
                    break;
                }
                case 166: {
                    n4 = 65;
                    break;
                }
                case 167: {
                    n4 = 146;
                    break;
                }
                case 168: {
                    n4 = 159;
                    break;
                }
                case 169: {
                    n4 = 253;
                    break;
                }
                case 170: {
                    n4 = 123;
                    break;
                }
                case 171: {
                    n4 = 105;
                    break;
                }
                case 172: {
                    n4 = 213;
                    break;
                }
                case 173: {
                    n4 = 163;
                    break;
                }
                case 174: {
                    n4 = 118;
                    break;
                }
                case 175: {
                    n4 = 157;
                    break;
                }
                case 176: {
                    n4 = 126;
                    break;
                }
                case 177: {
                    n4 = 147;
                    break;
                }
                case 178: {
                    n4 = 173;
                    break;
                }
                case 179: {
                    n4 = 193;
                    break;
                }
                case 180: {
                    n4 = 103;
                    break;
                }
                case 181: {
                    n4 = 66;
                    break;
                }
                case 182: {
                    n4 = 246;
                    break;
                }
                case 183: {
                    n4 = 195;
                    break;
                }
                case 184: {
                    n4 = 91;
                    break;
                }
                case 185: {
                    n4 = 106;
                    break;
                }
                case 186: {
                    n4 = 99;
                    break;
                }
                case 187: {
                    n4 = 58;
                    break;
                }
                case 188: {
                    n4 = 81;
                    break;
                }
                case 189: {
                    n4 = 84;
                    break;
                }
                case 190: {
                    n4 = 190;
                    break;
                }
                case 191: {
                    n4 = 102;
                    break;
                }
                case 192: {
                    n4 = 98;
                    break;
                }
                case 193: {
                    n4 = 49;
                    break;
                }
                case 194: {
                    n4 = 128;
                    break;
                }
                case 195: {
                    n4 = 223;
                    break;
                }
                case 196: {
                    n4 = 70;
                    break;
                }
                case 197: {
                    n4 = 165;
                    break;
                }
                case 198: {
                    n4 = 198;
                    break;
                }
                case 199: {
                    n4 = 149;
                    break;
                }
                case 200: {
                    n4 = 127;
                    break;
                }
                case 201: {
                    n4 = 57;
                    break;
                }
                case 202: {
                    n4 = 248;
                    break;
                }
                case 203: {
                    n4 = 222;
                    break;
                }
                case 204: {
                    n4 = 97;
                    break;
                }
                case 205: {
                    n4 = 56;
                    break;
                }
                case 206: {
                    n4 = 21;
                    break;
                }
                case 207: {
                    n4 = 34;
                    break;
                }
                case 208: {
                    n4 = 197;
                    break;
                }
                case 209: {
                    n4 = 188;
                    break;
                }
                case 210: {
                    n4 = 241;
                    break;
                }
                case 211: {
                    n4 = 141;
                    break;
                }
                case 212: {
                    n4 = 28;
                    break;
                }
                case 213: {
                    n4 = 15;
                    break;
                }
                case 214: {
                    n4 = 170;
                    break;
                }
                case 215: {
                    n4 = 92;
                    break;
                }
                case 216: {
                    n4 = 42;
                    break;
                }
                case 217: {
                    n4 = 199;
                    break;
                }
                case 218: {
                    n4 = 76;
                    break;
                }
                case 219: {
                    n4 = 3;
                    break;
                }
                case 220: {
                    n4 = 125;
                    break;
                }
                case 221: {
                    n4 = 64;
                    break;
                }
                case 222: {
                    n4 = 133;
                    break;
                }
                case 223: {
                    n4 = 73;
                    break;
                }
                case 224: {
                    n4 = 161;
                    break;
                }
                case 225: {
                    n4 = 158;
                    break;
                }
                case 226: {
                    n4 = 96;
                    break;
                }
                case 227: {
                    n4 = 129;
                    break;
                }
                case 228: {
                    n4 = 229;
                    break;
                }
                case 229: {
                    n4 = 202;
                    break;
                }
                case 230: {
                    n4 = 187;
                    break;
                }
                case 231: {
                    n4 = 205;
                    break;
                }
                case 232: {
                    n4 = 143;
                    break;
                }
                case 233: {
                    n4 = 227;
                    break;
                }
                case 234: {
                    n4 = 74;
                    break;
                }
                case 235: {
                    n4 = 108;
                    break;
                }
                case 236: {
                    n4 = 48;
                    break;
                }
                case 237: {
                    n4 = 104;
                    break;
                }
                case 238: {
                    n4 = 25;
                    break;
                }
                case 239: {
                    n4 = 238;
                    break;
                }
                case 240: {
                    n4 = 181;
                    break;
                }
                case 241: {
                    n4 = 7;
                    break;
                }
                case 242: {
                    n4 = 204;
                    break;
                }
                case 243: {
                    n4 = 226;
                    break;
                }
                case 244: {
                    n4 = 175;
                    break;
                }
                case 245: {
                    n4 = 214;
                    break;
                }
                case 246: {
                    n4 = 107;
                    break;
                }
                case 247: {
                    n4 = 218;
                    break;
                }
                case 248: {
                    n4 = 225;
                    break;
                }
                case 249: {
                    n4 = 212;
                    break;
                }
                case 250: {
                    n4 = 112;
                    break;
                }
                case 251: {
                    n4 = 243;
                    break;
                }
                case 252: {
                    n4 = 189;
                    break;
                }
                case 253: {
                    n4 = 38;
                    break;
                }
                case 254: {
                    n4 = 44;
                    break;
                }
                default: {
                    n4 = 177;
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
            Class276.Field1513[n3] = new String(cArray).intern();
        }
        return Field1513[n3];
    }
}