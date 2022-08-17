package trash.foodbyte.module.impl.render;

import awsl.Class492;
import awsl.Class649;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.Block.EnumOffsetType;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;

public class BedESP extends Module {
   private static final ArrayList Field2383 = new ArrayList();
   private final ArrayList Field2384 = new ArrayList();
   public ColorValue Field2385 = new ColorValue("BedESP", "ESP Color", new Color(0, 153, 255), "透视绘制颜色");
   public FloatValue Field2386 = new FloatValue("BedESP", "Width", 2.0, 1.0, 5.0, 0.1, "宽度");
   public BooleanValue Field2387 = new BooleanValue("BedESP", "Antialiasing", true, "抗锯齿");

   public BedESP() {
      super("BedESP", "Bed ESP", Category.RENDER);
      Field2383.Method2530(26);
   }

   public String getDescription() {
      return "床透视";
   }

   @EventTarget
   public void Method1625(Class649 a) {
      BlockPos var2 = new BlockPos(a.Method3513(), a.Method3542(), a.Method3543());
      if (!this.Field2384.contains(var2) && Field2383.contains(Block.getIdFromBlock(a.Method3544()))) {
         this.Field2384.Method2530(var2);
      }

   }

   @EventTarget
   public void Method1626(EventTickUpdate a) {
      Class492.Method2239();
      int var3 = 0;
      if (var3 < this.Field2384.Method1799()) {
         BlockPos var4 = (BlockPos)this.Field2384.get(var3);
         int var5 = Block.getIdFromBlock(mc.theWorld.getBlockState(var4).getBlock());
         if (!Field2383.contains(var5)) {
            this.Field2384.remove(var3);
         }

         ++var3;
      }

   }

   @EventTarget
   public void Method802(EventRender3D a) {
      Class492.Method2239();
      Iterator var3 = this.Field2384.Method1383();
      if (var3.Method932()) {
         BlockPos var4 = (BlockPos)var3.Method933();
         this.Method1627(var4, a);
      }

   }

   private void Method1627(BlockPos a, EventRender3D a) {
      EntityPlayerSP var3 = mc.thePlayer;
      Block var5 = mc.theWorld.getBlockState(a).getBlock();
      if (var5.getMaterial() != Material.air && mc.theWorld.getWorldBorder().contains(a)) {
         var5.setBlockBoundsBasedOnState(mc.theWorld, a);
         double var6 = var3.lastTickPosX + (var3.posX - var3.lastTickPosX) * (double)a.Method3523();
         double var8 = var3.lastTickPosY + (var3.posY - var3.lastTickPosY) * (double)a.Method3523();
         double var10 = var3.lastTickPosZ + (var3.posZ - var3.lastTickPosZ) * (double)a.Method3523();
         AxisAlignedBB var12 = var5.getSelectedBoundingBox(mc.theWorld, a);
         Block.EnumOffsetType var13 = var5.getOffsetType();
         if (var13 != EnumOffsetType.NONE) {
            var12 = Method1628(var12, var13, a);
         }

         GL11.glPushMatrix();
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         GlStateManager.color((float)this.Method242() / 255.0F, (float)this.Method243() / 255.0F, (float)this.Method244() / 255.0F, (float)this.Method245() / 255.0F);
         GL11.glLineWidth(this.Field2386.getFloatValue());
         GlStateManager.disableTexture2D();
         GlStateManager.depthMask(false);
         GL11.glDisable(2929);
         if (this.Field2387.getBooleanValue()) {
            GL11.glEnable(2848);
         }

         GlStateManager.color((float)this.Method242() / 255.0F, (float)this.Method243() / 255.0F, (float)this.Method244() / 255.0F, (float)this.Method245() / 255.0F);
         Method1629(var12.expand(0.0020000000949949026, 0.0020000000949949026, 0.0020000000949949026).offset(-var6, -var8, -var10));
         GL11.glEnable(2929);
         if (this.Field2387.getBooleanValue()) {
            GL11.glDisable(2848);
         }

         GlStateManager.depthMask(true);
         GlStateManager.enableTexture2D();
         GlStateManager.disableBlend();
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
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
      Field2383.Method2530(26);
      this.Field2384.clear();
      if (this.Method1026()) {
         mc.renderGlobal.loadRenderers();
      }

   }
}
