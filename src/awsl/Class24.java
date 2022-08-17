package awsl;

public class Class24 extends Class119 {
   private Class755 Field236 = new Class758();

   public Class24() {
      this.Field950 = true;
   }

   public Class24(Class755 a) {
      this.Field950 = true;
      this.Field236 = a;
   }

   public void Method176(Class755 a) {
      this.Field236 = a;
   }

   public Class755 Method177() {
      return this.Field236;
   }

   public int Method3(int a, int a, int a) {
      int var4 = a >> 16 & 255;
      int var5 = a >> 8 & 255;
      int var6 = a & 255;
      a = (var4 + var5 + var6) / 3;
      return this.Field236.Method283((float)a / 255.0F);
   }

   public String toString() {
      return "Colors/Lookup...";
   }
}
