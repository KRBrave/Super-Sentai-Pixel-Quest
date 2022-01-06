package Kamen_Rider_Craft_4TH.item.ooo;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.saber.Item_wonder_ride_book;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Itemmedal extends Item  implements IHasModel
{
	public static final String[] CoreName1= new String[] {"taka","kuwagata","lion","sai","shachi","ptera","cobra","super_taka","love_1","same","shika","seiuchi","mukade","ebi","habataki","taka_ankh","super_ptera","super_kuwagata","super_lion","super_sai","super_shachi","super_cobra","super_same","super_shika","super_seiuchi","super_mukade","super_ebi_new","super_love_core","black_ptera","black_taka","black_kuwagata","black_lion","black_sai","black_shachi","black_cobra","black_same","black_shika","black_seiuchi","black_mukade","black_ebi","black_love","foundation_ptera","foundation_taka","foundation_kuwagata","foundation_lion","foundation_sai","foundation_shachi","foundation_cobra","foundation_same","foundation_shika","foundation_seiuchi","foundation_mukade","foundation_ebi","foundation_love","shocker_head"};
	public static final String[] CoreName2= new String[] {"tora","kamakiri","gorilla","kujaku","unagi","tricera","kame","imagin","panda","super_tora","kangaroo","love_2","kujira","gazelle","shirokuma","hachi","kani","yadokari","taiga","super_tricera","super_kujaku","super_kamakiri","super_gorilla","super_unagi","super_kame","super_imagin","super_kujira","super_gazelle","super_shirokuma","super_hachi","super_kani_new","super_love_core2","super_panda","super_kangaroo","super_yadokari","black_tricera","black_kujaku","black_kamakiri","black_tora","black_gorilla","black_unagi","black_kame","black_imagin","black_kujira","black_gazelle","black_shirokuma","black_hachi","black_kani","black_love2","black_panda","black_kangaroo","black_yadokari","foundation_tricera","foundation_kujaku","foundation_kamakiri","foundation_tora","foundation_gorilla","foundation_unagi","foundation_kame","foundation_imagin","foundation_kujira","foundation_gazelle","foundation_shirokuma","foundation_hachi","foundation_kani","foundation_love2","foundation_panda","foundation_kangaroo","foundation_yadokari","gel_shocker"};
	public static final String[] CoreName3= new String[] {"batta","cheetah","zou","condor","tako","tyranno","wani","shocker","super_batta","kangaroo2","love_3","ookamiuo","ushi","penguin","ari","sasori","ichigo","super_tyranno","super_condor","super_cheetah","super_zou","super_tako","super_wani","super_shocker","super_ookamiuo","super_ushi","super_penguin","super_ari","super_sasori_new","super_love_core3","super_kangaroo2","black_tyranno","black_condor","black_batta","black_cheetah","black_zou","black_tako","black_wani","black_shocker","black_ookamiuo","black_ushi","black_penguin","black_ari","black_sasori","black_love3","black_kangaroo2","foundation_tyranno","foundation_condor","foundation_batta","foundation_cheetah","foundation_zou","foundation_tako","foundation_wani","foundation_shocker","foundation_ookamiuo","foundation_ushi","foundation_penguin","foundation_ari","foundation_sasori","foundation_love3","foundation_kangaroo2","destron"};

	public int num;
	public String num2;

	public boolean shift = false;
	public int shift_num;
	public String shift_num2;

	public Itemmedal(int NUM ,String NUM2,String name)
	{
		super();
		
		this.setMaxDamage(0);
		num=NUM;
		num2=NUM2;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	public Itemmedal  Shift_form(int NUM ,String NUM2)
	{
		shift = true;
		shift_num=NUM;
		shift_num2=NUM2;
		return this;
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver&num2!="birth"){

				if (this==RiderItems.taka_ankh){
					item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
				}else{
					if (shift == true&player.isSneaking()) {
						item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), shift_num, shift_num2);
					}else {
						item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
					}
				}
			}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver){
				if (num2=="birth"){
					int mode = 0;
					if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"birth"+num)==0){
						mode=1;
					}
					item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), mode, "birth"+num);
				}
			}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver_prototype){
				if (this==RiderItems.birth_core_crane_arm||this==RiderItems.birth_core_breast_cannon||this==RiderItems.birth_core_eyes){
					int mode = 0;
					if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"birth"+num)==0){
						mode=1;
					}
					item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), mode, "birth"+num);
				}
			}
		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}
