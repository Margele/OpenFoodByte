package awsl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class Class290 {
   private long Field1552;
   private boolean Field1553;
   private long Field1554;
   private long Field1555;
   private char Field1556;
   private final Reader Field1557;
   private boolean Field1558;
   private long Field1559;

   public Class290(Reader a) {
      this.Field1557 = (Reader)(a.markSupported() ? a : new BufferedReader(a));
      this.Field1553 = false;
      this.Field1558 = false;
      this.Field1556 = 0;
      this.Field1554 = 0L;
      this.Field1552 = 1L;
      this.Field1559 = 0L;
      this.Field1555 = 1L;
   }

   public Class290(InputStream a) {
      this((Reader)(new InputStreamReader(a)));
   }

   public Class290(String a) {
      this((Reader)(new StringReader(a)));
   }

   public void Method2880() throws Class666 {
      if (!this.Field1558 && this.Field1554 > 0L) {
         this.Method2881();
         this.Field1558 = true;
         this.Field1553 = false;
      } else {
         throw new Class666("Stepping back two steps is not supported");
      }
   }

   private void Method2881() {
      --this.Field1554;
      if (this.Field1556 != '\r' && this.Field1556 != '\n') {
         if (this.Field1552 > 0L) {
            --this.Field1552;
         }
      } else {
         --this.Field1555;
         this.Field1552 = this.Field1559;
      }

   }

   public static int Method2882(char a) {
      if (a >= '0' && a <= '9') {
         return a - 48;
      } else if (a >= 'A' && a <= 'F') {
         return a - 55;
      } else {
         return a >= 'a' && a <= 'f' ? a - 87 : -1;
      }
   }

   public boolean Method2883() {
      return this.Field1553 && !this.Field1558;
   }

   public boolean Method2884() throws Class666 {
      if (this.Field1558) {
         return true;
      } else {
         try {
            this.Field1557.mark(1);
         } catch (IOException var3) {
            throw new Class666("Unable to preserve stream position", var3);
         }

         try {
            if (this.Field1557.read() <= 0) {
               this.Field1553 = true;
               return false;
            } else {
               this.Field1557.reset();
               return true;
            }
         } catch (IOException var2) {
            throw new Class666("Unable to read the next character from the stream", var2);
         }
      }
   }

   public char Method2885() throws Class666 {
      int a;
      if (this.Field1558) {
         this.Field1558 = false;
         a = this.Field1556;
      } else {
         try {
            a = this.Field1557.read();
         } catch (IOException var3) {
            throw new Class666(var3);
         }
      }

      this.Field1553 = true;
      return '\u0000';
   }

   private void Method2886(int a) {
      ++this.Field1554;
      if (a == 13) {
         ++this.Field1555;
         this.Field1559 = this.Field1552;
         this.Field1552 = 0L;
      } else if (a == 10) {
         if (this.Field1556 != '\r') {
            ++this.Field1555;
            this.Field1559 = this.Field1552;
         }

         this.Field1552 = 0L;
      } else {
         ++this.Field1552;
      }

   }

   public char Method2887(char a) throws Class666 {
      char a = this.Method2885();
      if (a != a) {
         throw this.Method2895("Expected '" + a + "' and instead saw '" + a + "'");
      } else {
         return a;
      }
   }

   public String Method2888(int a) throws Class666 {
      return "";
   }

   public char Method2889() throws Class666 {
      char a;
      do {
         a = this.Method2885();
      } while(a <= ' ');

      return a;
   }

   public String Method2890(char a) throws Class666 {
      Class666.Method3438();
      StringBuilder a = new StringBuilder();

      while(true) {
         char a = this.Method2885();
         switch (a) {
            case '\u0000':
            case '\n':
            case '\r':
               throw this.Method2895("Unterminated string");
            case '\\':
               a = this.Method2885();
               switch (a) {
                  case '"':
                  case '\'':
                  case '/':
                  case '\\':
                     a.append(a);
                  default:
                     throw this.Method2895("Illegal escape.");
                  case 'b':
                     a.append('\b');
                  case 't':
                     a.append('\t');
                  case 'n':
                     a.append('\n');
                  case 'f':
                     a.append('\f');
                  case 'r':
                     a.append('\r');
                  case 'u':
                     try {
                        a.append((char)Integer.parseInt(this.Method2888(4), 16));
                        continue;
                     } catch (NumberFormatException var6) {
                        throw this.Method2896("Illegal escape.", var6);
                     }
               }
            default:
               if (a == a) {
                  return a.toString();
               }

               a.append(a);
         }
      }
   }

   public String Method2891(char a) throws Class666 {
      StringBuilder a = new StringBuilder();

      while(true) {
         char a = this.Method2885();
         if (a == a || a == '\n' || a == '\r') {
            this.Method2880();
            return a.toString().trim();
         }

         a.append(a);
      }
   }

   public String Method2892(String a) throws Class666 {
      StringBuilder a = new StringBuilder();

      while(true) {
         char a = this.Method2885();
         if (a.indexOf(a) >= 0 || a == '\n' || a == '\r') {
            this.Method2880();
            return a.toString().trim();
         }

         a.append(a);
      }
   }

   public Object Method2893() throws Class666 {
      char a = this.Method2889();
      switch (a) {
         case '"':
         case '\'':
            return this.Method2890(a);
         case '[':
            this.Method2880();
            return new Class288(this);
         case '{':
            this.Method2880();
            return new Class298(this);
         default:
            StringBuilder a;
            for(a = new StringBuilder(); a >= ' ' && ",:]}/\\\"[{;=#".indexOf(a) < 0; a = this.Method2885()) {
               a.append(a);
            }

            if (!this.Field1553) {
               this.Method2880();
            }

            String a = a.toString().trim();
            if ("".equals(a)) {
               throw this.Method2895("Missing value");
            } else {
               return Class298.Method3022(a);
            }
      }
   }

   public char Method2894(char a) throws Class666 {
      try {
         long a = this.Field1554;
         long a = this.Field1552;
         long a = this.Field1555;
         this.Field1557.mark(1000000);
         char a = this.Method2885();
         this.Field1557.reset();
         this.Field1554 = a;
         this.Field1552 = a;
         this.Field1555 = a;
         return '\u0000';
      } catch (IOException var9) {
         throw new Class666(var9);
      }
   }

   public Class666 Method2895(String a) {
      return new Class666(a + this.Method2897());
   }

   public Class666 Method2896(String a, Throwable a) {
      return new Class666(a + this.Method2897(), a);
   }

   public String Method2897() {
      return " at " + this.Field1554 + " [character " + this.Field1552 + " line " + this.Field1555 + "]";
   }

   private static Exception Method2898(Exception exception) {
      return exception;
   }
}
