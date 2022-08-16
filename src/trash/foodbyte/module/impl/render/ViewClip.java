/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 */
package trash.foodbyte.module.impl.render;

import eventapi.EventTarget;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.value.BooleanValue;

public class ViewClip
extends Module {
    public BooleanValue Field2175 = new BooleanValue("ViewClip", "Del Portal Anim", (Boolean)true, "\u5220\u9664\u4f20\u9001\u95e8\u52a8\u753b");

    public ViewClip() {
        super("ViewClip", "View Clip", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u89c6\u89d2\u65e0\u906e\u6321(\u88ab\u57cb\u4e0d\u9ed1\u5c4f,F5\u53ef\u4ee5\u770b\u5899\u91cc)";
    }

    @EventTarget
    private void Method755(EventTick a) {
        ViewClip.mc.thePlayer.noClip = true;
        try {
            if (this.Field2175.getValue()) {
                ReflectionHelper.findField(Entity.class, (String[])new String[]{ObfuscatedField.inPortal.getObfuscatedName()}).set((Object)ViewClip.mc.thePlayer, (Object)false);
            }
        }
        catch (Exception a2) {
            a2.printStackTrace();
        }
    }
}