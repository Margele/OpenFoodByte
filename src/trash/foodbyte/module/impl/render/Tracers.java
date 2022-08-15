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

import awsl.Class281;
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
import trash.foodbyte.utils.ReflectionUtils;

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
    public void Method802(EventRender3D a) {
        if (Class281.Method3050()) {
            return;
        }
        Iterator iterator = Tracers.mc.theWorld.playerEntities.Method1383();
        while (iterator.Method932()) {
            EntityPlayer a2 = (EntityPlayer)iterator.Method933();
            if (Tracers.mc.thePlayer == a2 || a2.isInvisible() || AntiBot.Field2577.contains((Object)a2)) continue;
            this.drawLine((EntityLivingBase)a2, a);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    /*
     * WARNING - void declaration
     */
    private void drawLine(EntityLivingBase enitity, EventRender3D a) {
        void a2;
        float f = a.Method3523();
        String string = Class492.Method2239();
        double a3 = enitity.lastTickPosX + (enitity.posX - enitity.lastTickPosX) * (double)a2 - ReflectionUtils.Method2591();
        double a4 = enitity.lastTickPosY + (enitity.posY - enitity.lastTickPosY) * (double)a2 - ReflectionUtils.Method2592();
        double a5 = enitity.lastTickPosZ + (enitity.posZ - enitity.lastTickPosZ) * (double)a2 - ReflectionUtils.Method2593();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        String a6 = string;
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        float a7 = Tracers.mc.thePlayer.getDistanceToEntity((Entity)enitity);
        if (Class305.Method697((Entity)enitity)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)1.0f);
        }
        if (Class305.Method704((Entity)enitity)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (a7 <= 200.0f) {
            GL11.glColor3f((float)1.0f, (float)(a7 / 40.0f), (float)0.0f);
        }
        GL11.glLoadIdentity();
        boolean a8 = Tracers.mc.gameSettings.viewBobbing;
        Tracers.mc.gameSettings.viewBobbing = false;
        ReflectionUtils.Method2609((float)a2);
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)Tracers.mc.thePlayer.getEyeHeight(), (double)0.0);
        GL11.glVertex3d((double)a3, (double)a4, (double)a5);
        GL11.glVertex3d((double)a3, (double)a4, (double)a5);
        GL11.glEnd();
        Tracers.mc.gameSettings.viewBobbing = a8;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    /*
     * WARNING - void declaration
     */
    private void Method952(EntityLivingBase a) {
        void a2;
        void a3;
        float f = ReflectionUtils.Method2587();
        String string = Class492.Method2239();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)2.0f);
        double a4 = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a3 - ReflectionUtils.Method2591();
        double d = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a3 - ReflectionUtils.Method2592();
        String a5 = string;
        double a6 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a3 - ReflectionUtils.Method2593();
        float a7 = Tracers.mc.thePlayer.getDistanceToEntity((Entity)a);
        if (Class305.Method697((Entity)a)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)1.0f);
        }
        if (Class305.Method704((Entity)a)) {
            GL11.glColor3f((float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (a7 <= 200.0f) {
            GL11.glColor3f((float)1.0f, (float)(a7 / 40.0f), (float)0.0f);
        }
        boolean a8 = Tracers.mc.gameSettings.viewBobbing;
        Tracers.mc.gameSettings.viewBobbing = false;
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)Tracers.mc.thePlayer.getEyeHeight(), (double)0.0);
        GL11.glVertex3d((double)a4, (double)a2, (double)a6);
        GL11.glVertex3d((double)a4, (double)a2, (double)a6);
        GL11.glEnd();
        Tracers.mc.gameSettings.viewBobbing = a8;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }
}