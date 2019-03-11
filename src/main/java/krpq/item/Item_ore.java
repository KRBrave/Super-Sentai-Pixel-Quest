package krpq.item;


import krpq.TokuCraft_core;
import krpq.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_ore extends Item implements IHasModel
{

    public Item_ore(String name)
    {
        super();
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        maxStackSize = 64;
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

    }

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	}
