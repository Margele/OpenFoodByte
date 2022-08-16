/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  net.minecraft.entity.Entity
 */
package trash.foodbyte.event;

import eventapi.Event;
import net.minecraft.entity.Entity;

public class EventEntityTick
implements Event {
    public Entity entity;

    public EventEntityTick() {
    }

    public EventEntityTick(Object entity) {
        this.entity = (Entity)entity;
    }

    public Entity getEntity() {
        return this.entity;
    }
}