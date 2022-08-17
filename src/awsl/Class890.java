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
      ZipInputStream a = new ZipInputStream(this.Field3902);
      ZipOutputStream a = new ZipOutputStream(this.Field3903);
      Class831.Method3658();
      OutputStreamWriter a = new OutputStreamWriter(a);
      Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
      TransformerFactory a = TransformerFactory.newInstance();
      if (a.getFeature("http://javax.xml.transform.sax.SAXSource/feature") && a.getFeature("http://javax.xml.transform.sax.SAXResult/feature")) {
         SAXTransformerFactory a = (SAXTransformerFactory)a;
         Templates a = null;
         if (this.Field3904 != null) {
            a = a.newTemplates(this.Field3904);
         }

         Class674 a = this.Method3552(a);
         ContentHandler a = null;
         switch (this.Field3901) {
            case 1:
               a = new Class736(new Class892(a), a, false);
               break;
            case 2:
               a = new Class736(new Class676(a, true), a, true);
               break;
            case 3:
               ZipEntry a = new ZipEntry("classes.xml");
               a.putNextEntry(a);
               a = new Class738(a, false);
         }

         ContentHandler a = new Class734("class", (ContentHandler)a, new Class682(a, a, (ContentHandler)a));
         Class672 a = new Class680(a);
         if (this.Field3900 != 3) {
            a.Method1635();
            a.Method1633("", "classes", "classes", new AttributesImpl());
         }

         int a = 0;
         ZipEntry a;
         if ((a = a.getNextEntry()) != null) {
            this.Method3555(a.getName(), this.Field3905++);
            if (this.Method3550(a)) {
               this.Method3551(a, a, a);
            }

            OutputStream a = a.Method2334(this.Method3553(a));
            this.Method3549(a, a);
            a.Method2335();
            ++a;
         }

         if (this.Field3900 != 3) {
            a.Method1634("", "classes", "classes");
            a.Method1636();
         }

         if (this.Field3901 == 3) {
            a.closeEntry();
         }

         a.flush();
         a.close();
         return a;
      } else {
         return 0;
      }
   }

   private void Method3549(InputStream a, OutputStream a) throws IOException {
      if (this.Field3901 != 3) {
         byte[] a = new byte[2048];

         int a;
         while((a = a.read(a)) != -1) {
            a.write(a, 0, a);
         }

      }
   }

   private boolean Method3550(ZipEntry a) {
      String a = a.getName();
      return this.Field3900 == 3 && a.equals("classes.xml") || a.endsWith(".class") || a.endsWith(".class.xml");
   }

   private void Method3551(ZipInputStream a, ZipEntry a, Class672 a) {
      ContentHandler a = a.Method2326();

      try {
         boolean a = this.Field3900 == 3;
         if (this.Field3900 == 1) {
            Class165 a = new Class165(Method3554(a, a));
            a.Method1470(new Class228(a, a), 0);
         } else {
            XMLReader a = XMLReaderFactory.createXMLReader();
            a.setContentHandler(a);
            a.parse(new InputSource(new Class691(a)));
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
      String a = a.getName();
      if (this.Method3550(a)) {
         if (this.Field3900 != 1 && this.Field3901 == 1) {
            a = a.substring(0, a.length() - 4);
         } else if (this.Field3900 == 1 && this.Field3901 != 1) {
            a = a + ".xml";
         }
      }

      return a;
   }

   private static byte[] Method3554(InputStream a, ZipEntry a) throws IOException {
      long a = a.getSize();
      int a;
      if (a > -1L) {
         byte[] a = new byte[(int)a];

         for(int a = 0; (a = a.Method2521(a, a, a.length - a)) > 0; a += a) {
         }

         return a;
      } else {
         ByteArrayOutputStream a = new ByteArrayOutputStream();
         byte[] a = new byte[4096];

         while((a = a.read(a)) != -1) {
            a.write(a, 0, a);
         }

         return a.toByteArray();
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
         int a = Method3556(a[0]);
         int a = Method3556(a[1]);
         InputStream a = System.in;
         new BufferedOutputStream(System.out);
         Source a = null;

         for(int a = 2; a < a.length; ++a) {
            if ("-in".equals(a[a])) {
               ++a;
               new FileInputStream(a[a]);
            } else if ("-out".equals(a[a])) {
               ++a;
               new BufferedOutputStream(new FileOutputStream(a[a]));
            } else {
               if (!"-xslt".equals(a[a])) {
                  Method3557();
                  return;
               }

               ++a;
               new StreamSource(new FileInputStream(a[a]));
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
