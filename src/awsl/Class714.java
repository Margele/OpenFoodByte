package awsl;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import trash.foodbyte.utils.RenderUtils;

public class Class714 extends Class713 {
   public Class714(int a, FontRenderer a, int a, int a, int a, int a) {
      super(a, a, a, a, a, a);
   }

   public void Method2040() {
      int[] var1 = Class713.Method2054();
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
         int var9 = this.Field3087 ? this.Field3081 + (this.Field3083 - 8) / 2 : this.Field3081;
         if (var4 > var5.length()) {
            var4 = var5.length();
         }

         int var11 = 0;
         int var14;
         if (var5.length() > 0) {
            String var12 = var5.substring(0, var3);
            char[] var13 = var12.toCharArray();
            var14 = var13.length;
            int var15 = 0;
            if (var15 < var14) {
               Character var16 = var13[var15];
               this.Field3079.drawStringWithShadow("§7*", (float)var8 + (float)var11, (float)var9, var2);
               var11 += 6;
               ++var15;
            }
         }

         if (this.Field3092 >= this.Field3084.length() && this.Field3084.length() < this.Method1829()) {
            var10000 = false;
         } else {
            var10000 = true;
         }

         int var17 = var11 + this.Field3080 + 4;
         int var18 = var8 + this.Field3082;
         var17 = var8 - 1;
         int var10 = var8 - 1;
         if (var5.length() > 0 && var3 < var5.length()) {
            var10 = this.Field3079.drawStringWithShadow(var5.substring(var3), (float)var10, (float)var9, var2);
         }

         Gui.drawRect(var17, var9 - 1, var17 + 1, var9 + 1 + this.Field3079.FONT_HEIGHT, -3092272);
         this.Field3079.drawStringWithShadow("_", (float)var17, (float)var9, var2);
         if (var4 != var3) {
            var14 = var8 + this.Field3079.getStringWidth(var5.substring(0, var4));
            this.Method2041(var17, var9 - 1, var14 - 1, var9 + 1 + this.Field3079.FONT_HEIGHT);
         }
      }

   }
}
