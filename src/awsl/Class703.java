/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  net.minecraft.init.Blocks
 */
package awsl;

import awsl.Class221;
import java.util.ArrayList;
import net.minecraft.init.Blocks;
import obfuscate.a;

class Class703
extends ArrayList {
    final Class221 Field3043;

    Class703(Class221 a2) {
        this.Field3043 = a2;
        this.Method2530(Blocks.air);
        this.Method2530(Blocks.tallgrass);
        this.Method2530(Blocks.lava);
        this.Method2530(Blocks.flowing_water);
        String[] stringArray = Class221.Method2164();
        this.Method2530(Blocks.flowing_lava);
        this.Method2530(Blocks.red_flower);
        this.Method2530(Blocks.yellow_flower);
        this.Method2530(Blocks.standing_sign);
        this.Method2530(Blocks.wall_sign);
        String[] stringArray2 = stringArray;
        this.Method2530(Blocks.stone_pressure_plate);
        this.Method2530(Blocks.wooden_pressure_plate);
        this.Method2530(Blocks.heavy_weighted_pressure_plate);
        this.Method2530(Blocks.light_weighted_pressure_plate);
        this.Method2530(Blocks.stone_button);
        this.Method2530(Blocks.wooden_button);
        this.Method2530(Blocks.ladder);
        a.trash(new String[5]);
    }
}