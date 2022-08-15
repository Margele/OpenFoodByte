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

    public Class227(Class167 a, PrintWriter a2) {
        this(a, new Class804(), a2);
    }

    public Class227(Class167 a, Class801 a2, PrintWriter a3) {
        super(327680, a);
        this.Field1275 = a3;
        this.Field1276 = a2;
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field1276.Method3245(a, a2, a3, a4, a5, a6);
        super.Method1447(a, a2, a3, a4, a5, a6);
    }

    @Override
    public void Method1458(String a, String a2) {
        this.Field1276.Method3246(a, a2);
        super.Method1458(a, a2);
    }

    @Override
    public void Method1453(String a, String a2, String a3) {
        this.Field1276.Method3247(a, a2, a3);
        super.Method1453(a, a2, a3);
    }

    @Override
    public Class148 Method1448(String a, boolean a2) {
        Class801 a3 = this.Field1276.Method3248(a, a2);
        Class148 a4 = this.Field1035 == null ? null : this.Field1035.Method1448(a, a2);
        return new Class132(a4, a3);
    }

    @Override
    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        Class801 a5 = this.Field1276.Method3249(a, a2, a3, a4);
        Class148 a6 = this.Field1035 == null ? null : this.Field1035.Method1449(a, a2, a3, a4);
        return new Class132(a6, a5);
    }

    @Override
    public void Method1459(Class136 a) {
        this.Field1276.Method3250(a);
        super.Method1459(a);
    }

    @Override
    public void Method1452(String a, String a2, String a3, int a4) {
        this.Field1276.Method3251(a, a2, a3, a4);
        super.Method1452(a, a2, a3, a4);
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        Class801 a6 = this.Field1276.Method3252(a, a2, a3, a4, a5);
        Class253 a7 = this.Field1035 == null ? null : this.Field1035.Method1450(a, a2, a3, a4, a5);
        return new Class270(a7, a6);
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        Class801 a6 = this.Field1276.Method3253(a, a2, a3, a4, a5);
        Class267 a7 = this.Field1035 == null ? null : this.Field1035.Method1451(a, a2, a3, a4, a5);
        return new Class41(a7, a6);
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