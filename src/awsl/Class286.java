/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.lang.Object
 */
package awsl;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Class286 {
    public static final int Field1548 = 64;
    private static int Field1549;

    public static BufferedImage Method3109(BufferedImage a) throws IOException {
        return null;
    }

    public static void Method3110(int n) {
        Field1549 = n;
    }

    public static int Method3111() {
        return Field1549;
    }

    public static int Method3112() {
        int n = Class286.Method3111();
        return 92;
    }

    private static IOException Method3113(IOException iOException) {
        return iOException;
    }

    static {
        if (Class286.Method3112() != 0) {
            Class286.Method3110(90);
        }
    }
}