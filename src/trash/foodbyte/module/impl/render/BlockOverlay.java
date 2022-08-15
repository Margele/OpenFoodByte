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
import trash.foodbyte.utils.ReflectionUtils;
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
        return this.Field2406.Method2509();
    }

    @EventTarget
    public void Method810(EventRender2D a) {
        MovingObjectPosition a2 = BlockOverlay.mc.objectMouseOver;
        if (a2.entityHit != null) {
            return;
        }
        Block a3 = BlockOverlay.mc.theWorld.getBlockState(a2.getBlockPos()).getBlock();
        BlockPos a4 = a2.getBlockPos();
        if (Block.getIdFromBlock((Block)a3) == 0) {
            return;
        }
        FontRenderer a5 = BlockOverlay.mc.fontRendererObj;
        int a6 = Block.getIdFromBlock((Block)a3);
        String a7 = a3.getLocalizedName() + " ID:" + a6;
        String a8 = a3.getLocalizedName();
        String a9 = " ID:" + a6;
        if (BlockOverlay.mc.objectMouseOver != null && this.Method713()) {
            ScaledResolution a10 = new ScaledResolution(mc);
            int a11 = a10.getScaledWidth() / 2 + 10;
            int a12 = a10.getScaledHeight() / 2 + 2;
            RenderUtils.Method1104(a11, a12, (float)a11 + Class565.Field2634.Method1225(a7) + 3.0f, (float)(a12 + a5.FONT_HEIGHT) + 0.5f, new Color(0, 0, 0, 120).getRGB());
            Class565.Field2634.Method1217(a8, (float)a11 + 1.0f, a12, Class681.WHITE.Field2962);
            Class565.Field2634.Method1217(a9, (float)a11 + Class565.Field2634.Method1225(a8) + 1.0f, a12, Class681.GREY.Field2962);
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
    public void Method802(EventRender3D a) {
        this.Method1747((EntityPlayer)BlockOverlay.mc.thePlayer, BlockOverlay.mc.objectMouseOver, 0, ReflectionUtils.Method2587());
    }

    public void Method1747(EntityPlayer a, MovingObjectPosition a2, int a3, float a4) {
        if (a2.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            GL11.glPushMatrix();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
            GlStateManager.color((float)((float)this.Method242() / 255.0f), (float)((float)this.Method243() / 255.0f), (float)((float)this.Method244() / 255.0f), (float)((float)this.Method245() / 255.0f));
            GL11.glLineWidth((float)this.Field2403.Method2744().floatValue());
            GlStateManager.disableTexture2D();
            GlStateManager.depthMask((boolean)false);
            float a5 = 0.002f;
            BlockPos a6 = a2.getBlockPos();
            Block a7 = BlockOverlay.mc.theWorld.getBlockState(a6).getBlock();
            if (a7.getMaterial() != Material.air && BlockOverlay.mc.theWorld.getWorldBorder().contains(a6)) {
                a7.setBlockBoundsBasedOnState((IBlockAccess)BlockOverlay.mc.theWorld, a6);
                double a8 = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a4;
                double a9 = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a4;
                double a10 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a4;
                AxisAlignedBB a11 = a7.getSelectedBoundingBox((World)BlockOverlay.mc.theWorld, a6);
                Block.EnumOffsetType a12 = a7.getOffsetType();
                if (a12 != Block.EnumOffsetType.NONE) {
                    a11 = BlockOverlay.Method1628(a11, a12, a6);
                }
                if (this.Field2404.Method2509().booleanValue()) {
                    GL11.glDisable((int)2929);
                }
                if (this.Field2405.Method2509().booleanValue()) {
                    GL11.glEnable((int)2848);
                }
                BlockOverlay.Method1629(a11.expand((double)0.002f, (double)0.002f, (double)0.002f).offset(-a8, -a9, -a10));
                if (this.Field2404.Method2509().booleanValue()) {
                    GL11.glEnable((int)2929);
                }
                if (this.Field2405.Method2509().booleanValue()) {
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
        super.onEnable();
    }

    @Override
    public void Method279() {
        super.Method279();
    }
}