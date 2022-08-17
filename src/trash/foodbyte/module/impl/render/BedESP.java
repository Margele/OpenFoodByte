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
      BlockPos a = new BlockPos(a.Method3513(), a.Method3542(), a.Method3543());
      if (!this.Field2384.contains(a) && Field2383.contains(Block.getIdFromBlock(a.Method3544()))) {
         this.Field2384.Method2530(a);
      }

   }

   @EventTarget
   public void Method1626(EventTickUpdate a) {
      Class492.Method2239();
      int a = 0;
      if (a < this.Field2384.Method1799()) {
         BlockPos a = (BlockPos)this.Field2384.get(a);
         int a = Block.getIdFromBlock(mc.theWorld.getBlockState(a).getBlock());
         if (!Field2383.contains(a)) {
            this.Field2384.remove(a);
         }

         ++a;
      }

   }

   @EventTarget
   public void Method802(EventRender3D a) {
      Class492.Method2239();
      Iterator var3 = this.Field2384.Method1383();
      if (var3.Method932()) {
         BlockPos a = (BlockPos)var3.Method933();
         this.Method1627(a, a);
      }

   }

   private void Method1627(BlockPos a, EventRender3D a) {
      EntityPlayerSP a = mc.thePlayer;
      Block a = mc.theWorld.getBlockState(a).getBlock();
      if (a.getMaterial() != Material.air && mc.theWorld.getWorldBorder().contains(a)) {
         a.setBlockBoundsBasedOnState(mc.theWorld, a);
         double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a.Method3523();
         double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a.Method3523();
         double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a.Method3523();
         AxisAlignedBB a = a.getSelectedBoundingBox(mc.theWorld, a);
         Block.EnumOffsetType a = a.getOffsetType();
         if (a != EnumOffsetType.NONE) {
            a = Method1628(a, a, a);
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
         Method1629(a.expand(0.0020000000949949026, 0.0020000000949949026, 0.0020000000949949026).offset(-a, -a, -a));
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
      Field2383.Method2530(26);
      this.Field2384.clear();
      if (this.Method1026()) {
         mc.renderGlobal.loadRenderers();
      }

   }
}
