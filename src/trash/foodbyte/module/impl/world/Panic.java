/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 */
package trash.foodbyte.module.impl.world;

import awsl.Class91;
import java.util.Iterator;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.value.FloatValue;

public class Panic
extends Module {
    public Panic() {
        int n = FloatValue.Method2450();
        super("Panic", Category.WORLD);
        this.setDescription("\u4e00\u952e\u5173\u95ed\u6240\u6709\u529f\u80fd");
        int n2 = n;
        Class91.Method3647(new String[5]);
    }

    @Override
    public void onEnable() {
        Iterator iterator = ModuleManager.getAllModules().Method1383();
        int a = FloatValue.Method2450();
        if (iterator.Method932()) {
            Module a2 = (Module)iterator.Method933();
            if (!a2.getState()) {
            }
            a2.setState(false);
        }
        if (Class91.Method3648() == null) {
            FloatValue.Method2440(++a);
        }
    }
}