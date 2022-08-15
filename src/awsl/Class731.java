/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package awsl;

import awsl.Class797;
import awsl.Class91;

public class Class731
extends Exception {
    public final Class91 Field3210;

    public Class731(Class91 a, String a2) {
        super(a2);
        this.Field3210 = a;
    }

    public Class731(Class91 a, String a2, Throwable a3) {
        super(a2, a3);
        this.Field3210 = a;
    }

    public Class731(Class91 a, String a2, Object a3, Class797 a4) {
        super("Expected " + a3 + ", but found " + a4);
        this.Field3210 = a;
    }
}