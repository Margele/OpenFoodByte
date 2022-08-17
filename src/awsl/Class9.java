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

   Class9(Class169 a, int a, String a, String a, String a, String[] a, boolean a6, boolean a7) {
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
      int a;
      if (a.length > 0) {
         this.Field138 = a.length;
         this.Field139 = new int[this.Field138];

         for(a = 0; a < this.Field138; ++a) {
            this.Field139[a] = a.Method1508(a[a]);
         }
      }

      this.Field175 = 0;
      a = b.Method3215(this.Field134) >> 2;
      if ((a & 8) != 0) {
         --a;
      }

      this.Field151 = a;
      this.Field152 = a;
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

   public Class148 Method1969(String a, boolean a1) {
      Class138 a = new Class138();
      a.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 a = new Class150(this.Field130, true, a, a, 2);
      a.Field1016 = this.Field141;
      this.Field141 = a;
      return a;
   }

   public Class148 Method1970(int a, Class31 a, String a, boolean a3) {
      Class138 a = new Class138();
      Class150.Method1324(a, a, a);
      a.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 a = new Class150(this.Field130, true, a, a, a.Field991 - 2);
      a.Field1016 = this.Field143;
      this.Field143 = a;
      return a;
   }

   public Class148 Method1971(int a, String a, boolean a2) {
      Class138 a = new Class138();
      if ("Ljava/lang/Synthetic;".equals(a)) {
         this.Field147 = Math.max(this.Field147, a + 1);
         return new Class150(this.Field130, false, a, (Class138)null, 0);
      } else {
         a.Method487(this.Field130.Method1506(a)).Method487(0);
         Class150 a = new Class150(this.Field130, true, a, a, 2);
         if (this.Field145 == null) {
            this.Field145 = new Class150[b.Method3211(this.Field134).length];
         }

         a.Field1016 = this.Field145[a];
         this.Field145[a] = a;
         return a;
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
         int a;
         int a;
         if (a == -1) {
            if (this.Field156 == null) {
               this.Method1882();
            }

            this.Field152 = a;
            a = this.Method1983(this.Field149.Field991, a, a);

            for(a = 0; a < a; ++a) {
               if (a[a] instanceof String) {
                  this.Field157[a++] = 24117248 | this.Field130.Method1526((String)a[a]);
               } else if (a[a] instanceof Integer) {
                  this.Field157[a++] = (Integer)a[a];
               } else {
                  this.Field157[a++] = 25165824 | this.Field130.Method1527("", ((Class264)a[a]).Field1450);
               }
            }

            for(a = 0; a < a; ++a) {
               if (a[a] instanceof String) {
                  this.Field157[a++] = 24117248 | this.Field130.Method1526((String)a[a]);
               } else if (a[a] instanceof Integer) {
                  this.Field157[a++] = (Integer)a[a];
               } else {
                  this.Field157[a++] = 25165824 | this.Field130.Method1527("", ((Class264)a[a]).Field1450);
               }
            }

            this.Method1883();
         } else {
            if (this.Field154 != null) {
               a = this.Field149.Field991 - this.Field155 - 1;
               if (a == 3) {
                  return;
               }

               throw new IllegalStateException();
            }

            this.Field154 = new Class138();
            a = this.Field149.Field991;
            label97:
            switch (a) {
               case 0:
                  this.Field152 = a;
                  this.Field154.Method485(255).Method487(a).Method487(a);

                  for(a = 0; a < a; ++a) {
                     this.Method1965(a[a]);
                  }

                  this.Field154.Method487(a);

                  for(a = 0; a < a; ++a) {
                     this.Method1965(a[a]);
                  }
                  break;
               case 1:
                  this.Field152 += a;
                  this.Field154.Method485(251 + a).Method487(a);
                  a = 0;

                  while(true) {
                     if (a >= a) {
                        break label97;
                     }

                     this.Method1965(a[a]);
                     ++a;
                  }
               case 2:
                  this.Field152 -= a;
                  this.Field154.Method485(251 - a).Method487(a);
                  break;
               case 3:
                  if (a < 64) {
                     this.Field154.Method485(a);
                  } else {
                     this.Field154.Method485(251).Method487(a);
                  }
                  break;
               case 4:
                  if (a < 64) {
                     this.Field154.Method485(64 + a);
                  } else {
                     this.Field154.Method485(247).Method487(a);
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
            int a = this.Field179 + Class276.Field1503[a];
            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
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
            int a = this.Field179 + 1;
            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
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
      int a;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, a, (Class169)null, (Class261)null);
         } else if (a == 169) {
            Class264 var10000 = this.Field178;
            var10000.Field1448 |= 256;
            this.Field178.Field1453 = this.Field179;
            this.Method1879();
         } else {
            a = this.Field179 + Class276.Field1503[a];
            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
         }
      }

      if (this.Field175 != 2) {
         if (a != 22 && a != 24 && a != 55 && a != 57) {
            a = a + 1;
         } else {
            a = a + 2;
         }

         if (a > this.Field151) {
            this.Field151 = a;
         }
      }

      if (a < 4 && a != 169) {
         if (a < 54) {
            a = 26 + (a - 21 << 2) + a;
         } else {
            a = 59 + (a - 54 << 2) + a;
         }

         this.Field149.Method485(a);
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
      Class261 a = this.Field130.Method1507(a);
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, this.Field149.Field991, this.Field130, a);
         } else if (a == 187) {
            int a = this.Field179 + 1;
            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
         }
      }

      this.Field149.Method488(a, a.Field1426);
   }

   public void Method1949(int a, String a, String a, String a) {
      this.Field169 = this.Field149.Field991;
      Class261 a = this.Field130.Method1515(a, a, a);
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, 0, this.Field130, a);
         } else {
            int a;
            label91: {
               char a = a.charAt(0);
               switch (a) {
                  case 178:
                     a = this.Field179 + (a != 'D' && a != 'J' ? 1 : 2);
                     break label91;
                  case 179:
                     a = this.Field179 + (a != 'D' && a != 'J' ? -1 : -2);
                     break label91;
                  case 180:
                     a = this.Field179 + (a != 'D' && a != 'J' ? 0 : 1);
                     break label91;
               }

               a = this.Field179 + (a != 'D' && a != 'J' ? -2 : -3);
            }

            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
         }
      }

      this.Field149.Method488(a, a.Field1426);
   }

   public void Method1954(int a, String a, String a, String a, boolean a) {
      this.Field169 = this.Field149.Field991;
      Class261 a = this.Field130.Method1517(a, a, a, a);
      int a = a.Field1428;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, 0, this.Field130, a);
         } else {
            a = b.Method3215(a);
            a.Field1428 = a;
            int a;
            if (a == 184) {
               a = this.Field179 - (a >> 2) + (a & 3) + 1;
            } else {
               a = this.Field179 - (a >> 2) + (a & 3);
            }

            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
         }
      }

      if (a == 185) {
         a = b.Method3215(a);
         a.Field1428 = a;
         this.Field149.Method488(185, a.Field1426).Method486(a >> 2, 0);
      } else {
         this.Field149.Method488(a, a.Field1426);
      }

   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      this.Field169 = this.Field149.Field991;
      Class261 a = this.Field130.Method1513(a, a, a, a);
      int a = a.Field1428;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(186, 0, this.Field130, a);
         } else {
            a = b.Method3215(a);
            a.Field1428 = a;
            int a = this.Field179 - (a >> 2) + (a & 3) + 1;
            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
         }
      }

      this.Field149.Method488(186, a.Field1426);
      this.Field149.Method487(0);
   }

   public void Method1957(int a, Class264 a) {
      this.Field169 = this.Field149.Field991;
      Class264 a = null;
      if (this.Field178 != null) {
         Class264 var10000;
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(a, 0, (Class169)null, (Class261)null);
            var10000 = a.Method2854();
            var10000.Field1448 |= 16;
            this.Method1914(0, a);
            if (a != 167) {
               a = new Class264();
            }
         } else if (a == 168) {
            if ((a.Field1448 & 512) == 0) {
               a.Field1448 |= 512;
               ++this.Field174;
            }

            var10000 = this.Field178;
            var10000.Field1448 |= 128;
            this.Method1914(this.Field179 + 1, a);
            a = new Class264();
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
            a.Field1448 |= 16;
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
         this.Method1947(a);
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
      Class261 a = this.Field130.Method1504(a);
      int a;
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(18, 0, this.Field130, a);
         } else {
            if (a.Field1427 != 5 && a.Field1427 != 6) {
               a = this.Field179 + 1;
            } else {
               a = this.Field179 + 2;
            }

            if (a > this.Field180) {
               this.Field180 = a;
            }

            this.Field179 = a;
         }
      }

      a = a.Field1426;
      if (a.Field1427 != 5 && a.Field1427 != 6) {
         if (a >= 256) {
            this.Field149.Method488(19, a);
         } else {
            this.Field149.Method486(18, a);
         }
      } else {
         this.Field149.Method488(20, a);
      }

   }

   public void Method1841(int a, int a) {
      this.Field169 = this.Field149.Field991;
      if (this.Field178 != null && this.Field175 == 0) {
         this.Field178.Field1455.Method2801(132, a, (Class169)null, (Class261)null);
      }

      if (this.Field175 != 2) {
         int a = a + 1;
         if (a > this.Field151) {
            this.Field151 = a;
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
      int a = this.Field149.Field991;
      this.Field149.Method485(170);
      this.Field149.Method493((byte[])null, 0, (4 - this.Field149.Field991 % 4) % 4);
      a.Method2851(this, this.Field149, a, true);
      this.Field149.Method489(a).Method489(a);

      for(int a = 0; a < a.length; ++a) {
         a[a].Method2851(this, this.Field149, a, true);
      }

      this.Method1961(a, a);
   }

   public void Method1958(Class264 a, int[] a, Class264[] a) {
      this.Field169 = this.Field149.Field991;
      int a = this.Field149.Field991;
      this.Field149.Method485(171);
      this.Field149.Method493((byte[])null, 0, (4 - this.Field149.Field991 % 4) % 4);
      a.Method2851(this, this.Field149, a, true);
      this.Field149.Method489(a.length);

      for(int a = 0; a < a.length; ++a) {
         this.Field149.Method489(a[a]);
         a[a].Method2851(this, this.Field149, a, true);
      }

      this.Method1961(a, a);
   }

   private void Method1961(Class264 a, Class264[] a) {
      if (this.Field178 != null) {
         int a;
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(171, 0, (Class169)null, (Class261)null);
            this.Method1914(0, a);
            Class264 var10000 = a.Method2854();
            var10000.Field1448 |= 16;

            for(a = 0; a < a.length; ++a) {
               this.Method1914(0, a[a]);
               var10000 = a[a].Method2854();
               var10000.Field1448 |= 16;
            }
         } else {
            --this.Field179;
            this.Method1914(this.Field179, a);

            for(a = 0; a < a.length; ++a) {
               this.Method1914(this.Field179, a[a]);
            }
         }

         this.Method1879();
      }

   }

   public void Method1951(String a, int a) {
      this.Field169 = this.Field149.Field991;
      Class261 a = this.Field130.Method1507(a);
      if (this.Field178 != null) {
         if (this.Field175 == 0) {
            this.Field178.Field1455.Method2801(197, a, this.Field130, a);
         } else {
            this.Field179 += 1 - a;
         }
      }

      this.Field149.Method488(197, a.Field1426).Method485(a);
   }

   public Class148 Method1973(int a, Class31 a, String a, boolean a3) {
      Class138 a = new Class138();
      a = a & -16776961 | this.Field169 << 8;
      Class150.Method1324(a, a, a);
      a.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 a = new Class150(this.Field130, true, a, a, a.Field991 - 2);
      a.Field1016 = this.Field170;
      this.Field170 = a;
      return a;
   }

   public void Method1960(Class264 a, Class264 a, Class264 a, String a) {
      ++this.Field158;
      Class258 a = new Class258();
      a.Field1410 = a;
      a.Field1411 = a;
      a.Field1412 = a;
      a.Field1413 = a;
      a.Field1414 = this.Field130.Method1508(a);
      if (this.Field160 == null) {
         this.Field159 = a;
      } else {
         this.Field160.Field1415 = a;
      }

      this.Field160 = a;
   }

   public Class148 Method1974(int a, Class31 a, String a, boolean a3) {
      Class138 a = new Class138();
      Class150.Method1324(a, a, a);
      a.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 a = new Class150(this.Field130, true, a, a, a.Field991 - 2);
      a.Field1016 = this.Field170;
      this.Field170 = a;
      return a;
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
         char a = a.charAt(0);
         int a = a + (a != 'J' && a != 'D' ? 1 : 2);
         if (a > this.Field151) {
            this.Field151 = a;
         }
      }

   }

   public Class148 Method1844(int a, Class31 a1, Class264[] a, Class264[] a, int[] a, String a, boolean a6) {
      Class138 a = new Class138();
      a.Method485(a >>> 24).Method487(a.length);

      for(int a = 0; a < a.length; ++a) {
         a.Method487(a[a].Field1450).Method487(a[a].Field1450 - a[a].Field1450).Method487(a[a]);
      }

      a.Method485(0);
      a.Method487(this.Field130.Method1506(a)).Method487(0);
      Class150 a = new Class150(this.Field130, true, a, a, a.Field991 - 2);
      a.Field1016 = this.Field170;
      this.Field170 = a;
      return a;
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

      Class258 a;
      Class264 a;
      Class264 a;
      Class264 a;
      if (this.Field175 == 0) {
         a = this.Field159;

         while(true) {
            a = a.Field1410.Method2854();
            a = a.Field1412.Method2854();
            a = a.Field1411.Method2854();
            String a = a.Field1413 == null ? "java/lang/Throwable" : a.Field1413;
            int a = 24117248 | this.Field130.Method1526(a);

            for(a.Field1448 |= 16; a != a; a = a.Field1456) {
               Class250 a = new Class250();
               a.Field1384 = a;
               a.Field1385 = a;
               a.Field1386 = a.Field1457;
               a.Field1457 = a;
            }

            a = a.Field1415;
         }
      }

      if (this.Field175 == 1) {
         a = this.Field159;

         while(true) {
            a = a.Field1410;
            a = a.Field1412;

            for(a = a.Field1411; a != a; a = a.Field1456) {
               Class250 a = new Class250();
               a.Field1384 = Integer.MAX_VALUE;
               a.Field1385 = a;
               if ((a.Field1448 & 128) == 0) {
                  a.Field1386 = a.Field1457;
                  a.Field1457 = a;
               } else {
                  a.Field1386 = a.Field1457.Field1386.Field1386;
                  a.Field1457.Field1386.Field1386 = a;
               }
            }

            a = a.Field1415;
         }
      }

      this.Field150 = a;
      this.Field151 = a;
   }

   public void Method1653() {
   }

   private void Method1914(int a, Class264 a) {
      Class250 a = new Class250();
      a.Field1384 = a;
      a.Field1385 = a;
      a.Field1386 = this.Field178.Field1457;
      this.Field178.Field1457 = a;
   }

   private void Method1879() {
      if (this.Field175 == 0) {
         Class264 a = new Class264();
         a.Field1455 = new Class276();
         a.Field1455.Field1504 = a;
         a.Method2853(this, this.Field149.Field991, this.Field149.Field990);
         this.Field177.Field1456 = a;
         this.Field177 = a;
      } else {
         this.Field178.Field1454 = this.Field180;
      }

      this.Field178 = null;
   }

   private void Method1982(Class276 a) {
      int a = 0;
      int a = 0;
      int a = 0;
      int[] a = a.Field1505;
      int[] a = a.Field1506;

      int a;
      int a;
      for(a = 0; a < a.length; ++a) {
         a = a[a];
         if (a == 16777216) {
            ++a;
         } else {
            a += a + 1;
            a = 0;
         }

         if (a == 16777220 || a == 16777219) {
            ++a;
         }
      }

      for(a = 0; a < a.length; ++a) {
         a = a[a];
         ++a;
         if (a == 16777220 || a == 16777219) {
            ++a;
         }
      }

      int a = this.Method1983(a.Field1504.Field1450, a, a);
      a = 0;

      while(true) {
         a = a[a];
         this.Field157[a++] = a;
         if (a == 16777220 || a == 16777219) {
            ++a;
         }

         ++a;
         --a;
      }
   }

   private void Method1882() {
      int a = this.Method1983(0, this.Field134.length() + 1, 0);
      if ((this.Field131 & 8) == 0) {
         if ((this.Field131 & 524288) == 0) {
            this.Field157[a++] = 24117248 | this.Field130.Method1526(this.Field130.Field1093);
         } else {
            this.Field157[a++] = 6;
         }
      }

      int a = 1;

      while(true) {
         int a = a;
         switch (this.Field134.charAt(a++)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
               this.Field157[a++] = 1;
               break;
            case 'D':
               this.Field157[a++] = 3;
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
               this.Field157[1] = a - 3;
               this.Method1883();
               return;
            case 'F':
               this.Field157[a++] = 2;
               break;
            case 'J':
               this.Field157[a++] = 4;
               break;
            case 'L':
               while(this.Field134.charAt(a) != ';') {
                  ++a;
               }

               this.Field157[a++] = 24117248 | this.Field130.Method1526(this.Field134.substring(a + 1, a++));
               break;
            case '[':
               while(this.Field134.charAt(a) == '[') {
                  ++a;
               }

               if (this.Field134.charAt(a) == 'L') {
                  ++a;

                  while(this.Field134.charAt(a) != ';') {
                     ++a;
                  }
               }

               int var10001 = a++;
               ++a;
               this.Field157[var10001] = 24117248 | this.Field130.Method1526(this.Field134.substring(a, a));
         }
      }
   }

   private int Method1983(int a, int a, int a) {
      int a = 3 + a + a;
      if (this.Field157 == null || this.Field157.length < a) {
         this.Field157 = new int[a];
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
      int a = this.Field157[1];
      int a = this.Field157[2];
      if ((this.Field130.Field1080 & '\uffff') < 50) {
         this.Field154.Method487(this.Field157[0]).Method487(a);
         this.Method1881(3, 3 + a);
         this.Field154.Method487(a);
         this.Method1881(3 + a, 3 + a + a);
      } else {
         int a = this.Field156[1];
         int a = 255;
         int a = false;
         int a;
         if (this.Field153 == 0) {
            a = this.Field157[0];
         } else {
            a = this.Field157[0] - this.Field156[0] - 1;
         }

         int a = a - a;
         switch (a) {
            case -3:
            case -2:
            case -1:
               a = 248;
               a = a;
               break;
            case 0:
               a = a < 64 ? 0 : 251;
               break;
            case 1:
            case 2:
            case 3:
               a = 252;
         }

         if (a != 255) {
            int a = 3;

            for(int a = 0; a < a; ++a) {
               if (this.Field157[a] != this.Field156[a]) {
                  a = 255;
                  break;
               }

               ++a;
            }
         }

         switch (a) {
            case 0:
               this.Field154.Method485(a);
               break;
            case 64:
               this.Field154.Method485(64 + a);
               this.Method1881(3 + a, 4 + a);
               break;
            case 247:
               this.Field154.Method485(247).Method487(a);
               this.Method1881(3 + a, 4 + a);
               break;
            case 248:
               this.Field154.Method485(251 + a).Method487(a);
               break;
            case 251:
               this.Field154.Method485(251).Method487(a);
               break;
            case 252:
               this.Field154.Method485(251 + a).Method487(a);
               this.Method1881(3 + a, 3 + a);
               break;
            default:
               this.Field154.Method485(255).Method487(a).Method487(a);
               this.Method1881(3, 3 + a);
               this.Field154.Method487(a);
               this.Method1881(3 + a, 3 + a + a);
         }

      }
   }

   private void Method1881(int a, int a) {
      for(int a = a; a < a; ++a) {
         int a = this.Field157[a];
         int a = a & -268435456;
         int a = a & 1048575;
         switch (a & 267386880) {
            case 24117248:
               this.Field154.Method485(7).Method487(this.Field130.Method1508(this.Field130.Field1089[a].Field1430));
               break;
            case 25165824:
               this.Field154.Method485(8).Method487(this.Field130.Field1089[a].Field1428);
               break;
            default:
               this.Field154.Method485(a);
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
         int a = 8;
         if (this.Field149.Field991 > 0) {
            if (this.Field149.Field991 > 65536) {
               throw new RuntimeException("Method code too large!");
            }

            this.Field130.Method1506("Code");
            a += 18 + this.Field149.Field991 + 8 * this.Field158;
            if (this.Field164 != null) {
               this.Field130.Method1506("LocalVariableTable");
               a += 8 + this.Field164.Field991;
            }

            if (this.Field166 != null) {
               this.Field130.Method1506("LocalVariableTypeTable");
               a += 8 + this.Field166.Field991;
            }

            if (this.Field168 != null) {
               this.Field130.Method1506("LineNumberTable");
               a += 8 + this.Field168.Field991;
            }

            if (this.Field154 != null) {
               boolean a = (this.Field130.Field1080 & '\uffff') >= 50;
               this.Field130.Method1506("StackMapTable");
               a += 8 + this.Field154.Field991;
            }

            if (this.Field170 != null) {
               this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
               a += 8 + this.Field170.Method1321();
            }

            if (this.Field171 != null) {
               this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
               a += 8 + this.Field171.Method1321();
            }

            if (this.Field172 != null) {
               a += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
            }
         }

         if (this.Field138 > 0) {
            this.Field130.Method1506("Exceptions");
            a += 8 + 2 * this.Field138;
         }

         if ((this.Field131 & 4096) != 0 && ((this.Field130.Field1080 & '\uffff') < 49 || (this.Field131 & 262144) != 0)) {
            this.Field130.Method1506("Synthetic");
            a += 6;
         }

         if ((this.Field131 & 131072) != 0) {
            this.Field130.Method1506("Deprecated");
            a += 6;
         }

         if (this.Field135 != null) {
            this.Field130.Method1506("Signature");
            this.Field130.Method1506(this.Field135);
            a += 8;
         }

         if (this.Field162 != null) {
            this.Field130.Method1506("MethodParameters");
            a += 7 + this.Field162.Field991;
         }

         if (this.Field140 != null) {
            this.Field130.Method1506("AnnotationDefault");
            a += 6 + this.Field140.Field991;
         }

         if (this.Field141 != null) {
            this.Field130.Method1506("RuntimeVisibleAnnotations");
            a += 8 + this.Field141.Method1321();
         }

         if (this.Field142 != null) {
            this.Field130.Method1506("RuntimeInvisibleAnnotations");
            a += 8 + this.Field142.Method1321();
         }

         if (this.Field143 != null) {
            this.Field130.Method1506("RuntimeVisibleTypeAnnotations");
            a += 8 + this.Field143.Method1321();
         }

         if (this.Field144 != null) {
            this.Field130.Method1506("RuntimeInvisibleTypeAnnotations");
            a += 8 + this.Field144.Method1321();
         }

         int a;
         if (this.Field145 != null) {
            this.Field130.Method1506("RuntimeVisibleParameterAnnotations");
            a += 7 + 2 * (this.Field145.length - this.Field147);

            for(a = this.Field145.length - 1; a >= this.Field147; --a) {
               a += this.Field145[a] == null ? 0 : this.Field145[a].Method1321();
            }
         }

         if (this.Field146 != null) {
            this.Field130.Method1506("RuntimeInvisibleParameterAnnotations");
            a += 7 + 2 * (this.Field146.length - this.Field147);

            for(a = this.Field146.length - 1; a >= this.Field147; --a) {
               a += this.Field146[a] == null ? 0 : this.Field146[a].Method1321();
            }
         }

         if (this.Field148 != null) {
            a += this.Field148.Method474(this.Field130, (byte[])null, 0, -1, -1);
         }

         return a;
      }
   }

   final void Method1985(Class138 a) {
      int a = true;
      int a = 917504 | (this.Field131 & 262144) / 64;
      a.Method487(this.Field131 & ~a).Method487(this.Field132).Method487(this.Field133);
      if (this.Field136 != 0) {
         a.Method493(this.Field130.Field1079.Field1029, this.Field136, this.Field137);
      } else {
         int a = 0;
         if (this.Field149.Field991 > 0) {
            ++a;
         }

         if (this.Field138 > 0) {
            ++a;
         }

         if ((this.Field131 & 4096) != 0 && ((this.Field130.Field1080 & '\uffff') < 49 || (this.Field131 & 262144) != 0)) {
            ++a;
         }

         if ((this.Field131 & 131072) != 0) {
            ++a;
         }

         if (this.Field135 != null) {
            ++a;
         }

         if (this.Field162 != null) {
            ++a;
         }

         if (this.Field140 != null) {
            ++a;
         }

         if (this.Field141 != null) {
            ++a;
         }

         if (this.Field142 != null) {
            ++a;
         }

         if (this.Field143 != null) {
            ++a;
         }

         if (this.Field144 != null) {
            ++a;
         }

         if (this.Field145 != null) {
            ++a;
         }

         if (this.Field146 != null) {
            ++a;
         }

         if (this.Field148 != null) {
            a += this.Field148.Method473();
         }

         a.Method487(a);
         int a;
         if (this.Field149.Field991 > 0) {
            a = 12 + this.Field149.Field991 + 8 * this.Field158;
            if (this.Field164 != null) {
               a += 8 + this.Field164.Field991;
            }

            if (this.Field166 != null) {
               a += 8 + this.Field166.Field991;
            }

            if (this.Field168 != null) {
               a += 8 + this.Field168.Field991;
            }

            if (this.Field154 != null) {
               a += 8 + this.Field154.Field991;
            }

            if (this.Field170 != null) {
               a += 8 + this.Field170.Method1321();
            }

            if (this.Field171 != null) {
               a += 8 + this.Field171.Method1321();
            }

            if (this.Field172 != null) {
               a += this.Field172.Method474(this.Field130, this.Field149.Field990, this.Field149.Field991, this.Field150, this.Field151);
            }

            a.Method487(this.Field130.Method1506("Code")).Method489(a);
            a.Method487(this.Field150).Method487(this.Field151);
            a.Method489(this.Field149.Field991).Method493(this.Field149.Field990, 0, this.Field149.Field991);
            a.Method487(this.Field158);
            if (this.Field158 > 0) {
               Class258 a = this.Field159;

               while(true) {
                  a.Method487(a.Field1410.Field1450).Method487(a.Field1411.Field1450).Method487(a.Field1412.Field1450).Method487(a.Field1414);
                  a = a.Field1415;
               }
            }

            a = 0;
            if (this.Field164 != null) {
               ++a;
            }

            if (this.Field166 != null) {
               ++a;
            }

            if (this.Field168 != null) {
               ++a;
            }

            if (this.Field154 != null) {
               ++a;
            }

            if (this.Field170 != null) {
               ++a;
            }

            if (this.Field171 != null) {
               ++a;
            }

            if (this.Field172 != null) {
               a += this.Field172.Method473();
            }

            a.Method487(a);
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
               boolean a = (this.Field130.Field1080 & '\uffff') >= 50;
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

            for(a = 0; a < this.Field138; ++a) {
               a.Method487(this.Field139[a]);
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
      byte[] a = this.Field149.Field990;
      Class267.Method2862();
      int[] a = new int[0];
      int[] a = new int[0];
      boolean[] a = new boolean[this.Field149.Field991];
      int a = 3;
      if (a == 3) {
         a = 2;
      }

      int a = 0;
      int a;
      int a;
      int a;
      if (a < a.length) {
         label244: {
            label243: {
               label242: {
                  label250: {
                     int a;
                     label251: {
                        label252: {
                           a = a[a] & 255;
                           a = 0;
                           switch (Class169.Field1059[a]) {
                              case 0:
                              case 4:
                                 ++a;
                              case 9:
                                 if (a > 201) {
                                    a = a < 218 ? a - 49 : a - 20;
                                    a = a + Method1986(a, a + 1);
                                 }

                                 a = a + Method1987(a, a + 1);
                                 a = Method1990(a, a, a, a);
                                 if ((a < -32768 || a > 32767) && !a[a]) {
                                    if (a == 167 || a == 168) {
                                       int a = true;
                                    }

                                    a = 5;
                                    a[a] = true;
                                 }

                                 a += 3;
                              case 10:
                                 a += 5;
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

                           if (a == 1) {
                              a = Method1990(a, a, 0, a);
                              a = -(a & 3);
                           }

                           if (!a[a]) {
                              a = a & 3;
                              a[a] = true;
                           }

                           a = a + 4 - (a & 3);
                           a += 4 * (Method1988(a, a + 8) - Method1988(a, a + 4) + 1) + 12;
                        }

                        if (a == 1) {
                           a = Method1990(a, a, 0, a);
                           a = -(a & 3);
                        }

                        if (!a[a]) {
                           a = a & 3;
                           a[a] = true;
                        }

                        a = a + 4 - (a & 3);
                        a += 8 * Method1988(a, a + 4) + 8;
                     }

                     a = a[a + 1] & 255;
                     if (a == 132) {
                        a += 6;
                     }

                     a += 4;
                  }

                  a += 2;
               }

               a += 3;
            }

            a += 5;
         }

         a += 4;
         int[] a = new int[a.length + 1];
         int[] a = new int[a.length + 1];
         System.arraycopy(a, 0, a, 0, a.length);
         System.arraycopy(a, 0, a, 0, a.length);
         a[a.length] = a;
         a[a.length] = a;
         a = a;
         a = a;
         a = 3;
      }

      if (a < 3) {
         --a;
      }

      Class138 a = new Class138(this.Field149.Field991);
      a = 0;
      if (a < this.Field149.Field991) {
         a = a[a] & 255;
         int a;
         int a;
         switch (Class169.Field1059[a]) {
            case 0:
            case 4:
               a.Method485(a);
               ++a;
            case 9:
               if (a > 201) {
                  a = a < 218 ? a - 49 : a - 20;
                  a = a + Method1986(a, a + 1);
               }

               a = a + Method1987(a, a + 1);
               a = Method1990(a, a, a, a);
               if (a[a]) {
                  if (a == 167) {
                     a.Method485(200);
                  }

                  if (a == 168) {
                     a.Method485(201);
                  }

                  a.Method485(a <= 166 ? (a + 1 ^ 1) - 1 : a ^ 1);
                  a.Method487(8);
                  a.Method485(200);
                  a -= 3;
                  a.Method489(a);
               }

               a.Method485(a);
               a.Method487(a);
               a += 3;
            case 10:
               a = a + Method1988(a, a + 1);
               a = Method1990(a, a, a, a);
               a.Method485(a);
               a.Method489(a);
               a += 5;
            case 14:
               a = a;
               a = a + 4 - (a & 3);
               a.Method485(170);
               a.Method493((byte[])null, 0, (4 - a.Field991 % 4) % 4);
               a = a + Method1988(a, a);
               a += 4;
               a = Method1990(a, a, a, a);
               a.Method489(a);
               a = Method1988(a, a);
               a += 4;
               a.Method489(a);
               a = Method1988(a, a) - a + 1;
               a += 4;
               a.Method489(Method1988(a, a - 4));
               a = a + Method1988(a, a);
               a += 4;
               a = Method1990(a, a, a, a);
               a.Method489(a);
               --a;
            case 15:
               a = a;
               a = a + 4 - (a & 3);
               a.Method485(171);
               a.Method493((byte[])null, 0, (4 - a.Field991 % 4) % 4);
               a = a + Method1988(a, a);
               a += 4;
               a = Method1990(a, a, a, a);
               a.Method489(a);
               a = Method1988(a, a);
               a += 4;
               a.Method489(a);
               a.Method489(Method1988(a, a));
               a += 4;
               a = a + Method1988(a, a);
               a += 4;
               a = Method1990(a, a, a, a);
               a.Method489(a);
               --a;
            case 17:
               a = a[a + 1] & 255;
               if (a == 132) {
                  a.Method493(a, a, 6);
                  a += 6;
               }

               a.Method493(a, a, 4);
               a += 4;
            case 1:
            case 3:
            case 11:
               a.Method493(a, a, 2);
               a += 2;
            case 2:
            case 5:
            case 6:
            case 12:
            case 13:
               a.Method493(a, a, 3);
               a += 3;
            case 7:
            case 8:
               a.Method493(a, a, 5);
               a += 5;
            case 16:
            default:
               a.Method493(a, a, 4);
               a += 4;
         }
      }

      int a;
      if (this.Field175 == 0) {
         Class264 a = this.Field176;
         a = a.Field1450 - 3;
         if (a[a]) {
            a.Field1448 |= 16;
         }

         Method1991(a, a, a);
         a = a.Field1456;
         a = 0;
         if (a < this.Field130.Field1089.length) {
            Class261 a = this.Field130.Field1089[a];
            if (a.Field1427 == 31) {
               a.Field1428 = Method1990(a, a, 0, a.Field1428);
            }

            ++a;
         }
      }

      if (this.Field153 > 0) {
         this.Field130.Field1117 = true;
      }

      Class258 a = this.Field159;
      Method1991(a, a, a.Field1410);
      Method1991(a, a, a.Field1411);
      Method1991(a, a, a.Field1412);
      a = a.Field1415;
      int a = 0;
      byte a;
      if (a < 2) {
         Class138 a = this.Field164;
         a = a.Field990;
         a = 0;
         if (a < a.Field991) {
            a = Method1986(a, a);
            a = Method1990(a, a, 0, a);
            Method1989(a, a, a);
            a += Method1986(a, a + 2);
            a = Method1990(a, a, 0, a) - a;
            Method1989(a, a + 2, a);
            a = a + 10;
         }

         a = a + 1;
      }

      if (this.Field168 != null) {
         a = this.Field168.Field990;
         a = 0;
         if (a < this.Field168.Field991) {
            Method1989(a, a, Method1990(a, a, 0, Method1986(a, a)));
            a = a + 4;
         }
      }

      Class136 a = this.Field172;
      Class264[] a = a.Method470();
      a = a.length - 1;
      Method1991(a, a, a[a]);
      --a;
      a = a.Field989;
      this.Field149 = a;
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
      int a = a - a;

      for(int a = 0; a < a.length; ++a) {
         if (a < a[a] && a[a] <= a) {
            a += a[a];
         } else if (a < a[a] && a[a] <= a) {
            a -= a[a];
         }
      }

      return a;
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
