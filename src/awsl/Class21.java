/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package awsl;

import awsl.Class15;
import awsl.Class225;
import awsl.Class267;
import awsl.Class780;
import awsl.Class811;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

class Class21
extends Class15 {
    final Class267 Field232;

    Class21(int a, int a2, String a3, String a4, String a5, String[] a6, Class267 class267) {
        this.Field232 = class267;
        super(a, a2, a3, a4, a5, a6);
    }

    @Override
    public void Method1653() {
        Class780 a = new Class780(new Class811());
        try {
            a.Method847("dummy", this);
        }
        catch (Exception a2) {
            if (a2 instanceof IndexOutOfBoundsException && this.Field211 == 0 && this.Field210 == 0) {
                throw new RuntimeException("Data flow checking option requires valid, non zero maxLocals and maxStack values.");
            }
            a2.printStackTrace();
            StringWriter a3 = new StringWriter();
            PrintWriter a4 = new PrintWriter((Writer)a3, true);
            Class225.Method2194(this, a, a4);
            a4.close();
            throw new RuntimeException(a2.getMessage() + ' ' + a3.toString());
        }
        this.Method3444(this.Field232);
    }

    private static Exception Method1642(Exception exception) {
        return exception;
    }
}