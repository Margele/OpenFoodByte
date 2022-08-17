package awsl;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import org.apache.commons.lang3.StringUtils;

public class Class358 {
   public static GameProfile Method209(ItemStack a) {
      GameProfile a = null;
      if (a.hasTagCompound()) {
         NBTTagCompound a = a.getTagCompound();
         if (a.hasKey("SkullOwner", 10)) {
            a = NBTUtil.readGameProfileFromNBT(a.getCompoundTag("SkullOwner"));
         } else if (a.hasKey("SkullOwner", 8) && !StringUtils.isBlank(a.getString("SkullOwner"))) {
            a = new GameProfile((UUID)null, a.getString("SkullOwner"));
         }
      }

      return a;
   }

   public static void Method210(ItemStack a, String a) {
      Class356.Method149(a).setString("SkullOwner", a);
   }
}
