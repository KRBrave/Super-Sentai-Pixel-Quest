package krpq.item.kuuga;



import javax.annotation.Nullable;

import krpq.RiderItems;
import krpq.TokuCraft_core;
import krpq.item.kuuga.item_kuugadriver;
import krpq.util.IHasModel;
import krpq.util.Refercence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Item_kuuga_mode_change_sword_im extends ItemSword implements IHasModel
{
  
//private Item Imcharge;

    public Item_kuuga_mode_change_sword_im(String name,ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
      
       // Imcharge=charge; 
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {

            	 if (entityIn == null)
	                {
	                    return 0.0F;
	                }else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

					if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_kuugadriver){
						if (item_kuugadriver.get_Form_Item_tex(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getBelt()==RiderItems.arcle_u||item_kuugadriver.get_Form_Item_tex(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getBelt()==RiderItems.arcle_ru)
							 return 1;
					}else{
						return 0;
					}
					return 0;
				}
				return 0;
            }
        });
    }

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	
  
/**
	@Override
	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){

		return new ModelResourceLocation(Refercence.MODID+":"+Imcharge.getUnlocalizedName().substring(5),"inventory");
	}
	**/
}