/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.BlockPos
 */
package awsl;

import eventapi.Event;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;

public class Class649
implements Event {
    public int Field2918;
    public int Field2919;
    public int Field2920;
    private final Block Field2921;

    public Class649(BlockPos a, IBlockState a2) {
        this.Field2918 = a.getX();
        this.Field2919 = a.getY();
        this.Field2920 = a.getZ();
        this.Field2921 = a2.getBlock();
    }

    public int Method3513() {
        return this.Field2918;
    }

    public int Method3542() {
        return this.Field2919;
    }

    public int Method3543() {
        return this.Field2920;
    }

    public Block Method3544() {
        return this.Field2921;
    }
}