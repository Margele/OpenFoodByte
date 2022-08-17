package trash.foodbyte.module.impl.render;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class FullBright extends Module {
   public FullBright() {
      super("FullBright", "Full Bright", Category.RENDER);
      this.Method1033(true);
   }

   public String getDescription() {
      return "夜视";
   }
}
