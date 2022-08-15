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

public class NoHurtcam
extends Module {
    public NoHurtcam() {
        super("NoHurtcam", "No Hurtcam", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u53d7\u4f24\u5c4f\u5e55\u4e0d\u6296\u52a8";
    }
}