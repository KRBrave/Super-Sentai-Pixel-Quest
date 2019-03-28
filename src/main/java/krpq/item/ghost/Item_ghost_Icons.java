package krpq.item.ghost;

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

public class Item_ghost_Icons extends Item implements IHasModel
{

	public int num;
	public int num2;
	public int num3;
	public static String[] ARMS= new String[] {"ore","edison","newton","musashi","robin","specter","billy_the_kid","beethoven","benkei","tutankhamun","nobunaga","ikkyu","santa","boost","goemon","ryoma","pythagoras","kamehameha","special_ore","necrom","himiko","houdini","grimm","sanzo","deep_specter","dark","dark_necrom_red","dark_necrom_blue","dark_necrom_yellow","dark_necrom_pink","zero_specter","shakespeare","nightingale","galileo","columbus","mugen","napoleon","darwin","sin","tenkatoitsu","shinsengumi","yujou_burst_necrom","da_vinci","showa","kuuga","agito","ryuki","faiz","blade","hibiki","kabuto","den_o","kiva","decade","double","ooo","fourze","wizard","gaim","drive","ex_aid","fourtyfiveshowa","ore_specter","fourtyfiveheisei","new_ore","grateful_mugen_boost","fabre","geronimo"};
	//                                        {1    ,2       ,3       ,4        ,5      ,6        ,7              ,8          ,9       ,10           ,11        ,12     ,13     ,14     ,15      ,16     ,17          ,18          ,19           ,20      ,21      ,22       ,23     ,24     ,25            ,26    ,27               ,28                ,29                  ,30                ,31            ,32           ,33           ,34       ,35        ,36     ,37        ,38      ,39   ,40           ,41           ,42                  ,43        ,44     ,45     ,46     ,47     ,48    ,49     ,50      ,51      ,52     ,53    ,54      ,55      ,56   ,57      ,58      ,59    ,60     ,61      ,62               ,63           ,64                ,65       ,66                    ,67     ,68     };

	
	public Item_ghost_Icons(int NUM ,int arms,int rider,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		
		num=NUM;
		
		num2=arms;
		
		num3=rider;
		
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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ghostdriver&playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()!=RiderItems.extremer_driver){
				item_ghostdriver belt = (item_ghostdriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (num == 0){
					if (num2== 0&belt == RiderItems.ghostdriver||num2== 5&belt == RiderItems.specterdriver||num2== 19&belt == RiderItems.mega_ulorder){
							item_ghostdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
					}
					item_ghostdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2,num3);
				
				


				}else if (belt == RiderItems.ghostdriver&this==RiderItems.toucon_boost_icon||belt == RiderItems.ghostdriver&this==RiderItems.mugen_icon||belt == RiderItems.ghostdriver&this==RiderItems.fourtyfive_heisei_ghost_icon){
					item_ghostdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num, "1");
					item_ghostdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2,num3);
				}else if (num  ==1& belt == RiderItems.specterdriver&this==RiderItems.deep_specter_ghost_icon||num  ==2& belt == RiderItems.specterdriver&this==RiderItems.sin_specter_icon){
					item_ghostdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num, "1");
					item_ghostdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2,num3);
				}else if (belt == RiderItems.mega_ulorder&this==RiderItems.yujou_burst_icon){
					item_ghostdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num, "1");
					item_ghostdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2,num3);
				}
				else if(belt==RiderItems.eyecon_driver_g)
				{
					if(this == RiderItems.grateful_mugen_boost_icon)
					{
						item_ghostdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num, "1");
						item_ghostdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2,num3);
					}
				}
			}
			
		}
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}