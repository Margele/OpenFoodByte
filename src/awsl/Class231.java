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
import awsl.Class253;
import awsl.Class267;

class Class231
extends Class167 {
    String Field1287;

    public Class231() {
        super(327680);
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field1287 = a3;
        if (this.Field1287.startsWith("java/")) {
            System.out.println("class " + a3 + ' ' + a5);
        }
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        if (this.Field1287.startsWith("java/")) {
            System.out.println(this.Field1287 + ' ' + a2);
        }
        return null;
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        if (this.Field1287.startsWith("java/")) {
            System.out.println(this.Field1287 + ' ' + a2 + a3);
        }
        return null;
    }
}