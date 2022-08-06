package Kamen_Rider_Craft_4TH.item.gaim;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.GaimItems;
import Kamen_Rider_Craft_4TH.RiderItems;
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
	public static String[] ARMS= new String[] {"","matsubokkuri_arms","kurumi_arms", "donguri_arms","melon_arms","pine_arms", "ichigo_arms", "orange_arms", "banana_arms", "budou_arms", "mango_arms", "durian_arms", "kiwi_arms", "energy_lemon_arms", "energy_cherry_arms", "energy_peach_arms", "energy_melon_arms","jimbar_lemon_arms","jimbar_cherry_arms","jimbar_peach_arms","jimbar_melon_arms", "energy_matsubokkuri_arms", "kachidoki_arms", "kiwami_arms", "yomotsu_heguri_arms", "blood_orange_arms", "fifteen_arms", "golden_arms", "silver_arms", "darkness_arms", "watermelon_arms", "ringo_arms","baron_ringo_arms","jimbar_black_arms", "wizard_arms", "fourze_arms", "ooo_arms", "w_arms", "decade_arms", "rider_ichigo_arms","suika_arms","lemon_arms","energy_dragon_fruits_arms","energy_prototype_dragon_fruits_arms","fresh_orange_arms","drive_arms","jimbar_marron_arms","blood_zakuro_arms","kuuga_arms","agito_arms","ryuki_arms","faiz_arms","blade_arms","hibiki_arms","kabuto_arms","den_o_arms","kiva_arms","gaim_arms","kabi_orange_arms","maja_arms","jimbar_dragon_arms","jimbar_melon_arms_zangetsu","jimbar_melon_arms_barvo","natsumikan_arms","black_baron_arms", "zangetsu_kachidoki_arms","haljo_heguri_arms","diyu_heguri_arms","lucifer_heguri_arms","silver_lucifer_arms","golden_lucifer_heguri_arms","proto_nokuni_heguri_arms","enma_heguri_arms","black_lucifer_heguri_arms","nether_heguri_arms","abyss_heguri_arms","naraka_heguri_arms","helreginn_heguri_arms","apollyon_heguri_arms","taishan_heguri_arms","orcus_heguri_arms","inferno_heguri_arms","nokuni_heguri_arms","tartarus_heguri_arms","daimaoh_heguri_arms","zetsubo_heguri_arms","taizai_heguri_arms","yomi_heguri_arms","sin_heguri_arms","hades_heguri_arms","jigoku_heguri_arms","submondo_heguri_arms","cherry_arms","dragonfruit_arms","marron_arms","peach_arms","lychee_arms","king_durian_arms","hells_arms"
												,"kurumi_energy_arms","donguri_energy_arms","pine_energy_arms","ichigo_energy_arms","orange_energy_arms","banana_energy_arms","budou_energy_arms","suika_energy_arms","mango_energy_arms","durian_energy_arms","kiwi_energy_arms","blood_orange_energy_arms","fifteen_energy_arms","golden_ringo_energy_arms","silver_ringo_energy_arms","black_ringo_energy_arms","watermelon_energy_arms","forbidden_ringo_energy_arms","zakuro_energy_arms","maja_energy_arms","lychee_energy_arms","king_durian_energy_arms","hells_energy_arms","ryugen_kachidoki_arms","baron_kachidoki_arms","barvo_kachidoki_arms","gridon_kachidoki_arms","kurokage_kachidoki_arms","knuckle_kachidoki_arms","duke_kachidoki_arms","sigurd_kachidoki_arms","marika_kachidoki_arms","tyrant_kachidoki_arms","savior_kachidoki_arms","fifteen_kachidoki_arms","maja_kachidoki_arms","mars_kachidoki_arms","kamuro_kachidoki_arms","jam_kachidoki_arms","sylphi_kachidoki_arms","dark_kurumi_energy_arms","dark_donguri_energy_arms","dark_pine_energy_arms","dark_ichigo_energy_arms","dark_orange_energy_arms","dark_banana_energy_arms","dark_budou_energy_arms","dark_suika_energy_arms","dark_mango_energy_arms","dark_durian_energy_arms","dark_kiwi_energy_arms","dark_blood_orange_energy_arms","dark_fifteen_energy_arms","dark_golden_ringo_energy_arms","dark_silver_ringo_energy_arms","dark_black_ringo_energy_arms","dark_forbidden_ringo_energy_arms","dark_zakuro_energy_arms","dark_maja_energy_arms","dark_king_durian_energy_arms","dark_lychee_energy_arms","dark_hells_energy_arms","dark_peach_energy_arms","dark_cherry_energy_arms","dark_kurumi_arms","dark_donguri_arms","dark_pine_arms","dark_ichigo_arms","dark_banana_arms","dark_budou_arms","dark_suika_arms","dark_mango_arms","dark_durian_arms",
												"dark_kiwi_arms","dark_blood_orange_arms","dark_fifteen_arms","dark_golden_ringo_arms","dark_silver_ringo_arms","dark_black_ringo_arms","dark_forbidden_ringo_arms","dark_zakuro_arms","dark_maja_arms","dark_king_durian_arms","dark_lychee_arms","dark_hells_arms","dark_peach_arms","dark_cherry_arms","dark_lemon_arms"};

	public static final String[] CoreName= new String[] {"gaim","gaim_jimbar","gaim_kachidoki","gaim_kiwami","gaim_yami", "gaim_fresh","gaim_drive"};





	public item_Gaimdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, String lock, int driver,Item difLock)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,RiderItems.Gaimhead, RiderItems.Gaimtroso, RiderItems.Gaimlegs);
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
					
				}else if (this.RIDER=="zangetsu"&this.get_lock(stack)=="yomi_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_zangetsu_yomi);

				}else if (this.RIDER=="gaim"&this.get_lock(stack)=="daimaoh_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_gaim_yomi);
					
				}else if (this.RIDER=="baron"&this.get_lock(stack)=="tartarus_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_baron_yomi);
					
				}else if (this.RIDER=="barvo"&this.get_lock(stack)=="orcus_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_barvo_yomi);
					
				}else if (this.RIDER=="gridon"&this.get_lock(stack)=="sin_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_gridon_yomi);
					
				}else if (this.RIDER=="kurokage"&this.get_lock(stack)=="jigoku_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_kurokage_yomi);
					
				}else if (this.RIDER=="knuckle"&this.get_lock(stack)=="hades_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_knuckle_yomi);
					
				}else if (this.RIDER=="sengoku_duke"&this.get_lock(stack)=="nether_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_duke_yomi);
					
				}else if (this.RIDER=="sengoku_sigurd"&this.get_lock(stack)=="helreginn_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_sigurd_yomi);
					
				}else if (this.RIDER=="sengoku_marika"&this.get_lock(stack)=="naraka_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_marika_yomi);
					
				}else if (this.RIDER=="sengoku_tyrant"&this.get_lock(stack)=="diyu_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_tyrant_yomi);
					
				}else if (this.RIDER=="savior"&this.get_lock(stack)=="enma_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_savior_yomi);
					
				}else if (this.RIDER=="fifteen"&this.get_lock(stack)=="yomotsu_dokuro_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_fifteen_yomi);
					
				}else if (this.RIDER=="maja"&this.get_lock(stack)=="daimaoh_dokuro_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_maja_yomi);
					
				}else if (this.RIDER=="mars"&this.get_lock(stack)=="golden_lucifer_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_mars_yomi);
					
				}else if (this.RIDER=="kamuro"&this.get_lock(stack)=="silver_lucifer_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_kamuro_yomi);
					
				}else if (this.RIDER=="jam"&this.get_lock(stack)=="black_lucifer_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_jam_yomi);
					
				}else if (this.RIDER=="idunn"&this.get_lock(stack)=="forbidden_lucifer_heguri_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_idunn_yomi);
					
				}else if (this.RIDER=="ryugen"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_ryugen_watermelon);

				}else if (this.RIDER=="zangetsu"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_zangetsu_watermelon);
					
				}else if (this.RIDER=="gaim"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_gaim_watermelon);

				}else if (this.RIDER=="baron"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_baron_watermelon);
					
				}else if (this.RIDER=="barvo"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_barvo_watermelon);
					
				}else if (this.RIDER=="gridon"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_gridon_watermelon);
					
				}else if (this.RIDER=="sengoku_duke"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_duke_watermelon);
					
				}else if (this.RIDER=="kurokage"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_kurokage_watermelon);
					
				}else if (this.RIDER=="knuckle"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_knuckle_watermelon);
					
				}else if (this.RIDER=="sengoku_sigurd"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_sigurd_watermelon);
					
				}else if (this.RIDER=="sengoku_marika"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_marika_watermelon);
					
				}else if (this.RIDER=="sengoku_tyrant"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_tyrant_watermelon);
					
				}else if (this.RIDER=="fifteen"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_fifteen_watermelon);
					
				}else if (this.RIDER=="maja"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_maja_watermelon);
					
				}else if (this.RIDER=="savior"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_savior_watermelon);
					
				}else if (this.RIDER=="mars"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_mars_watermelon);
					
				}else if (this.RIDER=="kamuro"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_kamuro_watermelon);
					
				}else if (this.RIDER=="jam"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_jam_watermelon);
					
				}else if (this.RIDER=="idunn"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_idunn_watermelon);
					
				}else if (this.RIDER=="sylphi"&this.get_lock(stack)=="watermelon_arms"){
					armorModel.belt = new ItemStack(GaimItems.sengoku_driver_sylphi_watermelon);
				}else{
					armorModel.belt=stack;
				}

				Item[] LOCK= new Item[] {GaimItems.himawari_lockseed,GaimItems.sengoku_driver_matsubokkuri
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
						GaimItems.sengoku_driver_lychee,GaimItems.sengoku_driver_king_durian,
						GaimItems.sengoku_driver_hells,GaimItems.sengoku_driver_kurumi_energy,
						GaimItems.sengoku_driver_donguri_energy,GaimItems.sengoku_driver_pine_energy,
						GaimItems.sengoku_driver_ichigo_energy,GaimItems.sengoku_driver_orange_energy,
						GaimItems.sengoku_driver_banana_energy,GaimItems.sengoku_driver_budou_energy,
						GaimItems.sengoku_driver_suika_energy,GaimItems.sengoku_driver_mango_energy,
						GaimItems.sengoku_driver_durian_energy,GaimItems.sengoku_driver_kiwi_energy,
						GaimItems.sengoku_driver_blood_orange_energy,GaimItems.sengoku_driver_fifteen_lock_energy,
						GaimItems.sengoku_driver_golden_ringo_energy,GaimItems.sengoku_driver_silver_ringo_energy,
						GaimItems.sengoku_driver_black_ringo_energy,GaimItems.sengoku_driver_watermelon_energy,
						GaimItems.sengoku_driver_forbidden_ringo_energy,GaimItems.sengoku_driver_zakuro_energy,
						GaimItems.sengoku_driver_maja_lock_energy,GaimItems.sengoku_driver_lychee_energy,
						GaimItems.sengoku_driver_king_durian_energy,GaimItems.sengoku_driver_hells_energy,
						GaimItems.sengoku_driver_ryugen_kachidoki,GaimItems.sengoku_driver_baron_kachidoki,
						GaimItems.sengoku_driver_barvo_kachidoki,GaimItems.sengoku_driver_gridon_kachidoki,
						GaimItems.sengoku_driver_kurokage_kachidoki,GaimItems.sengoku_driver_knuckle_kachidoki,
						GaimItems.sengoku_driver_duke_kachidoki,GaimItems.sengoku_driver_sigurd_kachidoki,
						GaimItems.sengoku_driver_marika_kachidoki,GaimItems.sengoku_driver_tyrant_kachidoki,
						GaimItems.sengoku_driver_savior_kachidoki,GaimItems.sengoku_driver_fifteen_kachidoki,
						GaimItems.sengoku_driver_maja_kachidoki,GaimItems.sengoku_driver_mars_kachidoki,
						GaimItems.sengoku_driver_kamuro_kachidoki,GaimItems.sengoku_driver_jam_kachidoki,
						GaimItems.sengoku_driver_idunn_kachidoki,GaimItems.sengoku_driver_sylphi_kachidoki,
						GaimItems.sengoku_driver_dark_kurumi_energy,GaimItems.sengoku_driver_dark_donguri_energy,
						GaimItems.sengoku_driver_dark_pine_energy,GaimItems.sengoku_driver_dark_ichigo_energy,
						GaimItems.sengoku_driver_dark_orange_energy,GaimItems.sengoku_driver_dark_banana_energy,
						GaimItems.sengoku_driver_dark_budou_energy,GaimItems.sengoku_driver_dark_suika_energy,
						GaimItems.sengoku_driver_dark_mango_energy,GaimItems.sengoku_driver_dark_durian_energy,
						GaimItems.sengoku_driver_dark_kiwi_energy,GaimItems.sengoku_driver_dark_blood_orange_energy,
						GaimItems.sengoku_driver_dark_fifteen_energy,GaimItems.sengoku_driver_dark_golden_ringo_energy,
						GaimItems.sengoku_driver_dark_silver_ringo_energy,GaimItems.sengoku_driver_dark_black_ringo_energy,
						GaimItems.sengoku_driver_dark_forbidden_ringo_energy,GaimItems.sengoku_driver_dark_zakuro_energy,
						GaimItems.sengoku_driver_dark_maja_energy,GaimItems.sengoku_driver_dark_lychee_energy,
						GaimItems.sengoku_driver_dark_king_durian_energy,GaimItems.sengoku_driver_dark_hells_energy,
						GaimItems.sengoku_driver_dark_peach_energy,GaimItems.sengoku_driver_dark_cherry_energy,
						GaimItems.sengoku_driver_dark_kurumi,GaimItems.sengoku_driver_dark_donguri,
						GaimItems.sengoku_driver_dark_pine,GaimItems.sengoku_driver_dark_ichigo,
						GaimItems.sengoku_driver_dark_banana,
						GaimItems.sengoku_driver_dark_budou,GaimItems.sengoku_driver_dark_suika,
						GaimItems.sengoku_driver_dark_mango,GaimItems.sengoku_driver_dark_durian,
						GaimItems.sengoku_driver_dark_kiwi,GaimItems.sengoku_driver_dark_blood_orange,
						GaimItems.sengoku_driver_dark_fifteen,GaimItems.sengoku_driver_dark_golden_ringo,
						GaimItems.sengoku_driver_dark_silver_ringo,GaimItems.sengoku_driver_dark_black_ringo,
						GaimItems.sengoku_driver_dark_forbidden_ringo,GaimItems.sengoku_driver_dark_zakuro,
						GaimItems.sengoku_driver_dark_maja,GaimItems.sengoku_driver_dark_lychee,
						GaimItems.sengoku_driver_dark_king_durian,GaimItems.sengoku_driver_dark_hells,
						GaimItems.sengoku_driver_dark_peach,GaimItems.sengoku_driver_dark_cherry,
						GaimItems.sengoku_driver_dark_lemon};

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


									if (this.get_lock(armor)=="matsubokkuri_arms"||this.get_lock(armor)=="dark_matsubokkuri_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

									}
									else if (this.get_lock(armor)=="kurumi_arms"||this.get_lock(armor)=="dark_kurumi_arms"){

										if (player.getHeldItemMainhand().isEmpty())
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));

										}
									}else if (this.get_lock(armor)=="kurumi_energy_arms"||this.get_lock(armor)=="dark_kurumi_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1, true, false));
										if (player.getHeldItemMainhand().isEmpty())
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 8,true,false));

										}

									}else if (this.get_lock(armor)=="donguri_arms"||this.get_lock(armor)=="dark_doguri_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));

									}else if (this.get_lock(armor)=="donguri_energy_arms"||this.get_lock(armor)=="dark_donguri_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));

									}else if (this.get_lock(armor)=="melon_arms"||this.get_lock(armor)=="dark_melon_arms"){


										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));

									}else if (this.get_lock(armor)=="pine_arms"||this.get_lock(armor)=="dark_pine_arms"){


										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									
									}else if (this.get_lock(armor)=="pine_energy_arms"||this.get_lock(armor)=="dark_pine_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									
									}else if (this.get_lock(armor)=="ichigo_arms"||this.get_lock(armor)=="dark_ichigo_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="ichigo_energy_arms"||this.get_lock(armor)=="dark_ichigo_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));

									}else if (this.get_lock(armor)=="banana_arms"||this.get_lock(armor)=="dark_banana_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="banana_energy_arms"||this.get_lock(armor)=="dark_banana_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="budou_arms"||this.get_lock(armor)=="dark_budou_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="budou_energy_arms"||this.get_lock(armor)=="dark_budou_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="mango_arms"||this.get_lock(armor)=="dark_mango_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="mango_energy_arms"||this.get_lock(armor)=="dark_mango_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="durian_arms"||this.get_lock(armor)=="dark_durian_energy_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="durian_energy_arms"||this.get_lock(armor)=="dark_durian_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="kiwi_arms"||this.get_lock(armor)=="dark_kiwi_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="kiwi_energy_arms"||this.get_lock(armor)=="dark_kiwi_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));

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
										
									}else if (this.get_lock(armor)=="watermelon_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										
									}else if (this.get_lock(armor)=="jimbar_melon_arms"||this.get_lock(armor)=="jimbar_melon_arms_zangetsu"||this.get_lock(armor)=="jimbar_melon_arms_barvo"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}else if (this.get_lock(armor)=="kachidoki_arms"||this.get_lock(armor)=="zangetsu_kachidoki_arms"||this.get_lock(armor)=="kurokage_kachidoki_arms"||this.get_lock(armor)=="gridon_kachidoki_arms"||this.get_lock(armor)=="knuckle_kachidoki_arms"||this.get_lock(armor)=="barvo_kachidoki_arms"||this.get_lock(armor)=="ryugen_kachidoki_arms"||this.get_lock(armor)=="baron_kachidoki_arms"||this.get_lock(armor)=="duke_kachidoki_arms"||this.get_lock(armor)=="sigurd_kachidoki_arms"||this.get_lock(armor)=="marika_kachidoki_arms"||this.get_lock(armor)=="tyrant_kachidoki_arms"||this.get_lock(armor)=="fifteen_kachidoki_arms"||this.get_lock(armor)=="maja_kachidoki_arms"||this.get_lock(armor)=="mars_kachidoki_arms"||this.get_lock(armor)=="kamuro_kachidoki_arms"||this.get_lock(armor)=="jam_kachidoki_arms"||this.get_lock(armor)=="idunn_kachidoki_arms"||this.get_lock(armor)=="sylphi_kachidoki_arms"||this.get_lock(armor)=="bujin_gaim_kachidoki_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));

									}else if (this.get_lock(armor)=="energy_lemon_arms"||this.get_lock(armor)=="dark_lemon_energy_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));
									}else if (this.get_lock(armor)=="lemon_arms"||this.get_lock(armor)=="dark_lemon_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));
									}else if (this.get_lock(armor)=="energy_dragon_fruits_arms"||this.get_lock(armor)=="energy_prototype_dragon_fruits_arms"||this.get_lock(armor)=="dark_dragonfruit_energy_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										
									}else if (this.get_lock(armor)=="dragon_fruits_arms"||this.get_lock(armor)=="dark_dragonfruit_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="energy_cherry_arms"||this.get_lock(armor)=="dark_cherry_energy_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="cherry_arms"||this.get_lock(armor)=="dark_cherry_arms") {
										player.addPotionEffect(new PotionEffect (MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="energy_peach_arms"||this.get_lock(armor)=="dark_peach_energy_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										
									}else if (this.get_lock(armor)=="peach_arms"||this.get_lock(armor)=="dark_peach_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="marron_arms"||this.get_lock(armor)=="dark_marron_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="energy_melon_arms"||this.get_lock(armor)=="dark_melon_energy_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
									}else if (this.get_lock(armor)=="energy_matsubokkuri_arms"||this.get_lock(armor)=="dark_matsubokkuri_energy_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));


									}else if (this.get_lock(armor)=="orange_arms"||this.get_lock(armor)=="natsumikan_arms"||this.get_lock(armor)=="dark_orange_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="orange_energy_arms"||this.get_lock(armor)=="dark_orange_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));

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
									}else if (this.get_lock(armor)=="blood_orange_arms"||this.get_lock(armor)=="dark_blood_orange_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="blood_orange_energy_arms"||this.get_lock(armor)=="dark_blood_orange_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="yomotsu_heguri_arms"||this.get_lock(armor)=="tartarus_heguri_arms"||this.get_lock(armor)=="nokuni_heguri_arms"||this.get_lock(armor)=="inferno_heguri_arms"||this.get_lock(armor)=="orcus_heguri_arms"||this.get_lock(armor)=="taishan_heguri_arms"||this.get_lock(armor)=="enma_heguri_arms"||this.get_lock(armor)=="haljo_heguri_arms"||this.get_lock(armor)=="daimaoh_heguri_arms"||this.get_lock(armor)=="apollyon_heguri_arms"||this.get_lock(armor)=="golden_lucifer_heguri_arms"||this.get_lock(armor)=="silver_lucifer_heguri_arms"||this.get_lock(armor)=="black_lucifer_heguri_arms"||this.get_lock(armor)=="forbidden_lucifer_heguri_arms"||this.get_lock(armor)=="infra_heguri_arms"||this.get_lock(armor)=="nether_heguri_arms"||this.get_lock(armor)=="naraka_heguri_arms"||this.get_lock(armor)=="yomi_heguri_arms"||this.get_lock(armor)=="abyss_heguri_arms"||this.get_lock(armor)=="diyu_heguri_arms"||this.get_lock(armor)=="submondo_heguri_arms"||this.get_lock(armor)=="jigoku_heguri_arms"||this.get_lock(armor)=="hades_heguri_arms"||this.get_lock(armor)=="sin_heguri_arms"||this.get_lock(armor)=="taizai_heguri_arms"||this.get_lock(armor)=="zetsubo_heguri_arms"||this.get_lock(armor)=="daimaoh_heguri_arms"||this.get_lock(armor)=="yomotsu_dokuro_arms"||this.get_lock(armor)=="helreginn_heguri_arms"||this.get_lock(armor)=="proto_nokuni_heguri_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 5,true,false));
									}else if (this.get_lock(armor)=="fifteen_arms"||this.get_lock(armor)=="maja_arms"||this.get_lock(armor)=="dark_fifteen_arms"||this.get_lock(armor)=="dark_maja_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="fifteen_energy_arms"||this.get_lock(armor)=="maja_energy_arms"||this.get_lock(armor)=="dark_fifteen_energy_arms"||this.get_lock(armor)=="dark_maja_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect (MobEffects.SPEED,5, 2,true,false));
										
									}else if (this.get_lock(armor)=="golden_arms"||this.get_lock(armor)=="dark_golden_ringo_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="golden_energy_arms"||this.get_lock(armor)=="dark_golden_ringo_arms") {	
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect (MobEffects.SPEED, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="darkness_arms"||this.get_lock(armor)=="dark_black_ringo_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
										
									}else if (this.get_lock(armor)=="black_ringo_energy_arms"||this.get_lock(armor)=="dark_black_ringo_energy_arms") {	
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect (MobEffects.SPEED, 5, 3,true,false));
										
									}else if (this.get_lock(armor)=="ringo_arms"||this.get_lock(armor)=="baron_ringo_arms"||this.get_lock(armor)=="dark_forbidden_ringo_arms"){

										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="ringo_energy_arms"||this.get_lock(armor)=="dark_forbidden_ringo_energy_arms") {	
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect (MobEffects.SPEED, 5, 3,true,false));
											
									}else if (this.get_lock(armor)=="silver_arms"||this.get_lock(armor)=="dark_silver_ringo_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="silver_ringo_energy_arms"||this.get_lock(armor)=="dark_silver_ringo_energy_arms") {	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect (MobEffects.SPEED, 5, 1,true,false));
											
									}else if (this.get_lock(armor)=="blood_zakuro_arms"||this.get_lock(armor)=="dark_zakuro_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 5, 0,true,false));
										
									}else if (this.get_lock(armor)=="zakuro_energy_arms"||this.get_lock(armor)=="dark_zakuro_energy_arms") {
										player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect (MobEffects.SPEED, 5, 1,true,false));
										
									}else if (this.get_lock(armor)=="suika_arms"||this.get_lock(armor)=="dark_suika_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
										
									}else if (this.get_lock(armor)=="suika_energy_arms"||this.get_lock(armor)=="dark_suika_energy_arms") {	
										player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE,5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect (MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false));
										
									
										

									}else if (this.get_lock(armor)=="black_baron_arms"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));

									}
								}}}}}}}}

	public  boolean rendModle(Entity entity, int num)
	{
		if (num==2||num==5||num==7||num==1||num==3||num==6||num==8){
			return true;
		}else if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					 if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){

						return true;
					} else{
						return false;

					}
				
				}else{
					return false;
				}
			}else{
				return false;
			}

		}
		return false;

	}
	public  String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if (num==2||num==5||num==3||num==6||num==8||num==12){


						if (belt.Rider == "ryugen"){
							
							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="yomotsu_heguri_arms"){
							
								return Refercence.MODID+":textures/armor/"+ "ryugen_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jimbar_dragon_arms"){

								return Refercence.MODID+":textures/armor/"+ "ryugen_jimber" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "ryugen" +".png";
							}else if (belt.Rider == "barvo"){

								if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jimbar_melon_arms_barvo"){

									return Refercence.MODID+":textures/armor/"+ "barvo_jimber" +".png";
								}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
									return Refercence.MODID+":textures/armor/"+ "barvo_king" +".png";
								}else
									return Refercence.MODID+":textures/armor/"+ "barvo" +".png";
							}else if (belt.Rider == "zangetsu"){

								if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="zangetsu_kachidoki_arms"){

									return Refercence.MODID+":textures/armor/"+ "zangetsu_kachidoki" +".png";
								}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

									return Refercence.MODID+":textures/armor/"+ "zangetsu_watermelon" +".png";
								}else
									return Refercence.MODID+":textures/armor/"+ "zangetsu" +".png";
							}else if (belt.Rider == "duke"){

								if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="energy_dragon_fruits_arms"){

									return Refercence.MODID+":textures/armor/"+ "duke_hex" +".png";
								}else
									return Refercence.MODID+":textures/armor/"+ "duke" +".png";
								
							}
						
						if (belt.Rider == "gaim"){
							return Refercence.MODID+":textures/armor/"+ CoreName[item_Gaimdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
						
						}else{
							
								return Refercence.MODID+":textures/armor/"+ belt.Rider +".png";

						}
						

					}else if (num==1||num==13||num==11||num==10){


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
							return Refercence.MODID+":textures/armor/blank"+ext;
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
							return Refercence.MODID+":textures/armor/blank"+ext;
						}
						}
					}else{
						return Refercence.MODID+":textures/armor/blank"+ext;

					}
				}else{
					return Refercence.MODID+":textures/armor/blank"+ext;
				}
			}else{
				return Refercence.MODID+":textures/armor/blank"+ext;
			}

		}
		return Refercence.MODID+":textures/armor/blank"+ext;

	}

	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.himawari_lockseed == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}




}