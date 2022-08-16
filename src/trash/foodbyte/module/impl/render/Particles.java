/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.network.play.client.C02PacketUseEntity
 *  net.minecraft.network.play.client.C02PacketUseEntity$Action
 *  net.minecraft.world.World
 */
package trash.foodbyte.module.impl.render;

import awsl.Class212;
import awsl.Class216;
import awsl.Class280;
import awsl.Class285;
import awsl.Class492;
import awsl.Class694;
import eventapi.EventTarget;
import java.util.List;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.world.World;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Particles
extends Module {
    public BooleanValue Field2204 = new BooleanValue("Particles", "Physics", (Boolean)false, "\u81ea\u5b9a\u4e49\u5f00\u542f\u540e\u89d2\u5ea6");
    public FloatValue Field2205 = new FloatValue("Particles", "Amount", 10.0, 1.0, 20.0, 1.0, "\u89d2\u5ea6");
    private List Field2206 = new Class694(100);
    private Class280 Field2207 = new Class280();
    private EntityLivingBase Field2208;

    public Particles() {
        super("Particles", "Particles", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u5f53\u4f60\u653b\u51fb\u67d0\u4eba\u65f6\u6e32\u67d3\u7c92\u5b50";
    }

    @EventTarget
    public void Method273(EventPacket a) {
        C02PacketUseEntity a2;
        if (a.isSend() && a.getPacket() instanceof C02PacketUseEntity && (a2 = (C02PacketUseEntity)a.getPacket()).getAction() == C02PacketUseEntity.Action.ATTACK) {
            this.Field2208 = (EntityLivingBase)a2.getEntityFromWorld((World)Particles.mc.theWorld);
        }
    }

    @EventTarget
    public void Method755(EventTick a) {
        String a2 = Class492.Method2239();
        if (this.Field2208 != null && this.Field2208.hurtTime >= 9 && Particles.mc.thePlayer.getDistance(this.Field2208.posX, this.Field2208.posY, this.Field2208.posZ) < 10.0) {
            int a3 = 0;
            if ((float)a3 < this.Field2205.getFloatValue().floatValue()) {
                this.Field2206.Method2530((Object)new Class285(new Class216(this.Field2208.posX + (Math.random() - 0.5) * 0.5, this.Field2208.posY + Math.random() * 1.0 + 0.5, this.Field2208.posZ + (Math.random() - 0.5) * 0.5)));
                ++a3;
            }
            this.Field2208 = null;
        }
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        String a2 = Class492.Method2239();
        if (this.Field2206.isEmpty()) {
            return;
        }
        int a3 = 0;
        int a4 = 3000 / mc.getDebugFPS();
        if (a3 <= a4) {
            if (this.Field2204.getBooleanValue().booleanValue()) {
                this.Field2206.forEach(Class285::Method3096);
            }
            this.Field2206.forEach(Class285::Method3097);
            ++a3;
        }
        this.Field2206.removeIf(Particles::Method2278);
        this.Field2207.Method3079();
        Class212.Method2546(this.Field2206);
    }

    private static boolean Method2278(Class285 a) {
        return a.Field1546 >= 20 || Particles.mc.thePlayer.getDistanceSq(a.Method3098().Field1207, a.Method3098().Field1208, a.Method3098().Field1209) > 500.0;
    }
}