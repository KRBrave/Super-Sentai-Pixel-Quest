package Kamen_Rider_Craft_4TH.item.gaim;


import Kamen_Rider_Craft_4TH.GaimItems;
import Kamen_Rider_Craft_4TH.PqRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_kiwami_lockseed extends Item implements IHasModel
{



	public Item_kiwami_lockseed(String name)
	{
		super();
		this.setMaxDamage(0);

		
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{



		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == GaimItems.sengoku_driver_gaim){
				
			//		((Item_form_change)GaimItems.gaim_kiwami_lockseed).onItemRightClick(worldIn, playerIn, handIn);
				

			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == GaimItems.sengoku_driver_zangetsu){
				
					((Item_form_change)GaimItems.zangetsu_kiwami_lockseed).onItemRightClick(worldIn, playerIn, handIn);
				
			}

		}


		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}

}

