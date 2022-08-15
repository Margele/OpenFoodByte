/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 */
package awsl;

import awsl.Class414;
import awsl.Class421;
import awsl.Class705;
import awsl.Class91;
import java.util.Iterator;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;

class Class420
extends Class421 {
    final Category Field2025;
    final Class705 Field2026;

    Class420(Class705 a, String a2, double a3, double a4, double a5, double a6, boolean a7, Class705 a8, Category category) {
        this.Field2026 = a;
        String[] stringArray = Class421.Method2390();
        this.Field2025 = category;
        super(a2, a3, a4, a5, a6, a7, a8);
        if (Class91.Method3648() == null) {
            Class421.Method2389(new String[1]);
        }
    }

    @Override
    public void Method2381() {
        Iterator iterator = ModuleManager.getAllModules().Method1383();
        String[] a = Class421.Method2390();
        if (iterator.Method932()) {
            Module a2 = (Module)iterator.Method933();
            if (!a2.Method1024().equals((Object)this.Field2025)) {
            }
            this.Field2037.Method2530((Object)new Class414(a2, this));
        }
    }
}