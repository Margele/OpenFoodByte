/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class148;
import awsl.Class152;
import awsl.Class167;
import awsl.Class235;
import awsl.Class253;
import awsl.Class267;
import awsl.Class31;
import awsl.Class37;
import awsl.Class7;

public class Class171
extends Class167 {
    protected final Class37 Field1120;
    protected String Field1121;

    public Class171(Class167 a, Class37 a2) {
        this(327680, a, a2);
    }

    protected Class171(int a, Class167 a2, Class37 a3) {
        super(a, a2);
        this.Field1120 = a3;
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field1121 = a3;
        super.Method1447(a, a2, this.Field1120.Method3374(a3), this.Field1120.Method3378(a4, false), this.Field1120.Method3374(a5), null);
    }

    @Override
    public Class148 Method1448(String a, boolean a2) {
        Class148 a3 = super.Method1448(this.Field1120.Method3372(a), a2);
        return null;
    }

    @Override
    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        Class148 a5 = super.Method1449(a, a2, this.Field1120.Method3372(a3), a4);
        return null;
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        Class253 a6 = super.Method1450(a, this.Field1120.Method3185(this.Field1121, a2, a3), this.Field1120.Method3372(a3), this.Field1120.Method3378(a4, true), this.Field1120.Method3377(a5));
        return null;
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        String a6 = this.Field1120.Method3376(a3);
        Class267 a7 = super.Method1451(a, this.Field1120.Method3184(this.Field1121, a2, a3), a6, this.Field1120.Method3378(a4, false), null);
        return null;
    }

    @Override
    public void Method1452(String a, String a2, String a3, int a4) {
        super.Method1452(this.Field1120.Method3374(a), null, a3, a4);
    }

    @Override
    public void Method1453(String a, String a2, String a3) {
        super.Method1453(this.Field1120.Method3374(a), null, null);
    }

    protected Class253 Method1454(Class253 a) {
        return new Class235(a, this.Field1120);
    }

    protected Class267 Method1455(int a, String a2, Class267 a3) {
        return new Class7(a, a2, a3, this.Field1120);
    }

    protected Class148 Method1456(Class148 a) {
        return new Class152(a, this.Field1120);
    }
}