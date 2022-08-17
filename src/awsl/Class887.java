package awsl;

import java.awt.Point;
import java.awt.Rectangle;

public class Class887 extends Class877 {
   private float Field3884;
   private float Field3885;
   private float Field3886;
   private boolean Field3887;

   public Class887() {
      this(3.1415927F);
   }

   public Class887(float a) {
      this(a, true);
   }

   public Class887(float a, boolean a) {
      this.Field3887 = true;
      this.Method56(a);
      this.Field3887 = a;
   }

   public void Method56(float a) {
      this.Field3884 = a;
      this.Field3885 = (float)Math.cos((double)this.Field3884);
      this.Field3886 = (float)Math.sin((double)this.Field3884);
   }

   public float Method57() {
      return this.Field3884;
   }

   protected void Method834(Rectangle a) {
      int a = Class193.Method1270();
      if (this.Field3887) {
         Point a = new Point(0, 0);
         int a = Integer.MAX_VALUE;
         int a = Integer.MAX_VALUE;
         int a = Integer.MIN_VALUE;
         int a = Integer.MIN_VALUE;
         int a = a.width;
         int a = a.height;
         int a = a.x;
         int a = a.y;
         int a = 0;
         if (a < 4) {
            switch (a) {
               case 0:
                  this.Method3567(a, a, a);
               case 1:
                  this.Method3567(a + a, a, a);
               case 2:
                  this.Method3567(a, a + a, a);
               case 3:
                  this.Method3567(a + a, a + a, a);
               default:
                  a = Math.min(a, a.x);
                  a = Math.min(a, a.y);
                  a = Math.max(a, a.x);
                  a = Math.max(a, a.y);
                  ++a;
            }
         }

         a.x = a;
         a.y = a;
         a.width = a - a.x;
         a.height = a - a.y;
      }

   }

   private void Method3567(int a, int a, Point a) {
      a.x = (int)((float)a * this.Field3885 + (float)a * this.Field3886);
      a.y = (int)((float)a * this.Field3885 - (float)a * this.Field3886);
   }

   protected void Method3439(int a, int a, float[] a) {
      a[0] = (float)a * this.Field3885 - (float)a * this.Field3886;
      a[1] = (float)a * this.Field3885 + (float)a * this.Field3886;
   }

   public String toString() {
      return "Rotate " + (int)((double)(this.Field3884 * 180.0F) / Math.PI);
   }
}
