/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.entity.player.EntityPlayer
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class351;
import awsl.Class413;
import awsl.Class414;
import awsl.Class415;
import awsl.Class416;
import awsl.Class417;
import awsl.Class418;
import awsl.Class419;
import awsl.Class420;
import awsl.Class421;
import awsl.Class423;
import awsl.Class426;
import awsl.Class91;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;

public class Class705
extends GuiScreen {
    public static ArrayList Field3044;
    public static ArrayList Field3045;
    private Class414 Field3046 = null;

    public Class705() {
        Class415.Method2360();
        Field3044 = new ArrayList();
        double a = 80.0;
        double a2 = 12.0;
        double a3 = 10.0;
        double a4 = 10.0;
        double a5 = a2 + 10.0;
        double a6 = a + 10.0;
        for (Category a7 : Category.Method2760()) {
            String a8 = a7.name();
            Field3044.Method2530((Object)new Class420(this, a8, a3, a4, a, a2, true, this, a7));
            a3 += a6;
        }
        Field3044.Method2530((Object)new Class419(this, "Global", a3, a4, a, a2, true, this));
        Field3045 = new ArrayList();
        Field3045.addAll((Collection)Field3044);
        Collections.reverse((List)Field3045);
    }

    public void Method1803(int a, int a2, float a3) {
        Object a4;
        Iterator iterator;
        int a5;
        Color a6;
        double a7;
        Object a8;
        Iterator iterator2;
        Class421 a9;
        Iterator iterator3;
        String[] a10 = Class421.Method2390();
        if (OpenGlHelper.shadersSupported && this.mc.getRenderViewEntity() instanceof EntityPlayer && GlobalModule.Field3161.Method2744().floatValue() != 0.0f) {
            Class351.Method28(GlobalModule.Field3161.Method2744().floatValue());
        }
        if ((iterator3 = Field3044.Method1383()).Method932()) {
            Class421 a11 = (Class421)iterator3.Method933();
            a11.Method2385(a, a2, a3);
            Class91.Method3647(new String[3]);
        }
        ScaledResolution a12 = new ScaledResolution(this.mc);
        GL11.glPushMatrix();
        GL11.glTranslated((double)a12.getScaledWidth(), (double)a12.getScaledHeight(), (double)0.0);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        GL11.glPopMatrix();
        this.Field3046 = null;
        Iterator iterator4 = Field3044.Method1383();
        if (iterator4.Method932()) {
            a9 = (Class421)iterator4.Method933();
            if (a9.Field2036 && a9.Field2035 && a9.Field2037 != null && a9.Field2037.Method1799() > 0 && (iterator2 = a9.Field2037.Method1383()).Method932()) {
                a8 = (Class414)iterator2.Method933();
                if (((Class414)a8).Field2009) {
                    this.Field3046 = a8;
                }
            }
        }
        if ((iterator4 = Field3044.Method1383()).Method932()) {
            a9 = (Class421)iterator4.Method933();
            if (a9.Field2035 && a9.Field2036 && a9.Field2037 != null && (iterator2 = a9.Field2037.Method1383()).Method932()) {
                a8 = (Class414)iterator2.Method933();
                if (((Class414)a8).Field2008 && ((Class414)a8).Field2002 != null && !((Class414)a8).Field2002.isEmpty()) {
                    a7 = 0.0;
                    a6 = Class416.Method2352().darker();
                    a5 = new Color(a6.getRed(), a6.getGreen(), a6.getBlue(), 170).getRGB();
                    iterator = ((Class414)a8).Field2002.Method1383();
                    if (iterator.Method932()) {
                        a4 = (Class426)iterator.Method933();
                        ((Class426)a4).Field2049 = a7;
                        ((Class426)a4).Method2309();
                        ((Class426)a4).Method2310(a, a2, a3);
                        a7 += ((Class426)a4).Field2053;
                    }
                }
            }
        }
        if ((iterator4 = Field3044.Method1383()).Method932()) {
            a9 = (Class421)iterator4.Method933();
            if (a9.Field2035 && a9.Field2036 && a9.Field2038 != null && (iterator2 = a9.Field2038.Method1383()).Method932()) {
                a8 = (Class417)iterator2.Method933();
                if (((Class417)a8).Field2019 && ((Class417)a8).Field2013 != null && !((Class417)a8).Field2013.isEmpty()) {
                    a7 = 0.0;
                    a6 = Class416.Method2352().darker();
                    a5 = new Color(a6.getRed(), a6.getGreen(), a6.getBlue(), 170).getRGB();
                    iterator = ((Class417)a8).Field2013.Method1383();
                    if (iterator.Method932()) {
                        a4 = (Class413)iterator.Method933();
                        ((Class413)a4).Field1993 = a7;
                        ((Class413)a4).Method3577();
                        ((Class413)a4).Method2369(a, a2, a3);
                        a7 += ((Class413)a4).Field1997;
                    }
                }
            }
        }
        if (this.Field3046 != null) {
            Class705.drawRect((int)0, (int)0, (int)this.width, (int)this.height, (int)-2012213232);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(a12.getScaledWidth() / 2), (float)(a12.getScaledHeight() / 2), (float)0.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)0.0f);
            Class415.Method2368("Listening...", 0.0, -10.0, -1);
            GL11.glScalef((float)0.5f, (float)0.5f, (float)0.0f);
            Class415.Method2368("Press 'ESCAPE' to unbind " + this.Field3046.Field2001.getName() + (this.Field3046.Field2001.Method1020() > -1 ? " (" + Keyboard.getKeyName((int)this.Field3046.Field2001.Method1020()) + ")" : ""), 0.0, 0.0, -1);
            GL11.glPopMatrix();
        }
        super.Method1803(a, a2, a3);
    }

    public void Method1805(int a, int a2, int a3) {
        Object a4;
        Iterator iterator;
        Object a5;
        Iterator iterator2;
        Class421 a6;
        if (this.Field3046 != null) {
            return;
        }
        Iterator iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a6 = (Class421)iterator3.Method933();
            if (!a6.Field2035 || !a6.Field2036 || a6.Field2037 == null) continue;
            iterator2 = a6.Field2037.Method1383();
            while (iterator2.Method932()) {
                a5 = (Class414)iterator2.Method933();
                if (!((Class414)a5).Field2008) continue;
                iterator = ((Class414)a5).Field2002.Method1383();
                while (iterator.Method932()) {
                    a4 = (Class426)iterator.Method933();
                    if (!((Class426)a4).Method2311(a, a2, a3)) continue;
                    return;
                }
            }
        }
        iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a6 = (Class421)iterator3.Method933();
            if (!a6.Field2035 || !a6.Field2036 || a6.Field2038 == null) continue;
            iterator2 = a6.Field2038.Method1383();
            while (iterator2.Method932()) {
                a5 = (Class417)iterator2.Method933();
                if (!((Class417)a5).Field2019) continue;
                iterator = ((Class417)a5).Field2013.Method1383();
                while (iterator.Method932()) {
                    a4 = (Class413)iterator.Method933();
                    if (!((Class413)a4).Method2370(a, a2, a3)) continue;
                    return;
                }
            }
        }
        iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a6 = (Class421)iterator3.Method933();
            if (!a6.Method2386(a, a2, a3)) continue;
            return;
        }
        try {
            super.Method1805(a, a2, a3);
        }
        catch (IOException a7) {
            a7.printStackTrace();
        }
    }

    public void Method1811(int a, int a2, int a3) {
        Object a4;
        Iterator iterator;
        Object a5;
        Iterator iterator2;
        Class421 a6;
        if (this.Field3046 != null) {
            return;
        }
        Iterator iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a6 = (Class421)iterator3.Method933();
            if (!a6.Field2035 || !a6.Field2036 || a6.Field2037 == null) continue;
            iterator2 = a6.Field2037.Method1383();
            while (iterator2.Method932()) {
                a5 = (Class414)iterator2.Method933();
                if (!((Class414)a5).Field2008) continue;
                iterator = ((Class414)a5).Field2002.Method1383();
                while (iterator.Method932()) {
                    a4 = (Class426)iterator.Method933();
                    ((Class426)a4).Method2312(a, a2, a3);
                }
            }
        }
        iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a6 = (Class421)iterator3.Method933();
            if (!a6.Field2035 || !a6.Field2036 || a6.Field2038 == null) continue;
            iterator2 = a6.Field2038.Method1383();
            while (iterator2.Method932()) {
                a5 = (Class417)iterator2.Method933();
                if (!((Class417)a5).Field2019) continue;
                iterator = ((Class417)a5).Field2013.Method1383();
                while (iterator.Method932()) {
                    a4 = (Class413)iterator.Method933();
                    ((Class413)a4).Method2371(a, a2, a3);
                }
            }
        }
        iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a6 = (Class421)iterator3.Method933();
            a6.Method2387(a, a2, a3);
        }
        super.Method1811(a, a2, a3);
    }

    protected void Method1804(char a, int a2) {
        Iterator iterator = Field3045.Method1383();
        while (iterator.Method932()) {
            Class421 a3 = (Class421)iterator.Method933();
            if (!a3.Field2036 || !a3.Field2035 || a3.Field2037 == null || a3.Field2037.Method1799() <= 0) continue;
            Iterator iterator2 = a3.Field2037.Method1383();
            while (iterator2.Method932()) {
                Class414 a4 = (Class414)iterator2.Method933();
                try {
                    if (!a4.Method3570(a, a2)) continue;
                    return;
                }
                catch (IOException a5) {
                    a5.printStackTrace();
                }
            }
        }
        try {
            super.Method1804(a, a2);
        }
        catch (IOException a6) {
            a6.printStackTrace();
        }
    }

    public void Method1806() {
        Object a;
        Iterator iterator;
        Object a2;
        Iterator iterator2;
        Class421 a3;
        Iterator iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a3 = (Class421)iterator3.Method933();
            if (!a3.Field2035 || !a3.Field2036 || a3.Field2037 == null) continue;
            iterator2 = a3.Field2037.Method1383();
            while (iterator2.Method932()) {
                a2 = (Class414)iterator2.Method933();
                if (!((Class414)a2).Field2008) continue;
                iterator = ((Class414)a2).Field2002.Method1383();
                while (iterator.Method932()) {
                    a = (Class426)iterator.Method933();
                    if (!(a instanceof Class423)) continue;
                    ((Class423)a).Field2041 = false;
                }
            }
        }
        iterator3 = Field3045.Method1383();
        while (iterator3.Method932()) {
            a3 = (Class421)iterator3.Method933();
            if (!a3.Field2035 || !a3.Field2036 || a3.Field2038 == null) continue;
            iterator2 = a3.Field2038.Method1383();
            while (iterator2.Method932()) {
                a2 = (Class417)iterator2.Method933();
                if (!((Class417)a2).Field2019) continue;
                iterator = ((Class417)a2).Field2013.Method1383();
                while (iterator.Method932()) {
                    a = (Class413)iterator.Method933();
                    if (!(a instanceof Class418)) continue;
                    ((Class418)a).Field2021 = false;
                }
            }
        }
        GlobalModule.INSTANCE.fileManager.saveClickGuiPos();
    }

    public boolean Method1812() {
        return false;
    }

    public void Method1813(Category a) {
        Iterator iterator = Field3045.Method1383();
        while (iterator.Method932()) {
            Class421 a2 = (Class421)iterator.Method933();
            if (!a2.Field2036 || !a2.Field2035 || a2.Field2037 == null || a2.Field2037.Method1799() <= 0) continue;
            Iterator iterator2 = a2.Field2037.Method1383();
            while (iterator2.Method932()) {
                Class414 a3 = (Class414)iterator2.Method933();
                if (a != a3.Field2001.Method1024()) continue;
                a3.Field2008 = false;
            }
        }
    }

    public void Method1814() {
        Iterator iterator = Field3045.Method1383();
        while (iterator.Method932()) {
            Class421 a = (Class421)iterator.Method933();
            if (!a.Field2036 || !a.Field2035 || a.Field2037 == null || a.Field2037.Method1799() <= 0) continue;
            Iterator iterator2 = a.Field2037.Method1383();
            while (iterator2.Method932()) {
                Class414 a2 = (Class414)iterator2.Method933();
                a2.Field2008 = false;
            }
        }
    }

    private static IOException Method1815(IOException iOException) {
        return iOException;
    }
}