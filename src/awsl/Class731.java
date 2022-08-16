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
import obfuscate.a;

public class Class731
extends Exception {
    public final a Field3210;

    public Class731(a a2, String a3) {
        super(a3);
        this.Field3210 = a2;
    }

    public Class731(a a2, String a3, Throwable a4) {
        super(a3, a4);
        this.Field3210 = a2;
    }

    public Class731(a a2, String a3, Object a4, Class797 a5) {
        super("Expected " + a4 + ", but found " + a5);
        this.Field3210 = a2;
    }
}