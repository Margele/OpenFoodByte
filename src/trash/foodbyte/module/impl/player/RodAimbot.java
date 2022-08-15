/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemFishingRod
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C03PacketPlayer$C05PacketPlayerLook
 *  net.minecraft.world.World
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class248;
import awsl.Class305;
import awsl.Class338;
import awsl.Class653;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.world.World;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.utils.Wrapper;
import trash.foodbyte.value.FloatValue;

public class RodAimbot
extends Module {
    public FloatValue Field2418 = new FloatValue("RodAimbot", "Reach", 10.0, 1.0, 15.0, 1.0, "\u8ddd\u79bb");
    EntityLivingBase Field2419 = null;

    public RodAimbot() {
        super("RodAimbot", "Rod Aimbot", Category.PLAYER);
        this.setDescription("\u4f7f\u7528\u6746\u65f6\u53d1\u5305\u7784\u51c6\u6700\u8fd1\u7684\u5b9e\u4f53(\u6682\u65f6\u4e0d\u8981\u5728Hypixel\u4f7f\u7528\u53ef\u80fd\u4f1a\u72d7ban)");
    }

    @Override
    public boolean canUse() {
        return GlobalModule.INSTANCE.Field3186 == null || !PermissionManager.canUseModule("rodaimbot");
    }

    @EventTarget
    public void Method755(Class653 a) {
        this.Field2419 = RodAimbot.Method1763(this.Field2418.Method2744().floatValue());
    }

    @EventTarget
    public void Method1762(Class248 a) {
        if (a.Field1377 == 1 && a.Field1378 && RodAimbot.mc.currentScreen == null && this.Field2419 != null && RodAimbot.mc.thePlayer.getCurrentEquippedItem() != null && RodAimbot.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemFishingRod && RodAimbot.mc.thePlayer.fishEntity == null) {
            a.Method2300(true);
            double a2 = this.Field2419.posX - 0.5;
            double a3 = this.Field2419.posY;
            double a4 = this.Field2419.posZ - 0.5;
            Class338 a5 = new Class338(a2 + (this.Field2419.posX - this.Field2419.lastTickPosX) * 10.0, a3 + (double)(this.Field2419.getEyeHeight() / 2.0f), a4 + (this.Field2419.posZ - this.Field2419.lastTickPosZ) * 10.0);
            float[] a6 = RodAimbot.Method1764(a5);
            Wrapper.INSTANCE.Method2874((Packet)new C03PacketPlayer.C05PacketPlayerLook(a6[0], a6[1], RodAimbot.mc.thePlayer.onGround));
            RodAimbot.mc.playerController.sendUseItem((EntityPlayer)RodAimbot.mc.thePlayer, (World)RodAimbot.mc.theWorld, RodAimbot.mc.thePlayer.getHeldItem());
            Wrapper.INSTANCE.Method2874((Packet)new C03PacketPlayer.C05PacketPlayerLook(RodAimbot.mc.thePlayer.rotationYaw, RodAimbot.mc.thePlayer.rotationPitch, RodAimbot.mc.thePlayer.onGround));
        }
    }

    public static EntityLivingBase Method1763(float a) {
        EntityLivingBase a2 = null;
        int a3 = Class148.Method1444();
        float a4 = a;
        Iterator iterator = RodAimbot.mc.theWorld.loadedEntityList.Method1383();
        while (iterator.Method932()) {
            Object a5 = iterator.Method933();
            if (!RodAimbot.Method1766(a5) || a5 instanceof EntityPlayerSP) break;
            EntityLivingBase a6 = (EntityLivingBase)a5;
            if (!(a6 instanceof EntityPlayer) || AntiBot.Field2577.contains((Object)a6) || Class305.Method704((Entity)a6)) continue;
            if (Class305.Method697((Entity)a6)) {
            }
            if (RodAimbot.mc.thePlayer.getDistanceToEntity((Entity)a6) < a4) {
                a4 = RodAimbot.mc.thePlayer.getDistanceToEntity((Entity)a6);
                a2 = a6;
            }
            break;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static float[] Method1764(Class338 a) {
        void a2;
        double a3 = a.Field1633 + 0.5 - RodAimbot.mc.thePlayer.posX;
        double a4 = a.Field1634 + 0.5 - (RodAimbot.mc.thePlayer.posY + (double)RodAimbot.mc.thePlayer.getEyeHeight());
        double d = a.Field1635 + 0.5 - RodAimbot.mc.thePlayer.posZ;
        int a5 = Class148.Method1445();
        double a6 = RodAimbot.Method1765(a3 * a3 + a2 * a2);
        float a7 = (float)(Math.atan2((double)a2, (double)a3) * 180.0 / Math.PI) - 90.0f;
        float a8 = (float)(-(Math.atan2((double)a4, (double)a6) * 180.0 / Math.PI));
        float[] fArray = new float[]{RodAimbot.mc.thePlayer.rotationYaw + RodAimbot.Method1671(a7 - RodAimbot.mc.thePlayer.rotationYaw), RodAimbot.mc.thePlayer.rotationPitch + RodAimbot.Method1671(a8 - RodAimbot.mc.thePlayer.rotationPitch)};
        Class91.Method3647(new String[5]);
        return fArray;
    }

    public static float Method1765(double a) {
        return (float)Math.sqrt((double)a);
    }

    public static float Method1671(float a) {
        if ((a %= 360.0f) >= 180.0f) {
            a -= 360.0f;
        }
        if (a < -180.0f) {
            a += 360.0f;
        }
        return a;
    }

    public static boolean Method1766(Object a) {
        return a instanceof EntityLivingBase;
    }
}