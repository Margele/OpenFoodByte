package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import eventapi.EventTarget;
import net.minecraft.client.entity.EntityPlayerSP;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.FloatValue;

public class Fly extends Module {
   public static FloatValue Field2477 = new FloatValue("Fly", "Speed", 3.0, 1.0, 10.0, 0.1, "飞行速度");

   public Fly() {
      super("Fly", "Fly", Category.MOVEMENT);
      this.setHideModule(true);
   }

   public String getDescription() {
      return "飞行";
   }

   public boolean canUse() {
      return GlobalModule.INSTANCE.balant == null || !PermissionManager.canUseModule("fly");
   }

   @EventTarget
   public void Method755(EventTick a) {
      this.setDisplayTag("Vanilla");
   }

   @EventTarget
   public void onMotion(EventMotion e) {
      boolean var2 = Class167.Method1501();
      if (e.isPre()) {
         if (mc.thePlayer.movementInput.jump) {
            mc.thePlayer.motionY = 1.8;
         }

         if (mc.thePlayer.movementInput.sneak) {
            mc.thePlayer.motionY = -1.8;
         }

         if (!mc.thePlayer.onGround) {
            mc.thePlayer.motionY = 0.0;
         }
      }

   }

   @EventTarget
   public void Method274(EventMove a) {
      if (a.getEntity() instanceof EntityPlayerSP) {
         a.setSpeed((double)Field2477.getFloatValueCast());
      }

   }
}
