package trash.foodbyte.module.impl.skyblock;

import awsl.Class98;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import eventapi.EventTarget;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import obfuscate.a;
import trash.foodbyte.event.MouseEvent;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class GhostBlocks extends Module {
   public GhostBlocks() {
      Class98.Method3639();
      super("GhostBlocks", "Ghost Blocks", Category.SKYBLOCK);
      this.setDescription("手拿镐子右键方块可消除方块");
      if (a.trash() == null) {
         Class98.Method3638(new int[5]);
      }

   }

   @EventTarget
   public void Method2066(MouseEvent a) {
      if (mc.currentScreen == null && a.eventButton == 1 && a.eventButtonState) {
         MovingObjectPosition var2 = mc.objectMouseOver;
         if (var2.entityHit != null) {
            return;
         }

         mc.theWorld.getBlockState(var2.getBlockPos()).getBlock();
         BlockPos var4 = var2.getBlockPos();
         ItemStack var5 = mc.thePlayer.getHeldItem();
         if (!this.Method2067(var4) && (var5.getDisplayName().contains("Stonk") || var5.getDisplayName().contains("Pickaxe"))) {
            mc.theWorld.setBlockToAir(var4);
            a.Method2300(true);
         }
      }

   }

   private boolean Method2067(BlockPos a) {
      Block var2 = mc.theWorld.getBlockState(a).getBlock();
      if (var2 == Blocks.skull) {
         TileEntitySkull var3 = (TileEntitySkull)mc.theWorld.getTileEntity(a);
         if (var3.getSkullType() == 3 && var3.getPlayerProfile() != null && var3.getPlayerProfile().getProperties() != null) {
            Property var4 = (Property)Method2068(var3.getPlayerProfile().getProperties().get("textures"));
            return var4.getValue().equals("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRkYjRhZGZhOWJmNDhmZjVkNDE3MDdhZTM0ZWE3OGJkMjM3MTY1OWZjZDhjZDg5MzQ3NDlhZjRjY2U5YiJ9fX0=");
         }
      }

      return var2 == Blocks.lever || var2 == Blocks.chest || var2 == Blocks.trapped_chest;
   }

   public static Object Method2068(Iterable a) {
      return Iterables.getFirst(a, (Object)null);
   }
}
