/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class251;
import eventapi.Event;
import obfuscate.a;
import trash.foodbyte.event.UnknownEvent;

public abstract class Class257
implements Event,
Class251 {
    private final byte Field1409;

    protected Class257(byte a2) {
        String string = UnknownEvent.Method2302();
        String string2 = string;
        this.Field1409 = a2;
        a.trash(new String[3]);
    }

    @Override
    public byte Method2244() {
        return this.Field1409;
    }
}