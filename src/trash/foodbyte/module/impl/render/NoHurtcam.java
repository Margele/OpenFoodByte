package trash.foodbyte.module.impl.render;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class NoHurtcam extends Module {
   public NoHurtcam() {
      super("NoHurtcam", "No Hurtcam", Category.RENDER);
   }

   public String getDescription() {
      return "受伤屏幕不抖动";
   }
}
