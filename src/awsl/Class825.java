package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class Class825 extends Class831 {
   final Class730 Field3666;

   Class825(Class730 a) {
      super(a);
      this.Field3666 = a;
   }

   public void Method3501(String a, Attributes a) {
      HashMap a = new HashMap();
      a.put("local", new ArrayList());
      a.put("stack", new ArrayList());
      this.Field3666.Method1950(a.getValue("type"));
      this.Field3666.Method1950(a.getValue("count") == null ? "0" : a.getValue("count"));
      this.Field3666.Method1950(a);
   }

   public void Method3514(String a) {
      Class831.Method3658();
      HashMap a = (HashMap)this.Field3666.Method1964();
      ArrayList a = (ArrayList)a.Method2665("local");
      int a = a.Method1799();
      Object[] a = a.toArray();
      ArrayList a = (ArrayList)a.Method2665("stack");
      int a = a.Method1799();
      Object[] a = a.toArray();
      String a = (String)this.Field3666.Method1964();
      String a = (String)this.Field3666.Method1964();
      if ("NEW".equals(a)) {
         this.Method3655().Method1845(-1, a, a, a, a);
      }

      if ("FULL".equals(a)) {
         this.Method3655().Method1845(0, a, a, a, a);
      }

      if ("APPEND".equals(a)) {
         this.Method3655().Method1845(1, a, a, 0, (Object[])null);
      }

      if ("CHOP".equals(a)) {
         this.Method3655().Method1845(2, Integer.parseInt(a), (Object[])null, 0, (Object[])null);
      }

      if ("SAME".equals(a)) {
         this.Method3655().Method1845(3, 0, (Object[])null, 0, (Object[])null);
      }

      if ("SAME1".equals(a)) {
         this.Method3655().Method1845(4, 0, (Object[])null, a, a);
      }

   }
}
