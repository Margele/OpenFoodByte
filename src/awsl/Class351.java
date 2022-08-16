/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import awsl.Class348;
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
    private static Minecraft Field1684;
    private static Framebuffer Field1685;
    private static int Field1686;
    private static int Field1687;
    private static int Field1688;
    private static ResourceLocation Field1689;

    public static void Method26() {
        try {
            Field1683 = new ShaderGroup(Field1684.getTextureManager(), Field1684.getResourceManager(), Field1684.getFramebuffer(), Field1689);
            Field1683.createBindFramebuffers(Class351.Field1684.displayWidth, Class351.Field1684.displayHeight);
            Field1685 = new Framebuffer(Class351.Field1684.displayWidth, Class351.Field1684.displayHeight, true);
            Field1685.setFramebufferColor(1.0f, 1.0f, 1.0f, 1.0f);
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }

    private static void Method27(float a2, float a3, float a4) {
        ((Shader)ReflectionUtils.getListShaders(Field1683).get(0)).getShaderManager().getShaderUniform("Radius").set(a2);
        ((Shader)ReflectionUtils.getListShaders(Field1683).get(1)).getShaderManager().getShaderUniform("Radius").set(a2);
        ((Shader)ReflectionUtils.getListShaders(Field1683).get(0)).getShaderManager().getShaderUniform("BlurDir").set(a3, a4);
        ((Shader)ReflectionUtils.getListShaders(Field1683).get(1)).getShaderManager().getShaderUniform("BlurDir").set(a4, a3);
    }

    /*
     * WARNING - void declaration
     */
    public static void Method28(float a2) {
        void a3;
        void a4;
        ScaledResolution a5 = new ScaledResolution(Field1684);
        int n = a5.getScaleFactor();
        int a6 = a5.getScaledWidth();
        int n2 = a5.getScaledHeight();
        boolean a7 = Class348.Method371();
        if (Field1686 != a4 || Field1687 != a6 || Field1688 != a3 || Field1685 == null || Field1683 == null) {
            Class351.Method26();
        }
        Field1686 = a4;
        Field1687 = a6;
        Field1688 = a3;
        Class351.Method27(a2, 0.0f, 1.0f);
        Field1685.bindFramebuffer(true);
        Field1683.loadShaderGroup(ReflectionUtils.getRenderPartialTicks());
        Field1684.getFramebuffer().bindFramebuffer(true);
        if (a.trash() == null) {
            Class348.Method370(false);
        }
    }

    static {
        Field1684 = Minecraft.getMinecraft();
        Field1689 = new ResourceLocation("minecraft:FoodByte/shader/blur.json");
    }
}