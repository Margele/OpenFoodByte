/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class124;
import awsl.Class31;

public class Class126
extends Class124 {
    public int Field975;
    public Class31 Field976;

    public Class126(int a, Class31 a2, String a3) {
        this(327680, a, a2, a3);
        if (this.getClass() != Class126.class) {
            throw new IllegalStateException();
        }
    }

    public Class126(int a, int a2, Class31 a3, String a4) {
        super(a, a4);
        this.Field975 = a2;
        this.Field976 = a3;
    }
}