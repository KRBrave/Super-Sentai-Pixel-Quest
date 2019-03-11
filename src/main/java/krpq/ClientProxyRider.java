package krpq;

import com.jcraft.jorbis.Block;

import krpq.mobs.EntityAnkh;
import krpq.mobs.EntityChronos;
import krpq.mobs.EntityLazer;
import krpq.mobs.EntityPoppy;
import krpq.mobs.Entity_kodama_suika_arms;
import krpq.mobs.Entityaccel;
import krpq.mobs.RenderRiderMob;
import krpq.mobs.RenderRiderMob2;
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
import krpq.model.MobWithBeltModel;
import krpq.model.ModelAnkh;
import krpq.model.ModelPoppy;
import krpq.model.Model_accel_bike_form;
import krpq.model.Model_hardboilder;
import krpq.model.Model_kodama_suika_arms;
import krpq.model.Model_lazer_bike;
import krpq.model.Model_machine_builder;
import krpq.model.model_ridoron;
import krpq.model.tokuMobModel;
import krpq.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxyRider extends CommonProxyRider {

	@Override
	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMasquerade.class,
				new RenderRiderMob2(new ModelBiped(), 0.4F, "textures/entities/masquerade.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityAnkh.class,
				new RenderRiderMob(new ModelAnkh(0), 0.5F, "textures/entities/ankh.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityBugsterVirus.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/bugster_virus.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityNebulaBugsterVirus.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/nebula_bugster_virus.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entitygamma_commando.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/gamma_commandos.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entityshocker_combatman.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/shocker_combatman.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entityguardian.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/guardian.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityChronos.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/chronos.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityPoppy.class,
				new RenderRiderMob2(new ModelPoppy(), 0.5F, "textures/entities/poppy.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_another_build.class,
				new RenderRiderMob2(new tokuMobModel("another_build2"), 0.5F, "textures/entities/another_build.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_kodama_suika_arms.class,
				new RenderRiderMob2(new Model_kodama_suika_arms(), 0.5F, "textures/entities/kodama_suika_arms.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_evolt.class, new RenderRiderMob2(
				new MobWithBeltModel(RiderItems.evol_driver_evol, "evol_2"), 0.5F, "textures/entities/evol_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_evolt_2.class,
				new RenderRiderMob2(new MobWithBeltModel(RiderItems.evol_driver_evol, "evol_black2"), 0.5F,
						"textures/entities/evol_black.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_evolt_3.class, new RenderRiderMob2(
				new MobWithBeltModel(RiderItems.evol_driver_evol, "evolto2"), 0.5F, "textures/entities/evolto.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_BloodStalk.class,
				new RenderRiderMob2(new tokuMobModel("blood_stalk_2"), 0.5F, "textures/entities/blood_stalk_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_NightRogue.class,
				new RenderRiderMob2(new tokuMobModel("night_rogue_2"), 0.5F, "textures/entities/night_rogue_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_Kaiser.class,
				new RenderRiderMob2(new tokuMobModel("kaiser_blue_2"), 0.5F, "textures/entities/kaiser_blue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_KaiserReverse.class,
				new RenderRiderMob2(new tokuMobModel("kaiser_red_2"), 0.5F, "textures/entities/kaiser_red_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_bikaiser.class,
				new RenderRiderMob2(new tokuMobModel("bi_kaiser_2"), 0.5F, "textures/entities/bi_kaiser_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_RemoconBros.class,
				new RenderRiderMob2(new tokuMobModel("remocon_bros_2"), 0.5F, "textures/entities/remocon_bros_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_EngineBros.class,
				new RenderRiderMob2(new tokuMobModel("engine_bros_2"), 0.5F, "textures/entities/engine_bros_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_HellBros.class,
				new RenderRiderMob2(new tokuMobModel("hell_bros_2"), 0.5F, "textures/entities/hell_bros_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_grease.class,
				new RenderRiderMob2(new MobWithBeltModel(RiderItems.sclash_driver_grease, "grease_2"), 0.5F,
						"textures/entities/grease_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Build_RT.class, new RenderRiderMob2(
				new MobWithBeltModel(RiderItems.build_driver, "build_2"), 0.5F, "textures/entities/build_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_hard_guardian.class,
				new RenderRiderMob2(new ModelBiped(), 0.4F, "textures/entities/hard_guardian.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_needle_smash.class,
				new RenderRiderMob2(new ModelBiped(), 0.4F, "textures/entities/needle_smash.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entityguardian_hokuto.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/guardian_hokuto.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entityguardian_seito.class,
				new RenderRiderMob2(new ModelBiped(), 0.5F, "textures/entities/guardian_seito.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_clay_doll_dopant.class, new RenderRiderMob2(
				new tokuMobModel("clay_doll_dopant_2"), 0.5F, "textures/entities/clay_doll_dopant_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_nazca_dopant.class,
				new RenderRiderMob2(new tokuMobModel("nazca_dopant_2"), 0.5F, "textures/entities/nazca_dopant_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_red_nazca_dopant.class, new RenderRiderMob2(
				new tokuMobModel("red_nazca_dopant_2"), 0.5F, "textures/entities/red_nazca_dopant_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_taboo_dopant.class,
				new RenderRiderMob2(new tokuMobModel("taboo_dopant_2"), 0.5F, "textures/entities/taboo_dopant_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityAcrobatter.class,
				new RenderRiderMob2(new Model_machine_builder(), 0.5F, "textures/entities/acrobatter.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_ridoron.class,
				new RenderRiderMob2(new model_ridoron(), 0.5F, "textures/entities/ridoron.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entitymachine_tornador.class,
				new RenderRiderMob2(new Model_hardboilder(), 0.5F, "textures/entities/machine_tornador.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entityhardboilder.class,
				new RenderRiderMob2(new Model_hardboilder(), 0.5F, "textures/entities/hardboilder.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entityskullboilder.class,
				new RenderRiderMob2(new Model_hardboilder(), 0.5F, "textures/entities/skullboilder.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entityaccel.class,
				new RenderRiderMob2(new Model_accel_bike_form(), 0.5F, "textures/entities/accel_bike_form.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityLazer.class,
				new RenderRiderMob2(new Model_lazer_bike(), 0.5F, "textures/entities/model_lazer.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityExaidBike.class,
				new RenderRiderMob2(new Model_lazer_bike(), 0.5F, "textures/entities/model_exaid_bike.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityMachineBuilder.class,
				new RenderRiderMob2(new Model_machine_builder(), 0.5F, "textures/entities/model_machine_builder.png"));

	}

	public void registerItemRender(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(item.getRegistryName(), string));
	}

}
