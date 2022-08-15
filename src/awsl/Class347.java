/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.Objects
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.Wrapper;

public class Class347 {
    public static ShaderGroup Field1661;
    public static Minecraft Field1662;
    public static Framebuffer Field1663;
    public static int Field1664;
    public static int Field1665;
    public static int Field1666;
    public static ResourceLocation Field1667;

    private static void Method373(float a, float a2, float a3) {
        if (Objects.isNull((Object)Field1661) || Objects.isNull((Object)ReflectionUtils.Method2607(Field1661))) {
            return;
        }
        ((Shader)ReflectionUtils.Method2607(Field1661).get(0)).getShaderManager().getShaderUniform("Radius").set(a);
        ((Shader)ReflectionUtils.Method2607(Field1661).get(1)).getShaderManager().getShaderUniform("Radius").set(a);
        ((Shader)ReflectionUtils.Method2607(Field1661).get(0)).getShaderManager().getShaderUniform("BlurDir").set(a2, a3);
        ((Shader)ReflectionUtils.Method2607(Field1661).get(1)).getShaderManager().getShaderUniform("BlurDir").set(a3, a2);
    }

    public static void Method374(float a) {
        ScaledResolution a2 = new ScaledResolution(Field1662);
        int a3 = a2.getScaleFactor();
        int a4 = a2.getScaledWidth();
        int a5 = a2.getScaledHeight();
        if (Field1664 != a3 || Field1665 != a4 || Field1666 != a5 || Field1663 == null || Field1661 == null) {
            Field1663 = new Framebuffer(Class347.Field1662.displayWidth, Class347.Field1662.displayHeight, false);
            Field1663.setFramebufferColor(0.0f, 0.0f, 0.0f, 0.0f);
            Class347.Method375(Field1667, Field1663);
        }
        Field1664 = a3;
        Field1665 = a4;
        Field1666 = a5;
        Class347.Method373(a, 0.0f, 1.0f);
    }

    public static void Method375(ResourceLocation a, Framebuffer a2) {
        if (OpenGlHelper.isFramebufferEnabled()) {
            try {
                Field1661 = new ShaderGroup(Field1662.getTextureManager(), Field1662.getResourceManager(), a2, a);
                Field1661.createBindFramebuffers(Class347.Field1662.displayWidth, Class347.Field1662.displayHeight);
            }
            catch (Exception a3) {
                a3.printStackTrace();
            }
        }
    }

    public static ShaderGroup Method376() {
        return Field1661;
    }

    static {
        Field1662 = Wrapper.INSTANCE.Method2868();
        Field1667 = new ResourceLocation("minecraft:FoodByte/shader/blur.json");
    }
}