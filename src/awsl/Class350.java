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
      Minecraft a = Minecraft.getMinecraft();
      int a = a.gameSettings.guiScale;
      int a = 1000;

      for(int a = 0; a < a && a.displayWidth / (a + 1) >= 320 && a.displayHeight / (a + 1) >= 240; ++a) {
      }

      int a = 2;
      return new Point(Mouse.getX() / a, a.displayHeight / a - Mouse.getY() / a - 1);
   }

   public static void Method31(double a, int a, double a, double a, double a, boolean a, boolean a) {
      Method32(a, a, a, a, a, a, a, 0.0F, 0.0F, 0.0F);
   }

   public static void Method32(double a, int a, double a, double a, double a, boolean a5, boolean a6, float a, float a, float a) {
      double a = a;
      GlStateManager.alphaFunc(516, 0.0F);
      GL11.glLineWidth(1.0F);

      for(double a = 0.5; a < (double)a; a += 0.5) {
         GL11.glColor4d((double)a, (double)a, (double)a, a);
         GL11.glBegin(1);
         GL11.glVertex2d(a + a, a - a);
         GL11.glVertex2d(a + a, a + a);
         GL11.glEnd();
         double var18 = a - a / (double)a;
         a = var18;
      }

   }

   public static void Method33(double a, int a, double a, double a, double a, boolean a, boolean a) {
      Method34(a, a, a, a, a, a, a, 0.0F, 0.0F, 0.0F);
   }

   public static void Method34(double a, int a, double a, double a, double a, boolean a5, boolean a6, float a, float a, float a) {
      double a = a;
      GlStateManager.alphaFunc(516, 0.0F);
      GL11.glLineWidth(1.0F);

      for(double a = 0.0; a < (double)a; a += 0.5) {
         GL11.glColor4d((double)a, (double)a, (double)a, a);
         GL11.glBegin(1);
         GL11.glVertex2d(a - a, a + a);
         GL11.glVertex2d(a + a, a + a);
         GL11.glEnd();
         double var18 = a - a / (double)a;
         a = var18;
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
      Minecraft a = Minecraft.getMinecraft();
      ScaledResolution a = new ScaledResolution(a);
      GL11.glScissor(a * a.getScaleFactor(), a.displayHeight - a * a.getScaleFactor() - a * a.getScaleFactor(), a * a.getScaleFactor(), a * a.getScaleFactor());
   }

   public static void Method44(boolean a) {
      if (GlobalModule.Field3169.getValue() && OpenGlHelper.shadersSupported) {
         Minecraft a = Minecraft.getMinecraft();
         if (a.thePlayer != null && a.thePlayer.ticksExisted > 10) {
            a.getFramebuffer().unbindFramebuffer();
            Class347.Field1663.bindFramebuffer(true);
            a.getFramebuffer().framebufferRenderExt(a.displayWidth, a.displayHeight, true);
            if (OpenGlHelper.shadersSupported && Class347.Method376() != null) {
               GlStateManager.matrixMode(5890);
               GlStateManager.pushMatrix();
               GlStateManager.loadIdentity();
               Class347.Method376().loadShaderGroup(Field1680);
               GlStateManager.popMatrix();
            }

            Class347.Field1663.unbindFramebuffer();
            a.getFramebuffer().bindFramebuffer(true);
            a.entityRenderer.setupOverlayRendering();
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
      float a = (float)a - 0.25F;
      float a = (float)a + 0.25F;
      int a = a * a + a + a.hashCode() * a + a;
      GL11.glEnable(3553);
      GL11.glDisable(2884);
      GL11.glEnable(3008);
      GL11.glEnable(3042);
      int a = true;
      int a;
      if (Field1681.containsKey(a)) {
         a = (Integer)Field1681.Method2665(a);
         GlStateManager.bindTexture(a);
      } else {
         BufferedImage a = new BufferedImage(a, a, 2);
         Graphics a = a.getGraphics();
         a.setColor(a);
         a.fillRect(a, a, a - a * 2, a - a * 2);
         a.dispose();
         Class187 a = new Class187((float)a);
         BufferedImage a = a.Method62(a, (BufferedImage)null);
         a = TextureUtil.uploadTextureImageAllocate(TextureUtil.glGenTextures(), a, true, false);
         Field1681.put(a, a);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2f(a, a);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2f(a, a + (float)a);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2f(a + (float)a, a + (float)a);
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2f(a + (float)a, a);
      GL11.glEnd();
      GL11.glDisable(3553);
   }

   public static void Method50(int a, int a, int a, int a, int a, int a) {
      Minecraft a = Minecraft.getMinecraft();
      ScaledResolution a = new ScaledResolution(a);
      double a = 1.0 / (double)a.getScaleFactor();
      a *= a.getScaleFactor();
      a *= a.getScaleFactor();
      byte a = 2;
      Class348.Method371();
      int a = a / a;
      int a = a / a;
      int a = 3;
      int a = a * a * a * a * a + a + a + a + a + a;
      GL11.glEnable(3553);
      GL11.glDisable(2884);
      GL11.glEnable(3008);
      GL11.glEnable(3042);
      int a = true;
      int a;
      if (Field1682.containsKey(a)) {
         a = (Integer)Field1682.Method2665(a);
         GlStateManager.bindTexture(a);
         a.trash(new String[4]);
      }

      ByteBuffer a = BufferUtils.createByteBuffer(a * a * a).order(ByteOrder.nativeOrder());
      GL11.glReadPixels(a, a.displayHeight - a - a, a, a, 6407, 5121, a);
      BufferedImage a = new BufferedImage(a, a, 1);
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            int a = (a + a * a) * a;
            int a = a.get(a) & 255;
            int a = a.get(a + 1) & 255;
            int a = a.get(a + 2) & 255;
            a.setRGB(a, a - (a + 1), -16777216 | a << 16 | a << 8 | a);
            ++a;
         }

         ++a;
      }

      Class196 a = new Class196((float)a, (float)a, a);
      BufferedImage a = new BufferedImage(a, a, a.getType());
      Graphics a = a.getGraphics();
      a.drawImage(a, 0, 0, a, a, (ImageObserver)null);
      a.dispose();
      BufferedImage a = a.Method62(a, (BufferedImage)null);
      a = TextureUtil.uploadTextureImageAllocate(TextureUtil.glGenTextures(), a, true, false);
      Field1682.put(a, a);
      GL11.glPushMatrix();
      GL11.glScaled(a, a, a);
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
