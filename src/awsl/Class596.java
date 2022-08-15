/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Image
 *  java.awt.image.BufferedImage
 *  java.awt.image.PixelGrabber
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 */
package awsl;

import awsl.Class594;
import awsl.Class598;
import awsl.Class767;
import awsl.Class776;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;

public class Class596
implements Class594 {
    public static final int Field2786 = 0;
    public static final int Field2787 = 1;
    public static final int Field2788 = 2;
    protected int[] Field2789;
    protected int Field2790;
    protected int Field2791;
    protected int Field2792 = 0;
    protected boolean Field2793 = false;

    public Class596(BufferedImage a) {
        this(a, false);
    }

    public Class596(BufferedImage a, boolean a2) {
        this(a, 0, a2);
    }

    public Class596(BufferedImage a, int a2, boolean a3) {
        this.Method105(this.Method104(a, 0, 0, a.getWidth(), a.getHeight(), null), a.getWidth(), a.getHeight(), a2, a3);
    }

    public Class596(int[] a, int a2, int a3, int a4, boolean a5) {
        this.Method105(a, a2, a3, a4, a5);
    }

    public Class596(Image a) {
        this(a, 0, false);
    }

    public Class596(Image a, int a2, boolean a3) {
        PixelGrabber a4 = new PixelGrabber(a, 0, 0, -1, -1, null, 0, -1);
        try {
            a4.grabPixels();
        }
        catch (InterruptedException a5) {
            throw new RuntimeException("interrupted waiting for pixels!");
        }
        if ((a4.status() & 0x80) != 0) {
            throw new RuntimeException("image fetch aborted");
        }
        this.Method105((int[])a4.getPixels(), a4.getWidth(), a4.getHeight(), a2, a3);
    }

    public int[] Method104(BufferedImage a, int a2, int a3, int a4, int a5, int[] a6) {
        int a7 = a.getType();
        if (a7 == 2 || a7 == 1) {
            return (int[])a.getRaster().getDataElements(a2, a3, a4, a5, (Object)a6);
        }
        return a.getRGB(a2, a3, a4, a5, a6, 0, a4);
    }

    public void Method105(int[] a, int a2, int a3, int a4, boolean a5) {
        this.Field2789 = a;
        this.Field2790 = a2;
        this.Field2791 = a3;
        this.Field2792 = a4;
        this.Field2793 = a5;
    }

    @Override
    public float Method20(float a, float a2) {
        int a3;
        int n = (int)a;
        int[] a4 = Class598.Method86();
        int a5 = (int)a2;
        if (this.Field2792 == 2) {
            a3 = Class776.Method1715(a3, this.Field2790);
            a5 = Class776.Method1715(a5, this.Field2791);
        }
        if (a3 >= this.Field2790 || a5 >= this.Field2791) {
            if (this.Field2792 == 0) {
                return 0.0f;
            }
            a3 = 0;
            if (a3 >= this.Field2790) {
                a3 = this.Field2790 - 1;
            }
            a5 = 0;
            if (a5 >= this.Field2791) {
                a5 = this.Field2791 - 1;
            }
        }
        return this.Field2793 ? (float)(this.Field2789[a5 * this.Field2790 + a3] >> 24 & 0xFF) / 255.0f : (float)Class767.Method1689(this.Field2789[a5 * this.Field2790 + a3]) / 255.0f;
    }

    public void Method9(int a) {
        this.Field2792 = a;
    }

    public int Method10() {
        return this.Field2792;
    }

    public int Method12() {
        return this.Field2790;
    }

    public int Method14() {
        return this.Field2791;
    }

    public int[] Method86() {
        return this.Field2789;
    }

    private static Exception Method106(Exception exception) {
        return exception;
    }
}