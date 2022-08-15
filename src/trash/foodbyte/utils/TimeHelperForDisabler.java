/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package trash.foodbyte.utils;

import trash.foodbyte.module.impl.world.Disabler;

public final class TimeHelperForDisabler {
    private long Field2139;
    final Disabler Field2140;

    public TimeHelperForDisabler(Disabler a) {
        this.Field2140 = a;
        this.Field2139 = System.currentTimeMillis();
    }

    public long Method2568() {
        return this.Field2139;
    }

    public boolean isDelayComplete(long a) {
        return this.Method2570() > a;
    }

    public long Method2570() {
        return System.currentTimeMillis() - this.Field2139;
    }

    public void reset() {
        this.Field2139 = System.currentTimeMillis();
    }

    public void Method2572(long a) {
        this.Field2139 = a;
    }
}