package trash.foodbyte.module.impl.render;

import awsl.Class492;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;

public class ClickGui extends Module {
   public ClickGui() {
      super("ClickGui", "Click Gui", Category.RENDER);
      this.Method1033(true);
      this.Field2646 = true;
      this.Method1021(54);
   }

   public String getDescription() {
      return "客户端控制面板";
   }

   public void idk() {
      GlobalModule.Field3162.Method2757(GlobalModule.INSTANCE.balant != null && PermissionManager.canUseModule("tp"));
      GlobalModule.Field3173.Method2757(GlobalModule.INSTANCE.balant != null && PermissionManager.canUseModule("tp"));
      GlobalModule.Field3156.Method2757(GlobalModule.INSTANCE.balant != null && PermissionManager.canUseModule("tp"));
   }

   public void onEnable() {
      String var1 = Class492.Method2239();
      if (this.Method1026()) {
         if (GlobalModule.Field3151.isCurrentMode("FoodByte")) {
            mc.displayGuiScreen(GlobalModule.INSTANCE.Method2014());
         }

         if (GlobalModule.Field3151.isCurrentMode("Panel")) {
            mc.displayGuiScreen(GlobalModule.INSTANCE.Method2015());
         }

         this.setState(false);
      }

   }
}
