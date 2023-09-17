package com.modentity.core;

import net.minecraft.entity.passive.EntityWolf;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = ModEntity.MODID, version = ModEntity.VERSION)
public class ModEntity
{
    public static final String MODID = "ModEntity";
    public static final String VERSION = "1.0";
    
    public void init(FMLInitializationEvent event)
    {
	    EntityRegistry.registerGlobalEntityID(EntityWolf.class, "EntityTest", EntityRegistry.findGlobalUniqueEntityId(), 14144467, 3858176);
    }
}