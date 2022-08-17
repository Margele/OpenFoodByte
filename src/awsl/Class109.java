package awsl;

public class Class109 extends Class119 {
   private int Field853;
   private int Field854;
   private int Field855;
   private int Field856;
   private int Field857;
   private int Field858;
   private int Field859;
   private int Field860;
   private int Field861;
   private int Field862;
   private int Field863;
   private int Field864;
   private int Field865;
   private int Field866;
   private int Field867;
   private int Field868;
   private int Field869;
   private int Field870;

   public Class109() {
      this.Method9(-65536);
      this.Method11(-65281);
      this.Method13(-16776961);
      this.Method15(-16711681);
   }

   public void Method9(int a) {
      this.Field855 = a;
      this.Field859 = a >> 16 & 255;
      this.Field860 = a >> 8 & 255;
      this.Field861 = a & 255;
   }

   public int Method10() {
      return this.Field855;
   }

   public void Method11(int a) {
      this.Field856 = a;
      this.Field862 = a >> 16 & 255;
      this.Field863 = a >> 8 & 255;
      this.Field864 = a & 255;
   }

   public int Method12() {
      return this.Field856;
   }

   public void Method13(int a) {
      this.Field857 = a;
      this.Field865 = a >> 16 & 255;
      this.Field866 = a >> 8 & 255;
      this.Field867 = a & 255;
   }

   public int Method14() {
      return this.Field857;
   }

   public void Method15(int a) {
      this.Field858 = a;
      this.Field868 = a >> 16 & 255;
      this.Field869 = a >> 8 & 255;
      this.Field870 = a & 255;
   }

   public int Method16() {
      return this.Field858;
   }

   public void Method17(int a, int a) {
      this.Field853 = a;
      this.Field854 = a;
      super.Method17(a, a);
   }

   public int Method3(int a, int a, int a) {
      float var4 = (float)a / (float)this.Field853;
      float var5 = (float)a / (float)this.Field854;
      float var6 = (float)this.Field859 + (float)(this.Field862 - this.Field859) * var4;
      float var7 = (float)this.Field865 + (float)(this.Field868 - this.Field865) * var4;
      int var8 = (int)(var6 + (var7 - var6) * var5 + 0.5F);
      var6 = (float)this.Field860 + (float)(this.Field863 - this.Field860) * var4;
      var7 = (float)this.Field866 + (float)(this.Field869 - this.Field866) * var4;
      int var9 = (int)(var6 + (var7 - var6) * var5 + 0.5F);
      var6 = (float)this.Field861 + (float)(this.Field864 - this.Field861) * var4;
      var7 = (float)this.Field867 + (float)(this.Field870 - this.Field867) * var4;
      int var10 = (int)(var6 + (var7 - var6) * var5 + 0.5F);
      return -16777216 | var8 << 16 | var9 << 8 | var10;
   }

   public String toString() {
      return "Texture/Four Color Fill...";
   }
}
