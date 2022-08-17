package awsl;

public class Class136 {
   public final String Field987;
   byte[] Field988;
   Class136 Field989;

   protected Class136(String a) {
      this.Field987 = a;
   }

   public boolean Method468() {
      return true;
   }

   public boolean Method469() {
      return false;
   }

   protected Class264[] Method470() {
      return null;
   }

   protected Class136 Method471(Class165 a, int a, int a, char[] a, int a, Class264[] a) {
      Class136 var7 = new Class136(this.Field987);
      var7.Field988 = new byte[a];
      System.arraycopy(a.Field1029, a, var7.Field988, 0, a);
      return var7;
   }

   protected Class138 Method472(Class169 a, byte[] a, int a, int a, int a) {
      Class138 var6 = new Class138();
      var6.Field990 = this.Field988;
      var6.Field991 = this.Field988.length;
      return var6;
   }

   final int Method473() {
      Class267.Method2862();
      int var2 = 0;
      ++var2;
      Class136 var3 = this.Field989;
      return var2;
   }

   final int Method474(Class169 a, byte[] a, int a, int a, int a) {
      Class267.Method2862();
      int var8 = 0;
      a.Method1506(this.Field987);
      var8 += this.Method472(a, a, a, a, a).Field991 + 6;
      Class136 var7 = this.Field989;
      return var8;
   }

   final void Method475(Class169 a, byte[] a, int a, int a, int a, Class138 a) {
      String[] var7 = Class267.Method2862();
      Class138 var9 = this.Method472(a, a, a, a, a);
      a.Method487(a.Method1506(this.Field987)).Method489(var9.Field991);
      a.Method493(var9.Field990, 0, var9.Field991);
      Class136 var8 = this.Field989;
   }
}
