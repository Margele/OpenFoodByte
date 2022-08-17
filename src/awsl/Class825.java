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
      HashMap var3 = new HashMap();
      var3.put("local", new ArrayList());
      var3.put("stack", new ArrayList());
      this.Field3666.Method1950(a.getValue("type"));
      this.Field3666.Method1950(a.getValue("count") == null ? "0" : a.getValue("count"));
      this.Field3666.Method1950(var3);
   }

   public void Method3514(String a) {
      Class831.Method3658();
      HashMap var3 = (HashMap)this.Field3666.Method1964();
      ArrayList var4 = (ArrayList)var3.Method2665("local");
      int var5 = var4.Method1799();
      Object[] var6 = var4.toArray();
      ArrayList var7 = (ArrayList)var3.Method2665("stack");
      int var8 = var7.Method1799();
      Object[] var9 = var7.toArray();
      String var10 = (String)this.Field3666.Method1964();
      String var11 = (String)this.Field3666.Method1964();
      if ("NEW".equals(var11)) {
         this.Method3655().Method1845(-1, var5, var6, var8, var9);
      }

      if ("FULL".equals(var11)) {
         this.Method3655().Method1845(0, var5, var6, var8, var9);
      }

      if ("APPEND".equals(var11)) {
         this.Method3655().Method1845(1, var5, var6, 0, (Object[])null);
      }

      if ("CHOP".equals(var11)) {
         this.Method3655().Method1845(2, Integer.parseInt(var10), (Object[])null, 0, (Object[])null);
      }

      if ("SAME".equals(var11)) {
         this.Method3655().Method1845(3, 0, (Object[])null, 0, (Object[])null);
      }

      if ("SAME1".equals(var11)) {
         this.Method3655().Method1845(4, 0, (Object[])null, var8, var9);
      }

   }
}
