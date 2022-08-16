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

import eventapi.EventTarget;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionsHelper;
import trash.foodbyte.utils.ChatUtils;
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
        return (float)this.Field2482.getFloatValue().doubleValue();
    }

    public float Method798() {
        return (float)this.Field2481.getFloatValue().doubleValue();
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        a[] a3 = b.trash();
        if (this.Field2480.isCurrentMode("Simple")) {
            S12PacketEntityVelocity a4;
            this.setDisplayTag("Simple");
            if (a2.packet instanceof S12PacketEntityVelocity && Velocity.mc.theWorld.getEntityByID((a4 = (S12PacketEntityVelocity)a2.packet).getEntityID()) == Velocity.mc.thePlayer) {
                ChatUtils.debug("\u00a76S12 Vertical " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a4.getMotionX() + " \u00a7fY \u00a7e" + a4.getMotionY() + " \u00a7fZ \u00a7e" + a4.getMotionZ());
                if (this.Method798() == 0.0f && this.Method276() == 0.0f) {
                    a2.setCancelled(true);
                }
                int a5 = (int)((float)a4.getMotionX() * (this.Method798() / 100.0f));
                int a6 = (int)((float)a4.getMotionY() * (this.Method276() / 100.0f));
                int a7 = (int)((float)a4.getMotionZ() * (this.Method798() / 100.0f));
                ReflectionsHelper.setFinalField(a4, ObfuscatedField.S12MotionX.getObfuscatedName(), a5, false);
                ReflectionsHelper.setFinalField(a4, ObfuscatedField.S12MotionY.getObfuscatedName(), a6, false);
                ReflectionsHelper.setFinalField(a4, ObfuscatedField.S12MotionZ.getObfuscatedName(), a7, false);
            }
            if (!(a2.packet instanceof S27PacketExplosion)) {
                return;
            }
            S27PacketExplosion a8 = (S27PacketExplosion)a2.packet;
            ChatUtils.debug("\u00a7aS27 Vertical " + EnumChatFormatting.GRAY + ": \u00a7fX \u00a7e" + a8.func_149149_c() + " \u00a7fY \u00a7e" + a8.func_149144_d() + " \u00a7fZ \u00a7e" + a8.func_149147_e());
            if (this.Method798() == 0.0f && this.Method276() == 0.0f) {
                a2.setCancelled(true);
            }
            float a9 = a8.func_149149_c() * (this.Method798() / 100.0f);
            float a10 = a8.func_149144_d() * (this.Method276() / 100.0f);
            float a11 = a8.func_149147_e() * (this.Method798() / 100.0f);
            ReflectionsHelper.setFinalField(a8, ObfuscatedField.S27MotionX.getObfuscatedName(), Float.valueOf((float)a9), false);
            ReflectionsHelper.setFinalField(a8, ObfuscatedField.S27MotionY.getObfuscatedName(), Float.valueOf((float)a10), false);
            ReflectionsHelper.setFinalField(a8, ObfuscatedField.S27MotionZ.getObfuscatedName(), Float.valueOf((float)a11), false);
        }
    }
}