package awsl;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.gui.AltLogin;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class707 extends GuiScreen {
   public static int Field3054;
   public static int Field3055;
   public final ArrayList Field3056 = new ArrayList();
   public boolean Field3057;
   public boolean Field3058;
   public String Field3059;
   public int Field3060;
   public int Field3061;
   private Class374 Field3062;
   private static int Field3063;

   public Class707() {
      this.Method1819();
   }

   public void Method1801() {
      this.Field3057 = true;
   }

   public void Method1803(int a, int a1, float a2) {
      this.Method1814();
      this.Method1816();
      String a = "Tips: §6鼠标放上去按住左Shift即可查看该功能翻译";
      RenderUtils.Method1103(0.0F, (float)RenderUtils.Method1077(), (float)(this.mc.fontRendererObj.getStringWidth(a) + 1), (float)(-this.mc.fontRendererObj.FONT_HEIGHT - 1), (new Color(0, 0, 0, 120)).getRGB());
      this.mc.fontRendererObj.drawStringWithShadow(a, 1.0F, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT), -1);
      String a = "§cFoodByte §bBY-SuChen";
      RenderUtils.Method1103(0.0F, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT - 1), Class565.Field2634.Method1225(a) + 2.0F, -Class565.Field2634.Field2625, (new Color(0, 0, 0, 120)).getRGB());
      Class565.Field2634.Method1220(a, 1.0F, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT) - Class565.Field2634.Field2625, -1);
   }

   public void Method1814() {
      this.Field3059 = null;
      this.Field3060 = (int)MathUtils.Method547((float)Mouse.getX(), 0.0F, (float)Display.getWidth(), 0.0F, (float)RenderUtils.Method1076());
      this.Field3061 = (int)MathUtils.Method547((float)(Display.getHeight() - Mouse.getY()), 0.0F, (float)Display.getHeight(), 0.0F, (float)RenderUtils.Method1077());
      if (this.Method1825() != null && this.Method1825().Method423(this.Field3060, this.Field3061) && this.Method1825().Method430()) {
         this.Field3058 = true;
      } else if (!Mouse.isButtonDown(0)) {
         this.Field3058 = false;
      }

      Field3055 = this.Field3057 ? -803200992 : -1340071904;
      Field3054 = this.Field3057 ? Method1832() : Method1832() - 1342177280;
      Class381 a = null;
      Iterator var2 = this.Field3056.Method1383();

      while(true) {
         while(var2.Method932()) {
            Class381 a = (Class381)var2.Method933();
            a.Method1385(this.Field3060, this.Field3061);
            if (this.Field3057 && !this.Field3058) {
               if (a.Method1388(this.Field3060, this.Field3061, Mouse.isButtonDown(0) || Mouse.isButtonDown(1) || Mouse.isButtonDown(2))) {
                  a = a;
               }
            } else {
               a.Method1394();
            }
         }

         this.Method1818(a);
         this.Method1817();
         return;
      }
   }

   public void Method1816() {
      int a = this.Field3056.Method1799() - 1;

      while(true) {
         Class381 a = (Class381)this.Field3056.get(a);
         if (a.Method1406() && (this.Field3057 || a.Method1400() && a.Method1402())) {
            a.Method1386(this.Field3060, this.Field3061);
         }

         --a;
      }
   }

   public void Method1817() {
      ModuleManager.modules.forEach(Class707::Method1835);
   }

   public void Method1818(Class381 a) {
      if (this.Field3056.remove(a)) {
         this.Field3056.add(0, a);
      }

   }

   private void Method1819() {
      Method1838();
      this.Field3056.clear();
      int a = 2;
      int a = 12;
      Category[] a;
      int a = (a = Category.Method2760()).length;
      int a = 0;
      Class381 a;
      if (a < a) {
         Category a = a[a];
         if (ModuleManager.Method2299(a) != 0) {
            a = new Class381(a.Field2976, a, a);
            Iterator var9 = ModuleManager.getAllModules().Method1383();
            if (var9.Method932()) {
               Module a = (Module)var9.Method933();
               if (a.Method1024() != a) {
                  ;
               }

               a.Method1399().Method2530(new Class385(a, 0, 0, a.getName(), a, a.getDescription()));
               Class395 a = new Class395(a, 0, 0, a.getName() + "_box");
               a.Field1922 = a.getName() + "_setting";
               a.Method1399().Method2530(a);
               a.Method1384();
               if (a.Method1031()) {
                  Iterator var12 = Class446.Method2766(a.getName()).Method1383();
                  Class447 a;
                  if (var12.Method932()) {
                     a = (Class447)var12.Method933();
                     if (a instanceof ModeValue) {
                        Class387 a = new Class387((ModeValue)a, a, 0, 0, a.Method2753());
                        a.Field1922 = a.getName() + "_setting";
                        a.Method1344(a);
                     }
                  }

                  var12 = Class446.Method2766(a.getName()).Method1383();
                  if (var12.Method932()) {
                     a = (Class447)var12.Method933();
                     if (a instanceof FloatValue) {
                        Class396 a = new Class396((FloatValue)a, a, 0, 0, a.Method2754(), a.Method2753());
                        a.Field1922 = a.getName() + "_setting";
                        a.Method1344(a);
                     }

                     if (a instanceof ColorValue) {
                        Class374 a = new Class374((ColorValue)a, a, 0, 0, a.Method2754(), a.Method2753());
                        a.Field1922 = a.getName() + "_setting";
                        a.Method1344(a);
                     }
                  }

                  var12 = Class446.Method2766(a.getName()).Method1383();
                  if (var12.Method932()) {
                     a = (Class447)var12.Method933();
                     if (a instanceof BooleanValue) {
                        Class382 a = new Class382((BooleanValue)a, a, 0, 0, a.Method2754(), a.Method2753());
                        a.Field1922 = a.getName() + "_setting";
                        a.Method1344(a);
                     }
                  }
               }
            }

            a.Method1407(true);
            a.Method1405(true);
            a.Method1384();
            this.Field3056.Method2530(a);
            a += a.Method1414() + 5;
         }

         ++a;
      }

      Class381 a = new Class381("Global", a, a);
      Iterator var16 = Class446.Method2766(a.Method1395()).Method1383();
      Class447 a;
      if (var16.Method932()) {
         a = (Class447)var16.Method933();
         if (a instanceof ModeValue) {
            a.Method1399().Method2530(new Class387((ModeValue)a, a, 0, 0, a.Method2753()));
         }
      }

      var16 = Class446.Method2766(a.Method1395()).Method1383();
      if (var16.Method932()) {
         a = (Class447)var16.Method933();
         if (a instanceof FloatValue) {
            a.Method1399().Method2530(new Class396((FloatValue)a, a, 0, 0, a.Method2754(), a.Method2753()));
         }

         if (a instanceof ColorValue) {
            a.Method1399().Method2530(new Class374((ColorValue)a, a, 0, 0, a.Method2754(), a.Method2753()));
         }
      }

      var16 = Class446.Method2766(a.Method1395()).Method1383();
      if (var16.Method932()) {
         a = (Class447)var16.Method933();
         if (a instanceof BooleanValue) {
            a.Method1399().Method2530(new Class382((BooleanValue)a, a, 0, 0, a.Method2754(), a.Method2753()));
         }
      }

      a.Method1407(true);
      a.Method1405(true);
      a.Method1384();
      this.Field3056.Method2530(a);
      a += a.Method1414() + 5;
      Class381 a = new Class381("Config", a, a);
      a.Method1399().Method2530(new Class375(a, 0, 0, (String)null));
      a.Method1407(true);
      a.Method1405(true);
      a.Method1384();
      this.Field3056.Method2530(a);
      a += a.Method1414() + 5;
      Class381 a = new Class381("IRC", a, a);
      a.Method1399().Method2530(new Class386(a, 0, 0, (String)null));
      a.Method1407(false);
      a.Method1405(true);
      a.Method1384();
      this.Field3056.Method2530(a);
      a = new Class381("Gui Option", 2, a + 188);
      a.Method1399().Method2530(new Class384(a, 0, 36, "Xray Select", new AltLogin(this)));
      a.Method1407(true);
      a.Method1405(true);
      a.Method1384();
      Class381 a = new Class381("Player Inventory", 2, 194);
      a.Method1399().Method2530(new Class376(a, 0, 0));
      a.Method1407(true);
      a.Method1409(true);
      a.Method1405(true);
      a.Method1401(true);
      a.Method1384();
   }

   public void Method1820(List a, int a, int a) {
      if (!a.isEmpty()) {
         int a = 0;
         Iterator var5 = a.Method1383();

         int a;
         while(var5.Method932()) {
            String a = (String)var5.Method933();
            a = this.fontRendererObj.getStringWidth(a);
            if (a > a) {
               a = a;
            }
         }

         int a = a + 12;
         int a = a - 12;
         a = 8;
         if (a.Method1799() > 1) {
            a += 2 + (a.Method1799() - 1) * 10;
         }

         if (a + a > this.width) {
            a -= 28 + a;
         }

         if (a + a + 6 > this.height) {
            a = this.height - a - 6;
         }

         Class350.Method48(a - 3, a - 3, a + 6, a + 6, 7);
         RenderUtils.Method1104((float)(a - 3), (float)(a - 3), (float)(a + a + 3), (float)(a + a + 3), Integer.MIN_VALUE);
         Class348.Method364((float)(a - 3), (float)(a - 3), (float)(a + 6), (float)(a + 6), true);

         for(int a = 0; a < a.Method1799(); ++a) {
            String a = (String)a.get(a);
            this.fontRendererObj.drawStringWithShadow(a, (float)a, (float)a, -1);
            a += 2;
            a += 10;
         }
      }

   }

   public void Method1821() throws IOException {
      if (Mouse.isCreated()) {
         while(Mouse.next()) {
            this.Method1822();
         }
      }

      if (Keyboard.isCreated()) {
         while(Keyboard.next()) {
            this.handleKeyboardInput();
         }
      }

   }

   public void Method1822() throws IOException {
      if (this.Field3057 && Mouse.getEventDWheel() != 0) {
         Iterator var1 = this.Field3056.Method1383();

         while(var1.Method932()) {
            Class381 a = (Class381)var1.Method933();
            a.Method1389(this.Field3060, this.Field3061, Mouse.isButtonDown(0));
         }

         if (this.Method1825() != null) {
            this.Method1824((Class374)null);
         }
      }

      super.Method1822();
   }

   public void Method1804(char a, int a) throws IOException {
      super.Method1804(a, a);
      if (this.Field3057) {
         Iterator var3 = this.Field3056.Method1383();

         while(var3.Method932()) {
            Class381 a = (Class381)var3.Method933();
            a.Method1390(a, a);
         }
      }

   }

   public void Method1806() {
      this.Field3057 = false;
      GlobalModule.INSTANCE.fileManager.saveFoodByteClickGui();
   }

   public boolean Method1812() {
      return false;
   }

   public void Method1805(int a, int a, int a) throws IOException {
      super.Method1805(a, a, a);
      if (this.Method1825() != null && !this.Method1825().Method423(a, a) && !this.Method1825().Method420()) {
         this.Method1824((Class374)null);
      }

      if (this.Method1825() != null) {
         this.Method1825().Method424(a, a);
      }

   }

   protected void Method1823(int a, int a1, int a2, long a3) {
   }

   protected void Method1811(int a, int a1, int a2) {
      if (this.Method1825() != null) {
         this.Method1825().Method425();
      }

   }

   public void Method1824(Class374 a) {
      this.Field3062 = a;
   }

   public Class374 Method1825() {
      return this.Field3062;
   }

   public void Method1826(String a, boolean a) {
      Iterator var3 = this.Field3056.Method1383();

      while(var3.Method932()) {
         Class381 a = (Class381)var3.Method933();
         Iterator var5 = a.Method1399().Method1383();

         while(var5.Method932()) {
            Class390 a = (Class390)var5.Method933();
            if (a.Field1922.equals(a) && a instanceof Class395) {
               ((Class395)a).Method1345(a);
            }
         }

         a.Method1384();
      }

   }

   public boolean Method1827(String a) {
      Iterator var2 = this.Field3056.Method1383();

      while(var2.Method932()) {
         Class381 a = (Class381)var2.Method933();
         Iterator var4 = a.Method1399().Method1383();

         while(var4.Method932()) {
            Class390 a = (Class390)var4.Method933();
            if (a.Field1922.equals(a) && a instanceof Class395 && ((Class395)a).Method420()) {
               return true;
            }
         }
      }

      return false;
   }

   public static int Method1828() {
      return Field3054;
   }

   public static int Method1829() {
      return Field3055;
   }

   public static int Method1830() {
      return GlobalModule.Field3169.getValue() ? (new Color(0, 0, 0, 120)).getRGB() : (new Color(24, 24, 24, 80)).getRGB();
   }

   public static int Method1831() {
      return (new Color(0, 153, 255, 120)).getRGB();
   }

   public static int Method1832() {
      return GlobalModule.Field3143.Method2442();
   }

   public ArrayList Method1833() {
      return this.Field3056;
   }

   public boolean Method1834() {
      return this.Field3057;
   }

   public void Method1808(String a) {
      this.Field3059 = a;
   }

   private static void Method1835(Module a) {
      a.idk();
   }

   public static void Method1836(int integer) {
      Field3063 = integer;
   }

   public static int Method1837() {
      return Field3063;
   }

   public static int Method1838() {
      int var0 = Method1837();
      return 85;
   }

   private static IOException Method1815(IOException iOException) {
      return iOException;
   }

   static {
      Method1836(61);
   }
}
