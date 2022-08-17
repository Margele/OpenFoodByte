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
      int a = 0;
      int a = this.Field1876;
      Iterator var3 = this.Field1844.Method1383();

      Class390 a;
      while(var3.Method932()) {
         a = (Class390)var3.Method933();
         if (a.Field1916) {
            a.Field1912 = a;
            a += a.Field1910;
            a = Math.max(a, a.Field1909);
         }
      }

      this.Field1852 = Math.max(this.Field1874, a);
      var3 = this.Field1844.Method1383();

      while(var3.Method932()) {
         a = (Class390)var3.Method933();
         if (a.Field1916) {
            a.Field1909 = this.Field1852;
         }
      }

      this.Field1853 = Math.min(this.Field1880, a);
      this.Field1860 = a - this.Field1876;
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
         Class390 a = (Class390)var3.Method933();
         a.Method419(a, a);
         if (a.Field1916) {
            a.Method411(a, a);
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
      int a = this.Field1876;
      int a = this.Field1851 + a;
      float a = (float)(this.Field1853 - a) * (float)this.Field1863.Method6();
      int a = 18;
      Iterator var8 = this.Field1844.Method1383();

      while(var8.Method932()) {
         Class390 a = (Class390)var8.Method933();
         if (a.Field1916) {
            a += a.Field1910;
            a.trash(new String[3]);
            break;
         }
      }

      if (this.Field1859 || a > this.Field1880) {
         a = this.Field1880;
      }

      float a = (float)a + (float)((a >= this.Field1880 ? a + 1 : a - 1) - a) * (float)this.Field1863.Method6();
      int a = 7 + (int)(5.0 * this.Field1865.Method6());
      Class350.Method48(this.Field1850, this.Field1851, this.Field1852, (int)a, a);
      RenderUtils.Method1103((float)this.Field1850, (float)this.Field1851, (float)this.Field1852, (float)a, Class707.Method1828());
      float a;
      float a;
      if (GlobalModule.INSTANCE.Field3190.Method1834()) {
         a = (float)this.Field1863.Method6() * 1.0F - 1.0F;
         float a = (float)(this.Field1851 + a / 2) + a * 2.0F;
         a = (float)(this.Field1851 + a / 2) - a * 2.0F;
         float a = (float)(this.Field1851 + a / 2) + a * 2.0F;
         RenderUtils.Method1085((double)(this.Field1850 + this.Field1852 - a + 5), (double)a, (double)((float)(this.Field1850 + this.Field1852) - (float)a / 2.0F), (double)a, 1.5F, 16777215);
         RenderUtils.Method1085((double)((float)(this.Field1850 + this.Field1852) - (float)a / 2.0F), (double)a, (double)(this.Field1850 + this.Field1852 - 5), (double)a, 1.5F, 16777215);
      }

      if (this.Field1867) {
         RenderUtils.Method1103((float)(this.Field1850 + this.Field1852 - a), (float)this.Field1851, (float)a, (float)a, 553648127);
      }

      if (this.Field1845 && GlobalModule.INSTANCE.Field3190.Method1834()) {
         RenderUtils.Method1086((float)(this.Field1850 + a / 2), (float)(this.Field1851 + a / 2), 3.0F, 1.5F, 16777215);
         if (this.Field1864.Method6() > 0.0) {
            RenderUtils.Method1087((float)(this.Field1850 + a / 2), (float)(this.Field1851 + a / 2), (float)this.Field1864.Method6() * 1.5F, 16777215);
         }

         if (this.Field1866) {
            RenderUtils.Method1103((float)this.Field1850, (float)this.Field1851, (float)a, (float)a, 553648127);
         }
      }

      Class565.Field2635.Method1222(this.Field1843, (float)(this.Field1850 + this.Field1852 / 2), (float)(this.Field1851 + a / 2 - 4), 16777215);
      if (this.Field1863.Method6() > 0.0) {
         Class348.Method364((float)this.Field1850, (float)a, (float)this.Field1852, a, this.Field1863.Method6() > 0.0);
         RenderUtils.Method1103((float)this.Field1850, (float)(this.Field1851 + a), (float)this.Field1852, a, Class707.Method1830());
         RenderUtils.Method1080((float)this.Field1850, (float)a, (float)(this.Field1850 + this.Field1852), (float)a + a);
         this.Field1869 = (float)this.Field1850;
         this.Field1870 = (float)this.Field1851 + (float)(this.Field1853 - this.Field1876) + (float)this.Field1876;
         this.Field1871 = (float)this.Field1852;
         this.Field1872 = (float)(this.Field1853 - this.Field1876);
         a = 0.0F;
         if (this.Method1392(a, a)) {
            this.Field1881 = (float)(this.Field1880 - this.Field1876);
         }

         Iterator var21 = this.Field1844.Method1383();

         while(var21.Method932()) {
            Class390 a = (Class390)var21.Method933();
            if (a.Field1916) {
               a.Method412(a, a);
               a += (float)a.Field1910;
               break;
            }
         }

         if (this.Method1392(a, a)) {
            this.Field1881 -= a;
         }

         if (this.Field1859) {
            int a = this.Field1850 + this.Field1852 - 2;
            a = (float)(this.Field1880 - this.Field1876);
            float a = MathHelper.clamp_float(this.Field1858, 0.0F, 1.0F);
            float a = a / a * a;
            float a = Math.max(a, 20.0F);
            float a = a * (a - a);
            int var10000 = a + (int)MathUtils.Method547(this.Field1858, 0.0F, 1.0F, 1.5F, (float)((double)(a - 50.0F) - 0.5));
            RenderUtils.Method1103((float)a, (float)a, 2.0F, a, (new Color(0, 0, 0, 70)).getRGB());
            RenderUtils.Method1103((float)a + 0.5F, (float)a + a, 1.0F, a, this.Method1387(a, a) ? Class681.Method2699(Class707.Method1832(), 30) : Class707.Method1832());
         }

         RenderUtils.Method1082();
      }

   }

   private boolean Method1387(int a, int a) {
      return this.Field1859 && this.Method1392(a, a) && MathUtils.isHovering((float)a, (float)a, (float)(this.Field1850 + this.Field1852 - 3), (float)(this.Field1851 + 18), (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + this.Field1853));
   }

   public boolean Method1388(int a, int a, boolean a) {
      String[] a = Method1420();
      if (!this.Field1868 && this.Method1387(a, a)) {
         this.Field1861 = true;
      }

      this.Field1861 = false;
      boolean a = false;
      if (this.Method1392(a, a)) {
         int a = this.Field1876;
         this.Field1866 = this.Field1845 && MathUtils.isHovering((float)a, (float)a, (float)this.Field1850, (float)this.Field1851, (float)(this.Field1850 + a), (float)(this.Field1851 + a));
         this.Field1867 = MathUtils.isHovering((float)a, (float)a, (float)(this.Field1850 + this.Field1852 - a), (float)this.Field1851, (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + a));
         if (!this.Field1868) {
            a = true;
         }

         if (this.Field1866 && !this.Field1868) {
            this.Field1846 = !this.Field1846;
         }

         if (this.Field1867 && !this.Field1868) {
            this.Field1847 = !this.Field1847;
         }

         boolean a = MathUtils.isHovering((float)a, (float)a, (float)this.Field1850, (float)this.Field1851, (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + a));
         if (!this.Field1866 && !this.Field1867 && !this.Field1868) {
            this.Field1856 = true;
            this.Field1854 = a - this.Field1850;
            this.Field1855 = a - this.Field1851;
         }

         this.Field1856 = false;
         if (this.Field1847) {
            Iterator var8 = this.Field1844.Method1383();
            Class390 a;
            if (var8.Method932()) {
               a = (Class390)var8.Method933();
               if (!a.Field1916) {
                  ;
               }

               a.Method413(a, a, a);
            }

            var8 = this.Field1844.Method1383();
            if (var8.Method932()) {
               a = (Class390)var8.Method933();
               if (!a.Field1916) {
                  ;
               }

               a.Method414();
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

      return a;
   }

   public void Method1389(int a, int a, boolean a2) {
      if (this.Method1392(a, a)) {
         int a = Mouse.getEventDWheel();
         int a = -1;
         this.Field1862 += a * 18;
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
            Class390 a = (Class390)var3.Method933();
            if (a.Field1916) {
               a.Method1315(a, a);
            }
         }
      }

   }

   public boolean Method1391(int a, int a) {
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1850, (float)this.Field1851, (float)(this.Field1850 + this.Field1852), (float)(this.Field1851 + (this.Field1847 ? this.Field1853 : 18)));
   }

   public boolean Method1392(int a, int a) {
      Iterator var3 = GlobalModule.INSTANCE.Field3190.Method1833().Method1383();

      Class381 a;
      do {
         if (!var3.Method932()) {
            return false;
         }

         a = (Class381)var3.Method933();
      } while(!a.Field1848 || !a.Method1391(a, a));

      return a == this;
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
            Class390 a = (Class390)var1.Method933();
            if (a.Field1916) {
               a.Method414();
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
