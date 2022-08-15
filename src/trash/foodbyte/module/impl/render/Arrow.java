/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.boss.EntityDragon
 *  net.minecraft.entity.monster.EntityGhast
 *  net.minecraft.entity.monster.EntityIronGolem
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.monster.EntitySnowman
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityBat
 *  net.minecraft.entity.passive.EntitySquid
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.Vec3
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class305;
import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Arrow
extends Module {
    private FloatValue Field2388 = new FloatValue("Arrow", "Size", 10.0, 5.0, 10.0, 0.1, "\u7bad\u5934\u5927\u5c0f");
    private FloatValue Field2389 = new FloatValue("Arrow", "Radius", 45.0, 10.0, 200.0, 1.0, "\u534a\u5f84");
    public BooleanValue Field2390 = new BooleanValue("Arrow", "Fade", (Boolean)true, "\u7bad\u5934\u900f\u660e\u5ea6\u547c\u5438\u95ea\u70c1");
    public BooleanValue Field2391 = new BooleanValue("Arrow", "Player", (Boolean)true, "\u73a9\u5bb6");
    public BooleanValue Field2392 = new BooleanValue("Arrow", "Animals", (Boolean)false, "\u751f\u7269");
    public BooleanValue Field2393 = new BooleanValue("Arrow", "Mobs", (Boolean)false, "\u602a\u7269");
    public BooleanValue Field2394 = new BooleanValue("Arrow", "Invisibles", (Boolean)true, "\u9690\u8eab");
    private Class492 Field2395 = new Class492(this);
    private int Field2396;
    private boolean Field2397;

    public Arrow() {
        super("Arrow", Category.RENDER);
        this.setDescription("\u7bad\u5934\u96f7\u8fbe(\u4e2d\u95f4\u7ed8\u5236\u7bad\u5934\u6307\u5411\u5b9e\u4f53)");
    }

    @Override
    public void onEnable() {
        this.Field2396 = 0;
        this.Field2397 = false;
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        try {
            Class492.Method2237(this.Field2395, a);
        }
        catch (Exception a2) {
            a2.printStackTrace();
        }
    }

    @EventTarget(value=3)
    public void Method810(EventRender2D a) {
        String a2 = Class492.Method2239();
        if (this.Field2390.getValue()) {
            float a3 = 195 / Math.max((int)(mc.getDebugFPS() / 2), (int)1);
            if ((float)this.Field2396 <= 60.0f || (float)this.Field2396 >= 255.0f) {
                boolean bl = this.Field2397 = !this.Field2397;
            }
            if (this.Field2397) {
                this.Field2396 = (int)((float)this.Field2396 + a3);
            }
            this.Field2396 = (int)((float)this.Field2396 - a3);
            this.Field2396 = (int)MathUtils.Method574(this.Field2396, 255.0f, 60.0f);
        }
        this.Field2396 = 255;
        ScaledResolution a4 = new ScaledResolution(mc);
        Arrow.mc.theWorld.loadedEntityList.forEach(arg_0 -> this.Method1737(a4, arg_0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Method1734(Vec3 a) {
        if (!(a.xCoord > -1.0)) return false;
        if (!(a.zCoord < 1.0)) return false;
        double d = a.xCoord;
        int n = Arrow.mc.gameSettings.guiScale == 0 ? 1 : Arrow.mc.gameSettings.guiScale;
        if (!(d / (double)n >= 0.0)) return false;
        double d2 = a.xCoord;
        int n2 = Arrow.mc.gameSettings.guiScale == 0 ? 1 : Arrow.mc.gameSettings.guiScale;
        if (!(d2 / (double)n2 <= (double)Display.getWidth())) return false;
        double d3 = a.yCoord;
        int n3 = Arrow.mc.gameSettings.guiScale == 0 ? 1 : Arrow.mc.gameSettings.guiScale;
        if (!(d3 / (double)n3 >= 0.0)) return false;
        double d4 = a.yCoord;
        int n4 = Arrow.mc.gameSettings.guiScale == 0 ? 1 : Arrow.mc.gameSettings.guiScale;
        if (!(d4 / (double)n4 <= (double)Display.getHeight())) return false;
        return true;
    }

    public boolean Method965(EntityLivingBase a) {
        block10: {
            block9: {
                boolean a2 = this.Field2391.Method2509();
                boolean a3 = this.Field2394.Method2509();
                boolean a4 = this.Field2392.Method2509();
                boolean a5 = this.Field2393.Method2509();
                if (a.isInvisible()) {
                    return false;
                }
                if (a == Arrow.mc.thePlayer) {
                    return false;
                }
                if (AntiBot.Field2577.contains((Object)a)) {
                    return false;
                }
                if (Class305.Method704((Entity)a) && GlobalModule.Field3142.getValue()) {
                    return false;
                }
                if (Class305.Method697((Entity)a)) {
                    return false;
                }
                if (a instanceof EntityPlayer) break block9;
                if (a instanceof EntityMob || a instanceof EntityDragon || a instanceof EntityGhast || a instanceof EntitySlime || a instanceof EntityIronGolem || a instanceof EntitySnowman) break block9;
                if (!(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) break block10;
            }
            if (a instanceof EntityPlayerSP) {
                return Arrow.mc.gameSettings.thirdPersonView != 0;
            }
            return true;
        }
        return false;
    }

    private float Method1735(EntityLivingBase a) {
        double a2 = a.posX - Arrow.mc.thePlayer.posX;
        double a3 = a.posZ - Arrow.mc.thePlayer.posZ;
        float a4 = (float)(-(Math.atan2((double)a2, (double)a3) * 57.29577951308232));
        return a4;
    }

    private Color Method1736(EntityLivingBase a, int a2) {
        float a3 = Arrow.mc.thePlayer.getDistanceToEntity((Entity)a);
        float a4 = 40.0f;
        float a5 = Math.max((float)0.0f, (float)(Math.min((float)a3, (float)a4) / a4));
        Color a6 = new Color(Color.HSBtoRGB((float)(a5 / 3.0f), (float)1.0f, (float)1.0f) | 0xFF000000);
        return new Color(a6.getRed(), a6.getGreen(), a6.getBlue(), a2);
    }

    private void Method1737(ScaledResolution a, Entity a2) {
        if (a2 instanceof EntityLivingBase && this.Method965((EntityLivingBase)a2)) {
            EntityLivingBase a3 = (EntityLivingBase)a2;
            Vec3 a4 = (Vec3)this.Field2395.Method2236().Method2665((Object)a3);
            if (!RenderUtils.Method1143((Entity)a3)) {
                int a5 = a.getScaledWidth() / 2;
                int a6 = a.getScaledHeight() / 2;
                float a7 = this.Method1735(a3) - Arrow.mc.thePlayer.rotationYaw;
                GL11.glPushMatrix();
                GL11.glTranslatef((float)a5, (float)a6, (float)0.0f);
                GL11.glRotatef((float)a7, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)(-a5), (float)(-a6), (float)0.0f);
                GL11.glLineWidth((float)1.0f);
                RenderUtils.Method1137(a5, (float)a6 - this.Field2389.Method2744().floatValue(), this.Field2388.Method2744().floatValue(), 2.0f, 1.0f, this.Method1736(a3, this.Field2396).getRGB());
                GL11.glTranslatef((float)a5, (float)a6, (float)0.0f);
                GL11.glRotatef((float)(-a7), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)(-a5), (float)(-a6), (float)0.0f);
                GL11.glPopMatrix();
            }
        }
    }
}