package awsl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class352 {
   public static final ArrayList Field1690 = new ArrayList();
   public Minecraft Field1691;
   public Class379 Field1692;
   public Class379 Field1693;
   private int Field1694;
   private int Field1695;

   public Class352() {
      this.Field1691 = Wrapper.INSTANCE.getMinecraft();
   }

   public void Method69(Class379 a) {
      Field1690.Method2530(a);
   }

   public void Method70() {
      if (this.Field1691.currentScreen instanceof GuiChat) {
         this.Method71();
      }

      this.Method72();
   }

   public void Method71() {
      Class379.Method467();
      this.Field1694 = (int)MathUtils.Method547((float)Mouse.getX(), 0.0F, (float)Display.getWidth(), 0.0F, (float)RenderUtils.Method1076());
      this.Field1695 = (int)MathUtils.Method547((float)(Display.getHeight() - Mouse.getY()), 0.0F, (float)Display.getHeight(), 0.0F, (float)RenderUtils.Method1077());
      this.Field1692 = null;
      Iterator var2 = Field1690.Method1383();
      if (var2.Method932()) {
         Class379 var3 = (Class379)var2.Method933();
         var3.Method64(this.Field1694, this.Field1695);
         if (!var3.Field1826) {
            if (!var3.Method456(this.Field1694, this.Field1695, Mouse.isButtonDown(0) || Mouse.isButtonDown(2))) {
               ;
            }

            this.Field1692 = var3;
         }

         var3.Method457();
      }

      if (this.Field1692 != null) {
         this.Method81(this.Field1692);
      }

      if (a.trash() == null) {
         Class379.Method466(new a[1]);
      }

   }

   public void Method72() {
      int var1 = Field1690.Method1799() - 1;

      while(true) {
         Class379 var2 = (Class379)Field1690.get(var1);
         if (!var2.Field1826) {
            var2.Method63();
            var2.Method451();
         }

         --var1;
      }
   }

   public void Method73() {
      Iterator var1 = Field1690.Method1383();

      while(var1.Method932()) {
         Class379 var2 = (Class379)var1.Method933();
         if (!var2.Field1826) {
            var2.Method452();
         }
      }

   }

   public void Method74(int a, int a) {
      int var3 = Mouse.getEventX() * a / this.Field1691.displayWidth;
      int var4 = a - Mouse.getEventY() * a / this.Field1691.displayHeight - 1;
      this.Method75(var3, var4);
   }

   public void Method75(int a, int a) {
      this.Field1692 = null;
      int var3 = Field1690.Method1799() - 1;

      while(true) {
         Class379 var4 = (Class379)Field1690.get(var3);
         if (var4.Method463(a, a) && !var4.Field1826) {
            this.Field1692 = var4;
            return;
         }

         --var3;
      }
   }

   public void Method76(int a, int a, int a) {
      this.Method80();
      if (this.Field1692 != null) {
         this.Field1692.Method453(a, a, a);
      }

      this.Method83();
   }

   public void Method77(int a, int a, int a, long a) {
      if (this.Field1692 != null) {
         this.Field1692.Method455(a, a, a, a);
      }

   }

   public void Method78(int a, int a) {
      Iterator var3 = Field1690.Method1383();

      while(var3.Method932()) {
         Class379 var4 = (Class379)var3.Method933();
         if (!var4.Field1826) {
            var4.Method64(a, a);
         }
      }

   }

   public void Method79(int a, int a, int a) {
      if (this.Field1692 != null) {
         this.Field1692.Method454(a, a, a);
      }

   }

   public void Method80() {
      if (this.Field1692 == null && this.Field1693 != null) {
         this.Field1693.Method464(false);
         this.Field1693 = null;
      } else {
         if (this.Field1693 != this.Field1692) {
            if (this.Field1693 != null) {
               this.Field1693.Method464(false);
            }

            this.Field1693 = this.Field1692;
            this.Field1693.Method464(true);
         }

      }
   }

   public void Method81(Class379 a) {
      if (Field1690.remove(a)) {
         Field1690.add(0, a);
      }

   }

   public static Class379 Method82(String a) {
      Iterator var1 = Field1690.Method1383();

      Class379 var2;
      do {
         if (!var1.Method932()) {
            return null;
         }

         var2 = (Class379)var1.Method933();
      } while(!var2.Field1813.equals(a));

      return var2;
   }

   public void Method83() {
      Field1690.sort(Comparator.comparingLong(Class352::Method84));
   }

   private static long Method84(Class379 a) {
      return a.Field1827;
   }
}
