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
import awsl.Class91;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
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
    private static Class91[] Field2114;

    public Notification(String a, String a2, long a3, Types a4) {
        this.Field2101 = a;
        this.Field2102 = a2;
        this.Field2104 = Math.max((float)Class565.Field2634.Method1225(a), (float)Class565.Field2637.Method1225(a2)) + 4.0f;
        this.Field2105 = 22.0f;
        ScaledResolution a5 = Notification.Method2736();
        this.Field2103 = new Class438(this, a5.getScaledWidth(), (float)a5.getScaledHeight() - this.Field2105 - 2.0f);
        this.Field2106 = a3;
        this.Field2107 = a4.Method10();
        this.Field2108 = new Class440(this);
    }

    public Notification(String a, String a2, Types a3) {
        this(a, a2, (long)(a.length() + a2.length()) * 40L, a3);
    }

    public Notification(String a, Types a2) {
        this(a, null, (long)a.length() * 40L, a2);
    }

    public Notification(String a, long a2, Types a3) {
        this(a, null, a2, a3);
    }

    /*
     * WARNING - void declaration
     */
    public void Method2734(ScaledResolution a, int a2, int a3) {
        void a4;
        int n = a.getScaledWidth();
        Class91[] a5 = Notification.Method2742();
        int a6 = a.getScaledHeight();
        float a7 = (float)a6 - (this.Field2105 + 2.0f) * (float)a2 - (float)a3;
        float a8 = (float)a4 - this.Field2104;
        if (this.Field2108.Method2716(this.Field2106)) {
            this.Field2103.Method2666(a8, a6);
            Class91.Method3647(new String[5]);
        }
        this.Field2103.Method2666(a8, a7);
        float a9 = (float)this.Field2103.Method2667();
        float a10 = (float)this.Field2103.Method2669();
        if (a10 >= (float)a6) {
            this.Field2109 = true;
            return;
        }
        Class348.Method364(a9, a10, this.Field2104, this.Field2105, true);
        GL11.glEnable((int)3089);
        Notification.Method2735(a, (int)a9, (int)a10, MathHelper.ceiling_float_int((float)this.Field2104), (int)this.Field2105);
        RenderUtils.Method1103((int)a8, (int)a10, (int)this.Field2104, (int)this.Field2105, 0x78000000);
        double a11 = (double)(System.currentTimeMillis() - this.Field2108.Method2715()) / (double)this.Field2106 * (double)this.Field2104;
        RenderUtils.Method1103((int)a8, (int)a10 + (int)this.Field2105 - 1, (int)this.Field2104, (int)this.Field2105, Notification.Method2740(this.Field2107, 0.4f));
        RenderUtils.Method1103((int)a8, (int)a10 + (int)this.Field2105 - 1, (int)a11, (int)this.Field2105, this.Field2107);
        if (this.Field2102 != null && this.Field2102.length() > 0) {
            Class565.Field2634.Method1217(this.Field2101, (int)a8 + 2, (int)a10 + 1, -1);
            Class565.Field2637.Method1217(this.Field2102, (int)a8 + 2, (int)a10 + 8, -1);
        }
        Class565.Field2637.Method1217(this.Field2101, (int)a8 + 2, (int)a10 + 4, -1);
        GL11.glDisable((int)3089);
    }

    public static void Method2735(ScaledResolution a, int a2, int a3, int a4, int a5) {
        int a6 = a.getScaleFactor();
        GL11.glScissor((int)(a2 * a6), (int)((a.getScaledHeight() - (a3 + a5)) * a6), (int)(a4 * a6), (int)(a5 * a6));
    }

    public static ScaledResolution Method2736() {
        int a = Display.getWidth();
        int a2 = Display.getHeight();
        int a3 = Notification.Field2100.gameSettings.guiScale;
        if (a != Field2110 || a2 != Field2111 || a3 != Field2112) {
            Field2110 = a;
            Field2111 = a2;
            Field2112 = a3;
            Field2113 = new ScaledResolution(Field2100);
            return Field2113;
        }
        return Field2113;
    }

    /*
     * WARNING - void declaration
     */
    public static void Method2737(float a, float a2, float a3, float a4, int a5) {
        void a6;
        int n = a5 >> 24 & 0xFF;
        Class91[] a7 = Notification.Method2742();
        boolean a8 = a6 < 255;
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GlStateManager.enableBlend();
        GL11.glColor4ub((byte)((byte)(a5 >> 16 & 0xFF)), (byte)((byte)(a5 >> 8 & 0xFF)), (byte)((byte)(a5 & 0xFF)), (byte)((byte)a6));
        GL11.glColor3ub((byte)((byte)(a5 >> 16 & 0xFF)), (byte)((byte)(a5 >> 8 & 0xFF)), (byte)((byte)(a5 & 0xFF)));
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)a, (float)a2);
        GL11.glVertex2f((float)a, (float)a4);
        GL11.glVertex2f((float)a3, (float)a4);
        GL11.glVertex2f((float)a3, (float)a2);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GlStateManager.disableBlend();
        GL11.glEnable((int)3553);
        if (Class91.Method3648() == null) {
            Notification.Method2741(new Class91[1]);
        }
    }

    public static void Method2738(double a, double a2, double a3, double a4, int a5) {
        int a6 = a5 >> 24 & 0xFF;
        boolean a7 = a6 < 255;
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4ub((byte)((byte)(a5 >> 16 & 0xFF)), (byte)((byte)(a5 >> 8 & 0xFF)), (byte)((byte)(a5 & 0xFF)), (byte)((byte)a6));
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)a, (double)a4);
        GL11.glVertex2d((double)a3, (double)a4);
        GL11.glVertex2d((double)a3, (double)a2);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
    }

    public boolean Method2739() {
        return this.Field2109;
    }

    public static int Method2740(int a, float a2) {
        int a3 = (int)((float)(a >> 16 & 0xFF) * a2);
        int a4 = (int)((float)(a >> 8 & 0xFF) * a2);
        int a5 = (int)((float)(a & 0xFF) * a2);
        int a6 = a >> 24 & 0xFF;
        return (a3 & 0xFF) << 16 | (a4 & 0xFF) << 8 | a5 & 0xFF | (a6 & 0xFF) << 24;
    }

    static {
        Notification.Method2741(null);
    }

    public static void Method2741(Class91[] class91Array) {
        Field2114 = class91Array;
    }

    public static Class91[] Method2742() {
        return Field2114;
    }
}