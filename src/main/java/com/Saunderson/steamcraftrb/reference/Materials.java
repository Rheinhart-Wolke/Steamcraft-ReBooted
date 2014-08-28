package com.Saunderson.steamcraftrb.reference;


import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraftforge.common.util.EnumHelper.addEnum;

public class Materials
{
    public static final class Tools
    {
        public static final Item.ToolMaterial STEAM_TIER = EnumHelper.addToolMaterial(Names.Tiers.STEAM_TIER, 3, 0, 10f, 3.5f, 0);
        public static final Item.ToolMaterial ETHERIUM_TIER = EnumHelper.addToolMaterial(Names.Tiers.ETHERIUM_TIER, 3, 4096, 12f, 4f, 15);
    }

    public static final class Armour
    {
        public static final ArmorMaterial ETHERIUM_TIER = EnumHelper.addArmorMaterial(Names.Tiers.ETHERIUM_TIER, 4096, new int[]{3, 8, 6, 3}, 15);
        public static final ArmorMaterial OBSIDIAN_TIER = EnumHelper.addArmorMaterial(Names.Tiers.OBSIDIAN_TIER, 2048, new int[]{3, 8, 6, 3}, 12);
    }

}

