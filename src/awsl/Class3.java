package awsl;

import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.util.Random;
import obfuscate.a;

public class Class3 extends Class119 {
   private float Field57 = 0.1F;
   private float Field58 = 1.0F;
   private float Field59 = 0.0F;
   private float Field60 = 1.0F;
   private float Field61 = 1.0F;
   private float Field62 = 8.0F;
   private float Field63 = 2.0F;
   private float Field64 = 1.0F;
   private float Field65 = 0.6F;
   private int Field66;
   private float Field67;
   private float Field68;
   private boolean Field69;
   private Class591 Field70;
   protected Random Field71 = new Random();
   private Class594 Field72;
   private float Field73 = 0.5F;
   private float Field74 = 0.5F;
   private float Field75 = 0.3F;
   private float Field76 = 0.5F;
   private float Field77 = 0.5F;
   private float Field78 = 0.96F;
   private float Field79 = 0.0F;
   private float Field80 = 10.0F;
   private int Field81 = -1;
   private float Field82;
   private float Field83;
   private float Field84;
   private float Field85 = 0.5F;
   private float Field86 = 0.5F;
   private float Field87 = 0.0F;
   private float Field88 = 0.0F;
   private float Field89 = 0.0F;
   private float Field90 = 1.0F;
   private float[] Field91;
   private float[] Field92;
   private BufferedImage Field93;
   private int[] Field94;
   private static final float Field95 = 0.003921569F;
   private float Field96;
   private float Field97;
   float Field98;
   float Field99;

   public Class3() {
      if (this.Field93 == null) {
         this.Field93 = Class779.Method835(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("SkyColors.png")).getSource());
      }

   }

   public void Method56(float a) {
      this.Field60 = a;
   }

   public float Method57() {
      return this.Field60;
   }

   public void Method9(int a) {
      this.Field66 = a;
   }

   public int Method10() {
      return this.Field66;
   }

   public void Method58(float a) {
      this.Field57 = a;
   }

   public float Method59() {
      return this.Field57;
   }

   public void Method60(float a) {
      this.Field58 = a;
   }

   public float Method61() {
      return this.Field58;
   }

   public void Method164(float a) {
      this.Field79 = a;
   }

   public float Method165() {
      return this.Field79;
   }

   public void Method166(float a) {
      this.Field90 = a;
   }

   public float Method167() {
      return this.Field90;
   }

   public void Method168(float a) {
      this.Field73 = a;
   }

   public float Method169() {
      return this.Field73;
   }

   public void Method170(float a) {
      this.Field74 = a;
   }

   public float Method171() {
      return this.Field74;
   }

   public void Method172(float a) {
      this.Field75 = a;
   }

   public float Method173() {
      return this.Field75;
   }

   public void Method174(float a) {
      this.Field76 = a;
   }

   public float Method175() {
      return this.Field76;
   }

   public void Method868(float a) {
      this.Field77 = a;
   }

   public float Method869() {
      return this.Field77;
   }

   public void Method870(float a) {
      this.Field59 = a;
   }

   public float Method871() {
      return this.Field59;
   }

   public void Method872(float a) {
      this.Field62 = a;
   }

   public float Method873() {
      return this.Field62;
   }

   public void Method874(float a) {
      this.Field61 = a;
   }

   public float Method875() {
      return this.Field61;
   }

   public void Method927(float a) {
      this.Field63 = a;
   }

   public float Method928() {
      return this.Field63;
   }

   public void Method929(float a) {
      this.Field64 = a;
   }

   public float Method930() {
      return this.Field64;
   }

   public void Method1853(float a) {
      this.Field65 = a;
   }

   public float Method1854() {
      return this.Field65;
   }

   public void Method1855(float a) {
      this.Field78 = a;
   }

   public float Method1856() {
      return this.Field78;
   }

   public void Method1857(float a) {
      this.Field86 = a;
   }

   public float Method1858() {
      return this.Field86;
   }

   public void Method1859(float a) {
      this.Field85 = a;
   }

   public float Method1860() {
      return this.Field85;
   }

   public void Method11(int a) {
      this.Field81 = a;
   }

   public int Method12() {
      return this.Field81;
   }

   public void Method1861(float a) {
      this.Field89 = a;
   }

   public float Method1862() {
      return this.Field89;
   }

   public void Method1863(float a) {
      this.Field88 = a;
   }

   public float Method1864() {
      return this.Field88;
   }

   public void Method1865(float a) {
      this.Field87 = a;
   }

   public float Method1866() {
      return this.Field87;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      long var4 = System.currentTimeMillis();
      this.Field82 = (float)(this.Field81 >> 16 & 255) * 0.003921569F;
      this.Field83 = (float)(this.Field81 >> 8 & 255) * 0.003921569F;
      this.Field84 = (float)(this.Field81 & 255) * 0.003921569F;
      this.Field98 = 10000.0F;
      this.Field99 = -10000.0F;
      this.Field91 = new float[(int)this.Field62 + 1];
      float var6 = 1.0F;
      int var7 = 0;
      if (var7 <= (int)this.Field62) {
         this.Field91[var7] = (float)Math.pow(2.0, (double)(-var7));
         float var10000 = var6 * this.Field63;
         ++var7;
      }

      this.Field67 = -1.0F;
      this.Field68 = 1.0F;
      this.Field96 = (float)a.getWidth();
      this.Field97 = (float)a.getHeight();
      var7 = a.getHeight();
      this.Field92 = new float[var7];
      int var8 = 0;
      if (var8 < var7) {
         this.Field92[var8] = (float)Math.tan((double)(this.Field90 * (float)var8 / (float)var7) * Math.PI * 0.5);
         ++var8;
      }

      a = this.Method1263(a, (ColorModel)null);
      var8 = (int)(63.0F * this.Field75);
      Graphics2D var9 = a.createGraphics();
      var9.drawImage(this.Field93, 0, 0, a.getWidth(), a.getHeight(), var8, 0, var8 + 1, 64, (ImageObserver)null);
      var9.dispose();
      super.Method62(a, a);
      long var11 = System.currentTimeMillis();
      System.out.println(this.Field98 + " " + this.Field99 + " " + (float)(var11 - var4) * 0.001F);
      this.Field91 = null;
      this.Field92 = null;
      return a;
   }

   public float Method20(float a, float a) {
      Class193.Method1269();
      float var4 = 0.0F;
      a += 371.0F;
      a += 529.0F;
      int var6 = 0;
      if (var6 < (int)this.Field62) {
         var4 += Class598.Method158(a, a, this.Field79) * this.Field91[var6];
         a *= this.Field63;
         a *= this.Field63;
         ++var6;
      }

      float var5 = this.Field62 - (float)((int)this.Field62);
      if (var5 != 0.0F) {
         var4 += var5 * Class598.Method158(a, a, this.Field79) * this.Field91[var6];
      }

      return var4;
   }

   public int Method3(int a, int a, int a) {
      Class193.Method1270();
      float var5 = (float)a / this.Field96;
      float var6 = (float)a / this.Field97;
      float var7 = (float)Math.pow((double)this.Field78, (double)(100.0F * var6 * var6));
      float var8 = (float)(a >> 16 & 255) * 0.003921569F;
      float var9 = (float)(a >> 8 & 255) * 0.003921569F;
      float var10 = (float)(a & 255) * 0.003921569F;
      float var11 = this.Field96 * 0.5F;
      float var12 = (float)a - var11;
      float var13 = (float)a;
      var13 = this.Field92[a];
      var12 = (var5 - 0.5F) * (1.0F + var13);
      var13 += this.Field79 * this.Field87;
      var12 /= this.Field57;
      var13 /= this.Field57 * this.Field58;
      float var14 = this.Method20(var12, var13);
      var14 = (var14 + 1.23F) / 2.46F;
      int var16 = a & -16777216;
      float var18 = var14 - this.Field73;
      if (var18 < 0.0F) {
         var18 = 0.0F;
      }

      float var19 = 1.0F - (float)Math.pow((double)this.Field74, (double)var18);
      this.Field98 = Math.min(this.Field98, var19);
      this.Field99 = Math.max(this.Field99, var19);
      float var20 = this.Field96 * this.Field85;
      float var21 = this.Field97 * this.Field86;
      float var22 = (float)a - var20;
      float var23 = (float)a - var21;
      float var24 = var22 * var22 + var23 * var23;
      var24 = (float)Math.pow((double)var24, (double)this.Field77);
      float var25 = 10.0F * (float)Math.exp((double)(-var24 * this.Field76 * 0.1F));
      var8 += var25 * this.Field82;
      var9 += var25 * this.Field83;
      var10 += var25 * this.Field84;
      float var26 = (1.0F - var19 * var19 * var19 * var19) * this.Field60;
      float var27 = this.Field82 * var26;
      float var28 = this.Field83 * var26;
      float var29 = this.Field84 * var26;
      var19 *= var7;
      float var30 = 1.0F - var19;
      var8 = var30 * var8 + var19 * var27;
      var9 = var30 * var9 + var19 * var28;
      var10 = var30 * var10 + var19 * var29;
      float var31 = this.Field64;
      var8 = 1.0F - (float)Math.exp((double)(-var8 * var31));
      var9 = 1.0F - (float)Math.exp((double)(-var9 * var31));
      var10 = 1.0F - (float)Math.exp((double)(-var10 * var31));
      int var32 = (int)(255.0F * var8) << 16;
      int var33 = (int)(255.0F * var9) << 8;
      int var34 = (int)(255.0F * var10);
      int var17 = -16777216 | var32 | var33 | var34;
      a.trash(new String[4]);
      return var17;
   }

   public String toString() {
      return "Texture/Sky...";
   }
}
