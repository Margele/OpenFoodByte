package awsl;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.player.EntityPlayer;
import obfuscate.a;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;

public class Class705 extends GuiScreen {
   public static ArrayList Field3044;
   public static ArrayList Field3045;
   private Class414 Field3046 = null;

   public Class705() {
      Class415.Method2360();
      Field3044 = new ArrayList();
      double a = 80.0;
      double a = 12.0;
      double a = 10.0;
      double a = 10.0;
      double a = a + 10.0;
      double a = a + 10.0;
      Category[] a;
      int a = (a = Category.Method2760()).length;

      for(int a = 0; a < a; ++a) {
         Category a = a[a];
         String a = a.name();
         Field3044.Method2530(new Class420(this, a, a, a, a, a, true, this, a));
         a += a;
      }

      Field3044.Method2530(new Class419(this, "Global", a, a, a, a, true, this));
      Field3045 = new ArrayList();
      Field3045.addAll(Field3044);
      Collections.reverse(Field3045);
   }

   public void Method1803(int a, int a, float a) {
      String[] a = Class421.Method2390();
      if (OpenGlHelper.shadersSupported && this.mc.getRenderViewEntity() instanceof EntityPlayer && GlobalModule.Field3161.getFloatValue() != 0.0F) {
         Class351.Method28(GlobalModule.Field3161.getFloatValue());
      }

      Iterator var5 = Field3044.Method1383();
      if (var5.Method932()) {
         Class421 a = (Class421)var5.Method933();
         a.Method2385(a, a, a);
         a.trash(new String[3]);
      }

      ScaledResolution a = new ScaledResolution(this.mc);
      GL11.glPushMatrix();
      GL11.glTranslated((double)a.getScaledWidth(), (double)a.getScaledHeight(), 0.0);
      GL11.glScaled(0.5, 0.5, 0.5);
      GL11.glPopMatrix();
      this.Field3046 = null;
      Iterator var17 = Field3044.Method1383();
      Class421 a;
      Iterator var8;
      Class414 a;
      if (var17.Method932()) {
         a = (Class421)var17.Method933();
         if (a.Field2036 && a.Field2035 && a.Field2037 != null && a.Field2037.Method1799() > 0) {
            var8 = a.Field2037.Method1383();
            if (var8.Method932()) {
               a = (Class414)var8.Method933();
               if (a.Field2009) {
                  this.Field3046 = a;
               }
            }
         }
      }

      var17 = Field3044.Method1383();
      double a;
      Color a;
      int a;
      Iterator var14;
      double var10000;
      if (var17.Method932()) {
         a = (Class421)var17.Method933();
         if (a.Field2035 && a.Field2036 && a.Field2037 != null) {
            var8 = a.Field2037.Method1383();
            if (var8.Method932()) {
               a = (Class414)var8.Method933();
               if (a.Field2008 && a.Field2002 != null && !a.Field2002.isEmpty()) {
                  a = 0.0;
                  a = Class416.Method2352().darker();
                  a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 170)).getRGB();
                  var14 = a.Field2002.Method1383();
                  if (var14.Method932()) {
                     Class426 a = (Class426)var14.Method933();
                     a.Field2049 = a;
                     a.Method2309();
                     a.Method2310(a, a, a);
                     var10000 = a + a.Field2053;
                  }
               }
            }
         }
      }

      var17 = Field3044.Method1383();
      if (var17.Method932()) {
         a = (Class421)var17.Method933();
         if (a.Field2035 && a.Field2036 && a.Field2038 != null) {
            var8 = a.Field2038.Method1383();
            if (var8.Method932()) {
               Class417 a = (Class417)var8.Method933();
               if (a.Field2019 && a.Field2013 != null && !a.Field2013.isEmpty()) {
                  a = 0.0;
                  a = Class416.Method2352().darker();
                  a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 170)).getRGB();
                  var14 = a.Field2013.Method1383();
                  if (var14.Method932()) {
                     Class413 a = (Class413)var14.Method933();
                     a.Field1993 = a;
                     a.Method3577();
                     a.Method2369(a, a, a);
                     var10000 = a + a.Field1997;
                  }
               }
            }
         }
      }

      if (this.Field3046 != null) {
         drawRect(0, 0, this.width, this.height, -2012213232);
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(a.getScaledWidth() / 2), (float)(a.getScaledHeight() / 2), 0.0F);
         GL11.glScalef(4.0F, 4.0F, 0.0F);
         Class415.Method2368("Listening...", 0.0, -10.0, -1);
         GL11.glScalef(0.5F, 0.5F, 0.0F);
         Class415.Method2368("Press 'ESCAPE' to unbind " + this.Field3046.Field2001.getName() + (this.Field3046.Field2001.Method1020() > -1 ? " (" + Keyboard.getKeyName(this.Field3046.Field2001.Method1020()) + ")" : ""), 0.0, 0.0, -1);
         GL11.glPopMatrix();
      }

      super.Method1803(a, a, a);
   }

   public void Method1805(int a, int a, int a) {
      if (this.Field3046 == null) {
         Iterator var4 = Field3045.Method1383();

         label128:
         while(true) {
            Class421 a;
            Iterator var6;
            Iterator var8;
            do {
               do {
                  do {
                     if (!var4.Method932()) {
                        var4 = Field3045.Method1383();

                        label98:
                        while(true) {
                           do {
                              do {
                                 do {
                                    if (!var4.Method932()) {
                                       var4 = Field3045.Method1383();

                                       do {
                                          if (!var4.Method932()) {
                                             try {
                                                super.Method1805(a, a, a);
                                             } catch (IOException var10) {
                                                var10.printStackTrace();
                                             }

                                             return;
                                          }

                                          a = (Class421)var4.Method933();
                                       } while(!a.Method2386(a, a, a));

                                       return;
                                    }

                                    a = (Class421)var4.Method933();
                                 } while(!a.Field2035);
                              } while(!a.Field2036);
                           } while(a.Field2038 == null);

                           var6 = a.Field2038.Method1383();

                           while(true) {
                              Class417 a;
                              do {
                                 if (!var6.Method932()) {
                                    continue label98;
                                 }

                                 a = (Class417)var6.Method933();
                              } while(!a.Field2019);

                              var8 = a.Field2013.Method1383();

                              while(var8.Method932()) {
                                 Class413 a = (Class413)var8.Method933();
                                 if (a.Method2370(a, a, a)) {
                                    return;
                                 }
                              }
                           }
                        }
                     }

                     a = (Class421)var4.Method933();
                  } while(!a.Field2035);
               } while(!a.Field2036);
            } while(a.Field2037 == null);

            var6 = a.Field2037.Method1383();

            while(true) {
               Class414 a;
               do {
                  if (!var6.Method932()) {
                     continue label128;
                  }

                  a = (Class414)var6.Method933();
               } while(!a.Field2008);

               var8 = a.Field2002.Method1383();

               while(var8.Method932()) {
                  Class426 a = (Class426)var8.Method933();
                  if (a.Method2311(a, a, a)) {
                     return;
                  }
               }
            }
         }
      }
   }

   public void Method1811(int a, int a, int a) {
      if (this.Field3046 == null) {
         Iterator var4 = Field3045.Method1383();

         label102:
         while(true) {
            Class421 a;
            Iterator var6;
            Iterator var8;
            do {
               do {
                  do {
                     if (!var4.Method932()) {
                        var4 = Field3045.Method1383();

                        label72:
                        while(true) {
                           do {
                              do {
                                 do {
                                    if (!var4.Method932()) {
                                       var4 = Field3045.Method1383();

                                       while(var4.Method932()) {
                                          a = (Class421)var4.Method933();
                                          a.Method2387(a, a, a);
                                       }

                                       super.Method1811(a, a, a);
                                       return;
                                    }

                                    a = (Class421)var4.Method933();
                                 } while(!a.Field2035);
                              } while(!a.Field2036);
                           } while(a.Field2038 == null);

                           var6 = a.Field2038.Method1383();

                           while(true) {
                              Class417 a;
                              do {
                                 if (!var6.Method932()) {
                                    continue label72;
                                 }

                                 a = (Class417)var6.Method933();
                              } while(!a.Field2019);

                              var8 = a.Field2013.Method1383();

                              while(var8.Method932()) {
                                 Class413 a = (Class413)var8.Method933();
                                 a.Method2371(a, a, a);
                              }
                           }
                        }
                     }

                     a = (Class421)var4.Method933();
                  } while(!a.Field2035);
               } while(!a.Field2036);
            } while(a.Field2037 == null);

            var6 = a.Field2037.Method1383();

            while(true) {
               Class414 a;
               do {
                  if (!var6.Method932()) {
                     continue label102;
                  }

                  a = (Class414)var6.Method933();
               } while(!a.Field2008);

               var8 = a.Field2002.Method1383();

               while(var8.Method932()) {
                  Class426 a = (Class426)var8.Method933();
                  a.Method2312(a, a, a);
               }
            }
         }
      }
   }

   protected void Method1804(char a, int a) {
      Iterator var3 = Field3045.Method1383();

      while(true) {
         Class421 a;
         do {
            do {
               do {
                  do {
                     if (!var3.Method932()) {
                        try {
                           super.Method1804(a, a);
                        } catch (IOException var8) {
                           var8.printStackTrace();
                        }

                        return;
                     }

                     a = (Class421)var3.Method933();
                  } while(!a.Field2036);
               } while(!a.Field2035);
            } while(a.Field2037 == null);
         } while(a.Field2037.Method1799() <= 0);

         Iterator var5 = a.Field2037.Method1383();

         while(var5.Method932()) {
            Class414 a = (Class414)var5.Method933();

            try {
               if (a.Method3570(a, a)) {
                  return;
               }
            } catch (IOException var9) {
               var9.printStackTrace();
            }
         }
      }
   }

   public void Method1806() {
      Iterator var1 = Field3045.Method1383();

      label95:
      while(true) {
         Class421 a;
         Iterator var3;
         Iterator var5;
         do {
            do {
               do {
                  if (!var1.Method932()) {
                     var1 = Field3045.Method1383();

                     label65:
                     while(true) {
                        do {
                           do {
                              do {
                                 if (!var1.Method932()) {
                                    GlobalModule.INSTANCE.fileManager.saveClickGuiPos();
                                    return;
                                 }

                                 a = (Class421)var1.Method933();
                              } while(!a.Field2035);
                           } while(!a.Field2036);
                        } while(a.Field2038 == null);

                        var3 = a.Field2038.Method1383();

                        while(true) {
                           Class417 a;
                           do {
                              if (!var3.Method932()) {
                                 continue label65;
                              }

                              a = (Class417)var3.Method933();
                           } while(!a.Field2019);

                           var5 = a.Field2013.Method1383();

                           while(var5.Method932()) {
                              Class413 a = (Class413)var5.Method933();
                              if (a instanceof Class418) {
                                 ((Class418)a).Field2021 = false;
                              }
                           }
                        }
                     }
                  }

                  a = (Class421)var1.Method933();
               } while(!a.Field2035);
            } while(!a.Field2036);
         } while(a.Field2037 == null);

         var3 = a.Field2037.Method1383();

         while(true) {
            Class414 a;
            do {
               if (!var3.Method932()) {
                  continue label95;
               }

               a = (Class414)var3.Method933();
            } while(!a.Field2008);

            var5 = a.Field2002.Method1383();

            while(var5.Method932()) {
               Class426 a = (Class426)var5.Method933();
               if (a instanceof Class423) {
                  ((Class423)a).Field2041 = false;
               }
            }
         }
      }
   }

   public boolean Method1812() {
      return false;
   }

   public void Method1813(Category a) {
      Iterator var2 = Field3045.Method1383();

      while(true) {
         Class421 a;
         do {
            do {
               do {
                  do {
                     if (!var2.Method932()) {
                        return;
                     }

                     a = (Class421)var2.Method933();
                  } while(!a.Field2036);
               } while(!a.Field2035);
            } while(a.Field2037 == null);
         } while(a.Field2037.Method1799() <= 0);

         Iterator var4 = a.Field2037.Method1383();

         while(var4.Method932()) {
            Class414 a = (Class414)var4.Method933();
            if (a == a.Field2001.Method1024()) {
               a.Field2008 = false;
            }
         }
      }
   }

   public void Method1814() {
      Iterator var1 = Field3045.Method1383();

      while(true) {
         Class421 a;
         do {
            do {
               do {
                  do {
                     if (!var1.Method932()) {
                        return;
                     }

                     a = (Class421)var1.Method933();
                  } while(!a.Field2036);
               } while(!a.Field2035);
            } while(a.Field2037 == null);
         } while(a.Field2037.Method1799() <= 0);

         Class414 a;
         for(Iterator var3 = a.Field2037.Method1383(); var3.Method932(); a.Field2008 = false) {
            a = (Class414)var3.Method933();
         }
      }
   }

   private static IOException Method1815(IOException iOException) {
      return iOException;
   }
}
