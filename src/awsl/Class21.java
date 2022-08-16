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
        Class780 a2 = new Class780(new Class811());
        try {
            a2.Method847("dummy", this);
        }
        catch (Exception a3) {
            if (a3 instanceof IndexOutOfBoundsException && this.Field211 == 0 && this.Field210 == 0) {
                throw new RuntimeException("Data flow checking option requires valid, non zero maxLocals and maxStack values.");
            }
            a3.printStackTrace();
            StringWriter a4 = new StringWriter();
            PrintWriter a5 = new PrintWriter((Writer)a4, true);
            Class225.Method2194(this, a2, a5);
            a5.close();
            throw new RuntimeException(a3.getMessage() + ' ' + a4.toString());
        }
        this.Method3444(this.Field232);
    }

    private static Exception Method1642(Exception exception) {
        return exception;
    }
}