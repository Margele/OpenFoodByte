package awsl;

import java.util.Iterator;
import java.util.List;

public class Class794 {
   public Class104 Field3559;
   public Class104 Field3560;
   public Class104 Field3561;
   public String Field3562;
   public List Field3563;
   public List Field3564;

   public Class794(Class104 a, Class104 a, Class104 a, String a) {
      this.Field3559 = a;
      this.Field3560 = a;
      this.Field3561 = a;
      this.Field3562 = a;
   }

   public void Method795(int a) {
      Class15.Method1984();
      int a = 1107296256 | a << 8;
      Iterator var4;
      Class126 a;
      if (this.Field3563 != null) {
         var4 = this.Field3563.Method1383();
         if (var4.Method932()) {
            a = (Class126)var4.Method933();
            a.Field975 = a;
         }
      }

      if (this.Field3564 != null) {
         var4 = this.Field3564.Method1383();
         if (var4.Method932()) {
            a = (Class126)var4.Method933();
            a.Field975 = a;
         }
      }

   }

   public void Method796(Class267 a) {
      int a = Class15.Method1984();
      a.Method1960(this.Field3559.Method303(), this.Field3560.Method303(), this.Field3561 == null ? null : this.Field3561.Method303(), this.Field3562);
      int a = this.Field3563 == null ? 0 : this.Field3563.Method1799();
      int a = 0;
      Class126 a;
      if (a < a) {
         a = (Class126)this.Field3563.get(a);
         a.Method646(a.Method1974(a.Field975, a.Field976, a.Field973, true));
         ++a;
      }

      a = this.Field3564 == null ? 0 : this.Field3564.Method1799();
      int a = 0;
      if (a < a) {
         a = (Class126)this.Field3564.get(a);
         a.Method646(a.Method1974(a.Field975, a.Field976, a.Field973, false));
         a = a + 1;
      }

   }
}
