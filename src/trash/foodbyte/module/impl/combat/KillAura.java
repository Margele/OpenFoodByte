/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Random
 *  java.util.concurrent.CopyOnWriteArrayList
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.boss.EntityDragon
 *  net.minecraft.entity.boss.EntityDragonPart
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.login.server.S02PacketLoginSuccess
 *  net.minecraft.network.play.client.C07PacketPlayerDigging
 *  net.minecraft.network.play.client.C07PacketPlayerDigging$Action
 *  net.minecraft.network.play.client.C08PacketPlayerBlockPlacement
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.network.play.server.S30PacketWindowItems
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Cylinder
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class628;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import native0.Class614;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import obfuscate.b;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Cylinder;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.ReflectionUtils2;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.RotationUtils;
import trash.foodbyte.utils.ServerPacketHandler;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class KillAura
extends Module {
    public static boolean Field2493;
    private static final String[] Field2494;
    public FloatValue Field2495;
    private float[] Field2496;
    private boolean Field2497;
    public ModeValue Field2498;
    public FloatValue Field2499;
    public int Field2500;
    private static final String[] Field2501;
    public BooleanValue Field2502;
    public BooleanValue Field2503;
    public ModeValue Field2504 = new ModeValue(KillAura.Method754(7562, -17983), KillAura.Method754(7612, -11267), KillAura.Method754(7554, -11340), new String[]{KillAura.Method754(7554, -11340), KillAura.Method754(7611, -24294)}, KillAura.Method754(7578, -15891));
    public FloatValue Field2505;
    public FloatValue Field2506;
    public FloatValue Field2507;
    private int Field2508;
    public BooleanValue Field2509;
    TimeHelper Field2510;
    public ModeValue Field2511;
    public ModeValue Field2512;
    public FloatValue Field2513;
    public BooleanValue Field2514;
    public ModeValue Field2515;
    public BooleanValue Field2516;
    public FloatValue Field2517;
    public BooleanValue Field2518;
    public BooleanValue Field2519;
    public BooleanValue Field2520;
    public BooleanValue Field2521;
    TimeHelper Field2522;
    public BooleanValue Field2523;
    public static EntityLivingBase target;
    public FloatValue Field2525;
    public BooleanValue Field2526;
    private double Field2527;
    public static List Field2528;
    public FloatValue Field2529;
    public FloatValue Field2530;
    public BooleanValue Field2531;
    private final Random Field2532;

    @EventTarget
    public void Method273(EventPacket a) {
        if ((a.getPacket() instanceof S07PacketRespawn || a.getPacket() instanceof S02PacketLoginSuccess) && this.Field2531.getBooleanValue().booleanValue()) {
            this.Method1028();
        }
        if (this.Field2498.isCurrentMode(KillAura.Method754(7648, 15982))) {
            if (a.getPacket() instanceof C07PacketPlayerDigging && this.Method713()) {
                a.setCancelled(true);
            }
            if (a.getPacket() instanceof S30PacketWindowItems && ((S30PacketWindowItems)a.getPacket()).func_148911_c() == 0) {
                if (this.Method713()) {
                    Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(KillAura.mc.thePlayer.inventory.getCurrentItem()));
                    a.setCancelled(true);
                } else {
                    Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
                }
            }
        }
    }

    private void Method814() {
        if (Field2528.Method1799() == 0) {
            target = null;
            return;
        }
        target = (EntityLivingBase)Field2528.get(this.Field2508);
    }

    private void Method942(EntityLivingBase a2) {
        double a3 = ReflectionUtils.getRenderPartialTicks();
        double a4 = a2.lastTickPosX + (a2.posX - a2.lastTickPosX) * a3 - ReflectionUtils.getRenderPosX();
        double a5 = a2.lastTickPosY + (a2.posY - a2.lastTickPosY) * a3 - ReflectionUtils.getRenderPosY();
        double a6 = a2.lastTickPosZ + (a2.posZ - a2.lastTickPosZ) * a3 - ReflectionUtils.getRenderPosZ();
        this.Method964(a2, a4, a5 + (double)a2.getEyeHeight() + 0.5 + Math.sin((double)((float)(System.currentTimeMillis() % 1000000L) / 333.0f)) / 10.0, a6);
    }

    private void Method943() {
        KillAura.mc.thePlayer.swingItem();
        KillAura.mc.playerController.attackEntity((EntityPlayer)KillAura.mc.thePlayer, this.Method958(target));
        if ((double)KillAura.mc.thePlayer.getDistanceToEntity((Entity)target) <= (double)(this.Field2505.getFloatValue().floatValue() + KillAura.target.width / 2.0f)) {
            int a2 = 0;
            while ((double)a2 < (double)this.Field2499.getFloatValue().floatValue()) {
                KillAura.mc.effectRenderer.emitParticleAtEntity((Entity)target, EnumParticleTypes.CRIT_MAGIC);
                ++a2;
            }
        }
    }

    private float[] Method944(Entity a2, EntityPlayerSP a3) {
        double a4 = a2.posX - a3.posX;
        double a5 = a2.posY + (double)a2.height - (a3.posY + (double)a3.height);
        double a6 = a2.posZ - a3.posZ;
        float a7 = (float)(Math.atan2((double)a6, (double)a4) * 180.0 / Math.PI) - 90.0f;
        float a8 = (float)(Math.atan2((double)a5, (double)a3.getDistanceToEntity(a2)) * 180.0 / Math.PI);
        float a9 = a3.rotationYaw + MathHelper.wrapAngleTo180_float((float)(a7 - a3.rotationYaw));
        float a10 = a3.rotationPitch + MathHelper.wrapAngleTo180_float((float)(a8 - a3.rotationPitch));
        return new float[]{a9, -a10};
    }

    public static void Method945(float a2) {
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        GL11.glLineWidth((float)a2);
    }

    private void Method946() {
        int a2 = this.Field2504.isCurrentMode(KillAura.Method754(7679, -635)) ? 4 : this.Field2513.getFloatValue().intValue();
        Iterator iterator = KillAura.mc.theWorld.getLoadedEntityList().Method1383();
        while (iterator.Method932()) {
            EntityLivingBase a3;
            Entity a4 = (Entity)iterator.Method933();
            if (a4 instanceof EntityLivingBase && this.Method965(a3 = (EntityLivingBase)a4) && !Field2528.contains((Object)a3)) {
                Field2528.Method2530((Object)a3);
            }
            if (Field2528.Method1799() < a2) continue;
            break;
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7588, -11596)) && KillAura.mc.gameSettings.keyBindSprint.isKeyDown()) {
            Field2528.sort(Comparator.comparingDouble(KillAura::Method971));
            return;
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7581, 693)) && KillAura.mc.gameSettings.keyBindSprint.isKeyDown()) {
            Field2528.sort(KillAura::Method953);
            return;
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7665, 27633)) && KillAura.mc.gameSettings.keyBindSprint.isKeyDown()) {
            Field2528.sort(KillAura::Method950);
            return;
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7591, 22163))) {
            Field2528.sort(KillAura::Method974);
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7614, -26901))) {
            Field2528.sort(KillAura::Method947);
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7568, 20260))) {
            Field2528.sort(Comparator.comparingDouble(KillAura::Method966));
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7660, 14417))) {
            Field2528.sort(Comparator.comparingDouble(this::Method812));
        }
        if (this.Field2511.isCurrentMode(KillAura.Method754(7676, -556))) {
            Field2528.sort(KillAura::Method969);
        }
    }

    private static int Method947(EntityLivingBase a2, EntityLivingBase a3) {
        return (int)(a2.getHealth() - a3.getHealth());
    }

    private void Method948(EntityLivingBase a2) {
        this.Method963(a2);
    }

    private boolean Method805() {
        return KillAura.mc.thePlayer.inventory.getCurrentItem() != null && KillAura.mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemSword;
    }

    @Override
    public void onEnable() {
        Field2528.clear();
        if (!this.Method1026()) {
            return;
        }
        this.Field2496[0] = KillAura.mc.thePlayer.rotationYaw;
        this.Field2496[1] = KillAura.mc.thePlayer.rotationPitch;
    }

    @Override
    public void idk() {
        this.Field2495.Method2757(this.Field2504.isCurrentMode(KillAura.Method754(7606, -18533)));
        this.Field2498.Method2757(!this.Field2515.isCurrentMode(KillAura.Method754(7658, 16565)));
    }

    private static int Method950(EntityLivingBase a2, EntityLivingBase a3) {
        return (int)(a2.getHealth() - a3.getHealth());
    }

    public double[] Method818(EntityLivingBase a2) {
        double a3 = a2.posX - KillAura.mc.thePlayer.posX;
        double a4 = a2.posY - KillAura.mc.thePlayer.posY;
        double a5 = a2.posZ - KillAura.mc.thePlayer.posZ;
        double a6 = -(Math.atan2((double)a3, (double)a5) * 57.29577951308232);
        double a7 = -(Math.asin((double)(a4 /= (double)KillAura.mc.thePlayer.getDistanceToEntity((Entity)a2))) * 57.29577951308232);
        return new double[]{a6, a7};
    }

    private void Method951() {
        this.Method943();
        Field2528.stream().filter(this::Method960).forEach(this::Method973);
    }

    public void Method952(EntityLivingBase a2) {
        double a3 = ReflectionUtils.getRenderPartialTicks();
        double a4 = ((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).lastTickPosX + (((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).posX - ((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).lastTickPosX) * a3 - ReflectionUtils.getRenderPosX();
        double a5 = ((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).lastTickPosY + (((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).posY - ((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).lastTickPosY) * a3 - ReflectionUtils.getRenderPosY();
        double a6 = ((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).lastTickPosZ + (((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).posZ - ((Entity)(a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2)).lastTickPosZ) * a3 - ReflectionUtils.getRenderPosZ();
        double a7 = (a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2).getEntityBoundingBox().maxX - (a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2).getEntityBoundingBox().minX;
        double a8 = (a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2).getEntityBoundingBox().maxY - (a2 instanceof EntityDragon ? ((EntityDragon)a2).dragonPartBody : a2).getEntityBoundingBox().minY + 0.25;
        float a9 = 0.0f;
        float a10 = 0.5f;
        float a11 = 1.0f;
        float a12 = 0.4f;
        float a13 = 0.0f;
        float a14 = 0.5f;
        float a15 = 1.0f;
        if (this.Method958((EntityLivingBase)a2).hurtResistantTime > 0) {
            a9 = 1.0f;
            a11 = 0.0f;
            a10 = 0.0f;
            a13 = 1.0f;
            a14 = 0.0f;
            a15 = 0.0f;
        } else {
            a9 = 0.0f;
            a11 = 1.0f;
            a10 = 0.5f;
            a13 = 0.0f;
            a14 = 0.5f;
            a15 = 1.0f;
        }
        float a16 = 1.0f;
        float a17 = 1.0f;
        RenderUtils.Method1120(a4, a5 + a8, a6, a7 / 1.5, 0.1, a9, a10, a11, a12, a13, a14, a15, 1.0f, 1.0f);
    }

    @Override
    public void onDisable() {
        Field2493 = false;
        target = null;
        Field2528.clear();
        if (this.Method1026() && this.Method805()) {
            ReflectionUtils.setItemInUseCount(0);
            Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
        }
    }

    private static String Method754(int n, int n2) {
        int n3 = (n ^ 0x1DBB) & 0xFFFF;
        if (Field2501[n3] == null) {
            int n4;
            char[] cArray = Field2494[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 227;
                    break;
                }
                case 1: {
                    n4 = 4;
                    break;
                }
                case 2: {
                    n4 = 121;
                    break;
                }
                case 3: {
                    n4 = 32;
                    break;
                }
                case 4: {
                    n4 = 46;
                    break;
                }
                case 5: {
                    n4 = 215;
                    break;
                }
                case 6: {
                    n4 = 184;
                    break;
                }
                case 7: {
                    n4 = 76;
                    break;
                }
                case 8: {
                    n4 = 122;
                    break;
                }
                case 9: {
                    n4 = 251;
                    break;
                }
                case 10: {
                    n4 = 5;
                    break;
                }
                case 11: {
                    n4 = 140;
                    break;
                }
                case 12: {
                    n4 = 222;
                    break;
                }
                case 13: {
                    n4 = 19;
                    break;
                }
                case 14: {
                    n4 = 223;
                    break;
                }
                case 15: {
                    n4 = 147;
                    break;
                }
                case 16: {
                    n4 = 79;
                    break;
                }
                case 17: {
                    n4 = 110;
                    break;
                }
                case 18: {
                    n4 = 62;
                    break;
                }
                case 19: {
                    n4 = 134;
                    break;
                }
                case 20: {
                    n4 = 77;
                    break;
                }
                case 21: {
                    n4 = 188;
                    break;
                }
                case 22: {
                    n4 = 72;
                    break;
                }
                case 23: {
                    n4 = 132;
                    break;
                }
                case 24: {
                    n4 = 209;
                    break;
                }
                case 25: {
                    n4 = 20;
                    break;
                }
                case 26: {
                    n4 = 242;
                    break;
                }
                case 27: {
                    n4 = 198;
                    break;
                }
                case 28: {
                    n4 = 54;
                    break;
                }
                case 29: {
                    n4 = 217;
                    break;
                }
                case 30: {
                    n4 = 139;
                    break;
                }
                case 31: {
                    n4 = 253;
                    break;
                }
                case 32: {
                    n4 = 138;
                    break;
                }
                case 33: {
                    n4 = 129;
                    break;
                }
                case 34: {
                    n4 = 11;
                    break;
                }
                case 35: {
                    n4 = 0;
                    break;
                }
                case 36: {
                    n4 = 49;
                    break;
                }
                case 37: {
                    n4 = 145;
                    break;
                }
                case 38: {
                    n4 = 24;
                    break;
                }
                case 39: {
                    n4 = 168;
                    break;
                }
                case 40: {
                    n4 = 246;
                    break;
                }
                case 41: {
                    n4 = 189;
                    break;
                }
                case 42: {
                    n4 = 22;
                    break;
                }
                case 43: {
                    n4 = 124;
                    break;
                }
                case 44: {
                    n4 = 86;
                    break;
                }
                case 45: {
                    n4 = 200;
                    break;
                }
                case 46: {
                    n4 = 190;
                    break;
                }
                case 47: {
                    n4 = 151;
                    break;
                }
                case 48: {
                    n4 = 155;
                    break;
                }
                case 49: {
                    n4 = 59;
                    break;
                }
                case 50: {
                    n4 = 212;
                    break;
                }
                case 51: {
                    n4 = 241;
                    break;
                }
                case 52: {
                    n4 = 208;
                    break;
                }
                case 53: {
                    n4 = 28;
                    break;
                }
                case 54: {
                    n4 = 80;
                    break;
                }
                case 55: {
                    n4 = 236;
                    break;
                }
                case 56: {
                    n4 = 96;
                    break;
                }
                case 57: {
                    n4 = 58;
                    break;
                }
                case 58: {
                    n4 = 37;
                    break;
                }
                case 59: {
                    n4 = 128;
                    break;
                }
                case 60: {
                    n4 = 224;
                    break;
                }
                case 61: {
                    n4 = 109;
                    break;
                }
                case 62: {
                    n4 = 131;
                    break;
                }
                case 63: {
                    n4 = 135;
                    break;
                }
                case 64: {
                    n4 = 82;
                    break;
                }
                case 65: {
                    n4 = 166;
                    break;
                }
                case 66: {
                    n4 = 33;
                    break;
                }
                case 67: {
                    n4 = 26;
                    break;
                }
                case 68: {
                    n4 = 201;
                    break;
                }
                case 69: {
                    n4 = 220;
                    break;
                }
                case 70: {
                    n4 = 6;
                    break;
                }
                case 71: {
                    n4 = 123;
                    break;
                }
                case 72: {
                    n4 = 45;
                    break;
                }
                case 73: {
                    n4 = 154;
                    break;
                }
                case 74: {
                    n4 = 48;
                    break;
                }
                case 75: {
                    n4 = 173;
                    break;
                }
                case 76: {
                    n4 = 199;
                    break;
                }
                case 77: {
                    n4 = 117;
                    break;
                }
                case 78: {
                    n4 = 229;
                    break;
                }
                case 79: {
                    n4 = 191;
                    break;
                }
                case 80: {
                    n4 = 255;
                    break;
                }
                case 81: {
                    n4 = 239;
                    break;
                }
                case 82: {
                    n4 = 127;
                    break;
                }
                case 83: {
                    n4 = 126;
                    break;
                }
                case 84: {
                    n4 = 67;
                    break;
                }
                case 85: {
                    n4 = 174;
                    break;
                }
                case 86: {
                    n4 = 85;
                    break;
                }
                case 87: {
                    n4 = 50;
                    break;
                }
                case 88: {
                    n4 = 38;
                    break;
                }
                case 89: {
                    n4 = 234;
                    break;
                }
                case 90: {
                    n4 = 211;
                    break;
                }
                case 91: {
                    n4 = 81;
                    break;
                }
                case 92: {
                    n4 = 171;
                    break;
                }
                case 93: {
                    n4 = 13;
                    break;
                }
                case 94: {
                    n4 = 65;
                    break;
                }
                case 95: {
                    n4 = 250;
                    break;
                }
                case 96: {
                    n4 = 165;
                    break;
                }
                case 97: {
                    n4 = 130;
                    break;
                }
                case 98: {
                    n4 = 41;
                    break;
                }
                case 99: {
                    n4 = 47;
                    break;
                }
                case 100: {
                    n4 = 203;
                    break;
                }
                case 101: {
                    n4 = 240;
                    break;
                }
                case 102: {
                    n4 = 106;
                    break;
                }
                case 103: {
                    n4 = 169;
                    break;
                }
                case 104: {
                    n4 = 104;
                    break;
                }
                case 105: {
                    n4 = 247;
                    break;
                }
                case 106: {
                    n4 = 164;
                    break;
                }
                case 107: {
                    n4 = 84;
                    break;
                }
                case 108: {
                    n4 = 225;
                    break;
                }
                case 109: {
                    n4 = 248;
                    break;
                }
                case 110: {
                    n4 = 175;
                    break;
                }
                case 111: {
                    n4 = 207;
                    break;
                }
                case 112: {
                    n4 = 244;
                    break;
                }
                case 113: {
                    n4 = 156;
                    break;
                }
                case 114: {
                    n4 = 116;
                    break;
                }
                case 115: {
                    n4 = 25;
                    break;
                }
                case 116: {
                    n4 = 152;
                    break;
                }
                case 117: {
                    n4 = 237;
                    break;
                }
                case 118: {
                    n4 = 230;
                    break;
                }
                case 119: {
                    n4 = 228;
                    break;
                }
                case 120: {
                    n4 = 221;
                    break;
                }
                case 121: {
                    n4 = 55;
                    break;
                }
                case 122: {
                    n4 = 243;
                    break;
                }
                case 123: {
                    n4 = 163;
                    break;
                }
                case 124: {
                    n4 = 42;
                    break;
                }
                case 125: {
                    n4 = 101;
                    break;
                }
                case 126: {
                    n4 = 185;
                    break;
                }
                case 127: {
                    n4 = 238;
                    break;
                }
                case 128: {
                    n4 = 31;
                    break;
                }
                case 129: {
                    n4 = 66;
                    break;
                }
                case 130: {
                    n4 = 183;
                    break;
                }
                case 131: {
                    n4 = 143;
                    break;
                }
                case 132: {
                    n4 = 100;
                    break;
                }
                case 133: {
                    n4 = 30;
                    break;
                }
                case 134: {
                    n4 = 56;
                    break;
                }
                case 135: {
                    n4 = 177;
                    break;
                }
                case 136: {
                    n4 = 153;
                    break;
                }
                case 137: {
                    n4 = 202;
                    break;
                }
                case 138: {
                    n4 = 34;
                    break;
                }
                case 139: {
                    n4 = 53;
                    break;
                }
                case 140: {
                    n4 = 8;
                    break;
                }
                case 141: {
                    n4 = 87;
                    break;
                }
                case 142: {
                    n4 = 233;
                    break;
                }
                case 143: {
                    n4 = 118;
                    break;
                }
                case 144: {
                    n4 = 94;
                    break;
                }
                case 145: {
                    n4 = 149;
                    break;
                }
                case 146: {
                    n4 = 180;
                    break;
                }
                case 147: {
                    n4 = 150;
                    break;
                }
                case 148: {
                    n4 = 158;
                    break;
                }
                case 149: {
                    n4 = 182;
                    break;
                }
                case 150: {
                    n4 = 157;
                    break;
                }
                case 151: {
                    n4 = 213;
                    break;
                }
                case 152: {
                    n4 = 218;
                    break;
                }
                case 153: {
                    n4 = 12;
                    break;
                }
                case 154: {
                    n4 = 142;
                    break;
                }
                case 155: {
                    n4 = 107;
                    break;
                }
                case 156: {
                    n4 = 112;
                    break;
                }
                case 157: {
                    n4 = 44;
                    break;
                }
                case 158: {
                    n4 = 141;
                    break;
                }
                case 159: {
                    n4 = 89;
                    break;
                }
                case 160: {
                    n4 = 216;
                    break;
                }
                case 161: {
                    n4 = 136;
                    break;
                }
                case 162: {
                    n4 = 74;
                    break;
                }
                case 163: {
                    n4 = 193;
                    break;
                }
                case 164: {
                    n4 = 226;
                    break;
                }
                case 165: {
                    n4 = 197;
                    break;
                }
                case 166: {
                    n4 = 43;
                    break;
                }
                case 167: {
                    n4 = 108;
                    break;
                }
                case 168: {
                    n4 = 27;
                    break;
                }
                case 169: {
                    n4 = 160;
                    break;
                }
                case 170: {
                    n4 = 195;
                    break;
                }
                case 171: {
                    n4 = 98;
                    break;
                }
                case 172: {
                    n4 = 133;
                    break;
                }
                case 173: {
                    n4 = 204;
                    break;
                }
                case 174: {
                    n4 = 57;
                    break;
                }
                case 175: {
                    n4 = 172;
                    break;
                }
                case 176: {
                    n4 = 170;
                    break;
                }
                case 177: {
                    n4 = 206;
                    break;
                }
                case 178: {
                    n4 = 93;
                    break;
                }
                case 179: {
                    n4 = 90;
                    break;
                }
                case 180: {
                    n4 = 1;
                    break;
                }
                case 181: {
                    n4 = 83;
                    break;
                }
                case 182: {
                    n4 = 103;
                    break;
                }
                case 183: {
                    n4 = 64;
                    break;
                }
                case 184: {
                    n4 = 52;
                    break;
                }
                case 185: {
                    n4 = 187;
                    break;
                }
                case 186: {
                    n4 = 181;
                    break;
                }
                case 187: {
                    n4 = 231;
                    break;
                }
                case 188: {
                    n4 = 115;
                    break;
                }
                case 189: {
                    n4 = 159;
                    break;
                }
                case 190: {
                    n4 = 23;
                    break;
                }
                case 191: {
                    n4 = 125;
                    break;
                }
                case 192: {
                    n4 = 14;
                    break;
                }
                case 193: {
                    n4 = 119;
                    break;
                }
                case 194: {
                    n4 = 161;
                    break;
                }
                case 195: {
                    n4 = 29;
                    break;
                }
                case 196: {
                    n4 = 186;
                    break;
                }
                case 197: {
                    n4 = 97;
                    break;
                }
                case 198: {
                    n4 = 144;
                    break;
                }
                case 199: {
                    n4 = 91;
                    break;
                }
                case 200: {
                    n4 = 178;
                    break;
                }
                case 201: {
                    n4 = 17;
                    break;
                }
                case 202: {
                    n4 = 40;
                    break;
                }
                case 203: {
                    n4 = 205;
                    break;
                }
                case 204: {
                    n4 = 196;
                    break;
                }
                case 205: {
                    n4 = 137;
                    break;
                }
                case 206: {
                    n4 = 232;
                    break;
                }
                case 207: {
                    n4 = 249;
                    break;
                }
                case 208: {
                    n4 = 176;
                    break;
                }
                case 209: {
                    n4 = 70;
                    break;
                }
                case 210: {
                    n4 = 252;
                    break;
                }
                case 211: {
                    n4 = 214;
                    break;
                }
                case 212: {
                    n4 = 3;
                    break;
                }
                case 213: {
                    n4 = 92;
                    break;
                }
                case 214: {
                    n4 = 36;
                    break;
                }
                case 215: {
                    n4 = 21;
                    break;
                }
                case 216: {
                    n4 = 39;
                    break;
                }
                case 217: {
                    n4 = 35;
                    break;
                }
                case 218: {
                    n4 = 192;
                    break;
                }
                case 219: {
                    n4 = 162;
                    break;
                }
                case 220: {
                    n4 = 16;
                    break;
                }
                case 221: {
                    n4 = 105;
                    break;
                }
                case 222: {
                    n4 = 68;
                    break;
                }
                case 223: {
                    n4 = 114;
                    break;
                }
                case 224: {
                    n4 = 88;
                    break;
                }
                case 225: {
                    n4 = 2;
                    break;
                }
                case 226: {
                    n4 = 120;
                    break;
                }
                case 227: {
                    n4 = 15;
                    break;
                }
                case 228: {
                    n4 = 63;
                    break;
                }
                case 229: {
                    n4 = 60;
                    break;
                }
                case 230: {
                    n4 = 75;
                    break;
                }
                case 231: {
                    n4 = 210;
                    break;
                }
                case 232: {
                    n4 = 73;
                    break;
                }
                case 233: {
                    n4 = 111;
                    break;
                }
                case 234: {
                    n4 = 69;
                    break;
                }
                case 235: {
                    n4 = 61;
                    break;
                }
                case 236: {
                    n4 = 95;
                    break;
                }
                case 237: {
                    n4 = 9;
                    break;
                }
                case 238: {
                    n4 = 71;
                    break;
                }
                case 239: {
                    n4 = 10;
                    break;
                }
                case 240: {
                    n4 = 148;
                    break;
                }
                case 241: {
                    n4 = 167;
                    break;
                }
                case 242: {
                    n4 = 78;
                    break;
                }
                case 243: {
                    n4 = 179;
                    break;
                }
                case 244: {
                    n4 = 99;
                    break;
                }
                case 245: {
                    n4 = 219;
                    break;
                }
                case 246: {
                    n4 = 7;
                    break;
                }
                case 247: {
                    n4 = 18;
                    break;
                }
                case 248: {
                    n4 = 245;
                    break;
                }
                case 249: {
                    n4 = 113;
                    break;
                }
                case 250: {
                    n4 = 146;
                    break;
                }
                case 251: {
                    n4 = 194;
                    break;
                }
                case 252: {
                    n4 = 102;
                    break;
                }
                case 253: {
                    n4 = 235;
                    break;
                }
                case 254: {
                    n4 = 51;
                    break;
                }
                default: {
                    n4 = 254;
                }
            }
            int n5 = n4;
            int n6 = (n2 & 0xFF) - n5;
            n6 += 256;
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            n7 += 256;
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                cArray[n10] = (char)(cArray[n10] ^ n6);
                n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                ++n8;
            }
            KillAura.Field2501[n3] = new String(cArray).intern();
        }
        return Field2501[n3];
    }

    private static int Method953(EntityLivingBase a2, EntityLivingBase a3) {
        return (int)(a2.getHealth() - a3.getHealth());
    }

    @EventTarget(value=4)
    public void Method755(EventTick a2) {
        if (this.Field2503.getBooleanValue().booleanValue() && !Mouse.isButtonDown((int)0) && !KillAura.mc.gameSettings.keyBindAttack.isKeyDown()) {
            target = null;
            return;
        }
        if (KillAura.mc.thePlayer.ridingEntity == null) {
            return;
        }
        if (this.Field2504.isCurrentMode(KillAura.Method754(7554, -11340))) {
            this.setDisplayTag(KillAura.Method754(7554, -11340));
            if (this.Field2522.isDelayComplete(this.Field2506.getFloatValue().floatValue())) {
                this.Field2522.reset();
                ++this.Field2508;
            }
        }
        if (this.Field2504.isCurrentMode(KillAura.Method754(7593, 2480))) {
            this.setDisplayTag(KillAura.Method754(7611, -24294));
            if (KillAura.mc.thePlayer.getHealth() <= 0.0f && Field2528.Method1799() > 0) {
                ++this.Field2508;
            }
        }
        if (this.Field2504.isCurrentMode(KillAura.Method754(7563, 14278))) {
            this.setDisplayTag(KillAura.Method754(7563, 14278));
            if (KillAura.mc.thePlayer.getHealth() <= 0.0f && Field2528.Method1799() > 0) {
                ++this.Field2508;
            }
        }
        if (!Field2528.isEmpty() && this.Field2508 >= Field2528.Method1799()) {
            this.Field2508 = 0;
        }
        this.Method815();
        this.Method946();
        this.Method814();
        if (target != null) {
            this.Method970();
        } else {
            Field2528.clear();
        }
    }

    public float[] Method954(EntityLivingBase a2) {
        double a3 = Minecraft.getMinecraft().thePlayer.posX;
        double a4 = Minecraft.getMinecraft().thePlayer.posY + (double)Minecraft.getMinecraft().thePlayer.getEyeHeight();
        double a5 = Minecraft.getMinecraft().thePlayer.posZ;
        double a6 = KillAura.target.posX;
        double a7 = KillAura.target.posY + (double)(KillAura.target.height / 2.0f);
        double a8 = KillAura.target.posZ;
        double a9 = a3 - a6;
        double a10 = a4 - a7;
        double a11 = a5 - a8;
        double a12 = Math.sqrt((double)(Math.pow((double)a9, (double)2.0) + Math.pow((double)a11, (double)2.0)));
        float a13 = (float)(Math.toDegrees((double)Math.atan2((double)a11, (double)a9)) + 90.0);
        float a14 = (float)Math.toDegrees((double)Math.atan2((double)a12, (double)a10));
        return new float[]{(float)((double)a13 + (new Random().nextBoolean() ? Math.random() : -Math.random())), (float)((double)(90.0f - a14) + (new Random().nextBoolean() ? Math.random() : -Math.random()))};
    }

    @EventTarget
    public void Method955(EventMotion a2) {
        block23: {
            block26: {
                block25: {
                    block24: {
                        a[] aArray = b.trash();
                        if (this.Field2515.isCurrentMode(KillAura.Method754(7585, 16095))) {
                            Field2493 = this.Method805();
                        }
                        Field2493 = false;
                        if (a2.isPost()) {
                            if (target != null) {
                                this.Method970();
                            }
                            if (Field2493 && KillAura.mc.gameSettings.keyBindUseItem.isKeyDown()) {
                                if (this.Field2500 != 520) {
                                    Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(KillAura.mc.thePlayer.inventory.getCurrentItem()));
                                }
                                if (this.Field2498.isCurrentMode(KillAura.Method754(7610, -20270))) {
                                    Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(KillAura.mc.thePlayer.inventory.getCurrentItem()));
                                }
                                this.Field2500 = 520;
                                ReflectionUtils.setItemInUseCount(520);
                                if (this.Field2498.isCurrentMode(KillAura.Method754(7553, 5307))) {
                                    if (KillAura.mc.thePlayer.swingProgressInt == 1) {
                                        Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
                                    }
                                    if (KillAura.mc.thePlayer.swingProgressInt == 2) {
                                        Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(KillAura.mc.thePlayer.getHeldItem()));
                                    }
                                }
                            }
                            if (target != null && this.Method805() && this.Field2515.isCurrentMode(KillAura.Method754(7573, -2197))) {
                                if (ReflectionUtils.getItemInUseCount() != 520.0f) {
                                    Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(KillAura.mc.thePlayer.inventory.getCurrentItem()));
                                }
                                if (this.Field2498.isCurrentMode(KillAura.Method754(7572, -7961))) {
                                    Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(KillAura.mc.thePlayer.inventory.getCurrentItem()));
                                }
                                ReflectionUtils.setItemInUseCount(520);
                                if (this.Field2498.isCurrentMode(KillAura.Method754(7558, -1609))) {
                                    if (KillAura.mc.thePlayer.swingProgressInt == 1) {
                                        Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
                                    }
                                    if (KillAura.mc.thePlayer.swingProgressInt == 2) {
                                        Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(KillAura.mc.thePlayer.getHeldItem()));
                                    }
                                }
                            }
                        }
                        if (!a2.isPre()) break block23;
                        if (!Field2493 || !KillAura.mc.gameSettings.keyBindUseItem.isKeyDown()) break block24;
                        if (!this.Field2498.isCurrentMode(KillAura.Method754(7572, -7961))) break block25;
                        Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
                    }
                    if (this.Field2500 == 520) {
                        this.Field2500 = 0;
                        ReflectionUtils.setItemInUseCount(0);
                        Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
                    }
                }
                if (target == null || !this.Method805() || !this.Field2515.isCurrentMode(KillAura.Method754(7659, -29435))) break block26;
                if (!this.Field2498.isCurrentMode(KillAura.Method754(7572, -7961))) break block23;
                Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
            }
            if (ReflectionUtils.getItemInUseCount() == 520.0f) {
                ReflectionUtils.setItemInUseCount(0);
                Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
            }
        }
    }

    public float Method956(Entity a2) {
        float a3 = (float)(KillAura.mc.thePlayer.posX - a2.posX);
        float a4 = (float)(KillAura.mc.thePlayer.posY - a2.posY);
        float a5 = (float)(KillAura.mc.thePlayer.posZ - a2.posZ);
        return MathHelper.sqrt_float((float)(a3 * a3 + a5 * a5));
    }

    private void Method957(EntityLivingBase a2) {
        this.Method952(a2);
    }

    @EventTarget
    public void Method712(EventMotion a2) {
        if (this.Field2503.getBooleanValue().booleanValue() && !Mouse.isButtonDown((int)0) && !KillAura.mc.gameSettings.keyBindAttack.isKeyDown()) {
            target = null;
            return;
        }
        if (a2.isPost()) {
            return;
        }
        if (this.Field2504.isCurrentMode(KillAura.Method754(7554, -11340))) {
            this.setDisplayTag(KillAura.Method754(7554, -11340));
            if (this.Field2522.isDelayComplete(this.Field2506.getFloatValue().floatValue())) {
                this.Field2522.reset();
                ++this.Field2508;
            }
        }
        if (this.Field2504.isCurrentMode(KillAura.Method754(7611, -24294))) {
            this.setDisplayTag(KillAura.Method754(7611, -24294));
            if (KillAura.mc.thePlayer.getHealth() <= 0.0f && Field2528.Method1799() > 0) {
                ++this.Field2508;
            }
        }
        if (this.Field2504.isCurrentMode(KillAura.Method754(7563, 14278))) {
            this.setDisplayTag(KillAura.Method754(7563, 14278));
            if (KillAura.mc.thePlayer.getHealth() <= 0.0f && Field2528.Method1799() > 0) {
                ++this.Field2508;
            }
        }
        if (!Field2528.isEmpty() && this.Field2508 >= Field2528.Method1799()) {
            this.Field2508 = 0;
        }
        this.Method815();
        this.Method946();
        this.Method814();
        if (target != null) {
            float[] a3 = this.Method954(target);
            if (KillAura.mc.thePlayer.getDistanceToEntity((Entity)target) <= this.Field2505.getFloatValue().floatValue() + KillAura.target.width / 2.0f) {
                float[] a4 = this.Method954(target);
                float[] a5 = new float[]{this.Field2496[0], this.Field2496[1]};
                this.Field2496 = this.Method968(a4, a5);
                if (this.Field2518.getBooleanValue().booleanValue()) {
                    a2.setYaw(this.Field2496[0]);
                }
                if (this.Field2516.getBooleanValue().booleanValue()) {
                    a2.setPitch(this.Field2496[1]);
                }
            }
        } else {
            this.Field2496[0] = KillAura.mc.thePlayer.rotationYaw;
            this.Field2496[1] = KillAura.mc.thePlayer.rotationPitch;
            Field2528.clear();
        }
    }

    private Entity Method958(EntityLivingBase a2) {
        if (a2 instanceof EntityDragon) {
            EntityDragon a3 = (EntityDragon)a2;
            CopyOnWriteArrayList a4 = new CopyOnWriteArrayList();
            for (EntityDragonPart a5 : a3.dragonPartArray) {
                a4.Method2530((Object)a5);
            }
            a4.sort(Comparator.comparingDouble(KillAura::Method962));
            return (Entity)a4.get(0);
        }
        return a2;
    }

    private void Method959(EntityLivingBase a2) {
        this.Method961(a2, Field2528.Method1799());
    }

    public static void Method258() {
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glDepthMask((boolean)true);
        GL11.glCullFace((int)1029);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
    }

    private boolean Method960(EntityLivingBase a2) {
        return a2.hurtTime <= this.Field2495.getFloatValue().intValue() && a2 != target;
    }

    @Class628
    public native void Method961(EntityLivingBase var1, int var2);

    private static double Method962(EntityDragonPart a2) {
        return KillAura.mc.thePlayer.getDistanceToEntity((Entity)a2);
    }

    public void Method963(EntityLivingBase a2) {
        double a3 = ReflectionUtils.getRenderPartialTicks();
        double a4 = a2.lastTickPosX + (a2.posX - a2.lastTickPosX) * a3 - ReflectionUtils.getRenderPosX();
        double a5 = a2.lastTickPosY + (a2.posY - a2.lastTickPosY) * a3 - ReflectionUtils.getRenderPosY();
        double a6 = a2.lastTickPosZ + (a2.posZ - a2.lastTickPosZ) * a3 - ReflectionUtils.getRenderPosZ();
        Color a7 = new Color(0, 153, 255, 80);
        if (a2.hurtTime > 0) {
            a7 = new Color(255, 0, 0, 80);
        }
        RenderUtils.Method1122(a4, a5, a6, (double)a2.width / 1.2, (double)a2.height + 0.2, (float)a7.getRed() / 255.0f, (float)a7.getGreen() / 255.0f, (float)a7.getBlue() / 255.0f, (float)a7.getAlpha() / 255.0f);
    }

    public boolean Method817(EntityLivingBase a2, float a3) {
        a3 = (float)((double)a3 * 0.5);
        double a4 = (((double)KillAura.mc.thePlayer.rotationYaw - this.Method818(a2)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
        return a4 > 0.0 && a4 < (double)a3 || (double)(-a3) < a4 && a4 < 0.0;
    }

    public void Method964(EntityLivingBase a2, double a3, double a4, double a5) {
        Cylinder a6 = new Cylinder();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)false);
        GL11.glHint((int)3154, (int)4354);
        GlStateManager.disableLighting();
        GL11.glTranslated((double)a3, (double)a4, (double)a5);
        GL11.glRotatef((float)(-a2.width), (float)0.0f, (float)1.0f, (float)0.0f);
        RenderUtils.Method1125(new Color(0, 153, 255, 150));
        KillAura.Method945(0.1f);
        GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        a6.setDrawStyle(100011);
        a6.draw(0.0f, 0.2f, 0.5f, 3, 300);
        KillAura.Method258();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)false);
        GL11.glHint((int)3154, (int)4354);
        GlStateManager.disableLighting();
        GL11.glTranslated((double)a3, (double)(a4 + 0.5), (double)a5);
        GL11.glRotatef((float)(-a2.width), (float)0.0f, (float)1.0f, (float)0.0f);
        RenderUtils.Method1125(new Color(0, 153, 255, 150));
        KillAura.Method945(0.1f);
        GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        a6.setDrawStyle(100011);
        a6.draw(0.0f, 0.2f, 0.0f, 3, 300);
        KillAura.Method258();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private boolean Method965(EntityLivingBase a2) {
        if (ServerPacketHandler.currentServer.equals((Object)Servers.SB)) {
            return this.Method967(a2);
        }
        return false;
    }

    private static double Method966(EntityLivingBase a2) {
        return KillAura.mc.thePlayer.getDistanceToEntity((Entity)a2);
    }

    private boolean Method967(EntityLivingBase a2) {
        return false;
    }

    private float[] Method968(float[] a2, float[] a3) {
        float[] a4 = new float[]{a3[0] - a2[0], a3[1] - a2[1]};
        a4 = MathUtils.parseRotations(a4);
        a4[0] = a3[0] - a4[0] / 100.0f * (this.Field2517.getFloatValue().floatValue() / 2.0f);
        a4[1] = a3[1] - a4[1] / 100.0f * (this.Field2517.getFloatValue().floatValue() / 2.0f);
        return a4;
    }

    static {
        Class614.Method2232(3, KillAura.class);
        KillAura.Method975();
    }

    public KillAura() {
        super(KillAura.Method754(7602, 10160), KillAura.Method754(7642, 28097), Category.COMBAT);
        a[] aArray = b.trash();
        this.Field2515 = new ModeValue(KillAura.Method754(7562, -17983), KillAura.Method754(7669, 25312), KillAura.Method754(7561, 30117), new String[]{KillAura.Method754(7643, -19851), KillAura.Method754(7659, -29435), KillAura.Method754(7561, 30117)}, KillAura.Method754(7576, 16620));
        this.Field2498 = new ModeValue(KillAura.Method754(7562, -17983), KillAura.Method754(7570, -18011), KillAura.Method754(7675, -8921), new String[]{KillAura.Method754(7580, -22958), KillAura.Method754(7558, -1609), KillAura.Method754(7601, -18491), KillAura.Method754(7552, -8600)}, KillAura.Method754(7678, 18144));
        this.Field2511 = new ModeValue(KillAura.Method754(7562, -17983), KillAura.Method754(7641, -3921), KillAura.Method754(7614, -26901), new String[]{KillAura.Method754(7614, -26901), KillAura.Method754(7568, 20260), KillAura.Method754(7591, 22163), KillAura.Method754(7583, -2524), KillAura.Method754(7605, -8888)}, KillAura.Method754(7596, -24838));
        this.Field2512 = new ModeValue(KillAura.Method754(7562, -17983), KillAura.Method754(7584, -12744), KillAura.Method754(7589, -21790), new String[]{KillAura.Method754(7643, -19851), KillAura.Method754(7555, -13908), KillAura.Method754(7565, 18086), KillAura.Method754(7664, -31068), KillAura.Method754(7589, -21790)}, KillAura.Method754(7650, -15600));
        this.Field2505 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7568, 20260), 4.2, 3.0, 7.0, 0.1, KillAura.Method754(7603, 23094));
        this.Field2525 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7600, 15525), 1.0, 0.1, 2.0, 0.1, KillAura.Method754(7666, 3975));
        this.Field2530 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7594, 31569), 10.0, 1.0, 20.0, 1.0, KillAura.Method754(7579, 22263));
        this.Field2529 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7577, -27631), 10.0, 1.0, 20.0, 1.0, KillAura.Method754(7662, 10579));
        this.Field2507 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7605, -8888), 120.0, 1.0, 360.0, 5.0, "\u00b0", KillAura.Method754(7592, -10776));
        this.Field2499 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7613, 13402), 1.0, 0.0, 10.0, 1.0, KillAura.Method754(7672, -2120));
        this.Field2506 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7670, -24618), 300.0, 0.0, 1000.0, 50.0, KillAura.Method754(7599, 20561));
        this.Field2517 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7559, 4867), 160.0, 10.0, 200.0, 5.0, KillAura.Method754(7671, -31776));
        this.Field2495 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7564, 16841), 10.0, 1.0, 10.0, 1.0, KillAura.Method754(7575, -19674));
        this.Field2513 = new FloatValue(KillAura.Method754(7562, -17983), KillAura.Method754(7657, -8933), 2.0, 1.0, 20.0, 1.0, KillAura.Method754(7654, -6512));
        this.Field2503 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7574, -21945), (Boolean)false, KillAura.Method754(7651, -4337));
        this.Field2519 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7663, 20258), (Boolean)false, KillAura.Method754(7604, -800));
        this.Field2521 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7569, 6233), (Boolean)false, KillAura.Method754(7597, -15212));
        this.Field2518 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7655, -11095), (Boolean)false, KillAura.Method754(7571, -5006));
        this.Field2516 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7653, -17277), (Boolean)false, KillAura.Method754(7668, 8781));
        this.Field2514 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7674, -690), (Boolean)false, KillAura.Method754(7587, -10671));
        this.Field2520 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7607, -30592), (Boolean)true, KillAura.Method754(7560, -18140));
        this.Field2523 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7608, 2971), (Boolean)false, KillAura.Method754(7582, -16856));
        this.Field2502 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7567, -21510), (Boolean)false, KillAura.Method754(7661, 14583));
        this.Field2526 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7677, 5895), (Boolean)true, KillAura.Method754(7556, 3959));
        this.Field2509 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7598, -22667), (Boolean)true, KillAura.Method754(7640, -5213));
        this.Field2531 = new BooleanValue(KillAura.Method754(7562, -17983), KillAura.Method754(7566, -3246), (Boolean)true, KillAura.Method754(7595, -12546));
        this.Field2522 = new TimeHelper();
        this.Field2510 = new TimeHelper();
        this.Field2532 = new Random();
        this.Field2496 = new float[2];
        this.setDescription(KillAura.Method754(7590, 9363));
        a.trash(new String[2]);
    }

    private static int Method969(EntityLivingBase a2, EntityLivingBase a3) {
        float[] a4 = RotationUtils.getRotation2(a2);
        float[] a5 = RotationUtils.getRotation2(a3);
        return (int)(KillAura.mc.thePlayer.rotationYaw - a4[0] - (KillAura.mc.thePlayer.rotationYaw - a5[0]));
    }

    private void Method970() {
        int a2 = this.Field2530.getFloatValue().intValue();
        int a3 = this.Field2529.getFloatValue().intValue();
        int a4 = MathUtils.getRandomDouble(a3, a2);
        if (KillAura.mc.thePlayer.getDistanceToEntity((Entity)target) <= this.Field2505.getFloatValue().floatValue() + KillAura.target.width / 2.0f && this.Field2510.Method211(a4 - 20 + this.Field2532.nextInt(50))) {
            this.Field2510.reset();
            if (KillAura.mc.thePlayer.isBlocking() || KillAura.mc.thePlayer.getHeldItem() == null || KillAura.mc.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
                // empty if block
            }
            if (KillAura.mc.thePlayer.isBlocking() || ReflectionUtils.getItemInUseCount() > 0.0f) {
                // empty if block
            }
            ReflectionUtils2.pollMouseInputEvent(0, true);
            if (this.Field2504.isCurrentMode(KillAura.Method754(7563, 14278))) {
                this.Method951();
            } else {
                this.Method943();
            }
            ReflectionUtils2.pollMouseInputEvent(0, false);
        }
    }

    private static double Method971(EntityLivingBase a2) {
        return KillAura.mc.thePlayer.getDistanceToEntity((Entity)a2);
    }

    public boolean Method713() {
        return ReflectionUtils.getItemInUseCount() >= 520.0f && this.Method805();
    }

    private void Method815() {
        Iterator iterator = Field2528.Method1383();
        while (iterator.Method932()) {
            EntityLivingBase a2 = (EntityLivingBase)iterator.Method933();
            if (this.Method965(a2)) continue;
            Field2528.remove((Object)a2);
        }
    }

    public static int Method972(double a2, double a3) {
        Random a4 = new Random();
        return (int)(a2 + a4.nextDouble() * (a3 - a2));
    }

    private void Method973(EntityLivingBase a2) {
        KillAura.mc.thePlayer.swingItem();
        KillAura.mc.playerController.attackEntity((EntityPlayer)KillAura.mc.thePlayer, this.Method958(a2));
    }

    private double Method812(EntityLivingBase a2) {
        float[] a3 = RotationUtils.getRotation(a2);
        float a4 = (int)a3[0];
        float a5 = KillAura.mc.thePlayer.rotationYaw > a4 ? KillAura.mc.thePlayer.rotationYaw - a4 : a4 - KillAura.mc.thePlayer.rotationYaw;
        return a5;
    }

    @EventTarget
    public void Method802(EventRender3D a2) {
        if (this.Field2512.isCurrentMode(KillAura.Method754(7615, 28317))) {
            if (this.Field2504.isCurrentMode(KillAura.Method754(7563, 14278))) {
                if (Field2528.Method1799() > 0) {
                    Field2528.forEach(this::Method942);
                }
            } else if (target != null) {
                double a3 = ReflectionUtils.getRenderPartialTicks();
                double a4 = KillAura.target.lastTickPosX + (KillAura.target.posX - KillAura.target.lastTickPosX) * a3 - ReflectionUtils.getRenderPosX();
                double a5 = KillAura.target.lastTickPosY + (KillAura.target.posY - KillAura.target.lastTickPosY) * a3 - ReflectionUtils.getRenderPosY();
                double a6 = KillAura.target.lastTickPosZ + (KillAura.target.posZ - KillAura.target.lastTickPosZ) * a3 - ReflectionUtils.getRenderPosZ();
                this.Method964(target, a4, a5 + (double)target.getEyeHeight() + 0.5 + Math.sin((double)((float)(System.currentTimeMillis() % 1000000L) / 333.0f)) / 10.0, a6);
            }
        }
        if (this.Field2512.isCurrentMode(KillAura.Method754(7586, 30651))) {
            if (this.Field2504.isCurrentMode(KillAura.Method754(7563, 14278))) {
                if (Field2528.Method1799() > 0) {
                    Field2528.forEach(this::Method957);
                }
            } else if (target != null) {
                this.Method952(target);
            }
        }
        if (this.Field2512.isCurrentMode(KillAura.Method754(7656, -11258))) {
            if (this.Field2504.isCurrentMode(KillAura.Method754(7563, 14278))) {
                if (Field2528.Method1799() > 0) {
                    Field2528.forEach(this::Method959);
                }
            } else if (target != null) {
                this.Method961(target, 1);
            }
        }
        if (this.Field2512.isCurrentMode(KillAura.Method754(7609, -8870))) {
            if (this.Field2504.isCurrentMode(KillAura.Method754(7563, 14278))) {
                if (Field2528.Method1799() > 0) {
                    Field2528.forEach(this::Method948);
                }
            } else if (target != null) {
                this.Method963(target);
            }
        }
    }

    private static int Method974(EntityLivingBase a2, EntityLivingBase a3) {
        return (int)(a3.getHealth() - a2.getHealth());
    }

    private static native /* synthetic */ void Method975();
}