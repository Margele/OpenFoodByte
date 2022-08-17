package awsl;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import obfuscate.a;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class417 {
   public String Field2012;
   public ArrayList Field2013;
   public Class421 Field2014;
   public double Field2015;
   public double Field2016;
   public double Field2017;
   public double Field2018;
   public boolean Field2019;
   public boolean Field2020;

   public Class417(String a, Class421 a) {
      Class413.Method3580();
      this.Field2019 = true;
      this.Field2020 = false;
      this.Field2012 = a;
      this.Field2018 = (double)(Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT + 2);
      this.Field2014 = a;
      this.Field2013 = new ArrayList();
      Iterator var4 = Class446.Method2766(a).Method1383();
      Class447 var5;
      if (var4.Method932()) {
         var5 = (Class447)var4.Method933();
         if (var5 instanceof ModeValue) {
            this.Field2013.Method2530(new Class411(this, (ModeValue)var5));
         }

         a.trash(new String[3]);
      }

      var4 = Class446.Method2766(a).Method1383();
      if (var4.Method932()) {
         var5 = (Class447)var4.Method933();
         if (var5 instanceof FloatValue) {
            this.Field2013.Method2530(new Class418(this, (FloatValue)var5));
         }
      }

      var4 = Class446.Method2766(a).Method1383();
      if (var4.Method932()) {
         var5 = (Class447)var4.Method933();
         if (var5 instanceof BooleanValue) {
            this.Field2013.Method2530(new Class412(this, (BooleanValue)var5));
         }
      }

   }

   public void Method2376(int a, int a, float a) {
   }

   public boolean Method2377(int a, int a, int a) {
      return this.Method2378(a, a);
   }

   public boolean Method2378(int a, int a) {
      return (double)a >= this.Field2015 && (double)a <= this.Field2015 + this.Field2017 && (double)a >= this.Field2016 && (double)a <= this.Field2016 + this.Field2018;
   }
}
