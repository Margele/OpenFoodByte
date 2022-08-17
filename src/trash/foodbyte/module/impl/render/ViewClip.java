package trash.foodbyte.module.impl.render;

import eventapi.EventTarget;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.value.BooleanValue;

public class ViewClip extends Module {
   public BooleanValue Field2175 = new BooleanValue("ViewClip", "Del Portal Anim", true, "删除传送门动画");

   public ViewClip() {
      super("ViewClip", "View Clip", Category.RENDER);
   }

   public String getDescription() {
      return "视角无遮挡(被埋不黑屏,F5可以看墙里)";
   }

   @EventTarget
   private void Method755(EventTick a) {
      mc.thePlayer.noClip = true;

      try {
         if (this.Field2175.getValue()) {
            ReflectionHelper.findField(Entity.class, new String[]{ObfuscatedField.inPortal.getObfuscatedName()}).set(mc.thePlayer, false);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}
