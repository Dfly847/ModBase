package com.dfly847.modbase.init;

import java.util.ArrayList;
import java.util.List;

import com.dfly847.modbase.blocks.TableBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TABLE_OAK = new TableBlock("table_oak", Material.WOOD);

}
