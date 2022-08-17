package awsl;

public class Class107 extends Class119 {
   public Class107() {
      this.Field950 = true;
   }

   public int Method3(int a, int a, int a) {
      int var4 = a & -16777216;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      var5 = (var5 + 255) / 2;
      var6 = (var6 + 255) / 2;
      var7 = (var7 + 255) / 2;
      return var4 | var5 << 16 | var6 << 8 | var7;
   }

   public String toString() {
      return "Colors/Gray Out";
   }
}
