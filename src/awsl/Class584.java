package awsl;

import java.util.Random;
import obfuscate.a;

public class Class584 implements Class593, Class594, Class595 {
   private static Random Field2745 = new Random();
   public short[] Field2746;
   private static final int Field2747 = 256;
   private static final int Field2748 = 255;
   private static final int Field2749 = 3;
   private static float[] Field2750;
   private static final int Field2751 = 100;
   private static final int Field2752 = 401;
   private static float[] Field2753;

   public Class584() {
      Class598.Method86();
      super();
      this.Field2746 = new short[]{225, 155, 210, 108, 175, 199, 221, 144, 203, 116, 70, 213, 69, 158, 33, 252, 5, 82, 173, 133, 222, 139, 174, 27, 9, 71, 90, 246, 75, 130, 91, 191, 169, 138, 2, 151, 194, 235, 81, 7, 25, 113, 228, 159, 205, 253, 134, 142, 248, 65, 224, 217, 22, 121, 229, 63, 89, 103, 96, 104, 156, 17, 201, 129, 36, 8, 165, 110, 237, 117, 231, 56, 132, 211, 152, 20, 181, 111, 239, 218, 170, 163, 51, 172, 157, 47, 80, 212, 176, 250, 87, 49, 99, 242, 136, 189, 162, 115, 44, 43, 124, 94, 150, 16, 141, 247, 32, 10, 198, 223, 255, 72, 53, 131, 84, 57, 220, 197, 58, 50, 208, 11, 241, 28, 3, 192, 62, 202, 18, 215, 153, 24, 76, 41, 15, 179, 39, 46, 55, 6, 128, 167, 23, 188, 106, 34, 187, 140, 164, 73, 112, 182, 244, 195, 227, 13, 35, 77, 196, 185, 26, 200, 226, 119, 31, 123, 168, 125, 249, 68, 183, 230, 177, 135, 160, 180, 12, 1, 243, 148, 102, 166, 38, 238, 251, 37, 240, 126, 64, 74, 161, 40, 184, 149, 171, 178, 101, 66, 29, 59, 146, 61, 254, 107, 42, 86, 154, 4, 236, 232, 120, 21, 233, 209, 45, 98, 193, 114, 78, 19, 206, 14, 118, 127, 48, 79, 147, 85, 30, 207, 219, 54, 88, 234, 190, 122, 95, 67, 143, 109, 137, 214, 145, 93, 92, 100, 245, 0, 216, 186, 60, 83, 105, 97, 204, 52};
      a.trash(new String[4]);
   }

   public float Method29(float a) {
      return this.Method20(a, 0.1F);
   }

   public float Method20(float a, float a) {
      float var10 = 0.0F;
      if (Field2750 == null) {
         Field2750 = Method284(665);
      }

      int var8 = Method283(a);
      float var11 = a - (float)var8;
      int var9 = Method283(a);
      float var12 = a - (float)var9;
      byte var16 = 2;

      for(int var3 = -var16; var3 <= var16; ++var3) {
         int var4 = -var16;
         if (var4 <= var16) {
            int var6 = this.Field2746[var8 + var3 + this.Field2746[var9 + var4 & 255] & 255];
            int var7 = 3;

            while(true) {
               int var17 = var6 * 4;
               float var13 = var11 - ((float)var3 + Field2750[var17++]);
               float var14 = var12 - ((float)var4 + Field2750[var17++]);
               float var15 = var13 * var13 + var14 * var14;
               var10 += this.Method155(var15) * Field2750[var17];
               --var7;
               var6 = var6 + 1 & 255;
            }
         }
      }

      return var10 / 3.0F;
   }

   public float Method67(float a, float a, float a) {
      Class598.Method86();
      float var13 = 0.0F;
      if (Field2750 == null) {
         Field2750 = Method284(665);
      }

      int var10 = Method283(a);
      float var14 = a - (float)var10;
      int var11 = Method283(a);
      float var15 = a - (float)var11;
      int var12 = Method283(a);
      float var16 = a - (float)var12;
      byte var21 = 2;
      int var5 = -var21;
      if (var5 <= var21) {
         int var6 = -var21;
         if (var6 <= var21) {
            int var7 = -var21;
            if (var7 <= var21) {
               int var8 = this.Field2746[var10 + var5 + this.Field2746[var11 + var6 + this.Field2746[var12 + var7 & 255] & 255] & 255];
               int var9 = 3;
               int var22 = var8 * 4;
               float var17 = var14 - ((float)var5 + Field2750[var22++]);
               float var18 = var15 - ((float)var6 + Field2750[var22++]);
               float var19 = var16 - ((float)var7 + Field2750[var22++]);
               float var20 = var17 * var17 + var18 * var18 + var19 * var19;
               var13 += this.Method155(var20) * Field2750[var22];
               --var9;
               var8 = var8 + 1 & 255;
               ++var7;
            }

            ++var6;
         }

         ++var5;
      }

      return var13 / 3.0F;
   }

   public static int Method283(float a) {
      int var1 = (int)a;
      return a < 0.0F && a != (float)var1 ? var1 - 1 : var1;
   }

   public float Method155(float a) {
      if (a >= 4.0F) {
         return 0.0F;
      } else {
         int var3;
         if (Field2753 == null) {
            Field2753 = new float[401];

            for(var3 = 0; var3 < 401; ++var3) {
               float var2 = (float)var3 / 100.0F;
               var2 = (float)Math.sqrt((double)var2);
               if (var2 < 1.0F) {
                  Field2753[var3] = 0.5F * (2.0F + var2 * var2 * (-5.0F + var2 * 3.0F));
               } else {
                  Field2753[var3] = 0.5F * (4.0F + var2 * (-8.0F + var2 * (5.0F - var2)));
               }
            }
         }

         a = a * 100.0F + 0.5F;
         var3 = Method283(a);
         return var3 >= 401 ? 0.0F : Field2753[var3];
      }
   }

   static float[] Method284(int a) {
      float[] var1 = new float[1024];
      Field2745 = new Random((long)a);

      for(int var2 = 0; var2 < 256; ++var2) {
         var1[var2++] = Field2745.nextFloat();
         var1[var2++] = Field2745.nextFloat();
         var1[var2++] = Field2745.nextFloat();
         var1[var2++] = 1.0F - 2.0F * Field2745.nextFloat();
      }

      return var1;
   }
}
