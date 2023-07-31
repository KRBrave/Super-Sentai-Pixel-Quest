package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_zecter;
import Kamen_Rider_Craft_4TH.item.ooo.Itemmedal;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

public class PqRiderItems {

	//Kuuga
	public static Item kuuga_super_rising_mighty = new Item_form_change("kuuga_super_rising_mighty",item_rider_driver.class,4,"_super_rising_mighty","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 7,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_super_rising_dragon = new Item_form_change("kuuga_super_rising_dragon",item_rider_driver.class,4,"_super_rising_dragon","kuuga"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_super_rising_pegasus = new Item_form_change("kuuga_super_rising_pegasus",item_rider_driver.class,4,"_super_rising_pegasus","kuuga"
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_super_rising_titan = new Item_form_change("kuuga_super_rising_titan",item_rider_driver.class,4,"_super_rising_titan","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_rising_growing = new Item_form_change("kuuga_rising_growing",item_rider_driver.class,4,"_rising_growing","kuuga").setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_amazing_dragon = new Item_form_change("kuuga_amazing_dragon",item_rider_driver.class,4,"_amazing_dragon","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 4,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_amazing_pegasus = new Item_form_change("kuuga_amazing_pegasus",item_rider_driver.class,4,"_amazing_pegasus","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_amazing_titan = new Item_form_change("kuuga_amazing_titan",item_rider_driver.class,4,"_amazing_titan","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_amazing_ultimate = new Item_form_change("kuuga_amazing_ultimate",item_rider_driver.class,5,"_amazing_ultimate","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 9,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 6,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 7,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 8,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 13,true,false)
			,new PotionEffect(PotionCore.FIRE_PUNCH_POTION, 5, 5,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_super_amazing_mighty = new Item_form_change("kuuga_super_amazing_mighty",item_rider_driver.class,5,"_super_amazing_mighty","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 9,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_super_amazing_dragon = new Item_form_change("kuuga_super_amazing_dragon",item_rider_driver.class,5,"_super_amazing_dragon","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 4,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_super_amazing_pegasus = new Item_form_change("kuuga_super_amazing_pegasus",item_rider_driver.class,5,"_super_amazing_pegasus","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_super_amazing_titan = new Item_form_change("kuuga_super_amazing_titan",item_rider_driver.class,5,"_super_amazing_titan","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	public static Item kuuga_super_amazing_ultimate = new Item_form_change("kuuga_super_amazing_ultimate",item_rider_driver.class,5,"_super_amazing_ultimate","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 10,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 7,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 8,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 9,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 14,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(PotionCore.FIRE_PUNCH_POTION, 5, 6,true,false)).setCreativeTab(Tabs.tabkuuga);
	
	//KAbuto
	public static Item caucasus_hyper_zecter = new Item_form_change("caucasus_hyper_zecter",item_rider_driver.class,0,"_hyper","caucasus"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_kabuto_zecter_cast = new Item_form_change("perfect_kabuto_zecter_cast",item_rider_driver.class,1,"_mask","perfect_kabuto"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_kabuto_zecter = new Item_zecter(perfect_kabuto_zecter_cast,"perfect_kabuto_zecter",item_rider_driver.class,0,"","perfect_kabuto"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_kabuto_hyper_zecter = new Item_form_change("perfect_kabuto_hyper_zecter",item_rider_driver.class,0,"_hyper","kabuto"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_thebee_zecter_cast = new Item_form_change("perfect_thebee_zecter_cast",item_rider_driver.class,0,"_mask","perfect_thebee"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_thebee_zecter = new Item_zecter(perfect_thebee_zecter_cast,"perfect_thebee_zecter",item_rider_driver.class,0,"","perfect_thebee"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
					new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false)).setCreativeTab(Tabs.tabkabuto);
	
	public static Item thebee_hyper_zecter = new Item_form_change("thebee_hyper_zecter",item_rider_driver.class,0,"_hyper","thebee"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));

	public static Item perfect_thebee_hyper_zecter = new Item_form_change("perfect_thebee_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_thebee"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_drake_zecter_cast = new Item_form_change("perfect_drake_zecter_cast",item_rider_driver.class,0,"_mask","perfect_drake"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_drake_zecter = new Item_zecter(perfect_drake_zecter_cast,"perfect_drake_zecter",item_rider_driver.class,0,"","perfect_drake"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabkabuto);
	
	public static Item perfect_drake_hyper_zecter = new Item_form_change("perfect_drake_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_drake"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item drake_hyper_zecter = new Item_form_change("drake_hyper_zecter",item_rider_driver.class,0,"_hyper","drake"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));

	public static Item perfect_sasword_zecter_cast = new Item_form_change("perfect_sasword_zecter_cast",item_rider_driver.class,0,"_mask","perfect_sasword"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_sasword_zecter = new Item_zecter(perfect_sasword_zecter_cast,"perfect_sasword_zecter",item_rider_driver.class,0,"","perfect_sasword"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)).setCreativeTab(Tabs.tabkabuto);
	
	public static Item sasword_hyper_zecter = new Item_form_change("sasword_hyper_zecter",item_rider_driver.class,0,"_hyper","sasword"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_sasword_hyper_zecter = new Item_form_change("perfect_sasword_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_sasword"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));

	public static Item perfect_gatack_zecter_cast = new Item_form_change("perfect_gatack_zecter_cast",item_rider_driver.class,1,"_mask","perfect_gatack"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_gatack_zecter = new Item_zecter(perfect_gatack_zecter_cast,"perfect_gatack_zecter",item_rider_driver.class,0,"","perfect_gatack"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_gatack_hyper_zecter = new Item_form_change("perfect_gatack_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_gatack"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_kickhopper_zecter_cast = new Item_form_change("perfect_kickhopper_zecter_cast",item_rider_driver.class,0,"_mask","perfect_kickhopper"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_kickhopper_zecter = new Item_zecter(perfect_kickhopper_zecter_cast,"perfect_kickhopper_zecter",item_rider_driver.class,0,"","perfect_kickhopper"
			,new PotionEffect(MobEffects.RESISTANCE, 5,2,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 4,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST, 5, 7,true,false)).setCreativeTab(Tabs.tabkabuto);
	
	public static Item kickhopper_hyper_zecter = new Item_form_change("kickhopper_hyper_zecter",item_rider_driver.class,0,"_hyper","kickhopper"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_kickhopper_hyper_zecter = new Item_form_change("perfect_kickhopper_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_kickhopper"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));

	public static Item perfect_punchhopper_zecter_cast = new Item_form_change("perfect_punchhopper_zecter_cast",item_rider_driver.class,0,"_mask","perfect_punchhopper"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_punchhopper_zecter = new Item_zecter(perfect_punchhopper_zecter_cast,"perfect_punchhopper_zecter",item_rider_driver.class,0,"","perfect_punchhopper"
			,new PotionEffect(MobEffects.RESISTANCE, 5,2,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.HASTE, 5, 4,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item puchhopper_hyper_zecter = new Item_form_change("puchhopper_hyper_zecter",item_rider_driver.class,0,"_hyper","puchhopper"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_puchhopper_hyper_zecter = new Item_form_change("perfect_puchhopper_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_puchhopper"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_dark_kabuto_zecter_cast = new Item_form_change("perfect_dark_kabuto_zecter_cast",item_rider_driver.class,1,"_mask","perfect_dark_kabuto"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
	public static Item perfect_dark_kabuto_zecter = new Item_zecter(perfect_dark_kabuto_zecter_cast,"perfect_dark_kabuto_zecter",item_rider_driver.class,0,"","perfect_dark_kabuto"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_dark_hyper_zecter = new Item_form_change("perfect_dark_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_dark_kabuto"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
 
	public static Item perfect_lady_hyper_zecter = new Item_form_change("perfect_lady_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_lady"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	

	public static Item perfect_caucasus_zecter_cast = new Item_form_change("perfect_caucasus_zecter_cast",item_rider_driver.class,0,"_mask","perfect_caucasus"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item perfect_caucasus_zecter = new Item_zecter(perfect_caucasus_zecter_cast,"perfect_caucasus_zecter",item_rider_driver.class,0,"","perfect_caucasus"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_caucasus_hyper_zecter = new Item_form_change("perfect_caucasus_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_caucasus"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_hercus_zecter_cast = new Item_form_change("perfect_hercus_zecter_cast",item_rider_driver.class,0,"_mask","perfect_hercus"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item perfect_hercus_zecter = new Item_zecter(perfect_hercus_zecter_cast,"perfect_hercus_zecter",item_rider_driver.class,0,"","perfect_hercus"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item hercus_hyper_zecter = new Item_form_change("hercus_hyper_zecter",item_rider_driver.class,0,"_hyper","hercus"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_hercus_hyper_zecter = new Item_form_change("perfect_hercus_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_hercus"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));

	public static Item perfect_ketaros_zecter_cast = new Item_form_change("perfect_ketaros_zecter_cast",item_rider_driver.class,0,"_mask","perfect_ketaros"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item perfect_ketaros_zecter = new Item_zecter(perfect_ketaros_zecter_cast,"perfect_ketaros_zecter",item_rider_driver.class,0,"","perfect_ketaros"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item ketaros_hyper_zecter = new Item_form_change("ketaros_hyper_zecter",item_rider_driver.class,0,"_hyper","ketaros"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
	
	public static Item perfect_ketaros_hyper_zecter = new Item_form_change("perfect_ketaros_hyper_zecter",item_rider_driver.class,0,"_hyper","perfect_ketaros"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));


	public static Item perfect_lady_zecter_cast = new Item_form_change("perfect_lady_zecter_cast",item_rider_driver.class,0,"_mask","perfect_lady"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item perfect_lady_zecter = new Item_zecter(perfect_lady_zecter_cast,"perfect_lady_zecter",item_rider_driver.class,0,"","perfect_lady"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);
	
	public static Item lady_hyper_zecter = new Item_form_change("lady_hyper_zecter",item_rider_driver.class,0,"_hyper","lady"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));

	
	public static Item perfect_kabuto_rider_belt = new item_rider_driver("perfect_kabuto_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_kabuto", (Item_form_change) perfect_kabuto_zecter, RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_gatack_rider_belt = new item_rider_driver("perfect_gatack_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_gatack", (Item_form_change) perfect_gatack_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_thebee_rider_belt = new item_rider_driver("perfect_thebee_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_thebee", (Item_form_change) perfect_thebee_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_drake_rider_belt = new item_rider_driver("perfect_drake_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_drake", (Item_form_change) perfect_drake_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_sasword_rider_belt = new item_rider_driver("perfect_sasword_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_sasword", (Item_form_change) perfect_sasword_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_kickhopper_rider_belt = new item_rider_driver("perfect_kickhopper_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_kickhopper", (Item_form_change) perfect_kickhopper_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_punchhopper_rider_belt = new item_rider_driver("perfect_punchhopper_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_punchhopper", (Item_form_change) perfect_punchhopper_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_dark_kabuto_rider_belt = new item_rider_driver("perfect_dark_kabuto_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_dark_kabuto", (Item_form_change) perfect_dark_kabuto_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_caucasus_rider_belt = new item_rider_driver("perfect_caucasus_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_caucasus", (Item_form_change) perfect_caucasus_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_hercus_rider_belt = new item_rider_driver("perfect_hercus_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_hercus", (Item_form_change) perfect_hercus_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_ketaros_rider_belt = new item_rider_driver("perfect_ketaros_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_ketaros", (Item_form_change) perfect_ketaros_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item perfect_lady_rider_belt = new item_rider_driver("perfect_lady_rider_belt",ArmorMaterial.DIAMOND, 4,"perfect_lady", (Item_form_change) perfect_lady_zecter,  RiderItems.kabutohead,  RiderItems.kabutotroso,  RiderItems.kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	
	
	//OOO
	public static Item foundation_ptera = new Itemmedal(5, "1","foundation_ptera").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_cobra = new Itemmedal(6, "1","foundation_cobra").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_same = new Itemmedal(9, "1","foundation_same").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_shika = new Itemmedal(10, "1","foundation_shika").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_seiuchi = new Itemmedal(11, "1","foundation_seiuchi").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_mukade = new Itemmedal(12, "1","foundation_mukade").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_ebi = new Itemmedal(13, "1","foundation_ebi").setCreativeTab(Tabs.tabOOO);
	
	public static Item foundation_tricera = new Itemmedal(5, "2","foundation_tricera").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_kame = new Itemmedal(6, "2","foundation_kame").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_imagin = new Itemmedal(7, "2","foundation_imagin").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_panda = new Itemmedal(8, "2","foundation_panda").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_kangaroo = new Itemmedal(10, "2","foundation_kangaroo").Shift_form(9, "3").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_kujira = new Itemmedal(12, "2","foundation_kujira").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_gazelle = new Itemmedal(13, "2","foundation_gazelle").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_shirokuma = new Itemmedal(14, "2","foundation_shirokuma").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_hachi = new Itemmedal(15, "2","foundation_hachi").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_kani = new Itemmedal(16, "2","foundation_kani").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_yadokari = new Itemmedal(17, "2","foundation_yadokari").setCreativeTab(Tabs.tabOOO);
	
	public static Item foundation_tyranno = new Itemmedal(5, "3","foundation_tyranno").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_wani = new Itemmedal(6, "3","foundation_wani").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_shocker = new Itemmedal(7, "3","foundation_shocker").Shift_form(54, "1").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_ookamiuo = new Itemmedal(11, "3","foundation_ookamiuo").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_ushi = new Itemmedal(12, "3","foundation_ushi").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_penguin = new Itemmedal(13, "3","foundation_penguin").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_ari = new Itemmedal(14, "3","foundation_ari").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_sasori = new Itemmedal(15, "3","foundation_sasori").setCreativeTab(Tabs.tabOOO);
	
	public static Item foundation_love_core = new Itemmedal(8, "1","foundation_love_core").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_love_core2 = new Itemmedal(11, "2","foundation_love_core2").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_love_core3 = new Itemmedal(10, "3","foundation_love_core3").setCreativeTab(Tabs.tabOOO);

	
	public static Item super_lion = new Itemmedal(21, "1","super_lion").setCreativeTab(Tabs.tabOOO);
	public static Item super_sai = new Itemmedal(22, "1","super_sai").setCreativeTab(Tabs.tabOOO);
	public static Item super_shachi = new Itemmedal(23, "1","super_shachi").setCreativeTab(Tabs.tabOOO);
	public static Item super_cobra = new Itemmedal(24, "1","super_cobra").setCreativeTab(Tabs.tabOOO);
	public static Item super_same = new Itemmedal(25, "1","super_same").setCreativeTab(Tabs.tabOOO);
	public static Item super_shika = new Itemmedal(26, "1","super_shika").setCreativeTab(Tabs.tabOOO);
	public static Item super_seiuchi = new Itemmedal(27, "1","super_seiuchi").setCreativeTab(Tabs.tabOOO);
	public static Item super_mukade = new Itemmedal(28, "1","super_mukade").setCreativeTab(Tabs.tabOOO);
	public static Item super_ebi_new = new Itemmedal(29, "1","super_ebi_new").setCreativeTab(Tabs.tabOOO);
	public static Item super_ptera = new Itemmedal(31, "1","super_ptera").setCreativeTab(Tabs.tabOOO);
	public static Item super_kuwagata = new Itemmedal(32, "1","super_kuwagata").setCreativeTab(Tabs.tabOOO);
	
	public static Item super_tricera = new Itemmedal(24, "2","super_tricera").setCreativeTab(Tabs.tabOOO);
	public static Item super_kujaku = new Itemmedal(25, "2","super_kujaku").setCreativeTab(Tabs.tabOOO);
	public static Item super_kamakiri = new Itemmedal(26, "2","super_kamakiri").setCreativeTab(Tabs.tabOOO);
	public static Item super_gorilla = new Itemmedal(27, "2","super_gorilla").setCreativeTab(Tabs.tabOOO);
	public static Item super_unagi = new Itemmedal(28, "2","super_unagi").setCreativeTab(Tabs.tabOOO);
	public static Item super_kame = new Itemmedal(29, "2","super_kame").setCreativeTab(Tabs.tabOOO);
	public static Item super_imagin = new Itemmedal(30, "2","super_imagin").setCreativeTab(Tabs.tabOOO);
	public static Item super_kujira = new Itemmedal(31, "2","super_kujira").setCreativeTab(Tabs.tabOOO);
	public static Item super_gazelle = new Itemmedal(32, "2","super_gazelle").setCreativeTab(Tabs.tabOOO);
	public static Item super_shirokuma = new Itemmedal(33, "2","super_shirokuma").setCreativeTab(Tabs.tabOOO);
	public static Item super_hachi = new Itemmedal(34, "2","super_hachi").setCreativeTab(Tabs.tabOOO);
	public static Item super_kani_new = new Itemmedal(35, "2","super_kani_new").setCreativeTab(Tabs.tabOOO);
	public static Item super_panda = new Itemmedal(36, "2","super_panda").setCreativeTab(Tabs.tabOOO);
	public static Item super_kangaroo = new Itemmedal(37, "2","super_kangaroo").Shift_form(78, "3").setCreativeTab(Tabs.tabOOO);
	public static Item super_yadokari = new Itemmedal(38, "2","super_yadokari").setCreativeTab(Tabs.tabOOO);
	
	public static Item super_tyranno = new Itemmedal(22, "3","super_tyranno").setCreativeTab(Tabs.tabOOO);
	public static Item super_condor = new Itemmedal(23, "3","super_condor").setCreativeTab(Tabs.tabOOO);
	public static Item super_cheetah = new Itemmedal(24, "3","super_cheetah").setCreativeTab(Tabs.tabOOO);
	public static Item super_zou = new Itemmedal(25, "3","super_zou").setCreativeTab(Tabs.tabOOO);
	public static Item super_tako = new Itemmedal(26, "3","super_tako").setCreativeTab(Tabs.tabOOO);
	public static Item super_wani = new Itemmedal(27, "3","super_wani").setCreativeTab(Tabs.tabOOO);
	public static Item super_shocker = new Itemmedal(28, "3","super_shocker").setCreativeTab(Tabs.tabOOO);
	public static Item super_ookamiuo = new Itemmedal(29, "3","super_ookamiuo").setCreativeTab(Tabs.tabOOO);
	public static Item super_ushi = new Itemmedal(30, "3","super_ushi").setCreativeTab(Tabs.tabOOO);
	public static Item super_penguin = new Itemmedal(31, "3","super_penguin").setCreativeTab(Tabs.tabOOO);
	public static Item super_ari = new Itemmedal(32, "3","super_ari").setCreativeTab(Tabs.tabOOO);
	public static Item super_sasori_new = new Itemmedal(33, "3","super_sasori_new").setCreativeTab(Tabs.tabOOO);
	
	public static Item super_love_core = new Itemmedal(30, "1","super_love_core").setCreativeTab(Tabs.tabOOO);
	public static Item super_love_core2 = new Itemmedal(39, "2","super_love_core2").setCreativeTab(Tabs.tabOOO);
	public static Item super_love_core3 = new Itemmedal(34, "3","super_love_core3").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_love = new Itemmedal(8, "1","foundation_love").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_love2 = new Itemmedal(11, "2","foundation_love2").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_love3 = new Itemmedal(10, "3","foundation_love3").setCreativeTab(Tabs.tabOOO);
	
	public static Item super_ptera_OOOdriver = new Item_ore("super_ptera_ooodriver");
	public static Item super_kuwagata_OOOdriver = new Item_ore("super_kuwagata_ooodriver");
	public static Item super_lion_OOOdriver = new Item_ore("super_lion_ooodriver");
	public static Item super_sai_OOOdriver = new Item_ore("super_sai_ooodriver");
	public static Item super_shachi_OOOdriver = new Item_ore("super_shachi_ooodriver");
	public static Item super_cobra_OOOdriver = new Item_ore("super_cobra_ooodriver");
	public static Item super_same_OOOdriver = new Item_ore("super_same_ooodriver");
	public static Item super_shika_OOOdriver = new Item_ore("super_shika_ooodriver");
	public static Item super_seiuchi_OOOdriver = new Item_ore("super_seiuchi_ooodriver");
	public static Item super_mukade_OOOdriver = new Item_ore("super_mukade_ooodriver");
	public static Item super_sasori_new_OOOdriver = new Item_ore("super_sasori_new_ooodriver");
	
	public static Item super_tricera_OOOdriver = new Item_ore("super_tricera_ooodriver");
	public static Item super_kujaku_OOOdriver = new Item_ore("super_kujaku_ooodriver");
	public static Item super_kamakiri_OOOdriver = new Item_ore("super_kamakiri_ooodriver");
	public static Item super_gorilla_OOOdriver = new Item_ore("super_gorilla_ooodriver");
	public static Item super_unagi_OOOdriver = new Item_ore("super_unagi_ooodriver");
	public static Item super_kame_OOOdriver = new Item_ore("super_kame_ooodriver");
	public static Item super_imagin_OOOdriver = new Item_ore("super_imagin_ooodriver");
	public static Item super_kujira_OOOdriver = new Item_ore("super_kujira_ooodriver");
	public static Item super_gazelle_OOOdriver = new Item_ore("super_gazelle_ooodriver");
	public static Item super_shirokuma_OOOdriver = new Item_ore("super_shirokuma_ooodriver");
	public static Item super_hachi_OOOdriver = new Item_ore("super_hachi_ooodriver");
	public static Item super_kani_new_OOOdriver = new Item_ore("super_kani_new_ooodriver");
	public static Item super_panda_OOOdriver = new Item_ore("super_panda_ooodriver");
	public static Item super_kangaroo_OOOdriver = new Item_ore("super_kangaroo_ooodriver");
	public static Item super_yadokari_OOOdriver = new Item_ore("super_yadokari_ooodriver");
	
	public static Item super_tyranno_OOOdriver = new Item_ore("super_tyranno_ooodriver");
	public static Item super_condor_OOOdriver = new Item_ore("super_condor_ooodriver");
	public static Item super_cheetah_OOOdriver = new Item_ore("super_cheetah_ooodriver");
	public static Item super_zou_OOOdriver = new Item_ore("super_zou_ooodriver");
	public static Item super_tako_OOOdriver = new Item_ore("super_tako_ooodriver");
	public static Item super_wani_OOOdriver = new Item_ore("super_wani_ooodriver");
	public static Item super_shocker_OOOdriver = new Item_ore("super_shocker_ooodriver");
	public static Item super_ookamiuo_OOOdriver = new Item_ore("super_ookamiuo_ooodriver");
	public static Item super_ushi_OOOdriver = new Item_ore("super_ushi_ooodriver");
	public static Item super_penguin_OOOdriver = new Item_ore("super_penguin_ooodriver");
	public static Item super_ari_OOOdriver = new Item_ore("super_ari_ooodriver");
	public static Item super_ebi_new_OOOdriver = new Item_ore("super_ebi_new_ooodriver");
	public static Item super_kangaroo2_OOOdriver = new Item_ore("super_kangaroo2_ooodriver");
	
	public static Item super_love_OOOdriver = new Item_ore("super_love_ooodriver");
	public static Item super_love2_OOOdriver = new Item_ore("super_love2_ooodriver");
	public static Item super_love3_OOOdriver = new Item_ore("super_love3_ooodriver");
	
	public static void init() {
	}
}
