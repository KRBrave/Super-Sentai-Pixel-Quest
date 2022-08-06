package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class vistamp_bar extends machine_block  {
	
	public vistamp_bar(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}
	public static final List<Item> vistamp = new ArrayList<Item>();

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

	private Item getvistampDrop(EntityPlayer player) {
		
		List<Item> vistamp2 = new ArrayList<Item>();
		vistamp2.clear();
		 vistamp2.addAll(vistamp);
		 if (player.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.barid_rex_vistamp))){
				for (int i1 = 0; i1 < 20; ++i1)
				{
					vistamp2.add(ReiwaRiderItems.volcano_vistamp);
				}
		 }
		Random generator = new Random();
			int rand = generator.nextInt(vistamp2.size());
			return vistamp2.get(rand);
		
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == ReiwaRiderItems.proto_vistamp) process(player, worldIn, pos, hand, getvistampDrop(player));
			return true;
		}

		return false;
	}
}