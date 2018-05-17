package com.dfly847.modbase.blocks;

import com.dfly847.modbase.Main;
import com.dfly847.modbase.init.ModBlocks;
import com.dfly847.modbase.init.ModItems;
import com.dfly847.modbase.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super (material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modbasetab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}