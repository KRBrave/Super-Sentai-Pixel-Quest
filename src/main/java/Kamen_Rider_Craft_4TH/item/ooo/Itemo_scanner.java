package Kamen_Rider_Craft_4TH.item.ooo;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class Itemo_scanner extends Item  implements IHasModel
{



	public Itemo_scanner(String name)
	{
		super();

		setMaxDamage(0);
		maxStackSize = 1;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {



		if (par3Entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) par3Entity;
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.OOOlegs){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.OOOtroso){
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.OOOhead){
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver){

											if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

												item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
											}
						// Tatoba
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 25,0,true,false));
											}

											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,2,true,false));
											}
						// Gatakiriba
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==1){

												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==0){

													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==1){

														if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 99){

															if (player.isSneaking()){
																par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX-3,   par3Entity.posY-1,  par3Entity.posZ+3, true));
																par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX+3,   par3Entity.posY-1,  par3Entity.posZ+3, true));
																par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX-3,   par3Entity.posY-1,  par3Entity.posZ-3, true));
																par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX+3,   par3Entity.posY-1,  par3Entity.posZ-3, true));
																item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
															}
														}
													}
												}
											}
						// Kamakiri
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==1){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,0,true,false));
											}
						// Cheetah
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==1){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
											}
						// Tajador
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==3){
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==3){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
														player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,0,true,false));
														player.fallDistance=0; 
														player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
													}}
											}
						// Lost Blaze Tajador
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==3){
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==3){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==15){
														player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,0,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
														player.fallDistance=0; 
														player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
													}}
											}
						// Ratorata
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==2){
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==1){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==0){
														player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
													}}
											}
						// Sagozou
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==2){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 25,1,true,false));
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==2){
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 25,1,true,false));
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==3){
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==2){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==2){
														player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
													}}
												player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 25,1,true,false));
											}
						// Kujaku
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==3){
												player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
												player.fallDistance=0;
											}
						// Shauta
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==4){
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==4){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==4){
														player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,0,true,false));
														if (player.isInWater()){
															if (player.isSneaking()){
																Vec3d look = par3Entity.getLookVec();
																player.motionX=look.x/2;
																player.motionY=look.y/2;
																player.motionZ=look.z/2;
															}}
													}}
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==4){
												player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
												if (player.isInWater()){
													player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
												}
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==4){
												if (player.isInWater()){
													player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,0,true,false));
												}
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==4){
												if (player.isInWater()){
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
												}
											}
						// Putotyra
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==5){
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,2,true,false));
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==5){
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
											}
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==5){

												if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>49){

													if (player.isSneaking()){
														Vec3d look = par3Entity.getLookVec();
														player.motionX=look.x*4;
														player.motionZ=look.z*4;
														item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);

													}
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==5){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==5){
															player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
															player.fallDistance=0; 
															player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
														}
													}

												}
											}
						// Burakawani
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==6){
													player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,0,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==6){
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));

												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==6){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,0,true,false));
													
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==6){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==6){
														
														player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
													}}
												}
						// Tamashii				
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==7){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==7){
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
					
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==7){
													
														if (!par2World.isRemote)
													    {
															if (player.isSneaking()){
																if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 99){

													                    Vec3d look = player.getLookVec();
													                    EntityFireball fireball = new EntityLargeFireball(par2World, player, 1, 1, 1);
													                    fireball.setPosition(
													                    player.posX + look.x * 1.6,
													                    player.posY + 1,
													                    player.posZ + look.z * 1.6);
													                    fireball.accelerationX = look.x * 0.1;
													                    fireball.accelerationY = look.y * 0.1;
													                    fireball.accelerationZ = look.z * 0.1;
													                    par2World.spawnEntity(fireball);
													                    item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
													    }}}}}
												}
						// Panda
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==8){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
												}
						// Super Tatoba
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==7){
													player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 25,0,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,3,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
													player.fallDistance=0; 
													player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
												
												}
												
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==9){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,5,true,false));
												
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==8){
													player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==9){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==7){
															player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,10,true,false));
															if (player.isSneaking()){
																player.fallDistance=0; 
																Vec3d look = par3Entity.getLookVec();
																player.motionX=look.x;
																player.motionY=look.y;
																player.motionZ=look.z;
															}
														}}
												}
					// Kangaroo
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==10){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==9){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
												}
					// Love
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==8){
													player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,1,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==11){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));													
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==10){
													player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,1,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==11){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==8){
															player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,2,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));	
															player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,2,true,false));
														}
													}
												}
					// Saramioo
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==9){
													player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==12){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));											
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==11){
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==12){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==9){
															player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
															player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
														}
													}
												}
					// Shigazeshi
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==10){
													player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==13){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));											
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==12){
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==13){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==10){
															player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 25,0,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
														}
													}
												}
					// Seishirogin
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==11){
													player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,1,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==14){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));											
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==13){
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==14){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==11){
															player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,2,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
															player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
														}
													}
												}
					// Mukachiri
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==12){
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==15){
													player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,2,true,false));										
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==14){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));	
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==15){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==12){
															player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));	
															player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
														}
													}
												}
					// Bikaso
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==13){
													player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==16){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));										
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==15){
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==16){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==13){
															player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));		
															player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
														}
													}
												}
					// Yadokari							
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==17){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											}
					// Goda							
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==20){
													player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,2,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
													player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 5, 0,true,false));

												}

												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==23){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,5,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==21){
													player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==23){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==20){
															player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,8,true,false));
														}
													}
												}
												
						// Ancient OOO

												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==18){
													player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,6,true,false));
												}

												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==21){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==19){
													player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,2,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==21){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==18){
															if (player.inventory.hasItemStack(new ItemStack(RiderItems.greeed_blet_gamel))&
																	player.inventory.hasItemStack(new ItemStack(RiderItems.greeed_blet_kazari))&
																	player.inventory.hasItemStack(new ItemStack(RiderItems.greeed_blet_mezool))
																	&player.inventory.hasItemStack(new ItemStack(RiderItems.greeed_blet_uva))){

																item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 19, "1");
																item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 22, "2");
																item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 20, "3");
																
															}
														}
													}
												}
						
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==19){
														player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,2,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
													}
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==22){
														player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
													}
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==20){
														player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
														player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==22){
															if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==19){
																player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,6,true,false));
															}
														}
													}
				   // Super Putotyrra
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==66){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==31){
													player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 25,2,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==66){
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==65){

													if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>49){

														if (player.isSneaking()){
															Vec3d look = par3Entity.getLookVec();
															player.motionX=look.x*4;
															player.motionZ=look.z*4;
															item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);

														}
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==73){
															if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==31){
																player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
																player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
															}
														}

													}
												}
					// Super Tajador
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==74){
													player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,0,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==66){
													player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));

												}
												
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==66){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==74){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==7){
															player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,0,true,false));
															player.fallDistance=0; 
															player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
														}}

												}
					// Super Gatakiriba
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==67){

													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==8){

														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==75){

															if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 99){

																if (player.isSneaking()){
																	par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX-3,   par3Entity.posY-1,  par3Entity.posZ+3, true));
																	par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX+3,   par3Entity.posY-1,  par3Entity.posZ+3, true));
																	par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX-3,   par3Entity.posY-1,  par3Entity.posZ-3, true));
																	par2World.spawnEntity(new EntityLightningBolt(par2World,  par3Entity.posX+3,   par3Entity.posY-1,  par3Entity.posZ-3, true));
																	item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
																}
															}
														}
													}
												}
												
					// Super Ratorata
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==56){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==67){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==9){
															player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,5,true,false));
															player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
														}}
												}
					// Super Sagozou
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==76){
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,0,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 25,1,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==68){
													player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,0,true,false));
													player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 25,1,true,false));
												}
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==57){
													if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==68){
														if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==76){
															player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
														}}
													player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 25,1,true,false));
												}
										}
										
					// Super Shauta
										if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==69){
											if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==77){
												if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==58){
													player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,0,true,false));
													if (player.isInWater()){
														if (player.isSneaking()){
														Vec3d look = par3Entity.getLookVec();
														player.motionX=look.x/2;
														player.motionY=look.y/2;
														player.motionZ=look.z/2;
													}}
												}}

					
											}
				// shocker OOO
									//		if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==17){
									//			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
									//		}
										}
								}
								
				// Super Burakawani
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==59){
									player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,4,true,false));
								}
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==78){
									player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));

								}
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==70){
									player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
									
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==59){
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==78){
										
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));

									
									}}
									}
								}
							
				// Super Tamashii
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==79){
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
								player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==71){
								player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
								
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==7){
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==79){
								
									if (!par2World.isRemote)
								    {
										if (player.isSneaking()){
											if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 99){

								                    Vec3d look = player.getLookVec();
								                    EntityFireball fireball = new EntityLargeFireball(par2World, player, 1, 1, 1);
								                    fireball.setPosition(
								                    player.posX + look.x * 1.6,
								                    player.posY + 1,
								                    player.posZ + look.z * 1.6);
								                    fireball.accelerationX = look.x * 0.1;
								                    fireball.accelerationY = look.y * 0.1;
								                    fireball.accelerationZ = look.z * 0.1;
								                    par2World.spawnEntity(fireball);
								                    item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
											}}}}}
							}
				// Super Saramiou
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==60){
								player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==80){
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));											
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==72){
								player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==80){
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==60){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
									}
								}
							}
				// Super Shigazeshi 
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==61){
								player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 25,0,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==81){
								player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));											
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==73){
								player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==81){
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==73){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
									}
								}
							}
					// super Seishirogin
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==27){
								player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,2,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==33){
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));											
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==31){
								player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==33){
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==27){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,1,true,false));
									}
								}
							}
					// Super Mukachiri
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==28){
								player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==34){
								player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));										
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==32){
								player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));	
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==34){
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==28){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,6,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,1,true,false));
									}
								}
							}
					// Super Bikaso
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==29){
								player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==24){
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));										
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==33){
								player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==34){
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==29){
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));		
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
									}
								}
							}
					// Super Yadokari							
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==38){
							player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));	
						}
							
					// Super Kangaroo
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==37){
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==35){
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
							}
					// Super Love
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==30){
								player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,2,true,false));
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==39){
								player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));													
							}
							if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==37){
								player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,2,true,false));
								if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==39){
									if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==30){
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,4,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 25,0,true,false));
									}
								}
							}
							}
						}
					}
				}
			}
		}
	}
	





