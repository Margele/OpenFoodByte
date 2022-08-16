/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.renderer.IImageBuffer
 *  net.minecraft.client.renderer.ImageBufferDownload
 *  net.minecraft.util.ResourceLocation
 */
package awsl;

import awsl.Class286;
import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.util.ResourceLocation;
import obfuscate.a;

public class Class306
implements IImageBuffer {
    public ImageBufferDownload Field1587;
    public final WeakReference Field1588;
    public final ResourceLocation Field1589;

    public Class306(AbstractClientPlayer a2, ResourceLocation a3) {
        this.Field1588 = new WeakReference((Object)a2);
        this.Field1589 = a3;
        int n = Class286.Method3111();
        this.Field1587 = new ImageBufferDownload();
        a.trash(new String[4]);
    }

    public BufferedImage Method683(BufferedImage a2) {
        return Class306.Method684(a2);
    }

    private static BufferedImage Method684(BufferedImage a2) {
        return null;
    }

    public void Method685() {
        AbstractClientPlayer a2 = (AbstractClientPlayer)this.Field1588.get();
        int a3 = Class286.Method3111();
        Class306.Method686(a2, this.Field1589);
        if (a.trash() == null) {
            Class286.Method3110(++a3);
        }
    }

    private static void Method686(AbstractClientPlayer a2, ResourceLocation a3) {
    }
}