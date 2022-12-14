package awsl;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTTagList;
import trash.foodbyte.utils.RenderUtils;

public class Class354 {
   public static final Class360 Field1697 = new Class359("ShowArms", (Class355)null);
   public static final Class360 Field1698 = new Class359("Small", (Class355)null);
   public static final Class360 Field1699 = new Class359("Invisible", (Class355)null);
   public static final Class360 Field1700 = new Class359("NoBasePlate", (Class355)null);
   public static final Class360 Field1701 = new Class359("Marker", (Class355)null);

   public static NBTTagCompound Method90(ItemStack a) {
      NBTTagCompound var1 = Class356.Method144(a);
      if (!var1.hasKey("Pose", 10)) {
         var1.setTag("Pose", new NBTTagCompound());
      }

      return var1.getCompoundTag("Pose");
   }

   public static boolean Method91(ItemStack a) {
      return Class356.Method145(a) && Class356.Method144(a).hasKey("Pose", 10);
   }

   public static void Method92(ItemStack a) {
      if (Method91(a) && Method90(a).hasNoTags()) {
         Class356.Method144(a).removeTag("Pose");
      }

      Class356.Method146(a);
   }

   public static void Method93(ItemStack a, Class664 a, float a, float a, float a) {
      RenderUtils.trash();
      NBTTagList var6 = Method100(a, a);
      if (var6.hasNoTags()) {
         var6.appendTag(new NBTTagFloat(a));
         var6.appendTag(new NBTTagFloat(a));
         var6.appendTag(new NBTTagFloat(a));
      }

      var6.set(0, new NBTTagFloat(a));
      var6.set(1, new NBTTagFloat(a));
      var6.set(2, new NBTTagFloat(a));
   }

   public static void Method94(ItemStack a, Class664 a, float a) {
      Method93(a, a, a, Method98(a, a), Method99(a, a));
   }

   public static void Method95(ItemStack a, Class664 a, float a) {
      Method93(a, a, Method97(a, a), a, Method99(a, a));
   }

   public static void Method96(ItemStack a, Class664 a, float a) {
      Method93(a, a, Method97(a, a), Method98(a, a), a);
   }

   public static float Method97(ItemStack a, Class664 a) {
      return !Method102(a, a) ? 0.0F : Method101(a, a)[0];
   }

   public static float Method98(ItemStack a, Class664 a) {
      return !Method102(a, a) ? 0.0F : Method101(a, a)[1];
   }

   public static float Method99(ItemStack a, Class664 a) {
      return !Method102(a, a) ? 0.0F : Method101(a, a)[2];
   }

   public static NBTTagList Method100(ItemStack a, Class664 a) {
      NBTTagCompound var2 = Method90(a);
      if (!var2.hasKey(a.Method497(), 9)) {
         var2.setTag(a.Method497(), new NBTTagList());
      }

      return var2.getTagList(a.Method497(), 5);
   }

   public static float[] Method101(ItemStack a, Class664 a) {
      if (Method102(a, a)) {
         NBTTagList var2 = Method100(a, a);
         if (!var2.hasNoTags()) {
            return new float[]{var2.getFloatAt(0), var2.getFloatAt(1), var2.getFloatAt(2)};
         }
      }

      return new float[]{0.0F, 0.0F, 0.0F};
   }

   public static boolean Method102(ItemStack a, Class664 a) {
      return Method91(a) && Method90(a).hasKey(Class664.Method2416(a), 9);
   }

   public static void Method103(ItemStack a, Class664 a) {
      if (Method102(a, a)) {
         NBTTagList var2 = Method100(a, a);
         if (var2.hasNoTags() || var2.getFloatAt(0) == 0.0F && var2.getFloatAt(1) == 0.0F && var2.getFloatAt(2) == 0.0F) {
            Method90(a).removeTag(a.Method497());
         }
      }

      Method92(a);
   }
}
