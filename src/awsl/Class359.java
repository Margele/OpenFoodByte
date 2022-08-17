package awsl;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import trash.foodbyte.utils.RenderUtils;

public class Class359 extends Class360 {
   private Class359(String a) {
      super(a, (Class355)null);
   }

   public void Method179(ItemStack a) {
      this.Method181(a, !this.Method180(a));
   }

   public boolean Method180(ItemStack a) {
      return Class356.Method145(a) && Class356.Method144(a).getBoolean(this.Field1703);
   }

   public void Method181(ItemStack a, boolean a) {
      int[] a = RenderUtils.trash();
      Class356.Method144(a).setBoolean(this.Field1703, a);
      if (Class356.Method145(a)) {
         NBTTagCompound a = Class356.Method144(a);
         a.removeTag(this.Field1703);
         Class356.Method146(a);
      }

   }

   public byte Method182(ItemStack a) {
      return Class356.Method145(a) ? Class356.Method144(a).getByte(this.Field1703) : 0;
   }

   Class359(String a, Class355 a1) {
      this(a);
   }
}
