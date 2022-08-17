package awsl;

import java.io.IOException;
import java.math.BigDecimal;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.FloatValue;

public class Class397 extends Class390 {
   public float Field1956;
   public float Field1957;
   public float Field1958;
   public FloatValue Field1959;
   public float Field1960;
   protected boolean Field1961;

   public Class397(FloatValue a, Class381 a, int a, int a, String a, float a, float a, float a, String a) {
      super(a, a, a, a, a);
      this.Field1959 = a;
      this.Field1956 = a;
      this.Field1957 = a;
      this.Field1960 = a;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 15;
      this.Field1920 = "BasicSlider";
   }

   public void Method419(int a, int a) {
      this.Field1916 = !this.Field1959.Method2756();
   }

   public void Method411(int a, int a) {
      label30: {
         Class390.Method1318();
         super.Method411(a, a);
         if (this.Field1961) {
            this.Field1958 = MathUtils.Method547((float)(a - (this.Field1907 + 4)), 0.0F, (float)(this.Method1310() - 11), this.Field1959.Method2750(), this.Field1959.Method2751());
            this.Field1958 = (float)((double)Math.round((double)this.Field1958 * (1.0 / (double)this.Field1960)) / (1.0 / (double)this.Field1960));
            this.Field1958 = (float)Math.round(this.Field1958 * 100.0F) / 100.0F;
            if (this.Field1958 > this.Field1957) {
               this.Field1958 = this.Field1957;
            }

            if (!(this.Field1958 < this.Field1956)) {
               break label30;
            }

            this.Field1958 = this.Field1956;
         }

         if (this.Field1958 > this.Field1957) {
            this.Field1958 = this.Field1957;
            this.Field1959.Method2745(this.Field1958);
            GlobalModule.INSTANCE.fileManager.saveValues();
         }

         if (this.Field1958 < this.Field1956) {
            this.Field1958 = this.Field1956;
            this.Field1959.Method2745(this.Field1958);
            GlobalModule.INSTANCE.fileManager.saveValues();
         }
      }

      if (this.Field1915) {
         GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
      }

   }

   public void Method412(int a, int a) {
      int var10000 = Class390.Method1318();
      String var4 = this.Method1355((double)this.Field1958, 2);
      var4 = (new BigDecimal((double)this.Field1958)).setScale(2, 4).floatValue() + "";
      int var3 = var10000;
      if (this.Field1958 % 1.0F != 0.0F) {
         var4 = (new BigDecimal((double)this.Field1958)).setScale(2, 4).floatValue() + "";
      }

      var4 = (new BigDecimal((double)this.Field1958)).setScale(0, 4).toString();
      if (this.Field1959.Method2719() != null) {
         var4 = var4 + this.Field1959.Method2719();
      }

      Class565.Field2636.Method1217(var4, (float)(this.Field1907 + this.Method1310()) - Class565.Field2635.Method1225(var4) - 4.0F, (float)(this.Field1908 + 1), 16777215);
      Class565.Field2636.Method1217(this.Field1913, (float)(this.Field1907 + 5), (float)(this.Field1908 + 1), 16777215);
      RenderUtils.Method1103((float)(this.Field1907 + 5), (float)(this.Field1908 + this.Field1910 - 4), (float)(this.Method1310() - 10), 1.0F, Class707.Method1832() + 1342177280);
      RenderUtils.Method1103((float)(this.Field1907 + 5), (float)(this.Field1908 + this.Field1910 - 4), MathUtils.Method547(this.Field1958, this.Field1956, this.Field1957, 0.0F, (float)(this.Method1310() - 10)), 1.0F, Class707.Method1832());
      float var5 = (float)(this.Method1310() - 12);
      float var6 = (this.Field1958 - this.Field1956) / (this.Field1957 - this.Field1956);
      RenderUtils.Method1103((float)(this.Field1907 + 5) + var5 * var6, (float)(this.Field1908 + this.Field1910 - 5), 2.0F, 3.0F, Class707.Method1832());
      if (a.trash() == null) {
         ++var3;
         Class390.Method1316(var3);
      }

   }

   private String Method1355(double a, int a) {
      BigDecimal var4 = new BigDecimal(Double.toString(a));
      var4 = var4.setScale(a, 4);
      return String.valueOf(var4);
   }

   public void Method1315(char a, int a) throws IOException {
      int var3 = Class390.Method1317();
      if (this.Field1915) {
         switch (a) {
            case 203:
               if (!(this.Field1958 > this.Field1956) || this.Field1958 == this.Field1956) {
                  break;
               }

               this.Field1958 -= this.Field1960;
               this.Field1958 = (float)Math.round(this.Field1958 * 100.0F) / 100.0F;
               this.Field1959.Method2745(this.Field1958);
               GlobalModule.INSTANCE.fileManager.saveValues();
            case 205:
               if (this.Field1958 < this.Field1957 && this.Field1958 != this.Field1957) {
                  this.Field1958 += this.Field1960;
                  this.Field1958 = (float)Math.round(this.Field1958 * 100.0F) / 100.0F;
                  this.Field1959.Method2745(this.Field1958);
                  GlobalModule.INSTANCE.fileManager.saveValues();
               }
         }

      }
   }

   public void Method413(int a, int a, boolean a) {
      this.Field1915 = this.Method1312(a, a) && this.Field1919.Method1392(a, a);
      if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown(0)) {
         this.Field1961 = true;
      }

      this.Field1961 = false;
      this.Field1918 = a;
   }

   public void Method414() {
      super.Method414();
      if (!Mouse.isButtonDown(0)) {
         this.Field1961 = false;
      }

   }

   private static IOException Method418(IOException iOException) {
      return iOException;
   }
}
