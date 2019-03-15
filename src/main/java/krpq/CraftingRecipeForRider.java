package krpq;

import krpq.util.Refercence;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipeForRider {
	public static void Crafrting() {

		// GameRegistry.addShapedRecipe(new
		// ResourceLocation(Refercence.MODID+":energy"), new
		// ResourceLocation(Refercence.MODID+":kamen_rider"),new
		// ItemStack(RiderItems.energy,5), " a ","aba"," a ", 'a', new
		// ItemStack(Items.DYE, 1, 4), 'b', Items.REDSTONE);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":icepop1"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.icepop1, 1), " a ",
				" a ", " b ", 'a', Items.SNOWBALL, 'b', Items.STICK);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":rider_circuit"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.rider_circuit, 1),
				"aba", "bab", "aba", 'a', Items.IRON_INGOT, 'b', Items.GOLD_INGOT);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":base_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.base_sword, 1), " a ",
				" a ", " b ", 'a', RiderItems.rider_circuit, 'b', Items.IRON_INGOT);
		// GameRegistry.addShapedRecipe(new
		// ResourceLocation(Refercence.MODID+":base_gun"), new
		// ResourceLocation(Refercence.MODID+":kamen_rider"),new
		// ItemStack(RiderItems.base_gun,1), "a "," a "," ba", 'a',
		// RiderItems.rider_circuit, 'b', Items.IRON_INGOT);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ichigohead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ichigohead, 1), "aaa",
				"a a", 'a', RiderItems.rider_circuit);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ichigotroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ichigotroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.rider_circuit);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ichigolegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ichigolegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.rider_circuit);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":typhoon_ichigo"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.typhoon_ichigo, 1),
				"aba", "aaa", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.typhoon_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":typhoon_nigo"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.typhoon_nigo, 1),
				"aaa", "aaa", "aba", 'a', RiderItems.rider_circuit, 'b', RiderItems.typhoon_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":double_typhoon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.double_typhoon, 1),
				"aaa", "bab", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.typhoon_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":riderman_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.riderman_belt, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.riderman_belt_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ridol"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ridol, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.ridol_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":condorer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.condorer, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.condorer_wheel);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":electrer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.electrer, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.electrer_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":tornado"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.tornado, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.tornado_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":cyclode"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.cyclode, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.cyclode_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zx_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zx_belt, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.zx_belt_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":king_stone"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.king_stone, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.king_stone_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sunriser"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sunriser, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.king_stone_split);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ridol_stick"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ridol_stick, 1),
				"aca", "aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.base_sword, 'c',
				RiderItems.ridol_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":revolcane"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.revolcane, 1), "aca",
				"aba", "aaa", 'a', RiderItems.rider_circuit, 'b', RiderItems.base_sword, 'c',
				RiderItems.king_stone_split);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kuugahead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuugahead, 1), "aaa",
				"a a", 'a', RiderItems.kuuga_growing);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kuugatroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuugatroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.kuuga_growing);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kuugalegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuugalegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.kuuga_growing);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":arcle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.arcle, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.kuuga_growing, 'b', RiderItems.kuuga_mighty);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dragon_rod"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dragon_rod, 1), "aca",
				"aba", "aaa", 'a', RiderItems.kuuga_growing, 'b', RiderItems.base_sword, 'c', RiderItems.kuuga_dragon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":pegasus_bowgun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.pegasus_bowgun, 1),
				"aca", "aba", "aaa", 'a', RiderItems.kuuga_growing, 'b', RiderItems.base_sword, 'c',
				RiderItems.kuuga_pegasus);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":titan_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.titan_sword, 1),
				"aca", "aba", "aaa", 'a', RiderItems.kuuga_growing, 'b', RiderItems.base_sword, 'c',
				RiderItems.kuuga_titan);

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rising_mighty"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_rising_mighty),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuuga_mighty),
						Ingredient.fromItem(RiderItems.kuuga_mighty), Ingredient.fromItem(RiderItems.kuuga_mighty),
						Ingredient.fromItem(RiderItems.kuuga_mighty), Ingredient.fromItem(RiderItems.kuuga_mighty),
						Ingredient.fromItem(RiderItems.kuuga_mighty), Ingredient.fromItem(RiderItems.kuuga_mighty),
						Ingredient.fromItem(RiderItems.kuuga_mighty), Ingredient.fromItem(RiderItems.kuuga_mighty) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rising_dragon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_rising_dragon),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuuga_dragon),
						Ingredient.fromItem(RiderItems.kuuga_dragon), Ingredient.fromItem(RiderItems.kuuga_dragon),
						Ingredient.fromItem(RiderItems.kuuga_dragon), Ingredient.fromItem(RiderItems.kuuga_dragon),
						Ingredient.fromItem(RiderItems.kuuga_dragon), Ingredient.fromItem(RiderItems.kuuga_dragon),
						Ingredient.fromItem(RiderItems.kuuga_dragon), Ingredient.fromItem(RiderItems.kuuga_dragon) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rising_pegasus"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_rising_pegasus),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuuga_pegasus),
						Ingredient.fromItem(RiderItems.kuuga_pegasus), Ingredient.fromItem(RiderItems.kuuga_pegasus),
						Ingredient.fromItem(RiderItems.kuuga_pegasus), Ingredient.fromItem(RiderItems.kuuga_pegasus),
						Ingredient.fromItem(RiderItems.kuuga_pegasus), Ingredient.fromItem(RiderItems.kuuga_pegasus),
						Ingredient.fromItem(RiderItems.kuuga_pegasus), Ingredient.fromItem(RiderItems.kuuga_pegasus) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rising_titan"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_rising_titan),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuuga_titan),
						Ingredient.fromItem(RiderItems.kuuga_titan), Ingredient.fromItem(RiderItems.kuuga_titan),
						Ingredient.fromItem(RiderItems.kuuga_titan), Ingredient.fromItem(RiderItems.kuuga_titan),
						Ingredient.fromItem(RiderItems.kuuga_titan), Ingredient.fromItem(RiderItems.kuuga_titan),
						Ingredient.fromItem(RiderItems.kuuga_titan), Ingredient.fromItem(RiderItems.kuuga_titan) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":amazing_mighty"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_amazing_mighty),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_mighty) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":ultimate"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_ultimate),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuuga_rising_mighty),
						Ingredient.fromItem(RiderItems.kuuga_rising_dragon),
						Ingredient.fromItem(RiderItems.kuuga_rising_pegasus),
						Ingredient.fromItem(RiderItems.kuuga_rising_titan),
						Ingredient.fromItem(RiderItems.kuuga_amazing_mighty) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":agitohead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.agitohead, 1), "aaa",
				"a a", 'a', RiderItems.agito_of_seed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":agitotroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.agitotroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.agito_of_seed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":agitolegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.agitolegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.agito_of_seed);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":alter_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.alter_ring, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.agito_of_seed, 'b', RiderItems.agito_ground);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":meta_factor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.meta_factor, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.agito_of_seed, 'b', RiderItems.gills);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ank_point"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ank_point, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.agito_of_seed, 'b', RiderItems.another_agito);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ank_point_burning"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ank_point_burning, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.agito_of_seed, 'b', RiderItems.another_agito_burning_form);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":alter_ring_miracle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.alter_ring_miracle, 1), "aaa", "aba", "aaa", 'a', RiderItems.agito_of_seed,
				'b', RiderItems.agito_miracle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":g1_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.g1_belt, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.g3core, 'c', RiderItems.g1);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":g3_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.g3_belt, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.g3core, 'c', RiderItems.g3);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":g3_x_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.g3_x_belt, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.g3core, 'c', RiderItems.g3x);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":g3_mild_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.g3_mild_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.g3core, 'c', RiderItems.g3mild);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":g4_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.g4_belt, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.g3core, 'c', RiderItems.g4);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":g4_x_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.g4_x_belt, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.g3core, 'c', RiderItems.g4x);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":flame_saber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.flame_saber, 1),
				"ama", "aba", "aaa", 'a', RiderItems.agito_of_seed, 'b', RiderItems.base_sword, 'm',
				RiderItems.agito_flame);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":storm_halberd"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.storm_halberd, 1),
				"ama", "aba", "aaa", 'a', RiderItems.agito_of_seed, 'b', RiderItems.base_sword, 'm',
				RiderItems.agito_storm);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":shining_caliber_summoned"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.shining_caliber_summoned, 1), "ama", "aba", "aaa", 'a',
				RiderItems.agito_of_seed, 'b', RiderItems.base_sword, 'm', RiderItems.agito_burning);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":shining_caliber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.shining_caliber, 1),
				"ama", "aba", "aaa", 'a', RiderItems.agito_of_seed, 'b', RiderItems.base_sword, 'm',
				RiderItems.agito_shining);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ryukihead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ryukihead, 1), "aaa",
				"a a", 'a', RiderItems.contract_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ryukitroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ryukitroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.contract_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ryukilegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ryukilegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.contract_advent);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_ryuki"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_ryuki, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.dragreder_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_knight"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_knight, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.darkwing_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_scissors"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_scissors, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.volcancer_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_zolda"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_zolda, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.magnugiga_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_gai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_gai, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.metalgelas_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_raia"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_raia, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.evildiver_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_ouja"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_ouja, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.venosnaker_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_tiger"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_tiger, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.destwilder_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_imperer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_imperer, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.gigazelle_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_odin"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_odin, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.goldphoenix_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_femme"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_femme, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.blancwing_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_verde"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_verde, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.biogreeza_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_ryuga"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_ryuga, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.dragblacker_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":v_buckle_abyss"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.v_buckle_abyss, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.abysslasher_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":alternativebelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.alternativebelt, 1),
				"aca", "aaa", "aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.psycorogue_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":alternativezerobelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.alternativezerobelt, 1), "aaa", "aaa", "aca", 'a', RiderItems.contract_advent,
				'c', RiderItems.psycorogue_advent);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drag_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drag_visor, 1), "aca",
				"aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.dragreder_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dark_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dark_visor, 1), "aca",
				"aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.darkwing_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":scissors_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.scissors_visor, 1),
				"aca", "aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.volcancer_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":magna_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.magna_visor, 1),
				"aca", "aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.magnugiga_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":metal_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.metal_visor, 1),
				"aca", "aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.metalgelas_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":evil_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.evil_visor, 1), "aca",
				"aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.evildiver_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":veno_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.veno_visor, 1), "aca",
				"aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.venosnaker_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dest_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dest_visor, 1), "aca",
				"aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.destwilder_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gazelle_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gazelle_visor, 1),
				"aca", "aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.gigazelle_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gold_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gold_visor, 1), "aca",
				"aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.goldphoenix_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blanc_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blanc_visor, 1),
				"aca", "aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.blancwing_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bio_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bio_visor, 1), "aca",
				"aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.biogreeza_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dark_drag_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dark_drag_visor, 1),
				"aca", "aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.dragblacker_advent, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":abyss_visor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.abyss_visor, 1),
				"aca", "aba", "aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.abysslasher_advent, 'c',
				RiderItems.base_sword);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faizhead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faizhead, 1), "aaa",
				"a a", 'a', RiderItems.blank_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faiztroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faiztroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.blank_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faizlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faizlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.blank_mission_memory);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faizdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faizdriver, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.blank_mission_memory, 'c', RiderItems.faiz_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kaixadriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kaixadriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.blank_mission_memory, 'c', RiderItems.kaixa_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":deltadriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.deltadriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.blank_mission_memory, 'c', RiderItems.delta_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":psygadriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.psygadriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.blank_mission_memory, 'c', RiderItems.psyga_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":orgadriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.orgadriver, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.blank_mission_memory, 'c', RiderItems.orga_mission_memory);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faiz_edge"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faiz_edge, 1), "ama",
				"aba", "aaa", 'a', RiderItems.blank_mission_memory, 'b', RiderItems.base_sword, 'm',
				RiderItems.faiz_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":axel_ray_gun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.axel_ray_gun, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.blank_mission_memory, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faiz_blaster"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faiz_blaster, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_mission_memory, 'b', RiderItems.base_sword, 'm',
				RiderItems.faiz_blaster_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kaixa_blaygun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kaixa_blaygun, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_mission_memory, 'b', RiderItems.base_sword, 'm',
				RiderItems.kaixa_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":deltablaster"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.deltablaster, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_mission_memory, 'b', RiderItems.base_sword, 'm',
				RiderItems.delta_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":psyga_tonfa_edge"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.psyga_tonfa_edge, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_mission_memory, 'b', RiderItems.base_sword, 'm',
				RiderItems.psyga_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":orga_stlanzer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.orga_stlanzer, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_mission_memory, 'b', RiderItems.base_sword, 'm',
				RiderItems.orga_mission_memory);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bladehead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bladehead, 1), "aaa",
				"a a", 'a', RiderItems.bladecard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bladetroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bladetroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.bladecard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bladelegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bladelegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.bladecard);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bladedriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bladedriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.changebeetle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":garrendriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.garrendriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.change_stag);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":leangle_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.leangle_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.change_spider);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":chalicerouzer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.chalicerouzer, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.change_mantis);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":glaive_buckle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.glaive_buckle, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.changekerberosglaive);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":lance_buckle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.lance_buckle, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.changekerberoslance);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":larc_buckle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.larc_buckle, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.changekerberoslarc);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":rouze_absorber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.rouze_absorber, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.fusion_eagle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":garren_absorber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.garren_absorber, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.bladecard, 'c', RiderItems.fusion_peacock);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blayrouzer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blayrouzer, 1), "ama",
				"aba", "aaa", 'a', RiderItems.bladecard, 'b', RiderItems.base_sword, 'm', RiderItems.changebeetle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":garrenrouzer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.garrenrouzer, 1),
				"ama", "aba", "aaa", 'a', RiderItems.bladecard, 'b', RiderItems.base_sword, 'm',
				RiderItems.change_stag);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":leanglerouzer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.leanglerouzer, 1),
				"ama", "aba", "aaa", 'a', RiderItems.bladecard, 'b', RiderItems.base_sword, 'm',
				RiderItems.change_spider);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kingrouzer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kingrouzer, 1), "ama",
				"aba", "aaa", 'a', RiderItems.bladecard, 'b', RiderItems.base_sword, 'm',
				RiderItems.evolution_caucasus);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":chalice_arrow"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.chalice_arrow, 1),
				"ama", "aba", "aaa", 'a', RiderItems.bladecard, 'b', RiderItems.base_sword, 'm',
				RiderItems.change_mantis);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wild_slasher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wild_slasher, 1),
				"ama", "aba", "aaa", 'a', RiderItems.bladecard, 'b', RiderItems.base_sword, 'm',
				RiderItems.evolution_paradoxa);

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":wild_chalice_arrow"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wild_chalice_arrow),
				new Ingredient[] { Ingredient.fromItem(RiderItems.wild_slasher),
						Ingredient.fromItem(RiderItems.wild_slasher) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hibikihead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hibikihead, 1), "aaa",
				"a a", 'a', RiderItems.oni_ore);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hibikitroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hibikitroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.oni_ore);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hibikilegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hibikilegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.oni_ore);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hibikidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hibikidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabukidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabukidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_kabuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":toukidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.toukidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_touki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kiramekidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kiramekidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_kirameki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":habatakidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.habatakidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_habataki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":nishikidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.nishikidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_nishiki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kyosukedriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kyosukedriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa_kyoki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dankidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dankidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa_danki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":eikidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.eikidriver, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa_eiki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":goukidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.goukidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_gouki);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ibukidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ibukidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onibue_ibuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":tokidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.tokidriver, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onibue_toki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":shoukidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.shoukidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onibue_shouki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amakidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.amakidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onibue_amaki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fubukidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.fubukidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onibue_fubuki);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":todorokidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.todorokidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_kigen_todoroki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zankidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zankidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_kigen_zanki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":shukidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.shukidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_kigen_shuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bankidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bankidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_kigen_banki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sabakidriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sabakidriver, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_kigen_sabaki);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_rekka"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekibo_rekka, 1),
				"ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't', RiderItems.henshin_onsa);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":armed_saber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.armed_saber, 1),
				"ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.unfinished_armed_saber);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_yamase"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekibo_yamase, 1),
				"aaa", "aba", "ata", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.henshin_onibue_ibuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_rakurai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekibo_rakurai, 1),
				"aaa", "aba", "ata", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.henshin_kigen_todoroki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_shakubyoushi"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongekibo_shakubyoushi, 1), "ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_kigen_shuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_nachiguro"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongekibo_nachiguro, 1), "ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_onsa_danki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_rokushou"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekibo_rokushou, 1),
				"ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.henshin_onsa_eiki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_gouriki"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekibo_gouriki, 1),
				"ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.henshin_onsa_gouki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_ressui"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekibo_ressui, 1),
				"ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.henshin_onsa_kabuki);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekikan_reppuu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekikan_reppuu, 1),
				"ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.henshin_onibue_ibuki);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekigen_retsurai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongekigen_retsurai, 1), "ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_kigen_todoroki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongeki_shingen_retsuzan"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongeki_shingen_retsuzan, 1), "ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_kigen_zanki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekigen_enma"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekigen_enma, 1),
				"ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.base_sword, 't',
				RiderItems.henshin_kigen_sabaki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekigen_togenkyo"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongekigen_togenkyo, 1), "ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_kigen_banki);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":echo_sword_onsaken"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.echo_sword_onsaken, 1), "aaa", "aba", "ata", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_onsa_kabuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekisankaku_ressetsu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongekisankaku_ressetsu, 1), "ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_onsa_nishiki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongekikanabo_retto"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongekikanabo_retto, 1), "ata", "aba", "aaa", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_onsa_touki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ongeki_shincho_retsuban"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongeki_shincho_retsuban, 1), "aaa", "aba", "ata", 'a', RiderItems.oni_ore, 'b',
				RiderItems.base_sword, 't', RiderItems.henshin_onsa_kirameki);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabutohead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabutohead, 1), "aaa",
				"a a", 'a', RiderItems.mini_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabutotroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabutotroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.mini_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabutolegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabutolegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.mini_zecter);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabuto_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabuto_rider_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.mini_zecter, 'c', RiderItems.kabuto_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":thebee_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.thebee_rider_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.mini_zecter, 'c', RiderItems.thebee_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drake_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drake_rider_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.mini_zecter, 'c', RiderItems.drake_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sasword_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sasword_rider_belt, 1), "aaa", "aca", "aaa", 'a', RiderItems.mini_zecter, 'c',
				RiderItems.sasword_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gatack_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gatack_rider_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.mini_zecter, 'c', RiderItems.gatack_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kickhopper_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.kickhopper_rider_belt, 1), "aaa", "aca", "aaa", 'a', RiderItems.mini_zecter,
				'c', RiderItems.kickhopper_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":puchhopper_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.puchhopper_rider_belt, 1), "aaa", "aca", "aaa", 'a', RiderItems.mini_zecter,
				'c', RiderItems.punchhopper_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dark_kabuto_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.dark_kabuto_rider_belt, 1), "aaa", "aca", "aaa", 'a', RiderItems.mini_zecter,
				'c', RiderItems.dark_kabuto_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hercus_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hercus_rider_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.unfinished_kabutick_zecter, 'c', RiderItems.hercus_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ketaros_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ketaros_rider_belt, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.unfinished_kabutick_zecter, 'c', RiderItems.ketaros_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":caucasus_rider_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.caucasus_rider_belt, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.unfinished_kabutick_zecter, 'c', RiderItems.caucasus_zecter);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabuto_kunai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabuto_kunai, 1),
				"ama", "aba", "aaa", 'a', RiderItems.mini_zecter, 'b', RiderItems.base_sword, 'm',
				RiderItems.kabuto_zecter);
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":kabuto_kunai_kunai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabuto_kunai_kunai),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kabuto_kunai) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":kabuto_kunai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabuto_kunai),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kabuto_kunai_kunai) });
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gatack_double_calibur"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gatack_double_calibur, 1), "ama", "aba", "aaa", 'a', RiderItems.mini_zecter,
				'b', RiderItems.base_sword, 'm', RiderItems.gatack_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gatack_double_calibur_minus"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gatack_double_calibur_minus, 1), "aaa", "aba", "ama", 'a',
				RiderItems.mini_zecter, 'b', RiderItems.base_sword, 'm', RiderItems.gatack_zecter);
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":gatack_double_calibur_twin"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gatack_double_calibur_twin),
				new Ingredient[] { Ingredient.fromItem(RiderItems.gatack_double_calibur),
						Ingredient.fromItem(RiderItems.gatack_double_calibur_minus) });
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sasword_yaiver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sasword_yaiver, 1),
				"ama", "aba", "aaa", 'a', RiderItems.mini_zecter, 'b', RiderItems.base_sword, 'm',
				RiderItems.sasword_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drake_grip"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drake_grip, 1), "ama",
				"aba", "aaa", 'a', RiderItems.mini_zecter, 'b', RiderItems.base_sword, 'm', RiderItems.drake_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zect_kunai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zect_kunai, 1), "ama",
				"aba", "aaa", 'a', RiderItems.mini_zecter, 'b', RiderItems.base_sword, 'm',
				RiderItems.dark_kabuto_zecter);
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":zect_kunai_kunai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zect_kunai_kunai),
				new Ingredient[] { Ingredient.fromItem(RiderItems.zect_kunai) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":zect_kunai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zect_kunai),
				new Ingredient[] { Ingredient.fromItem(RiderItems.zect_kunai_kunai) });
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":clock_up_pad"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.clock_up_pad, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.mini_zecter, 'b', Blocks.IRON_BLOCK);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zect_mizer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zect_mizer, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.mini_zecter, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":perfect_zecter"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.perfect_zecter, 1),
				"ama", "cba", "ada", 'a', RiderItems.mini_zecter, 'b', RiderItems.base_sword, 'm',
				RiderItems.perfectdrake_zecter, 'c', RiderItems.perfectthebee_zecter, 'd',
				RiderItems.perfectsasword_zecter);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_ohead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_ohead, 1), "aaa",
				"a a", 'a', RiderItems.imaginsand);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_otroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_otroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.imaginsand);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_olegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_olegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.imaginsand);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_oriderpass"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_oriderpass, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', Items.ENDER_PEARL);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gden_oriderpass"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gden_oriderpass, 1),
				"aca", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', Items.ENDER_PEARL, 'c',
				RiderItems.rider_ticket_g);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_o_master_pass"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_o_master_pass, 1),
				"aca", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', Items.ENDER_PEARL, 'c',
				RiderItems.rider_ticket_gaoh);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ktaros"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ktaros, 1), "asa",
				"rax", "aga", 'a', RiderItems.imaginsand, 'r', RiderItems.rider_ticket_rod, 'g',
				RiderItems.rider_ticket_gun, 'x', RiderItems.rider_ticket_ax, 's', RiderItems.rider_ticket_sword);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_odriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_odriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.imaginsand, 'c', RiderItems.rider_ticket_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":newden_obelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.newden_obelt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.imaginsand, 'c', RiderItems.rider_ticket_strike);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zeronosbelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zeronosbelt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.imaginsand, 'c', RiderItems.zeronos_altair_card);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":nega_den_odriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.nega_den_odriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.imaginsand, 'c', RiderItems.rider_ticket_nega);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":yuukibelt_skull"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.yuukibelt_skull, 1),
				"aca", "aaa", "aaa", 'a', RiderItems.imaginsand, 'c', RiderItems.rider_ticket_yuuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":yuukibelt_hijack"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.yuukibelt_hijack, 1),
				"aaa", "aaa", "aca", 'a', RiderItems.imaginsand, 'c', RiderItems.rider_ticket_yuuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gden_odriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gden_odriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.imaginsand, 'c', RiderItems.rider_ticket_g);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gaohbelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gaohbelt, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.imaginsand, 'c', RiderItems.rider_ticket_gaoh);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_denso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_denso, 1), "ama",
				"aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_denaxe"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_denaxe, 1), "ama",
				"aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm', RiderItems.rider_ticket_ax);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_denro"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_denro, 1), "ama",
				"aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm', RiderItems.rider_ticket_rod);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_dengu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_dengu, 1), "ama",
				"aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm', RiderItems.rider_ticket_gun);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":denkamen_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.denkamen_sword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gaoh_gasher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gaoh_gasher, 1),
				"ama", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_gaoh);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_gasher_vega"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_gasher_vega, 1),
				"ama", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.zeronos_vega_card);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_denhandaxe"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_denhandaxe, 1),
				"ama", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_wing);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_denboomerang"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_denboomerang, 1),
				"aaa", "aba", "ama", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_wing);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":momotaken"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.momotaken, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_ticket_sword, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":uratazao"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.uratazao, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_ticket_rod, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kintaono"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kintaono, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.rider_ticket_ax, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_denhijack"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_denhijack, 1),
				"aaa", "aba", "ama", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_yuuki);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gden_denjutte"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gden_denjutte, 1),
				"ama", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_g);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":macheteddy"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.macheteddy, 1), "ama",
				"aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_strike);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gden_dengu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gden_dengu, 1), "aaa",
				"aba", "ama", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm', RiderItems.rider_ticket_g);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":nega_den_gasher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.nega_den_gasher, 1),
				"ama", "aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.rider_ticket_nega);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zerogasher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zerogasher, 1), "ama",
				"aba", "aaa", 'a', RiderItems.imaginsand, 'b', RiderItems.base_sword, 'm',
				RiderItems.zeronos_altair_card);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kivahead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kivahead, 1), "aaa",
				"a a", 'a', RiderItems.fuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kivatroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kivatroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.fuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kivalegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kivalegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.fuestle);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kivadriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kivadriver, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.fuestle, 'c', RiderItems.wakeupfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ixa_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ixa_belt, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.fuestlefake, 'c', RiderItems.knucklefuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sagarc_belt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sagarc_belt, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.fuestle, 'c', RiderItems.sagafuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":arcdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.arcdriver, 1), "aca",
				"aaa", "aaa", 'a', RiderItems.fuestlefake, 'c', RiderItems.keyfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":reydriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.reydriver, 1), "aaa",
				"aaa", "aca", 'a', RiderItems.fuestlefake, 'c', RiderItems.keyfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":darkkivadriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.darkkivadriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.fuestle, 'c', RiderItems.darkwakeupfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":newkivadriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.newkivadriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.fuestle, 'c', RiderItems.newwakeupfuestle);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":garulu_saber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.garulu_saber, 1),
				"ama", "aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.base_sword, 'm',
				RiderItems.garulufuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":basshaamagnum"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.basshaamagnum, 1),
				"ama", "aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.base_sword, 'm',
				RiderItems.basshaafuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dogga_hammer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dogga_hammer, 1),
				"ama", "aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.base_sword, 'm', RiderItems.doggafuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zanbatsword_core"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zanbatsword_core, 1),
				"ama", "aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.base_sword, 'm', RiderItems.fuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zanbatsword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zanbatsword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.zanbatsword_core, 'm',
				RiderItems.tatsulot);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ixa_caliber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ixa_caliber, 1),
				"ama", "aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.base_sword, 'm',
				RiderItems.knucklefuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ixariser"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ixariser, 1), "ama",
				"aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.base_sword, 'm', RiderItems.risingfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":jacorder"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.jacorder, 1), "ama",
				"aba", "aaa", 'a', RiderItems.fuestle, 'b', RiderItems.base_sword, 'm', RiderItems.sagafuestle);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":decadehead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.decadehead, 1), "aaa",
				"a a", 'a', RiderItems.blankcard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":decadetroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.decadetroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.blankcard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":decadelegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.decadelegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.blankcard);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":decadedriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.decadedriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.blankcard, 'c', RiderItems.decadecard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":diend_driver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.diend_driver, 1),
				"aca", "aba", "aaa", 'a', RiderItems.blankcard, 'b', RiderItems.base_sword, 'c', RiderItems.diendcard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dark_decadedriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dark_decadedriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.blankcard, 'c', RiderItems.darkdecadecard);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ride_booker"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ride_booker, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blankcard, 'b', RiderItems.base_sword, 'm', RiderItems.decadecard);

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_rekka_decade"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ongekibo_rekka_decade), new Ingredient[] {
						Ingredient.fromItem(RiderItems.decadecard), Ingredient.fromItem(RiderItems.ongekibo_rekka) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":ongekibo_rekka_diend"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ongekibo_rekka_diend),
				new Ingredient[] { Ingredient.fromItem(RiderItems.diendcard),
						Ingredient.fromItem(RiderItems.ongekibo_rekka) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":dragon_kuugacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dragon_kuugacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuugacard),
						Ingredient.fromItem(RiderItems.kuuga_dragon) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":pegasus_kuugacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.pegasus_kuugacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuugacard),
						Ingredient.fromItem(RiderItems.kuuga_pegasus) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":titan_kuugacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.titan_kuugacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuugacard),
						Ingredient.fromItem(RiderItems.kuuga_titan) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":storm_agitocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.storm_agitocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.agitocard),
						Ingredient.fromItem(RiderItems.agito_storm) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":flame_agitocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.flame_agitocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.agitocard),
						Ingredient.fromItem(RiderItems.agito_flame) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":axel_faizcard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.axel_faizcard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.faizcard),
						Ingredient.fromItem(RiderItems.faiz_axel_mission_memory) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rod_den_ocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.rod_den_ocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.den_ocard),
						Ingredient.fromItem(RiderItems.rider_ticket_rod) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":axe_den_ocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.axe_den_ocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.den_ocard),
						Ingredient.fromItem(RiderItems.rider_ticket_ax) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":gun_den_ocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gun_den_ocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.den_ocard),
						Ingredient.fromItem(RiderItems.rider_ticket_gun) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":wing_den_ocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wing_den_ocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.den_ocard),
						Ingredient.fromItem(RiderItems.rider_ticket_wing) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":garulu_kivacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.garulu_kivacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kivacard),
						Ingredient.fromItem(RiderItems.garulufuestle) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":basshaa_kivacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.basshaa_kivacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kivacard),
						Ingredient.fromItem(RiderItems.basshaafuestle) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":dogga_kivacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dogga_kivacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kivacard),
						Ingredient.fromItem(RiderItems.doggafuestle) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":ultimate_kuugacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ultimate_kuugacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuugacard),
						Ingredient.fromItem(RiderItems.kuuga_ultimate) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":shining_agitocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.shining_agitocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.agitocard),
						Ingredient.fromItem(RiderItems.agito_shining) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":survive_ryukicard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.survive_ryukicard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.ryukicard),
						Ingredient.fromItem(RiderItems.survive_advent) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":blaster_faizcard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blaster_faizcard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.faizcard),
						Ingredient.fromItem(RiderItems.faiz_blaster_mission_memory) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":king_bladecard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.king_bladecard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.bladecard_de),
						Ingredient.fromItem(RiderItems.evolution_caucasus) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":armed_hibikicard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.armed_hibikicard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.hibikicard),
						Ingredient.fromItem(RiderItems.armed_saber) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":hyper_kabutocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hyper_kabutocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kabutocard),
						Ingredient.fromItem(RiderItems.hyper_zecter) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":liner_den_ocard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.liner_den_ocard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.den_ocard),
						Ingredient.fromItem(RiderItems.rider_ticket) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":emperor_kivacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.emperor_kivacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kivacard),
						Ingredient.fromItem(RiderItems.tatsulot) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":k_touch"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.k_touch),
				new Ingredient[] { Ingredient.fromItem(RiderItems.ultimate_kuugacard),
						Ingredient.fromItem(RiderItems.shining_agitocard),
						Ingredient.fromItem(RiderItems.survive_ryukicard),
						Ingredient.fromItem(RiderItems.blaster_faizcard),
						Ingredient.fromItem(RiderItems.king_bladecard),
						Ingredient.fromItem(RiderItems.armed_hibikicard),
						Ingredient.fromItem(RiderItems.hyper_kabutocard),
						Ingredient.fromItem(RiderItems.liner_den_ocard),
						Ingredient.fromItem(RiderItems.emperor_kivacard) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":g4card"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.g4card),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard), Ingredient.fromItem(RiderItems.g4) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":ryugacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ryugacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard),
						Ingredient.fromItem(RiderItems.dragblacker_advent) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":orgacard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.orgacard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard),
						Ingredient.fromItem(RiderItems.orga_mission_memory) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":glaivecard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.glaivecard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard),
						Ingredient.fromItem(RiderItems.changekerberosglaive) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":kabukicard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabukicard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard),
						Ingredient.fromItem(RiderItems.henshin_onsa_kabuki) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":caucasuscard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.caucasuscard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard),
						Ingredient.fromItem(RiderItems.caucasus_zecter) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":arccard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.arccard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard),
						Ingredient.fromItem(RiderItems.keyfuestle) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":skullcard"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.skullcard),
				new Ingredient[] { Ingredient.fromItem(RiderItems.blankcard),
						Ingredient.fromItem(RiderItems.skull_memory) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":k_touch_diend"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.k_touch_diend),
				new Ingredient[] { Ingredient.fromItem(RiderItems.g4card), Ingredient.fromItem(RiderItems.ryugacard),
						Ingredient.fromItem(RiderItems.orgacard), Ingredient.fromItem(RiderItems.glaivecard),
						Ingredient.fromItem(RiderItems.kabukicard), Ingredient.fromItem(RiderItems.caucasuscard),
						Ingredient.fromItem(RiderItems.arccard), Ingredient.fromItem(RiderItems.skullcard) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Whead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Whead, 1), "aaa",
				"a a", 'a', RiderItems.gaiamemory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Wtroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Wtroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.gaiamemory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Wlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Wlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.gaiamemory);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Wdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Wdriver, 1), "aaa",
				"cae", "aaa", 'a', RiderItems.gaiamemory, 'c', RiderItems.cyclone_memory, 'e', RiderItems.joker_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":lostdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.lostdriver, 1), "aaa",
				"aca", "aaa", 'a', RiderItems.gaiamemory, 'c', RiderItems.joker_t2_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":lostdriver_skull"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.lostdriver_skull, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.gaiamemory, 'c', RiderItems.skull_t2_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":lostdriver_eternal"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.lostdriver_eternal, 1), "aaa", "aca", "aaa", 'a', RiderItems.gaiamemory, 'c',
				RiderItems.eternal_t2_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":lostdriver_cyclone"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.lostdriver_cyclone, 1), "aaa", "aca", "aaa", 'a', RiderItems.gaiamemory, 'c',
				RiderItems.cyclone_t2_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":accel_driver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.accel_driver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.gaiamemory, 'c', RiderItems.accel_memory);

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":unrefined_memory_g"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.unrefined_memory_g),
				new Ingredient[] { Ingredient.fromItem(RiderItems.gaiamemory), Ingredient.fromItem(Items.GOLD_INGOT) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":unrefined_memory_s"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.unrefined_memory_s),
				new Ingredient[] { Ingredient.fromItem(RiderItems.gaiamemory), Ingredient.fromItem(Items.IRON_INGOT) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":unrefined_memory_t2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.unrefined_memory_t2),
				new Ingredient[] { Ingredient.fromItem(RiderItems.gaiamemory), Ingredient.fromItem(Items.DIAMOND) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fang_memory"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.fang_memory, 1),
				"fff", "fmf", "fff", 'f', Items.BONE, 'm', RiderItems.fang_memory_un);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":trial_memory"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.trial_memory, 1),
				"byr", "iii", " m ", 'i', Items.IRON_INGOT, 'm', RiderItems.trial_memory_un, 'r',
				new ItemStack(Blocks.STAINED_GLASS, 1, 14), 'b', new ItemStack(Blocks.STAINED_GLASS, 1, 11), 'y',
				new ItemStack(Blocks.STAINED_GLASS, 1, 4));

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":xtreme_memory"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.xtreme_memory, 1),
				"iei", "sig", "iii", 'g', RiderItems.xtreme_memory_g, 's', RiderItems.xtreme_memory_s, 'i',
				Items.GOLD_INGOT, 'e', RiderItems.gaiamemory);

		// GameRegistry.addShapelessRecipe(new
		// ResourceLocation(Refercence.MODID+":xtreme_memory"),new
		// ResourceLocation(Refercence.MODID+":kamen_rider"),new
		// ItemStack(RiderItems.xtreme_memory), new
		// Ingredient[]{Ingredient.fromItem(RiderItems.xtreme_memory_g),Ingredient.fromItem(RiderItems.xtreme_memory_s)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gaia_memory_refiner"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gaia_memory_refiner, 1), "rir", "igi", "rir", 'i', Items.REDSTONE, 'g',
				RiderItems.gaiamemory, 'r', Items.IRON_INGOT);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":metal_shaft"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.metal_shaft, 1),
				"ama", "aba", "aaa", 'a', RiderItems.gaiamemory, 'b', RiderItems.base_sword, 'm',
				RiderItems.metal_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":trigger_magnum"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.trigger_magnum, 1),
				"ama", "aba", "aaa", 'a', RiderItems.gaiamemory, 'b', RiderItems.base_sword, 'm',
				RiderItems.trigger_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":prism_bicker"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.prism_bicker, 1),
				"ama", "aba", "aaa", 'a', RiderItems.gaiamemory, 'b', RiderItems.base_sword, 'm',
				RiderItems.prism_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":shield_prism_bicker"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.shield_prism_bicker, 1), "ama", "aba", "aaa", 'a', RiderItems.gaiamemory, 'b',
				Items.SHIELD, 'm', RiderItems.prism_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":eternal_edge"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.eternal_edge, 1),
				"ama", "aba", "aaa", 'a', RiderItems.gaiamemory, 'b', RiderItems.base_sword, 'm',
				RiderItems.eternal_t2_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":skull_magnum"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.skull_magnum, 1),
				"ama", "aba", "aaa", 'a', RiderItems.gaiamemory, 'b', RiderItems.base_sword, 'm',
				RiderItems.skull_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":engine_blade"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.engine_blade, 1),
				"ama", "aba", "aaa", 'a', RiderItems.gaiamemory, 'b', RiderItems.base_sword, 'm',
				RiderItems.engine_memory);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":OOOhead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.OOOhead, 1), "aaa",
				"a a", 'a', RiderItems.cellmedal);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":OOOtroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.OOOtroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.cellmedal);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":OOOlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.OOOlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.cellmedal);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":o_scanner"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.o_scanner, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.cellmedal, 'b', Items.ENDER_PEARL);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":OOOdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.OOOdriver, 1), "aaa",
				"cde", "aaa", 'a', RiderItems.cellmedal, 'c', RiderItems.taka, 'd', RiderItems.tora, 'e',
				RiderItems.batta);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":aqua_driver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.aqua_driver, 1),
				"aaa", "ada", "aaa", 'a', RiderItems.cellmedal, 'd', Items.WATER_BUCKET);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":poseidon_driver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.poseidon_driver, 1),
				"cae", "aaa", "ada", 'a', RiderItems.cellmedal, 'c', RiderItems.same, 'd', RiderItems.ookamiuo, 'e',
				RiderItems.kujira);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":birth_driver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.birth_driver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.cellmedal, 'c', RiderItems.birth_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":birth_driver_prototype"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.birth_driver_prototype, 1), "aaa", "aca", "aaa", 'a', RiderItems.cellmedal,
				'c', RiderItems.proto_birth_core);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":medajalibur"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.medajalibur, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.cellmedal, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":tajaspinner"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.tajaspinner, 1),
				"pat", "pbt", "aaa", 'a', RiderItems.taka, 'b', RiderItems.base_sword, 'p', RiderItems.condor, 't',
				RiderItems.kujaku);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":medagaburyu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.medagaburyu, 1),
				"ptr", "aba", "aaa", 'a', RiderItems.cellmedal, 'b', RiderItems.base_sword, 'p', RiderItems.ptera, 't',
				RiderItems.tricera, 'r', RiderItems.tyranno);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":birth_buster"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.birth_buster, 1),
				"ama", "aba", "aaa", 'a', RiderItems.cellmedal, 'b', RiderItems.base_sword, 'm', RiderItems.birth_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":birth_buster_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.birth_buster, 1),
				"ama", "aba", "aaa", 'a', RiderItems.cellmedal, 'b', RiderItems.base_sword, 'm',
				RiderItems.proto_birth_core);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":deepest_harpoon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.deepest_harpoon, 1),
				"cad", "aba", "aea", 'a', RiderItems.cellmedal, 'b', RiderItems.base_sword, 'c', RiderItems.same, 'd',
				RiderItems.kujira, 'e', RiderItems.ookamiuo);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Fourzehead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Fourzehead, 1), "aaa",
				"a a", 'a', RiderItems.astroswitch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Fourzetroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Fourzetroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.astroswitch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Fourzelegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Fourzelegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.astroswitch);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Fourzedriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Fourzedriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.astroswitch, 'c', RiderItems.rocket_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":meteor_driver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.meteor_driver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.gate_switch, 'c', RiderItems.meteor_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":nadeshikodriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.nadeshikodriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.gate_switch, 'c', RiderItems.solu_switch);

		// GameRegistry.addShapedRecipe(new
		// ResourceLocation(Refercence.MODID+":rocket"), new
		// ResourceLocation(Refercence.MODID+":kamen_rider"),new
		// ItemStack(RiderItems.rocket,1), "ama","aba","aaa", 'a',
		// RiderItems.astroswitch, 'b', RiderItems.base_sword, 'm',
		// RiderItems.rocket_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":billytherod"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.billytherod, 1),
				"ama", "aba", "aaa", 'a', RiderItems.astroswitch, 'b', RiderItems.base_sword, 'm',
				RiderItems.elek_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hee_hackgun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hee_hackgun, 1),
				"ama", "aba", "aaa", 'a', RiderItems.astroswitch, 'b', RiderItems.base_sword, 'm',
				RiderItems.fire_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":barizun_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.barizun_sword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.astroswitch, 'b', RiderItems.base_sword, 'm',
				RiderItems.cosmic_swich);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizardhead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wizardhead, 1), "aaa",
				"a a", 'a', RiderItems.wizardgem);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizardtroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wizardtroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.wizardgem);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizardlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wizardlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.wizardgem);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizardriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wizardriver, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', RiderItems.flame_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":whitewizardriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.whitewizardriver, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.wiseman_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":whitewizardriverf"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.whitewizardriverf, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.hope_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":magewizardriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.magewizardriver, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.mage_o_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":magewizardriver_b"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.magewizardriver_b, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.mage_b_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":magewizardriver_g"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.magewizardriver_g, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.mage_g_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sorcererdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sorcererdriver, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.sorcerer_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blackwizardriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blackwizardriver, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.black_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":darkwizardriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.darkwizardriver, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.dark_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":beastdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.beastdriver, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem2, 'f', RiderItems.beast_ring);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizarswordgun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wizarswordgun, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.wizardgem, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":axcalibur"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.axcalibur, 1), "ama",
				"aba", "aaa", 'a', RiderItems.wizardgem, 'b', RiderItems.base_sword, 'm', RiderItems.infinity_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dice_saber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dice_saber, 1), "ama",
				"aba", "aaa", 'a', RiderItems.wizardgem, 'b', RiderItems.base_sword, 'm', RiderItems.beast_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":mirage_magnum"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.mirage_magnum, 1),
				"ama", "aba", "aaa", 'a', RiderItems.wizardgem, 'b', RiderItems.base_sword, 'm', RiderItems.hyper_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dis_halberd"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dis_halberd, 1),
				"ama", "aba", "aaa", 'a', RiderItems.wizardgem, 'b', RiderItems.base_sword, 'm',
				RiderItems.sorcerer_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hammelcane"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hammelcane, 1), "ama",
				"aba", "aaa", 'a', RiderItems.wizardgem, 'b', RiderItems.base_sword, 'm', RiderItems.wiseman_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizarswordgun_mage"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.wizarswordgun_mage, 1), "ama", "aba", "aaa", 'a', RiderItems.wizardgem, 'b',
				RiderItems.base_sword, 'm', RiderItems.mage_b_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizarswordgun_mage_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.wizarswordgun_mage, 1), "ama", "aba", "aaa", 'a', RiderItems.wizardgem, 'b',
				RiderItems.base_sword, 'm', RiderItems.mage_o_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizarswordgun_mage_3"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.wizarswordgun_mage, 1), "ama", "aba", "aaa", 'a', RiderItems.wizardgem, 'b',
				RiderItems.base_sword, 'm', RiderItems.mage_g_ring);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drago_timer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drago_timer, 1),
				"aca", "fad", "aea", 'a', RiderItems.wizardgem, 'c', RiderItems.flame_ring_dragon, 'd',
				RiderItems.water_ring_dragon, 'e', RiderItems.hurricane_ring_dragon, 'f', RiderItems.land_ring_dragon);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":light_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.light_ring, 1), "aaa",
				"afa", "aaa", 'a', RiderItems.wizardgem, 'f', Blocks.TORCH);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":explosion_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.explosion_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Blocks.TNT);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bind_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bind_ring, 1), "aaa",
				"afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.STRING);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":teleport_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.teleport_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.ENDER_PEARL);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":liquid_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.liquid_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.WATER_BUCKET);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drill_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drill_ring, 1), "aaa",
				"afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.GOLDEN_PICKAXE);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fall_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.fall_ring, 1), "aaa",
				"afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.GOLDEN_SHOVEL);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kick_strike_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kick_strike_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.GOLDEN_BOOTS);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sleep_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sleep_ring, 1), "aaa",
				"afa", "aaa", 'a', RiderItems.wizardgem, 'f', Blocks.BED);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":defend_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.defend_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Blocks.COBBLESTONE_WALL);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":eclipse_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.eclipse_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Blocks.REDSTONE_TORCH);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":thunder_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.thunder_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":excite_ring"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.excite_ring, 1),
				"aaa", "afa", "aaa", 'a', RiderItems.wizardgem, 'f', Items.SUGAR);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Gaimhead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Gaimhead, 1), "aaa",
				"a a", 'a', RiderItems.himawari_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Gaimtroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Gaimtroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.himawari_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":Gaimlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.Gaimlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.himawari_lockseed);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_gaim"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_gaim, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_baron"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_baron, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.banana_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_bujin_gaim"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_bujin_gaim, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.blood_orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_fifteen"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_fifteen, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.fifteen_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_gridon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_gridon, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.donguri_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_knuckle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_knuckle, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.kurumi_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_kurokage"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_kurokage, 1), "aca", "aaa", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.matsubokkuri_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_kurokage_troopers"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_kurokage_troopers, 1), "aaa", "aaa", "aca", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.matsubokkuri_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_ryugen"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_ryugen, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.budou_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_zangetsu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_zangetsu, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.melon_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_duke"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_duke, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.lemon_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_idunn"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_idunn, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.forbidden_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_jam"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_jam, 1), "aaa", "aca", "aaa", 'a', RiderItems.himawari_lockseed,
				'c', RiderItems.black_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_barvo"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_barvo, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.durian_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_kamuro"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_kamuro, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.silver_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_mars"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_mars, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.golden_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_savior"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_savior, 1), "aaa", "acb", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.zakuro_lockseed, 'b', RiderItems.blood_orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_maja"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_maja, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.maja_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_baron_black"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_baron_black, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.black_baron_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sengoku_driver_gaim_natsumikan"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sengoku_driver_gaim_natsumikan, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_lockseed, 'c', RiderItems.natsumikan_lockseed);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genesis_driver_duke"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genesis_driver_duke, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_energy_lockseed, 'c', RiderItems.lemon_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genesis_driver_sigurd"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genesis_driver_sigurd, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_energy_lockseed, 'c', RiderItems.cherry_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genesis_driver_marika"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genesis_driver_marika, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_energy_lockseed, 'c', RiderItems.peach_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genesis_driver_zangetsu_shin"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genesis_driver_zangetsu_shin, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_energy_lockseed, 'c', RiderItems.melon_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genesis_driver_kurokage_shin"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genesis_driver_kurokage_shin, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_energy_lockseed, 'c', RiderItems.matsubokkuri_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genesis_driver_baron"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genesis_driver_baron, 1), "aaa", "aca", "aba", 'a',
				RiderItems.himawari_energy_lockseed, 'b', RiderItems.banana_lockseed, 'c',
				RiderItems.lemon_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genesis_driver_tyrant"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genesis_driver_tyrant, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.himawari_energy_lockseed, 'c', RiderItems.dragon_fruits_energy_lockseed);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":musou_saber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.musou_saber, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kagematsu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kagematsu, 1), "ama",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.matsubokkuri_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":donkachi"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.donkachi, 1), "ama",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.donguri_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":melon_defender"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.melon_defender, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.melon_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":pine_iron"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.pine_iron, 1), "ama",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.pine_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ichigo_kunai"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ichigo_kunai, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.ichigo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":daidaimaru"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.daidaimaru, 1), "ama",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":banana_spear"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.banana_spear, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.banana_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":budou_ryuhou"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.budou_ryuhou, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.budou_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":mango_punisher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.mango_punisher, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.mango_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":duri_noko"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.duri_noko, 1), "ama",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.durian_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kiwi_gekirin"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kiwi_gekirin, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.kiwi_lockseed);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blood_daidaimaru"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blood_daidaimaru, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.blood_orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dark_daidaimaru"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dark_daidaimaru, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.black_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kagematsu_shin"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kagematsu_shin, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.matsubokkuri_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":yomimaru"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.yomimaru, 1), "ama",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.fifteen_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":apple_reflecter"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.apple_reflecter, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.forbidden_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sword_bringer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sword_bringer, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.golden_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":souginjou"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.souginjou, 1), "ama",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.silver_ringo_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":watermelon_defender"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.watermelon_defender, 1), "ama", "aba", "aaa", 'a',
				RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm', RiderItems.watermelon_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sonic_arrow"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sonic_arrow, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.lemon_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sonic_arrow_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sonic_arrow, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.peach_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sonic_arrow_3"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sonic_arrow, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.cherry_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sonic_arrow_4"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.sonic_arrow, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.melon_energy_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":suika_sojinto"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.suika_sojinto, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.suika_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":suika_sojinto_baron_ver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.suika_sojinto_baron_ver, 1), "aba", "aca", "ada", 'a',
				RiderItems.himawari_lockseed, 'b', RiderItems.suika_lockseed, 'c', RiderItems.base_sword, 'd',
				RiderItems.banana_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":savior_arrow"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.savior_arrow, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.zakuro_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabi_daidaimaru"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabi_daidaimaru, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.kabi_orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":maja_yomimaru"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.maja_yomimaru, 1),
				"ama", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.base_sword, 'm',
				RiderItems.maja_lockseed);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":rider_ichigo_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.rider_ichigo_lockseed, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.himawari_lockseed, 'b', RiderItems.rider_circuit);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kuuga_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.kuuga_mighty);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":agito_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.agito_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.agito_ground);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ryuki_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ryuki_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.dragreder_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faiz_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faiz_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.faiz_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blade_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blade_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.changebeetle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hibiki_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hibiki_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.henshin_onsa);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kaubuto_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kaubuto_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.kabuto_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_o_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_o_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.rider_ticket_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kiva_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kiva_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.wakeupfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":decade_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.decade_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.decadecard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":w_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.w_lockseed, 1), "aaa",
				"aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.joker_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ooo_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ooo_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.taka);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fourze_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.fourze_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.rocket_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizard_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wizard_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.flame_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gaim_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gaim_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.orange_lockseed, 'b', RiderItems.himawari_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drive_lockseed"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drive_lockseed, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.speedshift);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drivehead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drivehead, 1), "aaa",
				"a a", 'a', RiderItems.proto_speedshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drivetroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drivetroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.proto_speedshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drivelegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drivelegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.proto_speedshift);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drivedriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drivedriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.proto_speedshift, 'c', RiderItems.speedshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":mach_driver_honoh"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.mach_driver_honoh, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.signal_chaser, 'c', RiderItems.signal_mach);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":metro_pd_driver_honoh"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.metro_pd_driver_honoh, 1), "aaa", "aca", "aaa", 'a', RiderItems.signal_chaser,
				'c', RiderItems.tokujoka_key);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":break_gunner"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.break_gunner, 1),
				"ama", "aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				RiderItems.proto_speedshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":lupin_gunner"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.lupin_gunner, 1),
				"ama", "aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				Blocks.GOLD_BLOCK);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":handle_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.handle_sword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				RiderItems.wildshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":door_ju"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.door_ju, 1), "ama",
				"aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				RiderItems.techniqueshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":trailer_hou"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.trailer_hou, 1),
				"ama", "aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				RiderItems.formulashift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zenrin_shooter"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zenrin_shooter, 1),
				"ama", "aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				RiderItems.signal_mach);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blade_gunner"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blade_gunner, 1),
				"ama", "aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				RiderItems.shift_next);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":shingouax"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.shingouax, 1), "ama",
				"aba", "aaa", 'a', RiderItems.proto_speedshift, 'b', RiderItems.base_sword, 'm',
				RiderItems.signal_chaser);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ghosthead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ghosthead, 1), "aaa",
				"a a", 'a', RiderItems.ghost_icons);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ghosttroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ghosttroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.ghost_icons);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ghostlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ghostlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.ghost_icons);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ghostdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ghostdriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.ghost_icons, 'c', RiderItems.ore_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":specterdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.specterdriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.ghost_icons, 'c', RiderItems.specter_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dark_ghostdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.dark_ghostdriver, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.ghost_icons, 'c', RiderItems.dark_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zero_specterdriver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.zero_specterdriver, 1), "aaa", "aca", "aaa", 'a', RiderItems.ghost_icons, 'c',
				RiderItems.zero_specter_ghost_icon);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":mega_ulorder"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.mega_ulorder, 1),
				"aaa", "aca", "aaa", 'a', RiderItems.ghost_gammaicons, 'c', RiderItems.necrom_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":proto_mega_ulorder_b"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.proto_mega_ulorder_b, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.ghost_gammaicons, 'c', RiderItems.dark_necrom_blue_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":proto_mega_ulorder_r"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.proto_mega_ulorder_r, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.ghost_gammaicons, 'c', RiderItems.dark_necrom_red_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":proto_mega_ulorder_y"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.proto_mega_ulorder_y, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.ghost_gammaicons, 'c', RiderItems.dark_necrom_yellow_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":proto_mega_ulorder_p"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.proto_mega_ulorder_p, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.ghost_gammaicons, 'c', RiderItems.dark_necrom_pink_ghost_icon);
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":unfinished_eyecon_driver_g"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.unfinished_eyecon_driver_g),
				new Ingredient[] { Ingredient.fromItem(RiderItems.musashi_ghost_icon),
						Ingredient.fromItem(RiderItems.edison_ghost_icon),
						Ingredient.fromItem(RiderItems.robin_ghost_icon),
						Ingredient.fromItem(RiderItems.newton_ghost_icon),
						Ingredient.fromItem(RiderItems.billy_the_kid_icon),
						Ingredient.fromItem(RiderItems.beethoven_icon), Ingredient.fromItem(RiderItems.benkei_icon),
						Ingredient.fromItem(RiderItems.ryoma_icon) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":eyecon_driver_g"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.eyecon_driver_g),
				new Ingredient[] { Ingredient.fromItem(RiderItems.unfinished_eyecon_driver_g),
						Ingredient.fromItem(RiderItems.himiko_ghost_icon),
						Ingredient.fromItem(RiderItems.nobunaga_icon), Ingredient.fromItem(RiderItems.tutankhamun_icon),
						Ingredient.fromItem(RiderItems.houdini_icon), Ingredient.fromItem(RiderItems.sanzo_icon),
						Ingredient.fromItem(RiderItems.grimm_icon) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_blade"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_saber_blade, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b',
				RiderItems.base_sword, 'm', RiderItems.ore_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_gun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gan_gun_saber_gun, 1),
				"ama", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.base_sword, 'm',
				RiderItems.edison_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_nitouryu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_saber_nitouryu, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons,
				'b', RiderItems.base_sword, 'm', RiderItems.musashi_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_condor_denwor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_saber_condor_denwor, 1), "ama", "aba", "aaa", 'a',
				RiderItems.ghost_icons, 'b', RiderItems.base_sword, 'm', RiderItems.robin_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_naginata"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_saber_naginata, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons,
				'b', RiderItems.base_sword, 'm', RiderItems.newton_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_rifle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_saber_rifle, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b',
				RiderItems.base_sword, 'm', RiderItems.billy_the_kid_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_hammer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_saber_hammer, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons,
				'b', RiderItems.base_sword, 'm', RiderItems.benkei_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_saber_nitouryu_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_saber_nitouryu_2, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons,
				'b', RiderItems.base_sword, 'm', RiderItems.beethoven_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sunglasseslasher_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sunglasseslasher_sword, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons,
				'b', RiderItems.base_sword, 'm', RiderItems.toucon_boost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_hand_rod"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gan_gun_hand_rod, 1),
				"ama", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.base_sword, 'm',
				RiderItems.specter_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_hand_kama"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gan_gun_hand_kama, 1),
				"ama", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.base_sword, 'm',
				RiderItems.tutankhamun_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":deep_slasher_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.deep_slasher_sword, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b',
				RiderItems.base_sword, 'm', RiderItems.deep_specter_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gan_gun_catcher_rod"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gan_gun_catcher_rod, 1), "ama", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b',
				RiderItems.base_sword, 'm', RiderItems.necrom_ghost_icon);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kuuga_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kuuga_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.kuuga_mighty);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":agito_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.agito_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.agito_ground);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ryuki_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ryuki_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.dragreder_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faiz_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faiz_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.faiz_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blade_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blade_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.changebeetle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hibiki_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hibiki_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.henshin_onsa);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kabuto_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kabuto_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.kabuto_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":den_o_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.den_o_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.rider_ticket_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kiva_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kiva_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.wakeupfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":decade_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.decade_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.decadecard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":double_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.double_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.joker_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ooo_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ooo_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.taka);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fourze_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.fourze_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.rocket_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizard_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.wizard_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.flame_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gaim_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gaim_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drive_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drive_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.speedshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ghost_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ghost_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ore_ghost_icon, 'b', RiderItems.ghost_icons);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ex_aid_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ex_aid_ghost_icon, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.ghost_icons, 'b', RiderItems.mighty_action_x_gashat);

		GameRegistry.addShapelessRecipe(
				new ResourceLocation(Refercence.MODID + ":unfinished_fourtyfive_heisei_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.unfinished_fourtyfive_heisei_ghost_icon),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kuuga_ghost_icon),
						Ingredient.fromItem(RiderItems.agito_ghost_icon),
						Ingredient.fromItem(RiderItems.ryuki_ghost_icon),
						Ingredient.fromItem(RiderItems.faiz_ghost_icon),
						Ingredient.fromItem(RiderItems.blade_ghost_icon),
						Ingredient.fromItem(RiderItems.hibiki_ghost_icon),
						Ingredient.fromItem(RiderItems.kabuto_ghost_icon),
						Ingredient.fromItem(RiderItems.den_o_ghost_icon),
						Ingredient.fromItem(RiderItems.kiva_ghost_icon) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":fourtyfive_heisei_ghost_icon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.fourtyfive_heisei_ghost_icon),
				new Ingredient[] { Ingredient.fromItem(RiderItems.unfinished_fourtyfive_heisei_ghost_icon),
						Ingredient.fromItem(RiderItems.decade_ghost_icon),
						Ingredient.fromItem(RiderItems.double_ghost_icon),
						Ingredient.fromItem(RiderItems.ooo_ghost_icon),
						Ingredient.fromItem(RiderItems.fourze_ghost_icon),
						Ingredient.fromItem(RiderItems.wizard_ghost_icon),
						Ingredient.fromItem(RiderItems.gaim_ghost_icon),
						Ingredient.fromItem(RiderItems.drive_ghost_icon),
						Ingredient.fromItem(RiderItems.ghost_ghost_icon) });

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":blank_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blank_gashat),
				new Ingredient[] { Ingredient.fromItem(RiderItems.bugster_virus_dna),
						Ingredient.fromItem(Items.IRON_INGOT), Ingredient.fromItem(Items.REDSTONE) });
		GameRegistry.addShapelessRecipe(
				new ResourceLocation(Refercence.MODID + ":mighty_brothers_xx_unfinished_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.mighty_brothers_xx_unfinished_gashat),
				new Ingredient[] { Ingredient.fromItem(RiderItems.xx_bugster_virus_dna),
						Ingredient.fromItem(Items.IRON_INGOT), Ingredient.fromItem(Items.REDSTONE) });
		GameRegistry.addShapelessRecipe(
				new ResourceLocation(Refercence.MODID + ":unfinished_kamen_rider_chronicle_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.unfinished_kamen_rider_chronicle_gashat),
				new Ingredient[] { Ingredient.fromItem(RiderItems.gamedeus_virus_dna),
						Ingredient.fromItem(Items.IRON_INGOT), Ingredient.fromItem(Items.REDSTONE) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":unfinished_maximum_mighty_x_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.unfinished_maximum_mighty_x_gashat),
				new Ingredient[] { Ingredient.fromItem(RiderItems.xx_bugster_virus_dna),
						Ingredient.fromItem(RiderItems.bakusou_bike_gashat), Ingredient.fromItem(Items.IRON_INGOT),
						Ingredient.fromItem(Items.IRON_INGOT), Ingredient.fromItem(Items.IRON_INGOT),
						Ingredient.fromItem(Items.REDSTONE) });
		// GameRegistry.addShapelessRecipe(new
		// ResourceLocation(Refercence.MODID+":blank_gashat"),new
		// ResourceLocation(Refercence.MODID+":kamen_rider"),new
		// ItemStack(RiderItems.blank_gashat), new
		// Ingredient[]{Ingredient.fromItem(RiderItems.bugster_virus_dna),Ingredient.fromItem(Items.IRON_INGOT)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ex_aidhead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ex_aidhead, 1), "aaa",
				"a a", 'a', RiderItems.blank_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ex_aidtroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ex_aidtroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.blank_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ex_aidlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ex_aidlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.blank_gashat);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_ex_aid"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_ex_aid, 1), "aaa", "aca", "aaa", 'a', RiderItems.blank_gashat,
				'c', RiderItems.mighty_action_x_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_brave"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_brave, 1), "aaa", "aca", "aaa", 'a', RiderItems.blank_gashat, 'c',
				RiderItems.taddle_quest_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_snipe"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_snipe, 1), "aaa", "aca", "aaa", 'a', RiderItems.blank_gashat, 'c',
				RiderItems.bang_bang_shooting_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_lazer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_lazer, 1), "aaa", "aca", "aaa", 'a', RiderItems.blank_gashat, 'c',
				RiderItems.bakusou_bike_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_genmu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_genmu, 1), "aaa", "aca", "aaa", 'a', RiderItems.blank_gashat, 'c',
				RiderItems.proto_mighty_action_x_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_lazer_turbo"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_lazer_turbo, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.blank_gashat, 'c', RiderItems.proto_bakusou_bike_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_paradox"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_paradox, 1), "aaa", "cab", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.knock_out_fighter_gashat, 'c', RiderItems.perfect_puzzle_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_proto_brave"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_proto_brave, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.blank_gashat, 'c', RiderItems.proto_taddle_quest_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_proto_snipe"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_proto_snipe, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.blank_gashat, 'c', RiderItems.proto_bang_bang_shooting_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_truebrave"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_truebrave, 1), "aaa", "aca", "aaa", 'a', RiderItems.blank_gashat,
				'c', RiderItems.taddle_legacy_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_fuuma"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_fuuma, 1), "aaa", "aca", "aaa", 'a', RiderItems.blank_gashat, 'c',
				RiderItems.hurricane_ninja_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_anotherparadox"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_anotherparadox, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.blank_gashat, 'c', RiderItems.gashat_gear_dual_another);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_chronos"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_chronos, 1), "aaa", "cac", "aaa", 'a', RiderItems.blank_gashat,
				'c', RiderItems.kamen_rider_chronicle_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gamer_driver_gamedeus_muteki"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gamer_driver_gamedeus_muteki, 1), "aaa", "acd", "aaa", 'a',
				RiderItems.blank_gashat, 'c', RiderItems.gamedeus_hyper_muteki_gashat, 'd',
				RiderItems.maximum_mighty_x_gashat);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_bugvisor_genmu"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_bugvisor_genmu, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.unfinished_kamen_rider_chronicle_gashat, 'c', RiderItems.dangerous_zombie_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_bugvisor_ii_chronos"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_bugvisor_ii_chronos, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.unfinished_kamen_rider_chronicle_gashat, 'c', RiderItems.kamen_rider_chronicle_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_bugvisor_ii_poppy"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_bugvisor_ii_poppy, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.unfinished_kamen_rider_chronicle_gashat, 'c', RiderItems.toki_meki_crisis_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_bugvisor_ii_lazer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_bugvisor_ii_lazer, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.unfinished_kamen_rider_chronicle_gashat, 'c', RiderItems.giri_giri_chambara_gashat);

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":paradoxbelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.paradoxbelt),
				new Ingredient[] { Ingredient.fromItem(RiderItems.knock_out_fighter_gashat) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":paradoxbelt_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.paradoxbelt),
				new Ingredient[] { Ingredient.fromItem(RiderItems.perfect_puzzle_gashat) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rideplayerbelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.rideplayerbelt),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kamen_rider_chronicle_gashat) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rideplayerbelt_nico"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.rideplayerbelt_nico),
				new Ingredient[] { Ingredient.fromItem(RiderItems.kamen_rider_chronicle_gashat),
						Ingredient.fromItem(RiderItems.bang_bang_shooting_gashat) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":ninjaplayerbelt"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ninjaplayerbelt),
				new Ingredient[] { Ingredient.fromItem(RiderItems.hurricane_ninja_gashat) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_bugvisor"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gashacon_bugvisor, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.dangerous_zombie_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_bugvisor_ii"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_bugvisor_ii, 1), "ama", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.base_sword, 'm', RiderItems.kamen_rider_chronicle_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_bugvisor_ii_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_bugvisor_ii, 1), "ama", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.base_sword, 'm', RiderItems.toki_meki_crisis_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ride_weapon"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ride_weapon, 1),
				"aaa", "aba", "ama", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.kamen_rider_chronicle_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_breaker"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gashacon_breaker, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.mighty_action_x_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_breaker_ham"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_breaker_ham, 1), "aaa", "aba", "ama", 'a', RiderItems.blank_gashat,
				'b', RiderItems.base_sword, 'm', RiderItems.mighty_action_x_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_key_slasher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_key_slasher, 1), "ama", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.base_sword, 'm', RiderItems.mighty_brothers_xx_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gashacon_sword, 1),
				"aaa", "aba", "ama", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.taddle_quest_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_sword_ice"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_sword_ice, 1), "ama", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b',
				RiderItems.base_sword, 'm', RiderItems.taddle_quest_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_magnum_gun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_magnum_gun, 1), "ama", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.base_sword, 'm', RiderItems.bang_bang_shooting_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_sparrow_sickle_a"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_sparrow_sickle_a, 1), "ama", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm', RiderItems.bakusou_bike_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_sparrow_sickle_b"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_sparrow_sickle_b, 1), "ama", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm', RiderItems.giri_giri_chambara_gashat);
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":gashacon_sparrow_arrow"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.gashacon_sparrow_arrow),
				new Ingredient[] { Ingredient.fromItem(RiderItems.gashacon_sparrow_sickle_a),
						Ingredient.fromItem(RiderItems.gashacon_sparrow_sickle_b) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":parabragun_axe"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.parabragun_axe, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.knock_out_fighter_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":parabragun_axe"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.parabragun_axe, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.perfect_puzzle_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":true_brave_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.true_brave_sword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.taddle_legacy_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fuuma_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.fuuma_sword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.base_sword, 'm',
				RiderItems.hurricane_ninja_gashat);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":lets_go_ichigou_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.lets_go_ichigou_gashat, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.rider_circuit);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":adventure_guy_kuuga_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.adventure_guy_kuuga_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.kuuga_mighty);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":agito_of_the_sun_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.agito_of_the_sun_gashat, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.agito_ground);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":mirror_labryinth_ryuki_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.mirror_labryinth_ryuki_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.dragreder_advent);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":moshi_moshi_faiz_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.moshi_moshi_faiz_gashat, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.faiz_mission_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":king_of_poker_blade_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.king_of_poker_blade_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.changebeetle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":taiko_master_hibik_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.taiko_master_hibik_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.henshin_onsa);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":insect_wars_kabuto_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.insect_wars_kabuto_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.kabuto_zecter);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":time_express_den_o_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.time_express_den_o_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.rider_ticket_sword);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":dokidoki_makai_castle_kiva_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.dokidoki_makai_castle_kiva_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.wakeupfuestle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":barcode_warrior_decade_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.barcode_warrior_decade_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.decadecard);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":detective_double_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.detective_double_gashat, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.joker_memory);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":jungle_ooo_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.jungle_ooo_gashat, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.taka);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":space_galaxy_fourze_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.space_galaxy_fourze_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.rocket_swich);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":magic_the_wizard_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.magic_the_wizard_gashat, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.flame_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":toukenden_gaim_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.toukenden_gaim_gashat, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":full_throttle_drive_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.full_throttle_drive_gashat, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.blank_gashat, 'b', RiderItems.speedshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kaigan_ghost_gashat"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.kaigan_ghost_gashat, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_gashat,
				'b', RiderItems.ore_ghost_icon);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":buildhead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.buildhead, 1), "aaa",
				"a a", 'a', RiderItems.full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":buildtroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.buildtroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":buildlegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.buildlegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.full_bottle);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":build_driver"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.build_driver, 1),
				"aaa", "cab", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.tank_full_bottle, 'c',
				RiderItems.rabbit_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":build_driver_cross_z"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.build_driver_cross_z, 1), "aaa", "aca", "aaa", 'a', RiderItems.full_bottle,
				'c', RiderItems.dragon_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":build_driver_grease"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.build_driver_grease, 1), "aaa", "aca", "aaa", 'a', RiderItems.full_bottle, 'c',
				RiderItems.north_blizzard_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":build_driver_rogue"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.build_driver_rogue, 1), "aaa", "aca", "aaa", 'a', RiderItems.full_bottle, 'c',
				RiderItems.prime_rogue_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sclash_driver_grease"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sclash_driver_grease, 1), "aaa", "aba", "aaa", 'a', RiderItems.sclashjelly,
				'b', RiderItems.robot_sclashjelly);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sclash_driver_cross_z_charge"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sclash_driver_cross_z_charge, 1), "aaa", "aba", "aaa", 'a',
				RiderItems.sclashjelly, 'b', RiderItems.dragon_sclashjelly);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":sclash_driver_rogue"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.sclash_driver_rogue, 1), "aaa", "aba", "aaa", 'a', RiderItems.sclashjelly, 'b',
				RiderItems.crocodile_crack_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":evol_driver_evol"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.evol_driver_evol, 1),
				"aaa", "cab", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.rider_system_evol_bottle, 'c',
				RiderItems.cobra_evol_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":evol_driver_mad_rogue"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.evol_driver_mad_rogue, 1), "aaa", "cab", "aaa", 'a', RiderItems.full_bottle,
				'b', RiderItems.engine_full_bottle, 'c', RiderItems.bat_full_bottle_2);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":build_driver_blood"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.build_driver_blood, 1), "aca", "aba", "aaa", 'a', RiderItems.full_bottle, 'b',
				RiderItems.lost_cobra_full_bottle, 'c', RiderItems.hazard_trigger);

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":fullfull_bottle_tank"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.fullfull_bottle_tank),
				new Ingredient[] { Ingredient.fromItem(RiderItems.fullfull_bottle_rabbit) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":fullfull_bottle_rabbit"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.fullfull_bottle_rabbit),
				new Ingredient[] { Ingredient.fromItem(RiderItems.fullfull_bottle_tank) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":rabbittank_sparkling_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.rabbittank_sparkling_full_bottle),
				new Ingredient[] { Ingredient.fromItem(RiderItems.Pandora_bottle),
						Ingredient.fromItem(RiderItems.rabbit_full_bottle),
						Ingredient.fromItem(RiderItems.tank_full_bottle) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":cross_z_build_can"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.cross_z_build_can),
				new Ingredient[] { Ingredient.fromItem(RiderItems.Pandora_bottle),
						Ingredient.fromItem(RiderItems.rabbit_gold_full_bottle),
						Ingredient.fromItem(RiderItems.dragon_silver_full_bottle) });
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fullfull_bottle_rabbit_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.fullfull_bottle_rabbit, 1), "dbd", "ada", "aca", 'a', Items.IRON_INGOT, 'b',
				RiderItems.low_rabbit_full_bottle, 'c', RiderItems.rabbit_full_bottle, 'd', Items.GOLD_INGOT);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":genius_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.genius_full_bottle, 1), "aaa", "aba", "aaa", 'a', RiderItems.rider_circuit,
				'b', RiderItems.genius_full_bottle_blank);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":north_blizzard_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.north_blizzard_full_bottle, 1), "aba", "aca", "dae", 'a', Items.SNOWBALL, 'b',
				RiderItems.fukurou_full_bottle, 'c', RiderItems.robot_sclashjelly, 'd', RiderItems.castle_full_bottle,
				'e', RiderItems.kuwagata_full_bottle);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ex_aid_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ex_aid_full_bottle, 1), "aaa", "aba", "aaa", 'a', RiderItems.full_bottle, 'b',
				RiderItems.mighty_action_x_gashat);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ghost_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ghost_full_bottle, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.ore_ghost_icon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drive_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drive_full_bottle, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.speedshift);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":gaim_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.gaim_full_bottle, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.orange_lockseed);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":wizard_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.wizard_full_bottle, 1), "aaa", "aba", "aaa", 'a', RiderItems.full_bottle, 'b',
				RiderItems.flame_ring);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":fourze_full_bottle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.fourze_full_bottle, 1), "aaa", "aba", "aaa", 'a', RiderItems.full_bottle, 'b',
				RiderItems.rocket_swich);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":transteamgun"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.transteamgun, 1),
				"aba", "aca", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.bat_full_bottle, 'c',
				RiderItems.base_sword);
		// GameRegistry.addShapedRecipe(new
		// ResourceLocation(Refercence.MODID+":nebulasteamgun"), new
		// ResourceLocation(Refercence.MODID+":kamen_rider"),new
		// ItemStack(RiderItems.nebulasteamgun,1), "aaa","aba","aaa", 'a',
		// RiderItems.full_bottle, 'b', RiderItems.gear_engine);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hell_bros_block"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hell_bros_block, 1),
				"aaa", "bac", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.gear_engine, 'c',
				RiderItems.gear_remocon);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":bi_kaiser_block"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.bi_kaiser_block, 1),
				"aaa", "bac", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.gear_red, 'c', RiderItems.gear_blue);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":steam_blade"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.steam_blade, 1),
				"aba", "aca", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.cobra_full_bottle, 'c',
				RiderItems.base_sword);
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":transteamgun_rifle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.transteamgun_rifle),
				new Ingredient[] { Ingredient.fromItem(RiderItems.transteamgun),
						Ingredient.fromItem(RiderItems.steam_blade) });
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":nebulasteamgun_rifle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.nebulasteamgun_rifle),
				new Ingredient[] { Ingredient.fromItem(RiderItems.nebulasteamgun),
						Ingredient.fromItem(RiderItems.steam_blade) });

		GameRegistry.addSmelting(new ItemStack(RiderItems.dragon_sclashjelly),
				new ItemStack(RiderItems.dragon_magma_full_bottle), 1);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drill_crusher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.drill_crusher, 1),
				"aaa", "rbt", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.base_sword, 't',
				RiderItems.tank_full_bottle, 'r', RiderItems.rabbit_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":hawk_gatlinger"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.hawk_gatlinger, 1),
				"aaa", "rbt", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.base_sword, 't',
				RiderItems.gatling_full_bottle, 'r', RiderItems.taka_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":koma_ninpoutou"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.koma_ninpoutou, 1),
				"aaa", "rbt", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.base_sword, 't',
				RiderItems.comic_full_bottle, 'r', RiderItems.ninjya_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kaizoku_hassha"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kaizoku_hassha, 1),
				"aaa", "rbt", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.base_sword, 't',
				RiderItems.ressha_full_bottle, 'r', RiderItems.kaizoku_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":beat_crosser"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.beat_crosser, 1),
				"ama", "aba", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.base_sword, 'm',
				RiderItems.dragon_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":twinbreaker_sword"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.twinbreaker_sword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.sclashjelly, 'b', RiderItems.base_sword, 'm',
				RiderItems.dragon_sclashjelly);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":twinbreaker_sword_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.twinbreaker_sword, 1),
				"ama", "aba", "aaa", 'a', RiderItems.sclashjelly, 'b', RiderItems.base_sword, 'm',
				RiderItems.robot_sclashjelly);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":full_bottle_buster"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.full_bottle_buster, 1), "aca", "aba", "aaa", 'a', RiderItems.full_bottle, 'b',
				RiderItems.base_sword, 'c', RiderItems.fullfull_bottle_rabbit);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":full_bottle_buster_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.full_bottle_buster, 1), "aca", "aba", "aaa", 'a', RiderItems.full_bottle, 'b',
				RiderItems.base_sword, 'c', RiderItems.fullfull_bottle_tank);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":magma_knuckle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.magma_knuckle, 1),
				"ama", "aba", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.base_sword, 'm',
				RiderItems.dragon_magma_full_bottle);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":blizzard_knuckle"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.blizzard_knuckle, 1),
				"ama", "aba", "aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.base_sword, 'm',
				RiderItems.north_blizzard_full_bottle);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":build_phone"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.build_phone, 1),
				"aca", "aba", "aaa", 'a', Items.IRON_INGOT, 'b', RiderItems.rider_circuit, 'c',
				RiderItems.lion_full_bottle);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":purifyer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.purifyer, 1), "aaa",
				"aba", "aaa", 'a', Items.IRON_INGOT, 'b', RiderItems.nebula_gas_sample);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":solidifyer"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.solidifyer, 1), "aaa",
				"aba", "aaa", 'a', Items.IRON_INGOT, 'b', RiderItems.sclashjelly);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zi_ohead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zi_ohead, 1), "aaa",
				"a a", 'a', RiderItems.blank_watch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zi_otroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zi_otroso, 1), "a a",
				"aaa", "aaa", 'a', RiderItems.blank_watch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zi_olegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zi_olegs, 1), "aaa",
				"a a", "a a", 'a', RiderItems.blank_watch);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ziku_driver_zi_o"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ziku_driver_zi_o, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.zi_o_ridewatch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ziku_driver_geiz"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ziku_driver_geiz, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.geiz_ridewatch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ziku_driver_zi_o_mirror"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.ziku_driver_zi_o_mirror, 1), "aaa", "aba", "aaa", 'a', RiderItems.blank_watch,
				'b', RiderItems.zi_o_mirror_ridewatch);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zikan_grade"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zikan_grade, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.base_sword, 'm',
				RiderItems.zi_o_ridewatch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":zikan_zax"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.zikan_zax, 1), "ama",
				"aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.base_sword, 'm', RiderItems.geiz_ridewatch);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":drill_crusher_crusher"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.drill_crusher_crusher, 1), "ama", "aba", "aaa", 'a', RiderItems.blank_watch,
				'b', RiderItems.base_sword, 'm', RiderItems.build_ridewatch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":faiz_phone_x"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.faiz_phone_x, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.base_sword, 'm',
				RiderItems.faiz_ridewatch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":daidaimaru_2"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.daidaimaru, 1), "ama",
				"aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.base_sword, 'm', RiderItems.gaim_ridewatch);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":ride_heisaber"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.ride_heisaber, 1),
				"ama", "aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.base_sword, 'm',
				RiderItems.decade_ridewatch);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":kodama_suika_arms"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.kodama_suika_arms, 1),
				"aaa", "aba", "aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.suika_lockseed);

		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID + ":zi_o_mirror_ridewatch"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.zi_o_mirror_ridewatch),
				new Ingredient[] { Ingredient.fromItem(RiderItems.zi_o_ridewatch),
						Ingredient.fromStacks(new ItemStack(Blocks.GLASS)) });

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amazonshead"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.amazonshead, 1),
				"aaa", "a a", 'a', RiderItems.amazon_cell_vial);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amazonstroso"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.amazonstroso, 1),
				"a a", "aaa", "aaa", 'a', RiderItems.amazon_cell_vial);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amazonslegs"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"), new ItemStack(RiderItems.amazonslegs, 1),
				"aaa", "a a", "a a", 'a', RiderItems.amazon_cell_vial);

		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amazons_driver_alpha"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.amazons_driver_alpha, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.amazon_cell_vial, 'c', RiderItems.condorer_core_alpha);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amazons_driver_omega"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.amazons_driver_omega, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.amazon_cell_vial, 'c', RiderItems.condorer_core_omega);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amazons_driver_sigma"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.amazons_driver_sigma, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.amazon_cell_vial, 'c', RiderItems.condorer_core_sigma);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":neo_amazons_driver_neo"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.neo_amazons_driver_neo, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.amazon_cell_vial, 'c', RiderItems.amazon_injector_neo);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":neo_amazons_driver_new_omega"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.neo_amazons_driver_omega, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.amazon_cell_vial, 'c', RiderItems.amazon_injector_new_omega);
		GameRegistry.addShapedRecipe(new ResourceLocation(Refercence.MODID + ":amazons_driver_blind_alpha"),
				new ResourceLocation(Refercence.MODID + ":kamen_rider"),
				new ItemStack(RiderItems.amazons_driver_blind_alpha, 1), "aaa", "aca", "aaa", 'a',
				RiderItems.amazon_cell_vial, 'c', RiderItems.condorer_core_blind_alpha);

		// GameRegistry.addShapedRecipe(new
		// ResourceLocation("masked_rider_craft:masked_rider_head"), new
		// ResourceLocation("masked_rider_craft:masked_rider"),new
		// ItemStack(RiderItems.masked_rider_head,1), "aaa","a a", 'a',
		// RiderItems.ecto_gem);

	}

}