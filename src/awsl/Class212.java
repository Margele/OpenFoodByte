package awsl;

import java.awt.Color;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.inventory.Slot;
import net.minecraft.util.AxisAlignedBB;
import obfuscate.a;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.Wrapper;

public class Class212 {
   static Minecraft Field1191;
   FontRenderer Field1192;
   private static Frustum Field1193;
   private static String Field1194;

   public Class212() {
      this.Field1192 = Wrapper.INSTANCE.getFontRendererObj();
   }

   public static void Method2538(float a, float a, float a, Runnable a) {
      GL11.glPushMatrix();
      GL11.glTranslatef(a, a, 0.0F);
      GL11.glScalef(a, a, 1.0F);
      GL11.glTranslatef(-a, -a, 0.0F);
      a.Method1339();
      GL11.glPopMatrix();
   }

   public static void Method2539(float a, float a, float a) {
      GlStateManager.pushMatrix();
      GlStateManager.translate(a, a, 0.0F);
      GlStateManager.scale(a, a, 1.0F);
      GlStateManager.translate(-a, -a, 0.0F);
   }

   public static void Method2540() {
      GlStateManager.popMatrix();
   }

   public static void Method2541(int a, float a) {
      float var2 = (float)(a >> 16 & 255) / 255.0F;
      float var3 = (float)(a >> 8 & 255) / 255.0F;
      float var4 = (float)(a & 255) / 255.0F;
      GlStateManager.color(var2, var3, var4, a);
   }

   public static void Method2542(int a) {
      Method2541(a, (float)(a >> 24 & 255) / 255.0F);
   }

   public static void Method2543(Color a) {
      a = Color.white;
      Method2544((double)((float)a.getRed() / 255.0F), (double)((float)a.getGreen() / 255.0F), (double)((float)a.getBlue() / 255.0F), (double)((float)a.getAlpha() / 255.0F));
   }

   public static void Method2544(double a, double a, double a, double a) {
      GL11.glColor4d(a, a, a, a);
   }

   public static boolean Method2545(float a, float a, float a, float a, float a, float a) {
      return a >= a && a >= a && a < a + a && a < a + a;
   }

   public static void Method2546(List a) {
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glBlendFunc(770, 771);
      int var1 = 0;

      try {
         Iterator var2 = a.Method1383();

         while(var2.Method932()) {
            Class285 var3 = (Class285)var2.Method933();
            ++var1;
            Class216 var4 = var3.Method3098();
            boolean var5 = true;
            double var6 = var4.Field1207 - ReflectionUtils.getRenderPosX();
            double var8 = var4.Field1208 - ReflectionUtils.getRenderPosY();
            double var10 = var4.Field1209 - ReflectionUtils.getRenderPosZ();
            double var12 = Field1191.thePlayer.getDistance(var4.Field1207, var4.Field1208 - 1.0, var4.Field1209);
            int var14 = (int)(var12 * 4.0 + 10.0);
            if (var14 > 350) {
               var14 = 350;
            }

            if (!Method2549(new EntityEgg(Field1191.theWorld, var4.Field1207, var4.Field1208, var4.Field1209))) {
               var5 = false;
            }

            if (var1 % 10 != 0 && var12 > 25.0) {
               var5 = false;
            }

            if (var1 % 3 == 0 && var12 > 15.0) {
               var5 = false;
            }

            GL11.glPushMatrix();
            GL11.glTranslated(var6, var8, var10);
            float var15 = 0.04F;
            GL11.glScalef(-var15, -var15, -var15);
            GL11.glRotated((double)(-Field1191.getRenderManager().playerViewY), 0.0, 1.0, 0.0);
            GL11.glRotated((double)Field1191.getRenderManager().playerViewX, Field1191.gameSettings.thirdPersonView == 2 ? -1.0 : 1.0, 0.0, 0.0);
            Color var16 = Class272.Method2773((float)var1 / 5.0F, Class668.GENERAL);
            Method2548(0, -3, 0.7, var16.hashCode(), var14);
            if (var12 < 4.0) {
               Method2548(0, -3, 1.4, (new Color(var16.getRed(), var16.getGreen(), var16.getBlue(), 50)).hashCode(), var14);
            }

            if (var12 < 20.0) {
               Method2548(0, -3, 2.3, (new Color(var16.getRed(), var16.getGreen(), var16.getBlue(), 30)).hashCode(), var14);
            }

            GL11.glScalef(0.8F, 0.8F, 0.8F);
            GL11.glPopMatrix();
         }
      } catch (ConcurrentModificationException var17) {
      }

      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glColor3d(255.0, 255.0, 255.0);
   }

   public static void Method2547(int a, int a, double a, int a) {
      float var5 = (float)(a >> 24 & 255) / 255.0F;
      float var6 = (float)(a >> 16 & 255) / 255.0F;
      float var7 = (float)(a >> 8 & 255) / 255.0F;
      float var8 = (float)(a & 255) / 255.0F;
      GL11.glColor4f(var6, var7, var8, var5);
      GL11.glBegin(6);

      for(int var9 = 0; var9 <= 18; ++var9) {
         double var10 = Math.sin((double)(var9 * 20) * Math.PI / 180.0) * a;
         double var12 = Math.cos((double)(var9 * 20) * Math.PI / 180.0) * a;
         GL11.glVertex2d((double)a + var10, (double)a + var12);
      }

      GL11.glEnd();
   }

   public static void Method2548(int a, int a, double a, int a, int a) {
      float var6 = (float)(a >> 24 & 255) / 255.0F;
      float var7 = (float)(a >> 16 & 255) / 255.0F;
      float var8 = (float)(a >> 8 & 255) / 255.0F;
      float var9 = (float)(a & 255) / 255.0F;
      GL11.glColor4f(var7, var8, var9, var6);
      GL11.glBegin(6);

      for(int var10 = 0; var10 <= 360 / a; ++var10) {
         double var11 = Math.sin((double)(var10 * a) * Math.PI / 180.0) * a;
         double var13 = Math.cos((double)(var10 * a) * Math.PI / 180.0) * a;
         GL11.glVertex2d((double)a + var11, (double)a + var13);
      }

      GL11.glEnd();
   }

   public static boolean Method2549(Entity a) {
      return Method2550(a.getEntityBoundingBox()) || a.ignoreFrustumCheck;
   }

   public static boolean Method2550(AxisAlignedBB a) {
      Entity var1 = Wrapper.INSTANCE.getMinecraft().getRenderViewEntity();
      Field1193.setPosition(var1.posX, var1.posY, var1.posZ);
      return Field1193.isBoundingBoxInFrustum(a);
   }

   public void Method2551(double a, double a, double a, boolean a, Color a) {
      Method2555(a, a, a, 360.0, a, a);
   }

   public void Method2552(double a, double a, double a, boolean a) {
      this.Method2556(a, a, a, 360, a);
   }

   public static void Method2553(double a, double a, double a, Color a) {
      Method2557(a, a, a, 360, a);
   }

   public void Method2554(double a, double a, double a) {
      this.Method2558(a, a, a, 360);
   }

   public static void Method2555(double a, double a, double a, double a, boolean a, Color a) {
      a /= 2.0;
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glDisable(2884);
      GlStateManager.disableAlpha();
      GlStateManager.disableDepth();
      Method2543(a);
      GL11.glLineWidth(2.0F);
      GL11.glEnable(2848);
      GL11.glBegin(6);

      for(double var10 = 0.0; var10 <= a / 4.0; ++var10) {
         double var12 = var10 * 4.0 * 6.283185307179586 / 360.0;
         GL11.glVertex2d(a + a * Math.cos(var12) + a, a + a * Math.sin(var12) + a);
      }

      GL11.glEnd();
      GL11.glDisable(2848);
      GlStateManager.enableAlpha();
      GlStateManager.enableDepth();
      GL11.glEnable(2884);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      Method2543(Color.white);
   }

   public void Method2556(double a, double a, double a, int a, boolean a) {
      Method2555(a, a, a, (double)a, a, (Color)null);
   }

   public static void Method2557(double a, double a, double a, int a, Color a) {
      Method2555(a, a, a, (double)a, true, a);
   }

   public void Method2558(double a, double a, double a, int a) {
      Method2555(a, a, a, (double)a, true, (Color)null);
   }

   public static void Method2559(float a, float a, float a, float a, float a, int a, float a, int a) {
      String var8 = Method2566();
      if (a == 16777215) {
         a = Class681.WHITE.Field2962;
      }

      if (a == 16777215) {
         a = Class681.WHITE.Field2962;
      }

      if (a < 0.0F) {
         a = 0.0F;
      }

      if (a > a / 2.0F) {
         a = a / 2.0F;
      }

      if (a > a / 2.0F) {
         a = a / 2.0F;
      }

      Method2560(a + a, a + a, a - a * 2.0F, a - a * 2.0F, a);
      Method2560(a + a, a, a - a * 2.0F, a, a);
      Method2560(a + a, a + a - a, a - a * 2.0F, a, a);
      Method2560(a, a + a, a, a - a * 2.0F, a);
      Method2560(a + a - a, a + a, a, a - a * 2.0F, a);
      Method2561();
      Method2542(a);
      GL11.glBegin(6);
      float var9 = a + a;
      float var10 = a + a;
      GL11.glVertex2d((double)var9, (double)var10);
      int var11 = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      int var12 = 0;
      double var13;
      if (var12 < var11 + 1) {
         var13 = 6.283185307179586 * (double)(var12 + 180) / (double)(var11 * 4);
         GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
         ++var12;
         a.trash(new String[4]);
      }

      GL11.glEnd();
      GL11.glBegin(6);
      var9 = a + a - a;
      var10 = a + a;
      GL11.glVertex2d((double)var9, (double)var10);
      var11 = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      byte var15 = 0;
      if (var15 < var11 + 1) {
         var13 = 6.283185307179586 * (double)(var15 + 90) / (double)(var11 * 4);
         GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
         var12 = var15 + 1;
      }

      GL11.glEnd();
      GL11.glBegin(6);
      var9 = a + a;
      var10 = a + a - a;
      GL11.glVertex2d((double)var9, (double)var10);
      var11 = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      var15 = 0;
      if (var15 < var11 + 1) {
         var13 = 6.283185307179586 * (double)(var15 + 270) / (double)(var11 * 4);
         GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
         var12 = var15 + 1;
      }

      GL11.glEnd();
      GL11.glBegin(6);
      var9 = a + a - a;
      var10 = a + a - a;
      GL11.glVertex2d((double)var9, (double)var10);
      var11 = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      var15 = 0;
      if (var15 < var11 + 1) {
         var13 = 6.283185307179586 * (double)var15 / (double)(var11 * 4);
         GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
         var12 = var15 + 1;
      }

      GL11.glEnd();
      Method2542(a);
      GL11.glLineWidth(a);
      GL11.glBegin(3);
      var9 = a + a;
      var10 = a + a;
      var11 = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      var13 = 6.283185307179586 * (double)(var11 + 180) / (double)(var11 * 4);
      GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
      var12 = var11 - 1;
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glVertex2d((double)(a + a - a), (double)a);
      var9 = a + a - a;
      var10 = a + a;
      var13 = 6.283185307179586 * (double)(var11 + 90) / (double)(var11 * 4);
      GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
      var12 = var11 - 1;
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      GL11.glVertex2d((double)(a + a), (double)(a + a - a));
      var9 = a + a - a;
      var10 = a + a - a;
      var13 = 6.283185307179586 * (double)var11 / (double)(var11 * 4);
      GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
      var12 = var11 - 1;
      GL11.glVertex2d((double)(a + a - a), (double)(a + a));
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      var9 = a + a;
      var10 = a + a - a;
      var13 = 6.283185307179586 * (double)(var11 + 270) / (double)(var11 * 4);
      GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
      var12 = var11 - 1;
      GL11.glVertex2d((double)a, (double)(a + a - a));
      GL11.glVertex2d((double)a, (double)(a + a));
      GL11.glEnd();
      Method2562();
   }

   public static void Method2560(float a, float a, float a, float a, int a) {
      Method2561();
      Method2542(a);
      GL11.glBegin(7);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      GL11.glVertex2d((double)a, (double)(a + a));
      GL11.glEnd();
      Method2562();
   }

   public static void Method2561() {
      GL11.glEnable(3042);
      GL11.glDisable(2884);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
   }

   public static void Method2562() {
      GL11.glDisable(3042);
      GL11.glEnable(2884);
      GL11.glEnable(3553);
      GL11.glDisable(2848);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableTexture2D();
   }

   public static void Method2563(int a, int a, Slot a, int a) {
      int var4 = a + a.xDisplayPosition;
      int var5 = a + a.yDisplayPosition;
      Method2559((float)var4, (float)var5, 16.0F, 16.0F, 1.0F, -1, 2.0F, a);
   }

   public static void Method2564(Slot a, Color a) {
      Gui.drawRect(a.xDisplayPosition, a.yDisplayPosition, a.xDisplayPosition + 16, a.yDisplayPosition + 16, a.getRGB());
   }

   static {
      Field1191 = Wrapper.INSTANCE.getMinecraft();
      Field1193 = new Frustum();
      Method2565((String)null);
   }

   public static void Method2565(String string) {
      Field1194 = string;
   }

   public static String Method2566() {
      return Field1194;
   }

   private static ConcurrentModificationException Method2567(ConcurrentModificationException concurrentModificationException) {
      return concurrentModificationException;
   }
}
