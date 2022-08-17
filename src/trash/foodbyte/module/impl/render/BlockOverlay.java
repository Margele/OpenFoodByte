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
      MovingObjectPosition var2 = mc.objectMouseOver;
      if (var2.entityHit == null) {
         Block var3 = mc.theWorld.getBlockState(var2.getBlockPos()).getBlock();
         BlockPos var4 = var2.getBlockPos();
         if (Block.getIdFromBlock(var3) != 0) {
            FontRenderer var5 = mc.fontRendererObj;
            int var6 = Block.getIdFromBlock(var3);
            String var7 = var3.getLocalizedName() + " ID:" + var6;
            String var8 = var3.getLocalizedName();
            String var9 = " ID:" + var6;
            if (mc.objectMouseOver != null && this.Method713()) {
               ScaledResolution var10 = new ScaledResolution(mc);
               int var11 = var10.getScaledWidth() / 2 + 10;
               int var12 = var10.getScaledHeight() / 2 + 2;
               RenderUtils.Method1104((float)var11, (float)var12, (float)var11 + Class565.Field2634.Method1225(var7) + 3.0F, (float)(var12 + var5.FONT_HEIGHT) + 0.5F, (new Color(0, 0, 0, 120)).getRGB());
               Class565.Field2634.Method1217(var8, (float)var11 + 1.0F, (float)var12, Class681.WHITE.Field2962);
               Class565.Field2634.Method1217(var9, (float)var11 + Class565.Field2634.Method1225(var8) + 1.0F, (float)var12, Class681.GREY.Field2962);
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

   public void Method1747(EntityPlayer a, MovingObjectPosition a, int a, float a) {
      if (a.typeOfHit == MovingObjectType.BLOCK) {
         GL11.glPushMatrix();
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         GlStateManager.color((float)this.Method242() / 255.0F, (float)this.Method243() / 255.0F, (float)this.Method244() / 255.0F, (float)this.Method245() / 255.0F);
         GL11.glLineWidth(this.Field2403.getFloatValue());
         GlStateManager.disableTexture2D();
         GlStateManager.depthMask(false);
         float var5 = 0.002F;
         BlockPos var6 = a.getBlockPos();
         Block var7 = mc.theWorld.getBlockState(var6).getBlock();
         if (var7.getMaterial() != Material.air && mc.theWorld.getWorldBorder().contains(var6)) {
            var7.setBlockBoundsBasedOnState(mc.theWorld, var6);
            double var8 = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a;
            double var10 = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a;
            double var12 = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a;
            AxisAlignedBB var14 = var7.getSelectedBoundingBox(mc.theWorld, var6);
            Block.EnumOffsetType var15 = var7.getOffsetType();
            if (var15 != EnumOffsetType.NONE) {
               var14 = Method1628(var14, var15, var6);
            }

            if (this.Field2404.getBooleanValue()) {
               GL11.glDisable(2929);
            }

            if (this.Field2405.getBooleanValue()) {
               GL11.glEnable(2848);
            }

            Method1629(var14.expand(0.0020000000949949026, 0.0020000000949949026, 0.0020000000949949026).offset(-var8, -var10, -var12));
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
      int var3 = a.getX();
      int var4 = a.getZ();
      long var5 = (long)(var3 * 3129871) ^ (long)var4 * 116129781L;
      var5 = var5 * var5 * 42317861L + var5 * 11L;
      double var7 = ((double)((float)(var5 >> 16 & 15L) / 15.0F) - 0.5) * 0.5;
      double var9 = ((double)((float)(var5 >> 24 & 15L) / 15.0F) - 0.5) * 0.5;
      double var11 = 0.0;
      if (a == EnumOffsetType.XYZ) {
         var11 = ((double)((float)(var5 >> 20 & 15L) / 15.0F) - 1.0) * 0.2;
      }

      return a.offset(var7, var11, var9);
   }

   public static void Method1629(AxisAlignedBB a) {
      Tessellator var1 = Tessellator.getInstance();
      WorldRenderer var2 = var1.getWorldRenderer();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var1.draw();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var1.draw();
      var2.begin(1, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var1.draw();
   }

   public void onEnable() {
      super.onEnable();
   }

   public void onDisable() {
      super.onDisable();
   }
}
