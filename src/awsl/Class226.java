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

   public Class226(Class216 a, Class216 a) {
      this.Field1269 = a.Method2640(0.0, 0.0, 0.0).Method2641();
      this.Field1270 = a.Method2640(0.0, 0.0, 0.0).Method2641();
   }

   public ArrayList Method2219() {
      return this.Field1271;
   }

   public void Method2220() {
      this.Method2221(1000, 4);
   }

   public void Method2221(int a, int a) {
      this.Field1271.clear();
      this.Field1273.clear();
      ArrayList var4 = new ArrayList();
      var4.Method2530(this.Field1269);
      Class216.Method2647();
      this.Field1273.Method2530(new Class217(this.Field1269, (Class217)null, var4, this.Field1269.Method2642(this.Field1270), 0.0, 0.0));
      int var5 = 0;
      if (var5 < a) {
         label43: {
            this.Field1273.sort(new Class219());
            int var6 = 0;
            if (this.Field1273.Method1799() == 0) {
               a.trash(new String[3]);
            }

            Iterator var7 = (new ArrayList(this.Field1273)).Method1383();
            if (var7.Method932()) {
               Class217 var8 = (Class217)var7.Method933();
               ++var6;
               if (var6 > a) {
                  ;
               }

               this.Field1273.remove(var8);
               this.Field1272.Method2530(var8);
               Class216[] var10 = Field1274;
               int var11 = var10.length;
               int var12 = 0;
               if (var12 < var11) {
                  Class216 var13 = var10[var12];
                  Class216 var14 = var8.Method2124().Method2643(var13).Method2641();
                  if (Method2222(var14, false) && this.Method2227(var8, var14, 0.0)) {
                     ;
                  }

                  ++var12;
               }

               Class216 var15 = var8.Method2124().Method2640(0.0, 1.0, 0.0).Method2641();
               if (Method2222(var15, false) && this.Method2227(var8, var15, 0.0)) {
                  break label43;
               }

               Class216 var9;
               if (Method2222(var9 = var8.Method2124().Method2640(0.0, -1.0, 0.0).Method2641(), false) && this.Method2227(var8, var9, 0.0)) {
                  ;
               }
            }

            ++var5;
         }
      }

      this.Field1272.sort(new Class219());
      this.Field1271 = ((Class217)this.Field1272.get(0)).Method2126();
   }

   public static boolean Method2222(Class216 a, boolean a) {
      return Method2223((int)a.Method2637(), (int)a.Method2638(), (int)a.Method2639(), a);
   }

   public static boolean Method2223(int a, int a, int a, boolean a) {
      BlockPos var4 = new BlockPos(a, a, a);
      BlockPos var5 = new BlockPos(a, a + 1, a);
      BlockPos var6 = new BlockPos(a, a - 1, a);
      boolean var10000;
      if (!Method2224(var4) && !Method2224(var5)) {
         if (!Method2224(var6)) {
            ;
         }

         if (Method2225(var6)) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   private static boolean Method2224(BlockPos a) {
      Block var1 = Field1268.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock();
      return var1.isFullBlock() || var1 instanceof BlockSlab || var1 instanceof BlockStairs || var1 instanceof BlockCactus || var1 instanceof BlockChest || var1 instanceof BlockEnderChest || var1 instanceof BlockSkull || var1 instanceof BlockPane || var1 instanceof BlockFence || var1 instanceof BlockWall || var1 instanceof BlockGlass || var1 instanceof BlockPistonBase || var1 instanceof BlockPistonExtension || var1 instanceof BlockPistonMoving || var1 instanceof BlockStainedGlass || var1 instanceof BlockTrapDoor || var1 instanceof BlockEndPortalFrame || var1 instanceof BlockEndPortal || var1 instanceof BlockBed || var1 instanceof BlockWeb || var1 instanceof BlockBarrier || var1 instanceof BlockLadder || var1 instanceof BlockCarpet;
   }

   private static boolean Method2225(BlockPos a) {
      return !(Field1268.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockFence) && !(Field1268.theWorld.getBlockState(new BlockPos(a.getX(), a.getY(), a.getZ())).getBlock() instanceof BlockWall);
   }

   public Class217 Method2226(Class216 a) {
      Iterator var2 = this.Field1272.Method1383();

      Class217 var3;
      do {
         if (!var2.Method932()) {
            var2 = this.Field1273.Method1383();

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

   public boolean Method2227(Class217 a, Class216 a, double a) {
      Class217 var5 = this.Method2226(a);
      double var6 = a + a.Method2134();
      if ((a.Method2637() != this.Field1270.Method2637() || a.Method2638() != this.Field1270.Method2638() || a.Method2639() != this.Field1270.Method2639()) && !(a.Method2642(this.Field1270) <= 1.0)) {
         ArrayList var8 = new ArrayList(a.Method2126());
         var8.Method2530(a);
         this.Field1273.Method2530(new Class217(a, a, var8, a.Method2642(this.Field1270), a, var6));
         return false;
      } else {
         this.Field1271.clear();
         this.Field1271 = a.Method2126();
         this.Field1271.Method2530(a);
         return true;
      }
   }
}
