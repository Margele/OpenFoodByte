package trash.foodbyte.module.impl.render;

import awsl.Class352;
import awsl.Class353;
import awsl.Class379;
import awsl.Class492;
import eventapi.EventTarget;
import java.util.HashMap;
import net.minecraft.client.gui.GuiChat;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Radar extends Module {
   public static HashMap Field2215 = new HashMap();
   public FloatValue Field2216 = new FloatValue("Radar", "X", 0.0, 0.0, 1920.0, 1.0, "调雷达位置左右");
   public FloatValue Field2217 = new FloatValue("Radar", "Y", 180.0, 0.0, 1080.0, 1.0, "调雷达位置上下");
   public FloatValue Field2218 = new FloatValue("Radar", "Scale", 2.0, 1.0, 5.0, 0.1, "雷达范围");
   public FloatValue Field2219 = new FloatValue("Radar", "Width", 80.0, 50.0, 500.0, 10.0, "雷达宽度");
   public FloatValue Field2220 = new FloatValue("Radar", "Height", 80.0, 50.0, 500.0, 10.0, "雷达高度");
   public BooleanValue Field2221 = new BooleanValue("Radar", "WayPoints", true, "显示00坐标");
   public Class379 Field2222;

   public Radar() {
      super("Radar", Category.RENDER);
      this.Field2222 = new Class353((float)this.Field2216.getFloatValue().intValue(), (float)this.Field2217.getFloatValue().intValue(), (float)this.Field2219.getFloatValue().intValue(), (float)this.Field2220.getFloatValue().intValue(), 12.0F, 1.0F, 0.5F, true, this.Field2219.Method2750(), this.Field2220.Method2750(), this.Field2219.Method2751(), this.Field2220.Method2751());
      Field2215.put("PVP", new double[]{Double.parseDouble("0"), Double.parseDouble("80"), Double.parseDouble("0")});
   }

   public String getDescription() {
      return "玩家雷达(可打开聊天框点击雷达拖动位置)";
   }

   @EventTarget
   public void Method810(EventRender2D a) {
      String a = Class492.Method2239();
      if (!Class352.Field1690.contains(this.Field2222)) {
         GlobalModule.INSTANCE.Field3168.Method69(this.Field2222);
      }

      if (!mc.gameSettings.showDebugInfo) {
         int a = (int)MathUtils.Method547((float)Mouse.getX(), 0.0F, (float)Display.getWidth(), 0.0F, (float)RenderUtils.Method1076());
         int a = (int)MathUtils.Method547((float)(Display.getHeight() - Mouse.getY()), 0.0F, (float)Display.getHeight(), 0.0F, (float)RenderUtils.Method1077());
         if (mc.currentScreen instanceof GuiChat && this.Field2222.Field1811 || this.Field2222.Field1822) {
            this.Field2216.Method2747(this.Field2222.Field1806);
            this.Field2217.Method2747(this.Field2222.Field1807);
            this.Field2219.Method2747(this.Field2222.Field1814);
            this.Field2220.Method2747(this.Field2222.Field1815);
         }

         this.Field2222.Field1814 = (float)this.Field2219.getFloatValue().intValue();
         this.Field2222.Field1815 = (float)this.Field2220.getFloatValue().intValue();
         this.Field2222.Field1806 = this.Field2216.getFloatValue();
         this.Field2222.Field1807 = this.Field2217.getFloatValue();
      }

   }
}
