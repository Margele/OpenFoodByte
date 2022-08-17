package awsl;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import trash.foodbyte.utils.RenderUtils;

public class Class395 extends Class390 {
   private List Field1950 = new ArrayList();
   private int Field1951;
   private boolean Field1952;
   private Class344 Field1953 = new Class344(15);

   public Class395(Class381 a, int a, int a, String a) {
      super(a, a, a, a, (String)null);
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 0;
      this.Field1920 = "Box";
   }

   public void Method1344(Class390 a) {
      this.Method1309();
      a.Field1907 = this.Field1907 + 10;
      this.Field1950.Method2530(a);
   }

   public void Method412(int a, int a) {
      if (this.Field1952) {
         float a = (float)this.Field1907;
         float a = Math.min((float)(this.Field1919.Field1851 + (this.Field1919.Field1853 - this.Field1919.Field1876) + this.Field1919.Field1876), (float)(this.Field1910 + this.Field1908));
         float a = (float)this.Field1909;
         float a = (float)Math.min(this.Field1908 + this.Field1910 - (this.Field1919.Field1851 + this.Field1919.Field1876), this.Field1910);
         if (!(a <= 0.0F) && !((float)this.Field1910 <= 1.0F)) {
            RenderUtils.Method1108((double)this.Field1907 + 3.5, (double)this.Field1908 + 0.5, (double)(this.Field1907 + this.Method1310()) - 3.5, (double)(this.Field1908 + this.Field1951) - 0.5, 0.5, 1, (new Color(255, 255, 255, 80)).getRGB());
            this.Field1950.stream().filter(Class395::Method1354).forEach(Class395::Method1353);
         }
      }
   }

   public void Method413(int a, int a, boolean a) {
      if (this.Field1952) {
         this.Field1950.stream().filter(Class395::Method1352).forEach(Class395::Method1351);
      }
   }

   public void Method414() {
      if (this.Field1952) {
         this.Field1950.stream().filter(Class395::Method1350).forEach(Class390::Method414);
      }
   }

   public void Method1315(char a, int a) throws IOException {
      super.Method1315(a, a);
      this.Field1950.stream().filter(Class395::Method1349).forEach(Class395::Method1348);
   }

   public void Method411(int a, int a) {
      Class390.Method1317();
      super.Method411(a, a);
      int a = this.Field1908;
      int a = this.Field1907;
      Iterator var6 = this.Field1950.Method1383();

      while(var6.Method932()) {
         Class390 a = (Class390)var6.Method933();
         a.Method419(a, a);
         if (a.Field1916) {
            a.Method411(a, a);
            a.Field1908 = a;
            a.Field1907 = a;
            int var10000 = (int)((float)a + (float)a.Field1910);
            break;
         }
      }

      this.Method425();
      this.Field1953.Method290(this.Field1952);
      this.Field1910 = (int)((this.Field1952 ? 1.0 : 0.0) * (double)this.Field1951);
      this.Field1919.Method1384();
   }

   public void Method425() {
      this.Field1951 = this.Field1950.stream().filter(Class395::Method1347).mapToInt(Class395::Method1346).sum();
   }

   public void Method1345(boolean a) {
      this.Field1952 = a;
   }

   public boolean Method420() {
      return this.Field1952;
   }

   private static int Method1346(Class390 a) {
      return a.Field1910;
   }

   private static boolean Method1347(Class390 a) {
      return a.Field1916;
   }

   private static void Method1348(char a, int a, Class390 a) {
      try {
         a.Method1315(a, a);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   private static boolean Method1349(Class390 a) {
      return a.Field1916;
   }

   private static boolean Method1350(Class390 a) {
      return a.Field1916;
   }

   private static void Method1351(int a, int a, boolean a, Class390 a) {
      a.Method413(a, a, a);
   }

   private static boolean Method1352(Class390 a) {
      return a.Field1916;
   }

   private static void Method1353(int a, int a, Class390 a) {
      a.Method412(a, a);
   }

   private static boolean Method1354(Class390 a) {
      return a.Field1916;
   }
}
