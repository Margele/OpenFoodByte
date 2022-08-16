/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
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
            Field1670 = new Framebuffer(Class348.Field1669.displayWidth, Class348.Field1669.displayHeight, true);
            Field1670.setFramebufferColor(0.0f, 0.0f, 0.0f, 0.0f);
            Field1668 = new ShaderGroup(Field1669.getTextureManager(), Field1669.getResourceManager(), Field1670, Field1674);
            Field1668.createBindFramebuffers(Class348.Field1669.displayWidth, Class348.Field1669.displayHeight);
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }

    private static void Method363(float a2, float a3, float a4) {
        ((Shader)ReflectionUtils.getListShaders(Field1668).get(0)).getShaderManager().getShaderUniform("Radius").set(a2);
        ((Shader)ReflectionUtils.getListShaders(Field1668).get(1)).getShaderManager().getShaderUniform("Radius").set(a2);
        ((Shader)ReflectionUtils.getListShaders(Field1668).get(0)).getShaderManager().getShaderUniform("BlurDir").set(a3, a4);
        ((Shader)ReflectionUtils.getListShaders(Field1668).get(1)).getShaderManager().getShaderUniform("BlurDir").set(a4, a3);
    }

    public static void Method364(float a2, float a3, float a4, float a5, boolean a6) {
        if (!Class348.Method368()) {
            return;
        }
        ScaledResolution a7 = new ScaledResolution(Field1669);
        float a8 = a7.getScaleFactor();
        int a9 = a7.getScaledWidth();
        int a10 = a7.getScaledHeight();
        if (Field1671 != a8 || Field1672 != a9 || Field1673 != a10 || Field1670 == null || Field1668 == null) {
            Class348.Method362();
        }
        Field1671 = a8;
        Field1672 = a9;
        Field1673 = a10;
        GL11.glEnable((int)3089);
        Class348.Method369(a2, a3, a4, a5);
        GL11.glPushMatrix();
        Field1670.framebufferRenderExt(Class348.Field1669.displayWidth, Class348.Field1669.displayHeight, true);
        GL11.glPopMatrix();
        GL11.glDisable((int)3089);
        Class348.Field1669.entityRenderer.setupOverlayRendering();
        GlStateManager.enableDepth();
    }

    public static void Method365(float a2, float a3, float a4, float a5, float a6, boolean a7) {
        if (!Class348.Method368()) {
            return;
        }
        ScaledResolution a8 = new ScaledResolution(Field1669);
        float a9 = a8.getScaleFactor();
        int a10 = a8.getScaledWidth();
        int a11 = a8.getScaledHeight();
        if (Field1671 != a9 || Field1672 != a10 || Field1673 != a11 || Field1670 == null || Field1668 == null) {
            Class348.Method362();
        }
        Field1671 = a9;
        Field1672 = a10;
        Field1673 = a11;
        GL11.glEnable((int)3089);
        Class348.Method369(a2, a3, a4, a5);
        GL11.glPushMatrix();
        Field1670.framebufferRenderExt(Class348.Field1669.displayWidth, Class348.Field1669.displayHeight, true);
        GL11.glPopMatrix();
        GL11.glDisable((int)3089);
        Class348.Field1669.entityRenderer.setupOverlayRendering();
        GlStateManager.enableDepth();
    }

    public static void Method366(boolean a2) {
        if (Field1668 != null && Class348.Field1669.thePlayer != null && Field1675.isDelayComplete(16.66666603088379)) {
            Field1675.reset();
            Field1669.getFramebuffer().unbindFramebuffer();
            Class348.Method363(GlobalModule.Field3161.getFloatValue().floatValue(), 0.0f, 1.0f);
            Field1670.bindFramebuffer(true);
            Field1669.getFramebuffer().framebufferRenderExt(Class348.Field1669.displayWidth, Class348.Field1669.displayHeight, true);
            if (OpenGlHelper.shadersSupported) {
                GlStateManager.matrixMode((int)5890);
                GlStateManager.pushMatrix();
                GlStateManager.loadIdentity();
                Field1668.loadShaderGroup(ReflectionUtils.getRenderPartialTicks());
                GlStateManager.popMatrix();
            }
            Field1670.unbindFramebuffer();
            Field1669.getFramebuffer().bindFramebuffer(true);
            if (Field1669.getFramebuffer() != null && Class348.Field1669.getFramebuffer().depthBuffer > -1) {
                Class348.Method367(Field1669.getFramebuffer());
                Class348.Field1669.getFramebuffer().depthBuffer = -1;
            }
            Class348.Field1669.entityRenderer.setupOverlayRendering();
        }
    }

    public static void Method367(Framebuffer a2) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)a2.depthBuffer);
        int a3 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)a3);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)Class348.Field1669.displayWidth, (int)Class348.Field1669.displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)a3);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)a3);
    }

    public static boolean Method368() {
        if (Field1668 == null) {
            Class348.Method362();
        }
        if (OpenGlHelper.shadersSupported && Field1669.getRenderViewEntity() instanceof EntityPlayer) {
            return GlobalModule.Field3169.getValue();
        }
        return false;
    }

    public static void Method369(float a2, float a3, float a4, float a5) {
        float a6;
        int a7 = 1;
        float f = Class348.Field1669.gameSettings.guiScale;
        boolean a8 = Class348.Method371();
        if (a6 == 0.0f) {
            a6 = 1000.0f;
        }
        if ((float)a7 < a6 && Class348.Field1669.displayWidth / (a7 + 1) >= 320 && Class348.Field1669.displayHeight / (a7 + 1) >= 240) {
            ++a7;
        }
        GL11.glScissor((int)((int)(a2 * (float)a7)), (int)((int)((float)Class348.Field1669.displayHeight - (a3 + a5) * (float)a7)), (int)((int)(a4 * (float)a7)), (int)((int)(a5 * (float)a7)));
    }

    static {
        Class348.Method370(true);
        Field1669 = Minecraft.getMinecraft();
        Field1674 = new ResourceLocation("minecraft:FoodByte/shader/blur.json");
        Field1675 = new TimeHelper();
    }

    public static void Method370(boolean bl) {
        Field1676 = bl;
    }

    public static boolean Method371() {
        return Field1676;
    }

    public static boolean Method372() {
        boolean bl = Class348.Method371();
        return true;
    }
}