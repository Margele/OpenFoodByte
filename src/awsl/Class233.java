/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class167;
import awsl.Class267;
import awsl.Class27;
import awsl.Class54;
import awsl.Class690;

class Class233
extends Class167 {
    String Field1294;
    String Field1295;

    public Class233() {
        super(327680);
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field1294 = a3;
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        this.Field1295 = a2 + a3;
        return new Class27(this, 327680);
    }

    void Method2100(String a, String a2) {
        String[] a3 = Class690.Method2342();
        if (a.startsWith("java/")) {
            String a4 = a;
            if (Class54.Field602.contains((Object)(a4 + ' ' + a2))) {
                return;
            }
            a4 = (String)Class54.Field603.Method2665((Object)a4);
            System.out.println("WARNING: " + a + ' ' + a2 + " called in " + this.Field1294 + ' ' + this.Field1295 + " is not defined in JDK 1.3 API");
        }
    }
}