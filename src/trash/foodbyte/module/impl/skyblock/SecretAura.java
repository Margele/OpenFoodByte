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

public class SecretAura extends Module {
   public static FloatValue Field3127 = new FloatValue("SecretAura", "Reach", 3.0F, 5.0F, 7.0F, 1.0F, "自动点击延迟");
   public static BooleanValue Field3128 = new BooleanValue("SecretAura", "Clicked check", true, "懂得都懂");
   public static BooleanValue Field3129 = new BooleanValue("SecretAura", "Cancel chests", true, "懂得都懂");
   public static BooleanValue Field3130 = new BooleanValue("SecretAura", "Rotation", false, "头会扭动瞄准秘密再打开(但是自己视角看不见)");
   public static ArrayList Field3131 = new ArrayList();
   public static boolean Field3132;
   private boolean Field3133;

   public SecretAura() {
      super("SecretAura", "Secret Aura", Category.SKYBLOCK);
      this.setDescription("§3Skills\n地牢走到秘密旁边自动打开");
   }

   @EventTarget
   public void Method752(EventMotion a) {
      int[] a = Class98.Method3639();
      Vec3i a;
      Iterator var4;
      BlockPos a;
      if (a.isPre()) {
         if (mc.thePlayer == null || !ServerUtils.isPlayingSkyblockAndCleared() || !Field3130.getBooleanValue()) {
            return;
         }

         a = new Vec3i(10, 10, 10);
         var4 = BlockPos.getAllInBox((new BlockPos(mc.thePlayer.getPosition())).add(a), new BlockPos(mc.thePlayer.getPosition().subtract(a))).Method1383();
         if (var4.Method932()) {
            a = (BlockPos)var4.Method933();
            if (this.Method2067(a) && mc.thePlayer.getDistance((double)a.getX(), (double)((float)a.getY() - mc.thePlayer.getEyeHeight()), (double)a.getZ()) < (double)Field3127.getFloatValue()) {
               float[] a = Method2070(new Vec3((double)a.getX() + 0.5, (double)a.getY() + 0.5, (double)a.getZ() + 0.5));
               EventMotion.pitch = a[1];
               EventMotion.yaw = a[0];
            }
         }
      }

      if (mc.thePlayer != null && ServerUtils.isPlayingSkyblockAndCleared()) {
         a = new Vec3i(10, 10, 10);
         var4 = BlockPos.getAllInBox((new BlockPos(mc.thePlayer.getPosition())).add(a), new BlockPos(mc.thePlayer.getPosition().subtract(a))).Method1383();

         while(var4.Method932()) {
            a = (BlockPos)var4.Method933();
            if (!this.Method2067(a) || !(mc.thePlayer.getDistance((double)a.getX(), (double)((float)a.getY() - mc.thePlayer.getEyeHeight()), (double)a.getZ()) < (double)Field3127.getFloatValue())) {
               break;
            }

            this.Method2069(a);
            if (Field3130.getBooleanValue()) {
               break;
            }
         }
      }

   }

   private boolean Method2067(BlockPos a) {
      Block a = mc.theWorld.getBlockState(a).getBlock();
      if (a == Blocks.skull) {
         TileEntitySkull a = (TileEntitySkull)mc.theWorld.getTileEntity(a);
         if (a.getSkullType() == 3 && a.getPlayerProfile() != null && a.getPlayerProfile().getProperties() != null) {
            Property a = (Property)Method2068(a.getPlayerProfile().getProperties().get("textures"));
            return a.getValue().equals("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRkYjRhZGZhOWJmNDhmZjVkNDE3MDdhZTM0ZWE3OGJkMjM3MTY1OWZjZDhjZDg5MzQ3NDlhZjRjY2U5YiJ9fX0=") && (!Field3131.contains(a) || !Field3128.getBooleanValue());
         }
      }

      return (a == Blocks.lever || a == Blocks.chest || a == Blocks.trapped_chest) && (!Field3131.contains(a) || !Field3128.getBooleanValue());
   }

   private void Method2069(BlockPos a) {
      for(int a = 0; a < 9; ++a) {
         if (mc.thePlayer.inventory.getStackInSlot(a) != null && mc.thePlayer.inventory.getStackInSlot(a).getDisplayName().toLowerCase().contains("stonk".toLowerCase())) {
            int a = mc.thePlayer.inventory.currentItem;
            mc.thePlayer.inventory.currentItem = a;
            if (mc.theWorld.getBlockState(a).getBlock() == Blocks.lever && !Field3132) {
               mc.playerController.onPlayerRightClick(mc.thePlayer, mc.theWorld, mc.thePlayer.inventory.getCurrentItem(), a, EnumFacing.fromAngle((double)mc.thePlayer.rotationYaw), new Vec3(0.0, 0.0, 0.0));
            }

            mc.playerController.onPlayerRightClick(mc.thePlayer, mc.theWorld, mc.thePlayer.inventory.getCurrentItem(), a, EnumFacing.fromAngle((double)mc.thePlayer.rotationYaw), new Vec3(0.0, 0.0, 0.0));
            mc.thePlayer.inventory.currentItem = a;
            Field3131.Method2530(a);
            return;
         }
      }

      if (!this.Field3133) {
         ChatUtils.addChatMessage("You don't have a required item in your hotbar!");
         this.Field3133 = true;
      }

   }

   @EventTarget
   public void Method1186(EventPacket a) {
      if (a.isRecieve()) {
         if (a.packet instanceof S02PacketChat && ChatFormatting.stripFormatting(((S02PacketChat)a.packet).getChatComponent().getFormattedText()).startsWith("[BOSS] Necron")) {
            Field3132 = true;
         }

         if (a.packet instanceof S2DPacketOpenWindow && ChatFormatting.stripFormatting(((S2DPacketOpenWindow)a.packet).getWindowTitle().getFormattedText()).equals("Chest") && ServerUtils.isPlayingSkyblockAndCleared() && Field3129.getBooleanValue()) {
            a.setCancelled(true);
            mc.getNetHandler().getNetworkManager().sendPacket(new C0DPacketCloseWindow(((S2DPacketOpenWindow)a.packet).getWindowId()));
         }
      }

   }

   public static Object Method2068(Iterable a) {
      return Iterables.getFirst(a, (Object)null);
   }

   public static float[] Method2070(Vec3 a) {
      double a = a.xCoord - mc.thePlayer.posX;
      double a = a.yCoord - (mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight());
      double a = a.zCoord - mc.thePlayer.posZ;
      double a = (double)MathHelper.sqrt_double(a * a + a * a);
      float a = (float)(Math.atan2(a, a) * 180.0 / Math.PI) - 90.0F;
      float a = (float)(-(Math.atan2(a, a) * 180.0 / Math.PI));
      return new float[]{mc.thePlayer.rotationYaw + MathHelper.wrapAngleTo180_float(a - mc.thePlayer.rotationYaw), mc.thePlayer.rotationPitch + MathHelper.wrapAngleTo180_float(a - mc.thePlayer.rotationPitch)};
   }
}
