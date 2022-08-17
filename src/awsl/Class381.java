package awsl;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class381 {
   private String Field1842;
   private String Field1843;
   private ArrayList Field1844 = new ArrayList();
   private boolean Field1845;
   private boolean Field1846;
   public boolean Field1847;
   private boolean Field1848;
   private boolean Field1849;
   public int Field1850;
   public int Field1851;
   public int Field1852;
   public int Field1853;
   private int Field1854;
   private int Field1855;
   private boolean Field1856;
   private int Field1857;
   private float Field1858;
   private boolean Field1859;
   private int Field1860;
   private boolean Field1861;
   private int Field1862;
   private Class349 Field1863 = new Class349(0.005);
   private Class349 Field1864 = new Class349(0.005);
   public Class349 Field1865 = new Class349(0.005);
   private boolean Field1866;
   private boolean Field1867;
   private boolean Field1868;
   public float Field1869;
   public float Field1870;
   public float Field1871;
   public float Field1872;
   public int Field1873 = 15;
   public int Field1874 = 80;
   public int Field1875 = 100;
   public int Field1876 = 15;
   public int Field1877 = 15;
   public int Field1878 = 2;
   public int Field1879 = 50;
   public int Field1880 = 180;
   public float Field1881 = -100.0F;
   private static String[] Field1882;

   public Class381(String a, int a, int a) {
      this.Field1842 = a;
      this.Field1843 = a;
      this.Field1850 = a;
      this.Field1851 = a;
      this.Field1852 = 80;
      this.Field1853 = 18;
   }

   public void Method1384() {
      int var1 = 0;
      int var2 = this.Field1876;
      Iterator var3 = this.Field1844.Method1383();

      Class390 var4;
      while(var3.Method932()) {
         var4 = (Class390)var3.Method933();
         if (var4.Field1916) {
            var4.Field1912 = var2;
            var2 += var4.Field1910;
            var1 = Math.max(var1, var4.Field1909);
         }
      }

      this.Field1852 = Math.max(this.Field1874, var1);
      var3 = this.Field1844.Method1383();

      while(var3.Method932()) {
         var4 = (Class390)var3.Method933();
         if (var4.Field1916) {
            var4.Field1909 = this.Field1852;
         }
      }

      this.Field1853 = Math.min(this.Field1880, var2);
      this.Field1860 = var2 - this.Field1876;
      if (this.Field1862 > this.Field1860 - (this.Field1880 - this.Field1876)) {
         this.Field1862 = this.Field1860 - (this.Field1880 - this.Field1876);
      }

      if (this.Field1862 < 0) {
         this.Field1862 = 0;
      }

   }

   public void Method1385(int a, int a) {
      if (this.Method1408()) {
         this.Method1393();
      }

      if (this.Field1856) {
         this.Field1850 = a - this.Field1854;
         this.Field1851 = a - this.Field1855;
      }

      this.Field1859 = this.Field1860 + this.Field1876 > this.Field1880;
      Iterator var3 = this.Field1844.Method1383();

      while(var3.Method932()) {
         Class390 var4 = (Class390)var3.Method933();
         var4.Method419(a, a);
         if (var4.Field1916) {
            var4.Method411(a, a);
         }
      }

      this.Field1863.Method4(this.Field1847);
      this.Field1864.Method4(this.Field1846);
      if (this.Field1859 && this.Field1861) {
         this.Field1858 = MathUtils.Method547((float)(a - this.Field1851), (float)(this.Field1876 + 3) + (float)this.Field1879 / 2.0F, (float)(this.Field1880 - 3) - (float)this.Field1879 / 2.0F, 0.0F, 1.0F);
         if (this.Field1858 > 1.0F) {
            this.Field1858 = 1.0F;
         }

         if (this.Field1858 < 0.0F) {
            this.Field1858 = 0.0F;
         }

         this.Field1862 = this.Field1857 = (int)(this.Field1858 * (float)(this.Field1860 - (this.Field1880 - this.Field1876)));
      }

      if (Math.abs(this.Field1862 - this.Field1857) < 4) {
         this.Field1857 = this.Field1862;
         this.Field1858 = (float)this.Field1857 / (float)(this.Field1860 - (this.Field1880 - this.Field1876));
      } else if (this.Field1857 > this.Field1862) {
         this.Field1857 -= 4;
         this.Field1858 = (float)this.Field1857 / (float)(this.Field1860 - (this.Field1880 - this.Field1876));
      } else if (this.Field1857 < this.Field1862) {
         this.Field1857 += 4;
         this.Field1858 = (float)this.Field1857 / (float)(this.Field1860 - (this.Field1880 - this.Field1876));
      }

   }

   public void Method1386(int a, int a) {
      Method1420();
      this.Field1865.Method4(this.Field1856);
      int var4 = this.Field1876;
      int var5 = this.Field1851 + var4;
      float var6 = (float)(this.Field1853 - var4) * (float)this.Field1863.Method6();
      int var7 = 18;
      Iterator var8 = this.Field1844.Method1383();

      while(var8.Method932()) {
         Class390 var9 = (Class390)var8.Method933();
         if (var9.Field1916) {
            var7 += var9.Field1910;
            a.trash(new String[3]);
            break;
         }
      }

      if (this.Field1859 || var7 > this.Field1880) {
         var7 = this.Field1880;
      }

      float var19 = (float)var4 + (float)((var7 >= this.Field1880 ? var7 + 1 : var7 - 1) - var4) * (float)this.Field1863.Method6();
      int var20 = 7 + (int)(5.0 * this.Field1865.Method6());
      Class350.Method48(this.Field1850, this.Field1851, this.Field1852, (int)var19, var20);
      RenderUtils.Method1103((float)this.Field1850, (float)this.Field1851, (float)this.Field1852, (float)var4, Class707.Method1828());
      float var10;
      float var12;
      if (GlobalModule.INSTANCE.Field3190.Method1834()) {
         var10 = (float)this.Field1863.Method6() * 1.0F - 1.0F;
         float var11 = (float)(this.Field1851 + var4 / 2) + var10 * 2.0F;
         var12 = (float)(this.Field1851 + var4 / 2) - var10 * 2.0F;
         float var13 = (float)(this.Field1851 + var4 / 2) + var10 * 2.0F;
         RenderUtils.Method1085((double)(this.Field1850 + this.Field1852 - var4 + 5), (double)var11, (double)((float)(this.Field1850 + this.Field1852) - (float)var4 / 2.0F), (double)var12, 1.5F, 16777215);
         RenderUtils.Method1085((double)((float)(this.Field1850 + this.Field1852) - (float)var4 / 2.0F), (double)var12, (double)(this.Field1850 + this.Field1852 - 5), (double)var13, 1.5F, 16777215);
      }

      if (this.Field1867) {
         RenderUtils.Method1103((float)(this.Field1850 + this.Field1852 - var4), (float)this.Field1851, (float)var4, (float)var4, 553648127);
      }

      if (this.Field1845 && GlobalModule.INSTANCE.Field3190.Method1834()) {
         RenderUtils.Method1086((float)(this.Field1850 + var4 / 2), (float)(this.Field1851 + var4 / 2), 3.0F, 1.5F, 16777215);
         if (this.Field1864.Method6() > 0.0) {
            RenderUtils.Method1087((float)(this.Field1850 + var4 / 2), (float)(this.Field1851 + var4 / 2), (float)this.Field1864.Method6() * 1.5F, 16777215);
         }

         if (this.Field1866) {
            RenderUtils.Method1103((float)this.Field1850, (float)this.Field1851, (float)var4, (float)var4, 553648127);
         }
      }

      Class565.Field2635.Method1222(this.Field1843, (float)(this.Field1850 + this.Field1852 / 2), (float)(this.Field1851 + var4 / 2 - 4), 16777215);
      if (this.Field1863.Method6() > 0.0) {
         Class348.Method364((float)this.Field1850, (float)var5, (float)this.Field1852, var6, this.Field1863.Method6() > 0.0);
         RenderUtils.Method1103((float)this.Field1850, (float)(this.Field1851 + var4), (float)this.Field1852, var6, Class707.Method1830());
         RenderUtils.Method1080((float)this.Field1850, (float)var5, (float)(this.Field1850 + this.Field1852), (float)var5 + var6);
         this.Field1869 = (float)this.Field1850;
         this.Field1870 = (float)this.Field1851 + (float)(this.Field1853 - this.Field1876) + (float)this.Field1876;
         this.Field1871 = (float)this.Field1852;
         this.Field1872 = (float)(this.Field1853 - this.Field1876);
         var10 = 0.0F;
         if (this.Method1392(a, a)) {
            this.Field1881 = (float)(this.Field1880 - this.Field1876);
         }

         Iterator var21 = this.Field1844.Method1383();

         while(var21.Method932()) {
            Class390 var23 = (Class390)var21.Method933();
            if (var23.Field1916) {
               var23.Method412(a, a);
               var10 += (float)var23.Field1910;
               break;
            }
         }

         if (this.Method1392(a, a)) {
            this.Field1881 -= var10;
         }

         if (this.Field1859) {
            int var22 = this.Field1850 + this.Field1852 - 2;
            var12 = (float)(this.Field1880 - this.Field1876);
            float var14 = MathHelper.clamp_float(this.Field1858, 0.0F, 1.0F);
            float var15 = var12 / var10 * var12;
            float var16 = Math.max(var15, 20.0F);
            float var17 = var14 * (var12 - var16);
            int var10000 = var5 + (int)MathUtils.Method547(this.Field1858, 0.0F, 1.0F, 1.5F, (float)((double)(var12 - 50.0F) - 0.5));
            RenderUtils.Method1103((float)var22, (float)var5, 2.0F, var12, (new Color(0, 0, 0, 70)).getRGB());
            RenderUtils.Method1103((float)var22 + 0.5F, (float)var5 + var17, 1.0F, var16, this.Method1387(a, a) ? Class681.Method2699(Class707.Method1832(), 30) : Class707.Method1832());
         }

         RenderUtils.Method1082();
      }

   }

   private boolean Method1387(int a, int a) {
      return this.Field1859 && this.Method1392(a, a) && MathUtils.isHovering((float)a, (float)a, (float)(this.Field1850 + this.Field1852 - 3), (float)(this.Field1851 + 18), (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + this.Field1853));
   }

   public boolean Method1388(int a, int a, boolean a) {
      String[] var4 = Method1420();
      if (!this.Field1868 && this.Method1387(a, a)) {
         this.Field1861 = true;
      }

      this.Field1861 = false;
      boolean var5 = false;
      if (this.Method1392(a, a)) {
         int var6 = this.Field1876;
         this.Field1866 = this.Field1845 && MathUtils.isHovering((float)a, (float)a, (float)this.Field1850, (float)this.Field1851, (float)(this.Field1850 + var6), (float)(this.Field1851 + var6));
         this.Field1867 = MathUtils.isHovering((float)a, (float)a, (float)(this.Field1850 + this.Field1852 - var6), (float)this.Field1851, (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + var6));
         if (!this.Field1868) {
            var5 = true;
         }

         if (this.Field1866 && !this.Field1868) {
            this.Field1846 = !this.Field1846;
         }

         if (this.Field1867 && !this.Field1868) {
            this.Field1847 = !this.Field1847;
         }

         boolean var7 = MathUtils.isHovering((float)a, (float)a, (float)this.Field1850, (float)this.Field1851, (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + var6));
         if (!this.Field1866 && !this.Field1867 && !this.Field1868) {
            this.Field1856 = true;
            this.Field1854 = a - this.Field1850;
            this.Field1855 = a - this.Field1851;
         }

         this.Field1856 = false;
         if (this.Field1847) {
            Iterator var8 = this.Field1844.Method1383();
            Class390 var9;
            if (var8.Method932()) {
               var9 = (Class390)var8.Method933();
               if (!var9.Field1916) {
                  ;
               }

               var9.Method413(a, a, a);
            }

            var8 = this.Field1844.Method1383();
            if (var8.Method932()) {
               var9 = (Class390)var8.Method933();
               if (!var9.Field1916) {
                  ;
               }

               var9.Method414();
            }
         }
      }

      if (this.Field1856) {
         this.Field1856 = false;
      }

      this.Method1394();
      this.Field1868 = a;
      if (a.trash() == null) {
         Method1419(new String[3]);
      }

      return var5;
   }

   public void Method1389(int a, int a, boolean a) {
      if (this.Method1392(a, a)) {
         int var4 = Mouse.getEventDWheel();
         byte var5 = -1;
         this.Field1862 += var5 * 18;
         if (this.Field1862 > this.Field1860 - (this.Field1880 - this.Field1876)) {
            this.Field1862 = this.Field1860 - (this.Field1880 - this.Field1876);
         }

         if (this.Field1862 < 0) {
            this.Field1862 = 0;
         }
      }

   }

   public void Method1390(char a, int a) throws IOException {
      if (this.Field1847) {
         Iterator var3 = this.Field1844.Method1383();

         while(var3.Method932()) {
            Class390 var4 = (Class390)var3.Method933();
            if (var4.Field1916) {
               var4.Method1315(a, a);
            }
         }
      }

   }

   public boolean Method1391(int a, int a) {
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1850, (float)this.Field1851, (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + (this.Field1847 ? this.Field1853 : 18)));
   }

   public boolean Method1392(int a, int a) {
      Iterator var3 = GlobalModule.INSTANCE.Field3190.Method1833().Method1383();

      Class381 var4;
      do {
         if (!var3.Method932()) {
            return false;
         }

         var4 = (Class381)var3.Method933();
      } while(!var4.Field1848 || !var4.Method1391(a, a));

      return var4 == this;
   }

   public void Method1393() {
      this.Field1850 = Math.max(this.Field1850, 0);
      this.Field1851 = Math.max(this.Field1851, 0);
      this.Field1850 = Math.min(this.Field1850, RenderUtils.Method1076() - this.Field1852);
      this.Field1851 = Math.min(this.Field1851, RenderUtils.Method1077() - (this.Field1847 ? this.Field1853 : this.Field1877));
   }

   public void Method1394() {
      this.Field1866 = false;
      this.Field1867 = false;
      this.Field1856 = false;
      if (this.Field1847) {
         Iterator var1 = this.Field1844.Method1383();

         while(var1.Method932()) {
            Class390 var2 = (Class390)var1.Method933();
            if (var2.Field1916) {
               var2.Method414();
            }
         }
      }

      if (!Mouse.isButtonDown(0)) {
         this.Field1861 = false;
      }

   }

   public String Method1395() {
      return this.Field1842;
   }

   public void Method1396(String a) {
      this.Field1842 = a;
   }

   public String Method1397() {
      return this.Field1843;
   }

   public void Method1398(String a) {
      this.Field1843 = a;
   }

   public ArrayList Method1399() {
      return this.Field1844;
   }

   public boolean Method1400() {
      return this.Field1845;
   }

   public void Method1401(boolean a) {
      this.Field1845 = a;
   }

   public boolean Method1402() {
      return this.Field1846;
   }

   public void Method1403(boolean a) {
      this.Field1846 = a;
   }

   public boolean Method1404() {
      return this.Field1847;
   }

   public void Method1405(boolean a) {
      this.Field1847 = a;
   }

   public boolean Method1406() {
      return this.Field1848;
   }

   public void Method1407(boolean a) {
      this.Field1848 = a;
   }

   public boolean Method1408() {
      return this.Field1849;
   }

   public void Method1409(boolean a) {
      this.Field1849 = a;
   }

   public int Method1410() {
      return this.Field1850;
   }

   public void Method1411(int a) {
      this.Field1850 = a;
   }

   public int Method1412() {
      return this.Field1851;
   }

   public void Method1413(int a) {
      this.Field1851 = a;
   }

   public int Method1414() {
      return this.Field1852;
   }

   public int Method1415() {
      return this.Field1853;
   }

   public void Method1416(int a) {
      this.Field1853 = a;
   }

   public int Method1417() {
      return this.Field1857;
   }

   public boolean Method1418() {
      return this.Field1859;
   }

   public static void Method1419(String[] arr) {
      Field1882 = arr;
   }

   public static String[] Method1420() {
      return Field1882;
   }

   private static IOException Method1421(IOException iOException) {
      return iOException;
   }

   static {
      if (Method1420() != null) {
         Method1419(new String[3]);
      }

   }
}
