/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.regex.Pattern
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Class728
extends CreativeTabs {
    private static int Field3192;

    public Class728() {
        super(creativeTabArray.length, "Spawner");
    }

    public void Method1975(List a) {
        super.Method1975(a);
        a.Method2530((Object)Class728.Method1997("mob_spawner 1 0 {display:{Lore:[0:\"\u00a7a\u751f\u6210\u65e0\u6570\u4e2aTNT\u5411\u5929\u4e0a\u53d1\u5c04!!\",10:\"\u00a7cBy SuChen\"],Name:\"\u00a7bFLY \u00a76TNT\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"PrimedTnt\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20,SpawnData:{Motion:[0.0,2.0,0.0],Fuse:20}},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}}"));
    }

    public Item Method1976() {
        return new ItemStack(Blocks.mob_spawner).getItem();
    }

    public String Method1977() {
        return "SpawnerTab";
    }

    public boolean Method1978() {
        return false;
    }

    public static ItemStack Method1997(String a) {
        block4: {
            int a2;
            int a3 = Class728.Method1999();
            try {
                Item a4;
                a = a.replace('&', '\u00a7');
                Item a5 = a4 = new Item();
                String[] a6 = null;
                boolean a7 = true;
                boolean a8 = false;
                a2 = 0;
                if (a2 > Math.min((int)12, (int)(a.length() - 2))) break block4;
                a6 = a.substring(a2).split(Pattern.quote((String)" "));
                ResourceLocation a9 = new ResourceLocation(a6[0]);
                a4 = (Item)Item.itemRegistry.getObject((Object)a9);
            }
            catch (Exception a10) {
                a10.printStackTrace();
                return null;
            }
            ++a2;
        }
        return null;
    }

    public static void Method1998(int n) {
        Field3192 = n;
    }

    public static int Method1999() {
        return Field3192;
    }

    public static int Method2000() {
        int n = Class728.Method1999();
        return 38;
    }

    private static Exception Method2001(Exception exception) {
        return exception;
    }

    static {
        Class728.Method1998(0);
    }
}