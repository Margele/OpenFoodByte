package awsl;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Class117 extends Class119 implements Cloneable {
   public static final int Field917 = 0;
   public static final int Field918 = 1;
   public static final int Field919 = 2;
   public static final int Field920 = 3;
   public static final int Field921 = 4;
   private float Field922 = 32.0F;
   private float Field923 = 1.0F;
   private float Field924 = 0.0F;
   private float Field925 = 1.0F;
   private float Field926 = 1.0F;
   private float Field927 = 4.0F;
   private float Field928 = 2.0F;
   private float Field929 = 0.5F;
   private float Field930 = 0.5F;
   private int Field931;
   private float Field932 = 1.0F;
   private float Field933 = 0.0F;
   private float Field934 = 0.0F;
   private float Field935 = 1.0F;
   private float Field936;
   private float Field937;
   private Class755 Field938 = new Class758();
   private boolean Field939;
   private Class591 Field940;
   protected Random Field941 = new Random();
   private int Field942 = 0;
   private Class594 Field943;

   public Class117() {
      this.Method11(0);
   }

   public void Method56(float a) {
      this.Field925 = a;
   }

   public float Method57() {
      return this.Field925;
   }

   public void Method9(int a) {
      this.Field931 = a;
   }

   public int Method10() {
      return this.Field931;
   }

   public void Method58(float a) {
      this.Field922 = a;
   }

   public float Method59() {
      return this.Field922;
   }

   public void Method60(float a) {
      this.Field923 = a;
   }

   public float Method61() {
      return this.Field923;
   }

   public void Method164(float a) {
      this.Field924 = a;
      float a = (float)Math.cos((double)this.Field924);
      float a = (float)Math.sin((double)this.Field924);
      this.Field932 = a;
      this.Field933 = a;
      this.Field934 = -a;
      this.Field935 = a;
   }

   public float Method165() {
      return this.Field924;
   }

   public void Method166(float a) {
      this.Field927 = a;
   }

   public float Method167() {
      return this.Field927;
   }

   public void Method168(float a) {
      this.Field926 = a;
   }

   public float Method169() {
      return this.Field926;
   }

   public void Method170(float a) {
      this.Field928 = a;
   }

   public float Method171() {
      return this.Field928;
   }

   public void Method172(float a) {
      this.Field929 = a;
   }

   public float Method173() {
      return this.Field929;
   }

   public void Method174(float a) {
      this.Field930 = a;
   }

   public float Method175() {
      return this.Field930;
   }

   public void Method176(Class755 a) {
      this.Field938 = a;
   }

   public Class755 Method177() {
      return this.Field938;
   }

   public void Method11(int a) {
      Class193.Method1270();
      this.Field942 = a;
      switch (a) {
         case 0:
         default:
            this.Field943 = new Class598();
         case 1:
            this.Field943 = new Class583();
         case 2:
            this.Field943 = new Class585();
         case 3:
            this.Field943 = new Class584();
         case 4:
            this.Field943 = new Class616();
      }
   }

   public int Method12() {
      return this.Field942;
   }

   public void Method18(Class594 a) {
      this.Field943 = a;
   }

   public Class594 Method19() {
      return this.Field943;
   }

   protected Class591 Method178(float a, float a, float a) {
      Class591 a = new Class591(a, a, a, this.Field943);
      float[] a = Class598.Method163(a, (float[])null);
      this.Field936 = a[0];
      this.Field937 = a[1];
      return a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field940 = this.Method178(this.Field926, this.Field928, this.Field927);
      return super.Method62(a, a);
   }

   public int Method3(int a, int a, int a) {
      float a = this.Field932 * (float)a + this.Field933 * (float)a;
      float a = this.Field934 * (float)a + this.Field935 * (float)a;
      a /= this.Field922;
      Class193.Method1270();
      a /= this.Field922 * this.Field923;
      float a = this.Field940.Method20(a, a);
      a = (a - this.Field936) / (this.Field937 - this.Field936);
      a = Class776.Method1704(a, this.Field929);
      a = Class776.Method1703(a, this.Field930);
      a *= this.Field925;
      int a = a & -16777216;
      if (this.Field938 != null) {
         this.Field938.Method283(a);
      }

      int a = Class767.Method1687((int)(a * 255.0F));
      int a = a << 16;
      int a = a << 8;
      a |= a | a | a;
      if (this.Field931 != 0) {
         a = Class767.Method1691(a, a, this.Field931);
      }

      return a;
   }

   public String toString() {
      return "Texture/Fractal Brownian Motion...";
   }
}
