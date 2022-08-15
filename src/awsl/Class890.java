/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.BufferedOutputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipInputStream
 *  java.util.zip.ZipOutputStream
 *  javax.xml.transform.Source
 *  javax.xml.transform.Templates
 *  javax.xml.transform.TransformerException
 *  javax.xml.transform.TransformerFactory
 *  javax.xml.transform.sax.SAXTransformerFactory
 *  javax.xml.transform.stream.StreamSource
 *  org.xml.sax.Attributes
 *  org.xml.sax.ContentHandler
 *  org.xml.sax.InputSource
 *  org.xml.sax.SAXException
 *  org.xml.sax.XMLReader
 *  org.xml.sax.helpers.AttributesImpl
 *  org.xml.sax.helpers.XMLReaderFactory
 */
package awsl;

import awsl.Class165;
import awsl.Class228;
import awsl.Class660;
import awsl.Class672;
import awsl.Class674;
import awsl.Class676;
import awsl.Class678;
import awsl.Class680;
import awsl.Class682;
import awsl.Class691;
import awsl.Class734;
import awsl.Class736;
import awsl.Class738;
import awsl.Class831;
import awsl.Class892;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.Attributes;
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

    public Class890(int a, int a2, InputStream a3, OutputStream a4, Source a5) {
        this.Field3900 = a;
        this.Field3901 = a2;
        this.Field3902 = a3;
        this.Field3903 = a4;
        this.Field3904 = a5;
    }

    /*
     * WARNING - void declaration
     */
    public int Method3548() throws TransformerException, IOException, SAXException {
        Object a;
        void a2;
        ZipInputStream a3 = new ZipInputStream(this.Field3902);
        ZipOutputStream zipOutputStream = new ZipOutputStream(this.Field3903);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)a2);
        int[] a4 = Class831.Method3658();
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        TransformerFactory a5 = TransformerFactory.newInstance();
        if (!a5.getFeature("http://javax.xml.transform.sax.SAXSource/feature") || !a5.getFeature("http://javax.xml.transform.sax.SAXResult/feature")) {
            return 0;
        }
        SAXTransformerFactory a6 = (SAXTransformerFactory)a5;
        Templates a7 = null;
        if (this.Field3904 != null) {
            a7 = a6.newTemplates(this.Field3904);
        }
        Class674 a8 = this.Method3552((ZipOutputStream)a2);
        Object a9 = null;
        switch (this.Field3901) {
            case 1: {
                a9 = new Class736(new Class892((OutputStream)a2), a8, false);
                break;
            }
            case 2: {
                void a10;
                a9 = new Class736(new Class676((Writer)a10, true), a8, true);
                break;
            }
            case 3: {
                void a10;
                a = new ZipEntry("classes.xml");
                a2.putNextEntry(a);
                a9 = new Class738((Writer)a10, false);
            }
        }
        a = a9;
        a = new Class734("class", (ContentHandler)a9, new Class682(a6, a7, (ContentHandler)a9));
        Class680 a11 = new Class680((ContentHandler)a);
        if (this.Field3900 != 3) {
            a.Method1635();
            a.Method1633("", "classes", "classes", (Attributes)new AttributesImpl());
        }
        int a12 = 0;
        ZipEntry a13 = a3.getNextEntry();
        if (a13 != null) {
            this.Method3555(a13.getName(), this.Field3905++);
            if (this.Method3550(a13)) {
                this.Method3551(a3, a13, a11);
            }
            OutputStream a14 = a8.Method2334(this.Method3553(a13));
            this.Method3549((InputStream)a3, a14);
            a8.Method2335();
            ++a12;
        }
        if (this.Field3900 != 3) {
            a.Method1634("", "classes", "classes");
            a.Method1636();
        }
        if (this.Field3901 == 3) {
            a2.closeEntry();
        }
        a2.flush();
        a2.close();
        return a12;
    }

    private void Method3549(InputStream a, OutputStream a2) throws IOException {
        int a3;
        if (this.Field3901 == 3) {
            return;
        }
        byte[] a4 = new byte[2048];
        while ((a3 = a.read(a4)) != -1) {
            a2.write(a4, 0, a3);
        }
    }

    private boolean Method3550(ZipEntry a) {
        String a2 = a.getName();
        return this.Field3900 == 3 && a2.equals((Object)"classes.xml") || a2.endsWith(".class") || a2.endsWith(".class.xml");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Method3551(ZipInputStream a, ZipEntry a2, Class672 a3) {
        ContentHandler a4 = a3.Method2326();
        try {
            InputSource inputSource;
            boolean a5;
            boolean bl = a5 = this.Field3900 == 3;
            if (this.Field3900 == 1) {
                Class165 a6 = new Class165(Class890.Method3554((InputStream)a, a2));
                a6.Method1470(new Class228(a4, a5), 0);
                return;
            }
            XMLReader a7 = XMLReaderFactory.createXMLReader();
            a7.setContentHandler(a4);
            inputSource((InputStream)new Class691((InputStream)a));
            a7.parse(inputSource);
            return;
        }
        catch (Exception a8) {
            this.Method3555(a2.getName(), 0);
            this.Method3555((Object)a8, 0);
        }
    }

    private Class674 Method3552(ZipOutputStream a) {
        if (this.Field3901 == 3) {
            return new Class678((OutputStream)a);
        }
        return new Class660(a);
    }

    private String Method3553(ZipEntry a) {
        String a2 = a.getName();
        if (this.Method3550(a)) {
            if (this.Field3900 != 1 && this.Field3901 == 1) {
                a2 = a2.substring(0, a2.length() - 4);
            } else if (this.Field3900 == 1 && this.Field3901 != 1) {
                a2 = a2 + ".xml";
            }
        }
        return a2;
    }

    private static byte[] Method3554(InputStream a, ZipEntry a2) throws IOException {
        int a3;
        long a4 = a2.getSize();
        if (a4 > -1L) {
            int a5;
            byte[] a6 = new byte[(int)a4];
            int a7 = 0;
            while ((a5 = a.Method2521(a6, a7, a6.length - a7)) > 0) {
                a7 += a5;
            }
            return a6;
        }
        ByteArrayOutputStream a8 = new ByteArrayOutputStream();
        byte[] a9 = new byte[4096];
        while ((a3 = a.read(a9)) != -1) {
            a8.write(a9, 0, a3);
        }
        return a8.toByteArray();
    }

    protected void Method3555(Object a, int a2) {
        if (a instanceof Throwable) {
            ((Throwable)a).printStackTrace();
        } else if (a2 % 100 == 0) {
            System.err.println(a2 + " " + a);
        }
    }

    public static void main(String[] a) throws Exception {
        if (a.length < 2) {
            Class890.Method3557();
            return;
        }
        int a2 = Class890.Method3556(a[0]);
        int a3 = Class890.Method3556(a[1]);
        InputStream a4 = System.in;
        BufferedOutputStream a5 = new BufferedOutputStream((OutputStream)System.out);
        StreamSource a6 = null;
        for (int a7 = 2; a7 < a.length; ++a7) {
            if ("-in".equals((Object)a[a7])) {
                a4 = new FileInputStream(a[++a7]);
                continue;
            }
            if ("-out".equals((Object)a[a7])) {
                a5 = new BufferedOutputStream((OutputStream)new FileOutputStream(a[++a7]));
                continue;
            }
            if ("-xslt".equals((Object)a[a7])) {
                a6 = new StreamSource((InputStream)new FileInputStream(a[++a7]));
                continue;
            }
            Class890.Method3557();
            return;
        }
        Class890.Method3557();
    }

    private static int Method3556(String a) {
        if ("code".equals((Object)a)) {
            return 1;
        }
        if ("xml".equals((Object)a)) {
            return 2;
        }
        if ("singlexml".equals((Object)a)) {
            return 3;
        }
        return 0;
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