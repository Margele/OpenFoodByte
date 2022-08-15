/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.input.Keyboard
 */
package awsl;

import awsl.Class416;
import awsl.Class421;
import awsl.Class423;
import awsl.Class424;
import awsl.Class425;
import awsl.Class426;
import awsl.Class446;
import awsl.Class447;
import awsl.Class565;
import awsl.Class91;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class414 {
    public Module Field2001;
    public ArrayList Field2002;
    public Class421 Field2003;
    public double Field2004;
    public double Field2005;
    public double Field2006;
    public double Field2007;
    public boolean Field2008 = false;
    public boolean Field2009 = false;

    public Class414(Module a, Class421 a2) {
        Class447 a3;
        String[] a4 = Class426.Method2315();
        this.Field2001 = a;
        this.Field2007 = Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT + 2;
        this.Field2003 = a2;
        this.Field2002 = new ArrayList();
        Iterator iterator = Class446.Method2766(a.getName()).Method1383();
        if (iterator.Method932()) {
            a3 = (Class447)iterator.Method933();
            if (a3 instanceof ModeValue) {
                this.Field2002.Method2530((Object)new Class424(this, (ModeValue)a3));
            }
            Class91.Method3647(new String[3]);
        }
        if ((iterator = Class446.Method2766(a.getName()).Method1383()).Method932()) {
            a3 = (Class447)iterator.Method933();
            if (a3 instanceof FloatValue) {
                this.Field2002.Method2530((Object)new Class423(this, (FloatValue)a3));
            }
        }
        if ((iterator = Class446.Method2766(a.getName()).Method1383()).Method932()) {
            a3 = (Class447)iterator.Method933();
            if (a3 instanceof BooleanValue) {
                this.Field2002.Method2530((Object)new Class425(this, (BooleanValue)a3));
            }
        }
    }

    public void Method3568(int a, int a2, float a3) {
        Color a4 = Class416.Method2352();
        int a5 = new Color(a4.getRed(), a4.getGreen(), a4.getBlue(), 150).getRGB();
        int a6 = -1052689;
        if (this.Field2001.getState()) {
            a6 = new Color(0, 153, 255).getRGB();
        }
        if (this.Method3571(a, a2)) {
            RenderUtils.Method1105(this.Field2004 - 2.0, this.Field2005, this.Field2004 + this.Field2006 + 2.0, this.Field2005 + this.Field2007 + 1.0, 0x55111111);
        }
        Class565.Field2635.Method1222(this.Field2001.getName(), (float)(this.Field2004 + this.Field2006 / 2.0), (float)(this.Field2005 + 1.0), a6);
        if (this.Field2002 != null && this.Field2002.Method1799() > 0) {
            String a7 = this.Field2008 ? "g" : "i";
            Class565.Field2640.Method1217(a7, (float)(this.Field2004 + this.Field2006 - (double)Class565.Field2640.Method1225(a7)), (float)(this.Field2005 + 1.0), 0xFFFFFF);
        }
    }

    public boolean Method3569(int a, int a2, int a3) {
        if (!this.Method3571(a, a2)) {
            return false;
        }
        this.Field2001.setState(!this.Field2001.getState());
        GlobalModule.INSTANCE.fileManager.saveMods();
        return true;
    }

    public boolean Method3570(char a, int a2) throws IOException {
        if (this.Field2009) {
            if (a2 != 1) {
                ChatUtils.addChatMessage("Bound '" + this.Field2001.getName() + "' to '" + Keyboard.getKeyName((int)a2) + "'");
                this.Field2001.Method1021(a2);
            } else {
                ChatUtils.addChatMessage("Unbound '" + this.Field2001.getName() + "'");
                this.Field2001.Method1021(0);
            }
            GlobalModule.INSTANCE.fileManager.saveKeys();
            this.Field2009 = false;
            return true;
        }
        return false;
    }

    public boolean Method3571(int a, int a2) {
        return (double)a >= this.Field2004 && (double)a <= this.Field2004 + this.Field2006 && (double)a2 >= this.Field2005 && (double)a2 <= this.Field2005 + this.Field2007;
    }

    private static IOException Method3572(IOException iOException) {
        return iOException;
    }
}