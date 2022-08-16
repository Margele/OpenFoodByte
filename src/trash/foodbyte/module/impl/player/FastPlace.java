/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.item.ItemBlock
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import net.minecraft.item.ItemBlock;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;

public class FastPlace
extends Module {
    public BooleanValue Field2674 = new BooleanValue("FastPlace", "OnlyBlock", (Boolean)true, "\u53ea\u6709\u65b9\u5757\u65e0\u5ef6\u8fdf");

    public FastPlace() {
        super("FastPlace", "Fast Place", Category.PLAYER);
    }

    @Override
    public String getDescription() {
        return "\u53f3\u952e\u65e0\u5ef6\u8fdf(\u65e0\u5ef6\u8fdf\u653e\u7f6e\u65b9\u5757\u548c\u65e0\u5ef6\u8fdf\u6254\u51fa\u96ea\u7403)";
    }

    @EventTarget
    public void Method232(EventUpdate a2) {
        block3: {
            block2: {
                int n = Class148.Method1445();
                if (!this.Field2674.getValue()) break block2;
                if (FastPlace.mc.thePlayer.inventory.getCurrentItem() == null || !(FastPlace.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemBlock)) break block3;
                ReflectionUtils.setRightClickDelayTimer(0);
            }
            ReflectionUtils.setRightClickDelayTimer(0);
        }
    }

    @Override
    public void onDisable() {
        ReflectionUtils.setRightClickDelayTimer(4);
        super.onDisable();
    }
}