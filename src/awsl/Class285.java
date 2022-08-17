package awsl;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLiquid;
import obfuscate.a;
import trash.foodbyte.utils.PlayerUtils;

public class Class285 {
   private final Class280 Field1543 = new Class280();
   public final Class216 Field1544;
   private final Class216 Field1545;
   public int Field1546;
   private static int Field1547;

   public Class285(Class216 a) {
      this.Field1544 = a;
      this.Field1545 = new Class216((Math.random() * 0.5 - 0.25) * 0.01, Math.random() * 0.25 * 0.01, (Math.random() * 0.5 - 0.25) * 0.01);
      this.Field1543.Method3079();
   }

   public Class285(Class216 a, Class216 a) {
      this.Field1544 = a;
      this.Field1545 = new Class216(a.Field1207 * 0.01, a.Field1208 * 0.01, a.Field1209 * 0.01);
      this.Field1543.Method3079();
   }

   public void Method3096() {
      Method3102();
      Block a = PlayerUtils.getBlock(this.Field1544.Field1207, this.Field1544.Field1208, this.Field1544.Field1209 + this.Field1545.Field1209);
      Class216 var10000;
      if (!(a instanceof BlockAir) && !(a instanceof BlockBush) && !(a instanceof BlockLiquid)) {
         var10000 = this.Field1545;
         var10000.Field1209 *= -0.8;
      }

      Block a = PlayerUtils.getBlock(this.Field1544.Field1207, this.Field1544.Field1208 + this.Field1545.Field1208, this.Field1544.Field1209);
      if (!(a instanceof BlockAir) && !(a instanceof BlockBush) && !(a instanceof BlockLiquid)) {
         var10000 = this.Field1545;
         var10000.Field1207 *= 0.9990000128746033;
         var10000 = this.Field1545;
         var10000.Field1209 *= 0.9990000128746033;
         var10000 = this.Field1545;
         var10000.Field1208 *= -0.6;
      }

      Block a = PlayerUtils.getBlock(this.Field1544.Field1207 + this.Field1545.Field1207, this.Field1544.Field1208, this.Field1544.Field1209);
      if (!(a instanceof BlockAir) && !(a instanceof BlockBush) && !(a instanceof BlockLiquid)) {
         var10000 = this.Field1545;
         var10000.Field1207 *= -0.8;
      }

      this.Method3097();
      if (this.Method3099()) {
         ++this.Field1546;
      }

      a.trash(new String[2]);
   }

   public void Method3097() {
      int var10000 = Method3102();
      Class216 var10001 = this.Field1544;
      var10001.Field1207 += this.Field1545.Field1207;
      int var1 = var10000;
      Class216 var2 = this.Field1544;
      var2.Field1208 += this.Field1545.Field1208;
      var2 = this.Field1544;
      var2.Field1209 += this.Field1545.Field1209;
      var2 = this.Field1545;
      var2.Field1207 /= 0.9999979734420776;
      var2 = this.Field1545;
      var2.Field1208 -= 1.5E-6;
      var2 = this.Field1545;
      var2.Field1209 /= 0.9999979734420776;
      if (a.trash() == null) {
         ++var1;
         Method3100(var1);
      }

   }

   public Class216 Method3098() {
      return this.Field1544;
   }

   public boolean Method3099() {
      Block a = PlayerUtils.getBlock(this.Field1544.Field1207, this.Field1544.Field1208 - 1.0E-5, this.Field1544.Field1209);
      return !(a instanceof BlockAir) && !(a instanceof BlockBush) && !(a instanceof BlockLiquid);
   }

   public static void Method3100(int integer) {
      Field1547 = integer;
   }

   public static int Method3101() {
      return Field1547;
   }

   public static int Method3102() {
      int var0 = Method3101();
      return 83;
   }

   static {
      if (Method3102() != 0) {
         Method3100(53);
      }

   }
}
