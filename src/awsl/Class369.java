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
        Util.EnumOS a2 = Util.getOSType();
        if (a2 != Util.EnumOS.OSX) {
            InputStream a3 = null;
            InputStream a4 = null;
            a3 = Field1736.getResourceManager().getResource(Class393.Field1941).getInputStream();
            a4 = Field1736.getResourceManager().getResource(Class393.Field1942).getInputStream();
            try {
                Display.setIcon((ByteBuffer[])new ByteBuffer[]{Class369.Method681(a3), Class369.Method681(a4)});
            }
            catch (IOException a5) {
                try {
                    LogManager.getLogger((String)"FoodByte Transformer").error("Couldn't set icon", (Throwable)a5);
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(a3);
                    IOUtils.closeQuietly(a4);
                    throw throwable;
                }
                IOUtils.closeQuietly((InputStream)a3);
                IOUtils.closeQuietly((InputStream)a4);
            }
            IOUtils.closeQuietly((InputStream)a3);
            IOUtils.closeQuietly((InputStream)a4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static ByteBuffer Method681(InputStream a2) throws IOException {
        void a3;
        BufferedImage bufferedImage = ImageIO.read((InputStream)a2);
        int[] a4 = a3.getRGB(0, 0, a3.getWidth(), a3.getHeight(), (int[])null, 0, a3.getWidth());
        int[] a5 = RenderUtils.trash();
        ByteBuffer a6 = ByteBuffer.allocate((int)(4 * a4.length));
        int n = 0;
        int[] nArray = a4;
        int n2 = nArray.length;
        if (n < n2) {
            int a7 = nArray[n];
            a6.putInt(a7 << 8 | a7 >> 24 & 0xFF);
            ++n;
        }
        a6.flip();
        return a6;
    }

    private static IOException Method682(IOException iOException) {
        return iOException;
    }
}