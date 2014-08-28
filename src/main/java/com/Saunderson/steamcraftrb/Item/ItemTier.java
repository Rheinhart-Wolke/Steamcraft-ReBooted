package com.Saunderson.steamcraftrb.Item;


import com.Saunderson.steamcraftrb.reference.Names;
import com.Saunderson.steamcraftrb.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemTier extends ItemSCRB {

    public ItemTier() {
        super();
        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Names.Items.TIER);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", Names.Items.TIER);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s%s", Reference.MOD_ID.toLowerCase() + ":", Names.Items.TIER, Names.Items.TIER_SUBTYPES[MathHelper.clamp_int(itemStack.getItemDamage(), 0, Names.Items.TIER_SUBTYPES.length - 1)]);
    }
}
