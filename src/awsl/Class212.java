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
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GlStateManager.color(a, a, a, a);
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
      int a = 0;

      try {
         Iterator var2 = a.Method1383();

         while(var2.Method932()) {
            Class285 a = (Class285)var2.Method933();
            ++a;
            Class216 a = a.Method3098();
            boolean a = true;
            double a = a.Field1207 - ReflectionUtils.getRenderPosX();
            double a = a.Field1208 - ReflectionUtils.getRenderPosY();
            double a = a.Field1209 - ReflectionUtils.getRenderPosZ();
            double a = Field1191.thePlayer.getDistance(a.Field1207, a.Field1208 - 1.0, a.Field1209);
            int a = (int)(a * 4.0 + 10.0);
            if (a > 350) {
               a = 350;
            }

            if (!Method2549(new EntityEgg(Field1191.theWorld, a.Field1207, a.Field1208, a.Field1209))) {
               a = false;
            }

            if (a % 10 != 0 && a > 25.0) {
               a = false;
            }

            if (a % 3 == 0 && a > 15.0) {
               a = false;
            }

            GL11.glPushMatrix();
            GL11.glTranslated(a, a, a);
            float a = 0.04F;
            GL11.glScalef(-a, -a, -a);
            GL11.glRotated((double)(-Field1191.getRenderManager().playerViewY), 0.0, 1.0, 0.0);
            GL11.glRotated((double)Field1191.getRenderManager().playerViewX, Field1191.gameSettings.thirdPersonView == 2 ? -1.0 : 1.0, 0.0, 0.0);
            Color a = Class272.Method2773((float)a / 5.0F, Class668.GENERAL);
            Method2548(0, -3, 0.7, a.hashCode(), a);
            if (a < 4.0) {
               Method2548(0, -3, 1.4, (new Color(a.getRed(), a.getGreen(), a.getBlue(), 50)).hashCode(), a);
            }

            if (a < 20.0) {
               Method2548(0, -3, 2.3, (new Color(a.getRed(), a.getGreen(), a.getBlue(), 30)).hashCode(), a);
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
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a);
      GL11.glBegin(6);

      for(int a = 0; a <= 18; ++a) {
         double a = Math.sin((double)(a * 20) * Math.PI / 180.0) * a;
         double a = Math.cos((double)(a * 20) * Math.PI / 180.0) * a;
         GL11.glVertex2d((double)a + a, (double)a + a);
      }

      GL11.glEnd();
   }

   public static void Method2548(int a, int a, double a, int a, int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a);
      GL11.glBegin(6);

      for(int a = 0; a <= 360 / a; ++a) {
         double a = Math.sin((double)(a * a) * Math.PI / 180.0) * a;
         double a = Math.cos((double)(a * a) * Math.PI / 180.0) * a;
         GL11.glVertex2d((double)a + a, (double)a + a);
      }

      GL11.glEnd();
   }

   public static boolean Method2549(Entity a) {
      return Method2550(a.getEntityBoundingBox()) || a.ignoreFrustumCheck;
   }

   public static boolean Method2550(AxisAlignedBB a) {
      Entity a = Wrapper.INSTANCE.getMinecraft().getRenderViewEntity();
      Field1193.setPosition(a.posX, a.posY, a.posZ);
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

   public static void Method2555(double a, double a, double a, double a, boolean a4, Color a) {
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

      for(double a = 0.0; a <= a / 4.0; ++a) {
         double a = a * 4.0 * 6.283185307179586 / 360.0;
         GL11.glVertex2d(a + a * Math.cos(a) + a, a + a * Math.sin(a) + a);
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
      String a = Method2566();
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
      float a = a + a;
      float a = a + a;
      GL11.glVertex2d((double)a, (double)a);
      int a = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      int a = 0;
      double a;
      if (a < a + 1) {
         a = 6.283185307179586 * (double)(a + 180) / (double)(a * 4);
         GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
         ++a;
         a.trash(new String[4]);
      }

      GL11.glEnd();
      GL11.glBegin(6);
      a = a + a - a;
      a = a + a;
      GL11.glVertex2d((double)a, (double)a);
      a = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      int a = 0;
      if (a < a + 1) {
         a = 6.283185307179586 * (double)(a + 90) / (double)(a * 4);
         GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
         a = a + 1;
      }

      GL11.glEnd();
      GL11.glBegin(6);
      a = a + a;
      a = a + a - a;
      GL11.glVertex2d((double)a, (double)a);
      a = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      a = 0;
      if (a < a + 1) {
         a = 6.283185307179586 * (double)(a + 270) / (double)(a * 4);
         GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
         a = a + 1;
      }

      GL11.glEnd();
      GL11.glBegin(6);
      a = a + a - a;
      a = a + a - a;
      GL11.glVertex2d((double)a, (double)a);
      a = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      a = 0;
      if (a < a + 1) {
         a = 6.283185307179586 * (double)a / (double)(a * 4);
         GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
         a = a + 1;
      }

      GL11.glEnd();
      Method2542(a);
      GL11.glLineWidth(a);
      GL11.glBegin(3);
      a = a + a;
      a = a + a;
      a = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      a = 6.283185307179586 * (double)(a + 180) / (double)(a * 4);
      GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
      a = a - 1;
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glVertex2d((double)(a + a - a), (double)a);
      a = a + a - a;
      a = a + a;
      a = 6.283185307179586 * (double)(a + 90) / (double)(a * 4);
      GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
      a = a - 1;
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      GL11.glVertex2d((double)(a + a), (double)(a + a - a));
      a = a + a - a;
      a = a + a - a;
      a = 6.283185307179586 * (double)a / (double)(a * 4);
      GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
      a = a - 1;
      GL11.glVertex2d((double)(a + a - a), (double)(a + a));
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      a = a + a;
      a = a + a - a;
      a = 6.283185307179586 * (double)(a + 270) / (double)(a * 4);
      GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
      a = a - 1;
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
      int a = a + a.xDisplayPosition;
      int a = a + a.yDisplayPosition;
      Method2559((float)a, (float)a, 16.0F, 16.0F, 1.0F, -1, 2.0F, a);
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
