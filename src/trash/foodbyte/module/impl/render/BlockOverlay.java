package trash.foodbyte.module.impl.render;

import awsl.Class565;
import awsl.Class681;
import eventapi.EventTarget;
import java.awt.Color;
import net.minecraft.block.Block;
import net.minecraft.block.Block.EnumOffsetType;
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
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
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

public class BlockOverlay extends Module {
   public ColorValue Field2402 = new ColorValue("BlockOverlay", "Overlay Color", new Color(0, 153, 255), "绘制颜色");
   public FloatValue Field2403 = new FloatValue("BlockOverlay", "Width", 2.0, 1.0, 5.0, 0.1, "宽度");
   public BooleanValue Field2404 = new BooleanValue("BlockOverlay", "Through", false, "绘制不被方块遮挡");
   public BooleanValue Field2405 = new BooleanValue("BlockOverlay", "Antialiasing", true, "抗锯齿");
   public BooleanValue Field2406 = new BooleanValue("BlockOverlay", "RenderString", false, "显示方块名字和ID");

   public BlockOverlay() {
      super("BlockOverlay", "Block Overlay", Category.RENDER);
   }

   public String getDescription() {
      return "自定义瞄准方块描边";
   }

   public boolean Method713() {
      return this.Field2406.getBooleanValue();
   }

   @EventTarget
   public void Method810(EventRender2D a) {
      MovingObjectPosition a = mc.objectMouseOver;
      if (a.entityHit == null) {
         Block a = mc.theWorld.getBlockState(a.getBlockPos()).getBlock();
         BlockPos a = a.getBlockPos();
         if (Block.getIdFromBlock(a) != 0) {
            FontRenderer a = mc.fontRendererObj;
            int a = Block.getIdFromBlock(a);
            String a = a.getLocalizedName() + " ID:" + a;
            String a = a.getLocalizedName();
            String a = " ID:" + a;
            if (mc.objectMouseOver != null && this.Method713()) {
               ScaledResolution a = new ScaledResolution(mc);
               int a = a.getScaledWidth() / 2 + 10;
               int a = a.getScaledHeight() / 2 + 2;
               RenderUtils.Method1104((float)a, (float)a, (float)a + Class565.Field2634.Method1225(a) + 3.0F, (float)(a + a.FONT_HEIGHT) + 0.5F, (new Color(0, 0, 0, 120)).getRGB());
               Class565.Field2634.Method1217(a, (float)a + 1.0F, (float)a, Class681.WHITE.Field2962);
               Class565.Field2634.Method1217(a, (float)a + Class565.Field2634.Method1225(a) + 1.0F, (float)a, Class681.GREY.Field2962);
            }

         }
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

   @EventTarget(1)
   public void Method802(EventRender3D a) {
      this.Method1747(mc.thePlayer, mc.objectMouseOver, 0, ReflectionUtils.getRenderPartialTicks());
   }

   public void Method1747(EntityPlayer a, MovingObjectPosition a, int a2, float a) {
      if (a.typeOfHit == MovingObjectType.BLOCK) {
         GL11.glPushMatrix();
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         GlStateManager.color((float)this.Method242() / 255.0F, (float)this.Method243() / 255.0F, (float)this.Method244() / 255.0F, (float)this.Method245() / 255.0F);
         GL11.glLineWidth(this.Field2403.getFloatValue());
         GlStateManager.disableTexture2D();
         GlStateManager.depthMask(false);
         float a = 0.002F;
         BlockPos a = a.getBlockPos();
         Block a = mc.theWorld.getBlockState(a).getBlock();
         if (a.getMaterial() != Material.air && mc.theWorld.getWorldBorder().contains(a)) {
            a.setBlockBoundsBasedOnState(mc.theWorld, a);
            double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a;
            double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a;
            double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a;
            AxisAlignedBB a = a.getSelectedBoundingBox(mc.theWorld, a);
            Block.EnumOffsetType a = a.getOffsetType();
            if (a != EnumOffsetType.NONE) {
               a = Method1628(a, a, a);
            }

            if (this.Field2404.getBooleanValue()) {
               GL11.glDisable(2929);
            }

            if (this.Field2405.getBooleanValue()) {
               GL11.glEnable(2848);
            }

            Method1629(a.expand(0.0020000000949949026, 0.0020000000949949026, 0.0020000000949949026).offset(-a, -a, -a));
            if (this.Field2404.getBooleanValue()) {
               GL11.glEnable(2929);
            }

            if (this.Field2405.getBooleanValue()) {
               GL11.glDisable(2848);
            }
         }

         GlStateManager.depthMask(true);
         GlStateManager.enableTexture2D();
         GlStateManager.disableBlend();
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
      }

   }

   public static AxisAlignedBB Method1628(AxisAlignedBB a, Block.EnumOffsetType a, BlockPos a) {
      int a = a.getX();
      int a = a.getZ();
      long a = (long)(a * 3129871) ^ (long)a * 116129781L;
      a = a * a * 42317861L + a * 11L;
      double a = ((double)((float)(a >> 16 & 15L) / 15.0F) - 0.5) * 0.5;
      double a = ((double)((float)(a >> 24 & 15L) / 15.0F) - 0.5) * 0.5;
      double a = 0.0;
      if (a == EnumOffsetType.XYZ) {
         a = ((double)((float)(a >> 20 & 15L) / 15.0F) - 1.0) * 0.2;
      }

      return a.offset(a, a, a);
   }

   public static void Method1629(AxisAlignedBB a) {
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.draw();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(1, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.draw();
   }

   public void onEnable() {
      super.onEnable();
   }

   public void onDisable() {
      super.onDisable();
   }
}
