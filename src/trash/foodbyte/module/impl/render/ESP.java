/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  net.minecraft.client.entity.EntityPlayerSP
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
 */
package trash.foodbyte.module.impl.render;

import awsl.Class305;
import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
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
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;

public class ESP
extends Module {
    public ColorValue Field2378 = new ColorValue("ESP", "Color", new Color(0, 153, 255), "\u900f\u89c6\u7ed8\u5236\u989c\u8272");
    public BooleanValue Field2379 = new BooleanValue("ESP", "Player", (Boolean)true, "\u73a9\u5bb6");
    public BooleanValue Field2380 = new BooleanValue("ESP", "Animals", (Boolean)false, "\u751f\u7269");
    public BooleanValue Field2381 = new BooleanValue("ESP", "Mobs", (Boolean)false, "\u602a\u7269");
    public BooleanValue Field2382 = new BooleanValue("ESP", "Invisibles", (Boolean)true, "\u9690\u8eab");

    public ESP() {
        super("ESP", Category.RENDER);
        this.setDescription("\u7ed8\u5236\u5b9e\u4f53\u900f\u89c6");
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        Iterator iterator = ESP.mc.theWorld.loadedEntityList.Method1383();
        String a2 = Class492.Method2239();
        while (iterator.Method932()) {
            EntityLivingBase a3;
            Object a4 = iterator.Method933();
            if (!(a4 instanceof EntityLivingBase)) continue;
            if (a4 == ESP.mc.getMinecraft().thePlayer || AntiBot.Field2577.contains(a4) || !this.Method965(a3 = (EntityLivingBase)a4)) continue;
            double a5 = ReflectionUtils.Method2587();
            double a6 = a3.lastTickPosX + (a3.posX - a3.lastTickPosX) * a5 - ReflectionUtils.Method2591();
            double a7 = a3.lastTickPosY + (a3.posY - a3.lastTickPosY) * a5 - ReflectionUtils.Method2592();
            double a8 = a3.lastTickPosZ + (a3.posZ - a3.lastTickPosZ) * a5 - ReflectionUtils.Method2593();
            Color a9 = this.Field2378.Method2444();
            if (Class305.Method704((Entity)a3)) {
                a9 = new Color(0, 255, 0);
            }
            if (a3.hurtTime > 0) {
                a9 = new Color(255, 0, 0);
            }
            if (a3.isInvisible()) {
                a9 = new Color(255, 255, 0);
            }
            RenderUtils.Method1121(a6, a7, a8, (double)a3.width / 1.5, (double)a3.height + 0.2, (float)a9.getRed() / 255.0f, (float)a9.getGreen() / 255.0f, (float)a9.getBlue() / 255.0f, (float)a9.getAlpha() / 255.0f);
            break;
        }
    }

    public boolean Method965(EntityLivingBase a) {
        block6: {
            block5: {
                boolean a2 = this.Field2379.Method2509();
                boolean a3 = this.Field2382.Method2509();
                boolean a4 = this.Field2380.Method2509();
                boolean a5 = this.Field2381.Method2509();
                if (a.isInvisible()) {
                    return false;
                }
                if (a instanceof EntityPlayer) break block5;
                if (a instanceof EntityMob || a instanceof EntityDragon || a instanceof EntityGhast || a instanceof EntitySlime || a instanceof EntityIronGolem || a instanceof EntitySnowman) break block5;
                if (!(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) break block6;
            }
            if (a instanceof EntityPlayerSP) {
                return ESP.mc.gameSettings.thirdPersonView != 0;
            }
            return true;
        }
        return false;
    }
}