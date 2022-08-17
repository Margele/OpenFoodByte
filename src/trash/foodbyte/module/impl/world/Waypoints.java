package trash.foodbyte.module.impl.world;

import awsl.Class260;
import awsl.Class448;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Waypoints extends Module {
   public BooleanValue Field2279 = new BooleanValue("Waypoints", "Distance", true, "显示标记的距离");

   public Waypoints() {
      super("Waypoints", Category.WORLD);
      this.setDescription("标记指定坐标显示在屏幕上 打开指令台使用-wp help查看");
   }

   @EventTarget
   public void Method802(EventRender3D a) {
      if (!mc.isSingleplayer() && mc.getCurrentServerData() != null) {
         GlobalModule.INSTANCE.Method2009().Method2265().forEach(this::Method2250);
      }

   }

   protected void Method2248(Class260 a, double a1, double a, double a, double a, Entity a5) {
      float a = (float)(a.Method2837() - (double)((float)a) + 0.5);
      float a = (float)(a.Method2838() - (double)((float)a) + 1.0);
      float a = (float)(a.Method2839() - (double)((float)a) + 0.5);
      Class448.trash();
      double a = Math.sqrt((double)(a * a + a * a + a * a));
      RenderManager a = Minecraft.getMinecraft().getRenderManager();
      FontRenderer a = mc.fontRendererObj;
   }

   public void Method810(EventRender2D a) {
      if (!mc.isSingleplayer() && mc.getCurrentServerData() != null) {
         GlobalModule.INSTANCE.Method2009().Method2265().forEach(this::Method2249);
      }

   }

   private boolean Method1734(Vec3 a) {
      if (a.xCoord > -1.0 && a.zCoord < 1.0) {
         return a.xCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) >= 0.0 && a.xCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) <= (double)Display.getWidth() && a.yCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) >= 0.0 && a.yCoord / (double)(mc.gameSettings.guiScale == 0 ? 1 : mc.gameSettings.guiScale) <= (double)Display.getHeight();
      } else {
         return false;
      }
   }

   private void Method2249(EventRender2D a, Class260 a) {
      a[] a = Class448.trash();
      if (mc.getCurrentServerData().serverIP.equals(a.Method2836()) && mc.thePlayer.dimension == a.Method2840() || !this.Method1734(new Vec3(a.Method2837(), a.Method2838(), a.Method2839()))) {
         double a = a.Method2837();
         double a = a.Method2838();
         double a = a.Method2839();
         AxisAlignedBB a = (new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.94, 0.875, 0.94)).offset(a - ReflectionUtils.getRenderPosX(), a - ReflectionUtils.getRenderPosY(), a - ReflectionUtils.getRenderPosZ());
         List a = Arrays.asList(new Vector3d(a + a.minX - a.maxX + 0.5, a, a + a.minZ - a.maxZ + 0.5), new Vector3d(a + a.maxX - a.minX - 0.5, a, a + a.minZ - a.maxZ + 0.5), new Vector3d(a + a.minX - a.maxX + 0.5, a, a + a.maxZ - a.minZ - 0.5), new Vector3d(a + a.maxX - a.minX - 0.5, a, a + a.maxZ - a.minZ - 0.5), new Vector3d(a + a.minX - a.maxX + 0.5, a + a.maxY - a.minY, a + a.minZ - a.maxZ + 0.5), new Vector3d(a + a.maxX - a.minX - 0.5, a + a.maxY - a.minY, a + a.minZ - a.maxZ + 0.5), new Vector3d(a + a.minX - a.maxX + 0.5, a + a.maxY - a.minY, a + a.maxZ - a.minZ - 0.5), new Vector3d(a + a.maxX - a.minX - 0.5, a + a.maxY - a.minY, a + a.maxZ - a.minZ - 0.5));
         ReflectionUtils.setupCameraTransform(a.Field2923, 0);
         Vector4d a = null;
         Iterator var13 = a.Method1383();
         if (var13.Method932()) {
            Vector3d a = (Vector3d)var13.Method933();
            a = RenderUtils.Method1136(a.x - mc.getRenderManager().viewerPosX, a.y - mc.getRenderManager().viewerPosY, a.z - mc.getRenderManager().viewerPosZ);
            if (a.z >= 0.0 && a.z < 1.0) {
               a = new Vector4d(a.x, a.y, a.z, 0.0);
               a.x = Math.min(a.x, a.x);
               a.y = Math.min(a.y, a.y);
               a.z = Math.max(a.x, a.z);
               a.w = Math.max(a.y, a.w);
            }
         }

         mc.entityRenderer.setupOverlayRendering();
         GL11.glPushMatrix();
         float a = (float)a.x;
         float a = (float)a.z;
         float a = (float)a.y;
         String a = "[" + Math.round(mc.thePlayer.getDistance(a.Method2837(), a.Method2838(), a.Method2839())) + "m]" + a.Method2835();
         RenderUtils.Method1103(a + (a - a) / 2.0F - (float)(mc.fontRendererObj.getStringWidth(a) / 2) - 2.0F, a - (float)mc.fontRendererObj.FONT_HEIGHT + 4.0F, (float)(mc.fontRendererObj.getStringWidth(a) + 2), (float)mc.fontRendererObj.FONT_HEIGHT, (new Color(0, 0, 0, 120)).getRGB());
         mc.fontRendererObj.drawStringWithShadow(a, a + (a - a) / 2.0F - (float)(mc.fontRendererObj.getStringWidth(a) / 2), a - (float)(mc.fontRendererObj.FONT_HEIGHT / 2), -1);
         GL11.glPopMatrix();
      }

   }

   private void Method2250(EventRender3D a, Class260 a) {
      if (mc.getCurrentServerData().serverIP.equals(a.Method2836()) && mc.thePlayer.dimension == a.Method2840()) {
         Entity a = Minecraft.getMinecraft().getRenderViewEntity();
         double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a.Field2922;
         double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a.Field2922;
         double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a.Field2922;
         this.Method2248(a, 12.0, a, a, a, a);
         RenderHelper.disableStandardItemLighting();
         GlStateManager.enableDepth();
         GlStateManager.depthMask(true);
      }

   }
}
