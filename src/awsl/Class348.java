package awsl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.TimeHelper;

public class Class348 {
   private static ShaderGroup Field1668;
   private static final Minecraft Field1669;
   private static Framebuffer Field1670;
   private static float Field1671;
   private static int Field1672;
   private static int Field1673;
   private static ResourceLocation Field1674;
   private static TimeHelper Field1675;
   private static boolean Field1676;

   public static void Method362() {
      try {
         Field1670 = new Framebuffer(Field1669.displayWidth, Field1669.displayHeight, true);
         Field1670.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         Field1668 = new ShaderGroup(Field1669.getTextureManager(), Field1669.getResourceManager(), Field1670, Field1674);
         Field1668.createBindFramebuffers(Field1669.displayWidth, Field1669.displayHeight);
      } catch (Exception var1) {
         var1.printStackTrace();
      }

   }

   private static void Method363(float a, float a, float a) {
      ((Shader)ReflectionUtils.getListShaders(Field1668).get(0)).getShaderManager().getShaderUniform("Radius").set(a);
      ((Shader)ReflectionUtils.getListShaders(Field1668).get(1)).getShaderManager().getShaderUniform("Radius").set(a);
      ((Shader)ReflectionUtils.getListShaders(Field1668).get(0)).getShaderManager().getShaderUniform("BlurDir").set(a, a);
      ((Shader)ReflectionUtils.getListShaders(Field1668).get(1)).getShaderManager().getShaderUniform("BlurDir").set(a, a);
   }

   public static void Method364(float a, float a, float a, float a, boolean a4) {
      if (Method368()) {
         ScaledResolution a = new ScaledResolution(Field1669);
         float a = (float)a.getScaleFactor();
         int a = a.getScaledWidth();
         int a = a.getScaledHeight();
         if (Field1671 != a || Field1672 != a || Field1673 != a || Field1670 == null || Field1668 == null) {
            Method362();
         }

         Field1671 = a;
         Field1672 = a;
         Field1673 = a;
         GL11.glEnable(3089);
         Method369(a, a, a, a);
         GL11.glPushMatrix();
         Field1670.framebufferRenderExt(Field1669.displayWidth, Field1669.displayHeight, true);
         GL11.glPopMatrix();
         GL11.glDisable(3089);
         Field1669.entityRenderer.setupOverlayRendering();
         GlStateManager.enableDepth();
      }
   }

   public static void Method365(float a, float a, float a, float a, float a4, boolean a5) {
      if (Method368()) {
         ScaledResolution a = new ScaledResolution(Field1669);
         float a = (float)a.getScaleFactor();
         int a = a.getScaledWidth();
         int a = a.getScaledHeight();
         if (Field1671 != a || Field1672 != a || Field1673 != a || Field1670 == null || Field1668 == null) {
            Method362();
         }

         Field1671 = a;
         Field1672 = a;
         Field1673 = a;
         GL11.glEnable(3089);
         Method369(a, a, a, a);
         GL11.glPushMatrix();
         Field1670.framebufferRenderExt(Field1669.displayWidth, Field1669.displayHeight, true);
         GL11.glPopMatrix();
         GL11.glDisable(3089);
         Field1669.entityRenderer.setupOverlayRendering();
         GlStateManager.enableDepth();
      }
   }

   public static void Method366(boolean a) {
      if (Field1668 != null && Field1669.thePlayer != null && Field1675.isDelayComplete(16.66666603088379)) {
         Field1675.reset();
         Field1669.getFramebuffer().unbindFramebuffer();
         Method363(GlobalModule.Field3161.getFloatValue(), 0.0F, 1.0F);
         Field1670.bindFramebuffer(true);
         Field1669.getFramebuffer().framebufferRenderExt(Field1669.displayWidth, Field1669.displayHeight, true);
         if (OpenGlHelper.shadersSupported) {
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.loadIdentity();
            Field1668.loadShaderGroup(ReflectionUtils.getRenderPartialTicks());
            GlStateManager.popMatrix();
         }

         Field1670.unbindFramebuffer();
         Field1669.getFramebuffer().bindFramebuffer(true);
         if (Field1669.getFramebuffer() != null && Field1669.getFramebuffer().depthBuffer > -1) {
            Method367(Field1669.getFramebuffer());
            Field1669.getFramebuffer().depthBuffer = -1;
         }

         Field1669.entityRenderer.setupOverlayRendering();
      }

   }

   public static void Method367(Framebuffer a) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(a.depthBuffer);
      int a = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, a);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, Field1669.displayWidth, Field1669.displayHeight);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, a);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, a);
   }

   public static boolean Method368() {
      if (Field1668 == null) {
         Method362();
      }

      return OpenGlHelper.shadersSupported && Field1669.getRenderViewEntity() instanceof EntityPlayer ? GlobalModule.Field3169.getValue() : false;
   }

   public static void Method369(float a, float a, float a, float a) {
      Method371();
      int a = 1;
      float a = (float)Field1669.gameSettings.guiScale;
      if (a == 0.0F) {
         a = 1000.0F;
      }

      if ((float)a < a && Field1669.displayWidth / (a + 1) >= 320 && Field1669.displayHeight / (a + 1) >= 240) {
         ++a;
      }

      GL11.glScissor((int)(a * (float)a), (int)((float)Field1669.displayHeight - (a + a) * (float)a), (int)(a * (float)a), (int)(a * (float)a));
   }

   static {
      Method370(true);
      Field1669 = Minecraft.getMinecraft();
      Field1674 = new ResourceLocation("minecraft:FoodByte/shader/blur.json");
      Field1675 = new TimeHelper();
   }

   public static void Method370(boolean boolean1) {
      Field1676 = boolean1;
   }

   public static boolean Method371() {
      return Field1676;
   }

   public static boolean Method372() {
      boolean var0 = Method371();
      return true;
   }
}
