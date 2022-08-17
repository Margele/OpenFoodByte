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
      List a = new ArrayList();
      int a = var10000;
      int a = a.readInt();
      int a = 0;
      if (a < a) {
         a.Method2530(a.Method2092());
         ++a;
      }

      (this.Field2623 = new ArrayList()).addAll(a);
      if (a.trash() == null) {
         ++a;
         Method1189(a);
      }

   }

   public void Method688(Class234 a) {
      Method906();
      a.writeInt(this.Method845().Method1799());
      int a = 0;
      if (a < this.Method845().Method1799()) {
         Class606 a = (Class606)this.Method845().get(a);
         a.Method2093(a);
         ++a;
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
