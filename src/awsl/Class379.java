package awsl;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.TimeHelper;

public class Class379 {
   public float Field1806;
   public float Field1807;
   public Minecraft Field1808;
   public float Field1809;
   public float Field1810;
   public boolean Field1811;
   public float Field1812;
   public String Field1813;
   public float Field1814;
   public float Field1815;
   public String Field1816;
   public boolean Field1817;
   public float Field1818;
   public float Field1819;
   public float Field1820;
   public float Field1821;
   public boolean Field1822;
   public String Field1823;
   public float Field1824;
   public float Field1825;
   public boolean Field1826;
   public long Field1827;
   public boolean Field1828;
   private boolean Field1829;
   public static TimeHelper Field1830;
   private static final Class333 Field1831;
   public static Color Field1832;
   public static Color Field1833;
   private static a[] Field1834;

   public static void Method450() {
      Field1832 = new Color(0, 0, 0, Field1831.Method1064());
      Field1833 = new Color(20, 20, 20, Field1831.Method1064());
   }

   public Class379(String a, float a, float a, float a, float a, String a) {
      this(a, a, a, a, a, a, "", 15.0F, 0.0F, 0.0F, false, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class379(String a, float a, float a, float a, float a, String a, String a) {
      this(a, a, a, a, a, a, a, 15.0F, 0.0F, 0.0F, false, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class379(String a, float a, float a, float a, float a, String a, boolean a, float a, float a) {
      this(a, a, a, a, a, a, "", 15.0F, 0.0F, 0.0F, a, a, a, 0.0F, 0.0F);
   }

   public Class379(String a, float a, float a, float a, float a, String a, String a, float a, float a, float a) {
      this(a, a, a, a, a, a, a, a, a, a, false, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Class379(String a, float a, float a, float a, float a, String a, String a, float a, float a, float a, boolean a, float a, float a, float a, float a) {
      this.Field1808 = Minecraft.getMinecraft();
      this.Field1811 = false;
      this.Field1822 = false;
      this.Field1826 = false;
      this.Field1827 = 0L;
      this.Field1828 = false;
      this.Field1813 = a;
      this.Field1806 = a;
      this.Field1807 = a;
      this.Field1814 = a;
      this.Field1815 = a;
      this.Field1816 = a;
      this.Field1823 = a;
      this.Field1812 = a;
      this.Field1824 = a;
      this.Field1825 = a;
      this.Field1817 = a;
      this.Field1818 = a;
      this.Field1819 = a;
      this.Field1820 = a;
      this.Field1821 = a;
   }

   public void Method63() {
      a[] var1 = Method467();
      if (PlayerUtils.Method1587()) {
         Field1831.Field1617 = 153.0F;
         Field1830.reset();
      }

      if (Field1830.Method211(200L)) {
         Field1831.Field1617 = 153.0F;
      }

      Field1831.Method1061(true);
      Method450();
      if (GlobalModule.Field3169.getBooleanValue()) {
         Class348.Method364(this.Field1806, this.Field1807, this.Field1814, this.Field1815 + this.Field1812, true);
      }

      RenderUtils.Method1103(this.Field1806, this.Field1807, this.Field1814, this.Field1812, Class681.Method900(GlobalModule.Field3143.Method2442(), 0.6F));
      RenderUtils.Method1103(this.Field1806, this.Field1807 + this.Field1812, this.Field1814, this.Field1815, Field1833.getRGB());
      boolean var2 = !this.Field1823.isEmpty();
      Class565.Field2638.Method1217(this.Field1823, this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
      Class565.Field2636.Method1217(this.Field1816, this.Field1806 + 3.0F + (float)8, this.Field1807 + this.Field1812 / 2.0F - Class565.Field2636.Field2625 / 2.0F, Class681.WHITE.Field2962);
      if (this.Field1808.currentScreen instanceof GuiChat) {
         RenderUtils.Method1103(this.Field1806, this.Field1807, this.Field1814, this.Field1812, GlobalModule.Field3143.Method2442());
         Class565.Field2638.Method1217("P", this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
         Class565.Field2636.Method1217("Move", this.Field1806 + 12.0F, this.Field1807 + this.Field1812 / 2.0F - Class565.Field2636.Field2625 / 2.0F, Class681.WHITE.Field2962);
      }

      a.trash(new String[1]);
   }

   public void Method451() {
      if (this.Field1817 && this.Field1808.currentScreen instanceof GuiChat) {
         Class565.Field2639.Method1217("L", this.Field1806 + this.Field1814 - 8.0F, this.Field1807 + this.Field1812 + this.Field1815 - 8.0F, Class681.Method900(Class681.GREY.Field2962, 0.6F));
         if (this.Field1822) {
            String var1 = (int)this.Field1814 + ", " + (int)this.Field1815;
            RenderUtils.Method1104(this.Field1806 + this.Field1814 + 2.0F, this.Field1807 + this.Field1812 + this.Field1815 - 12.0F, this.Field1806 + this.Field1814 + 2.0F + Class565.Field2635.Method1225(var1) + 4.0F, this.Field1807 + this.Field1812 + this.Field1815, -2013265920);
            Class565.Field2635.Method1217(var1, this.Field1806 + this.Field1814 + 4.0F, this.Field1807 + this.Field1812 + this.Field1815 - 12.0F + 1.0F, Class681.WHITE.Field2962);
         }
      }

   }

   public void Method452() {
   }

   public void Method453(int a, int a, int a) {
      if (RenderUtils.Method1096((float)a, (float)a, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812) && !this.Field1822) {
         this.Field1811 = true;
         this.Field1827 = System.currentTimeMillis();
         this.Field1809 = (float)a - this.Field1806;
         this.Field1810 = (float)a - this.Field1807;
      }

      if (RenderUtils.Method1096((float)a, (float)a, this.Field1806 + this.Field1814 - 8.0F, this.Field1807 + this.Field1812 + this.Field1815 - 8.0F, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815) && this.Field1817 && !this.Field1811) {
         this.Field1822 = true;
         this.Field1827 = System.currentTimeMillis();
         this.Field1809 = (float)a;
         this.Field1810 = (float)a;
      }

   }

   public void Method454(int a, int a, int a) {
      if (this.Field1811) {
         this.Field1811 = false;
      }

      if (this.Field1822) {
         this.Field1822 = false;
      }

   }

   public void Method64(int a, int a) {
      if (this.Field1811) {
         this.Field1806 = (float)a - this.Field1809;
         this.Field1807 = (float)a - this.Field1810;
      }

      if (this.Field1822) {
         this.Field1814 += (float)a - this.Field1809;
         if (this.Field1814 < this.Field1818) {
            this.Field1814 = this.Field1818;
         } else {
            this.Field1809 = (float)a;
         }

         this.Field1815 += (float)a - this.Field1810;
         if (this.Field1815 < this.Field1819) {
            this.Field1815 = this.Field1819;
         } else {
            this.Field1810 = (float)a;
         }

         if (!Display.isActive()) {
            this.Field1822 = false;
         }
      }

   }

   public void Method455(int a, int a, int a, long a) {
   }

   public boolean Method456(int a, int a, boolean a) {
      Method467();
      boolean var5 = false;
      if (this.Method458(a, a)) {
         if (!this.Field1829) {
            var5 = true;
         }

         boolean var6 = RenderUtils.Method1096((float)a, (float)a, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812);
         boolean var7 = RenderUtils.Method1096((float)a, (float)a, this.Field1806 + this.Field1814 - 8.0F, this.Field1807 + this.Field1812 + this.Field1815 - 8.0F, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815);
         if (!this.Field1829) {
            this.Field1811 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = (float)a - this.Field1806;
            this.Field1810 = (float)a - this.Field1807;
         }

         this.Field1811 = false;
         if (this.Field1817 && !this.Field1829) {
            this.Field1822 = true;
            this.Field1827 = System.currentTimeMillis();
            this.Field1809 = (float)a;
            this.Field1810 = (float)a;
         }

         this.Field1822 = false;
      }

      if (this.Field1811) {
         this.Field1811 = false;
      }

      if (this.Field1822) {
         this.Field1822 = false;
      }

      this.Method457();
      this.Field1829 = a;
      return var5;
   }

   public void Method457() {
      this.Field1811 = false;
      this.Field1822 = false;
   }

   public boolean Method458(int a, int a) {
      return this.Method459(a, a);
   }

   public boolean Method459(int a, int a) {
      return MathUtils.isHovering((float)a, (float)a, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1815 + this.Field1812);
   }

   public void Method460(float a, float a) {
      this.Field1806 = a / 2.0F - this.Field1814 / 2.0F;
      this.Field1807 = a / 2.0F - this.Field1815 / 2.0F;
   }

   public void Method461() {
      this.Field1826 = true;
   }

   public void Method462() {
      this.Field1826 = false;
   }

   public boolean Method463(int a, int a) {
      if (this.Field1822) {
         return RenderUtils.Method1096((float)a, (float)a, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815);
      } else {
         return this.Field1817 ? RenderUtils.Method1096((float)a, (float)a, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812) || RenderUtils.Method1096((float)a, (float)a, this.Field1806 + this.Field1814 - 8.0F, this.Field1807 + this.Field1812 + this.Field1815 - 8.0F, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812 + this.Field1815) : RenderUtils.Method1096((float)a, (float)a, this.Field1806, this.Field1807, this.Field1806 + this.Field1814, this.Field1807 + this.Field1812);
      }
   }

   public void Method464(boolean a) {
      this.Field1828 = a;
   }

   public boolean Method465() {
      return this.Field1828;
   }

   static {
      Method466(new a[5]);
      Field1830 = new TimeHelper();
      Field1831 = new Class333(50.0F, 0.085F);
      Field1831.Method1062(20.0F);
      Method450();
   }

   public static void Method466(a[] arr) {
      Field1834 = arr;
   }

   public static a[] Method467() {
      return Field1834;
   }
}
