package sspq;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sspq.blocks.custom.BlockType;
import sspq.blocks.custom.CustomBlock;
import sspq.blocks.custom.Property;
import sspq.blocks.decor_block;
import sspq.blocks.ore_block;
import sspq.item.ItemBaseShield;
import sspq.item.ItemBaseSword;
import sspq.item.Item_gun;
import sspq.item.Item_ore;
import sspq.item.lupat_ranger.item_lupat_ranger_armor;
import sspq.item.lupat_ranger.item_lupat_ranger_armor2;
import sspq.item.lupat_ranger.item_lupin_collection;
import sspq.item.lupat_ranger.item_vs_changer;
import sspq.item.rider_armor_base.item_form_change;
import sspq.item.rider_armor_base.item_rider_armor;
import sspq.item.rider_armor_base.item_rider_armor2;
import sspq.item.rider_armor_base.item_rider_driver;
import sspq.item.ryusoulger.item_ryusoul;
import sspq.item.ryusoulger.item_ryusoul_changer;
import sspq.item.ryusoulger.item_ryusoulger_armor;
import sspq.item.ryusoulger.item_ryusoulger_armor2;
import sspq.potion.PotionCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static sspq.blocks.custom.Property.TRANSPARENT;
import static sspq.blocks.custom.Property.WALKTHROUGH;
import static java.util.Objects.*;

public class RiderItems {

	public static Item blanknoitem = new Item_ore("blanknoitem");
	
	public static Item gorenger_star = new Item_ore("gorenger_star").setCreativeTab(Tabs.gorenger);
	public static Block gorenger_ore= new ore_block("gorenger_ore", Material.ROCK, gorenger_star, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.gorenger);
	
	public static Item blank_ranger_key = new Item_ore("blank_ranger_key").setCreativeTab(Tabs.gokaiger);
	public static Block gokaiger_ore= new ore_block("gokaiger_ore", Material.ROCK, blank_ranger_key, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.gokaiger);
	
	public static Item empty_zyudenchi = new Item_ore("empty_zyudenchi").setCreativeTab(Tabs.kyoryuger);
	public static Block kyoryuger_ore= new ore_block("kyoryuger_ore", Material.ROCK, empty_zyudenchi, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.kyoryuger);
	
	public static Item empty_brave_zyudenchi = new Item_ore("empty_brave_zyudenchi").setCreativeTab(Tabs.kyoryuger_brave);
	public static Block kyoryuger_brave_ore= new ore_block("kyoryuger_brave_ore", Material.ROCK, empty_brave_zyudenchi, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item lupinranger_badge = new Item_ore("lupinranger_badge").setCreativeTab(Tabs.lupinranger);
	public static Block lupinranger_ore= new ore_block("lupinranger_ore", Material.ROCK, lupinranger_badge, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.lupinranger);
	
	public static Item patranger_badge = new Item_ore("patranger_badge").setCreativeTab(Tabs.patranger);
	public static Block patranger_ore= new ore_block("patranger_ore", Material.ROCK, patranger_badge, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.patranger);
	
	public static Item blank_ryusoul = new Item_ore("blank_ryusoul").setCreativeTab(Tabs.ryusoulger);
	public static Block ryusoulger_ore= new ore_block("ryusoulger_ore", Material.ROCK, blank_ryusoul, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.ryusoulger);
	
	public static Item gorengerhead = new item_rider_armor("gorengerhead","gorenger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorengertroso = new item_rider_armor2("gorengertroso","gorenger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorengerlegs = new item_rider_armor2("gorengerlegs","gorenger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	
	public static Item gorenger_belt_akarenger = new item_rider_driver("gorenger_belt_akarenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "akarenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_aorenger = new item_rider_driver("gorenger_belt_aorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "aorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_kirenger = new item_rider_driver("gorenger_belt_kirenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "kirenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_momorenger = new item_rider_driver("gorenger_belt_momorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "momorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_midorenger = new item_rider_driver("gorenger_belt_midorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "midorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	
	public static Item gorenger_belt_orenjirenger = new item_rider_driver("gorenger_belt_orenjirenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "orenjirenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_kurorenger = new item_rider_driver("gorenger_belt_kurorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "kurorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_shirorenger = new item_rider_driver("gorenger_belt_shirorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "shirorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_gurerenger = new item_rider_driver("gorenger_belt_gurerenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "gurerenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_murasakinorenger = new item_rider_driver("gorenger_belt_murasakinorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "murasakinorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_baiorettorenger = new item_rider_driver("gorenger_belt_baiorettorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "baiorettorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_kasshokurenger = new item_rider_driver("gorenger_belt_kasshokurenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "kasshokurenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_ginrenger = new item_rider_driver("gorenger_belt_ginrenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "ginrenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_gorudorenger = new item_rider_driver("gorenger_belt_gorudorenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "gorudorenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	public static Item gorenger_belt_shianrenger = new item_rider_driver("gorenger_belt_shianrenger", "gorenger", 1, ArmorMaterial.DIAMOND, 3, "shianrenger").setMaxStackSize(1).setCreativeTab(Tabs.gorenger);
	
	public static Item akarenger_star = new Item_ore("akarenger_star").setCreativeTab(Tabs.gorenger);
	public static Item aorenger_star = new Item_ore("aorenger_star").setCreativeTab(Tabs.gorenger);
	public static Item kirenger_star = new Item_ore("kirenger_star").setCreativeTab(Tabs.gorenger);
	public static Item momorenger_star = new Item_ore("momorenger_star").setCreativeTab(Tabs.gorenger);
	public static Item midorenger_star = new Item_ore("midorenger_star").setCreativeTab(Tabs.gorenger);
	
	public static Item orenjirenger_star = new Item_ore("orenjirenger_star").setCreativeTab(Tabs.gorenger);
	public static Item kurorenger_star = new Item_ore("kurorenger_star").setCreativeTab(Tabs.gorenger);
	public static Item shirorenger_star = new Item_ore("shirorenger_star").setCreativeTab(Tabs.gorenger);
	public static Item gurerenger_star = new Item_ore("gurerenger_star").setCreativeTab(Tabs.gorenger);
	public static Item murasakinorenger_star = new Item_ore("murasakinorenger_star").setCreativeTab(Tabs.gorenger);
	public static Item baiorettorenger_star = new Item_ore("baiorettorenger_star").setCreativeTab(Tabs.gorenger);
	public static Item kasshokurenger_star = new Item_ore("kasshokurenger_star").setCreativeTab(Tabs.gorenger);
	public static Item ginrenger_star = new Item_ore("ginrenger_star").setCreativeTab(Tabs.gorenger);
	public static Item gorudorenger_star = new Item_ore("gorudorenger_star").setCreativeTab(Tabs.gorenger);
	public static Item shianrenger_star = new Item_ore("shianrenger_star").setCreativeTab(Tabs.gorenger);
	
	public static Item gokaigerhead = new item_rider_armor("gokaigerhead","gokaiger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item gokaigertroso = new item_rider_armor2("gokaigertroso","gokaiger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item gokaigerlegs = new item_rider_armor2("gokaigerlegs","gokaiger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	
	public static Item mobirate_gokai_red = new item_rider_driver("mobirate_gokai_red", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_red").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_blue = new item_rider_driver("mobirate_gokai_blue", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_blue").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_yellow = new item_rider_driver("mobirate_gokai_yellow", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_yellow").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_green = new item_rider_driver("mobirate_gokai_green", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_green").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_pink = new item_rider_driver("mobirate_gokai_pink", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_pink").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	
	public static Item mobirate_gokai_orange = new item_rider_driver("mobirate_gokai_orange", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_orange").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_black = new item_rider_driver("mobirate_gokai_black", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_black").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_white = new item_rider_driver("mobirate_gokai_white", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_white").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_purple = new item_rider_driver("mobirate_gokai_purple", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_purple").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_violet = new item_rider_driver("mobirate_gokai_violet", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_violet").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_gray = new item_rider_driver("mobirate_gokai_gray", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_gray").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_brown = new item_rider_driver("mobirate_gokai_brown", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_brown").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item mobirate_gokai_cyan = new item_rider_driver("mobirate_gokai_cyan", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_cyan").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	
	public static Item gokaicellular_gokai_silver = new item_rider_driver("gokaicellular_gokai_silver", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_silver").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item gokaicellular_gokai_gold = new item_rider_driver("gokaicellular_gokai_gold", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_gold").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	public static Item gokaicellular_gokai_dark = new item_rider_driver("gokaicellular_gokai_dark", "gokaiger", 1, ArmorMaterial.DIAMOND, 3, "gokai_dark").setMaxStackSize(1).setCreativeTab(Tabs.gokaiger);
	
	public static Item gokai_red_ranger_key = new item_form_change("gokai_red_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_blue_ranger_key = new item_form_change("gokai_blue_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_yellow_ranger_key = new item_form_change("gokai_yellow_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_green_ranger_key = new item_form_change("gokai_green_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_pink_ranger_key = new item_form_change("gokai_pink_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	
	public static Item gokai_orange_ranger_key = new item_form_change("gokai_orange_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_black_ranger_key = new item_form_change("gokai_black_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_white_ranger_key = new item_form_change("gokai_white_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_purple_ranger_key = new item_form_change("gokai_purple_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_violet_ranger_key = new item_form_change("gokai_violet_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_gray_ranger_key = new item_form_change("gokai_gray_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_brown_ranger_key = new item_form_change("gokai_brown_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_cyan_ranger_key = new item_form_change("gokai_cyan_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	
	public static Item gokai_silver_ranger_key = new item_form_change("gokai_silver_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_gold_ranger_key = new item_form_change("gokai_gold_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	public static Item gokai_dark_ranger_key = new item_form_change("gokai_dark_ranger_key", 0,"gokaiger",1).setCreativeTab(Tabs.gokaiger);
	
	public static Item kyoryugerhead = new item_rider_armor("kyoryugerhead","kyoryuger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item kyoryugertroso = new item_rider_armor2("kyoryugertroso","kyoryuger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item kyoryugerlegs = new item_rider_armor2("kyoryugerlegs","kyoryuger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gaburevolver_kyoryu_red = new item_rider_driver("gaburevolver_kyoryu_red", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_red").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_black = new item_rider_driver("gaburevolver_kyoryu_black", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_black").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_blue = new item_rider_driver("gaburevolver_kyoryu_blue", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_blue").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_green = new item_rider_driver("gaburevolver_kyoryu_green", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_green").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_pink = new item_rider_driver("gaburevolver_kyoryu_pink", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_pink").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gaburichanger_kyoryu_gold = new item_rider_driver("gaburichanger_kyoryu_gold", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_gold").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item spirit_zyudenchi_kyoryu_cyan = new item_rider_driver("spirit_zyudenchi_kyoryu_cyan", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "spirit_kyoryu_cyan").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_cyan = new item_rider_driver("gaburevolver_kyoryu_cyan", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_cyan").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item spirit_zyudenchi_kyoryu_gray = new item_rider_driver("spirit_zyudenchi_kyoryu_gray", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "spirit_kyoryu_gray").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_gray = new item_rider_driver("gaburevolver_kyoryu_gray", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_gray").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_violet = new item_rider_driver("gaburevolver_kyoryu_violet", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_violet").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gigagaburevolver_kyoryu_silver = new item_rider_driver("gigagaburevolver_kyoryu_silver", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_silver").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gaburevolver_kyoryu_yellow = new item_rider_driver("gaburevolver_kyoryu_yellow", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_yellow").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_orange = new item_rider_driver("gaburevolver_kyoryu_orange", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_orange").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_aqua = new item_rider_driver("gaburevolver_kyoryu_aqua", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_aqua").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_magenta = new item_rider_driver("gaburevolver_kyoryu_magenta", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_magenta").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_crimson = new item_rider_driver("gaburevolver_kyoryu_crimson", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_crimson").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gigagaburevolver_kyoryu_indigo= new item_rider_driver("gigagaburevolver_kyoryu_indigo", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_indigo").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_vermilion = new item_rider_driver("gaburevolver_kyoryu_vermilion", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_vermilion").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_lavender = new item_rider_driver("gaburevolver_kyoryu_lavender", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_lavender").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburichanger_kyoryu_white = new item_rider_driver("gaburichanger_kyoryu_white", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_white").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_limegreen = new item_rider_driver("gaburevolver_kyoryu_limegreen", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_limegreen").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_cobalt = new item_rider_driver("gaburevolver_kyoryu_cobalt", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_cobalt").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_scarlet = new item_rider_driver("gaburevolver_kyoryu_scarlet", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_scarlet").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_lightgray = new item_rider_driver("gaburevolver_kyoryu_lightgray", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_lightgray").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gigagaburevolver_kyoryu_neongreen = new item_rider_driver("gigagaburevolver_kyoryu_neongreen", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_neongreen").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_royalblue = new item_rider_driver("gaburevolver_kyoryu_royalblue", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_royalblue").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburichanger_kyoryu_lightblue = new item_rider_driver("gaburichanger_kyoryu_lightblue", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_lightblue").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_darkgray = new item_rider_driver("gaburevolver_kyoryu_darkgray", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_darkgray").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_firered = new item_rider_driver("gaburevolver_kyoryu_firered", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_firered").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_neonyellow = new item_rider_driver("gaburevolver_kyoryu_neonyellow", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_neonyellow").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gaburevolver_kyoryu_brown = new item_rider_driver("gaburevolver_kyoryu_brown", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_brown").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_kyoryu_purple = new item_rider_driver("gaburevolver_kyoryu_purple", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_purple").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gaburevolver_kyoryu_navy = new item_rider_driver("gaburevolver_kyoryu_navy", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_navy").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburevolver_deathryuger = new item_rider_driver("gaburevolver_deathryuger", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "deathryuger").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gabutyra_de_carnival = new item_rider_driver("gabutyra_de_carnival", "kyoryuger", 1, ArmorMaterial.DIAMOND, 3, "kyoryu_carnival").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gaburevolver = new Item_gun("gaburevolver", Tabs.gaburevolver).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gaburichanger = new Item_gun("gaburichanger", Tabs.gaburichanger).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item gigagaburevolver = new Item_gun("gigagaburevolver", Tabs.gigagaburevolver).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	public static Item minityra = new Item_gun("minityra", Tabs.minityra).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);	
	public static Item gaburicarnival = new Item_gun("gaburicarnival", Tabs.gaburicarnival).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger);
	
	public static Item kyoryu_red_armed_on= new item_form_change("kyoryu_red_armed_on", 1,"kyoryuger",1).setCreativeTab(Tabs.kyoryuger);
	public static Item kyoryu_black_armed_on= new item_form_change("kyoryu_black_armed_on", 1,"kyoryuger",2).setCreativeTab(Tabs.kyoryuger);
	public static Item kyoryu_blue_armed_on= new item_form_change("kyoryu_blue_armed_on", 1,"kyoryuger",3).setCreativeTab(Tabs.kyoryuger);
	public static Item kyoryu_green_armed_on= new item_form_change("kyoryu_green_armed_on", 1,"kyoryuger",4).setCreativeTab(Tabs.kyoryuger);
	public static Item kyoryu_pink_armed_on= new item_form_change("kyoryu_pink_armed_on", 1,"kyoryuger",5).setCreativeTab(Tabs.kyoryuger);
	
	public static Item kyoryu_gold_armed_on= new item_form_change("kyoryu_gold_armed_on", 1,"kyoryuger",6).setCreativeTab(Tabs.kyoryuger);
	
	public static Item samba_carnival= new item_form_change("samba_carnival", 1,"kyoryuger",32).setCreativeTab(Tabs.kyoryuger);
	public static Item western_carnival= new item_form_change("western_carnival", 2,"kyoryuger",32).setCreativeTab(Tabs.kyoryuger);
	public static Item macho_carnival= new item_form_change("macho_carnival", 3,"kyoryuger",32).setCreativeTab(Tabs.kyoryuger);
	public static Item kung_fu_carnival= new item_form_change("kung_fu_carnival", 4,"kyoryuger",32).setCreativeTab(Tabs.kyoryuger);
	public static Item special_carnival= new item_form_change("special_carnival", 5,"kyoryuger",32).setCreativeTab(Tabs.kyoryuger);
	public static Item tv_maga_carnival= new item_form_change("tv_maga_carnival", 6,"kyoryuger",32).setCreativeTab(Tabs.kyoryuger);
	
	public static Item gabutyra_zyudenchi = new item_form_change("gabutyra_zyudenchi", 0,"kyoryuger",1).setCreativeTab(Tabs.kyoryuger);
	public static Item parasagun_zyudenchi = new item_form_change("parasagun_zyudenchi", 0,"kyoryuger",2).setCreativeTab(Tabs.kyoryuger);
	public static Item stegotchi_zyudenchi = new item_form_change("stegotchi_zyudenchi", 0,"kyoryuger",3).setCreativeTab(Tabs.kyoryuger);
	public static Item zakutor_zyudenchi = new item_form_change("zakutor_zyudenchi", 0,"kyoryuger",4).setCreativeTab(Tabs.kyoryuger);
	public static Item dricera_zyudenchi = new item_form_change("dricera_zyudenchi", 0,"kyoryuger",5).setCreativeTab(Tabs.kyoryuger);
	
	public static Item pteragordon_zyudenchi = new item_form_change("pteragordon_zyudenchi", 0,"kyoryuger",6).setCreativeTab(Tabs.kyoryuger);
	
	public static Item ankydon_zyudenchi = new item_form_change("ankydon_zyudenchi", 0,"kyoryuger",7).setCreativeTab(Tabs.kyoryuger);
	public static Item bunpachy_zyudenchi = new item_form_change("bunpachy_zyudenchi", 0,"kyoryuger",8).setCreativeTab(Tabs.kyoryuger);
	public static Item plezuon_zyudenchi = new item_form_change("plezuon_zyudenchi", 0,"kyoryuger",9).setCreativeTab(Tabs.kyoryuger);
	
	public static Item bragigas_zyudenchi = new item_form_change("bragigas_zyudenchi", 0,"kyoryuger",10).setCreativeTab(Tabs.kyoryuger);
	
	public static Item deinochaser_zyudenchi = new item_form_change("deinochaser_zyudenchi", 0,"kyoryuger",11).setCreativeTab(Tabs.kyoryuger);
	public static Item deinosgrander_zyudenchi = new item_form_change("deinosgrander_zyudenchi", 0,"kyoryuger",12).setCreativeTab(Tabs.kyoryuger);
	public static Item kentorospiker_zyudenchi = new item_form_change("kentorospiker_zyudenchi", 0,"kyoryuger",13).setCreativeTab(Tabs.kyoryuger);
	public static Item stymero_zyudenchi = new item_form_change("stymero_zyudenchi", 0,"kyoryuger",14).setCreativeTab(Tabs.kyoryuger);
	public static Item allomerus_zyudenchi = new item_form_change("allomerus_zyudenchi", 0,"kyoryuger",15).setCreativeTab(Tabs.kyoryuger);
	public static Item beyonsmo_zyudenchi = new item_form_change("beyonsmo_zyudenchi", 0,"kyoryuger",16).setCreativeTab(Tabs.kyoryuger);
	public static Item ovirappoo_zyudenchi = new item_form_change("ovirappoo_zyudenchi", 0,"kyoryuger",17).setCreativeTab(Tabs.kyoryuger);
	public static Item igeranodon_zyudenchi = new item_form_change("igeranodon_zyudenchi", 0,"kyoryuger",18).setCreativeTab(Tabs.kyoryuger);
	public static Item tuperanda_zyudenchi = new item_form_change("tuperanda_zyudenchi", 0,"kyoryuger",19).setCreativeTab(Tabs.kyoryuger);
	public static Item gurumonite_zyudenchi = new item_form_change("gurumonite_zyudenchi", 0,"kyoryuger",20).setCreativeTab(Tabs.kyoryuger);
	public static Item archenolon_zyudenchi = new item_form_change("archenolon_zyudenchi", 0,"kyoryuger",21).setCreativeTab(Tabs.kyoryuger);
	public static Item pukuptor_zyudenchi = new item_form_change("pukuptor_zyudenchi", 0,"kyoryuger",22).setCreativeTab(Tabs.kyoryuger);
	public static Item futabain_zyudenchi = new item_form_change("futabain_zyudenchi", 0,"kyoryuger",23).setCreativeTab(Tabs.kyoryuger);
	
	public static Item speedrus_zyudenchi = new item_form_change("speedrus_zyudenchi", 0,"kyoryuger",24).setCreativeTab(Tabs.kyoryuger);
	public static Item prisukeos_zyudenchi = new item_form_change("prisukeos_zyudenchi", 0,"kyoryuger",25).setCreativeTab(Tabs.kyoryuger);
	public static Item fuwanycto_zyudenchi = new item_form_change("fuwanycto_zyudenchi", 0,"kyoryuger",26).setCreativeTab(Tabs.kyoryuger);
	public static Item kachicox_zyudenchi = new item_form_change("kachicox_zyudenchi", 0,"kyoryuger",27).setCreativeTab(Tabs.kyoryuger);
	public static Item karateta_zyudenchi = new item_form_change("karateta_zyudenchi", 0,"kyoryuger",28).setCreativeTab(Tabs.kyoryuger);
	public static Item taekwondonto_zyudenchi = new item_form_change("taekwondonto_zyudenchi", 0,"kyoryuger",29).setCreativeTab(Tabs.kyoryuger);
	
	public static Item manoki_zyudenchi = new item_form_change("manoki_zyudenchi", 0,"kyoryuger",30).setCreativeTab(Tabs.kyoryuger);
	public static Item ichthyogu_zyudenchi = new item_form_change("ichthyogu_zyudenchi", 0,"kyoryuger",31).setCreativeTab(Tabs.kyoryuger);
	
	public static Item tobaspino_zyudenchi = new item_form_change("tobaspino_zyudenchi", 0,"kyoryuger",32).setCreativeTab(Tabs.kyoryuger);
	public static Item deathryuger_zyudenchi = new item_form_change("deathryuger_zyudenchi", 0,"kyoryuger",33).setCreativeTab(Tabs.kyoryuger);
	
	public static Item carnival_zyudenchi = new Item_ore("carnival_zyudenchi").setCreativeTab(Tabs.kyoryuger);
	
	public static Item brave_kyoryugerhead = new item_rider_armor("brave_kyoryugerhead","kyoryuger_brave", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item brave_kyoryugertroso = new item_rider_armor2("brave_kyoryugertroso","kyoryuger_brave", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item brave_kyoryugerlegs = new item_rider_armor2("brave_kyoryugerlegs","kyoryuger_brave", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gabugaburevolver_brave_kyoryu_red = new item_rider_driver("gabugaburevolver_brave_kyoryu_red", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_red").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_black = new item_rider_driver("gabugaburevolver_brave_kyoryu_black", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_black").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_blue = new item_rider_driver("gabugaburevolver_brave_kyoryu_blue", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_blue").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_green = new item_rider_driver("gabugaburevolver_brave_kyoryu_green", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_green").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_pink = new item_rider_driver("gabugaburevolver_brave_kyoryu_pink", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_pink").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gabugaburichanger_brave_kyoryu_gold = new item_rider_driver("gabugaburichanger_brave_kyoryu_gold", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_gold").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gabugaburevolver_brave_kyoryu_cyan = new item_rider_driver("gabugaburevolver_brave_kyoryu_cyan", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_cyan").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_gray = new item_rider_driver("gabugaburevolver_brave_kyoryu_gray", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_gray").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_violet = new item_rider_driver("gabugaburevolver_brave_kyoryu_violet", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_violet").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gigagabugaburevolver_brave_kyoryu_silver = new item_rider_driver("gigagabugaburevolver_brave_kyoryu_silver", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_silver").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gabugaburevolver_brave_kyoryu_yellow = new item_rider_driver("gabugaburevolver_brave_kyoryu_yellow", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_yellow").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_orange = new item_rider_driver("gabugaburevolver_brave_kyoryu_orange", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_orange").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_aqua = new item_rider_driver("gabugaburevolver_brave_kyoryu_aqua", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_aqua").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_magenta = new item_rider_driver("gabugaburevolver_brave_kyoryu_magenta", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_magenta").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_crimson = new item_rider_driver("gabugaburevolver_brave_kyoryu_crimson", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_crimson").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gigagabugaburevolver_brave_kyoryu_indigo= new item_rider_driver("gigagabugaburevolver_brave_kyoryu_indigo", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_indigo").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_vermilion = new item_rider_driver("gabugaburevolver_brave_kyoryu_vermilion", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_vermilion").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_lavender = new item_rider_driver("gabugaburevolver_brave_kyoryu_lavender", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_lavender").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburichanger_brave_kyoryu_white = new item_rider_driver("gabugaburichanger_brave_kyoryu_white", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_white").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_limegreen = new item_rider_driver("gabugaburevolver_brave_kyoryu_limegreen", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_limegreen").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_cobalt = new item_rider_driver("gabugaburevolver_brave_kyoryu_cobalt", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_cobalt").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_scarlet = new item_rider_driver("gabugaburevolver_brave_kyoryu_scarlet", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_scarlet").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_lightgray = new item_rider_driver("gabugaburevolver_brave_kyoryu_lightgray", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_lightgray").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gigagabugaburevolver_brave_kyoryu_neongreen = new item_rider_driver("gigagabugaburevolver_brave_kyoryu_neongreen", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_neongreen").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_royalblue = new item_rider_driver("gabugaburevolver_brave_kyoryu_royalblue", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_royalblue").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburichanger_brave_kyoryu_lightblue = new item_rider_driver("gabugaburichanger_brave_kyoryu_lightblue", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_lightblue").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_darkgray = new item_rider_driver("gabugaburevolver_brave_kyoryu_darkgray", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_darkgray").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_firered = new item_rider_driver("gabugaburevolver_brave_kyoryu_firered", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_firered").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_neonyellow = new item_rider_driver("gabugaburevolver_brave_kyoryu_neonyellow", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_neonyellow").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gabugaburevolver_brave_kyoryu_brown = new item_rider_driver("gabugaburevolver_brave_kyoryu_brown", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_brown").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_kyoryu_purple = new item_rider_driver("gabugaburevolver_brave_kyoryu_purple", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_purple").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gabugaburevolver_brave_kyoryu_navy = new item_rider_driver("gabugaburevolver_brave_kyoryu_navy", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_kyoryu_navy").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburevolver_brave_deathryuger = new item_rider_driver("gabugaburevolver_brave_deathryuger", "kyoryuger_brave", 1, ArmorMaterial.DIAMOND, 3, "brave_deathryuger").setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item gabugaburevolver = new Item_gun("gabugaburevolver",Tabs.gabugaburevolver).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gabugaburichanger = new Item_gun("gabugaburichanger",Tabs.gabugaburichanger).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item gigagabugaburevolver = new Item_gun("gigagabugaburevolver",Tabs.gigagabugaburevolver).setMaxStackSize(1).setCreativeTab(Tabs.kyoryuger_brave);

	public static Item guntyra_zyudenchi = new item_form_change("guntyra_zyudenchi", 0,"kyoryuger_brave",1).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item stegonsaw_zyudenchi = new item_form_change("stegonsaw_zyudenchi", 0,"kyoryuger_brave",2).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item shovecera_zyudenchi = new item_form_change("shovecera_zyudenchi", 0,"kyoryuger_brave",3).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item parasaber_zyudenchi = new item_form_change("parasaber_zyudenchi", 0,"kyoryuger_brave",4).setCreativeTab(Tabs.kyoryuger_brave);
	public static Item rapx_zyudenchi = new item_form_change("rapx_zyudenchi", 0,"kyoryuger_brave",5).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item pteravolt_zyudenchi = new item_form_change("pteravolt_zyudenchi", 0,"kyoryuger",6).setCreativeTab(Tabs.kyoryuger_brave);
	
	public static Item lupinhead = new item_lupat_ranger_armor("lupinhead","lupinranger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item lupintroso = new item_lupat_ranger_armor2("lupintroso","lupinranger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item lupinlegs = new item_lupat_ranger_armor2("lupinlegs","lupinranger",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item vs_changer_lupin_red = new item_vs_changer("vs_changer_lupin_red","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_red").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_blue = new item_vs_changer("vs_changer_lupin_blue","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_blue").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_yellow = new item_vs_changer("vs_changer_lupin_yellow","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_yellow").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item vs_changer_lupin_green = new item_vs_changer("vs_changer_lupin_green","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_green").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_black = new item_vs_changer("vs_changer_lupin_black","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_black", "lupinranger_knight").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_white = new item_vs_changer("vs_changer_lupin_white","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_white", "lupinranger_magic").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_crimson = new item_vs_changer("vs_changer_lupin_crimson","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_crimson", "victory").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_navy = new item_vs_changer("vs_changer_lupin_navy","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_navy", "patranger_siren").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item vs_changer_lupin_hammer = new item_vs_changer("vs_changer_lupin_hammer","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_hammer").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_jackpot = new item_vs_changer("vs_changer_lupin_jackpot","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_jackpot").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_music = new item_vs_changer("vs_changer_lupin_music","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_music").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_paint = new item_vs_changer("vs_changer_lupin_paint","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_paint").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_prism = new item_vs_changer("vs_changer_lupin_prism","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_prism").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_christmas = new item_vs_changer("vs_changer_lupin_christmas","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_christmas").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_special = new item_vs_changer("vs_changer_lupin_special","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_special").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item vs_changer_lupin_brown = new item_vs_changer("vs_changer_lupin_brown","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_brown").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_cyan = new item_vs_changer("vs_changer_lupin_cyan","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_cyan").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_gray = new item_vs_changer("vs_changer_lupin_gray","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_gray").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_orange = new item_vs_changer("vs_changer_lupin_orange","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_orange").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_pink = new item_vs_changer("vs_changer_lupin_pink","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_pink").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_purple = new item_vs_changer("vs_changer_lupin_purple","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_purple").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_lupin_violet = new item_vs_changer("vs_changer_lupin_violet","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_violet").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
		
	public static Item x_changer_lupin_x = new item_vs_changer("x_changer_lupin_x","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_x").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item y_changer_lupin_y = new item_vs_changer("y_changer_lupin_y","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_y").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item storm_changer_lupin_fire_storm = new item_vs_changer("storm_changer_lupin_fire_storm","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_fire_storm").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item prision_changer_lupin_prision_chain = new item_vs_changer("prision_changer_lupin_prision_chain","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_prision_chain").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item vs_changer_lupin_striker = new item_vs_changer("vs_changer_lupin_striker","lupinranger",1, ArmorMaterial.DIAMOND, 4,"lupin_striker").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item vs_changer_lupin = new Item_gun("vs_changer_lupin",Tabs.vs_changer_lupin).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_black_lupin = new Item_gun("vs_changer_black_lupin",Tabs.vs_changer_black_lupin).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_red_lupin = new Item_gun("vs_changer_red_lupin",Tabs.vs_changer_red_lupin).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item vs_changer_silver = new Item_gun("vs_changer_silver",Tabs.vs_changer_silver).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item lupin_magnum = new Item_gun("lupin_magnum",Tabs.lupin_magnum).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item lupin_x_changer = new Item_gun("lupin_x_changer",Tabs.lupin_x_changer).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item lupin_y_changer = new Item_gun("lupin_y_changer",Tabs.lupin_x_changer).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item lupin_storm_changer = new Item_gun("lupin_storm_changer",Tabs.lupin_storm_changer).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item lupin_prision_changer = new Item_gun("lupin_prision_changer",Tabs.lupin_prision_changer).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item red_dial_fighter= new item_lupin_collection("red_dial_fighter", 0, 0,"lupinranger",1).setCreativeTab(Tabs.lupinranger);
	public static Item blue_dial_fighter= new item_lupin_collection("blue_dial_fighter", 0, 0,"lupinranger",2).setCreativeTab(Tabs.lupinranger);
	public static Item yellow_dial_fighter= new item_lupin_collection("yellow_dial_fighter", 0, 0,"lupinranger",3).setCreativeTab(Tabs.lupinranger);
	
	public static Item cyclone_dial_fighter= new item_lupin_collection("cyclone_dial_fighter", 0, 0,"lupinranger",4).setCreativeTab(Tabs.lupinranger);
	public static Item scissors_dial_fighter= new item_lupin_collection("scissors_dial_fighter", 0, 1,"lupinranger",5).setCreativeTab(Tabs.lupinranger);
	public static Item blade_dial_fighter= new item_lupin_collection("blade_dial_fighter", 0, 1,"lupinranger",5).setCreativeTab(Tabs.lupinranger);
	public static Item magic_dial_fighter= new item_lupin_collection("magic_dial_fighter", 0, 3,"lupinranger",6).setCreativeTab(Tabs.lupinranger);
	public static Item victory_striker= new item_lupin_collection("victory_striker", 0, 5,"lupinranger",7).setCreativeTab(Tabs.lupinranger);
	
	public static Item hammer_dial_fighter= new item_lupin_collection("hammer_dial_fighter", 0, 0,"lupinranger",8).setCreativeTab(Tabs.lupinranger);
	public static Item jackpot_striker= new item_lupin_collection("jackpot_striker", 0, 0,"lupinranger",9).setCreativeTab(Tabs.lupinranger);
	public static Item music_dial_fighter= new item_lupin_collection("music_dial_fighter", 0, 0,"lupinranger",10).setCreativeTab(Tabs.lupinranger);
	public static Item paint_dial_fighter= new item_lupin_collection("paint_dial_fighter", 0, 0,"lupinranger",11).setCreativeTab(Tabs.lupinranger);
	public static Item prism_dial_fighter= new item_lupin_collection("prism_dial_fighter", 0, 0,"lupinranger",12).setCreativeTab(Tabs.lupinranger);
	public static Item christmas_dial_fighter= new item_lupin_collection("christmas_dial_fighter", 0, 0,"lupinranger",13).setCreativeTab(Tabs.lupinranger);
	public static Item special_dial_fighter= new item_lupin_collection("special_dial_fighter", 0, 0,"lupinranger",14).setCreativeTab(Tabs.lupinranger);
	
	public static Item brown_dial_fighter= new item_lupin_collection("brown_dial_fighter", 0, 0,"lupinranger",15).setCreativeTab(Tabs.lupinranger);
	public static Item cyan_dial_fighter= new item_lupin_collection("cyan_dial_fighter", 0, 0,"lupinranger",16).setCreativeTab(Tabs.lupinranger);
	public static Item gray_dial_fighter= new item_lupin_collection("gray_dial_fighter", 0, 0,"lupinranger",17).setCreativeTab(Tabs.lupinranger);
	public static Item orange_dial_fighter= new item_lupin_collection("orange_dial_fighter", 0, 0,"lupinranger",18).setCreativeTab(Tabs.lupinranger);
	public static Item pink_dial_fighter= new item_lupin_collection("pink_dial_fighter", 0, 0,"lupinranger",19).setCreativeTab(Tabs.lupinranger);
	public static Item purple_dial_fighter= new item_lupin_collection("purple_dial_fighter", 0, 0,"lupinranger",20).setCreativeTab(Tabs.lupinranger);
	public static Item violet_dial_fighter= new item_lupin_collection("violet_dial_fighter", 0, 0,"lupinranger",21).setCreativeTab(Tabs.lupinranger);
	
	public static Item jackpot_striker_lupin_tricolor= new item_lupin_collection("jackpot_striker_lupin_tricolor", 1, 0,"lupinranger",1).setCreativeTab(Tabs.lupinranger);
	
	public static Item x_train_silver= new item_lupin_collection("x_train_silver", 0, 0,"lupinranger",22).setCreativeTab(Tabs.lupinranger);
	public static Item x_train_fire= new item_lupin_collection("x_train_fire", 0, 0,"lupinranger",23).setCreativeTab(Tabs.lupinranger);
	public static Item x_train_chain= new item_lupin_collection("x_train_chain", 0, 0,"lupinranger",24).setCreativeTab(Tabs.lupinranger);
	public static Item y_train_gold= new item_lupin_collection("y_train_gold", 0, 0,"lupinranger",25).setCreativeTab(Tabs.lupinranger);
	
	public static Item goodstriker_lupin_mode= new item_lupin_collection("goodstriker_lupin_mode", 0, 0,"lupinranger",26).setCreativeTab(Tabs.lupinranger);

	public static Item scissors_shield = new ItemBaseShield("scissors_shield").setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	public static Item blade_boomerang = new ItemBaseSword("blade_boomerang", Tabs.blade_boomerang).setMaxStackSize(1).setCreativeTab(Tabs.lupinranger);
	
	public static Item patrenhead = new item_lupat_ranger_armor("patrenhead","patranger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item patrentroso = new item_lupat_ranger_armor2("patrentroso","patranger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item patrenlegs = new item_lupat_ranger_armor2("patrenlegs","patranger",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item vs_changer_patren_1go = new item_vs_changer("vs_changer_patren_1go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_1go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_2go = new item_vs_changer("vs_changer_patren_2go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_2go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_3go = new item_vs_changer("vs_changer_patren_3go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_3go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item vs_changer_patren_4go = new item_vs_changer("vs_changer_patren_4go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_4go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_5go = new item_vs_changer("vs_changer_patren_5go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_5go", "patranger_crane").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_6go = new item_vs_changer("vs_changer_patren_6go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_6go", "patranger_splash").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_7go = new item_vs_changer("vs_changer_patren_7go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_7go", "patranger_siren").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_14go = new item_vs_changer("vs_changer_patren_14go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_14go", "lupin_crimson_victory").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item vs_changer_patren_cement = new item_vs_changer("vs_changer_patren_cement","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_cement").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_justice = new item_vs_changer("vs_changer_patren_justice","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_justice").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_music = new item_vs_changer("vs_changer_patren_music","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_music").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_dog = new item_vs_changer("vs_changer_patren_dog","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_dog").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_flash = new item_vs_changer("vs_changer_patren_flash","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_flash").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_christmas = new item_vs_changer("vs_changer_patren_christmas","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_christmas").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_special = new item_vs_changer("vs_changer_patren_special","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_special").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item vs_changer_patren_8go = new item_vs_changer("vs_changer_patren_8go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_8go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_9go = new item_vs_changer("vs_changer_patren_9go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_9go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_10go = new item_vs_changer("vs_changer_patren_10go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_10go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_11go = new item_vs_changer("vs_changer_patren_11go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_11go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_12go = new item_vs_changer("vs_changer_patren_12go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_12go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_13go = new item_vs_changer("vs_changer_patren_13go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_13go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_patren_15go = new item_vs_changer("vs_changer_patren_15go","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_15go").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
			
	public static Item x_changer_patren_x = new item_vs_changer("x_changer_patren_x","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_x").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item y_changer_patren_y = new item_vs_changer("y_changer_patren_y","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_y").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item storm_changer_patren_thunder_storm = new item_vs_changer("storm_changer_patren_thunder_storm","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_thunder_storm").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item prision_changer_patren_prision_jail = new item_vs_changer("prision_changer_patren_prision_jail","patranger",1, ArmorMaterial.DIAMOND, 4,"patren_prision_jail").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item vs_changer_patren_striker = new item_vs_changer("vs_changer_patren_striker","patranger",1, ArmorMaterial.DIAMOND, 4,"patranger").setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item vs_changer_patren = new Item_gun("vs_changer_patren",Tabs.vs_changer_patren).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_black_patren = new Item_gun("vs_changer_black_patren",Tabs.vs_changer_black_patren).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_red_patren = new Item_gun("vs_changer_red_patren",Tabs.vs_changer_red_patren).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item vs_changer_gold = new Item_gun("vs_changer_gold",Tabs.vs_changer_gold).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item patren_magnum = new Item_gun("patren_magnum",Tabs.patren_magnum).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item patren_x_changer = new Item_gun("patren_x_changer",Tabs.patren_x_changer).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item patren_storm_changer = new Item_gun("patren_storm_changer",Tabs.patren_storm_changer).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item patren_prision_changer = new Item_gun("patren_prision_changer",Tabs.patren_prision_changer).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	public static Item patren_y_changer = new Item_gun("patren_y_changer",Tabs.patren_x_changer).setMaxStackSize(1).setCreativeTab(Tabs.patranger);
	
	public static Item trigger_machine_1go= new item_lupin_collection("trigger_machine_1go", 0, 0,"patranger",1).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_2go= new item_lupin_collection("trigger_machine_2go", 0, 0,"patranger",2).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_3go= new item_lupin_collection("trigger_machine_3go", 0, 0,"patranger",3).setCreativeTab(Tabs.patranger);
	
	public static Item trigger_machine_biker= new item_lupin_collection("trigger_machine_biker", 0, 0,"patranger",4).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_crane= new item_lupin_collection("trigger_machine_crane", 0, 2,"patranger",5).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_drill= new item_lupin_collection("trigger_machine_drill", 0, 2,"patranger",5).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_splash= new item_lupin_collection("trigger_machine_splash", 0, 4,"patranger",6).setCreativeTab(Tabs.patranger);
	public static Item siren_striker= new item_lupin_collection("siren_striker", 0, 6,"patranger",7).setCreativeTab(Tabs.patranger);
	
	public static Item trigger_machine_cement= new item_lupin_collection("trigger_machine_cement", 0, 0,"patranger",8).setCreativeTab(Tabs.patranger);
	public static Item justice_striker= new item_lupin_collection("justice_striker", 0, 0,"patranger",9).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_music= new item_lupin_collection("trigger_machine_music", 0, 0,"patranger",10).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_dog= new item_lupin_collection("trigger_machine_dog", 0, 0,"patranger",11).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_flash= new item_lupin_collection("trigger_machine_flash", 0, 0,"patranger",12).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_christmas= new item_lupin_collection("trigger_machine_christmas", 0, 0,"patranger",13).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_special= new item_lupin_collection("trigger_machine_special", 0, 0,"patranger",14).setCreativeTab(Tabs.patranger);
	
	public static Item trigger_machine_8go=new item_lupin_collection("trigger_machine_8go", 0, 0,"patranger",15).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_9go=new item_lupin_collection("trigger_machine_9go", 0, 0,"patranger",16).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_10go=new item_lupin_collection("trigger_machine_10go", 0, 0,"patranger",17).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_11go=new item_lupin_collection("trigger_machine_11go", 0, 0,"patranger",18).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_12go=new item_lupin_collection("trigger_machine_12go", 0, 0,"patranger",19).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_13go=new item_lupin_collection("trigger_machine_13go", 0, 0,"patranger",20).setCreativeTab(Tabs.patranger);
	public static Item trigger_machine_15go=new item_lupin_collection("trigger_machine_15go", 0, 0,"patranger",21).setCreativeTab(Tabs.patranger);
	
	public static Item goodstriker_patren_ugo= new item_lupin_collection("goodstriker_patren_ugo", 0, 1,"patranger",1).setCreativeTab(Tabs.patranger);
	
	public static Item x_train_gold= new item_lupin_collection("x_train_gold", 0, 0,"patranger",22).setCreativeTab(Tabs.patranger);
	public static Item x_train_thunder= new item_lupin_collection("x_train_thunder", 0, 0,"patranger",23).setCreativeTab(Tabs.patranger);
	public static Item x_train_jail= new item_lupin_collection("x_train_jail", 0, 0,"patranger",24).setCreativeTab(Tabs.patranger);
	public static Item y_train_silver= new item_lupin_collection("y_train_silver", 0, 0,"patranger",25).setCreativeTab(Tabs.patranger);
	
	public static Item goodstriker_patren_mode= new item_lupin_collection("goodstriker_patren_mode", 0, 0,"patranger",26).setCreativeTab(Tabs.patranger);
	
	public static Item ryusoulhead = new item_ryusoulger_armor("ryusoulhead","ryusoulger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoultroso = new item_ryusoulger_armor2("ryusoultroso","ryusoulger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoullegs = new item_ryusoulger_armor2("ryusoullegs","ryusoulger", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_changer_ryusoul_red = new item_ryusoul_changer("ryusoul_changer_ryusoul_red","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_red").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_black = new item_ryusoul_changer("ryusoul_changer_ryusoul_black","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_black").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_blue = new item_ryusoul_changer("ryusoul_changer_ryusoul_blue","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_blue").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_green = new item_ryusoul_changer("ryusoul_changer_ryusoul_green","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_green").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_pink = new item_ryusoul_changer("ryusoul_changer_ryusoul_pink","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_pink").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item mosa_changer_ryusoul_gold = new item_ryusoul_changer("mosa_changer_ryusoul_gold","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_gold").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_changer_ryusoul_orange = new item_ryusoul_changer("ryusoul_changer_ryusoul_orange","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_orange").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_yellow = new item_ryusoul_changer("ryusoul_changer_ryusoul_yellow","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_yellow").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_gray = new item_ryusoul_changer("ryusoul_changer_ryusoul_gray","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_gray").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_violet = new item_ryusoul_changer("ryusoul_changer_ryusoul_violet","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_violet").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_white = new item_ryusoul_changer("ryusoul_changer_ryusoul_white","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_white").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_brown = new item_ryusoul_changer("ryusoul_changer_ryusoul_brown","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_brown").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_purple = new item_ryusoul_changer("ryusoul_changer_ryusoul_purple","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_purple").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_cyan = new item_ryusoul_changer("ryusoul_changer_ryusoul_cyan","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_cyan").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item mosa_changer_ryusoul_silver = new item_ryusoul_changer("mosa_changer_ryusoul_silver","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_silver").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_changer_ryusoul_tsuyo = new item_ryusoul_changer("ryusoul_changer_ryusoul_tsuyo","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_tsuyo").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_nobi = new item_ryusoul_changer("ryusoul_changer_ryusoul_nobi","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_nobi").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_haya = new item_ryusoul_changer("ryusoul_changer_ryusoul_haya","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_haya").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_kata = new item_ryusoul_changer("ryusoul_changer_ryusoul_kata","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_kata").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_migake = new item_ryusoul_changer("ryusoul_changer_ryusoul_migake","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_migake").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_omo = new item_ryusoul_changer("ryusoul_changer_ryusoul_omo","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_omo").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_mukimuki = new item_ryusoul_changer("ryusoul_changer_ryusoul_mukimuki","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_mukimuki").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_fue = new item_ryusoul_changer("ryusoul_changer_ryusoul_fue","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_fue").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_chiisa = new item_ryusoul_changer("ryusoul_changer_ryusoul_chiisa","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_chiisa").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_mie = new item_ryusoul_changer("ryusoul_changer_ryusoul_mie","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_mie").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_mabushi = new item_ryusoul_changer("ryusoul_changer_ryusoul_mabushi","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_mabushi").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_kaware = new item_ryusoul_changer("ryusoul_changer_ryusoul_kaware","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_kaware").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_changer_ryusoul_mystery = new item_ryusoul_changer("ryusoul_changer_ryusoul_mystery","ryusoulger",1, ArmorMaterial.DIAMOND, 4, "ryusoul_mystery").setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item empty_ryusoul_changer = new Item_ore("empty_ryusoul_changer").setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_red = new item_ryusoul("ryusoul_red", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_black = new item_ryusoul("ryusoul_black", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_blue = new item_ryusoul("ryusoul_blue", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_green = new item_ryusoul("ryusoul_green", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_pink = new item_ryusoul("ryusoul_pink", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_gold = new item_ryusoul("ryusoul_gold", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_orange = new item_ryusoul("ryusoul_orange", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_yellow = new item_ryusoul("ryusoul_yellow", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_gray = new item_ryusoul("ryusoul_gray", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_violet = new item_ryusoul("ryusoul_violet", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_white = new item_ryusoul("ryusoul_white", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_brown = new item_ryusoul("ryusoul_brown", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_purple = new item_ryusoul("ryusoul_purple", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item ryusoul_cyan = new item_ryusoul("ryusoul_cyan", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_silver = new item_ryusoul("ryusoul_silver", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item tsuyosoul = new item_ryusoul("tsuyosoul", 0, 1,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item nobisoul = new item_ryusoul("nobisoul", 0, 2,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item hayasoul = new item_ryusoul("hayasoul", 0, 4,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item katasoul = new item_ryusoul("katasoul", 0, 5,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item migakesoul = new item_ryusoul("migakesoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item omosoul = new item_ryusoul("omosoul", 0, 3,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item mukimukisoul = new item_ryusoul("mukimukisoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item fuesoul = new item_ryusoul("fuesoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item chiisasoul = new item_ryusoul("chiisasoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item miesoul = new item_ryusoul("miesoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item mabushisoul = new item_ryusoul("mabushisoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item kawaresoul = new item_ryusoul("kawaresoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	public static Item mysterysoul = new item_ryusoul("mysterysoul", 0, 0,"ryusoulger",1).setCreativeTab(Tabs.ryusoulger);
	
	public static Item ryusoul_ken = new ItemBaseSword("ryusoul_ken",Tabs.ryusoul_ken).setMaxStackSize(1).setCreativeTab(Tabs.ryusoulger);
	
	public static void init() {
	}

	//public static void init(){}
}



