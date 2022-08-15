/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.shader.Framebuffer
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class212;
import awsl.Class91;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class Class211 {
    static Minecraft Field1190 = Minecraft.getMinecraft();

    public static void Method2573() {
        GL11.glDisable((int)2960);
        GlStateManager.disableAlpha();
        GlStateManager.disableBlend();
    }

    public static void Method2574(boolean a) {
        GL11.glStencilFunc((int)514, (int)1, (int)65535);
        GL11.glStencilOp((int)7680, (int)7680, (int)7681);
        GlStateManager.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        GL11.glAlphaFunc((int)516, (float)0.0f);
    }

    public static void Method2575(boolean a) {
        Class211.Method2576(Field1190.getFramebuffer());
        GL11.glClearStencil((int)0);
        GL11.glClear((int)1024);
        GL11.glEnable((int)2960);
        GL11.glStencilFunc((int)519, (int)1, (int)65535);
        GL11.glStencilOp((int)7680, (int)7680, (int)7681);
        GlStateManager.colorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
    }

    public static void Method2576(Framebuffer a) {
        if (a.depthBuffer > -1) {
            Class211.Method2577(a);
            a.depthBuffer = -1;
        }
    }

    public static void Method2577(Framebuffer a) {
        String string = Class212.Method2566();
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)a.depthBuffer);
        String a2 = string;
        int a3 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)a3);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)Class211.Field1190.displayWidth, (int)Class211.Field1190.displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)a3);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)a3);
        if (Class91.Method3648() == null) {
            Class212.Method2565("Xh3nn");
        }
    }

    public static void Method2578() {
        Class211.Method2579(Field1190.getFramebuffer());
    }

    public static void Method2579(Framebuffer a) {
        a.bindFramebuffer(false);
        Class211.Method2576(a);
        GL11.glClear((int)1024);
        GL11.glEnable((int)2960);
    }

    public static void Method2580() {
        GL11.glStencilFunc((int)519, (int)1, (int)1);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
    }

    public static void Method2581(int a) {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glStencilFunc((int)514, (int)a, (int)1);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
    }

    public static void Method2582() {
        GL11.glDisable((int)2960);
    }
}