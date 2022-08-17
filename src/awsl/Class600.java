package awsl;

import java.awt.Color;

public class Class600 extends Class599 {
   public Class600() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class600(float[] a) {
      this.Field2813 = a[0];
      this.Field2814 = a[1];
      this.Field2815 = a[2];
      this.Field2816 = a[3];
   }

   public Class600(float a, float a, float a, float a) {
      this.Field2813 = a;
      this.Field2814 = a;
      this.Field2815 = a;
      this.Field2816 = a;
   }

   public Class600(Class600 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public Class600(Class599 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public Class600(Color a) {
      this.Method3790(a);
   }

   public void Method3790(Color a) {
      this.Method114(a.getRGBComponents((float[])null));
   }

   public Color Method3791() {
      return new Color(this.Field2813, this.Field2814, this.Field2815, this.Field2816);
   }
}
