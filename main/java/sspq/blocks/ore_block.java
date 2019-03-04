package sspq.blocks;

import java.util.Random;

import sspq.RiderItems;
import sspq.TokuCraft_core;
import sspq.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ore_block extends Block implements IHasModel
{

	public Item CRYSTAL;
	public ore_block(String string, Material par3Material,Item ore,int lv)
	{
		super(par3Material);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setUnlocalizedName(string);
		setRegistryName(string);
		CRYSTAL = ore;

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune){
		Random generator = new Random();
		if (CRYSTAL==RiderItems.gorenger_star){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.akarenger_star;
			}else if (rand<40){
				return RiderItems.aorenger_star;
			}else if (rand<50){
				return RiderItems.kirenger_star;
			}else if (rand<60){
				return RiderItems.momorenger_star;
			}else if (rand<70){
				return RiderItems.midorenger_star;
			}else if (rand<80){
				return RiderItems.orenjirenger_star;
			}else if (rand<90){
				return RiderItems.kurorenger_star;
			}else if (rand<100){
				return RiderItems.shirorenger_star;
			}else if (rand<110){
				return RiderItems.gurerenger_star;
			}else if (rand<120){
				return RiderItems.murasakinorenger_star;
			}else if (rand<130){
				return RiderItems.baiorettorenger_star;
			}else if (rand<140){
				return RiderItems.kasshokurenger_star;
			}else if (rand<150){
				return RiderItems.ginrenger_star;
			}else if (rand<160){
				return RiderItems.gorudorenger_star;
			}{
				return CRYSTAL;
			}
		}
			if (CRYSTAL==RiderItems.blank_ranger_key){
				int rand = generator.nextInt(120);
				if (rand<30){
					return RiderItems.gokai_red_ranger_key;
				}else if (rand<40){
					return RiderItems.gokai_blue_ranger_key;
				}else if (rand<50){
					return RiderItems.gokai_yellow_ranger_key;
				}else if (rand<60){
					return RiderItems.gokai_green_ranger_key;
				}else if (rand<70){
					return RiderItems.gokai_pink_ranger_key;
				}else if (rand<80){
					return RiderItems.gokai_orange_ranger_key;
				}else if (rand<90){
					return RiderItems.gokai_black_ranger_key;
				}else if (rand<100){
					return RiderItems.gokai_white_ranger_key;
				}else if (rand<110){
					return RiderItems.gokai_purple_ranger_key;
				}else if (rand<120){
					return RiderItems.gokai_violet_ranger_key;
				}else if (rand<130){
					return RiderItems.gokai_gray_ranger_key;
				}else if (rand<140){
					return RiderItems.gokai_brown_ranger_key;
				}else if (rand<150){
					return RiderItems.gokai_silver_ranger_key;
				}else if (rand<160){
					return RiderItems.gokai_gold_ranger_key;
				}else if (rand<170){
					return RiderItems.gokai_dark_ranger_key;
				}{
					return CRYSTAL;
				}
			}
		if (CRYSTAL==RiderItems.empty_zyudenchi){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.gabutyra_zyudenchi;
			}else if (rand<40){
				return RiderItems.parasagun_zyudenchi;
			}else if (rand<50){
				return RiderItems.stegotchi_zyudenchi;
			}else if (rand<60){
				return RiderItems.zakutor_zyudenchi;
			}else if (rand<70){
				return RiderItems.dricera_zyudenchi;
			}else if (rand<80){
				return RiderItems.pteragordon_zyudenchi;
			}else if (rand<90){
				return RiderItems.ankydon_zyudenchi;
			}else if (rand<100){
				return RiderItems.bunpachy_zyudenchi;
			}else if (rand<110){
				return RiderItems.plezuon_zyudenchi;
			}else if (rand<120){
				return RiderItems.bragigas_zyudenchi;
			}else if (rand<130){
				return RiderItems.deinochaser_zyudenchi;
			}else if (rand<140){
				return RiderItems.deinosgrander_zyudenchi;
			}else if (rand<150){
				return RiderItems.kentorospiker_zyudenchi;
			}else if (rand<160){
				return RiderItems.stymero_zyudenchi;
			}else if (rand<170){
				return RiderItems.allomerus_zyudenchi;
			}else if (rand<180){
				return RiderItems.beyonsmo_zyudenchi;
			}else if (rand<190){
				return RiderItems.ovirappoo_zyudenchi;
			}else if (rand<200){
				return RiderItems.igeranodon_zyudenchi;
			}else if (rand<210){
				return RiderItems.tuperanda_zyudenchi;
			}else if (rand<220){
				return RiderItems.gurumonite_zyudenchi;
			}else if (rand<230){
				return RiderItems.archenolon_zyudenchi;
			}else if (rand<240){
				return RiderItems.pukuptor_zyudenchi;
			}else if (rand<250){
				return RiderItems.futabain_zyudenchi;
			}else if (rand<260){
				return RiderItems.speedrus_zyudenchi;
			}else if (rand<270){
				return RiderItems.prisukeos_zyudenchi;
			}else if (rand<280){
				return RiderItems.fuwanycto_zyudenchi;
			}else if (rand<290){
				return RiderItems.kachicox_zyudenchi;
			}else if (rand<300){
				return RiderItems.karateta_zyudenchi;
			}else if (rand<310){
				return RiderItems.taekwondonto_zyudenchi;
			}else if (rand<320){
				return RiderItems.tobaspino_zyudenchi;
			}else if (rand<330){
				return RiderItems.deathryuger_zyudenchi;
			}else if (rand<340){
				return RiderItems.carnival_zyudenchi;
			}{
				return CRYSTAL;
			}
			
		}
		if (CRYSTAL==RiderItems.empty_brave_zyudenchi){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.guntyra_zyudenchi;
			}else if (rand<40){
				return RiderItems.stegonsaw_zyudenchi;
			}else if (rand<50){
				return RiderItems.shovecera_zyudenchi;
			}else if (rand<60){
				return RiderItems.parasaber_zyudenchi;
			}else if (rand<70){
				return RiderItems.rapx_zyudenchi;
			}else if (rand<80){
				return RiderItems.pteravolt_zyudenchi;
			}{
				return CRYSTAL;
			}
			
		}
		if (CRYSTAL==RiderItems.lupinranger_badge){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.red_dial_fighter;
			}else if (rand<40){
				return RiderItems.blue_dial_fighter;
			}else if (rand<50){
				return RiderItems.yellow_dial_fighter;
			}else if (rand<60){
				return RiderItems.scissors_dial_fighter;
			}else if (rand<70){
				return RiderItems.blade_dial_fighter;
			}else if (rand<80){
				return RiderItems.cyclone_dial_fighter;
			}else if (rand<90){
				return RiderItems.magic_dial_fighter;
			}else if (rand<100){
				return RiderItems.prism_dial_fighter;
			}else if (rand<110){
				return RiderItems.paint_dial_fighter;
			}else if (rand<120){
				return RiderItems.jackpot_striker;
			}else if (rand<130){
				return RiderItems.goodstriker_lupin_mode;
			}else if (rand<140){
				return RiderItems.x_train_silver;
			}else if (rand<150){
				return RiderItems.x_train_fire;
			}else if (rand<160){
				return RiderItems.x_train_chain;
			}else if (rand<170){
				return RiderItems.music_dial_fighter;
			}else if (rand<180){
				return RiderItems.victory_striker;
			}{
				return CRYSTAL;
			}
		}
		if (CRYSTAL==RiderItems.patranger_badge){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.trigger_machine_1go;
			}else if (rand<40){
				return RiderItems.trigger_machine_2go;
			}else if (rand<50){
				return RiderItems.trigger_machine_3go;
			}else if (rand<60){
				return RiderItems.trigger_machine_biker;
			}else if (rand<70){
				return RiderItems.trigger_machine_crane;
			}else if (rand<80){
				return RiderItems.trigger_machine_drill;
			}else if (rand<90){
				return RiderItems.trigger_machine_splash;
			}else if (rand<100){
				return RiderItems.trigger_machine_flash;
			}else if (rand<110){
				return RiderItems.trigger_machine_dog;
			}else if (rand<120){
				return RiderItems.justice_striker;
			}else if (rand<130){
				return RiderItems.goodstriker_patren_mode;
			}else if (rand<140){
				return RiderItems.x_train_gold;
			}else if (rand<150){
				return RiderItems.x_train_thunder;
			}else if (rand<160){
				return RiderItems.x_train_jail;
			}else if (rand<170){
				return RiderItems.trigger_machine_music;
			}else if (rand<180){
				return RiderItems.siren_striker;
			}{
				return CRYSTAL;
			}
		}
		if (CRYSTAL==RiderItems.blank_ryusoul){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.ryusoul_red;
			}else if (rand<40){
				return RiderItems.ryusoul_black;
			}else if (rand<50){
				return RiderItems.ryusoul_blue;
			}else if (rand<60){
				return RiderItems.ryusoul_green;
			}else if (rand<70){
				return RiderItems.ryusoul_pink;
			}{
				return CRYSTAL;
			}
		}
			return CRYSTAL;

	}

	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
	{
		return 5;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

}