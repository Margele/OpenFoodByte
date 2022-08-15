/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import awsl.Class630;
import awsl.Class653;
import eventapi.EventTarget;
import net.minecraft.client.entity.EntityPlayerSP;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.FloatValue;

public class Fly
extends Module {
    public static FloatValue Field2477 = new FloatValue("Fly", "Speed", 3.0, 1.0, 10.0, 0.1, "\u98de\u884c\u901f\u5ea6");

    public Fly() {
        super("Fly", "Fly", Category.MOVEMENT);
        this.setHideModule(true);
    }

    @Override
    public String getDescription() {
        return "\u98de\u884c";
    }

    @Override
    public boolean canUse() {
        return GlobalModule.INSTANCE.Field3186 == null || !PermissionManager.canUseModule("fly");
    }

    @EventTarget
    public void Method755(Class653 a) {
        this.setDisplayTag("Vanilla");
    }

    @EventTarget
    public void onMotion(EventMotion e) {
        boolean bl = Class167.Method1501();
        if (e.isPre()) {
            if (Fly.mc.thePlayer.movementInput.jump) {
                Fly.mc.thePlayer.motionY = 1.8;
            }
            if (Fly.mc.thePlayer.movementInput.sneak) {
                Fly.mc.thePlayer.motionY = -1.8;
            }
            if (!Fly.mc.thePlayer.onGround) {
                Fly.mc.thePlayer.motionY = 0.0;
            }
        }
    }

    @EventTarget
    public void Method274(Class630 a) {
        if (a.Method3503() instanceof EntityPlayerSP) {
            a.Method3512(Field2477.Method2746());
        }
    }
}