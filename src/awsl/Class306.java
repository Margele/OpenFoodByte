package awsl;

import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.util.ResourceLocation;
import obfuscate.a;

public class Class306 implements IImageBuffer {
   public ImageBufferDownload Field1587;
   public final WeakReference Field1588;
   public final ResourceLocation Field1589;

   public Class306(AbstractClientPlayer a, ResourceLocation a) {
      Class286.Method3111();
      this.Field1588 = new WeakReference(a);
      this.Field1589 = a;
      this.Field1587 = new ImageBufferDownload();
      a.trash(new String[4]);
   }

   public BufferedImage Method683(BufferedImage a) {
      return Method684(a);
   }

   private static BufferedImage Method684(BufferedImage a) {
      return null;
   }

   public void Method685() {
      int var10000 = Class286.Method3111();
      AbstractClientPlayer var2 = (AbstractClientPlayer)this.Field1588.get();
      int var1 = var10000;
      Method686(var2, this.Field1589);
      if (a.trash() == null) {
         ++var1;
         Class286.Method3110(var1);
      }

   }

   private static void Method686(AbstractClientPlayer a, ResourceLocation a) {
   }
}
