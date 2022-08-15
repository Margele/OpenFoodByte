/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
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
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.BlockPos
 */
package awsl;

import awsl.Class216;
import awsl.Class217;
import awsl.Class226;
import awsl.Class282;
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
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;

public class Class283 {
    private static Minecraft Field1529 = Minecraft.getMinecraft();
    private final Class216 Field1530;
    private final Class216 Field1531;
    private ArrayList Field1532 = new ArrayList();
    private final ArrayList Field1533 = new ArrayList();
    private final ArrayList Field1534 = new ArrayList();
    private static final Class216[] Field1535 = new Class216[]{new Class216(1.0, 0.0, 0.0), new Class216(-1.0, 0.0, 0.0), new Class216(0.0, 0.0, 1.0), new Class216(0.0, 0.0, -1.0)};

    public Class283(Class216 a, Class216 a2) {
        this.Field1530 = a.Method2640(0.0, 0.0, 0.0).Method2641();
        this.Field1531 = a2.Method2640(0.0, 0.0, 0.0).Method2641();
    }

    public ArrayList Method3085() {
        return this.Field1532;
    }

    public void Method3086() {
        this.Method3087(1000, 4);
    }

    public void Method3087(int a, int a2) {
        this.Field1532.clear();
        this.Field1534.clear();
        ArrayList a3 = new ArrayList();
        a3.Method2530((Object)this.Field1530);
        this.Field1534.Method2530((Object)new Class217(this.Field1530, null, a3, this.Field1530.Method2642(this.Field1531), 0.0, 0.0));
        block0: for (int a4 = 0; a4 < a; ++a4) {
            this.Field1534.sort((Comparator)new Class282());
            int a5 = 0;
            if (this.Field1534.Method1799() == 0) break;
            Iterator iterator = new ArrayList((Collection)this.Field1534).Method1383();
            while (iterator.Method932()) {
                Class216 a6;
                Class217 a7 = (Class217)iterator.Method933();
                if (++a5 > a2) continue block0;
                this.Field1534.remove((Object)a7);
                this.Field1533.Method2530((Object)a7);
                for (Class216 a8 : Field1535) {
                    Class216 a9 = a7.Method2124().Method2643(a8).Method2641();
                    if (Class283.Method3088(a9, false) && this.Method3093(a7, a9, 0.0)) break block0;
                }
                Class216 a10 = a7.Method2124().Method2640(0.0, 1.0, 0.0).Method2641();
                if ((!Class283.Method3088(a10, false) || !this.Method3093(a7, a10, 0.0)) && (!Class283.Method3088(a6 = a7.Method2124().Method2640(0.0, -1.0, 0.0).Method2641(), false) || !this.Method3093(a7, a6, 0.0))) continue;
                break block0;
            }
        }
        this.Field1533.sort((Comparator)new Class282());
        this.Field1532 = ((Class217)this.Field1533.get(0)).Method2126();
    }

    public static boolean Method3088(Class216 a, boolean a2) {
        return Class283.Method3089((int)a.Method2637(), (int)a.Method2638(), (int)a.Method2639(), a2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Method3089(int a, int a2, int a3, boolean a4) {
        BlockPos a5 = new BlockPos(a, a2, a3);
        BlockPos a6 = new BlockPos(a, a2 + 1, a3);
        BlockPos a7 = new BlockPos(a, a2 - 1, a3);
        if (Class283.Method3090(a5)) return false;
        if (Class283.Method3090(a6)) return false;
        if (!Class283.Method3090(a7)) {
        }
        if (!Class283.Method3091(a7)) return false;
        return true;
    }

    private static boolean Method3090(BlockPos a) {
        Block a2 = Class283.Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock();
        return a2.isFullBlock() || a2 instanceof BlockSlab || a2 instanceof BlockStairs || a2 instanceof BlockCactus || a2 instanceof BlockChest || a2 instanceof BlockEnderChest || a2 instanceof BlockSkull || a2 instanceof BlockPane || a2 instanceof BlockFence || a2 instanceof BlockWall || a2 instanceof BlockGlass || a2 instanceof BlockPistonBase || a2 instanceof BlockPistonExtension || a2 instanceof BlockPistonMoving || a2 instanceof BlockStainedGlass || a2 instanceof BlockTrapDoor || a2 instanceof BlockEndPortalFrame || a2 instanceof BlockEndPortal || a2 instanceof BlockBed || a2 instanceof BlockWeb || a2 instanceof BlockBarrier || a2 instanceof BlockLadder || a2 instanceof BlockCarpet;
    }

    private static boolean Method3091(BlockPos a) {
        return !(Class283.Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockFence) && !(Class283.Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockWall);
    }

    public Class217 Method3092(Class216 a) {
        Class217 a2;
        Iterator iterator = this.Field1533.Method1383();
        while (iterator.Method932()) {
            a2 = (Class217)iterator.Method933();
            if (a2.Method2124().Method2637() != a.Method2637() || a2.Method2124().Method2638() != a.Method2638() || a2.Method2124().Method2639() != a.Method2639()) continue;
            return a2;
        }
        iterator = this.Field1534.Method1383();
        while (iterator.Method932()) {
            a2 = (Class217)iterator.Method933();
            if (a2.Method2124().Method2637() != a.Method2637() || a2.Method2124().Method2638() != a.Method2638() || a2.Method2124().Method2639() != a.Method2639()) continue;
            return a2;
        }
        return null;
    }

    public boolean Method3093(Class217 a, Class216 a2, double a3) {
        Class217 a4 = this.Method3092(a2);
        double a5 = a3;
        a5 += a.Method2134();
        double a6 = 9.5;
        if (a2.Method2637() == this.Field1531.Method2637() && a2.Method2638() == this.Field1531.Method2638() && a2.Method2639() == this.Field1531.Method2639() || a2.Method2642(this.Field1531) <= 9.5) {
            this.Field1532.clear();
            this.Field1532 = a.Method2126();
            this.Field1532.Method2530((Object)a2);
            return true;
        }
        ArrayList a7 = new ArrayList((Collection)a.Method2126());
        a7.Method2530((Object)a2);
        this.Field1534.Method2530((Object)new Class217(a2, a, a7, a2.Method2642(this.Field1531), a3, a5));
        return false;
    }

    public static boolean Method3094(BlockPos a) {
        Block a2 = Class283.Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock();
        return a2.getMaterial() == Material.air || a2.getMaterial() == Material.plants || a2.getMaterial() == Material.vine || a2 == Blocks.ladder || a2 == Blocks.water || a2 == Blocks.flowing_water || a2 == Blocks.wall_sign || a2 == Blocks.standing_sign;
    }

    public static ArrayList Method3095(Class216 a, Class216 a2) {
        String a3 = Class216.Method2647();
        if (!Class283.Method3094(new BlockPos(a.Method2644()))) {
            a = a.Method2640(0.0, 1.0, 0.0);
        }
        Class226 a4 = new Class226(a, a2);
        a4.Method2220();
        int a5 = 0;
        Class216 a6 = null;
        Class216 a7 = null;
        ArrayList a8 = new ArrayList();
        ArrayList a9 = a4.Method2219();
        Iterator iterator = a9.Method1383();
        if (iterator.Method932()) {
            Class216 a10 = (Class216)iterator.Method933();
            if (a5 == a9.Method1799() - 1) {
                a8.Method2530((Object)a6.Method2640(0.5, 0.0, 0.5));
                a8.Method2530((Object)a10.Method2640(0.5, 0.0, 0.5));
                a7 = a10;
            }
            boolean a11 = true;
            if (a10.Method2642(a7) > 25.0) {
                a11 = false;
            }
            double a12 = Math.min((double)a7.Method2637(), (double)a10.Method2637());
            double a13 = Math.min((double)a7.Method2638(), (double)a10.Method2638());
            double a14 = Math.min((double)a7.Method2639(), (double)a10.Method2639());
            double a15 = Math.max((double)a7.Method2637(), (double)a10.Method2637());
            double a16 = Math.max((double)a7.Method2638(), (double)a10.Method2638());
            double a17 = Math.max((double)a7.Method2639(), (double)a10.Method2639());
            int a18 = (int)a12;
            if ((double)a18 <= a15) {
                int a19 = (int)a13;
                if ((double)a19 <= a16) {
                    int a20 = (int)a14;
                    if ((double)a20 <= a17) {
                        if (!Class283.Method3089(a18, a19, a20, false)) {
                            a11 = false;
                        }
                        ++a20;
                    }
                    ++a19;
                }
                ++a18;
            }
            a8.Method2530((Object)a6.Method2640(0.5, 0.0, 0.5));
            a7 = a6;
            a6 = a10;
            ++a5;
        }
        return a8;
    }
}