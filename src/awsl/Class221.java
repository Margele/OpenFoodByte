package awsl;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import trash.foodbyte.utils.PlayerUtils;

public class Class221 {
   private final ArrayList Field1220 = new ArrayList();
   private Vec3 Field1221 = new Vec3(0.0, 0.0, 0.0);
   private Class210 Field1222;
   private boolean Field1223;
   private float Field1224;
   private float Field1225;
   private float Field1226;
   private double Field1227;
   private double Field1228;
   private double Field1229;
   private double Field1230;
   private final ArrayList Field1231 = new Class703(this);
   private Class670 Field1232;
   private Class659 Field1233;
   private static String[] Field1234;

   public ArrayList Method2151(Vec3 a, Vec3 a, boolean a2, Class670 a, Class659 a) {
      this.Field1221 = a;
      this.Field1233 = a;
      this.Field1223 = false;
      this.Field1222 = null;
      this.Field1232 = a;
      this.Field1224 = (float)((double)MathHelper.floor_double(a.xCoord) + 0.5);
      this.Field1225 = (float)MathHelper.floor_double(a.yCoord);
      this.Field1226 = (float)((double)MathHelper.floor_double(a.zCoord) + 0.5);
      this.Field1220.clear();
      this.Field1220.Method2530(new Class210(new Class685(this), this.Field1221, a));
      long a = System.nanoTime() / 1000000L;
      long a = System.currentTimeMillis();
      int a = 0;

      do {
         if (this.Field1223) {
            this.Field1220.clear();
            this.Method2152();
            return this.Field1222.Method2523();
         }

         ++a;
         this.Field1228 = this.Field1227;
         this.Field1227 = this.Method2155();
         this.Field1229 = this.Field1228 - this.Field1227;
         if (this.Field1229 == 1.0) {
            ++this.Field1230;
         } else {
            this.Field1230 = 0.0;
         }

         if (a > 5000) {
            return null;
         }

         this.Method2153();
      } while(System.nanoTime() / 1000000L - a <= 1000L);

      return null;
   }

   private void Method2152() {
      Vec3 a = null;
      Vec3 a = null;
      ArrayList a = new ArrayList(this.Field1222.Method2523());
      int a = 0;
      Iterator var6 = a.Method1383();

      while(true) {
         while(var6.Method932()) {
            Vec3 a = (Vec3)var6.Method933();
            Vec3 a = a;
            a = new Vec3(a.xCoord - a.xCoord, a.yCoord - a.yCoord, a.zCoord - a.zCoord);
            if (this.Method2159(a, a) && a < 6) {
               this.Field1222.Method2523().remove(a);
               ++a;
               a = a;
            } else {
               a = 0;
               a = a;
            }
         }

         return;
      }
   }

   private void Method2153() {
      // $FF: Couldn't be decompiled
   }

   private double Method2154() {
      double a = 0.0;

      Class210 a;
      for(Iterator var3 = this.Field1220.Method1383(); var3.Method932(); a += a.Method2524()) {
         a = (Class210)var3.Method933();
      }

      return a;
   }

   private double Method2155() {
      double a = Double.MAX_VALUE;
      Iterator var3 = this.Field1220.Method1383();

      while(var3.Method932()) {
         Class210 a = (Class210)var3.Method933();
         if (a.Method2524() < a) {
            a = a.Method2524();
         }
      }

      return a;
   }

   private void Method2156(int a, int a, int a, ArrayList a, Vec3 a, Class210 a) {
      if (!this.Field1223) {
         ArrayList a = new ArrayList(a);
         Vec3 a = new Vec3(a.xCoord + (double)a, a.yCoord + (double)a, a.zCoord + (double)a);
         if (this.Method2158(a, a)) {
            this.Method2157(a, a);
            a.Method2530(a);
            this.Field1220.Method2530(new Class210(a, this.Field1221, this.Field1232));
            a.Method2525(true);
         }
      }
   }

   private void Method2157(Vec3 a, Class210 a) {
      if (this.Method2159(a, this.Field1221)) {
         this.Field1223 = true;
         this.Field1222 = a;
      }

   }

   private boolean Method2158(Vec3 a, Vec3 a) {
      // $FF: Couldn't be decompiled
   }

   private boolean Method2159(Vec3 a, Vec3 a) {
      return Math.abs(a.xCoord - a.xCoord) <= 0.5 && Math.abs(a.yCoord - a.yCoord) <= 0.5 && Math.abs(a.zCoord - a.zCoord) <= 0.5;
   }

   static float Method2160(Class221 a) {
      return a.Field1224;
   }

   static float Method2161(Class221 a) {
      return a.Field1225;
   }

   static float Method2162(Class221 a) {
      return a.Field1226;
   }

   public static void Method2163(String[] arr) {
      Field1234 = arr;
   }

   public static String[] Method2164() {
      return Field1234;
   }

   static {
      if (Method2164() != null) {
         Method2163(new String[5]);
      }

   }
}
