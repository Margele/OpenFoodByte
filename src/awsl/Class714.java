/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 */
package awsl;

import awsl.Class681;
import awsl.Class713;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import trash.foodbyte.utils.RenderUtils;

public class Class714
extends Class713 {
    public Class714(int a, FontRenderer a2, int a3, int a4, int a5, int a6) {
        super(a, a2, a3, a4, a5, a6);
    }

    @Override
    public void Method2040() {
        int[] a = Class713.Method2054();
        if (this.Method2051()) {
            boolean a2;
            int a3;
            if (this.Method1834()) {
                this.Field3099.Method290(this.Field3089);
                a3 = (int)(this.Field3099.Method292() * 50.0);
                RenderUtils.Method1108(this.Field3080, this.Field3081, this.Field3080 + this.Field3082, this.Field3081 + this.Field3083, 0.5, 0x55999999 + 0x1000000 * a3, Class681.Method1612(0));
            }
            a3 = this.Field3090 ? this.Field3094 : this.Field3095;
            int a4 = this.Field3092 - this.Field3091;
            int a5 = this.Field3093 - this.Field3091;
            String a6 = this.Field3079.trimStringToWidth(this.Field3084.substring(this.Field3091), this.Method1832());
            boolean bl = a2 = a4 <= a6.length();
            boolean a7 = this.Field3089 && this.Field3086 / 6 % 2 == 0;
            int a8 = this.Field3087 ? this.Field3080 + 4 : this.Field3080;
            int a9 = this.Field3087 ? this.Field3081 + (this.Field3083 - 8) / 2 : this.Field3081;
            int a10 = a8;
            if (a5 > a6.length()) {
                a5 = a6.length();
            }
            int a11 = 0;
            if (a6.length() > 0) {
                int n = 0;
                String a12 = a6.substring(0, a4);
                char[] cArray = a12.toCharArray();
                int n2 = cArray.length;
                if (n < n2) {
                    Character a13 = Character.valueOf((char)cArray[n]);
                    this.Field3079.drawStringWithShadow("\u00a77*", (float)a8 + (float)a11, (float)a9, a3);
                    a11 += 6;
                    ++n;
                }
            }
            boolean a14 = this.Field3092 < this.Field3084.length() || this.Field3084.length() >= this.Method1829();
            int a15 = a11 + this.Field3080 + 4;
            a15 = a8 + this.Field3082;
            a15 = a10 - 1;
            --a10;
            if (a6.length() > 0) {
                if (a4 < a6.length()) {
                    a10 = this.Field3079.drawStringWithShadow(a6.substring(a4), (float)a10, (float)a9, a3);
                }
            }
            Gui.drawRect((int)a15, (int)(a9 - 1), (int)(a15 + 1), (int)(a9 + 1 + this.Field3079.FONT_HEIGHT), (int)-3092272);
            this.Field3079.drawStringWithShadow("_", (float)a15, (float)a9, a3);
            if (a5 != a4) {
                int a16 = a8 + this.Field3079.getStringWidth(a6.substring(0, a5));
                this.Method2041(a15, a9 - 1, a16 - 1, a9 + 1 + this.Field3079.FONT_HEIGHT);
            }
        }
    }
}