/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.util.ChatAllowedCharacters
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class706;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.ChatAllowedCharacters;
import org.lwjgl.opengl.GL11;

public class Class696
extends Gui {
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
    private int Field3006 = 0xE0E0E0;
    private int Field3007 = 0x707070;
    private boolean Field3008 = true;

    public Class696(FontRenderer a, int a2, int a3, int a4, int a5) {
        this.Field2991 = a;
        this.Field2992 = a2;
        this.Field2993 = a3;
        this.Field2994 = a4;
        this.Field2995 = a5;
    }

    public void Method1814() {
        ++this.Field2998;
    }

    public void Method1808(String a) {
        this.Field2996 = a.length() > this.Field2997 ? a.substring(0, this.Field2997) : a;
        this.Method1819();
    }

    public String Method1809() {
        String a = this.Field2996.replaceAll(" ", "");
        return a;
    }

    public String Method2029() {
        int a = this.Field3004 < this.Field3005 ? this.Field3004 : this.Field3005;
        int a2 = this.Field3004 < this.Field3005 ? this.Field3005 : this.Field3004;
        return this.Field2996.substring(a, a2);
    }

    public void Method2031(String a) {
        int a2;
        String a3 = "";
        String a4 = ChatAllowedCharacters.filterAllowedCharacters((String)a);
        int a5 = this.Field3004 < this.Field3005 ? this.Field3004 : this.Field3005;
        int a6 = this.Field3004 < this.Field3005 ? this.Field3005 : this.Field3004;
        int a7 = this.Field2997 - this.Field2996.length() - (a5 - this.Field3005);
        boolean a8 = false;
        if (this.Field2996.length() > 0) {
            a3 = String.valueOf((Object)String.valueOf((Object)a3)) + this.Field2996.substring(0, a5);
        }
        if (a7 < a4.length()) {
            a3 = String.valueOf((Object)String.valueOf((Object)a3)) + a4.substring(0, a7);
            a2 = a7;
        } else {
            a3 = String.valueOf((Object)String.valueOf((Object)a3)) + a4;
            a2 = a4.length();
        }
        if (this.Field2996.length() > 0 && a6 < this.Field2996.length()) {
            a3 = String.valueOf((Object)String.valueOf((Object)a3)) + this.Field2996.substring(a6);
        }
        this.Field2996 = a3.replaceAll(" ", "");
        this.Method2036(a5 - this.Field3005 + a2);
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
                boolean a2 = true;
                int a3 = this.Field3004 + a;
                int a4 = this.Field3004;
                String a5 = "";
                a5 = this.Field2996.substring(0, a3);
                if (a4 < this.Field2996.length()) {
                    a5 = String.valueOf((Object)String.valueOf((Object)a5)) + this.Field2996.substring(a4);
                }
                this.Field2996 = a5;
                this.Method2036(a);
            }
        }
    }

    public int Method2033(int a) {
        return this.Method2034(a, this.Method1829());
    }

    public int Method2034(int a, int a2) {
        return this.Method2035(a, this.Method1829(), true);
    }

    public int Method2035(int a, int a2, boolean a3) {
        int a4 = a2;
        boolean a5 = true;
        int a6 = Math.abs((int)a);
        block0: for (int a7 = 0; a7 < a6; ++a7) {
            int a8 = this.Field2996.length();
            if ((a4 = this.Field2996.indexOf(32, a4)) == -1) {
                a4 = a8;
                continue;
            }
            while (true) {
                if (a4 >= a8 || this.Field2996.charAt(a4) != ' ') continue block0;
                ++a4;
            }
        }
        return a4;
    }

    public void Method2036(int a) {
        this.Method2037(this.Field3005 + a);
    }

    public void Method2037(int a) {
        this.Field3004 = a;
        int a2 = this.Field2996.length();
        if (this.Field3004 < 0) {
            this.Field3004 = 0;
        }
        if (this.Field3004 > a2) {
            this.Field3004 = a2;
        }
        this.Method2045(this.Field3004);
    }

    public void Method1816() {
        this.Method2037(0);
    }

    public void Method1819() {
        this.Method2037(this.Field2996.length());
    }

    public boolean Method2038(char a, int a2) {
        String string = Class706.Method1809();
        if (!this.Field3002 || !this.Field3001) {
            return false;
        }
        switch (a) {
            case '\u0001': {
                this.Method1819();
                this.Method2045(0);
                return true;
            }
            case '\u0003': {
                GuiScreen.setClipboardString((String)this.Method2029());
                return true;
            }
            case '\u0016': {
                this.Method2031(GuiScreen.getClipboardString());
                return true;
            }
            case '\u0018': {
                GuiScreen.setClipboardString((String)this.Method2029());
                this.Method2031("");
                return true;
            }
        }
        switch (a2) {
            case 14: {
                if (GuiScreen.isCtrlKeyDown()) {
                    this.Method1836(-1);
                }
                this.Method2032(-1);
                return true;
            }
            case 199: {
                if (GuiScreen.isShiftKeyDown()) {
                    this.Method2045(0);
                }
                this.Method1816();
                return true;
            }
            case 203: {
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
            }
            case 205: {
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
            }
            case 207: {
                if (GuiScreen.isShiftKeyDown()) {
                    this.Method2045(this.Field2996.length());
                }
                this.Method1819();
                return true;
            }
            case 211: {
                if (GuiScreen.isCtrlKeyDown()) {
                    this.Method1836(1);
                }
                this.Method2032(1);
                return true;
            }
        }
        if (ChatAllowedCharacters.isAllowedCharacter((char)a)) {
            this.Method2031(Character.toString((char)a));
            return true;
        }
        return false;
    }

    public void Method2039(int a, int a2, int a3) {
        boolean a4;
        boolean bl = a4 = a >= this.Field2992 && a < this.Field2992 + this.Field2994 && a2 >= this.Field2993 && a2 < this.Field2993 + this.Field2995;
        if (this.Field3000) {
            this.Method2046(this.Field3002);
        }
        if (this.Field3001) {
            int a5 = a - this.Field2992;
            if (this.Field2999) {
                a5 -= 4;
            }
            String a6 = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), this.Method1831());
            this.Method2037(this.Field2991.trimStringToWidth(a6, a5).length() + this.Field3003);
        }
    }

    public void Method2040() {
        String a = Class706.Method1809();
        if (this.Method2051()) {
            boolean a2;
            if (this.Method1834()) {
                Gui.drawRect((int)(this.Field2992 - 1), (int)(this.Field2993 - 1), (int)(this.Field2992 + this.Field2994 + 1), (int)(this.Field2993 + this.Field2995 + 1), (int)-6250336);
                Gui.drawRect((int)this.Field2992, (int)this.Field2993, (int)(this.Field2992 + this.Field2994), (int)(this.Field2993 + this.Field2995), (int)-16777216);
            }
            int a3 = this.Field3002 ? this.Field3006 : this.Field3007;
            int a4 = this.Field3004 - this.Field3003;
            int a5 = this.Field3005 - this.Field3003;
            String a6 = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), this.Method1831());
            boolean bl = a2 = a4 <= a6.length();
            boolean a7 = this.Field3001 && this.Field2998 / 6 % 2 == 0;
            int a8 = this.Field2999 ? this.Field2992 + 4 : this.Field2992;
            int a9 = this.Field2999 ? this.Field2993 + (this.Field2995 - 8) / 2 : this.Field2993;
            int a10 = a8;
            if (a5 > a6.length()) {
                a5 = a6.length();
            }
            if (a6.length() > 0) {
                a6.substring(0, a4);
                a10 = Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(this.Field2996.replaceAll("(?s).", "*"), (float)a8, (float)a9, a3);
            }
            boolean a11 = this.Field3004 < this.Field2996.length() || this.Field2996.length() >= this.Method1828();
            int a12 = a10;
            a12 = a8 + this.Field2994;
            a12 = a10 - 1;
            --a10;
            if (a6.length() > 0) {
                if (a4 < a6.length()) {
                    Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(a6.substring(a4), (float)a10, (float)a9, a3);
                }
            }
            Gui.drawRect((int)a12, (int)(a9 - 1), (int)(a12 + 1), (int)(a9 + 1 + this.Field2991.FONT_HEIGHT), (int)-3092272);
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("_", (float)a12, (float)a9, a3);
            if (a5 != a4) {
                int a13 = a8 + this.Field2991.getStringWidth(a6.substring(0, a5));
                this.Method2041(a12, a9 - 1, a13 - 1, a9 + 1 + this.Field2991.FONT_HEIGHT);
            }
        }
    }

    private void Method2041(int a, int a2, int a3, int a4) {
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
        Tessellator a6 = Tessellator.getInstance();
        WorldRenderer a7 = a6.getWorldRenderer();
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)255.0f, (float)255.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3058);
        GL11.glLogicOp((int)5387);
        a7.begin(7, a7.getVertexFormat());
        a7.pos((double)a, (double)a4, 0.0);
        a7.pos((double)a3, (double)a4, 0.0);
        a7.pos((double)a3, (double)a2, 0.0);
        a7.pos((double)a, (double)a2, 0.0);
        a7.finishDrawing();
        GL11.glDisable((int)3058);
        GL11.glEnable((int)3553);
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
        int a2 = this.Field2996.length();
        if (a > a2) {
            a = a2;
        }
        this.Field3005 = a = 0;
        if (this.Field2991 != null) {
            if (this.Field3003 > a2) {
                this.Field3003 = a2;
            }
            int a3 = this.Method1831();
            String a4 = this.Field2991.trimStringToWidth(this.Field2996.substring(this.Field3003), a3);
            int a5 = a4.length() + this.Field3003;
            if (a == this.Field3003) {
                this.Field3003 -= this.Field2991.trimStringToWidth(this.Field2996, a3, true).length();
            }
            if (a > a5) {
                this.Field3003 += a - a5;
            } else if (a <= this.Field3003) {
                this.Field3003 -= this.Field3003 - a;
            }
            if (this.Field3003 < 0) {
                this.Field3003 = 0;
            }
            if (this.Field3003 > a2) {
                this.Field3003 = a2;
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