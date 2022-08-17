package awsl;

import java.util.ArrayList;
import java.util.List;
import obfuscate.a;

public class Class536 implements Class609 {
   private List Field2473;

   public Class536() {
   }

   public Class536(List a) {
      this.Field2473 = a;
   }

   public void Method687(Class234 a) {
      ArrayList var3 = new ArrayList();
      int var4 = a.readInt();
      Class562.Method1190();
      int var5 = 0;
      if (var5 < var4) {
         var3.Method2530(a.Method497());
         ++var5;
         a.trash(new String[3]);
      }

      (this.Field2473 = new ArrayList()).addAll(var3);
   }

   public void Method688(Class234 a) {
      Class562.Method906();
      a.writeInt(this.Method845().Method1799());
      int var3 = 0;
      if (var3 < this.Method845().Method1799()) {
         String var4 = (String)this.Method845().get(var3);
         a.Method496(var4);
         ++var3;
      }

   }

   public void Method794(Class611 a) {
      a.Method3723(this);
   }

   public List Method845() {
      return this.Field2473;
   }

   public void Method694(Class608 class608) {
      this.Method794((Class611)class608);
   }
}
