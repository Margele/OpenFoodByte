/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 */
package awsl;

import awsl.Class102;
import awsl.Class104;
import awsl.Class106;
import awsl.Class108;
import awsl.Class110;
import awsl.Class112;
import awsl.Class116;
import awsl.Class120;
import awsl.Class122;
import awsl.Class124;
import awsl.Class126;
import awsl.Class128;
import awsl.Class136;
import awsl.Class148;
import awsl.Class167;
import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class31;
import awsl.Class688;
import awsl.Class790;
import awsl.Class792;
import awsl.Class794;
import awsl.Class82;
import awsl.Class83;
import awsl.Class86;
import awsl.Class88;
import awsl.Class93;
import awsl.Class95;
import awsl.Class96;
import awsl.Class98;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class15
extends Class267 {
    public int Field194;
    public String Field195;
    public String Field196;
    public String Field197;
    public List Field198;
    public List Field199;
    public List Field200;
    public List Field201;
    public List Field202;
    public List Field203;
    public List Field204;
    public Object Field205;
    public List[] Field206;
    public List[] Field207;
    public Class116 Field208;
    public List Field209;
    public int Field210;
    public int Field211;
    public List Field212;
    public List Field213;
    public List Field214;
    private boolean Field215;
    private static int Field216;

    public Class15() {
        this(327680);
        if (this.getClass() != Class15.class) {
            throw new IllegalStateException();
        }
    }

    public Class15(int a2) {
        super(a2);
        this.Field208 = new Class116();
    }

    public Class15(int a2, String a3, String a4, String a5, String[] a6) {
        this(327680, a2, a3, a4, a5, a6);
        if (this.getClass() != Class15.class) {
            throw new IllegalStateException();
        }
    }

    public Class15(int a2, int a3, String a4, String a5, String a6, String[] a7) {
        super(a2);
        this.Field194 = a3;
        this.Field195 = a4;
        this.Field196 = a5;
        this.Field197 = a6;
        this.Field198 = new ArrayList(0);
        boolean a8 = (a3 & 0x400) != 0;
        this.Field212 = new ArrayList(5);
        this.Field209 = new ArrayList();
        this.Field198.addAll((Collection)Arrays.asList((Object[])a7));
        this.Field208 = new Class116();
    }

    @Override
    public void Method1979(String a2, int a3) {
        if (this.Field199 == null) {
            this.Field199 = new ArrayList(5);
        }
        this.Field199.Method2530((Object)new Class792(a2, a3));
    }

    @Override
    public Class148 Method1968() {
        return new Class124((List)new Class688(this, 0));
    }

    @Override
    public Class148 Method1969(String a2, boolean a3) {
        Class124 a4 = new Class124(a2);
        if (this.Field200 == null) {
            this.Field200 = new ArrayList(1);
        }
        this.Field200.Method2530((Object)a4);
        return a4;
    }

    @Override
    public Class148 Method1970(int a2, Class31 a3, String a4, boolean a5) {
        Class126 a6 = new Class126(a2, a3, a4);
        if (this.Field202 == null) {
            this.Field202 = new ArrayList(1);
        }
        this.Field202.Method2530((Object)a6);
        return a6;
    }

    @Override
    public Class148 Method1971(int a2, String a3, boolean a4) {
        Class124 a5 = new Class124(a3);
        if (this.Field206 == null) {
            int a6 = b.Method3211(this.Field196).length;
            this.Field206 = new List[a6];
        }
        if (this.Field206[a2] == null) {
            this.Field206[a2] = new ArrayList(1);
        }
        this.Field206[a2].Method2530((Object)a5);
        return a5;
    }

    @Override
    public void Method1980(Class136 a2) {
        if (this.Field204 == null) {
            this.Field204 = new ArrayList(1);
        }
        this.Field204.Method2530((Object)a2);
    }

    @Override
    public void Method1652() {
    }

    @Override
    public void Method1845(int a2, int a3, Object[] a4, int a5, Object[] a6) {
        this.Field208.Method194(new Class95(a2, a3, null, a5, null));
    }

    @Override
    public void Method1948(int a2) {
        this.Field208.Method194(new Class83(a2));
    }

    @Override
    public void Method854(int a2, int a3) {
        this.Field208.Method194(new Class86(a2, a3));
    }

    @Override
    public void Method1840(int a2, int a3) {
        this.Field208.Method194(new Class112(a2, a3));
    }

    @Override
    public void Method1952(int a2, String a3) {
        this.Field208.Method194(new Class110(a2, a3));
    }

    @Override
    public void Method1949(int a2, String a3, String a4, String a5) {
        this.Field208.Method194(new Class93(a2, a3, a4, a5));
    }

    @Override
    @Deprecated
    public void Method1953(int a2, String a3, String a4, String a5) {
        if (this.Field1459 >= 327680) {
            super.Method1953(a2, a3, a4, a5);
            return;
        }
        this.Field208.Method194(new Class98(a2, a3, a4, a5));
    }

    @Override
    public void Method1954(int a2, String a3, String a4, String a5, boolean a6) {
        if (this.Field1459 < 327680) {
            super.Method1954(a2, a3, a4, a5, a6);
            return;
        }
        this.Field208.Method194(new Class98(a2, a3, a4, a5, a6));
    }

    @Override
    public void Method1956(String a2, String a3, Class279 a4, Object[] a5) {
        this.Field208.Method194(new Class88(a2, a3, a4, a5));
    }

    @Override
    public void Method1957(int a2, Class264 a3) {
        this.Field208.Method194(new Class102(a2, this.Method3440(a3)));
    }

    @Override
    public void Method1947(Class264 a2) {
        this.Field208.Method194(this.Method3440(a2));
    }

    @Override
    public void Method1950(Object a2) {
        this.Field208.Method194(new Class106(a2));
    }

    @Override
    public void Method1841(int a2, int a3) {
        this.Field208.Method194(new Class82(a2, a3));
    }

    @Override
    public void Method1959(int a2, int a3, Class264 a4, Class264[] a5) {
        this.Field208.Method194(new Class122(a2, a3, this.Method3440(a4), this.Method3441(a5)));
    }

    @Override
    public void Method1958(Class264 a2, int[] a3, Class264[] a4) {
        this.Field208.Method194(new Class96(this.Method3440(a2), a3, this.Method3441(a4)));
    }

    @Override
    public void Method1951(String a2, int a3) {
        this.Field208.Method194(new Class120(a2, a3));
    }

    @Override
    public Class148 Method1973(int a2, Class31 a3, String a4, boolean a5) {
        a a6 = this.Field208.Method185();
        while (a6.Method3640() == -1) {
            a6 = a6.Method3641();
        }
        Class126 a7 = new Class126(a2, a3, a4);
        if (a6.Field797 == null) {
            a6.Field797 = new ArrayList(1);
        }
        a6.Field797.Method2530((Object)a7);
        return a7;
    }

    @Override
    public void Method1960(Class264 a2, Class264 a3, Class264 a4, String a5) {
        this.Field209.Method2530((Object)new Class794(this.Method3440(a2), this.Method3440(a3), this.Method3440(a4), a5));
    }

    @Override
    public Class148 Method1974(int a2, Class31 a3, String a4, boolean a5) {
        Class794 a6 = (Class794)this.Field209.get((a2 & 0xFFFF00) >> 8);
        Class126 a7 = new Class126(a2, a3, a4);
        if (a6.Field3563 == null) {
            a6.Field3563 = new ArrayList(1);
        }
        a6.Field3563.Method2530((Object)a7);
        return a7;
    }

    @Override
    public void Method1843(String a2, String a3, String a4, Class264 a5, Class264 a6, int a7) {
        this.Field212.Method2530((Object)new Class790(a2, a3, a4, this.Method3440(a5), this.Method3440(a6), a7));
    }

    @Override
    public Class148 Method1844(int a2, Class31 a3, Class264[] a4, Class264[] a5, int[] a6, String a7, boolean a8) {
        Class128 a9 = new Class128(a2, a3, this.Method3441(a4), this.Method3441(a5), a6, a7);
        if (this.Field213 == null) {
            this.Field213 = new ArrayList(1);
        }
        this.Field213.Method2530((Object)a9);
        return a9;
    }

    @Override
    public void Method1981(int a2, Class264 a3) {
        this.Field208.Method194(new Class108(a2, this.Method3440(a3)));
    }

    @Override
    public void Method1842(int a2, int a3) {
        this.Field210 = a2;
        this.Field211 = a3;
    }

    @Override
    public void Method1653() {
    }

    protected Class104 Method3440(Class264 a2) {
        block0: {
            if (a2.Field1447 instanceof Class104) break block0;
            a2.Field1447 = new Class104();
        }
        return (Class104)a2.Field1447;
    }

    private Class104[] Method3441(Class264[] a2) {
        Class104[] a3 = new Class104[a2.length];
        for (int a4 = 0; a4 < a2.length; ++a4) {
            a3[a4] = this.Method3440(a2[a4]);
        }
        return a3;
    }

    private Object[] Method3442(Object[] a2) {
        Object[] a3 = new Object[a2.length];
        for (int a4 = 0; a4 < a2.length; ++a4) {
            Object a5 = a2[a4];
            if (a5 instanceof Class264) {
                a5 = this.Method3440((Class264)a5);
            }
            a3[a4] = a5;
        }
        return a3;
    }

    public void Method1869(int a2) {
        if (a2 == 262144) {
            Object a3;
            int a4;
            if (this.Field202 != null && this.Field202.Method1799() > 0) {
                throw new RuntimeException();
            }
            if (this.Field203 != null && this.Field203.Method1799() > 0) {
                throw new RuntimeException();
            }
            int a5 = this.Field209 == null ? 0 : this.Field209.Method1799();
            for (a4 = 0; a4 < a5; ++a4) {
                a3 = (Class794)this.Field209.get(a4);
                if (((Class794)a3).Field3563 != null && ((Class794)a3).Field3563.Method1799() > 0) {
                    throw new RuntimeException();
                }
                if (((Class794)a3).Field3564 == null || ((Class794)a3).Field3564.Method1799() <= 0) continue;
                throw new RuntimeException();
            }
            for (a4 = 0; a4 < this.Field208.Method183(); ++a4) {
                boolean a6;
                a3 = this.Field208.Method186(a4);
                if (((a)a3).Field797 != null && ((a)a3).Field797.Method1799() > 0) {
                    throw new RuntimeException();
                }
                if (((a)a3).Field798 != null && ((a)a3).Field798.Method1799() > 0) {
                    throw new RuntimeException();
                }
                if (!(a3 instanceof Class98) || (a6 = ((Class98)a3).Field827) == (((a)a3).Field796 == 185)) continue;
                throw new RuntimeException();
            }
            if (this.Field213 != null && this.Field213.Method1799() > 0) {
                throw new RuntimeException();
            }
            if (this.Field214 != null && this.Field214.Method1799() > 0) {
                throw new RuntimeException();
            }
        }
    }

    public void Method3443(Class167 a2) {
        Object[] a3 = new String[this.Field198.Method1799()];
        this.Field198.toArray(a3);
        Class267 a4 = a2.Method1451(this.Field194, this.Field195, this.Field196, this.Field197, (String[])a3);
        this.Method3444(a4);
    }

    public void Method3444(Class267 a2) {
        block17: {
            Class124 a3;
            int a4;
            Object a5;
            int a6 = Class15.Method1984();
            int a7 = 0;
            int a8 = this.Field199 == null ? 0 : this.Field199.Method1799();
            if (a7 < a8) {
                a5 = (Class792)this.Field199.get(a7);
                a2.Method1979(((Class792)a5).Field3556, ((Class792)a5).Field3557);
                ++a7;
            }
            if (this.Field205 != null) {
                a5 = a2.Method1968();
                Class124.Method647((Class148)a5, null, this.Field205);
                ((Class148)a5).Method401();
            }
            if ((a7 = 0) < (a8 = this.Field200 == null ? 0 : this.Field200.Method1799())) {
                a5 = (Class124)this.Field200.get(a7);
                ((Class124)a5).Method646(a2.Method1969(((Class124)a5).Field973, true));
                ++a7;
            }
            if ((a7 = 0) < (a8 = this.Field201 == null ? 0 : this.Field201.Method1799())) {
                a5 = (Class124)this.Field201.get(a7);
                ((Class124)a5).Method646(a2.Method1969(((Class124)a5).Field973, false));
                ++a7;
            }
            if ((a7 = 0) < (a8 = this.Field202 == null ? 0 : this.Field202.Method1799())) {
                a5 = (Class126)this.Field202.get(a7);
                ((Class124)a5).Method646(a2.Method1970(((Class126)a5).Field975, ((Class126)a5).Field976, ((Class126)a5).Field973, true));
                ++a7;
            }
            if ((a7 = 0) < (a8 = this.Field203 == null ? 0 : this.Field203.Method1799())) {
                a5 = (Class126)this.Field203.get(a7);
                ((Class124)a5).Method646(a2.Method1970(((Class126)a5).Field975, ((Class126)a5).Field976, ((Class126)a5).Field973, false));
                ++a7;
            }
            if ((a7 = 0) < (a8 = this.Field206 == null ? 0 : this.Field206.length)) {
                a5 = this.Field206[a7];
                a4 = 0;
                if (a4 < a5.Method1799()) {
                    a3 = (Class124)a5.get(a4);
                    a3.Method646(a2.Method1971(a7, a3.Field973, true));
                    ++a4;
                }
                ++a7;
            }
            if ((a7 = 0) < (a8 = this.Field207 == null ? 0 : this.Field207.length)) {
                a5 = this.Field207[a7];
                a4 = 0;
                if (a4 < a5.Method1799()) {
                    a3 = (Class124)a5.get(a4);
                    a3.Method646(a2.Method1971(a7, a3.Field973, false));
                    ++a4;
                }
                ++a7;
            }
            if (this.Field215) {
                this.Field208.Method205();
            }
            if ((a7 = 0) < (a8 = this.Field204 == null ? 0 : this.Field204.Method1799())) {
                a2.Method1980((Class136)this.Field204.get(a7));
                ++a7;
            }
            if (this.Field208.Method183() > 0) {
                a2.Method1652();
                a8 = this.Field209 == null ? 0 : this.Field209.Method1799();
                a7 = 0;
                if (a7 < a8) {
                    ((Class794)this.Field209.get(a7)).Method795(a7);
                    ((Class794)this.Field209.get(a7)).Method796(a2);
                    ++a7;
                }
                this.Field208.Method189(a2);
                a8 = this.Field212 == null ? 0 : this.Field212.Method1799();
                a7 = 0;
                if (a7 < a8) {
                    ((Class790)this.Field212.get(a7)).Method751(a2);
                    ++a7;
                }
                if ((a7 = 0) < (a8 = this.Field213 == null ? 0 : this.Field213.Method1799())) {
                    ((Class128)this.Field213.get(a7)).Method679(a2, true);
                    ++a7;
                }
                if ((a7 = 0) < (a8 = this.Field214 == null ? 0 : this.Field214.Method1799())) {
                    ((Class128)this.Field214.get(a7)).Method679(a2, false);
                    ++a7;
                }
                a2.Method1842(this.Field210, this.Field211);
                this.Field215 = true;
            }
            a2.Method1653();
            if (a.trash() != null) break block17;
            Class15.Method1880(++a6);
        }
    }

    public static void Method1880(int n) {
        Field216 = n;
    }

    public static int Method1984() {
        return Field216;
    }

    public static int Method3445() {
        int n = Class15.Method1984();
        return 72;
    }

    private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    static {
        if (Class15.Method3445() == 0) {
            Class15.Method1880(25);
        }
    }
}