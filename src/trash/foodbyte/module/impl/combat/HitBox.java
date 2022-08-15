/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
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
package trash.foodbyte.module.impl.combat;

import awsl.Class305;
import awsl.Class653;
import eventapi.EventTarget;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
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
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class HitBox
extends Module {
    public BooleanValue Field2603 = new BooleanValue("Hitbox", "Player", (Boolean)true, "\u73a9\u5bb6");
    public BooleanValue Field2604 = new BooleanValue("Hitbox", "Animals", (Boolean)false, "\u751f\u7269");
    public BooleanValue Field2605 = new BooleanValue("Hitbox", "Mobs", (Boolean)false, "\u602a\u7269");
    public BooleanValue Field2606 = new BooleanValue("Hitbox", "Invisibles", (Boolean)true, "\u9690\u8eab");
    public FloatValue Field2607 = new FloatValue("Hitbox", "Size", 0.5, 0.1, 1.0, 0.01, "\u78b0\u649e\u7bb1(0.1\u4e3a\u9ed8\u8ba4)");

    public HitBox() {
        super("HitBox", "Hit Box", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u5b9e\u4f53\u78b0\u649e\u7bb1\u4fee\u6539(\u589e\u52a0\u5b9e\u4f53\u88ab\u653b\u51fb\u7684\u8303\u56f4)";
    }

    @EventTarget
    private void Method755(Class653 a) {
        this.setDisplayTag(this.Field2607.Method2744().toString());
    }

    public boolean Method1187(Entity a) {
        block10: {
            block9: {
                boolean a2 = this.Field2603.Method2509();
                boolean a3 = this.Field2606.Method2509();
                boolean a4 = this.Field2604.Method2509();
                boolean a5 = this.Field2605.Method2509();
                if (a.isInvisible()) {
                    return false;
                }
                if (a == HitBox.mc.thePlayer) {
                    return false;
                }
                if (a instanceof EntityPlayer) break block9;
                if (a instanceof EntityMob || a instanceof EntityDragon || a instanceof EntityGhast || a instanceof EntitySlime || a instanceof EntityIronGolem || a instanceof EntitySnowman) break block9;
                if (!(a instanceof EntityAnimal) && !(a instanceof EntitySquid) && !(a instanceof EntityVillager) && !(a instanceof EntityBat)) break block10;
            }
            if (a instanceof EntityPlayer && Class305.Method698(a.getName())) {
                return false;
            }
            if (a instanceof EntityPlayer && AntiBot.Field2577.contains((Object)a)) {
                return false;
            }
            if (a instanceof EntityPlayer && Class305.Method704(a)) {
                return false;
            }
            if (a instanceof EntityPlayerSP) {
                return HitBox.mc.gameSettings.thirdPersonView != 0;
            }
            return true;
        }
        return false;
    }
}