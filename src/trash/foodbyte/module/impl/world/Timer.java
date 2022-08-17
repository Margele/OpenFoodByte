package trash.foodbyte.module.impl.world;

import eventapi.EventTarget;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.value.FloatValue;

public class Timer extends Module {
   private boolean Field2273;
   public FloatValue Field2274 = new FloatValue("Timer", "Timer", 1.07, 1.0, 2.0, 0.01, "变速齿轮(Hyp最好别开0.01都可能Banned)");

   public Timer() {
      super("Timer", Category.WORLD);
   }

   public String getDescription() {
      return "变速";
   }

   @EventTarget
   private void Method747(EventEntityTick a) {
      if (a.getEntity().equals(mc.thePlayer)) {
         this.Field2273 = !this.Field2273;
         this.setDisplayTag(this.Field2274.getFloatValue().toString());
         ReflectionUtils.setTimerSpeed(this.Field2273 ? 1.0F : this.Field2274.getFloatValue());
      }
   }

   public void onDisable() {
      ReflectionUtils.setTimerSpeed(1.0F);
   }
}
