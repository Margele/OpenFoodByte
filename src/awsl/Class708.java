/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.EnumChatFormatting
 *  org.lwjgl.input.Keyboard
 */
package awsl;

import awsl.Class709;
import awsl.Class91;
import java.io.IOException;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumChatFormatting;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;

public class Class708
extends GuiScreen {
    private Module Field3064;
    private GuiScreen Field3065;

    public Class708(Module a, GuiScreen a2) {
        this.Field3064 = a;
        this.Field3065 = a2;
    }

    protected void Method1804(char a, int a2) throws IOException {
        block1: {
            if (a2 == 1 || a2 == 211) {
                this.Field3064.Method1021(0);
                ChatUtils.addChatMessage("Unbound '" + this.Field3064.getName() + "'");
                GlobalModule.INSTANCE.fileManager.saveKeys();
                this.mc.displayGuiScreen(this.Field3065);
            }
            if (a2 == 1 || a2 == 211) break block1;
            this.Field3064.Method1021(a2);
            ChatUtils.addChatMessage("Bound '" + this.Field3064.getName() + "' to '" + Keyboard.getKeyName((int)a2) + "'");
            GlobalModule.INSTANCE.fileManager.saveKeys();
            this.mc.displayGuiScreen(this.Field3065);
        }
    }

    public void Method1803(int a, int a2, float a3) {
        int n = Class709.Method1828();
        Class708.drawRect((int)0, (int)0, (int)this.width, (int)this.height, (int)-2012213232);
        int n2 = n;
        this.drawCenteredString(this.fontRendererObj, EnumChatFormatting.DARK_GREEN + this.Field3064.getName() + (this.Field3064.Method1020() > -1 ? EnumChatFormatting.DARK_PURPLE + " (" + Keyboard.getKeyName((int)this.Field3064.Method1020()) + ")" : ""), this.width / 2, 130, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, "Press any key to bind " + EnumChatFormatting.AQUA + this.Field3064.getName(), this.width / 2, 150, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, "Press 'DEL' or 'ESCAPE' to unbind " + EnumChatFormatting.AQUA + this.Field3064.getName(), this.width / 2, 170, 0xFFFFFF);
        super.Method1803(a, a2, a3);
        Class91.Method3647(new String[2]);
    }

    public boolean Method1812() {
        return false;
    }

    private static IOException Method1815(IOException iOException) {
        return iOException;
    }
}