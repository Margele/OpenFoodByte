package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import eventapi.EventTarget;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;

public class Packour extends Module {
   boolean Field2455 = false;

   public Packour() {
      super("Parkour", "Parkour", Category.MOVEMENT);
      this.setDescription("当你到达方块的边缘时自动跳跃");
   }

   @EventTarget
   public void Method755(EventTick a) {
      boolean var2 = Class167.Method1501();
      if (this.Field2455) {
         if (!mc.thePlayer.onGround) {
            return;
         }

         this.Field2455 = false;
      }

      if (ReflectionUtils.isPressed(mc.gameSettings.keyBindJump)) {
         this.Field2455 = true;
      }

      if (mc.theWorld.getCollidingBoundingBoxes(mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(0.0, -0.5, 0.0).expand(0.001, 0.0, 0.001)).isEmpty()) {
         mc.thePlayer.jump();
         this.Field2455 = true;
      }

   }
}
