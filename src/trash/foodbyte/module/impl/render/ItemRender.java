/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.module.impl.render;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.ModeValue;

public class ItemRender
extends Module {
    public ModeValue Field2374 = new ModeValue("ItemRender", "Render Mode", "Badlion", new String[]{"Badlion"}, "\u6a21\u5f0f{Badlion}");

    public ItemRender() {
        super("ItemRender", "Item Render", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u4fee\u6539\u6389\u843d\u7269\u663e\u793a";
    }
}