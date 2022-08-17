package awsl;

public class Class599 {
   public float Field2813;
   public float Field2814;
   public float Field2815;
   public float Field2816;
   private static boolean Field2817;

   public Class599() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class599(float[] a) {
      this.Field2813 = a[0];
      this.Field2814 = a[1];
      this.Field2815 = a[2];
      this.Field2816 = a[2];
   }

   public Class599(float a, float a, float a, float a) {
      this.Field2813 = a;
      this.Field2814 = a;
      this.Field2815 = a;
      this.Field2816 = a;
   }

   public Class599(Class599 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public void Method110() {
      this.Field2813 = Math.abs(this.Field2813);
      this.Field2814 = Math.abs(this.Field2814);
      this.Field2815 = Math.abs(this.Field2815);
      this.Field2816 = Math.abs(this.Field2816);
   }

   public void Method111(Class599 a) {
      this.Field2813 = Math.abs(a.Field2813);
      this.Field2814 = Math.abs(a.Field2814);
      this.Field2815 = Math.abs(a.Field2815);
      this.Field2816 = Math.abs(a.Field2816);
   }

   public void Method112(float a, float a) {
      boolean var3 = Method129();
      if (this.Field2813 < a) {
         this.Field2813 = a;
      }

      if (this.Field2813 > a) {
         this.Field2813 = a;
      }

      if (this.Field2814 < a) {
         this.Field2814 = a;
      }

      if (this.Field2814 > a) {
         this.Field2814 = a;
      }

      if (this.Field2815 < a) {
         this.Field2815 = a;
      }

      if (this.Field2815 > a) {
         this.Field2815 = a;
      }

      if (this.Field2816 < a) {
         this.Field2816 = a;
      }

      if (this.Field2816 > a) {
         this.Field2816 = a;
      }

   }

   public void Method113(float a, float a, float a, float a) {
      this.Field2813 = a;
      this.Field2814 = a;
      this.Field2815 = a;
      this.Field2816 = a;
   }

   public void Method114(float[] a) {
      this.Field2813 = a[0];
      this.Field2814 = a[1];
      this.Field2815 = a[2];
      this.Field2816 = a[2];
   }

   public void Method115(Class599 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public void Method116(Class599 a) {
      a.Field2813 = this.Field2813;
      a.Field2814 = this.Field2814;
      a.Field2815 = this.Field2815;
      a.Field2816 = this.Field2816;
   }

   public void Method117(float[] a) {
      a[0] = this.Field2813;
      a[1] = this.Field2814;
      a[2] = this.Field2815;
      a[3] = this.Field2816;
   }

   public void Method118() {
      this.Field2813 = -this.Field2813;
      this.Field2814 = -this.Field2814;
      this.Field2815 = -this.Field2815;
      this.Field2816 = -this.Field2816;
   }

   public void Method119(Class599 a) {
      this.Field2813 = -a.Field2813;
      this.Field2814 = -a.Field2814;
      this.Field2815 = -a.Field2815;
      this.Field2816 = -a.Field2816;
   }

   public void Method120(Class599 a, float a) {
      float var3 = 1.0F - a;
      this.Field2813 = var3 * this.Field2813 + a * a.Field2813;
      this.Field2814 = var3 * this.Field2814 + a * a.Field2814;
      this.Field2815 = var3 * this.Field2815 + a * a.Field2815;
      this.Field2816 = var3 * this.Field2816 + a * a.Field2816;
   }

   public void Method121(float a) {
      this.Field2813 *= a;
      this.Field2814 *= a;
      this.Field2815 *= a;
      this.Field2816 *= a;
   }

   public void Method122(Class599 a) {
      this.Field2813 += a.Field2813;
      this.Field2814 += a.Field2814;
      this.Field2815 += a.Field2815;
      this.Field2816 += a.Field2816;
   }

   public void Method123(Class599 a, Class599 a) {
      this.Field2813 = a.Field2813 + a.Field2813;
      this.Field2814 = a.Field2814 + a.Field2814;
      this.Field2815 = a.Field2815 + a.Field2815;
      this.Field2816 = a.Field2816 + a.Field2816;
   }

   public void Method124(Class599 a) {
      this.Field2813 -= a.Field2813;
      this.Field2814 -= a.Field2814;
      this.Field2815 -= a.Field2815;
      this.Field2816 -= a.Field2816;
   }

   public void Method125(Class599 a, Class599 a) {
      this.Field2813 = a.Field2813 - a.Field2813;
      this.Field2814 = a.Field2814 - a.Field2814;
      this.Field2815 = a.Field2815 - a.Field2815;
      this.Field2816 = a.Field2816 - a.Field2816;
   }

   public String Method126() {
      return "[" + this.Field2813 + ", " + this.Field2814 + ", " + this.Field2815 + ", " + this.Field2816 + "]";
   }

   public static void Method127(boolean boolean1) {
      Field2817 = boolean1;
   }

   public static boolean Method128() {
      return Field2817;
   }

   public static boolean Method129() {
      boolean var0 = Method128();
      return true;
   }

   static {
      Method127(false);
   }
}
