/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  javax.imageio.ImageIO
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.Util
 *  net.minecraft.util.Util$EnumOS
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.lwjgl.opengl.Display
 */
package awsl;

import awsl.Class393;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.Display;
import trash.foodbyte.utils.RenderUtils;

public class Class369 {
    static Minecraft Field1736 = Minecraft.getMinecraft();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Method680() {
        Util.EnumOS a = Util.getOSType();
        if (a != Util.EnumOS.OSX) {
            InputStream a2 = null;
            InputStream a3 = null;
            a2 = Field1736.getResourceManager().getResource(Class393.Field1941).getInputStream();
            a3 = Field1736.getResourceManager().getResource(Class393.Field1942).getInputStream();
            try {
                Display.setIcon((ByteBuffer[])new ByteBuffer[]{Class369.Method681(a2), Class369.Method681(a3)});
            }
            catch (IOException a4) {
                try {
                    LogManager.getLogger((String)"FoodByte Transformer").error("Couldn't set icon", (Throwable)a4);
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(a2);
                    IOUtils.closeQuietly(a3);
                    throw throwable;
                }
                IOUtils.closeQuietly((InputStream)a2);
                IOUtils.closeQuietly((InputStream)a3);
            }
            IOUtils.closeQuietly((InputStream)a2);
            IOUtils.closeQuietly((InputStream)a3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static ByteBuffer Method681(InputStream a) throws IOException {
        void a2;
        BufferedImage bufferedImage = ImageIO.read((InputStream)a);
        int[] a3 = a2.getRGB(0, 0, a2.getWidth(), a2.getHeight(), (int[])null, 0, a2.getWidth());
        int[] a4 = RenderUtils.Method1148();
        ByteBuffer a5 = ByteBuffer.allocate((int)(4 * a3.length));
        int n = 0;
        int[] nArray = a3;
        int n2 = nArray.length;
        if (n < n2) {
            int a6 = nArray[n];
            a5.putInt(a6 << 8 | a6 >> 24 & 0xFF);
            ++n;
        }
        a5.flip();
        return a5;
    }

    private static IOException Method682(IOException iOException) {
        return iOException;
    }
}