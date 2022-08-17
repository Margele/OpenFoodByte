package awsl;

public class Class49 extends Class62 {
   private Class744[] Field586 = new Class744[1];

   public Class49() {
      this.Field586 = new Class744[3];
      this.Field586[0] = new Class744();
      this.Field586[1] = new Class744();
      this.Field586[2] = new Class744();
   }

   protected void Method89() {
      Class193.Method1270();
      this.Field633 = true;
      if (this.Field586.length == 1) {
         this.Field630 = this.Field631 = this.Field632 = this.Field586[0].Method1675();
      }

      this.Field630 = this.Field586[0].Method1675();
      this.Field631 = this.Field586[1].Method1675();
      this.Field632 = this.Field586[2].Method1675();
   }

   public void Method3201(Class744 a) {
      this.Field586 = new Class744[]{a};
      this.Field633 = false;
   }

   public void Method3202(Class744[] a) {
      if (a.length != 1 && a.length != 3) {
         throw new IllegalArgumentException("Curves must be length 1 or 3");
      } else {
         this.Field586 = a;
         this.Field633 = false;
      }
   }

   public Class744[] Method3203() {
      return this.Field586;
   }

   public String toString() {
      return "Colors/Curves...";
   }

   private static IllegalArgumentException Method2508(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
