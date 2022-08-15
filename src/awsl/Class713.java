/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  java.lang.Character
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiPageButtonList$GuiResponder
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.ChatAllowedCharacters
 *  net.minecraft.util.MathHelper
 */
package awsl;

import awsl.Class344;
import awsl.Class681;
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

public class Class713
extends Gui {
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
    public int Field3094 = 0xE0E0E0;
    public int Field3095 = 0x707070;
    public boolean Field3096 = true;
    public GuiPageButtonList.GuiResponder Field3097;
    public Predicate Field3098 = Predicates.alwaysTrue();
    public Class344 Field3099;
    private static int[] Field3100;

    public Class713(int a, FontRenderer a2, int a3, int a4, int a5, int a6) {
        this.Field3078 = a;
        this.Field3079 = a2;
        this.Field3080 = a3;
        this.Field3081 = a4;
        this.Field3082 = a5;
        this.Field3083 = a6;
        this.Field3099 = new Class344(20);
    }

    public void Method2028(GuiPageButtonList.GuiResponder a) {
        this.Field3097 = a;
    }

    public void Method1814() {
        ++this.Field3086;
    }

    public void Method1808(String a) {
        if (this.Field3098.apply((Object)a)) {
            this.Field3084 = a.length() > this.Field3085 ? a.substring(0, this.Field3085) : a;
            this.Method1819();
        }
    }

    public String Method1809() {
        return this.Field3084;
    }

    public String Method2029() {
        int a = this.Field3092 < this.Field3093 ? this.Field3092 : this.Field3093;
        int a2 = this.Field3092 < this.Field3093 ? this.Field3093 : this.Field3092;
        return this.Field3084.substring(a, a2);
    }

    public void Method2030(Predicate a) {
        this.Field3098 = a;
    }

    public void Method2031(String a) {
        String a2 = "";
        String a3 = ChatAllowedCharacters.filterAllowedCharacters((String)a);
        int a4 = this.Field3092 < this.Field3093 ? this.Field3092 : this.Field3093;
        int a5 = this.Field3092 < this.Field3093 ? this.Field3093 : this.Field3092;
        int a6 = this.Field3085 - this.Field3084.length() - (a4 - a5);
        int a7 = 0;
        if (this.Field3084.length() > 0) {
            a2 = a2 + this.Field3084.substring(0, a4);
        }
        if (a6 < a3.length()) {
            a2 = a2 + a3.substring(0, a6);
            a7 = a6;
        } else {
            a2 = a2 + a3;
            a7 = a3.length();
        }
        if (this.Field3084.length() > 0 && a5 < this.Field3084.length()) {
            a2 = a2 + this.Field3084.substring(a5);
        }
        if (this.Field3098.apply((Object)a2)) {
            this.Field3084 = a2;
            this.Method2036(a4 - this.Field3093 + a7);
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
                boolean a2 = true;
                int a3 = this.Field3092 + a;
                int a4 = this.Field3092;
                String a5 = "";
                a5 = this.Field3084.substring(0, a3);
                if (a4 < this.Field3084.length()) {
                    a5 = a5 + this.Field3084.substring(a4);
                }
                if (this.Field3098.apply((Object)a5)) {
                    this.Field3084 = a5;
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

    public int Method2034(int a, int a2) {
        return this.Method2035(a, a2, true);
    }

    public int Method2035(int a, int a2, boolean a3) {
        int a4 = a2;
        boolean a5 = true;
        int a6 = Math.abs((int)a);
        block0: for (int a7 = 0; a7 < a6; ++a7) {
            int a8 = this.Field3084.length();
            if ((a4 = this.Field3084.indexOf(32, a4)) == -1) {
                a4 = a8;
                continue;
            }
            while (true) {
                if (a4 >= a8 || this.Field3084.charAt(a4) != ' ') continue block0;
                ++a4;
            }
        }
        return a4;
    }

    public void Method2036(int a) {
        this.Method2037(this.Field3093 + a);
    }

    public void Method2037(int a) {
        this.Field3092 = a;
        int a2 = this.Field3084.length();
        this.Field3092 = MathHelper.clamp_int((int)this.Field3092, (int)0, (int)a2);
        this.Method2049(this.Field3092);
    }

    public void Method1816() {
        this.Method2037(0);
    }

    public void Method1819() {
        this.Method2037(this.Field3084.length());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Method2038(char a, int a2) {
        int[] nArray = Class713.Method2054();
        if (!this.Field3089) {
            return false;
        }
        if (GuiScreen.isKeyComboCtrlA((int)a2)) {
            this.Method1819();
            this.Method2049(0);
            return true;
        }
        if (GuiScreen.isKeyComboCtrlC((int)a2)) {
            GuiScreen.setClipboardString((String)this.Method2029());
            return true;
        }
        if (GuiScreen.isKeyComboCtrlV((int)a2)) {
            if (!this.Field3090) return true;
            this.Method2031(GuiScreen.getClipboardString());
            return true;
        }
        if (GuiScreen.isKeyComboCtrlX((int)a2)) {
            GuiScreen.setClipboardString((String)this.Method2029());
            if (!this.Field3090) return true;
            this.Method2031("");
            return true;
        }
        switch (a2) {
            case 14: {
                if (GuiScreen.isCtrlKeyDown()) {
                    if (!this.Field3090) return true;
                    this.Method1836(-1);
                }
                if (!this.Field3090) return true;
                this.Method2032(-1);
                return true;
            }
            case 199: {
                if (GuiScreen.isShiftKeyDown()) {
                    this.Method2049(0);
                }
                this.Method1816();
                return true;
            }
            case 203: {
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
            }
            case 205: {
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
            }
            case 207: {
                if (GuiScreen.isShiftKeyDown()) {
                    this.Method2049(this.Field3084.length());
                }
                this.Method1819();
                return true;
            }
            case 211: {
                if (GuiScreen.isCtrlKeyDown()) {
                    if (!this.Field3090) return true;
                    this.Method1836(1);
                }
                if (!this.Field3090) return true;
                this.Method2032(1);
                return true;
            }
        }
        if (!ChatAllowedCharacters.isAllowedCharacter((char)a)) return false;
        if (!this.Field3090) return true;
        this.Method2031(Character.toString((char)a));
        return true;
    }

    public void Method2039(int a, int a2, int a3) {
        boolean a4;
        boolean bl = a4 = a >= this.Field3080 && a < this.Field3080 + this.Field3082 && a2 >= this.Field3081 && a2 < this.Field3081 + this.Field3083;
        if (this.Field3088) {
            this.Method2046(a4);
        }
        if (this.Field3089) {
            int a5 = a - this.Field3080;
            if (this.Field3087) {
                a5 -= 4;
            }
            String a6 = this.Field3079.trimStringToWidth(this.Field3084.substring(this.Field3091), this.Method1832());
            this.Method2037(this.Field3079.trimStringToWidth(a6, a5).length() + this.Field3091);
        }
    }

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
            int a9 = this.Field3087 ? this.Field3081 + (this.Field3083 - 5) / 2 : this.Field3081;
            int a10 = a8;
            if (a5 > a6.length()) {
                a5 = a6.length();
            }
            if (a6.length() > 0) {
                String a11 = a6.substring(0, a4);
                a10 = this.Field3079.drawStringWithShadow(a11, (float)a8, (float)a9, a3);
            }
            boolean a12 = this.Field3092 < this.Field3084.length() || this.Field3084.length() >= this.Method1829();
            int a13 = a10;
            a13 = a8 + this.Field3082;
            a13 = a10 - 1;
            --a10;
            if (a6.length() > 0) {
                if (a4 < a6.length()) {
                    a10 = this.Field3079.drawStringWithShadow(a6.substring(a4), (float)a10, (float)a9, a3);
                }
            }
            Gui.drawRect((int)a13, (int)(a9 - 1), (int)(a13 + 1), (int)(a9 + 1 + this.Field3079.FONT_HEIGHT), (int)-3092272);
            this.Field3079.drawStringWithShadow("_", (float)a13, (float)a9, a3);
            if (a5 != a4) {
                int a14 = a8 + this.Field3079.getStringWidth(a6.substring(0, a5));
                this.Method2041(a13, a9 - 1, a14 - 1, a9 + 1 + this.Field3079.FONT_HEIGHT);
            }
        }
    }

    public void Method2041(int a, int a2, int a3, int a4) {
        int a5;
        if (a < a3) {
            a5 = a;
            a = a3;
            a3 = a5;
        }
        if (a2 < a4) {
            a5 = a2;
            a2 = a4;
            a4 = a5;
        }
        if (a3 > this.Field3080 + this.Field3082) {
            a3 = this.Field3080 + this.Field3082;
        }
        if (a > this.Field3080 + this.Field3082) {
            a = this.Field3080 + this.Field3082;
        }
        Tessellator a6 = Tessellator.getInstance();
        WorldRenderer a7 = a6.getWorldRenderer();
        GlStateManager.color((float)0.0f, (float)0.0f, (float)255.0f, (float)255.0f);
        GlStateManager.disableTexture2D();
        GlStateManager.enableColorLogic();
        GlStateManager.colorLogicOp((int)5387);
        a7.begin(7, DefaultVertexFormats.POSITION);
        a7.pos((double)a, (double)a4, 0.0).endVertex();
        a7.pos((double)a3, (double)a4, 0.0).endVertex();
        a7.pos((double)a3, (double)a2, 0.0).endVertex();
        a7.pos((double)a, (double)a2, 0.0).endVertex();
        a6.draw();
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
        int a2 = this.Field3084.length();
        if (a > a2) {
            a = a2;
        }
        this.Field3093 = a = 0;
        if (this.Field3079 != null) {
            if (this.Field3091 > a2) {
                this.Field3091 = a2;
            }
            int a3 = this.Method1832();
            String a4 = this.Field3079.trimStringToWidth(this.Field3084.substring(this.Field3091), a3);
            int a5 = a4.length() + this.Field3091;
            if (a == this.Field3091) {
                this.Field3091 -= this.Field3079.trimStringToWidth(this.Field3084, a3, true).length();
            }
            if (a > a5) {
                this.Field3091 += a - a5;
            } else if (a <= this.Field3091) {
                this.Field3091 -= this.Field3091 - a;
            }
            this.Field3091 = MathHelper.clamp_int((int)this.Field3091, (int)0, (int)a2);
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

    public static void Method2053(int[] nArray) {
        Field3100 = nArray;
    }

    public static int[] Method2054() {
        return Field3100;
    }

    static {
        if (Class713.Method2054() == null) {
            Class713.Method2053(new int[5]);
        }
    }
}