package com.dfly847.modbase.blocks;

import java.util.List;

import com.dfly847.modbase.Main;
import com.dfly847.modbase.entity.EntitySittableBlock;
import com.dfly847.modbase.init.ModBlocks;
import com.dfly847.modbase.init.ModItems;
import com.dfly847.modbase.util.IHasModel;
import com.dfly847.modbase.util.SittableUtil;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

///have to extend BlockHorizontal if want to do directional blocks, that means can't extend BlockBase
public class BlockBaseDiningChair extends BlockHorizontal implements IHasModel
///end

{
	
	///this is here because can't extend BlockBase when using directional blocks
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	///end
	
	public BlockBaseDiningChair(String name, Material material)
	{
		super (Material.WOOD);
		setSoundType(SoundType.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modbasetab);	
		setHardness(2.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 0);
		
		///this is for placing directional blocks
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		///end
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
///////////this is for placing directional blocks	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		IBlockState state = super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer);
		state = state.withProperty(FACING, placer.getHorizontalFacing());
		return state;
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}
////////directional block placement end

	
	public static final AxisAlignedBB DINING_CHAIR_AABB = new AxisAlignedBB(0.0625D,0.001D,0.0625D,0.9375D,0.625D,0.9375D);
	
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
		return DINING_CHAIR_AABB;
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_)
	{
		if (!(entityIn instanceof EntitySittableBlock)) {
			addCollisionBoxToList(pos, entityBox, collidingBoxes, DINING_CHAIR_AABB);
		}
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		return SittableUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 0.4);
	}
}

