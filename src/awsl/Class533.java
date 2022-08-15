/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package awsl;

import awsl.Class91;
import eventapi.EventManager;
import java.lang.reflect.Method;

final class Class533 {
    private final Object Field2469;
    private final Method Field2470;
    private final byte Field2471;

    public Class533(Object a, Method a2, byte a3) {
        boolean bl = EventManager.Method2692();
        this.Field2469 = a;
        this.Field2470 = a2;
        this.Field2471 = a3;
        boolean bl2 = bl;
        Class91.Method3647(new String[1]);
    }

    public Object Method1696() {
        return this.Field2469;
    }

    public Method Method1697() {
        return this.Field2470;
    }

    public byte Method1698() {
        return this.Field2471;
    }
}