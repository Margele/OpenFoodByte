package awsl;

import net.minecraft.item.ItemStack;

public class Class360 {
   protected final String Field1703;

   private Class360(String a) {
      this.Field1703 = a;
   }

   public void Method179(ItemStack a) {
      this.Method181(a, !this.Method180(a));
   }

   public boolean Method180(ItemStack a) {
      return a.hasTagCompound() && Class356.Method149(a).getBoolean(this.Field1703);
   }

   public void Method181(ItemStack a, boolean a) {
      Class356.Method152(a, this.Field1703, a);
   }

   public byte Method182(ItemStack a) {
      return a.hasTagCompound() ? a.getTagCompound().getByte(this.Field1703) : 0;
   }

   Class360(String a, Class355 a1) {
      this(a);
   }
}
