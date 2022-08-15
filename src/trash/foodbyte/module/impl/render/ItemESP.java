/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 */
package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ColorValue;

public class ItemESP
extends Module {
    public ColorValue Field2375 = new ColorValue("ItemESP", "ESP Color", new Color(255, 255, 255), "\u900f\u89c6\u7ed8\u5236\u989c\u8272");

    public ItemESP() {
        super("ItemESP", "Item ESP", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u6389\u843d\u7269\u7ed8\u5236\u900f\u89c6";
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        Iterator iterator = ItemESP.mc.theWorld.loadedEntityList.Method1383();
        String a2 = Class492.Method2239();
        if (iterator.Method932()) {
            Object a3 = iterator.Method933();
            if (a3 instanceof EntityItem) {
                RenderUtils.Method1123((Entity)a3, this.Field2375.Method2444());
            }
        }
    }
}