package awsl;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import obfuscate.a;

public class Class711 extends CreativeTabs {
   public Class711() {
      super(creativeTabArray.length, "Special blocks");
   }

   public void Method1975(List a) {
      super.Method1975(a);
      a.Method2530(new ItemStack(Blocks.command_block));
      a.Method2530(new ItemStack(Items.command_block_minecart));
      a.Method2530(new ItemStack(Blocks.barrier));
      a.Method2530(new ItemStack(Blocks.dragon_egg));
      int var10000 = Class728.Method1999();
      a.Method2530(new ItemStack(Blocks.brown_mushroom_block));
      int var2 = var10000;
      a.Method2530(new ItemStack(Blocks.red_mushroom_block));
      a.Method2530(new ItemStack(Blocks.farmland));
      a.Method2530(new ItemStack(Blocks.mob_spawner));
      a.Method2530(new ItemStack(Blocks.lit_furnace));
      if (a.trash() == null) {
         ++var2;
         Class728.Method1998(var2);
      }

   }

   public Item Method1976() {
      return (new ItemStack(Blocks.command_block)).getItem();
   }

   public String Method1977() {
      return "Special blocks";
   }

   public boolean Method1978() {
      return false;
   }
}
