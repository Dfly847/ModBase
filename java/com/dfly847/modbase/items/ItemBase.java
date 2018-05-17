package com.dfly847.modbase.items;

import com.dfly847.modbase.Main;
import com.dfly847.modbase.init.ModItems;
import com.dfly847.modbase.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modbasetab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}