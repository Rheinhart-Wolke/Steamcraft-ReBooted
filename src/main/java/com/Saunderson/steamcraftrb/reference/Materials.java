package com.Saunderson.steamcraftrb.reference;


import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Materials
{
    public static final class Tools
    {
        public static final Item.ToolMaterial Steam_Tier = EnumHelper.addToolMaterial(null, 3, 0, 10f, 3f, 0);
        public static final Item.ToolMaterial Etherium_Tier = EnumHelper.addToolMaterial(null, 3, 0, 12f, 3f, 0);
    }

    public static final class Armour
    {
        public static final Item.ToolMaterial Etherium_Tier = EnumHelper.addToolMaterial(null, 3, 0, 12f, 3f, 0);
        public static final Item.ToolMaterial Obsidian_Tier = EnumHelper.addToolMaterial(null, 3, 0, 10f, 3f, 0);
    }
}
