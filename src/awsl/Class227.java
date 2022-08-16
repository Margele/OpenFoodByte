/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.PrintWriter
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class132;
import awsl.Class136;
import awsl.Class148;
import awsl.Class167;
import awsl.Class253;
import awsl.Class267;
import awsl.Class270;
import awsl.Class31;
import awsl.Class41;
import awsl.Class801;
import awsl.Class804;
import java.io.PrintWriter;

public final class Class227
extends Class167 {
    private final PrintWriter Field1275;
    public final Class801 Field1276;

    public Class227(PrintWriter a) {
        this(null, a);
    }

    public Class227(Class167 a2, PrintWriter a3) {
        this(a2, new Class804(), a3);
    }

    public Class227(Class167 a2, Class801 a3, PrintWriter a4) {
        super(327680, a2);
        this.Field1275 = a4;
        this.Field1276 = a3;
    }

    @Override
    public void Method1447(int a2, int a3, String a4, String a5, String a6, String[] a7) {
        this.Field1276.Method3245(a2, a3, a4, a5, a6, a7);
        super.Method1447(a2, a3, a4, a5, a6, a7);
    }

    @Override
    public void Method1458(String a2, String a3) {
        this.Field1276.Method3246(a2, a3);
        super.Method1458(a2, a3);
    }

    @Override
    public void Method1453(String a2, String a3, String a4) {
        this.Field1276.Method3247(a2, a3, a4);
        super.Method1453(a2, a3, a4);
    }

    @Override
    public Class148 Method1448(String a2, boolean a3) {
        Class801 a4 = this.Field1276.Method3248(a2, a3);
        Class148 a5 = this.Field1035 == null ? null : this.Field1035.Method1448(a2, a3);
        return new Class132(a5, a4);
    }

    @Override
    public Class148 Method1449(int a2, Class31 a3, String a4, boolean a5) {
        Class801 a6 = this.Field1276.Method3249(a2, a3, a4, a5);
        Class148 a7 = this.Field1035 == null ? null : this.Field1035.Method1449(a2, a3, a4, a5);
        return new Class132(a7, a6);
    }

    @Override
    public void Method1459(Class136 a2) {
        this.Field1276.Method3250(a2);
        super.Method1459(a2);
    }

    @Override
    public void Method1452(String a2, String a3, String a4, int a5) {
        this.Field1276.Method3251(a2, a3, a4, a5);
        super.Method1452(a2, a3, a4, a5);
    }

    @Override
    public Class253 Method1450(int a2, String a3, String a4, String a5, Object a6) {
        Class801 a7 = this.Field1276.Method3252(a2, a3, a4, a5, a6);
        Class253 a8 = this.Field1035 == null ? null : this.Field1035.Method1450(a2, a3, a4, a5, a6);
        return new Class270(a8, a7);
    }

    @Override
    public Class267 Method1451(int a2, String a3, String a4, String a5, String[] a6) {
        Class801 a7 = this.Field1276.Method3253(a2, a3, a4, a5, a6);
        Class267 a8 = this.Field1035 == null ? null : this.Field1035.Method1451(a2, a3, a4, a5, a6);
        return new Class41(a8, a7);
    }

    @Override
    public void Method1460() {
        this.Field1276.Method3254();
        if (this.Field1275 != null) {
            this.Field1276.Method3296(this.Field1275);
            this.Field1275.flush();
        }
        super.Method1460();
    }
}