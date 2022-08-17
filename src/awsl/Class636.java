package awsl;

import eventapi.Event;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;

public class Class636 implements Event {
   private BlockPos Field2901;
   private EnumFacing Field2902;
   private boolean Field2903;

   public Class636(BlockPos a, EnumFacing a) {
      this.Field2901 = a;
      this.Field2902 = a;
   }

   public Class636() {
   }

   public BlockPos Method3583() {
      return this.Field2901;
   }

   public void Method3584(BlockPos a) {
      this.Field2901 = a;
   }

   public EnumFacing Method3585() {
      return this.Field2902;
   }

   public void Method3586(EnumFacing a) {
      this.Field2902 = a;
   }

   public void Method2300(boolean a) {
      this.Field2903 = a;
   }

   public boolean Method2241() {
      return this.Field2903;
   }
}
