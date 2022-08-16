/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package awsl;

import awsl.Class2;
import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class37;
import awsl.Class45;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import obfuscate.b;

public abstract class Class5
extends Class2
implements Class45 {
    private static final Object Field101 = new Object();
    private static final Object Field102 = new Object();
    protected int Field103;
    protected String Field104;
    private boolean Field105;
    private boolean Field106;
    private List Field107;
    private Map Field108;

    protected Class5(int a, Class267 a2, int a3, String a4, String a5) {
        super(a, a2, a3, a4, a5);
        this.Field103 = a3;
        this.Field104 = a5;
        this.Field105 = "<init>".equals((Object)a4);
    }

    @Override
    public void Method1652() {
        this.Field1460.Method1652();
        if (this.Field105) {
            this.Field107 = new ArrayList();
            this.Field108 = new HashMap();
        } else {
            this.Field106 = true;
            this.Method1966();
        }
    }

    @Override
    public void Method1947(Class264 a) {
        this.Field1460.Method1947(a);
        if (this.Field105 && this.Field108 != null) {
            List a2 = (List)this.Field108.Method2665((Object)a);
            this.Field107 = a2;
            this.Field108.remove((Object)a);
        }
    }

    @Override
    public void Method1948(int a) {
        boolean a2 = Class37.Method3383();
        if (this.Field105) {
            switch (a) {
                case 177: {
                    this.Method1967(a);
                }
                case 172: 
                case 174: 
                case 176: 
                case 191: {
                    this.Method1963();
                    this.Method1967(a);
                }
                case 173: 
                case 175: {
                    this.Method1963();
                    this.Method1963();
                    this.Method1967(a);
                }
                case 0: 
                case 47: 
                case 49: 
                case 116: 
                case 117: 
                case 118: 
                case 119: 
                case 134: 
                case 138: 
                case 139: 
                case 143: 
                case 145: 
                case 146: 
                case 147: 
                case 190: {
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 11: 
                case 12: 
                case 13: 
                case 133: 
                case 135: 
                case 140: 
                case 141: {
                    this.Method1965(Field102);
                }
                case 9: 
                case 10: 
                case 14: 
                case 15: {
                    this.Method1965(Field102);
                    this.Method1965(Field102);
                }
                case 46: 
                case 48: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 87: 
                case 96: 
                case 98: 
                case 100: 
                case 102: 
                case 104: 
                case 106: 
                case 108: 
                case 110: 
                case 112: 
                case 114: 
                case 120: 
                case 121: 
                case 122: 
                case 123: 
                case 124: 
                case 125: 
                case 126: 
                case 128: 
                case 130: 
                case 136: 
                case 137: 
                case 142: 
                case 144: 
                case 149: 
                case 150: 
                case 194: 
                case 195: {
                    this.Method1963();
                }
                case 88: 
                case 97: 
                case 99: 
                case 101: 
                case 103: 
                case 105: 
                case 107: 
                case 109: 
                case 111: 
                case 113: 
                case 115: 
                case 127: 
                case 129: 
                case 131: {
                    this.Method1963();
                    this.Method1963();
                }
                case 79: 
                case 81: 
                case 83: 
                case 84: 
                case 85: 
                case 86: 
                case 148: 
                case 151: 
                case 152: {
                    this.Method1963();
                    this.Method1963();
                    this.Method1963();
                }
                case 80: 
                case 82: {
                    this.Method1963();
                    this.Method1963();
                    this.Method1963();
                    this.Method1963();
                }
                case 89: {
                    this.Method1965(this.Method1964());
                }
                case 90: {
                    int a3 = this.Field107.Method1799();
                    this.Field107.add(a3 - 2, this.Field107.get(a3 - 1));
                }
                case 91: {
                    int a3 = this.Field107.Method1799();
                    this.Field107.add(a3 - 3, this.Field107.get(a3 - 1));
                }
                case 92: {
                    int a3 = this.Field107.Method1799();
                    this.Field107.add(a3 - 2, this.Field107.get(a3 - 1));
                    this.Field107.add(a3 - 2, this.Field107.get(a3 - 1));
                }
                case 93: {
                    int a3 = this.Field107.Method1799();
                    this.Field107.add(a3 - 3, this.Field107.get(a3 - 1));
                    this.Field107.add(a3 - 3, this.Field107.get(a3 - 1));
                }
                case 94: {
                    int a3 = this.Field107.Method1799();
                    this.Field107.add(a3 - 4, this.Field107.get(a3 - 1));
                    this.Field107.add(a3 - 4, this.Field107.get(a3 - 1));
                }
                case 95: {
                    int a3 = this.Field107.Method1799();
                    this.Field107.add(a3 - 2, this.Field107.get(a3 - 1));
                    this.Field107.remove(a3);
                }
            }
        }
        switch (a) {
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 176: 
            case 177: 
            case 191: {
                this.Method1967(a);
            }
        }
        this.Field1460.Method1948(a);
    }

    @Override
    public void Method1840(int a, int a2) {
        super.Method1840(a, a2);
        if (this.Field105) {
            switch (a) {
                case 21: 
                case 23: {
                    this.Method1965(Field102);
                    break;
                }
                case 22: 
                case 24: {
                    this.Method1965(Field102);
                    this.Method1965(Field102);
                    break;
                }
                case 25: {
                    this.Method1965(Field101);
                    break;
                }
                case 54: 
                case 56: 
                case 58: {
                    this.Method1963();
                    break;
                }
                case 55: 
                case 57: {
                    this.Method1963();
                    this.Method1963();
                }
            }
        }
    }

    @Override
    public void Method1949(int a, String a2, String a3, String a4) {
        this.Field1460.Method1949(a, a2, a3, a4);
        if (this.Field105) {
            char a5 = a4.charAt(0);
            boolean a6 = a5 == 'J' || a5 == 'D';
            switch (a) {
                case 178: {
                    this.Method1965(Field102);
                    this.Method1965(Field102);
                    break;
                }
                case 179: {
                    this.Method1963();
                    this.Method1963();
                    break;
                }
                case 181: {
                    this.Method1963();
                    this.Method1963();
                    this.Method1963();
                    break;
                }
                default: {
                    this.Method1965(Field102);
                }
            }
        }
    }

    @Override
    public void Method854(int a, int a2) {
        this.Field1460.Method854(a, a2);
        if (this.Field105 && a != 188) {
            this.Method1965(Field102);
        }
    }

    @Override
    public void Method1950(Object a) {
        this.Field1460.Method1950(a);
        if (this.Field105) {
            this.Method1965(Field102);
            if (a instanceof Double || a instanceof Long) {
                this.Method1965(Field102);
            }
        }
    }

    @Override
    public void Method1951(String a, int a2) {
        this.Field1460.Method1951(a, a2);
        if (this.Field105) {
            for (int a3 = 0; a3 < a2; ++a3) {
                this.Method1963();
            }
            this.Method1965(Field102);
        }
    }

    @Override
    public void Method1952(int a, String a2) {
        this.Field1460.Method1952(a, a2);
        if (this.Field105 && a == 187) {
            this.Method1965(Field102);
        }
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

    private void Method1955(int a2, String a3, String a4, String a5, boolean a6) {
        this.Field1460.Method1954(a2, a3, a4, a5, a6);
        if (this.Field105) {
            b[] a7 = b.Method3211(a5);
            for (int a8 = 0; a8 < a7.length; ++a8) {
                this.Method1963();
                if (a7[a8].Method3233() != 2) continue;
                this.Method1963();
            }
            switch (a2) {
                case 182: 
                case 185: {
                    this.Method1963();
                    break;
                }
                case 183: {
                    Object a9 = this.Method1963();
                    if (a9 != Field101 || this.Field106) break;
                    this.Method1966();
                    this.Field106 = true;
                    this.Field105 = false;
                }
            }
            b a10 = b.Method3213(a5);
            if (a10 != b.Field572) {
                this.Method1965(Field102);
                if (a10.Method3233() == 2) {
                    this.Method1965(Field102);
                }
            }
        }
    }

    @Override
    public void Method1956(String a2, String a3, Class279 a4, Object[] a5) {
        this.Field1460.Method1956(a2, a3, a4, a5);
        if (this.Field105) {
            b[] a6 = b.Method3211(a3);
            for (int a7 = 0; a7 < a6.length; ++a7) {
                this.Method1963();
                if (a6[a7].Method3233() != 2) continue;
                this.Method1963();
            }
            b a8 = b.Method3213(a3);
            if (a8 != b.Field572) {
                this.Method1965(Field102);
                if (a8.Method3233() == 2) {
                    this.Method1965(Field102);
                }
            }
        }
    }

    @Override
    public void Method1957(int a2, Class264 a3) {
        this.Field1460.Method1957(a2, a3);
        if (this.Field105) {
            switch (a2) {
                case 153: 
                case 154: 
                case 155: 
                case 156: 
                case 157: 
                case 158: 
                case 198: 
                case 199: {
                    this.Method1963();
                    break;
                }
                case 159: 
                case 160: 
                case 161: 
                case 162: 
                case 163: 
                case 164: 
                case 165: 
                case 166: {
                    this.Method1963();
                    this.Method1963();
                    break;
                }
                case 168: {
                    this.Method1965(Field102);
                }
            }
            this.Method1962(a3);
        }
    }

    @Override
    public void Method1958(Class264 a2, int[] a3, Class264[] a4) {
        this.Field1460.Method1958(a2, a3, a4);
        if (this.Field105) {
            this.Method1963();
            this.Method1961(a2, a4);
        }
    }

    @Override
    public void Method1959(int a2, int a3, Class264 a4, Class264[] a5) {
        this.Field1460.Method1959(a2, a3, a4, a5);
        if (this.Field105) {
            this.Method1963();
            this.Method1961(a4, a5);
        }
    }

    @Override
    public void Method1960(Class264 a2, Class264 a3, Class264 a4, String a5) {
        super.Method1960(a2, a3, a4, a5);
        if (this.Field105 && !this.Field108.containsKey((Object)a4)) {
            ArrayList a6 = new ArrayList();
            a6.Method2530(Field102);
            this.Field108.put((Object)a4, (Object)a6);
        }
    }

    private void Method1961(Class264 a2, Class264[] a3) {
        this.Method1962(a2);
        for (int a4 = 0; a4 < a3.length; ++a4) {
            this.Method1962(a3[a4]);
        }
    }

    private void Method1962(Class264 a2) {
        if (this.Field108.containsKey((Object)a2)) {
            return;
        }
        this.Field108.put((Object)a2, (Object)new ArrayList((Collection)this.Field107));
    }

    private Object Method1963() {
        return this.Field107.remove(this.Field107.Method1799() - 1);
    }

    private Object Method1964() {
        return this.Field107.get(this.Field107.Method1799() - 1);
    }

    private void Method1965(Object a2) {
        this.Field107.Method2530(a2);
    }

    protected void Method1966() {
    }

    protected void Method1967(int a2) {
    }
}