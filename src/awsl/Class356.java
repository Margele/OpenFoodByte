package awsl;

import javax.annotation.Nullable;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import trash.foodbyte.utils.RenderUtils;

public class Class356 {
   public static ItemStack Method131(ItemStack a) {
      ItemStack var1 = new ItemStack(Blocks.chest);
      NBTTagCompound var2 = a.getTagCompound();
      var2 = new NBTTagCompound();
      NBTTagCompound var3 = new NBTTagCompound();
      NBTTagList var4 = new NBTTagList();
      NBTTagCompound var5 = new NBTTagCompound();
      var5.setByte("Slot", (byte)0);
      var5.setByte("Count", (byte)a.stackSize);
      var5.setString("id", Method132(a.getItem()));
      var5.setShort("Damage", (short)a.getItemDamage());
      if (a.getTagCompound() != null) {
         var5.setTag("tag", a.getTagCompound());
      }

      var4.appendTag(var5);
      var3.setTag("Items", var4);
      var2.setTag("BlockEntityTag", var3);
      var1.setTagCompound(var2);
      Method134(var1, "§7Pack");
      Method134(var1, a.getDisplayName());
      return var1;
   }

   public static String Method132(Item a) {
      return a.delegate.getResourceName() != null ? a.delegate.getResourceName().toString() : "";
   }

   public static ItemStack Method133(String a, String[] a) {
      ItemStack var3 = new ItemStack(Items.paper);
      RenderUtils.trash();
      var3.setStackDisplayName(a);
      NBTTagList var4 = new NBTTagList();
      int var6 = a.length;
      int var7 = 0;
      if (var7 < var6) {
         String var8 = a[var7];
         var4.appendTag(new NBTTagString(var8));
         ++var7;
      }

      var3.getTagCompound().getCompoundTag("display").setTag("Lore", var4);
      return var3;
   }

   public static void Method134(ItemStack a, String a) {
      NBTTagList var2 = Method139(a);
      var2.appendTag(new NBTTagString(a));
   }

   public static void Method135(ItemStack a, int a) {
      NBTTagList var2 = Method139(a);
      if (a >= var2.tagCount()) {
         if (var2.tagCount() == 0) {
            Method137(a);
         }

      } else {
         var2.removeTag(a);
         if (var2.tagCount() == 0) {
            Method137(a);
         }

      }
   }

   public static void Method136(ItemStack a, int a, String a) {
      RenderUtils.trash();
      NBTTagList var4 = Method139(a);
      if (a >= var4.tagCount()) {
         Method134(a, a);
      }

      var4.set(a, new NBTTagString(a));
   }

   public static void Method137(ItemStack a) {
      NBTTagCompound var1 = Method141(a);
      if (var1.hasKey("Lore", 9)) {
         var1.removeTag("Lore");
      }

      Method143(a);
   }

   public static boolean Method138(ItemStack a) {
      return Method142(a) && Method141(a).hasKey("Lore", 9);
   }

   public static NBTTagList Method139(ItemStack a) {
      NBTTagCompound var1 = Method141(a);
      if (!Method138(a)) {
         var1.setTag("Lore", new NBTTagList());
      }

      return var1.getTagList("Lore", 8);
   }

   @Nullable
   public static String Method140(ItemStack a, int a) {
      if (Method138(a)) {
         NBTTagList var2 = Method139(a);
         if (a < var2.tagCount()) {
            return var2.getStringTagAt(a);
         }
      }

      return null;
   }

   public static NBTTagCompound Method141(ItemStack a) {
      return a.getTagCompound().getCompoundTag("display");
   }

   public static boolean Method142(ItemStack a) {
      return a.hasTagCompound() && a.getTagCompound().hasKey("display", 10);
   }

   public static void Method143(ItemStack a) {
      if (Method142(a) && Method141(a).hasNoTags()) {
         a.getTagCompound().removeTag("display");
      }

      Method151(a);
   }

   public static NBTTagCompound Method144(ItemStack a) {
      return a.getTagCompound().getCompoundTag("EntityTag");
   }

   public static boolean Method145(ItemStack a) {
      return a.hasTagCompound() && a.getTagCompound().hasKey("EntityTag", 10);
   }

   public static void Method146(ItemStack a) {
      if (Method145(a) && Method144(a).hasNoTags()) {
         a.getTagCompound().removeTag("EntityTag");
      }

      Method151(a);
   }

   public static boolean Method147(ItemStack a) {
      return !a.hasTagCompound() ? false : a.getTagCompound().getBoolean("Unbreakable");
   }

   public static void Method148(ItemStack a, boolean a) {
      Method150(a, "Unbreakable", a);
   }

   public static NBTTagCompound Method149(ItemStack a) {
      if (!a.hasTagCompound()) {
         a.setTagCompound(new NBTTagCompound());
      }

      return a.getTagCompound();
   }

   private static void Method150(ItemStack a, String a, boolean a) {
      int[] var3 = RenderUtils.trash();
      Method149(a).setBoolean(a, a);
      if (a.hasTagCompound()) {
         NBTTagCompound var4 = Method149(a);
         var4.removeTag(a);
         Method151(a);
      }

   }

   public static void Method151(ItemStack a) {
      if (Method149(a).hasNoTags()) {
         a.setTagCompound((NBTTagCompound)null);
      }

   }

   static void Method152(ItemStack a, String a, boolean a) {
      Method150(a, a, a);
   }
}
