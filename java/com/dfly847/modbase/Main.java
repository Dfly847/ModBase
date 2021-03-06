package com.dfly847.modbase;

import com.dfly847.modbase.entity.EntitySittableBlock;
import com.dfly847.modbase.proxy.CommonProxy;
import com.dfly847.modbase.tabs.ModBaseTab;
import com.dfly847.modbase.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

	@Instance
	public static Main instance;
	
	public static final CreativeTabs modbasetab = new ModBaseTab("modbasetab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		EntityRegistry.registerModEntity(new ResourceLocation("mb:mountable_block"), EntitySittableBlock.class, "MountableBlock", 0, "mb", 80, 1, false);
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}

}
