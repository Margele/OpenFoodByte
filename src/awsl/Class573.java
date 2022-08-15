/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Font
 *  java.awt.FontMetrics
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.RenderingHints
 *  java.awt.image.BufferedImage
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class563;
import awsl.Class571;
import awsl.Class91;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.lwjgl.opengl.GL11;

public class Class573 {
    public int Field2666 = 1024;
    public int Field2667 = 1024;
    private int Field2668;
    private Class571[] Field2669 = new Class571[2048];
    private final Font Field2670;
    private boolean Field2671;
    private int Field2672 = -1;
    private int Field2673 = 8;

    public Class573(Font a, boolean a2, int a3, boolean a4, int a5) {
        this.Field2670 = a;
        this.Field2671 = a2;
        this.Field2673 = a3;
        this.Field2673 = 8;
        this.Method1043(a2, a4, a5);
    }

    public Class573(Font a, boolean a2, boolean a3, int a4) {
        this.Field2670 = a;
        this.Field2671 = a2;
        this.Field2673 = 6;
        this.Method1043(a2, a3, a4);
    }

    private void Method1043(boolean a, boolean a2, int a3) {
        if (this.Field2670.getSize() <= 15) {
            this.Field2666 = 256;
            this.Field2667 = 256;
        }
        if (this.Field2670.getSize() <= 43) {
            this.Field2666 = 512;
            this.Field2667 = 512;
        } else if (this.Field2670.getSize() <= 91) {
            this.Field2666 = 1024;
            this.Field2667 = 1024;
        } else {
            this.Field2666 = 2048;
            this.Field2667 = 2048;
        }
        this.Field2669 = new Class571[65535];
        this.Field2666 = 8192;
        this.Field2667 = 8192;
        BufferedImage a4 = new BufferedImage(this.Field2666, this.Field2667, 2);
        Graphics2D a5 = (Graphics2D)a4.getGraphics();
        a5.setFont(this.Field2670);
        a5.setColor(new Color(255, 255, 255, 0));
        a5.fillRect(0, 0, this.Field2666, this.Field2667);
        a5.setColor(Color.white);
        int a6 = 0;
        int a7 = 0;
        int a8 = 0;
        for (int a9 = 0; a9 < this.Field2669.length; ++a9) {
            char a10 = (char)a9;
            BufferedImage a11 = this.Method1044(a10, a, a3);
            Class571 a12 = new Class571(null);
            a12.Field2662 = a11.getWidth();
            a12.Field2663 = a11.getHeight();
            if (a7 + a12.Field2662 >= this.Field2666) {
                a7 = 0;
                a8 += a6;
                a6 = 0;
            }
            a12.Field2664 = a7;
            a12.Field2665 = a8;
            if (a12.Field2663 > this.Field2672) {
                this.Field2672 = a12.Field2663;
            }
            if (a12.Field2663 > a6) {
                a6 = a12.Field2663;
            }
            this.Field2669[a9] = a12;
            a5.drawImage((Image)a11, a7, a8, null);
            a7 += a12.Field2662;
        }
        Class573 class573 = this;
        int n = TextureUtil.glGenTextures();
        BufferedImage bufferedImage = a4;
        boolean bl = true;
        boolean bl2 = true;
        try {
            class573.Field2668 = TextureUtil.uploadTextureImageAllocate((int)n, (BufferedImage)bufferedImage, (boolean)bl, (boolean)bl2);
        }
        catch (NullPointerException a13) {
            a13.printStackTrace();
        }
    }

    private BufferedImage Method1044(char a, boolean a2, int a3) {
        BufferedImage a4 = new BufferedImage(1, 1, 2);
        Graphics2D a5 = (Graphics2D)a4.getGraphics();
        a5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        a5.setFont(this.Field2670);
        FontMetrics a6 = a5.getFontMetrics();
        int a7 = a6.charWidth(a) + 7;
        a7 = 7;
        int a8 = a6.getHeight() + 1 + a3;
        a8 = this.Field2670.getSize();
        BufferedImage a9 = new BufferedImage(a7, a8, 2);
        Graphics2D a10 = (Graphics2D)a9.getGraphics();
        a10.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        a10.setFont(this.Field2670);
        a10.setColor(Color.WHITE);
        int a11 = 3;
        boolean a12 = true;
        a10.drawString(String.valueOf((char)a), 3, 1 + a6.getAscent());
        return a9;
    }

    public void Method1045(char a, float a2, float a3) throws ArrayIndexOutOfBoundsException {
        try {
            this.Method1046(a2, a3, this.Field2669[a].Field2662, this.Field2669[a].Field2663, this.Field2669[a].Field2664, this.Field2669[a].Field2665, this.Field2669[a].Field2662, this.Field2669[a].Field2663);
        }
        catch (Exception a4) {
            a4.printStackTrace();
        }
    }

    private void Method1046(float a, float a2, float a3, float a4, float a5, float a6, float a7, float a8) {
        float a9 = a5 / (float)this.Field2666;
        float a10 = a6 / (float)this.Field2667;
        float a11 = a7 / (float)this.Field2666;
        float a12 = a8 / (float)this.Field2667;
        GL11.glBegin((int)4);
        GL11.glTexCoord2f((float)(a9 + a11), (float)a10);
        GL11.glVertex2d((double)(a + a3), (double)a2);
        GL11.glTexCoord2f((float)a9, (float)a10);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glTexCoord2f((float)a9, (float)(a10 + a12));
        GL11.glVertex2d((double)a, (double)(a2 + a4));
        GL11.glTexCoord2f((float)a9, (float)(a10 + a12));
        GL11.glVertex2d((double)a, (double)(a2 + a4));
        GL11.glTexCoord2f((float)(a9 + a11), (float)(a10 + a12));
        GL11.glVertex2d((double)(a + a3), (double)(a2 + a4));
        GL11.glTexCoord2f((float)(a9 + a11), (float)a10);
        GL11.glVertex2d((double)(a + a3), (double)a2);
        GL11.glEnd();
    }

    public void Method1047(String a, double a2, double a3, Color a4, boolean a5) {
        block2: {
            a2 -= 3.0;
            Class91[] a6 = Class563.Method1234();
            a3 -= 1.0;
            GL11.glPushMatrix();
            GlStateManager.bindTexture((int)this.Field2668);
            this.Method1050(new Color(0.05f, 0.05f, 0.05f, (float)a4.getAlpha() / 255.0f));
            int a7 = a.length();
            int a8 = 0;
            if (a8 < a7) {
                char a9 = a.charAt(a8);
                if (a9 < this.Field2669.length) {
                    this.Method1045(a9, (float)a2, (float)a3);
                    a2 += (double)(this.Field2669[a9].Field2662 - this.Field2673);
                }
                ++a8;
            }
            GL11.glPopMatrix();
            if (Class91.Method3648() != null) break block2;
            Class563.Method1233(new Class91[2]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void Method1048(String a, double a2, double a3, int a4, boolean a5) {
        void a6;
        a2 -= 3.0;
        Class91[] class91Array = Class563.Method1234();
        a3 -= 1.0;
        GL11.glPushMatrix();
        GlStateManager.bindTexture((int)this.Field2668);
        Class573.Method1049(a4);
        int n = a.length();
        Class91[] a7 = class91Array;
        int a8 = 0;
        if (a8 < a6) {
            char a9 = a.charAt(a8);
            if (a9 < this.Field2669.length) {
                this.Method1045(a9, (float)a2, (float)a3);
                a2 += (double)(this.Field2669[a9].Field2662 - this.Field2673);
            }
            ++a8;
        }
        GL11.glPopMatrix();
    }

    public static void Method1049(int a) {
        float a2 = (float)(a >> 24 & 0xFF) / 255.0f;
        float a3 = (float)(a >> 16 & 0xFF) / 255.0f;
        float a4 = (float)(a >> 8 & 0xFF) / 255.0f;
        float a5 = (float)(a & 0xFF) / 255.0f;
        GL11.glColor4f((float)a3, (float)a4, (float)a5, (float)a2);
    }

    public void Method1050(Color a) {
        float a2 = (float)a.getRed() / 255.0f;
        float a3 = (float)a.getGreen() / 255.0f;
        float a4 = (float)a.getBlue() / 255.0f;
        float a5 = (float)a.getAlpha() / 255.0f;
        GL11.glColor4f((float)a2, (float)a3, (float)a4, (float)a5);
    }

    public int Method1051(String a) {
        int a2 = 1;
        for (char a3 : a.toCharArray()) {
            if (a3 != '\n') continue;
            ++a2;
        }
        return this.Field2672 * a2;
    }

    public int Method1052() {
        return this.Field2672;
    }

    /*
     * WARNING - void declaration
     */
    public int Method1053(String a) {
        void a2;
        void a3;
        boolean bl = false;
        char[] a4 = a.toCharArray();
        int n = a4.length;
        Class91[] a5 = Class563.Method1234();
        int a6 = 0;
        if (a6 < a3) {
            char a7 = a4[a6];
            if (a7 < this.Field2669.length) {
                a2 += this.Field2669[a7].Field2662 - this.Field2673;
            }
            ++a6;
        }
        return (int)a2;
    }

    public boolean Method1054() {
        return this.Field2671;
    }

    public void Method1055(boolean a, boolean a2, int a3) {
        block0: {
            if (this.Field2671 == a) break block0;
            this.Field2671 = a;
            this.Method1043(this.Field2671, a2, a3);
        }
    }

    public Font Method1056() {
        return this.Field2670;
    }

    private static NullPointerException Method1057(NullPointerException nullPointerException) {
        return nullPointerException;
    }
}