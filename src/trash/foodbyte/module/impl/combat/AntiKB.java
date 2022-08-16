/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 *  java.util.concurrent.ThreadLocalRandom
 *  net.minecraft.network.play.server.S12PacketEntityVelocity
 *  net.minecraft.network.play.server.S27PacketExplosion
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.EnumChatFormatting
 */
package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.Velocity;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionsHelper;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AntiKB
extends Module {
    public boolean flag;
    public ModeValue mode = new ModeValue("AntiKB", "Legit Mode", "Packet", new String[]{"PlayerTick", "Tick", "Hurt", "AB", "Move", "Packet"}, "\u81ea\u6d4b");
    public FloatValue horizontal = new FloatValue("AntiKB", "Horizontal", 100.0, 0.0, 100.0, 1.0, "XZ\u8f74\u51fb\u9000");
    public FloatValue vertical = new FloatValue("AntiKB", "Vertical", 90.0, 0.0, 100.0, 1.0, "Y\u8f74\u51fb\u9000");
    public FloatValue chance = new FloatValue("AntiKB", "Chance", 100.0, 0.0, 100.0, 1.0, "\u89e6\u53d1\u51e0\u7387");
    public FloatValue explodeXZ = new FloatValue("AntiKB", "Explode XZ", 0.0, 0.0, 100.0, 1.0, "\u589e\u52a0\u7206\u70b8XZ\u8f74\u51fb\u9000");
    public FloatValue explodeY;
    public BooleanValue waterCheck;
    public BooleanValue fireCheck;
    public BooleanValue poisonCheck;
    public BooleanValue guiCheck;
    public BooleanValue fight;

    public AntiKB() {
        super("AntiKB", "Anti KB", Category.COMBAT);
        a[] aArray = b.trash();
        this.explodeY = new FloatValue("AntiKB", "Explode Y", 0.0, 0.0, 100.0, 1.0, "\u589e\u52a0\u7206\u70b8Y\u8f74\u51fb\u9000");
        this.waterCheck = new BooleanValue("AntiKB", "WaterCheck", (Boolean)true, "\u6c34\u68c0\u6d4b");
        this.fireCheck = new BooleanValue("AntiKB", "FireCheck", (Boolean)true, "\u706b\u7130\u68c0\u6d4b");
        this.poisonCheck = new BooleanValue("AntiKB", "PoisonCheck", (Boolean)true, "\u4e2d\u6bd2\u836f\u6c34\u68c0\u6d4b");
        this.guiCheck = new BooleanValue("AntiKB", "GuiCheck", (Boolean)true, "\u754c\u9762\u68c0\u6d4b");
        this.fight = new BooleanValue("AntiKB", "Fight", (Boolean)false, "\u53ea\u6709\u6253\u67b6\u65f6\u624d\u6709\u6548");
        if (a.trash() == null) {
            b.trash(new a[5]);
        }
    }

    @Override
    public String getDescription() {
        return "\u53cd\u51fb\u9000";
    }

    public float getVertical() {
        float a2 = (double)this.vertical.getFloatValue().floatValue() == 100.0 && (double)this.vertical.getFloatValue().floatValue() == 0.0 ? 0.0f : this.randomFloat() / 1000.0f;
        return this.vertical.getFloatValue().floatValue() + a2;
    }

    public float getHorizontal() {
        float a2 = (double)this.horizontal.getFloatValue().floatValue() == 100.0 && (double)this.horizontal.getFloatValue().floatValue() == 0.0 ? 0.0f : this.randomFloat() / 1000.0f;
        return this.horizontal.getFloatValue().floatValue() + a2;
    }

    public float randomFloat() {
        return ThreadLocalRandom.current().nextInt(100);
    }

    public float getChance() {
        return this.chance.getFloatValue().floatValue();
    }

    public boolean isUnderVoid() {
        return AntiKB.mc.thePlayer.posY < 0.0;
    }

    @EventTarget
    public void onUpdate(EventUpdate e) {
        this.setDisplayTag(this.mode.getMode());
    }

    @EventTarget
    public void onEntityTick(EventEntityTick event) {
        if (event.getEntity().equals((Object)AntiKB.mc.thePlayer) && this.mode.isCurrentMode("PlayerTick")) {
            this.processVelocity();
        }
    }

    @EventTarget
    public void onTickUpdate(EventTickUpdate e) {
        if (this.mode.isCurrentMode("Tick")) {
            this.processVelocity();
        }
    }

    @EventTarget
    public void onRender(EventRender3D e) {
        if (this.mode.isCurrentMode("AB")) {
            this.processVelocity();
        }
    }

    @EventTarget
    public void onUpdate2(EventUpdate e) {
        if (this.mode.isCurrentMode("Hurt")) {
            this.processVelocity();
        }
    }

    @EventTarget
    public void onMove(EventMove e) {
        if (e.isLocalPlayer().booleanValue() && this.mode.isCurrentMode("Move")) {
            this.processVelocity();
        }
    }

    @EventTarget
    public void onPacket(EventPacket e) {
        a[] a2 = b.trash();
        if (e.isSend()) {
            return;
        }
        if (((Velocity)ModuleManager.getModule2(Velocity.class)).getState()) {
            return;
        }
        if (this.mode.isCurrentMode("Packet")) {
            S12PacketEntityVelocity a3;
            if (e.getPacket() instanceof S12PacketEntityVelocity) {
                a3 = (S12PacketEntityVelocity)e.getPacket();
                if (a3.getEntityID() == AntiKB.mc.thePlayer.getEntityId()) {
                    int a4;
                    int a5;
                    int a6;
                    double a7 = (double)a3.getMotionX() / 8000.0;
                    double a8 = (double)a3.getMotionY() / 8000.0;
                    double a9 = (double)a3.getMotionZ() / 8000.0;
                    ChatUtils.debug("\u00a76S12 KB " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a7 + " \u00a7fY \u00a7e" + a8 + " \u00a7fZ \u00a7e" + a9);
                    if (this.flag && !AntiKB.mc.thePlayer.isSwingInProgress) {
                        a6 = (int)((double)a3.getMotionX() * (1.0 + (double)this.explodeXZ.getFloatValue().floatValue() / 100.0));
                        a5 = (int)((double)a3.getMotionY() * (1.0 + (double)this.explodeY.getFloatValue().floatValue() / 100.0));
                        a4 = (int)((double)a3.getMotionZ() * (1.0 + (double)this.explodeXZ.getFloatValue().floatValue() / 100.0));
                        ReflectionsHelper.setFinalField(a3, ObfuscatedField.S12MotionX.getObfuscatedName(), a6, false);
                        ReflectionsHelper.setFinalField(a3, ObfuscatedField.S12MotionY.getObfuscatedName(), a5, false);
                        ReflectionsHelper.setFinalField(a3, ObfuscatedField.S12MotionZ.getObfuscatedName(), a4, false);
                    }
                    if ((double)(a6 = new Random().nextInt(100)) > 100.0 - (double)this.chance.getFloatValue().floatValue() && this.canNoKB()) {
                        a5 = (int)((float)a3.getMotionX() * (this.getHorizontal() / 100.0f));
                        a4 = (int)((float)a3.getMotionY() * (this.getVertical() / 100.0f));
                        int a10 = (int)((float)a3.getMotionZ() * (this.getHorizontal() / 100.0f));
                        ReflectionsHelper.setFinalField(a3, ObfuscatedField.S12MotionX.getObfuscatedName(), a5, false);
                        ReflectionsHelper.setFinalField(a3, ObfuscatedField.S12MotionY.getObfuscatedName(), a4, false);
                        ReflectionsHelper.setFinalField(a3, ObfuscatedField.S12MotionZ.getObfuscatedName(), a10, false);
                    }
                }
                this.flag = false;
            }
            if (e.getPacket() instanceof S27PacketExplosion) {
                float a11;
                float a12;
                a3 = (S27PacketExplosion)e.getPacket();
                ChatUtils.debug("\u00a7aS27 KB " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a3.func_149149_c() + " \u00a7fY \u00a7e" + a3.func_149144_d() + " \u00a7fZ \u00a7e" + a3.func_149147_e());
                int a13 = new Random().nextInt(100);
                if ((double)a13 > 100.0 - (double)this.chance.getFloatValue().floatValue() && this.canNoKB()) {
                    a12 = a3.func_149149_c() * (this.getHorizontal() / 100.0f);
                    float a14 = a3.func_149144_d() * (this.getVertical() / 100.0f);
                    a11 = a3.func_149147_e() * (this.getHorizontal() / 100.0f);
                    ReflectionsHelper.setFinalField(a3, ObfuscatedField.S27MotionX.getObfuscatedName(), Float.valueOf((float)a12), false);
                    ReflectionsHelper.setFinalField(a3, ObfuscatedField.S27MotionY.getObfuscatedName(), Float.valueOf((float)a14), false);
                    ReflectionsHelper.setFinalField(a3, ObfuscatedField.S27MotionZ.getObfuscatedName(), Float.valueOf((float)a11), false);
                }
                a12 = a3.func_149149_c() * (1.0f + this.explodeXZ.getFloatValue().floatValue() / 100.0f);
                float a15 = a3.func_149144_d() * (1.0f + this.explodeY.getFloatValue().floatValue() / 100.0f);
                a11 = a3.func_149147_e() * (1.0f + this.explodeXZ.getFloatValue().floatValue() / 100.0f);
                ReflectionsHelper.setFinalField(a3, ObfuscatedField.S27MotionX.getObfuscatedName(), Float.valueOf((float)a12), false);
                ReflectionsHelper.setFinalField(a3, ObfuscatedField.S27MotionY.getObfuscatedName(), Float.valueOf((float)a15), false);
                ReflectionsHelper.setFinalField(a3, ObfuscatedField.S27MotionZ.getObfuscatedName(), Float.valueOf((float)a11), false);
                if (a3.func_149149_c() != 0.0f && a3.func_149144_d() != 0.0f && a3.func_149147_e() != 0.0f) {
                    this.flag = true;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setVelocity(double x, double y, double z) {
        void a2;
        void a3;
        Random random = new Random();
        int n = a3.nextInt(100);
        a[] a4 = b.trash();
        if ((double)a2 > 100.0 - (double)this.chance.getFloatValue().floatValue() && this.canNoKB()) {
            double a5 = x * ((double)this.getHorizontal() / 100.0);
            double a6 = y * ((double)this.getVertical() / 100.0);
            double a7 = z * ((double)this.getHorizontal() / 100.0);
            AntiKB.mc.thePlayer.setVelocity(a5, a6, a7);
        }
        AntiKB.mc.thePlayer.setVelocity(x, y, z);
    }

    public boolean canNoKB() {
        if (ModuleManager.getModule(Velocity.class).getState()) {
            return false;
        }
        if (this.waterCheck.getBooleanValue().booleanValue() && (AntiKB.mc.thePlayer.isInWater() || PlayerUtils.iJustWannaReturnAFalse())) {
            return false;
        }
        if (this.guiCheck.getBooleanValue().booleanValue() && AntiKB.mc.currentScreen != null) {
            return false;
        }
        if (this.fireCheck.getBooleanValue().booleanValue() && AntiKB.mc.thePlayer.canRenderOnFire() && !AntiKB.mc.thePlayer.isPotionActive(Potion.fireResistance)) {
            return false;
        }
        if (this.poisonCheck.getBooleanValue().booleanValue() && AntiKB.mc.thePlayer.isPotionActive(Potion.poison)) {
            return false;
        }
        if (this.fight.getBooleanValue().booleanValue() && !AntiKB.mc.thePlayer.isSwingInProgress) {
            return false;
        }
        return AntiKB.mc.thePlayer != null && AntiKB.mc.theWorld != null && !this.isUnderVoid();
    }

    public void processVelocity() {
        Random a2 = new Random();
        int a3 = a2.nextInt(100);
        if (AntiKB.mc.thePlayer.hurtTime == AntiKB.mc.thePlayer.maxHurtTime && AntiKB.mc.thePlayer.maxHurtTime > 0 && (double)a3 > 100.0 - (double)this.chance.getFloatValue().floatValue() && this.canNoKB()) {
            AntiKB.mc.thePlayer.motionX *= (double)this.getHorizontal() / 100.0;
            if (this.getVertical() != 100.0f) {
                AntiKB.mc.thePlayer.motionY *= (double)this.getVertical() / 100.0;
            }
            AntiKB.mc.thePlayer.motionZ *= (double)this.getHorizontal() / 100.0;
        }
    }
}