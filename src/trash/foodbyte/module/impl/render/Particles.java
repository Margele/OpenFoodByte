package trash.foodbyte.module.impl.render;

import awsl.Class212;
import awsl.Class216;
import awsl.Class280;
import awsl.Class285;
import awsl.Class492;
import awsl.Class694;
import eventapi.EventTarget;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C02PacketUseEntity.Action;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Particles extends Module {
   public BooleanValue Field2204 = new BooleanValue("Particles", "Physics", false, "自定义开启后角度");
   public FloatValue Field2205 = new FloatValue("Particles", "Amount", 10.0, 1.0, 20.0, 1.0, "角度");
   private List Field2206 = new Class694(100);
   private Class280 Field2207 = new Class280();
   private EntityLivingBase Field2208;

   public Particles() {
      super("Particles", "Particles", Category.RENDER);
   }

   public String getDescription() {
      return "当你攻击某人时渲染粒子";
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (a.isSend() && a.getPacket() instanceof C02PacketUseEntity) {
         C02PacketUseEntity a = (C02PacketUseEntity)a.getPacket();
         if (a.getAction() == Action.ATTACK) {
            this.Field2208 = (EntityLivingBase)a.getEntityFromWorld(mc.theWorld);
         }
      }

   }

   @EventTarget
   public void Method755(EventTick a) {
      String a = Class492.Method2239();
      if (this.Field2208 != null && this.Field2208.hurtTime >= 9 && mc.thePlayer.getDistance(this.Field2208.posX, this.Field2208.posY, this.Field2208.posZ) < 10.0) {
         int a = 0;
         if ((float)a < this.Field2205.getFloatValue()) {
            this.Field2206.Method2530(new Class285(new Class216(this.Field2208.posX + (Math.random() - 0.5) * 0.5, this.Field2208.posY + Math.random() * 1.0 + 0.5, this.Field2208.posZ + (Math.random() - 0.5) * 0.5)));
            ++a;
         }

         this.Field2208 = null;
      }

   }

   @EventTarget
   public void Method802(EventRender3D a) {
      String a = Class492.Method2239();
      if (!this.Field2206.isEmpty()) {
         Minecraft var10001 = mc;
         int a = 3000 / Minecraft.getDebugFPS();
         int a = 0;
         if (a <= a) {
            if (this.Field2204.getBooleanValue()) {
               this.Field2206.forEach(Class285::Method3096);
            }

            this.Field2206.forEach(Class285::Method3097);
            ++a;
         }

         this.Field2206.removeIf(Particles::Method2278);
         this.Field2207.Method3079();
         Class212.Method2546(this.Field2206);
      }
   }

   private static boolean Method2278(Class285 a) {
      return a.Field1546 >= 20 || mc.thePlayer.getDistanceSq(a.Method3098().Field1207, a.Method3098().Field1208, a.Method3098().Field1209) > 500.0;
   }
}
