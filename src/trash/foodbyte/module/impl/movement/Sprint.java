package trash.foodbyte.module.impl.movement;

import awsl.Class363;
import eventapi.EventTarget;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.value.BooleanValue;

public class Sprint extends Module {
   public static boolean Field2427 = true;
   public BooleanValue omni = new BooleanValue("Sprint", "Omni", false, "全方位疾跑");

   public Sprint() {
      super("Sprint", Category.MOVEMENT);
   }

   public String getDescription() {
      return "强制疾跑";
   }

   @EventTarget
   public void Method810(EventRender2D a) {
      Field2427 = this.omni.getBooleanValue();
      if (this.Method713()) {
         mc.thePlayer.setSprinting(true);
      }

   }

   private boolean Method713() {
      if (!this.omni.getBooleanValue() && !mc.gameSettings.keyBindForward.isKeyDown()) {
         return false;
      } else if (mc.thePlayer.isSneaking()) {
         return false;
      } else if (!Class363.Method642() && (mc.thePlayer.getItemInUseDuration() > 0 || !this.omni.getBooleanValue() && mc.thePlayer.isCollidedHorizontally)) {
         return false;
      } else {
         return PlayerUtils.isMoving() && mc.thePlayer.getFoodStats().getFoodLevel() > 6;
      }
   }
}
