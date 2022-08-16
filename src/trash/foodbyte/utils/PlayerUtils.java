/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map$Entry
 *  java.util.Random
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.attributes.AttributeModifier
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition
 *  net.minecraft.network.play.client.C08PacketPlayerBlockPlacement
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 *  org.lwjgl.util.vector.Vector3f
 */
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
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import obfuscate.a;
import org.lwjgl.util.vector.Vector3f;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.ReflectionUtils2;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MoveUtils;

public class PlayerUtils {
    private static final Minecraft mc = Minecraft.getMinecraft();

    public static float[] getRotationToEntity(Entity target) {
        double a = target.posX;
        double a2 = target.posZ;
        double a3 = target.posY + (double)(target.getEyeHeight() / 4.0f);
        return PlayerUtils.getRotation(a, a2, a3);
    }

    private static float[] getRotation(double x, double y, double z) {
        double a = x - Minecraft.getMinecraft().thePlayer.posX;
        double a2 = y - Minecraft.getMinecraft().thePlayer.posZ;
        double a3 = z - Minecraft.getMinecraft().thePlayer.posY - 0.6;
        double a4 = MathHelper.sqrt_double((double)(a * a + a2 * a2));
        float a5 = (float)(Math.atan2((double)a2, (double)a) * 180.0 / Math.PI) - 90.0f;
        float a6 = (float)(-(Math.atan2((double)a3, (double)a4) * 180.0 / Math.PI));
        return new float[]{a5, a6};
    }

    public static double getDefaultSpeed() {
        double a = 0.2873;
        if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
        }
        return a;
    }

    public static float getMovingDirection() {
        float a = Minecraft.getMinecraft().thePlayer.rotationYawHead;
        float a2 = Minecraft.getMinecraft().thePlayer.moveForward;
        float a3 = Minecraft.getMinecraft().thePlayer.moveStrafing;
        a += (float)(a2 < 0.0f ? 180 : 0);
        if (a3 < 0.0f) {
            a += (float)(a2 < 0.0f ? -45 : (a2 == 0.0f ? 90 : 45));
        }
        if (a3 > 0.0f) {
            a -= (float)(a2 < 0.0f ? -45 : (a2 == 0.0f ? 90 : 45));
        }
        return a * ((float)Math.PI / 180);
    }

    public static boolean isInWater() {
        return PlayerUtils.mc.theWorld.getBlockState(new BlockPos(PlayerUtils.mc.thePlayer.posX, PlayerUtils.mc.thePlayer.posY, PlayerUtils.mc.thePlayer.posZ)).getBlock().getMaterial() == Material.water;
    }

    public static void setSpeed(double a) {
        float a2 = PlayerUtils.mc.thePlayer.rotationYaw * ((float)Math.PI / 180);
        EntityPlayerSP a3 = PlayerUtils.mc.thePlayer;
        a3.motionX -= (double)MathHelper.sin((float)a2) * a;
        EntityPlayerSP a4 = PlayerUtils.mc.thePlayer;
        a4.motionZ += (double)MathHelper.cos((float)a2) * a;
    }

    public static double getSpeed() {
        return Math.sqrt((double)(Minecraft.getMinecraft().thePlayer.motionX * Minecraft.getMinecraft().thePlayer.motionX + Minecraft.getMinecraft().thePlayer.motionZ * Minecraft.getMinecraft().thePlayer.motionZ));
    }

    public static Block getBlockUnderEntity(EntityPlayer a) {
        return PlayerUtils.getBlock(new BlockPos(a.posX, a.posY - 1.0, a.posZ));
    }

    public static Block getBlock(BlockPos a) {
        return Minecraft.getMinecraft().theWorld.getBlockState(a).getBlock();
    }

    public static Block getBlock(double a, double a2, double a3) {
        return PlayerUtils.mc.theWorld.getBlockState(new BlockPos(a, a2, a3)).getBlock();
    }

    public static Block getBlock(EntityPlayer a, double a2, double a3, double a4) {
        return PlayerUtils.getBlock(new BlockPos(a.posX - a2, a.posY - a3, a.posZ - a4));
    }

    public static double getBPS() {
        if (PlayerUtils.mc.thePlayer == null || PlayerUtils.mc.thePlayer.ticksExisted < 1) {
            return 0.0;
        }
        return PlayerUtils.mc.thePlayer.getDistance(PlayerUtils.mc.thePlayer.lastTickPosX, PlayerUtils.mc.thePlayer.lastTickPosY, PlayerUtils.mc.thePlayer.lastTickPosZ) * (double)(ReflectionUtils.getTicksPerSecond() * ReflectionUtils.getTimerSpeed());
    }

    public static double getBPS2() {
        double a2 = Math.hypot((double)(PlayerUtils.mc.thePlayer.posX - PlayerUtils.mc.thePlayer.prevPosX), (double)(PlayerUtils.mc.thePlayer.posZ - PlayerUtils.mc.thePlayer.prevPosZ)) * (double)ReflectionUtils.getTimerSpeed() * 20.0;
        return (double)Math.round((double)(a2 * 100.0)) / 100.0;
    }

    /*
     * WARNING - void declaration
     */
    public static ArrayList Method1584(double a2, double a3, double a4, double a5) {
        void a6;
        ArrayList a7 = new ArrayList();
        Minecraft minecraft = Minecraft.getMinecraft();
        double a8 = a2 - a6.thePlayer.posX;
        double a9 = a3 - (a6.thePlayer.posY + (double)a6.thePlayer.getEyeHeight() + 1.1);
        double a10 = a4 - a6.thePlayer.posZ;
        float a11 = (float)(Math.atan2((double)a10, (double)a8) * 180.0 / Math.PI - 90.0);
        float a12 = (float)(-Math.atan2((double)a9, (double)Math.sqrt((double)(a8 * a8 + a10 * a10))) * 180.0 / Math.PI);
        double d = a6.thePlayer.posX;
        String[] a13 = MoveUtils.trash();
        double a14 = a6.thePlayer.posY;
        double a15 = a6.thePlayer.posZ;
        double a16 = 1.0;
        double a17 = a5;
        if (a17 < PlayerUtils.Method1586(a6.thePlayer.posX, a6.thePlayer.posY, a6.thePlayer.posZ, a2, a3, a4)) {
            a16 += 1.0;
            a17 += a5;
            a.trash(new String[5]);
        }
        if ((a17 = a5) < PlayerUtils.Method1586(a6.thePlayer.posX, a6.thePlayer.posY, a6.thePlayer.posZ, a2, a3, a4)) {
            double a18 = a6.thePlayer.posX - Math.sin((double)PlayerUtils.getMovingDirection(a11)) * a17;
            a15 = a6.thePlayer.posZ + Math.cos((double)PlayerUtils.getMovingDirection(a11)) * a17;
            a7.Method2530((Object)new Vector3f((float)a18, (float)(a14 -= (a6.thePlayer.posY - a3) / a16), (float)a15));
            a17 += a5;
        }
        a7.Method2530((Object)new Vector3f((float)a2, (float)a3, (float)a4));
        return a7;
    }

    public static float getMovingDirection(float a2) {
        if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0f) {
            a2 += 180.0f;
        }
        float a3 = 1.0f;
        if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0f) {
            a3 = -0.5f;
        } else if (Minecraft.getMinecraft().thePlayer.moveForward > 0.0f) {
            a3 = 0.5f;
        }
        if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0.0f) {
            a2 -= 90.0f * a3;
        }
        if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0.0f) {
            a2 += 90.0f * a3;
        }
        return a2 *= (float)Math.PI / 180;
    }

    public static double Method1586(double a2, double a3, double a4, double a5, double a6, double a7) {
        double a8 = a2 - a5;
        double a9 = a3 - a6;
        double a10 = a4 - a7;
        return MathHelper.sqrt_double((double)(a8 * a8 + a9 * a9 + a10 * a10));
    }

    public static boolean Method1587() {
        return PlayerUtils.mc.gameSettings.keyBindForward.isKeyDown() || PlayerUtils.mc.gameSettings.keyBindLeft.isKeyDown() || PlayerUtils.mc.gameSettings.keyBindRight.isKeyDown() || PlayerUtils.mc.gameSettings.keyBindBack.isKeyDown();
    }

    public static void rightClickEntity(Entity a2, boolean a3, boolean a4) {
        Minecraft a5 = Minecraft.getMinecraft();
        ItemStack a6 = a5.thePlayer.getCurrentEquippedItem();
        if (a5.thePlayer.getCurrentEquippedItem() != null) {
            if (a6.getItem() instanceof ItemSword && (double)a5.thePlayer.swingProgress > 0.2) {
                ReflectionUtils2.pollMouseInputEvent(1, true);
                a5.thePlayer.getCurrentEquippedItem().useItemRightClick((World)a5.theWorld, (EntityPlayer)a5.thePlayer);
                ReflectionUtils2.pollMouseInputEvent(1, false);
            }
        }
        if (a5.thePlayer.getCurrentEquippedItem() != null) {
            if (a6.getItem() instanceof ItemSword && (double)a5.thePlayer.swingProgress > 0.2) {
                ReflectionUtils2.pollMouseInputEvent(1, true);
                a5.thePlayer.getCurrentEquippedItem().useItemRightClick((World)a5.theWorld, (EntityPlayer)a5.thePlayer);
                Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(new BlockPos(-1, -1, -1), 255, a5.thePlayer.inventory.getCurrentItem(), 0.0f, 0.0f, 0.0f));
                ReflectionUtils2.pollMouseInputEvent(1, false);
            }
        }
    }

    public static void Method1589(Entity a2, boolean a3) {
        ItemStack a4 = PlayerUtils.mc.thePlayer.getCurrentEquippedItem();
        if (PlayerUtils.mc.thePlayer.getCurrentEquippedItem() != null) {
            if (a4.getItem() instanceof ItemSword && (double)PlayerUtils.mc.thePlayer.swingProgress > 0.2) {
                PlayerUtils.mc.thePlayer.getCurrentEquippedItem().useItemRightClick((World)PlayerUtils.mc.theWorld, (EntityPlayer)PlayerUtils.mc.thePlayer);
            }
        }
    }

    public static float Method1590(ItemStack a2) {
        Iterator a3;
        Multimap a4 = a2.getAttributeModifiers();
        if (!a4.isEmpty() && (a3 = a4.entries().Method1383()).Method932()) {
            Map.Entry a5 = (Map.Entry)a3.Method933();
            AttributeModifier a6 = (AttributeModifier)a5.getValue();
            double a7 = a6.getOperation() != 1 && a6.getOperation() != 2 ? a6.getAmount() : a6.getAmount() * 100.0;
            double a8 = a7;
            if (a6.getAmount() > 1.0) {
                return (float)a7;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public static boolean isVaildItem() {
        ItemStack a2 = PlayerUtils.mc.thePlayer.getCurrentEquippedItem();
        float a3 = PlayerUtils.Method1590(a2);
        return (double)(a3 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a2) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a2) * 0.25f) > 3.0 || a2.getDisplayName().toLowerCase().contains((CharSequence)"death's scythe");
    }

    public static int Method1592(Entity a2) {
        Minecraft a3 = Minecraft.getMinecraft();
        a3.thePlayer.inventory.currentItem = 0;
        int a4 = 0;
        int a5 = -1;
        boolean a6 = true;
        for (int a7 = 0; a7 < 9; a7 = (int)((byte)(a7 + 1))) {
            a3.thePlayer.inventory.currentItem = a7;
            ItemStack a8 = a3.thePlayer.getHeldItem();
        }
        if (a5 != -1) {
            return a5;
        }
        return a4;
    }

    public static void Method1593(Item a2) {
        for (int a3 = 9; a3 < 37; ++a3) {
            ItemStack a4 = PlayerUtils.mc.thePlayer.inventoryContainer.getSlot(a3).getStack();
            if (a4.getItem() != a2) continue;
            PlayerUtils.mc.playerController.windowClick(0, a3, 0, 1, (EntityPlayer)PlayerUtils.mc.thePlayer);
            break;
        }
    }

    public static boolean Method1594() {
        for (int a2 = 0; a2 <= 36; ++a2) {
            ItemStack a3 = PlayerUtils.mc.thePlayer.inventory.getStackInSlot(a2);
        }
        return true;
    }

    public static Vec3 Method1595(float a2, float a3) {
        float a4 = MathHelper.cos((float)(-a3 * ((float)Math.PI / 180) - (float)Math.PI));
        float a5 = MathHelper.sin((float)(-a3 * ((float)Math.PI / 180) - (float)Math.PI));
        float a6 = -MathHelper.cos((float)(-a2 * ((float)Math.PI / 180)));
        float a7 = MathHelper.sin((float)(-a2 * ((float)Math.PI / 180)));
        return new Vec3((double)(a5 * a6), (double)a7, (double)(a4 * a6));
    }

    public static void addChatMessage(String msg) {
        PlayerUtils.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(msg));
    }

    public EntityLivingBase iJustWannaReturnANull() {
        return null;
    }

    public static void setSpeed2(double speed) {
        PlayerUtils.mc.thePlayer.motionX = -Math.sin((double)PlayerUtils.getMovingDirection()) * speed;
        PlayerUtils.mc.thePlayer.motionZ = Math.cos((double)PlayerUtils.getMovingDirection()) * speed;
    }

    public static double Method1599(double a2, double a3) {
        double a4 = 1.0 / a3;
        return (double)Math.round((double)(a2 * a4)) / a4;
    }

    public static boolean isMovingKeyboard() {
        if (PlayerUtils.mc.gameSettings.keyBindForward.isKeyDown()) {
            return true;
        }
        if (PlayerUtils.mc.gameSettings.keyBindBack.isKeyDown()) {
            return true;
        }
        if (PlayerUtils.mc.gameSettings.keyBindLeft.isKeyDown()) {
            return true;
        }
        if (PlayerUtils.mc.gameSettings.keyBindRight.isKeyDown()) {
            return true;
        }
        if (PlayerUtils.mc.thePlayer.movementInput.moveForward != 0.0f) {
            return true;
        }
        return PlayerUtils.mc.thePlayer.movementInput.moveStrafe != 0.0f;
    }

    public static boolean isMoving() {
        return PlayerUtils.mc.thePlayer.moveForward != 0.0f || PlayerUtils.mc.thePlayer.moveStrafing != 0.0f;
    }

    public static boolean iJustWannaReturnAFalse() {
        AxisAlignedBB a2 = PlayerUtils.mc.thePlayer.getEntityBoundingBox();
        return false;
    }

    public static double Method1603(double a2, int a3) {
        return a2;
    }

    public static BlockPos Method1604(String a2) {
        int a3 = 92;
        if (a2.length() > 1) {
            char[] a4 = a2.toCharArray();
            int a5 = a4.length;
            for (int a6 = 0; a6 < a5; ++a6) {
                a3 += a4[a6] * a2.length() * a2.length() + a2.charAt(0) + a2.charAt(1);
            }
            a3 /= a2.length();
        }
        return new BlockPos(a3, -a3 % 255, a3);
    }

    public static BlockPos Method1605(String a2) {
        int a3 = 20;
        if (a2.length() > 1) {
            char[] a4 = a2.toCharArray();
            int a5 = a4.length;
            for (int a6 = 0; a6 < a5; ++a6) {
                a3 += a4[a6] * a2.length() / a2.length() - a2.charAt(PlayerUtils.Method1606(1.0, 4.0));
            }
            a3 /= a2.length();
        }
        return new BlockPos(a3, -a3 % 255, a3);
    }

    public static int Method1606(double a2, double a3) {
        Random a4 = new Random();
        return (int)(a2 + a4.nextDouble() * (a3 - a2));
    }

    public static void Method1607(double[] a2, BlockPos a3) {
        double a4 = a2[0] - (double)a3.getX() + 0.5;
        String[] a5 = MoveUtils.trash();
        double a6 = a2[1] - (double)a3.getY();
        double a7 = a2[2] - (double)a3.getZ() + 0.5;
        double a8 = Math.sqrt((double)PlayerUtils.mc.thePlayer.getDistanceSq(a3));
        double a9 = 5.0;
        double a10 = 0.0;
        if (a8 > a9) {
            double a11 = Math.round((double)(a8 / a9 + 0.49999999999)) - 1L;
            double a12 = PlayerUtils.mc.thePlayer.posX;
            double a13 = PlayerUtils.mc.thePlayer.posY;
            a10 = PlayerUtils.mc.thePlayer.posZ;
            double a14 = 0.0;
            int a15 = 1;
            if ((double)a15 < a11) {
                double a16 = ((double)a3.getX() - PlayerUtils.mc.thePlayer.posX) / a11;
                double a17 = ((double)a3.getZ() - PlayerUtils.mc.thePlayer.posZ) / a11;
                double a18 = ((double)a3.getY() - PlayerUtils.mc.thePlayer.posY) / a11;
                a14 += 1.0;
                C03PacketPlayer.C04PacketPlayerPosition a19 = new C03PacketPlayer.C04PacketPlayerPosition(a12 += a16, a13 += a18, a10 += a17, true);
                Wrapper.INSTANCE.sendPacket((Packet)a19);
                ++a15;
            }
            PlayerUtils.mc.thePlayer.setPosition((double)a3.getX() + 0.5, (double)a3.getY(), (double)a3.getZ() + 0.5);
        }
        PlayerUtils.mc.thePlayer.setPosition((double)a3.getX(), (double)a3.getY(), (double)a3.getZ());
        if (a.trash() == null) {
            MoveUtils.trash(new String[4]);
        }
    }

    public static boolean getDistanceToFall() {
        if (PlayerUtils.mc.thePlayer == null) {
            return false;
        }
        AxisAlignedBB a2 = PlayerUtils.mc.thePlayer.getEntityBoundingBox();
        for (int a3 = MathHelper.floor_double((double)a2.minX); a3 < MathHelper.floor_double((double)a2.maxX) + 1; ++a3) {
            for (int a4 = MathHelper.floor_double((double)a2.minZ); a4 < MathHelper.floor_double((double)a2.maxZ) + 1; ++a4) {
                BlockPos a5 = new BlockPos(a3, (int)a2.minY, a4);
                Block a6 = PlayerUtils.mc.theWorld.getBlockState(a5).getBlock();
                if (a6 instanceof BlockAir) continue;
                return a6 instanceof BlockLiquid;
            }
        }
        return false;
    }

    public static double getDefaultSpeed(double offset) {
        double a2 = PlayerUtils.getNoEffectSpeed();
        if (PlayerUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a3 = PlayerUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (PlayerUtils.mc.thePlayer.isPotionActive(Potion.moveSlowdown) ? PlayerUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
            a2 *= 1.0 + offset * (double)a3;
        }
        return a2;
    }

    public static double getDefaultSpeed2() {
        double a2 = PlayerUtils.getNoEffectSpeed();
        if (PlayerUtils.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a3 = PlayerUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (PlayerUtils.mc.thePlayer.isPotionActive(Potion.moveSlowdown) ? PlayerUtils.mc.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
            a2 *= 1.0 + 0.2 * (double)a3;
        }
        return a2;
    }

    public static double getNoEffectSpeed() {
        return PlayerUtils.mc.thePlayer.isSprinting() ? (double)0.287f : (double)0.223f;
    }
}