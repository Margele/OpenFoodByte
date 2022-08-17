package awsl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import obfuscate.a;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.GlobalModule;

public class Class350 {
   public static float Field1680 = 1.0F;
   private static HashMap Field1681 = new HashMap();
   public static HashMap Field1682 = new HashMap();

   public static Point Method30() {
      Minecraft var0 = Minecraft.getMinecraft();
      int var1 = var0.gameSettings.guiScale;
      short var3 = 1000;

      for(int var2 = 0; var2 < var3 && var0.displayWidth / (var2 + 1) >= 320 && var0.displayHeight / (var2 + 1) >= 240; ++var2) {
      }

      byte var4 = 2;
      return new Point(Mouse.getX() / var4, var0.displayHeight / var4 - Mouse.getY() / var4 - 1);
   }

   public static void Method31(double a, int a, double a, double a, double a, boolean a, boolean a) {
      Method32(a, a, a, a, a, a, a, 0.0F, 0.0F, 0.0F);
   }

   public static void Method32(double a, int a, double a, double a, double a, boolean a, boolean a, float a, float a, float a) {
      double var14 = a;
      GlStateManager.alphaFunc(516, 0.0F);
      GL11.glLineWidth(1.0F);

      for(double var16 = 0.5; var16 < (double)a; var16 += 0.5) {
         GL11.glColor4d((double)a, (double)a, (double)a, var14);
         GL11.glBegin(1);
         GL11.glVertex2d(a + var16, a - var16);
         GL11.glVertex2d(a + var16, a + var16);
         GL11.glEnd();
         double var18 = a - var16 / (double)a;
         var14 = var18;
      }

   }

   public static void Method33(double a, int a, double a, double a, double a, boolean a, boolean a) {
      Method34(a, a, a, a, a, a, a, 0.0F, 0.0F, 0.0F);
   }

   public static void Method34(double a, int a, double a, double a, double a, boolean a, boolean a, float a, float a, float a) {
      double var14 = a;
      GlStateManager.alphaFunc(516, 0.0F);
      GL11.glLineWidth(1.0F);

      for(double var16 = 0.0; var16 < (double)a; var16 += 0.5) {
         GL11.glColor4d((double)a, (double)a, (double)a, var14);
         GL11.glBegin(1);
         GL11.glVertex2d(a - var16, a + var16);
         GL11.glVertex2d(a + var16, a + var16);
         GL11.glEnd();
         double var18 = a - var16 / (double)a;
         var14 = var18;
      }

   }

   public static void Method35() {
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glDisable(2884);
   }

   public static void Method36() {
      GL11.glDisable(3042);
      GL11.glEnable(3553);
      GL11.glEnable(2884);
   }

   public static void Method37() {
      GL11.glEnable(3008);
      GL11.glEnable(3553);
      GL11.glEnable(3042);
   }

   public static void Method38(Color a) {
      GL11.glColor4f((float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, (float)a.getAlpha() / 255.0F);
   }

   public static void Method39(Color a, float a) {
      GL11.glColor4f((float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, a);
   }

   public static void Method40(int a, int a, int a, int a, boolean a) {
      if (GlobalModule.Field3169.getValue() && OpenGlHelper.shadersSupported) {
         GL11.glEnable(3089);
         Method43(a, a, a, a);
         Method41(a);
         GL11.glDisable(3089);
      }
   }

   public static void Method41(boolean a) {
      if (GlobalModule.Field3169.getValue() && OpenGlHelper.shadersSupported) {
         GL11.glPushMatrix();
         Class347.Field1663.framebufferRenderExt(Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight, true);
         GL11.glPopMatrix();
         Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();
         GlStateManager.enableDepth();
      }
   }

   public static void Method42(boolean a) {
      if (GlobalModule.Field3169.getValue() && OpenGlHelper.shadersSupported) {
         GL11.glPushMatrix();
         Class347.Field1663.framebufferRenderExt(Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight, true);
         GL11.glPopMatrix();
         Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();
         GlStateManager.enableDepth();
      }
   }

   public static void Method43(int a, int a, int a, int a) {
      a -= a;
      a -= a;
      Minecraft var4 = Minecraft.getMinecraft();
      ScaledResolution var5 = new ScaledResolution(var4);
      GL11.glScissor(a * var5.getScaleFactor(), var4.displayHeight - a * var5.getScaleFactor() - a * var5.getScaleFactor(), a * var5.getScaleFactor(), a * var5.getScaleFactor());
   }

   public static void Method44(boolean a) {
      if (GlobalModule.Field3169.getValue() && OpenGlHelper.shadersSupported) {
         Minecraft var1 = Minecraft.getMinecraft();
         if (var1.thePlayer != null && var1.thePlayer.ticksExisted > 10) {
            var1.getFramebuffer().unbindFramebuffer();
            Class347.Field1663.bindFramebuffer(true);
            var1.getFramebuffer().framebufferRenderExt(var1.displayWidth, var1.displayHeight, true);
            if (OpenGlHelper.shadersSupported && Class347.Method376() != null) {
               GlStateManager.matrixMode(5890);
               GlStateManager.pushMatrix();
               GlStateManager.loadIdentity();
               Class347.Method376().loadShaderGroup(Field1680);
               GlStateManager.popMatrix();
            }

            Class347.Field1663.unbindFramebuffer();
            var1.getFramebuffer().bindFramebuffer(true);
            var1.entityRenderer.setupOverlayRendering();
         }

      }
   }

   public static int Method45() {
      return -1;
   }

   public static int Method46(Color a) {
      return a.getAlpha() << 24 | a.getRed() << 16 | a.getGreen() << 8 | a.getBlue();
   }

   public static void Method47() {
      if (GlobalModule.Field3169.getValue()) {
         Method39(new Color(0.05F, 0.05F, 0.05F, 0.3F), 0.2F);
      } else {
         Method39(new Color(0, 153, 255), 0.7F);
      }

   }

   public static void Method48(int a, int a, int a, int a, int a) {
      Method49(a, a, a, a, a, new Color(0, 0, 0, GlobalModule.Field3169.getValue() ? 120 : 100));
   }

   public static void Method49(int a, int a, int a, int a, int a, Color a) {
      GlStateManager.alphaFunc(516, 0.01F);
      a += a * 2;
      a += a * 2;
      a -= a;
      a -= a;
      float var6 = (float)a - 0.25F;
      float var7 = (float)a + 0.25F;
      int var8 = a * a + a + a.hashCode() * a + a;
      GL11.glEnable(3553);
      GL11.glDisable(2884);
      GL11.glEnable(3008);
      GL11.glEnable(3042);
      boolean var9 = true;
      int var14;
      if (Field1681.containsKey(var8)) {
         var14 = (Integer)Field1681.Method2665(var8);
         GlStateManager.bindTexture(var14);
      } else {
         BufferedImage var10 = new BufferedImage(a, a, 2);
         Graphics var11 = var10.getGraphics();
         var11.setColor(a);
         var11.fillRect(a, a, a - a * 2, a - a * 2);
         var11.dispose();
         Class187 var12 = new Class187((float)a);
         BufferedImage var13 = var12.Method62(var10, (BufferedImage)null);
         var14 = TextureUtil.uploadTextureImageAllocate(TextureUtil.glGenTextures(), var13, true, false);
         Field1681.put(var8, var14);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2f(var6, var7);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2f(var6, var7 + (float)a);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2f(var6 + (float)a, var7 + (float)a);
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2f(var6 + (float)a, var7);
      GL11.glEnd();
      GL11.glDisable(3553);
   }

   public static void Method50(int a, int a, int a, int a, int a, int a) {
      Minecraft var7 = Minecraft.getMinecraft();
      ScaledResolution var8 = new ScaledResolution(var7);
      double var9 = 1.0 / (double)var8.getScaleFactor();
      a *= var8.getScaleFactor();
      a *= var8.getScaleFactor();
      byte var11 = 2;
      Class348.Method371();
      int var12 = a / var11;
      int var13 = a / var11;
      byte var14 = 3;
      int var15 = a * a * a * a * a + a + a + a + a + a;
      GL11.glEnable(3553);
      GL11.glDisable(2884);
      GL11.glEnable(3008);
      GL11.glEnable(3042);
      boolean var16 = true;
      int var25;
      if (Field1682.containsKey(var15)) {
         var25 = (Integer)Field1682.Method2665(var15);
         GlStateManager.bindTexture(var25);
         a.trash(new String[4]);
      }

      ByteBuffer var17 = BufferUtils.createByteBuffer(a * a * var14).order(ByteOrder.nativeOrder());
      GL11.glReadPixels(a, var7.displayHeight - a - a, a, a, 6407, 5121, var17);
      BufferedImage var18 = new BufferedImage(a, a, 1);
      int var19 = 0;
      if (var19 < a) {
         int var20 = 0;
         if (var20 < a) {
            int var21 = (var19 + a * var20) * var14;
            int var22 = var17.get(var21) & 255;
            int var23 = var17.get(var21 + 1) & 255;
            int var24 = var17.get(var21 + 2) & 255;
            var18.setRGB(var19, a - (var20 + 1), -16777216 | var22 << 16 | var23 << 8 | var24);
            ++var20;
         }

         ++var19;
      }

      Class196 var26 = new Class196((float)a, (float)a, a);
      BufferedImage var27 = new BufferedImage(var12, var13, var18.getType());
      Graphics var28 = var27.getGraphics();
      var28.drawImage(var18, 0, 0, var12, var13, (ImageObserver)null);
      var28.dispose();
      BufferedImage var29 = var26.Method62(var27, (BufferedImage)null);
      var25 = TextureUtil.uploadTextureImageAllocate(TextureUtil.glGenTextures(), var29, true, false);
      Field1682.put(var15, var25);
      GL11.glPushMatrix();
      GL11.glScaled(var9, var9, var9);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2f((float)a, (float)a);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2f((float)a, (float)(a + a));
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2f((float)(a + a), (float)(a + a));
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2f((float)(a + a), (float)a);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glDisable(3553);
   }
}
