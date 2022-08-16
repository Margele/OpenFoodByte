/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.notification;

import awsl.Class348;
import awsl.Class438;
import awsl.Class440;
import awsl.Class565;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.RenderUtils;

public final class Notification {
    static Minecraft Field2100 = Minecraft.getMinecraft();
    private final String Field2101;
    private final String Field2102;
    private final Class438 Field2103;
    private final float Field2104;
    private final float Field2105;
    private final long Field2106;
    private final int Field2107;
    private final Class440 Field2108;
    private boolean Field2109;
    private static int Field2110;
    private static int Field2111;
    private static int Field2112;
    private static ScaledResolution Field2113;
    private static a[] Field2114;

    public Notification(String a2, String a3, long a4, Types a5) {
        this.Field2101 = a2;
        this.Field2102 = a3;
        this.Field2104 = Math.max((float)Class565.Field2634.Method1225(a2), (float)Class565.Field2637.Method1225(a3)) + 4.0f;
        this.Field2105 = 22.0f;
        ScaledResolution a6 = Notification.Method2736();
        this.Field2103 = new Class438(this, a6.getScaledWidth(), (float)a6.getScaledHeight() - this.Field2105 - 2.0f);
        this.Field2106 = a4;
        this.Field2107 = a5.Method10();
        this.Field2108 = new Class440(this);
    }

    public Notification(String a2, String a3, Types a4) {
        this(a2, a3, (long)(a2.length() + a3.length()) * 40L, a4);
    }

    public Notification(String a2, Types a3) {
        this(a2, null, (long)a2.length() * 40L, a3);
    }

    public Notification(String a2, long a3, Types a4) {
        this(a2, null, a3, a4);
    }

    /*
     * WARNING - void declaration
     */
    public void Method2734(ScaledResolution a2, int a3, int a4) {
        void a5;
        int n = a2.getScaledWidth();
        a[] a6 = Notification.Method2742();
        int a7 = a2.getScaledHeight();
        float a8 = (float)a7 - (this.Field2105 + 2.0f) * (float)a3 - (float)a4;
        float a9 = (float)a5 - this.Field2104;
        if (this.Field2108.Method2716(this.Field2106)) {
            this.Field2103.Method2666(a9, a7);
            a.trash(new String[5]);
        }
        this.Field2103.Method2666(a9, a8);
        float a10 = (float)this.Field2103.Method2667();
        float a11 = (float)this.Field2103.Method2669();
        if (a11 >= (float)a7) {
            this.Field2109 = true;
            return;
        }
        Class348.Method364(a10, a11, this.Field2104, this.Field2105, true);
        GL11.glEnable((int)3089);
        Notification.Method2735(a2, (int)a10, (int)a11, MathHelper.ceiling_float_int((float)this.Field2104), (int)this.Field2105);
        RenderUtils.Method1103((int)a9, (int)a11, (int)this.Field2104, (int)this.Field2105, 0x78000000);
        double a12 = (double)(System.currentTimeMillis() - this.Field2108.Method2715()) / (double)this.Field2106 * (double)this.Field2104;
        RenderUtils.Method1103((int)a9, (int)a11 + (int)this.Field2105 - 1, (int)this.Field2104, (int)this.Field2105, Notification.Method2740(this.Field2107, 0.4f));
        RenderUtils.Method1103((int)a9, (int)a11 + (int)this.Field2105 - 1, (int)a12, (int)this.Field2105, this.Field2107);
        if (this.Field2102 != null && this.Field2102.length() > 0) {
            Class565.Field2634.Method1217(this.Field2101, (int)a9 + 2, (int)a11 + 1, -1);
            Class565.Field2637.Method1217(this.Field2102, (int)a9 + 2, (int)a11 + 8, -1);
        }
        Class565.Field2637.Method1217(this.Field2101, (int)a9 + 2, (int)a11 + 4, -1);
        GL11.glDisable((int)3089);
    }

    public static void Method2735(ScaledResolution a2, int a3, int a4, int a5, int a6) {
        int a7 = a2.getScaleFactor();
        GL11.glScissor((int)(a3 * a7), (int)((a2.getScaledHeight() - (a4 + a6)) * a7), (int)(a5 * a7), (int)(a6 * a7));
    }

    public static ScaledResolution Method2736() {
        int a2 = Display.getWidth();
        int a3 = Display.getHeight();
        int a4 = Notification.Field2100.gameSettings.guiScale;
        if (a2 != Field2110 || a3 != Field2111 || a4 != Field2112) {
            Field2110 = a2;
            Field2111 = a3;
            Field2112 = a4;
            Field2113 = new ScaledResolution(Field2100);
            return Field2113;
        }
        return Field2113;
    }

    /*
     * WARNING - void declaration
     */
    public static void Method2737(float a2, float a3, float a4, float a5, int a6) {
        void a7;
        int n = a6 >> 24 & 0xFF;
        a[] a8 = Notification.Method2742();
        boolean a9 = a7 < 255;
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GlStateManager.enableBlend();
        GL11.glColor4ub((byte)((byte)(a6 >> 16 & 0xFF)), (byte)((byte)(a6 >> 8 & 0xFF)), (byte)((byte)(a6 & 0xFF)), (byte)((byte)a7));
        GL11.glColor3ub((byte)((byte)(a6 >> 16 & 0xFF)), (byte)((byte)(a6 >> 8 & 0xFF)), (byte)((byte)(a6 & 0xFF)));
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)a2, (float)a3);
        GL11.glVertex2f((float)a2, (float)a5);
        GL11.glVertex2f((float)a4, (float)a5);
        GL11.glVertex2f((float)a4, (float)a3);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GlStateManager.disableBlend();
        GL11.glEnable((int)3553);
        if (a.trash() == null) {
            Notification.Method2741(new a[1]);
        }
    }

    public static void Method2738(double a2, double a3, double a4, double a5, int a6) {
        int a7 = a6 >> 24 & 0xFF;
        boolean a8 = a7 < 255;
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4ub((byte)((byte)(a6 >> 16 & 0xFF)), (byte)((byte)(a6 >> 8 & 0xFF)), (byte)((byte)(a6 & 0xFF)), (byte)((byte)a7));
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glVertex2d((double)a2, (double)a5);
        GL11.glVertex2d((double)a4, (double)a5);
        GL11.glVertex2d((double)a4, (double)a3);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
    }

    public boolean Method2739() {
        return this.Field2109;
    }

    public static int Method2740(int a2, float a3) {
        int a4 = (int)((float)(a2 >> 16 & 0xFF) * a3);
        int a5 = (int)((float)(a2 >> 8 & 0xFF) * a3);
        int a6 = (int)((float)(a2 & 0xFF) * a3);
        int a7 = a2 >> 24 & 0xFF;
        return (a4 & 0xFF) << 16 | (a5 & 0xFF) << 8 | a6 & 0xFF | (a7 & 0xFF) << 24;
    }

    static {
        Notification.Method2741(null);
    }

    public static void Method2741(a[] aArray) {
        Field2114 = aArray;
    }

    public static a[] Method2742() {
        return Field2114;
    }
}