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
      int a = Class37.Method3382();
      if (this.Field1195) {
         if ("<clinit>".equals(a)) {
            this.Field1201 = true;
         }

         int a = a & 3391;
         if ((a & 2) == 0) {
            if ("<init>".equals(a)) {
               this.Field1202.Method2530(new Class61(a, a, a));
            }

            if (!"<clinit>".equals(a)) {
               this.Field1203.Method2530(new Class61(a, a, a));
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
            int a = a & 223;
            this.Field1200.Method2530(new Class61(a, a, a));
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
      Class253 a = super.Method1450(24, "serialVersionUID", "J", (String)null, new Long(a));
      a.Method2121();
   }

   protected long Method2619() throws IOException {
      DataOutputStream a = null;
      Class37.Method3383();
      long a = 0L;

      try {
         ByteArrayOutputStream a = new ByteArrayOutputStream();
         a = new DataOutputStream(a);
         a.writeUTF(this.Field1198.replace('/', '.'));
         a.writeInt(this.Field1197 & 1553);
         Arrays.sort(this.Field1199);
         int a = 0;
         if (a < this.Field1199.length) {
            a.writeUTF(this.Field1199[a].replace('/', '.'));
            ++a;
            a.trash(new String[1]);
         }

         Method2621(this.Field1200, a, false);
         if (this.Field1201) {
            a.writeUTF("<clinit>");
            a.writeInt(8);
            a.writeUTF("()V");
         }

         Method2621(this.Field1202, a, true);
         Method2621(this.Field1203, a, true);
         a.flush();
         byte[] a = this.Method2620(a.toByteArray());
         int a = Math.min(a.length, 8) - 1;
         a = a << 8 | (long)(a[a] & 255);
         --a;
      } finally {
         a.close();
      }

      return a;
   }

   protected byte[] Method2620(byte[] a) {
      try {
         return MessageDigest.getInstance("SHA").digest(a);
      } catch (Exception var3) {
         throw new UnsupportedOperationException(var3.toString());
      }
   }

   private static void Method2621(Collection a, DataOutput a, boolean a2) throws IOException {
      int a = a.Method1799();
      Class61[] a = (Class61[])a.toArray(new Class61[a]);
      Arrays.sort(a);

      for(int a = 0; a < a; ++a) {
         a.writeUTF(a[a].Field627);
         a.writeInt(a[a].Field628);
         a.writeUTF(a[a].Field629.replace('/', '.'));
      }

   }

   private static Throwable Method2622(Throwable throwable) {
      return throwable;
   }
}
