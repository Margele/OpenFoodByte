package awsl;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;
import net.minecraft.util.Util.EnumOS;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.Display;
import trash.foodbyte.utils.RenderUtils;

public class Class369 {
   static Minecraft Field1736 = Minecraft.getMinecraft();

   public static void Method680() {
      Util.EnumOS a = Util.getOSType();
      if (a != EnumOS.OSX) {
         InputStream a = null;
         InputStream a = null;

         try {
            a = Field1736.getResourceManager().getResource(Class393.Field1941).getInputStream();
            a = Field1736.getResourceManager().getResource(Class393.Field1942).getInputStream();
            Display.setIcon(new ByteBuffer[]{Method681(a), Method681(a)});
         } catch (IOException var7) {
            LogManager.getLogger("FoodByte Transformer").error("Couldn't set icon", var7);
         } finally {
            IOUtils.closeQuietly(a);
            IOUtils.closeQuietly(a);
         }
      }

   }

   public static ByteBuffer Method681(InputStream a) throws IOException {
      BufferedImage a = ImageIO.read(a);
      RenderUtils.trash();
      int[] a = a.getRGB(0, 0, a.getWidth(), a.getHeight(), (int[])null, 0, a.getWidth());
      ByteBuffer a = ByteBuffer.allocate(4 * a.length);
      int var6 = a.length;
      int var7 = 0;
      if (var7 < var6) {
         int a = a[var7];
         a.putInt(a << 8 | a >> 24 & 255);
         ++var7;
      }

      a.flip();
      return a;
   }

   private static IOException Method682(IOException iOException) {
      return iOException;
   }
}
