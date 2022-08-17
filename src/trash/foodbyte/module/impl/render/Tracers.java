package trash.foodbyte.module.impl.render;

import awsl.Class305;
import awsl.Class492;
import eventapi.EventTarget;
import java.util.Iterator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.ServerUtils;

public class Tracers extends Module {
   public Tracers() {
      super("Tracers", Category.RENDER);
   }

   public String getDescription() {
      return "玩家连线";
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      if (!ServerUtils.isPlayingSkyblock()) {
         Iterator var2 = mc.theWorld.playerEntities.Method1383();

         while(var2.Method932()) {
            EntityPlayer var3 = (EntityPlayer)var2.Method933();
            if (mc.thePlayer != var3 && !var3.isInvisible() && !AntiBot.botList.contains(var3)) {
               this.drawLine(var3, a);
            }
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   private void drawLine(EntityLivingBase enitity, EventRender3D a) {
      float var4 = a.Method3523();
      Class492.Method2239();
      double var5 = enitity.lastTickPosX + (enitity.posX - enitity.lastTickPosX) * (double)var4 - ReflectionUtils.getRenderPosX();
      double var7 = enitity.lastTickPosY + (enitity.posY - enitity.lastTickPosY) * (double)var4 - ReflectionUtils.getRenderPosY();
      double var9 = enitity.lastTickPosZ + (enitity.posZ - enitity.lastTickPosZ) * (double)var4 - ReflectionUtils.getRenderPosZ();
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
      float var11 = mc.thePlayer.getDistanceToEntity(enitity);
      if (Class305.Method697(enitity)) {
         GL11.glColor3f(0.0F, 1.0F, 1.0F);
      }

      if (Class305.Method704(enitity)) {
         GL11.glColor3f(0.0F, 1.0F, 0.0F);
      }

      if (var11 <= 200.0F) {
         GL11.glColor3f(1.0F, var11 / 40.0F, 0.0F);
      }

      GL11.glLoadIdentity();
      boolean var12 = mc.gameSettings.viewBobbing;
      mc.gameSettings.viewBobbing = false;
      ReflectionUtils.setOrientCamera(var4);
      GL11.glBegin(3);
      GL11.glVertex3d(0.0, (double)mc.thePlayer.getEyeHeight(), 0.0);
      GL11.glVertex3d(var5, var7, var9);
      GL11.glVertex3d(var5, var7, var9);
      GL11.glEnd();
      mc.gameSettings.viewBobbing = var12;
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   private void Method952(EntityLivingBase a) {
      float var3 = ReflectionUtils.getRenderPartialTicks();
      Class492.Method2239();
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(2.0F);
      double var4 = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)var3 - ReflectionUtils.getRenderPosX();
      double var6 = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)var3 - ReflectionUtils.getRenderPosY();
      double var8 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)var3 - ReflectionUtils.getRenderPosZ();
      float var10 = mc.thePlayer.getDistanceToEntity(a);
      if (Class305.Method697(a)) {
         GL11.glColor3f(0.0F, 1.0F, 1.0F);
      }

      if (Class305.Method704(a)) {
         GL11.glColor3f(0.0F, 1.0F, 0.0F);
      }

      if (var10 <= 200.0F) {
         GL11.glColor3f(1.0F, var10 / 40.0F, 0.0F);
      }

      boolean var11 = mc.gameSettings.viewBobbing;
      mc.gameSettings.viewBobbing = false;
      GL11.glBegin(3);
      GL11.glVertex3d(0.0, (double)mc.thePlayer.getEyeHeight(), 0.0);
      GL11.glVertex3d(var4, var6, var8);
      GL11.glVertex3d(var4, var6, var8);
      GL11.glEnd();
      mc.gameSettings.viewBobbing = var11;
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }
}
