/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  net.minecraft.entity.Entity
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import awsl.Class653;
import eventapi.EventTarget;
import net.minecraft.entity.Entity;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ReflectionUtils;

public class Packour
extends Module {
    boolean Field2455 = false;

    public Packour() {
        super("Parkour", "Parkour", Category.MOVEMENT);
        this.setDescription("\u5f53\u4f60\u5230\u8fbe\u65b9\u5757\u7684\u8fb9\u7f18\u65f6\u81ea\u52a8\u8df3\u8dc3");
    }

    @EventTarget
    public void Method755(Class653 a) {
        block6: {
            block5: {
                boolean bl = Class167.Method1501();
                if (!this.Field2455) break block5;
                if (!Packour.mc.thePlayer.onGround) break block6;
                this.Field2455 = false;
            }
            if (ReflectionUtils.Method2605(Packour.mc.gameSettings.keyBindJump)) {
                this.Field2455 = true;
            }
            if (Packour.mc.theWorld.getCollidingBoundingBoxes((Entity)Packour.mc.thePlayer, Packour.mc.thePlayer.getEntityBoundingBox().offset(0.0, -0.5, 0.0).expand(0.001, 0.0, 0.001)).isEmpty()) {
                Packour.mc.thePlayer.jump();
                this.Field2455 = true;
            }
        }
    }
}