package trash.foodbyte.module.impl.render;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.ModeValue;

public class ItemRender extends Module {
   public ModeValue Field2374 = new ModeValue("ItemRender", "Render Mode", "Badlion", new String[]{"Badlion"}, "模式{Badlion}");

   public ItemRender() {
      super("ItemRender", "Item Render", Category.RENDER);
   }

   public String getDescription() {
      return "修改掉落物显示";
   }
}
