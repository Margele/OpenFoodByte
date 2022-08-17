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
      float var6 = (float)((double)GlobalModule.Field3185 * a);
      if (a < a) {
         if (a + (double)var6 < a) {
            a += (double)var6;
         } else {
            a = a;
         }
      } else if (a - (double)var6 > a) {
         a -= (double)var6;
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
      ScaledResolution var0 = new ScaledResolution(Minecraft.getMinecraft());
      int var1 = var0.getScaledWidth();
      return var1;
   }

   public static int Method1077() {
      ScaledResolution var0 = new ScaledResolution(Minecraft.getMinecraft());
      int var1 = var0.getScaledHeight();
      return var1;
   }

   public static int Method1078() {
      ScaledResolution var0 = new ScaledResolution(Minecraft.getMinecraft());
      int var1 = var0.getScaleFactor();
      return var1;
   }

   public static void Method1079(float a, float a, float a, float a) {
      int var4 = Method1078();
      GL11.glEnable(3089);
      GL11.glScissor((int)(a * (float)var4), (int)((float)Display.getHeight() - a * (float)var4), (int)(a * (float)var4), (int)(a * (float)var4));
   }

   public static void Method1080(float a, float a, float a, float a) {
      ScaledResolution var4 = new ScaledResolution(Minecraft.getMinecraft());
      int var5 = var4.getScaleFactor();
      GL11.glEnable(3089);
      GL11.glScissor((int)(a * (float)var5), (int)(((float)var4.getScaledHeight() - a) * (float)var5), (int)((a - a) * (float)var5), (int)((a - a) * (float)var5));
   }

   public static void Method1081(int a, int a, float a, float a, float a) {
      int var5;
      for(var5 = 1; (float)var5 < a && Field1621.displayWidth / (var5 + 1) >= 320 && Field1621.displayHeight / (var5 + 1) >= 240; ++var5) {
      }

      GL11.glScissor(a * var5, (int)((float)Field1621.displayHeight - ((float)a + a) * (float)var5), (int)(a * (float)var5), (int)(a * (float)var5));
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
      int var5 = (int)Math.min(Math.max(a, 45.0F), 360.0F);
      GL11.glBegin(2);

      for(int var6 = 0; var6 < var5; ++var6) {
         double var7 = 6.283185307179586 * (double)var6 / (double)var5;
         GL11.glVertex2d((double)a + Math.sin(var7) * (double)a, (double)a + Math.cos(var7) * (double)a);
      }

      GL11.glEnd();
      Method1091();
   }

   public static void Method1087(float a, float a, float a, int a) {
      Method1090();
      Method1133(a);
      int var4 = (int)Math.min(Math.max(a, 45.0F), 360.0F);
      GL11.glBegin(9);

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = 6.283185307179586 * (double)var5 / (double)var4;
         GL11.glVertex2d((double)a + Math.sin(var6) * (double)a, (double)a + Math.cos(var6) * (double)a);
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
      Color var2 = new Color(a);
      float var3 = 0.003921569F * (float)var2.getRed();
      float var4 = 0.003921569F * (float)var2.getGreen();
      float var5 = 0.003921569F * (float)var2.getBlue();
      return (new Color(var3, var4, var5, a)).getRGB();
   }

   public static boolean Method1096(float a, float a, float a, float a, float a, float a) {
      return a > a && a < a && a > a && a < a;
   }

   public static void Method1097(double a, double a, double a, int a) {
      float var7 = (float)(a >> 16 & 255) / 255.0F;
      float var8 = (float)(a >> 8 & 255) / 255.0F;
      float var9 = (float)(a & 255) / 255.0F;
      float var10 = (float)(a >> 24 & 255) / 255.0F;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      GL11.glColor4f(var7, var8, var9, var10);
      Method1098(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method1098(AxisAlignedBB a) {
      Tessellator var1 = Tessellator.getInstance();
      WorldRenderer var2 = var1.getWorldRenderer();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var1.draw();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var1.draw();
      var2.begin(1, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var1.draw();
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
      int[] var8 = trash();
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
         a.trash(new String[2]);
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
      Method1113(a);
      GL11.glLineWidth(a);
      GL11.glBegin(3);
      var9 = a + a;
      var10 = a + a;
      var11 = var12 = (int)Math.min(Math.max(a, 10.0F), 90.0F);
      var13 = 6.283185307179586 * (double)(var12 + 180) / (double)(var11 * 4);
      GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)a, (double)var10 + Math.cos(var13) * (double)a);
      --var12;
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
      Method1091();
   }

   public static void Method1101(float a, float a, float a, int a) {
      if (a < a) {
         float var4 = a;
         a = a;
         a = var4;
      }

      Method1104(a, a, a + 1.0F, a + 1.0F, a);
   }

   public static void Method1102(float a, float a, float a, int a) {
      if (a < a) {
         float var4 = a;
         a = a;
         a = var4;
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
      float var5;
      if (a < a) {
         var5 = a;
         a = a;
         a = var5;
      }

      if (a < a) {
         var5 = a;
         a = a;
         a = var5;
      }

      var5 = (float)(a >> 24 & 255) / 255.0F;
      float var6 = (float)(a >> 16 & 255) / 255.0F;
      float var7 = (float)(a >> 8 & 255) / 255.0F;
      float var8 = (float)(a & 255) / 255.0F;
      WorldRenderer var9 = Tessellator.getInstance().getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(var6, var7, var8, var5);
      var9.begin(7, DefaultVertexFormats.POSITION);
      var9.pos((double)a, (double)a, 0.0).endVertex();
      var9.pos((double)a, (double)a, 0.0).endVertex();
      var9.pos((double)a, (double)a, 0.0).endVertex();
      var9.pos((double)a, (double)a, 0.0).endVertex();
      Tessellator.getInstance().draw();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1105(double a, double a, double a, double a, int a) {
      double var9;
      if (a < a) {
         var9 = a;
         a = a;
         a = var9;
      }

      if (a < a) {
         var9 = a;
         a = a;
         a = var9;
      }

      float var15 = (float)(a >> 24 & 255) / 255.0F;
      float var10 = (float)(a >> 16 & 255) / 255.0F;
      float var11 = (float)(a >> 8 & 255) / 255.0F;
      float var12 = (float)(a & 255) / 255.0F;
      Tessellator var13 = Tessellator.getInstance();
      WorldRenderer var14 = var13.getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(var10, var11, var12, var15);
      var14.begin(7, DefaultVertexFormats.POSITION);
      var14.pos(a, a, 0.0).endVertex();
      var14.pos(a, a, 0.0).endVertex();
      var14.pos(a, a, 0.0).endVertex();
      var14.pos(a, a, 0.0).endVertex();
      var13.draw();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void Method1106(double a, double a, double a, double a, int a, int a) {
      float var10 = (float)(a >> 24 & 255) / 255.0F;
      float var11 = (float)(a >> 16 & 255) / 255.0F;
      float var12 = (float)(a >> 8 & 255) / 255.0F;
      float var13 = (float)(a & 255) / 255.0F;
      float var14 = (float)(a >> 24 & 255) / 255.0F;
      float var15 = (float)(a >> 16 & 255) / 255.0F;
      float var16 = (float)(a >> 8 & 255) / 255.0F;
      float var17 = (float)(a & 255) / 255.0F;
      GlStateManager.disableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.disableAlpha();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.shadeModel(7425);
      Tessellator var18 = Tessellator.getInstance();
      WorldRenderer var19 = var18.getWorldRenderer();
      var19.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var19.pos(a, a, 0.0).color(var11, var12, var13, var10).endVertex();
      var19.pos(a, a, 0.0).color(var11, var12, var13, var10).endVertex();
      var19.pos(a, a, 0.0).color(var15, var16, var17, var14).endVertex();
      var19.pos(a, a, 0.0).color(var15, var16, var17, var14).endVertex();
      var18.draw();
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
   }

   public static void Method1107(int a, float a, int a, float a, float a, int a) {
      boolean var6 = true;
      float var7 = 5.0F;
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
      float var8 = (float)a - a;
      float var9 = a + a;
      GL11.glVertex2f(var8, var9);
      boolean var10 = false;

      int var13;
      for(var13 = 0; var13 <= 18; ++var13) {
         float var11 = (float)var13 * 5.0F;
         GL11.glVertex2f((float)((double)var8 + (double)a * Math.cos(Math.toRadians((double)var11))), (float)((double)var9 - (double)a * Math.sin(Math.toRadians((double)var11))));
      }

      GL11.glEnd();
      GL11.glBegin(6);
      var8 = (float)a + a;
      var9 = a + a;
      GL11.glVertex2f(var8, var9);

      float var12;
      for(var13 = 0; var13 <= 18; ++var13) {
         var12 = (float)var13 * 5.0F;
         GL11.glVertex2f((float)((double)var8 - (double)a * Math.cos(Math.toRadians((double)var12))), (float)((double)var9 - (double)a * Math.sin(Math.toRadians((double)var12))));
      }

      GL11.glEnd();
      GL11.glBegin(6);
      var8 = (float)a + a;
      var9 = a - a;
      GL11.glVertex2f(var8, var9);

      for(var13 = 0; var13 <= 18; ++var13) {
         var12 = (float)var13 * 5.0F;
         GL11.glVertex2f((float)((double)var8 - (double)a * Math.cos(Math.toRadians((double)var12))), (float)((double)var9 + (double)a * Math.sin(Math.toRadians((double)var12))));
      }

      GL11.glEnd();
      GL11.glBegin(6);
      var8 = (float)a - a;
      var9 = a - a;
      GL11.glVertex2f(var8, var9);

      for(var13 = 0; var13 <= 18; ++var13) {
         var12 = (float)var13 * 5.0F;
         GL11.glVertex2f((float)((double)var8 + (double)a * Math.cos(Math.toRadians((double)var12))), (float)((double)var9 + (double)a * Math.sin(Math.toRadians((double)var12))));
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
      double var9;
      if (a < a) {
         var9 = a;
         a = a;
         a = var9;
      }

      if (a < a) {
         var9 = a;
         a = a;
         a = var9;
      }

      float var15 = (float)(a >> 24 & 255) / 255.0F;
      float var10 = (float)(a >> 16 & 255) / 255.0F;
      float var11 = (float)(a >> 8 & 255) / 255.0F;
      float var12 = (float)(a & 255) / 255.0F;
      Tessellator var13 = Tessellator.getInstance();
      WorldRenderer var14 = var13.getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(var10, var11, var12, var15);
      var14.begin(7, DefaultVertexFormats.POSITION);
      var14.pos(a, a, 0.0).endVertex();
      var14.pos(a, a, 0.0).endVertex();
      var14.pos(a, a, 0.0).endVertex();
      var14.pos(a, a, 0.0).endVertex();
      var13.draw();
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
      float var1 = (float)(a >> 24 & 255) / 255.0F;
      float var2 = (float)(a >> 16 & 255) / 255.0F;
      float var3 = (float)(a >> 8 & 255) / 255.0F;
      float var4 = (float)(a & 255) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
   }

   public static int Method1114(int a) {
      double var1 = Math.ceil((double)(System.currentTimeMillis() + (long)a) / 4.0);
      return Color.getHSBColor((float)((var1 %= 360.0) / 360.0), 0.6F, 1.0F).getRGB();
   }

   public static void Method1115(float a, float a, float a, float a, float a, float a, int a) {
      GlStateManager.color(0.0F, 0.0F, 0.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      float var10 = 0.0F;
      if (a > a) {
         var10 = a;
         a = a;
         a = var10;
      }

      float var11 = (float)(a >> 24 & 255) / 255.0F;
      float var12 = (float)(a >> 16 & 255) / 255.0F;
      float var13 = (float)(a >> 8 & 255) / 255.0F;
      float var14 = (float)(a & 255) / 255.0F;
      Tessellator var15 = Tessellator.getInstance();
      WorldRenderer var16 = var15.getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(var12, var13, var14, var11);
      float var7;
      float var8;
      float var9;
      if (var11 > 0.5F) {
         GL11.glEnable(2848);
         GL11.glLineWidth(2.0F);
         GL11.glBegin(3);

         for(var9 = a; var9 >= a; var9 -= 4.0F) {
            var8 = (float)Math.cos((double)var9 * Math.PI / 180.0) * a * 1.001F;
            var7 = (float)Math.sin((double)var9 * Math.PI / 180.0) * a * 1.001F;
            GL11.glVertex2f(a + var8, a + var7);
         }

         GL11.glEnd();
         GL11.glDisable(2848);
      }

      GL11.glBegin(6);

      for(var9 = a; var9 >= a; var9 -= 4.0F) {
         var8 = (float)Math.cos((double)var9 * Math.PI / 180.0) * a;
         var7 = (float)Math.sin((double)var9 * Math.PI / 180.0) * a;
         GL11.glVertex2f(a + var8, a + var7);
      }

      GL11.glEnd();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
   }

   public static void Method1116(double a, double a, double a, double a, int a, int a) {
      float var10 = (float)(a >> 24 & 255) / 255.0F;
      float var11 = (float)(a >> 16 & 255) / 255.0F;
      float var12 = (float)(a >> 8 & 255) / 255.0F;
      float var13 = (float)(a & 255) / 255.0F;
      float var14 = (float)(a >> 24 & 255) / 255.0F;
      float var15 = (float)(a >> 16 & 255) / 255.0F;
      float var16 = (float)(a >> 8 & 255) / 255.0F;
      float var17 = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glBegin(7);
      GL11.glColor4f(var11, var12, var13, var10);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glColor4f(var15, var16, var17, var14);
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

      for(int var6 = a; var6 <= a; ++var6) {
         double var7 = Math.sin((double)var6 * Math.PI / 180.0) * (double)a;
         double var9 = Math.cos((double)var6 * Math.PI / 180.0) * (double)a;
         GL11.glVertex3d((double)a + var7, (double)a + var9, 0.0);
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
      ScaledResolution var4 = new ScaledResolution(Minecraft.getMinecraft());
      int var5 = var4.getScaleFactor();
      GL11.glScissor((int)(a * (float)var5), (int)(((float)var4.getScaledHeight() - a) * (float)var5), (int)((a - a) * (float)var5), (int)((a - a) * (float)var5));
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
      double var2 = (double)ReflectionUtils.getRenderPartialTicks();
      double var4 = a.lastTickPosX + (a.posX - a.lastTickPosX) * var2 - ReflectionUtils.getRenderPosX();
      double var6 = a.lastTickPosY + (a.posY - a.lastTickPosY) * var2 - ReflectionUtils.getRenderPosY();
      double var8 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * var2 - ReflectionUtils.getRenderPosZ();
      AxisAlignedBB var10 = AxisAlignedBB.fromBounds(var4 - (double)a.width, var6 + 0.1, var8 - (double)a.width, var4 + (double)a.width, var6 + (double)a.height - 0.05, var8 + (double)a.width);
      if (a instanceof EntityLivingBase) {
         var10 = AxisAlignedBB.fromBounds(var4 - (double)a.width + 0.2, var6, var8 - (double)a.width + 0.2, var4 + (double)a.width - 0.2, var6 + (double)a.height + 0.2, var8 + (double)a.width - 0.2);
      }

      GL11.glLineWidth(1.0F);
      GL11.glTranslated(var4, var6, var8);
      GL11.glRotated((double)(-a.rotationYaw % 360.0F), 0.0, 1.0, 0.0);
      GL11.glTranslated(-var4, -var6, -var8);
      GL11.glColor4f((float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, 1.0F);
      Method1098(var10);
      GL11.glColor4f((float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, 0.2F);
      Method1124(var10);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method1124(AxisAlignedBB a) {
      Tessellator var1 = Tessellator.getInstance();
      WorldRenderer var2 = var1.getWorldRenderer();
      var2.begin(7, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var1.draw();
      var2.begin(7, DefaultVertexFormats.POSITION);
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var1.draw();
      var2.begin(7, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var1.draw();
      var2.begin(7, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var1.draw();
      var2.begin(7, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var1.draw();
      var2.begin(7, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var1.draw();
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
      Framebuffer var0 = Minecraft.getMinecraft().getFramebuffer();
      if (var0.depthBuffer > -1) {
         Method1128(var0);
         var0.depthBuffer = -1;
      }

   }

   public static void Method1128(Framebuffer a) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(a.depthBuffer);
      int var1 = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, var1);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, var1);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, var1);
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
      float var1 = (float)(a >> 24 & 255) / 255.0F;
      float var2 = (float)(a >> 16 & 255) / 255.0F;
      float var3 = (float)(a >> 8 & 255) / 255.0F;
      float var4 = (float)(a & 255) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1 == 0.0F ? 1.0F : var1);
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
      float var1 = (float)(a >> 24 & 255) / 255.0F;
      float var2 = (float)(a >> 16 & 255) / 255.0F;
      float var3 = (float)(a >> 8 & 255) / 255.0F;
      float var4 = (float)(a & 255) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1 == 0.0F ? 1.0F : var1);
   }

   public static void Method1134(double a, double a, double a, int a, int a, float a) {
      float var9 = (float)(a >> 24 & 255) / 255.0F;
      float var10 = (float)(a >> 16 & 255) / 255.0F;
      float var11 = (float)(a >> 8 & 255) / 255.0F;
      float var12 = (float)(a & 255) / 255.0F;
      float var13 = (float)(a >> 24 & 255) / 255.0F;
      float var14 = (float)(a >> 16 & 255) / 255.0F;
      float var15 = (float)(a >> 8 & 255) / 255.0F;
      float var16 = (float)(a & 255) / 255.0F;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glEnable(2884);
      GL11.glDisable(2929);
      GL11.glColor4f(var10, var11, var12, var9);
      Method1124(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glLineWidth(a);
      GL11.glColor4f(var14, var15, var16, var13);
      Method1098(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glEnable(2929);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GL11.glPopMatrix();
   }

   public static Vec3 Method1135(double a, double a, double a) {
      FloatBuffer var6 = BufferUtils.createFloatBuffer(3);
      IntBuffer var7 = BufferUtils.createIntBuffer(16);
      FloatBuffer var8 = BufferUtils.createFloatBuffer(16);
      FloatBuffer var9 = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloat(2982, var8);
      GL11.glGetFloat(2983, var9);
      GL11.glGetInteger(2978, var7);
      boolean var10 = GLU.gluProject((float)a, (float)a, (float)a, var8, var9, var7, var6);
      return new Vec3((double)var6.get(0), (double)((float)Display.getHeight() - var6.get(1)), (double)var6.get(2));
   }

   public static Vector3d Method1136(double a, double a, double a) {
      FloatBuffer var6 = GLAllocation.createDirectFloatBuffer(4);
      FloatBuffer var7 = BufferUtils.createFloatBuffer(3);
      IntBuffer var8 = BufferUtils.createIntBuffer(16);
      FloatBuffer var9 = BufferUtils.createFloatBuffer(16);
      FloatBuffer var10 = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloat(2982, var9);
      GL11.glGetFloat(2983, var10);
      GL11.glGetInteger(2978, var8);
      return GLU.gluProject((float)a, (float)a, (float)a, var9, var10, var8, var6) ? new Vector3d((double)(var6.get(0) / (float)Method1078()), (double)(((float)Display.getHeight() - var6.get(1)) / (float)Method1078()), (double)var6.get(2)) : null;
   }

   public static void Method1137(float a, float a, float a, float a, float a, int a) {
      boolean var6 = GL11.glIsEnabled(3042);
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
      float var1 = (float)(a >> 16 & 255) / 255.0F;
      float var2 = (float)(a >> 8 & 255) / 255.0F;
      float var3 = (float)(a & 255) / 255.0F;
      float var4 = (float)(a >> 24 & 255) / 255.0F;
      GL11.glColor4f(var1, var2, var3, var4);
   }

   public static Color Method1139(float[] a, Color[] a, float a) {
      Color var3 = null;
      if (a.length == a.length) {
         int[] var4 = Method1140(a, a);
         float[] var5 = new float[]{a[var4[0]], a[var4[1]]};
         Color[] var6 = new Color[]{a[var4[0]], a[var4[1]]};
         float var7 = var5[1] - var5[0];
         float var8 = a - var5[0];
         float var9 = var8 / var7;
         var3 = Method1141(var6[0], var6[1], (double)(1.0F - var9));
         return var3;
      } else {
         throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
      }
   }

   public static int[] Method1140(float[] a, float a) {
      int[] var2 = new int[2];

      int var3;
      for(var3 = 0; var3 < a.length && a[var3] <= a; ++var3) {
      }

      if (var3 >= a.length) {
         var3 = a.length - 1;
      }

      var2[0] = var3 - 1;
      var2[1] = var3;
      return var2;
   }

   public static Color Method1141(Color a, Color a, double a) {
      float var4 = (float)a;
      float var5 = 1.0F - var4;
      float[] var6 = new float[3];
      float[] var7 = new float[3];
      a.getColorComponents(var6);
      a.getColorComponents(var7);
      float var8 = var6[0] * var4 + var7[0] * var5;
      float var9 = var6[1] * var4 + var7[1] * var5;
      float var10 = var6[2] * var4 + var7[2] * var5;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      } else if (var8 > 255.0F) {
         var8 = 255.0F;
      }

      if (var9 < 0.0F) {
         var9 = 0.0F;
      } else if (var9 > 255.0F) {
         var9 = 255.0F;
      }

      if (var10 < 0.0F) {
         var10 = 0.0F;
      } else if (var10 > 255.0F) {
         var10 = 255.0F;
      }

      Color var11 = null;

      try {
         var11 = new Color(var8, var9, var10);
      } catch (IllegalArgumentException var14) {
         NumberFormat var13 = NumberFormat.getNumberInstance();
         System.out.println(var13.format((double)var8) + "; " + var13.format((double)var9) + "; " + var13.format((double)var10));
         var14.printStackTrace();
      }

      return var11;
   }

   public static void Method1142(int a, int a, int a, int a, int a, int a) {
      float var6 = 0.00390625F;
      float var7 = 0.00390625F;
      Tessellator var8 = Tessellator.getInstance();
      WorldRenderer var9 = var8.getWorldRenderer();
      var9.begin(7, DefaultVertexFormats.POSITION_TEX);
      var9.pos((double)a, (double)(a + a), 0.0).tex((double)((float)a * var6), (double)((float)(a + a) * var7)).endVertex();
      var9.pos((double)(a + a), (double)(a + a), 0.0).tex((double)((float)(a + a) * var6), (double)((float)(a + a) * var7)).endVertex();
      var9.pos((double)(a + a), (double)a, 0.0).tex((double)((float)(a + a) * var6), (double)((float)a * var7)).endVertex();
      var9.pos((double)a, (double)a, 0.0).tex((double)((float)a * var6), (double)((float)a * var7)).endVertex();
      var8.draw();
   }

   public static boolean Method1143(Entity a) {
      return Method1144(a.getEntityBoundingBox()) || a.ignoreFrustumCheck;
   }

   public static boolean Method1144(AxisAlignedBB a) {
      Entity var1 = Wrapper.INSTANCE.getMinecraft().getRenderViewEntity();
      Field1620.setPosition(var1.posX, var1.posY, var1.posZ);
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
