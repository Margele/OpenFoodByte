/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.entity.EntityPlayerSP
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
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class492;
import awsl.Class645;
import eventapi.EventTarget;
import net.minecraft.client.entity.EntityPlayerSP;
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
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.value.BooleanValue;

public class Chams
extends Module {
    public BooleanValue Field2398 = new BooleanValue("Chams", "Player", (Boolean)true, "\u73a9\u5bb6");
    public BooleanValue Field2399 = new BooleanValue("Chams", "Animals", (Boolean)false, "\u751f\u7269");
    public BooleanValue Field2400 = new BooleanValue("Chams", "Mobs", (Boolean)false, "\u602a\u7269");
    public BooleanValue Field2401 = new BooleanValue("Chams", "Invisibles", (Boolean)true, "\u9690\u8eab");

    public Chams() {
        super("Chams", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u5b9e\u4f53\u900f\u89c6";
    }

    @EventTarget
    public void Method1733(Class645 a) {
        block5: {
            EntityLivingBase a2;
            block4: {
                a2 = a.Method3605();
                String a3 = Class492.Method2239();
                if (!a.Method2241()) break block4;
                if (!this.Method965(a2)) break block5;
                GL11.glEnable((int)32823);
                GL11.glPolygonOffset((float)1.0f, (float)-1000000.0f);
            }
            if (a.Method3515() && this.Method965(a2)) {
                GL11.glPolygonOffset((float)1.0f, (float)1000000.0f);
                GL11.glDisable((int)32823);
            }
        }
    }

    public boolean Method965(EntityLivingBase a) {
        block7: {
            block6: {
                boolean a2 = this.Field2398.Method2509();
                boolean a3 = this.Field2401.Method2509();
                boolean a4 = this.Field2399.Method2509();
                boolean a5 = this.Field2400.Method2509();
                if (a.isInvisible()) {
                    return false;
                }
                if (a == Chams.mc.thePlayer) {
                    return false;
                }
                if (a instanceof EntityPlayer && !AntiBot.Field2577.contains((Object)a)) break block6;
                if (a instanceof EntityMob || a instanceof EntityDragon || a instanceof EntityGhast || a instanceof EntitySlime || a instanceof EntityIronGolem || a instanceof EntitySnowman) break block6;
                if (!(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) break block7;
            }
            if (a instanceof EntityPlayerSP) {
                return Chams.mc.gameSettings.thirdPersonView != 0;
            }
            return true;
        }
        return false;
    }
}