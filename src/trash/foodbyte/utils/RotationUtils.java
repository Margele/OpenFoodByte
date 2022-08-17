package trash.foodbyte.utils;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class RotationUtils {
   public static float[] getRotation2(EntityLivingBase a) {
      double var1 = a.posX;
      double var3 = a.posZ;
      double var5 = a.posY + (double)(a.getEyeHeight() / 2.0F);
      return Method1166(var1, var3, var5);
   }

   public static float[] Method1164(Entity a) {
      return null;
   }

   public static float[] Method1165(Entity a) {
      double var1 = a.posX - a.lastTickPosX;
      double var3 = a.posZ - a.lastTickPosZ;
      double var5 = (double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a);
      var5 -= var5 % 0.8;
      double var7 = 1.0;
      double var9 = 1.0;
      boolean var11 = a.isSprinting();
      var7 = var5 / 0.8 * var1 * 1.25;
      var9 = var5 / 0.8 * var3 * 1.25;
      double var12 = a.posX + var7 - Minecraft.getMinecraft().thePlayer.posX;
      double var14 = a.posZ + var9 - Minecraft.getMinecraft().thePlayer.posZ;
      double var16 = Minecraft.getMinecraft().thePlayer.posY + (double)Minecraft.getMinecraft().thePlayer.getEyeHeight() - (a.posY + (double)a.getEyeHeight());
      double var18 = (double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a);
      float var20 = (float)Math.toDegrees(Math.atan2(var14, var12)) - 90.0F;
      float var21 = (float)Math.toDegrees(Math.atan2(var16, var18));
      return new float[]{var20, var21};
   }

   public static float[] Method1166(double a, double a, double a) {
      double var6 = a - Minecraft.getMinecraft().thePlayer.posX;
      double var8 = a - Minecraft.getMinecraft().thePlayer.posZ;
      double var10 = a - Minecraft.getMinecraft().thePlayer.posY - 0.6;
      double var12 = (double)MathHelper.sqrt_double(var6 * var6 + var8 * var8);
      float var14 = (float)(Math.atan2(var8, var6) * 180.0 / Math.PI) - 90.0F;
      float var15 = (float)(-(Math.atan2(var10, var12) * 180.0 / Math.PI));
      return new float[]{var14, var15};
   }

   public static float Method1167(float a, float a, float a) {
      float var3 = 0.006F;
      float var4 = a * a * a * a - var3 * (var3 * a * a + 2.0F * a * a * a);
      return (float)Math.toDegrees(Math.atan(((double)(a * a) - Math.sqrt((double)var4)) / (double)(var3 * a)));
   }

   public static float Method1168(double a, double a) {
      RenderUtils.trash();
      double var5 = a - Minecraft.getMinecraft().thePlayer.posX;
      double var7 = a - Minecraft.getMinecraft().thePlayer.posZ;
      double var9;
      if (var7 < 0.0 && var5 < 0.0) {
         var9 = 90.0 + Math.toDegrees(Math.atan(var7 / var5));
      }

      if (var7 < 0.0 && var5 > 0.0) {
         var9 = -90.0 + Math.toDegrees(Math.atan(var7 / var5));
      }

      var9 = Math.toDegrees(-Math.atan(var5 / var7));
      return MathHelper.wrapAngleTo180_float(-(Minecraft.getMinecraft().thePlayer.rotationYaw - (float)var9));
   }

   public static float Method1169(Entity a, double a) {
      double var3 = a.posX - Minecraft.getMinecraft().thePlayer.posX;
      double var5 = a.posZ - Minecraft.getMinecraft().thePlayer.posZ;
      double var7 = a - 2.2 + (double)a.getEyeHeight() - Minecraft.getMinecraft().thePlayer.posY;
      double var9 = (double)MathHelper.sqrt_double(var3 * var3 + var5 * var5);
      double var11 = -Math.toDegrees(Math.atan(var7 / var9));
      return -MathHelper.wrapAngleTo180_float(Minecraft.getMinecraft().thePlayer.rotationPitch - (float)var11) - 2.5F;
   }

   public static float Method1170(float a) {
      a %= 360.0F;
      if (a >= 180.0F) {
         a -= 360.0F;
      }

      if (a < -180.0F) {
         a += 360.0F;
      }

      return a;
   }

   public static float Method1171(float a, float a) {
      float var2 = Math.abs(a - a) % 360.0F;
      if (var2 > 180.0F) {
         var2 = 360.0F - var2;
      }

      return var2;
   }

   public static Vec3 Method1172() {
      EntityPlayerSP var0 = Minecraft.getMinecraft().thePlayer;
      float var1 = 0.017453292F;
      float var2 = 3.1415927F;
      float var3 = MathHelper.cos(-var0.rotationYaw * var1 - var2);
      float var4 = MathHelper.sin(-var0.rotationYaw * var1 - var2);
      float var5 = -MathHelper.cos(-var0.rotationPitch * var1);
      float var6 = MathHelper.sin(-var0.rotationPitch * var1);
      return new Vec3((double)(var4 * var5), (double)var6, (double)(var3 * var5));
   }

   public static float[] Method1173(double a, double a, double a) {
      EntityPlayerSP var6 = Minecraft.getMinecraft().thePlayer;
      double var7 = a - var6.posX;
      double var9 = a - (var6.posY + (double)var6.getEyeHeight());
      double var11 = a - var6.posZ;
      double var13 = (double)MathHelper.sqrt_double(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{var15, var16};
   }

   public static float[] Method1174(EntityLivingBase a) {
      return Method1175() ? Method1173(a.posX + MathUtils.getRandomDouble3(0.03, -0.03), a.posY + (double)a.getEyeHeight() - 0.4 + MathUtils.getRandomDouble3(0.07, -0.07), a.posZ + MathUtils.getRandomDouble3(0.03, -0.03)) : Method1173(a.posX, a.posY + (double)a.getEyeHeight() - 0.4, a.posZ);
   }

   public static final boolean Method1175() {
      return Minecraft.getMinecraft().thePlayer.moveForward != 0.0F || Minecraft.getMinecraft().thePlayer.moveStrafing != 0.0F;
   }

   public static boolean Method1176(BlockPos a, BlockPos a) {
      RenderUtils.trash();
      int var3 = a.getX();
      int var4 = a.getY();
      int var5 = a.getZ();
      int var6 = a.getX();
      int var7 = a.getY();
      int var8 = a.getZ();
      double var9 = (double)(var6 - var3);
      double var11 = (double)(var7 - var4);
      double var13 = (double)(var8 - var5);
      double var15 = (double)var3;
      double var17 = (double)var4;
      double var19 = (double)var5;
      double var21 = 0.1;
      int var23 = (int)Math.max(Math.abs(var9), Math.max(Math.abs(var11), Math.abs(var13))) * 4;
      int var24 = 0;
      if (var24 < var23 - 1) {
         var15 += var9 / (double)var23;
         var17 += var11 / (double)var23;
         var19 += var13 / (double)var23;
         if (var15 != (double)var6 || var17 != (double)var7 || var19 != (double)var8) {
            BlockPos var25 = new BlockPos(var15, var17, var19);
            Block var26 = Minecraft.getMinecraft().theWorld.getBlockState(var25).getBlock();
            if (var26.getMaterial() != Material.air && var26.getMaterial() != Material.water && !(var26 instanceof BlockVine) && !(var26 instanceof BlockLadder)) {
               return true;
            }
         }

         ++var24;
      }

      return false;
   }

   public static float[] getRotation(EntityLivingBase a) {
      return null;
   }
}
