package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class305;
import awsl.Class338;
import eventapi.EventTarget;
import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.network.play.client.C03PacketPlayer;
import obfuscate.a;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.event.MouseEvent;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.FloatValue;

public class RodAimbot extends Module {
   public FloatValue Field2418 = new FloatValue("RodAimbot", "Reach", 10.0, 1.0, 15.0, 1.0, "距离");
   EntityLivingBase Field2419 = null;

   public RodAimbot() {
      super("RodAimbot", "Rod Aimbot", Category.PLAYER);
      this.setDescription("使用杆时发包瞄准最近的实体(暂时不要在Hypixel使用可能会狗ban)");
   }

   public boolean canUse() {
      return GlobalModule.INSTANCE.balant == null || !PermissionManager.canUseModule("rodaimbot");
   }

   @EventTarget
   public void Method755(EventTick a) {
      this.Field2419 = Method1763(this.Field2418.getFloatValue());
   }

   @EventTarget
   public void Method1762(MouseEvent a) {
      if (a.eventButton == 1 && a.eventButtonState && mc.currentScreen == null && this.Field2419 != null && mc.thePlayer.getCurrentEquippedItem() != null && mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemFishingRod && mc.thePlayer.fishEntity == null) {
         a.Method2300(true);
         double a = this.Field2419.posX - 0.5;
         double a = this.Field2419.posY;
         double a = this.Field2419.posZ - 0.5;
         Class338 a = new Class338(a + (this.Field2419.posX - this.Field2419.lastTickPosX) * 10.0, a + (double)(this.Field2419.getEyeHeight() / 2.0F), a + (this.Field2419.posZ - this.Field2419.lastTickPosZ) * 10.0);
         float[] a = Method1764(a);
         Wrapper.INSTANCE.sendPacket(new C03PacketPlayer.C05PacketPlayerLook(a[0], a[1], mc.thePlayer.onGround));
         mc.playerController.sendUseItem(mc.thePlayer, mc.theWorld, mc.thePlayer.getHeldItem());
         Wrapper.INSTANCE.sendPacket(new C03PacketPlayer.C05PacketPlayerLook(mc.thePlayer.rotationYaw, mc.thePlayer.rotationPitch, mc.thePlayer.onGround));
      }

   }

   public static EntityLivingBase Method1763(float a) {
      Class148.Method1444();
      EntityLivingBase a = null;
      Iterator var4 = mc.theWorld.loadedEntityList.Method1383();

      while(var4.Method932()) {
         Object a = var4.Method933();
         if (Method1766(a) && !(a instanceof EntityPlayerSP)) {
            EntityLivingBase a = (EntityLivingBase)a;
            if (!(a instanceof EntityPlayer) || AntiBot.botList.contains(a) || Class305.Method704(a)) {
               continue;
            }

            if (Class305.Method697(a)) {
               ;
            }

            if (mc.thePlayer.getDistanceToEntity(a) < a) {
               float a = mc.thePlayer.getDistanceToEntity(a);
               a = a;
            }
         }
      }

      return a;
   }

   public static float[] Method1764(Class338 a) {
      Class148.Method1445();
      double a = a.Field1633 + 0.5 - mc.thePlayer.posX;
      double a = a.Field1634 + 0.5 - (mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight());
      double a = a.Field1635 + 0.5 - mc.thePlayer.posZ;
      double a = (double)Method1765(a * a + a * a);
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI) - 90.0F;
      float a = (float)(-(Math.atan2(a, a) * 180.0 / Math.PI));
      float[] var10000 = new float[]{mc.thePlayer.rotationYaw + Method1671(a - mc.thePlayer.rotationYaw), mc.thePlayer.rotationPitch + Method1671(a - mc.thePlayer.rotationPitch)};
      a.trash(new String[5]);
      return var10000;
   }

   public static float Method1765(double a) {
      return (float)Math.sqrt(a);
   }

   public static float Method1671(float a) {
      a %= 360.0F;
      if (a >= 180.0F) {
         a -= 360.0F;
      }

      if (a < -180.0F) {
         a += 360.0F;
      }

      return a;
   }

   public static boolean Method1766(Object a) {
      return a instanceof EntityLivingBase;
   }
}
