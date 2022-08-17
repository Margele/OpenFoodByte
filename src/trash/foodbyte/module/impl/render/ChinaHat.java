package trash.foodbyte.module.impl.render;

import awsl.Class212;
import awsl.Class416;
import awsl.Class492;
import eventapi.EventTarget;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.value.BooleanValue;

public class ChinaHat extends Module {
   public BooleanValue Field2376 = new BooleanValue("ChinaHat", "Through", false, "绘制不被方块遮挡");
   public BooleanValue Field2377 = new BooleanValue("ChinaHat", "First Person", false, "第一人称视角是否显示");

   public ChinaHat() {
      super("ChinaHat", Category.RENDER);
      this.setDescription("帽子");
   }

   @EventTarget
   private void Method802(EventRender3D a) {
      String var2 = Class492.Method2239();
      if (mc.thePlayer != null && mc.theWorld != null && !mc.thePlayer.isInvisible() && !mc.thePlayer.isDead) {
         if (this.Field2377.getBooleanValue() || mc.gameSettings.thirdPersonView != 0) {
            double var3 = mc.thePlayer.lastTickPosX + (mc.thePlayer.posX - mc.thePlayer.lastTickPosX) * (double)a.Field2922 - mc.getRenderManager().viewerPosX;
            double var5 = mc.thePlayer.lastTickPosY + (mc.thePlayer.posY - mc.thePlayer.lastTickPosY) * (double)a.Field2922 - mc.getRenderManager().viewerPosY;
            double var7 = mc.thePlayer.lastTickPosZ + (mc.thePlayer.posZ - mc.thePlayer.lastTickPosZ) * (double)a.Field2922 - mc.getRenderManager().viewerPosZ;
            AxisAlignedBB var9 = mc.thePlayer.getEntityBoundingBox();
            double var10 = var9.maxY - var9.minY + 0.03;
            double var12 = var9.maxX - var9.minX;
            GL11.glPushMatrix();
            GlStateManager.disableCull();
            if (this.Field2376.getBooleanValue()) {
               GL11.glDisable(2929);
            }

            GL11.glDepthMask(false);
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glEnable(3042);
            GlStateManager.disableLighting();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            float var14 = MathUtils.getMid((double)mc.thePlayer.prevRotationYaw, (double)mc.thePlayer.rotationYaw, (double)a.Field2922).floatValue();
            float var15 = MathUtils.getMid((double)mc.thePlayer.prevRenderArmPitch, (double)mc.thePlayer.renderArmPitch, (double)a.Field2922).floatValue();
            GL11.glTranslated(var3, var5, var7);
            GL11.glEnable(2848);
            GL11.glHint(3154, 4354);
            GL11.glRotated((double)var14, 0.0, -1.0, 0.0);
            GL11.glRotated((double)var15 / 3.0, 0.0, 0.0, 0.0);
            GL11.glTranslatef(0.0F, 0.0F, var15 / 270.0F);
            GL11.glLineWidth(2.0F);
            GL11.glBegin(2);
            float var16 = mc.thePlayer.isSneaking() ? 0.1F : -0.08F;
            int var17 = 0;
            int var18;
            if (var17 <= 180) {
               var18 = Class416.Method2353(7, var17 * 4, 1.0F, 1.0F, 0.5F).getRGB();
               GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
               Class212.Method2542(var18);
               GL11.glVertex3d(var3 - Math.sin((double)((float)var17 * MathUtils.Field1707 / 90.0F)) * var12, var5 + var10 - (double)var16 - 0.001, var7 + Math.cos((double)((float)var17 * MathUtils.Field1707 / 90.0F)) * var12);
               ++var17;
            }

            GL11.glEnd();
            GL11.glBegin(6);
            var17 = Class416.Method2353(7, 4, 1.0F, 1.0F, 0.7F).getRGB();
            Class212.Method2542(var17);
            GL11.glVertex3d(var3, var5 + var10 + 0.3 - (double)var16, var7);
            byte var20 = 0;
            if (var20 <= 180) {
               int var19 = Class416.Method2353(7, var20 * 4, 1.0F, 1.0F, 0.2F).getRGB();
               GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
               Class212.Method2542(var19);
               GL11.glVertex3d(var3 - Math.sin((double)((float)var20 * MathUtils.Field1707 / 90.0F)) * var12, var5 + var10 - (double)var16, var7 + Math.cos((double)((float)var20 * MathUtils.Field1707 / 90.0F)) * var12);
               var18 = var20 + 1;
            }

            GL11.glVertex3d(var3, var5 + var10 + 0.3 - (double)var16, var7);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glEnable(2884);
            GL11.glEnable(3553);
            GL11.glShadeModel(7424);
            GL11.glDepthMask(true);
            if (this.Field2376.getBooleanValue()) {
               GL11.glEnable(2929);
            }

         }
      }
   }
}
