package krpq;

import krpq.mobs.EntityAnkh;
import krpq.mobs.EntityChronos;
import krpq.mobs.EntityLazer;
import krpq.mobs.EntityPoppy;
import krpq.mobs.Entity_kodama_suika_arms;
import krpq.mobs.Entityaccel;
import krpq.mobs.Boss.Entity_BloodStalk;
import krpq.mobs.Boss.Entity_Build_RT;
import krpq.mobs.Boss.Entity_EngineBros;
import krpq.mobs.Boss.Entity_HellBros;
import krpq.mobs.Boss.Entity_Kaiser;
import krpq.mobs.Boss.Entity_KaiserReverse;
import krpq.mobs.Boss.Entity_NightRogue;
import krpq.mobs.Boss.Entity_RemoconBros;
import krpq.mobs.Boss.Entity_another_build;
import krpq.mobs.Boss.Entity_bikaiser;
import krpq.mobs.Boss.Entity_clay_doll_dopant;
import krpq.mobs.Boss.Entity_evolt;
import krpq.mobs.Boss.Entity_evolt_2;
import krpq.mobs.Boss.Entity_evolt_3;
import krpq.mobs.Boss.Entity_grease;
import krpq.mobs.Boss.Entity_nazca_dopant;
import krpq.mobs.Boss.Entity_red_nazca_dopant;
import krpq.mobs.Boss.Entity_taboo_dopant;
import krpq.mobs.Henchmen.EntityBugsterVirus;
import krpq.mobs.Henchmen.EntityMasquerade;
import krpq.mobs.Henchmen.EntityNebulaBugsterVirus;
import krpq.mobs.Henchmen.Entity_hard_guardian;
import krpq.mobs.Henchmen.Entity_needle_smash;
import krpq.mobs.Henchmen.Entitygamma_commando;
import krpq.mobs.Henchmen.Entityguardian;
import krpq.mobs.Henchmen.Entityguardian_hokuto;
import krpq.mobs.Henchmen.Entityguardian_seito;
import krpq.mobs.Henchmen.Entityshocker_combatman;
import krpq.mobs.bikes.EntityAcrobatter;
import krpq.mobs.bikes.EntityExaidBike;
import krpq.mobs.bikes.EntityMachineBuilder;
import krpq.mobs.bikes.Entity_ridoron;
import krpq.mobs.bikes.Entityhardboilder;
import krpq.mobs.bikes.Entitymachine_tornador;
import krpq.mobs.bikes.Entityskullboilder;
import krpq.util.Refercence;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class mobsCore {

	public static void Addmob() {

		// Biome.getBiome(8)

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"masquerade"), EntityMasquerade.class, "masquerade",
				1500, TokuCraft_core.instance, 80, 3, false, 000000, 0xFFFFFF);
		EntityRegistry.addSpawn(EntityMasquerade.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(1),
				Biome.getBiome(2), Biome.getBiome(3), Biome.getBiome(4), Biome.getBiome(5), Biome.getBiome(6),
				Biome.getBiome(7), Biome.getBiome(10), Biome.getBiome(11), Biome.getBiome(12), Biome.getBiome(14),
				Biome.getBiome(15), Biome.getBiome(16), Biome.getBiome(17), Biome.getBiome(18), Biome.getBiome(19),
				Biome.getBiome(20), Biome.getBiome(21), Biome.getBiome(22), Biome.getBiome(23), Biome.getBiome(24),
				Biome.getBiome(25), Biome.getBiome(26), Biome.getBiome(27), Biome.getBiome(28), Biome.getBiome(29),
				Biome.getBiome(30), Biome.getBiome(31), Biome.getBiome(32), Biome.getBiome(33), Biome.getBiome(34),
				Biome.getBiome(35), Biome.getBiome(36), Biome.getBiome(37), Biome.getBiome(38), Biome.getBiome(39),
				Biome.getBiome(129), Biome.getBiome(130), Biome.getBiome(131), Biome.getBiome(132), Biome.getBiome(133),
				Biome.getBiome(134), Biome.getBiome(140), Biome.getBiome(149), Biome.getBiome(151), Biome.getBiome(155),
				Biome.getBiome(156), Biome.getBiome(157), Biome.getBiome(158), Biome.getBiome(160), Biome.getBiome(161),
				Biome.getBiome(162), Biome.getBiome(163), Biome.getBiome(164), Biome.getBiome(165), Biome.getBiome(166),
				Biome.getBiome(167));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"ankh"), EntityAnkh.class, "ankh", 1501,
				TokuCraft_core.instance, 80, 3, false, 0xFF0000, 0x1FFF2E);
		EntityRegistry.addSpawn(EntityAnkh.class, 1, 1, 1, EnumCreatureType.CREATURE, Biome.getBiome(1),
				Biome.getBiome(2), Biome.getBiome(3), Biome.getBiome(4), Biome.getBiome(5), Biome.getBiome(6),
				Biome.getBiome(7), Biome.getBiome(10), Biome.getBiome(11), Biome.getBiome(12), Biome.getBiome(13));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"bugster"), EntityBugsterVirus.class,
				"bugster", 1502, TokuCraft_core.instance, 80, 3, false, 0xe88936, 000000);
		EntityRegistry.addSpawn(EntityBugsterVirus.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(1),
				Biome.getBiome(2), Biome.getBiome(3), Biome.getBiome(4), Biome.getBiome(5), Biome.getBiome(6),
				Biome.getBiome(7), Biome.getBiome(10), Biome.getBiome(11), Biome.getBiome(12), Biome.getBiome(14),
				Biome.getBiome(15), Biome.getBiome(16), Biome.getBiome(17), Biome.getBiome(18), Biome.getBiome(19),
				Biome.getBiome(20), Biome.getBiome(21), Biome.getBiome(22), Biome.getBiome(23), Biome.getBiome(24),
				Biome.getBiome(25), Biome.getBiome(26), Biome.getBiome(27), Biome.getBiome(28), Biome.getBiome(29),
				Biome.getBiome(30), Biome.getBiome(31), Biome.getBiome(32), Biome.getBiome(33), Biome.getBiome(34),
				Biome.getBiome(35), Biome.getBiome(36), Biome.getBiome(37), Biome.getBiome(38), Biome.getBiome(39),
				Biome.getBiome(129), Biome.getBiome(130), Biome.getBiome(131), Biome.getBiome(132), Biome.getBiome(133),
				Biome.getBiome(134), Biome.getBiome(140), Biome.getBiome(149), Biome.getBiome(151), Biome.getBiome(155),
				Biome.getBiome(156), Biome.getBiome(157), Biome.getBiome(158), Biome.getBiome(160), Biome.getBiome(161),
				Biome.getBiome(162), Biome.getBiome(163), Biome.getBiome(164), Biome.getBiome(165), Biome.getBiome(166),
				Biome.getBiome(167));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"nebula_bugster"), EntityNebulaBugsterVirus.class,
				"nebula_bugster", 1508, TokuCraft_core.instance, 80, 3, false, 0x4DD1E4, 0xE9E9E9);
		EntityRegistry.addSpawn(EntityNebulaBugsterVirus.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(8));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"gamma_commando"), Entitygamma_commando.class,
				"gamma_commando", 1503, TokuCraft_core.instance, 80, 3, false, 000000, 0x6f6f6f);
		EntityRegistry.addSpawn(Entitygamma_commando.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(1),
				Biome.getBiome(2), Biome.getBiome(3), Biome.getBiome(4), Biome.getBiome(5), Biome.getBiome(6),
				Biome.getBiome(7), Biome.getBiome(10), Biome.getBiome(11), Biome.getBiome(12), Biome.getBiome(14),
				Biome.getBiome(15), Biome.getBiome(16), Biome.getBiome(17), Biome.getBiome(18), Biome.getBiome(19),
				Biome.getBiome(20), Biome.getBiome(21), Biome.getBiome(22), Biome.getBiome(23), Biome.getBiome(24),
				Biome.getBiome(25), Biome.getBiome(26), Biome.getBiome(27), Biome.getBiome(28), Biome.getBiome(29),
				Biome.getBiome(30), Biome.getBiome(31), Biome.getBiome(32), Biome.getBiome(33), Biome.getBiome(34),
				Biome.getBiome(35), Biome.getBiome(36), Biome.getBiome(37), Biome.getBiome(38), Biome.getBiome(39),
				Biome.getBiome(129), Biome.getBiome(130), Biome.getBiome(131), Biome.getBiome(132), Biome.getBiome(133),
				Biome.getBiome(134), Biome.getBiome(140), Biome.getBiome(149), Biome.getBiome(151), Biome.getBiome(155),
				Biome.getBiome(156), Biome.getBiome(157), Biome.getBiome(158), Biome.getBiome(160), Biome.getBiome(161),
				Biome.getBiome(162), Biome.getBiome(163), Biome.getBiome(164), Biome.getBiome(165), Biome.getBiome(166),
				Biome.getBiome(167));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"poppy"), EntityPoppy.class, "poppy", 1504,
				TokuCraft_core.instance, 80, 3, false, 0xfcfb81, 0xff84ac);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"chronos"), EntityChronos.class, "chronos", 1505,
				TokuCraft_core.instance, 80, 3, false, 000000, 0x44df00);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"shocker_combatman"), Entityshocker_combatman.class,
				"shocker_combatman", 1506, TokuCraft_core.instance, 80, 3, false, 000000, 0xFFFFFF);
		EntityRegistry.addSpawn(Entityshocker_combatman.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(1),
				Biome.getBiome(2), Biome.getBiome(3), Biome.getBiome(4), Biome.getBiome(5), Biome.getBiome(6),
				Biome.getBiome(7), Biome.getBiome(10), Biome.getBiome(11), Biome.getBiome(12), Biome.getBiome(14),
				Biome.getBiome(15), Biome.getBiome(16), Biome.getBiome(17), Biome.getBiome(18), Biome.getBiome(19),
				Biome.getBiome(20), Biome.getBiome(21), Biome.getBiome(22), Biome.getBiome(23), Biome.getBiome(24),
				Biome.getBiome(25), Biome.getBiome(26), Biome.getBiome(27), Biome.getBiome(28), Biome.getBiome(29),
				Biome.getBiome(30), Biome.getBiome(31), Biome.getBiome(32), Biome.getBiome(33), Biome.getBiome(34),
				Biome.getBiome(35), Biome.getBiome(36), Biome.getBiome(37), Biome.getBiome(38), Biome.getBiome(39),
				Biome.getBiome(129), Biome.getBiome(130), Biome.getBiome(131), Biome.getBiome(132), Biome.getBiome(133),
				Biome.getBiome(134), Biome.getBiome(140), Biome.getBiome(149), Biome.getBiome(151), Biome.getBiome(155),
				Biome.getBiome(156), Biome.getBiome(157), Biome.getBiome(158), Biome.getBiome(160), Biome.getBiome(161),
				Biome.getBiome(162), Biome.getBiome(163), Biome.getBiome(164), Biome.getBiome(165), Biome.getBiome(166),
				Biome.getBiome(167));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"another_build"), Entity_another_build.class,
				"another_build", 1509, TokuCraft_core.instance, 80, 3, false, 0x610101, 0x0808d1);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"evol"), Entity_evolt.class, "evol", 1510,
				TokuCraft_core.instance, 80, 3, false, 0xB90025, 0xE6BFDF);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"evol_black_hole"), Entity_evolt_2.class, "evol_black_hole", 1529,
				TokuCraft_core.instance, 80, 3, false, 0xB90025, 0xE6BFDF);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"evolt"), Entity_evolt_3.class, "evolt", 1530,
				TokuCraft_core.instance, 80, 3, false, 0xB90025, 0xE6BFDF);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"guardian"), Entityguardian.class, "guardian", 1507,
				TokuCraft_core.instance, 80, 3, false, 0x5C5C5C, 0x466382);
		EntityRegistry.addSpawn(Entityguardian.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(1),
				Biome.getBiome(4), Biome.getBiome(5), Biome.getBiome(6), Biome.getBiome(7), Biome.getBiome(11),
				Biome.getBiome(129), Biome.getBiome(132), Biome.getBiome(155), Biome.getBiome(156), Biome.getBiome(14),
				Biome.getBiome(15), Biome.getBiome(21), Biome.getBiome(22), Biome.getBiome(23), Biome.getBiome(27),
				Biome.getBiome(28));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"hokuto_guardian"), Entityguardian_hokuto.class,
				"hokuto_guardian", 1512, TokuCraft_core.instance, 80, 3, false, 0x5C5C5C, 0x466382);
		EntityRegistry.addSpawn(Entityguardian_hokuto.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(3),
				Biome.getBiome(5), Biome.getBiome(11), Biome.getBiome(12), Biome.getBiome(13), Biome.getBiome(140),
				Biome.getBiome(19), Biome.getBiome(26), Biome.getBiome(30), Biome.getBiome(31), Biome.getBiome(32),
				Biome.getBiome(33), Biome.getBiome(34), Biome.getBiome(133), Biome.getBiome(158), Biome.getBiome(160),
				Biome.getBiome(161), Biome.getBiome(162));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"seito_guardian"), Entityguardian_seito.class,
				"seito_guardian", 1513, TokuCraft_core.instance, 80, 3, false, 0x5C5C5C, 0x466382);
		EntityRegistry.addSpawn(Entityguardian_seito.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(1),
				Biome.getBiome(2), Biome.getBiome(17), Biome.getBiome(35), Biome.getBiome(37), Biome.getBiome(130),
				Biome.getBiome(16), Biome.getBiome(36), Biome.getBiome(37), Biome.getBiome(38), Biome.getBiome(39),
				Biome.getBiome(163), Biome.getBiome(164), Biome.getBiome(165), Biome.getBiome(166),
				Biome.getBiome(167));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"hard_guardian"), Entity_hard_guardian.class,
				"hard_guardian", 1511, TokuCraft_core.instance, 80, 3, false, 0x195734, 0xEACA00);
		EntityRegistry.addSpawn(Entity_hard_guardian.class, 15, 1, 4, EnumCreatureType.MONSTER, Biome.getBiome(8));

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"lazer_bike"), EntityLazer.class, "lazer_bike", 1514,
				TokuCraft_core.instance, 80, 3, false, 0xFDE800, 0xEE3F87);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"machine_lazer"), EntityExaidBike.class,
				"machine_lazer", 1515, TokuCraft_core.instance, 80, 3, false, 0xFDE800, 0xEE3F87);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"machine_builder_build"), EntityMachineBuilder.class,
				"machine_builder_build", 1516, TokuCraft_core.instance, 80, 3, false, 0xD7CF00, 0xDD0202);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"acrobatter_black"), EntityAcrobatter.class, "acrobatter_black",
				1531, TokuCraft_core.instance, 80, 3, false, 0x0600ef, 0xfae000);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"hard_boilder_w"), Entityhardboilder.class,
				"hard_boilder_w", 1532, TokuCraft_core.instance, 80, 3, false, 0x30df00, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"skull_boilder_skull"), Entityskullboilder.class,
				"skull_boilder_skull", 1533, TokuCraft_core.instance, 80, 3, false, 0x2f2f2f, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"ridoron_black"), Entity_ridoron.class, "ridoron_black", 1538,
				TokuCraft_core.instance, 80, 3, false, 0xc20202, 0x0e0e0e);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"machine_tornador_agito"), Entitymachine_tornador.class,
				"machine_tornador_agito", 1539, TokuCraft_core.instance, 80, 3, false, 0xd20023, 0xe1c901);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"accel_bike"), Entityaccel.class, "accel_bike", 1540,
				TokuCraft_core.instance, 80, 3, false, 0xdf0000, 0xdadada);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"night_rogue"), Entity_NightRogue.class,
				"night_rogue", 1517, TokuCraft_core.instance, 80, 3, false, 0x131313, 0xDDC862);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"blood_stalk"), Entity_BloodStalk.class,
				"blood_stalk", 1518, TokuCraft_core.instance, 80, 3, false, 0x7F100F, 0x50C5CA);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"kaiser"), Entity_Kaiser.class, "kaiser", 1519,
				TokuCraft_core.instance, 80, 3, false, 0x161616, 0xC40000);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"reverse_kaiser"), Entity_KaiserReverse.class,
				"reverse_kaiser", 1520, TokuCraft_core.instance, 80, 3, false, 0x161616, 0x003EBA);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"bi_kaiser"), Entity_bikaiser.class, "bi_kaiser", 1521,
				TokuCraft_core.instance, 80, 3, false, 0x161616, 0x003EBA);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"remocon_bros"), Entity_RemoconBros.class,
				"remocon_bros", 1522, TokuCraft_core.instance, 80, 3, false, 0x161616, 0x0092BB);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"engine_bros"), Entity_EngineBros.class,
				"engine_bros", 1523, TokuCraft_core.instance, 80, 3, false, 0x161616, 0xDFDFDF);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"hell_bros"), Entity_HellBros.class, "hell_bros", 1524,
				TokuCraft_core.instance, 80, 3, false, 0x161616, 0xDFDFDF);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"needle_smash"), Entity_needle_smash.class,
				"needle_smash", 1525, TokuCraft_core.instance, 80, 3, false, 0xFFFFFF, 0x0074D9);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"grease"), Entity_grease.class, "grease", 1526,
				TokuCraft_core.instance, 80, 3, false, 0xe8c439, 0x604e46);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"build"), Entity_Build_RT.class, "build", 1527,
				TokuCraft_core.instance, 80, 3, false, 0xC70404, 0x000DB7);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"kodamaSuikaArms"), Entity_kodama_suika_arms.class,
				"kodamaSuikaArms", 1528, TokuCraft_core.instance, 80, 3, false, 0x008000, 0x242424);

		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"clay_doll"), Entity_clay_doll_dopant.class,
				"clay_doll", 1534, TokuCraft_core.instance, 80, 3, false, 0x161616, 0x0092BB);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"nazca"), Entity_nazca_dopant.class,
				"nazca", 1535, TokuCraft_core.instance, 80, 3, false, 0x161616, 0x0092BB);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"red_nazca"), Entity_red_nazca_dopant.class,
				"red_nazca", 1536, TokuCraft_core.instance, 80, 3, false, 0x161616, 0x0092BB);
		EntityRegistry.registerModEntity(new ResourceLocation(Refercence.MODID,"taboo"), Entity_taboo_dopant.class,
				"taboo", 1537, TokuCraft_core.instance, 80, 3, false, 0x161616, 0x0092BB);
	}
}
