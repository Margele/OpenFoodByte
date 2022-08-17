package awsl;

import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.Wrapper;

public class Class347 {
   public static ShaderGroup Field1661;
   public static Minecraft Field1662;
   public static Framebuffer Field1663;
   public static int Field1664;
   public static int Field1665;
   public static int Field1666;
   public static ResourceLocation Field1667;

   private static void Method373(float a, float a, float a) {
      if (!Objects.isNull(Field1661) && !Objects.isNull(ReflectionUtils.getListShaders(Field1661))) {
         ((Shader)ReflectionUtils.getListShaders(Field1661).get(0)).getShaderManager().getShaderUniform("Radius").set(a);
         ((Shader)ReflectionUtils.getListShaders(Field1661).get(1)).getShaderManager().getShaderUniform("Radius").set(a);
         ((Shader)ReflectionUtils.getListShaders(Field1661).get(0)).getShaderManager().getShaderUniform("BlurDir").set(a, a);
         ((Shader)ReflectionUtils.getListShaders(Field1661).get(1)).getShaderManager().getShaderUniform("BlurDir").set(a, a);
      }
   }

   public static void Method374(float a) {
      ScaledResolution a = new ScaledResolution(Field1662);
      int a = a.getScaleFactor();
      int a = a.getScaledWidth();
      int a = a.getScaledHeight();
      if (Field1664 != a || Field1665 != a || Field1666 != a || Field1663 == null || Field1661 == null) {
         Field1663 = new Framebuffer(Field1662.displayWidth, Field1662.displayHeight, false);
         Field1663.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         Method375(Field1667, Field1663);
      }

      Field1664 = a;
      Field1665 = a;
      Field1666 = a;
      Method373(a, 0.0F, 1.0F);
   }

   public static void Method375(ResourceLocation a, Framebuffer a) {
      if (OpenGlHelper.isFramebufferEnabled()) {
         try {
            Field1661 = new ShaderGroup(Field1662.getTextureManager(), Field1662.getResourceManager(), a, a);
            Field1661.createBindFramebuffers(Field1662.displayWidth, Field1662.displayHeight);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }

   public static ShaderGroup Method376() {
      return Field1661;
   }

   static {
      Field1662 = Wrapper.INSTANCE.getMinecraft();
      Field1667 = new ResourceLocation("minecraft:FoodByte/shader/blur.json");
   }
}
