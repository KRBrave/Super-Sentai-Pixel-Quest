package Kamen_Rider_Craft_4TH.item.ooo;


import java.util.Random;

import Kamen_Rider_Craft_4TH.PqRiderItems;
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
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;


public class Item_future_super_medalstorso extends Item  implements IHasModel
{



	public Item_future_super_medalstorso(String name)
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
	
			if (! par2World.isRemote)
			{
				Random generator = new Random();
				
				int rand1 = generator.nextInt(3);
				int rand = generator.nextInt(3);
				int rand2 = generator.nextInt(4);

				player.sendMessage( new TextComponentString(TextFormatting.BLUE+"I wanted you to have these"));
				
				player.dropItem(PqRiderItems.super_kujira, rand);
				player.dropItem(PqRiderItems.super_hachi, rand);
				player.dropItem(PqRiderItems.super_kani_new, rand1);
				player.dropItem(PqRiderItems.super_gazelle, rand1);
				player.dropItem(PqRiderItems.super_shirokuma, rand2);
				player.dropItem(PqRiderItems.super_love_core2, rand2);
				player.dropItem(PqRiderItems.super_yadokari, rand2);



				par1ItemStack.shrink(1);	
					
				}
			}
		}
	}





