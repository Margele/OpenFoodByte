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
      String a = this.Field2996.replaceAll(" ", "");
      return a;
   }

   public String Method2029() {
      int a = this.Field3004 < this.Field3005 ? this.Field3004 : this.Field3005;
      int a = this.Field3004 < this.Field3005 ? this.Field3005 : this.Field3004;
      return this.Field2996.substring(a, a);
   }

   public void Method2031(String a) {
      String a = "";
      String a = ChatAllowedCharacters.filterAllowedCharacters(a);
      int a = this.Field3004 < this.Field3005 ? this.Field3004 : this.Field3005;
      int a = this.Field3004 < this.Field3005 ? this.Field3005 : this.Field3004;
      int a = this.Field2997 - this.Field2996.length() - (a - this.Field3005);
      boolean a = false;
      if (this.Field2996.length() > 0) {
         a = String.valueOf(a) + this.Field2996.substring(0, a);
      }

      int a;
      if (a < a.length()) {
         a = String.valueOf(a) + a.substring(0, a);
         a = a;
      } else {
         a = String.valueOf(a) + a;
         a = a.length();
      }

      if (this.Field2996.length() > 0 && a < this.Field2996.length()) {
         a = String.valueOf(a) + this.Field2996.substring(a);
      }

      this.Field2996 = a.replaceAll(" ", "");
      this.Method2036(a - this.Field3005 + a);
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
            int a = this.Field3004 + a;
            int a = this.Field3004;
            String a = "";
            a = this.Field2996.substring(0, a);
            if (a < this.Field2996.length()) {
               a = String.valueOf(a) + this.Field2996.substring(a);
            }

            this.Field2996 = a;
            this.Method2036(a);
         }
      }

   }

   public int Method2033(int a) {
      return this.Method2034(a, this.Method1829());
   }

   public int Method2034(int a, int a1) {
      return this.Method2035(a, this.Method1829(), true);
   }

   public int Method2035(int a, int a, boolean a2) {
      int a = a;
      boolean var5 = true;
      int a = Math.abs(a);

      for(int a = 0; a < a; ++a) {
         int a = this.Field2996.length();
         a = this.Field2996.indexOf(32, a);
         if (a == -1) {
            a = a;
         } else {
            while(a < a && this.Field2996.charAt(a) == ' ') {
               ++a;
            }
         }
      }

      return a;
   }

   public void Method2036(int a) {
      this.Method2037(this.Field3005 + a);
   }

   public void Method2037(int a) {
      this.Field3004 = a;
      int a = this.Field2996.length();
      if (this.Field3004 < 0) {
         this.Field3004 = 0;
      }

      if (this.Field3004 > a) {
         this.Field3004 = a;
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

   public void Method2039(int a, int a, int a2) {
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
         int a = a - this.Field2992;
         if (this.Field2999) {
            a -= 4;
         }

         String a = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), this.Method1831());
         this.Method2037(this.Field2991.trimStringToWidth(a, a).length() + this.Field3003);
      }

   }

   public void Method2040() {
      String a = AltLogin.Method1809();
      if (this.Method2051()) {
         if (this.Method1834()) {
            Gui.drawRect(this.Field2992 - 1, this.Field2993 - 1, this.Field2992 + this.Field2994 + 1, this.Field2993 + this.Field2995 + 1, -6250336);
            Gui.drawRect(this.Field2992, this.Field2993, this.Field2992 + this.Field2994, this.Field2993 + this.Field2995, -16777216);
         }

         int a = this.Field3002 ? this.Field3006 : this.Field3007;
         int a = this.Field3004 - this.Field3003;
         int a = this.Field3005 - this.Field3003;
         String a = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), this.Method1831());
         boolean a = a <= a.length();
         boolean var10000;
         if (this.Field3001 && this.Field2998 / 6 % 2 == 0) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         int a = this.Field2999 ? this.Field2992 + 4 : this.Field2992;
         int a = this.Field2999 ? this.Field2993 + (this.Field2995 - 8) / 2 : this.Field2993;
         int a = a;
         if (a > a.length()) {
            a = a.length();
         }

         if (a.length() > 0) {
            a.substring(0, a);
            a = Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(this.Field2996.replaceAll("(?s).", "*"), (float)a, (float)a, a);
         }

         if (this.Field3004 >= this.Field2996.length() && this.Field2996.length() < this.Method1828()) {
            var10000 = false;
         } else {
            var10000 = true;
         }

         int var14 = a + this.Field2994;
         int a = a - 1;
         --a;
         if (a.length() > 0 && a < a.length()) {
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(a.substring(a), (float)a, (float)a, a);
         }

         Gui.drawRect(a, a - 1, a + 1, a + 1 + this.Field2991.FONT_HEIGHT, -3092272);
         Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("_", (float)a, (float)a, a);
         if (a != a) {
            int a = a + this.Field2991.getStringWidth(a.substring(0, a));
            this.Method2041(a, a - 1, a - 1, a + 1 + this.Field2991.FONT_HEIGHT);
         }
      }

   }

   private void Method2041(int a, int a, int a, int a) {
      int a;
      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      if (a < a) {
         a = a;
         a = a;
         a = a;
      }

      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
      GL11.glDisable(3553);
      GL11.glEnable(3058);
      GL11.glLogicOp(5387);
      a.begin(7, a.getVertexFormat());
      a.pos((double)a, (double)a, 0.0);
      a.pos((double)a, (double)a, 0.0);
      a.pos((double)a, (double)a, 0.0);
      a.pos((double)a, (double)a, 0.0);
      a.finishDrawing();
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
      int a = this.Field2996.length();
      if (a > a) {
         ;
      }

      int a = 0;
      this.Field3005 = a;
      if (this.Field2991 != null) {
         if (this.Field3003 > a) {
            this.Field3003 = a;
         }

         int a = this.Method1831();
         String a = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), a);
         int a = a.length() + this.Field3003;
         if (a == this.Field3003) {
            this.Field3003 -= this.Field2991.trimStringToWidth(this.Field2996, a, true).length();
         }

         if (a > a) {
            this.Field3003 += a - a;
         } else if (a <= this.Field3003) {
            this.Field3003 -= this.Field3003 - a;
         }

         if (this.Field3003 < 0) {
            this.Field3003 = 0;
         }

         if (this.Field3003 > a) {
            this.Field3003 = a;
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
