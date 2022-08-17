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
      Random var2 = new Random();
      if (this.Field2275.Method211((long)(1000.0F * this.Field2276.getFloatValueCast()))) {
         String var3 = (String)this.Field2278.get(var2.nextInt(this.Field2278.Method1799()));
         mc.thePlayer.sendChatMessage((!this.Field2277.getBooleanValue() ? "" : "[" + GlobalModule.clientName + "] ") + var3);
         this.Field2275.reset();
      }

   }

   public void Method258() {
      Class448.trash();
      this.Field2278.clear();

      InputStream var2;
      BufferedReader var3;
      String var4;
      try {
         var2 = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/penshen/800.txt")).getInputStream();
         var3 = new BufferedReader(new InputStreamReader(var2, StandardCharsets.UTF_8));
         var4 = "";
         if ((var4 = var3.readLine()) != null) {
            this.Field2278.Method2530(var4);
         }

         var3.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      try {
         var2 = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/penshen/gaosuzhi.txt")).getInputStream();
         var3 = new BufferedReader(new InputStreamReader(var2, StandardCharsets.UTF_8));
         var4 = "";
         if ((var4 = var3.readLine()) != null) {
            this.Field2278.Method2530(var4);
         }

         var3.close();
      } catch (Exception var5) {
      }

   }
}
