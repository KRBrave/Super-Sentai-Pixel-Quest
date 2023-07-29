package Kamen_Rider_Craft_4TH.item.kabuto;


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


public class Item_hyper_zecter extends Item implements IHasModel
{



	public Item_hyper_zecter(String name)
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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.kabuto_rider_belt){
				
					((Item_form_change)PqRiderItems.kabuto_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
				

			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gatack_rider_belt){
				
					((Item_form_change)RiderItems.gatack_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
				
			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.dark_kabuto_rider_belt){
				
				((Item_form_change)RiderItems.dark_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
				
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.thebee_rider_belt){
			
			((Item_form_change)PqRiderItems.thebee_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.drake_rider_belt){
			
			((Item_form_change)PqRiderItems.drake_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sasword_rider_belt){
			
			((Item_form_change)PqRiderItems.sasword_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.kickhopper_rider_belt){
			
			((Item_form_change)PqRiderItems.kickhopper_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.puchhopper_rider_belt){
			
			((Item_form_change)PqRiderItems.puchhopper_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.caucasus_rider_belt){
			
			((Item_form_change)RiderItems.caucasus_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.hercus_rider_belt){
			
			((Item_form_change)PqRiderItems.hercus_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ketaros_rider_belt){
			
			((Item_form_change)PqRiderItems.ketaros_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lady_rider_belt){
			
			((Item_form_change)PqRiderItems.lady_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_kabuto_rider_belt){
				
				((Item_form_change)RiderItems.perfect_kabuto_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_gatack_rider_belt){
			
			((Item_form_change)PqRiderItems.perfect_gatack_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_dark_kabuto_rider_belt){
		
			((Item_form_change)PqRiderItems.perfect_dark_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_thebee_rider_belt){
		
			((Item_form_change)PqRiderItems.perfect_thebee_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_drake_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_drake_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_sasword_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_sasword_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
	
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_kickhopper_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_kickhopper_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_punchhopper_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_puchhopper_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_caucasus_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_caucasus_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_hercus_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_hercus_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_ketaros_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_ketaros_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		
	}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == PqRiderItems.perfect_lady_rider_belt){
		
		((Item_form_change)PqRiderItems.perfect_lady_hyper_zecter).onItemRightClick(worldIn, playerIn, handIn);
		}

		}


		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}

}

