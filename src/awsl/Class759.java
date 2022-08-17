package awsl;

public class Class759 implements Class755, Cloneable {
   protected int[] Field3332;

   public Class759() {
      this.Field3332 = new int[256];
   }

   public Class759(int[] a) {
      this.Field3332 = a;
   }

   public Object Method878() {
      try {
         Class759 a = (Class759)super.Method1433();
         a.Field3332 = (int[])((int[])this.Field3332.clone());
         return a;
      } catch (CloneNotSupportedException var2) {
         return null;
      }
   }

   public void Method85(int[] a) {
      this.Field3332 = a;
   }

   public int[] Method3438() {
      return this.Field3332;
   }

   public int Method283(float a) {
      int a = (int)(a * 255.0F);
      int a = 0;
      return this.Field3332[a];
   }

   public void Method1744(int a, int a, int a, int a) {
      int a = this.Field3332[a];
      Class193.Method1270();
      int a = this.Field3332[a];
      int var8;
      if (a <= a) {
         this.Field3332[a] = Class776.Method1719((float)(a - a) / (float)(a - a), a, a);
         var8 = a + 1;
      }

      if (a < a) {
         this.Field3332[a] = Class776.Method1719((float)(a - a) / (float)(a - a), a, a);
         var8 = a + 1;
      }

   }

   public void Method1745(int a, int a, int a, int a) {
      int a = Class193.Method1270();
      if (a <= a) {
         this.Field3332[a] = Class776.Method1719((float)(a - a) / (float)(a - a), a, a);
         int var6 = a + 1;
      }

   }

   public void Method1746(int a, int a, int a) {
      for(int a = a; a <= a; ++a) {
         this.Field3332[a] = a;
      }

   }

   public void Method17(int a, int a) {
      this.Field3332[a] = a;
   }
}
