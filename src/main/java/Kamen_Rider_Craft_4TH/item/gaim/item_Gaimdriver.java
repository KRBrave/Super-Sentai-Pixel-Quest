package Kamen_Rider_Craft_4TH.item.gaim;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.GaimItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
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
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Gaimdriver extends ItemArmor  implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public String RIDER;
	public String LOCK;
	public int DRIVER;
	public Item DIFLOCK;
	public static String[] ARMS= new String[] {"","matsubokkuri_arms","kurumi_arms", "donguri_arms","melon_arms","pine_arms", "ichigo_arms", "orange_arms", "banana_arms", "budou_arms", "mango_arms", "durian_arms", "kiwi_arms", "energy_lemon_arms", "energy_cherry_arms", "energy_peach_arms", "energy_melon_arms","jimbar_lemon_arms","jimbar_cherry_arms","jimbar_peach_arms","jimbar_melon_arms", "energy_matsubokkuri_arms", "kachidoki_arms", "kiwami_arms", "yomotsu_heguri_arms", "blood_orange_arms", "fifteen_arms", "golden_arms", "silver_arms", "darkness_arms", "watermelon_arms", "ringo_arms","baron_ringo_arms","jimbar_black_arms", "wizard_arms", "fourze_arms", "ooo_arms", "w_arms", "decade_arms", "rider_ichigo_arms","suika_arms","lemon_arms","energy_dragon_fruits_arms","energy_prototype_dragon_fruits_arms","fresh_orange_arms","drive_arms","jimbar_marron_arms","blood_zakuro_arms","kuuga_arms","agito_arms","ryuki_arms","faiz_arms","blade_arms","hibiki_arms","kabuto_arms","den_o_arms","kiva_arms","gaim_arms","kabi_orange_arms","maja_arms","jimbar_dragon_arms","jimbar_melon_arms_zangetsu","jimbar_melon_arms_barvo","natsumikan_arms","black_baron_arms", "zangetsu_kachidoki_arms","haljo_heguri_arms","diyu_heguri_arms","lucifer_heguri_arms","silver_lucifer_arms","golden_lucifer_heguri_arms","proto_nokuni_heguri_arms","enma_heguri_arms","black_lucifer_heguri_arms","nether_heguri_arms","abyss_heguri_arms","naraka_heguri_arms","helreginn_heguri_arms","apollyon_heguri_arms","taishan_heguri_arms","orcus_heguri_arms","inferno_heguri_arms","nokuni_heguri_arms","tartarus_heguri_arms","daimaoh_heguri_arms","zetsubo_heguri_arms","taizai_heguri_arms","yomi_heguri_arms","sin_heguri_arms","hades_heguri_arms","jigoku_heguri_arms","submondo_heguri_arms","cherry_arms","dragonfruit_arms","marron_arms","peach_arms","lychee_arms","king_durian_arms","hells_arms"};




	public item_Gaimdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, String lock, int driver,Item difLock)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		RIDER = rider; 
		LOCK = lock;
		DRIVER = driver;
		DIFLOCK=difLock;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
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
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_ryugen_yomi);

				}else if (this.RIDER=="zangetsu"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_zangetsu_watermelon);

				}else{
					armorModel.belt=stack;
				}

				Item[] LOCK= new Item[] {RiderItems.himawari_lockseed,GaimItems.sengoku_driver_matsubokkuri
						,GaimItems.sengoku_driver_kurumi,GaimItems.sengoku_driver_donguri,
						GaimItems.sengoku_driver_melon,GaimItems.sengoku_driver_pine,
						GaimItems.sengoku_driver_ichigo, GaimItems.sengoku_driver_orange,
						GaimItems.sengoku_driver_banana, GaimItems.sengoku_driver_budou,
						GaimItems.sengoku_driver_mango, GaimItems.sengoku_driver_durian,
						GaimItems.sengoku_driver_kiwi, GaimItems.sengoku_driver_lemon_energy,
						GaimItems.sengoku_driver_cherry_energy, GaimItems.sengoku_driver_peach_energy,
						GaimItems.sengoku_driver_melon_energy,GaimItems.sengoku_driver_jinba_lemon,
						GaimItems.sengoku_driver_jinba_cherry,GaimItems.sengoku_driver_jinba_peach,
						GaimItems.sengoku_driver_jinba_melon,GaimItems.sengoku_driver_matsubokkuri_energy,
						GaimItems.sengoku_driver_kachidoki,GaimItems.sengoku_driver_kiwami,
						GaimItems.sengoku_driver_yomotsu_heguri,GaimItems.sengoku_driver_blood_orange,
						GaimItems.sengoku_driver_fifteen_lock,GaimItems.sengoku_driver_golden_ringo,
						GaimItems.sengoku_driver_silver_ringo,GaimItems.sengoku_driver_black_ringo,
						GaimItems.sengoku_driver_watermelon,GaimItems.sengoku_driver_forbidden_ringo,
						GaimItems.sengoku_driver_forbidden_ringo,GaimItems.sengoku_driver_jinba_black,
						GaimItems.sengoku_driver_wizard,GaimItems.sengoku_driver_fourze,
						GaimItems.sengoku_driver_ooo,GaimItems.sengoku_driver_w,
						GaimItems.sengoku_driver_decade,GaimItems.sengoku_driver_rider_ichigo,
						GaimItems.sengoku_driver_suika,GaimItems.sengoku_driver_lemon,
						GaimItems.sengoku_driver_dragon_fruits_energy,GaimItems.sengoku_driver_dragon_fruits_energy,
						GaimItems.sengoku_driver_orange_fr,GaimItems.sengoku_driver_drive,
						GaimItems.sengoku_driver_jinba_marron,GaimItems.sengoku_driver_blood_zakuro,
						GaimItems.sengoku_driver_kuuga,GaimItems.sengoku_driver_agito,
						GaimItems.sengoku_driver_ryuki,GaimItems.sengoku_driver_faiz,
						GaimItems.sengoku_driver_blade,GaimItems.sengoku_driver_hibiki,
						GaimItems.sengoku_driver_kaubuto,GaimItems.sengoku_driver_den_o,
						GaimItems.sengoku_driver_kiva,GaimItems.sengoku_driver_gaim_lock,
						GaimItems.sengoku_driver_kabi_orange,GaimItems.sengoku_driver_maja_lock,
						GaimItems.sengoku_driver_jinba_dragon,GaimItems.sengoku_driver_jinba_melon_melon,
						GaimItems.sengoku_driver_jinba_melon_durian,GaimItems.sengoku_driver_natsumikan,
						GaimItems.sengoku_driver_black_baron,GaimItems.sengoku_driver_zangetsu_kachidoki,
						GaimItems.sengoku_driver_haljo_heguri,GaimItems.sengoku_driver_diyu_heguri,
						GaimItems.sengoku_driver_lucifer_heguri,GaimItems.sengoku_driver_silver_lucifer_heguri,
						GaimItems.sengoku_driver_golden_lucifer_heguri,GaimItems.sengoku_driver_proto_nokuni_heguri,
						GaimItems.sengoku_driver_enma_heguri,GaimItems.sengoku_driver_black_lucifer_heguri,
						GaimItems.sengoku_driver_nether_heguri,GaimItems.sengoku_driver_abyss_heguri,
						GaimItems.sengoku_driver_naraka_heguri,GaimItems.sengoku_driver_helreginn_heguri,
						GaimItems.sengoku_driver_apollyon_heguri,GaimItems.sengoku_driver_taishan_heguri,
						GaimItems.sengoku_driver_orcus_heguri,GaimItems.sengoku_driver_inferno_heguri,
						GaimItems.sengoku_driver_nokuni_heguri,GaimItems.sengoku_driver_tartarus_heguri,
						GaimItems.sengoku_driver_daimaoh_heguri,GaimItems.sengoku_driver_zetsubo_heguri,
						GaimItems.sengoku_driver_taizai_heguri,GaimItems.sengoku_driver_yomi_heguri,
						GaimItems.sengoku_driver_sin_heguri,GaimItems.sengoku_driver_hades_heguri,
						GaimItems.sengoku_driver_jigoku_heguri,GaimItems.sengoku_driver_submondo_heguri,
						GaimItems.sengoku_driver_cherry,GaimItems.sengoku_driver_dragonfruit,
						GaimItems.sengoku_driver_marron,GaimItems.sengoku_driver_peach,
						GaimItems.sengoku_driver_lychee,
						GaimItems.sengoku_driver_king_durian,GaimItems.sengoku_driver_hells};

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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == GaimItems.Gaimlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == GaimItems.Gaimtroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == GaimItems.Gaimhead){

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
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
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
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="jimbar_dragon_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
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
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (this.get_lock(armor)=="jimbar_melon_arms"||this.get_lock(armor)=="jimbar_melon_arms_zangetsu"||this.get_lock(armor)=="jimbar_melon_arms_barvo"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
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
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
									}else if (this.get_lock(armor)=="energy_melon_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
									}else if (this.get_lock(armor)=="energy_matsubokkuri_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));


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
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
									}else if (this.get_lock(armor)=="blood_orange_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="yomotsu_heguri_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
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
	/**else if (this.get_lock(armor)=="wizard_arms"){


			return itemIconwizard;
		}else if (this.get_lock(armor)=="fourze_arms"){


			return itemIconfourze;
		}else if (this.get_lock(armor)=="ooo_arms"){


			return itemIconooo;
		}else if (this.get_lock(armor)=="w_arms"){


			return itemIcon_w;
		}else if (this.get_lock(armor)=="decade_arms"){


			return itemIcondecade;
		}else if (this.get_lock(armor)=="rider_ichigo_arms"){


			return itemIconrider_ichigo;
		}



	}
	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}


	/**
@Override
public IIcon getIcon(ItemStack stack, int renderPass){



	if (renderPass==0){
		if ( DRIVER==0){

			if (this.RIDER=="ryugen"&this.get_lock(stack)=="yomotsu_heguri_arms"){
				return itemIconsengoku_driver_ryugen_yomi;
			}else if (this.RIDER=="zangetsu"&this.get_lock(stack)=="watermelon_arms"){
				return itemIconsengoku_driver_zangetsu_watermelon;
			}else{
				return itemIcon;
			}
		}else{
			return itemIcongenesis;
		}
	}else{
		if (this.get_lock(stack)=="matsubokkuri_arms"){


			return itemIconmatsubokkuri;
		}else if (this.get_lock(stack)=="watermelon_arms"){


			return itemIconwatermelon;
		}else if (this.get_lock(stack)=="kurumi_arms"){


			return itemIconkurumi;
		}else if (this.get_lock(stack)=="donguri_arms"){


			return itemIcondonguri;
		}else if (this.get_lock(stack)=="melon_arms"){


			return itemIconmelon;
		}else if (this.get_lock(stack)=="pine_arms"){


			return itemIconpine;
		}else if (this.get_lock(stack)=="ichigo_arms"){


			return itemIconichigo;
		}else if (this.get_lock(stack)=="banana_arms"){


			return itemIconbanana;
		}else if (this.get_lock(stack)=="budou_arms"){


			return itemIconbudou;
		}else if (this.get_lock(stack)=="mango_arms"){


			return itemIconmango;
		}else if (this.get_lock(stack)=="durian_arms"){


			return itemIcondurian;
		}else if (this.get_lock(stack)=="kiwi_arms"){


			return itemIconkiwi;
		}else if (this.get_lock(stack)=="jimbar_lemon_arms"){


			return itemIconjinba_lemon;
		}else if (this.get_lock(stack)=="jimbar_cherry_arms"){


			return itemIconjinba_cherry;
		}else if (this.get_lock(stack)=="jimbar_peach_arms"){


			return itemIconjinba_peach;
		}else if (this.get_lock(stack)=="jimbar_melon_arms"){
			return itemIconjinba_melon;
		}else if (this.get_lock(stack)=="jimbar_marron_arms"){
			return itemIconjinba_marron;
		}else if (this.get_lock(stack)=="jimbar_black_arms"){
			return itemIconjinba_dark;
		}else if (this.get_lock(stack)=="blood_zakuro_arms"){
			return itemIconblood_zakuro;
		}else if (this.get_lock(stack)=="kachidoki_arms"){
			return itemIconkachidoki;

		}else if (this.get_lock(stack)=="energy_lemon_arms"){


			return itemIcongenesis_lemon;
		}else if (this.get_lock(stack)=="energy_dragon_fruits_arms"||this.get_lock(stack)=="energy_prototype_dragon_fruits_arms"){


			return itemIcongenesis_dragon;
		}else if (this.get_lock(stack)=="energy_cherry_arms"){


			return itemIcongenesis_cherry;
		}else if (this.get_lock(stack)=="energy_peach_arms"){


			return itemIcongenesis_peach;
		}else if (this.get_lock(stack)=="energy_melon_arms"){
			return itemIcongenesis_melon;
		}else if (this.get_lock(stack)=="energy_matsubokkuri_arms"){
			return itemIcongenesis_matsubokkuri;
		}
		else if (this.get_lock(stack)=="orange_arms"){


			return itemIconorange;
		}else if (this.get_lock(stack)=="fresh_orange_arms"){


			return itemIconorangefr;
		}else if (this.get_lock(stack)=="kiwami_arms"){


			return itemIconKiwami;
		}else if (this.get_lock(stack)=="blood_orange_arms"){


			return itemIconblood_orange;
		}else if (this.get_lock(stack)=="yomotsu_heguri_arms"){


			return itemIconyomotsu_heguri;
		}else if (this.get_lock(stack)=="fifteen_arms"){


			return itemIconfifteen;
		}else if (this.get_lock(stack)=="golden_arms"){


			return itemIcongolden;
		}else if (this.get_lock(stack)=="silver_arms"){


			return itemIconsilver;
		}else if (this.get_lock(stack)=="darkness_arms"){


			return itemIcondarkness;
		}else if (this.get_lock(stack)=="baron_ringo_arms"||this.get_lock(stack)=="ringo_arms"){


			return itemIconringo;
		}else if (this.get_lock(stack)=="wizard_arms"){


			return itemIconwizard;
		}else if (this.get_lock(stack)=="fourze_arms"){


			return itemIconfourze;
		}else if (this.get_lock(stack)=="ooo_arms"){


			return itemIconooo;
		}else if (this.get_lock(stack)=="w_arms"){


			return itemIcon_w;
		}else if (this.get_lock(stack)=="decade_arms"){


			return itemIcondecade;
		}else if (this.get_lock(stack)=="drive_arms"){


			return itemIcondrive;
		}else if (this.get_lock(stack)=="rider_ichigo_arms"){


			return itemIconrider_ichigo;
		}else if (this.get_lock(stack)=="lemon_arms"){


			return itemIconlemon;
		}else if (this.get_lock(stack)=="suika_arms"){

			return itemIconsuika;
		}else if (this.get_lock(stack)=="black_baron_arms"){

			return itemIconblack_baron;



		else {
			if ( DRIVER==0){


				return itemIcon;
			}else{

				return itemIcongenesis;
			}


		}

	}

}
	 **/

}