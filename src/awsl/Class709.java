/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 */
package awsl;

import awsl.Class207;
import awsl.Class215;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;

public class Class709
extends GuiScreen {
    private GuiScreen Field3066;
    private GuiTextField Field3067;
    private String Field3068 = "";
    private static int Field3069;

    public Class709(GuiScreen a) {
        this.Field3066 = a;
    }

    protected void Method1804(char a, int a2) throws IOException {
        super.Method1804(a, a2);
        this.Field3067.textboxKeyTyped(a, a2);
        if (a2 == 1) {
            this.mc.displayGuiScreen(this.Field3066);
        }
        this.Field3067.setText(this.Field3067.getText().replace((CharSequence)" ", (CharSequence)"").replace((CharSequence)"#", (CharSequence)""));
    }

    public void Method1801() {
        this.Field3067 = new GuiTextField(0, Minecraft.getMinecraft().fontRendererObj, this.width / 2 - 100, this.height / 6 + 20, 200, 20);
        int n = Class709.Method1829();
        this.buttonList.Method2530((Object)new GuiButton(3, this.width / 2 - 100, this.height / 6 + 62, "Add"));
        this.buttonList.Method2530((Object)new GuiButton(4, this.width / 2 - 100, this.height / 6 + 82, "Cancel"));
        if (a.trash() == null) {
            Class709.Method1836(++n);
        }
    }

    protected void Method1802(GuiButton a2) throws IOException {
        block3: {
            int a3 = Class709.Method1828();
            if (a2.id == 3) {
                if (!this.Field3067.getText().equalsIgnoreCase("")) {
                    GlobalModule.INSTANCE.fileManager.Method786(this.Field3067.getText());
                    if (Class215.Method2649().stream().noneMatch(this::Method1839)) {
                        Class207 a4 = new Class207(this.Field3067.getText());
                        Class215.Method2649().Method2530((Object)a4);
                        GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Saved Config \u00a7a" + this.Field3067.getText(), Types.INFO));
                    }
                    GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Replace Config \u00a7a" + this.Field3067.getText(), Types.INFO));
                    this.mc.displayGuiScreen(this.Field3066);
                }
                this.Field3068 = new String("\u00a7cPlease enter the config name");
            }
            if (a2.id != 4) break block3;
            this.mc.displayGuiScreen(this.Field3066);
        }
    }

    protected void Method1805(int a2, int a3, int a4) throws IOException {
        this.Field3067.mouseClicked(a2, a3, a4);
        super.Method1805(a2, a3, a4);
    }

    public void Method1807() {
        this.Field3067.updateCursorCounter();
        super.Method1807();
    }

    public void Method1803(int a2, int a3, float a4) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "Name", this.width / 2 - 89, this.height / 6 + 10, 0xFFFFFF);
        this.Field3067.drawTextBox();
        this.drawCenteredString(this.fontRendererObj, "Adding Conifg", this.width / 2, 30, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, this.Field3068, this.width / 2, this.height / 6 + 48, 0xFFFFFF);
        super.Method1803(a2, a3, a4);
    }

    private boolean Method1839(Class207 a2) {
        return a2.Method2419().equalsIgnoreCase(this.Field3067.getText());
    }

    public static void Method1836(int n) {
        Field3069 = n;
    }

    public static int Method1828() {
        return Field3069;
    }

    public static int Method1829() {
        int n = Class709.Method1828();
        return 82;
    }

    private static IOException Method1815(IOException iOException) {
        return iOException;
    }

    static {
        Class709.Method1836(0);
    }
}