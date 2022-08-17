package trash.foodbyte.utils;

import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import obfuscate.a;
import org.lwjgl.util.vector.Vector3f;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.ReflectionUtils2;
import trash.foodbyte.reflections.Wrapper;

public class PlayerUtils {
   private static final Minecraft mc = Minecraft.getMinecraft();

   public static float[] getRotationToEntity(Entity target) {
      double var1 = target.posX;
      double var3 = target.posZ;
      double var5 = target.posY + (double)(target.getEyeHeight() / 4.0F);
      return getRotation(var1, var3, var5);
   }

   private static float[] getRotation(double x, double y, double z) {
      double var6 = x - Minecraft.getMinecraft().thePlayer.posX;
      double var8 = y - Minecraft.getMinecraft().thePlayer.posZ;
      double var10 = z - Minecraft.getMinecraft().thePlayer.posY - 0.6;
      double var12 = (double)MathHelper.sqrt_double(var6 * var6 + var8 * var8);
      float var14 = (float)(Math.atan2(var8, var6) * 180.0 / Math.PI) - 90.0F;
      float var15 = (float)(-(Math.atan2(var10, var12) * 180.0 / Math.PI));
      return new float[]{var14, var15};
   }

   public static double getDefaultSpeed() {
      double var0 = 0.2873;
      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var2 = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         var0 *= 1.0 + 0.2 * (double)(var2 + 1);
      }

      return var0;
   }

   public static float getMovingDirection() {
      float var0 = Minecraft.getMinecraft().thePlayer.rotationYawHead;
      float var1 = Minecraft.getMinecraft().thePlayer.moveForward;
      float var2 = Minecraft.getMinecraft().thePlayer.moveStrafing;
      var0 += (float)(var1 < 0.0F ? 180 : 0);
      if (var2 < 0.0F) {
         var0 += (float)(var1 < 0.0F ? -45 : (var1 == 0.0F ? 90 : 45));
      }

      if (var2 > 0.0F) {
         var0 -= (float)(var1 < 0.0F ? -45 : (var1 == 0.0F ? 90 : 45));
      }

      return var0 * 0.017453292F;
   }

   public static boolean isInWater() {
      return mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ)).getBlock().getMaterial() == Material.water;
   }

   public static void setSpeed(double a) {
      float var2 = mc.thePlayer.rotationYaw * 0.017453292F;
      EntityPlayerSP var3 = mc.thePlayer;
      var3.motionX -= (double)MathHelper.sin(var2) * a;
      EntityPlayerSP var4 = mc.thePlayer;
      var4.motionZ += (double)MathHelper.cos(var2) * a;
   }

   public static double getSpeed() {
      return Math.sqrt(Minecraft.getMinecraft().thePlayer.motionX * Minecraft.getMinecraft().thePlayer.motionX + Minecraft.getMinecraft().thePlayer.motionZ * Minecraft.getMinecraft().thePlayer.motionZ);
   }

   public static Block getBlockUnderEntity(EntityPlayer a) {
      return getBlock(new BlockPos(a.posX, a.posY - 1.0, a.posZ));
   }

   public static Block getBlock(BlockPos a) {
      return Minecraft.getMinecraft().theWorld.getBlockState(a).getBlock();
   }

   public static Block getBlock(double a, double a, double a) {
      return mc.theWorld.getBlockState(new BlockPos(a, a, a)).getBlock();
   }

   public static Block getBlock(EntityPlayer a, double a, double a, double a) {
      return getBlock(new BlockPos(a.posX - a, a.posY - a, a.posZ - a));
   }

   public static double getBPS() {
      return mc.thePlayer != null && mc.thePlayer.ticksExisted >= 1 ? mc.thePlayer.getDistance(mc.thePlayer.lastTickPosX, mc.thePlayer.lastTickPosY, mc.thePlayer.lastTickPosZ) * (double)(ReflectionUtils.getTicksPerSecond() * ReflectionUtils.getTimerSpeed()) : 0.0;
   }

   public static double getBPS2() {
      double var0 = Math.hypot(mc.thePlayer.posX - mc.thePlayer.prevPosX, mc.thePlayer.posZ - mc.thePlayer.prevPosZ) * (double)ReflectionUtils.getTimerSpeed() * 20.0;
      return (double)Math.round(var0 * 100.0) / 100.0;
   }

   public static ArrayList Method1584(double a, double a, double a, double a) {
      ArrayList var11 = new ArrayList();
      Minecraft var12 = Minecraft.getMinecraft();
      MoveUtils.trash();
      double var13 = a - var12.thePlayer.posX;
      double var15 = a - (var12.thePlayer.posY + (double)var12.thePlayer.getEyeHeight() + 1.1);
      double var17 = a - var12.thePlayer.posZ;
      float var19 = (float)(Math.atan2(var17, var13) * 180.0 / Math.PI - 90.0);
      float var20 = (float)(-Math.atan2(var15, Math.sqrt(var13 * var13 + var17 * var17)) * 180.0 / Math.PI);
      double var21 = var12.thePlayer.posX;
      double var23 = var12.thePlayer.posY;
      double var25 = var12.thePlayer.posZ;
      double var27 = 1.0;
      double var9;
      if (a < Method1586(var12.thePlayer.posX, var12.thePlayer.posY, var12.thePlayer.posZ, a, a, a)) {
         ++var27;
         var9 = a + a;
         a.trash(new String[5]);
      }

      if (a < Method1586(var12.thePlayer.posX, var12.thePlayer.posY, var12.thePlayer.posZ, a, a, a)) {
         var21 = var12.thePlayer.posX - Math.sin((double)getMovingDirection(var19)) * a;
         var25 = var12.thePlayer.posZ + Math.cos((double)getMovingDirection(var19)) * a;
         var11.Method2530(new Vector3f((float)var21, (float)(var23 - (var12.thePlayer.posY - a) / var27), (float)var25));
         var9 = a + a;
      }

      var11.Method2530(new Vector3f((float)a, (float)a, (float)a));
      return var11;
   }

   public static float getMovingDirection(float a) {
      if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0F) {
         a += 180.0F;
      }

      float var1 = 1.0F;
      if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0F) {
         var1 = -0.5F;
      } else if (Minecraft.getMinecraft().thePlayer.moveForward > 0.0F) {
         var1 = 0.5F;
      }

      if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0.0F) {
         a -= 90.0F * var1;
      }

      if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0.0F) {
         a += 90.0F * var1;
      }

      return a *= 0.017453292F;
   }

   public static double Method1586(double a, double a, double a, double a, double a, double a) {
      double var12 = a - a;
      double var14 = a - a;
      double var16 = a - a;
      return (double)MathHelper.sqrt_double(var12 * var12 + var14 * var14 + var16 * var16);
   }

   public static boolean Method1587() {
      return mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown();
   }

   public static void rightClickEntity(Entity a, boolean a, boolean a) {
      Minecraft var3 = Minecraft.getMinecraft();
      ItemStack var4 = var3.thePlayer.getCurrentEquippedItem();
      if (var3.thePlayer.getCurrentEquippedItem() != null && var4.getItem() instanceof ItemSword && (double)var3.thePlayer.swingProgress > 0.2) {
         ReflectionUtils2.pollMouseInputEvent(1, true);
         var3.thePlayer.getCurrentEquippedItem().useItemRightClick(var3.theWorld, var3.thePlayer);
         ReflectionUtils2.pollMouseInputEvent(1, false);
      }

      if (var3.thePlayer.getCurrentEquippedItem() != null && var4.getItem() instanceof ItemSword && (double)var3.thePlayer.swingProgress > 0.2) {
         ReflectionUtils2.pollMouseInputEvent(1, true);
         var3.thePlayer.getCurrentEquippedItem().useItemRightClick(var3.theWorld, var3.thePlayer);
         Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(new BlockPos(-1, -1, -1), 255, var3.thePlayer.inventory.getCurrentItem(), 0.0F, 0.0F, 0.0F));
         ReflectionUtils2.pollMouseInputEvent(1, false);
      }

   }

   public static void Method1589(Entity a, boolean a) {
      ItemStack var2 = mc.thePlayer.getCurrentEquippedItem();
      if (mc.thePlayer.getCurrentEquippedItem() != null && var2.getItem() instanceof ItemSword && (double)mc.thePlayer.swingProgress > 0.2) {
         mc.thePlayer.getCurrentEquippedItem().useItemRightClick(mc.theWorld, mc.thePlayer);
      }

   }

   public static float Method1590(ItemStack a) {
      Multimap var2 = a.getAttributeModifiers();
      Iterator var1;
      if (!var2.isEmpty() && (var1 = var2.entries().Method1383()).Method932()) {
         Map.Entry var5 = (Map.Entry)var1.Method933();
         AttributeModifier var6 = (AttributeModifier)var5.getValue();
         double var3 = var6.getOperation() != 1 && var6.getOperation() != 2 ? var6.getAmount() : var6.getAmount() * 100.0;
         return var6.getAmount() > 1.0 ? (float)var3 : 1.0F;
      } else {
         return 1.0F;
      }
   }

   public static boolean isVaildItem() {
      ItemStack var0 = mc.thePlayer.getCurrentEquippedItem();
      float var1 = Method1590(var0);
      var1 += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, var0) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, var0) * 0.25F;
      return (double)var1 > 3.0 || var0.getDisplayName().toLowerCase().contains("death's scythe");
   }

   public static int Method1592(Entity a) {
      Minecraft var1 = Minecraft.getMinecraft();
      var1.thePlayer.inventory.currentItem = 0;
      byte var2 = 0;
      byte var3 = -1;
      boolean var4 = true;

      for(byte var5 = 0; var5 < 9; ++var5) {
         var1.thePlayer.inventory.currentItem = var5;
         ItemStack var6 = var1.thePlayer.getHeldItem();
      }

      return var3 != -1 ? var3 : var2;
   }

   public static void Method1593(Item a) {
      for(int var1 = 9; var1 < 37; ++var1) {
         ItemStack var2 = mc.thePlayer.inventoryContainer.getSlot(var1).getStack();
         if (var2.getItem() == a) {
            mc.playerController.windowClick(0, var1, 0, 1, mc.thePlayer);
            break;
         }
      }

   }

   public static boolean Method1594() {
      for(int var0 = 0; var0 <= 36; ++var0) {
         ItemStack var1 = mc.thePlayer.inventory.getStackInSlot(var0);
      }

      return true;
   }

   public static Vec3 Method1595(float a, float a) {
      float var2 = MathHelper.cos(-a * 0.017453292F - 3.1415927F);
      float var3 = MathHelper.sin(-a * 0.017453292F - 3.1415927F);
      float var4 = -MathHelper.cos(-a * 0.017453292F);
      float var5 = MathHelper.sin(-a * 0.017453292F);
      return new Vec3((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   public static void addChatMessage(String msg) {
      mc.thePlayer.addChatMessage(new ChatComponentText(msg));
   }

   public EntityLivingBase iJustWannaReturnANull() {
      return null;
   }

   public static void setSpeed2(double speed) {
      mc.thePlayer.motionX = -Math.sin((double)getMovingDirection()) * speed;
      mc.thePlayer.motionZ = Math.cos((double)getMovingDirection()) * speed;
   }

   public static double Method1599(double a, double a) {
      double var4 = 1.0 / a;
      return (double)Math.round(a * var4) / var4;
   }

   public static boolean isMovingKeyboard() {
      if (mc.gameSettings.keyBindForward.isKeyDown()) {
         return true;
      } else if (mc.gameSettings.keyBindBack.isKeyDown()) {
         return true;
      } else if (mc.gameSettings.keyBindLeft.isKeyDown()) {
         return true;
      } else if (mc.gameSettings.keyBindRight.isKeyDown()) {
         return true;
      } else if (mc.thePlayer.movementInput.moveForward != 0.0F) {
         return true;
      } else {
         return mc.thePlayer.movementInput.moveStrafe != 0.0F;
      }
   }

   public static boolean isMoving() {
      return mc.thePlayer.moveForward != 0.0F || mc.thePlayer.moveStrafing != 0.0F;
   }

   public static boolean iJustWannaReturnAFalse() {
      AxisAlignedBB var0 = mc.thePlayer.getEntityBoundingBox();
      return false;
   }

   public static double Method1603(double a, int a) {
      return a;
   }

   public static BlockPos Method1604(String a) {
      int var1 = 92;
      if (a.length() > 1) {
         char[] var2 = a.toCharArray();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            var1 += var2[var4] * a.length() * a.length() + a.charAt(0) + a.charAt(1);
         }

         var1 /= a.length();
      }

      return new BlockPos(var1, -var1 % 255, var1);
   }

   public static BlockPos Method1605(String a) {
      int var1 = 20;
      if (a.length() > 1) {
         char[] var2 = a.toCharArray();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            var1 += var2[var4] * a.length() / a.length() - a.charAt(Method1606(1.0, 4.0));
         }

         var1 /= a.length();
      }

      return new BlockPos(var1, -var1 % 255, var1);
   }

   public static int Method1606(double a, double a) {
      Random var4 = new Random();
      return (int)(a + var4.nextDouble() * (a - a));
   }

   public static void Method1607(double[] a, BlockPos a) {
      MoveUtils.trash();
      double var3 = a[0] - (double)a.getX() + 0.5;
      double var5 = a[1] - (double)a.getY();
      double var7 = a[2] - (double)a.getZ() + 0.5;
      double var9 = Math.sqrt(mc.thePlayer.getDistanceSq(a));
      double var11 = 5.0;
      double var17 = 0.0;
      if (var9 > var11) {
         double var19 = (double)(Math.round(var9 / var11 + 0.49999999999) - 1L);
         double var13 = mc.thePlayer.posX;
         double var15 = mc.thePlayer.posY;
         var17 = mc.thePlayer.posZ;
         double var21 = 0.0;
         int var23 = 1;
         if ((double)var23 < var19) {
            double var24 = ((double)a.getX() - mc.thePlayer.posX) / var19;
            var13 += var24;
            double var26 = ((double)a.getZ() - mc.thePlayer.posZ) / var19;
            var17 += var26;
            double var28 = ((double)a.getY() - mc.thePlayer.posY) / var19;
            var15 += var28;
            ++var21;
            C03PacketPlayer.C04PacketPlayerPosition var30 = new C03PacketPlayer.C04PacketPlayerPosition(var13, var15, var17, true);
            Wrapper.INSTANCE.sendPacket(var30);
            ++var23;
         }

         mc.thePlayer.setPosition((double)a.getX() + 0.5, (double)a.getY(), (double)a.getZ() + 0.5);
      }

      mc.thePlayer.setPosition((double)a.getX(), (double)a.getY(), (double)a.getZ());
      if (a.trash() == null) {
         MoveUtils.trash(new String[4]);
      }

   }

   public static boolean getDistanceToFall() {
      if (mc.thePlayer == null) {
         return false;
      } else {
         AxisAlignedBB var0 = mc.thePlayer.getEntityBoundingBox();

         for(int var1 = MathHelper.floor_double(var0.minX); var1 < MathHelper.floor_double(var0.maxX) + 1; ++var1) {
            for(int var2 = MathHelper.floor_double(var0.minZ); var2 < MathHelper.floor_double(var0.maxZ) + 1; ++var2) {
               BlockPos var3 = new BlockPos(var1, (int)var0.minY, var2);
               Block var4 = mc.theWorld.getBlockState(var3).getBlock();
               if (!(var4 instanceof BlockAir)) {
                  return var4 instanceof BlockLiquid;
               }
            }
         }

         return false;
      }
   }

   public static double getDefaultSpeed(double offset) {
      double var2 = getNoEffectSpeed();
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var4 = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (mc.thePlayer.isPotionActive(Potion.moveSlowdown) ? mc.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
         var2 *= 1.0 + offset * (double)var4;
      }

      return var2;
   }

   public static double getDefaultSpeed2() {
      double var0 = getNoEffectSpeed();
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int var2 = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (mc.thePlayer.isPotionActive(Potion.moveSlowdown) ? mc.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
         var0 *= 1.0 + 0.2 * (double)var2;
      }

      return var0;
   }

   public static double getNoEffectSpeed() {
      return mc.thePlayer.isSprinting() ? 0.28700000047683716 : 0.22300000488758087;
   }
}
