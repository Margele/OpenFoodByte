package awsl;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.XMLReaderFactory;

public class Class890 {
   public static final int Field3896 = 1;
   public static final int Field3897 = 2;
   public static final int Field3898 = 3;
   private static final String Field3899 = "classes.xml";
   private final int Field3900;
   private final int Field3901;
   private final InputStream Field3902;
   private final OutputStream Field3903;
   private final Source Field3904;
   private int Field3905 = 0;

   public Class890(int a, int a, InputStream a, OutputStream a, Source a) {
      this.Field3900 = a;
      this.Field3901 = a;
      this.Field3902 = a;
      this.Field3903 = a;
      this.Field3904 = a;
   }

   public int Method3548() throws TransformerException, IOException, SAXException {
      ZipInputStream var2 = new ZipInputStream(this.Field3902);
      ZipOutputStream var3 = new ZipOutputStream(this.Field3903);
      Class831.Method3658();
      OutputStreamWriter var4 = new OutputStreamWriter(var3);
      Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
      TransformerFactory var5 = TransformerFactory.newInstance();
      if (var5.getFeature("http://javax.xml.transform.sax.SAXSource/feature") && var5.getFeature("http://javax.xml.transform.sax.SAXResult/feature")) {
         SAXTransformerFactory var6 = (SAXTransformerFactory)var5;
         Templates var7 = null;
         if (this.Field3904 != null) {
            var7 = var6.newTemplates(this.Field3904);
         }

         Class674 var8 = this.Method3552(var3);
         Object var9 = null;
         switch (this.Field3901) {
            case 1:
               var9 = new Class736(new Class892(var3), var8, false);
               break;
            case 2:
               var9 = new Class736(new Class676(var4, true), var8, true);
               break;
            case 3:
               ZipEntry var10 = new ZipEntry("classes.xml");
               var3.putNextEntry(var10);
               var9 = new Class738(var4, false);
         }

         Class734 var15 = new Class734("class", (ContentHandler)var9, new Class682(var6, var7, (ContentHandler)var9));
         Class680 var11 = new Class680(var15);
         if (this.Field3900 != 3) {
            var15.Method1635();
            var15.Method1633("", "classes", "classes", new AttributesImpl());
         }

         int var12 = 0;
         ZipEntry var13;
         if ((var13 = var2.getNextEntry()) != null) {
            this.Method3555(var13.getName(), this.Field3905++);
            if (this.Method3550(var13)) {
               this.Method3551(var2, var13, var11);
            }

            OutputStream var14 = var8.Method2334(this.Method3553(var13));
            this.Method3549(var2, var14);
            var8.Method2335();
            ++var12;
         }

         if (this.Field3900 != 3) {
            var15.Method1634("", "classes", "classes");
            var15.Method1636();
         }

         if (this.Field3901 == 3) {
            var3.closeEntry();
         }

         var3.flush();
         var3.close();
         return var12;
      } else {
         return 0;
      }
   }

   private void Method3549(InputStream a, OutputStream a) throws IOException {
      if (this.Field3901 != 3) {
         byte[] var3 = new byte[2048];

         int var4;
         while((var4 = a.read(var3)) != -1) {
            a.write(var3, 0, var4);
         }

      }
   }

   private boolean Method3550(ZipEntry a) {
      String var2 = a.getName();
      return this.Field3900 == 3 && var2.equals("classes.xml") || var2.endsWith(".class") || var2.endsWith(".class.xml");
   }

   private void Method3551(ZipInputStream a, ZipEntry a, Class672 a) {
      ContentHandler var4 = a.Method2326();

      try {
         boolean var5 = this.Field3900 == 3;
         if (this.Field3900 == 1) {
            Class165 var6 = new Class165(Method3554(a, a));
            var6.Method1470(new Class228(var4, var5), 0);
         } else {
            XMLReader var8 = XMLReaderFactory.createXMLReader();
            var8.setContentHandler(var4);
            var8.parse(new InputSource(new Class691(a)));
         }
      } catch (Exception var7) {
         this.Method3555(a.getName(), 0);
         this.Method3555(var7, 0);
      }

   }

   private Class674 Method3552(ZipOutputStream a) {
      return (Class674)(this.Field3901 == 3 ? new Class678(a) : new Class660(a));
   }

   private String Method3553(ZipEntry a) {
      String var2 = a.getName();
      if (this.Method3550(a)) {
         if (this.Field3900 != 1 && this.Field3901 == 1) {
            var2 = var2.substring(0, var2.length() - 4);
         } else if (this.Field3900 == 1 && this.Field3901 != 1) {
            var2 = var2 + ".xml";
         }
      }

      return var2;
   }

   private static byte[] Method3554(InputStream a, ZipEntry a) throws IOException {
      long var2 = a.getSize();
      int var6;
      if (var2 > -1L) {
         byte[] var7 = new byte[(int)var2];

         for(int var8 = 0; (var6 = a.Method2521(var7, var8, var7.length - var8)) > 0; var8 += var6) {
         }

         return var7;
      } else {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         byte[] var5 = new byte[4096];

         while((var6 = a.read(var5)) != -1) {
            var4.write(var5, 0, var6);
         }

         return var4.toByteArray();
      }
   }

   protected void Method3555(Object a, int a) {
      if (a instanceof Throwable) {
         ((Throwable)a).printStackTrace();
      } else if (a % 100 == 0) {
         System.err.println(a + " " + a);
      }

   }

   public static void main(String[] a) throws Exception {
      if (a.length < 2) {
         Method3557();
      } else {
         int var1 = Method3556(a[0]);
         int var2 = Method3556(a[1]);
         InputStream var3 = System.in;
         new BufferedOutputStream(System.out);
         Object var5 = null;

         for(int var6 = 2; var6 < a.length; ++var6) {
            if ("-in".equals(a[var6])) {
               ++var6;
               new FileInputStream(a[var6]);
            } else if ("-out".equals(a[var6])) {
               ++var6;
               new BufferedOutputStream(new FileOutputStream(a[var6]));
            } else {
               if (!"-xslt".equals(a[var6])) {
                  Method3557();
                  return;
               }

               ++var6;
               new StreamSource(new FileInputStream(a[var6]));
            }
         }

         Method3557();
      }
   }

   private static int Method3556(String a) {
      if ("code".equals(a)) {
         return 1;
      } else if ("xml".equals(a)) {
         return 2;
      } else {
         return "singlexml".equals(a) ? 3 : 0;
      }
   }

   private static void Method3557() {
      System.err.println("Usage: Main <in format> <out format> [-in <input jar>] [-out <output jar>] [-xslt <xslt fiel>]");
      System.err.println("  when -in or -out is omitted sysin and sysout would be used");
      System.err.println("  <in format> and <out format> - code | xml | singlexml");
   }

   private static Exception Method3558(Exception exception) {
      return exception;
   }
}
