package awsl;

public class Class333 {
   public float Field1617;
   public float Field1618 = 0.3F;
   private float Field1619 = 0.0F;

   public Class333(float a) {
      this.Field1617 = a;
   }

   public Class333(float a, float a) {
      this.Field1617 = a;
      this.Field1618 = a;
   }

   public boolean Method1061(boolean a) {
      this.Field1619 = Class342.Method280(this.Field1619, this.Field1617, Math.max(10.0F, Math.abs(this.Field1619 - this.Field1617) * 40.0F) * this.Field1618);
      return this.Field1619 == this.Field1617;
   }

   public void Method1062(float a) {
      this.Field1619 = a;
   }

   public void Method1063(float a) {
      this.Field1617 = a;
   }

   public int Method1064() {
      return (int)this.Field1619;
   }

   public float Method1065() {
      return this.Field1617;
   }
}
