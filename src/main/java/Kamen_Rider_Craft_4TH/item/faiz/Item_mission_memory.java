package Kamen_Rider_Craft_4TH.item.faiz;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Item_mission_memory extends Item implements IHasModel
{
	public int num;

	public Item_mission_memory(String name,int NUM)
	{
		super();
		
		this.setMaxDamage(0);
		num=NUM;
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
    	if (playerIn.inventory.armorInventory.get(1)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.faizdriver){		
				item_faizdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
			} 
		}
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

}
