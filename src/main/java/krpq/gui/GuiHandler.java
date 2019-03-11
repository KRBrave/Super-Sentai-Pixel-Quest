package krpq.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nullable;

import krpq.item.item_panel;

import java.util.Optional;

public final class GuiHandler implements IGuiHandler {

    public static final int PANEL_GUI = 0;

    @Nullable
    @Override
    public Object getServerGuiElement(final int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case PANEL_GUI:
                IItemHandler handler = player.getHeldItemMainhand().getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
                InventoryPlayer inventory = player.inventory;

                return new ContainerPanel(inventory, handler);
            default:
                return null;
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    @Nullable
    public Object getClientGuiElement(final int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case PANEL_GUI:
                IItemHandler handler = player.getHeldItemMainhand().getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
                InventoryPlayer inventory = player.inventory;

                return new GuiContainerPanel(inventory, handler, ((item_panel) player.getHeldItemMainhand().getItem()).getColor());
            default:
                return null;
        }
    }
}