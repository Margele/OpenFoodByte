package awsl;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiPageButtonList;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.util.MathHelper;
import trash.foodbyte.utils.RenderUtils;

public class Class713 extends Gui {
   public int Field3078;
   public FontRenderer Field3079;
   public int Field3080;
   public int Field3081;
   public int Field3082;
   public int Field3083;
   public String Field3084 = "";
   public int Field3085 = 32;
   public int Field3086;
   public boolean Field3087 = true;
   public boolean Field3088 = true;
   public boolean Field3089;
   public boolean Field3090 = true;
   public int Field3091;
   public int Field3092;
   public int Field3093;
   public int Field3094 = 14737632;
   public int Field3095 = 7368816;
   public boolean Field3096 = true;
   public GuiPageButtonList.GuiResponder Field3097;
   public Predicate Field3098 = Predicates.alwaysTrue();
   public Class344 Field3099;
   private static int[] Field3100;

   public Class713(int a, FontRenderer a, int a, int a, int a, int a) {
      this.Field3078 = a;
      this.Field3079 = a;
      this.Field3080 = a;
      this.Field3081 = a;
      this.Field3082 = a;
      this.Field3083 = a;
      this.Field3099 = new Class344(20);
   }

   public void Method2028(GuiPageButtonList.GuiResponder a) {
      this.Field3097 = a;
   }

   public void Method1814() {
      ++this.Field3086;
   }

   public void Method1808(String a) {
      if (this.Field3098.apply(a)) {
         if (a.length() > this.Field3085) {
            this.Field3084 = a.substring(0, this.Field3085);
         } else {
            this.Field3084 = a;
         }

         this.Method1819();
      }

   }

   public String Method1809() {
      return this.Field3084;
   }

   public String Method2029() {
      int var1 = this.Field3092 < this.Field3093 ? this.Field3092 : this.Field3093;
      int var2 = this.Field3092 < this.Field3093 ? this.Field3093 : this.Field3092;
      return this.Field3084.substring(var1, var2);
   }

   public void Method2030(Predicate a) {
      this.Field3098 = a;
   }

   public void Method2031(String a) {
      String var2 = "";
      String var3 = ChatAllowedCharacters.filterAllowedCharacters(a);
      int var4 = this.Field3092 < this.Field3093 ? this.Field3092 : this.Field3093;
      int var5 = this.Field3092 < this.Field3093 ? this.Field3093 : this.Field3092;
      int var6 = this.Field3085 - this.Field3084.length() - (var4 - var5);
      boolean var7 = false;
      if (this.Field3084.length() > 0) {
         var2 = var2 + this.Field3084.substring(0, var4);
      }

      int var8;
      if (var6 < var3.length()) {
         var2 = var2 + var3.substring(0, var6);
         var8 = var6;
      } else {
         var2 = var2 + var3;
         var8 = var3.length();
      }

      if (this.Field3084.length() > 0 && var5 < this.Field3084.length()) {
         var2 = var2 + this.Field3084.substring(var5);
      }

      if (this.Field3098.apply(var2)) {
         this.Field3084 = var2;
         this.Method2036(var4 - this.Field3093 + var8);
         if (this.Field3097 != null) {
            this.Field3097.func_175319_a(this.Field3078, this.Field3084);
         }
      }

   }

   public void Method1836(int a) {
      if (this.Field3084.length() != 0) {
         if (this.Field3093 != this.Field3092) {
            this.Method2031("");
         } else {
            this.Method2032(this.Method2033(a) - this.Field3092);
         }
      }

   }

   public void Method2032(int a) {
      if (this.Field3084.length() != 0) {
         if (this.Field3093 != this.Field3092) {
            this.Method2031("");
         } else {
            boolean var2 = true;
            int var3 = this.Field3092 + a;
            int var4 = this.Field3092;
            String var5 = "";
            var5 = this.Field3084.substring(0, var3);
            if (var4 < this.Field3084.length()) {
               var5 = var5 + this.Field3084.substring(var4);
            }

            if (this.Field3098.apply(var5)) {
               this.Field3084 = var5;
               this.Method2036(a);
               if (this.Field3097 != null) {
                  this.Field3097.func_175319_a(this.Field3078, this.Field3084);
               }
            }
         }
      }

   }

   public int Method1828() {
      return this.Field3078;
   }

   public int Method2033(int a) {
      return this.Method2034(a, this.Method1830());
   }

   public int Method2034(int a, int a) {
      return this.Method2035(a, a, true);
   }

   public int Method2035(int a, int a, boolean a) {
      int var4 = a;
      boolean var5 = true;
      int var6 = Math.abs(a);

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.Field3084.length();
         var4 = this.Field3084.indexOf(32, var4);
         if (var4 == -1) {
            var4 = var8;
         } else {
            while(var4 < var8 && this.Field3084.charAt(var4) == ' ') {
               ++var4;
            }
         }
      }

      return var4;
   }

   public void Method2036(int a) {
      this.Method2037(this.Field3093 + a);
   }

   public void Method2037(int a) {
      this.Field3092 = a;
      int var2 = this.Field3084.length();
      this.Field3092 = MathHelper.clamp_int(this.Field3092, 0, var2);
      this.Method2049(this.Field3092);
   }

   public void Method1816() {
      this.Method2037(0);
   }

   public void Method1819() {
      this.Method2037(this.Field3084.length());
   }

   public boolean Method2038(char a, int a) {
      int[] var3 = Method2054();
      if (!this.Field3089) {
         return false;
      } else if (GuiScreen.isKeyComboCtrlA(a)) {
         this.Method1819();
         this.Method2049(0);
         return true;
      } else if (GuiScreen.isKeyComboCtrlC(a)) {
         GuiScreen.setClipboardString(this.Method2029());
         return true;
      } else if (GuiScreen.isKeyComboCtrlV(a)) {
         if (this.Field3090) {
            this.Method2031(GuiScreen.getClipboardString());
         }

         return true;
      } else if (GuiScreen.isKeyComboCtrlX(a)) {
         GuiScreen.setClipboardString(this.Method2029());
         if (this.Field3090) {
            this.Method2031("");
         }

         return true;
      } else {
         switch (a) {
            case 14:
               if (GuiScreen.isCtrlKeyDown()) {
                  if (!this.Field3090) {
                     return true;
                  }

                  this.Method1836(-1);
               }

               if (this.Field3090) {
                  this.Method2032(-1);
               }

               return true;
            case 199:
               if (GuiScreen.isShiftKeyDown()) {
                  this.Method2049(0);
               }

               this.Method1816();
               return true;
            case 203:
               if (GuiScreen.isShiftKeyDown()) {
                  if (GuiScreen.isCtrlKeyDown()) {
                     this.Method2049(this.Method2034(-1, this.Method1831()));
                  }

                  this.Method2049(this.Method1831() - 1);
               }

               if (GuiScreen.isCtrlKeyDown()) {
                  this.Method2037(this.Method2033(-1));
               }

               this.Method2036(-1);
               return true;
            case 205:
               if (GuiScreen.isShiftKeyDown()) {
                  if (GuiScreen.isCtrlKeyDown()) {
                     this.Method2049(this.Method2034(1, this.Method1831()));
                  }

                  this.Method2049(this.Method1831() + 1);
               }

               if (GuiScreen.isCtrlKeyDown()) {
                  this.Method2037(this.Method2033(1));
               }

               this.Method2036(1);
               return true;
            case 207:
               if (GuiScreen.isShiftKeyDown()) {
                  this.Method2049(this.Field3084.length());
               }

               this.Method1819();
               return true;
            case 211:
               if (GuiScreen.isCtrlKeyDown()) {
                  if (!this.Field3090) {
                     return true;
                  }

                  this.Method1836(1);
               }

               if (this.Field3090) {
                  this.Method2032(1);
               }

               return true;
            default:
               if (ChatAllowedCharacters.isAllowedCharacter(a)) {
                  if (this.Field3090) {
                     this.Method2031(Character.toString(a));
                  }

                  return true;
               } else {
                  return false;
               }
         }
      }
   }

   public void Method2039(int a, int a, int a) {
      boolean var4 = a >= this.Field3080 && a < this.Field3080 + this.Field3082 && a >= this.Field3081 && a < this.Field3081 + this.Field3083;
      if (this.Field3088) {
         this.Method2046(var4);
      }

      if (this.Field3089) {
         int var5 = a - this.Field3080;
         if (this.Field3087) {
            var5 -= 4;
         }

         String var6 = this.Field3079.trimStringToWidth(this.Field3084.substring(this.Field3091), this.Method1832());
         this.Method2037(this.Field3079.trimStringToWidth(var6, var5).length() + this.Field3091);
      }

   }

   public void Method2040() {
      int[] var1 = Method2054();
      if (this.Method2051()) {
         int var2;
         if (this.Method1834()) {
            this.Field3099.Method290(this.Field3089);
            var2 = (int)(this.Field3099.Method292() * 50.0);
            RenderUtils.Method1108((double)this.Field3080, (double)this.Field3081, (double)(this.Field3080 + this.Field3082), (double)(this.Field3081 + this.Field3083), 0.5, 1436129689 + 16777216 * var2, Class681.Method1612(0));
         }

         var2 = this.Field3090 ? this.Field3094 : this.Field3095;
         int var3 = this.Field3092 - this.Field3091;
         int var4 = this.Field3093 - this.Field3091;
         String var5 = this.Field3079.trimStringToWidth(this.Field3084.substring(this.Field3091), this.Method1832());
         boolean var6 = var3 <= var5.length();
         boolean var10000;
         if (this.Field3089 && this.Field3086 / 6 % 2 == 0) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         int var8 = this.Field3087 ? this.Field3080 + 4 : this.Field3080;
         int var9 = this.Field3087 ? this.Field3081 + (this.Field3083 - 5) / 2 : this.Field3081;
         int var10 = var8;
         if (var4 > var5.length()) {
            var4 = var5.length();
         }

         if (var5.length() > 0) {
            String var11 = var5.substring(0, var3);
            var10 = this.Field3079.drawStringWithShadow(var11, (float)var8, (float)var9, var2);
         }

         if (this.Field3092 >= this.Field3084.length() && this.Field3084.length() < this.Method1829()) {
            var10000 = false;
         } else {
            var10000 = true;
         }

         int var14 = var8 + this.Field3082;
         int var12 = var10 - 1;
         --var10;
         if (var5.length() > 0 && var3 < var5.length()) {
            var10 = this.Field3079.drawStringWithShadow(var5.substring(var3), (float)var10, (float)var9, var2);
         }

         Gui.drawRect(var12, var9 - 1, var12 + 1, var9 + 1 + this.Field3079.FONT_HEIGHT, -3092272);
         this.Field3079.drawStringWithShadow("_", (float)var12, (float)var9, var2);
         if (var4 != var3) {
            int var13 = var8 + this.Field3079.getStringWidth(var5.substring(0, var4));
            this.Method2041(var12, var9 - 1, var13 - 1, var9 + 1 + this.Field3079.FONT_HEIGHT);
         }
      }

   }

   public void Method2041(int a, int a, int a, int a) {
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

      if (a > this.Field3080 + this.Field3082) {
         a = this.Field3080 + this.Field3082;
      }

      if (a > this.Field3080 + this.Field3082) {
         a = this.Field3080 + this.Field3082;
      }

      Tessellator var7 = Tessellator.getInstance();
      WorldRenderer var6 = var7.getWorldRenderer();
      GlStateManager.color(0.0F, 0.0F, 255.0F, 255.0F);
      GlStateManager.disableTexture2D();
      GlStateManager.enableColorLogic();
      GlStateManager.colorLogicOp(5387);
      var6.begin(7, DefaultVertexFormats.POSITION);
      var6.pos((double)a, (double)a, 0.0).endVertex();
      var6.pos((double)a, (double)a, 0.0).endVertex();
      var6.pos((double)a, (double)a, 0.0).endVertex();
      var6.pos((double)a, (double)a, 0.0).endVertex();
      var7.draw();
      GlStateManager.disableColorLogic();
      GlStateManager.enableTexture2D();
   }

   public void Method2042(int a) {
      this.Field3085 = a;
      if (this.Field3084.length() > a) {
         this.Field3084 = this.Field3084.substring(0, a);
      }

   }

   public int Method1829() {
      return this.Field3085;
   }

   public int Method1830() {
      return this.Field3092;
   }

   public boolean Method1834() {
      return this.Field3087;
   }

   public void Method2043(boolean a) {
      this.Field3087 = a;
   }

   public void Method2044(int a) {
      this.Field3094 = a;
   }

   public void Method2045(int a) {
      this.Field3095 = a;
   }

   public void Method2046(boolean a) {
      if (!this.Field3089) {
         this.Field3086 = 0;
      }

      this.Field3089 = a;
   }

   public boolean Method2047() {
      return this.Field3089;
   }

   public void Method2048(boolean a) {
      this.Field3090 = a;
   }

   public int Method1831() {
      return this.Field3093;
   }

   public int Method1832() {
      return this.Method1834() ? this.Field3082 - 8 : this.Field3082;
   }

   public void Method2049(int a) {
      int var2 = this.Field3084.length();
      if (a > var2) {
         ;
      }

      byte var6 = 0;
      this.Field3093 = var6;
      if (this.Field3079 != null) {
         if (this.Field3091 > var2) {
            this.Field3091 = var2;
         }

         int var3 = this.Method1832();
         String var4 = this.Field3079.trimStringToWidth(this.Field3084.substring(this.Field3091), var3);
         int var5 = var4.length() + this.Field3091;
         if (var6 == this.Field3091) {
            this.Field3091 -= this.Field3079.trimStringToWidth(this.Field3084, var3, true).length();
         }

         if (var6 > var5) {
            this.Field3091 += var6 - var5;
         } else if (var6 <= this.Field3091) {
            this.Field3091 -= this.Field3091 - var6;
         }

         this.Field3091 = MathHelper.clamp_int(this.Field3091, 0, var2);
      }

   }

   public void Method2050(boolean a) {
      this.Field3088 = a;
   }

   public boolean Method2051() {
      return this.Field3096;
   }

   public void Method2052(boolean a) {
      this.Field3096 = a;
   }

   public static void Method2053(int[] arr) {
      Field3100 = arr;
   }

   public static int[] Method2054() {
      return Field3100;
   }

   static {
      if (Method2054() == null) {
         Method2053(new int[5]);
      }

   }
}
