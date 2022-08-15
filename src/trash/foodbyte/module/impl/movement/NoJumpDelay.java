/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class635;
import eventapi.EventTarget;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ReflectionUtils;

public class NoJumpDelay
extends Module {
    public NoJumpDelay() {
        super("NoJumpDelay", "No Jump Delay", Category.MOVEMENT);
    }

    @Override
    public String getDescription() {
        return "\u8df3\u8dc3\u65e0\u5ef6\u8fdf";
    }

    @EventTarget
    public void Method747(Class635 a) {
        if (a.Method3587().equals((Object)NoJumpDelay.mc.thePlayer)) {
            ReflectionUtils.Method2600(0);
        }
    }
}