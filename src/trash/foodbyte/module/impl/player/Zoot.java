/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  net.minecraft.potion.Potion
 */
package trash.foodbyte.module.impl.player;

import awsl.Class653;
import eventapi.EventTarget;
import net.minecraft.potion.Potion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;

public class Zoot
extends Module {
    public static BooleanValue Field3233 = new BooleanValue("Zoot", "Blindness", (Boolean)true, "\u7f13\u6162");
    public static BooleanValue Field3234 = new BooleanValue("Zoot", "Confusion", (Boolean)true, "\u53cd\u80c3");
    public static BooleanValue Field3235 = new BooleanValue("Zoot", "DigSlowdown", (Boolean)true, "\u6316\u6398\u75b2\u52b3");

    public Zoot() {
        super("Zoot", "Zoot", Category.PLAYER);
        this.setDescription("\u81ea\u52a8\u6e05\u9664\u8d1f\u9762\u6548\u679c");
    }

    @EventTarget
    public void Method1655(Class653 a) {
        if (Field3233.Method2509().booleanValue() && Zoot.mc.thePlayer.isPotionActive(Potion.blindness.getId())) {
            Zoot.mc.thePlayer.removePotionEffect(Potion.blindness.getId());
        }
        if (Field3234.Method2509().booleanValue() && Zoot.mc.thePlayer.isPotionActive(Potion.confusion.getId())) {
            Zoot.mc.thePlayer.removePotionEffect(Potion.confusion.getId());
        }
        if (Field3235.Method2509().booleanValue() && Zoot.mc.thePlayer.isPotionActive(Potion.digSlowdown.getId())) {
            Zoot.mc.thePlayer.removePotionEffect(Potion.digSlowdown.getId());
        }
    }
}