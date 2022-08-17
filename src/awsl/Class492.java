package awsl;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.render.Arrow;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class492 {
   private Map Field2269;
   private Map Field2270;
   final Arrow Field2271;
   private static String Field2272;

   public Class492(Arrow a) {
      this.Field2271 = a;
      this.Field2269 = Maps.newHashMap();
      this.Field2270 = Maps.newHashMap();
   }

   private void Method2234(EventRender3D a) {
      String var2 = Method2239();
      if (!this.Field2269.isEmpty()) {
         this.Field2269.clear();
      }

      if (!this.Field2270.isEmpty()) {
         this.Field2270.clear();
      }

      Iterator var3 = Module.mc.theWorld.loadedEntityList.Method1383();
      if (var3.Method932()) {
         Entity var4 = (Entity)var3.Method933();
         if (var4 instanceof EntityLivingBase && this.Field2271.Method965((EntityLivingBase)var4)) {
            EntityLivingBase var5 = (EntityLivingBase)var4;
            Vec3 var6 = this.Method2235(var5);
            var6.add(new Vec3(0.0, (double)var5.height + 0.2, 0.0));
            Vec3 var7 = RenderUtils.Method1135(var6.xCoord, var6.yCoord, var6.zCoord);
            Vec3 var8 = RenderUtils.Method1135(var6.xCoord, var6.yCoord - 2.0, var6.zCoord);
            this.Field2269.put(var5, var7);
            this.Field2270.put(var5, var8);
         }
      }

   }

   private Vec3 Method2235(Entity a) {
      double var2 = (double)ReflectionUtils.getRenderPartialTicks();
      double var4 = a.lastTickPosX + (a.posX - a.lastTickPosX) * var2 - Module.mc.getRenderManager().viewerPosX;
      double var6 = a.lastTickPosY + (a.posY - a.lastTickPosY) * var2 - Module.mc.getRenderManager().viewerPosY;
      double var8 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * var2 - Module.mc.getRenderManager().viewerPosZ;
      return new Vec3(var4, var6, var8);
   }

   public Map Method2236() {
      return this.Field2270;
   }

   static void Method2237(Class492 a, EventRender3D a) {
      a.Method2234(a);
   }

   public static void Method2238(String string) {
      Field2272 = string;
   }

   public static String Method2239() {
      return Field2272;
   }

   static {
      if (Method2239() != null) {
         Method2238("JIUsl");
      }

   }
}
