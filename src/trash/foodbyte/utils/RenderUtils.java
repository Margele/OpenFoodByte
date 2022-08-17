package trash.foodbyte.utils;

import awsl.Class681;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.text.NumberFormat;
import javax.vecmath.Vector3d;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import obfuscate.a;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.Wrapper;

public class RenderUtils {
   private static final Frustum Field1620;
   private static Minecraft Field1621;
   private static int[] trash;

   public static double Method1073(double a, double a, double a) {
      float a = (float)((double)GlobalModule.Field3185 * a);
      if (a < a) {
         if (a + (double)a < a) {
            a += (double)a;
         } else {
            a = a;
         }
      } else if (a - (double)a > a) {
         a -= (double)a;
      } else {
         a = a;
      }

      return a;
   }

   public static void Method1074(float a, float a, float a, float a, int a) {
      Method1104(a - 0.5F, a + 0.5F, a, a - 0.5F, a);
      Method1104(a, a + 0.5F, a + 0.5F, a - 0.5F, a);
      Method1104(a + 0.5F, a - 0.5F, a - 0.5F, a, a);
      Method1104(a + 0.5F, a, a - 0.5F, a + 0.5F, a);
      Method1104(a, a, a, a, a);
   }

   public static void Method1075(float a, float a, float a, float a, float a, int a) {
      Method1104(a - a, a, a, a, a);
      Method1104(a, a, a + a, a, a);
      Method1104(a, a + a, a, a, a);
      Method1104(a, a, a, a + a, a);
   }

   public static int Method1076() {
      ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
      int a = a.getScaledWidth();
      return a;
   }

   public static int Method1077() {
      ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
      int a = a.getScaledHeight();
      return a;
   }

   public static int Method1078() {
      ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
      int a = a.getScaleFactor();
      return a;
   }

   public static void Method1079(float a, float a, float a, float a) {
      int a = Method1078();
      GL11.glEnable(3089);
      GL11.glScissor((int)(a * (float)a), (int)((float)Display.getHeight() - a * (float)a), (int)(a * (float)a), (int)(a * (float)a));
   }

   public static void Method1080(float a, float a, float a, float a) {
      ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
      int a = a.getScaleFactor();
      GL11.glEnable(3089);
      GL11.glScissor((int)(a * (float)a), (int)(((float)a.getScaledHeight() - a) * (float)a), (int)((a - a) * (float)a), (int)((a - a) * (float)a));
   }

   public static void Method1081(int a, int a, float a, float a, float a) {
      int a;
      for(a = 1; (float)a < a && Field1621.displayWidth / (a + 1) >= 320 && Field1621.displayHeight / (a + 1) >= 240; ++a) {
      }

      GL11.glScissor(a * a, (int)((float)Field1621.displayHeight - ((float)a + a) * (float)a), (int)(a * (float)a), (int)(a * (float)a));
   }

   public static void Method1082() {
      GL11.glDisable(3089);
   }

   public static void Method1083(double a, double a, double a, double a, double a, double a, int a) {
      Method1084(a, a, a, a, a, a, a, true);
   }

   public static void Method1084(double a, double a, double a, double a, double a, double a, int a, boolean a) {
      Method1088(a);
      Method1133(a);
      GL11.glBegin(1);
      GL11.glVertex3d(a, a, a);
      GL11.glVertex3d(a, a, a);
      GL11.glEnd();
      Method1089(a);
   }

   public static void Method1085(double a, double a, double a, double a, float a, int a) {
      Method1090();
      Method1133(a);
      GL11.glLineWidth(a);
      GL11.glBegin(1);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glEnd();
      Method1091();
   }

   public static void Method1086(float a, float a, float a, float a, int a) {
      Method1090();
      Method1133(a);
      GL11.glLineWidth(a);
      int a = (int)Math.min(Math.max(a, 45.0F), 360.0F);
      GL11.glBegin(2);

      for(int a = 0; a < a; ++a) {
         double a = 6.283185307179586 * (double)a / (double)a;
         GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
      }

      GL11.glEnd();
      Method1091();
   }

   public static void Method1087(float a, float a, float a, int a) {
      Method1090();
      Method1133(a);
      int a = (int)Math.min(Math.max(a, 45.0F), 360.0F);
      GL11.glBegin(9);

      for(int a = 0; a < a; ++a) {
         double a = 6.283185307179586 * (double)a / (double)a;
         GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
      }

      GL11.glEnd();
      Method1091();
      Method1086(a, a, a, 1.5F, 16777215);
   }

   public static void Method1088(boolean a) {
      GL11.glDepthMask(false);
      GL11.glDisable(2929);
      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glLineWidth(1.0F);
   }

   public static void Method1089(boolean a) {
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glDisable(2848);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1090() {
      GL11.glEnable(3042);
      GL11.glDisable(2884);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
   }

   public static void Method1091() {
      GL11.glDisable(3042);
      GL11.glEnable(2884);
      GL11.glEnable(3553);
      GL11.glDisable(2848);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableTexture2D();
   }

   public static void Method1092() {
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
   }

   public static void Method1093() {
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1094(ResourceLocation a, int a, int a, float a, float a, float a) {
      new ScaledResolution(Minecraft.getMinecraft());
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glDepthMask(false);
      OpenGlHelper.glBlendFunc(770, 771, 1, 0);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, a);
      Minecraft.getMinecraft().getTextureManager().bindTexture(a);
      Gui.drawModalRectWithCustomSizedTexture(a, a, 0.0F, 0.0F, (int)a, (int)a, a, a);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
   }

   public static int Method1095(int a, float a) {
      Color a = new Color(a);
      float a = 0.003921569F * (float)a.getRed();
      float a = 0.003921569F * (float)a.getGreen();
      float a = 0.003921569F * (float)a.getBlue();
      return (new Color(a, a, a, a)).getRGB();
   }

   public static boolean Method1096(float a, float a, float a, float a, float a, float a) {
      return a > a && a < a && a > a && a < a;
   }

   public static void Method1097(double a, double a, double a, int a) {
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      float a = (float)(a >> 24 & 255) / 255.0F;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      GL11.glColor4f(a, a, a, a);
      Method1098(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method1098(AxisAlignedBB a) {
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.draw();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(1, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.draw();
   }

   public static void Method1099(float a, float a, float a, float a, int a, int a) {
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glDepthMask(true);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glHint(3155, 4354);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      Method1102(a *= 2.0F, (a *= 2.0F) + 1.0F, (a *= 2.0F) - 2.0F, a);
      Method1102((a *= 2.0F) - 1.0F, a + 1.0F, a - 2.0F, a);
      Method1101(a + 2.0F, a - 3.0F, a, a);
      Method1101(a + 2.0F, a - 3.0F, a - 1.0F, a);
      Method1101(a + 1.0F, a + 1.0F, a + 1.0F, a);
      Method1101(a - 2.0F, a - 2.0F, a + 1.0F, a);
      Method1101(a - 2.0F, a - 2.0F, a - 2.0F, a);
      Method1101(a + 1.0F, a + 1.0F, a - 2.0F, a);
      Method1104(a + 1.0F, a + 1.0F, a - 1.0F, a - 1.0F, a);
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glHint(3155, 4352);
   }

   public static void Method1100(float a, float a, float a, float a, float a, int a, float a, int a) {
      int[] a = trash();
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

      Method1104(a + a, a + a, a - a * 2.0F, a - a * 2.0F, a);
      Method1104(a + a, a, a - a * 2.0F, a, a);
      Method1104(a + a, a + a - a, a - a * 2.0F, a, a);
      Method1104(a, a + a, a, a - a * 2.0F, a);
      Method1104(a + a - a, a + a, a, a - a * 2.0F, a);
      Method1090();
      Method1113(a);
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
         a.trash(new String[2]);
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
      Method1113(a);
      GL11.glLineWidth(a);
      GL11.glBegin(3);
      a = a + a;
      a = a + a;
      a = a = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      a = 6.283185307179586 * (double)(a + 180) / (double)(a * 4);
      GL11.glVertex2d((double)a + Math.sin(a) * (double)a, (double)a + Math.cos(a) * (double)a);
      --a;
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
      Method1091();
   }

   public static void Method1101(float a, float a, float a, int a) {
      if (a < a) {
         float a = a;
         a = a;
         a = a;
      }

      Method1104(a, a, a + 1.0F, a + 1.0F, a);
   }

   public static void Method1102(float a, float a, float a, int a) {
      if (a < a) {
         float a = a;
         a = a;
         a = a;
      }

      Method1104(a, a + 1.0F, a + 1.0F, a, a);
   }

   public static void Method1103(float a, float a, float a, float a, int a) {
      Method1090();
      Method1133(a);
      GL11.glBegin(7);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      GL11.glVertex2d((double)a, (double)(a + a));
      GL11.glEnd();
      Method1091();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1104(float a, float a, float a, float a, int a) {
      float a;
      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      WorldRenderer a = Tessellator.getInstance().getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(a, a, a, a);
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos((double)a, (double)a, 0.0).endVertex();
      a.pos((double)a, (double)a, 0.0).endVertex();
      a.pos((double)a, (double)a, 0.0).endVertex();
      a.pos((double)a, (double)a, 0.0).endVertex();
      Tessellator.getInstance().draw();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1105(double a, double a, double a, double a, int a) {
      double a;
      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(a, a, a, a);
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a, a, 0.0).endVertex();
      a.pos(a, a, 0.0).endVertex();
      a.pos(a, a, 0.0).endVertex();
      a.pos(a, a, 0.0).endVertex();
      a.draw();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1106(double a, double a, double a, double a, int a, int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GlStateManager.disableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.disableAlpha();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.shadeModel(7425);
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(7, DefaultVertexFormats.POSITION_COLOR);
      a.pos(a, a, 0.0).color(a, a, a, a).endVertex();
      a.pos(a, a, 0.0).color(a, a, a, a).endVertex();
      a.pos(a, a, 0.0).color(a, a, a, a).endVertex();
      a.pos(a, a, 0.0).color(a, a, a, a).endVertex();
      a.draw();
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
   }

   public static void Method1107(int a, float a, int a, float a, float a, int a) {
      int a = true;
      float a = 5.0F;
      GL11.glDisable(2884);
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      OpenGlHelper.glBlendFunc(770, 771, 1, 0);
      Method1113(a);
      GL11.glBegin(5);
      GL11.glVertex2f((float)a + a, a);
      GL11.glVertex2f((float)a + a, a);
      GL11.glVertex2f((float)a - a, a);
      GL11.glVertex2f((float)a - a, a);
      GL11.glEnd();
      GL11.glBegin(5);
      GL11.glVertex2f((float)a, a + a);
      GL11.glVertex2f((float)a + a, a + a);
      GL11.glVertex2f((float)a, a - a);
      GL11.glVertex2f((float)a + a, a - a);
      GL11.glEnd();
      GL11.glBegin(5);
      GL11.glVertex2f((float)a, a + a);
      GL11.glVertex2f((float)a - a, a + a);
      GL11.glVertex2f((float)a, a - a);
      GL11.glVertex2f((float)a - a, a - a);
      GL11.glEnd();
      GL11.glBegin(6);
      float a = (float)a - a;
      float a = a + a;
      GL11.glVertex2f(a, a);
      int a = false;

      int a;
      for(a = 0; a <= 18; ++a) {
         float a = (float)a * 5.0F;
         GL11.glVertex2f((float)((double)a + (double)a * Math.cos(Math.toRadians((double)a))), (float)((double)a - (double)a * Math.sin(Math.toRadians((double)a))));
      }

      GL11.glEnd();
      GL11.glBegin(6);
      a = (float)a + a;
      a = a + a;
      GL11.glVertex2f(a, a);

      float a;
      for(a = 0; a <= 18; ++a) {
         a = (float)a * 5.0F;
         GL11.glVertex2f((float)((double)a - (double)a * Math.cos(Math.toRadians((double)a))), (float)((double)a - (double)a * Math.sin(Math.toRadians((double)a))));
      }

      GL11.glEnd();
      GL11.glBegin(6);
      a = (float)a + a;
      a = a - a;
      GL11.glVertex2f(a, a);

      for(a = 0; a <= 18; ++a) {
         a = (float)a * 5.0F;
         GL11.glVertex2f((float)((double)a - (double)a * Math.cos(Math.toRadians((double)a))), (float)((double)a + (double)a * Math.sin(Math.toRadians((double)a))));
      }

      GL11.glEnd();
      GL11.glBegin(6);
      a = (float)a - a;
      a = a - a;
      GL11.glVertex2f(a, a);

      for(a = 0; a <= 18; ++a) {
         a = (float)a * 5.0F;
         GL11.glVertex2f((float)((double)a + (double)a * Math.cos(Math.toRadians((double)a))), (float)((double)a + (double)a * Math.sin(Math.toRadians((double)a))));
      }

      GL11.glEnd();
      GL11.glEnable(3553);
      GL11.glEnable(2884);
      GL11.glDisable(3042);
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
   }

   public static void Method1108(double a, double a, double a, double a, double a, int a, int a) {
      Method1109(a + a, a + a, a - a, a - a, a);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      Method1109(a + a, a, a - a, a + a, a);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      Method1109(a, a, a + a, a, a);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      Method1109(a - a, a, a, a, a);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      Method1109(a + a, a - a, a - a, a, a);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1109(double a, double a, double a, double a, int a) {
      double a;
      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(a, a, a, a);
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a, a, 0.0).endVertex();
      a.pos(a, a, 0.0).endVertex();
      a.pos(a, a, 0.0).endVertex();
      a.pos(a, a, 0.0).endVertex();
      a.draw();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1110(float a, float a, float a, float a, float a, int a) {
      a += (float)((double)(a / 2.0F) + 0.5);
      a += (float)((double)(a / 2.0F) + 0.5);
      a -= (float)((double)(a / 2.0F) + 0.5);
      a -= (float)((double)(a / 2.0F) + 0.5);
      Method1104(a, a, a, a, a);
      Method1111(a - a / 2.0F, a + a / 2.0F, a, a);
      Method1111(a + a / 2.0F, a - a / 2.0F, a, a);
      Method1111(a + a / 2.0F, a + a / 2.0F, a, a);
      Method1111(a - a / 2.0F, a - a / 2.0F, a, a);
      Method1104(a - a / 2.0F - 0.5F, a + a / 2.0F, a, a - a / 2.0F, a);
      Method1104(a, a + a / 2.0F, a + a / 2.0F + 0.5F, a - a / 2.0F, a);
      Method1104(a + a / 2.0F, a - a / 2.0F - 0.5F, a - a / 2.0F, a - a / 2.0F, a);
      Method1104(a + a / 2.0F, a, a - a / 2.0F, a + a / 2.0F + 0.5F, a);
   }

   public static void Method1111(float a, float a, float a, int a) {
      Method1112(a, a, 0.0F, 360.0F, a, a);
   }

   public static void Method1112(float a, float a, float a, float a, float a, int a) {
      Method1115(a, a, a, a, a, a, a);
   }

   public static void Method1113(int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a);
   }

   public static int Method1114(int a) {
      double a = Math.ceil((double)(System.currentTimeMillis() + (long)a) / 4.0);
      return Color.getHSBColor((float)((a %= 360.0) / 360.0), 0.6F, 1.0F).getRGB();
   }

   public static void Method1115(float a, float a, float a, float a, float a, float a, int a) {
      GlStateManager.color(0.0F, 0.0F, 0.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      float a = 0.0F;
      if (a > a) {
         a = a;
         a = a;
         a = a;
      }

      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(a, a, a, a);
      float a;
      float a;
      float a;
      if (a > 0.5F) {
         GL11.glEnable(2848);
         GL11.glLineWidth(2.0F);
         GL11.glBegin(3);

         for(a = a; a >= a; a -= 4.0F) {
            a = (float)Math.cos((double)a * Math.PI / 180.0) * a * 1.001F;
            a = (float)Math.sin((double)a * Math.PI / 180.0) * a * 1.001F;
            GL11.glVertex2f(a + a, a + a);
         }

         GL11.glEnd();
         GL11.glDisable(2848);
      }

      GL11.glBegin(6);

      for(a = a; a >= a; a -= 4.0F) {
         a = (float)Math.cos((double)a * Math.PI / 180.0) * a;
         a = (float)Math.sin((double)a * Math.PI / 180.0) * a;
         GL11.glVertex2f(a + a, a + a);
      }

      GL11.glEnd();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
   }

   public static void Method1116(double a, double a, double a, double a, int a, int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glBegin(7);
      GL11.glColor4f(a, a, a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glColor4f(a, a, a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GL11.glShadeModel(7424);
   }

   public static void Method1117(float a, float a, int a, int a, float a, int a) {
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glEnable(2881);
      GL11.glBlendFunc(770, 771);
      Method1113(a);
      GL11.glBegin(9);

      for(int a = a; a <= a; ++a) {
         double a = Math.sin((double)a * Math.PI / 180.0) * (double)a;
         double a = Math.cos((double)a * Math.PI / 180.0) * (double)a;
         GL11.glVertex3d((double)a + a, (double)a + a, 0.0);
      }

      GL11.glEnd();
      GL11.glDisable(2881);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   public static void Method1118(float a, float a, float a, float a, int a, int a, int a) {
      Method1104(a, a, a, a, a);
      Method1104(a + 0.5F, a + 0.5F, a - 0.5F, a - 0.5F, a);
      Method1104(a + 1.0F, a + 1.0F, a - 1.0F, a - 1.0F, a);
   }

   public static void Method1119(float a, float a, float a, float a) {
      ScaledResolution a = new ScaledResolution(Minecraft.getMinecraft());
      int a = a.getScaleFactor();
      GL11.glScissor((int)(a * (float)a), (int)(((float)a.getScaledHeight() - a) * (float)a), (int)((a - a) * (float)a), (int)((a - a) * (float)a));
   }

   public static void Method1120(double a, double a, double a, double a, double a, float a, float a, float a, float a, float a, float a, float a, float a, float a) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(a, a, a, a);
      Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      GL11.glLineWidth(a);
      GL11.glColor4f(a, a, a, a);
      Method1098(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1121(double a, double a, double a, double a, double a, float a, float a, float a, float a) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      GL11.glColor4f(a, a, a, a);
      Method1098(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method1122(double a, double a, double a, double a, double a, float a, float a, float a, float a) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      GL11.glColor4f(a, a, a, a);
      Method1124(new AxisAlignedBB(a - a, a, a - a, a + a, a + a, a + a));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method1123(Entity a, Color a) {
      GL11.glPushMatrix();
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      double a = (double)ReflectionUtils.getRenderPartialTicks();
      double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
      double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
      double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
      AxisAlignedBB a = AxisAlignedBB.fromBounds(a - (double)a.width, a + 0.1, a - (double)a.width, a + (double)a.width, a + (double)a.height - 0.05, a + (double)a.width);
      if (a instanceof EntityLivingBase) {
         a = AxisAlignedBB.fromBounds(a - (double)a.width + 0.2, a, a - (double)a.width + 0.2, a + (double)a.width - 0.2, a + (double)a.height + 0.2, a + (double)a.width - 0.2);
      }

      GL11.glLineWidth(1.0F);
      GL11.glTranslated(a, a, a);
      GL11.glRotated((double)(-a.rotationYaw % 360.0F), 0.0, 1.0, 0.0);
      GL11.glTranslated(-a, -a, -a);
      GL11.glColor4f((float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, 1.0F);
      Method1098(a);
      GL11.glColor4f((float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, 0.2F);
      Method1124(a);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method1124(AxisAlignedBB a) {
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.draw();
   }

   public static void Method1125(Color a) {
      GL11.glColor4f((float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, (float)a.getAlpha() / 255.0F);
   }

   public static void Method1126(float a) {
      Method1127();
      GL11.glPushAttrib(1048575);
      GL11.glDisable(3008);
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(a);
      GL11.glEnable(2848);
      GL11.glEnable(2960);
      GL11.glClear(1024);
      GL11.glClearStencil(15);
      GL11.glStencilFunc(512, 1, 15);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glPolygonMode(1032, 6913);
   }

   public static void Method1127() {
      Framebuffer a = Minecraft.getMinecraft().getFramebuffer();
      if (a.depthBuffer > -1) {
         Method1128(a);
         a.depthBuffer = -1;
      }

   }

   public static void Method1128(Framebuffer a) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(a.depthBuffer);
      int a = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, a);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, a);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, a);
   }

   public static void Method1129() {
      GL11.glStencilFunc(512, 0, 15);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glPolygonMode(1032, 6914);
   }

   public static void Method1130() {
      GL11.glStencilFunc(514, 1, 15);
      GL11.glStencilOp(7680, 7680, 7680);
      GL11.glPolygonMode(1032, 6913);
   }

   public static void Method1131(int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a == 0.0F ? 1.0F : a);
      GL11.glDepthMask(false);
      GL11.glDisable(2929);
      GL11.glEnable(10754);
      GL11.glPolygonOffset(1.0F, -2000000.0F);
      OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
   }

   public static void Method1132() {
      GL11.glPolygonOffset(1.0F, 2000000.0F);
      GL11.glDisable(10754);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(2960);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glEnable(3042);
      GL11.glEnable(2896);
      GL11.glEnable(3553);
      GL11.glEnable(3008);
      GL11.glPopAttrib();
   }

   public static void Method1133(int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a == 0.0F ? 1.0F : a);
   }

   public static void Method1134(double a, double a, double a, int a, int a, float a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glEnable(2884);
      GL11.glDisable(2929);
      GL11.glColor4f(a, a, a, a);
      Method1124(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glLineWidth(a);
      GL11.glColor4f(a, a, a, a);
      Method1098(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glEnable(2929);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GL11.glPopMatrix();
   }

   public static Vec3 Method1135(double a, double a, double a) {
      FloatBuffer a = BufferUtils.createFloatBuffer(3);
      IntBuffer a = BufferUtils.createIntBuffer(16);
      FloatBuffer a = BufferUtils.createFloatBuffer(16);
      FloatBuffer a = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloat(2982, a);
      GL11.glGetFloat(2983, a);
      GL11.glGetInteger(2978, a);
      boolean a = GLU.gluProject((float)a, (float)a, (float)a, a, a, a, a);
      return new Vec3((double)a.get(0), (double)((float)Display.getHeight() - a.get(1)), (double)a.get(2));
   }

   public static Vector3d Method1136(double a, double a, double a) {
      FloatBuffer a = GLAllocation.createDirectFloatBuffer(4);
      FloatBuffer a = BufferUtils.createFloatBuffer(3);
      IntBuffer a = BufferUtils.createIntBuffer(16);
      FloatBuffer a = BufferUtils.createFloatBuffer(16);
      FloatBuffer a = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloat(2982, a);
      GL11.glGetFloat(2983, a);
      GL11.glGetInteger(2978, a);
      return GLU.gluProject((float)a, (float)a, (float)a, a, a, a, a) ? new Vector3d((double)(a.get(0) / (float)Method1078()), (double)(((float)Display.getHeight() - a.get(1)) / (float)Method1078()), (double)a.get(2)) : null;
   }

   public static void Method1137(float a, float a, float a, float a, float a, int a) {
      boolean a = GL11.glIsEnabled(3042);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glPushMatrix();
      Method1138(a);
      GL11.glBegin(7);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)(a - a / a), (double)(a + a));
      GL11.glVertex2d((double)a, (double)(a + a / a));
      GL11.glVertex2d((double)(a + a / a), (double)(a + a));
      GL11.glVertex2d((double)a, (double)a);
      GL11.glEnd();
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.8F);
      GL11.glBegin(2);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glVertex2d((double)(a - a / a), (double)(a + a));
      GL11.glVertex2d((double)a, (double)(a + a / a));
      GL11.glVertex2d((double)(a + a / a), (double)(a + a));
      GL11.glVertex2d((double)a, (double)a);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1138(int a) {
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      float a = (float)(a >> 24 & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a);
   }

   public static Color Method1139(float[] a, Color[] a, float a) {
      Color a = null;
      if (a.length == a.length) {
         int[] a = Method1140(a, a);
         float[] a = new float[]{a[a[0]], a[a[1]]};
         Color[] a = new Color[]{a[a[0]], a[a[1]]};
         float a = a[1] - a[0];
         float a = a - a[0];
         float a = a / a;
         a = Method1141(a[0], a[1], (double)(1.0F - a));
         return a;
      } else {
         throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
      }
   }

   public static int[] Method1140(float[] a, float a) {
      int[] a = new int[2];

      int a;
      for(a = 0; a < a.length && a[a] <= a; ++a) {
      }

      if (a >= a.length) {
         a = a.length - 1;
      }

      a[0] = a - 1;
      a[1] = a;
      return a;
   }

   public static Color Method1141(Color a, Color a, double a) {
      float a = (float)a;
      float a = 1.0F - a;
      float[] a = new float[3];
      float[] a = new float[3];
      a.getColorComponents(a);
      a.getColorComponents(a);
      float a = a[0] * a + a[0] * a;
      float a = a[1] * a + a[1] * a;
      float a = a[2] * a + a[2] * a;
      if (a < 0.0F) {
         a = 0.0F;
      } else if (a > 255.0F) {
         a = 255.0F;
      }

      if (a < 0.0F) {
         a = 0.0F;
      } else if (a > 255.0F) {
         a = 255.0F;
      }

      if (a < 0.0F) {
         a = 0.0F;
      } else if (a > 255.0F) {
         a = 255.0F;
      }

      Color a = null;

      try {
         a = new Color(a, a, a);
      } catch (IllegalArgumentException var14) {
         NumberFormat a = NumberFormat.getNumberInstance();
         System.out.println(a.format((double)a) + "; " + a.format((double)a) + "; " + a.format((double)a));
         var14.printStackTrace();
      }

      return a;
   }

   public static void Method1142(int a, int a, int a, int a, int a, int a) {
      float a = 0.00390625F;
      float a = 0.00390625F;
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(7, DefaultVertexFormats.POSITION_TEX);
      a.pos((double)a, (double)(a + a), 0.0).tex((double)((float)a * a), (double)((float)(a + a) * a)).endVertex();
      a.pos((double)(a + a), (double)(a + a), 0.0).tex((double)((float)(a + a) * a), (double)((float)(a + a) * a)).endVertex();
      a.pos((double)(a + a), (double)a, 0.0).tex((double)((float)(a + a) * a), (double)((float)a * a)).endVertex();
      a.pos((double)a, (double)a, 0.0).tex((double)((float)a * a), (double)((float)a * a)).endVertex();
      a.draw();
   }

   public static boolean Method1143(Entity a) {
      return Method1144(a.getEntityBoundingBox()) || a.ignoreFrustumCheck;
   }

   public static boolean Method1144(AxisAlignedBB a) {
      Entity a = Wrapper.INSTANCE.getMinecraft().getRenderViewEntity();
      Field1620.setPosition(a.posX, a.posY, a.posZ);
      return Field1620.isBoundingBoxInFrustum(a);
   }

   public static void Method1145(float a, float a, float a) {
      GlStateManager.pushMatrix();
      GlStateManager.translate(a, a, 0.0F);
      GlStateManager.scale(a, a, 1.0F);
      GlStateManager.translate(-a, -a, 0.0F);
   }

   public static void Method1146() {
      GlStateManager.popMatrix();
   }

   static {
      trash2(new int[1]);
      Field1620 = new Frustum();
      Field1621 = Wrapper.INSTANCE.getMinecraft();
   }

   public static void trash2(int[] trash) {
      trash = trash;
   }

   public static int[] trash() {
      return trash;
   }

   private static IllegalArgumentException trash2(IllegalArgumentException trash) {
      return trash;
   }
}
