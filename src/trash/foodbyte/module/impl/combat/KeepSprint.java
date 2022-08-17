package trash.foodbyte.module.impl.combat;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class KeepSprint extends Module {
   public KeepSprint() {
      super("KeepSprint", "Keep Sprint", Category.COMBAT);
   }

   public String getDescription() {
      return "打人不减速(Hypixel跳人连人被mod看见会被ban,建议追人单点)";
   }
}
