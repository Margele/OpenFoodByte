package awsl;

import java.util.Iterator;

class Class142 implements Iterator {
   private int Field993;
   private int Field994;
   final Class140 Field995;

   Class142(Class140 a) {
      this.Field995 = a;
      this.Field993 = 0;
      this.Field994 = this.Field995.Field992.length();
   }

   public boolean Method932() {
      return this.Field993 < this.Field994;
   }

   public Integer Method1422() {
      int a = this.Field995.Field992.codePointAt(this.Field993);
      this.Field993 += Character.charCount(a);
      return a;
   }

   public void Method934() {
      throw new UnsupportedOperationException();
   }

   public Object Method933() {
      return this.Method1422();
   }

   private static UnsupportedOperationException Method1423(UnsupportedOperationException unsupportedOperationException) {
      return unsupportedOperationException;
   }
}
