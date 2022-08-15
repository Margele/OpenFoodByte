/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.WritableRaster
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public abstract class Class119
extends Class193 {
    protected boolean Field950 = false;
    private static String Field951;

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        int n = a.getType();
        WritableRaster writableRaster = a.getRaster();
        boolean a5 = Class193.Method1270();
        a2 = this.Method1263(a, null);
        WritableRaster a6 = a2.getRaster();
        this.Method17(a3, a4);
        int[] a7 = new int[a3];
        int a8 = 0;
        if (a8 < a4) {
            int a9;
            void a10;
            if (a10 == 2) {
                void a11;
                a11.getDataElements(0, a8, a3, 1, (Object)a7);
                a9 = 0;
                if (a9 < a3) {
                    a7[a9] = this.Method3(a9, a8, a7[a9]);
                    ++a9;
                }
                a6.setDataElements(0, a8, a3, 1, (Object)a7);
            }
            a.getRGB(0, a8, a3, 1, a7, 0, a3);
            a9 = 0;
            if (a9 < a3) {
                a7[a9] = this.Method3(a9, a8, a7[a9]);
                ++a9;
            }
            a2.setRGB(0, a8, a3, 1, a7, 0, a3);
            ++a8;
        }
        return a2;
    }

    public void Method17(int a, int a2) {
    }

    public abstract int Method3(int var1, int var2, int var3);

    public static void Method496(String string) {
        Field951 = string;
    }

    public static String Method497() {
        return Field951;
    }

    static {
        if (Class119.Method497() != null) {
            Class119.Method496("TZ1Do");
        }
    }
}