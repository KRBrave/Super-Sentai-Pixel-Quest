package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.blocks.*;
import Kamen_Rider_Craft_4TH.blocks.portals.*;
import Kamen_Rider_Craft_4TH.blocks.custom.BlockType;
import Kamen_Rider_Craft_4TH.blocks.custom.CustomBlock;
import Kamen_Rider_Craft_4TH.item.*;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.Item_gashacon_breaker;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.Item_gashat;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aidarmor;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aidarmor2;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_poppy_gashat;
import Kamen_Rider_Craft_4TH.item.Ichigo.Item_showa_change;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor2;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.item.W.Item_memory;
import Kamen_Rider_Craft_4TH.item.W.Item_metal_shaft;
import Kamen_Rider_Craft_4TH.item.W.item_Wdriver;
import Kamen_Rider_Craft_4TH.item.W.item_warmor2;
import Kamen_Rider_Craft_4TH.item.agito.item_agitodriver;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsarmor;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsarmor2;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsdriver;
import Kamen_Rider_Craft_4TH.item.blade.ItemRouze_Cards;
import Kamen_Rider_Craft_4TH.item.blade.item_bladearmor;
import Kamen_Rider_Craft_4TH.item.blade.item_bladearmor2;
import Kamen_Rider_Craft_4TH.item.blade.item_bladedriver;
import Kamen_Rider_Craft_4TH.item.build.Item_full_bottle;
import Kamen_Rider_Craft_4TH.item.build.Item_nebulasteamgun;
import Kamen_Rider_Craft_4TH.item.build.Item_transteamgun;
import Kamen_Rider_Craft_4TH.item.build.item_buildarmor;
import Kamen_Rider_Craft_4TH.item.build.item_buildarmor2;
import Kamen_Rider_Craft_4TH.item.build.item_builddriver;
import Kamen_Rider_Craft_4TH.item.build.item_buildphone;
import Kamen_Rider_Craft_4TH.item.decade.Item_dienddriver;
import Kamen_Rider_Craft_4TH.item.decade.Itemrider_cards;
import Kamen_Rider_Craft_4TH.item.decade.item_decadearmor;
import Kamen_Rider_Craft_4TH.item.decade.item_decadearmor2;
import Kamen_Rider_Craft_4TH.item.decade.item_decadedriver;
import Kamen_Rider_Craft_4TH.item.deno.Itemdenkamen_sword;
import Kamen_Rider_Craft_4TH.item.deno.Itemrider_ticket;
import Kamen_Rider_Craft_4TH.item.deno.item_RiderPass;
import Kamen_Rider_Craft_4TH.item.deno.item_den_oarmor;
import Kamen_Rider_Craft_4TH.item.deno.item_den_oarmor2;
import Kamen_Rider_Craft_4TH.item.deno.item_den_odriver;
import Kamen_Rider_Craft_4TH.item.drive.Item_break_gunner;
import Kamen_Rider_Craft_4TH.item.drive.Item_lupin_gunner;
import Kamen_Rider_Craft_4TH.item.drive.Item_shift_car;
import Kamen_Rider_Craft_4TH.item.drive.item_drivearmor;
import Kamen_Rider_Craft_4TH.item.drive.item_drivearmor2;
import Kamen_Rider_Craft_4TH.item.drive.item_drivedriver;
import Kamen_Rider_Craft_4TH.item.faiz.Item_mission_memory;
import Kamen_Rider_Craft_4TH.item.faiz.item_faizarmor;
import Kamen_Rider_Craft_4TH.item.faiz.item_faizarmor2;
import Kamen_Rider_Craft_4TH.item.faiz.item_faizdriver;
import Kamen_Rider_Craft_4TH.item.fourze.Item_astroswitch;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzearmor;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzearmor2;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzedriver;
import Kamen_Rider_Craft_4TH.item.gaim.Item_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.Item_lockseed_Bike;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimarmor;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimarmor2;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimarmor3;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimdriver;
import Kamen_Rider_Craft_4TH.item.gaim.item_Sid_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.item_fake_donguri;
import Kamen_Rider_Craft_4TH.item.ghost.Item_ghost_Icons;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghost_armor2;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghost_armor3;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghostarmor;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghostdriver;
import Kamen_Rider_Craft_4TH.item.hibiki.Itemarmed_saber;
import Kamen_Rider_Craft_4TH.item.hibiki.Itemhibiki_stone;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikiarmor;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikiarmor2;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikidriver;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_clock_up_pad;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_zecter;
import Kamen_Rider_Craft_4TH.item.kabuto.item_kabutoarmor;
import Kamen_Rider_Craft_4TH.item.kabuto.item_kabutoarmor2;
import Kamen_Rider_Craft_4TH.item.kabuto.item_kabutodriver;
import Kamen_Rider_Craft_4TH.item.kiva.Itemfuestle;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivaarmor;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivaarmor2;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivadriver;
import Kamen_Rider_Craft_4TH.item.kuuga.Item_kuuga_mode_change_gun_im;
import Kamen_Rider_Craft_4TH.item.kuuga.Item_kuuga_mode_change_sword_im;
import Kamen_Rider_Craft_4TH.item.kuuga.item_kuugadriver;
import Kamen_Rider_Craft_4TH.item.ooo.Itemmedal;
import Kamen_Rider_Craft_4TH.item.ooo.Itemo_scanner;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOarmor;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOarmor2;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor2;
import Kamen_Rider_Craft_4TH.item.ryuki.Item_advent_cards;
import Kamen_Rider_Craft_4TH.item.ryuki.Item_vent;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukiarmor;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukiarmor2;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukidriver;
import Kamen_Rider_Craft_4TH.item.saber.Item_haouken_xross_saber;
import Kamen_Rider_Craft_4TH.item.saber.Item_wonder_ride_book;
import Kamen_Rider_Craft_4TH.item.saber.item_book_gate_wonder_ride_book;
import Kamen_Rider_Craft_4TH.item.saber.item_book_of_ruin;
import Kamen_Rider_Craft_4TH.item.saber.item_saberarmor_head;
import Kamen_Rider_Craft_4TH.item.saber.item_saberdriver;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_ring;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_rings_efts;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizardarmor;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizardarmor2;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizarddriver;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.item.zero_one.item_risephone;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onearmor;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onearmor2;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.item.zi_o.Item_blank_ridewatches2;
import Kamen_Rider_Craft_4TH.item.zi_o.Item_ridewatches;
import Kamen_Rider_Craft_4TH.item.zi_o.item_kodamawatch;
import Kamen_Rider_Craft_4TH.item.zi_o.item_ohma_advent_calendar;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zi_oarmor;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zi_oarmor2;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import Kamen_Rider_Craft_4TH.mobs.Boss.*;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntitySakuraHurricane;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

import static Kamen_Rider_Craft_4TH.blocks.custom.Property.TRANSPARENT;
import static Kamen_Rider_Craft_4TH.item.item_panel.PanelColor.*;

public class GaimItems {

	public static Item musou_saber = new ItemBaseSword("musou_saber",Tabs.musou_saber, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item musou_saber_naginata = new ItemBaseSword("musou_saber_naginata",Tabs.musou_saber_naginata, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item blood_musou_saber_naginata = new ItemBaseSword("blood_musou_saber_naginata",Tabs.musou_saber_naginata, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item musou_saber_kusarigama = new ItemBaseSword("musou_saber_kusarigama",Tabs.musou_saber_kusarigama, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item dj_gun = new Item_gun("dj_gun",Tabs.dj_gun, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item dj_gun_taiken_mode = new ItemBaseSword("dj_gun_taiken_mode",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item zangetsu_dj_gun = new Item_gun("zangetsu_dj_gun",Tabs.dj_gun, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item zangetsu_dj_gun_taiken_mode = new ItemBaseSword("zangetsu_dj_gun_taiken_mode",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    
    public static Item joeshuimu = new ItemBaseSword("joeshuimu",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sheimu = new ItemBaseSword("sheimu",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item dau = new ItemBaseSword("dau",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item guronbaryamu = new ItemBaseSword("guronbaryamu",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item shine_donkachi= new ItemBaseSword("shine_donkachi",Tabs.donkachi, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item shine_lychee_sword = new ItemBaseSword("shine_lychee_sword",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item hells_cane = new ItemBaseSword("hells_cane",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item kagematsu = new ItemBaseSword("kagematsu",Tabs.kagematsu, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item donkachi= new ItemBaseSword("donkachi",Tabs.donkachi, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item melon_defender = new ItemBaseShield("melon_defender", RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item pine_iron = new ItemBaseSword("pine_iron",Tabs.pine_iron, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item ichigo_kunai = new ItemBaseSword("ichigo_kunai",Tabs.ichigo_kunai, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item daidaimaru = new ItemBaseSword("daidaimaru",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item banana_spear= new ItemBaseSword("banana_spear",Tabs.banana_spear, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item budou_ryuhou = new Item_gun("budou_ryuhou",Tabs.budou_ryuhou, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item mango_punisher = new ItemBaseSword("mango_punisher",Tabs.mango_punisher, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item duri_noko = new ItemBaseSword("duri_noko",Tabs.duri_noko, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item kiwi_gekirin = new ItemBaseSword("kiwi_gekirin",Tabs.kiwi_gekirin, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sonic_arrow = new Item_gun("sonic_arrow",Tabs.sonic_arrow, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item kagematsu_shin = new ItemBaseSword("kagematsu_shin",Tabs.kagematsu_shin, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item suika_sojinto = new ItemBaseSword("suika_sojinto",Tabs.suika_sojinto, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item suika_sojinto_baron_ver = new ItemBaseSword("suika_sojinto_baron_ver",Tabs.suika_sojinto_baron_ver, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item suika_sojinto_knuckle_ver = new ItemBaseSword("suika_sojinto_knuckle_ver",Tabs.suika_sojinto_baron_ver, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item king_duri_noko = new ItemBaseSword("king_duri_noko",Tabs.duri_noko, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item blood_daidaimaru = new ItemBaseSword("blood_daidaimaru",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item yomimaru = new ItemBaseSword("yomimaru",Tabs.yomimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sword_bringer = new ItemBaseSword("sword_bringer",Tabs.sword_bringer, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item apple_reflecter = new ItemBaseShield("apple_reflecter", RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item lemon_rapier = new ItemBaseSword("lemon_rapier",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item souginjou = new ItemBaseSword("souginjou",Tabs.souginjou, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item dark_daidaimaru = new ItemBaseSword("dark_daidaimaru",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item watermelon_defender = new ItemBaseShield("watermelon_defender", RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item savior_arrow = new Item_gun("savior_arrow",Tabs.savior_arrow, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item kabi_daidaimaru = new ItemBaseSword("kabi_daidaimaru",ToolMaterial.WOOD, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item maja_yomimaru = new ItemBaseSword("maja_yomimaru",Tabs.yomimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);


    public static Item Gaimhead = new item_Gaimarmor3("gaimhead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item Gaimtroso = new item_Gaimarmor("gaimtroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item Gaimlegs = new item_Gaimarmor2("gaimlegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_matsubokkuri  = new Item_ore("sengoku_driver_matsubokkuri");
    public static Item sengoku_driver_kurumi  = new Item_ore("sengoku_driver_kurumi");
    public static Item sengoku_driver_donguri  = new Item_ore("sengoku_driver_donguri");
    public static Item sengoku_driver_melon  = new Item_ore("sengoku_driver_melon");
    public static Item sengoku_driver_pine  = new Item_ore("sengoku_driver_pine");
    public static Item sengoku_driver_ichigo  = new Item_ore("sengoku_driver_ichigo");
    public static Item sengoku_driver_orange  = new Item_ore("sengoku_driver_orange");
    public static Item sengoku_driver_banana  = new Item_ore("sengoku_driver_banana");
    public static Item sengoku_driver_budou = new Item_ore("sengoku_driver_budou");
    public static Item sengoku_driver_suika  = new Item_ore("sengoku_driver_suika");
    public static Item sengoku_driver_mango  = new Item_ore("sengoku_driver_mango");
    public static Item sengoku_driver_durian  = new Item_ore("sengoku_driver_durian");
    public static Item sengoku_driver_kiwi  = new Item_ore("sengoku_driver_kiwi");
    public static Item sengoku_driver_lemon  = new Item_ore("sengoku_driver_lemon");

    public static Item sengoku_driver_lemon_energy  = new Item_ore("sengoku_driver_lemon_energy");
    public static Item sengoku_driver_jinba_lemon = new Item_ore("sengoku_driver_jinba_lemon");
    public static Item lemon_energy_lockseed = new Item_lockseed(2,13,"lemon_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_cherry_energy  = new Item_ore("sengoku_driver_cherry_energy");
    public static Item sengoku_driver_jinba_cherry = new Item_ore("sengoku_driver_jinba_cherry");
    public static Item cherry_energy_lockseed = new Item_lockseed(2,14,"cherry_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_peach_energy  = new Item_ore("sengoku_driver_peach_energy");
    public static Item sengoku_driver_jinba_peach = new Item_ore("sengoku_driver_jinba_peach");
    public static Item peach_energy_lockseed = new Item_lockseed(2,15,"peach_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_melon_energy = new Item_ore("sengoku_driver_melon_energy");
    public static Item sengoku_driver_jinba_melon = new Item_ore("sengoku_driver_jinba_melon");
    public static Item sengoku_driver_jinba_melon_melon = new Item_ore("sengoku_driver_jinba_melon_melon");
    public static Item sengoku_driver_jinba_melon_durian = new Item_ore("sengoku_driver_jinba_melon_durian");
    public static Item melon_energy_lockseed = new Item_lockseed(2,16,"melon_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_matsubokkuri_energy  = new Item_ore("sengoku_driver_matsubokkuri_energy");
    public static Item matsubokkuri_energy_lockseed = new Item_lockseed(2,21,"matsubokkuri_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_jinba_dragon = new Item_ore("sengoku_driver_jinba_dragon");
    public static Item sengoku_driver_dragon_fruits_energy  = new Item_ore("sengoku_driver_dragon_fruits_energy");
    public static Item dragon_fruits_energy_lockseed = new Item_lockseed(2,42,"dragon_fruits_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_jinba_marron = new Item_ore("sengoku_driver_jinba_marron");
    public static Item marron_energy_lockseed = new Item_lockseed(2,46,"marron_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_kachidoki  = new Item_ore("sengoku_driver_kachidoki");
    public static Item kachidoki_lockseed  = new Item_lockseed(3,22,"kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kiwami = new Item_ore("sengoku_driver_kiwami");
    public static Item kiwami_lockseed  = new Item_lockseed(3,23,"kiwami_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_yomotsu_heguri  = new Item_ore("sengoku_driver_yomotsu_heguri");
    public static Item yomotsu_heguri_lockseed = new Item_lockseed(1,24,"yomotsu_heguri_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_blood_orange  = new Item_ore("sengoku_driver_blood_orange");
    public static Item blood_orange_lockseed = new Item_lockseed(1,25,"blood_orange_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fifteen_lock  = new Item_ore("sengoku_driver_fifteen_lock");
    public static Item fifteen_lockseed = new Item_lockseed(1,26,"fifteen_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_golden_ringo  = new Item_ore("sengoku_driver_golden_ringo");
    public static Item golden_ringo_lockseed = new Item_lockseed(1,27,"golden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_silver_ringo  = new Item_ore("sengoku_driver_silver_ringo");
    public static Item silver_ringo_lockseed = new Item_lockseed(1,28,"silver_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_black_ringo  = new Item_ore("sengoku_driver_black_ringo");
    public static Item black_ringo_lockseed = new Item_lockseed(1,29,"black_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_watermelon  = new Item_ore("sengoku_driver_watermelon");
    public static Item watermelon_lockseed = new Item_lockseed(1,30,"watermelon_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_forbidden_ringo  = new Item_ore("sengoku_driver_forbidden_ringo");
    public static Item forbidden_ringo_lockseed = new Item_lockseed(1,31,"forbidden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_blood_zakuro  = new Item_ore("sengoku_driver_blood_zakuro");
    public static Item zakuro_lockseed = new Item_lockseed(1,47,"zakuro_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_black_baron  = new Item_ore("sengoku_driver_black_baron");
    public static Item black_baron_lockseed  = new Item_lockseed(1,8,"black_baron_lockseed").setCreativeTab(Tabs.tabGaim);
    
    public static Item sengoku_driver_zangetsu_kachidoki  = new Item_ore("sengoku_driver_zangetsu_kachidoki");
    public static Item zangetsu_kachidoki_lockseed  = new Item_lockseed(3,65,"zangetsu_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_jinba_black  = new Item_ore("sengoku_driver_jinba_black");
    public static Item dark_orange_lockseed = new Item_lockseed(3,33,"dark_orange_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_lemon_energy_lockseed = new Item_lockseed(3,33,"dark_lemon_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_orange_fr  = new Item_ore("sengoku_driver_orange_fr");
    public static Item fresh_orange_lockseed = new Item_lockseed(1,44,"fresh_orange_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item fresh_pine_lockseed = new Item_ore("fresh_pine_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_natsumikan  = new Item_ore("sengoku_driver_natsumikan");
    public static Item natsumikan_lockseed = new Item_lockseed(1,63,"natsumikan_lockseed").setCreativeTab(Tabs.tabGaim);


    public static Item sengoku_driver_drive  = new Item_ore("sengoku_driver_drive");
    public static Item drive_lockseed  = new Item_lockseed(4,45,"drive_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_wizard  = new Item_ore("sengoku_driver_wizard");
    public static Item wizard_lockseed  = new Item_lockseed(4,34,"wizard_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fourze  = new Item_ore("sengoku_driver_fourze");
    public static Item fourze_lockseed  = new Item_lockseed(4,35,"fourze_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_ooo  = new Item_ore("sengoku_driver_ooo");
    public static Item ooo_lockseed  = new Item_lockseed(4,36,"ooo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_w  = new Item_ore("sengoku_driver_w");
    public static Item w_lockseed  = new Item_lockseed(4,37,"w_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_decade  = new Item_ore("sengoku_driver_decade");
    public static Item decade_lockseed  = new Item_lockseed(4,38,"decade_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_kuuga  = new Item_ore("sengoku_driver_kuuga");
    public static Item kuuga_lockseed  = new Item_lockseed(4,48,"kuuga_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_agito  = new Item_ore("sengoku_driver_agito");
    public static Item agito_lockseed  = new Item_lockseed(4,49,"agito_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_ryuki  = new Item_ore("sengoku_driver_ryuki");
    public static Item ryuki_lockseed  = new Item_lockseed(4,50,"ryuki_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_faiz  = new Item_ore("sengoku_driver_faiz");
    public static Item faiz_lockseed  = new Item_lockseed(4,51,"faiz_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_blade  = new Item_ore("sengoku_driver_blade");
    public static Item blade_lockseed  = new Item_lockseed(4,52,"blade_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_hibiki  = new Item_ore("sengoku_driver_hibiki");
    public static Item hibiki_lockseed  = new Item_lockseed(4,53,"hibiki_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_kaubuto  = new Item_ore("sengoku_driver_kabuto");
    public static Item kaubuto_lockseed  = new Item_lockseed(4,54,"kaubuto_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_den_o  = new Item_ore("sengoku_driver_den_o");
    public static Item den_o_lockseed  = new Item_lockseed(4,55,"den_o_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_kiva  = new Item_ore("sengoku_driver_kiva");
    public static Item kiva_lockseed  = new Item_lockseed(4,56,"kiva_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_gaim_lock  = new Item_ore("sengoku_driver_gaim_lock");
    public static Item gaim_lockseed  = new Item_lockseed(4,57,"gaim_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item gaim_lockseed_movie_special  = new Item_lockseed(4,57,"gaim_lockseed_movie_special").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_rider_ichigo  = new Item_ore("sengoku_driver_rider_ichigo");
    public static Item rider_ichigo_lockseed  = new Item_lockseed(4,39,"rider_ichigo_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item showa_rider_lockseed  = new Item_lockseed(4,39,"showa_rider_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item heisei_rider_lockseed  = new Item_lockseed(4,57,"heisei_rider_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_ryugen_yomi  = new Item_ore("sengoku_driver_ryugen_yomi");
    public static Item sengoku_driver_zangetsu_watermelon  = new Item_ore("sengoku_driver_zangetsu_watermelon");

    public static Item sengoku_driver_kabi_orange  = new Item_ore("sengoku_driver_kabi_orange");
    public static Item kabi_orange_lockseed  = new Item_lockseed(4,58,"kabi_orange_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_maja_lock  = new Item_ore("sengoku_driver_maja_lock");
    public static Item maja_lockseed  = new Item_lockseed(4,59,"maja_lockseed").setCreativeTab(Tabs.tabGaim);
    
    public static Item sengoku_driver_lychee  = new Item_ore("sengoku_driver_lychee");
    public static Item lychee_lockseed  = new Item_lockseed(4,96,"lychee_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_king_durian  = new Item_ore("sengoku_driver_king_durian");
    public static Item king_durian_lockseed  = new Item_lockseed(4,97,"king_durian_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_hells  = new Item_ore("sengoku_driver_hells");
    public static Item helheim_lockseed  = new Item_lockseed(4,98,"helheim_lockseed").setCreativeTab(Tabs.tabGaim);

    
    public static Item sengoku_driver_haljo_heguri  = new Item_ore("sengoku_driver_haljo_heguri");
    public static Item sengoku_driver_diyu_heguri  = new Item_ore("sengoku_driver_diyu_heguri");
    public static Item sengoku_driver_lucifer_heguri  = new Item_ore("sengoku_driver_lucifer_heguri");
    public static Item sengoku_driver_silver_lucifer_heguri  = new Item_ore("sengoku_driver_silver_lucifer_heguri");
    public static Item sengoku_driver_golden_lucifer_heguri  = new Item_ore("sengoku_driver_golden_lucifer_heguri");
    public static Item sengoku_driver_proto_nokuni_heguri  = new Item_ore("sengoku_driver_proto_nokuni_heguri");
    public static Item sengoku_driver_enma_heguri  = new Item_ore("sengoku_driver_enma_heguri");
    public static Item sengoku_driver_black_lucifer_heguri  = new Item_ore("sengoku_driver_black_lucifer_heguri");
    public static Item sengoku_driver_nether_heguri  = new Item_ore("sengoku_driver_nether_heguri");
    public static Item sengoku_driver_abyss_heguri  = new Item_ore("sengoku_driver_abyss_heguri");
    public static Item sengoku_driver_naraka_heguri  = new Item_ore("sengoku_driver_naraka_heguri");
    public static Item sengoku_driver_helreginn_heguri  = new Item_ore("sengoku_driver_helreginn_heguri");
    public static Item sengoku_driver_apollyon_heguri  = new Item_ore("sengoku_driver_apollyon_heguri");
    public static Item sengoku_driver_taishan_heguri  = new Item_ore("sengoku_driver_taishan_heguri");
    public static Item sengoku_driver_orcus_heguri  = new Item_ore("sengoku_driver_orcus_heguri");
    public static Item sengoku_driver_inferno_heguri  = new Item_ore("sengoku_driver_inferno_heguri");
    public static Item sengoku_driver_nokuni_heguri  = new Item_ore("sengoku_driver_nokuni_heguri");
    public static Item sengoku_driver_tartarus_heguri  = new Item_ore("sengoku_driver_tartarus_heguri");
    public static Item sengoku_driver_daimaoh_heguri  = new Item_ore("sengoku_driver_daimaoh_heguri");
    public static Item sengoku_driver_zetsubo_heguri  = new Item_ore("sengoku_driver_zetsubo_heguri");
    public static Item sengoku_driver_taizai_heguri  = new Item_ore("sengoku_driver_taizai_heguri");
    public static Item sengoku_driver_yomi_heguri  = new Item_ore("sengoku_driver_yomi_heguri");
    public static Item sengoku_driver_sin_heguri  = new Item_ore("sengoku_driver_sin_heguri");
    public static Item sengoku_driver_hades_heguri  = new Item_ore("sengoku_driver_hades_heguri");
    public static Item sengoku_driver_jigoku_heguri  = new Item_ore("sengoku_driver_jigoku_heguri");
    public static Item sengoku_driver_submondo_heguri  = new Item_ore("sengoku_driver_submondo_heguri");
    
    public static Item sengoku_driver_peach  = new Item_ore("sengoku_driver_peach");
    public static Item sengoku_driver_cherry  = new Item_ore("sengoku_driver_cherry");
    public static Item sengoku_driver_dragonfruit  = new Item_ore("sengoku_driver_dragonfruit");    
    public static Item sengoku_driver_marron  = new Item_ore("sengoku_driver_marron");
    public static Item sengoku_driver_himawari  = new Item_ore("sengoku_driver_himawari");
    public static Item sengoku_driver_zakuro  = new Item_ore("sengoku_driver_zakuro");
    
    public static Item sengoku_driver_gaim = new item_Gaimdriver("sengoku_driver_gaim",ArmorMaterial.DIAMOND, 4, 3,"gaim","orange_arms",0,sengoku_driver_orange).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_zangetsu = new item_Gaimdriver("sengoku_driver_zangetsu",ArmorMaterial.DIAMOND, 4, 3,"zangetsu","melon_arms",0,sengoku_driver_melon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_ryugen = new item_Gaimdriver("sengoku_driver_ryugen",ArmorMaterial.DIAMOND, 4, 3,"ryugen","budou_arms",0,sengoku_driver_budou).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_baron = new item_Gaimdriver("sengoku_driver_baron",ArmorMaterial.DIAMOND, 4, 3,"baron","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kurokage = new item_Gaimdriver("sengoku_driver_kurokage",ArmorMaterial.DIAMOND, 4, 3,"kurokage","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_gridon = new item_Gaimdriver("sengoku_driver_gridon",ArmorMaterial.DIAMOND, 4, 3,"gridon","donguri_arms",0,sengoku_driver_donguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_barvo = new item_Gaimdriver("sengoku_driver_barvo",ArmorMaterial.DIAMOND, 4, 3,"barvo","durian_arms",0,sengoku_driver_durian ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_knuckle = new item_Gaimdriver("sengoku_driver_knuckle",ArmorMaterial.DIAMOND, 4, 3,"knuckle","kurumi_arms",0,sengoku_driver_kurumi).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_bujin_gaim = new item_Gaimdriver("sengoku_driver_bujin_gaim",ArmorMaterial.DIAMOND, 4, 3,"bujin_gaim","blood_orange_arms",0,sengoku_driver_blood_orange).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fifteen = new item_Gaimdriver("sengoku_driver_fifteen",ArmorMaterial.DIAMOND, 4, 3,"fifteen","fifteen_arms",0,sengoku_driver_fifteen_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_mars = new item_Gaimdriver("sengoku_driver_mars",ArmorMaterial.DIAMOND, 4, 3,"mars","golden_arms",0,sengoku_driver_golden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kamuro = new item_Gaimdriver("sengoku_driver_kamuro",ArmorMaterial.DIAMOND, 4, 3,"kamuro","silver_arms",0,sengoku_driver_silver_ringo).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_jam = new item_Gaimdriver("sengoku_driver_jam",ArmorMaterial.DIAMOND, 4, 3,"jam","darkness_arms",0,sengoku_driver_black_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_kurokage_troopers = new item_Gaimdriver("sengoku_driver_kurokage_troopers",ArmorMaterial.DIAMOND, 4, 3,"kurokage_shin","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_idunn = new item_Gaimdriver("sengoku_driver_idunn",ArmorMaterial.DIAMOND, 4, 3,"idunn","ringo_arms",0,sengoku_driver_forbidden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_duke = new item_Gaimdriver("sengoku_driver_duke",ArmorMaterial.DIAMOND, 4, 3,"sengoku_duke","lemon_arms",0,sengoku_driver_lemon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_baron_black = new item_Gaimdriver("sengoku_driver_baron_black",ArmorMaterial.DIAMOND, 4, 3,"baron_black","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_savior = new item_Gaimdriver("sengoku_driver_savior",ArmorMaterial.DIAMOND, 4, 3,"savior","blood_zakuro_arms",0,sengoku_driver_blood_zakuro).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_sigurd = new item_Gaimdriver("sengoku_driver_sigurd",ArmorMaterial.DIAMOND, 4, 3,"sengoku_sigurd","cherry_arms",0,sengoku_driver_cherry).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_marika = new item_Gaimdriver("sengoku_driver_marika",ArmorMaterial.DIAMOND, 4, 3,"sengoku_marika","peach_arms",0,sengoku_driver_peach).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_tyrant = new item_Gaimdriver("sengoku_driver_tyrant",ArmorMaterial.DIAMOND, 4, 3,"sengoku_tyrant","dragonfruit_arms",0,sengoku_driver_dragonfruit).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_gaim_black = new item_Gaimdriver("sengoku_driver_gaim_black",ArmorMaterial.DIAMOND, 4, 3,"gaim_black","orange_arms",0,sengoku_driver_orange).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_zangetsu_black = new item_Gaimdriver("sengoku_driver_zangetsu_black",ArmorMaterial.DIAMOND, 4, 3,"zangetsu_black","melon_arms",0,sengoku_driver_melon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_ryugen_black = new item_Gaimdriver("sengoku_driver_ryugen_black",ArmorMaterial.DIAMOND, 4, 3,"ryugen_black","budou_arms",0,sengoku_driver_budou).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kurokage_black = new item_Gaimdriver("sengoku_driver_kurokage_black",ArmorMaterial.DIAMOND, 4, 3,"kurokage_black","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_gridon_black = new item_Gaimdriver("sengoku_driver_gridon_black",ArmorMaterial.DIAMOND, 4, 3,"gridon_black","donguri_arms",0,sengoku_driver_donguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_barvo_black = new item_Gaimdriver("sengoku_driver_barvo_black",ArmorMaterial.DIAMOND, 4, 3,"barvo_black","durian_arms",0,sengoku_driver_durian ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_knuckle_black = new item_Gaimdriver("sengoku_driver_knuckle_black",ArmorMaterial.DIAMOND, 4, 3,"knuckle_black","kurumi_arms",0,sengoku_driver_kurumi).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fifteen_black = new item_Gaimdriver("sengoku_driver_fifteen_black",ArmorMaterial.DIAMOND, 4, 3,"fifteen_black","fifteen_arms",0,sengoku_driver_fifteen_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_mars_black = new item_Gaimdriver("sengoku_driver_mars_black",ArmorMaterial.DIAMOND, 4, 3,"mars_black","golden_arms",0,sengoku_driver_golden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kamuro_black = new item_Gaimdriver("sengoku_driver_kamuro_black",ArmorMaterial.DIAMOND, 4, 3,"kamuro_black","silver_arms",0,sengoku_driver_silver_ringo).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_jam_black = new item_Gaimdriver("sengoku_driver_jam_black",ArmorMaterial.DIAMOND, 4, 3,"jam_black","darkness_arms",0,sengoku_driver_black_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_idunn_black = new item_Gaimdriver("sengoku_driver_idunn_black",ArmorMaterial.DIAMOND, 4, 3,"idunn_black","ringo_arms",0,sengoku_driver_forbidden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_duke_black = new item_Gaimdriver("sengoku_driver_duke_black",ArmorMaterial.DIAMOND, 4, 3,"sengoku_duke_black","lemon_arms",0,sengoku_driver_lemon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_savior_black = new item_Gaimdriver("sengoku_driver_savior_black",ArmorMaterial.DIAMOND, 4, 3,"savior_black","blood_zakuro_arms",0,sengoku_driver_blood_zakuro).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_sigurd_black = new item_Gaimdriver("sengoku_driver_sigurd_black",ArmorMaterial.DIAMOND, 4, 3,"sengoku_sigurd_black","cherry_arms",0,sengoku_driver_cherry).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_marika_black = new item_Gaimdriver("sengoku_driver_marika_black",ArmorMaterial.DIAMOND, 4, 3,"sengoku_marika_black","peach_arms",0,sengoku_driver_peach).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_tyrant_black = new item_Gaimdriver("sengoku_driver_tyrant_black",ArmorMaterial.DIAMOND, 4, 3,"sengoku_tyrant_black","dragonfruit_arms",0,sengoku_driver_dragonfruit).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);     
    public static Item sengoku_driver_maja_black = new item_Gaimdriver("sengoku_driver_maja_black",ArmorMaterial.DIAMOND, 4, 3,"maja_black","maja_arms",0,sengoku_driver_maja_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_gaim_watermelon = new item_Gaimdriver("sengoku_driver_gaim_watermelon",ArmorMaterial.DIAMOND, 4, 3,"gaim_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_ryugen_watermelon = new item_Gaimdriver("sengoku_driver_ryugen_watermelon",ArmorMaterial.DIAMOND, 4, 3,"ryugen_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_baron_watermelon = new item_Gaimdriver("sengoku_driver_baron_watermelon",ArmorMaterial.DIAMOND, 4, 3,"baron_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kurokage_watermelon = new item_Gaimdriver("sengoku_driver_kurokage_watermelon",ArmorMaterial.DIAMOND, 4, 3,"kurokage_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_gridon_watermelon = new item_Gaimdriver("sengoku_driver_gridon_watermelon",ArmorMaterial.DIAMOND, 4, 3,"gridon_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_barvo_watermelon = new item_Gaimdriver("sengoku_driver_barvo_watermelon",ArmorMaterial.DIAMOND, 4, 3,"barvo_watermelon","watermelon_arms",0,sengoku_driver_watermelon ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_knuckle_watermelon = new item_Gaimdriver("sengoku_driver_knuckle_watermelon",ArmorMaterial.DIAMOND, 4, 3,"knuckle_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fifteen_watermelon = new item_Gaimdriver("sengoku_driver_fifteen_watermelon",ArmorMaterial.DIAMOND, 4, 3,"fifteen_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_mars_watermelon = new item_Gaimdriver("sengoku_driver_mars_watermelon",ArmorMaterial.DIAMOND, 4, 3,"mars_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kamuro_watermelon = new item_Gaimdriver("sengoku_driver_kamuro_watermelon",ArmorMaterial.DIAMOND, 4, 3,"kamuro_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_jam_watermelon = new item_Gaimdriver("sengoku_driver_jam_watermelon",ArmorMaterial.DIAMOND, 4, 3,"jam_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_idunn_watermelon = new item_Gaimdriver("sengoku_driver_idunn_watermelon",ArmorMaterial.DIAMOND, 4, 3,"idunn_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_duke_watermelon = new item_Gaimdriver("sengoku_driver_duke_watermelon",ArmorMaterial.DIAMOND, 4, 3,"duke_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_savior_watermelon = new item_Gaimdriver("sengoku_driver_savior_watermelon",ArmorMaterial.DIAMOND, 4, 3,"savior_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_sigurd_watermelon = new item_Gaimdriver("sengoku_driver_sigurd_watermelon",ArmorMaterial.DIAMOND, 4, 3,"sigurd_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_marika_watermelon = new item_Gaimdriver("sengoku_driver_marika_watermelon",ArmorMaterial.DIAMOND, 4, 3,"marika_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_tyrant_watermelon = new item_Gaimdriver("sengoku_driver_tyrant_watermelon",ArmorMaterial.DIAMOND, 4, 3,"tyrant_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_maja_watermelon = new item_Gaimdriver("sengoku_driver_maja_watermelon",ArmorMaterial.DIAMOND, 4, 3,"maja_watermelon","watermelon_arms",0,sengoku_driver_watermelon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_gaim_yomi = new item_Gaimdriver("sengoku_driver_gaim_yomi",ArmorMaterial.DIAMOND, 4, 3,"gaim_yomi","daimaoh_heguri_arms",0,sengoku_driver_daimaoh_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_zangetsu_yomi = new item_Gaimdriver("sengoku_driver_zangetsu_yomi",ArmorMaterial.DIAMOND, 4, 3,"zangetsu_yomi","yomi_heguri_arms",0,sengoku_driver_yomi_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kurokage_yomi = new item_Gaimdriver("sengoku_driver_kurokage_yomi",ArmorMaterial.DIAMOND, 4, 3,"kurokage_yomi","jigoku_heguri_arms",0,sengoku_driver_jigoku_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_gridon_yomi = new item_Gaimdriver("sengoku_driver_gridon_yomi",ArmorMaterial.DIAMOND, 4, 3,"gridon_yomi","sin_heguri_arms",0,sengoku_driver_sin_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_barvo_yomi = new item_Gaimdriver("sengoku_driver_barvo_yomi",ArmorMaterial.DIAMOND, 4, 3,"barvo_yomi","orcus_heguri_arms",0,sengoku_driver_orcus_heguri ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_knuckle_yomi = new item_Gaimdriver("sengoku_driver_knuckle_yomi",ArmorMaterial.DIAMOND, 4, 3,"knuckle_yomi","hades_heguri_arms",0,sengoku_driver_hades_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fifteen_yomi = new item_Gaimdriver("sengoku_driver_fifteen_yomi",ArmorMaterial.DIAMOND, 4, 3,"fifteen_yomi","yomotsu_heguri_arms",0,sengoku_driver_yomotsu_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_mars_yomi = new item_Gaimdriver("sengoku_driver_mars_yomi",ArmorMaterial.DIAMOND, 4, 3,"mars_yomi","golden_lucifer_heguri_arms",0,sengoku_driver_golden_lucifer_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kamuro_yomi = new item_Gaimdriver("sengoku_driver_kamuro_yomi",ArmorMaterial.DIAMOND, 4, 3,"kamuro_yomi","silver_lucifer_heguri_arms",0,sengoku_driver_silver_lucifer_heguri).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_jam_yomi = new item_Gaimdriver("sengoku_driver_jam_yomi",ArmorMaterial.DIAMOND, 4, 3,"jam_yomi","black_lucifer_heguri_arms",0,sengoku_driver_black_lucifer_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_idunn_yomi = new item_Gaimdriver("sengoku_driver_idunn_yomi",ArmorMaterial.DIAMOND, 4, 3,"idunn_yomi","lucifer_heguri_arms",0,sengoku_driver_lucifer_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_duke_yomi = new item_Gaimdriver("sengoku_driver_duke_yomi",ArmorMaterial.DIAMOND, 4, 3,"duke_yomi","nether_heguri_arms",0,sengoku_driver_nether_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_savior_yomi = new item_Gaimdriver("sengoku_driver_savior_yomi",ArmorMaterial.DIAMOND, 4, 3,"savior_yomi","enma_heguri_arms",0,sengoku_driver_enma_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_sigurd_yomi = new item_Gaimdriver("sengoku_driver_sigurd_yomi",ArmorMaterial.DIAMOND, 4, 3,"sigurd_yomi","helreginn_heguri_arms",0,sengoku_driver_helreginn_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_marika_yomi = new item_Gaimdriver("sengoku_driver_marika_yomi",ArmorMaterial.DIAMOND, 4, 3,"marika_yomi","naraka_heguri_arms",0,sengoku_driver_naraka_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_tyrant_yomi = new item_Gaimdriver("sengoku_driver_tyrant_yomi",ArmorMaterial.DIAMOND, 4, 3,"tyrant_yomi","diyu_heguri_arms",0,sengoku_driver_diyu_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);        
    public static Item sengoku_driver_maja_yomi = new item_Gaimdriver("sengoku_driver_maja_yomi",ArmorMaterial.DIAMOND, 4, 3,"maja_yomi","maja_arms",0,sengoku_driver_maja_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_baron_yomi = new item_Gaimdriver("sengoku_driver_baron_yomi",ArmorMaterial.DIAMOND, 4, 3,"baron_yomi","tartarus_heguri_arms",0,sengoku_driver_tartarus_heguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    
    public static Item sengoku_driver_maja = new item_Gaimdriver("sengoku_driver_maja",ArmorMaterial.DIAMOND, 4, 3,"maja","maja_arms",0,sengoku_driver_maja_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_proto_gaim = new item_Gaimdriver("sengoku_driver_proto_gaim",ArmorMaterial.DIAMOND, 4, 3,"proto_gaim","orange_arms",0,sengoku_driver_orange).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_ryugen = new item_Gaimdriver("sengoku_driver_proto_ryugen",ArmorMaterial.DIAMOND, 4, 3,"proto_ryugen","budou_arms",0,sengoku_driver_budou).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_baron = new item_Gaimdriver("sengoku_driver_proto_baron",ArmorMaterial.DIAMOND, 4, 3,"proto_baron","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_gridon = new item_Gaimdriver("sengoku_driver_proto_gridon",ArmorMaterial.DIAMOND, 4, 3,"proto_gridon","donguri_arms",0,sengoku_driver_donguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_barvo = new item_Gaimdriver("sengoku_driver_proto_barvo",ArmorMaterial.DIAMOND, 4, 3,"proto_barvo","durian_arms",0,sengoku_driver_durian ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_zangetsu = new item_Gaimdriver("sengoku_driver_proto_zangetsu",ArmorMaterial.DIAMOND, 4, 3,"proto_zangetsu","melon_arms",0,sengoku_driver_melon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_kurokage = new item_Gaimdriver("sengoku_driver_proto_kurokage",ArmorMaterial.DIAMOND, 4, 3,"proto_kurokage","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_knuckle = new item_Gaimdriver("sengoku_driver_proto_knuckle",ArmorMaterial.DIAMOND, 4, 3,"proto_knuckle","kurumi_arms",0,sengoku_driver_kurumi).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_fifteen = new item_Gaimdriver("sengoku_driver_proto_fifteen",ArmorMaterial.DIAMOND, 4, 3,"proto_fifteen","fifteen_arms",0,sengoku_driver_fifteen_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_mars = new item_Gaimdriver("sengoku_driver_proto_mars",ArmorMaterial.DIAMOND, 4, 3,"proto_mars","golden_arms",0,sengoku_driver_golden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_kamuro = new item_Gaimdriver("sengoku_driver_proto_kamuro",ArmorMaterial.DIAMOND, 4, 3,"proto_kamuro","silver_arms",0,sengoku_driver_silver_ringo).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_jam = new item_Gaimdriver("sengoku_driver_proto_jam",ArmorMaterial.DIAMOND, 4, 3,"proto_jam","darkness_arms",0,sengoku_driver_black_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_idunn = new item_Gaimdriver("sengoku_driver_proto_idunn",ArmorMaterial.DIAMOND, 4, 3,"proto_idunn","ringo_arms",0,sengoku_driver_forbidden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_duke = new item_Gaimdriver("sengoku_driver_proto_duke",ArmorMaterial.DIAMOND, 4, 3,"proto_duke","lemon_arms",0,sengoku_driver_lemon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_savior = new item_Gaimdriver("sengoku_driver_proto_savior",ArmorMaterial.DIAMOND, 4, 3,"proto_savior","blood_zakuro_arms",0,sengoku_driver_blood_zakuro).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_sigurd = new item_Gaimdriver("sengoku_driver_proto_sigurd",ArmorMaterial.DIAMOND, 4, 3,"proto_sigurd","cherry_arms",0,sengoku_driver_cherry).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_marika = new item_Gaimdriver("sengoku_driver_proto_marika",ArmorMaterial.DIAMOND, 4, 3,"proto_marika","peach_arms",0,sengoku_driver_peach).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_tyrant = new item_Gaimdriver("sengoku_driver_proto_tyrant",ArmorMaterial.DIAMOND, 4, 3,"proto_tyrant","dragonfruit_arms",0,sengoku_driver_dragonfruit).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);     
    public static Item sengoku_driver_proto_maja = new item_Gaimdriver("sengoku_driver_proto_maja",ArmorMaterial.DIAMOND, 4, 3,"proto_maja","maja_arms",0,sengoku_driver_maja_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_proto_sylphi = new item_Gaimdriver("sengoku_driver_proto_sylphi",ArmorMaterial.DIAMOND, 4, 3,"proto_sylphi","hells_arms",0,sengoku_driver_hells).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item sengoku_driver_sylphi = new item_Gaimdriver("sengoku_driver_sylphi",ArmorMaterial.DIAMOND, 4, 3,"sylphi","hells_arms",0,sengoku_driver_hells).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item sengoku_driver_gaim_natsumikan = new item_Gaimdriver("sengoku_driver_gaim_natsumikan",ArmorMaterial.DIAMOND, 4, 3,"gaim_natsumikan","natsumikan_arms",0,sengoku_driver_natsumikan).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item genesis_driver_zangetsu_shin = new item_Gaimdriver("genesis_driver_zangetsu_shin",ArmorMaterial.DIAMOND, 4, 3,"zangetsu_shin","energy_melon_arms",1,sengoku_driver_melon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_duke = new item_Gaimdriver("genesis_driver_duke",ArmorMaterial.DIAMOND, 4, 3,"duke","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_sigurd = new item_Gaimdriver("genesis_driver_sigurd",ArmorMaterial.DIAMOND, 4, 3,"sigurd","energy_cherry_arms",1,sengoku_driver_cherry_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_marika = new item_Gaimdriver("genesis_driver_marika",ArmorMaterial.DIAMOND, 4, 3,"marika","energy_peach_arms",1,sengoku_driver_peach_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_baron = new item_Gaimdriver("genesis_driver_baron",ArmorMaterial.DIAMOND, 4, 3,"baron_shin","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_kurokage_shin = new item_Gaimdriver("genesis_driver_kurokage_shin",ArmorMaterial.DIAMOND, 4, 3,"kurokage_shin","energy_matsubokkuri_arms",1,sengoku_driver_matsubokkuri_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_tyrant = new item_Gaimdriver("genesis_driver_tyrant",ArmorMaterial.DIAMOND, 4, 3,"tyrant","energy_prototype_dragon_fruits_arms",1,sengoku_driver_dragon_fruits_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item matsubokkuri_lockseed = new Item_lockseed(1,1,"matsubokkuri_lockseed").AddlockseedToHelheimVine(20).setCreativeTab(Tabs.tabGaim);
    public static Item kurumi_lockseed = new Item_lockseed(1,2,"kurumi_lockseed").AddlockseedToHelheimVine(20).setCreativeTab(Tabs.tabGaim);
    public static Item donguri_lockseed = new Item_lockseed(1,3,"donguri_lockseed").AddlockseedToHelheimVine(20).setCreativeTab(Tabs.tabGaim);
    public static Item melon_lockseed = new Item_lockseed(1,4,"melon_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
    public static Item pine_lockseed = new Item_lockseed(1,5,"pine_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
    public static Item ichigo_lockseed = new Item_lockseed(1,6,"ichigo_lockseed").AddlockseedToHelheimVine(7).setCreativeTab(Tabs.tabGaim);
    public static Item orange_lockseed = new Item_lockseed(1,7,"orange_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
    public static Item banana_lockseed = new Item_lockseed(1,8,"banana_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
    public static Item budou_lockseed = new Item_lockseed(1,9,"budou_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
    public static Item suika_lockseed = new Item_lockseed(1,40,"suika_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);
    public static Item mango_lockseed = new Item_lockseed(1,10,"mango_lockseed").AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
    public static Item durian_lockseed = new Item_lockseed(1,11,"durian_lockseed").AddlockseedToHelheimVine(6).setCreativeTab(Tabs.tabGaim);
    public static Item kiwi_lockseed = new Item_lockseed(1,12,"kiwi_lockseed").AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
    public static Item lemon_lockseed = new Item_lockseed(1,41,"lemon_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sakura_hurricane = new Item_lockseed_Bike("sakura_hurricane",0).AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
    public static Item rose_attacker = new Item_lockseed_Bike("rose_attacker",1).AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
    public static Item dandeliner = new Item_ore("dandeliner").setCreativeTab(Tabs.tabGaim);
    public static Item tulip_hopper = new Item_ore("tulip_hopper").setCreativeTab(Tabs.tabGaim);

    public static Item christmas_lockseed = new Item_ore("christmas_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item roulette_lockseed = new Item_ore("roulette_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item fake_donguri_lockseed = new item_fake_donguri("fake_donguri_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sid_lockseed = new item_Sid_lockseed("sid_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item xiaolongbao_lockseed = new Item_ore("xiaolongbao_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item hsiao_lung_pao_lockseed = new Item_ore("hsiao_lung_pao_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item tom_yum_kung_lockseed = new Item_ore("tom_yum_kung_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item yummy_lockseed = new Item_ore("yummy_lockseed").setCreativeTab(Tabs.tabGaim);    
    public static Item hero_lockseed = new Item_ore("hero_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item drained_suika_lockseed = new Item_ore("drained_suika_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item lord_baron_boss_block_part1 = new Item_ore("lord_baron_boss_block_part1").setCreativeTab(Tabs.tabGaim);
    public static Item lord_baron_boss_block_part2 = new Item_ore("lord_baron_boss_block_part2").setCreativeTab(Tabs.tabGaim);
    public static Item lord_baron_boss_block_part3 = new Item_ore("lord_baron_boss_block_part3").setCreativeTab(Tabs.tabGaim);
    
    public static Item haljo_heguri_lockseed = new Item_lockseed(1,66,"haljo_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item diyu_heguri_lockseed = new Item_lockseed(1,67,"diyu_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item lucifer_heguri_lockseed = new Item_lockseed(1,68,"lucifer_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item silver_lucifer_heguri_lockseed = new Item_lockseed(1,69,"silver_lucifer_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item golden_lucifer_heguri_lockseed = new Item_lockseed(1,70,"golden_lucifer_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item proto_nokuni_heguri_lockseed = new Item_lockseed(1,71,"proto_nokuni_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item enma_heguri_lockseed = new Item_lockseed(1,72,"enma_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item black_lucifer_heguri_lockseed = new Item_lockseed(1,73,"black_lucifer_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item nether_heguri_lockseed = new Item_lockseed(1,74,"nether_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item abyss_heguri_lockseed = new Item_lockseed(1,75,"abyss_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item naraka_heguri_lockseed = new Item_lockseed(1,76,"naraka_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item helreginn_heguri_lockseed = new Item_lockseed(1,77,"helreginn_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item apollyon_heguri_lockseed = new Item_lockseed(1,78,"apollyon_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item taishan_heguri_lockseed = new Item_lockseed(1,79,"taishan_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item orcus_heguri_lockseed = new Item_lockseed(1,80,"orcus_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item inferno_heguri_lockseed = new Item_lockseed(1,81,"inferno_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item nokuni_heguri_lockseed = new Item_lockseed(1,82,"nokuni_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item tartarus_heguri_lockseed = new Item_lockseed(1,83,"tartarus_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item daimaoh_heguri_lockseed = new Item_lockseed(1,84,"daimaoh_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item zetsubo_heguri_lockseed = new Item_lockseed(1,85,"zetsubo_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item taizai_heguri_lockseed = new Item_lockseed(1,86,"taizai_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item yomi_heguri_lockseed = new Item_lockseed(1,87,"yomi_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sin_heguri_lockseed = new Item_lockseed(1,88,"sin_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item hades_heguri_lockseed = new Item_lockseed(1,89,"hades_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item jigoku_heguri_lockseed = new Item_lockseed(1,90,"jigoku_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item submondo_heguri_lockseed = new Item_lockseed(1,91,"submondo_heguri_lockseed").setCreativeTab(Tabs.tabGaim);
    
    public static Item cherry_lockseed = new Item_lockseed(1,92,"cherry_lockseed").setCreativeTab(Tabs.tabGaim);    
    public static Item dragonfruit_lockseed = new Item_lockseed(1,93,"dragonfruit_lockseed").setCreativeTab(Tabs.tabGaim);  
    public static Item marron_lockseed = new Item_lockseed(1,94,"marron_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item peach_lockseed = new Item_lockseed(1,95,"peach_lockseed").setCreativeTab(Tabs.tabGaim);  
    
	public static void init() {
	}

	//public static void init(){}
}



