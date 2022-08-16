/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package awsl;

import awsl.Class114;
import awsl.Class124;
import awsl.Class126;
import awsl.Class136;
import awsl.Class148;
import awsl.Class15;
import awsl.Class167;
import awsl.Class241;
import awsl.Class253;
import awsl.Class267;
import awsl.Class31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import obfuscate.a;

public class Class224
extends Class167 {
    public int Field1242;
    public int Field1243;
    public String Field1244;
    public String Field1245;
    public String Field1246;
    public List Field1247 = new ArrayList();
    public String Field1248;
    public String Field1249;
    public String Field1250;
    public String Field1251;
    public String Field1252;
    public List Field1253;
    public List Field1254;
    public List Field1255;
    public List Field1256;
    public List Field1257;
    public List Field1258 = new ArrayList();
    public List Field1259 = new ArrayList();
    public List Field1260 = new ArrayList();

    public Class224() {
        this(327680);
        if (this.getClass() != Class224.class) {
            throw new IllegalStateException();
        }
    }

    public Class224(int a) {
        super(a);
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field1242 = a;
        this.Field1243 = a2;
        this.Field1244 = a3;
        this.Field1245 = a4;
        this.Field1246 = a5;
        this.Field1247.addAll((Collection)Arrays.asList((Object[])a6));
    }

    @Override
    public void Method1458(String a, String a2) {
        this.Field1248 = a;
        this.Field1249 = a2;
    }

    @Override
    public void Method1453(String a, String a2, String a3) {
        this.Field1250 = a;
        this.Field1251 = a2;
        this.Field1252 = a3;
    }

    @Override
    public Class148 Method1448(String a, boolean a2) {
        Class124 a3 = new Class124(a);
        if (this.Field1253 == null) {
            this.Field1253 = new ArrayList(1);
        }
        this.Field1253.Method2530((Object)a3);
        return a3;
    }

    @Override
    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        Class126 a5 = new Class126(a, a2, a3);
        if (this.Field1255 == null) {
            this.Field1255 = new ArrayList(1);
        }
        this.Field1255.Method2530((Object)a5);
        return a5;
    }

    @Override
    public void Method1459(Class136 a) {
        if (this.Field1257 == null) {
            this.Field1257 = new ArrayList(1);
        }
        this.Field1257.Method2530((Object)a);
    }

    @Override
    public void Method1452(String a, String a2, String a3, int a4) {
        Class114 a5 = new Class114(a, a2, a3, a4);
        this.Field1258.Method2530((Object)a5);
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        Class241 a6 = new Class241(a, a2, a3, a4, a5);
        this.Field1259.Method2530((Object)a6);
        return a6;
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        Class15 a6 = new Class15(a, a2, a3, a4, a5);
        this.Field1260.Method2530((Object)a6);
        return a6;
    }

    @Override
    public void Method1460() {
    }

    public void Method2212(int a) {
        if (a == 262144) {
            Object a2;
            if (this.Field1255 != null && this.Field1255.Method1799() > 0) {
                throw new RuntimeException();
            }
            if (this.Field1256 != null && this.Field1256.Method1799() > 0) {
                throw new RuntimeException();
            }
            Iterator iterator = this.Field1259.Method1383();
            while (iterator.Method932()) {
                a2 = (Class241)iterator.Method933();
                ((Class241)a2).Method2279(a);
            }
            iterator = this.Field1260.Method1383();
            while (iterator.Method932()) {
                a2 = (Class15)iterator.Method933();
                ((Class15)a2).Method1869(a);
            }
        }
    }

    public void Method2213(Class167 a2) {
        Class124 a3;
        int a4;
        int a5;
        int n = Class15.Method3445();
        Object[] a6 = new String[this.Field1247.Method1799()];
        this.Field1247.toArray(a6);
        int a7 = n;
        a2.Method1447(this.Field1242, this.Field1243, this.Field1244, this.Field1245, this.Field1246, (String[])a6);
        if (this.Field1248 != null || this.Field1249 != null) {
            a2.Method1458(this.Field1248, this.Field1249);
        }
        if (this.Field1250 != null) {
            a2.Method1453(this.Field1250, this.Field1251, this.Field1252);
        }
        if ((a5 = 0) < (a4 = this.Field1253 == null ? 0 : this.Field1253.Method1799())) {
            a3 = (Class124)this.Field1253.get(a5);
            a3.Method646(a2.Method1448(a3.Field973, true));
            ++a5;
            a.trash(new String[1]);
        }
        if ((a5 = 0) < (a4 = this.Field1254 == null ? 0 : this.Field1254.Method1799())) {
            a3 = (Class124)this.Field1254.get(a5);
            a3.Method646(a2.Method1448(a3.Field973, false));
            ++a5;
        }
        if ((a5 = 0) < (a4 = this.Field1255 == null ? 0 : this.Field1255.Method1799())) {
            a3 = (Class126)this.Field1255.get(a5);
            a3.Method646(a2.Method1449(((Class126)a3).Field975, ((Class126)a3).Field976, ((Class126)a3).Field973, true));
            ++a5;
        }
        if ((a5 = 0) < (a4 = this.Field1256 == null ? 0 : this.Field1256.Method1799())) {
            a3 = (Class126)this.Field1256.get(a5);
            a3.Method646(a2.Method1449(((Class126)a3).Field975, ((Class126)a3).Field976, ((Class126)a3).Field973, false));
            ++a5;
        }
        if ((a5 = 0) < (a4 = this.Field1257 == null ? 0 : this.Field1257.Method1799())) {
            a2.Method1459((Class136)this.Field1257.get(a5));
            ++a5;
        }
        if ((a5 = 0) < this.Field1258.Method1799()) {
            ((Class114)this.Field1258.get(a5)).Method130(a2);
            ++a5;
        }
        if ((a5 = 0) < this.Field1259.Method1799()) {
            ((Class241)this.Field1259.get(a5)).Method2280(a2);
            ++a5;
        }
        if ((a5 = 0) < this.Field1260.Method1799()) {
            ((Class15)this.Field1260.get(a5)).Method3443(a2);
            ++a5;
        }
        a2.Method1460();
    }

    private static IllegalStateException Method2214(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}