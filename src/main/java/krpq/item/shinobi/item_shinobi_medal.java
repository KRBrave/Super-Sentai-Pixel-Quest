package krpq.item.shinobi;


import krpq.RiderItems;
import krpq.TokuCraft_core;
import krpq.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class item_shinobi_medal extends Item implements IHasModel
{

	public int num;

	public static String[] ARMS= new String[] {"_base","_sword_base","_stealth_base","_scythe_base","_steel_base","_strength_base","_scar_base","_saikou_base"};

	public item_shinobi_medal(int NUM,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		num=NUM;
		setUnlocalizedName(name);
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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.shinobi_changer){
				item_shinobi_changer belt = (item_shinobi_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt == RiderItems.shinobi_changer)
				{
					item_shinobi_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					item_shinobi_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}