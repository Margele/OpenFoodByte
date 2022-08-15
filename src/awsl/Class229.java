/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class167;
import awsl.Class267;
import awsl.Class37;

public class Class229
extends Class167 {
    private String Field1282;
    private Class267 Field1283;
    private final String Field1284;
    private int Field1285;

    public Class229(String a, Class167 a2) {
        this(327680, a, a2);
    }

    protected Class229(int a, String a2, Class167 a3) {
        super(a, a3);
        this.Field1284 = a2;
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field1035.Method1447(a, a2, a3, a4, a5, a6);
        this.Field1282 = a3;
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        Class267 a6;
        boolean a7 = Class37.Method3382();
        if ("<clinit>".equals((Object)a2)) {
            int a8 = 10;
            String a9 = this.Field1284 + this.Field1285++;
            a6 = this.Field1035.Method1451(a8, a9, a3, a4, a5);
            if (this.Field1283 == null) {
                this.Field1283 = this.Field1035.Method1451(a8, a2, a3, null, null);
            }
            this.Field1283.Method1954(184, this.Field1282, a9, a3, false);
        }
        a6 = this.Field1035.Method1451(a, a2, a3, a4, a5);
        return a6;
    }

    @Override
    public void Method1460() {
        if (this.Field1283 != null) {
            this.Field1283.Method1948(177);
            this.Field1283.Method1842(0, 0);
        }
        this.Field1035.Method1460();
    }
}