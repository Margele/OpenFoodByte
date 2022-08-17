package awsl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import obfuscate.a;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class Class211 {
   static Minecraft Field1190 = Minecraft.getMinecraft();

   public static void Method2573() {
      GL11.glDisable(2960);
      GlStateManager.disableAlpha();
      GlStateManager.disableBlend();
   }

   public static void Method2574(boolean a) {
      GL11.glStencilFunc(514, 1, 65535);
      GL11.glStencilOp(7680, 7680, 7681);
      GlStateManager.colorMask(true, true, true, true);
      GlStateManager.enableAlpha();
      GlStateManager.enableBlend();
      GL11.glAlphaFunc(516, 0.0F);
   }

   public static void Method2575(boolean a) {
      Method2576(Field1190.getFramebuffer());
      GL11.glClearStencil(0);
      GL11.glClear(1024);
      GL11.glEnable(2960);
      GL11.glStencilFunc(519, 1, 65535);
      GL11.glStencilOp(7680, 7680, 7681);
      GlStateManager.colorMask(false, false, false, false);
   }

   public static void Method2576(Framebuffer a) {
      if (a.depthBuffer > -1) {
         Method2577(a);
         a.depthBuffer = -1;
      }

   }

   public static void Method2577(Framebuffer a) {
      Class212.Method2566();
      EXTFramebufferObject.glDeleteRenderbuffersEXT(a.depthBuffer);
      int a = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, a);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, Field1190.displayWidth, Field1190.displayHeight);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, a);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, a);
      if (a.trash() == null) {
         Class212.Method2565("Xh3nn");
      }

   }

   public static void Method2578() {
      Method2579(Field1190.getFramebuffer());
   }

   public static void Method2579(Framebuffer a) {
      a.bindFramebuffer(false);
      Method2576(a);
      GL11.glClear(1024);
      GL11.glEnable(2960);
   }

   public static void Method2580() {
      GL11.glStencilFunc(519, 1, 1);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glColorMask(false, false, false, false);
   }

   public static void Method2581(int a) {
      GL11.glColorMask(true, true, true, true);
      GL11.glStencilFunc(514, a, 1);
      GL11.glStencilOp(7680, 7680, 7680);
   }

   public static void Method2582() {
      GL11.glDisable(2960);
   }
}
