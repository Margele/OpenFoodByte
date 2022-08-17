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
      ItemStack a = new ItemStack(Blocks.chest);
      NBTTagCompound a = a.getTagCompound();
      a = new NBTTagCompound();
      NBTTagCompound a = new NBTTagCompound();
      NBTTagList a = new NBTTagList();
      NBTTagCompound a = new NBTTagCompound();
      a.setByte("Slot", (byte)0);
      a.setByte("Count", (byte)a.stackSize);
      a.setString("id", Method132(a.getItem()));
      a.setShort("Damage", (short)a.getItemDamage());
      if (a.getTagCompound() != null) {
         a.setTag("tag", a.getTagCompound());
      }

      a.appendTag(a);
      a.setTag("Items", a);
      a.setTag("BlockEntityTag", a);
      a.setTagCompound(a);
      Method134(a, "§7Pack");
      Method134(a, a.getDisplayName());
      return a;
   }

   public static String Method132(Item a) {
      return a.delegate.getResourceName() != null ? a.delegate.getResourceName().toString() : "";
   }

   public static ItemStack Method133(String a, String[] a) {
      ItemStack a = new ItemStack(Items.paper);
      RenderUtils.trash();
      a.setStackDisplayName(a);
      NBTTagList a = new NBTTagList();
      int var6 = a.length;
      int var7 = 0;
      if (var7 < var6) {
         String a = a[var7];
         a.appendTag(new NBTTagString(a));
         ++var7;
      }

      a.getTagCompound().getCompoundTag("display").setTag("Lore", a);
      return a;
   }

   public static void Method134(ItemStack a, String a) {
      NBTTagList a = Method139(a);
      a.appendTag(new NBTTagString(a));
   }

   public static void Method135(ItemStack a, int a) {
      NBTTagList a = Method139(a);
      if (a >= a.tagCount()) {
         if (a.tagCount() == 0) {
            Method137(a);
         }

      } else {
         a.removeTag(a);
         if (a.tagCount() == 0) {
            Method137(a);
         }

      }
   }

   public static void Method136(ItemStack a, int a, String a) {
      RenderUtils.trash();
      NBTTagList a = Method139(a);
      if (a >= a.tagCount()) {
         Method134(a, a);
      }

      a.set(a, new NBTTagString(a));
   }

   public static void Method137(ItemStack a) {
      NBTTagCompound a = Method141(a);
      if (a.hasKey("Lore", 9)) {
         a.removeTag("Lore");
      }

      Method143(a);
   }

   public static boolean Method138(ItemStack a) {
      return Method142(a) && Method141(a).hasKey("Lore", 9);
   }

   public static NBTTagList Method139(ItemStack a) {
      NBTTagCompound a = Method141(a);
      if (!Method138(a)) {
         a.setTag("Lore", new NBTTagList());
      }

      return a.getTagList("Lore", 8);
   }

   @Nullable
   public static String Method140(ItemStack a, int a) {
      if (Method138(a)) {
         NBTTagList a = Method139(a);
         if (a < a.tagCount()) {
            return a.getStringTagAt(a);
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
      int[] a = RenderUtils.trash();
      Method149(a).setBoolean(a, a);
      if (a.hasTagCompound()) {
         NBTTagCompound a = Method149(a);
         a.removeTag(a);
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
