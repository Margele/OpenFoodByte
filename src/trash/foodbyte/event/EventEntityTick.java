package trash.foodbyte.event;

import eventapi.Event;
import net.minecraft.entity.Entity;

public class EventEntityTick implements Event {
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
