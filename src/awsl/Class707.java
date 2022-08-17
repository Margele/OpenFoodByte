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

   public void Method1803(int a, int a, float a) {
      this.Method1814();
      this.Method1816();
      String var4 = "Tips: §6鼠标放上去按住左Shift即可查看该功能翻译";
      RenderUtils.Method1103(0.0F, (float)RenderUtils.Method1077(), (float)(this.mc.fontRendererObj.getStringWidth(var4) + 1), (float)(-this.mc.fontRendererObj.FONT_HEIGHT - 1), (new Color(0, 0, 0, 120)).getRGB());
      this.mc.fontRendererObj.drawStringWithShadow(var4, 1.0F, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT), -1);
      String var5 = "§cFoodByte §bBY-SuChen";
      RenderUtils.Method1103(0.0F, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT - 1), Class565.Field2634.Method1225(var5) + 2.0F, -Class565.Field2634.Field2625, (new Color(0, 0, 0, 120)).getRGB());
      Class565.Field2634.Method1220(var5, 1.0F, (float)(RenderUtils.Method1077() - this.mc.fontRendererObj.FONT_HEIGHT) - Class565.Field2634.Field2625, -1);
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
      Class381 var1 = null;
      Iterator var2 = this.Field3056.Method1383();

      while(true) {
         while(var2.Method932()) {
            Class381 var3 = (Class381)var2.Method933();
            var3.Method1385(this.Field3060, this.Field3061);
            if (this.Field3057 && !this.Field3058) {
               if (var3.Method1388(this.Field3060, this.Field3061, Mouse.isButtonDown(0) || Mouse.isButtonDown(1) || Mouse.isButtonDown(2))) {
                  var1 = var3;
               }
            } else {
               var3.Method1394();
            }
         }

         this.Method1818(var1);
         this.Method1817();
         return;
      }
   }

   public void Method1816() {
      int var1 = this.Field3056.Method1799() - 1;

      while(true) {
         Class381 var2 = (Class381)this.Field3056.get(var1);
         if (var2.Method1406() && (this.Field3057 || var2.Method1400() && var2.Method1402())) {
            var2.Method1386(this.Field3060, this.Field3061);
         }

         --var1;
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
      int var2 = 2;
      byte var3 = 12;
      Category[] var4;
      int var5 = (var4 = Category.Method2760()).length;
      int var6 = 0;
      Class381 var8;
      if (var6 < var5) {
         Category var7 = var4[var6];
         if (ModuleManager.Method2299(var7) != 0) {
            var8 = new Class381(var7.Field2976, var2, var3);
            Iterator var9 = ModuleManager.getAllModules().Method1383();
            if (var9.Method932()) {
               Module var10 = (Module)var9.Method933();
               if (var10.Method1024() != var7) {
                  ;
               }

               var8.Method1399().Method2530(new Class385(var8, 0, 0, var10.getName(), var10, var10.getDescription()));
               Class395 var11 = new Class395(var8, 0, 0, var10.getName() + "_box");
               var11.Field1922 = var10.getName() + "_setting";
               var8.Method1399().Method2530(var11);
               var8.Method1384();
               if (var10.Method1031()) {
                  Iterator var12 = Class446.Method2766(var10.getName()).Method1383();
                  Class447 var13;
                  if (var12.Method932()) {
                     var13 = (Class447)var12.Method933();
                     if (var13 instanceof ModeValue) {
                        Class387 var14 = new Class387((ModeValue)var13, var8, 0, 0, var13.Method2753());
                        var14.Field1922 = var10.getName() + "_setting";
                        var11.Method1344(var14);
                     }
                  }

                  var12 = Class446.Method2766(var10.getName()).Method1383();
                  if (var12.Method932()) {
                     var13 = (Class447)var12.Method933();
                     if (var13 instanceof FloatValue) {
                        Class396 var21 = new Class396((FloatValue)var13, var8, 0, 0, var13.Method2754(), var13.Method2753());
                        var21.Field1922 = var10.getName() + "_setting";
                        var11.Method1344(var21);
                     }

                     if (var13 instanceof ColorValue) {
                        Class374 var22 = new Class374((ColorValue)var13, var8, 0, 0, var13.Method2754(), var13.Method2753());
                        var22.Field1922 = var10.getName() + "_setting";
                        var11.Method1344(var22);
                     }
                  }

                  var12 = Class446.Method2766(var10.getName()).Method1383();
                  if (var12.Method932()) {
                     var13 = (Class447)var12.Method933();
                     if (var13 instanceof BooleanValue) {
                        Class382 var23 = new Class382((BooleanValue)var13, var8, 0, 0, var13.Method2754(), var13.Method2753());
                        var23.Field1922 = var10.getName() + "_setting";
                        var11.Method1344(var23);
                     }
                  }
               }
            }

            var8.Method1407(true);
            var8.Method1405(true);
            var8.Method1384();
            this.Field3056.Method2530(var8);
            var2 += var8.Method1414() + 5;
         }

         ++var6;
      }

      Class381 var15 = new Class381("Global", var2, var3);
      Iterator var16 = Class446.Method2766(var15.Method1395()).Method1383();
      Class447 var17;
      if (var16.Method932()) {
         var17 = (Class447)var16.Method933();
         if (var17 instanceof ModeValue) {
            var15.Method1399().Method2530(new Class387((ModeValue)var17, var15, 0, 0, var17.Method2753()));
         }
      }

      var16 = Class446.Method2766(var15.Method1395()).Method1383();
      if (var16.Method932()) {
         var17 = (Class447)var16.Method933();
         if (var17 instanceof FloatValue) {
            var15.Method1399().Method2530(new Class396((FloatValue)var17, var15, 0, 0, var17.Method2754(), var17.Method2753()));
         }

         if (var17 instanceof ColorValue) {
            var15.Method1399().Method2530(new Class374((ColorValue)var17, var15, 0, 0, var17.Method2754(), var17.Method2753()));
         }
      }

      var16 = Class446.Method2766(var15.Method1395()).Method1383();
      if (var16.Method932()) {
         var17 = (Class447)var16.Method933();
         if (var17 instanceof BooleanValue) {
            var15.Method1399().Method2530(new Class382((BooleanValue)var17, var15, 0, 0, var17.Method2754(), var17.Method2753()));
         }
      }

      var15.Method1407(true);
      var15.Method1405(true);
      var15.Method1384();
      this.Field3056.Method2530(var15);
      var2 += var15.Method1414() + 5;
      Class381 var18 = new Class381("Config", var2, var3);
      var18.Method1399().Method2530(new Class375(var18, 0, 0, (String)null));
      var18.Method1407(true);
      var18.Method1405(true);
      var18.Method1384();
      this.Field3056.Method2530(var18);
      var2 += var18.Method1414() + 5;
      Class381 var19 = new Class381("IRC", var2, var3);
      var19.Method1399().Method2530(new Class386(var19, 0, 0, (String)null));
      var19.Method1407(false);
      var19.Method1405(true);
      var19.Method1384();
      this.Field3056.Method2530(var19);
      var8 = new Class381("Gui Option", 2, var3 + 188);
      var8.Method1399().Method2530(new Class384(var8, 0, 36, "Xray Select", new AltLogin(this)));
      var8.Method1407(true);
      var8.Method1405(true);
      var8.Method1384();
      Class381 var20 = new Class381("Player Inventory", 2, 194);
      var20.Method1399().Method2530(new Class376(var20, 0, 0));
      var20.Method1407(true);
      var20.Method1409(true);
      var20.Method1405(true);
      var20.Method1401(true);
      var20.Method1384();
   }

   public void Method1820(List a, int a, int a) {
      if (!a.isEmpty()) {
         int var4 = 0;
         Iterator var5 = a.Method1383();

         int var7;
         while(var5.Method932()) {
            String var6 = (String)var5.Method933();
            var7 = this.fontRendererObj.getStringWidth(var6);
            if (var7 > var4) {
               var4 = var7;
            }
         }

         int var10 = a + 12;
         int var11 = a - 12;
         var7 = 8;
         if (a.Method1799() > 1) {
            var7 += 2 + (a.Method1799() - 1) * 10;
         }

         if (var10 + var4 > this.width) {
            var10 -= 28 + var4;
         }

         if (var11 + var7 + 6 > this.height) {
            var11 = this.height - var7 - 6;
         }

         Class350.Method48(var10 - 3, var11 - 3, var4 + 6, var7 + 6, 7);
         RenderUtils.Method1104((float)(var10 - 3), (float)(var11 - 3), (float)(var10 + var4 + 3), (float)(var11 + var7 + 3), Integer.MIN_VALUE);
         Class348.Method364((float)(var10 - 3), (float)(var11 - 3), (float)(var4 + 6), (float)(var7 + 6), true);

         for(int var8 = 0; var8 < a.Method1799(); ++var8) {
            String var9 = (String)a.get(var8);
            this.fontRendererObj.drawStringWithShadow(var9, (float)var10, (float)var11, -1);
            var11 += 2;
            var11 += 10;
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
            Class381 var2 = (Class381)var1.Method933();
            var2.Method1389(this.Field3060, this.Field3061, Mouse.isButtonDown(0));
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
            Class381 var4 = (Class381)var3.Method933();
            var4.Method1390(a, a);
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

   protected void Method1823(int a, int a, int a, long a) {
   }

   protected void Method1811(int a, int a, int a) {
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
         Class381 var4 = (Class381)var3.Method933();
         Iterator var5 = var4.Method1399().Method1383();

         while(var5.Method932()) {
            Class390 var6 = (Class390)var5.Method933();
            if (var6.Field1922.equals(a) && var6 instanceof Class395) {
               ((Class395)var6).Method1345(a);
            }
         }

         var4.Method1384();
      }

   }

   public boolean Method1827(String a) {
      Iterator var2 = this.Field3056.Method1383();

      while(var2.Method932()) {
         Class381 var3 = (Class381)var2.Method933();
         Iterator var4 = var3.Method1399().Method1383();

         while(var4.Method932()) {
            Class390 var5 = (Class390)var4.Method933();
            if (var5.Field1922.equals(a) && var5 instanceof Class395 && ((Class395)var5).Method420()) {
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
