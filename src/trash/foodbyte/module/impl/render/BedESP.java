/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.block.Block
 *  net.minecraft.block.Block$EnumOffsetType
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class492;
import awsl.Class649;
import awsl.Class654;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;

public class BedESP
extends Module {
    private static final ArrayList Field2383 = new ArrayList();
    private final ArrayList Field2384 = new ArrayList();
    public ColorValue Field2385 = new ColorValue("BedESP", "ESP Color", new Color(0, 153, 255), "\u900f\u89c6\u7ed8\u5236\u989c\u8272");
    public FloatValue Field2386 = new FloatValue("BedESP", "Width", 2.0, 1.0, 5.0, 0.1, "\u5bbd\u5ea6");
    public BooleanValue Field2387 = new BooleanValue("BedESP", "Antialiasing", (Boolean)true, "\u6297\u952f\u9f7f");

    public BedESP() {
        super("BedESP", "Bed ESP", Category.RENDER);
        Field2383.Method2530((Object)26);
    }

    @Override
    public String getDescription() {
        return "\u5e8a\u900f\u89c6";
    }

    @EventTarget
    public void Method1625(Class649 a) {
        BlockPos a2 = new BlockPos(a.Method3513(), a.Method3542(), a.Method3543());
        if (!this.Field2384.contains((Object)a2) && Field2383.contains((Object)Block.getIdFromBlock((Block)a.Method3544()))) {
            this.Field2384.Method2530((Object)a2);
        }
    }

    @EventTarget
    public void Method1626(Class654 a) {
        int a2 = 0;
        String a3 = Class492.Method2239();
        if (a2 < this.Field2384.Method1799()) {
            BlockPos a4 = (BlockPos)this.Field2384.get(a2);
            int a5 = Block.getIdFromBlock((Block)BedESP.mc.theWorld.getBlockState(a4).getBlock());
            if (!Field2383.contains((Object)a5)) {
                this.Field2384.remove(a2);
            }
            ++a2;
        }
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        Iterator iterator = this.Field2384.Method1383();
        String a2 = Class492.Method2239();
        if (iterator.Method932()) {
            BlockPos a3 = (BlockPos)iterator.Method933();
            this.Method1627(a3, a);
        }
    }

    private void Method1627(BlockPos a, EventRender3D a2) {
        EntityPlayerSP a3 = BedESP.mc.thePlayer;
        BlockPos a4 = a;
        Block a5 = BedESP.mc.theWorld.getBlockState(a4).getBlock();
        if (a5.getMaterial() != Material.air && BedESP.mc.theWorld.getWorldBorder().contains(a4)) {
            a5.setBlockBoundsBasedOnState((IBlockAccess)BedESP.mc.theWorld, a4);
            double a6 = a3.lastTickPosX + (a3.posX - a3.lastTickPosX) * (double)a2.Method3523();
            double a7 = a3.lastTickPosY + (a3.posY - a3.lastTickPosY) * (double)a2.Method3523();
            double a8 = a3.lastTickPosZ + (a3.posZ - a3.lastTickPosZ) * (double)a2.Method3523();
            AxisAlignedBB a9 = a5.getSelectedBoundingBox((World)BedESP.mc.theWorld, a4);
            Block.EnumOffsetType a10 = a5.getOffsetType();
            if (a10 != Block.EnumOffsetType.NONE) {
                a9 = BedESP.Method1628(a9, a10, a4);
            }
            GL11.glPushMatrix();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
            GlStateManager.color((float)((float)this.Method242() / 255.0f), (float)((float)this.Method243() / 255.0f), (float)((float)this.Method244() / 255.0f), (float)((float)this.Method245() / 255.0f));
            GL11.glLineWidth((float)this.Field2386.Method2744().floatValue());
            GlStateManager.disableTexture2D();
            GlStateManager.depthMask((boolean)false);
            GL11.glDisable((int)2929);
            if (this.Field2387.Method2509().booleanValue()) {
                GL11.glEnable((int)2848);
            }
            GlStateManager.color((float)((float)this.Method242() / 255.0f), (float)((float)this.Method243() / 255.0f), (float)((float)this.Method244() / 255.0f), (float)((float)this.Method245() / 255.0f));
            BedESP.Method1629(a9.expand((double)0.002f, (double)0.002f, (double)0.002f).offset(-a6, -a7, -a8));
            GL11.glEnable((int)2929);
            if (this.Field2387.Method2509().booleanValue()) {
                GL11.glDisable((int)2848);
            }
            GlStateManager.depthMask((boolean)true);
            GlStateManager.enableTexture2D();
            GlStateManager.disableBlend();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
    }

    public int Method242() {
        return this.Field2385.Method2450();
    }

    public int Method243() {
        return this.Field2385.Method2451();
    }

    public int Method244() {
        return this.Field2385.Method2452();
    }

    public int Method245() {
        return this.Field2385.Method2453();
    }

    public static ArrayList Method241() {
        return Field2383;
    }

    public static AxisAlignedBB Method1628(AxisAlignedBB a, Block.EnumOffsetType a2, BlockPos a3) {
        int a4 = a3.getX();
        int a5 = a3.getZ();
        long a6 = (long)(a4 * 3129871) ^ (long)a5 * 116129781L;
        a6 = a6 * a6 * 42317861L + a6 * 11L;
        double a7 = ((double)((float)(a6 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double a8 = ((double)((float)(a6 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double a9 = 0.0;
        if (a2 == Block.EnumOffsetType.XYZ) {
            a9 = ((double)((float)(a6 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
        }
        return a.offset(a7, a9, a8);
    }

    public static void Method1629(AxisAlignedBB a) {
        Tessellator a2 = Tessellator.getInstance();
        WorldRenderer a3 = a2.getWorldRenderer();
        a3.begin(3, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a2.draw();
        a3.begin(3, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a2.draw();
        a3.begin(1, DefaultVertexFormats.POSITION);
        a3.pos(a.minX, a.minY, a.minZ).endVertex();
        a3.pos(a.minX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.minZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.minZ).endVertex();
        a3.pos(a.maxX, a.minY, a.maxZ).endVertex();
        a3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
        a3.pos(a.minX, a.minY, a.maxZ).endVertex();
        a3.pos(a.minX, a.maxY, a.maxZ).endVertex();
        a2.draw();
    }

    @Override
    public void onEnable() {
        Field2383.Method2530((Object)26);
        this.Field2384.clear();
        if (this.Method1026()) {
            BedESP.mc.renderGlobal.loadRenderers();
        }
    }
}