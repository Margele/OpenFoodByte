package awsl;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import trash.foodbyte.utils.MathUtils;

public abstract class Class390 {
   public int Field1907;
   public int Field1908;
   public int Field1909;
   public int Field1910;
   public int Field1911;
   public int Field1912;
   public String Field1913;
   public String Field1914;
   protected boolean Field1915;
   public boolean Field1916 = true;
   public boolean Field1917;
   protected boolean Field1918;
   public Class381 Field1919;
   public String Field1920 = "Component";
   public boolean Field1921 = true;
   public String Field1922 = "default";
   protected Minecraft Field1923 = Minecraft.getMinecraft();
   private static int Field1924;

   public Class390(Class381 a, int a, int a, String a, String a) {
      this.Field1919 = a;
      this.Field1911 = a;
      this.Field1912 = a;
      this.Field1913 = a;
      this.Field1914 = a;
   }

   protected void Method1309() {
      this.Field1907 = this.Field1919.Method1410() + this.Field1911;
      this.Field1908 = this.Field1919.Method1412() + this.Field1912 - this.Field1919.Method1417();
   }

   public int Method1310() {
      return this.Field1909 - (this.Field1919.Method1418() ? 0 : 0);
   }

   public boolean Method1311(int a, int a) {
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1907, (float)this.Field1908, (float)(this.Field1907 + this.Field1909 - (this.Field1919.Method1418() ? 2 : 0)), (float)(this.Field1908 + this.Field1910));
   }

   public boolean Method1312(int a, int a) {
      float a = this.Field1922.contains("_setting") ? 3.0F : 3.0F;
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1907 + a, (float)(this.Field1908 + 7), (float)(this.Field1907 + this.Field1909) - a - (float)(this.Field1919.Method1418() ? 2 : 0), (float)(this.Field1908 + this.Field1910));
   }

   public boolean Method1313(int a, int a) {
      float a = this.Field1922.contains("_setting") ? 3.0F : 3.0F;
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1907 + a, (float)this.Field1908, (float)this.Field1907 + Class565.Field2636.Method1225(this.Field1913) + 20.0F - (float)(this.Field1919.Method1418() ? 2 : 0), (float)(this.Field1908 + this.Field1910));
   }

   public boolean Method1314(int a, int a) {
      float a = this.Field1922.contains("_setting") ? 3.0F : 3.0F;
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1907 + a, (float)(this.Field1908 + 7), (float)(this.Field1907 + this.Field1909) - a - (float)(this.Field1919.Method1418() ? 2 : 0), (float)(this.Field1908 + 20));
   }

   public void Method414() {
      this.Field1915 = false;
      this.Field1918 = Mouse.isButtonDown(0);
   }

   public void Method419(int a, int a1) {
   }

   public void Method411(int a, int a1) {
      this.Method1309();
   }

   public abstract void Method412(int integer1, int integer2);

   public abstract void Method413(int integer1, int integer2, boolean boolean3);

   public void Method1315(char a, int a1) throws IOException {
   }

   public static void Method1316(int integer) {
      Field1924 = integer;
   }

   public static int Method1317() {
      return Field1924;
   }

   public static int Method1318() {
      int var0 = Method1317();
      return 51;
   }

   static {
      Method1316(26);
   }
}
