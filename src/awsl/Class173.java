/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package awsl;

import awsl.Class136;
import awsl.Class148;
import awsl.Class167;
import awsl.Class171;
import awsl.Class23;
import awsl.Class25;
import awsl.Class253;
import awsl.Class264;
import awsl.Class267;
import awsl.Class31;
import awsl.Class37;
import awsl.Class690;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class173
extends Class171 {
    private String Field1122;
    String Field1123;
    boolean Field1124 = false;
    boolean Field1125 = false;
    List Field1126 = new ArrayList();

    public Class173(Class167 a, Class37 a2) {
        super(327680, a, a2);
    }

    Class253 Method1457(int a, String a2, String a3) {
        return super.Method1450(a, a2, a3, null, null);
    }

    @Override
    public void Method1447(int a, int a2, String a3, String a4, String a5, String[] a6) {
        super.Method1447(46, a2, a3, null, a5, a6);
        int a7 = a3.lastIndexOf(47);
        this.Field1122 = a3.substring(0, a7);
        this.Field1123 = a3;
        this.Field1124 = (a2 & 0x200) != 0;
    }

    @Override
    public void Method1458(String a, String a2) {
    }

    @Override
    public void Method1453(String a, String a2, String a3) {
    }

    @Override
    public Class148 Method1448(String a, boolean a2) {
        return null;
    }

    @Override
    public Class148 Method1449(int a, Class31 a2, String a3, boolean a4) {
        return null;
    }

    @Override
    public void Method1459(Class136 a) {
    }

    @Override
    public void Method1452(String a, String a2, String a3, int a4) {
    }

    @Override
    public Class253 Method1450(int a, String a2, String a3, String a4, Object a5) {
        String a6 = this.Field1120.Method3185(this.Field1121, a2, a3);
        if ("-".equals((Object)a6)) {
            return null;
        }
        if ((a & 5) == 0) {
            if ((a & 0x10) != 0 && (a & 8) != 0 && a3.length() == 1) {
                return null;
            }
            if ("awsl/asm".equals((Object)this.Field1122) && a6.equals((Object)a2)) {
                System.out.println("INFO: " + this.Field1123 + "." + a6 + " could be renamed");
            }
            super.Method1450(a, a2, a3, null, a5);
        } else {
            if (!a6.equals((Object)a2)) {
                throw new RuntimeException("The public or protected field " + this.Field1121 + '.' + a2 + " must not be renamed.");
            }
            super.Method1450(a, a2, a3, null, a5);
        }
        return null;
    }

    @Override
    public Class267 Method1451(int a, String a2, String a3, String a4, String[] a5) {
        String a6 = this.Field1120.Method3184(this.Field1121, a2, a3);
        if ("-".equals((Object)a6)) {
            return null;
        }
        if (a2.equals((Object)"<clinit>") && !this.Field1124) {
            this.Field1125 = true;
            Class267 a7 = super.Method1451(a, a2, a3, null, a5);
            return new Class25(this, 327680, a7);
        }
        if ((a & 5) == 0) {
            if ("awsl/asm".equals((Object)this.Field1122) && !a2.startsWith("<") && a6.equals((Object)a2)) {
                System.out.println("INFO: " + this.Field1123 + "." + a6 + " could be renamed");
            }
            return super.Method1451(a, a2, a3, null, a5);
        }
        if (!a6.equals((Object)a2)) {
            throw new RuntimeException("The public or protected method " + this.Field1121 + '.' + a2 + a3 + " must not be renamed.");
        }
        return super.Method1451(a, a2, a3, null, a5);
    }

    @Override
    protected Class267 Method1455(int a, String a2, Class267 a3) {
        return new Class23(this, a, a2, a3, this.Field1120);
    }

    @Override
    public void Method1460() {
        block6: {
            Class267 a;
            block5: {
                String[] a2 = Class690.Method2342();
                if (!this.Field1126.isEmpty()) break block5;
                if (!this.Field1125) break block6;
                a = this.Field1035.Method1451(4104, "_clinit_", "()V", null, null);
                a.Method1652();
                a.Method1948(177);
                a.Method1842(0, 0);
                a.Method1653();
            }
            a = this.Field1035.Method1451(4104, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", null, null);
            a.Method1652();
            Class264 a3 = new Class264();
            Class264 a4 = new Class264();
            Class264 a5 = new Class264();
            a.Method1960(a3, a4, a5, "java/lang/ClassNotFoundException");
            a.Method1947(a3);
            a.Method1840(25, 0);
            a.Method1954(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
            a.Method1947(a4);
            a.Method1948(176);
            a.Method1947(a5);
            a.Method1954(182, "java/lang/ClassNotFoundException", "getMessage", "()Ljava/lang/String;", false);
            a.Method1840(58, 1);
            a.Method1952(187, "java/lang/NoClassDefFoundError");
            a.Method1948(89);
            a.Method1840(25, 1);
            a.Method1954(183, "java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V", false);
            a.Method1948(191);
            a.Method1842(3, 2);
            a.Method1653();
            if (this.Field1125) {
                a = this.Field1035.Method1451(10, "_clinit_", "()V", null, null);
            }
            a = this.Field1035.Method1451(8, "<clinit>", "()V", null, null);
            Iterator iterator = this.Field1126.Method1383();
            if (iterator.Method932()) {
                String a6 = (String)iterator.Method933();
                String a7 = "class$" + a6.replace('/', '$');
                a.Method1950(a6.replace('/', '.'));
                a.Method1954(184, this.Field1123, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
                a.Method1949(179, this.Field1123, a7, "Ljava/lang/Class;");
            }
            a.Method1948(177);
            a.Method1842(1, 0);
            a.Method1653();
        }
        super.Method1460();
    }

    private static RuntimeException Method1461(RuntimeException runtimeException) {
        return runtimeException;
    }
}