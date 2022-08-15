/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  net.minecraft.entity.EntityLivingBase
 */
package awsl;

import eventapi.Event;
import net.minecraft.entity.EntityLivingBase;

public class Class645
implements Event {
    public boolean Field2914;
    public EntityLivingBase Field2915;

    public Class645(Object a, boolean a2) {
        this.Field2915 = (EntityLivingBase)a;
        this.Field2914 = a2;
    }

    public EntityLivingBase Method3605() {
        return this.Field2915;
    }

    public boolean Method2241() {
        return this.Field2914;
    }

    public boolean Method3515() {
        return !this.Field2914;
    }
}