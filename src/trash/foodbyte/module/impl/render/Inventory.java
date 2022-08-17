package trash.foodbyte.module.impl.render;

import awsl.Class352;
import awsl.Class373;
import awsl.Class379;
import awsl.Class492;
import eventapi.EventTarget;
import net.minecraft.client.gui.GuiChat;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.FloatValue;

public class Inventory extends Module {
   public FloatValue Field2360 = new FloatValue("Inventory", "X", 0.0, 0.0, 1920.0, 1.0, "达位置左右");
   public FloatValue Field2361 = new FloatValue("Inventory", "Y", 80.0, 0.0, 1080.0, 1.0, "达位置上下");
   public Class379 Field2362;

   public Inventory() {
      super("Inventory", "Inventory", Category.RENDER);
      this.Field2362 = new Class373((float)this.Field2360.getFloatValue().intValue(), (float)this.Field2361.getFloatValue().intValue(), 180.0F, 62.0F, 12.0F, 1.0F, 0.5F);
      this.Method1033(true);
   }

   public String getDescription() {
      return "在屏幕上绘制一个背包里面的物品";
   }

   @EventTarget
   public void Method810(EventRender2D a) {
      String var2 = Class492.Method2239();
      if (!Class352.Field1690.contains(this.Field2362)) {
         GlobalModule.INSTANCE.Field3168.Method69(this.Field2362);
      }

      if (!mc.gameSettings.showDebugInfo) {
         if (mc.currentScreen instanceof GuiChat && this.Field2362.Field1811) {
            this.Field2360.Method2747(this.Field2362.Field1806);
            this.Field2361.Method2747(this.Field2362.Field1807);
         }

         this.Field2362.Field1806 = this.Field2360.getFloatValue();
         this.Field2362.Field1807 = this.Field2361.getFloatValue();
      }

   }
}
