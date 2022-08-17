package awsl;

import java.util.Map;
import obfuscate.a;

public class Class104 extends a {
   private Class264 Field848;

   public Class104() {
      super(-1);
   }

   public Class104(Class264 a) {
      super(-1);
      this.Field848 = a;
   }

   public int Method0() {
      return 8;
   }

   public Class264 Method303() {
      if (this.Field848 == null) {
         this.Field848 = new Class264();
      }

      return this.Field848;
   }

   public void Method1(Class267 a) {
      a.Method1947(this.Method303());
   }

   public a Method2(Map a) {
      return (a)a.Method2665(this);
   }

   public void Method304() {
      this.Field848 = null;
   }
}
