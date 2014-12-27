package com.Saunderson.steamcraftrb.init;


import com.Saunderson.steamcraftrb.worldGen.CopperOreGen;
import com.Saunderson.steamcraftrb.worldGen.EtheriumOreGen;
import com.Saunderson.steamcraftrb.worldGen.PhosphorusOreGen;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGen
{
    public static void init()
    {
       GameRegistry.registerWorldGenerator(new EtheriumOreGen(), 7);
        GameRegistry.registerWorldGenerator(new CopperOreGen(), 8);
        GameRegistry.registerWorldGenerator(new PhosphorusOreGen(), 9);
    }
}
