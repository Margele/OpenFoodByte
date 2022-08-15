/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

import eventapi.Event;
import trash.foodbyte.event.Type;

public class Class648
implements Event {
    private final Type Field2916 = Type.PRE;
    public float Field2917;

    public Class648(float a, boolean a2) {
        this.Field2917 = a;
    }

    public Type Method3516() {
        return this.Field2916;
    }

    public boolean Method2241() {
        return this.Method3516().equals((Object)Type.PRE);
    }

    public boolean Method3515() {
        return this.Method3516().equals((Object)Type.POST);
    }
}