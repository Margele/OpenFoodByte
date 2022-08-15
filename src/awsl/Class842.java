/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.xml.sax.Attributes
 */
package awsl;

import awsl.Class148;
import awsl.Class264;
import awsl.Class267;
import awsl.Class31;
import awsl.Class730;
import awsl.Class831;
import org.xml.sax.Attributes;

final class Class842
extends Class831 {
    final Class730 Field3730;

    Class842(Class730 a) {
        this.Field3730 = a;
        super(a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method3501(String a, Attributes a2) {
        void a3;
        int[] a4;
        int a5;
        Class264[] a6;
        int a7;
        void a8;
        String a9 = a2.getValue("desc");
        boolean a10 = Boolean.valueOf((String)a2.getValue("visible"));
        int a11 = Integer.parseInt((String)a2.getValue("typeRef"));
        Class31 class31 = Class31.Method3435(a2.getValue("typePath"));
        String[] stringArray = a2.getValue("start").split(" ");
        int[] a12 = Class831.Method3658();
        int a13 = 0;
        Class264[] a14 = new Class264[((void)a8).length];
        if (a13 < a14.length) {
            a14[a13] = this.Method3654(a8[a13]);
            ++a13;
        }
        if ((a7 = 0) < (a6 = new Class264[(a = a2.getValue("end").split(" ")).length]).length) {
            a6[a7] = this.Method3654(a[a7]);
            ++a7;
        }
        if ((a5 = 0) < (a4 = new int[(a = a2.getValue("index").split(" ")).length]).length) {
            a4[a5] = Integer.parseInt((String)a[a5]);
            ++a5;
        }
        this.Field3730.Method1950(((Class267)this.Field3730.Method1963()).Method1844(a11, (Class31)a3, a14, a6, a4, a9, a10));
    }

    @Override
    public void Method3514(String a) {
        Class148 a2 = (Class148)this.Field3730.Method1964();
        a2.Method401();
    }
}