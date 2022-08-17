package awsl;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Class121 extends Class119 {
   private float Field954 = 1.0F;
   private float Field955 = 0.0F;
   private float Field956;
   private float Field957;
   private Random Field958;

   public void Method56(float a) {
      this.Field954 = a;
   }

   public float Method57() {
      return this.Field954;
   }

   public void Method58(float a) {
      this.Field955 = a;
   }

   public float Method59() {
      return this.Field955;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      float a = (1.0F - this.Field954) * (1.0F + this.Field955);
      this.Field956 = a - this.Field955;
      this.Field957 = a;
      this.Field958 = new Random(0L);
      return super.Method62(a, a);
   }

   public int Method3(int a, int a1, int a) {
      int a = a >> 24 & 255;
      float a = this.Field958.nextFloat();
      float a = Class776.Method1708(this.Field956, this.Field957, a);
      return (int)((float)a * a) << 24 | a & 16777215;
   }

   public String toString() {
      return "Stylize/Dissolve...";
   }
}
