package trash.foodbyte.module.impl.player;

import eventapi.EventTarget;
import net.minecraft.potion.Potion;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;

public class Zoot extends Module {
   public static BooleanValue Field3233 = new BooleanValue("Zoot", "Blindness", true, "缓慢");
   public static BooleanValue Field3234 = new BooleanValue("Zoot", "Confusion", true, "反胃");
   public static BooleanValue Field3235 = new BooleanValue("Zoot", "DigSlowdown", true, "挖掘疲劳");

   public Zoot() {
      super("Zoot", "Zoot", Category.PLAYER);
      this.setDescription("自动清除负面效果");
   }

   @EventTarget
   public void Method1655(EventTick a) {
      if (Field3233.getBooleanValue() && mc.thePlayer.isPotionActive(Potion.blindness.getId())) {
         mc.thePlayer.removePotionEffect(Potion.blindness.getId());
      }

      if (Field3234.getBooleanValue() && mc.thePlayer.isPotionActive(Potion.confusion.getId())) {
         mc.thePlayer.removePotionEffect(Potion.confusion.getId());
      }

      if (Field3235.getBooleanValue() && mc.thePlayer.isPotionActive(Potion.digSlowdown.getId())) {
         mc.thePlayer.removePotionEffect(Potion.digSlowdown.getId());
      }

   }
}
