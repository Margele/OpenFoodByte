/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.ObjectArrays
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.List
 *  net.minecraft.client.gui.GuiChat
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C14PacketTabComplete
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraftforge.client.ClientCommandHandler
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class713;
import com.google.common.collect.Lists;
import com.google.common.collect.ObjectArrays;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import trash.foodbyte.reflections.Wrapper;

@SideOnly(value=Side.CLIENT)
public class Class716
extends GuiChat {
    private static final Logger Field3102 = LogManager.getLogger();
    private String Field3103 = "";
    private int Field3104 = -1;
    private boolean Field3105;
    private boolean Field3106;
    private int Field3107;
    private List Field3108 = Lists.newArrayList();
    protected GuiTextField Field3109;
    private String Field3110 = "";

    public Class716() {
    }

    public Class716(String a) {
        this.Field3110 = a;
    }

    public void Method1801() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.Field3104 = this.mc.ingameGUI.getChatGUI().getSentMessages().Method1799();
        this.Field3109 = new GuiTextField(0, this.fontRendererObj, 4, this.height - 12, this.width - 4, 12);
        this.Field3109.setMaxStringLength(100);
        this.Field3109.setEnableBackgroundDrawing(false);
        this.Field3109.setFocused(true);
        this.Field3109.setText(this.Field3110);
        this.Field3109.setCanLoseFocus(false);
    }

    public void Method1806() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.mc.ingameGUI.getChatGUI().resetScroll();
    }

    public void Method1807() {
        this.Field3109.updateCursorCounter();
    }

    protected void Method1804(char a, int a2) throws IOException {
        this.Field3106 = false;
        if (a2 == 15) {
            this.Method2059();
        } else {
            this.Field3105 = false;
        }
        if (a2 == 1) {
            this.mc.displayGuiScreen(null);
        } else if (a2 != 28 && a2 != 156) {
            if (a2 == 200) {
                this.Method2061(-1);
            } else if (a2 == 208) {
                this.Method2061(1);
            } else if (a2 == 201) {
                this.mc.ingameGUI.getChatGUI().scroll(this.mc.ingameGUI.getChatGUI().getLineCount() - 1);
            } else if (a2 == 209) {
                this.mc.ingameGUI.getChatGUI().scroll(-this.mc.ingameGUI.getChatGUI().getLineCount() + 1);
            } else {
                this.Field3109.textboxKeyTyped(a, a2);
            }
        } else {
            String a3 = this.Field3109.getText().trim();
            if (a3.length() > 0) {
                this.sendChatMessage(a3);
            }
            this.mc.displayGuiScreen((GuiScreen)null);
        }
    }

    public void Method1822() throws IOException {
        super.Method1822();
        int a = Mouse.getEventDWheel();
        if (a > 1) {
            a = 1;
        }
        if (a < -1) {
            a = -1;
        }
        if (!Class716.isShiftKeyDown()) {
            a *= 7;
        }
        this.mc.ingameGUI.getChatGUI().scroll(a);
    }

    protected void Method1805(int a, int a2, int a3) throws IOException {
        IChatComponent a4 = this.mc.ingameGUI.getChatGUI().getChatComponent(Mouse.getX(), Mouse.getY());
        if (this.handleComponentClick(a4)) {
            return;
        }
        this.Field3109.mouseClicked(a, a2, a3);
        super.Method1805(a, a2, a3);
    }

    public void Method2058(String a, boolean a2) {
        this.Field3109.setText(a);
    }

    public void Method2059() {
        String a;
        block8: {
            block7: {
                int[] a2 = Class713.Method2054();
                if (!this.Field3105) break block7;
                this.Field3109.deleteFromCursor(this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false) - this.Field3109.getCursorPosition());
                if (this.Field3107 < this.Field3108.Method1799()) break block8;
                this.Field3107 = 0;
            }
            int a3 = this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false);
            this.Field3108.clear();
            this.Field3107 = 0;
            String a4 = this.Field3109.getText().substring(a3).toLowerCase();
            a = this.Field3109.getText().substring(0, this.Field3109.getCursorPosition());
            this.Method2060(a, a4);
            if (this.Field3108.isEmpty()) {
                return;
            }
            this.Field3105 = true;
            this.Field3109.deleteFromCursor(a3 - this.Field3109.getCursorPosition());
        }
        if (this.Field3108.Method1799() > 1) {
            StringBuilder a5 = new StringBuilder();
            Iterator iterator = this.Field3108.Method1383();
            if (iterator.Method932()) {
                a = (String)iterator.Method933();
                if (a5.length() > 0) {
                    a5.append(", ");
                }
                a5.append(a);
            }
            this.mc.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion((IChatComponent)new ChatComponentText(a5.toString()), 1);
        }
        this.Field3109.writeText(EnumChatFormatting.getTextWithoutFormattingCodes((String)((String)this.Field3108.get(this.Field3107++))));
    }

    private void Method2060(String a, String a2) {
        if (a.length() >= 1) {
            ClientCommandHandler.instance.autoComplete(a, a2);
            BlockPos a3 = null;
            if (this.mc.objectMouseOver != null && this.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                a3 = this.mc.objectMouseOver.getBlockPos();
            }
            Wrapper.INSTANCE.sendPacket((Packet)new C14PacketTabComplete(a, a3));
            this.Field3106 = true;
        }
    }

    public void Method2061(int a) {
        int a2 = this.Field3104 + a;
        int a3 = this.mc.ingameGUI.getChatGUI().getSentMessages().Method1799();
        if ((a2 = MathHelper.clamp_int((int)a2, (int)0, (int)a3)) != this.Field3104) {
            if (a2 == a3) {
                this.Field3104 = a3;
                this.Field3109.setText(this.Field3103);
            } else {
                if (this.Field3104 == a3) {
                    this.Field3103 = this.Field3109.getText();
                }
                this.Field3109.setText((String)this.mc.ingameGUI.getChatGUI().getSentMessages().get(a2));
                this.Field3104 = a2;
            }
        }
    }

    public void Method1803(int a, int a2, float a3) {
        Class716.drawRect((int)2, (int)(this.height - 14), (int)(this.width - 2), (int)(this.height - 2), (int)Integer.MIN_VALUE);
        this.Field3109.drawTextBox();
        IChatComponent a4 = this.mc.ingameGUI.getChatGUI().getChatComponent(Mouse.getX(), Mouse.getY());
        if (a4.getChatStyle().getChatHoverEvent() != null) {
            this.handleComponentHover(a4, a, a2);
        }
        super.Method1803(a, a2, a3);
    }

    public void Method2062(String[] a) {
        int[] a2 = Class713.Method2054();
        if (this.Field3106) {
            this.Field3105 = false;
            this.Field3108.clear();
            Object[] a3 = ClientCommandHandler.instance.latestAutoComplete;
            String[] stringArray = a = (String[])ObjectArrays.concat((Object[])a3, (Object[])a, String.class);
            int n = stringArray.length;
            int n2 = 0;
            if (n2 < n) {
                String a4 = stringArray[n2];
                if (a4.length() > 0) {
                    this.Field3108.Method2530((Object)a4);
                }
                ++n2;
            }
            String a5 = this.Field3109.getText().substring(this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false));
            String a6 = StringUtils.getCommonPrefix((String[])a);
            if ((a6 = EnumChatFormatting.getTextWithoutFormattingCodes((String)a6)).length() > 0 && !a5.equalsIgnoreCase(a6)) {
                this.Field3109.deleteFromCursor(this.Field3109.func_146197_a(-1, this.Field3109.getCursorPosition(), false) - this.Field3109.getCursorPosition());
                this.Field3109.writeText(a6);
            }
            if (this.Field3108.Method1799() > 0) {
                this.Field3105 = true;
                this.Method2059();
            }
        }
    }

    public boolean Method1812() {
        return false;
    }

    private static IOException Method1815(IOException iOException) {
        return iOException;
    }
}