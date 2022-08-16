/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.block.Block
 *  net.minecraft.block.Block$EnumOffsetType
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.render;

import awsl.Class565;
import awsl.Class681;
import eventapi.EventTarget;
import java.awt.Color;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;

public class BlockOverlay
extends Module {
    public ColorValue Field2402 = new ColorValue("BlockOverlay", "Overlay Color", new Color(0, 153, 255), "\u7ed8\u5236\u989c\u8272");
    public FloatValue Field2403 = new FloatValue("BlockOverlay", "Width", 2.0, 1.0, 5.0, 0.1, "\u5bbd\u5ea6");
    public BooleanValue Field2404 = new BooleanValue("BlockOverlay", "Through", (Boolean)false, "\u7ed8\u5236\u4e0d\u88ab\u65b9\u5757\u906e\u6321");
    public BooleanValue Field2405 = new BooleanValue("BlockOverlay", "Antialiasing", (Boolean)true, "\u6297\u952f\u9f7f");
    public BooleanValue Field2406 = new BooleanValue("BlockOverlay", "RenderString", (Boolean)false, "\u663e\u793a\u65b9\u5757\u540d\u5b57\u548cID");

    public BlockOverlay() {
        super("BlockOverlay", "Block Overlay", Category.RENDER);
    }

    @Override
    public String getDescription() {
        return "\u81ea\u5b9a\u4e49\u7784\u51c6\u65b9\u5757\u63cf\u8fb9";
    }

    public boolean Method713() {
        return this.Field2406.getBooleanValue();
    }

    @EventTarget
    public void Method810(EventRender2D a2) {
        MovingObjectPosition a3 = BlockOverlay.mc.objectMouseOver;
        if (a3.entityHit != null) {
            return;
        }
        Block a4 = BlockOverlay.mc.theWorld.getBlockState(a3.getBlockPos()).getBlock();
        BlockPos a5 = a3.getBlockPos();
        if (Block.getIdFromBlock((Block)a4) == 0) {
            return;
        }
        FontRenderer a6 = BlockOverlay.mc.fontRendererObj;
        int a7 = Block.getIdFromBlock((Block)a4);
        String a8 = a4.getLocalizedName() + " ID:" + a7;
        String a9 = a4.getLocalizedName();
        String a10 = " ID:" + a7;
        if (BlockOverlay.mc.objectMouseOver != null && this.Method713()) {
            ScaledResolution a11 = new ScaledResolution(mc);
            int a12 = a11.getScaledWidth() / 2 + 10;
            int a13 = a11.getScaledHeight() / 2 + 2;
            RenderUtils.Method1104(a12, a13, (float)a12 + Class565.Field2634.Method1225(a8) + 3.0f, (float)(a13 + a6.FONT_HEIGHT) + 0.5f, new Color(0, 0, 0, 120).getRGB());
            Class565.Field2634.Method1217(a9, (float)a12 + 1.0f, a13, Class681.WHITE.Field2962);
            Class565.Field2634.Method1217(a10, (float)a12 + Class565.Field2634.Method1225(a9) + 1.0f, a13, Class681.GREY.Field2962);
        }
    }

    public int Method242() {
        return this.Field2402.Method2450();
    }

    public int Method243() {
        return this.Field2402.Method2451();
    }

    public int Method244() {
        return this.Field2402.Method2452();
    }

    public int Method245() {
        return this.Field2402.Method2453();
    }

    @EventTarget(value=1)
    public void Method802(EventRender3D a2) {
        this.Method1747((EntityPlayer)BlockOverlay.mc.thePlayer, BlockOverlay.mc.objectMouseOver, 0, ReflectionUtils.getRenderPartialTicks());
    }

    public void Method1747(EntityPlayer a2, MovingObjectPosition a3, int a4, float a5) {
        if (a3.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            GL11.glPushMatrix();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
            GlStateManager.color((float)((float)this.Method242() / 255.0f), (float)((float)this.Method243() / 255.0f), (float)((float)this.Method244() / 255.0f), (float)((float)this.Method245() / 255.0f));
            GL11.glLineWidth((float)this.Field2403.getFloatValue().floatValue());
            GlStateManager.disableTexture2D();
            GlStateManager.depthMask((boolean)false);
            float a6 = 0.002f;
            BlockPos a7 = a3.getBlockPos();
            Block a8 = BlockOverlay.mc.theWorld.getBlockState(a7).getBlock();
            if (a8.getMaterial() != Material.air && BlockOverlay.mc.theWorld.getWorldBorder().contains(a7)) {
                a8.setBlockBoundsBasedOnState((IBlockAccess)BlockOverlay.mc.theWorld, a7);
                double a9 = a2.lastTickPosX + (a2.posX - a2.lastTickPosX) * (double)a5;
                double a10 = a2.lastTickPosY + (a2.posY - a2.lastTickPosY) * (double)a5;
                double a11 = a2.lastTickPosZ + (a2.posZ - a2.lastTickPosZ) * (double)a5;
                AxisAlignedBB a12 = a8.getSelectedBoundingBox((World)BlockOverlay.mc.theWorld, a7);
                Block.EnumOffsetType a13 = a8.getOffsetType();
                if (a13 != Block.EnumOffsetType.NONE) {
                    a12 = BlockOverlay.Method1628(a12, a13, a7);
                }
                if (this.Field2404.getBooleanValue().booleanValue()) {
                    GL11.glDisable((int)2929);
                }
                if (this.Field2405.getBooleanValue().booleanValue()) {
                    GL11.glEnable((int)2848);
                }
                BlockOverlay.Method1629(a12.expand((double)0.002f, (double)0.002f, (double)0.002f).offset(-a9, -a10, -a11));
                if (this.Field2404.getBooleanValue().booleanValue()) {
                    GL11.glEnable((int)2929);
                }
                if (this.Field2405.getBooleanValue().booleanValue()) {
                    GL11.glDisable((int)2848);
                }
            }
            GlStateManager.depthMask((boolean)true);
            GlStateManager.enableTexture2D();
            GlStateManager.disableBlend();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
    }

    public static AxisAlignedBB Method1628(AxisAlignedBB a2, Block.EnumOffsetType a3, BlockPos a4) {
        int a5 = a4.getX();
        int a6 = a4.getZ();
        long a7 = (long)(a5 * 3129871) ^ (long)a6 * 116129781L;
        a7 = a7 * a7 * 42317861L + a7 * 11L;
        double a8 = ((double)((float)(a7 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double a9 = ((double)((float)(a7 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double a10 = 0.0;
        if (a3 == Block.EnumOffsetType.XYZ) {
            a10 = ((double)((float)(a7 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
        }
        return a2.offset(a8, a10, a9);
    }

    public static void Method1629(AxisAlignedBB a2) {
        Tessellator a3 = Tessellator.getInstance();
        WorldRenderer a4 = a3.getWorldRenderer();
        a4.begin(3, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a3.draw();
        a4.begin(3, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a3.draw();
        a4.begin(1, DefaultVertexFormats.POSITION);
        a4.pos(a2.minX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.minZ).endVertex();
        a4.pos(a2.maxX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.maxX, a2.maxY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.minY, a2.maxZ).endVertex();
        a4.pos(a2.minX, a2.maxY, a2.maxZ).endVertex();
        a3.draw();
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}