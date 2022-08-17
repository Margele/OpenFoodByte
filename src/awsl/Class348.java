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

   public static void Method364(float a, float a, float a, float a, boolean a) {
      if (Method368()) {
         ScaledResolution var5 = new ScaledResolution(Field1669);
         float var6 = (float)var5.getScaleFactor();
         int var7 = var5.getScaledWidth();
         int var8 = var5.getScaledHeight();
         if (Field1671 != var6 || Field1672 != var7 || Field1673 != var8 || Field1670 == null || Field1668 == null) {
            Method362();
         }

         Field1671 = var6;
         Field1672 = var7;
         Field1673 = var8;
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

   public static void Method365(float a, float a, float a, float a, float a, boolean a) {
      if (Method368()) {
         ScaledResolution var6 = new ScaledResolution(Field1669);
         float var7 = (float)var6.getScaleFactor();
         int var8 = var6.getScaledWidth();
         int var9 = var6.getScaledHeight();
         if (Field1671 != var7 || Field1672 != var8 || Field1673 != var9 || Field1670 == null || Field1668 == null) {
            Method362();
         }

         Field1671 = var7;
         Field1672 = var8;
         Field1673 = var9;
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
      int var1 = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, var1);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, Field1669.displayWidth, Field1669.displayHeight);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, var1);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, var1);
   }

   public static boolean Method368() {
      if (Field1668 == null) {
         Method362();
      }

      return OpenGlHelper.shadersSupported && Field1669.getRenderViewEntity() instanceof EntityPlayer ? GlobalModule.Field3169.getValue() : false;
   }

   public static void Method369(float a, float a, float a, float a) {
      Method371();
      int var5 = 1;
      float var6 = (float)Field1669.gameSettings.guiScale;
      if (var6 == 0.0F) {
         var6 = 1000.0F;
      }

      if ((float)var5 < var6 && Field1669.displayWidth / (var5 + 1) >= 320 && Field1669.displayHeight / (var5 + 1) >= 240) {
         ++var5;
      }

      GL11.glScissor((int)(a * (float)var5), (int)((float)Field1669.displayHeight - (a + a) * (float)var5), (int)(a * (float)var5), (int)(a * (float)var5));
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
