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

import awsl.Class345;
import awsl.Class46;
import awsl.Class630;
import awsl.Class634;
import awsl.Class635;
import awsl.Class654;
import awsl.Class749;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.Velocity;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AntiKB
extends Module {
    public boolean Field2565;
    public ModeValue Field2566 = new ModeValue("AntiKB", "Legit Mode", "Packet", new String[]{"PlayerTick", "Tick", "Hurt", "AB", "Move", "Packet"}, "\u81ea\u6d4b");
    public FloatValue Field2567 = new FloatValue("AntiKB", "Horizontal", 100.0, 0.0, 100.0, 1.0, "XZ\u8f74\u51fb\u9000");
    public FloatValue Field2568 = new FloatValue("AntiKB", "Vertical", 90.0, 0.0, 100.0, 1.0, "Y\u8f74\u51fb\u9000");
    public FloatValue Field2569 = new FloatValue("AntiKB", "Chance", 100.0, 0.0, 100.0, 1.0, "\u89e6\u53d1\u51e0\u7387");
    public FloatValue Field2570 = new FloatValue("AntiKB", "Explode XZ", 0.0, 0.0, 100.0, 1.0, "\u589e\u52a0\u7206\u70b8XZ\u8f74\u51fb\u9000");
    public FloatValue Field2571;
    public BooleanValue Field2572;
    public BooleanValue Field2573;
    public BooleanValue Field2574;
    public BooleanValue Field2575;
    public BooleanValue Field2576;

    public AntiKB() {
        super("AntiKB", "Anti KB", Category.COMBAT);
        Class91[] class91Array = Class46.Method3239();
        this.Field2571 = new FloatValue("AntiKB", "Explode Y", 0.0, 0.0, 100.0, 1.0, "\u589e\u52a0\u7206\u70b8Y\u8f74\u51fb\u9000");
        this.Field2572 = new BooleanValue("AntiKB", "WaterCheck", (Boolean)true, "\u6c34\u68c0\u6d4b");
        this.Field2573 = new BooleanValue("AntiKB", "FireCheck", (Boolean)true, "\u706b\u7130\u68c0\u6d4b");
        this.Field2574 = new BooleanValue("AntiKB", "PoisonCheck", (Boolean)true, "\u4e2d\u6bd2\u836f\u6c34\u68c0\u6d4b");
        this.Field2575 = new BooleanValue("AntiKB", "GuiCheck", (Boolean)true, "\u754c\u9762\u68c0\u6d4b");
        this.Field2576 = new BooleanValue("AntiKB", "Fight", (Boolean)false, "\u53ea\u6709\u6253\u67b6\u65f6\u624d\u6709\u6548");
        if (Class91.Method3648() == null) {
            Class46.Method3238(new Class91[5]);
        }
    }

    @Override
    public String getDescription() {
        return "\u53cd\u51fb\u9000";
    }

    public float Method276() {
        float a = (double)this.Field2568.Method2744().floatValue() == 100.0 && (double)this.Field2568.Method2744().floatValue() == 0.0 ? 0.0f : this.Method799() / 1000.0f;
        return this.Field2568.Method2744().floatValue() + a;
    }

    public float Method798() {
        float a = (double)this.Field2567.Method2744().floatValue() == 100.0 && (double)this.Field2567.Method2744().floatValue() == 0.0 ? 0.0f : this.Method799() / 1000.0f;
        return this.Field2567.Method2744().floatValue() + a;
    }

    public float Method799() {
        return ThreadLocalRandom.current().nextInt(100);
    }

    public float Method800() {
        return this.Field2569.Method2744().floatValue();
    }

    public boolean Method713() {
        return AntiKB.mc.thePlayer.posY < 0.0;
    }

    @EventTarget
    public void Method232(Class634 a) {
        this.setDisplayTag(this.Field2566.getMode());
    }

    @EventTarget
    public void Method747(Class635 a) {
        if (a.Method3587().equals((Object)AntiKB.mc.thePlayer) && this.Field2566.isCurrentMode("PlayerTick")) {
            this.Method258();
        }
    }

    @EventTarget
    public void Method801(Class654 a) {
        if (this.Field2566.isCurrentMode("Tick")) {
            this.Method258();
        }
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        if (this.Field2566.isCurrentMode("AB")) {
            this.Method258();
        }
    }

    @EventTarget
    public void Method803(Class634 a) {
        if (this.Field2566.isCurrentMode("Hurt")) {
            this.Method258();
        }
    }

    @EventTarget
    public void Method274(Class630 a) {
        if (a.Method3502().booleanValue() && this.Field2566.isCurrentMode("Move")) {
            this.Method258();
        }
    }

    @EventTarget
    public void Method273(EventPacket a) {
        Class91[] a2 = Class46.Method3239();
        if (a.isSend()) {
            return;
        }
        if (((Velocity)ModuleManager.getModule2(Velocity.class)).getState()) {
            return;
        }
        if (this.Field2566.isCurrentMode("Packet")) {
            S12PacketEntityVelocity a3;
            if (a.getPacket() instanceof S12PacketEntityVelocity) {
                a3 = (S12PacketEntityVelocity)a.getPacket();
                if (a3.getEntityID() == AntiKB.mc.thePlayer.getEntityId()) {
                    int a4;
                    int a5;
                    int a6;
                    double a7 = (double)a3.getMotionX() / 8000.0;
                    double a8 = (double)a3.getMotionY() / 8000.0;
                    double a9 = (double)a3.getMotionZ() / 8000.0;
                    ChatUtils.debug("\u00a76S12 KB " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a7 + " \u00a7fY \u00a7e" + a8 + " \u00a7fZ \u00a7e" + a9);
                    if (this.Field2565 && !AntiKB.mc.thePlayer.isSwingInProgress) {
                        a6 = (int)((double)a3.getMotionX() * (1.0 + (double)this.Field2570.Method2744().floatValue() / 100.0));
                        a5 = (int)((double)a3.getMotionY() * (1.0 + (double)this.Field2571.Method2744().floatValue() / 100.0));
                        a4 = (int)((double)a3.getMotionZ() * (1.0 + (double)this.Field2570.Method2744().floatValue() / 100.0));
                        Class345.Method337(a3, ObfuscatedClasses.S12MotionX.getObfuscatedName(), a6, false);
                        Class345.Method337(a3, ObfuscatedClasses.S12MotionY.getObfuscatedName(), a5, false);
                        Class345.Method337(a3, ObfuscatedClasses.S12MotionZ.getObfuscatedName(), a4, false);
                    }
                    if ((double)(a6 = new Random().nextInt(100)) > 100.0 - (double)this.Field2569.Method2744().floatValue() && this.Method805()) {
                        a5 = (int)((float)a3.getMotionX() * (this.Method798() / 100.0f));
                        a4 = (int)((float)a3.getMotionY() * (this.Method276() / 100.0f));
                        int a10 = (int)((float)a3.getMotionZ() * (this.Method798() / 100.0f));
                        Class345.Method337(a3, ObfuscatedClasses.S12MotionX.getObfuscatedName(), a5, false);
                        Class345.Method337(a3, ObfuscatedClasses.S12MotionY.getObfuscatedName(), a4, false);
                        Class345.Method337(a3, ObfuscatedClasses.S12MotionZ.getObfuscatedName(), a10, false);
                    }
                }
                this.Field2565 = false;
            }
            if (a.getPacket() instanceof S27PacketExplosion) {
                float a11;
                float a12;
                a3 = (S27PacketExplosion)a.getPacket();
                ChatUtils.debug("\u00a7aS27 KB " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a3.func_149149_c() + " \u00a7fY \u00a7e" + a3.func_149144_d() + " \u00a7fZ \u00a7e" + a3.func_149147_e());
                int a13 = new Random().nextInt(100);
                if ((double)a13 > 100.0 - (double)this.Field2569.Method2744().floatValue() && this.Method805()) {
                    a12 = a3.func_149149_c() * (this.Method798() / 100.0f);
                    float a14 = a3.func_149144_d() * (this.Method276() / 100.0f);
                    a11 = a3.func_149147_e() * (this.Method798() / 100.0f);
                    Class345.Method337(a3, ObfuscatedClasses.S27MotionX.getObfuscatedName(), Float.valueOf((float)a12), false);
                    Class345.Method337(a3, ObfuscatedClasses.S27MotionY.getObfuscatedName(), Float.valueOf((float)a14), false);
                    Class345.Method337(a3, ObfuscatedClasses.S27MotionZ.getObfuscatedName(), Float.valueOf((float)a11), false);
                }
                a12 = a3.func_149149_c() * (1.0f + this.Field2570.Method2744().floatValue() / 100.0f);
                float a15 = a3.func_149144_d() * (1.0f + this.Field2571.Method2744().floatValue() / 100.0f);
                a11 = a3.func_149147_e() * (1.0f + this.Field2570.Method2744().floatValue() / 100.0f);
                Class345.Method337(a3, ObfuscatedClasses.S27MotionX.getObfuscatedName(), Float.valueOf((float)a12), false);
                Class345.Method337(a3, ObfuscatedClasses.S27MotionY.getObfuscatedName(), Float.valueOf((float)a15), false);
                Class345.Method337(a3, ObfuscatedClasses.S27MotionZ.getObfuscatedName(), Float.valueOf((float)a11), false);
                if (a3.func_149149_c() != 0.0f && a3.func_149144_d() != 0.0f && a3.func_149147_e() != 0.0f) {
                    this.Field2565 = true;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method804(double a, double a2, double a3) {
        void a4;
        void a5;
        Random random = new Random();
        int n = a5.nextInt(100);
        Class91[] a6 = Class46.Method3239();
        if ((double)a4 > 100.0 - (double)this.Field2569.Method2744().floatValue() && this.Method805()) {
            double a7 = a * ((double)this.Method798() / 100.0);
            double a8 = a2 * ((double)this.Method276() / 100.0);
            double a9 = a3 * ((double)this.Method798() / 100.0);
            AntiKB.mc.thePlayer.setVelocity(a7, a8, a9);
        }
        AntiKB.mc.thePlayer.setVelocity(a, a2, a3);
    }

    public boolean Method805() {
        if (ModuleManager.getModule(Velocity.class).getState()) {
            return false;
        }
        if (this.Field2572.Method2509().booleanValue() && (AntiKB.mc.thePlayer.isInWater() || Class749.Method1602())) {
            return false;
        }
        if (this.Field2575.Method2509().booleanValue() && AntiKB.mc.currentScreen != null) {
            return false;
        }
        if (this.Field2573.Method2509().booleanValue() && AntiKB.mc.thePlayer.canRenderOnFire() && !AntiKB.mc.thePlayer.isPotionActive(Potion.fireResistance)) {
            return false;
        }
        if (this.Field2574.Method2509().booleanValue() && AntiKB.mc.thePlayer.isPotionActive(Potion.poison)) {
            return false;
        }
        if (this.Field2576.Method2509().booleanValue() && !AntiKB.mc.thePlayer.isSwingInProgress) {
            return false;
        }
        return AntiKB.mc.thePlayer != null && AntiKB.mc.theWorld != null && !this.Method713();
    }

    public void Method258() {
        Random a = new Random();
        int a2 = a.nextInt(100);
        if (AntiKB.mc.thePlayer.hurtTime == AntiKB.mc.thePlayer.maxHurtTime && AntiKB.mc.thePlayer.maxHurtTime > 0 && (double)a2 > 100.0 - (double)this.Field2569.Method2744().floatValue() && this.Method805()) {
            AntiKB.mc.thePlayer.motionX *= (double)this.Method798() / 100.0;
            if (this.Method276() != 100.0f) {
                AntiKB.mc.thePlayer.motionY *= (double)this.Method276() / 100.0;
            }
            AntiKB.mc.thePlayer.motionZ *= (double)this.Method798() / 100.0;
        }
    }
}