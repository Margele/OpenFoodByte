/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.util.IChatComponent
 */
package awsl;

import awsl.Class713;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.IChatComponent;
import obfuscate.a;
import trash.foodbyte.utils.ServerUtils;

public class Class710
extends GuiScreen {
    private String Field3070;
    private IChatComponent Field3071;
    private List Field3072;
    private final GuiScreen Field3073;
    private int Field3074;
    private GuiButton Field3075;
    private int Field3076;

    public Class710(GuiScreen a, String a2, IChatComponent a3) {
        this.Field3073 = a;
        this.Field3070 = I18n.format((String)a2, (Object[])new Object[0]);
        this.Field3071 = a3;
    }

    protected void Method1804(char a, int a2) throws IOException {
    }

    public void Method1801() {
        this.buttonList.clear();
        this.Field3072 = this.fontRendererObj.listFormattedStringToWidth(this.Field3071.getFormattedText(), this.width - 50);
        this.Field3074 = this.Field3072.Method1799() * this.fontRendererObj.FONT_HEIGHT;
        this.buttonList.Method2530((Object)new GuiButton(0, this.width / 2 - 100, this.height / 2 + this.Field3074 / 2 + this.fontRendererObj.FONT_HEIGHT, I18n.format((String)"gui.toMenu", (Object[])new Object[0])));
        int[] nArray = Class713.Method2054();
        this.Field3076 = 0;
        this.Field3075 = new GuiButton(1, this.width / 2 - 100, this.height / 2 + this.Field3074 / 2 + this.fontRendererObj.FONT_HEIGHT + 22, "Reconnect");
        this.buttonList.Method2530((Object)this.Field3075);
        int[] nArray2 = nArray;
        a.trash(new String[1]);
    }

    protected void Method1802(GuiButton a2) throws IOException {
        block1: {
            if (a2.id == 0) {
                this.mc.displayGuiScreen(this.Field3073);
            }
            if (a2.id != 1) break block1;
            ServerUtils.displayMultiPlayer();
        }
    }

    public void Method1807() {
        ++this.Field3076;
        if (this.Field3076 > 60) {
            ServerUtils.displayMultiPlayer();
        }
    }

    public void Method1803(int a2, int a3, float a4) {
        Iterator iterator;
        int[] nArray = Class713.Method2054();
        this.drawDefaultBackground();
        int[] a5 = nArray;
        this.drawCenteredString(this.fontRendererObj, this.Field3070, this.width / 2, this.height / 2 - this.Field3074 / 2 - this.fontRendererObj.FONT_HEIGHT * 2, 0xAAAAAA);
        int a6 = this.height / 2 - this.Field3074 / 2;
        if (this.Field3072 != null && (iterator = this.Field3072.Method1383()).Method932()) {
            String a7 = (String)iterator.Method933();
            this.drawCenteredString(this.fontRendererObj, a7, this.width / 2, a6, 0xFFFFFF);
            a6 += this.fontRendererObj.FONT_HEIGHT;
        }
        super.Method1803(a2, a3, a4);
        this.Field3075.displayString = "Reconnect (" + (3 - this.Field3076 / 20) + ")";
        if (a.trash() == null) {
            Class713.Method2053(new int[5]);
        }
    }

    private static IOException Method1815(IOException iOException) {
        return iOException;
    }
}