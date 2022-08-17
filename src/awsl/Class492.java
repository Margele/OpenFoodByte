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
      String a = Method2239();
      if (!this.Field2269.isEmpty()) {
         this.Field2269.clear();
      }

      if (!this.Field2270.isEmpty()) {
         this.Field2270.clear();
      }

      Iterator var3 = Module.mc.theWorld.loadedEntityList.Method1383();
      if (var3.Method932()) {
         Entity a = (Entity)var3.Method933();
         if (a instanceof EntityLivingBase && this.Field2271.Method965((EntityLivingBase)a)) {
            EntityLivingBase a = (EntityLivingBase)a;
            Vec3 a = this.Method2235(a);
            a.add(new Vec3(0.0, (double)a.height + 0.2, 0.0));
            Vec3 a = RenderUtils.Method1135(a.xCoord, a.yCoord, a.zCoord);
            Vec3 a = RenderUtils.Method1135(a.xCoord, a.yCoord - 2.0, a.zCoord);
            this.Field2269.put(a, a);
            this.Field2270.put(a, a);
         }
      }

   }

   private Vec3 Method2235(Entity a) {
      double a = (double)ReflectionUtils.getRenderPartialTicks();
      double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - Module.mc.getRenderManager().viewerPosX;
      double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - Module.mc.getRenderManager().viewerPosY;
      double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - Module.mc.getRenderManager().viewerPosZ;
      return new Vec3(a, a, a);
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
