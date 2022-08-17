package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ColorValue;

public class ItemESP extends Module {
   public ColorValue Field2375 = new ColorValue("ItemESP", "ESP Color", new Color(255, 255, 255), "透视绘制颜色");

   public ItemESP() {
      super("ItemESP", "Item ESP", Category.RENDER);
   }

   public String getDescription() {
      return "掉落物绘制透视";
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      Class492.Method2239();
      Iterator var3 = mc.theWorld.loadedEntityList.Method1383();
      if (var3.Method932()) {
         Object var4 = var3.Method933();
         if (var4 instanceof EntityItem) {
            RenderUtils.Method1123((Entity)var4, this.Field2375.Method2444());
         }
      }

   }
}
