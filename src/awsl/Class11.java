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
import awsl.Class46;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    protected Class11(int a, String a2, int a3, String a4, String a5, Class267 a6) {
        super(a, a6);
        this.Field187 = a2;
        this.Field181 = new ArrayList();
        this.Field182 = new ArrayList();
        this.Field184 = new HashMap();
        if ((a3 & 8) == 0) {
            if ("<init>".equals((Object)a4)) {
                this.Field181.Method2530((Object)Class45.Field402);
            } else {
                this.Field181.Method2530((Object)a2);
            }
        }
        Class46[] a7 = Class46.Method3211(a5);
        block7: for (int a8 = 0; a8 < a7.length; ++a8) {
            Class46 a9 = a7[a8];
            switch (a9.Method3217()) {
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
                    this.Field181.Method2530((Object)a7[a8].Method3225());
                    continue block7;
                }
                default: {
                    this.Field181.Method2530((Object)a7[a8].Method3221());
                }
            }
        }
        this.Field186 = this.Field181.Method1799();
    }

    @Override
    public void Method1845(int a, int a2, Object[] a3, int a4, Object[] a5) {
        if (a != -1) {
            throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        if (this.Field1460 != null) {
            this.Field1460.Method1845(a, a2, a3, a4, a5);
        }
        if (this.Field181 != null) {
            this.Field181.clear();
            this.Field182.clear();
        } else {
            this.Field181 = new ArrayList();
            this.Field182 = new ArrayList();
        }
        Class11.Method3449(a2, a3, this.Field181);
        Class11.Method3449(a4, a5, this.Field182);
        this.Field185 = Math.max((int)this.Field185, (int)this.Field182.Method1799());
    }

    private static void Method3449(int a, Object[] a2, List a3) {
        for (int a4 = 0; a4 < a; ++a4) {
            Object a5 = a2[a4];
            a3.Method2530(a5);
            if (a5 != Class45.Field400 && a5 != Class45.Field399) continue;
            a3.Method2530((Object)Class45.Field396);
        }
    }

    @Override
    public void Method1948(int a) {
        block1: {
            if (this.Field1460 != null) {
                this.Field1460.Method1948(a);
            }
            this.Method3452(a, 0, null);
            if ((a < 172 || a > 177) && a != 191) break block1;
            this.Field181 = null;
            this.Field182 = null;
        }
    }

    @Override
    public void Method854(int a, int a2) {
        if (this.Field1460 != null) {
            this.Field1460.Method854(a, a2);
        }
        this.Method3452(a, a2, null);
    }

    @Override
    public void Method1840(int a, int a2) {
        if (this.Field1460 != null) {
            this.Field1460.Method1840(a, a2);
        }
        this.Method3452(a, a2, null);
    }

    @Override
    public void Method1952(int a, String a2) {
        if (a == 187) {
            if (this.Field183 == null) {
                Class264 a3 = new Class264();
                this.Field183 = new ArrayList(3);
                this.Field183.Method2530((Object)a3);
                if (this.Field1460 != null) {
                    this.Field1460.Method1947(a3);
                }
            }
            for (int a4 = 0; a4 < this.Field183.Method1799(); ++a4) {
                this.Field184.put(this.Field183.get(a4), (Object)a2);
            }
        }
        if (this.Field1460 != null) {
            this.Field1460.Method1952(a, a2);
        }
        this.Method3452(a, 0, a2);
    }

    @Override
    public void Method1949(int a, String a2, String a3, String a4) {
        if (this.Field1460 != null) {
            this.Field1460.Method1949(a, a2, a3, a4);
        }
        this.Method3452(a, 0, a4);
    }

    @Override
    @Deprecated
    public void Method1953(int a, String a2, String a3, String a4) {
        if (this.Field1459 >= 327680) {
            super.Method1953(a, a2, a3, a4);
            return;
        }
        this.Method1955(a, a2, a3, a4, a == 185);
    }

    @Override
    public void Method1954(int a, String a2, String a3, String a4, boolean a5) {
        if (this.Field1459 < 327680) {
            super.Method1954(a, a2, a3, a4, a5);
            return;
        }
        this.Method1955(a, a2, a3, a4, a5);
    }

    private void Method1955(int a, String a2, String a3, String a4, boolean a5) {
        if (this.Field1460 != null) {
            this.Field1460.Method1954(a, a2, a3, a4, a5);
        }
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
        this.Method3451(a4);
        if (a != 184) {
            Object a6 = this.Method1963();
            if (a == 183 && a3.charAt(0) == '<') {
                int a7;
                Object a8 = a6 == Class45.Field402 ? this.Field187 : this.Field184.Method2665(a6);
                for (a7 = 0; a7 < this.Field181.Method1799(); ++a7) {
                    if (this.Field181.get(a7) != a6) continue;
                    this.Field181.set(a7, a8);
                }
                for (a7 = 0; a7 < this.Field182.Method1799(); ++a7) {
                    if (this.Field182.get(a7) != a6) continue;
                    this.Field182.set(a7, a8);
                }
            }
        }
        this.Method1873(a4);
        this.Field183 = null;
    }

    @Override
    public void Method1956(String a, String a2, Class279 a3, Object[] a4) {
        if (this.Field1460 != null) {
            this.Field1460.Method1956(a, a2, a3, a4);
        }
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
        this.Method3451(a2);
        this.Method1873(a2);
        this.Field183 = null;
    }

    @Override
    public void Method1957(int a, Class264 a2) {
        block1: {
            if (this.Field1460 != null) {
                this.Field1460.Method1957(a, a2);
            }
            this.Method3452(a, 0, null);
            if (a != 167) break block1;
            this.Field181 = null;
            this.Field182 = null;
        }
    }

    @Override
    public void Method1947(Class264 a) {
        if (this.Field1460 != null) {
            this.Field1460.Method1947(a);
        }
        if (this.Field183 == null) {
            this.Field183 = new ArrayList(3);
        }
        this.Field183.Method2530((Object)a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void Method1950(Object a) {
        if (this.Field1460 != null) {
            this.Field1460.Method1950(a);
        }
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
        if (a instanceof Integer) {
            this.Method1965(Class45.Field397);
        } else if (a instanceof Long) {
            this.Method1965(Class45.Field400);
            this.Method1965(Class45.Field396);
        } else if (a instanceof Float) {
            this.Method1965(Class45.Field398);
        } else if (a instanceof Double) {
            this.Method1965(Class45.Field399);
            this.Method1965(Class45.Field396);
        } else if (a instanceof String) {
            this.Method1965("java/lang/String");
        } else if (a instanceof Class46) {
            int a2 = ((Class46)a).Method3217();
            if (a2 == 10 || a2 == 9) {
                this.Method1965("java/lang/Class");
            } else {
                if (a2 != 11) throw new IllegalArgumentException();
                this.Method1965("java/lang/invoke/MethodType");
            }
        } else {
            if (!(a instanceof Class279)) throw new IllegalArgumentException();
            this.Method1965("java/lang/invoke/MethodHandle");
        }
        this.Field183 = null;
    }

    @Override
    public void Method1841(int a, int a2) {
        if (this.Field1460 != null) {
            this.Field1460.Method1841(a, a2);
        }
        this.Method3452(132, a, null);
    }

    @Override
    public void Method1959(int a, int a2, Class264 a3, Class264[] a4) {
        if (this.Field1460 != null) {
            this.Field1460.Method1959(a, a2, a3, a4);
        }
        this.Method3452(170, 0, null);
        this.Field181 = null;
        this.Field182 = null;
    }

    @Override
    public void Method1958(Class264 a, int[] a2, Class264[] a3) {
        if (this.Field1460 != null) {
            this.Field1460.Method1958(a, a2, a3);
        }
        this.Method3452(171, 0, null);
        this.Field181 = null;
        this.Field182 = null;
    }

    @Override
    public void Method1951(String a, int a2) {
        if (this.Field1460 != null) {
            this.Field1460.Method1951(a, a2);
        }
        this.Method3452(197, a2, a);
    }

    @Override
    public void Method1842(int a, int a2) {
        block0: {
            if (this.Field1460 == null) break block0;
            this.Field185 = Math.max((int)this.Field185, (int)a);
            this.Field186 = Math.max((int)this.Field186, (int)a2);
            this.Field1460.Method1842(this.Field185, this.Field186);
        }
    }

    private Object Method3450(int a) {
        this.Field186 = Math.max((int)this.Field186, (int)(a + 1));
        return a < this.Field181.Method1799() ? this.Field181.get(a) : Class45.Field396;
    }

    private void Method1849(int a, Object a2) {
        this.Field186 = Math.max((int)this.Field186, (int)(a + 1));
        while (a >= this.Field181.Method1799()) {
            this.Field181.Method2530((Object)Class45.Field396);
        }
        this.Field181.set(a, a2);
    }

    private void Method1965(Object a) {
        this.Field182.Method2530(a);
        this.Field185 = Math.max((int)this.Field185, (int)this.Field182.Method1799());
    }

    private void Method1873(String a) {
        int a2 = a.charAt(0) == '(' ? a.indexOf(41) + 1 : 0;
        switch (a.charAt(a2)) {
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
                this.Method1965(a);
                break;
            }
            default: {
                this.Method1965(a.substring(1, a.length() - 1));
                break;
            }
        }
    }

    private Object Method1963() {
        return this.Field182.remove(this.Field182.Method1799() - 1);
    }

    private void Method1869(int a) {
        int a2 = this.Field182.Method1799();
        int a3 = a2 - a;
        for (int a4 = a2 - 1; a4 >= a3; --a4) {
            this.Field182.remove(a4);
        }
    }

    private void Method3451(String a) {
        char a2 = a.charAt(0);
        if (a2 == '(') {
            int a3 = 0;
            Class46[] a4 = Class46.Method3211(a);
            for (int a5 = 0; a5 < a4.length; ++a5) {
                a3 += a4[a5].Method3233();
            }
            this.Method1869(a3);
        } else if (a2 == 'J' || a2 == 'D') {
            this.Method1869(2);
        } else {
            this.Method1869(1);
        }
    }

    private void Method3452(int a, int a2, String a3) {
        boolean a4 = Class37.Method3383();
        if (this.Field181 == null) {
            this.Field183 = null;
            return;
        }
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
                this.Method1965(this.Method3450(a2));
            }
            case 22: 
            case 24: {
                this.Method1965(this.Method3450(a2));
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
                Object a5 = this.Method1963();
                if (a5 instanceof String) {
                    this.Method1873(((String)a5).substring(1));
                }
                this.Method1965("java/lang/Object");
            }
            case 54: 
            case 56: 
            case 58: {
                Object a5 = this.Method1963();
                this.Method1849(a2, a5);
                Object a6 = this.Method3450(a2 - 1);
                if (a6 != Class45.Field400 && a6 != Class45.Field399) break;
                this.Method1849(a2 - 1, Class45.Field396);
            }
            case 55: 
            case 57: {
                this.Method1869(1);
                Object a5 = this.Method1963();
                this.Method1849(a2, a5);
                this.Method1849(a2 + 1, Class45.Field396);
                Object a6 = this.Method3450(a2 - 1);
                if (a6 != Class45.Field400 && a6 != Class45.Field399) break;
                this.Method1849(a2 - 1, Class45.Field396);
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
                Object a5 = this.Method1963();
                this.Method1965(a5);
                this.Method1965(a5);
            }
            case 90: {
                Object a5 = this.Method1963();
                Object a6 = this.Method1963();
                this.Method1965(a5);
                this.Method1965(a6);
                this.Method1965(a5);
            }
            case 91: {
                Object a5 = this.Method1963();
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                this.Method1965(a5);
                this.Method1965(a7);
                this.Method1965(a6);
                this.Method1965(a5);
            }
            case 92: {
                Object a5 = this.Method1963();
                Object a6 = this.Method1963();
                this.Method1965(a6);
                this.Method1965(a5);
                this.Method1965(a6);
                this.Method1965(a5);
            }
            case 93: {
                Object a5 = this.Method1963();
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                this.Method1965(a6);
                this.Method1965(a5);
                this.Method1965(a7);
                this.Method1965(a6);
                this.Method1965(a5);
            }
            case 94: {
                Object a5 = this.Method1963();
                Object a6 = this.Method1963();
                Object a7 = this.Method1963();
                Object a8 = this.Method1963();
                this.Method1965(a6);
                this.Method1965(a5);
                this.Method1965(a8);
                this.Method1965(a7);
                this.Method1965(a6);
                this.Method1965(a5);
            }
            case 95: {
                Object a5 = this.Method1963();
                Object a6 = this.Method1963();
                this.Method1965(a5);
                this.Method1965(a6);
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
                this.Method1849(a2, Class45.Field397);
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
                this.Method1873(a3);
            }
            case 179: {
                this.Method3451(a3);
            }
            case 180: {
                this.Method1869(1);
                this.Method1873(a3);
            }
            case 181: {
                this.Method3451(a3);
                this.Method1963();
            }
            case 187: {
                this.Method1965(this.Field183.get(0));
            }
            case 188: {
                this.Method1963();
                switch (a2) {
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
                this.Method1873("[" + Class46.Method3205(a3));
            }
            case 192: {
                this.Method1963();
                this.Method1873(Class46.Method3205(a3).Method3225());
            }
            default: {
                this.Method1869(a2);
                this.Method1873(a3);
                break;
            }
        }
        this.Field183 = null;
    }

    private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}