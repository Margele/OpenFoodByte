package awsl;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import trash.foodbyte.utils.RenderUtils;

public class Class714 extends Class713 {
   public Class714(int a, FontRenderer a, int a, int a, int a, int a) {
      super(a, a, a, a, a, a);
   }

   public void Method2040() {
      int[] a = Class713.Method2054();
      if (this.Method2051()) {
         int a;
         if (this.Method1834()) {
            this.Field3099.Method290(this.Field3089);
            a = (int)(this.Field3099.Method292() * 50.0);
            RenderUtils.Method1108((double)this.Field3080, (double)this.Field3081, (double)(this.Field3080 + this.Field3082), (double)(this.Field3081 + this.Field3083), 0.5, 1436129689 + 16777216 * a, Class681.Method1612(0));
         }

         a = this.Field3090 ? this.Field3094 : this.Field3095;
         int a = this.Field3092 - this.Field3091;
         int a = this.Field3093 - this.Field3091;
         String a = this.Field3079.trimStringToWidth(this.Field3084.substring(this.Field3091), this.Method1832());
         boolean a = a <= a.length();
         boolean var10000;
         if (this.Field3089 && this.Field3086 / 6 % 2 == 0) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         int a = this.Field3087 ? this.Field3080 + 4 : this.Field3080;
         int a = this.Field3087 ? this.Field3081 + (this.Field3083 - 8) / 2 : this.Field3081;
         if (a > a.length()) {
            a = a.length();
         }

         int a = 0;
         int a;
         if (a.length() > 0) {
            String var12 = a.substring(0, a);
            char[] var13 = var12.toCharArray();
            a = var13.length;
            int var15 = 0;
            if (var15 < a) {
               Character a = var13[var15];
               this.Field3079.drawStringWithShadow("§7*", (float)a + (float)a, (float)a, a);
               a += 6;
               ++var15;
            }
         }

         if (this.Field3092 >= this.Field3084.length() && this.Field3084.length() < this.Method1829()) {
            var10000 = false;
         } else {
            var10000 = true;
         }

         int a = a + this.Field3080 + 4;
         int var18 = a + this.Field3082;
         a = a - 1;
         int a = a - 1;
         if (a.length() > 0 && a < a.length()) {
            a = this.Field3079.drawStringWithShadow(a.substring(a), (float)a, (float)a, a);
         }

         Gui.drawRect(a, a - 1, a + 1, a + 1 + this.Field3079.FONT_HEIGHT, -3092272);
         this.Field3079.drawStringWithShadow("_", (float)a, (float)a, a);
         if (a != a) {
            a = a + this.Field3079.getStringWidth(a.substring(0, a));
            this.Method2041(a, a - 1, a - 1, a + 1 + this.Field3079.FONT_HEIGHT);
         }
      }

   }
}
