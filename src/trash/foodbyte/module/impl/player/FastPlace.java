package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import net.minecraft.item.ItemBlock;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;

public class FastPlace extends Module {
   public BooleanValue Field2674 = new BooleanValue("FastPlace", "OnlyBlock", true, "只有方块无延迟");

   public FastPlace() {
      super("FastPlace", "Fast Place", Category.PLAYER);
   }

   public String getDescription() {
      return "右键无延迟(无延迟放置方块和无延迟扔出雪球)";
   }

   @EventTarget
   public void Method232(EventUpdate a) {
      int var2 = Class148.Method1445();
      if (this.Field2674.getValue()) {
         if (mc.thePlayer.inventory.getCurrentItem() == null || !(mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemBlock)) {
            return;
         }

         ReflectionUtils.setRightClickDelayTimer(0);
      }

      ReflectionUtils.setRightClickDelayTimer(0);
   }

   public void onDisable() {
      ReflectionUtils.setRightClickDelayTimer(4);
      super.onDisable();
   }
}
