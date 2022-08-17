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
      double a = target.posX;
      double a = target.posZ;
      double a = target.posY + (double)(target.getEyeHeight() / 4.0F);
      return getRotation(a, a, a);
   }

   private static float[] getRotation(double x, double y, double z) {
      double a = x - Minecraft.getMinecraft().thePlayer.posX;
      double a = y - Minecraft.getMinecraft().thePlayer.posZ;
      double a = z - Minecraft.getMinecraft().thePlayer.posY - 0.6;
      double a = (double)MathHelper.sqrt_double(a * a + a * a);
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI) - 90.0F;
      float a = (float)(-(Math.atan2(a, a) * 180.0 / Math.PI));
      return new float[]{a, a};
   }

   public static double getDefaultSpeed() {
      double a = 0.2873;
      if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
         int a = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
         a *= 1.0 + 0.2 * (double)(a + 1);
      }

      return a;
   }

   public static float getMovingDirection() {
      float a = Minecraft.getMinecraft().thePlayer.rotationYawHead;
      float a = Minecraft.getMinecraft().thePlayer.moveForward;
      float a = Minecraft.getMinecraft().thePlayer.moveStrafing;
      a += (float)(a < 0.0F ? 180 : 0);
      if (a < 0.0F) {
         a += (float)(a < 0.0F ? -45 : (a == 0.0F ? 90 : 45));
      }

      if (a > 0.0F) {
         a -= (float)(a < 0.0F ? -45 : (a == 0.0F ? 90 : 45));
      }

      return a * 0.017453292F;
   }

   public static boolean isInWater() {
      return mc.theWorld.getBlockState(new BlockPos(mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ)).getBlock().getMaterial() == Material.water;
   }

   public static void setSpeed(double a) {
      float a = mc.thePlayer.rotationYaw * 0.017453292F;
      EntityPlayerSP a = mc.thePlayer;
      a.motionX -= (double)MathHelper.sin(a) * a;
      EntityPlayerSP a = mc.thePlayer;
      a.motionZ += (double)MathHelper.cos(a) * a;
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
      double a = Math.hypot(mc.thePlayer.posX - mc.thePlayer.prevPosX, mc.thePlayer.posZ - mc.thePlayer.prevPosZ) * (double)ReflectionUtils.getTimerSpeed() * 20.0;
      return (double)Math.round(a * 100.0) / 100.0;
   }

   public static ArrayList Method1584(double a, double a, double a, double a) {
      ArrayList a = new ArrayList();
      Minecraft a = Minecraft.getMinecraft();
      MoveUtils.trash();
      double a = a - a.thePlayer.posX;
      double a = a - (a.thePlayer.posY + (double)a.thePlayer.getEyeHeight() + 1.1);
      double a = a - a.thePlayer.posZ;
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI - 90.0);
      float a = (float)(-Math.atan2(a, Math.sqrt(a * a + a * a)) * 180.0 / Math.PI);
      double a = a.thePlayer.posX;
      double a = a.thePlayer.posY;
      double a = a.thePlayer.posZ;
      double a = 1.0;
      double a;
      if (a < Method1586(a.thePlayer.posX, a.thePlayer.posY, a.thePlayer.posZ, a, a, a)) {
         ++a;
         a = a + a;
         a.trash(new String[5]);
      }

      if (a < Method1586(a.thePlayer.posX, a.thePlayer.posY, a.thePlayer.posZ, a, a, a)) {
         a = a.thePlayer.posX - Math.sin((double)getMovingDirection(a)) * a;
         a = a.thePlayer.posZ + Math.cos((double)getMovingDirection(a)) * a;
         a.Method2530(new Vector3f((float)a, (float)(a - (a.thePlayer.posY - a) / a), (float)a));
         a = a + a;
      }

      a.Method2530(new Vector3f((float)a, (float)a, (float)a));
      return a;
   }

   public static float getMovingDirection(float a) {
      if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0F) {
         a += 180.0F;
      }

      float a = 1.0F;
      if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0F) {
         a = -0.5F;
      } else if (Minecraft.getMinecraft().thePlayer.moveForward > 0.0F) {
         a = 0.5F;
      }

      if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0.0F) {
         a -= 90.0F * a;
      }

      if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0.0F) {
         a += 90.0F * a;
      }

      return a *= 0.017453292F;
   }

   public static double Method1586(double a, double a, double a, double a, double a, double a) {
      double a = a - a;
      double a = a - a;
      double a = a - a;
      return (double)MathHelper.sqrt_double(a * a + a * a + a * a);
   }

   public static boolean Method1587() {
      return mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown();
   }

   public static void rightClickEntity(Entity a, boolean a1, boolean a2) {
      Minecraft a = Minecraft.getMinecraft();
      ItemStack a = a.thePlayer.getCurrentEquippedItem();
      if (a.thePlayer.getCurrentEquippedItem() != null && a.getItem() instanceof ItemSword && (double)a.thePlayer.swingProgress > 0.2) {
         ReflectionUtils2.pollMouseInputEvent(1, true);
         a.thePlayer.getCurrentEquippedItem().useItemRightClick(a.theWorld, a.thePlayer);
         ReflectionUtils2.pollMouseInputEvent(1, false);
      }

      if (a.thePlayer.getCurrentEquippedItem() != null && a.getItem() instanceof ItemSword && (double)a.thePlayer.swingProgress > 0.2) {
         ReflectionUtils2.pollMouseInputEvent(1, true);
         a.thePlayer.getCurrentEquippedItem().useItemRightClick(a.theWorld, a.thePlayer);
         Wrapper.INSTANCE.sendPacket(new C08PacketPlayerBlockPlacement(new BlockPos(-1, -1, -1), 255, a.thePlayer.inventory.getCurrentItem(), 0.0F, 0.0F, 0.0F));
         ReflectionUtils2.pollMouseInputEvent(1, false);
      }

   }

   public static void Method1589(Entity a, boolean a1) {
      ItemStack a = mc.thePlayer.getCurrentEquippedItem();
      if (mc.thePlayer.getCurrentEquippedItem() != null && a.getItem() instanceof ItemSword && (double)mc.thePlayer.swingProgress > 0.2) {
         mc.thePlayer.getCurrentEquippedItem().useItemRightClick(mc.theWorld, mc.thePlayer);
      }

   }

   public static float Method1590(ItemStack a) {
      Multimap a = a.getAttributeModifiers();
      Iterator a;
      if (!a.isEmpty() && (a = a.entries().Method1383()).Method932()) {
         Map.Entry a = (Map.Entry)a.Method933();
         AttributeModifier a = (AttributeModifier)a.getValue();
         double a = a.getOperation() != 1 && a.getOperation() != 2 ? a.getAmount() : a.getAmount() * 100.0;
         return a.getAmount() > 1.0 ? (float)a : 1.0F;
      } else {
         return 1.0F;
      }
   }

   public static boolean isVaildItem() {
      ItemStack a = mc.thePlayer.getCurrentEquippedItem();
      float a = Method1590(a);
      a += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a) * 0.25F;
      return (double)a > 3.0 || a.getDisplayName().toLowerCase().contains("death's scythe");
   }

   public static int Method1592(Entity a) {
      Minecraft a = Minecraft.getMinecraft();
      a.thePlayer.inventory.currentItem = 0;
      int a = 0;
      int a = -1;
      int a = true;

      for(int a = 0; a < 9; ++a) {
         a.thePlayer.inventory.currentItem = a;
         ItemStack a = a.thePlayer.getHeldItem();
      }

      return a != -1 ? a : a;
   }

   public static void Method1593(Item a) {
      for(int a = 9; a < 37; ++a) {
         ItemStack a = mc.thePlayer.inventoryContainer.getSlot(a).getStack();
         if (a.getItem() == a) {
            mc.playerController.windowClick(0, a, 0, 1, mc.thePlayer);
            break;
         }
      }

   }

   public static boolean Method1594() {
      for(int a = 0; a <= 36; ++a) {
         ItemStack a = mc.thePlayer.inventory.getStackInSlot(a);
      }

      return true;
   }

   public static Vec3 Method1595(float a, float a) {
      float a = MathHelper.cos(-a * 0.017453292F - 3.1415927F);
      float a = MathHelper.sin(-a * 0.017453292F - 3.1415927F);
      float a = -MathHelper.cos(-a * 0.017453292F);
      float a = MathHelper.sin(-a * 0.017453292F);
      return new Vec3((double)(a * a), (double)a, (double)(a * a));
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
      double a = 1.0 / a;
      return (double)Math.round(a * a) / a;
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
      AxisAlignedBB a = mc.thePlayer.getEntityBoundingBox();
      return false;
   }

   public static double Method1603(double a, int a1) {
      return a;
   }

   public static BlockPos Method1604(String a) {
      int a = 92;
      if (a.length() > 1) {
         char[] a = a.toCharArray();
         int a = a.length;

         for(int a = 0; a < a; ++a) {
            a += a[a] * a.length() * a.length() + a.charAt(0) + a.charAt(1);
         }

         a /= a.length();
      }

      return new BlockPos(a, -a % 255, a);
   }

   public static BlockPos Method1605(String a) {
      int a = 20;
      if (a.length() > 1) {
         char[] a = a.toCharArray();
         int a = a.length;

         for(int a = 0; a < a; ++a) {
            a += a[a] * a.length() / a.length() - a.charAt(Method1606(1.0, 4.0));
         }

         a /= a.length();
      }

      return new BlockPos(a, -a % 255, a);
   }

   public static int Method1606(double a, double a) {
      Random a = new Random();
      return (int)(a + a.nextDouble() * (a - a));
   }

   public static void Method1607(double[] a, BlockPos a) {
      MoveUtils.trash();
      double a = a[0] - (double)a.getX() + 0.5;
      double a = a[1] - (double)a.getY();
      double a = a[2] - (double)a.getZ() + 0.5;
      double a = Math.sqrt(mc.thePlayer.getDistanceSq(a));
      double a = 5.0;
      double a = 0.0;
      if (a > a) {
         double a = (double)(Math.round(a / a + 0.49999999999) - 1L);
         double a = mc.thePlayer.posX;
         double a = mc.thePlayer.posY;
         a = mc.thePlayer.posZ;
         double a = 0.0;
         int a = 1;
         if ((double)a < a) {
            double a = ((double)a.getX() - mc.thePlayer.posX) / a;
            a += a;
            double a = ((double)a.getZ() - mc.thePlayer.posZ) / a;
            a += a;
            double a = ((double)a.getY() - mc.thePlayer.posY) / a;
            a += a;
            ++a;
            C03PacketPlayer.C04PacketPlayerPosition a = new C03PacketPlayer.C04PacketPlayerPosition(a, a, a, true);
            Wrapper.INSTANCE.sendPacket(a);
            ++a;
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
         AxisAlignedBB a = mc.thePlayer.getEntityBoundingBox();

         for(int a = MathHelper.floor_double(a.minX); a < MathHelper.floor_double(a.maxX) + 1; ++a) {
            for(int a = MathHelper.floor_double(a.minZ); a < MathHelper.floor_double(a.maxZ) + 1; ++a) {
               BlockPos a = new BlockPos(a, (int)a.minY, a);
               Block a = mc.theWorld.getBlockState(a).getBlock();
               if (!(a instanceof BlockAir)) {
                  return a instanceof BlockLiquid;
               }
            }
         }

         return false;
      }
   }

   public static double getDefaultSpeed(double offset) {
      double a = getNoEffectSpeed();
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int a = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (mc.thePlayer.isPotionActive(Potion.moveSlowdown) ? mc.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
         a *= 1.0 + offset * (double)a;
      }

      return a;
   }

   public static double getDefaultSpeed2() {
      double a = getNoEffectSpeed();
      if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
         int a = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (mc.thePlayer.isPotionActive(Potion.moveSlowdown) ? mc.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
         a *= 1.0 + 0.2 * (double)a;
      }

      return a;
   }

   public static double getNoEffectSpeed() {
      return mc.thePlayer.isSprinting() ? 0.28700000047683716 : 0.22300000488758087;
   }
}
