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
      long a = System.currentTimeMillis();
      this.Field82 = (float)(this.Field81 >> 16 & 255) * 0.003921569F;
      this.Field83 = (float)(this.Field81 >> 8 & 255) * 0.003921569F;
      this.Field84 = (float)(this.Field81 & 255) * 0.003921569F;
      this.Field98 = 10000.0F;
      this.Field99 = -10000.0F;
      this.Field91 = new float[(int)this.Field62 + 1];
      float a = 1.0F;
      int a = 0;
      if (a <= (int)this.Field62) {
         this.Field91[a] = (float)Math.pow(2.0, (double)(-a));
         float var10000 = a * this.Field63;
         ++a;
      }

      this.Field67 = -1.0F;
      this.Field68 = 1.0F;
      this.Field96 = (float)a.getWidth();
      this.Field97 = (float)a.getHeight();
      a = a.getHeight();
      this.Field92 = new float[a];
      int a = 0;
      if (a < a) {
         this.Field92[a] = (float)Math.tan((double)(this.Field90 * (float)a / (float)a) * Math.PI * 0.5);
         ++a;
      }

      a = this.Method1263(a, (ColorModel)null);
      a = (int)(63.0F * this.Field75);
      Graphics2D a = a.createGraphics();
      a.drawImage(this.Field93, 0, 0, a.getWidth(), a.getHeight(), a, 0, a + 1, 64, (ImageObserver)null);
      a.dispose();
      super.Method62(a, a);
      long a = System.currentTimeMillis();
      System.out.println(this.Field98 + " " + this.Field99 + " " + (float)(a - a) * 0.001F);
      this.Field91 = null;
      this.Field92 = null;
      return a;
   }

   public float Method20(float a, float a) {
      Class193.Method1269();
      float a = 0.0F;
      a += 371.0F;
      a += 529.0F;
      int a = 0;
      if (a < (int)this.Field62) {
         a += Class598.Method158(a, a, this.Field79) * this.Field91[a];
         a *= this.Field63;
         a *= this.Field63;
         ++a;
      }

      float a = this.Field62 - (float)((int)this.Field62);
      if (a != 0.0F) {
         a += a * Class598.Method158(a, a, this.Field79) * this.Field91[a];
      }

      return a;
   }

   public int Method3(int a, int a, int a) {
      Class193.Method1270();
      float a = (float)a / this.Field96;
      float a = (float)a / this.Field97;
      float a = (float)Math.pow((double)this.Field78, (double)(100.0F * a * a));
      float a = (float)(a >> 16 & 255) * 0.003921569F;
      float a = (float)(a >> 8 & 255) * 0.003921569F;
      float a = (float)(a & 255) * 0.003921569F;
      float a = this.Field96 * 0.5F;
      float a = (float)a - a;
      float a = (float)a;
      a = this.Field92[a];
      a = (a - 0.5F) * (1.0F + a);
      a += this.Field79 * this.Field87;
      a /= this.Field57;
      a /= this.Field57 * this.Field58;
      float a = this.Method20(a, a);
      a = (a + 1.23F) / 2.46F;
      int a = a & -16777216;
      float a = a - this.Field73;
      if (a < 0.0F) {
         a = 0.0F;
      }

      float a = 1.0F - (float)Math.pow((double)this.Field74, (double)a);
      this.Field98 = Math.min(this.Field98, a);
      this.Field99 = Math.max(this.Field99, a);
      float a = this.Field96 * this.Field85;
      float a = this.Field97 * this.Field86;
      float a = (float)a - a;
      float a = (float)a - a;
      float a = a * a + a * a;
      a = (float)Math.pow((double)a, (double)this.Field77);
      float a = 10.0F * (float)Math.exp((double)(-a * this.Field76 * 0.1F));
      a += a * this.Field82;
      a += a * this.Field83;
      a += a * this.Field84;
      float a = (1.0F - a * a * a * a) * this.Field60;
      float a = this.Field82 * a;
      float a = this.Field83 * a;
      float a = this.Field84 * a;
      a *= a;
      float a = 1.0F - a;
      a = a * a + a * a;
      a = a * a + a * a;
      a = a * a + a * a;
      float a = this.Field64;
      a = 1.0F - (float)Math.exp((double)(-a * a));
      a = 1.0F - (float)Math.exp((double)(-a * a));
      a = 1.0F - (float)Math.exp((double)(-a * a));
      int a = (int)(255.0F * a) << 16;
      int a = (int)(255.0F * a) << 8;
      int a = (int)(255.0F * a);
      int a = -16777216 | a | a | a;
      a.trash(new String[4]);
      return a;
   }

   public String toString() {
      return "Texture/Sky...";
   }
}
