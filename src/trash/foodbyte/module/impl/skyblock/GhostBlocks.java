/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.properties.Property
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntitySkull
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MovingObjectPosition
 */
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

public class GhostBlocks
extends Module {
    public GhostBlocks() {
        int[] nArray = Class98.Method3639();
        super("GhostBlocks", "Ghost Blocks", Category.SKYBLOCK);
        int[] nArray2 = nArray;
        this.setDescription("\u624b\u62ff\u9550\u5b50\u53f3\u952e\u65b9\u5757\u53ef\u6d88\u9664\u65b9\u5757");
        if (a.trash() == null) {
            Class98.Method3638(new int[5]);
        }
    }

    @EventTarget
    public void Method2066(MouseEvent a2) {
        if (GhostBlocks.mc.currentScreen == null && a2.eventButton == 1 && a2.eventButtonState) {
            MovingObjectPosition a3 = GhostBlocks.mc.objectMouseOver;
            if (a3.entityHit != null) {
                return;
            }
            Block a4 = GhostBlocks.mc.theWorld.getBlockState(a3.getBlockPos()).getBlock();
            BlockPos a5 = a3.getBlockPos();
            ItemStack a6 = GhostBlocks.mc.thePlayer.getHeldItem();
            if (!this.Method2067(a5)) {
                if (a6.getDisplayName().contains((CharSequence)"Stonk") || a6.getDisplayName().contains((CharSequence)"Pickaxe")) {
                    GhostBlocks.mc.theWorld.setBlockToAir(a5);
                    a2.Method2300(true);
                }
            }
        }
    }

    private boolean Method2067(BlockPos a2) {
        TileEntitySkull a3;
        Block a4 = GhostBlocks.mc.theWorld.getBlockState(a2).getBlock();
        if (a4 == Blocks.skull && (a3 = (TileEntitySkull)GhostBlocks.mc.theWorld.getTileEntity(a2)).getSkullType() == 3 && a3.getPlayerProfile() != null && a3.getPlayerProfile().getProperties() != null) {
            Property a5 = (Property)GhostBlocks.Method2068((Iterable)a3.getPlayerProfile().getProperties().get((Object)"textures"));
            return a5.getValue().equals((Object)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRkYjRhZGZhOWJmNDhmZjVkNDE3MDdhZTM0ZWE3OGJkMjM3MTY1OWZjZDhjZDg5MzQ3NDlhZjRjY2U5YiJ9fX0=");
        }
        return a4 == Blocks.lever || a4 == Blocks.chest || a4 == Blocks.trapped_chest;
    }

    public static Object Method2068(Iterable a2) {
        return Iterables.getFirst((Iterable)a2, null);
    }
}