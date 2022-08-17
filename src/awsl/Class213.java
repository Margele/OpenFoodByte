package awsl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import obfuscate.a;

public class Class213 extends Class167 {
   private boolean Field1195;
   private boolean Field1196;
   private int Field1197;
   private String Field1198;
   private String[] Field1199;
   private Collection Field1200;
   private boolean Field1201;
   private Collection Field1202;
   private Collection Field1203;

   public Class213(Class167 a) {
      this(327680, a);
      if (this.getClass() != Class213.class) {
         throw new IllegalStateException();
      }
   }

   protected Class213(int a, Class167 a) {
      super(a, a);
      this.Field1200 = new ArrayList();
      this.Field1202 = new ArrayList();
      this.Field1203 = new ArrayList();
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      this.Field1195 = (a & 512) == 0;
      if (this.Field1195) {
         this.Field1198 = a;
         this.Field1197 = a;
         this.Field1199 = new String[a.length];
         System.arraycopy(a, 0, this.Field1199, 0, a.length);
      }

      super.Method1447(a, a, a, a, a, a);
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      boolean var6 = Class37.Method3382();
      if (this.Field1195) {
         if ("<clinit>".equals(a)) {
            this.Field1201 = true;
         }

         int var7 = a & 3391;
         if ((a & 2) == 0) {
            if ("<init>".equals(a)) {
               this.Field1202.Method2530(new Class61(a, var7, a));
            }

            if (!"<clinit>".equals(a)) {
               this.Field1203.Method2530(new Class61(a, var7, a));
            }
         }
      }

      return super.Method1451(a, a, a, a, a);
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      if (this.Field1195) {
         if ("serialVersionUID".equals(a)) {
            this.Field1195 = false;
            this.Field1196 = true;
         }

         if ((a & 2) == 0 || (a & 136) == 0) {
            int var6 = a & 223;
            this.Field1200.Method2530(new Class61(a, var6, a));
         }
      }

      return super.Method1450(a, a, a, a, a);
   }

   public void Method1452(String a, String a, String a, int a) {
      if (this.Field1198 != null && this.Field1198.equals(a)) {
         this.Field1197 = a;
      }

      super.Method1452(a, a, a, a);
   }

   public void Method1460() {
      if (this.Field1195 && !this.Field1196) {
         try {
            this.Method2618(this.Method2619());
         } catch (Throwable var2) {
            throw new RuntimeException("Error while computing SVUID for " + this.Field1198, var2);
         }
      }

      super.Method1460();
   }

   public boolean Method2617() {
      return this.Field1196;
   }

   protected void Method2618(long a) {
      Class253 var3 = super.Method1450(24, "serialVersionUID", "J", (String)null, new Long(a));
      var3.Method2121();
   }

   protected long Method2619() throws IOException {
      DataOutputStream var3 = null;
      Class37.Method3383();
      long var4 = 0L;

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         var3 = new DataOutputStream(var2);
         var3.writeUTF(this.Field1198.replace('/', '.'));
         var3.writeInt(this.Field1197 & 1553);
         Arrays.sort(this.Field1199);
         int var6 = 0;
         if (var6 < this.Field1199.length) {
            var3.writeUTF(this.Field1199[var6].replace('/', '.'));
            ++var6;
            a.trash(new String[1]);
         }

         Method2621(this.Field1200, var3, false);
         if (this.Field1201) {
            var3.writeUTF("<clinit>");
            var3.writeInt(8);
            var3.writeUTF("()V");
         }

         Method2621(this.Field1202, var3, true);
         Method2621(this.Field1203, var3, true);
         var3.flush();
         byte[] var11 = this.Method2620(var2.toByteArray());
         int var7 = Math.min(var11.length, 8) - 1;
         var4 = var4 << 8 | (long)(var11[var7] & 255);
         --var7;
      } finally {
         var3.close();
      }

      return var4;
   }

   protected byte[] Method2620(byte[] a) {
      try {
         return MessageDigest.getInstance("SHA").digest(a);
      } catch (Exception var3) {
         throw new UnsupportedOperationException(var3.toString());
      }
   }

   private static void Method2621(Collection a, DataOutput a, boolean a) throws IOException {
      int var3 = a.Method1799();
      Class61[] var4 = (Class61[])a.toArray(new Class61[var3]);
      Arrays.sort(var4);

      for(int var5 = 0; var5 < var3; ++var5) {
         a.writeUTF(var4[var5].Field627);
         a.writeInt(var4[var5].Field628);
         a.writeUTF(var4[var5].Field629.replace('/', '.'));
      }

   }

   private static Throwable Method2622(Throwable throwable) {
      return throwable;
   }
}
