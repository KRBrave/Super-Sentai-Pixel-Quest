package sspq.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import sspq.util.Refercence;

public class PotionCore {

	public static final Potion FLY_POTION = new PotionFly();
	public static final Potion FIRE_PUNCH_POTION = new PotionFirePunch();
	public static final Potion PUNCH_BOOST_POTION = new PotionPunchBoost();
	
	public static void init(FMLInitializationEvent event) {
		ForgeRegistries.POTIONS.register(FLY_POTION);
		ForgeRegistries.POTIONS.register(FIRE_PUNCH_POTION);
		ForgeRegistries.POTIONS.register(PUNCH_BOOST_POTION);
	}
	
}