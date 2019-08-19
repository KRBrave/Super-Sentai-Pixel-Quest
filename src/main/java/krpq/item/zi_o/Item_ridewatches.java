package krpq.item.zi_o;


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


public class Item_ridewatches extends Item implements IHasModel
{

	public int num;
	public int num2;
	public boolean works_with_decade_ridewatch=false;

	//                                        {0     ,1      ,2      ,3      ,4      ,5     ,6       ,7       ,8    ,9  ,10    
	public static String[] ARMS= new String[] {"base","build","exaid","ghost","drive","gaim","wizard","fourze","ooo","w","kiva"
		  //,11    ,12      ,13      ,14     ,15    , 16    ,17     ,18     ,19    ,20      
			,"deno","kabuto","hibiki","blade","faiz","ryuki","agito","kuuga","genm","decade"
		  //,21       ,22    ,23       ,24     ,25       ,26      ,27     ,28    ,29         ,30      
			,"exaid_w","quiz","shinobi","kikai","cross-z","grease","rogue","evol","mad_rogue","garren"
		  //,31     ,32     ,33       ,34               ,35            ,36                   ,37               ,38            ,39                  ,40                  	
			,"brave","blood","killbus","build_sparkling","build_hazard","build_rabbit_rabbit","build_tank_tank","build_genius","build_gorilla_mond","build_hawk_gatling"
		  //,41                  ,42                  ,43                   ,44                  ,45                ,46                    ,47                   ,48                  ,49                 ,50               
			,"build_ninnin_comic","build_rocket_panda","build_fire_hedgehog","build_lion_cleaner","build_key_dragon","build_kaizoku_ressha","build_octopus_light","build_phoenix_robo","build_smapho_wolf","build_uni_raser"
		  //,51                 ,52                  ,53                   ,54                 ,55             ,56                     ,57                   ,58              ,59                60                
			,"build_rose_copter","build_turtle_watch","build_beetle_camera","build_kuma_televi","build_dog_mic","build_merry_christmas","build_spider_cooler","build_tora_ufo","build_kujira_jet","build_shika_mid"
		  //,61                   ,62                    };
			,"build_kirin_cyclone","build_penguin_skater"};



	public Item_ridewatches(int NUM ,int arms,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		num=NUM;
		num2=arms;
		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}

	public Item_ridewatches(int NUM ,int arms,String name,boolean decade)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		num=NUM;
		num2=arms;
		works_with_decade_ridewatch=decade;
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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ziku_driver_zi_o||playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ziku_driver_geiz){
				item_zikudriver belt = (item_zikudriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt.DRIVER==0){

					if (num == 0){

						if (belt.Rider=="zi_o"){

							if (this == RiderItems.zi_o_ridewatch){

								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");

							}else if (this == RiderItems.decade_ridewatch){

								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");
								
							}else if (this == RiderItems.zi_o_ii_ridewatch){

								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");

							}
						}else if (belt.Rider=="geiz"){

							if (this == RiderItems.geiz_ridewatch){

								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");									
							}else if (this == RiderItems.decade_ridewatch){

								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");
								
							}		
						}		
					}
					else if (num==1){
						if (works_with_decade_ridewatch||item_zikudriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0)

							if (this == RiderItems.exaid_ridewatch&item_zikudriver.get_locknum(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==2){
								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),21);
							}else{
								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
					}
				}
			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.beyondriver){
				item_zikudriver belt = (item_zikudriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt.DRIVER==0){

					if (num == 0){
						if (belt.Rider=="woz"){

							if (this == RiderItems.woz_miridewatch){

								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");									
							}		
						}			
					}
					else if (num==2){
						if (belt.Rider=="woz")

							item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}