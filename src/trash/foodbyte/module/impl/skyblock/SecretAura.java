/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.properties.Property
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C0DPacketCloseWindow
 *  net.minecraft.network.play.server.S02PacketChat
 *  net.minecraft.network.play.server.S2DPacketOpenWindow
 *  net.minecraft.tileentity.TileEntitySkull
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 *  net.minecraft.util.Vec3i
 */
package trash.foodbyte.module.impl.skyblock;

import awsl.Class98;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import com.mojang.realmsclient.gui.ChatFormatting;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class SecretAura
extends Module {
    public static FloatValue Field3127 = new FloatValue("SecretAura", "Reach", 3.0f, 5.0f, 7.0f, 1.0f, "\u81ea\u52a8\u70b9\u51fb\u5ef6\u8fdf");
    public static BooleanValue Field3128 = new BooleanValue("SecretAura", "Clicked check", (Boolean)true, "\u61c2\u5f97\u90fd\u61c2");
    public static BooleanValue Field3129 = new BooleanValue("SecretAura", "Cancel chests", (Boolean)true, "\u61c2\u5f97\u90fd\u61c2");
    public static BooleanValue Field3130 = new BooleanValue("SecretAura", "Rotation", (Boolean)false, "\u5934\u4f1a\u626d\u52a8\u7784\u51c6\u79d8\u5bc6\u518d\u6253\u5f00(\u4f46\u662f\u81ea\u5df1\u89c6\u89d2\u770b\u4e0d\u89c1)");
    public static ArrayList Field3131 = new ArrayList();
    public static boolean Field3132;
    private boolean Field3133;

    public SecretAura() {
        super("SecretAura", "Secret Aura", Category.SKYBLOCK);
        this.setDescription("\u00a73Skills\n\u5730\u7262\u8d70\u5230\u79d8\u5bc6\u65c1\u8fb9\u81ea\u52a8\u6253\u5f00");
    }

    @EventTarget
    public void Method752(EventMotion a2) {
        block9: {
            BlockPos a3;
            Iterator iterator;
            Vec3i a4;
            block8: {
                int[] a5 = Class98.Method3639();
                if (!a2.isPre()) break block8;
                if (SecretAura.mc.thePlayer == null || !ServerUtils.isPlayingSkyblockAndCleared()) break block9;
                if (!Field3130.getBooleanValue().booleanValue()) break block9;
                a4 = new Vec3i(10, 10, 10);
                iterator = BlockPos.getAllInBox((BlockPos)new BlockPos((Vec3i)SecretAura.mc.thePlayer.getPosition()).add(a4), (BlockPos)new BlockPos((Vec3i)SecretAura.mc.thePlayer.getPosition().subtract(a4))).Method1383();
                if (iterator.Method932()) {
                    a3 = (BlockPos)iterator.Method933();
                    if (this.Method2067(a3)) {
                        if (SecretAura.mc.thePlayer.getDistance((double)a3.getX(), (double)((float)a3.getY() - SecretAura.mc.thePlayer.getEyeHeight()), (double)a3.getZ()) < (double)Field3127.getFloatValue().floatValue()) {
                            float[] a6 = SecretAura.Method2070(new Vec3((double)a3.getX() + 0.5, (double)a3.getY() + 0.5, (double)a3.getZ() + 0.5));
                            EventMotion.pitch = a6[1];
                            EventMotion.yaw = a6[0];
                        }
                    }
                }
            }
            if (SecretAura.mc.thePlayer != null && ServerUtils.isPlayingSkyblockAndCleared()) {
                a4 = new Vec3i(10, 10, 10);
                iterator = BlockPos.getAllInBox((BlockPos)new BlockPos((Vec3i)SecretAura.mc.thePlayer.getPosition()).add(a4), (BlockPos)new BlockPos((Vec3i)SecretAura.mc.thePlayer.getPosition().subtract(a4))).Method1383();
                while (iterator.Method932()) {
                    a3 = (BlockPos)iterator.Method933();
                    if (this.Method2067(a3)) {
                        if (SecretAura.mc.thePlayer.getDistance((double)a3.getX(), (double)((float)a3.getY() - SecretAura.mc.thePlayer.getEyeHeight()), (double)a3.getZ()) < (double)Field3127.getFloatValue().floatValue()) {
                            this.Method2069(a3);
                            if (!Field3130.getBooleanValue().booleanValue()) continue;
                        }
                    }
                    break;
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Method2067(BlockPos a2) {
        TileEntitySkull a3;
        Block a4 = SecretAura.mc.theWorld.getBlockState(a2).getBlock();
        if (a4 == Blocks.skull && (a3 = (TileEntitySkull)SecretAura.mc.theWorld.getTileEntity(a2)).getSkullType() == 3 && a3.getPlayerProfile() != null && a3.getPlayerProfile().getProperties() != null) {
            Property a5 = (Property)SecretAura.Method2068((Iterable)a3.getPlayerProfile().getProperties().get((Object)"textures"));
            if (!a5.getValue().equals((Object)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRkYjRhZGZhOWJmNDhmZjVkNDE3MDdhZTM0ZWE3OGJkMjM3MTY1OWZjZDhjZDg5MzQ3NDlhZjRjY2U5YiJ9fX0=")) return false;
            if (!Field3131.contains((Object)a2)) return true;
            if (Field3128.getBooleanValue() != false) return false;
            return true;
        }
        if (a4 != Blocks.lever && a4 != Blocks.chest) {
            if (a4 != Blocks.trapped_chest) return false;
        }
        if (!Field3131.contains((Object)a2)) return true;
        if (Field3128.getBooleanValue() != false) return false;
        return true;
    }

    private void Method2069(BlockPos a2) {
        for (int a3 = 0; a3 < 9; ++a3) {
            if (SecretAura.mc.thePlayer.inventory.getStackInSlot(a3) == null || !SecretAura.mc.thePlayer.inventory.getStackInSlot(a3).getDisplayName().toLowerCase().contains((CharSequence)"stonk".toLowerCase())) continue;
            int a4 = SecretAura.mc.thePlayer.inventory.currentItem;
            SecretAura.mc.thePlayer.inventory.currentItem = a3;
            if (SecretAura.mc.theWorld.getBlockState(a2).getBlock() == Blocks.lever && !Field3132) {
                SecretAura.mc.playerController.onPlayerRightClick(SecretAura.mc.thePlayer, SecretAura.mc.theWorld, SecretAura.mc.thePlayer.inventory.getCurrentItem(), a2, EnumFacing.fromAngle((double)SecretAura.mc.thePlayer.rotationYaw), new Vec3(0.0, 0.0, 0.0));
            }
            SecretAura.mc.playerController.onPlayerRightClick(SecretAura.mc.thePlayer, SecretAura.mc.theWorld, SecretAura.mc.thePlayer.inventory.getCurrentItem(), a2, EnumFacing.fromAngle((double)SecretAura.mc.thePlayer.rotationYaw), new Vec3(0.0, 0.0, 0.0));
            SecretAura.mc.thePlayer.inventory.currentItem = a4;
            Field3131.Method2530((Object)a2);
            return;
        }
        if (!this.Field3133) {
            ChatUtils.addChatMessage("You don't have a required item in your hotbar!");
            this.Field3133 = true;
        }
    }

    @EventTarget
    public void Method1186(EventPacket a2) {
        if (a2.isRecieve()) {
            if (a2.packet instanceof S02PacketChat && ChatFormatting.stripFormatting((String)((S02PacketChat)a2.packet).getChatComponent().getFormattedText()).startsWith("[BOSS] Necron")) {
                Field3132 = true;
            }
            if (a2.packet instanceof S2DPacketOpenWindow && ChatFormatting.stripFormatting((String)((S2DPacketOpenWindow)a2.packet).getWindowTitle().getFormattedText()).equals((Object)"Chest") && ServerUtils.isPlayingSkyblockAndCleared()) {
                if (Field3129.getBooleanValue().booleanValue()) {
                    a2.setCancelled(true);
                    mc.getNetHandler().getNetworkManager().sendPacket((Packet)new C0DPacketCloseWindow(((S2DPacketOpenWindow)a2.packet).getWindowId()));
                }
            }
        }
    }

    public static Object Method2068(Iterable a2) {
        return Iterables.getFirst((Iterable)a2, null);
    }

    public static float[] Method2070(Vec3 a2) {
        double a3 = a2.xCoord - SecretAura.mc.thePlayer.posX;
        double a4 = a2.yCoord - (SecretAura.mc.thePlayer.posY + (double)SecretAura.mc.thePlayer.getEyeHeight());
        double a5 = a2.zCoord - SecretAura.mc.thePlayer.posZ;
        double a6 = MathHelper.sqrt_double((double)(a3 * a3 + a5 * a5));
        float a7 = (float)(Math.atan2((double)a5, (double)a3) * 180.0 / Math.PI) - 90.0f;
        float a8 = (float)(-(Math.atan2((double)a4, (double)a6) * 180.0 / Math.PI));
        return new float[]{SecretAura.mc.thePlayer.rotationYaw + MathHelper.wrapAngleTo180_float((float)(a7 - SecretAura.mc.thePlayer.rotationYaw)), SecretAura.mc.thePlayer.rotationPitch + MathHelper.wrapAngleTo180_float((float)(a8 - SecretAura.mc.thePlayer.rotationPitch))};
    }
}