package com.Divisionism.MoOres.container;

//import com.Divisionism.MoOres.tileentity.alloyContainerTileEntity;
import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import java.util.Objects;

/*
public class alloyContainer extends Container {

    public final alloyContainerTileEntity tileentity;
    private final IWorldPosCallable canInteractWithCallable;

    public alloyContainer(final int windowId, final PlayerInventory playerInventory, alloyContainerTileEntity tileEntity) {
        super(RegistryHandler.ALLOY_CONTAINER.get(), windowId);
        this.tileentity = tileEntity;
        this.canInteractWithCallable = IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos());

        //Main inventory
        int[] Slot1 = {8, 58};
        int[] Slot2 = {53, 21};
        int[] Slot3 = {53, 48};
        int[] Slot4 = {112, 31};

        this.addSlot(new Slot(playerInventory, 0, Slot1[0], Slot1[1]));
        this.addSlot(new Slot(playerInventory, 1, Slot2[0], Slot2[1]));
        this.addSlot(new Slot(playerInventory, 2, Slot3[0], Slot3[1]));
        this.addSlot(new Slot(playerInventory, 3, Slot4[0], Slot4[1]));

        //Main player inventory
        int StartX = 8;
        int StartY = 18;
        int slotSizePlus2 = 18;
        int StartInvY = (StartY * 3) + 15;

        for (int row = 0; row < 3; ++row) {
            for (int column = 0; column < 9; ++column) {
                this.addSlot(new Slot(playerInventory, 9 + (row * 9) + column, StartX + (column * slotSizePlus2), StartInvY + (row * slotSizePlus2)));
            }
        }

        //Hotbar
        int HotbarY = 127;

        for (int column = 0; column < 9; ++column) {
            this.addSlot(new Slot(playerInventory, column, StartX + (column * slotSizePlus2), HotbarY));
        }
    }

    private static alloyContainerTileEntity getTileEntity(final PlayerInventory playerInv, PacketBuffer data) {
        Objects.requireNonNull(playerInv, "playerInv cannot be null");
        Objects.requireNonNull(data, "data cannot be null");
        final TileEntity tileAtPos = playerInv.player.world.getTileEntity(data.readBlockPos());

        if (tileAtPos instanceof alloyContainerTileEntity) {
            return (alloyContainerTileEntity)tileAtPos;
        }
        throw new IllegalStateException("tile entity is not correct " + tileAtPos);
    }

    public alloyContainer(final int windowId, final PlayerInventory playerInv, final PacketBuffer data) {
        this(windowId, playerInv, getTileEntity(playerInv, data));
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(canInteractWithCallable, playerIn, RegistryHandler.ALLOY_FURNACE.get());
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < 18) {
                if (!this.mergeItemStack(itemstack1, 18, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, 18, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }
        return itemstack;
    }
}
 */
