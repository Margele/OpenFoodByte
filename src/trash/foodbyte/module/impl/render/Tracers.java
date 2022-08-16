/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class305;
import awsl.Class492;
import eventapi.EventTarget;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.ServerUtils;

public class Tracers
extends Module {
    public Tracers() {
        super("Tracers", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u73a9\u5bb6\u8fde\u7ebf";
    }

    @EventTarget
    public void Method802(EventRender3D a2) {
        if (ServerUtils.isPlayingSkyblock()) {
            return;
        }
        Iterator iterator = Tracers.mc.theWorld.playerEntities.Method1383();
        while (iterator.Method932()) {
            EntityPlayer a3 = (EntityPlayer)iterator.Method933();
            if (Tracers.mc.thePlayer == a3 || a3.isInvisible() || AntiBot.botList.contains((Object)a3)) continue;
            this.drawLine((EntityLivingBase)a3, a2);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    /*
     * WARNING - void declaration
     */
    private void drawLine(EntityLivingBase enitity, EventRender3D a2) {
        void a3;
        float f = a2.Method3523();
        String string = Class492.Method2239();
        double a4 = enitity.lastTickPosX + (enitity.posX - enitity.lastTickPosX) * (double)a3 - ReflectionUtils.getRenderPosX();
        double a5 = enitity.lastTickPosY + (enitity.posY - enitity.lastTickPosY) * (double)a3 - ReflectionUtils.getRenderPosY();
        double a6 = enitity.lastTickPosZ + (enitity.posZ - enitity.lastTickPosZ) * (double)a3 - ReflectionUtils.getRenderPosZ();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        String a7 = string;
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        float a8 = Tracers.mc.thePlayer.getDistanceToEntity((Entity)enitity);
        if (Class305.Method697((Entity)enitity)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)1.0f);
        }
        if (Class305.Method704((Entity)enitity)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (a8 <= 200.0f) {
            GL11.glColor3f((float)1.0f, (float)(a8 / 40.0f), (float)0.0f);
        }
        GL11.glLoadIdentity();
        boolean a9 = Tracers.mc.gameSettings.viewBobbing;
        Tracers.mc.gameSettings.viewBobbing = false;
        ReflectionUtils.setOrientCamera((float)a3);
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)Tracers.mc.thePlayer.getEyeHeight(), (double)0.0);
        GL11.glVertex3d((double)a4, (double)a5, (double)a6);
        GL11.glVertex3d((double)a4, (double)a5, (double)a6);
        GL11.glEnd();
        Tracers.mc.gameSettings.viewBobbing = a9;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    /*
     * WARNING - void declaration
     */
    private void Method952(EntityLivingBase a2) {
        void a3;
        void a4;
        float f = ReflectionUtils.getRenderPartialTicks();
        String string = Class492.Method2239();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)2.0f);
        double a5 = a2.lastTickPosX + (a2.posX - a2.lastTickPosX) * (double)a4 - ReflectionUtils.getRenderPosX();
        double d = a2.lastTickPosY + (a2.posY - a2.lastTickPosY) * (double)a4 - ReflectionUtils.getRenderPosY();
        String a6 = string;
        double a7 = a2.lastTickPosZ + (a2.posZ - a2.lastTickPosZ) * (double)a4 - ReflectionUtils.getRenderPosZ();
        float a8 = Tracers.mc.thePlayer.getDistanceToEntity((Entity)a2);
        if (Class305.Method697((Entity)a2)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)1.0f);
        }
        if (Class305.Method704((Entity)a2)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (a8 <= 200.0f) {
            GL11.glColor3f((float)1.0f, (float)(a8 / 40.0f), (float)0.0f);
        }
        boolean a9 = Tracers.mc.gameSettings.viewBobbing;
        Tracers.mc.gameSettings.viewBobbing = false;
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)Tracers.mc.thePlayer.getEyeHeight(), (double)0.0);
        GL11.glVertex3d((double)a5, (double)a3, (double)a7);
        GL11.glVertex3d((double)a5, (double)a3, (double)a7);
        GL11.glEnd();
        Tracers.mc.gameSettings.viewBobbing = a9;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }
}