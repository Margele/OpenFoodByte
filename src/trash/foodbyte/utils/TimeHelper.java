package trash.foodbyte.utils;

public class TimeHelper {
   public long last = 0L;

   public boolean Method211(long a) {
      return System.currentTimeMillis() - this.last > a;
   }

   public long Method212() {
      return System.nanoTime() / 1000000L;
   }

   public long Method213() {
      return System.nanoTime() / 1000000L - this.last;
   }

   public void reset() {
      this.last = System.currentTimeMillis();
   }

   public long Method215() {
      return this.last;
   }

   public void Method216(int a) {
      this.last = System.currentTimeMillis() - (long)a;
   }

   public boolean Method217(long a) {
      return this.Method212() - this.last >= a;
   }

   public boolean Method218(float a) {
      return (float)(this.Method212() - this.last) >= a;
   }

   public boolean isDelayComplete(double a) {
      return (double)(System.currentTimeMillis() - this.last) >= a;
   }
}
