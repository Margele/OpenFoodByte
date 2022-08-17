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
      double var1 = 80.0;
      double var3 = 12.0;
      double var5 = 10.0;
      double var7 = 10.0;
      double var9 = var3 + 10.0;
      double var11 = var1 + 10.0;
      Category[] var13;
      int var14 = (var13 = Category.Method2760()).length;

      for(int var15 = 0; var15 < var14; ++var15) {
         Category var16 = var13[var15];
         String var17 = var16.name();
         Field3044.Method2530(new Class420(this, var17, var5, var7, var1, var3, true, this, var16));
         var5 += var11;
      }

      Field3044.Method2530(new Class419(this, "Global", var5, var7, var1, var3, true, this));
      Field3045 = new ArrayList();
      Field3045.addAll(Field3044);
      Collections.reverse(Field3045);
   }

   public void Method1803(int a, int a, float a) {
      String[] var4 = Class421.Method2390();
      if (OpenGlHelper.shadersSupported && this.mc.getRenderViewEntity() instanceof EntityPlayer && GlobalModule.Field3161.getFloatValue() != 0.0F) {
         Class351.Method28(GlobalModule.Field3161.getFloatValue());
      }

      Iterator var5 = Field3044.Method1383();
      if (var5.Method932()) {
         Class421 var6 = (Class421)var5.Method933();
         var6.Method2385(a, a, a);
         a.trash(new String[3]);
      }

      ScaledResolution var16 = new ScaledResolution(this.mc);
      GL11.glPushMatrix();
      GL11.glTranslated((double)var16.getScaledWidth(), (double)var16.getScaledHeight(), 0.0);
      GL11.glScaled(0.5, 0.5, 0.5);
      GL11.glPopMatrix();
      this.Field3046 = null;
      Iterator var17 = Field3044.Method1383();
      Class421 var7;
      Iterator var8;
      Class414 var9;
      if (var17.Method932()) {
         var7 = (Class421)var17.Method933();
         if (var7.Field2036 && var7.Field2035 && var7.Field2037 != null && var7.Field2037.Method1799() > 0) {
            var8 = var7.Field2037.Method1383();
            if (var8.Method932()) {
               var9 = (Class414)var8.Method933();
               if (var9.Field2009) {
                  this.Field3046 = var9;
               }
            }
         }
      }

      var17 = Field3044.Method1383();
      double var10;
      Color var12;
      int var13;
      Iterator var14;
      double var10000;
      if (var17.Method932()) {
         var7 = (Class421)var17.Method933();
         if (var7.Field2035 && var7.Field2036 && var7.Field2037 != null) {
            var8 = var7.Field2037.Method1383();
            if (var8.Method932()) {
               var9 = (Class414)var8.Method933();
               if (var9.Field2008 && var9.Field2002 != null && !var9.Field2002.isEmpty()) {
                  var10 = 0.0;
                  var12 = Class416.Method2352().darker();
                  var13 = (new Color(var12.getRed(), var12.getGreen(), var12.getBlue(), 170)).getRGB();
                  var14 = var9.Field2002.Method1383();
                  if (var14.Method932()) {
                     Class426 var15 = (Class426)var14.Method933();
                     var15.Field2049 = var10;
                     var15.Method2309();
                     var15.Method2310(a, a, a);
                     var10000 = var10 + var15.Field2053;
                  }
               }
            }
         }
      }

      var17 = Field3044.Method1383();
      if (var17.Method932()) {
         var7 = (Class421)var17.Method933();
         if (var7.Field2035 && var7.Field2036 && var7.Field2038 != null) {
            var8 = var7.Field2038.Method1383();
            if (var8.Method932()) {
               Class417 var18 = (Class417)var8.Method933();
               if (var18.Field2019 && var18.Field2013 != null && !var18.Field2013.isEmpty()) {
                  var10 = 0.0;
                  var12 = Class416.Method2352().darker();
                  var13 = (new Color(var12.getRed(), var12.getGreen(), var12.getBlue(), 170)).getRGB();
                  var14 = var18.Field2013.Method1383();
                  if (var14.Method932()) {
                     Class413 var19 = (Class413)var14.Method933();
                     var19.Field1993 = var10;
                     var19.Method3577();
                     var19.Method2369(a, a, a);
                     var10000 = var10 + var19.Field1997;
                  }
               }
            }
         }
      }

      if (this.Field3046 != null) {
         drawRect(0, 0, this.width, this.height, -2012213232);
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var16.getScaledWidth() / 2), (float)(var16.getScaledHeight() / 2), 0.0F);
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
            Class421 var5;
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

                                          var5 = (Class421)var4.Method933();
                                       } while(!var5.Method2386(a, a, a));

                                       return;
                                    }

                                    var5 = (Class421)var4.Method933();
                                 } while(!var5.Field2035);
                              } while(!var5.Field2036);
                           } while(var5.Field2038 == null);

                           var6 = var5.Field2038.Method1383();

                           while(true) {
                              Class417 var11;
                              do {
                                 if (!var6.Method932()) {
                                    continue label98;
                                 }

                                 var11 = (Class417)var6.Method933();
                              } while(!var11.Field2019);

                              var8 = var11.Field2013.Method1383();

                              while(var8.Method932()) {
                                 Class413 var12 = (Class413)var8.Method933();
                                 if (var12.Method2370(a, a, a)) {
                                    return;
                                 }
                              }
                           }
                        }
                     }

                     var5 = (Class421)var4.Method933();
                  } while(!var5.Field2035);
               } while(!var5.Field2036);
            } while(var5.Field2037 == null);

            var6 = var5.Field2037.Method1383();

            while(true) {
               Class414 var7;
               do {
                  if (!var6.Method932()) {
                     continue label128;
                  }

                  var7 = (Class414)var6.Method933();
               } while(!var7.Field2008);

               var8 = var7.Field2002.Method1383();

               while(var8.Method932()) {
                  Class426 var9 = (Class426)var8.Method933();
                  if (var9.Method2311(a, a, a)) {
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
            Class421 var5;
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
                                          var5 = (Class421)var4.Method933();
                                          var5.Method2387(a, a, a);
                                       }

                                       super.Method1811(a, a, a);
                                       return;
                                    }

                                    var5 = (Class421)var4.Method933();
                                 } while(!var5.Field2035);
                              } while(!var5.Field2036);
                           } while(var5.Field2038 == null);

                           var6 = var5.Field2038.Method1383();

                           while(true) {
                              Class417 var10;
                              do {
                                 if (!var6.Method932()) {
                                    continue label72;
                                 }

                                 var10 = (Class417)var6.Method933();
                              } while(!var10.Field2019);

                              var8 = var10.Field2013.Method1383();

                              while(var8.Method932()) {
                                 Class413 var11 = (Class413)var8.Method933();
                                 var11.Method2371(a, a, a);
                              }
                           }
                        }
                     }

                     var5 = (Class421)var4.Method933();
                  } while(!var5.Field2035);
               } while(!var5.Field2036);
            } while(var5.Field2037 == null);

            var6 = var5.Field2037.Method1383();

            while(true) {
               Class414 var7;
               do {
                  if (!var6.Method932()) {
                     continue label102;
                  }

                  var7 = (Class414)var6.Method933();
               } while(!var7.Field2008);

               var8 = var7.Field2002.Method1383();

               while(var8.Method932()) {
                  Class426 var9 = (Class426)var8.Method933();
                  var9.Method2312(a, a, a);
               }
            }
         }
      }
   }

   protected void Method1804(char a, int a) {
      Iterator var3 = Field3045.Method1383();

      while(true) {
         Class421 var4;
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

                     var4 = (Class421)var3.Method933();
                  } while(!var4.Field2036);
               } while(!var4.Field2035);
            } while(var4.Field2037 == null);
         } while(var4.Field2037.Method1799() <= 0);

         Iterator var5 = var4.Field2037.Method1383();

         while(var5.Method932()) {
            Class414 var6 = (Class414)var5.Method933();

            try {
               if (var6.Method3570(a, a)) {
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
         Class421 var2;
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

                                 var2 = (Class421)var1.Method933();
                              } while(!var2.Field2035);
                           } while(!var2.Field2036);
                        } while(var2.Field2038 == null);

                        var3 = var2.Field2038.Method1383();

                        while(true) {
                           Class417 var7;
                           do {
                              if (!var3.Method932()) {
                                 continue label65;
                              }

                              var7 = (Class417)var3.Method933();
                           } while(!var7.Field2019);

                           var5 = var7.Field2013.Method1383();

                           while(var5.Method932()) {
                              Class413 var8 = (Class413)var5.Method933();
                              if (var8 instanceof Class418) {
                                 ((Class418)var8).Field2021 = false;
                              }
                           }
                        }
                     }
                  }

                  var2 = (Class421)var1.Method933();
               } while(!var2.Field2035);
            } while(!var2.Field2036);
         } while(var2.Field2037 == null);

         var3 = var2.Field2037.Method1383();

         while(true) {
            Class414 var4;
            do {
               if (!var3.Method932()) {
                  continue label95;
               }

               var4 = (Class414)var3.Method933();
            } while(!var4.Field2008);

            var5 = var4.Field2002.Method1383();

            while(var5.Method932()) {
               Class426 var6 = (Class426)var5.Method933();
               if (var6 instanceof Class423) {
                  ((Class423)var6).Field2041 = false;
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
         Class421 var3;
         do {
            do {
               do {
                  do {
                     if (!var2.Method932()) {
                        return;
                     }

                     var3 = (Class421)var2.Method933();
                  } while(!var3.Field2036);
               } while(!var3.Field2035);
            } while(var3.Field2037 == null);
         } while(var3.Field2037.Method1799() <= 0);

         Iterator var4 = var3.Field2037.Method1383();

         while(var4.Method932()) {
            Class414 var5 = (Class414)var4.Method933();
            if (a == var5.Field2001.Method1024()) {
               var5.Field2008 = false;
            }
         }
      }
   }

   public void Method1814() {
      Iterator var1 = Field3045.Method1383();

      while(true) {
         Class421 var2;
         do {
            do {
               do {
                  do {
                     if (!var1.Method932()) {
                        return;
                     }

                     var2 = (Class421)var1.Method933();
                  } while(!var2.Field2036);
               } while(!var2.Field2035);
            } while(var2.Field2037 == null);
         } while(var2.Field2037.Method1799() <= 0);

         Class414 var4;
         for(Iterator var3 = var2.Field2037.Method1383(); var3.Method932(); var4.Field2008 = false) {
            var4 = (Class414)var3.Method933();
         }
      }
   }

   private static IOException Method1815(IOException iOException) {
      return iOException;
   }
}
