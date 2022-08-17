package awsl;

import obfuscate.b;

class Class9 extends Class267 {
   static final int Field118 = 524288;
   static final int Field119 = 0;
   static final int Field120 = 64;
   static final int Field121 = 128;
   static final int Field122 = 247;
   static final int Field123 = 248;
   static final int Field124 = 251;
   static final int Field125 = 252;
   static final int Field126 = 255;
   private static final int Field127 = 0;
   private static final int Field128 = 1;
   private static final int Field129 = 2;
   final Class169 Field130;
   private int Field131;
   private final int Field132;
   private final int Field133;
   private final String Field134;
   String Field135;
   int Field136;
   int Field137;
   int Field138;
   int[] Field139;
   private Class138 Field140;
   private Class150 Field141;
   private Class150 Field142;
   private Class150 Field143;
   private Class150 Field144;
   private Class150[] Field145;
   private Class150[] Field146;
   private int Field147;
   private Class136 Field148;
   private Class138 Field149 = new Class138();
   private int Field150;
   private int Field151;
   private int Field152;
   private int Field153;
   private Class138 Field154;
   private int Field155;
   private int[] Field156;
   private int[] Field157;
   private int Field158;
   private Class258 Field159;
   private Class258 Field160;
   private int Field161;
   private Class138 Field162;
   private int Field163;
   private Class138 Field164;
   private int Field165;
   private Class138 Field166;
   private int Field167;
   private Class138 Field168;
   private int Field169;
   private Class150 Field170;
   private Class150 Field171;
   private Class136 Field172;
   private boolean Field173;
   private int Field174;
   private final int Field175;
   private Class264 Field176;
   private Class264 Field177;
   private Class264 Field178;
   private int Field179;
   private int Field180;

   Class9(Class169 a, int a, String a, String a, String a, String[] a, boolean a, boolean a) {
      super(327680);
      if (a.Field1113 == null) {
         a.Field1113 = this;
      } else {
         a.Field1114.Field1460 = this;
      }

      a.Field1114 = this;
      this.Field130 = a;
      this.Field131 = a;
      if ("<init>".equals(a)) {
         this.Field131 |= 524288;
      }

      this.Field132 = a.Method1506(a);
      this.Field133 = a.Method1506(a);
      this.Field134 = a;
      this.Field135 = a;
      int var9;
      if (a.length > 0) {
         this.Field138 = a.length;
         this.Field139 = new int[this.Field138];

         for(var9 = 0; var9 < this.Field138; ++var9) {
            this.Field139[var9] = a.Method1508(a[var9]);
         }
      }

      this.Field175 = 0;
      var9 = b.Method3215(this.Field134) >> 2;
      if ((a & 8) != 0) {
         --var9;
      }

      this.Field151 = var9;
      this.Field152 = var9;
      this.Field176 = new Class264();
      Class264 var10000 = this.Field176;
      var10000.Field1448 |= 8;
      this.Method1947(this.Field176);
   }

   public void Method1979(String a, int a) {
      if (this.Field162 == null) {
         this.Field162 = new Class138();
      }

      ++this.Field161;
      this.Field162.Method487(0).Method487(a);
   }

   public Class148 Method1968() {
      this.Field140 = new Class138();
      return new Class150(this.Field130, false, this.Field140, (Class138)null, 0);
   }

   public Class148 Method1969(String a, boolean a) {
      Class138 var3 = new Class138();
      var3.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 var4 = new Class150(this.Field130, true, var3, var3, 2);
      var4.Field1016 = this.Field141;
      this.Field141 = var4;
      return var4;
   }

   public Class148 Method1970(int a, Class31 a, String a, boolean a) {
      Class138 var5 = new Class138();
      Class150.Method1324(a, a, var5);
      var5.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 var6 = new Class150(this.Field130, true, var5, var5, var5.Field991 - 2);
      var6.Field1016 = this.Field143;
      this.Field143 = var6;
      return var6;
   }

   public Class148 Method1971(int a, String a, boolean a) {
      Class138 var4 = new Class138();
      if ("Ljava/lang/Synthetic;".equals(a)) {
         this.Field147 = Math.max(this.Field147, a + 1);
         return new Class150(this.Field130, false, var4, (Class138)null, 0);
      } else {
         var4.Method487(this.Field130.Method1506(a)).Method487(0);
         Class150 var5 = new Class150(this.Field130, true, var4, var4, 2);
         if (this.Field145 == null) {
            this.Field145 = new Class150[b.Method3211(this.Field134).length];
         }

         var5.Field1016 = this.Field145[a];
         this.Field145[a] = var5;
         return var5;
      }
   }

   public void Method1980(Class136 a) {
      if (a.Method469()) {
         a.Field989 = this.Field172;
         this.Field172 = a;
      } else {
         a.Field989 = this.Field148;
         this.Field148 = a;
      }

   }

   public void Method1652() {
   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
      if (this.Field175 != 0) {
         int var6;
         int var7;
         if (a == -1) {
            if (this.Field156 == null) {
               this.Method1882();
            }

            this.Field152 = a;
            var6 = this.Method1983(this.Field149.Field991, a, a);

            for(var7 = 0; var7 < a; ++var7) {
               if (a[var7] instanceof String) {
                  this.Field157[var6++] = 24117248 | this.Field130.Method1526((String)a[var7]);
               } else if (a[var7] instanceof Integer) {
                  this.Field157[var6++] = (Integer)a[var7];
               } else {
                  this.Field157[var6++] = 25165824 | this.Field130.Method1527("", ((Class264)a[var7]).Field1450);
               }
            }

            for(var7 = 0; var7 < a; ++var7) {
               if (a[var7] instanceof String) {
                  this.Field157[var6++] = 24117248 | this.Field130.Method1526((String)a[var7]);
               } else if (a[var7] instanceof Integer) {
                  this.Field157[var6++] = (Integer)a[var7];
               } else {
                  this.Field157[var6++] = 25165824 | this.Field130.Method1527("", ((Class264)a[var7]).Field1450);
               }
            }

            this.Method1883();
         } else {
            if (this.Field154 != null) {
               var6 = this.Field149.Field991 - this.Field155 - 1;
               if (a == 3) {
                  return;
               }

               throw new IllegalStateException();
            }

            this.Field154 = new Class138();
            var6 = this.Field149.Field991;
            label97:
            switch (a) {
               case 0:
                  this.Field152 = a;
                  this.Field154.Method485(255).Method487(var6).Method487(a);

                  for(var7 = 0; var7 < a; ++var7) {
                     this.Method1965(a[var7]);
                  }

                  this.Field154.Method487(a);

                  for(var7 = 0; var7 < a; ++var7) {
                     this.Method1965(a[var7]);
                  }
                  break;
               case 1:
                  this.Field152 += a;
                  this.Field154.Method485(251 + a).Method487(var6);
                  var7 = 0;

                  while(true) {
                     if (var7 >= a) {
                        break label97;
                     }

                     this.Method1965(a[var7]);
                     ++var7;
                  }
               case 2:
                  this.Field152 -= a;
                  this.Field154.Method485(251 - a).Method487(var6);
                  break;
               case 3:
                  if (var6 < 64) {
                     this.Field154.Method485(var6);
                  } else {
                     this.Field154.Method485(251).Method487(var6);
                  }
                  break;
               case 4:
                  if (var6 < 64) {
                     this.Field154.Method485(64 + var6);
                  } else {
                     this.Field154.Method485(247).Method487(var6);
                  }

                  this.Method1965(a[0]);
            }

            this.Field155 = this.Field149.Field991;
            ++this.Field153;
         }

         this.Field150 = Math.max(this.Field150, a);
         this.Field151 = Math.max(this.Field151, this.Field152);
      }
   }

   public void Method1948(int a) {
      this.Field169 = this.Field149.Field991;
      this.Field149.Method485(a);
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, 0, (Class169)null, (Class261)null);
         } else {
            int var2 = this.Field179 + Class276.Field1503[a];
            if (var2 > this.Field180) {
               this.Field180 = var2;
            }

            this.Field179 = var2;
         }

         if (a >= 172 && a <= 177 || a == 191) {
            this.Method1879();
         }
      }

   }

   public void Method854(int a, int a) {
      this.Field169 = this.Field149.Field991;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, a, (Class169)null, (Class261)null);
         } else if (a != 188) {
            int var3 = this.Field179 + 1;
            if (var3 > this.Field180) {
               this.Field180 = var3;
            }

            this.Field179 = var3;
         }
      }

      if (a == 17) {
         this.Field149.Method488(a, a);
      } else {
         this.Field149.Method486(a, a);
      }

   }

   public void Method1840(int a, int a) {
      this.Field169 = this.Field149.Field991;
      int var3;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, a, (Class169)null, (Class261)null);
         } else if (a == 169) {
            Class264 var10000 = this.Field178;
            var10000.Field1448 |= 256;
            this.Field178.Field1453 = this.Field179;
            this.Method1879();
         } else {
            var3 = this.Field179 + Class276.Field1503[a];
            if (var3 > this.Field180) {
               this.Field180 = var3;
            }

            this.Field179 = var3;
         }
      }

      if (this.Field175 != 2) {
         if (a != 22 && a != 24 && a != 55 && a != 57) {
            var3 = a + 1;
         } else {
            var3 = a + 2;
         }

         if (var3 > this.Field151) {
            this.Field151 = var3;
         }
      }

      if (a < 4 && a != 169) {
         if (a < 54) {
            var3 = 26 + (a - 21 << 2) + a;
         } else {
            var3 = 59 + (a - 54 << 2) + a;
         }

         this.Field149.Method485(var3);
      } else if (a >= 256) {
         this.Field149.Method485(196).Method488(a, a);
      } else {
         this.Field149.Method486(a, a);
      }

      if (a >= 54 && this.Field175 == 0 && this.Field158 > 0) {
         this.Method1947(new Class264());
      }

   }

   public void Method1952(int a, String a) {
      this.Field169 = this.Field149.Field991;
      Class261 var3 = this.Field130.Method1507(a);
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, this.Field149.Field991, this.Field130, var3);
         } else if (a == 187) {
            int var4 = this.Field179 + 1;
            if (var4 > this.Field180) {
               this.Field180 = var4;
            }

            this.Field179 = var4;
         }
      }

      this.Field149.Method488(a, var3.Field1426);
   }

   public void Method1949(int a, String a, String a, String a) {
      this.Field169 = this.Field149.Field991;
      Class261 var5 = this.Field130.Method1515(a, a, a);
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, 0, this.Field130, var5);
         } else {
            int var6;
            label91: {
               char var7 = a.charAt(0);
               switch (a) {
                  case 178:
                     var6 = this.Field179 + (var7 != 'D' && var7 != 'J' ? 1 : 2);
                     break label91;
                  case 179:
                     var6 = this.Field179 + (var7 != 'D' && var7 != 'J' ? -1 : -2);
                     break label91;
                  case 180:
                     var6 = this.Field179 + (var7 != 'D' && var7 != 'J' ? 0 : 1);
                     break label91;
               }

               var6 = this.Field179 + (var7 != 'D' && var7 != 'J' ? -2 : -3);
            }

            if (var6 > this.Field180) {
               this.Field180 = var6;
            }

            this.Field179 = var6;
         }
      }

      this.Field149.Method488(a, var5.Field1426);
   }

   public void Method1954(int a, String a, String a, String a, boolean a) {
      this.Field169 = this.Field149.Field991;
      Class261 var6 = this.Field130.Method1517(a, a, a, a);
      int var7 = var6.Field1428;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, 0, this.Field130, var6);
         } else {
            var7 = b.Method3215(a);
            var6.Field1428 = var7;
            int var8;
            if (a == 184) {
               var8 = this.Field179 - (var7 >> 2) + (var7 & 3) + 1;
            } else {
               var8 = this.Field179 - (var7 >> 2) + (var7 & 3);
            }

            if (var8 > this.Field180) {
               this.Field180 = var8;
            }

            this.Field179 = var8;
         }
      }

      if (a == 185) {
         var7 = b.Method3215(a);
         var6.Field1428 = var7;
         this.Field149.Method488(185, var6.Field1426).Method486(var7 >> 2, 0);
      } else {
         this.Field149.Method488(a, var6.Field1426);
      }

   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      this.Field169 = this.Field149.Field991;
      Class261 var5 = this.Field130.Method1513(a, a, a, a);
      int var6 = var5.Field1428;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(186, 0, this.Field130, var5);
         } else {
            var6 = b.Method3215(a);
            var5.Field1428 = var6;
            int var7 = this.Field179 - (var6 >> 2) + (var6 & 3) + 1;
            if (var7 > this.Field180) {
               this.Field180 = var7;
            }

            this.Field179 = var7;
         }
      }

      this.Field149.Method488(186, var5.Field1426);
      this.Field149.Method487(0);
   }

   public void Method1957(int a, Class264 a) {
      this.Field169 = this.Field149.Field991;
      Class264 var3 = null;
      if (this.Field178 != null) {
         Class264 var10000;
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, 0, (Class169)null, (Class261)null);
            var10000 = a.Method2854();
            var10000.Field1448 |= 16;
            this.Method1914(0, a);
            if (a != 167) {
               var3 = new Class264();
            }
         } else if (a == 168) {
            if ((a.Field1448 & 512) == 0) {
               a.Field1448 |= 512;
               ++this.Field174;
            }

            var10000 = this.Field178;
            var10000.Field1448 |= 128;
            this.Method1914(this.Field179 + 1, a);
            var3 = new Class264();
         } else {
            this.Field179 += Class276.Field1503[a];
            this.Method1914(this.Field179, a);
         }
      }

      if ((a.Field1448 & 2) != 0 && a.Field1450 - this.Field149.Field991 < -32768) {
         if (a == 167) {
            this.Field149.Method485(200);
         } else if (a == 168) {
            this.Field149.Method485(201);
         } else {
            var3.Field1448 |= 16;
            this.Field149.Method485(a <= 166 ? (a + 1 ^ 1) - 1 : a ^ 1);
            this.Field149.Method487(8);
            this.Field149.Method485(200);
         }

         a.Method2851(this, this.Field149, this.Field149.Field991 - 1, true);
      } else {
         this.Field149.Method485(a);
         a.Method2851(this, this.Field149, this.Field149.Field991 - 1, false);
      }

      if (this.Field178 != null) {
         this.Method1947(var3);
         if (a == 167) {
            this.Method1879();
         }
      }

   }

   public void Method1947(Class264 a) {
      this.Field173 |= a.Method2853(this, this.Field149.Field991, this.Field149.Field990);
      if ((a.Field1448 & 1) == 0) {
         if (this.Field175 == 0) {
            Class264 var10000;
            if (this.Field178 != null) {
               if (a.Field1450 == this.Field178.Field1450) {
                  var10000 = this.Field178;
                  var10000.Field1448 |= a.Field1448 & 16;
                  a.Field1455 = this.Field178.Field1455;
                  return;
               }

               this.Method1914(0, a);
            }

            this.Field178 = a;
            if (a.Field1455 == null) {
               a.Field1455 = new Class276();
               a.Field1455.Field1504 = a;
            }

            if (this.Field177 != null) {
               if (a.Field1450 == this.Field177.Field1450) {
                  var10000 = this.Field177;
                  var10000.Field1448 |= a.Field1448 & 16;
                  a.Field1455 = this.Field177.Field1455;
                  this.Field178 = this.Field177;
                  return;
               }

               this.Field177.Field1456 = a;
            }

            this.Field177 = a;
         } else if (this.Field175 == 1) {
            if (this.Field178 != null) {
               this.Field178.Field1454 = this.Field180;
               this.Method1914(this.Field179, a);
            }

            this.Field178 = a;
            this.Field179 = 0;
            this.Field180 = 0;
            if (this.Field177 != null) {
               this.Field177.Field1456 = a;
            }

            this.Field177 = a;
         }

      }
   }

   public void Method1950(Object a) {
      this.Field169 = this.Field149.Field991;
      Class261 var2 = this.Field130.Method1504(a);
      int var3;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(18, 0, this.Field130, var2);
         } else {
            if (var2.Field1427 != 5 && var2.Field1427 != 6) {
               var3 = this.Field179 + 1;
            } else {
               var3 = this.Field179 + 2;
            }

            if (var3 > this.Field180) {
               this.Field180 = var3;
            }

            this.Field179 = var3;
         }
      }

      var3 = var2.Field1426;
      if (var2.Field1427 != 5 && var2.Field1427 != 6) {
         if (var3 >= 256) {
            this.Field149.Method488(19, var3);
         } else {
            this.Field149.Method486(18, var3);
         }
      } else {
         this.Field149.Method488(20, var3);
      }

   }

   public void Method1841(int a, int a) {
      this.Field169 = this.Field149.Field991;
      if (this.Field178 != null && this.Field175 == 0) {
         this.Field178.Field1455.Method2801(132, a, (Class169)null, (Class261)null);
      }

      if (this.Field175 != 2) {
         int var3 = a + 1;
         if (var3 > this.Field151) {
            this.Field151 = var3;
         }
      }

      if (a <= 255 && a <= 127 && a >= -128) {
         this.Field149.Method485(132).Method486(a, a);
      } else {
         this.Field149.Method485(196).Method488(132, a).Method487(a);
      }

   }

   public void Method1959(int a, int a, Class264 a, Class264[] a) {
      this.Field169 = this.Field149.Field991;
      int var5 = this.Field149.Field991;
      this.Field149.Method485(170);
      this.Field149.Method493((byte[])null, 0, (4 - this.Field149.Field991 % 4) % 4);
      a.Method2851(this, this.Field149, var5, true);
      this.Field149.Method489(a).Method489(a);

      for(int var6 = 0; var6 < a.length; ++var6) {
         a[var6].Method2851(this, this.Field149, var5, true);
      }

      this.Method1961(a, a);
   }

   public void Method1958(Class264 a, int[] a, Class264[] a) {
      this.Field169 = this.Field149.Field991;
      int var4 = this.Field149.Field991;
      this.Field149.Method485(171);
      this.Field149.Method493((byte[])null, 0, (4 - this.Field149.Field991 % 4) % 4);
      a.Method2851(this, this.Field149, var4, true);
      this.Field149.Method489(a.length);

      for(int var5 = 0; var5 < a.length; ++var5) {
         this.Field149.Method489(a[var5]);
         a[var5].Method2851(this, this.Field149, var4, true);
      }

      this.Method1961(a, a);
   }

   private void Method1961(Class264 a, Class264[] a) {
      if (this.Field178 != null) {
         int var3;
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(171, 0, (Class169)null, (Class261)null);
            this.Method1914(0, a);
            Class264 var10000 = a.Method2854();
            var10000.Field1448 |= 16;

            for(var3 = 0; var3 < a.length; ++var3) {
               this.Method1914(0, a[var3]);
               var10000 = a[var3].Method2854();
               var10000.Field1448 |= 16;
            }
         } else {
            --this.Field179;
            this.Method1914(this.Field179, a);

            for(var3 = 0; var3 < a.length; ++var3) {
               this.Method1914(this.Field179, a[var3]);
            }
         }

         this.Method1879();
      }

   }

   public void Method1951(String a, int a) {
      this.Field169 = this.Field149.Field991;
      Class261 var3 = this.Field130.Method1507(a);
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(197, a, this.Field130, var3);
         } else {
            this.Field179 += 1 - a;
         }
      }

      this.Field149.Method488(197, var3.Field1426).Method485(a);
   }

   public Class148 Method1973(int a, Class31 a, String a, boolean a) {
      Class138 var5 = new Class138();
      a = a & -16776961 | this.Field169 << 8;
      Class150.Method1324(a, a, var5);
      var5.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 var6 = new Class150(this.Field130, true, var5, var5, var5.Field991 - 2);
      var6.Field1016 = this.Field170;
      this.Field170 = var6;
      return var6;
   }

   public void Method1960(Class264 a, Class264 a, Class264 a, String a) {
      ++this.Field158;
      Class258 var5 = new Class258();
      var5.Field1410 = a;
      var5.Field1411 = a;
      var5.Field1412 = a;
      var5.Field1413 = a;
      var5.Field1414 = this.Field130.Method1508(a);
      if (this.Field160 == null) {
         this.Field159 = var5;
      } else {
         this.Field160.Field1415 = var5;
      }

      this.Field160 = var5;
   }

   public Class148 Method1974(int a, Class31 a, String a, boolean a) {
      Class138 var5 = new Class138();
      Class150.Method1324(a, a, var5);
      var5.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 var6 = new Class150(this.Field130, true, var5, var5, var5.Field991 - 2);
      var6.Field1016 = this.Field170;
      this.Field170 = var6;
      return var6;
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
      if (this.Field166 == null) {
         this.Field166 = new Class138();
      }

      ++this.Field165;
      this.Field166.Method487(a.Field1450).Method487(a.Field1450 - a.Field1450).Method487(this.Field130.Method1506(a)).Method487(this.Field130.Method1506(a)).Method487(a);
      if (this.Field164 == null) {
         this.Field164 = new Class138();
      }

      ++this.Field163;
      this.Field164.Method487(a.Field1450).Method487(a.Field1450 - a.Field1450).Method487(this.Field130.Method1506(a)).Method487(this.Field130.Method1506(a)).Method487(a);
      if (this.Field175 != 2) {
         char var7 = a.charAt(0);
         int var8 = a + (var7 != 'J' && var7 != 'D' ? 1 : 2);
         if (var8 > this.Field151) {
            this.Field151 = var8;
         }
      }

   }

   public Class148 Method1844(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a) {
      Class138 var8 = new Class138();
      var8.Method485(a >>> 24).Method487(a.length);

      for(int var9 = 0; var9 < a.length; ++var9) {
         var8.Method487(a[var9].Field1450).Method487(a[var9].Field1450 - a[var9].Field1450).Method487(a[var9]);
      }

      var8.Method485(0);
      var8.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 var10 = new Class150(this.Field130, true, var8, var8, var8.Field991 - 2);
      var10.Field1016 = this.Field170;
      this.Field170 = var10;
      return var10;
   }

   public void Method1981(int a, Class264 a) {
      if (this.Field168 == null) {
         this.Field168 = new Class138();
      }

      ++this.Field167;
      this.Field168.Method487(a.Field1450);
      this.Field168.Method487(a);
   }

   public void Method1842(int a, int a) {
      if (this.Field173) {
         this.Method1893();
      }

      Class258 var3;
      Class264 var4;
      Class264 var5;
      Class264 var6;
      if (this.Field175 == 0) {
         var3 = this.Field159;

         while(true) {
            var4 = var3.Field1410.Method2854();
            var5 = var3.Field1412.Method2854();
            var6 = var3.Field1411.Method2854();
            String var13 = var3.Field1413 == null ? "java/lang/Throwable" : var3.Field1413;
            int var8 = 24117248 | this.Field130.Method1526(var13);

            for(var5.Field1448 |= 16; var4 != var6; var4 = var4.Field1456) {
               Class250 var9 = new Class250();
               var9.Field1384 = var8;
               var9.Field1385 = var5;
               var9.Field1386 = var4.Field1457;
               var4.Field1457 = var9;
            }

            var3 = var3.Field1415;
         }
      }

      if (this.Field175 == 1) {
         var3 = this.Field159;

         while(true) {
            var4 = var3.Field1410;
            var5 = var3.Field1412;

            for(var6 = var3.Field1411; var4 != var6; var4 = var4.Field1456) {
               Class250 var7 = new Class250();
               var7.Field1384 = Integer.MAX_VALUE;
               var7.Field1385 = var5;
               if ((var4.Field1448 & 128) == 0) {
                  var7.Field1386 = var4.Field1457;
                  var4.Field1457 = var7;
               } else {
                  var7.Field1386 = var4.Field1457.Field1386.Field1386;
                  var4.Field1457.Field1386.Field1386 = var7;
               }
            }

            var3 = var3.Field1415;
         }
      }

      this.Field150 = a;
      this.Field151 = a;
   }

   public void Method1653() {
   }

   private void Method1914(int a, Class264 a) {
      Class250 var3 = new Class250();
      var3.Field1384 = a;
      var3.Field1385 = a;
      var3.Field1386 = this.Field178.Field1457;
      this.Field178.Field1457 = var3;
   }

   private void Method1879() {
      if (this.Field175 == 0) {
         Class264 var1 = new Class264();
         var1.Field1455 = new Class276();
         var1.Field1455.Field1504 = var1;
         var1.Method2853(this, this.Field149.Field991, this.Field149.Field990);
         this.Field177.Field1456 = var1;
         this.Field177 = var1;
      } else {
         this.Field178.Field1454 = this.Field180;
      }

      this.Field178 = null;
   }

   private void Method1982(Class276 a) {
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int[] var7 = a.Field1505;
      int[] var8 = a.Field1506;

      int var2;
      int var3;
      for(var2 = 0; var2 < var7.length; ++var2) {
         var3 = var7[var2];
         if (var3 == 16777216) {
            ++var4;
         } else {
            var5 += var4 + 1;
            var4 = 0;
         }

         if (var3 == 16777220 || var3 == 16777219) {
            ++var2;
         }
      }

      for(var2 = 0; var2 < var8.length; ++var2) {
         var3 = var8[var2];
         ++var6;
         if (var3 == 16777220 || var3 == 16777219) {
            ++var2;
         }
      }

      int var9 = this.Method1983(a.Field1504.Field1450, var5, var6);
      var2 = 0;

      while(true) {
         var3 = var7[var2];
         this.Field157[var9++] = var3;
         if (var3 == 16777220 || var3 == 16777219) {
            ++var2;
         }

         ++var2;
         --var5;
      }
   }

   private void Method1882() {
      int var1 = this.Method1983(0, this.Field134.length() + 1, 0);
      if ((this.Field131 & 8) == 0) {
         if ((this.Field131 & 524288) == 0) {
            this.Field157[var1++] = 24117248 | this.Field130.Method1526(this.Field130.Field1093);
         } else {
            this.Field157[var1++] = 6;
         }
      }

      int var2 = 1;

      while(true) {
         int var3 = var2;
         switch (this.Field134.charAt(var2++)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
               this.Field157[var1++] = 1;
               break;
            case 'D':
               this.Field157[var1++] = 3;
               break;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            default:
               this.Field157[1] = var1 - 3;
               this.Method1883();
               return;
            case 'F':
               this.Field157[var1++] = 2;
               break;
            case 'J':
               this.Field157[var1++] = 4;
               break;
            case 'L':
               while(this.Field134.charAt(var2) != ';') {
                  ++var2;
               }

               this.Field157[var1++] = 24117248 | this.Field130.Method1526(this.Field134.substring(var3 + 1, var2++));
               break;
            case '[':
               while(this.Field134.charAt(var2) == '[') {
                  ++var2;
               }

               if (this.Field134.charAt(var2) == 'L') {
                  ++var2;

                  while(this.Field134.charAt(var2) != ';') {
                     ++var2;
                  }
               }

               int var10001 = var1++;
               ++var2;
               this.Field157[var10001] = 24117248 | this.Field130.Method1526(this.Field134.substring(var3, var2));
         }
      }
   }

   private int Method1983(int a, int a, int a) {
      int var4 = 3 + a + a;
      if (this.Field157 == null || this.Field157.length < var4) {
         this.Field157 = new int[var4];
      }

      this.Field157[0] = a;
      this.Field157[1] = a;
      this.Field157[2] = a;
      return 3;
   }

   private void Method1883() {
      if (this.Field156 != null) {
         if (this.Field154 == null) {
            this.Field154 = new Class138();
         }

         this.Method1892();
         ++this.Field153;
      }

      this.Field156 = this.Field157;
      this.Field157 = null;
   }

   private void Method1892() {
      int var1 = this.Field157[1];
      int var2 = this.Field157[2];
      if ((this.Field130.Field1080 & '\uffff') < 50) {
         this.Field154.Method487(this.Field157[0]).Method487(var1);
         this.Method1881(3, 3 + var1);
         this.Field154.Method487(var2);
         this.Method1881(3 + var1, 3 + var1 + var2);
      } else {
         int var3 = this.Field156[1];
         int var4 = 255;
         boolean var5 = false;
         int var6;
         if (this.Field153 == 0) {
            var6 = this.Field157[0];
         } else {
            var6 = this.Field157[0] - this.Field156[0] - 1;
         }

         int var9 = var1 - var3;
         switch (var9) {
            case -3:
            case -2:
            case -1:
               var4 = 248;
               var3 = var1;
               break;
            case 0:
               var4 = var6 < 64 ? 0 : 251;
               break;
            case 1:
            case 2:
            case 3:
               var4 = 252;
         }

         if (var4 != 255) {
            int var7 = 3;

            for(int var8 = 0; var8 < var3; ++var8) {
               if (this.Field157[var7] != this.Field156[var7]) {
                  var4 = 255;
                  break;
               }

               ++var7;
            }
         }

         switch (var4) {
            case 0:
               this.Field154.Method485(var6);
               break;
            case 64:
               this.Field154.Method485(64 + var6);
               this.Method1881(3 + var1, 4 + var1);
               break;
            case 247:
               this.Field154.Method485(247).Method487(var6);
               this.Method1881(3 + var1, 4 + var1);
               break;
            case 248:
               this.Field154.Method485(251 + var9).Method487(var6);
               break;
            case 251:
               this.Field154.Method485(251).Method487(var6);
               break;
            case 252:
               this.Field154.Method485(251 + var9).Method487(var6);
               this.Method1881(3 + var3, 3 + var1);
               break;
            default:
               this.Field154.Method485(255).Method487(var6).Method487(var1);
               this.Method1881(3, 3 + var1);
               this.Field154.Method487(var2);
               this.Method1881(3 + var1, 3 + var1 + var2);
         }

      }
   }

   private void Method1881(int a, int a) {
      for(int var3 = a; var3 < a; ++var3) {
         int var4 = this.Field157[var3];
         int var5 = var4 & -268435456;
         int var6 = var4 & 1048575;
         switch (var4 & 267386880) {
            case 24117248:
               this.Field154.Method485(7).Method487(this.Field130.Method1508(this.Field130.Field1089[var6].Field1430));
               break;
            case 25165824:
               this.Field154.Method485(8).Method487(this.Field130.Field1089[var6].Field1428);
               break;
            default:
               this.Field154.Method485(var6);
         }
      }

   }

   private void Method1965(Object a) {
      if (a instanceof String) {
         this.Field154.Method485(7).Method487(this.Field130.Method1508((String)a));
      } else if (a instanceof Integer) {
         this.Field154.Method485((Integer)a);
      } else {
         this.Field154.Method485(8).Method487(((Class264)a).Field1450);
      }

   }

   final int Method1984() {
      if (this.Field136 != 0) {
         return 6 + this.Field137;
      } else {
         int var1 = 8;
         if (this.Field149.Field991 > 0) {
            if (this.Field149.Field991 > 65536) {
               throw new RuntimeException("Method code too large!");
            }

            this.Field130.Method1506("Code");
            var1 += 18 + this.Field149.Field991 + 8 * this.Field158;
            if (this.Field164 != null) {
               this.Field130.Method1506("LocalVariableTable");
               var1 += 8 + this.Field164.Field991;
            }

            if (this.Field166 != null) {
               this.Field130.Method1506("LocalVariableTypeTable");
               var1 += 8 + this.Field166.Field991;
            }

            if (this.Field168 != null) {
               this.Field130.Method1506("LineNumberTable");
               var1 += 8 + this.Field168.Field991;
            }

            if (this.Field154 != null) {
               boolean var2 = (this.Field130.Field1080 & '\uffff') >= 50;
               this.Field130.Method1506("StackMapTable");
               var1 += 8 + this.Field154.Field991;
            }

            if (this.Field170 != null) {
               this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
               var1 += 8 + this.Field170.Method1321();
            }

            if (this.Field171 != null) {
               this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
               var1 += 8 + this.Field171.Method1321();
            }

            if (this.Field172 != null) {
               var1 += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
            }
         }

         if (this.Field138 > 0) {
            this.Field130.Method1506("Exceptions");
            var1 += 8 + 2 * this.Field138;
         }

         if ((this.Field131 & 4096) != 0 && ((this.Field130.Field1080 & '\uffff') < 49 || (this.Field131 & 262144) != 0)) {
            this.Field130.Method1506("Synthetic");
            var1 += 6;
         }

         if ((this.Field131 & 131072) != 0) {
            this.Field130.Method1506("Deprecated");
            var1 += 6;
         }

         if (this.Field135 != null) {
            this.Field130.Method1506("Signature");
            this.Field130.Method1506(this.Field135);
            var1 += 8;
         }

         if (this.Field162 != null) {
            this.Field130.Method1506("MethodParameters");
            var1 += 7 + this.Field162.Field991;
         }

         if (this.Field140 != null) {
            this.Field130.Method1506("AnnotationDefault");
            var1 += 6 + this.Field140.Field991;
         }

         if (this.Field141 != null) {
            this.Field130.Method1506("RuntimeVisibleAnnotations");
            var1 += 8 + this.Field141.Method1321();
         }

         if (this.Field142 != null) {
            this.Field130.Method1506("RuntimeInvisibleAnnotations");
            var1 += 8 + this.Field142.Method1321();
         }

         if (this.Field143 != null) {
            this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
            var1 += 8 + this.Field143.Method1321();
         }

         if (this.Field144 != null) {
            this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
            var1 += 8 + this.Field144.Method1321();
         }

         int var3;
         if (this.Field145 != null) {
            this.Field130.Method1506("RuntimeVisibleParameterAnnotations");
            var1 += 7 + 2 * (this.Field145.length - this.Field147);

            for(var3 = this.Field145.length - 1; var3 >= this.Field147; --var3) {
               var1 += this.Field145[var3] == null ? 0 : this.Field145[var3].Method1321();
            }
         }

         if (this.Field146 != null) {
            this.Field130.Method1506("RuntimeInvisibleParameterAnnotations");
            var1 += 7 + 2 * (this.Field146.length - this.Field147);

            for(var3 = this.Field146.length - 1; var3 >= this.Field147; --var3) {
               var1 += this.Field146[var3] == null ? 0 : this.Field146[var3].Method1321();
            }
         }

         if (this.Field148 != null) {
            var1 += this.Field148.Method474(this.Field130, (byte[])null, 0, -1, -1);
         }

         return var1;
      }
   }

   final void Method1985(Class138 a) {
      boolean var2 = true;
      int var3 = 917504 | (this.Field131 & 262144) / 64;
      a.Method487(this.Field131 & ~var3).Method487(this.Field132).Method487(this.Field133);
      if (this.Field136 != 0) {
         a.Method493(this.Field130.Field1079.Field1029, this.Field136, this.Field137);
      } else {
         int var4 = 0;
         if (this.Field149.Field991 > 0) {
            ++var4;
         }

         if (this.Field138 > 0) {
            ++var4;
         }

         if ((this.Field131 & 4096) != 0 && ((this.Field130.Field1080 & '\uffff') < 49 || (this.Field131 & 262144) != 0)) {
            ++var4;
         }

         if ((this.Field131 & 131072) != 0) {
            ++var4;
         }

         if (this.Field135 != null) {
            ++var4;
         }

         if (this.Field162 != null) {
            ++var4;
         }

         if (this.Field140 != null) {
            ++var4;
         }

         if (this.Field141 != null) {
            ++var4;
         }

         if (this.Field142 != null) {
            ++var4;
         }

         if (this.Field143 != null) {
            ++var4;
         }

         if (this.Field144 != null) {
            ++var4;
         }

         if (this.Field145 != null) {
            ++var4;
         }

         if (this.Field146 != null) {
            ++var4;
         }

         if (this.Field148 != null) {
            var4 += this.Field148.Method473();
         }

         a.Method487(var4);
         int var5;
         if (this.Field149.Field991 > 0) {
            var5 = 12 + this.Field149.Field991 + 8 * this.Field158;
            if (this.Field164 != null) {
               var5 += 8 + this.Field164.Field991;
            }

            if (this.Field166 != null) {
               var5 += 8 + this.Field166.Field991;
            }

            if (this.Field168 != null) {
               var5 += 8 + this.Field168.Field991;
            }

            if (this.Field154 != null) {
               var5 += 8 + this.Field154.Field991;
            }

            if (this.Field170 != null) {
               var5 += 8 + this.Field170.Method1321();
            }

            if (this.Field171 != null) {
               var5 += 8 + this.Field171.Method1321();
            }

            if (this.Field172 != null) {
               var5 += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
            }

            a.Method487(this.Field130.Method1506("Code")).Method489(var5);
            a.Method487(this.Field150).Method487(this.Field151);
            a.Method489(this.Field149.Field991).Method493(this.Field149.Field990, 0, this.Field149.Field991);
            a.Method487(this.Field158);
            if (this.Field158 > 0) {
               Class258 var7 = this.Field159;

               while(true) {
                  a.Method487(var7.Field1410.Field1450).Method487(var7.Field1411.Field1450).Method487(var7.Field1412.Field1450).Method487(var7.Field1414);
                  var7 = var7.Field1415;
               }
            }

            var4 = 0;
            if (this.Field164 != null) {
               ++var4;
            }

            if (this.Field166 != null) {
               ++var4;
            }

            if (this.Field168 != null) {
               ++var4;
            }

            if (this.Field154 != null) {
               ++var4;
            }

            if (this.Field170 != null) {
               ++var4;
            }

            if (this.Field171 != null) {
               ++var4;
            }

            if (this.Field172 != null) {
               var4 += this.Field172.Method473();
            }

            a.Method487(var4);
            if (this.Field164 != null) {
               a.Method487(this.Field130.Method1506("LocalVariableTable"));
               a.Method489(this.Field164.Field991 + 2).Method487(this.Field163);
               a.Method493(this.Field164.Field990, 0, this.Field164.Field991);
            }

            if (this.Field166 != null) {
               a.Method487(this.Field130.Method1506("LocalVariableTypeTable"));
               a.Method489(this.Field166.Field991 + 2).Method487(this.Field165);
               a.Method493(this.Field166.Field990, 0, this.Field166.Field991);
            }

            if (this.Field168 != null) {
               a.Method487(this.Field130.Method1506("LineNumberTable"));
               a.Method489(this.Field168.Field991 + 2).Method487(this.Field167);
               a.Method493(this.Field168.Field990, 0, this.Field168.Field991);
            }

            if (this.Field154 != null) {
               boolean var6 = (this.Field130.Field1080 & '\uffff') >= 50;
               a.Method487(this.Field130.Method1506("StackMapTable"));
               a.Method489(this.Field154.Field991 + 2).Method487(this.Field153);
               a.Method493(this.Field154.Field990, 0, this.Field154.Field991);
            }

            if (this.Field170 != null) {
               a.Method487(this.Field130.Method1506("RuntimeVisibleTypeAnnotations"));
               this.Field170.Method1322(a);
            }

            if (this.Field171 != null) {
               a.Method487(this.Field130.Method1506("RuntimeInvisibleTypeAnnotations"));
               this.Field171.Method1322(a);
            }

            if (this.Field172 != null) {
               this.Field172.Method475(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field151, this.Field150, a);
            }
         }

         if (this.Field138 > 0) {
            a.Method487(this.Field130.Method1506("Exceptions")).Method489(2 * this.Field138 + 2);
            a.Method487(this.Field138);

            for(var5 = 0; var5 < this.Field138; ++var5) {
               a.Method487(this.Field139[var5]);
            }
         }

         if ((this.Field131 & 4096) != 0 && ((this.Field130.Field1080 & '\uffff') < 49 || (this.Field131 & 262144) != 0)) {
            a.Method487(this.Field130.Method1506("Synthetic")).Method489(0);
         }

         if ((this.Field131 & 131072) != 0) {
            a.Method487(this.Field130.Method1506("Deprecated")).Method489(0);
         }

         if (this.Field135 != null) {
            a.Method487(this.Field130.Method1506("Signature")).Method489(2).Method487(this.Field130.Method1506(this.Field135));
         }

         if (this.Field162 != null) {
            a.Method487(this.Field130.Method1506("MethodParameters"));
            a.Method489(this.Field162.Field991 + 1).Method485(this.Field161);
            a.Method493(this.Field162.Field990, 0, this.Field162.Field991);
         }

         if (this.Field140 != null) {
            a.Method487(this.Field130.Method1506("AnnotationDefault"));
            a.Method489(this.Field140.Field991);
            a.Method493(this.Field140.Field990, 0, this.Field140.Field991);
         }

         if (this.Field141 != null) {
            a.Method487(this.Field130.Method1506("RuntimeVisibleAnnotations"));
            this.Field141.Method1322(a);
         }

         if (this.Field142 != null) {
            a.Method487(this.Field130.Method1506("RuntimeInvisibleAnnotations"));
            this.Field142.Method1322(a);
         }

         if (this.Field143 != null) {
            a.Method487(this.Field130.Method1506("RuntimeVisibleTypeAnnotations"));
            this.Field143.Method1322(a);
         }

         if (this.Field144 != null) {
            a.Method487(this.Field130.Method1506("RuntimeInvisibleTypeAnnotations"));
            this.Field144.Method1322(a);
         }

         if (this.Field145 != null) {
            a.Method487(this.Field130.Method1506("RuntimeVisibleParameterAnnotations"));
            Class150.Method1323(this.Field145, this.Field147, a);
         }

         if (this.Field146 != null) {
            a.Method487(this.Field130.Method1506("RuntimeInvisibleParameterAnnotations"));
            Class150.Method1323(this.Field146, this.Field147, a);
         }

         if (this.Field148 != null) {
            this.Field148.Method475(this.Field130, (byte[])null, 0, -1, -1, a);
         }

      }
   }

   private void Method1893() {
      byte[] var2 = this.Field149.Field990;
      Class267.Method2862();
      int[] var8 = new int[0];
      int[] var9 = new int[0];
      boolean[] var10 = new boolean[this.Field149.Field991];
      int var12 = 3;
      if (var12 == 3) {
         var12 = 2;
      }

      int var3 = 0;
      int var5;
      int var11;
      int var14;
      if (var3 < var2.length) {
         label244: {
            label243: {
               label242: {
                  label250: {
                     int var13;
                     label251: {
                        label252: {
                           var13 = var2[var3] & 255;
                           var14 = 0;
                           switch (Class169.Field1059[var13]) {
                              case 0:
                              case 4:
                                 ++var3;
                              case 9:
                                 if (var13 > 201) {
                                    var13 = var13 < 218 ? var13 - 49 : var13 - 20;
                                    var5 = var3 + Method1986(var2, var3 + 1);
                                 }

                                 var5 = var3 + Method1987(var2, var3 + 1);
                                 var11 = Method1990(var8, var9, var3, var5);
                                 if ((var11 < -32768 || var11 > 32767) && !var10[var3]) {
                                    if (var13 == 167 || var13 == 168) {
                                       boolean var19 = true;
                                    }

                                    var14 = 5;
                                    var10[var3] = true;
                                 }

                                 var3 += 3;
                              case 10:
                                 var3 += 5;
                                 break;
                              case 1:
                              case 3:
                              case 11:
                                 break label250;
                              case 2:
                              case 5:
                              case 6:
                              case 12:
                              case 13:
                                 break label242;
                              case 7:
                              case 8:
                                 break label243;
                              case 14:
                                 break;
                              case 15:
                                 break label252;
                              case 16:
                              default:
                                 break label244;
                              case 17:
                                 break label251;
                           }

                           if (var12 == 1) {
                              var11 = Method1990(var8, var9, 0, var3);
                              var14 = -(var11 & 3);
                           }

                           if (!var10[var3]) {
                              var14 = var3 & 3;
                              var10[var3] = true;
                           }

                           var3 = var3 + 4 - (var3 & 3);
                           var3 += 4 * (Method1988(var2, var3 + 8) - Method1988(var2, var3 + 4) + 1) + 12;
                        }

                        if (var12 == 1) {
                           var11 = Method1990(var8, var9, 0, var3);
                           var14 = -(var11 & 3);
                        }

                        if (!var10[var3]) {
                           var14 = var3 & 3;
                           var10[var3] = true;
                        }

                        var3 = var3 + 4 - (var3 & 3);
                        var3 += 8 * Method1988(var2, var3 + 4) + 8;
                     }

                     var13 = var2[var3 + 1] & 255;
                     if (var13 == 132) {
                        var3 += 6;
                     }

                     var3 += 4;
                  }

                  var3 += 2;
               }

               var3 += 3;
            }

            var3 += 5;
         }

         var3 += 4;
         int[] var15 = new int[var8.length + 1];
         int[] var16 = new int[var9.length + 1];
         System.arraycopy(var8, 0, var15, 0, var8.length);
         System.arraycopy(var9, 0, var16, 0, var9.length);
         var15[var8.length] = var3;
         var16[var9.length] = var14;
         var8 = var15;
         var9 = var16;
         var12 = 3;
      }

      if (var12 < 3) {
         --var12;
      }

      Class138 var18 = new Class138(this.Field149.Field991);
      var3 = 0;
      if (var3 < this.Field149.Field991) {
         var14 = var2[var3] & 255;
         int var4;
         int var7;
         switch (Class169.Field1059[var14]) {
            case 0:
            case 4:
               var18.Method485(var14);
               ++var3;
            case 9:
               if (var14 > 201) {
                  var14 = var14 < 218 ? var14 - 49 : var14 - 20;
                  var5 = var3 + Method1986(var2, var3 + 1);
               }

               var5 = var3 + Method1987(var2, var3 + 1);
               var11 = Method1990(var8, var9, var3, var5);
               if (var10[var3]) {
                  if (var14 == 167) {
                     var18.Method485(200);
                  }

                  if (var14 == 168) {
                     var18.Method485(201);
                  }

                  var18.Method485(var14 <= 166 ? (var14 + 1 ^ 1) - 1 : var14 ^ 1);
                  var18.Method487(8);
                  var18.Method485(200);
                  var11 -= 3;
                  var18.Method489(var11);
               }

               var18.Method485(var14);
               var18.Method487(var11);
               var3 += 3;
            case 10:
               var5 = var3 + Method1988(var2, var3 + 1);
               var11 = Method1990(var8, var9, var3, var5);
               var18.Method485(var14);
               var18.Method489(var11);
               var3 += 5;
            case 14:
               var4 = var3;
               var3 = var3 + 4 - (var3 & 3);
               var18.Method485(170);
               var18.Method493((byte[])null, 0, (4 - var18.Field991 % 4) % 4);
               var5 = var4 + Method1988(var2, var3);
               var3 += 4;
               var11 = Method1990(var8, var9, var4, var5);
               var18.Method489(var11);
               var7 = Method1988(var2, var3);
               var3 += 4;
               var18.Method489(var7);
               var7 = Method1988(var2, var3) - var7 + 1;
               var3 += 4;
               var18.Method489(Method1988(var2, var3 - 4));
               var5 = var4 + Method1988(var2, var3);
               var3 += 4;
               var11 = Method1990(var8, var9, var4, var5);
               var18.Method489(var11);
               --var7;
            case 15:
               var4 = var3;
               var3 = var3 + 4 - (var3 & 3);
               var18.Method485(171);
               var18.Method493((byte[])null, 0, (4 - var18.Field991 % 4) % 4);
               var5 = var4 + Method1988(var2, var3);
               var3 += 4;
               var11 = Method1990(var8, var9, var4, var5);
               var18.Method489(var11);
               var7 = Method1988(var2, var3);
               var3 += 4;
               var18.Method489(var7);
               var18.Method489(Method1988(var2, var3));
               var3 += 4;
               var5 = var4 + Method1988(var2, var3);
               var3 += 4;
               var11 = Method1990(var8, var9, var4, var5);
               var18.Method489(var11);
               --var7;
            case 17:
               var14 = var2[var3 + 1] & 255;
               if (var14 == 132) {
                  var18.Method493(var2, var3, 6);
                  var3 += 6;
               }

               var18.Method493(var2, var3, 4);
               var3 += 4;
            case 1:
            case 3:
            case 11:
               var18.Method493(var2, var3, 2);
               var3 += 2;
            case 2:
            case 5:
            case 6:
            case 12:
            case 13:
               var18.Method493(var2, var3, 3);
               var3 += 3;
            case 7:
            case 8:
               var18.Method493(var2, var3, 5);
               var3 += 5;
            case 16:
            default:
               var18.Method493(var2, var3, 4);
               var3 += 4;
         }
      }

      int var6;
      if (this.Field175 == 0) {
         Class264 var24 = this.Field176;
         var3 = var24.Field1450 - 3;
         if (var10[var3]) {
            var24.Field1448 |= 16;
         }

         Method1991(var8, var9, var24);
         var24 = var24.Field1456;
         var6 = 0;
         if (var6 < this.Field130.Field1089.length) {
            Class261 var20 = this.Field130.Field1089[var6];
            if (var20.Field1427 == 31) {
               var20.Field1428 = Method1990(var8, var9, 0, var20.Field1428);
            }

            ++var6;
         }
      }

      if (this.Field153 > 0) {
         this.Field130.Field1117 = true;
      }

      Class258 var25 = this.Field159;
      Method1991(var8, var9, var25.Field1410);
      Method1991(var8, var9, var25.Field1411);
      Method1991(var8, var9, var25.Field1412);
      var25 = var25.Field1415;
      byte var17 = 0;
      byte var26;
      if (var17 < 2) {
         Class138 var21 = this.Field164;
         var2 = var21.Field990;
         var26 = 0;
         if (var26 < var21.Field991) {
            var5 = Method1986(var2, var26);
            var11 = Method1990(var8, var9, 0, var5);
            Method1989(var2, var26, var11);
            var5 += Method1986(var2, var26 + 2);
            var11 = Method1990(var8, var9, 0, var5) - var11;
            Method1989(var2, var26 + 2, var11);
            var3 = var26 + 10;
         }

         var6 = var17 + 1;
      }

      if (this.Field168 != null) {
         var2 = this.Field168.Field990;
         var26 = 0;
         if (var26 < this.Field168.Field991) {
            Method1989(var2, var26, Method1990(var8, var9, 0, Method1986(var2, var26)));
            var3 = var26 + 4;
         }
      }

      Class136 var22 = this.Field172;
      Class264[] var23 = var22.Method470();
      var6 = var23.length - 1;
      Method1991(var8, var9, var23[var6]);
      --var6;
      var22 = var22.Field989;
      this.Field149 = var18;
   }

   static int Method1986(byte[] a, int a) {
      return (a[a] & 255) << 8 | a[a + 1] & 255;
   }

   static short Method1987(byte[] a, int a) {
      return (short)((a[a] & 255) << 8 | a[a + 1] & 255);
   }

   static int Method1988(byte[] a, int a) {
      return (a[a] & 255) << 24 | (a[a + 1] & 255) << 16 | (a[a + 2] & 255) << 8 | a[a + 3] & 255;
   }

   static void Method1989(byte[] a, int a, int a) {
      a[a] = (byte)(a >>> 8);
      a[a + 1] = (byte)a;
   }

   static int Method1990(int[] a, int[] a, int a, int a) {
      int var4 = a - a;

      for(int var5 = 0; var5 < a.length; ++var5) {
         if (a < a[var5] && a[var5] <= a) {
            var4 += a[var5];
         } else if (a < a[var5] && a[var5] <= a) {
            var4 -= a[var5];
         }
      }

      return var4;
   }

   static void Method1991(int[] a, int[] a, Class264 a) {
      if ((a.Field1448 & 4) == 0) {
         a.Field1450 = Method1990(a, a, 0, a.Field1450);
         a.Field1448 |= 4;
      }

   }

   private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
