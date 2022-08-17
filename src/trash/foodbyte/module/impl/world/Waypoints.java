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

   protected void Method2248(Class260 a, double a, double a, double a, double a, Entity a) {
      float var12 = (float)(a.Method2837() - (double)((float)a) + 0.5);
      float var13 = (float)(a.Method2838() - (double)((float)a) + 1.0);
      float var14 = (float)(a.Method2839() - (double)((float)a) + 0.5);
      Class448.trash();
      double var15 = Math.sqrt((double)(var12 * var12 + var13 * var13 + var14 * var14));
      RenderManager var17 = Minecraft.getMinecraft().getRenderManager();
      FontRenderer var18 = mc.fontRendererObj;
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
      a[] var3 = Class448.trash();
      if (mc.getCurrentServerData().serverIP.equals(a.Method2836()) && mc.thePlayer.dimension == a.Method2840() || !this.Method1734(new Vec3(a.Method2837(), a.Method2838(), a.Method2839()))) {
         double var4 = a.Method2837();
         double var6 = a.Method2838();
         double var8 = a.Method2839();
         AxisAlignedBB var10 = (new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.94, 0.875, 0.94)).offset(var4 - ReflectionUtils.getRenderPosX(), var6 - ReflectionUtils.getRenderPosY(), var8 - ReflectionUtils.getRenderPosZ());
         List var11 = Arrays.asList(new Vector3d(var4 + var10.minX - var10.maxX + 0.5, var6, var8 + var10.minZ - var10.maxZ + 0.5), new Vector3d(var4 + var10.maxX - var10.minX - 0.5, var6, var8 + var10.minZ - var10.maxZ + 0.5), new Vector3d(var4 + var10.minX - var10.maxX + 0.5, var6, var8 + var10.maxZ - var10.minZ - 0.5), new Vector3d(var4 + var10.maxX - var10.minX - 0.5, var6, var8 + var10.maxZ - var10.minZ - 0.5), new Vector3d(var4 + var10.minX - var10.maxX + 0.5, var6 + var10.maxY - var10.minY, var8 + var10.minZ - var10.maxZ + 0.5), new Vector3d(var4 + var10.maxX - var10.minX - 0.5, var6 + var10.maxY - var10.minY, var8 + var10.minZ - var10.maxZ + 0.5), new Vector3d(var4 + var10.minX - var10.maxX + 0.5, var6 + var10.maxY - var10.minY, var8 + var10.maxZ - var10.minZ - 0.5), new Vector3d(var4 + var10.maxX - var10.minX - 0.5, var6 + var10.maxY - var10.minY, var8 + var10.maxZ - var10.minZ - 0.5));
         ReflectionUtils.setupCameraTransform(a.Field2923, 0);
         Vector4d var12 = null;
         Iterator var13 = var11.Method1383();
         if (var13.Method932()) {
            Vector3d var14 = (Vector3d)var13.Method933();
            var14 = RenderUtils.Method1136(var14.x - mc.getRenderManager().viewerPosX, var14.y - mc.getRenderManager().viewerPosY, var14.z - mc.getRenderManager().viewerPosZ);
            if (var14.z >= 0.0 && var14.z < 1.0) {
               var12 = new Vector4d(var14.x, var14.y, var14.z, 0.0);
               var12.x = Math.min(var14.x, var12.x);
               var12.y = Math.min(var14.y, var12.y);
               var12.z = Math.max(var14.x, var12.z);
               var12.w = Math.max(var14.y, var12.w);
            }
         }

         mc.entityRenderer.setupOverlayRendering();
         GL11.glPushMatrix();
         float var17 = (float)var12.x;
         float var18 = (float)var12.z;
         float var15 = (float)var12.y;
         String var16 = "[" + Math.round(mc.thePlayer.getDistance(a.Method2837(), a.Method2838(), a.Method2839())) + "m]" + a.Method2835();
         RenderUtils.Method1103(var17 + (var18 - var17) / 2.0F - (float)(mc.fontRendererObj.getStringWidth(var16) / 2) - 2.0F, var15 - (float)mc.fontRendererObj.FONT_HEIGHT + 4.0F, (float)(mc.fontRendererObj.getStringWidth(var16) + 2), (float)mc.fontRendererObj.FONT_HEIGHT, (new Color(0, 0, 0, 120)).getRGB());
         mc.fontRendererObj.drawStringWithShadow(var16, var17 + (var18 - var17) / 2.0F - (float)(mc.fontRendererObj.getStringWidth(var16) / 2), var15 - (float)(mc.fontRendererObj.FONT_HEIGHT / 2), -1);
         GL11.glPopMatrix();
      }

   }

   private void Method2250(EventRender3D a, Class260 a) {
      if (mc.getCurrentServerData().serverIP.equals(a.Method2836()) && mc.thePlayer.dimension == a.Method2840()) {
         Entity var3 = Minecraft.getMinecraft().getRenderViewEntity();
         double var4 = var3.lastTickPosX + (var3.posX - var3.lastTickPosX) * (double)a.Field2922;
         double var6 = var3.lastTickPosY + (var3.posY - var3.lastTickPosY) * (double)a.Field2922;
         double var8 = var3.lastTickPosZ + (var3.posZ - var3.lastTickPosZ) * (double)a.Field2922;
         this.Method2248(a, 12.0, var4, var6, var8, var3);
         RenderHelper.disableStandardItemLighting();
         GlStateManager.enableDepth();
         GlStateManager.depthMask(true);
      }

   }
}
