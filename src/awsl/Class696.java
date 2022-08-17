package awsl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.ChatAllowedCharacters;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.gui.AltLogin;

public class Class696 extends Gui {
   private final FontRenderer Field2991;
   private final int Field2992;
   private final int Field2993;
   private final int Field2994;
   private final int Field2995;
   private String Field2996 = "";
   private int Field2997 = 50;
   private int Field2998;
   private boolean Field2999 = true;
   private boolean Field3000 = true;
   public boolean Field3001 = false;
   private boolean Field3002 = true;
   private int Field3003 = 0;
   private int Field3004 = 0;
   private int Field3005 = 0;
   private int Field3006 = 14737632;
   private int Field3007 = 7368816;
   private boolean Field3008 = true;

   public Class696(FontRenderer a, int a, int a, int a, int a) {
      this.Field2991 = a;
      this.Field2992 = a;
      this.Field2993 = a;
      this.Field2994 = a;
      this.Field2995 = a;
   }

   public void Method1814() {
      ++this.Field2998;
   }

   public void Method1808(String a) {
      if (a.length() > this.Field2997) {
         this.Field2996 = a.substring(0, this.Field2997);
      } else {
         this.Field2996 = a;
      }

      this.Method1819();
   }

   public String Method1809() {
      String var1 = this.Field2996.replaceAll(" ", "");
      return var1;
   }

   public String Method2029() {
      int var1 = this.Field3004 < this.Field3005 ? this.Field3004 : this.Field3005;
      int var2 = this.Field3004 < this.Field3005 ? this.Field3005 : this.Field3004;
      return this.Field2996.substring(var1, var2);
   }

   public void Method2031(String a) {
      String var2 = "";
      String var3 = ChatAllowedCharacters.filterAllowedCharacters(a);
      int var4 = this.Field3004 < this.Field3005 ? this.Field3004 : this.Field3005;
      int var5 = this.Field3004 < this.Field3005 ? this.Field3005 : this.Field3004;
      int var6 = this.Field2997 - this.Field2996.length() - (var4 - this.Field3005);
      boolean var7 = false;
      if (this.Field2996.length() > 0) {
         var2 = String.valueOf(var2) + this.Field2996.substring(0, var4);
      }

      int var8;
      if (var6 < var3.length()) {
         var2 = String.valueOf(var2) + var3.substring(0, var6);
         var8 = var6;
      } else {
         var2 = String.valueOf(var2) + var3;
         var8 = var3.length();
      }

      if (this.Field2996.length() > 0 && var5 < this.Field2996.length()) {
         var2 = String.valueOf(var2) + this.Field2996.substring(var5);
      }

      this.Field2996 = var2.replaceAll(" ", "");
      this.Method2036(var4 - this.Field3005 + var8);
   }

   public void Method1836(int a) {
      if (this.Field2996.length() != 0) {
         if (this.Field3005 != this.Field3004) {
            this.Method2031("");
         } else {
            this.Method2032(this.Method2033(a) - this.Field3004);
         }
      }

   }

   public void Method2032(int a) {
      if (this.Field2996.length() != 0) {
         if (this.Field3005 != this.Field3004) {
            this.Method2031("");
         } else {
            boolean var2 = true;
            int var3 = this.Field3004 + a;
            int var4 = this.Field3004;
            String var5 = "";
            var5 = this.Field2996.substring(0, var3);
            if (var4 < this.Field2996.length()) {
               var5 = String.valueOf(var5) + this.Field2996.substring(var4);
            }

            this.Field2996 = var5;
            this.Method2036(a);
         }
      }

   }

   public int Method2033(int a) {
      return this.Method2034(a, this.Method1829());
   }

   public int Method2034(int a, int a) {
      return this.Method2035(a, this.Method1829(), true);
   }

   public int Method2035(int a, int a, boolean a) {
      int var4 = a;
      boolean var5 = true;
      int var6 = Math.abs(a);

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.Field2996.length();
         var4 = this.Field2996.indexOf(32, var4);
         if (var4 == -1) {
            var4 = var8;
         } else {
            while(var4 < var8 && this.Field2996.charAt(var4) == ' ') {
               ++var4;
            }
         }
      }

      return var4;
   }

   public void Method2036(int a) {
      this.Method2037(this.Field3005 + a);
   }

   public void Method2037(int a) {
      this.Field3004 = a;
      int var2 = this.Field2996.length();
      if (this.Field3004 < 0) {
         this.Field3004 = 0;
      }

      if (this.Field3004 > var2) {
         this.Field3004 = var2;
      }

      this.Method2045(this.Field3004);
   }

   public void Method1816() {
      this.Method2037(0);
   }

   public void Method1819() {
      this.Method2037(this.Field2996.length());
   }

   public boolean Method2038(char a, int a) {
      String var3 = AltLogin.Method1809();
      if (this.Field3002 && this.Field3001) {
         switch (a) {
            case '\u0001':
               this.Method1819();
               this.Method2045(0);
               return true;
            case '\u0003':
               GuiScreen.setClipboardString(this.Method2029());
               return true;
            case '\u0016':
               this.Method2031(GuiScreen.getClipboardString());
               return true;
            case '\u0018':
               GuiScreen.setClipboardString(this.Method2029());
               this.Method2031("");
               return true;
            default:
               switch (a) {
                  case 14:
                     if (GuiScreen.isCtrlKeyDown()) {
                        this.Method1836(-1);
                     }

                     this.Method2032(-1);
                     return true;
                  case 199:
                     if (GuiScreen.isShiftKeyDown()) {
                        this.Method2045(0);
                     }

                     this.Method1816();
                     return true;
                  case 203:
                     if (GuiScreen.isShiftKeyDown()) {
                        if (GuiScreen.isCtrlKeyDown()) {
                           this.Method2045(this.Method2034(-1, this.Method1830()));
                        }

                        this.Method2045(this.Method1830() - 1);
                     }

                     if (GuiScreen.isCtrlKeyDown()) {
                        this.Method2037(this.Method2033(-1));
                     }

                     this.Method2036(-1);
                     return true;
                  case 205:
                     if (GuiScreen.isShiftKeyDown()) {
                        if (GuiScreen.isCtrlKeyDown()) {
                           this.Method2045(this.Method2034(1, this.Method1830()));
                        }

                        this.Method2045(this.Method1830() + 1);
                     }

                     if (GuiScreen.isCtrlKeyDown()) {
                        this.Method2037(this.Method2033(1));
                     }

                     this.Method2036(1);
                     return true;
                  case 207:
                     if (GuiScreen.isShiftKeyDown()) {
                        this.Method2045(this.Field2996.length());
                     }

                     this.Method1819();
                     return true;
                  case 211:
                     if (GuiScreen.isCtrlKeyDown()) {
                        this.Method1836(1);
                     }

                     this.Method2032(1);
                     return true;
                  default:
                     if (ChatAllowedCharacters.isAllowedCharacter(a)) {
                        this.Method2031(Character.toString(a));
                        return true;
                     } else {
                        return false;
                     }
               }
         }
      } else {
         return false;
      }
   }

   public void Method2039(int a, int a, int a) {
      boolean var10000;
      if (a >= this.Field2992 && a < this.Field2992 + this.Field2994 && a >= this.Field2993 && a < this.Field2993 + this.Field2995) {
         var10000 = true;
      } else {
         var10000 = false;
      }

      if (this.Field3000) {
         this.Method2046(this.Field3002);
      }

      if (this.Field3001) {
         int var5 = a - this.Field2992;
         if (this.Field2999) {
            var5 -= 4;
         }

         String var6 = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), this.Method1831());
         this.Method2037(this.Field2991.trimStringToWidth(var6, var5).length() + this.Field3003);
      }

   }

   public void Method2040() {
      String var1 = AltLogin.Method1809();
      if (this.Method2051()) {
         if (this.Method1834()) {
            Gui.drawRect(this.Field2992 - 1, this.Field2993 - 1, this.Field2992 + this.Field2994 + 1, this.Field2993 + this.Field2995 + 1, -6250336);
            Gui.drawRect(this.Field2992, this.Field2993, this.Field2992 + this.Field2994, this.Field2993 + this.Field2995, -16777216);
         }

         int var2 = this.Field3002 ? this.Field3006 : this.Field3007;
         int var3 = this.Field3004 - this.Field3003;
         int var4 = this.Field3005 - this.Field3003;
         String var5 = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), this.Method1831());
         boolean var6 = var3 <= var5.length();
         boolean var10000;
         if (this.Field3001 && this.Field2998 / 6 % 2 == 0) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         int var8 = this.Field2999 ? this.Field2992 + 4 : this.Field2992;
         int var9 = this.Field2999 ? this.Field2993 + (this.Field2995 - 8) / 2 : this.Field2993;
         int var10 = var8;
         if (var4 > var5.length()) {
            var4 = var5.length();
         }

         if (var5.length() > 0) {
            var5.substring(0, var3);
            var10 = Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(this.Field2996.replaceAll("(?s).", "*"), (float)var8, (float)var9, var2);
         }

         if (this.Field3004 >= this.Field2996.length() && this.Field2996.length() < this.Method1828()) {
            var10000 = false;
         } else {
            var10000 = true;
         }

         int var14 = var8 + this.Field2994;
         int var12 = var10 - 1;
         --var10;
         if (var5.length() > 0 && var3 < var5.length()) {
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(var5.substring(var3), (float)var10, (float)var9, var2);
         }

         Gui.drawRect(var12, var9 - 1, var12 + 1, var9 + 1 + this.Field2991.FONT_HEIGHT, -3092272);
         Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("_", (float)var12, (float)var9, var2);
         if (var4 != var3) {
            int var13 = var8 + this.Field2991.getStringWidth(var5.substring(0, var4));
            this.Method2041(var12, var9 - 1, var13 - 1, var9 + 1 + this.Field2991.FONT_HEIGHT);
         }
      }

   }

   private void Method2041(int a, int a, int a, int a) {
      int var5;
      if (a < a) {
         var5 = a;
         a = a;
         a = var5;
      }

      if (a < a) {
         var5 = a;
         a = a;
         a = var5;
      }

      Tessellator var7 = Tessellator.getInstance();
      WorldRenderer var6 = var7.getWorldRenderer();
      GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
      GL11.glDisable(3553);
      GL11.glEnable(3058);
      GL11.glLogicOp(5387);
      var6.begin(7, var6.getVertexFormat());
      var6.pos((double)a, (double)a, 0.0);
      var6.pos((double)a, (double)a, 0.0);
      var6.pos((double)a, (double)a, 0.0);
      var6.pos((double)a, (double)a, 0.0);
      var6.finishDrawing();
      GL11.glDisable(3058);
      GL11.glEnable(3553);
   }

   public void Method2042(int a) {
      this.Field2997 = a;
      if (this.Field2996.length() > a) {
         this.Field2996 = this.Field2996.substring(0, a);
      }

   }

   public int Method1828() {
      return this.Field2997;
   }

   public int Method1829() {
      return this.Field3004;
   }

   public boolean Method1834() {
      return this.Field2999;
   }

   public void Method2043(boolean a) {
      this.Field2999 = a;
   }

   public void Method2044(int a) {
      this.Field3006 = a;
   }

   public void Method2046(boolean a) {
      if (!this.Field3001) {
         this.Field2998 = 0;
      }

      this.Field3001 = a;
   }

   public boolean Method2047() {
      return this.Field3001;
   }

   public int Method1830() {
      return this.Field3005;
   }

   public int Method1831() {
      return this.Method1834() ? this.Field2994 - 8 : this.Field2994;
   }

   public void Method2045(int a) {
      int var2 = this.Field2996.length();
      if (a > var2) {
         ;
      }

      byte var6 = 0;
      this.Field3005 = var6;
      if (this.Field2991 != null) {
         if (this.Field3003 > var2) {
            this.Field3003 = var2;
         }

         int var3 = this.Method1831();
         String var4 = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), var3);
         int var5 = var4.length() + this.Field3003;
         if (var6 == this.Field3003) {
            this.Field3003 -= this.Field2991.trimStringToWidth(this.Field2996, var3, true).length();
         }

         if (var6 > var5) {
            this.Field3003 += var6 - var5;
         } else if (var6 <= this.Field3003) {
            this.Field3003 -= this.Field3003 - var6;
         }

         if (this.Field3003 < 0) {
            this.Field3003 = 0;
         }

         if (this.Field3003 > var2) {
            this.Field3003 = var2;
         }
      }

   }

   public void Method2048(boolean a) {
      this.Field3000 = a;
   }

   public boolean Method2051() {
      return this.Field3008;
   }

   public void Method2050(boolean a) {
      this.Field3008 = a;
   }
}
