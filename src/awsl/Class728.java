package awsl;

import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Class728 extends CreativeTabs {
   private static int Field3192;

   public Class728() {
      super(creativeTabArray.length, "Spawner");
   }

   public void Method1975(List a) {
      super.Method1975(a);
      a.Method2530(Method1997("mob_spawner 1 0 {display:{Lore:[0:\"§a生成无数个TNT向天上发射!!\",10:\"§cBy SuChen\"],Name:\"§bFLY §6TNT\"},BlockEntityTag:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"FallingSand\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,SpawnData:{Motion:[0:0.0d,1:0.0d,2:0.0d],Block:\"mob_spawner\",Time:1,Data:0,TileEntityData:{EntityId:\"PrimedTnt\",MaxNearbyEntities:1000,RequiredPlayerRange:100,SpawnCount:100,MaxSpawnDelay:20,SpawnRange:100,MinSpawnDelay:20,SpawnData:{Motion:[0.0,2.0,0.0],Fuse:20}},DropItem:0},MaxSpawnDelay:20,SpawnRange:500,MinSpawnDelay:20},DropItem:0},MaxSpawnDelay:5,SpawnRange:500,Delay:20,MinSpawnDelay:5}}"));
   }

   public Item Method1976() {
      return (new ItemStack(Blocks.mob_spawner)).getItem();
   }

   public String Method1977() {
      return "SpawnerTab";
   }

   public boolean Method1978() {
      return false;
   }

   public static ItemStack Method1997(String a) {
      int a = Method1999();

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
            ++a;
         }

         return null;
      } catch (Exception var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static void Method1998(int integer) {
      Field3192 = integer;
   }

   public static int Method1999() {
      return Field3192;
   }

   public static int Method2000() {
      int var0 = Method1999();
      return 38;
   }

   private static Exception Method2001(Exception exception) {
      return exception;
   }

   static {
      Method1998(0);
   }
}
