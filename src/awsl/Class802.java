package awsl;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class Class802 extends Class193 {
   private float Field3584;
   private BufferedImage Field3585;
   private String Field3586;
   private Method Field3587;
   protected BufferedImageOp Field3588;
   protected float Field3589;
   protected float Field3590;

   private Class802() {
      this.Field3584 = 0.0F;
   }

   public Class802(BufferedImageOp a, String a, float a, float a) {
      Class193.Method1269();
      this.Field3584 = 0.0F;
      this.Field3588 = a;
      this.Field3586 = a;
      this.Field3589 = a;
      this.Field3590 = a;

      try {
         BeanInfo var6 = Introspector.getBeanInfo(a.getClass());
         PropertyDescriptor[] var7 = var6.getPropertyDescriptors();
         int var8 = 0;
         if (var8 < var7.length) {
            PropertyDescriptor var9 = var7[var8];
            if (a.equals(var9.getName())) {
               this.Field3587 = var9.getWriteMethod();
            }

            ++var8;
         }

         if (this.Field3587 == null) {
            throw new IllegalArgumentException("No such property in object: " + a);
         }
      } catch (IntrospectionException var10) {
         throw new IllegalArgumentException(var10.toString());
      }
   }

   public void Method56(float a) {
      this.Field3584 = a;
   }

   public float Method57() {
      return this.Field3584;
   }

   public void Method1271(BufferedImage a) {
      this.Field3585 = a;
   }

   public BufferedImage Method1272() {
      return this.Field3585;
   }

   public void Method58(float a) {
      try {
         this.Field3587.invoke(this.Field3588, new Float(a));
      } catch (Exception var3) {
         throw new IllegalArgumentException("Error setting value for property: " + this.Field3586);
      }
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      a = this.Method1263(a, (ColorModel)null);
      if (this.Field3585 == null) {
         return a;
      } else {
         float var3 = 1.0F - this.Field3584;
         Graphics2D var4 = a.createGraphics();
         float var5;
         if (this.Field3584 != 1.0F) {
            var5 = this.Field3589 + this.Field3584 * (this.Field3590 - this.Field3589);
            this.Method58(var5);
            var4.drawImage(a, this.Field3588, 0, 0);
         }

         if (this.Field3584 != 0.0F) {
            var4.setComposite(AlphaComposite.getInstance(3, this.Field3584));
            var5 = this.Field3589 + var3 * (this.Field3590 - this.Field3589);
            this.Method58(var5);
            var4.drawImage(this.Field3585, this.Field3588, 0, 0);
         }

         var4.dispose();
         return a;
      }
   }

   public String toString() {
      return "Transitions/Transition...";
   }

   private static Exception Method106(Exception exception) {
      return exception;
   }
}
