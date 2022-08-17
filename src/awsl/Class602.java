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
      float var2 = a.Field2758 * 0.5F;
      float var3 = (float)Math.cos((double)var2);
      float var4 = (float)Math.sin((double)var2);
      this.Field2813 = a.Field2755 * var4;
      this.Field2814 = a.Field2756 * var4;
      this.Field2815 = a.Field2757 * var4;
      this.Field2816 = var3;
   }

   public void Method3690() {
      float var1 = 1.0F / (this.Field2813 * this.Field2813 + this.Field2814 * this.Field2814 + this.Field2815 * this.Field2815 + this.Field2816 * this.Field2816);
      this.Field2813 *= var1;
      this.Field2814 *= var1;
      this.Field2815 *= var1;
      this.Field2816 *= var1;
   }

   public void Method3692(Class587 a) {
      Class599.Method129();
      float var5 = a.Field2759 + a.Field2764 + a.Field2769;
      float var3;
      if ((double)var5 > 0.0) {
         var3 = (float)Math.sqrt((double)(var5 + 1.0F));
         this.Field2816 = var3 / 2.0F;
         var3 = 0.5F / var3;
         this.Field2813 = (a.Field2765 - a.Field2768) * var3;
         this.Field2814 = (a.Field2767 - a.Field2761) * var3;
         this.Field2815 = (a.Field2760 - a.Field2763) * var3;
      }

      byte var4;
      label35: {
         var4 = 0;
         if (a.Field2764 > a.Field2759) {
            var4 = 1;
            if (!(a.Field2769 > a.Field2764)) {
               break label35;
            }

            var4 = 2;
         }

         if (a.Field2769 > a.Field2759) {
            var4 = 2;
         }
      }

      switch (var4) {
         case 0:
            var3 = (float)Math.sqrt((double)(a.Field2759 - (a.Field2764 + a.Field2769) + 1.0F));
            this.Field2813 = var3 * 0.5F;
            if ((double)var3 != 0.0) {
               var3 = 0.5F / var3;
            }

            this.Field2816 = (a.Field2765 - a.Field2768) * var3;
            this.Field2814 = (a.Field2760 + a.Field2763) * var3;
            this.Field2815 = (a.Field2761 + a.Field2767) * var3;
         case 1:
            var3 = (float)Math.sqrt((double)(a.Field2764 - (a.Field2769 + a.Field2759) + 1.0F));
            this.Field2814 = var3 * 0.5F;
            if ((double)var3 != 0.0) {
               var3 = 0.5F / var3;
            }

            this.Field2816 = (a.Field2767 - a.Field2761) * var3;
            this.Field2815 = (a.Field2765 + a.Field2768) * var3;
            this.Field2813 = (a.Field2763 + a.Field2760) * var3;
         case 2:
            var3 = (float)Math.sqrt((double)(a.Field2759 - (a.Field2764 + a.Field2769) + 1.0F));
            this.Field2815 = var3 * 0.5F;
            if ((double)var3 != 0.0) {
               var3 = 0.5F / var3;
            }

            this.Field2816 = (a.Field2760 - a.Field2763) * var3;
            this.Field2813 = (a.Field2767 + a.Field2761) * var3;
            this.Field2814 = (a.Field2768 + a.Field2765) * var3;
         default:
      }
   }
}
