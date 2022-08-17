package awsl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import obfuscate.a;
import trash.foodbyte.reflections.ReflectionUtils;

public class Class351 {
   private static ShaderGroup Field1683;
   private static Minecraft Field1684 = Minecraft.getMinecraft();
   private static Framebuffer Field1685;
   private static int Field1686;
   private static int Field1687;
   private static int Field1688;
   private static ResourceLocation Field1689 = new ResourceLocation("minecraft:FoodByte/shader/blur.json");

   public static void Method26() {
      try {
         (Field1683 = new ShaderGroup(Field1684.getTextureManager(), Field1684.getResourceManager(), Field1684.getFramebuffer(), Field1689)).createBindFramebuffers(Field1684.displayWidth, Field1684.displayHeight);
         (Field1685 = new Framebuffer(Field1684.displayWidth, Field1684.displayHeight, true)).setFramebufferColor(1.0F, 1.0F, 1.0F, 1.0F);
      } catch (Exception var1) {
         var1.printStackTrace();
      }

   }

   private static void Method27(float a, float a, float a) {
      ((Shader)ReflectionUtils.getListShaders(Field1683).get(0)).getShaderManager().getShaderUniform("Radius").set(a);
      ((Shader)ReflectionUtils.getListShaders(Field1683).get(1)).getShaderManager().getShaderUniform("Radius").set(a);
      ((Shader)ReflectionUtils.getListShaders(Field1683).get(0)).getShaderManager().getShaderUniform("BlurDir").set(a, a);
      ((Shader)ReflectionUtils.getListShaders(Field1683).get(1)).getShaderManager().getShaderUniform("BlurDir").set(a, a);
   }

   public static void Method28(float a) {
      ScaledResolution a = new ScaledResolution(Field1684);
      int a = a.getScaleFactor();
      Class348.Method371();
      int a = a.getScaledWidth();
      int a = a.getScaledHeight();
      if (Field1686 != a || Field1687 != a || Field1688 != a || Field1685 == null || Field1683 == null) {
         Method26();
      }

      Field1686 = a;
      Field1687 = a;
      Field1688 = a;
      Method27(a, 0.0F, 1.0F);
      Field1685.bindFramebuffer(true);
      Field1683.loadShaderGroup(ReflectionUtils.getRenderPartialTicks());
      Field1684.getFramebuffer().bindFramebuffer(true);
      if (a.trash() == null) {
         Class348.Method370(false);
      }

   }
}
