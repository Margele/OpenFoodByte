package awsl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

final class Class660 implements Class674 {
   private ZipOutputStream Field2930;

   Class660(ZipOutputStream a) {
      this.Field2930 = a;
   }

   public OutputStream Method2334(String a) throws IOException {
      ZipEntry var2 = new ZipEntry(a);
      this.Field2930.putNextEntry(var2);
      return this.Field2930;
   }

   public void Method2335() throws IOException {
      this.Field2930.flush();
      this.Field2930.closeEntry();
   }
}
