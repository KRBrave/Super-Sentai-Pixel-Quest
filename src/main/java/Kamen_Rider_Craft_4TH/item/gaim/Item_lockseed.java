package Kamen_Rider_Craft_4TH.item.gaim;

import Kamen_Rider_Craft_4TH.GaimItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.GameCreatorBlock;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_lockseed extends Item implements IHasModel
{

	public int num;
	public int num2;
	public static String[] ARMS=item_Gaimdriver.ARMS;


	public Item_lockseed(int NUM ,int arms,String name)
	{
		super();
		
		this.setMaxDamage(0);

		num=NUM;

		num2=arms;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	 public Item AddlockseedToHelheimVine(int num)
	    {
	    	for (int i1 = 0; i1 < num; ++i1)
			{
	    		 BlockHelheimVine.LOCKSEED.add(this);
			}
	        return this;
	    }
	 
	   /**
  * Called when the equipped item is right clicked.
  */
 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
 {
 
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_Gaimdriver){
				item_Gaimdriver belt = (item_Gaimdriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (num == 1){

					if (belt.DRIVER==0){

						if (ARMS[num2] == "ringo_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_baron){
							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),32);	
						}else if (ARMS[num2] == "fresh_orange_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_gaim){
							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
						}else if (ARMS[num2] == "blood_zakuro_arms"){
							if (playerIn.inventory.hasItemStack(new ItemStack(GaimItems.blood_orange_lockseed)) &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_savior){
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
							}
						}else{

							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}



				}else if (num == 2){
					if (belt.DRIVER==1){
						if (ARMS[num2] != "jimbar_marron_arms"){

							if (ARMS[num2] == "energy_dragon_fruits_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.genesis_driver_tyrant){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2+1);	
							}else{
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
					}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_gaim){


						if (playerIn.inventory.hasItemStack(new ItemStack(GaimItems.orange_lockseed))){

							int jimbar;
							if (ARMS[num2] == "energy_lemon_arms"||ARMS[num2] == "energy_cherry_arms"||ARMS[num2] == "energy_peach_arms"||ARMS[num2] == "energy_melon_arms"){
								jimbar = num2+4;
							}
							else {
								jimbar = 99;
							}

							if (jimbar != 99){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");

								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),jimbar);
							}
						}
					}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_knuckle){
						if (playerIn.inventory.hasItemStack(new ItemStack(GaimItems.kurumi_lockseed))){
							if (ARMS[num2] == "jimbar_marron_arms"){
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);

							}	
						}
						}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_ryugen){
							if (playerIn.inventory.hasItemStack(new ItemStack(GaimItems.budou_lockseed))){
								if (ARMS[num2] == "energy_dragon_fruits_arms"){
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),60);

								}	
							}
						}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_barvo){
							if (playerIn.inventory.hasItemStack(new ItemStack(GaimItems.durian_lockseed))){
								if (ARMS[num2] == "energy_melon_arms"){
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),62);

								}	
							}
						}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_zangetsu){
							if (playerIn.inventory.hasItemStack(new ItemStack(GaimItems.melon_lockseed))){
								if (ARMS[num2] == "energy_melon_arms"){
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),61);

								}	
							
						}

						}

					}else if (num == 3)
					{
						if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_zangetsu)
						{
							if (ARMS[num2] == "kiwami_arms")
							{
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="zangetsu_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
							else if (ARMS[num2] == "zangetsu_kachidoki_arms")
							{
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
						
						else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_baron)
						{
						 if (ARMS[num2] == "kiwami_arms")
						 {
							if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="baron_kachidoki_arms")
							{
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
							} 
						 }
							else if (ARMS[num2] == "baron_kachidoki_arms")
							{
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
						
						else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_ryugen)
						{
							if (ARMS[num2] == "kiwami_arms")
						{
							if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="ryugen_kachidoki_arms")
							{
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
							else if (ARMS[num2]!="ryugen_kachidoki_arms")
							{
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3,"1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
						else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_gaim){

							if (ARMS[num2] == "kiwami_arms"){
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="kachidoki_arms"){
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}else if (ARMS[num2] == "jimbar_black_arms"){
								//if (playerIn.inventory.hasItem(KamenRiderCraft2_core.dark_orange_lockseed) & playerIn.inventory.hasItem(KamenRiderCraft2_core.dark_lemon_energy_lockseed)){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								//}
							}else if (ARMS[num2] == "kachidoki_arms"){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_barvo)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="barvo_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "barvo_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
							
							
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_gridon)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="gridon_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "gridon_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
							
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_kurokage)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="kurokage_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "kurokage_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}			
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_knuckle)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="knuckle_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "knuckle_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}	
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_duke)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="duke_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "duke_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_marika)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="marika_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "marika_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_sigurd)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="sigurd_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "sigurd_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_tyrant)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="tyrant_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "tyrant_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_kamuro)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="kamuro_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "kamuro_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_mars)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="mars_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "mars_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_jam)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jam_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "jam_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_savior)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="savior_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "savior_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_fifteen)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="fifteen_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "fifteen_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_maja)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="maja_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "maja_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_idunn)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="idunn_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "idunn_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						
							else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_sylphi)
							{
							 if (ARMS[num2] == "kiwami_arms")
							 {
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="sylphi_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
								} 
							 }
								else if (ARMS[num2] == "sylphi_kachidoki_arms")
								{
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}
						}
					}
					else if (num == 4){

						if (ARMS[num2] == "drive_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== GaimItems.sengoku_driver_gaim){
							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
						}else{

							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");



							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
				
			}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}