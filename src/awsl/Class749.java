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
package awsl;

import awsl.Class208;
import awsl.Class362;
import awsl.Class91;
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
import org.lwjgl.util.vector.Vector3f;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.Wrapper;

public class Class749 {
    private static final Minecraft Field3280 = Minecraft.getMinecraft();

    public static float[] Method1571(Entity a) {
        double a2 = a.posX;
        double a3 = a.posZ;
        double a4 = a.posY + (double)(a.getEyeHeight() / 4.0f);
        return Class749.Method1572(a2, a3, a4);
    }

    private static float[] Method1572(double a, double a2, double a3) {
        double a4 = a - Minecraft.getMinecraft().thePlayer.posX;
        double a5 = a2 - Minecraft.getMinecraft().thePlayer.posZ;
        double a6 = a3 - Minecraft.getMinecraft().thePlayer.posY - 0.6;
        double a7 = MathHelper.sqrt_double((double)(a4 * a4 + a5 * a5));
        float a8 = (float)(Math.atan2((double)a5, (double)a4) * 180.0 / Math.PI) - 90.0f;
        float a9 = (float)(-(Math.atan2((double)a6, (double)a7) * 180.0 / Math.PI));
        return new float[]{a8, a9};
    }

    public static double Method1573() {
        double a = 0.2873;
        if (Minecraft.getMinecraft().thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = Minecraft.getMinecraft().thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
        }
        return a;
    }

    public static float Method1574() {
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

    public static boolean Method1575() {
        return Class749.Field3280.theWorld.getBlockState(new BlockPos(Class749.Field3280.thePlayer.posX, Class749.Field3280.thePlayer.posY, Class749.Field3280.thePlayer.posZ)).getBlock().getMaterial() == Material.water;
    }

    public static void Method1576(double a) {
        float a2 = Class749.Field3280.thePlayer.rotationYaw * ((float)Math.PI / 180);
        EntityPlayerSP a3 = Class749.Field3280.thePlayer;
        a3.motionX -= (double)MathHelper.sin((float)a2) * a;
        EntityPlayerSP a4 = Class749.Field3280.thePlayer;
        a4.motionZ += (double)MathHelper.cos((float)a2) * a;
    }

    public static double Method1577() {
        return Math.sqrt((double)(Minecraft.getMinecraft().thePlayer.motionX * Minecraft.getMinecraft().thePlayer.motionX + Minecraft.getMinecraft().thePlayer.motionZ * Minecraft.getMinecraft().thePlayer.motionZ));
    }

    public static Block Method1578(EntityPlayer a) {
        return Class749.Method1579(new BlockPos(a.posX, a.posY - 1.0, a.posZ));
    }

    public static Block Method1579(BlockPos a) {
        return Minecraft.getMinecraft().theWorld.getBlockState(a).getBlock();
    }

    public static Block Method1580(double a, double a2, double a3) {
        return Class749.Field3280.theWorld.getBlockState(new BlockPos(a, a2, a3)).getBlock();
    }

    public static Block Method1581(EntityPlayer a, double a2, double a3, double a4) {
        return Class749.Method1579(new BlockPos(a.posX - a2, a.posY - a3, a.posZ - a4));
    }

    public static double Method1582() {
        if (Class749.Field3280.thePlayer == null || Class749.Field3280.thePlayer.ticksExisted < 1) {
            return 0.0;
        }
        return Class749.Field3280.thePlayer.getDistance(Class749.Field3280.thePlayer.lastTickPosX, Class749.Field3280.thePlayer.lastTickPosY, Class749.Field3280.thePlayer.lastTickPosZ) * (double)(ReflectionUtils.Method2588() * ReflectionUtils.Method2589());
    }

    public static double Method1583() {
        double a = Math.hypot((double)(Class749.Field3280.thePlayer.posX - Class749.Field3280.thePlayer.prevPosX), (double)(Class749.Field3280.thePlayer.posZ - Class749.Field3280.thePlayer.prevPosZ)) * (double)ReflectionUtils.Method2589() * 20.0;
        return (double)Math.round((double)(a * 100.0)) / 100.0;
    }

    /*
     * WARNING - void declaration
     */
    public static ArrayList Method1584(double a, double a2, double a3, double a4) {
        void a5;
        ArrayList a6 = new ArrayList();
        Minecraft minecraft = Minecraft.getMinecraft();
        double a7 = a - a5.thePlayer.posX;
        double a8 = a2 - (a5.thePlayer.posY + (double)a5.thePlayer.getEyeHeight() + 1.1);
        double a9 = a3 - a5.thePlayer.posZ;
        float a10 = (float)(Math.atan2((double)a9, (double)a7) * 180.0 / Math.PI - 90.0);
        float a11 = (float)(-Math.atan2((double)a8, (double)Math.sqrt((double)(a7 * a7 + a9 * a9))) * 180.0 / Math.PI);
        double d = a5.thePlayer.posX;
        String[] a12 = Class208.Method2491();
        double a13 = a5.thePlayer.posY;
        double a14 = a5.thePlayer.posZ;
        double a15 = 1.0;
        double a16 = a4;
        if (a16 < Class749.Method1586(a5.thePlayer.posX, a5.thePlayer.posY, a5.thePlayer.posZ, a, a2, a3)) {
            a15 += 1.0;
            a16 += a4;
            Class91.Method3647(new String[5]);
        }
        if ((a16 = a4) < Class749.Method1586(a5.thePlayer.posX, a5.thePlayer.posY, a5.thePlayer.posZ, a, a2, a3)) {
            double a17 = a5.thePlayer.posX - Math.sin((double)Class749.Method1585(a10)) * a16;
            a14 = a5.thePlayer.posZ + Math.cos((double)Class749.Method1585(a10)) * a16;
            a6.Method2530((Object)new Vector3f((float)a17, (float)(a13 -= (a5.thePlayer.posY - a2) / a15), (float)a14));
            a16 += a4;
        }
        a6.Method2530((Object)new Vector3f((float)a, (float)a2, (float)a3));
        return a6;
    }

    public static float Method1585(float a) {
        if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0f) {
            a += 180.0f;
        }
        float a2 = 1.0f;
        if (Minecraft.getMinecraft().thePlayer.moveForward < 0.0f) {
            a2 = -0.5f;
        } else if (Minecraft.getMinecraft().thePlayer.moveForward > 0.0f) {
            a2 = 0.5f;
        }
        if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0.0f) {
            a -= 90.0f * a2;
        }
        if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0.0f) {
            a += 90.0f * a2;
        }
        return a *= (float)Math.PI / 180;
    }

    public static double Method1586(double a, double a2, double a3, double a4, double a5, double a6) {
        double a7 = a - a4;
        double a8 = a2 - a5;
        double a9 = a3 - a6;
        return MathHelper.sqrt_double((double)(a7 * a7 + a8 * a8 + a9 * a9));
    }

    public static boolean Method1587() {
        return Class749.Field3280.gameSettings.keyBindForward.isKeyDown() || Class749.Field3280.gameSettings.keyBindLeft.isKeyDown() || Class749.Field3280.gameSettings.keyBindRight.isKeyDown() || Class749.Field3280.gameSettings.keyBindBack.isKeyDown();
    }

    public static void Method1588(Entity a, boolean a2, boolean a3) {
        Minecraft a4 = Minecraft.getMinecraft();
        ItemStack a5 = a4.thePlayer.getCurrentEquippedItem();
        if (a4.thePlayer.getCurrentEquippedItem() != null) {
            if (a5.getItem() instanceof ItemSword && (double)a4.thePlayer.swingProgress > 0.2) {
                Class362.Method541(1, true);
                a4.thePlayer.getCurrentEquippedItem().useItemRightClick((World)a4.theWorld, (EntityPlayer)a4.thePlayer);
                Class362.Method541(1, false);
            }
        }
        if (a4.thePlayer.getCurrentEquippedItem() != null) {
            if (a5.getItem() instanceof ItemSword && (double)a4.thePlayer.swingProgress > 0.2) {
                Class362.Method541(1, true);
                a4.thePlayer.getCurrentEquippedItem().useItemRightClick((World)a4.theWorld, (EntityPlayer)a4.thePlayer);
                Wrapper.INSTANCE.Method2874((Packet)new C08PacketPlayerBlockPlacement(new BlockPos(-1, -1, -1), 255, a4.thePlayer.inventory.getCurrentItem(), 0.0f, 0.0f, 0.0f));
                Class362.Method541(1, false);
            }
        }
    }

    public static void Method1589(Entity a, boolean a2) {
        ItemStack a3 = Class749.Field3280.thePlayer.getCurrentEquippedItem();
        if (Class749.Field3280.thePlayer.getCurrentEquippedItem() != null) {
            if (a3.getItem() instanceof ItemSword && (double)Class749.Field3280.thePlayer.swingProgress > 0.2) {
                Class749.Field3280.thePlayer.getCurrentEquippedItem().useItemRightClick((World)Class749.Field3280.theWorld, (EntityPlayer)Class749.Field3280.thePlayer);
            }
        }
    }

    public static float Method1590(ItemStack a) {
        Iterator a2;
        Multimap a3 = a.getAttributeModifiers();
        if (!a3.isEmpty() && (a2 = a3.entries().Method1383()).Method932()) {
            Map.Entry a4 = (Map.Entry)a2.Method933();
            AttributeModifier a5 = (AttributeModifier)a4.getValue();
            double a6 = a5.getOperation() != 1 && a5.getOperation() != 2 ? a5.getAmount() : a5.getAmount() * 100.0;
            double a7 = a6;
            if (a5.getAmount() > 1.0) {
                return (float)a6;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public static boolean Method1591() {
        ItemStack a = Class749.Field3280.thePlayer.getCurrentEquippedItem();
        float a2 = Class749.Method1590(a);
        return (double)(a2 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a) * 0.25f) > 3.0 || a.getDisplayName().toLowerCase().contains((CharSequence)"death's scythe");
    }

    public static int Method1592(Entity a) {
        Minecraft a2 = Minecraft.getMinecraft();
        a2.thePlayer.inventory.currentItem = 0;
        int a3 = 0;
        int a4 = -1;
        boolean a5 = true;
        for (int a6 = 0; a6 < 9; a6 = (int)((byte)(a6 + 1))) {
            a2.thePlayer.inventory.currentItem = a6;
            ItemStack a7 = a2.thePlayer.getHeldItem();
        }
        if (a4 != -1) {
            return a4;
        }
        return a3;
    }

    public static void Method1593(Item a) {
        for (int a2 = 9; a2 < 37; ++a2) {
            ItemStack a3 = Class749.Field3280.thePlayer.inventoryContainer.getSlot(a2).getStack();
            if (a3.getItem() != a) continue;
            Class749.Field3280.playerController.windowClick(0, a2, 0, 1, (EntityPlayer)Class749.Field3280.thePlayer);
            break;
        }
    }

    public static boolean Method1594() {
        for (int a = 0; a <= 36; ++a) {
            ItemStack a2 = Class749.Field3280.thePlayer.inventory.getStackInSlot(a);
        }
        return true;
    }

    public static Vec3 Method1595(float a, float a2) {
        float a3 = MathHelper.cos((float)(-a2 * ((float)Math.PI / 180) - (float)Math.PI));
        float a4 = MathHelper.sin((float)(-a2 * ((float)Math.PI / 180) - (float)Math.PI));
        float a5 = -MathHelper.cos((float)(-a * ((float)Math.PI / 180)));
        float a6 = MathHelper.sin((float)(-a * ((float)Math.PI / 180)));
        return new Vec3((double)(a4 * a5), (double)a6, (double)(a3 * a5));
    }

    public static void Method1596(String a) {
        Class749.Field3280.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(a));
    }

    public EntityLivingBase Method1597() {
        return null;
    }

    public static void Method1598(double a) {
        Class749.Field3280.thePlayer.motionX = -Math.sin((double)Class749.Method1574()) * a;
        Class749.Field3280.thePlayer.motionZ = Math.cos((double)Class749.Method1574()) * a;
    }

    public static double Method1599(double a, double a2) {
        double a3 = 1.0 / a2;
        return (double)Math.round((double)(a * a3)) / a3;
    }

    public static boolean Method1600() {
        if (Class749.Field3280.gameSettings.keyBindForward.isKeyDown()) {
            return true;
        }
        if (Class749.Field3280.gameSettings.keyBindBack.isKeyDown()) {
            return true;
        }
        if (Class749.Field3280.gameSettings.keyBindLeft.isKeyDown()) {
            return true;
        }
        if (Class749.Field3280.gameSettings.keyBindRight.isKeyDown()) {
            return true;
        }
        if (Class749.Field3280.thePlayer.movementInput.moveForward != 0.0f) {
            return true;
        }
        return Class749.Field3280.thePlayer.movementInput.moveStrafe != 0.0f;
    }

    public static boolean Method1601() {
        return Class749.Field3280.thePlayer.moveForward != 0.0f || Class749.Field3280.thePlayer.moveStrafing != 0.0f;
    }

    public static boolean Method1602() {
        AxisAlignedBB a = Class749.Field3280.thePlayer.getEntityBoundingBox();
        return false;
    }

    public static double Method1603(double a, int a2) {
        return a;
    }

    public static BlockPos Method1604(String a) {
        int a2 = 92;
        if (a.length() > 1) {
            char[] a3 = a.toCharArray();
            int a4 = a3.length;
            for (int a5 = 0; a5 < a4; ++a5) {
                a2 += a3[a5] * a.length() * a.length() + a.charAt(0) + a.charAt(1);
            }
            a2 /= a.length();
        }
        return new BlockPos(a2, -a2 % 255, a2);
    }

    public static BlockPos Method1605(String a) {
        int a2 = 20;
        if (a.length() > 1) {
            char[] a3 = a.toCharArray();
            int a4 = a3.length;
            for (int a5 = 0; a5 < a4; ++a5) {
                a2 += a3[a5] * a.length() / a.length() - a.charAt(Class749.Method1606(1.0, 4.0));
            }
            a2 /= a.length();
        }
        return new BlockPos(a2, -a2 % 255, a2);
    }

    public static int Method1606(double a, double a2) {
        Random a3 = new Random();
        return (int)(a + a3.nextDouble() * (a2 - a));
    }

    public static void Method1607(double[] a, BlockPos a2) {
        double a3 = a[0] - (double)a2.getX() + 0.5;
        String[] a4 = Class208.Method2491();
        double a5 = a[1] - (double)a2.getY();
        double a6 = a[2] - (double)a2.getZ() + 0.5;
        double a7 = Math.sqrt((double)Class749.Field3280.thePlayer.getDistanceSq(a2));
        double a8 = 5.0;
        double a9 = 0.0;
        if (a7 > a8) {
            double a10 = Math.round((double)(a7 / a8 + 0.49999999999)) - 1L;
            double a11 = Class749.Field3280.thePlayer.posX;
            double a12 = Class749.Field3280.thePlayer.posY;
            a9 = Class749.Field3280.thePlayer.posZ;
            double a13 = 0.0;
            int a14 = 1;
            if ((double)a14 < a10) {
                double a15 = ((double)a2.getX() - Class749.Field3280.thePlayer.posX) / a10;
                double a16 = ((double)a2.getZ() - Class749.Field3280.thePlayer.posZ) / a10;
                double a17 = ((double)a2.getY() - Class749.Field3280.thePlayer.posY) / a10;
                a13 += 1.0;
                C03PacketPlayer.C04PacketPlayerPosition a18 = new C03PacketPlayer.C04PacketPlayerPosition(a11 += a15, a12 += a17, a9 += a16, true);
                Wrapper.INSTANCE.Method2874((Packet)a18);
                ++a14;
            }
            Class749.Field3280.thePlayer.setPosition((double)a2.getX() + 0.5, (double)a2.getY(), (double)a2.getZ() + 0.5);
        }
        Class749.Field3280.thePlayer.setPosition((double)a2.getX(), (double)a2.getY(), (double)a2.getZ());
        if (Class91.Method3648() == null) {
            Class208.Method2490(new String[4]);
        }
    }

    public static boolean Method1608() {
        if (Class749.Field3280.thePlayer == null) {
            return false;
        }
        AxisAlignedBB a = Class749.Field3280.thePlayer.getEntityBoundingBox();
        for (int a2 = MathHelper.floor_double((double)a.minX); a2 < MathHelper.floor_double((double)a.maxX) + 1; ++a2) {
            for (int a3 = MathHelper.floor_double((double)a.minZ); a3 < MathHelper.floor_double((double)a.maxZ) + 1; ++a3) {
                BlockPos a4 = new BlockPos(a2, (int)a.minY, a3);
                Block a5 = Class749.Field3280.theWorld.getBlockState(a4).getBlock();
                if (a5 instanceof BlockAir) continue;
                return a5 instanceof BlockLiquid;
            }
        }
        return false;
    }

    public static double Method1609(double a) {
        double a2 = Class749.Method1611();
        if (Class749.Field3280.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a3 = Class749.Field3280.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (Class749.Field3280.thePlayer.isPotionActive(Potion.moveSlowdown) ? Class749.Field3280.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
            a2 *= 1.0 + a * (double)a3;
        }
        return a2;
    }

    public static double Method1610() {
        double a = Class749.Method1611();
        if (Class749.Field3280.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = Class749.Field3280.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier() + 1 - (Class749.Field3280.thePlayer.isPotionActive(Potion.moveSlowdown) ? Class749.Field3280.thePlayer.getActivePotionEffect(Potion.moveSlowdown).getAmplifier() + 1 : 0);
            a *= 1.0 + 0.2 * (double)a2;
        }
        return a;
    }

    public static double Method1611() {
        return Class749.Field3280.thePlayer.isSprinting() ? (double)0.287f : (double)0.223f;
    }
}