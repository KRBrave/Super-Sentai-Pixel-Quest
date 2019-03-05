package sspq.item.lupat_ranger;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import sspq.RiderItems;
import sspq.TokuCraft_core;
import sspq.util.IHasModel;


public class item_lupin_collection extends Item  implements IHasModel
{

	public int num;
	public int num2;
	public String Show;
	public int SubSet;
	
	public static String[] ARMS= new String[] {"blank","lupinranger_knight","patranger_crane","lupinranger_magic","patranger_splash","victory","patranger_siren"};

	public item_lupin_collection(String name, int NUM, int arms, String show,int subSet)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
		num=NUM;
		num2=arms;
		Show=show;
		SubSet=subSet;

	}


	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_vs_changer){
						
						item_vs_changer belt = (item_vs_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
						
						item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
				}
		playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}


}


