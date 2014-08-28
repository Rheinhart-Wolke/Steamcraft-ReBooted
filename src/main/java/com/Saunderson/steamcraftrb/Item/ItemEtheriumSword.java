package com.Saunderson.steamcraftrb.Item;


import com.Saunderson.steamcraftrb.creativetab.CreativeTabSCRB;
import com.Saunderson.steamcraftrb.reference.Reference;
import com.Saunderson.steamcraftrb.reference.Materials;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemEtheriumSword extends ItemSword
{
    public ItemEtheriumSword()
    {
        super(Materials.Tools.ETHERIUM_TIER);
        this.setUnlocalizedName("etheriumSword");
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabSCRB.SCRB_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
