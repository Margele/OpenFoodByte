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
      double a = a.posX;
      double a = a.posZ;
      double a = a.posY + (double)(a.getEyeHeight() / 2.0F);
      return Method1166(a, a, a);
   }

   public static float[] Method1164(Entity a) {
      return null;
   }

   public static float[] Method1165(Entity a) {
      double a = a.posX - a.lastTickPosX;
      double a = a.posZ - a.lastTickPosZ;
      double a = (double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a);
      a -= a % 0.8;
      double a = 1.0;
      double a = 1.0;
      boolean a = a.isSprinting();
      a = a / 0.8 * a * 1.25;
      a = a / 0.8 * a * 1.25;
      double a = a.posX + a - Minecraft.getMinecraft().thePlayer.posX;
      double a = a.posZ + a - Minecraft.getMinecraft().thePlayer.posZ;
      double a = Minecraft.getMinecraft().thePlayer.posY + (double)Minecraft.getMinecraft().thePlayer.getEyeHeight() - (a.posY + (double)a.getEyeHeight());
      double a = (double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a);
      float a = (float)Math.toDegrees(Math.atan2(a, a)) - 90.0F;
      float a = (float)Math.toDegrees(Math.atan2(a, a));
      return new float[]{a, a};
   }

   public static float[] Method1166(double a, double a, double a) {
      double a = a - Minecraft.getMinecraft().thePlayer.posX;
      double a = a - Minecraft.getMinecraft().thePlayer.posZ;
      double a = a - Minecraft.getMinecraft().thePlayer.posY - 0.6;
      double a = (double)MathHelper.sqrt_double(a * a + a * a);
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI) - 90.0F;
      float a = (float)(-(Math.atan2(a, a) * 180.0 / Math.PI));
      return new float[]{a, a};
   }

   public static float Method1167(float a, float a, float a) {
      float a = 0.006F;
      float a = a * a * a * a - a * (a * a * a + 2.0F * a * a * a);
      return (float)Math.toDegrees(Math.atan(((double)(a * a) - Math.sqrt((double)a)) / (double)(a * a)));
   }

   public static float Method1168(double a, double a) {
      RenderUtils.trash();
      double a = a - Minecraft.getMinecraft().thePlayer.posX;
      double a = a - Minecraft.getMinecraft().thePlayer.posZ;
      double a;
      if (a < 0.0 && a < 0.0) {
         a = 90.0 + Math.toDegrees(Math.atan(a / a));
      }

      if (a < 0.0 && a > 0.0) {
         a = -90.0 + Math.toDegrees(Math.atan(a / a));
      }

      a = Math.toDegrees(-Math.atan(a / a));
      return MathHelper.wrapAngleTo180_float(-(Minecraft.getMinecraft().thePlayer.rotationYaw - (float)a));
   }

   public static float Method1169(Entity a, double a) {
      double a = a.posX - Minecraft.getMinecraft().thePlayer.posX;
      double a = a.posZ - Minecraft.getMinecraft().thePlayer.posZ;
      double a = a - 2.2 + (double)a.getEyeHeight() - Minecraft.getMinecraft().thePlayer.posY;
      double a = (double)MathHelper.sqrt_double(a * a + a * a);
      double a = -Math.toDegrees(Math.atan(a / a));
      return -MathHelper.wrapAngleTo180_float(Minecraft.getMinecraft().thePlayer.rotationPitch - (float)a) - 2.5F;
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
      float a = Math.abs(a - a) % 360.0F;
      if (a > 180.0F) {
         a = 360.0F - a;
      }

      return a;
   }

   public static Vec3 Method1172() {
      EntityPlayerSP a = Minecraft.getMinecraft().thePlayer;
      float a = 0.017453292F;
      float a = 3.1415927F;
      float a = MathHelper.cos(-a.rotationYaw * a - a);
      float a = MathHelper.sin(-a.rotationYaw * a - a);
      float a = -MathHelper.cos(-a.rotationPitch * a);
      float a = MathHelper.sin(-a.rotationPitch * a);
      return new Vec3((double)(a * a), (double)a, (double)(a * a));
   }

   public static float[] Method1173(double a, double a, double a) {
      EntityPlayerSP a = Minecraft.getMinecraft().thePlayer;
      double a = a - a.posX;
      double a = a - (a.posY + (double)a.getEyeHeight());
      double a = a - a.posZ;
      double a = (double)MathHelper.sqrt_double(a * a + a * a);
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI) - 90.0F;
      float a = (float)(-(Math.atan2(a, a) * 180.0 / Math.PI));
      return new float[]{a, a};
   }

   public static float[] Method1174(EntityLivingBase a) {
      return Method1175() ? Method1173(a.posX + MathUtils.getRandomDouble3(0.03, -0.03), a.posY + (double)a.getEyeHeight() - 0.4 + MathUtils.getRandomDouble3(0.07, -0.07), a.posZ + MathUtils.getRandomDouble3(0.03, -0.03)) : Method1173(a.posX, a.posY + (double)a.getEyeHeight() - 0.4, a.posZ);
   }

   public static final boolean Method1175() {
      return Minecraft.getMinecraft().thePlayer.moveForward != 0.0F || Minecraft.getMinecraft().thePlayer.moveStrafing != 0.0F;
   }

   public static boolean Method1176(BlockPos a, BlockPos a) {
      RenderUtils.trash();
      int a = a.getX();
      int a = a.getY();
      int a = a.getZ();
      int a = a.getX();
      int a = a.getY();
      int a = a.getZ();
      double a = (double)(a - a);
      double a = (double)(a - a);
      double a = (double)(a - a);
      double a = (double)a;
      double a = (double)a;
      double a = (double)a;
      double a = 0.1;
      int a = (int)Math.max(Math.abs(a), Math.max(Math.abs(a), Math.abs(a))) * 4;
      int a = 0;
      if (a < a - 1) {
         a += a / (double)a;
         a += a / (double)a;
         a += a / (double)a;
         if (a != (double)a || a != (double)a || a != (double)a) {
            BlockPos a = new BlockPos(a, a, a);
            Block a = Minecraft.getMinecraft().theWorld.getBlockState(a).getBlock();
            if (a.getMaterial() != Material.air && a.getMaterial() != Material.water && !(a instanceof BlockVine) && !(a instanceof BlockLadder)) {
               return true;
            }
         }

         ++a;
      }

      return false;
   }

   public static float[] getRotation(EntityLivingBase a) {
      return null;
   }
}
