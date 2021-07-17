package Kamen_Rider_Craft_4TH.item.gaim;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikiarmor2;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikidriver;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Gaimarmor extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"gaim","gaim_jimbar","gaim_kachidoki","gaim_kiwami","gaim_yami", "gaim_fresh","gaim_drive","gaim_yami","gaim_watermelon","gaim_king","gaim_lychee"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Gaimarmor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;

		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_Gaimdriver){
	
					 
					item_Gaimdriver belt = (item_Gaimdriver) player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
					if (belt.RIDER == "ryugen"){
						
						if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="yomotsu_heguri_arms"){
						
							return Refercence.MODID+":textures/armor/"+ "ryugen_yomi" +".png";
						}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jimbar_dragon_arms"){

							return Refercence.MODID+":textures/armor/"+ "ryugen_jimber" +".png";
						}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){
							
							return Refercence.MODID+":textures/armor/"+"ryugen_watermelon" +".png";
						}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="ryugen_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "ryugen_kachidoki" +".png";
						}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
							return Refercence.MODID+":textures/armor/"+ "ruygen_king" +".png";
						}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

							return Refercence.MODID+":textures/armor/"+ "ryugen_lychee" +".png";
						}else
							return Refercence.MODID+":textures/armor/"+ "ryugen" +".png";
						}else if (belt.RIDER == "barvo"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jimbar_melon_arms_barvo"){

								return Refercence.MODID+":textures/armor/"+ "barvo_jimber" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){
								
								return Refercence.MODID+":textures/armor/"+"barvo_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="orcus_heguri_arms"){
									
									return Refercence.MODID+":textures/armor/"+ "barvo_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="barvo_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "barvo_kachidoki" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "barvo_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "barvo_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "barvo" +".png";
						}else if (belt.RIDER == "zangetsu"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="zangetsu_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "zangetsu_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "zangetsu_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="yomi_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "zangetsu_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "zangetsu_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "zangetsu_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "zangetsu" +".png";
						}else if (belt.RIDER == "duke"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="energy_dragon_fruits_arms"){

								return Refercence.MODID+":textures/armor/"+ "duke_hex" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "duke" +".png";
						}else if (belt.RIDER == "baron"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="baron_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "baron_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "baron_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="tartarus_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "baron_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "baron_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "baron_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "baron" +".png";
						}else if (belt.RIDER == "gridon"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="gridon_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "gridon_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "gridon_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="sin_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "gridon_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "gridon_king" +".png";

							}else
								return Refercence.MODID+":textures/armor/"+ "gridon" +".png";
						}else if (belt.RIDER == "kurokage"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="kurokage_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "kurokage_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "kurokage_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jigoku_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "kurokage_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "kurokage_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "kurokage_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "kurokage" +".png";
						}else if (belt.RIDER == "knuckle"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="knuckle_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "knuckle_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "knuckle_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="hades_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "knuckle_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "knuckle_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "knuckle_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "knuckle" +".png";
						}else if (belt.RIDER == "mars"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="mars_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "mars_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "mars_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="golden_lucifer_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "mars_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "mars_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "mars_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "mars" +".png";
						}else if (belt.RIDER == "kamuro"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="kamuro_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "kamuro_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "kamuro_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="silver_lucifer_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "kamuro_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "kamuro_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "kamuro_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "kamuro" +".png";
						}else if (belt.RIDER == "jam"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jam_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "jam_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "jam_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="black_lucifer_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "jam_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "jam_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "jam_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "jam" +".png";
						}else if (belt.RIDER == "idunn"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="idunn_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "idunn_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "idunn_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lucifer_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "idunn_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "idunn_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "idunn_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "idunn" +".png";
						}else if (belt.RIDER == "savior"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="savior_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "savior_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "savior_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="enma_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "savior_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "savior_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "savior_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "savior" +".png";
						}else if (belt.RIDER == "fifteen"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="fifteen_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "fifteen_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "fifteen_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="yomotsu_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "fifteen_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "fifteen_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "fifteen_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "fifteen" +".png";
						}else if (belt.RIDER == "maja"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="maja_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "maja_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "maja_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="daimaoh_dokuro_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "maja_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "maja_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "maja_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "maja" +".png";
						}else if (belt.RIDER == "sylphi"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="sylphi_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "sylphi_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "sylphi_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="haljo_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "sylphi_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "sylphi_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "sylphi_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "sylphi" +".png";
						}else if (belt.RIDER == "sengoku_duke"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="duke_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "duke_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "duke_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="nether_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "duke_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "duke_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "duke_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "sengoku_duke" +".png";
						}else if (belt.RIDER == "sengoku_marika"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="marika_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "marika_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "marika_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="naraka_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "marika_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "marika_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

									return Refercence.MODID+":textures/armor/"+ "marika_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "sengoku_marika" +".png";
						}else if (belt.RIDER == "sengoku_sigurd"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="sigurd_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "sigurd_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "sigurd_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="helreginn_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "sigurd_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "sigurd_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

									return Refercence.MODID+":textures/armor/"+ "sigurd_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "sengoku_sigurd" +".png";
						}else if (belt.RIDER == "sengoku_tyrant"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="tyrant_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "tyrant_kachidoki" +".png";
							}else	if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "tyrant_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="diyu_heguri_arms"){
								
								return Refercence.MODID+":textures/armor/"+ "tyrant_yomi" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "tyrant_king" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

									return Refercence.MODID+":textures/armor/"+ "tyrant_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "sengoku_tyrant" +".png";
						}
					
					if (belt.RIDER == "gaim"){
						if (slot != EntityEquipmentSlot.FEET)
					{
						return Refercence.MODID+":textures/armor/"+ CoreName[item_Gaimdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
					}
					else
					{
						return Refercence.MODID+":textures/armor/blank.png";
					}
					}else{
						if ( slot != EntityEquipmentSlot.FEET)
						{
							return Refercence.MODID+":textures/armor/"+ belt.RIDER +".png";
						
						}
						else
						{
							return Refercence.MODID+":textures/armor/blank.png";
						}
					}
				}			
				else
				{
					return Refercence.MODID+":textures/armor/blank.png";


				}
			}
			else
			{
				return Refercence.MODID+":textures/armor/blank.png";


			}
		}
		else
		{
			return Refercence.MODID+":textures/armor/blank.png";


		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_Gaimarmor)
			{
				tokuArmorModel armorModel = new tokuArmorModel();

				
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
				
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.LEGS;
				
				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

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
	
	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}

}