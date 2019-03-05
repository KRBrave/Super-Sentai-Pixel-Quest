package sspq.item.rider_armor_base;


import java.util.List;

import com.google.common.collect.Lists;

import sspq.RiderItems;
import sspq.TokuCraft_core;
import sspq.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;


public class item_form_change extends Item implements IHasModel
{

	public int num;
	public String Show;
	public int SubSet;
	
	public item_form_change(String name, int NUM, String show,int subSet)
	{
		super();
		this.setMaxDamage(0);
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        num=NUM;
		Show=show;
		SubSet=subSet;
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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
				//par3EntityPlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD +""+num));
				if (((item_rider_driver)playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Show == Show){
					if (((item_rider_driver)playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).SubSet == SubSet){
						item_rider_driver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);

						

					}
				}
			}
		}
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}