package trash.foodbyte.module.impl.render;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class NoFov extends Module {
   public static FloatValue Field2239 = new FloatValue("NoFov", "Fov", 1.0, 1.0, 1.5, 0.1, "角度");
   public static BooleanValue Field2240 = new BooleanValue("NoFov", "Bow Zoom", true, "拉弓放大开关");

   public NoFov() {
      super("NoFov", "No Fov", Category.RENDER);
   }

   public String getDescription() {
      return "锁定视角角度";
   }
}
