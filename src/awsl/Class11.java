/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package awsl;

import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class37;
import awsl.Class45;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import obfuscate.b;

public class Class11
extends Class267 {
    public List Field181;
    public List Field182;
    private List Field183;
    public Map Field184;
    private int Field185;
    private int Field186;
    private String Field187;

    public Class11(String a, int a2, String a3, String a4, Class267 a5) {
        this(327680, a, a2, a3, a4, a5);
        if (this.getClass() != Class11.class) {
            throw new IllegalStateException();
        }
    }

    protected Class11(int a2, String a3, int a4, String a5, String a6, Class267 a7) {
        super(a2, a7);
        this.Field187 = a3;
        this.Field181 = new ArrayList();
        this.Field182 = new ArrayList();
        this.Field184 = new HashMap();
        if ((a4 & 8) == 0) {
            if ("<init>".equals((Object)a5)) {
                this.Field181.Method2530((Object)Class45.Field402);
            } else {
                this.Field181.Method2530((Object)a3);
            }
        }
        b[] a8 = b.Method3211(a6);
        block7: for (int a9 = 0; a9 < a8.length; ++a9) {
            b a10 = a8[a9];
            switch (a10.Method3217()) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    this.Field181.Method2530((Object)Class45.Field397);
                    continue block7;
                }
                case 6: {
                    this.Field181.Method2530((Object)Class45.Field398);
                    continue block7;
                }
                case 7: {
                    this.Field181.Method2530((Object)Class45.Field400);
                    this.Field181.Method2530((Object)Class45.Field396);
                    continue block7;
                }
                case 8: {
                    this.Field181.Method2530((Object)Class45.Field399);
                    this.Field181.Method2530((Object)Class45.Field396);
                    continue block7;
                }
                case 9: {
                    this.Field181.Method2530((Object)a8[a9].Method3225());
                    continue block7;
                }
                default: {
                    this.Field181.Method2530((Object)a8[a9].Method3221());
                }
            }
        }
        this.Field186 = this.Field181.Method1799();
    }

    @Override
    public void Method1845(int a2, int a3, Object[] a4, int a5, Object[] a6) {
        if (a2 != -1) {
            throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        if (this.Field1460 != null) {
            this.Field1460.Method1845(a2, a3, a4, a5, a6);
        }
        if (this.Field181 != null) {
            this.Field181.clear();
            this.Field182.clear();
        } else {
            this.Field181 = new ArrayList();
            this.Field182 = new ArrayList();
        }
        Class11.Method3449(a3, a4, this.Field181);
        Class11.Method3449(a5, a6, this.Field182);
        this.Field185 = Math.max((int)this.Field185, (int)this.Field182.Method1799());
    }

    private static void Method3449(int a2, Object[] a3, List a4) {
        for (int a5 = 0; a5 < a2; ++a5) {
            Object a6 = a3[a5];
            a4.Method2530(a6);
            if (a6 != Class45.Field400 && a6 != Class45.Field399) continue;
            a4.Method2530((Object)Class45.Field396);
        }
    }

    @Override
    public void Method1948(int a2) {
        block1: {
            if (this.Field1460 != null) {
                this.Field1460.Method1948(a2);
            }
            this.Method3452(a2, 0, null);
            if ((a2 < 172 || a2 > 177) && a2 != 191) break block1;
            this.Field181 = null;
            this.Field182 = null;
        }
    }

    @Override
    public void Method854(int a2, int a3) {
        if (this.Field1460 != null) {
            this.Field1460.Method854(a2, a3);
        }
        this.Method3452(a2, a3, null);
    }

    @Override
    public void Method1840(int a2, int a3) {
        if (this.Field1460 != null) {
            this.Field1460.Method1840(a2, a3);
        }
        this.Method3452(a2, a3, null);
    }

    @Override
    public void Method1952(int a2, String a3) {
        if (a2 == 187) {
            if (this.Field183 == null) {
                Class264 a4 = new Class264();
                this.Field183 = new ArrayList(3);
                this.Field183.Method2530((Object)a4);
                if (this.Field1460 != null) {
                    this.Field1460.Method1947(a4);
                }
            }
            for (int a5 = 0; a5 < this.Field183.Method1799(); ++a5) {
                this.Field184.put(this.Field183.get(a5), (Object)a3);
            }
        }
        if (this.Field1460 != null) {
            this.Field1460.Method1952(a2, a3);
        }
        this.Method3452(a2, 0, a3);
    }

    @Override
    public void Method1949(int a2, String a3, String a4, String a5) {
        if (this.Field1460 != null) {
            this.Field1460.Method1949(a2, a3, a4, a5);
        }
        this.Method3452(a2, 0, a5);
    }

    @Override
    @Deprecated
    public void Method1953(int a2, String a3, String a4, String a5) {
        if (this.Field1459 >= 327680) {
            super.Method1953(a2, a3, a4, a5);
            return;
        }
        this.Method1955(a2, a3, a4, a5, a2 == 185);
    }

    @Override
    public void Method1954(int a2, String a3, String a4, String a5, boolean a6) {
        if (this.Field1459 < 327680) {
            super.Method1954(a2, a3, a4, a5, a6);
            return;
        }
        this.Method1955(a2, a3, a4, a5, a6);
    }

    private void Method1955(int a2, String a3, String a4, String a5, boolean a6) {
        if (this.Field1460 != null) {
            this.Field1460.Method1954(a2, a3, a4, a5, a6);
        }
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
        this.Method3451(a5);
        if (a2 != 184) {
            Object a7 = this.Method1963();
            if (a2 == 183 && a4.charAt(0) == '<') {
                int a8;
                Object a9 = a7 == Class45.Field402 ? this.Field187 : this.Field184.Method2665(a7);
                for (a8 = 0; a8 < this.Field181.Method1799(); ++a8) {
                    if (this.Field181.get(a8) != a7) continue;
                    this.Field181.set(a8, a9);
                }
                for (a8 = 0; a8 < this.Field182.Method1799(); ++a8) {
                    if (this.Field182.get(a8) != a7) continue;
                    this.Field182.set(a8, a9);
                }
            }
        }
        this.Method1873(a5);
        this.Field183 = null;
    }

    @Override
    public void Method1956(String a2, String a3, Class279 a4, Object[] a5) {
        if (this.Field1460 != null) {
            this.Field1460.Method1956(a2, a3, a4, a5);
        }
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
        this.Method3451(a3);
        this.Method1873(a3);
        this.Field183 = null;
    }

    @Override
    public void Method1957(int a2, Class264 a3) {
        block1: {
            if (this.Field1460 != null) {
                this.Field1460.Method1957(a2, a3);
            }
            this.Method3452(a2, 0, null);
            if (a2 != 167) break block1;
            this.Field181 = null;
            this.Field182 = null;
        }
    }

    @Override
    public void Method1947(Class264 a2) {
        if (this.Field1460 != null) {
            this.Field1460.Method1947(a2);
        }
        if (this.Field183 == null) {
            this.Field183 = new ArrayList(3);
        }
        this.Field183.Method2530((Object)a2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void Method1950(Object a2) {
        if (this.Field1460 != null) {
            this.Field1460.Method1950(a2);
        }
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
        if (a2 instanceof Integer) {
            this.Method1965(Class45.Field397);
        } else if (a2 instanceof Long) {
            this.Method1965(Class45.Field400);
            this.Method1965(Class45.Field396);
        } else if (a2 instanceof Float) {
            this.Method1965(Class45.Field398);
        } else if (a2 instanceof Double) {
            this.Method1965(Class45.Field399);
            this.Method1965(Class45.Field396);
        } else if (a2 instanceof String) {
            this.Method1965("java/lang/String");
        } else if (a2 instanceof b) {
            int a3 = ((b)a2).Method3217();
            if (a3 == 10 || a3 == 9) {
                this.Method1965("java/lang/Class");
            } else {
                if (a3 != 11) throw new IllegalArgumentException();
                this.Method1965("java/lang/invoke/MethodType");
            }
        } else {
            if (!(a2 instanceof Class279)) throw new IllegalArgumentException();
            this.Method1965("java/lang/invoke/MethodHandle");
        }
        this.Field183 = null;
    }

    @Override
    public void Method1841(int a2, int a3) {
        if (this.Field1460 != null) {
            this.Field1460.Method1841(a2, a3);
        }
        this.Method3452(132, a2, null);
    }

    @Override
    public void Method1959(int a2, int a3, Class264 a4, Class264[] a5) {
        if (this.Field1460 != null) {
            this.Field1460.Method1959(a2, a3, a4, a5);
        }
        this.Method3452(170, 0, null);
        this.Field181 = null;
        this.Field182 = null;
    }

    @Override
    public void Method1958(Class264 a2, int[] a3, Class264[] a4) {
        if (this.Field1460 != null) {
            this.Field1460.Method1958(a2, a3, a4);
        }
        this.Method3452(171, 0, null);
        this.Field181 = null;
        this.Field182 = null;
    }

    @Override
    public void Method1951(String a2, int a3) {
        if (this.Field1460 != null) {
            this.Field1460.Method1951(a2, a3);
        }
        this.Method3452(197, a3, a2);
    }

    @Override
    public void Method1842(int a2, int a3) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field185 = Math.max((int)this.Field185, (int)a2);
            this.Field186 = Math.max((int)this.Field186, (int)a3);
            this.Field1460.Method1842(this.Field185, this.Field186);
        }
    }

    private Object Method3450(int a2) {
        this.Field186 = Math.max((int)this.Field186, (int)(a2 + 1));
        return a2 < this.Field181.Method1799() ? this.Field181.get(a2) : Class45.Field396;
    }

    private void Method1849(int a2, Object a3) {
        this.Field186 = Math.max((int)this.Field186, (int)(a2 + 1));
        while (a2 >= this.Field181.Method1799()) {
            this.Field181.Method2530((Object)Class45.Field396);
        }
        this.Field181.set(a2, a3);
    }

    private void Method1965(Object a2) {
        this.Field182.Method2530(a2);
        this.Field185 = Math.max((int)this.Field185, (int)this.Field182.Method1799());
    }

    private void Method1873(String a2) {
        int a3 = a2.charAt(0) == '(' ? a2.indexOf(41) + 1 : 0;
        switch (a2.charAt(a3)) {
            case 'V': {
                return;
            }
            case 'B': 
            case 'C': 
            case 'I': 
            case 'S': 
            case 'Z': {
                this.Method1965(Class45.Field397);
                return;
            }
            case 'F': {
                this.Method1965(Class45.Field398);
                return;
            }
            case 'J': {
                this.Method1965(Class45.Field400);
                this.Method1965(Class45.Field396);
                return;
            }
            case 'D': {
                this.Method1965(Class45.Field399);
                this.Method1965(Class45.Field396);
                return;
            }
            case '[': {
                this.Method1965(a2);
                break;
            }
            default: {
                this.Method1965(a2.substring(1, a2.length() - 1));
                break;
            }
        }
    }

    private Object Method1963() {
        return this.Field182.remove(this.Field182.Method1799() - 1);
    }

    private void Method1869(int a2) {
        int a3 = this.Field182.Method1799();
        int a4 = a3 - a2;
        for (int a5 = a3 - 1; a5 >= a4; --a5) {
            this.Field182.remove(a5);
        }
    }

    private void Method3451(String a2) {
        char a3 = a2.charAt(0);
        if (a3 == '(') {
            int a4 = 0;
            b[] a5 = b.Method3211(a2);
            for (int a6 = 0; a6 < a5.length; ++a6) {
                a4 += a5[a6].Method3233();
            }
            this.Method1869(a4);
        } else if (a3 == 'J' || a3 == 'D') {
            this.Method1869(2);
        } else {
            this.Method1869(1);
        }
    }

    private void Method3452(int a2, int a3, String a4) {
        boolean a5 = Class37.Method3383();
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
        switch (a2) {
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
                this.Method1965(Class45.Field401);
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 16: 
            case 17: {
                this.Method1965(Class45.Field397);
            }
            case 9: 
            case 10: {
                this.Method1965(Class45.Field400);
                this.Method1965(Class45.Field396);
            }
            case 11: 
            case 12: 
            case 13: {
                this.Method1965(Class45.Field398);
            }
            case 14: 
            case 15: {
                this.Method1965(Class45.Field399);
                this.Method1965(Class45.Field396);
            }
            case 21: 
            case 23: 
            case 25: {
                this.Method1965(this.Method3450(a3));
            }
            case 22: 
            case 24: {
                this.Method1965(this.Method3450(a3));
                this.Method1965(Class45.Field396);
            }
            case 46: 
            case 51: 
            case 52: 
            case 53: {
                this.Method1869(2);
                this.Method1965(Class45.Field397);
            }
            case 47: 
            case 143: {
                this.Method1869(2);
                this.Method1965(Class45.Field400);
                this.Method1965(Class45.Field396);
            }
            case 48: {
                this.Method1869(2);
                this.Method1965(Class45.Field398);
            }
            case 49: 
            case 138: {
                this.Method1869(2);
                this.Method1965(Class45.Field399);
                this.Method1965(Class45.Field396);
            }
            case 50: {
                this.Method1869(1);
                Object a6 = this.Method1963();
                if (a6 instanceof String) {
                    this.Method1873(((String)a6).substring(1));
                }
                this.Method1965("java/lang/Object");
            }
            case 54: 
            case 56: 
            case 58: {
                Object a6 = this.Method1963();
                this.Method1849(a3, a6);
                Object a7 = this.Method3450(a3 - 1);
                if (a7 != Class45.Field400 && a7 != Class45.Field399) break;
                this.Method1849(a3 - 1, Class45.Field396);
            }
            case 55: 
            case 57: {
                this.Method1869(1);
                Object a6 = this.Method1963();
                this.Method1849(a3, a6);
                this.Method1849(a3 + 1, Class45.Field396);
                Object a7 = this.Method3450(a3 - 1);
                if (a7 != Class45.Field400 && a7 != Class45.Field399) break;
                this.Method1849(a3 - 1, Class45.Field396);
            }
            case 79: 
            case 81: 
            case 83: 
            case 84: 
            case 85: 
            case 86: {
                this.Method1869(3);
            }
            case 80: 
            case 82: {
                this.Method1869(4);
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
                this.Method1869(1);
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
                this.Method1869(2);
            }
            case 89: {
                Object a6 = this.Method1963();
                this.Method1965(a6);
                this.Method1965(a6);
            }
            case 90: {
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                this.Method1965(a6);
                this.Method1965(a7);
                this.Method1965(a6);
            }
            case 91: {
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                Object a8 = this.Method1963();
                this.Method1965(a6);
                this.Method1965(a8);
                this.Method1965(a7);
                this.Method1965(a6);
            }
            case 92: {
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                this.Method1965(a7);
                this.Method1965(a6);
                this.Method1965(a7);
                this.Method1965(a6);
            }
            case 93: {
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                Object a8 = this.Method1963();
                this.Method1965(a7);
                this.Method1965(a6);
                this.Method1965(a8);
                this.Method1965(a7);
                this.Method1965(a6);
            }
            case 94: {
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                Object a8 = this.Method1963();
                Object a9 = this.Method1963();
                this.Method1965(a7);
                this.Method1965(a6);
                this.Method1965(a9);
                this.Method1965(a8);
                this.Method1965(a7);
                this.Method1965(a6);
            }
            case 95: {
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                this.Method1965(a6);
                this.Method1965(a7);
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
                this.Method1869(2);
                this.Method1965(Class45.Field397);
            }
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 127: 
            case 129: 
            case 131: {
                this.Method1869(4);
                this.Method1965(Class45.Field400);
                this.Method1965(Class45.Field396);
            }
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: 
            case 137: 
            case 144: {
                this.Method1869(2);
                this.Method1965(Class45.Field398);
            }
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: {
                this.Method1869(4);
                this.Method1965(Class45.Field399);
                this.Method1965(Class45.Field396);
            }
            case 121: 
            case 123: 
            case 125: {
                this.Method1869(3);
                this.Method1965(Class45.Field400);
                this.Method1965(Class45.Field396);
            }
            case 132: {
                this.Method1849(a3, Class45.Field397);
            }
            case 133: 
            case 140: {
                this.Method1869(1);
                this.Method1965(Class45.Field400);
                this.Method1965(Class45.Field396);
            }
            case 134: {
                this.Method1869(1);
                this.Method1965(Class45.Field398);
            }
            case 135: 
            case 141: {
                this.Method1869(1);
                this.Method1965(Class45.Field399);
                this.Method1965(Class45.Field396);
            }
            case 139: 
            case 190: 
            case 193: {
                this.Method1869(1);
                this.Method1965(Class45.Field397);
            }
            case 148: 
            case 151: 
            case 152: {
                this.Method1869(4);
                this.Method1965(Class45.Field397);
            }
            case 168: 
            case 169: {
                throw new RuntimeException("JSR/RET are not supported");
            }
            case 178: {
                this.Method1873(a4);
            }
            case 179: {
                this.Method3451(a4);
            }
            case 180: {
                this.Method1869(1);
                this.Method1873(a4);
            }
            case 181: {
                this.Method3451(a4);
                this.Method1963();
            }
            case 187: {
                this.Method1965(this.Field183.get(0));
            }
            case 188: {
                this.Method1963();
                switch (a3) {
                    case 4: {
                        this.Method1873("[Z");
                    }
                    case 5: {
                        this.Method1873("[C");
                    }
                    case 8: {
                        this.Method1873("[B");
                    }
                    case 9: {
                        this.Method1873("[S");
                    }
                    case 10: {
                        this.Method1873("[I");
                    }
                    case 6: {
                        this.Method1873("[F");
                    }
                    case 7: {
                        this.Method1873("[D");
                        break;
                    }
                }
                this.Method1873("[J");
            }
            case 189: {
                this.Method1963();
                this.Method1873("[" + b.Method3205(a4));
            }
            case 192: {
                this.Method1963();
                this.Method1873(b.Method3205(a4).Method3225());
            }
            default: {
                this.Method1869(a3);
                this.Method1873(a4);
                break;
            }
        }
        this.Field183 = null;
    }

    private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}