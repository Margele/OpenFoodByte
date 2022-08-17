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
      List a = new ArrayList();
      int a = a.readInt();
      Class562.Method1190();
      int a = 0;
      if (a < a) {
         a.Method2530(a.Method497());
         ++a;
         a.trash(new String[3]);
      }

      (this.Field2473 = new ArrayList()).addAll(a);
   }

   public void Method688(Class234 a) {
      Class562.Method906();
      a.writeInt(this.Method845().Method1799());
      int a = 0;
      if (a < this.Method845().Method1799()) {
         String a = (String)this.Method845().get(a);
         a.Method496(a);
         ++a;
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
