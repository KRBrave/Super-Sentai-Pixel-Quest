package sspq;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Tabs { 

	public static ToolMaterial tokuToolMaterial = new EnumHelper().addToolMaterial("tokuToolMaterial", 10, 3500, 12.0F, 5.0F, 22);
	
	public static ToolMaterial gaburevolver = new EnumHelper().addToolMaterial("gaburevolver", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial gaburichanger = new EnumHelper().addToolMaterial("gaburichanger", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial gigagaburevolver = new EnumHelper().addToolMaterial("gigagaburevolver", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial minityra = new EnumHelper().addToolMaterial("gaburevolver", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial gaburicarnival = new EnumHelper().addToolMaterial("gaburicarnival", 10, 2000, 12.0F, 0.0F, 22);
	
	public static ToolMaterial gabugaburevolver = new EnumHelper().addToolMaterial("gabugaburevolver", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial gabugaburichanger = new EnumHelper().addToolMaterial("gabugaburichanger", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial gigagabugaburevolver = new EnumHelper().addToolMaterial("gigagabugaburevolver", 10, 2000, 12.0F, 0.0F, 22);
	
	public static ToolMaterial vs_changer_lupin = new EnumHelper().addToolMaterial("vs_changer_lupin", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial vs_changer_black_lupin = new EnumHelper().addToolMaterial("vs_changer_black_lupin", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial vs_changer_red_lupin = new EnumHelper().addToolMaterial("vs_changer_red_lupin", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial lupin_x_changer = new EnumHelper().addToolMaterial("lupin_x_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial lupin_storm_changer = new EnumHelper().addToolMaterial("lupin_storm_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial vs_changer_silver = new EnumHelper().addToolMaterial("lupin_storm_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial lupin_prision_changer = new EnumHelper().addToolMaterial("lupin_storm_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial lupin_magnum = new EnumHelper().addToolMaterial("lupin_magnum", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial blade_boomerang = new EnumHelper().addToolMaterial("blade_boomerang", 10, 8000, 12.0F, 12.0F, 22);
	
	public static ToolMaterial vs_changer_patren = new EnumHelper().addToolMaterial("vs_changer_patren", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial vs_changer_black_patren = new EnumHelper().addToolMaterial("vs_changer_black_patren", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial vs_changer_red_patren = new EnumHelper().addToolMaterial("vs_changer_red_patren", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial patren_x_changer = new EnumHelper().addToolMaterial("patren_x_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial patren_storm_changer = new EnumHelper().addToolMaterial("patren_storm_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial vs_changer_gold = new EnumHelper().addToolMaterial("lupin_storm_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial patren_prision_changer = new EnumHelper().addToolMaterial("lupin_storm_changer", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial patren_magnum = new EnumHelper().addToolMaterial("patren_magnum", 10, 2000, 12.0F, 0.0F, 22);
	
	public static ToolMaterial ryusoul_ken = new EnumHelper().addToolMaterial("ryusoul_ken", 10, 2000, 12.0F, 0.0F, 22);
	
	public static CreativeTabs gorenger= new CreativeTabs("gorenger")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.gorengerhead);
		}
	};
	public static CreativeTabs gokaiger= new CreativeTabs("gokaiger")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.gokaigerhead);
		}
	};
	public static CreativeTabs kyoryuger= new CreativeTabs("kyoryuger")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.kyoryugerhead);
		}
	};
	public static CreativeTabs kyoryuger_brave= new CreativeTabs("kyoryuger_brave")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.brave_kyoryugerhead);
		}
	};
	public static CreativeTabs lupinranger= new CreativeTabs("lupinranger")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.lupinhead);
		}
	};
	public static CreativeTabs patranger= new CreativeTabs("patranger")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.patrenhead);
		}
	};
	public static CreativeTabs ryusoulger= new CreativeTabs("ryusoulger")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.ryusoulhead);
		}
	};
	/**
	public static TAB_MASKED_RIDER tab_masked_rider= new TAB_MASKED_RIDER("tab_masked_rider")
	{
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RiderItems.masked_rider_head);
		}
		
		
	};
	**/
}
