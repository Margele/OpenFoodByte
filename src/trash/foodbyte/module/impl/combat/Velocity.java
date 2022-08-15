/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.network.play.server.S12PacketEntityVelocity
 *  net.minecraft.network.play.server.S27PacketExplosion
 *  net.minecraft.util.EnumChatFormatting
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class345;
import awsl.Class46;
import awsl.Class91;
import eventapi.EventTarget;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.util.EnumChatFormatting;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Velocity
extends Module {
    public ModeValue Field2480 = new ModeValue("Velocity", "Mode", "Simple", new String[]{"Simple"}, "\u7b80\u5355\u7684");
    public FloatValue Field2481 = new FloatValue("Velocity", "H", 0.0, 0.0, 100.0, 1.0, "XZ\u8f74\u51fb\u9000(\u5982\u679c\u60f3\u8981\u534a\u51fb\u9000\u5efa\u8bae\u5f00AntiKB)");
    public FloatValue Field2482 = new FloatValue("Velocity", "V", 0.0, 0.0, 100.0, 1.0, "Y\u8f74\u51fb\u9000(\u5982\u679c\u60f3\u8981\u534a\u51fb\u9000\u5efa\u8bae\u5f00AntiKB)");

    public Velocity() {
        super("Velocity", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u66b4\u529b\u65e0\u51fb\u9000(\u79fb\u52a8\u4e0d\u53d7\u653b\u51fb\u5f71\u54cd)";
    }

    public float Method276() {
        return (float)this.Field2482.Method2744().doubleValue();
    }

    public float Method798() {
        return (float)this.Field2481.Method2744().doubleValue();
    }

    @EventTarget
    public void Method273(EventPacket a) {
        Class91[] a2 = Class46.Method3239();
        if (this.Field2480.isCurrentMode("Simple")) {
            S12PacketEntityVelocity a3;
            this.setDisplayTag("Simple");
            if (a.packet instanceof S12PacketEntityVelocity && Velocity.mc.theWorld.getEntityByID((a3 = (S12PacketEntityVelocity)a.packet).getEntityID()) == Velocity.mc.thePlayer) {
                ChatUtils.debug("\u00a76S12 Vertical " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a3.getMotionX() + " \u00a7fY \u00a7e" + a3.getMotionY() + " \u00a7fZ \u00a7e" + a3.getMotionZ());
                if (this.Method798() == 0.0f && this.Method276() == 0.0f) {
                    a.setCancelled(true);
                }
                int a4 = (int)((float)a3.getMotionX() * (this.Method798() / 100.0f));
                int a5 = (int)((float)a3.getMotionY() * (this.Method276() / 100.0f));
                int a6 = (int)((float)a3.getMotionZ() * (this.Method798() / 100.0f));
                Class345.Method337(a3, ObfuscatedClasses.S12MotionX.getObfuscatedName(), a4, false);
                Class345.Method337(a3, ObfuscatedClasses.S12MotionY.getObfuscatedName(), a5, false);
                Class345.Method337(a3, ObfuscatedClasses.S12MotionZ.getObfuscatedName(), a6, false);
            }
            if (!(a.packet instanceof S27PacketExplosion)) {
                return;
            }
            S27PacketExplosion a7 = (S27PacketExplosion)a.packet;
            ChatUtils.debug("\u00a7aS27 Vertical " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a7.func_149149_c() + " \u00a7fY \u00a7e" + a7.func_149144_d() + " \u00a7fZ \u00a7e" + a7.func_149147_e());
            if (this.Method798() == 0.0f && this.Method276() == 0.0f) {
                a.setCancelled(true);
            }
            float a8 = a7.func_149149_c() * (this.Method798() / 100.0f);
            float a9 = a7.func_149144_d() * (this.Method276() / 100.0f);
            float a10 = a7.func_149147_e() * (this.Method798() / 100.0f);
            Class345.Method337(a7, ObfuscatedClasses.S27MotionX.getObfuscatedName(), Float.valueOf((float)a8), false);
            Class345.Method337(a7, ObfuscatedClasses.S27MotionY.getObfuscatedName(), Float.valueOf((float)a9), false);
            Class345.Method337(a7, ObfuscatedClasses.S27MotionZ.getObfuscatedName(), Float.valueOf((float)a10), false);
        }
    }
}