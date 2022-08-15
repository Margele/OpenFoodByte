/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.Rectangle
 *  java.awt.Shape
 *  java.awt.geom.AffineTransform
 *  java.awt.image.BufferedImage
 *  java.awt.image.ImageObserver
 *  java.awt.image.ImageProducer
 *  java.awt.image.PixelGrabber
 *  java.awt.image.Raster
 *  java.awt.image.RenderedImage
 *  java.awt.image.WritableRaster
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.RuntimeException
 */
package awsl;

import awsl.Class193;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.PixelGrabber;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;

public abstract class Class779 {
    private static BufferedImage Field3474 = null;

    public static BufferedImage Method835(ImageProducer a) {
        PixelGrabber a2 = new PixelGrabber(a, 0, 0, -1, -1, null, 0, 0);
        try {
            a2.grabPixels();
        }
        catch (InterruptedException a3) {
            throw new RuntimeException("Image fetch interrupted");
        }
        if ((a2.status() & 0x80) != 0) {
            throw new RuntimeException("Image fetch aborted");
        }
        if ((a2.status() & 0x40) != 0) {
            throw new RuntimeException("Image fetch error");
        }
        BufferedImage a4 = new BufferedImage(a2.getWidth(), a2.getHeight(), 2);
        a4.setRGB(0, 0, a2.getWidth(), a2.getHeight(), (int[])a2.getPixels(), 0, a2.getWidth());
        return a4;
    }

    public static BufferedImage Method836(Image a) {
        if (a instanceof BufferedImage && ((BufferedImage)a).getType() == 2) {
            return (BufferedImage)a;
        }
        BufferedImage a2 = new BufferedImage(a.getWidth(null), a.getHeight(null), 2);
        Graphics2D a3 = a2.createGraphics();
        a3.drawImage(a, 0, 0, null);
        a3.dispose();
        return a2;
    }

    public static BufferedImage Method837(BufferedImage a, int a2, int a3, int a4, int a5) {
        BufferedImage a6 = new BufferedImage(a4, a5, 2);
        Graphics2D a7 = a6.createGraphics();
        a7.drawRenderedImage((RenderedImage)a, AffineTransform.getTranslateInstance((double)(-a2), (double)(-a3)));
        a7.dispose();
        return a6;
    }

    public static BufferedImage Method838(BufferedImage a) {
        BufferedImage a2 = new BufferedImage(a.getWidth(), a.getHeight(), 2);
        Graphics2D a3 = a2.createGraphics();
        a3.drawRenderedImage((RenderedImage)a, null);
        a3.dispose();
        return a2;
    }

    public static void Method839(Component a, Graphics a2, int a3, int a4, int a5, int a6) {
        int a7;
        Shape a8;
        boolean a9 = Class193.Method1270();
        if (Field3474 == null) {
            Field3474 = new BufferedImage(64, 64, 2);
            a8 = Field3474.createGraphics();
            int a10 = 0;
            if (a10 < 64) {
                a7 = 0;
                if (a7 < 64) {
                    a8.setColor(((a7 ^ a10) & 8) != 0 ? Color.lightGray : Color.white);
                    a8.fillRect(a7, a10, 8, 8);
                    a7 += 8;
                }
                a10 += 8;
            }
            a8.dispose();
        }
        if (Field3474 != null) {
            a8 = a2.getClip();
            Rectangle a11 = a2.getClipBounds();
            a11 = new Rectangle(a.getSize());
            a11 = a11.intersection(new Rectangle(a3, a4, a5, a6));
            a2.setClip((Shape)a11);
            a7 = Field3474.getWidth();
            int a12 = Field3474.getHeight();
            if (a7 != -1 && a12 != -1) {
                int a13 = a11.x / a7 * a7;
                int a14 = a11.y / a12 * a12;
                int a15 = (a11.x + a11.width + a7 - 1) / a7 * a7;
                a4 = a14;
                int a16 = (a11.y + a11.height + a12 - 1) / a12 * a12;
                if (a4 < a16) {
                    a3 = a13;
                    if (a3 < a15) {
                        a2.drawImage((Image)Field3474, a3, a4, (ImageObserver)a);
                        a3 += a7;
                    }
                    a4 += a12;
                }
            }
            a2.setClip(a8);
        }
    }

    public static Rectangle Method840(BufferedImage a) {
        int a2;
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        int a5 = 0;
        int a6 = 0;
        int a7 = a3;
        int a8 = a4;
        boolean a9 = false;
        int[] a10 = null;
        int a11 = a4 - 1;
        a10 = Class779.Method842(a, 0, a11, a3, 1, a10);
        for (a2 = 0; a2 < a7; ++a2) {
            if ((a10[a2] & 0xFF000000) == 0) continue;
            a7 = a2;
            a6 = a11;
            a9 = true;
            break;
        }
        for (a2 = a3 - 1; a2 >= a5; --a2) {
            if ((a10[a2] & 0xFF000000) == 0) continue;
            a5 = a2;
            a6 = a11;
            a9 = true;
            break;
        }
        a10 = null;
        block2: for (a2 = 0; a2 < a11; ++a2) {
            int a12;
            a10 = Class779.Method842(a, 0, a2, a3, 1, a10);
            for (a12 = 0; a12 < a7; ++a12) {
                if ((a10[a12] & 0xFF000000) == 0) continue;
                a7 = a12;
                if (a2 < a8) {
                    a8 = a2;
                }
                a9 = true;
                break;
            }
            for (a12 = a3 - 1; a12 >= a5; --a12) {
                if ((a10[a12] & 0xFF000000) == 0) continue;
                a5 = a12;
                if (a2 < a8) {
                    a8 = a2;
                }
                a9 = true;
                continue block2;
            }
        }
        return new Rectangle(a7, a8, a5 - a7 + 1, a6 - a8 + 1);
    }

    public static void Method841(Raster a, WritableRaster a2, Raster a3) {
        int a4 = a.getMinX();
        int a5 = a.getMinY();
        int a6 = a.getWidth();
        int a7 = a.getHeight();
        int[] a8 = null;
        int[] a9 = null;
        int[] a10 = null;
        for (int a11 = 0; a11 < a7; ++a11) {
            a8 = a.getPixels(a4, a5, a6, 1, a8);
            a9 = a3.getPixels(a4, a5, a6, 1, a9);
            a10 = a2.getPixels(a4, a5, a6, 1, a10);
            int a12 = a4;
            for (int a13 = 0; a13 < a6; ++a13) {
                int a14 = a8[a12];
                int a15 = a10[a12];
                int a16 = a8[a12 + 1];
                int a17 = a10[a12 + 1];
                int a18 = a8[a12 + 2];
                int a19 = a10[a12 + 2];
                int a20 = a8[a12 + 3];
                int a21 = a10[a12 + 3];
                float a22 = (float)a9[a12 + 3] / 255.0f;
                float a23 = 1.0f - a22;
                a10[a12] = (int)(a22 * (float)a14 + a23 * (float)a15);
                a10[a12 + 1] = (int)(a22 * (float)a16 + a23 * (float)a17);
                a10[a12 + 2] = (int)(a22 * (float)a18 + a23 * (float)a19);
                a10[a12 + 3] = (int)(a22 * (float)a20 + a23 * (float)a21);
                a12 += 4;
            }
            a2.setPixels(a4, a5, a6, 1, a10);
            ++a5;
        }
    }

    public static int[] Method842(BufferedImage a, int a2, int a3, int a4, int a5, int[] a6) {
        int a7 = a.getType();
        if (a7 == 2 || a7 == 1) {
            return (int[])a.getRaster().getDataElements(a2, a3, a4, a5, (Object)a6);
        }
        return a.getRGB(a2, a3, a4, a5, a6, 0, a4);
    }

    public static void Method843(BufferedImage a, int a2, int a3, int a4, int a5, int[] a6) {
        int a7 = a.getType();
        if (a7 == 2 || a7 == 1) {
            a.getRaster().setDataElements(a2, a3, a4, a5, (Object)a6);
        } else {
            a.setRGB(a2, a3, a4, a5, a6, 0, a4);
        }
    }

    private static Exception Method844(Exception exception) {
        return exception;
    }
}