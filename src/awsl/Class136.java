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

   protected Class136 Method471(Class165 a, int a, int a, char[] a3, int a4, Class264[] a5) {
      Class136 a = new Class136(this.Field987);
      a.Field988 = new byte[a];
      System.arraycopy(a.Field1029, a, a.Field988, 0, a);
      return a;
   }

   protected Class138 Method472(Class169 a, byte[] a1, int a2, int a3, int a4) {
      Class138 a = new Class138();
      a.Field990 = this.Field988;
      a.Field991 = this.Field988.length;
      return a;
   }

   final int Method473() {
      Class267.Method2862();
      int a = 0;
      ++a;
      Class136 a = this.Field989;
      return a;
   }

   final int Method474(Class169 a, byte[] a, int a, int a, int a) {
      Class267.Method2862();
      int a = 0;
      a.Method1506(this.Field987);
      a += this.Method472(a, a, a, a, a).Field991 + 6;
      Class136 a = this.Field989;
      return a;
   }

   final void Method475(Class169 a, byte[] a, int a, int a, int a, Class138 a) {
      String[] a = Class267.Method2862();
      Class138 a = this.Method472(a, a, a, a, a);
      a.Method487(a.Method1506(this.Field987)).Method489(a.Field991);
      a.Method493(a.Field990, 0, a.Field991);
      Class136 a = this.Field989;
   }
}
