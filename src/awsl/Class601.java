package awsl;

public class Class601 extends Class599 {
   public Class601() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class601(float[] a) {
      this.Field2813 = a[0];
      this.Field2814 = a[1];
      this.Field2815 = a[2];
      this.Field2816 = a[3];
   }

   public Class601(float a, float a, float a, float a) {
      this.Field2813 = a;
      this.Field2814 = a;
      this.Field2815 = a;
      this.Field2816 = a;
   }

   public Class601(Class601 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public Class601(Class599 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public float Method3786(Class601 a) {
      return Math.abs(this.Field2813 - a.Field2813) + Math.abs(this.Field2814 - a.Field2814) + Math.abs(this.Field2815 - a.Field2815) + Math.abs(this.Field2816 - a.Field2816);
   }

   public float Method3787(Class601 a) {
      float var2 = this.Field2813 - a.Field2813;
      float var3 = this.Field2814 - a.Field2814;
      float var4 = this.Field2815 - a.Field2815;
      float var5 = this.Field2816 - a.Field2816;
      return var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5;
   }

   public float Method3788(Class601 a) {
      float var2 = this.Field2813 - a.Field2813;
      float var3 = this.Field2814 - a.Field2814;
      float var4 = this.Field2815 - a.Field2815;
      float var5 = this.Field2816 - a.Field2816;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5));
   }
}
