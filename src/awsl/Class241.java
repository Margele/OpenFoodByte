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
 *  java.util.List
 */
package awsl;

import awsl.Class124;
import awsl.Class126;
import awsl.Class136;
import awsl.Class148;
import awsl.Class15;
import awsl.Class167;
import awsl.Class253;
import awsl.Class31;
import java.util.ArrayList;
import java.util.List;

public class Class241
extends Class253 {
    public int Field1341;
    public String Field1342;
    public String Field1343;
    public String Field1344;
    public Object Field1345;
    public List Field1346;
    public List Field1347;
    public List Field1348;
    public List Field1349;
    public List Field1350;

    public Class241(int a, String a2, String a3, String a4, Object a5) {
        this(327680, a, a2, a3, a4, a5);
        if (this.getClass() != Class241.class) {
            throw new IllegalStateException();
        }
    }

    public Class241(int a, int a2, String a3, String a4, String a5, Object a6) {
        super(a);
        this.Field1341 = a2;
        this.Field1342 = a3;
        this.Field1343 = a4;
        this.Field1344 = a5;
        this.Field1345 = a6;
    }

    @Override
    public Class148 Method2114(String a, boolean a2) {
        Class124 a3 = new Class124(a);
        if (this.Field1346 == null) {
            this.Field1346 = new ArrayList(1);
        }
        this.Field1346.Method2530((Object)a3);
        return a3;
    }

    @Override
    public Class148 Method2115(int a, Class31 a2, String a3, boolean a4) {
        Class126 a5 = new Class126(a, a2, a3);
        if (this.Field1348 == null) {
            this.Field1348 = new ArrayList(1);
        }
        this.Field1348.Method2530((Object)a5);
        return a5;
    }

    @Override
    public void Method2120(Class136 a) {
        if (this.Field1350 == null) {
            this.Field1350 = new ArrayList(1);
        }
        this.Field1350.Method2530((Object)a);
    }

    @Override
    public void Method2121() {
    }

    public void Method2279(int a) {
        if (a == 262144) {
            if (this.Field1348 != null && this.Field1348.Method1799() > 0) {
                throw new RuntimeException();
            }
            if (this.Field1349 != null && this.Field1349.Method1799() > 0) {
                throw new RuntimeException();
            }
        }
    }

    public void Method2280(Class167 a) {
        Class253 a2 = a.Method1450(this.Field1341, this.Field1342, this.Field1343, this.Field1344, this.Field1345);
        int a3 = Class15.Method1984();
    }

    private static IllegalStateException Method2281(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}