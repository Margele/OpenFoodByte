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
      ArrayList a = new ArrayList();
      a.Method2530(this.Field1530);
      this.Field1534.Method2530(new Class217(this.Field1530, (Class217)null, a, this.Field1530.Method2642(this.Field1531), 0.0, 0.0));

      label53:
      for(int a = 0; a < a; ++a) {
         this.Field1534.sort(new Class282());
         int a = 0;
         if (this.Field1534.Method1799() == 0) {
            break;
         }

         Iterator var6 = (new ArrayList(this.Field1534)).Method1383();

         while(var6.Method932()) {
            Class217 a = (Class217)var6.Method933();
            ++a;
            if (a > a) {
               break;
            }

            this.Field1534.remove(a);
            this.Field1533.Method2530(a);
            Class216[] var9 = Field1535;
            int var10 = var9.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               Class216 a = var9[var11];
               Class216 a = a.Method2124().Method2643(a).Method2641();
               if (Method3088(a, false) && this.Method3093(a, a, 0.0)) {
                  break label53;
               }
            }

            Class216 a = a.Method2124().Method2640(0.0, 1.0, 0.0).Method2641();
            Class216 a;
            if (Method3088(a, false) && this.Method3093(a, a, 0.0) || Method3088(a = a.Method2124().Method2640(0.0, -1.0, 0.0).Method2641(), false) && this.Method3093(a, a, 0.0)) {
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

   public static boolean Method3089(int a, int a, int a, boolean a3) {
      BlockPos a = new BlockPos(a, a, a);
      BlockPos a = new BlockPos(a, a + 1, a);
      BlockPos a = new BlockPos(a, a - 1, a);
      boolean var10000;
      if (!Method3090(a) && !Method3090(a)) {
         if (!Method3090(a)) {
            ;
         }

         if (Method3091(a)) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   private static boolean Method3090(BlockPos a) {
      Block a = Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock();
      return a.isFullBlock() || a instanceof BlockSlab || a instanceof BlockStairs || a instanceof BlockCactus || a instanceof BlockChest || a instanceof BlockEnderChest || a instanceof BlockSkull || a instanceof BlockPane || a instanceof BlockFence || a instanceof BlockWall || a instanceof BlockGlass || a instanceof BlockPistonBase || a instanceof BlockPistonExtension || a instanceof BlockPistonMoving || a instanceof BlockStainedGlass || a instanceof BlockTrapDoor || a instanceof BlockEndPortalFrame || a instanceof BlockEndPortal || a instanceof BlockBed || a instanceof BlockWeb || a instanceof BlockBarrier || a instanceof BlockLadder || a instanceof BlockCarpet;
   }

   private static boolean Method3091(BlockPos a) {
      return !(Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockFence) && !(Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockWall);
   }

   public Class217 Method3092(Class216 a) {
      Iterator var2 = this.Field1533.Method1383();

      Class217 a;
      do {
         if (!var2.Method932()) {
            var2 = this.Field1534.Method1383();

            do {
               if (!var2.Method932()) {
                  return null;
               }

               a = (Class217)var2.Method933();
            } while(a.Method2124().Method2637() != a.Method2637() || a.Method2124().Method2638() != a.Method2638() || a.Method2124().Method2639() != a.Method2639());

            return a;
         }

         a = (Class217)var2.Method933();
      } while(a.Method2124().Method2637() != a.Method2637() || a.Method2124().Method2638() != a.Method2638() || a.Method2124().Method2639() != a.Method2639());

      return a;
   }

   public boolean Method3093(Class217 a, Class216 a, double a) {
      Class217 a = this.Method3092(a);
      double a = a + a.Method2134();
      double a = 9.5;
      if ((a.Method2637() != this.Field1531.Method2637() || a.Method2638() != this.Field1531.Method2638() || a.Method2639() != this.Field1531.Method2639()) && !(a.Method2642(this.Field1531) <= 9.5)) {
         ArrayList a = new ArrayList(a.Method2126());
         a.Method2530(a);
         this.Field1534.Method2530(new Class217(a, a, a, a.Method2642(this.Field1531), a, a));
         return false;
      } else {
         this.Field1532.clear();
         this.Field1532 = a.Method2126();
         this.Field1532.Method2530(a);
         return true;
      }
   }

   public static boolean Method3094(BlockPos a) {
      Block a = Field1529.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock();
      return a.getMaterial() == Material.air || a.getMaterial() == Material.plants || a.getMaterial() == Material.vine || a == Blocks.ladder || a == Blocks.water || a == Blocks.flowing_water || a == Blocks.wall_sign || a == Blocks.standing_sign;
   }

   public static ArrayList Method3095(Class216 a, Class216 a) {
      String a = Class216.Method2647();
      if (!Method3094(new BlockPos(a.Method2644()))) {
         a = a.Method2640(0.0, 1.0, 0.0);
      }

      Class226 a = new Class226(a, a);
      a.Method2220();
      int a = 0;
      Class216 a = null;
      Class216 a = null;
      ArrayList a = new ArrayList();
      ArrayList a = a.Method2219();
      Iterator var9 = a.Method1383();
      if (var9.Method932()) {
         Class216 a = (Class216)var9.Method933();
         if (a == a.Method1799() - 1) {
            a.Method2530(((Class216)a).Method2640(0.5, 0.0, 0.5));
            a.Method2530(a.Method2640(0.5, 0.0, 0.5));
            a = a;
         }

         boolean a = true;
         if (a.Method2642(a) > 25.0) {
            a = false;
         }

         double a = Math.min(a.Method2637(), a.Method2637());
         double a = Math.min(a.Method2638(), a.Method2638());
         double a = Math.min(a.Method2639(), a.Method2639());
         double a = Math.max(a.Method2637(), a.Method2637());
         double a = Math.max(a.Method2638(), a.Method2638());
         double a = Math.max(a.Method2639(), a.Method2639());
         int a = (int)a;
         if ((double)a <= a) {
            int a = (int)a;
            if ((double)a <= a) {
               int a = (int)a;
               if ((double)a <= a) {
                  if (!Method3089(a, a, a, false)) {
                     a = false;
                  }

                  ++a;
               }

               ++a;
            }

            ++a;
         }

         a.Method2530(((Class216)a).Method2640(0.5, 0.0, 0.5));
         ++a;
      }

      return a;
   }
}
