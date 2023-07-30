package Kamen_Rider_Craft_4TH.item.gaim;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.GaimItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghostdriver;
import Kamen_Rider_Craft_4TH.item.revice.item_revicedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.model.model_belt_w;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Gaimdriver extends item_rider_driver
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public String RIDER;
	public String LOCK;
	public int DRIVER;
	public Item DIFLOCK;
	public static String[] ARMS= new String[] {
			"","matsubokkuri_arms","kurumi_arms","donguri_arms","melon_arms","pine_arms",
			"ichigo_arms","orange_arms","banana_arms","budou_arms","mango_arms",
			"durian_arms", "kiwi_arms", "energy_lemon_arms", "energy_cherry_arms","energy_peach_arms",
			"energy_melon_arms","jimbar_lemon_arms","jimbar_cherry_arms","jimbar_peach_arms","jimbar_melon_arms",
			"energy_matsubokkuri_arms","kachidoki_arms", "kiwami_arms", "yomotsu_heguri_arms", "blood_orange_arms",
			"fifteen_arms", "golden_arms", "silver_arms", "darkness_arms","watermelon_arms",
			"ringo_arms","baron_ringo_arms","jimbar_black_arms", "wizard_arms", "fourze_arms",
			"ooo_arms", "w_arms", "decade_arms", "rider_ichigo_arms","suika_arms",
			"lemon_arms","energy_dragon_fruits_arms","energy_prototype_dragon_fruits_arms","fresh_orange_arms","drive_arms",
			"jimbar_marron_arms","blood_zakuro_arms","kuuga_arms","agito_arms","ryuki_arms",
			"faiz_arms","blade_arms","hibiki_arms","kabuto_arms","den_o_arms",
			"kiva_arms","gaim_arms","kabi_orange_arms","maja_arms","jimbar_dragon_arms",
			"jimbar_melon_arms_zangetsu","jimbar_melon_arms_barvo","natsumikan_arms","black_baron_arms", "zangetsu_kachidoki_arms",
			"lychee_arms","king_durian_arms","hells_arms","haljo_heguri_arms","diyu_heguri_arms",
			"lucifer_heguri_arms","silver_lucifer_heguri_arms","golden_lucifer_heguri_arms","proto_nokuni_heguri_arms","enma_heguri_arms",
			"black_lucifer_heguri_arms","nether_heguri_arms","abyss_heguri_arms","naraka_heguri_arms","helreginn_heguri_arms",
			"apollyon_heguri_arms","taishan_heguri_arms","orcus_heguri_arms","inferno_heguri_arms","nokuni_heguri_arms",
			"tartarus_heguri_arms","daimaoh_heguri_arms","zetsubo_heguri_arms","taizai_heguri_arms","yomi_heguri_arms",
			"sin_heguri_arms","hades_heguri_arms","jigoku_heguri_arms","submondo_heguri_arms","cherry_arms",
			"dragonfruit_arms","marron_arms","peach_arms","energy_kurumi_arms","energy_donguri_arms",
			"energy_pine_arms","energy_ichigo_arms","energy_orange_arms","energy_banana_arms","energy_budou_arms",
			"energy_suika_arms","energy_mango_arms","energy_durian_arms","energy_kiwi_arms","energy_blood_orange_arms",
			"energy_fifteen_arms","energy_golden_ringo_arms","energy_silver_ringo_arms","energy_black_ringo_arms","energy_watermelon_arms",
			"energy_forbidden_ringo_arms","energy_zakuro_arms","energy_maja_arms","energy_lychee_arms","energy_king_durian_arms",
			"energy_helheim_arms","ryugen_kachidoki_arms","ryugen_kiwami_arms","","",
			"","","","","",};

	public static final String[] CoreName= new String[] {"","_jimbar","_kachidoki","_kiwami","_yami", "_fresh","_drive","_yomi","_watermelon","_lychee","_king","_hex"};



	public item_Gaimdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, String lock, int driver,Item difLock)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,RiderItems.Gaimhead, RiderItems.Gaimtroso, RiderItems.Gaimlegs, RiderItems.himawari_lockseed);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		RIDER = rider; 
		LOCK = lock;
		DRIVER = driver;
		DIFLOCK=difLock;
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return !true;
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{
				model_belt_plus armorModel = new model_belt_plus();

				if (this.RIDER=="ryugen"&this.get_lock(stack)=="yomotsu_heguri_arms"){
					armorModel.belt = new ItemStack(RiderItems.sengoku_driver_ryugen_yomi);

				}else if (this.RIDER=="zangetsu"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(RiderItems.sengoku_driver_zangetsu_watermelon);

				}else{
					armorModel.belt=stack;
				}

				Item[] LOCK= new Item[] {
						RiderItems.himawari_lockseed,RiderItems.sengoku_driver_matsubokkuri,RiderItems.sengoku_driver_kurumi,RiderItems.sengoku_driver_donguri,RiderItems.sengoku_driver_melon,RiderItems.sengoku_driver_pine,
						RiderItems.sengoku_driver_ichigo, RiderItems.sengoku_driver_orange, RiderItems.sengoku_driver_banana,RiderItems.sengoku_driver_budou, RiderItems.sengoku_driver_mango,
						RiderItems.sengoku_driver_durian, RiderItems.sengoku_driver_kiwi, RiderItems.sengoku_driver_lemon_energy,RiderItems.sengoku_driver_cherry_energy, RiderItems.sengoku_driver_peach_energy,
						RiderItems.sengoku_driver_melon_energy,RiderItems.sengoku_driver_jinba_lemon,RiderItems.sengoku_driver_jinba_cherry,RiderItems.sengoku_driver_jinba_peach,RiderItems.sengoku_driver_jinba_melon,
						RiderItems.sengoku_driver_matsubokkuri_energy,RiderItems.sengoku_driver_kachidoki,RiderItems.sengoku_driver_kiwami,RiderItems.sengoku_driver_yomotsu_heguri,RiderItems.sengoku_driver_blood_orange,
						RiderItems.sengoku_driver_fifteen_lock,RiderItems.sengoku_driver_golden_ringo,RiderItems.sengoku_driver_silver_ringo,RiderItems.sengoku_driver_black_ringo,RiderItems.sengoku_driver_watermelon,
						RiderItems.sengoku_driver_forbidden_ringo,RiderItems.sengoku_driver_forbidden_ringo,RiderItems.sengoku_driver_jinba_black,RiderItems.sengoku_driver_wizard,RiderItems.sengoku_driver_fourze,
						RiderItems.sengoku_driver_ooo,RiderItems.sengoku_driver_w,RiderItems.sengoku_driver_decade,RiderItems.sengoku_driver_rider_ichigo,RiderItems.sengoku_driver_suika,
						RiderItems.sengoku_driver_lemon,RiderItems.sengoku_driver_dragon_fruits_energy,RiderItems.sengoku_driver_dragon_fruits_energy,RiderItems.sengoku_driver_orange_fr,RiderItems.sengoku_driver_drive,
						RiderItems.sengoku_driver_jinba_marron,RiderItems.sengoku_driver_blood_zakuro,RiderItems.sengoku_driver_kuuga,RiderItems.sengoku_driver_agito,RiderItems.sengoku_driver_ryuki,
						RiderItems.sengoku_driver_faiz,RiderItems.sengoku_driver_blade,RiderItems.sengoku_driver_hibiki,RiderItems.sengoku_driver_kaubuto,RiderItems.sengoku_driver_den_o,
						RiderItems.sengoku_driver_kiva,RiderItems.sengoku_driver_gaim_lock,RiderItems.sengoku_driver_kabi_orange,RiderItems.sengoku_driver_maja_lock,RiderItems.sengoku_driver_jinba_dragon,
						RiderItems.sengoku_driver_jinba_melon_melon,RiderItems.sengoku_driver_jinba_melon_durian,RiderItems.sengoku_driver_natsumikan,RiderItems.sengoku_driver_black_baron,RiderItems.sengoku_driver_zangetsu_kachidoki,
						RiderItems.sengoku_driver_lychee,RiderItems.sengoku_driver_king_durian,RiderItems.sengoku_driver_hells,GaimItems.sengoku_driver_haljo_heguri,GaimItems.sengoku_driver_diyu_heguri,
						GaimItems.sengoku_driver_lucifer_heguri,GaimItems.sengoku_driver_silver_lucifer_heguri,GaimItems.sengoku_driver_golden_lucifer_heguri,GaimItems.sengoku_driver_golden_lucifer_heguri,GaimItems.sengoku_driver_enma_heguri,
						GaimItems.sengoku_driver_black_lucifer_heguri,GaimItems.sengoku_driver_nether_heguri,GaimItems.sengoku_driver_abyss_heguri,GaimItems.sengoku_driver_naraka_heguri,GaimItems.sengoku_driver_helreginn_heguri,
						GaimItems.sengoku_driver_apollyon_heguri,GaimItems.sengoku_driver_taishan_heguri,GaimItems.sengoku_driver_orcus_heguri,GaimItems.sengoku_driver_inferno_heguri,GaimItems.sengoku_driver_nokuni_heguri,
						GaimItems.sengoku_driver_tartarus_heguri,GaimItems.sengoku_driver_daimaoh_heguri,GaimItems.sengoku_driver_zetsubo_heguri,GaimItems.sengoku_driver_taizai_heguri,GaimItems.sengoku_driver_yomi_heguri,
						GaimItems.sengoku_driver_sin_heguri,GaimItems.sengoku_driver_hades_heguri,GaimItems.sengoku_driver_jigoku_heguri,GaimItems.sengoku_driver_submondo_heguri,GaimItems.sengoku_driver_cherry,
						GaimItems.sengoku_driver_dragonfruit,GaimItems.sengoku_driver_marron,GaimItems.sengoku_driver_peach,GaimItems.sengoku_driver_kurumi_energy,GaimItems.sengoku_driver_donguri_energy,
						GaimItems.sengoku_driver_pine_energy,GaimItems.sengoku_driver_ichigo_energy,GaimItems.sengoku_driver_orange_energy,GaimItems.sengoku_driver_banana_energy,GaimItems.sengoku_driver_budou_energy,
						GaimItems.sengoku_driver_suika_energy,GaimItems.sengoku_driver_mango_energy,GaimItems.sengoku_driver_durian_energy,GaimItems.sengoku_driver_kiwi_energy,GaimItems.sengoku_driver_blood_orange_energy,
						GaimItems.sengoku_driver_fifteen_lock_energy,GaimItems.sengoku_driver_golden_ringo_energy,GaimItems.sengoku_driver_silver_ringo_energy,GaimItems.sengoku_driver_black_ringo_energy,GaimItems.sengoku_driver_watermelon_energy,
						GaimItems.sengoku_driver_forbidden_ringo_energy,GaimItems.sengoku_driver_zakuro_energy,GaimItems.sengoku_driver_maja_lock_energy,GaimItems.sengoku_driver_lychee_energy,GaimItems.sengoku_driver_king_durian_energy,
						GaimItems.sengoku_driver_hells_energy,GaimItems.sengoku_driver_ryugen_kachidoki,GaimItems.sengoku_driver_ryugen_kiwami,ShowaRiderItems.blanknoitem,ShowaRiderItems.blanknoitem,
						ShowaRiderItems.blanknoitem,ShowaRiderItems.blanknoitem,ShowaRiderItems.blanknoitem,ShowaRiderItems.blanknoitem,ShowaRiderItems.blanknoitem};

				if (stack.hasTagCompound()){
					if( stack.getTagCompound().getInteger("seed")!=0)
					{
						armorModel.belt2=new ItemStack(LOCK[stack.getTagCompound().getInteger("seed")]);

					}else{
						armorModel.belt2=new ItemStack(DIFLOCK);	
					}
				}else{
					armorModel.belt2=new ItemStack(DIFLOCK);	
				}
				//armorModel.bipedRightLeg.showModel = slot == EntityEquipmentSlot.FEET;
				//armorModel.bipedLeftLeg.showModel = slot == EntityEquipmentSlot.FEET;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;

				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";

	}




	public static int get_core(ItemStack itemstack,String slot)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core"+slot) : 0;
	}

	public static void set_core(ItemStack itemstack, int flag,String slot)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core"+slot, flag);
	}


	public static String get_lock(ItemStack itemstack)
	{	
		item_Gaimdriver belt = (item_Gaimdriver) itemstack.getItem();

		return itemstack.hasTagCompound() ?itemstack.getTagCompound().getInteger("seed")!= 0 ? ARMS[itemstack.getTagCompound().getInteger("seed")] : belt.LOCK: belt.LOCK;
	}




	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed", flag);
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.Gaimlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.Gaimtroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.Gaimhead){

									player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 250, 5,true,false));


									if (this.get_lock(armor)=="matsubokkuri_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

									}
									else if (this.get_lock(armor)=="kurumi_arms"){

										if (player.getHeldItemMainhand().isEmpty())
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));

										}


									}else if (this.get_lock(armor)=="donguri_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));

									}


									else if (this.get_lock(armor)=="melon_arms"){


										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));

									}else if (this.get_lock(armor)=="pine_arms"){


										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}
									else if (this.get_lock(armor)=="ichigo_arms"){


										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));

									}else if (this.get_lock(armor)=="banana_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="budou_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
									}else if (this.get_lock(armor)=="mango_arms"){


										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
									}
									else if (this.get_lock(armor)=="durian_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (this.get_lock(armor)=="kiwi_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));

									}else if (this.get_lock(armor)=="jimbar_lemon_arms"||this.get_lock(armor)=="jimbar_black_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="jimbar_cherry_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="jimbar_peach_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="jimbar_dragon_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}else if (this.get_lock(armor)=="jimbar_marron_arms"){
										if (player.getHeldItemMainhand().isEmpty())
										{player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false));
										}player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (this.get_lock(armor)=="watermelon_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (this.get_lock(armor)=="jimbar_melon_arms"||this.get_lock(armor)=="jimbar_melon_arms_zangetsu"||this.get_lock(armor)=="jimbar_melon_arms_barvo"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="kachidoki_arms"||this.get_lock(armor)=="zangetsu_kachidoki_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));

									}else if (this.get_lock(armor)=="energy_lemon_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));
									}else if (this.get_lock(armor)=="lemon_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));
									}else if (this.get_lock(armor)=="energy_dragon_fruits_arms"||this.get_lock(armor)=="energy_prototype_dragon_fruits_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}else if (this.get_lock(armor)=="energy_cherry_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
									}else if (this.get_lock(armor)=="energy_peach_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
									}else if (this.get_lock(armor)=="energy_melon_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
									}else if (this.get_lock(armor)=="energy_matsubokkuri_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));


									}
									else if (this.get_lock(armor)=="orange_arms"||this.get_lock(armor)=="natsumikan_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));

									}else if (this.get_lock(armor)=="kabi_orange_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 5, 0,true,false));

									}else if (this.get_lock(armor)=="fresh_orange_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));

									}else if (this.get_lock(armor)=="kiwami_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
									}else if (this.get_lock(armor)=="blood_orange_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="yomotsu_heguri_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 5,true,false));
									}else if (this.get_lock(armor)=="fifteen_arms"||this.get_lock(armor)=="maja_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}else if (this.get_lock(armor)=="golden_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
									}else if (this.get_lock(armor)=="darkness_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
									}else if (this.get_lock(armor)=="ringo_arms"||this.get_lock(armor)=="baron_ringo_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
									}else if (this.get_lock(armor)=="silver_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}else if (this.get_lock(armor)=="blood_zakuro_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 5, 0,true,false));
									}else if (this.get_lock(armor)=="suika_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));

									}else if (this.get_lock(armor)=="black_baron_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));

									}
								}}}}}}}}

	
	public  String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if (num==2||num==5||num==3||num==6||num==8||num==12)
					{
						return Refercence.MODID+":textures/armor/"+ belt.Rider+ CoreName[item_Gaimdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
					}
					else if (num==1||num==13||num==11||num==10){


						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_kurokage_troopers&get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="matsubokkuri_arms")
						{

							return Refercence.MODID+":textures/armor/energy_matsubokkuri_arms.png";
						}
						else
						{
							return Refercence.MODID+":textures/armor/"+ get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) +".png";
						}

					} else if (num==9){

						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_kurokage_troopers&get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="matsubokkuri_arms")
						{

							return Refercence.MODID+":textures/armor/energy_matsubokkuri_arms.png";
						}
						else
						{	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_cherry_arms")
						{
							return Refercence.MODID+":textures/armor/"+ get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) +".png";
						}else{
							return "blank";
						}
						}
					}else if (num==4){

						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_kurokage_troopers&get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="matsubokkuri_arms")
						{

							return Refercence.MODID+":textures/armor/energy_matsubokkuri_arms.png";
						}
						else
						{		if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_melon_arms" & item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_peach_arms" & item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_lemon_arms" )
						{	
							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="energy_dragon_fruits_arms"){

								return Refercence.MODID+":textures/armor/energy_prototype_dragon_fruits_arms.png";

							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="blood_zakuro_arms"){

								return Refercence.MODID+":textures/armor/blood_orange_arms.png";

							}else {
							return Refercence.MODID+":textures/armor/"+ get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) +".png";
							}
						}else{
							return "blank";
						}
						}
					}else{
						return "blank";

					}
				}else{
					return "blank";
				}
			}else{
				return "blank";
			}

		}
		return "blank";

	}

	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}




}