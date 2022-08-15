/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.module.impl.render;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class NoFov
extends Module {
    public static FloatValue Field2239 = new FloatValue("NoFov", "Fov", 1.0, 1.0, 1.5, 0.1, "\u89d2\u5ea6");
    public static BooleanValue Field2240 = new BooleanValue("NoFov", "Bow Zoom", (Boolean)true, "\u62c9\u5f13\u653e\u5927\u5f00\u5173");

    public NoFov() {
        super("NoFov", "No Fov", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u9501\u5b9a\u89c6\u89d2\u89d2\u5ea6";
    }
}