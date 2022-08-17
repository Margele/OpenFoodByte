package awsl;

public class Class602 extends Class599 {
   public Class602() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class602(float[] a) {
      this.Field2813 = a[0];
      this.Field2814 = a[1];
      this.Field2815 = a[2];
      this.Field2816 = a[3];
   }

   public Class602(float a, float a, float a, float a) {
      this.Field2813 = a;
      this.Field2814 = a;
      this.Field2815 = a;
      this.Field2816 = a;
   }

   public Class602(Class602 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public Class602(Class599 a) {
      this.Field2813 = a.Field2813;
      this.Field2814 = a.Field2814;
      this.Field2815 = a.Field2815;
      this.Field2816 = a.Field2816;
   }

   public void Method3691(Class586 a) {
      float a = a.Field2758 * 0.5F;
      float a = (float)Math.cos((double)a);
      float a = (float)Math.sin((double)a);
      this.Field2813 = a.Field2755 * a;
      this.Field2814 = a.Field2756 * a;
      this.Field2815 = a.Field2757 * a;
      this.Field2816 = a;
   }

   public void Method3690() {
      float a = 1.0F / (this.Field2813 * this.Field2813 + this.Field2814 * this.Field2814 + this.Field2815 * this.Field2815 + this.Field2816 * this.Field2816);
      this.Field2813 *= a;
      this.Field2814 *= a;
      this.Field2815 *= a;
      this.Field2816 *= a;
   }

   public void Method3692(Class587 a) {
      Class599.Method129();
      float a = a.Field2759 + a.Field2764 + a.Field2769;
      float a;
      if ((double)a > 0.0) {
         a = (float)Math.sqrt((double)(a + 1.0F));
         this.Field2816 = a / 2.0F;
         a = 0.5F / a;
         this.Field2813 = (a.Field2765 - a.Field2768) * a;
         this.Field2814 = (a.Field2767 - a.Field2761) * a;
         this.Field2815 = (a.Field2760 - a.Field2763) * a;
      }

      byte a;
      label35: {
         a = 0;
         if (a.Field2764 > a.Field2759) {
            a = 1;
            if (!(a.Field2769 > a.Field2764)) {
               break label35;
            }

            a = 2;
         }

         if (a.Field2769 > a.Field2759) {
            a = 2;
         }
      }

      switch (a) {
         case 0:
            a = (float)Math.sqrt((double)(a.Field2759 - (a.Field2764 + a.Field2769) + 1.0F));
            this.Field2813 = a * 0.5F;
            if ((double)a != 0.0) {
               a = 0.5F / a;
            }

            this.Field2816 = (a.Field2765 - a.Field2768) * a;
            this.Field2814 = (a.Field2760 + a.Field2763) * a;
            this.Field2815 = (a.Field2761 + a.Field2767) * a;
         case 1:
            a = (float)Math.sqrt((double)(a.Field2764 - (a.Field2769 + a.Field2759) + 1.0F));
            this.Field2814 = a * 0.5F;
            if ((double)a != 0.0) {
               a = 0.5F / a;
            }

            this.Field2816 = (a.Field2767 - a.Field2761) * a;
            this.Field2815 = (a.Field2765 + a.Field2768) * a;
            this.Field2813 = (a.Field2763 + a.Field2760) * a;
         case 2:
            a = (float)Math.sqrt((double)(a.Field2759 - (a.Field2764 + a.Field2769) + 1.0F));
            this.Field2815 = a * 0.5F;
            if ((double)a != 0.0) {
               a = 0.5F / a;
            }

            this.Field2816 = (a.Field2760 - a.Field2763) * a;
            this.Field2813 = (a.Field2767 + a.Field2761) * a;
            this.Field2814 = (a.Field2768 + a.Field2765) * a;
         default:
      }
   }
}
