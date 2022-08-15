/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  net.minecraft.network.Packet
 */
package awsl;

import net.minecraft.network.Packet;

final class Class452 {
    private final long Field2133 = System.currentTimeMillis();
    private final Packet Field2134;
    private long Field2135;

    private Class452(Packet a, long a2) {
        this.Field2134 = a;
        this.Field2135 = a2;
    }

    public Packet Method2527() {
        return this.Field2134;
    }

    public long Method2528() {
        return this.Field2135;
    }

    public long Method2529() {
        return this.Field2133;
    }
}