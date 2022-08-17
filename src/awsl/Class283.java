package awsl;

import java.util.ArrayList;
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

   public Class283(Class216 a, Class216 a) {
      this.Field1530 = a.Method2640(0.0, 0.0, 0.0).Method2641();
      this.Field1531 = a.Method2640(0.0, 0.0, 0.0).Method2641();
   }

   public ArrayList Method3085() {
      return this.Field1532;
   }

   public void Method3086() {
      this.Method3087(1000, 4);
   }

   public void Method3087(int a, int a) {
      this.Field1532.clear();
      this.Field1534.clear();
      ArrayList var3 = new ArrayList();
      var3.Method2530(this.Field1530);
      this.Field1534.Method2530(new Class217(this.Field1530, (Class217)null, var3, this.Field1530.Method2642(this.Field1531), 0.0, 0.0));

      label53:
      for(int var4 = 0; var4 < a; ++var4) {
         this.Field1534.sort(new Class282());
         int var5 = 0;
         if (this.Field1534.Method1799() == 0) {
            break;
         }

         Iterator var6 = (new ArrayList(this.Field1534)).Method1383();

         while(var6.Method932()) {
            Class217 var7 = (Class217)var6.Method933();
            ++var5;
            if (var5 > a) {
               break;
            }

            this.Field1534.remove(var7);
            this.Field1533.Method2530(var7);
            Class216[] var9 = Field1535;
            int var10 = var9.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               Class216 var12 = var9[var11];
               Class216 var13 = var7.Method2124().Method2643(var12).Method2641();
               if (Method3088(var13, false) && this.Method3093(var7, var13, 0.0)) {
                  break label53;
               }
            }

            Class216 var14 = var7.Method2124().Method2640(0.0, 1.0, 0.0).Method2641();
            Class216 var8;
            if (Method3088(var14, false) && this.Method3093(var7, var14, 0.0) || Method3088(var8 = var7.Method2124().Method2640(0.0, -1.0, 0.0).Method2641(), false) && this.Method3093(var7, var8, 0.0)) {
               break label53;
            }
         }
      }

      this.Field1533.sort(new Class282());
      this.Field1532 = ((Class217)this.Field1533.get(0)).Method2126();
   }

   public static boolean Method3088(Class216 a, boolean a) {
      return Method3089((int)a.Method2637(), (int)a.Method2638(), (int)a.Method2639(), a);
   }

   public static boolean Method3089(int a, int a, int a, boolean a) {
      BlockPos var4 = new BlockPos(a, a, a);
      BlockPos var5 = new BlockPos(a, a + 1, a);
      BlockPos var6 = new BlockPos(a, a - 1, a);
      boolean var10000;
      if (!Method3090(var4) && !Method3090(var5)) {
         if (!Method3090(var6)) {
            ;
         }

         if (Method3091(var6)) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   private static boolean Method3090(BlockPos a) {
      Block var1 = Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock();
      return var1.isFullBlock() || var1 instanceof BlockSlab || var1 instanceof BlockStairs || var1 instanceof BlockCactus || var1 instanceof BlockChest || var1 instanceof BlockEnderChest || var1 instanceof BlockSkull || var1 instanceof BlockPane || var1 instanceof BlockFence || var1 instanceof BlockWall || var1 instanceof BlockGlass || var1 instanceof BlockPistonBase || var1 instanceof BlockPistonExtension || var1 instanceof BlockPistonMoving || var1 instanceof BlockStainedGlass || var1 instanceof BlockTrapDoor || var1 instanceof BlockEndPortalFrame || var1 instanceof BlockEndPortal || var1 instanceof BlockBed || var1 instanceof BlockWeb || var1 instanceof BlockBarrier || var1 instanceof BlockLadder || var1 instanceof BlockCarpet;
   }

   private static boolean Method3091(BlockPos a) {
      return !(Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockFence) && !(Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockWall);
   }

   public Class217 Method3092(Class216 a) {
      Iterator var2 = this.Field1533.Method1383();

      Class217 var3;
      do {
         if (!var2.Method932()) {
            var2 = this.Field1534.Method1383();

            do {
               if (!var2.Method932()) {
                  return null;
               }

               var3 = (Class217)var2.Method933();
            } while(var3.Method2124().Method2637() != a.Method2637() || var3.Method2124().Method2638() != a.Method2638() || var3.Method2124().Method2639() != a.Method2639());

            return var3;
         }

         var3 = (Class217)var2.Method933();
      } while(var3.Method2124().Method2637() != a.Method2637() || var3.Method2124().Method2638() != a.Method2638() || var3.Method2124().Method2639() != a.Method2639());

      return var3;
   }

   public boolean Method3093(Class217 a, Class216 a, double a) {
      Class217 var5 = this.Method3092(a);
      double var6 = a + a.Method2134();
      double var8 = 9.5;
      if ((a.Method2637() != this.Field1531.Method2637() || a.Method2638() != this.Field1531.Method2638() || a.Method2639() != this.Field1531.Method2639()) && !(a.Method2642(this.Field1531) <= 9.5)) {
         ArrayList var10 = new ArrayList(a.Method2126());
         var10.Method2530(a);
         this.Field1534.Method2530(new Class217(a, a, var10, a.Method2642(this.Field1531), a, var6));
         return false;
      } else {
         this.Field1532.clear();
         this.Field1532 = a.Method2126();
         this.Field1532.Method2530(a);
         return true;
      }
   }

   public static boolean Method3094(BlockPos a) {
      Block var1 = Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock();
      return var1.getMaterial() == Material.air || var1.getMaterial() == Material.plants || var1.getMaterial() == Material.vine || var1 == Blocks.ladder || var1 == Blocks.water || var1 == Blocks.flowing_water || var1 == Blocks.wall_sign || var1 == Blocks.standing_sign;
   }

   public static ArrayList Method3095(Class216 a, Class216 a) {
      String var2 = Class216.Method2647();
      if (!Method3094(new BlockPos(a.Method2644()))) {
         a = a.Method2640(0.0, 1.0, 0.0);
      }

      Class226 var3 = new Class226(a, a);
      var3.Method2220();
      int var4 = 0;
      Object var5 = null;
      Class216 var6 = null;
      ArrayList var7 = new ArrayList();
      ArrayList var8 = var3.Method2219();
      Iterator var9 = var8.Method1383();
      if (var9.Method932()) {
         Class216 var10 = (Class216)var9.Method933();
         if (var4 == var8.Method1799() - 1) {
            var7.Method2530(((Class216)var5).Method2640(0.5, 0.0, 0.5));
            var7.Method2530(var10.Method2640(0.5, 0.0, 0.5));
            var6 = var10;
         }

         boolean var11 = true;
         if (var10.Method2642(var6) > 25.0) {
            var11 = false;
         }

         double var12 = Math.min(var6.Method2637(), var10.Method2637());
         double var14 = Math.min(var6.Method2638(), var10.Method2638());
         double var16 = Math.min(var6.Method2639(), var10.Method2639());
         double var18 = Math.max(var6.Method2637(), var10.Method2637());
         double var20 = Math.max(var6.Method2638(), var10.Method2638());
         double var22 = Math.max(var6.Method2639(), var10.Method2639());
         int var24 = (int)var12;
         if ((double)var24 <= var18) {
            int var25 = (int)var14;
            if ((double)var25 <= var20) {
               int var26 = (int)var16;
               if ((double)var26 <= var22) {
                  if (!Method3089(var24, var25, var26, false)) {
                     var11 = false;
                  }

                  ++var26;
               }

               ++var25;
            }

            ++var24;
         }

         var7.Method2530(((Class216)var5).Method2640(0.5, 0.0, 0.5));
         ++var4;
      }

      return var7;
   }
}
