package trash.foodbyte.module.impl.world;

import awsl.Class448;
import eventapi.EventTarget;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class PenShen extends Module {
   TimeHelper Field2275 = new TimeHelper();
   public FloatValue Field2276 = new FloatValue("PenShen", "Delay", 1.0, 0.0, 5.0, 0.1, "嘴臭延迟1为一秒");
   public BooleanValue Field2277 = new BooleanValue("PenShen", "ClientName", false, "嘴臭前面加上客户端名称");
   public ArrayList Field2278 = new ArrayList();

   public PenShen() {
      super("PenShen", "Pen Shen", Category.WORLD);
      this.Method258();
   }

   public String getDescription() {
      return "超级嘴臭(骂人专用)";
   }

   @EventTarget
   public void Method755(EventTick a) {
      Random a = new Random();
      if (this.Field2275.Method211((long)(1000.0F * this.Field2276.getFloatValueCast()))) {
         String a = (String)this.Field2278.get(a.nextInt(this.Field2278.Method1799()));
         mc.thePlayer.sendChatMessage((!this.Field2277.getBooleanValue() ? "" : "[" + GlobalModule.clientName + "] ") + a);
         this.Field2275.reset();
      }

   }

   public void Method258() {
      Class448.trash();
      this.Field2278.clear();

      InputStream a;
      BufferedReader a;
      String a;
      try {
         a = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/penshen/800.txt")).getInputStream();
         a = new BufferedReader(new InputStreamReader(a, StandardCharsets.UTF_8));
         a = "";
         if ((a = a.readLine()) != null) {
            this.Field2278.Method2530(a);
         }

         a.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      try {
         a = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/penshen/gaosuzhi.txt")).getInputStream();
         a = new BufferedReader(new InputStreamReader(a, StandardCharsets.UTF_8));
         a = "";
         if ((a = a.readLine()) != null) {
            this.Field2278.Method2530(a);
         }

         a.close();
      } catch (Exception var5) {
      }

   }
}
