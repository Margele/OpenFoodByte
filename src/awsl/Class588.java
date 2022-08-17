package awsl;

public class Class588 {
   public float Field2775;
   public float Field2776;
   public float Field2777;

   public Class588() {
      this(0.0F, 0.0F, 0.0F);
   }

   public Class588(float[] a) {
      this.Field2775 = a[0];
      this.Field2776 = a[1];
      this.Field2777 = a[2];
   }

   public Class588(float a, float a, float a) {
      this.Field2775 = a;
      this.Field2776 = a;
      this.Field2777 = a;
   }

   public Class588(Class588 a) {
      this.Field2775 = a.Field2775;
      this.Field2776 = a.Field2776;
      this.Field2777 = a.Field2777;
   }

   public void Method311() {
      this.Field2775 = Math.abs(this.Field2775);
      this.Field2776 = Math.abs(this.Field2776);
      this.Field2777 = Math.abs(this.Field2777);
   }

   public void Method312(Class588 a) {
      this.Field2775 = Math.abs(a.Field2775);
      this.Field2776 = Math.abs(a.Field2776);
      this.Field2777 = Math.abs(a.Field2777);
   }

   public void Method313(float a, float a) {
      boolean var3 = Class599.Method128();
      if (this.Field2775 < a) {
         this.Field2775 = a;
      }

      if (this.Field2775 > a) {
         this.Field2775 = a;
      }

      if (this.Field2776 < a) {
         this.Field2776 = a;
      }

      if (this.Field2776 > a) {
         this.Field2776 = a;
      }

      if (this.Field2777 < a) {
         this.Field2777 = a;
      }

      if (this.Field2777 > a) {
         this.Field2777 = a;
      }

   }

   public void Method314(float a, float a, float a) {
      this.Field2775 = a;
      this.Field2776 = a;
      this.Field2777 = a;
   }

   public void Method315(float[] a) {
      this.Field2775 = a[0];
      this.Field2776 = a[1];
      this.Field2777 = a[2];
   }

   public void Method316(Class588 a) {
      this.Field2775 = a.Field2775;
      this.Field2776 = a.Field2776;
      this.Field2777 = a.Field2777;
   }

   public void Method317(Class588 a) {
      a.Field2775 = this.Field2775;
      a.Field2776 = this.Field2776;
      a.Field2777 = this.Field2777;
   }

   public void Method318(float[] a) {
      a[0] = this.Field2775;
      a[1] = this.Field2776;
      a[2] = this.Field2777;
   }

   public void Method319() {
      this.Field2775 = -this.Field2775;
      this.Field2776 = -this.Field2776;
      this.Field2777 = -this.Field2777;
   }

   public void Method320(Class588 a) {
      this.Field2775 = -a.Field2775;
      this.Field2776 = -a.Field2776;
      this.Field2777 = -a.Field2777;
   }

   public void Method321(Class588 a, float a) {
      float a = 1.0F - a;
      this.Field2775 = a * this.Field2775 + a * a.Field2775;
      this.Field2776 = a * this.Field2776 + a * a.Field2776;
      this.Field2777 = a * this.Field2777 + a * a.Field2777;
   }

   public void Method322(float a) {
      this.Field2775 *= a;
      this.Field2776 *= a;
      this.Field2777 *= a;
   }

   public void Method323(Class588 a) {
      this.Field2775 += a.Field2775;
      this.Field2776 += a.Field2776;
      this.Field2777 += a.Field2777;
   }

   public void Method324(Class588 a, Class588 a) {
      this.Field2775 = a.Field2775 + a.Field2775;
      this.Field2776 = a.Field2776 + a.Field2776;
      this.Field2777 = a.Field2777 + a.Field2777;
   }

   public void Method325(Class588 a) {
      this.Field2775 -= a.Field2775;
      this.Field2776 -= a.Field2776;
      this.Field2777 -= a.Field2777;
   }

   public void Method326(Class588 a, Class588 a) {
      this.Field2775 = a.Field2775 - a.Field2775;
      this.Field2776 = a.Field2776 - a.Field2776;
      this.Field2777 = a.Field2777 - a.Field2777;
   }

   public void Method327(float a, Class588 a) {
      this.Field2775 += a * a.Field2775;
      this.Field2776 += a * a.Field2776;
      this.Field2777 += a * a.Field2777;
   }

   public void Method328(float a, Class588 a, Class588 a) {
      this.Field2775 = a * a.Field2775 + a.Field2775;
      this.Field2776 = a * a.Field2776 + a.Field2776;
      this.Field2777 = a * a.Field2777 + a.Field2777;
   }

   public String Method329() {
      return "[" + this.Field2775 + ", " + this.Field2776 + ", " + this.Field2777 + "]";
   }
}
