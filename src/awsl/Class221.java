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

   public ArrayList Method2151(Vec3 a, Vec3 a, boolean a, Class670 a, Class659 a) {
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
      long var6 = System.nanoTime() / 1000000L;
      long var8 = System.currentTimeMillis();
      int var10 = 0;

      do {
         if (this.Field1223) {
            this.Field1220.clear();
            this.Method2152();
            return this.Field1222.Method2523();
         }

         ++var10;
         this.Field1228 = this.Field1227;
         this.Field1227 = this.Method2155();
         this.Field1229 = this.Field1228 - this.Field1227;
         if (this.Field1229 == 1.0) {
            ++this.Field1230;
         } else {
            this.Field1230 = 0.0;
         }

         if (var10 > 5000) {
            return null;
         }

         this.Method2153();
      } while(System.nanoTime() / 1000000L - var6 <= 1000L);

      return null;
   }

   private void Method2152() {
      Vec3 var1 = null;
      Vec3 var2 = null;
      ArrayList var4 = new ArrayList(this.Field1222.Method2523());
      int var5 = 0;
      Iterator var6 = var4.Method1383();

      while(true) {
         while(var6.Method932()) {
            Vec3 var7 = (Vec3)var6.Method933();
            Vec3 var3 = var2;
            var2 = new Vec3(var1.xCoord - var7.xCoord, var1.yCoord - var7.yCoord, var1.zCoord - var7.zCoord);
            if (this.Method2159(var3, var2) && var5 < 6) {
               this.Field1222.Method2523().remove(var1);
               ++var5;
               var1 = var7;
            } else {
               var5 = 0;
               var1 = var7;
            }
         }

         return;
      }
   }

   private void Method2153() {
      // $FF: Couldn't be decompiled
   }

   private double Method2154() {
      double var1 = 0.0;

      Class210 var4;
      for(Iterator var3 = this.Field1220.Method1383(); var3.Method932(); var1 += var4.Method2524()) {
         var4 = (Class210)var3.Method933();
      }

      return var1;
   }

   private double Method2155() {
      double var1 = Double.MAX_VALUE;
      Iterator var3 = this.Field1220.Method1383();

      while(var3.Method932()) {
         Class210 var4 = (Class210)var3.Method933();
         if (var4.Method2524() < var1) {
            var1 = var4.Method2524();
         }
      }

      return var1;
   }

   private void Method2156(int a, int a, int a, ArrayList a, Vec3 a, Class210 a) {
      if (!this.Field1223) {
         ArrayList var7 = new ArrayList(a);
         Vec3 var8 = new Vec3(a.xCoord + (double)a, a.yCoord + (double)a, a.zCoord + (double)a);
         if (this.Method2158(var8, a)) {
            this.Method2157(var8, a);
            var7.Method2530(var8);
            this.Field1220.Method2530(new Class210(var7, this.Field1221, this.Field1232));
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
