package awsl;

public class Class56 extends Class119 {
   private int Field606;
   private int Field607;
   private int Field608;
   private int Field609;

   public Class56() {
      this(127);
   }

   public Class56(int a) {
      this.Field608 = 16777215;
      this.Field609 = 0;
      this.Method9(a);
      this.Method11(a);
   }

   public void Method9(int a) {
      this.Field606 = a;
   }

   public int Method10() {
      return this.Field606;
   }

   public void Method11(int a) {
      this.Field607 = a;
   }

   public int Method12() {
      return this.Field607;
   }

   public void Method13(int a) {
      this.Field608 = a;
   }

   public int Method14() {
      return this.Field608;
   }

   public void Method15(int a) {
      this.Field609 = a;
   }

   public int Method16() {
      return this.Field609;
   }

   public int Method3(int a, int a, int a) {
      int var4 = Class767.Method1689(a);
      float var5 = Class776.Method1708((float)this.Field606, (float)this.Field607, (float)var4);
      return a & -16777216 | Class776.Method1719(var5, this.Field609, this.Field608) & 16777215;
   }

   public String toString() {
      return "Stylize/Threshold...";
   }
}
