package awsl;

import java.util.ArrayList;
import java.util.List;
import obfuscate.a;

public class Class562 implements Class609 {
   private List Field2623;
   private static int Field2624;

   public Class562() {
   }

   public Class562(List a) {
      this.Field2623 = a;
   }

   public void Method687(Class234 a) {
      int var10000 = Method906();
      ArrayList var3 = new ArrayList();
      int var2 = var10000;
      int var4 = a.readInt();
      int var5 = 0;
      if (var5 < var4) {
         var3.Method2530(a.Method2092());
         ++var5;
      }

      (this.Field2623 = new ArrayList()).addAll(var3);
      if (a.trash() == null) {
         ++var2;
         Method1189(var2);
      }

   }

   public void Method688(Class234 a) {
      Method906();
      a.writeInt(this.Method845().Method1799());
      int var3 = 0;
      if (var3 < this.Method845().Method1799()) {
         Class606 var4 = (Class606)this.Method845().get(var3);
         a.Method2093(var4);
         ++var3;
      }

   }

   public void Method794(Class611 a) {
      a.Method3718(this);
   }

   public List Method845() {
      return this.Field2623;
   }

   public void Method694(Class608 class608) {
      this.Method794((Class611)class608);
   }

   public static void Method1189(int integer) {
      Field2624 = integer;
   }

   public static int Method906() {
      return Field2624;
   }

   public static int Method1190() {
      int var0 = Method906();
      return 19;
   }

   static {
      if (Method906() == 0) {
         Method1189(31);
      }

   }
}
