package trash.foodbyte.module.impl.movement;

import eventapi.EventTarget;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;

public class NoJumpDelay extends Module {
   public NoJumpDelay() {
      super("NoJumpDelay", "No Jump Delay", Category.MOVEMENT);
   }

   public String getDescription() {
      return "跳跃无延迟";
   }

   @EventTarget
   public void Method747(EventEntityTick a) {
      if (a.getEntity().equals(mc.thePlayer)) {
         ReflectionUtils.setJumpTicks(0);
      }

   }
}
