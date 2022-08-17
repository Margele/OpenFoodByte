package awsl;

import java.io.PrintStream;

class Class764 {
   int Field3380;
   int Field3381;
   Class764 Field3382;
   Class764[] Field3383;
   boolean Field3384;
   int Field3385;
   int Field3386;
   int Field3387;
   int Field3388;
   int Field3389;
   final Class765 Field3390;

   Class764(Class765 a) {
      this.Field3390 = a;
      this.Field3383 = new Class764[8];
   }

   public void Method1776(PrintStream a, int a) {
      Class193.Method1269();
      int var4 = 0;
      if (var4 < a) {
         System.out.print(' ');
         ++var4;
      }

      if (this.Field3385 == 0) {
         System.out.println(this.Field3389 + ": count=" + this.Field3385);
      }

      System.out.println(this.Field3389 + ": count=" + this.Field3385 + " red=" + this.Field3386 / this.Field3385 + " green=" + this.Field3387 / this.Field3385 + " blue=" + this.Field3388 / this.Field3385);
      byte var5 = 0;
      if (var5 < 8) {
         if (this.Field3383[var5] != null) {
            this.Field3383[var5].Method1776(a, a + 2);
         }

         var4 = var5 + 1;
      }

   }
}
