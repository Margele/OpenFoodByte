package awsl;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Class756 extends Class798 {
   private Class702 Field3298;
   private Class702 Field3299;
   private int Field3300 = 1;
   private BufferedImage Field3301;
   private float Field3302;

   public Class756() {
   }

   public Class756(Class702 a, Class702 a) {
      this.Field3298 = a;
      this.Field3299 = a;
   }

   public void Method1738(Class702 a) {
      this.Field3298 = a;
   }

   public Class702 Method1739() {
      return this.Field3298;
   }

   public void Method1740(Class702 a) {
      this.Field3299 = a;
   }

   public Class702 Method1741() {
      return this.Field3299;
   }

   public void Method9(int a) {
      this.Field3300 = a;
   }

   public int Method10() {
      return this.Field3300;
   }

   public void Method1271(BufferedImage a) {
      this.Field3301 = a;
   }

   public BufferedImage Method1272() {
      return this.Field3301;
   }

   public void Method56(float a) {
      this.Field3302 = a;
   }

   public float Method57() {
      return this.Field3302;
   }

   protected void Method834(Rectangle a) {
      a.width *= this.Field3300;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1270();
      int[] var6 = new int[a * a];
      if (this.Field3301 != null) {
         int[] var7 = this.Method104(this.Field3301, 0, 0, a, a, (int[])null);
         this.Method1742(a, var7, var6, this.Field3298, this.Field3299, a, a, this.Field3302);
      }

      if (this.Field3300 <= 1) {
         this.Field3298.Method1794(a, a, a, this.Field3298, this.Field3299, var6);
      }

      Class702 var10 = new Class702(this.Field3298.Field3030, this.Field3298.Field3031, a, a);
      int var8 = 0;
      if (var8 < this.Field3300) {
         float var9 = (float)var8 / (float)(this.Field3300 - 1);
         this.Field3298.Method1793(var9, this.Field3299, var10);
         this.Field3298.Method1794(a, a, a, this.Field3298, var10, var6);
         ++var8;
      }

      return var6;
   }

   public void Method1742(int[] a, int[] a, int[] a, Class702 a, Class702 a, int a, int a, float a) {
      Class702 var9 = new Class702(a.Field3030, a.Field3031, a, a);
      a.Method1793(a, a, var9);
      a.Method1794(a, a, a, a, var9, a);
      int[] var10 = new int[a * a];
      a.Method1794(a, a, a, a, var9, var10);
      this.Method1278(a, var10, a, a, a);
   }

   public void Method1278(int[] a, int[] a, int a, int a, float a) {
      int var6 = 0;

      for(int var7 = 0; var7 < a; ++var7) {
         for(int var8 = 0; var8 < a; ++var8) {
            a[var6] = Class776.Method1719(a, a[var6], a[var6]);
            ++var6;
         }
      }

   }

   public String toString() {
      return "Distort/Mesh Warp...";
   }
}
