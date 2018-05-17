package com.dfly847.modbase.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TableBlock extends BlockBase 
{
	public TableBlock(String name, Material material)
	{
		super(name, Material.WOOD);
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 0);
	}
	
	public static final AxisAlignedBB TABLE_AABB = new AxisAlignedBB(0, 0, 0, 1, 1, 1);
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return TABLE_AABB;
	}
}
