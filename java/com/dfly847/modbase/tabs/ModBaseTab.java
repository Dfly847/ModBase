package com.dfly847.modbase.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModBaseTab extends CreativeTabs
{
	public ModBaseTab(String label) 
	{ 
	super("modbasetab");
	this.setBackgroundImageName("items.png"); 
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Items.DIAMOND);
	}
}