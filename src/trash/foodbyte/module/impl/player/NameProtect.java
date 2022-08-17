package trash.foodbyte.module.impl.player;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;

public class NameProtect extends Module {
   public static BooleanValue Field2717 = new BooleanValue("NameProtect", "SkinProtect", true, "皮肤保护(替换自己的皮肤)");

   public NameProtect() {
      super("NameProtect", "Name Protect", Category.PLAYER);
   }

   public String getDescription() {
      return "名字保护(替换自己的名字)";
   }
}
