package krpq;

import com.jcraft.jorbis.Block;

import krpq.gui.GuiHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxyRider {

	public void registerRenderThings() {
	}

	public void registerItemRender(Item item, int i, String string) {
	}

	public void registerblockRender(Block ore_block, int i, String string) {
	}

	public void preInit() {
		NetworkRegistry.INSTANCE.registerGuiHandler(TokuCraft_core.instance, new GuiHandler());
	}
}