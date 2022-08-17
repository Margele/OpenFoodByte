package awsl;

import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.value.FloatValue;

public class Class396 extends Class397 {
   public FloatValue Field1954;
   public String Field1955;

   public Class396(FloatValue a, Class381 a, int a, int a, String a, String a) {
      super(a, a, a, a, a, a.Method2750(), a.Method2751(), a.Method2752(), a);
      this.Field1954 = a;
      this.Field1958 = this.Field1954.getFloatValue();
      this.Field1920 = "Slider";
   }

   public void Method419(int a, int a1) {
      this.Field1916 = !this.Field1954.Method2756();
   }

   public void Method411(int a, int a) {
      Class390.Method1318();
      super.Method411(a, a);
      if (this.Field1961) {
         this.Field1954.Method2745(this.Field1958);
         GlobalModule.INSTANCE.fileManager.saveValues();
      }

      this.Field1958 = this.Field1954.getFloatValue();
   }
}
