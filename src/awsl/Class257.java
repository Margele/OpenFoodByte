/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class249;
import awsl.Class251;
import awsl.Class91;
import eventapi.Event;

public abstract class Class257
implements Event,
Class251 {
    private final byte Field1409;

    protected Class257(byte a) {
        String string = Class249.Method2302();
        String string2 = string;
        this.Field1409 = a;
        Class91.Method3647(new String[3]);
    }

    @Override
    public byte Method2244() {
        return this.Field1409;
    }
}