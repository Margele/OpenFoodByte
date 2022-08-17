package awsl;

public class Class263 extends Class277 {
   public Class263(Float a, Float a) {
      super(a, a);
   }

   public Class263 Method2844(Float a) {
      this.Method2808(a);
      return this;
   }

   public Class263 Method2845(Float a) {
      this.Method2809(a);
      return this;
   }

   public Float Method2846() {
      return this.Method2811().floatValue();
   }

   public Float Method2847() {
      return this.Method2812().floatValue();
   }

   public Class263 Method2848() {
      Class328.Method995();
      this.Method2844(this.Method2846() % 360.0F);
      this.Method2845(this.Method2847() % 360.0F);
      if (this.Method2846() <= -180.0F) {
         this.Method2844(this.Method2846() + 360.0F);
      }

      if (this.Method2847() <= -180.0F) {
         this.Method2845(this.Method2847() + 360.0F);
      }

      if (this.Method2846() > 180.0F) {
         this.Method2844(this.Method2846() - 360.0F);
      }

      if (this.Method2847() > 180.0F) {
         this.Method2845(this.Method2847() - 360.0F);
      }

      return this;
   }
}
