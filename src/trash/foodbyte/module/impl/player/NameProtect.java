/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.module.impl.player;

import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;

public class NameProtect
extends Module {
    public static BooleanValue Field2717 = new BooleanValue("NameProtect", "SkinProtect", (Boolean)true, "\u76ae\u80a4\u4fdd\u62a4(\u66ff\u6362\u81ea\u5df1\u7684\u76ae\u80a4)");

    public NameProtect() {
        super("NameProtect", "Name Protect", Category.PLAYER);
    }

    @Override
    public String getDescription() {
        return "\u540d\u5b57\u4fdd\u62a4(\u66ff\u6362\u81ea\u5df1\u7684\u540d\u5b57)";
    }
}