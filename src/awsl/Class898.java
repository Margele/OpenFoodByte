package awsl;

public class Class898 extends Class877 {
   private Class594 Field3982;
   private Class594 Field3983;

   public void Method18(Class594 a) {
      this.Field3982 = a;
   }

   public Class594 Method19() {
      return this.Field3982;
   }

   public void Method3574(Class594 a) {
      this.Field3983 = a;
   }

   public Class594 Method3575() {
      return this.Field3983;
   }

   protected void Method3439(int a, int a, float[] a) {
      float var4 = this.Field3982.Method20((float)a, (float)a);
      float var5 = this.Field3983.Method20((float)a, (float)a);
      a[0] = var4 * (float)this.Field3820.width;
      a[1] = var5 * (float)this.Field3820.height;
   }

   public String toString() {
      return "Distort/Map Coordinates...";
   }
}
