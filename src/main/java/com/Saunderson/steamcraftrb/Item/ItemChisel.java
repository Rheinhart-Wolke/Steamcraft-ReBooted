package com.Saunderson.steamcraftrb.Item;


import com.Saunderson.steamcraftrb.reference.Names;
import com.Saunderson.steamcraftrb.utility.NBTHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;

public class ItemChisel extends ItemSCRB {
    public ItemChisel() {
        super();
        this.setUnlocalizedName(Names.Items.CHISEL);
        this.setMaxDamage(128);
        this.maxStackSize = 1;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return stack.getItemDamage()<128;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack cStack = itemStack.copy();
        cStack.setItemDamage(cStack.getItemDamage() +2);
        cStack.stackSize = 1;
        return cStack;
    }
}