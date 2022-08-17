package awsl;

public class Class603 extends Class599 {
   public Class603() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class603(float[] a) {
      this.Field2813 = a[0];
      this.Field2814 = a[1];
      this.Field2815 = a[2];
      this.Field2816 = a[2];
   }

   public Class603(float a, float a, float a, float a) {
      this.Field2813 = a;
      this.Field2814 = a;
      this.Field2815 = a;
      this.Field2816 = a;
   }

   public Class603(Class603 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public Class603(Class599 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public float Method3688(Class603 a) {
      return a.Field2813 * this.Field2813 + a.Field2814 * this.Field2814 + a.Field2815 * this.Field2815 + a.Field2816 * this.Field2816;
   }

   public float Method3689() {
      return (float)Math.sqrt((double)(this.Field2813 * this.Field2813 + this.Field2814 * this.Field2814 + this.Field2815 * this.Field2815 + this.Field2816 * this.Field2816));
   }

   public void Method3690() {
      float a = 1.0F / (this.Field2813 * this.Field2813 + this.Field2814 * this.Field2814 + this.Field2815 * this.Field2815 + this.Field2816 * this.Field2816);
      this.Field2813 *= a;
      this.Field2814 *= a;
      this.Field2815 *= a;
      this.Field2816 *= a;
   }
}
