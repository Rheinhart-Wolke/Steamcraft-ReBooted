package com.Saunderson.steamcraftrb.init;


import com.Saunderson.steamcraftrb.worldGen.CopperOreGen;
import com.Saunderson.steamcraftrb.worldGen.EtheriumOreGen;
import com.Saunderson.steamcraftrb.worldGen.PhosphorusOreGen;
import com.Saunderson.steamcraftrb.worldGen.ZincOreGen;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGen
{
    public static void init()
    {
        GameRegistry.registerWorldGenerator(new CopperOreGen(), 7);
        GameRegistry.registerWorldGenerator(new ZincOreGen(), 8);
        GameRegistry.registerWorldGenerator(new EtheriumOreGen(), 9);
        GameRegistry.registerWorldGenerator(new PhosphorusOreGen(), 10);
    }
}
