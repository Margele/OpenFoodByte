/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Image
 *  java.awt.image.ImageProducer
 *  java.awt.image.MemoryImageSource
 *  java.awt.image.PixelGrabber
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import awsl.Class193;
import awsl.Class767;
import java.awt.Image;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;

public class Class777 {
    public int Method1700(int a, int a2, int a3, int a4) {
        int a5 = a3 >> 24 & 0xFF;
        int a6 = a3 >> 16 & 0xFF;
        int a7 = a3 >> 8 & 0xFF;
        int a8 = a3 & 0xFF;
        int a9 = a4 >> 24 & 0xFF;
        int a10 = a4 >> 16 & 0xFF;
        int a11 = a4 >> 8 & 0xFF;
        int a12 = a4 & 0xFF;
        int a13 = Class767.Method1687(a6 + a10);
        int a14 = Class767.Method1687(a6 + a10);
        int a15 = Class767.Method1687(a6 + a10);
        return a5 << 24 | a13 << 16 | a14 << 8 | a15;
    }

    /*
     * WARNING - void declaration
     */
    public ImageProducer Method1701(Image a, Image a2, int a3, int a4, int a5, int a6) {
        void a7;
        void a8;
        int[] nArray = new int[a5 * a6];
        int[] a9 = new int[a5 * a6];
        int[] nArray2 = new int[a5 * a6];
        boolean a10 = Class193.Method1269();
        PixelGrabber a11 = new PixelGrabber(a, a3, a4, a5, a6, (int[])a8, 0, a5);
        PixelGrabber a12 = new PixelGrabber(a2, a3, a4, a5, a6, a9, 0, a5);
        try {
            a11.grabPixels();
            a12.grabPixels();
        }
        catch (InterruptedException a13) {
            System.err.println("interrupted waiting for pixels!");
            return null;
        }
        if ((a11.status() & 0x80) != 0) {
            System.err.println("image fetch aborted or errored");
            return null;
        }
        if ((a12.status() & 0x80) != 0) {
            System.err.println("image fetch aborted or errored");
            return null;
        }
        int a14 = 0;
        if (a14 < a6) {
            int a15 = 0;
            if (a15 < a5) {
                int a16 = a14 * a5 + a15;
                a7[a16] = this.Method1700(a3 + a15, a4 + a14, (int)a8[a16], a9[a16]);
                ++a15;
            }
            ++a14;
        }
        return new MemoryImageSource(a5, a6, (int[])a7, 0, a5);
    }

    private static InterruptedException Method1702(InterruptedException interruptedException) {
        return interruptedException;
    }
}