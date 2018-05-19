package com.dfly847.modbase.init;

import java.util.ArrayList;
import java.util.List;

import com.dfly847.modbase.blocks.BlockBaseDiningChair;
import com.dfly847.modbase.blocks.TableBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block TABLE_OAK = new TableBlock("table_oak", Material.WOOD);
	public static final Block TABLE_SPRUCE = new TableBlock("table_spruce", Material.WOOD);
	public static final Block TABLE_BIRCH = new TableBlock("table_birch", Material.WOOD);
	public static final Block TABLE_JUNGLE = new TableBlock("table_jungle", Material.WOOD);
	public static final Block TABLE_ACACIA = new TableBlock("table_acacia", Material.WOOD);
	public static final Block TABLE_DARKOAK = new TableBlock("table_darkoak", Material.WOOD);
	
	public static final Block ACACIA_DINING_CHAIR = new BlockBaseDiningChair("dining_chair_acacia", Material.WOOD);
	public static final Block BIRCH_DINING_CHAIR = new BlockBaseDiningChair("dining_chair_birch", Material.WOOD);
	public static final Block DARKOAK_DINING_CHAIR = new BlockBaseDiningChair("dining_chair_darkoak", Material.WOOD);
	public static final Block JUNGLE_DINING_CHAIR = new BlockBaseDiningChair("dining_chair_jungle", Material.WOOD);
	public static final Block OAK_DINING_CHAIR = new BlockBaseDiningChair("dining_chair_oak", Material.WOOD);
	public static final Block SPRUCE_DINING_CHAIR = new BlockBaseDiningChair("dining_chair_spruce", Material.WOOD);
}
