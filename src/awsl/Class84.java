/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.awt.image.WritableRaster
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class84
extends Class193 {
    public static final int Field714 = 1;
    public static final int Field715 = 2;
    public static final int Field716 = 3;
    public static final int Field717 = 4;
    public static final int Field718 = 5;
    public static final int Field719 = 6;
    private int Field720;
    private int Field721;
    private int Field722;
    private int Field723;
    private int Field724;

    public Class84() {
        this(3);
    }

    public Class84(int a) {
        this.Field720 = a;
    }

    public void Method9(int a) {
        this.Field720 = a;
    }

    public int Method10() {
        return this.Field720;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        int a4 = a.getWidth();
        int a5 = a.getHeight();
        int a6 = a.getType();
        WritableRaster a7 = a.getRaster();
        int[] a8 = this.Method104(a, 0, 0, a4, a5, null);
        boolean bl = false;
        int a9 = 0;
        int n = a4;
        boolean a10 = Class193.Method1270();
        int a11 = a5;
        int a12 = 0;
        int a13 = 0;
        int a14 = a3;
        int a15 = a11;
        switch (this.Field720) {
            case 1: {
                void a16;
                a12 = a4 - (a16 + a3);
            }
            case 2: {
                a13 = a5 - (a9 + a11);
            }
            case 3: {
                void a16;
                a14 = a11;
                a15 = a3;
                a12 = a9;
                a13 = a16;
            }
            case 4: {
                void a16;
                a14 = a11;
                a15 = a3;
                a12 = a5 - (a9 + a11);
                a13 = a16;
            }
            case 5: {
                void a16;
                a14 = a11;
                a15 = a3;
                a12 = a9;
                a13 = a4 - (a16 + a3);
            }
            case 6: {
                void a16;
                a12 = a4 - (a16 + a3);
                a13 = a5 - (a9 + a11);
            }
        }
        int[] a17 = new int[a14 * a15];
        int a18 = 0;
        if (a18 < a11) {
            int a19 = 0;
            if (a19 < a3) {
                int a20 = a18 * a4 + a19;
                int a21 = a18;
                int a22 = a19;
                switch (this.Field720) {
                    case 1: {
                        a22 = a3 - a19 - true;
                    }
                    case 2: {
                        a21 = a11 - a18 - 1;
                    }
                    case 3: {
                        a21 = a19;
                        a22 = a18;
                    }
                    case 4: {
                        a21 = a19;
                        a22 = a11 - a18 - 1;
                    }
                    case 5: {
                        a21 = a3 - a19 - true;
                        a22 = a18;
                    }
                    case 6: {
                        a21 = a11 - a18 - 1;
                        a22 = a3 - a19 - true;
                    }
                }
                int a23 = a21 * a14 + a22;
                a17[a23] = a8[a20];
                ++a19;
            }
            ++a18;
        }
        ColorModel a22 = a.getColorModel();
        a2 = new BufferedImage(a22, a22.createCompatibleWritableRaster(a14, a15), a22.isAlphaPremultiplied(), null);
        a22 = a2.getRaster();
        this.Method1267(a2, 0, 0, a14, a15, a17);
        return a2;
    }

    public String toString() {
        switch (this.Field720) {
            case 1: {
                return "Flip Horizontal";
            }
            case 2: {
                return "Flip Vertical";
            }
            case 3: {
                return "Flip Diagonal";
            }
            case 4: {
                return "Rotate 90";
            }
            case 5: {
                return "Rotate -90";
            }
            case 6: {
                return "Rotate 180";
            }
        }
        return "Flip";
    }
}