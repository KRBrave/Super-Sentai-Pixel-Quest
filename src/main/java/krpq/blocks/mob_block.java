package krpq.blocks;

import java.util.Random;

import krpq.RiderItems;
import krpq.TokuCraft_core;
import krpq.item.gaim.item_Gaimdriver;
import krpq.mobs.Boss.Entity_HellBros;
import krpq.mobs.Boss.Entity_NightRogue;
import krpq.mobs.Boss.Entity_another_build;
import krpq.mobs.Boss.Entity_bikaiser;
import krpq.mobs.Boss.Entity_evolt;
import krpq.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class mob_block extends Block implements IHasModel
{

	public String CRYSTAL;
	public mob_block(String string, Material par3Material,String ore,int lv)
	{
		super(par3Material);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setUnlocalizedName(string);
		setRegistryName(string);
		CRYSTAL = ore;
        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	 @Override
		public Item getItemDropped(IBlockState state, Random random, int fortune){
		 return null;
	 }

	@Override
	   /**
     * Called after a player destroys this Block - the posiiton pos may no longer hold the state indicated.
     */
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
    {
		if (!worldIn.isRemote)
		{
			EntityMob entitychicken;
			if (CRYSTAL == "another_build"){
				entitychicken = new Entity_another_build(worldIn);
			}else if (CRYSTAL == "evolt"){
				entitychicken = new Entity_evolt(worldIn);	
			}else if (CRYSTAL == "night_rogue"){
				entitychicken = new Entity_NightRogue(worldIn);	
			}else if (CRYSTAL == "hell_bros"){
				entitychicken = new Entity_HellBros(worldIn);	
			}else if (CRYSTAL == "bi_kaiser"){
				entitychicken = new Entity_bikaiser(worldIn);	
			}else{
				entitychicken = new Entity_another_build(worldIn);
			}
            entitychicken.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 0, 0.0F);
            worldIn.spawnEntity(entitychicken);
		}
    }

	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
	{
		return 5;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

}