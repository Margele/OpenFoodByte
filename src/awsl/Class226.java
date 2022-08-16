/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBarrier
 *  net.minecraft.block.BlockBed
 *  net.minecraft.block.BlockCactus
 *  net.minecraft.block.BlockCarpet
 *  net.minecraft.block.BlockChest
 *  net.minecraft.block.BlockEndPortal
 *  net.minecraft.block.BlockEndPortalFrame
 *  net.minecraft.block.BlockEnderChest
 *  net.minecraft.block.BlockFence
 *  net.minecraft.block.BlockGlass
 *  net.minecraft.block.BlockLadder
 *  net.minecraft.block.BlockPane
 *  net.minecraft.block.BlockPistonBase
 *  net.minecraft.block.BlockPistonExtension
 *  net.minecraft.block.BlockPistonMoving
 *  net.minecraft.block.BlockSkull
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.BlockStainedGlass
 *  net.minecraft.block.BlockStairs
 *  net.minecraft.block.BlockTrapDoor
 *  net.minecraft.block.BlockWall
 *  net.minecraft.block.BlockWeb
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.BlockPos
 */
package awsl;

import awsl.Class216;
import awsl.Class217;
import awsl.Class219;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockEndPortal;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockWeb;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockPos;
import obfuscate.a;

public class Class226 {
    private static Minecraft Field1268 = Minecraft.getMinecraft();
    private final Class216 Field1269;
    private final Class216 Field1270;
    private ArrayList Field1271 = new ArrayList();
    private final ArrayList Field1272 = new ArrayList();
    private final ArrayList Field1273 = new ArrayList();
    private static final Class216[] Field1274 = new Class216[]{new Class216(1.0, 0.0, 0.0), new Class216(-1.0, 0.0, 0.0), new Class216(0.0, 0.0, 1.0), new Class216(0.0, 0.0, -1.0)};

    public Class226(Class216 a, Class216 a2) {
        this.Field1269 = a.Method2640(0.0, 0.0, 0.0).Method2641();
        this.Field1270 = a2.Method2640(0.0, 0.0, 0.0).Method2641();
    }

    public ArrayList Method2219() {
        return this.Field1271;
    }

    public void Method2220() {
        this.Method2221(1000, 4);
    }

    public void Method2221(int a2, int a3) {
        block8: {
            int a4;
            block9: {
                Class216 a5;
                Iterator iterator;
                this.Field1271.clear();
                this.Field1273.clear();
                ArrayList a6 = new ArrayList();
                a6.Method2530((Object)this.Field1269);
                String string = Class216.Method2647();
                this.Field1273.Method2530((Object)new Class217(this.Field1269, null, a6, this.Field1269.Method2642(this.Field1270), 0.0, 0.0));
                String a7 = string;
                a4 = 0;
                if (a4 >= a2) break block8;
                this.Field1273.sort((Comparator)new Class219());
                int a8 = 0;
                if (this.Field1273.Method1799() == 0) {
                    a.trash(new String[3]);
                }
                if (!(iterator = new ArrayList((Collection)this.Field1273).Method1383()).Method932()) break block9;
                Class217 a9 = (Class217)iterator.Method933();
                if (++a8 > a3) {
                }
                this.Field1273.remove((Object)a9);
                this.Field1272.Method2530((Object)a9);
                Class216[] class216Array = Field1274;
                int n = class216Array.length;
                int n2 = 0;
                if (n2 < n) {
                    Class216 a10 = class216Array[n2];
                    Class216 a11 = a9.Method2124().Method2643(a10).Method2641();
                    if (Class226.Method2222(a11, false) && this.Method2227(a9, a11, 0.0)) {
                    }
                    ++n2;
                }
                if (Class226.Method2222(a5 = a9.Method2124().Method2640(0.0, 1.0, 0.0).Method2641(), false) && this.Method2227(a9, a5, 0.0)) break block8;
                Class216 a12 = a9.Method2124().Method2640(0.0, -1.0, 0.0).Method2641();
                if (Class226.Method2222(a12, false) && this.Method2227(a9, a12, 0.0)) {
                }
            }
            ++a4;
        }
        this.Field1272.sort((Comparator)new Class219());
        this.Field1271 = ((Class217)this.Field1272.get(0)).Method2126();
    }

    public static boolean Method2222(Class216 a2, boolean a3) {
        return Class226.Method2223((int)a2.Method2637(), (int)a2.Method2638(), (int)a2.Method2639(), a3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Method2223(int a2, int a3, int a4, boolean a5) {
        BlockPos a6 = new BlockPos(a2, a3, a4);
        BlockPos a7 = new BlockPos(a2, a3 + 1, a4);
        BlockPos a8 = new BlockPos(a2, a3 - 1, a4);
        if (Class226.Method2224(a6)) return false;
        if (Class226.Method2224(a7)) return false;
        if (!Class226.Method2224(a8)) {
        }
        if (!Class226.Method2225(a8)) return false;
        return true;
    }

    private static boolean Method2224(BlockPos a2) {
        Block a3 = Class226.Field1268.theWorld.getBlockState(new BlockPos(a2.getX(), a2.getY(), a2.getZ())).getBlock();
        return a3.isFullBlock() || a3 instanceof BlockSlab || a3 instanceof BlockStairs || a3 instanceof BlockCactus || a3 instanceof BlockChest || a3 instanceof BlockEnderChest || a3 instanceof BlockSkull || a3 instanceof BlockPane || a3 instanceof BlockFence || a3 instanceof BlockWall || a3 instanceof BlockGlass || a3 instanceof BlockPistonBase || a3 instanceof BlockPistonExtension || a3 instanceof BlockPistonMoving || a3 instanceof BlockStainedGlass || a3 instanceof BlockTrapDoor || a3 instanceof BlockEndPortalFrame || a3 instanceof BlockEndPortal || a3 instanceof BlockBed || a3 instanceof BlockWeb || a3 instanceof BlockBarrier || a3 instanceof BlockLadder || a3 instanceof BlockCarpet;
    }

    private static boolean Method2225(BlockPos a2) {
        return !(Class226.Field1268.theWorld.getBlockState(new BlockPos(a2.getX(), a2.getY(), a2.getZ())).getBlock() instanceof BlockFence) && !(Class226.Field1268.theWorld.getBlockState(new BlockPos(a2.getX(), a2.getY(), a2.getZ())).getBlock() instanceof BlockWall);
    }

    public Class217 Method2226(Class216 a2) {
        Class217 a3;
        Iterator iterator = this.Field1272.Method1383();
        while (iterator.Method932()) {
            a3 = (Class217)iterator.Method933();
            if (a3.Method2124().Method2637() != a2.Method2637() || a3.Method2124().Method2638() != a2.Method2638() || a3.Method2124().Method2639() != a2.Method2639()) continue;
            return a3;
        }
        iterator = this.Field1273.Method1383();
        while (iterator.Method932()) {
            a3 = (Class217)iterator.Method933();
            if (a3.Method2124().Method2637() != a2.Method2637() || a3.Method2124().Method2638() != a2.Method2638() || a3.Method2124().Method2639() != a2.Method2639()) continue;
            return a3;
        }
        return null;
    }

    public boolean Method2227(Class217 a2, Class216 a3, double a4) {
        Class217 a5 = this.Method2226(a3);
        double a6 = a4;
        a6 += a2.Method2134();
        if (a3.Method2637() == this.Field1270.Method2637() && a3.Method2638() == this.Field1270.Method2638() && a3.Method2639() == this.Field1270.Method2639() || a3.Method2642(this.Field1270) <= 1.0) {
            this.Field1271.clear();
            this.Field1271 = a2.Method2126();
            this.Field1271.Method2530((Object)a3);
            return true;
        }
        ArrayList a7 = new ArrayList((Collection)a2.Method2126());
        a7.Method2530((Object)a3);
        this.Field1273.Method2530((Object)new Class217(a3, a2, a7, a3.Method2642(this.Field1270), a4, a6));
        return false;
    }
}