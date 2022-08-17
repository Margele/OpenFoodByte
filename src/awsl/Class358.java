package awsl;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import org.apache.commons.lang3.StringUtils;

public class Class358 {
   public static GameProfile Method209(ItemStack a) {
      GameProfile var1 = null;
      if (a.hasTagCompound()) {
         NBTTagCompound var2 = a.getTagCompound();
         if (var2.hasKey("SkullOwner", 10)) {
            var1 = NBTUtil.readGameProfileFromNBT(var2.getCompoundTag("SkullOwner"));
         } else if (var2.hasKey("SkullOwner", 8) && !StringUtils.isBlank(var2.getString("SkullOwner"))) {
            var1 = new GameProfile((UUID)null, var2.getString("SkullOwner"));
         }
      }

      return var1;
   }

   public static void Method210(ItemStack a, String a) {
      Class356.Method149(a).setString("SkullOwner", a);
   }
}
