/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.util.AxisAlignedBB
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class212;
import awsl.Class416;
import awsl.Class492;
import eventapi.EventTarget;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.value.BooleanValue;

public class ChinaHat
extends Module {
    public BooleanValue Field2376 = new BooleanValue("ChinaHat", "Through", (Boolean)false, "\u7ed8\u5236\u4e0d\u88ab\u65b9\u5757\u906e\u6321");
    public BooleanValue Field2377 = new BooleanValue("ChinaHat", "First Person", (Boolean)false, "\u7b2c\u4e00\u4eba\u79f0\u89c6\u89d2\u662f\u5426\u663e\u793a");

    public ChinaHat() {
        super("ChinaHat", Category.RENDER);
        this.setDescription("\u5e3d\u5b50");
    }

    @EventTarget
    private void Method802(EventRender3D a) {
        int a2;
        String a3 = Class492.Method2239();
        if (ChinaHat.mc.thePlayer == null || ChinaHat.mc.theWorld == null || ChinaHat.mc.thePlayer.isInvisible() || ChinaHat.mc.thePlayer.isDead) {
            return;
        }
        if (!this.Field2377.Method2509().booleanValue() && ChinaHat.mc.gameSettings.thirdPersonView == 0) {
            return;
        }
        double a4 = ChinaHat.mc.thePlayer.lastTickPosX + (ChinaHat.mc.thePlayer.posX - ChinaHat.mc.thePlayer.lastTickPosX) * (double)a.Field2922 - ChinaHat.mc.getRenderManager().viewerPosX;
        double a5 = ChinaHat.mc.thePlayer.lastTickPosY + (ChinaHat.mc.thePlayer.posY - ChinaHat.mc.thePlayer.lastTickPosY) * (double)a.Field2922 - ChinaHat.mc.getRenderManager().viewerPosY;
        double a6 = ChinaHat.mc.thePlayer.lastTickPosZ + (ChinaHat.mc.thePlayer.posZ - ChinaHat.mc.thePlayer.lastTickPosZ) * (double)a.Field2922 - ChinaHat.mc.getRenderManager().viewerPosZ;
        AxisAlignedBB a7 = ChinaHat.mc.thePlayer.getEntityBoundingBox();
        double a8 = a7.maxY - a7.minY + 0.03;
        double a9 = a7.maxX - a7.minX;
        GL11.glPushMatrix();
        GlStateManager.disableCull();
        if (this.Field2376.Method2509().booleanValue()) {
            GL11.glDisable((int)2929);
        }
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)3553);
        GL11.glShadeModel((int)7425);
        GL11.glEnable((int)3042);
        GlStateManager.disableLighting();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        OpenGlHelper.glBlendFunc((int)770, (int)771, (int)1, (int)0);
        float a10 = MathUtils.Method578(ChinaHat.mc.thePlayer.prevRotationYaw, ChinaHat.mc.thePlayer.rotationYaw, a.Field2922).floatValue();
        float a11 = MathUtils.Method578(ChinaHat.mc.thePlayer.prevRenderArmPitch, ChinaHat.mc.thePlayer.renderArmPitch, a.Field2922).floatValue();
        GL11.glTranslated((double)a4, (double)a5, (double)a6);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glRotated((double)a10, (double)0.0, (double)-1.0, (double)0.0);
        GL11.glRotated((double)((double)a11 / 3.0), (double)0.0, (double)0.0, (double)0.0);
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(a11 / 270.0f));
        GL11.glLineWidth((float)2.0f);
        GL11.glBegin((int)2);
        float a12 = ChinaHat.mc.thePlayer.isSneaking() ? 0.1f : -0.08f;
        int a13 = 0;
        if (a13 <= 180) {
            a2 = Class416.Method2353(7, a13 * 4, 1.0f, 1.0f, 0.5f).getRGB();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            Class212.Method2542(a2);
            GL11.glVertex3d((double)(a4 - Math.sin((double)((float)a13 * MathUtils.Field1707 / 90.0f)) * a9), (double)(a5 + a8 - (double)a12 - 0.001), (double)(a6 + Math.cos((double)((float)a13 * MathUtils.Field1707 / 90.0f)) * a9));
            ++a13;
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a13 = Class416.Method2353(7, 4, 1.0f, 1.0f, 0.7f).getRGB();
        Class212.Method2542(a13);
        GL11.glVertex3d((double)a4, (double)(a5 + a8 + 0.3 - (double)a12), (double)a6);
        a2 = 0;
        if (a2 <= 180) {
            int a14 = Class416.Method2353(7, a2 * 4, 1.0f, 1.0f, 0.2f).getRGB();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            Class212.Method2542(a14);
            GL11.glVertex3d((double)(a4 - Math.sin((double)((float)a2 * MathUtils.Field1707 / 90.0f)) * a9), (double)(a5 + a8 - (double)a12), (double)(a6 + Math.cos((double)((float)a2 * MathUtils.Field1707 / 90.0f)) * a9));
            ++a2;
        }
        GL11.glVertex3d((double)a4, (double)(a5 + a8 + 0.3 - (double)a12), (double)a6);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)2884);
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glDepthMask((boolean)true);
        if (this.Field2376.Method2509().booleanValue()) {
            GL11.glEnable((int)2929);
        }
    }
}