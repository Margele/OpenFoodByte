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
      boolean var2 = Class193.Method1270();
      if (this.Field3887) {
         Point var3 = new Point(0, 0);
         int var4 = Integer.MAX_VALUE;
         int var5 = Integer.MAX_VALUE;
         int var6 = Integer.MIN_VALUE;
         int var7 = Integer.MIN_VALUE;
         int var8 = a.width;
         int var9 = a.height;
         int var10 = a.x;
         int var11 = a.y;
         int var12 = 0;
         if (var12 < 4) {
            switch (var12) {
               case 0:
                  this.Method3567(var10, var11, var3);
               case 1:
                  this.Method3567(var10 + var8, var11, var3);
               case 2:
                  this.Method3567(var10, var11 + var9, var3);
               case 3:
                  this.Method3567(var10 + var8, var11 + var9, var3);
               default:
                  var4 = Math.min(var4, var3.x);
                  var5 = Math.min(var5, var3.y);
                  var6 = Math.max(var6, var3.x);
                  var7 = Math.max(var7, var3.y);
                  ++var12;
            }
         }

         a.x = var4;
         a.y = var5;
         a.width = var6 - a.x;
         a.height = var7 - a.y;
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
