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
      StringBuilder a = new StringBuilder();
      int a = 1;
      int a = 0;

      for(short a = 10000; a <= a; ++a) {
         ++a;
         if (a >= 4) {
            a = 0;
         }

         a.append(a + ":{Type:" + a + "b,Trail:1b,Colors:[" + Method2055(a * 300) + ",],FadeColors:[" + Method2055(a * 300) + ",]},");
      }

      a.append(a + ":{Type:0b,Trail:1b,Colors:[1850598,],FadeColors:[8530835,]}");
      this.Field3077 = Method1997("fireworks 1 0 {HideFlags:63,display:{Name:\"§cRandom §a§lFirework\"},Fireworks:{Explosions:[" + a + "]}}");
   }

   public void Method1975(List a) {
      super.Method1975(a);
      ItemStack a = new ItemStack(Items.potionitem);
      a.setItemDamage(16384);
      NBTTagList a = new NBTTagList();
      Class728.Method2000();
      int a = 1;
      byte a = 23;
      if (a <= a) {
         NBTTagCompound a = new NBTTagCompound();
         a.setInteger("Amplifier", Integer.MAX_VALUE);
         a.setInteger("Duration", Integer.MAX_VALUE);
         a.setInteger("Id", a);
         a.appendTag(a);
         ++a;
         a.trash(new String[2]);
      }

      a.setTagInfo("CustomPotionEffects", a);
      a.setStackDisplayName("§c§lTroll§6§lPotion");
      a.Method2530(a);
      ItemStack a = new ItemStack(Items.potionitem);
      a.setItemDamage(16384);
      NBTTagList a = new NBTTagList();
      int a = 1;
      byte a = 23;
      NBTTagCompound a;
      if (a <= a) {
         a = new NBTTagCompound();
         a.setInteger("Amplifier", 127);
         a.setInteger("Duration", Integer.MAX_VALUE);
         a.setInteger("Id", a);
         a.appendTag(a);
         ++a;
      }

      a.setTagInfo("CustomPotionEffects", a);
      a.setStackDisplayName("§c§lTroll§6§lPotion");
      a.Method2530(a);
      ItemStack a = new ItemStack(Items.potionitem);
      a.setItemDamage(16395);
      a = new NBTTagCompound();
      a.setInteger("Amplifier", 125);
      a.setInteger("Duration", 1);
      a.setInteger("Id", 6);
      NBTTagList a = new NBTTagList();
      a.appendTag(a);
      a.setTagInfo("CustomPotionEffects", a);
      a.setStackDisplayName("§c§lKill§6§lPotion");
      a.Method2530(a);
      ItemStack a = new ItemStack(Items.potionitem);
      a.setItemDamage(16451);
      NBTTagList a = new NBTTagList();
      int[] a = new int[]{5, 10, 11};
      int a = 0;
      if (a < 3) {
         NBTTagCompound a = new NBTTagCompound();
         a.setInteger("Amplifier", 127);
         a.setInteger("Duration", Integer.MAX_VALUE);
         a.setInteger("Id", a[a]);
         a.appendTag(a);
         ++a;
      }

      a.setTagInfo("CustomPotionEffects", a);
      a.setStackDisplayName("§c§lGod§6§lPotion");
      a.Method2530(a);
      ItemStack a = new ItemStack(Blocks.anvil);
      a.setStackDisplayName("§8Crash§c§lAnvil §7| §cmc1.8-mc1.8");
      a.setItemDamage(16384);
      a.Method2530(a);
      a.Method2530(Method1997("furnace 1 0 {BlockEntityTag:{Items:[0:{Slot:0,id:\"skull\",Count:64,tag:{SkullOwner:{Id:\"0\"}}}]},display:{Lore:[0:\"§bCrash(Every Client)\"]}}"));
      a.Method2530(Method1997("mob_spawner 1 0 {BlockEntityTag:{EntityId:\"Painting\"}}").setStackDisplayName("§8Crash§c§lSpawner §7| §cmc1.8-mc1.8"));
      a.Method2530(Method1997("armor_stand 1 0 {EntityTag:{Equipment:[{},{},{},{},{id:\"skull\",Count:1b,Damage:3b,tag:{SkullOwner:\"Test\"}}]}}").setStackDisplayName("§8Crash§2§lStand §7| §cmc1.10"));
      StringBuilder a = new StringBuilder();
      int a = 0;
      short a = 499;
      if (a <= a) {
         a.append("/(!§()%/§)=/(!§()%/§)=/(!§()%/§)=");
         ++a;
      }

      a.Method2530(Method1997("sign 1 0 {BlockEntityTag:{Text1:\"{\\\"text\\\":\\\"" + a + "\\\"}\",Text2:\"{\\\"text\\\":\\\"" + a + "\\\"}\",Text3:\"{\\\"text\\\":\\\"" + a + "\\\"}\",Text4:\"{\\\"text\\\":\\\"" + a + "\\\"}\"}}").setStackDisplayName("§8Lag§2§lSign §7| §cmc1.8"));
      a.Method2530(Method1997("spawn_egg 1 64"));
      a.Method2530(Method1997("spawn_egg 1 63"));
      a.Method2530(Method1997("spawn_egg 1 53"));
      a.Method2530(Method1997("name_tag 1 0 {display:{Name: \"" + a + "\"}}"));
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
      double a = Math.ceil((double)(System.currentTimeMillis() + (long)a) / 4.0);
      return Color.getHSBColor((float)((a %= 360.0) / 360.0), 0.6F, 1.0F).getRGB();
   }

   public static ItemStack Method1997(String a) {
      try {
         a = a.replace('&', '§');
         Item a = new Item();
         String[] a = null;
         int a = true;
         int a = false;
         int a = 0;
         if (a <= Math.min(12, a.length() - 2)) {
            a = a.substring(a).split(Pattern.quote(" "));
            ResourceLocation a = new ResourceLocation(a[0]);
            a = (Item)Item.itemRegistry.getObject(a);
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
