package awsl;

import java.awt.image.BufferedImage;

public class Class830 extends Class833 {
   private float Field3686 = 0.5F;
   private float Field3687 = 1.0F;

   public void Method164(float a) {
      this.Field3686 = a;
   }

   public float Method165() {
      return this.Field3686;
   }

   public void Method166(float a) {
      this.Field3687 = a;
   }

   public float Method167() {
      return this.Field3687;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Method11(1);
      a = super.Method62(a, a);
      Class60 var3 = new Class60(this);
      return var3.Method62(a, a);
   }

   public String toString() {
      return "Effects/Chrome...";
   }

   static float Method3649(Class830 a) {
      return a.Field3686;
   }

   static float Method3650(Class830 a) {
      return a.Field3687;
   }
}
