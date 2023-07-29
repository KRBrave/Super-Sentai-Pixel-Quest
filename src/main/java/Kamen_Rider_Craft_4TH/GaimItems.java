package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.item.*;
import Kamen_Rider_Craft_4TH.item.gaim.Item_kiwami_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.Item_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.Item_lockseed_Bike;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimdriver;
import Kamen_Rider_Craft_4TH.item.gaim.item_Sid_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.item_fake_donguri;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_hyper_zecter;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class GaimItems {

	public static Item himawari_lockseed = new Item_ore("himawari_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item himawari_energy_lockseed = new Item_ore("himawari_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item musou_saber = new ItemBaseSword("musou_saber",Tabs.musou_saber, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item musou_saber_naginata = new ItemBaseSword("musou_saber_naginata",Tabs.musou_saber_naginata, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item blood_musou_saber_naginata = new ItemBaseSword("blood_musou_saber_naginata",Tabs.musou_saber_naginata, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item musou_saber_kusarigama = new ItemBaseSword("musou_saber_kusarigama",Tabs.musou_saber_kusarigama, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item dj_gun = new Item_gun("dj_gun",Tabs.dj_gun, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item dj_gun_taiken_mode = new ItemBaseSword("dj_gun_taiken_mode",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item zangetsu_dj_gun = new Item_gun("zangetsu_dj_gun",Tabs.dj_gun, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item zangetsu_dj_gun_taiken_mode = new ItemBaseSword("zangetsu_dj_gun_taiken_mode",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    
    public static Item joeshuimu = new ItemBaseSword("joeshuimu",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sheimu = new ItemBaseSword("sheimu",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item dau = new ItemBaseSword("dau",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item guronbaryamu = new ItemBaseSword("guronbaryamu",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item shine_donkachi= new ItemBaseSword("shine_donkachi",Tabs.donkachi, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item shine_lychee_sword = new ItemBaseSword("shine_lychee_sword",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item hells_cane = new ItemBaseSword("hells_cane",Tabs.dj_gun_taiken_mode, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item kagematsu = new ItemBaseSword("kagematsu",Tabs.kagematsu, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item donkachi= new ItemBaseSword("donkachi",Tabs.donkachi, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item melon_defender = new ItemBaseShield("melon_defender", GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item pine_iron = new ItemBaseSword("pine_iron",Tabs.pine_iron, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item ichigo_kunai = new ItemBaseSword("ichigo_kunai",Tabs.ichigo_kunai, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item daidaimaru = new ItemBaseSword("daidaimaru",Tabs.daidaimaru, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item banana_spear= new ItemBaseSword("banana_spear",Tabs.banana_spear, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item budou_ryuhou = new Item_gun("budou_ryuhou",Tabs.budou_ryuhou, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item mango_punisher = new ItemBaseSword("mango_punisher",Tabs.mango_punisher, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item duri_noko = new ItemBaseSword("duri_noko",Tabs.duri_noko, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item kiwi_gekirin = new ItemBaseSword("kiwi_gekirin",Tabs.kiwi_gekirin, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sonic_arrow = new Item_gun("sonic_arrow",Tabs.sonic_arrow, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item kagematsu_shin = new ItemBaseSword("kagematsu_shin",Tabs.kagematsu_shin, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item suika_sojinto = new ItemBaseSword("suika_sojinto",Tabs.suika_sojinto, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item suika_sojinto_baron_ver = new ItemBaseSword("suika_sojinto_baron_ver",Tabs.suika_sojinto_baron_ver, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item suika_sojinto_knuckle_ver = new ItemBaseSword("suika_sojinto_knuckle_ver",Tabs.suika_sojinto_baron_ver, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item king_duri_noko = new ItemBaseSword("king_duri_noko",Tabs.duri_noko, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item blood_daidaimaru = new ItemBaseSword("blood_daidaimaru",Tabs.daidaimaru, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item yomimaru = new ItemBaseSword("yomimaru",Tabs.yomimaru, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sword_bringer = new ItemBaseSword("sword_bringer",Tabs.sword_bringer, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item apple_reflecter = new ItemBaseShield("apple_reflecter", GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item lemon_rapier = new ItemBaseSword("lemon_rapier",Tabs.daidaimaru, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
    public static Item souginjou = new ItemBaseSword("souginjou",Tabs.souginjou, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item dark_daidaimaru = new ItemBaseSword("dark_daidaimaru",Tabs.daidaimaru, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item watermelon_defender = new ItemBaseShield("watermelon_defender", GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item savior_arrow = new Item_gun("savior_arrow",Tabs.savior_arrow, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item kabi_daidaimaru = new ItemBaseSword("kabi_daidaimaru",ToolMaterial.WOOD, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item maja_yomimaru = new ItemBaseSword("maja_yomimaru",Tabs.yomimaru, GaimItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);


    public static Item Gaimhead = new item_rider_armor("gaimhead",item_Gaimdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, himawari_lockseed).setCreativeTab(Tabs.tabGaim);
	public static Item Gaimtroso = new item_rider_armor("gaimtroso",item_Gaimdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, himawari_lockseed).setCreativeTab(Tabs.tabGaim);
	public static Item Gaimlegs = new item_rider_armor("gaimlegs",item_Gaimdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, himawari_lockseed).setCreativeTab(Tabs.tabGaim);

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
    public static Item black_baron_lockseed  = new Item_lockseed(1,8,"black_baron_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    
    public static Item sengoku_driver_zangetsu_kachidoki  = new Item_ore("sengoku_driver_zangetsu_kachidoki");
    public static Item zangetsu_kachidoki_lockseed  = new Item_lockseed(3,65,"zangetsu_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_zangetsu_kiwami = new Item_ore("sengoku_driver_zangetsu_kiwami");
    
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

    public static Item sengoku_driver_zangetsu_yomi  = new Item_ore("sengoku_driver_zangetsu_yomi");
    public static Item sengoku_driver_ryugen_watermelon  = new Item_ore("sengoku_driver_ryugen_watermelon");
    public static Item sengoku_driver_gaim_yomi  = new Item_ore("sengoku_driver_gaim_yomi");
    public static Item sengoku_driver_gaim_watermelon  = new Item_ore("sengoku_driver_gaim_watermelon");
    public static Item sengoku_driver_baron_yomi  = new Item_ore("sengoku_driver_baron_yomi");
    public static Item sengoku_driver_baron_watermelon  = new Item_ore("sengoku_driver_baron_watermelon");
    public static Item sengoku_driver_barvo_yomi  = new Item_ore("sengoku_driver_barvo_yomi");
    public static Item sengoku_driver_barvo_watermelon  = new Item_ore("sengoku_driver_barvo_watermelon");
    public static Item sengoku_driver_kurokage_yomi  = new Item_ore("sengoku_driver_kurokage_yomi");
    public static Item sengoku_driver_kurokage_watermelon  = new Item_ore("sengoku_driver_kurokage_watermelon");
    public static Item sengoku_driver_gridon_yomi  = new Item_ore("sengoku_driver_gridon_yomi");
    public static Item sengoku_driver_gridon_watermelon  = new Item_ore("sengoku_driver_gridon_watermelon");
    public static Item sengoku_driver_knuckle_yomi  = new Item_ore("sengoku_driver_knuckle_yomi");
    public static Item sengoku_driver_knuckle_watermelon  = new Item_ore("sengoku_driver_knuckle_watermelon");
    public static Item sengoku_driver_fifteen_yomi  = new Item_ore("sengoku_driver_fifteen_yomi");
    public static Item sengoku_driver_fifteen_watermelon  = new Item_ore("sengoku_driver_fifteen_watermelon");
    public static Item sengoku_driver_mars_yomi  = new Item_ore("sengoku_driver_mars_yomi");
    public static Item sengoku_driver_mars_watermelon  = new Item_ore("sengoku_driver_mars_watermelon");
    public static Item sengoku_driver_kamuro_yomi  = new Item_ore("sengoku_driver_kamuro_yomi");
    public static Item sengoku_driver_kamuro_watermelon  = new Item_ore("sengoku_driver_kamuro_watermelon");
    public static Item sengoku_driver_jam_yomi  = new Item_ore("sengoku_driver_jam_yomi");
    public static Item sengoku_driver_jam_watermelon  = new Item_ore("sengoku_driver_jam_watermelon");
    public static Item sengoku_driver_idunn_yomi  = new Item_ore("sengoku_driver_idunn_yomi");
    public static Item sengoku_driver_idunn_watermelon  = new Item_ore("sengoku_driver_idunn_watermelon");
    public static Item sengoku_driver_duke_yomi  = new Item_ore("sengoku_driver_duke_yomi");
    public static Item sengoku_driver_duke_watermelon  = new Item_ore("sengoku_driver_duke_watermelon");
    public static Item sengoku_driver_savior_yomi  = new Item_ore("sengoku_driver_savior_yomi");
    public static Item sengoku_driver_savior_watermelon  = new Item_ore("sengoku_driver_savior_watermelon");
    public static Item sengoku_driver_sigurd_yomi  = new Item_ore("sengoku_driver_sigurd_yomi");
    public static Item sengoku_driver_sigurd_watermelon  = new Item_ore("sengoku_driver_sigurd_watermelon");
    public static Item sengoku_driver_marika_yomi  = new Item_ore("sengoku_driver_marika_yomi");
    public static Item sengoku_driver_marika_watermelon  = new Item_ore("sengoku_driver_marika_watermelon");
    public static Item sengoku_driver_tyrant_yomi  = new Item_ore("sengoku_driver_tyrant_yomi");
    public static Item sengoku_driver_tyrant_watermelon  = new Item_ore("sengoku_driver_tyrant_watermelon");
    public static Item sengoku_driver_maja_yomi  = new Item_ore("sengoku_driver_maja_yomi");
    public static Item sengoku_driver_maja_watermelon  = new Item_ore("sengoku_driver_maja_watermelon");
    public static Item sengoku_driver_sylphi_yomi  = new Item_ore("sengoku_driver_sylphi_yomi");
    public static Item sengoku_driver_sylphi_watermelon  = new Item_ore("sengoku_driver_sylphi_watermelon");
    
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
    public static Item sengoku_driver_marika_black = new item_Gaimdriver("sengoku_driver_marika_black",ArmorMaterial.DIAMOND, 4, 3,"marika_black","peach_arms",0,sengoku_driver_peach).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_tyrant_black = new item_Gaimdriver("sengoku_driver_tyrant_black",ArmorMaterial.DIAMOND, 4, 3,"sengoku_tyrant_black","dragonfruit_arms",0,sengoku_driver_dragonfruit).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);     
    public static Item sengoku_driver_maja_black = new item_Gaimdriver("sengoku_driver_maja_black",ArmorMaterial.DIAMOND, 4, 3,"maja_black","maja_arms",0,sengoku_driver_maja_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_sylphi_black = new item_Gaimdriver("sengoku_driver_sylphi_black",ArmorMaterial.DIAMOND, 4, 3,"sylphi_black","hells_arms",0,sengoku_driver_hells).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    
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
    
    public static Item cherry_lockseed = new Item_lockseed(1,92,"cherry_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);    
    public static Item dragonfruit_lockseed = new Item_lockseed(1,93,"dragonfruit_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);  
    public static Item marron_lockseed = new Item_lockseed(1,94,"marron_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);
    public static Item peach_lockseed = new Item_lockseed(1,95,"peach_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);  
    
    public static Item kurumi_energy_lockseed = new Item_lockseed(1,99,"kurumi_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item donguri_energy_lockseed = new Item_lockseed(1,100,"donguri_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item pine_energy_lockseed = new Item_lockseed(1,101,"pine_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item ichigo_energy_lockseed = new Item_lockseed(1,102,"ichigo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item orange_energy_lockseed = new Item_lockseed(1,103,"orange_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item banana_energy_lockseed = new Item_lockseed(1,104,"banana_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item budou_energy_lockseed = new Item_lockseed(1,105,"budou_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item suika_energy_lockseed = new Item_lockseed(1,106,"suika_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item mango_energy_lockseed = new Item_lockseed(1,107,"mango_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item durian_energy_lockseed = new Item_lockseed(1,108,"durian_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item kiwi_energy_lockseed = new Item_lockseed(1,109,"kiwi_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_kurumi_energy  = new Item_ore("sengoku_driver_kurumi_energy");
    public static Item sengoku_driver_donguri_energy  = new Item_ore("sengoku_driver_donguri_energy");
    public static Item sengoku_driver_pine_energy  = new Item_ore("sengoku_driver_pine_energy");
    public static Item sengoku_driver_ichigo_energy  = new Item_ore("sengoku_driver_ichigo_energy");
    public static Item sengoku_driver_orange_energy  = new Item_ore("sengoku_driver_orange_energy");
    public static Item sengoku_driver_banana_energy  = new Item_ore("sengoku_driver_banana_energy");
    public static Item sengoku_driver_budou_energy = new Item_ore("sengoku_driver_budou_energy");
    public static Item sengoku_driver_suika_energy  = new Item_ore("sengoku_driver_suika_energy");
    public static Item sengoku_driver_mango_energy  = new Item_ore("sengoku_driver_mango_energy");
    public static Item sengoku_driver_durian_energy  = new Item_ore("sengoku_driver_durian_energy");
    public static Item sengoku_driver_kiwi_energy  = new Item_ore("sengoku_driver_kiwi_energy");
    
    public static Item sengoku_driver_blood_orange_energy  = new Item_ore("sengoku_driver_blood_orange_energy");
    public static Item blood_orange_energy_lockseed = new Item_lockseed(1,110,"blood_orange_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fifteen_lock_energy  = new Item_ore("sengoku_driver_fifteen_lock_energy");
    public static Item fifteen_energy_lockseed = new Item_lockseed(1,111,"fifteen_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_golden_ringo_energy  = new Item_ore("sengoku_driver_golden_ringo_energy");
    public static Item golden_ringo_energy_lockseed = new Item_lockseed(1,112,"golden_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_silver_ringo_energy  = new Item_ore("sengoku_driver_silver_ringo_energy");
    public static Item silver_ringo_energy_lockseed = new Item_lockseed(1,113,"silver_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_black_ringo_energy  = new Item_ore("sengoku_driver_black_ringo_energy");
    public static Item black_ringo_energy_lockseed = new Item_lockseed(1,114,"black_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_watermelon_energy  = new Item_ore("sengoku_driver_watermelon_energy");
    public static Item watermelon_energy_lockseed = new Item_lockseed(1,115,"watermelon_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_forbidden_ringo_energy = new Item_ore("sengoku_driver_forbidden_ringo_energy");
    public static Item forbidden_ringo_energy_lockseed = new Item_lockseed(1,116,"forbidden_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_zakuro_energy  = new Item_ore("sengoku_driver_zakuro_energy");
    public static Item zakuro_energy_lockseed = new Item_lockseed(1,117,"zakuro_energy_lockseed").setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_maja_lock_energy  = new Item_ore("sengoku_driver_maja_lock_energy");
    public static Item maja_energy_lockseed  = new Item_lockseed(4,118,"maja_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_lychee_energy  = new Item_ore("sengoku_driver_lychee_energy");
    public static Item lychee_energy_lockseed  = new Item_lockseed(4,119,"lychee_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_king_durian_energy  = new Item_ore("sengoku_driver_king_durian_energy");
    public static Item king_durian_energy_lockseed  = new Item_lockseed(4,120,"king_durian_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_hells_energy  = new Item_ore("sengoku_driver_hells_energy");
    public static Item helheim_energy_lockseed  = new Item_lockseed(4,121,"helheim_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    
    public static Item genesis_driver_gaim_shin = new item_Gaimdriver("genesis_driver_gaim_shin",ArmorMaterial.DIAMOND, 4, 3,"gaim_shin","energy_orange_arms",0,sengoku_driver_orange_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_ryugen_shin = new item_Gaimdriver("genesis_driver_ryugen_shin",ArmorMaterial.DIAMOND, 4, 3,"ryugen_shin","energy_budou_arms",0,sengoku_driver_budou_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_gridon_shin = new item_Gaimdriver("genesis_driver_gridon_shin",ArmorMaterial.DIAMOND, 4, 3,"gridon_shin","energy_donguri_arms",0,sengoku_driver_donguri_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_barvo_shin = new item_Gaimdriver("genesis_driver_barvo_shin",ArmorMaterial.DIAMOND, 4, 3,"barvo_shin","energy_durian_arms",0,sengoku_driver_durian_energy ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_knuckle_shin = new item_Gaimdriver("genesis_driver_knuckle_shin",ArmorMaterial.DIAMOND, 4, 3,"knuckle_shin","energy_kurumi_arms",0,sengoku_driver_kurumi_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_fifteen_shin = new item_Gaimdriver("genesis_driver_fifteen_shin",ArmorMaterial.DIAMOND, 4, 3,"fifteen_shin","fifteen_energy_arms",0,sengoku_driver_fifteen_lock_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_mars_shin = new item_Gaimdriver("genesis_driver_mars_shin",ArmorMaterial.DIAMOND, 4, 3,"mars_shin","energy_golden_arms",0,sengoku_driver_golden_ringo_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_kamuro_shin = new item_Gaimdriver("genesis_driver_kamuro_shin",ArmorMaterial.DIAMOND, 4, 3,"kamuro_shin","energy_silver_arms",0,sengoku_driver_silver_ringo_energy).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_jam_shin = new item_Gaimdriver("genesis_driver_jam_shin",ArmorMaterial.DIAMOND, 4, 3,"jam_shin","energy_darkness_arms",0,sengoku_driver_black_ringo_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_idunn_shin = new item_Gaimdriver("genesis_driver_idunn_shin",ArmorMaterial.DIAMOND, 4, 3,"idunn_shin","energy_ringo_arms",0,sengoku_driver_forbidden_ringo_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_savior_shin = new item_Gaimdriver("genesis_driver_savior_shin",ArmorMaterial.DIAMOND, 4, 3,"savior_shin","energy_zakuro_arms",0,sengoku_driver_zakuro_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_maja_shin = new item_Gaimdriver("genesis_driver_maja_shin",ArmorMaterial.DIAMOND, 4, 3,"maja_shin","maja_energy_arms",0,sengoku_driver_maja_lock_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
    public static Item genesis_driver_sylphi_shin = new item_Gaimdriver("genesis_driver_sylphi_shin",ArmorMaterial.DIAMOND, 4, 3,"sylphi_shin","energy_hell_arms",0,sengoku_driver_hells_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

    public static Item sengoku_driver_ryugen_kachidoki  = new Item_ore("sengoku_driver_ryugen_kachidoki");
    public static Item ryugen_kachidoki_lockseed  = new Item_lockseed(3,122,"ryugen_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_ryugen_kiwami = new Item_ore("sengoku_driver_ryugen_kiwami");
    public static Item sengoku_driver_baron_kachidoki  = new Item_ore("sengoku_driver_baron_kachidoki");
    public static Item baron_kachidoki_lockseed  = new Item_lockseed(3,123,"baron_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_baron_kiwami = new Item_ore("sengoku_driver_baron_kiwami");
    public static Item sengoku_driver_barvo_kachidoki  = new Item_ore("sengoku_driver_barvo_kachidoki");
    public static Item barvo_kachidoki_lockseed  = new Item_lockseed(3,124,"barvo_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_barvo_kiwami = new Item_ore("sengoku_driver_barvo_kiwami");
    public static Item sengoku_driver_gridon_kachidoki  = new Item_ore("sengoku_driver_gridon_kachidoki");
    public static Item gridon_kachidoki_lockseed  = new Item_lockseed(3,125,"gridon_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_gridon_kiwami = new Item_ore("sengoku_driver_gridon_kiwami");
    public static Item sengoku_driver_kurokage_kachidoki  = new Item_ore("sengoku_driver_kurokage_kachidoki");
    public static Item kurokage_kachidoki_lockseed  = new Item_lockseed(3,126,"kurokage_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kurokage_kiwami = new Item_ore("sengoku_driver_kurokage_kiwami");
    public static Item sengoku_driver_knuckle_kachidoki  = new Item_ore("sengoku_driver_knuckle_kachidoki");
    public static Item knuckle_kachidoki_lockseed  = new Item_lockseed(3,127,"knuckle_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_knuckle_kiwami = new Item_ore("sengoku_driver_knuckle_kiwami");
    public static Item sengoku_driver_duke_kachidoki  = new Item_ore("sengoku_driver_duke_kachidoki");
    public static Item duke_kachidoki_lockseed  = new Item_lockseed(3,128,"duke_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_duke_kiwami = new Item_ore("sengoku_driver_duke_kiwami");
    public static Item sengoku_driver_sigurd_kachidoki  = new Item_ore("sengoku_driver_sigurd_kachidoki");
    public static Item sigurd_kachidoki_lockseed  = new Item_lockseed(3,129,"sigurd_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_sigurd_kiwami = new Item_ore("sengoku_driver_sigurd_kiwami");
    public static Item sengoku_driver_marika_kachidoki  = new Item_ore("sengoku_driver_marika_kachidoki");
    public static Item marika_kachidoki_lockseed  = new Item_lockseed(3,130,"marika_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_marika_kiwami = new Item_ore("sengoku_driver_marika_kiwami");
    public static Item sengoku_driver_tyrant_kachidoki  = new Item_ore("sengoku_driver_tyrant_kachidoki");
    public static Item tyrant_kachidoki_lockseed  = new Item_lockseed(3,131,"tyrant_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_tyrant_kiwami = new Item_ore("sengoku_driver_tyrant_kiwami");
    public static Item sengoku_driver_savior_kachidoki  = new Item_ore("sengoku_driver_savior_kachidoki");
    public static Item savior_kachidoki_lockseed  = new Item_lockseed(3,132,"savior_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_savior_kiwami = new Item_ore("sengoku_driver_savior_kiwami");
    public static Item sengoku_driver_fifteen_kachidoki  = new Item_ore("sengoku_driver_fifteen_kachidoki");
    public static Item fifteen_kachidoki_lockseed  = new Item_lockseed(3,133,"fifteen_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_fifteen_kiwami = new Item_ore("sengoku_driver_fifteen_kiwami");
    public static Item sengoku_driver_maja_kachidoki  = new Item_ore("sengoku_driver_maja_kachidoki");
    public static Item maja_kachidoki_lockseed  = new Item_lockseed(3,134,"maja_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_maja_kiwami = new Item_ore("sengoku_driver_maja_kiwami");
    public static Item sengoku_driver_mars_kachidoki  = new Item_ore("sengoku_driver_mars_kachidoki");
    public static Item mars_kachidoki_lockseed  = new Item_lockseed(3,135,"mars_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_mars_kiwami = new Item_ore("sengoku_driver_mars_kiwami");
    public static Item sengoku_driver_kamuro_kachidoki  = new Item_ore("sengoku_driver_kamuro_kachidoki");
    public static Item kamuro_kachidoki_lockseed  = new Item_lockseed(3,136,"kamuro_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_kamuro_kiwami = new Item_ore("sengoku_driver_kamuro_kiwami");
    public static Item sengoku_driver_jam_kachidoki  = new Item_ore("sengoku_driver_jam_kachidoki");
    public static Item jam_kachidoki_lockseed  = new Item_lockseed(3,137,"jam_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_jam_kiwami = new Item_ore("sengoku_driver_jam_kiwami");
    public static Item sengoku_driver_idunn_kachidoki  = new Item_ore("sengoku_driver_idunn_kachidoki");
    public static Item idunn_kachidoki_lockseed  = new Item_lockseed(3,138,"idunn_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_idunn_kiwami = new Item_ore("sengoku_driver_idunn_kiwami");
    public static Item sengoku_driver_sylphi_kachidoki  = new Item_ore("sengoku_driver_sylphi_kachidoki");
    public static Item sylphi_kachidoki_lockseed  = new Item_lockseed(3,139,"sylphi_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_sylphi_kiwami = new Item_ore("sengoku_driver_sylphi_kiwami");
    
    public static Item black_kurokage_lockseed = new Item_lockseed(1,1,"black_kurokage_lockseed").AddlockseedToHelheimVine(6).setCreativeTab(Tabs.tabGaim);
    public static Item black_knuckle_lockseed = new Item_lockseed(1,2,"black_knuckle_lockseed").AddlockseedToHelheimVine(6).setCreativeTab(Tabs.tabGaim);
    public static Item black_gridon_lockseed = new Item_lockseed(1,3,"black_gridon_lockseed").AddlockseedToHelheimVine(6).setCreativeTab(Tabs.tabGaim);
    public static Item black_zangetsu_lockseed = new Item_lockseed(1,4,"black_zangetsu_lockseed").AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
    public static Item black_gaim_lockseed = new Item_lockseed(1,7,"black_gaim_lockseed").AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
    public static Item black_ryugen_lockseed = new Item_lockseed(1,9,"black_ryugen_lockseed").AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
    public static Item black_barvo_lockseed = new Item_lockseed(1,11,"black_barvo_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_duke_lockseed = new Item_lockseed(1,92,"black_duke_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_sigurd_lockseed = new Item_lockseed(1,93,"black_sigurd_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);    
    public static Item black_tyrant_lockseed = new Item_lockseed(1,94,"black_tyrant_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);  
    public static Item black_marika_lockseed = new Item_lockseed(1,95,"black_marika_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);  
    public static Item black_bujin_gaim_lockseed = new Item_lockseed(1,25,"black_bujin_gaim_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_fifteen_lockseed = new Item_lockseed(1,26,"black_fifteen_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_mars_lockseed = new Item_lockseed(1,27,"black_mars_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_kamuro_lockseed = new Item_lockseed(1,28,"black_kamuro_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_jam_lockseed = new Item_lockseed(1,29,"black_jam_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_idunn_lockseed = new Item_lockseed(1,31,"black_idunn_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_savior_lockseed = new Item_lockseed(1,47,"black_savior_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_maja_lockseed  = new Item_lockseed(4,59,"black_maja_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);
    public static Item black_sylphi_lockseed  = new Item_lockseed(4,98,"black_sylphi_lockseed").AddlockseedToHelheimVine(2).setCreativeTab(Tabs.tabGaim);

    
    public static Item dark_kurumi_energy_lockseed = new Item_lockseed(1,140,"dark_kurumi_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_donguri_energy_lockseed = new Item_lockseed(1,141,"dark_donguri_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_pine_energy_lockseed = new Item_lockseed(1,142,"dark_pine_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_ichigo_energy_lockseed = new Item_lockseed(1,143,"dark_ichigo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_orange_energy_lockseed = new Item_lockseed(1,144,"dark_orange_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_banana_energy_lockseed = new Item_lockseed(1,145,"dark_banana_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_budou_energy_lockseed = new Item_lockseed(1,146,"dark_budou_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_suika_energy_lockseed = new Item_lockseed(1,147,"dark_suika_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_mango_energy_lockseed = new Item_lockseed(1,148,"dark_mango_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_durian_energy_lockseed = new Item_lockseed(1,149,"dark_durian_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_kiwi_energy_lockseed = new Item_lockseed(1,150,"dark_kiwi_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_kurumi_energy  = new Item_ore("sengoku_driver_dark_kurumi_energy");
    public static Item sengoku_driver_dark_donguri_energy  = new Item_ore("sengoku_driver_dark_donguri_energy");
    public static Item sengoku_driver_dark_pine_energy  = new Item_ore("sengoku_driver_dark_pine_energy");
    public static Item sengoku_driver_dark_ichigo_energy  = new Item_ore("sengoku_driver_dark_ichigo_energy");
    public static Item sengoku_driver_dark_orange_energy  = new Item_ore("sengoku_driver_dark_orange_energy");
    public static Item sengoku_driver_dark_banana_energy  = new Item_ore("sengoku_driver_dark_banana_energy");
    public static Item sengoku_driver_dark_budou_energy = new Item_ore("sengoku_driver_dark_budou_energy");
    public static Item sengoku_driver_dark_suika_energy  = new Item_ore("sengoku_driver_dark_suika_energy");
    public static Item sengoku_driver_dark_mango_energy  = new Item_ore("sengoku_driver_dark_mango_energy");
    public static Item sengoku_driver_dark_durian_energy  = new Item_ore("sengoku_driver_dark_durian_energy");
    public static Item sengoku_driver_dark_kiwi_energy  = new Item_ore("sengoku_driver_dark_kiwi_energy");
    public static Item sengoku_driver_dark_blood_orange_energy  = new Item_ore("sengoku_driver_dark_blood_orange_energy");
    public static Item dark_blood_orange_energy_lockseed = new Item_lockseed(1,151,"dark_blood_orange_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_fifteen_energy  = new Item_ore("sengoku_driver_dark_fifteen_energy");
    public static Item dark_fifteen_energy_lockseed = new Item_lockseed(1,152,"dark_fifteen_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_golden_ringo_energy  = new Item_ore("sengoku_driver_dark_golden_ringo_energy");
    public static Item dark_golden_ringo_energy_lockseed = new Item_lockseed(1,153,"dark_golden_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_silver_ringo_energy  = new Item_ore("sengoku_driver_dark_silver_ringo_energy");
    public static Item dark_silver_ringo_energy_lockseed = new Item_lockseed(1,154,"dark_silver_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_black_ringo_energy  = new Item_ore("sengoku_driver_dark_black_ringo_energy");
    public static Item dark_black_ringo_energy_lockseed = new Item_lockseed(1,155,"dark_black_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_forbidden_ringo_energy = new Item_ore("sengoku_driver_dark_forbidden_ringo_energy");
    public static Item dark_forbidden_ringo_energy_lockseed = new Item_lockseed(1,156,"dark_forbidden_ringo_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_zakuro_energy  = new Item_ore("sengoku_driver_dark_zakuro_energy");
    public static Item dark_zakuro_energy_lockseed = new Item_lockseed(1,157,"dark_zakuro_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_maja_energy  = new Item_ore("sengoku_driver_dark_maja_energy");
    public static Item dark_maja_energy_lockseed  = new Item_lockseed(4,158,"dark_maja_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_lychee_energy  = new Item_ore("sengoku_driver_dark_lychee_energy");
    public static Item dark_lychee_energy_lockseed  = new Item_lockseed(4,159,"dark_lychee_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_king_durian_energy  = new Item_ore("sengoku_driver_dark_king_durian_energy");
    public static Item dark_king_durian_energy_lockseed  = new Item_lockseed(4,160,"dark_king_durian_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_hells_energy  = new Item_ore("sengoku_driver_dark_hells_energy");
    public static Item dark_hells_energy_lockseed  = new Item_lockseed(4,161,"dark_hells_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_peach_energy  = new Item_ore("sengoku_driver_dark_peach_energy");
    public static Item dark_peach_energy_lockseed  = new Item_lockseed(4,162,"dark_peach_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_cherry_energy  = new Item_ore("sengoku_driver_dark_cherry_energy");
    public static Item dark_cherry_energy_lockseed  = new Item_lockseed(4,163,"dark_cherry_energy_lockseed").setCreativeTab(Tabs.tabGaim);
    
    public static Item dark_kurumi_lockseed = new Item_lockseed(1,164,"dark_kurumi_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_donguri_lockseed = new Item_lockseed(1,165,"dark_donguri_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_pine_lockseed = new Item_lockseed(1,166,"dark_pine_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_ichigo_lockseed = new Item_lockseed(1,167,"dark_ichigo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_banana_lockseed = new Item_lockseed(1,168,"dark_banana_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_budou_lockseed = new Item_lockseed(1,169,"dark_budou_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_suika_lockseed = new Item_lockseed(1,170,"dark_suika_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_mango_lockseed = new Item_lockseed(1,171,"dark_mango_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_durian_lockseed = new Item_lockseed(1,172,"dark_durian_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item dark_kiwi_lockseed = new Item_lockseed(1,173,"dark_kiwi_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_kurumi  = new Item_ore("sengoku_driver_dark_kurumi");
    public static Item sengoku_driver_dark_donguri  = new Item_ore("sengoku_driver_dark_donguri");
    public static Item sengoku_driver_dark_pine  = new Item_ore("sengoku_driver_dark_pine");
    public static Item sengoku_driver_dark_ichigo  = new Item_ore("sengoku_driver_dark_ichigo");
    public static Item sengoku_driver_dark_orange  = new Item_ore("sengoku_driver_dark_orange");
    public static Item sengoku_driver_dark_banana  = new Item_ore("sengoku_driver_dark_banana");
    public static Item sengoku_driver_dark_budou = new Item_ore("sengoku_driver_dark_budou");
    public static Item sengoku_driver_dark_suika  = new Item_ore("sengoku_driver_dark_suika");
    public static Item sengoku_driver_dark_mango  = new Item_ore("sengoku_driver_dark_mango");
    public static Item sengoku_driver_dark_durian  = new Item_ore("sengoku_driver_dark_durian");
    public static Item sengoku_driver_dark_kiwi  = new Item_ore("sengoku_driver_dark_kiwi");
    public static Item sengoku_driver_dark_blood_orange  = new Item_ore("sengoku_driver_dark_blood_orange");
    public static Item dark_blood_orange_lockseed = new Item_lockseed(1,174,"dark_blood_orange_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_fifteen  = new Item_ore("sengoku_driver_dark_fifteen");
    public static Item dark_fifteen_lockseed = new Item_lockseed(1,175,"dark_fifteen_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_golden_ringo  = new Item_ore("sengoku_driver_dark_golden_ringo");
    public static Item dark_golden_ringo_lockseed = new Item_lockseed(1,176,"dark_golden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_silver_ringo  = new Item_ore("sengoku_driver_dark_silver_ringo");
    public static Item dark_silver_ringo_lockseed = new Item_lockseed(1,177,"dark_silver_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_black_ringo  = new Item_ore("sengoku_driver_dark_black_ringo");
    public static Item dark_black_ringo_lockseed = new Item_lockseed(1,178,"dark_black_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_forbidden_ringo = new Item_ore("sengoku_driver_dark_forbidden_ringo");
    public static Item dark_forbidden_ringo_lockseed = new Item_lockseed(1,179,"dark_forbidden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_zakuro  = new Item_ore("sengoku_driver_dark_zakuro");
    public static Item dark_zakuro_lockseed = new Item_lockseed(1,180,"dark_zakuro_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_maja  = new Item_ore("sengoku_driver_dark_maja");
    public static Item dark_maja_lockseed  = new Item_lockseed(4,181,"dark_maja_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_lychee  = new Item_ore("sengoku_driver_dark_lychee");
    public static Item dark_lychee_lockseed  = new Item_lockseed(4,182,"dark_lychee_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_king_durian  = new Item_ore("sengoku_driver_dark_king_durian");
    public static Item dark_king_durian_lockseed  = new Item_lockseed(4,183,"dark_king_durian_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_hells  = new Item_ore("sengoku_driver_dark_hells");
    public static Item dark_hells_lockseed  = new Item_lockseed(4,184,"dark_hells_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_peach  = new Item_ore("sengoku_driver_dark_peach");
    public static Item dark_peach_lockseed  = new Item_lockseed(4,185,"dark_peach_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_cherry  = new Item_ore("sengoku_driver_dark_cherry");
    public static Item dark_cherry_lockseed  = new Item_lockseed(4,186,"dark_cherry_lockseed").setCreativeTab(Tabs.tabGaim);
    public static Item sengoku_driver_dark_lemon  = new Item_ore ("sengoku_driver_dark_lemon");
    public static Item dark_lemon_lockseed  = new Item_lockseed(4,187,"dark_lemon_lockseed").setCreativeTab(Tabs.tabGaim);
    
    public static Item zangetsu_kiwami_lockseed  = new Item_lockseed(3,188,"zangetsu_kiwami_lockseed").setCreativeTab(Tabs.tabGaim);

    
    
	public static void init() {
	}

	//public static void init(){}
}



